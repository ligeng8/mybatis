package com.dt.spring.mapper1;

import com.dt.spring.pojo1.AdrressMap1;
import com.dt.spring.pojo1.AdrressMap1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdrressMap1Mapper {
    int countByExample(AdrressMap1Example example);

    int deleteByExample(AdrressMap1Example example);

    int deleteByPrimaryKey(Long id);

    int insert(AdrressMap1 record);

    int insertSelective(AdrressMap1 record);

    List<AdrressMap1> selectByExample(AdrressMap1Example example);

    AdrressMap1 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdrressMap1 record, @Param("example") AdrressMap1Example example);

    int updateByExample(@Param("record") AdrressMap1 record, @Param("example") AdrressMap1Example example);

    int updateByPrimaryKeySelective(AdrressMap1 record);

    int updateByPrimaryKey(AdrressMap1 record);
}