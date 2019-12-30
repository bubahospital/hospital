package com.buba.hospital.Service;

import com.buba.hospital.Bean.JiuzhenPersonVo;
import com.buba.hospital.Bean.SecReport;


import java.util.List;

/**
 * @program: ideahos
 * @description:
 * @author: 罗子鉴
 * @create: 2019-12-13 12:44
 **/
public interface HospitalReportService {
    List<SecReport> seclectReport(Integer id);

    JiuzhenPersonVo Xingqing(Integer reportId);

}

