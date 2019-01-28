package com.dt.spring.mapper;

import com.dt.spring.pojo.Adrress;
import com.dt.spring.pojo.AdrressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdrressMapper {
    int countByExample(AdrressExample example);

    int deleteByExample(AdrressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Adrress record);

    int insertSelective(Adrress record);

    List<Adrress> selectByExample(AdrressExample example);

    Adrress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Adrress record, @Param("example") AdrressExample example);

    int updateByExample(@Param("record") Adrress record, @Param("example") AdrressExample example);

    int updateByPrimaryKeySelective(Adrress record);

    int updateByPrimaryKey(Adrress record);
}