package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecRes;
import com.buba.hospital.Bean.SecResExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecResMapper {
    int countByExample(SecResExample example);

    int deleteByExample(SecResExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecRes record);

    int insertSelective(SecRes record);

    List<SecRes> selectByExample(SecResExample example);

    SecRes selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecRes record, @Param("example") SecResExample example);

    int updateByExample(@Param("record") SecRes record, @Param("example") SecResExample example);

    int updateByPrimaryKeySelective(SecRes record);

    int updateByPrimaryKey(SecRes record);
}