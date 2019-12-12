package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecDoctorAssistant;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecDoctorAssistantMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SecDoctorAssistant record);

    int insertSelective(SecDoctorAssistant record);

    SecDoctorAssistant selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecDoctorAssistant record);

    int updateByPrimaryKey(SecDoctorAssistant record);
}