package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecReport;
import com.buba.hospital.Bean.SecReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecReportMapper {
    int countByExample(SecReportExample example);

    int deleteByExample(SecReportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecReport record);

    int insertSelective(SecReport record);

    List<SecReport> selectByExample(SecReportExample example);

    SecReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecReport record, @Param("example") SecReportExample example);

    int updateByExample(@Param("record") SecReport record, @Param("example") SecReportExample example);

    int updateByPrimaryKeySelective(SecReport record);

    int updateByPrimaryKey(SecReport record);
}