package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecDoctorAssistant;
import com.buba.hospital.Bean.SecDoctorAssistantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecDoctorAssistantMapper {
    int countByExample(SecDoctorAssistantExample example);

    int deleteByExample(SecDoctorAssistantExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecDoctorAssistant record);

    int insertSelective(SecDoctorAssistant record);

    List<SecDoctorAssistant> selectByExample(SecDoctorAssistantExample example);

    SecDoctorAssistant selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecDoctorAssistant record, @Param("example") SecDoctorAssistantExample example);

    int updateByExample(@Param("record") SecDoctorAssistant record, @Param("example") SecDoctorAssistantExample example);

    int updateByPrimaryKeySelective(SecDoctorAssistant record);

    int updateByPrimaryKey(SecDoctorAssistant record);
}