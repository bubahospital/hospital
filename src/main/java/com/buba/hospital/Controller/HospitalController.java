package com.buba.hospital.Controller;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.buba.hospital.Bean.*;
import com.buba.hospital.Service.HospitalService;
import com.buba.hospital.utils.JSONUtils;
import com.buba.hospital.utils.OssUtil;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/*
 * @Author Chang
 * @Description //TODO
 * @Date 14:02 2019/12/12
 * @Param
 * @return
 **/
@RestController
@RequestMapping("hospital")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;


    /*
     * @Author Chang
     * @Description //根据id查询所属所有二级科室集合
     * @Date 14:05 2019/12/12
     * @Param [hospitalId] 医院id
     * @return 二级科室集合
     **/
    @ResponseBody
    @RequestMapping("getSecondDepartmentById")
    public List<SecSecondDepartment> getSecondDepartmentById(Integer hospitalId){
        List<SecSecondDepartment> repartment= hospitalService.getSecondDepartmentById(1);
        return repartment;
    }

    /*根据医院id获取医院信息*/
    @ResponseBody
    @RequestMapping("getHospital")
    public SecHospital getHospital(Integer hospitalId){
        SecHospital hospital= hospitalService.getHospital(1);
        return hospital;
    }
    /*根据医院id获取医院首页轮播图*/
    @ResponseBody
    @RequestMapping("getSwiper")
    public List<SecPic> getSwiper(Integer hospitalId){
        List<SecPic> hospital= hospitalService.getSwiper(hospitalId);
        return hospital;
    }
    /*根据医院id获取医院动态列表*/
    @ResponseBody
    @RequestMapping("getArticleList")
    public List<SecHospitalArticleVo> getArticleList(Integer hospitalId,Integer articleType){
        List<SecHospitalArticleVo> articleList= hospitalService.getArticleList(hospitalId,articleType);

        return articleList;
    }
    /*根据文章id获取文章详情*/
    @ResponseBody
    @RequestMapping("getArticleInfo")
    public List<SecHospitalArticleInfoVo> getArticleInfo(Integer articleId){
        List<SecHospitalArticleInfoVo> articleInfo= hospitalService.getArticleInfo(articleId);
        return articleInfo;
    }

    /*根据医院id获取医院介绍*/
    @ResponseBody
    @RequestMapping("getHospitalIntroduce")
    public List<SecHospitalArticleInfoVo> getHospitalIntroduce(Integer hospitalId,Integer articleType){
        List<SecHospitalArticleInfoVo> articleInfo= hospitalService.getHospitalIntroduce(hospitalId,articleType);

        return articleInfo;
    }
    //修改在线咨询支付状态为已支付
    @ResponseBody
    @RequestMapping("/updateConsultationState")
    public boolean updateConsultationState(int id,String orderNum, HttpSession session){

        boolean b=hospitalService.updateConsultationState(id,orderNum);

        return b;
    }

    @RequestMapping(value = "/api", method = RequestMethod.POST)
    public Response xxx(@RequestBody JSONObject jsonObject) {


        JSONObject ite = jsonObject.getJSONObject("ite");
        String s = ite.toJSONString();
        SecDoctor doctor = JSONUtils.json2Ojbect(s, SecDoctor.class);
        System.out.println("目标医生信息：");
        System.out.println(doctor);   //医生信息对象

        String phone=jsonObject.getString("phone");  //当前用户的手机号
        String biaoti=jsonObject.getString("biaoti");  //标题
        System.out.println("问题标题是："+biaoti);
        String text=jsonObject.getString("text");  //内容
        System.out.println("问题内容是："+text);
        String fix=jsonObject.getString("fix");  //性别
        System.out.println("性别是："+fix);
        int userid=Integer.parseInt(jsonObject.getString("userid"));  //当前用户id
        System.out.println("用户id是："+userid);
        int state=Integer.parseInt(jsonObject.getString("state"));  //问题是付费还是免费

        System.out.println("状态："+state);
        //根据前台传过来的付费状态，判断需不需要支付
        int paymentStatus=1;
        double payMoney=0;
        if(state==0){
            System.out.println("已经支付");
            paymentStatus=0;  //已支付
            payMoney=0;//价格
        }else if(state==1){
            System.out.println("没有支付");
            payMoney=doctor.getPrice();  //支付金额
            paymentStatus=1;  //未支付
        }

        JSONArray photos = jsonObject.getJSONArray("photos");

        String orderNum="";
        //生成订单号
        for(int i=0;i<10;i++){
            int oo = ThreadLocalRandom.current().nextInt(10);
            orderNum+=String.valueOf(oo);
        }


        //添加数据库  咨询表\订单表
        Response f= hospitalService.addSecConsultation(doctor,userid,phone,biaoti,text,fix,paymentStatus,orderNum,state,payMoney);

        if (photos.size() > 0) {
            for (int i = 0; i < photos.size(); i++) {
                JSONObject obj = photos.getJSONObject(i);
                String fileName = obj.getString("filename");
                String base64Str = obj.getString("base64Str");
                String directoryName = "xx/xx";
                /*  String extension = fileName.substring(fileName.lastIndexOf(".")).toLowerCase();*/
                String extension =phone+"-"+String.valueOf(doctor.getId())+"-"+String.valueOf(i+1)+".jpg";

                InputStream inputStream = new ByteArrayInputStream(Base64.decodeBase64(base64Str.substring(base64Str.indexOf(",") + 1)));
                System.out.println("转换成的地址+++：：：："+inputStream);
                OssUtil client = new OssUtil();
                String result = client.uploadFile2OSS(inputStream, extension);// extension指的是拓展名，例如".amr"
                System.out.println("返回的结果是：；；"+result);
                String str =client. getImgUrl(extension);
                String trim = str.trim();
                String[] imgUrls = trim.split("\\?");
                String url= imgUrls[0];
                System.out.println("OSS图片路径是："+url);
                //图片添加数据库
                SecPic pic=new SecPic();
                pic.setObjId(userid);
                pic.setDisabled(false);
                pic.setType("consultation");
                pic.setObjType("sick");
                pic.setPicPath(url);
                pic.setPicName(extension);
                pic.setStatus("1");
                boolean h = hospitalService.addSecPicBySecConsultation(pic,f.getOrderId());
            }

        }




        return f;

    }
}
