package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecPic;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecPicMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(SecPic record);

    int insertSelective(SecPic record);


    SecPic selectByPrimaryKey(Integer id);



    int updateByPrimaryKeySelective(SecPic record);

    int updateByPrimaryKey(SecPic record);
}