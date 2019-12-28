package com.buba.hospital.Service;

import com.buba.hospital.Bean.*;

import java.util.List;


public interface DoctorService {

    List<SecDoctor> findDoctor(String deptId);

    SecDoctor huoquaddress(String id);

    SecDoctorAppointmenttime huoquappointment(String appointmenttime);

    List<SecDoctorAppointmenttime> huoqutime(Integer id);

    List<SecDoctor> huoquadministrative(Integer departmentId);

    List<SecDoctorAppointmenttimeTimeframe> huoquappointmenttime(Integer id);

    Integer sum1(Integer id);

    Integer sum2(Integer id);

    String findTime(Integer id);

    String findTime2(Integer apptimeId);

    String findDoctorName(Integer doctorId);

    List<SecPayWay> selectZhifuStyle();

    List<SecFirstDepartment> getAllDepartmentList(Integer hospitalId);

    SecDoctor getDoctorDetailById(Integer doctorId);

    Integer addReservation(SecReservation secReservation);

    boolean updateYuyueStatus(Integer orderId,Integer status,String priceType);
}
