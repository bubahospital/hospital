package com.buba.hospital.Mapper;

import com.buba.hospital.Bean.SecArticleDic;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecArticleDicMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SecArticleDic record);

    int insertSelective(SecArticleDic record);

    SecArticleDic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecArticleDic record);

    int updateByPrimaryKey(SecArticleDic record);
}