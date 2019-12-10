package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecPayWay;
import com.buba.hospital.Bean.SecPayWayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecPayWayMapper {
    int countByExample(SecPayWayExample example);

    int deleteByExample(SecPayWayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecPayWay record);

    int insertSelective(SecPayWay record);

    List<SecPayWay> selectByExample(SecPayWayExample example);

    SecPayWay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecPayWay record, @Param("example") SecPayWayExample example);

    int updateByExample(@Param("record") SecPayWay record, @Param("example") SecPayWayExample example);

    int updateByPrimaryKeySelective(SecPayWay record);

    int updateByPrimaryKey(SecPayWay record);
}