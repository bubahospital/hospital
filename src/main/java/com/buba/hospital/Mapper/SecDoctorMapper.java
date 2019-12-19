package com.buba.hospital.Mapper;


import com.buba.hospital.Bean.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecDoctorMapper {
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

    int yuyuedingdan(@Param("secReservation") SecReservation secReservation,@Param("doctorId")  Integer doctorId,@Param("hospitalId")  Integer hospitalId);
}
