package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecHospitalInfo;
import com.buba.hospital.Bean.SecHospitalInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecHospitalInfoMapper {
    int countByExample(SecHospitalInfoExample example);

    int deleteByExample(SecHospitalInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecHospitalInfo record);

    int insertSelective(SecHospitalInfo record);

    List<SecHospitalInfo> selectByExampleWithBLOBs(SecHospitalInfoExample example);

    List<SecHospitalInfo> selectByExample(SecHospitalInfoExample example);

    SecHospitalInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecHospitalInfo record, @Param("example") SecHospitalInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SecHospitalInfo record, @Param("example") SecHospitalInfoExample example);

    int updateByExample(@Param("record") SecHospitalInfo record, @Param("example") SecHospitalInfoExample example);

    int updateByPrimaryKeySelective(SecHospitalInfo record);

    int updateByPrimaryKeyWithBLOBs(SecHospitalInfo record);

    int updateByPrimaryKey(SecHospitalInfo record);
}