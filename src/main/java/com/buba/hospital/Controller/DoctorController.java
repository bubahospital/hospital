package com.buba.hospital.Controller;

import com.buba.hospital.Bean.SecDoctor;
import com.buba.hospital.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    //查询医生信息
    @RequestMapping("appointment")
    public List<SecDoctor> appointment(String deptId){
        List<SecDoctor> list=doctorService.findDoctor(deptId);
        return list;
    }

    //获取医生就诊地址
    @RequestMapping("huoquaddress")
    public SecDoctor huoquaddress(String id){
        return doctorService.huoquaddress(id);
    }
}
