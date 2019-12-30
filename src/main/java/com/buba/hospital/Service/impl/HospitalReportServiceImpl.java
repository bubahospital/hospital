package com.buba.hospital.Service.impl;


import com.buba.hospital.Bean.JiuzhenPersonVo;
import com.buba.hospital.Bean.SecReport;
import com.buba.hospital.Mapper.SecReportMapper;
import com.buba.hospital.Service.HospitalReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ideahos
 * @description: 检查报告控制层
 * @author: 罗子鉴
 * @create: 2019-12-13 12:45
 **/
@Service
public class HospitalReportServiceImpl implements HospitalReportService {
    @Autowired
    private SecReportMapper secReportMapper;

    @Override
    public List<SecReport> seclectReport(Integer id) {
        return  secReportMapper.seclectReport(id);
    }

    @Override
    public JiuzhenPersonVo Xingqing(Integer reportId) {
        return secReportMapper.Xingqing(reportId);
    }

}

