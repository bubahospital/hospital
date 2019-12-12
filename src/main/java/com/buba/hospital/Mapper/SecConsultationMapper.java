package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecConsultation;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecConsultationMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SecConsultation record);

    int insertSelective(SecConsultation record);


    SecConsultation selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(SecConsultation record);

    int updateByPrimaryKey(SecConsultation record);
}