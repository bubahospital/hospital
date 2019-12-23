package com.buba.hospital.Service;


import com.buba.hospital.Bean.*;

import java.util.List;

public interface HospitalService {

    List<SecSecondDepartment> getSecondDepartmentById(Integer hospitalId);

    SecHospital getHospital(Integer hospitalId);

    List<SecPic> getSwiper(Integer hospitalId);

    List<SecHospitalArticleVo> getArticleList(Integer hospitalId);

    List<SecHospitalArticleInfoVo> getArticleInfo(Integer articleId);
}
