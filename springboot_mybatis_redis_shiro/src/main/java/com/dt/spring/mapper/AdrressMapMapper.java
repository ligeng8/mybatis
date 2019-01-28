package com.dt.spring.mapper;

import com.dt.spring.pojo.AdrressMap;
import com.dt.spring.pojo.AdrressMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdrressMapMapper {
    int countByExample(AdrressMapExample example);

    int deleteByExample(AdrressMapExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdrressMap record);

    int insertSelective(AdrressMap record);

    List<AdrressMap> selectByExample(AdrressMapExample example);

    AdrressMap selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdrressMap record, @Param("example") AdrressMapExample example);

    int updateByExample(@Param("record") AdrressMap record, @Param("example") AdrressMapExample example);

    int updateByPrimaryKeySelective(AdrressMap record);

    int updateByPrimaryKey(AdrressMap record);
}