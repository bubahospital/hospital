package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.PaymentVo;
import com.buba.hospital.Bean.ReservationVo;
import com.buba.hospital.Bean.SecUser;

import java.util.List;

/**
 * @author FJ
 * @title: ReservationMapper
 * @projectName hospital
 * @date 2019/12/1818:38
 */
public interface ReservationMapper {
    List<ReservationVo> find_reservation(Integer patientId);

    List<ReservationVo> find_reservation_particulars(Integer id);

    boolean cancelReservation(Integer id);

    List<PaymentVo> findPaymentVo(SecUser user);

    PaymentVo find_payTheFees(Integer id);
}
