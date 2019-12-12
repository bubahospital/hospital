package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecFirstDepartment;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecFirstDepartmentMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SecFirstDepartment record);

    int insertSelective(SecFirstDepartment record);

    SecFirstDepartment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecFirstDepartment record);

    int updateByPrimaryKeyWithBLOBs(SecFirstDepartment record);

    int updateByPrimaryKey(SecFirstDepartment record);
}