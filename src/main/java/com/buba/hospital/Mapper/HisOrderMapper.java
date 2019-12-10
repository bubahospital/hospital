package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.HisOrder;
import com.buba.hospital.Bean.HisOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HisOrderMapper {
    int countByExample(HisOrderExample example);

    int deleteByExample(HisOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HisOrder record);

    int insertSelective(HisOrder record);

    List<HisOrder> selectByExample(HisOrderExample example);

    HisOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HisOrder record, @Param("example") HisOrderExample example);

    int updateByExample(@Param("record") HisOrder record, @Param("example") HisOrderExample example);

    int updateByPrimaryKeySelective(HisOrder record);

    int updateByPrimaryKey(HisOrder record);
}