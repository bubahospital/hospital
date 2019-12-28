package com.buba.hospital.Service.impl;

import com.buba.hospital.Bean.*;
import com.buba.hospital.Mapper.SecDoctorMapper;
import com.buba.hospital.Service.DoctorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
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
    public List<SecDoctor> huoquadministrative(Integer departmentId) {
        return secDoctorMapper.huoquadministrative(departmentId);
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
    public List<SecFirstDepartment> getAllDepartmentList(Integer hospitalId) {
        List<SecFirstDepartment> list=secDoctorMapper.getAllDepartmentList(hospitalId);
        return list;
    }

    @Override
    public SecDoctor getDoctorDetailById(Integer doctorId) {
        SecDoctor doctor=secDoctorMapper.getDoctorDetailById(doctorId);
        return doctor;
    }

    @Override
    @Transactional
    public Integer addReservation(SecReservation secReservation) {
        boolean b=secDoctorMapper.addHisOrder(secReservation);
        boolean b1=secDoctorMapper.addReservation(secReservation);
        return secReservation.getId();
    }
    //修改在线咨询状态为已支付
    @Override
    public boolean updateYuyueStatus(Integer orderId,Integer status,String priceType) {
        boolean b=secDoctorMapper.updateYuyueStatus(orderId,status,priceType);
        boolean b1=secDoctorMapper.updateYuyueStatus2(orderId,status,priceType);
        return b&b1;
    }
}
