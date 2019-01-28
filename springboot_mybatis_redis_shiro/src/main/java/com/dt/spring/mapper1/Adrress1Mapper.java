package com.dt.spring.mapper1;

import com.dt.spring.pojo1.Adrress1;
import com.dt.spring.pojo1.Adrress1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Adrress1Mapper {
    int countByExample(Adrress1Example example);

    int deleteByExample(Adrress1Example example);

    int deleteByPrimaryKey(Long id);

    int insert(Adrress1 record);

    int insertSelective(Adrress1 record);

    List<Adrress1> selectByExample(Adrress1Example example);

    Adrress1 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Adrress1 record, @Param("example") Adrress1Example example);

    int updateByExample(@Param("record") Adrress1 record, @Param("example") Adrress1Example example);

    int updateByPrimaryKeySelective(Adrress1 record);

    int updateByPrimaryKey(Adrress1 record);
}