package com.buba.hospital.Mapper;


import com.buba.hospital.Bean.SecPatient;
import com.buba.hospital.Bean.SecUser;

import java.util.List;

public interface UserMapper {

    SecUser login(String phone);

    boolean addPatient(SecPatient patient);

    List<SecPatient> getPatientList(Integer userId);
}
