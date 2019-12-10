package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecDoctorAppointmenttime;
import com.buba.hospital.Bean.SecDoctorAppointmenttimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecDoctorAppointmenttimeMapper {
    int countByExample(SecDoctorAppointmenttimeExample example);

    int deleteByExample(SecDoctorAppointmenttimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecDoctorAppointmenttime record);

    int insertSelective(SecDoctorAppointmenttime record);

    List<SecDoctorAppointmenttime> selectByExample(SecDoctorAppointmenttimeExample example);

    SecDoctorAppointmenttime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecDoctorAppointmenttime record, @Param("example") SecDoctorAppointmenttimeExample example);

    int updateByExample(@Param("record") SecDoctorAppointmenttime record, @Param("example") SecDoctorAppointmenttimeExample example);

    int updateByPrimaryKeySelective(SecDoctorAppointmenttime record);

    int updateByPrimaryKey(SecDoctorAppointmenttime record);
}