package com.buba.hospital.Service;

import com.buba.hospital.Bean.PaymentVo;
import com.buba.hospital.Bean.ReservationVo;

import java.util.List;

/**
 * @author FJ
 * @title: ReservationService
 * @projectName hospital
 * @date 2019/12/1816:13
 */

public interface ReservationService {
    List<ReservationVo> find_reservation(Integer patientId);

    List<ReservationVo> find_reservation_particulars(Integer id);

    List<ReservationVo> cancelReservation(Integer id);

    List<PaymentVo> findPaymentVo(Integer patientId);

    PaymentVo find_payTheFees(String orderNum);
}
