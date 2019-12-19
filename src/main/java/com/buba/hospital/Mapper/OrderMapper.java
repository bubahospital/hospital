package com.buba.hospital.Mapper;


import com.buba.hospital.Bean.SecConsultation;
import com.buba.hospital.Bean.SecPatient;
import com.buba.hospital.Bean.SecUser;

import java.util.List;

public interface OrderMapper {


    List<SecConsultation> getOnlineOrder(Integer patientId);

    SecConsultation getOrderDetailById(Integer id);
}
