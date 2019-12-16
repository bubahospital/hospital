package com.buba.hospital.Service;


import com.buba.hospital.Bean.SecSecondDepartment;

import java.util.List;

public interface HospitalService {

    List<SecSecondDepartment> getSecondDepartmentById(Integer hospitalId);
}
