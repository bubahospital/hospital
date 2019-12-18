package com.buba.hospital.Controller;

import com.buba.hospital.Bean.SecPatient;
import com.buba.hospital.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("prient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    //selectPatient 查询就诊人
    @RequestMapping("/selectPatient")
    public List<SecPatient> selectPatient(Integer id){//用户id(获取session的id)
        List<SecPatient>  list =patientService.selectpatient(id);
        return list;
    }


    //UpdateMoren 修改默认人
    @RequestMapping("/UpdateMoren")
    public int UpdateMoren(Integer id){//patientid
        int i =patientService.UpdateMoren(id);
        return i;
    }


    //selectHuixiapatient 回显就诊人（就诊信息）
    @RequestMapping("/selectHuixiapatient")
    public SecPatient selectHuixiapatient(Integer id){
        SecPatient i =patientService.selectHuixiapatient(id);
        if(i==null){
            SecPatient i2 =patientService.selectUser(id);
            return i2;
        }else {
            return  i;
        }


    }
}
