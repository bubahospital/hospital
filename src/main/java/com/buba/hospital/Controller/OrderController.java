package com.buba.hospital.Controller;
import com.buba.hospital.Bean.HisOrder;
import com.buba.hospital.Bean.SecConsultation;
import com.buba.hospital.Bean.SecPatient;
import com.buba.hospital.Bean.SecUser;
import com.buba.hospital.Service.OrderService;
import com.buba.hospital.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * @Author Chang
 * @Description //TODO
 * @Date 13:57 2019/12/16
 * @Param
 * @return
 **/
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /*根据就诊人id获取在线咨询列表*/
    @RequestMapping("getOnlineOrder")
    public List<SecConsultation> getOnlineOrder(Integer patientId){
        List<SecConsultation> consultations= orderService.getOnlineOrder(patientId);
        return consultations;
    }
    /*根据id查询在线咨询订单详情*/
    @RequestMapping("getOrderDetailById")
    public SecConsultation getOrderDetailById(Integer id){
        SecConsultation consultation= orderService.getOrderDetailById(id);
        System.out.println(consultation);
        return consultation;
    }
    /*根据id查询未支付订单详情*/
    @RequestMapping("getHisOrderById")
    public HisOrder getHisOrderById(Integer id){
        System.out.println("orderId"+id);
        HisOrder hisOrder= orderService.getHisOrderById(id);

        return hisOrder;
    }






}
