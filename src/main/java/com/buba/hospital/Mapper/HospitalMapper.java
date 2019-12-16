package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecSecondDepartment;

import java.util.List;

public interface HospitalMapper {
    List<SecSecondDepartment> getSecondDepartmentById(Integer hospitalId);
}
