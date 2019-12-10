package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecSecondDepartment;
import com.buba.hospital.Bean.SecSecondDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecSecondDepartmentMapper {
    int countByExample(SecSecondDepartmentExample example);

    int deleteByExample(SecSecondDepartmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecSecondDepartment record);

    int insertSelective(SecSecondDepartment record);

    List<SecSecondDepartment> selectByExample(SecSecondDepartmentExample example);

    SecSecondDepartment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecSecondDepartment record, @Param("example") SecSecondDepartmentExample example);

    int updateByExample(@Param("record") SecSecondDepartment record, @Param("example") SecSecondDepartmentExample example);

    int updateByPrimaryKeySelective(SecSecondDepartment record);

    int updateByPrimaryKey(SecSecondDepartment record);
}