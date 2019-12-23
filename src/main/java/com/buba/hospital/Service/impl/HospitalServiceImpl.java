package com.buba.hospital.Service.impl;

import com.buba.hospital.Bean.*;
import com.buba.hospital.Mapper.HospitalMapper;
import com.buba.hospital.Mapper.SecDoctorMapper;
import com.buba.hospital.Service.DoctorService;
import com.buba.hospital.Service.HospitalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Resource
    private HospitalMapper hospitalMapper;

    @Override
    public List<SecSecondDepartment> getSecondDepartmentById(Integer hospitalId) {
        List<SecSecondDepartment> repartment= hospitalMapper.getSecondDepartmentById(hospitalId);
        return repartment;
    }

    @Override
    public SecHospital getHospital(Integer hospitalId) {
        SecHospital hospital= hospitalMapper.getHospital(hospitalId);
        return hospital;
    }

    @Override
    public List<SecPic> getSwiper(Integer hospitalId) {
        List<SecPic> hospital= hospitalMapper.getSwiper(hospitalId);
        return hospital;
    }

    @Override
    public List<SecHospitalArticleVo> getArticleList(Integer hospitalId) {
        List<SecHospitalArticleVo> articleList= hospitalMapper.getArticleList(hospitalId);
        return articleList;
    }

    @Override
    public List<SecHospitalArticleInfoVo> getArticleInfo(Integer articleId) {
        List<SecHospitalArticleInfoVo> list =hospitalMapper.getArticleInfoList(articleId);
        for(SecHospitalArticleInfoVo l :list){
            l.setType("text");
        }
        List<SecHospitalArticleInfoVo> list1 =hospitalMapper.getArticleImgList(articleId);

        for(SecHospitalArticleInfoVo l :list1){
            l.setType("image");
        }
        if(list1!=null){
            list.addAll(list1);
        }
        Collections.sort(list);

        return list;
    }
}
