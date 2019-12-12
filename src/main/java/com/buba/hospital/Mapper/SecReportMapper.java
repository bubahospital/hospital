package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecReport;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecReportMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SecReport record);

    int insertSelective(SecReport record);

    SecReport selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecReport record);

    int updateByPrimaryKey(SecReport record);
}