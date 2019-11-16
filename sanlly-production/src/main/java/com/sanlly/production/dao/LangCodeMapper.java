package com.sanlly.production.dao;

import com.sanlly.production.entity.LangCode;
import com.sanlly.production.entity.LangCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LangCodeMapper {
    long countByExample(LangCodeExample example);

    int deleteByExample(LangCodeExample example);

    int deleteByPrimaryKey(String keyPrefix);

    int insert(LangCode record);

    int insertSelective(LangCode record);

    List<LangCode> selectByExample(LangCodeExample example);

    LangCode selectByPrimaryKey(String keyPrefix);

    int updateByExampleSelective(@Param("record") LangCode record, @Param("example") LangCodeExample example);

    int updateByExample(@Param("record") LangCode record, @Param("example") LangCodeExample example);

    int updateByPrimaryKeySelective(LangCode record);

    int updateByPrimaryKey(LangCode record);
}