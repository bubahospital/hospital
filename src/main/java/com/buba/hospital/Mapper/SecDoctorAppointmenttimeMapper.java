package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecDoctorAppointmenttime;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecDoctorAppointmenttimeMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SecDoctorAppointmenttime record);

    int insertSelective(SecDoctorAppointmenttime record);


    SecDoctorAppointmenttime selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(SecDoctorAppointmenttime record);

    int updateByPrimaryKey(SecDoctorAppointmenttime record);
}