package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecReservation;
import com.buba.hospital.Bean.SecReservationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecReservationMapper {
    int countByExample(SecReservationExample example);

    int deleteByExample(SecReservationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecReservation record);

    int insertSelective(SecReservation record);

    List<SecReservation> selectByExample(SecReservationExample example);

    SecReservation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecReservation record, @Param("example") SecReservationExample example);

    int updateByExample(@Param("record") SecReservation record, @Param("example") SecReservationExample example);

    int updateByPrimaryKeySelective(SecReservation record);

    int updateByPrimaryKey(SecReservation record);
}