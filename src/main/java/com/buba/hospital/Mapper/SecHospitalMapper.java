package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecHospital;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecHospitalMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SecHospital record);

    int insertSelective(SecHospital record);

    SecHospital selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecHospital record);

    int updateByPrimaryKey(SecHospital record);
}