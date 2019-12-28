package com.buba.hospital.Service.impl;

import com.buba.hospital.Bean.PaymentVo;
import com.buba.hospital.Bean.ReservationVo;
import com.buba.hospital.Bean.SecUser;
import com.buba.hospital.Mapper.ReservationMapper;
import com.buba.hospital.Service.ReservationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author FJ
 * @title: ReservationServiceImpl
 * @projectName hospital
 * @date 2019/12/1816:15
 */
@Service
public class ReservationServiceImpl implements ReservationService {

@Resource
private ReservationMapper reservationMapper;
    @Override
    public List<ReservationVo> find_reservation(Integer patientId) {
        return reservationMapper.find_reservation(patientId);
    }

    @Override
    public List<ReservationVo> find_reservation_particulars(Integer id) {
        return reservationMapper.find_reservation_particulars(id);
    }

    @Override
    public List<ReservationVo> cancelReservation(Integer id) {
      boolean b=  reservationMapper.cancelReservation(id);
      if(b){
          List<ReservationVo> r = find_reservation_particulars(id);
          return r;
      }else {
          return null;
      }
    }

    @Override
    public List<PaymentVo> findPaymentVo(SecUser user) {
        return reservationMapper.findPaymentVo(user);
    }

    @Override
    public PaymentVo find_payTheFees(Integer id) {
        return reservationMapper.find_payTheFees(id);
    }
}
