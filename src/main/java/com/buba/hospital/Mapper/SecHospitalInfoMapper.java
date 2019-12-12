package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecHospitalInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecHospitalInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SecHospitalInfo record);

    int insertSelective(SecHospitalInfo record);

    SecHospitalInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecHospitalInfo record);

    int updateByPrimaryKeyWithBLOBs(SecHospitalInfo record);

    int updateByPrimaryKey(SecHospitalInfo record);
}