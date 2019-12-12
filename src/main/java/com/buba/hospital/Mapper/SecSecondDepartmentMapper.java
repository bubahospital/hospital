package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecSecondDepartment;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecSecondDepartmentMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SecSecondDepartment record);

    int insertSelective(SecSecondDepartment record);

    SecSecondDepartment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecSecondDepartment record);

    int updateByPrimaryKey(SecSecondDepartment record);
}