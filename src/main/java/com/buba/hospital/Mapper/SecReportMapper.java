package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.JiuzhenPersonVo;
import com.buba.hospital.Bean.SecReport;

import java.util.List;

public interface SecReportMapper {
    List<SecReport> seclectReport(Integer id);

    JiuzhenPersonVo Xingqing(Integer reportId);
}
