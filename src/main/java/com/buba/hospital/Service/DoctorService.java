package com.buba.hospital.Service;

import com.buba.hospital.Bean.SecDoctor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DoctorService {

    List<SecDoctor> findDoctor(String deptId);

    SecDoctor huoquaddress(String id);
}
