package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecDoctorMultipoint;
import com.buba.hospital.Bean.SecDoctorMultipointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecDoctorMultipointMapper {
    int countByExample(SecDoctorMultipointExample example);

    int deleteByExample(SecDoctorMultipointExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecDoctorMultipoint record);

    int insertSelective(SecDoctorMultipoint record);

    List<SecDoctorMultipoint> selectByExample(SecDoctorMultipointExample example);

    SecDoctorMultipoint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecDoctorMultipoint record, @Param("example") SecDoctorMultipointExample example);

    int updateByExample(@Param("record") SecDoctorMultipoint record, @Param("example") SecDoctorMultipointExample example);

    int updateByPrimaryKeySelective(SecDoctorMultipoint record);

    int updateByPrimaryKey(SecDoctorMultipoint record);
}