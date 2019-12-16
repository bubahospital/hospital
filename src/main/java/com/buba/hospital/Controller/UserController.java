package com.buba.hospital.Controller;
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
    @RequestMapping("login")
    public SecUser login(String phone){

        SecUser user=userService.login(phone);
        return user;
    }



}
