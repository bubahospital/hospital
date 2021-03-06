package com.buba.hospital.Controller;

import com.buba.hospital.Bean.PaymentVo;
import com.buba.hospital.Bean.ReservationVo;
import com.buba.hospital.Bean.SecUser;
import com.buba.hospital.Service.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author FJ
 * @title: ReservationController
 * @projectName hospital
 * @date 2019/12/1815:54
 */
@RequestMapping("reservation")
@Controller
public class ReservationController {
    @Resource
    private ReservationService reservationService;
    //查询预约订单
    @RequestMapping("find_reservation")
    @ResponseBody
    public List<ReservationVo> find_reservation(Integer patientId){
        List<ReservationVo> l=  reservationService.find_reservation(patientId);
    return l;
    }
    //详情
    @RequestMapping("find_reservation_particulars")
    @ResponseBody
    public List<ReservationVo> find_reservation_particulars(Integer id){
        List<ReservationVo> l= reservationService.find_reservation_particulars(id);
    return l;
    }
    //修改预约订单
    @RequestMapping("cancelReservation")
    @ResponseBody
    public List<ReservationVo> cancelReservation(Integer id){
        List<ReservationVo> l=  reservationService.cancelReservation(id);
    return l;
    }
    //查询就诊卡充值订单
    @RequestMapping("findPaymentVo")
    @ResponseBody
    public List<PaymentVo> findPaymentVo(Integer patientId){
        List<PaymentVo> l=  reservationService.findPaymentVo(patientId);
        return l;
    }
    //查询就诊卡充值订单详情
    @RequestMapping("find_payTheFees")
    @ResponseBody
    public PaymentVo find_payTheFees(String orderNum){
        PaymentVo l=  reservationService.find_payTheFees(orderNum);
        return l;
    }
}
