package com.buba.hospital.Controller;
import com.buba.hospital.Bean.SecPatient;
import com.buba.hospital.Bean.SecSecondDepartment;
import com.buba.hospital.Bean.SecUser;
import com.buba.hospital.Service.HospitalService;
import com.buba.hospital.Service.UserService;
import com.buba.hospital.utils.SendSMSUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * @Author Chang
 * @Description //TODO
 * @Date 13:57 2019/12/16
 * @Param
 * @return
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /*发送验证码*/
    @RequestMapping("sendCode")
    public Integer sendCode(String phone){
        Integer code=0;
        if(null!=phone) {
            code=(int)((Math.random()*9+1)*1000);
            //boolean sendMSM = SendSMSUtils.sendMSM(phone, String.valueOf(code));
            System.out.println(code);
        }
        return code;
    }
    /*登录成功查询登录人信息*/
    @RequestMapping("login")
    public SecUser login(String phone){

        SecUser user=userService.login(phone);
        return user;
    }
    /*登录成功查询登录人默认就诊人*/
    @RequestMapping("getDefaultPatient")
    public SecPatient getDefaultPatient(Integer userId){

        SecPatient patient=userService.getDefaultPatient(userId);
        return patient;
    }
    /*添加就诊人*/
    @RequestMapping("addPatient")
    public boolean addPatient(SecPatient patient){

        boolean b=userService.addPatient(patient);
        return b;
    }
    /*根据所有用户查询关联的就诊人信息*/
    @RequestMapping("getPatientList")
    public List<SecPatient> getPatientList(Integer userId){

        List<SecPatient> list=userService.getPatientList(userId);
        return list;
    }
    /*根据就诊人id查询就诊人信息*/
    @RequestMapping("getPatientById")
    public SecPatient getPatientById(Integer id){

        SecPatient patient=userService.getPatientById(id);
        return patient;
    }
    /*根据就诊人id查询就诊人信息*/
    @RequestMapping("updatePatient")
    public boolean updatePatient(SecPatient patient){
        System.out.println(patient);
        boolean b=userService.updatePatient(patient);
        return b;
    }
    /*根据就诊人id删除绑定的就诊人信息*/
    @RequestMapping("deletePatient")
    public boolean deletePatient(Integer id){
        System.out.println(id);
        boolean b=userService.deletePatient(id);
        return b;
    }
    /*改变用户的默认就诊人*/
    @RequestMapping("updateIsDefault")
    public boolean updateIsDefault(Integer checkId,Integer uncheckId){
        boolean b=userService.updateIsDefault(checkId,uncheckId);
        return b;
    }



}
