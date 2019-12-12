package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecPayWay;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecPayWayMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SecPayWay record);

    int insertSelective(SecPayWay record);

    SecPayWay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecPayWay record);

    int updateByPrimaryKey(SecPayWay record);
}