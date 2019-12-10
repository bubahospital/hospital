package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecConsultation;
import com.buba.hospital.Bean.SecConsultationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecConsultationMapper {
    int countByExample(SecConsultationExample example);

    int deleteByExample(SecConsultationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecConsultation record);

    int insertSelective(SecConsultation record);

    List<SecConsultation> selectByExample(SecConsultationExample example);

    SecConsultation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecConsultation record, @Param("example") SecConsultationExample example);

    int updateByExample(@Param("record") SecConsultation record, @Param("example") SecConsultationExample example);

    int updateByPrimaryKeySelective(SecConsultation record);

    int updateByPrimaryKey(SecConsultation record);
}