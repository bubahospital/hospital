package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecFirstDepartment;
import com.buba.hospital.Bean.SecFirstDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecFirstDepartmentMapper {
    int countByExample(SecFirstDepartmentExample example);

    int deleteByExample(SecFirstDepartmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecFirstDepartment record);

    int insertSelective(SecFirstDepartment record);

    List<SecFirstDepartment> selectByExampleWithBLOBs(SecFirstDepartmentExample example);

    List<SecFirstDepartment> selectByExample(SecFirstDepartmentExample example);

    SecFirstDepartment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecFirstDepartment record, @Param("example") SecFirstDepartmentExample example);

    int updateByExampleWithBLOBs(@Param("record") SecFirstDepartment record, @Param("example") SecFirstDepartmentExample example);

    int updateByExample(@Param("record") SecFirstDepartment record, @Param("example") SecFirstDepartmentExample example);

    int updateByPrimaryKeySelective(SecFirstDepartment record);

    int updateByPrimaryKeyWithBLOBs(SecFirstDepartment record);

    int updateByPrimaryKey(SecFirstDepartment record);
}