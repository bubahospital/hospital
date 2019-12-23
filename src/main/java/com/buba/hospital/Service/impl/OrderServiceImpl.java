package com.buba.hospital.Service.impl;

import com.buba.hospital.Bean.HisOrder;
import com.buba.hospital.Bean.SecConsultation;
import com.buba.hospital.Bean.SecPatient;
import com.buba.hospital.Bean.SecUser;
import com.buba.hospital.Mapper.OrderMapper;
import com.buba.hospital.Mapper.UserMapper;
import com.buba.hospital.Service.OrderService;
import com.buba.hospital.Service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
