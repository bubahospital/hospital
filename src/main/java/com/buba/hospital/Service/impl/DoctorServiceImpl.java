package com.buba.hospital.Service.impl;

import com.buba.hospital.Bean.SecDoctor;
import com.buba.hospital.Mapper.SecDoctorMapper;
import com.buba.hospital.Service.DoctorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Resource
    private SecDoctorMapper secDoctorMapper;

    @Override
    public List<SecDoctor> findDoctor(String deptId) {
        return secDoctorMapper.findDoctor(deptId);
    }

    @Override
    public SecDoctor huoquaddress(String id) {
        return secDoctorMapper.huoquaddress(id);
    }
}
