package com.buba.hospital.Service.impl;

import com.buba.hospital.Bean.SecPatient;
import com.buba.hospital.Bean.SecUser;
import com.buba.hospital.Mapper.UserMapper;
import com.buba.hospital.Service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public boolean addPatient(SecPatient patient) {

        boolean b=userMapper.addPatient(patient);

        return b;

    }

    @Override
    public List<SecPatient> getPatientList(Integer userId) {

        List<SecPatient> list=userMapper.getPatientList(userId);

        return list;
    }

    @Override
    public SecPatient getPatientById(Integer id) {
        SecPatient patient=userMapper.getPatientById(id);
        return patient;
    }

    @Override
    public boolean updatePatient(SecPatient patient) {
        boolean b=userMapper.updatePatient(patient);
        return b;
    }

    @Override
    public boolean deletePatient(Integer id) {
        boolean b=userMapper.deletePatient(id);
        return b;
    }

    @Override
    @Transactional
    public boolean updateIsDefault(Integer checkId, Integer uncheckId) {
        boolean b1=userMapper.updateIsDefault0(checkId);
        boolean b2=userMapper.updateIsDefault1(uncheckId);
        return b1&b2;
    }

    @Override
    public SecPatient getDefaultPatient(Integer userId) {
        SecPatient patient=userMapper.getDefaultPatient(userId);
        return patient;
    }
}
