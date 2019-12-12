package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecDoctorAppointmenttimeTimeframe;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecDoctorAppointmenttimeTimeframeMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SecDoctorAppointmenttimeTimeframe record);

    int insertSelective(SecDoctorAppointmenttimeTimeframe record);


    SecDoctorAppointmenttimeTimeframe selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(SecDoctorAppointmenttimeTimeframe record);

    int updateByPrimaryKey(SecDoctorAppointmenttimeTimeframe record);
}