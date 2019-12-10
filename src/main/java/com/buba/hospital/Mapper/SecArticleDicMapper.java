package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecArticleDic;
import com.buba.hospital.Bean.SecArticleDicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecArticleDicMapper {
    int countByExample(SecArticleDicExample example);

    int deleteByExample(SecArticleDicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecArticleDic record);

    int insertSelective(SecArticleDic record);

    List<SecArticleDic> selectByExample(SecArticleDicExample example);

    SecArticleDic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecArticleDic record, @Param("example") SecArticleDicExample example);

    int updateByExample(@Param("record") SecArticleDic record, @Param("example") SecArticleDicExample example);

    int updateByPrimaryKeySelective(SecArticleDic record);

    int updateByPrimaryKey(SecArticleDic record);
}