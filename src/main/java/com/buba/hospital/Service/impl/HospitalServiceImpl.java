package com.buba.hospital.Service.impl;

import com.buba.hospital.Bean.*;
import com.buba.hospital.Mapper.HospitalMapper;
import com.buba.hospital.Service.HospitalService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Resource
    private HospitalMapper hospitalMapper;

    @Override
    public List<SecSecondDepartment> getSecondDepartmentById(Integer hospitalId) {
        List<SecSecondDepartment> repartment= hospitalMapper.getSecondDepartmentById(hospitalId);
        return repartment;
    }

    @Override
    public SecHospital getHospital(Integer hospitalId) {
        SecHospital hospital= hospitalMapper.getHospital(hospitalId);
        return hospital;
    }

    @Override
    public List<SecPic> getSwiper(Integer hospitalId) {
        List<SecPic> hospital= hospitalMapper.getSwiper(hospitalId);
        return hospital;
    }

    @Override
    public List<SecHospitalArticleVo> getArticleList(Integer hospitalId, Integer articleType) {

        List<SecHospitalArticleVo> articleList= hospitalMapper.getArticleList(hospitalId,articleType);
        return articleList;
    }

    @Override
    public List<SecHospitalArticleInfoVo> getArticleInfo(Integer articleId) {
        List<SecHospitalArticleInfoVo> list =hospitalMapper.getArticleInfoList(articleId);
        for(SecHospitalArticleInfoVo l :list){
            l.setType("text");
        }
        List<SecHospitalArticleInfoVo> list1 =hospitalMapper.getArticleImgList(articleId);

        for(SecHospitalArticleInfoVo l :list1){
            l.setType("image");
        }
        if(list1!=null){
            list.addAll(list1);
        }
        Collections.sort(list);

        return list;
    }
    @Override
    public List<SecHospitalArticleInfoVo> getHospitalIntroduce(Integer hospitalId, Integer articleType) {
        List<SecHospitalArticleVo> articleList= hospitalMapper.getArticleList(hospitalId,articleType);
        Integer articleId = articleList.get(0).getId();
        List<SecHospitalArticleInfoVo> articleInfo = this.getArticleInfo(articleId);

        return articleInfo;
    }
    //添加数据库  咨询表\订单表
    @Transactional
    @Override
    public Response addSecConsultation(SecDoctor doctor, int userid, String phone, String biaoti, String text, String fix, int paymentStatus, String orderNum, int state) {
        System.out.println("userId+++++"+userid);
        if(fix.equals("男")){
            fix="1";
        }else {
            fix="2";
        }
        //封装订单信息类
        HisOrder hisOrder=new HisOrder();
        hisOrder.setDisabled(false);
        hisOrder.setOrderName("在线咨询");
        hisOrder.setOrderNum(orderNum);
        hisOrder.setOrderPlacer(userid);
        //免费咨询
        if(state==1){
            hisOrder.setStatus("已支付");
            hisOrder.setPayMoney(0.0);
            //付费咨询
        }else if(state==2){
            hisOrder.setStatus("未支付");
        }

        boolean g=false;
        //添加数据库  订单表
        boolean r= hospitalMapper.addHisOrder(hisOrder);
        if(r!=false){
            //添加数据库  咨询表
            g=hospitalMapper.addSecConsultation(doctor,userid,phone,biaoti,text,fix,paymentStatus,hisOrder.getId());
        }


        Response response=new Response();
        response.setOrderId(hisOrder.getId());
        response.setResponse(g);
        response.setId(doctor.getId());
        response.setOrderNum(orderNum);
        return response;
    }
    //添加图片
    @Override
    public boolean addSecPicBySecConsultation(SecPic pic, int orderId) {
        pic.setObjId(orderId);
        boolean k=false;
        k= hospitalMapper.addSecPicBySecConsultation( pic);
        return k;
    }

    @Override
    public boolean updateConsultationState(int id) {
        return hospitalMapper.updateConsultationState( id);
    }


}
