package com.buba.hospital.Service;

import com.buba.hospital.Bean.SecPatient;

import java.util.List;

public interface PatientService {

    List<SecPatient> selectpatient(Integer id);

    int UpdateMoren(Integer id);

    SecPatient selectHuixiapatient(Integer id);

    SecPatient selectUser(Integer id);
}
