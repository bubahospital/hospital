package com.buba.hospital.Mapper;


import com.buba.hospital.Bean.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecDoctorMapper {
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

    boolean addHisOrder(SecReservation secReservation);

    boolean addReservation(@Param("secReservation")SecReservation secReservation);


    boolean updateYuyueStatus(@Param("orderId") Integer orderId,@Param("status") Integer status,@Param("priceType") String priceType);
    boolean updateYuyueStatus2(@Param("orderId") Integer orderId,@Param("status") Integer status,@Param("priceType") String priceType);

}
