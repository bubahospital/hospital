package com.buba.hospital.Service;

import com.buba.hospital.Bean.*;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DoctorService {

    List<SecDoctor> findDoctor(String deptId);

    SecDoctor huoquaddress(String id);

    SecDoctorAppointmenttime huoquappointment(String appointmenttime);

    List<SecDoctorAppointmenttime> huoqutime(Integer id);

    List<SecDoctor> huoquadministrative(String deptname);

    List<SecDoctorAppointmenttimeTimeframe> huoquappointmenttime(Integer id);

    Integer sum1(Integer id);

    Integer sum2(Integer id);

    String findTime(Integer id);

    String findTime2(Integer apptimeId);

    String findDoctorName(Integer doctorId);

    List<SecPayWay> selectZhifuStyle();

    int yuyuedingdan(SecReservation secReservation,Integer doctorId, Integer hospitalId);
}
