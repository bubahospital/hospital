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

    @RequestMapping("appointment")
    public List<SecDoctor> appointment(String deptId){
        List<SecDoctor> list=doctorService.findDoctor(deptId);
        return list;
    }

    @RequestMapping("huoquaddress")
    public SecDoctor huoquaddress(String id){
        return doctorService.huoquaddress(id);
    }
}
