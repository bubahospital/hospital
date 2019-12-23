package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.*;

import java.util.List;

public interface HospitalMapper {
    List<SecSecondDepartment> getSecondDepartmentById(Integer hospitalId);

    SecHospital getHospital(Integer hospitalId);

    List<SecPic> getSwiper(Integer hospitalId);

    List<SecHospitalArticleVo> getArticleList(Integer hospitalId);

    List<SecHospitalArticleInfoVo> getArticleInfoList(Integer articleId);

    List<SecHospitalArticleInfoVo> getArticleImgList(Integer articleId);
}
