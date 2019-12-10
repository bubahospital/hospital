package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecPayment;
import com.buba.hospital.Bean.SecPaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecPaymentMapper {
    int countByExample(SecPaymentExample example);

    int deleteByExample(SecPaymentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecPayment record);

    int insertSelective(SecPayment record);

    List<SecPayment> selectByExample(SecPaymentExample example);

    SecPayment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecPayment record, @Param("example") SecPaymentExample example);

    int updateByExample(@Param("record") SecPayment record, @Param("example") SecPaymentExample example);

    int updateByPrimaryKeySelective(SecPayment record);

    int updateByPrimaryKey(SecPayment record);
}