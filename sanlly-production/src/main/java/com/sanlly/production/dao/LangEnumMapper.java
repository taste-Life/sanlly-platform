package com.sanlly.production.dao;

import com.sanlly.production.entity.LangEnum;
import com.sanlly.production.entity.LangEnumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LangEnumMapper {
    long countByExample(LangEnumExample example);

    int deleteByExample(LangEnumExample example);

    int deleteByPrimaryKey(String enumKey);

    int insert(LangEnum record);

    int insertSelective(LangEnum record);

    List<LangEnum> selectByExample(LangEnumExample example);

    LangEnum selectByPrimaryKey(String enumKey);

    int updateByExampleSelective(@Param("record") LangEnum record, @Param("example") LangEnumExample example);

    int updateByExample(@Param("record") LangEnum record, @Param("example") LangEnumExample example);

    int updateByPrimaryKeySelective(LangEnum record);

    int updateByPrimaryKey(LangEnum record);
}