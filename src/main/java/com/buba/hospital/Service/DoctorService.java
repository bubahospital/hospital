package com.buba.hospital.Service;

import com.buba.hospital.Bean.SecDoctor;
import com.buba.hospital.Bean.SecDoctorAppointmenttime;
import com.buba.hospital.Bean.SecDoctorAppointmenttimeTimeframe;
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
}
