package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecUser;
import com.buba.hospital.Bean.SecUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecUserMapper {
    int countByExample(SecUserExample example);

    int deleteByExample(SecUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecUser record);

    int insertSelective(SecUser record);

    List<SecUser> selectByExample(SecUserExample example);

    SecUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecUser record, @Param("example") SecUserExample example);

    int updateByExample(@Param("record") SecUser record, @Param("example") SecUserExample example);

    int updateByPrimaryKeySelective(SecUser record);

    int updateByPrimaryKey(SecUser record);
}