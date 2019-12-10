package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecDoctorAppointmenttimeTimeframe;
import com.buba.hospital.Bean.SecDoctorAppointmenttimeTimeframeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecDoctorAppointmenttimeTimeframeMapper {
    int countByExample(SecDoctorAppointmenttimeTimeframeExample example);

    int deleteByExample(SecDoctorAppointmenttimeTimeframeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecDoctorAppointmenttimeTimeframe record);

    int insertSelective(SecDoctorAppointmenttimeTimeframe record);

    List<SecDoctorAppointmenttimeTimeframe> selectByExample(SecDoctorAppointmenttimeTimeframeExample example);

    SecDoctorAppointmenttimeTimeframe selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecDoctorAppointmenttimeTimeframe record, @Param("example") SecDoctorAppointmenttimeTimeframeExample example);

    int updateByExample(@Param("record") SecDoctorAppointmenttimeTimeframe record, @Param("example") SecDoctorAppointmenttimeTimeframeExample example);

    int updateByPrimaryKeySelective(SecDoctorAppointmenttimeTimeframe record);

    int updateByPrimaryKey(SecDoctorAppointmenttimeTimeframe record);
}