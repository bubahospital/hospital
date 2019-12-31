package com.buba.hospital.Controller;

import com.buba.hospital.Bean.*;
import com.buba.hospital.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("prient")
public class PatientController {

    @Autowired
    private PatientService patientService;


    //UpdateMoren 修改默认人
    @RequestMapping("/UpdateMoren")
    public int UpdateMoren(Integer id){//patientid
        int i =patientService.UpdateMoren(id);
        return i;
    }


    //selectHuixiapatient 回显就诊人（就诊信息）
    @RequestMapping("/selectHuixiapatient")
    public SecPatient selectHuixiapatient(Integer id){
        SecPatient i =patientService.selectHuixiapatient(id);
        if(i==null){
            SecPatient i2 =patientService.selectUser(id);
            return i2;
        }else {
            return  i;
        }
    }
    //根据就诊人查询门诊缴费订单
    @RequestMapping("/findOrderInfo")
    @ResponseBody
    public List<PayHoPatVO> findOrderInfo(Integer orderPlacer) {
        List<PayHoPatVO> orderInfo = patientService.findOrderInfo(orderPlacer);
        return orderInfo;
    }
    /*根据订单号数组返回相应的订单详情*/
    @RequestMapping("/payMentList")
    @ResponseBody
    public  List<PayHoPatVO>  payMentList(String[] ids) {//用户id(获取session的id)

        List<PayHoPatVO> orderInfo = patientService.payMentList(ids);
        return  orderInfo;
    }
    //门诊缴费==支付方式页面：单号，名称， 金额
    @RequestMapping("/findPayWays")
    @ResponseBody
    public HisOrder findPayWays(String orderNum) {
        HisOrder ways = patientService.findPayWays(orderNum);

        return ways;
    }
    //修改门诊缴费状态
    @RequestMapping("/updateJiaofeiOrder")
    @ResponseBody
    public boolean updateJiaofeiOrder(String payWay,String[] ids) {


      boolean b = patientService.updateJiaofeiOrder(payWay,ids);

        return true;
    }
}
