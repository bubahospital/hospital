package com.buba.hospital.Controller;
import com.buba.hospital.Bean.*;
import com.buba.hospital.Service.DoctorService;
import com.buba.hospital.Service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/*
 * @Author Chang
 * @Description //TODO
 * @Date 14:02 2019/12/12
 * @Param
 * @return
 **/
@RestController
@RequestMapping("hospital")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;


    /*
     * @Author Chang
     * @Description //根据id查询所属所有二级科室集合
     * @Date 14:05 2019/12/12
     * @Param [hospitalId] 医院id
     * @return 二级科室集合
     **/
    @ResponseBody
    @RequestMapping("getSecondDepartmentById")
    public List<SecSecondDepartment> getSecondDepartmentById(Integer hospitalId){
        List<SecSecondDepartment> repartment= hospitalService.getSecondDepartmentById(1);
        return repartment;
    }

    /*根据医院id获取医院信息*/
    @ResponseBody
    @RequestMapping("getHospital")
    public SecHospital getHospital(Integer hospitalId){
        SecHospital hospital= hospitalService.getHospital(1);
        return hospital;
    }
    /*根据医院id获取医院首页轮播图*/
    @ResponseBody
    @RequestMapping("getSwiper")
    public List<SecPic> getSwiper(Integer hospitalId){
        List<SecPic> hospital= hospitalService.getSwiper(hospitalId);
        return hospital;
    }
    /*根据医院id获取医院动态列表*/
    @ResponseBody
    @RequestMapping("getArticleList")
    public List<SecHospitalArticleVo> getArticleList(Integer hospitalId){
        List<SecHospitalArticleVo> articleList= hospitalService.getArticleList(hospitalId);

        return articleList;
    }
    /*根据医院id获取医院动态列表*/
    @ResponseBody
    @RequestMapping("getArticleInfo")
    public List<SecHospitalArticleInfoVo> getArticleInfo(Integer articleId){
        List<SecHospitalArticleInfoVo> articleInfo= hospitalService.getArticleInfo(articleId);

        return articleInfo;
    }



}
