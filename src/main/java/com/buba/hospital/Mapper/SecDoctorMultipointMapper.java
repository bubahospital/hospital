package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecDoctorMultipoint;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecDoctorMultipointMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SecDoctorMultipoint record);

    int insertSelective(SecDoctorMultipoint record);


    SecDoctorMultipoint selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecDoctorMultipoint record);

    int updateByPrimaryKey(SecDoctorMultipoint record);
}