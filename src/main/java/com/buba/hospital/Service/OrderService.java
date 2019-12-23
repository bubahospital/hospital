package com.buba.hospital.Service;

import com.buba.hospital.Bean.HisOrder;
import com.buba.hospital.Bean.SecConsultation;
import com.buba.hospital.Bean.SecPatient;
import com.buba.hospital.Bean.SecUser;

import java.util.List;

public interface OrderService {

    List<SecConsultation> getOnlineOrder(Integer patientId);

    SecConsultation getOrderDetailById(Integer id);

    HisOrder getHisOrderById(Integer id);
}
