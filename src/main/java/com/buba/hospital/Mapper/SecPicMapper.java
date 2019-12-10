package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecPic;
import com.buba.hospital.Bean.SecPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecPicMapper {
    int countByExample(SecPicExample example);

    int deleteByExample(SecPicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecPic record);

    int insertSelective(SecPic record);

    List<SecPic> selectByExample(SecPicExample example);

    SecPic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecPic record, @Param("example") SecPicExample example);

    int updateByExample(@Param("record") SecPic record, @Param("example") SecPicExample example);

    int updateByPrimaryKeySelective(SecPic record);

    int updateByPrimaryKey(SecPic record);
}