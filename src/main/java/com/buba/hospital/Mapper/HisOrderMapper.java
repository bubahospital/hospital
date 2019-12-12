package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.HisOrder;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HisOrderMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(HisOrder record);

    int insertSelective(HisOrder record);


    HisOrder selectByPrimaryKey(Integer id);



    int updateByPrimaryKeySelective(HisOrder record);

    int updateByPrimaryKey(HisOrder record);
}