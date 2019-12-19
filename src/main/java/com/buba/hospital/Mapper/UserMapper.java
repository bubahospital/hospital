package com.buba.hospital.Mapper;


import com.buba.hospital.Bean.SecPatient;
import com.buba.hospital.Bean.SecUser;

import java.util.List;

public interface UserMapper {

    SecUser login(String phone);

    boolean addPatient(SecPatient patient);

    List<SecPatient> getPatientList(Integer userId);

    SecPatient getPatientById(Integer id);

    boolean updatePatient(SecPatient patient);

    boolean deletePatient(Integer id);

    boolean updateIsDefault0(Integer checkId);

    boolean updateIsDefault1(Integer uncheckId);

    Integer getDefaultPatient(Integer userId);
}
