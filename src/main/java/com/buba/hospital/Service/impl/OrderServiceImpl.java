package com.buba.hospital.Service.impl;

import com.buba.hospital.Bean.HisOrder;
import com.buba.hospital.Bean.SecConsultation;
import com.buba.hospital.Mapper.OrderMapper;
import com.buba.hospital.Service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Chang
 * @Date 2019/12/16 13:56
 * @Version 1.0
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
   private OrderMapper orderMapper;


    @Override
    public List<SecConsultation> getOnlineOrder(Integer patientId) {
        List<SecConsultation> consultations= orderMapper.getOnlineOrder(patientId);
        return consultations;
    }

    @Override
    public SecConsultation getOrderDetailById(Integer id) {
        SecConsultation consultation= orderMapper.getOrderDetailById(id);
        return consultation;
    }

    @Override
    public HisOrder getHisOrderById(Integer id) {
        HisOrder hisOrder= orderMapper.getHisOrderById(id);
        return hisOrder;
    }

    @Override
    public boolean addChongzhiOrder(HisOrder order) {
        boolean b= orderMapper.addChongzhiOrder(order);
        return b;
    }

    @Override
    public boolean updateChongzhiOrder(String orderNum, String payWay, Integer patientId,Double paynum) {
        boolean b= orderMapper.updateChongzhiOrder(orderNum,payWay);
        boolean b1= orderMapper.updateMoney(patientId,paynum);

        return b&b1;
    }
}
