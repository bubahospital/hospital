package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecHospitalNews;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecHospitalNewsMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SecHospitalNews record);

    int insertSelective(SecHospitalNews record);


    SecHospitalNews selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecHospitalNews record);

    int updateByPrimaryKey(SecHospitalNews record);
}