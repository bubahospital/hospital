package com.buba.hospital.Service;

import com.buba.hospital.Bean.HisOrder;
import com.buba.hospital.Bean.SecConsultation;

import java.util.List;

public interface OrderService {

    List<SecConsultation> getOnlineOrder(Integer patientId);

    SecConsultation getOrderDetailById(Integer id);

    HisOrder getHisOrderById(Integer id);

    boolean addChongzhiOrder(HisOrder order);

    boolean updateChongzhiOrder(String orderNum, String payWay, Integer patientId, Double paynum);
}
