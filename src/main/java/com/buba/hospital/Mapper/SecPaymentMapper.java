package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecPayment;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecPaymentMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SecPayment record);

    int insertSelective(SecPayment record);

    SecPayment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecPayment record);

    int updateByPrimaryKey(SecPayment record);
}