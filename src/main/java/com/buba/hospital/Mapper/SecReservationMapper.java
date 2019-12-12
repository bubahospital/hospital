package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecReservation;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecReservationMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SecReservation record);

    int insertSelective(SecReservation record);

    SecReservation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecReservation record);

    int updateByPrimaryKey(SecReservation record);
}