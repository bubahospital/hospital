package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecUser;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecUserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SecUser record);

    int insertSelective(SecUser record);

    SecUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecUser record);

    int updateByPrimaryKey(SecUser record);
}