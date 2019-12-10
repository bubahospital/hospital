package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecHospital;
import com.buba.hospital.Bean.SecHospitalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecHospitalMapper {
    int countByExample(SecHospitalExample example);

    int deleteByExample(SecHospitalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecHospital record);

    int insertSelective(SecHospital record);

    List<SecHospital> selectByExample(SecHospitalExample example);

    SecHospital selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecHospital record, @Param("example") SecHospitalExample example);

    int updateByExample(@Param("record") SecHospital record, @Param("example") SecHospitalExample example);

    int updateByPrimaryKeySelective(SecHospital record);

    int updateByPrimaryKey(SecHospital record);
}