package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.HisPayment;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HisPaymentMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(HisPayment record);

    int insertSelective(HisPayment record);


    HisPayment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HisPayment record);

    int updateByPrimaryKey(HisPayment record);
}