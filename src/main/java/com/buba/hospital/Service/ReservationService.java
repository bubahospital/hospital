package com.buba.hospital.Service;

import com.buba.hospital.Bean.PaymentVo;
import com.buba.hospital.Bean.ReservationVo;
import com.buba.hospital.Bean.SecUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author FJ
 * @title: ReservationService
 * @projectName hospital
 * @date 2019/12/1816:13
 */

public interface ReservationService {
    List<ReservationVo> find_reservation(SecUser user);

    List<ReservationVo> find_reservation_particulars(Integer id);

    List<ReservationVo> cancelReservation(Integer id);

    List<PaymentVo> findPaymentVo(SecUser user);

    PaymentVo find_payTheFees(Integer id);
}
