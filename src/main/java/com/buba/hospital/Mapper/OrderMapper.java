package com.buba.hospital.Mapper;


import com.buba.hospital.Bean.HisOrder;
import com.buba.hospital.Bean.SecConsultation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {


    List<SecConsultation> getOnlineOrder(Integer patientId);

    SecConsultation getOrderDetailById(Integer id);

    HisOrder getHisOrderById(Integer id);

    boolean addChongzhiOrder(@Param("hisOrder") HisOrder hisOrder);

    boolean updateChongzhiOrder(@Param("orderNum") String orderNum,@Param("payWay") String payWay);

    boolean updateMoney(@Param("patientId") Integer patientId,@Param("paynum") Double paynum);
}
