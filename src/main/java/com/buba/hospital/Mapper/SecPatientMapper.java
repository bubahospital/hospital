package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecPatient;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecPatientMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SecPatient record);

    int insertSelective(SecPatient record);

    SecPatient selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecPatient record);

    int updateByPrimaryKey(SecPatient record);
}