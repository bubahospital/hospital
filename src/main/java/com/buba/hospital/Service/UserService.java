package com.buba.hospital.Service;

import com.buba.hospital.Bean.SecPatient;
import com.buba.hospital.Bean.SecUser;

import java.util.List;

public interface UserService {
    SecUser login(String phone);

    boolean addPatient(SecPatient patient);

    List<SecPatient> getPatientList(Integer userId);
}
