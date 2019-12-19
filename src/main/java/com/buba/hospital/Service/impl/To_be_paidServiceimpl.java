package com.buba.hospital.Service.impl;

import com.buba.hospital.Bean.HisOrder;
import com.buba.hospital.Mapper.To_be_paidMapper;
import com.buba.hospital.Service.To_be_paidService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @create 2019-12-18 19:26
 * @desc
 **/
@Service
public class To_be_paidServiceimpl implements To_be_paidService {

    @Resource
    private To_be_paidMapper to_be_paidMapper;
    //就诊卡充值查询
    @Override
    public List<HisOrder> getrechargeList(Integer id) {
        return to_be_paidMapper.getrechargeList(id);
    }
    // 预约挂号查询
    @Override
    public List<HisOrder> getappointmentList(Integer id) {
        return to_be_paidMapper.getappointmentList(id);
    }
    // 在线咨询查询
    @Override
    public List<HisOrder> getconsultationList(Integer id) {
        return to_be_paidMapper.getconsultationList(id);
    }
    // 门诊缴费查询
    @Override
    public List<HisOrder> getpaymentList(Integer id) {
        return to_be_paidMapper.getpaymentList(id);
    }

}
