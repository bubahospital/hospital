package com.buba.hospital.Service;

import com.buba.hospital.Bean.SecPatient;
import com.buba.hospital.Bean.SecUser;

import java.util.List;

public interface UserService {
    SecUser login(String phone);

    boolean addPatient(SecPatient patient);

    List<SecPatient> getPatientList(Integer userId);

    SecPatient getPatientById(Integer id);

    boolean updatePatient(SecPatient patient);

    boolean deletePatient(Integer id);

    boolean updateIsDefault(Integer checkId, Integer uncheckId);

    Integer getDefaultPatient(Integer userId);
}
