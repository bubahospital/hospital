package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.HisPayment;
import com.buba.hospital.Bean.HisPaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HisPaymentMapper {
    int countByExample(HisPaymentExample example);

    int deleteByExample(HisPaymentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HisPayment record);

    int insertSelective(HisPayment record);

    List<HisPayment> selectByExample(HisPaymentExample example);

    HisPayment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HisPayment record, @Param("example") HisPaymentExample example);

    int updateByExample(@Param("record") HisPayment record, @Param("example") HisPaymentExample example);

    int updateByPrimaryKeySelective(HisPayment record);

    int updateByPrimaryKey(HisPayment record);
}