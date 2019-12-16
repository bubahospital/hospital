package com.buba.hospital.Controller;
import com.buba.hospital.Bean.SecSecondDepartment;
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
        System.out.println(repartment);
        return repartment;
    }



}
