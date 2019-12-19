package com.buba.hospital.Service.impl;

import com.buba.hospital.Bean.*;
import com.buba.hospital.Controller.DoctorController;
import com.buba.hospital.Mapper.SecDoctorMapper;
import com.buba.hospital.Service.DoctorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Resource
    private SecDoctorMapper secDoctorMapper;

    @Override
    public List<SecDoctor> findDoctor(String deptId) {
        return secDoctorMapper.findDoctor(deptId);
    }

    @Override
    public SecDoctor huoquaddress(String id) {
        return secDoctorMapper.huoquaddress(id);
    }

    @Override
    public SecDoctorAppointmenttime huoquappointment(String appointmenttime) {
        return secDoctorMapper.huoquappointment(appointmenttime);
    }

    @Override
    public List<SecDoctorAppointmenttime> huoqutime(Integer id) {
        List<SecDoctorAppointmenttime> list=secDoctorMapper.huoqutime(id);
        return list;
    }

    @Override
    public List<SecDoctor> huoquadministrative(String deptname) {
        return secDoctorMapper.huoquadministrative(deptname);
    }

    @Override
    public List<SecDoctorAppointmenttimeTimeframe> huoquappointmenttime(Integer id) {
        List<SecDoctorAppointmenttimeTimeframe> list=secDoctorMapper.huoquappointmenttime(id);


        return list;
    }

    @Override
    public Integer sum1(Integer id) {
        return secDoctorMapper.sum1(id);
    }

    @Override
    public Integer sum2(Integer id) {
        return secDoctorMapper.sum2(id);
    }

    @Override
    public String findTime(Integer id) {
        return secDoctorMapper.findTime(id);
    }

    @Override
    public String findTime2(Integer apptimeId) {
        return secDoctorMapper.findTime2(apptimeId);
    }

    @Override
    public String findDoctorName(Integer doctorId) {
        return secDoctorMapper.findDoctorName(doctorId);
    }

    @Override
    public List<SecPayWay> selectZhifuStyle() {
        return secDoctorMapper.selectZhifuStyle();
    }

    @Override
    public int yuyuedingdan(SecReservation secReservation,Integer doctorId, Integer hospitalId) {
        return secDoctorMapper.yuyuedingdan(secReservation,doctorId,hospitalId);
    }
}
