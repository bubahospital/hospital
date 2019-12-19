package com.buba.hospital.Service.impl;

import com.buba.hospital.Bean.SecPatient;
import com.buba.hospital.Mapper.PatientMapper;
import com.buba.hospital.Service.PatientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Resource
    private PatientMapper patientMapper;


    @Override
    public List<SecPatient> selectpatient(Integer id) {
        return patientMapper.selectpatient(id);
    }

    @Override
    public int UpdateMoren(Integer id) {
        return patientMapper.UpdateMoren(id);
    }

    @Override
    public SecPatient selectHuixiapatient(Integer id) {
        return patientMapper.selectHuixiapatient(id);
    }

    @Override
    public SecPatient selectUser(Integer id) {
        return patientMapper.selectUser(id);
    }
}
