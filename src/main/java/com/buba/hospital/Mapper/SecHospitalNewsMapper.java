package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecHospitalNews;
import com.buba.hospital.Bean.SecHospitalNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecHospitalNewsMapper {
    int countByExample(SecHospitalNewsExample example);

    int deleteByExample(SecHospitalNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecHospitalNews record);

    int insertSelective(SecHospitalNews record);

    List<SecHospitalNews> selectByExample(SecHospitalNewsExample example);

    SecHospitalNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecHospitalNews record, @Param("example") SecHospitalNewsExample example);

    int updateByExample(@Param("record") SecHospitalNews record, @Param("example") SecHospitalNewsExample example);

    int updateByPrimaryKeySelective(SecHospitalNews record);

    int updateByPrimaryKey(SecHospitalNews record);
}