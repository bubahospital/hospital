package com.buba.hospital.Service;

import com.buba.hospital.Bean.HisOrder;

import java.util.List;

public interface To_be_paidService {
    //就诊卡充值查询
    List<HisOrder> getrechargeList(Integer id);
    // 预约挂号查询
    List<HisOrder> getappointmentList(Integer id);
    // 在线咨询查询
    List<HisOrder> getconsultationList(Integer id);
    // 门诊缴费查询
    List<HisOrder> getpaymentList(Integer id);
    // 门诊缴费的所有状态
    List<HisOrder> getoutpaymentListall(Integer id);
    // 门诊缴费的已支付
    List<HisOrder> getpaylistData(Integer id);
}
