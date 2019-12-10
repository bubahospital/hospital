package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecPatient;
import com.buba.hospital.Bean.SecPatientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecPatientMapper {
    int countByExample(SecPatientExample example);

    int deleteByExample(SecPatientExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecPatient record);

    int insertSelective(SecPatient record);

    List<SecPatient> selectByExample(SecPatientExample example);

    SecPatient selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecPatient record, @Param("example") SecPatientExample example);

    int updateByExample(@Param("record") SecPatient record, @Param("example") SecPatientExample example);

    int updateByPrimaryKeySelective(SecPatient record);

    int updateByPrimaryKey(SecPatient record);
}