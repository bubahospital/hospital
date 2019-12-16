package com.buba.hospital.Mapper;


import com.buba.hospital.Bean.SecDoctor;

import java.util.List;

public interface SecDoctorMapper {
    List<SecDoctor> findDoctor(String oo);

    SecDoctor huoquaddress(String id);
}
