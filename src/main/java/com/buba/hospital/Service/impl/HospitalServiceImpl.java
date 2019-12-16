package com.buba.hospital.Service.impl;

import com.buba.hospital.Bean.SecSecondDepartment;
import com.buba.hospital.Mapper.HospitalMapper;
import com.buba.hospital.Mapper.SecDoctorMapper;
import com.buba.hospital.Service.DoctorService;
import com.buba.hospital.Service.HospitalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Resource
    private HospitalMapper hospitalMapper;

    @Override
    public List<SecSecondDepartment> getSecondDepartmentById(Integer hospitalId) {
        List<SecSecondDepartment> repartment= hospitalMapper.getSecondDepartmentById(hospitalId);
        return repartment;
    }
}
