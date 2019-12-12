package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecRoleRes;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecRoleResMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SecRoleRes record);

    int insertSelective(SecRoleRes record);

    SecRoleRes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecRoleRes record);

    int updateByPrimaryKey(SecRoleRes record);
}