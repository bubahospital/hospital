package com.buba.hospital.Controller;

import com.buba.hospital.Bean.HisOrder;
import com.buba.hospital.Service.To_be_paidService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @create 2019-12-18 15:24
 * @desc
 **/
@RestController
@RequestMapping("to_be_paid")
public class To_be_paidController {

    @Resource
    private To_be_paidService to_be_paidService;

    //就诊卡充值查询
    @RequestMapping("/getrechargeList")
    public List<HisOrder> getrechargeList(Integer id){
        List<HisOrder> repartment= to_be_paidService.getrechargeList(id);
        return repartment;
    }
    // 在线咨询查询
    @RequestMapping("/getconsultationList")
    public List<HisOrder> getconsultationList(Integer id){
        List<HisOrder> repartment= to_be_paidService.getconsultationList(id);
        return repartment;
    }
    // 门诊缴费查询
    @RequestMapping("/getpaymentList")
    public List<HisOrder> getpaymentList(Integer id){
        List<HisOrder> repartment= to_be_paidService.getpaymentList(id);
        return repartment;
    }
    // 预约挂号查询
    @RequestMapping("/getappointmentList")
    public List<HisOrder> getappointmentList(Integer id){
        List<HisOrder> repartment= to_be_paidService.getappointmentList(id);
        return repartment;
    }

    // 门诊缴费的所有状态
    @RequestMapping("/getoutpaymentListall")
    public List<HisOrder> getoutpaymentListall(Integer id){
        List<HisOrder> repartment= to_be_paidService.getoutpaymentListall(id);
        return repartment;
    }

    // 门诊缴费的已支付
    @RequestMapping("/getpaylistData")
    public List<HisOrder> getpaylistData(Integer id){
        List<HisOrder> repartment= to_be_paidService.getpaylistData(id);
        return repartment;
    }
}
