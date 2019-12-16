package com.buba.hospital.Service.impl;

import com.buba.hospital.Bean.SecUser;
import com.buba.hospital.Mapper.UserMapper;
import com.buba.hospital.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Chang
 * @Date 2019/12/16 13:56
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
   private UserMapper userMapper;

    @Override
    public SecUser login(String phone) {
        SecUser user=userMapper.login(phone);
        return user;
    }
}
