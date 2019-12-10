package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecRoleRes;
import com.buba.hospital.Bean.SecRoleResExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecRoleResMapper {
    int countByExample(SecRoleResExample example);

    int deleteByExample(SecRoleResExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecRoleRes record);

    int insertSelective(SecRoleRes record);

    List<SecRoleRes> selectByExample(SecRoleResExample example);

    SecRoleRes selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecRoleRes record, @Param("example") SecRoleResExample example);

    int updateByExample(@Param("record") SecRoleRes record, @Param("example") SecRoleResExample example);

    int updateByPrimaryKeySelective(SecRoleRes record);

    int updateByPrimaryKey(SecRoleRes record);
}