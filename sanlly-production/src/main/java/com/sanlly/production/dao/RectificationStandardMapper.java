package com.sanlly.production.dao;

import com.sanlly.production.entity.RectificationStandard;
import com.sanlly.production.entity.RectificationStandardExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RectificationStandardMapper {
    long countByExample(RectificationStandardExample example);

    int deleteByExample(RectificationStandardExample example);

    int deleteByPrimaryKey(Integer prodRectStandardId);

    int insert(RectificationStandard record);

    int insertSelective(RectificationStandard record);

    List<RectificationStandard> selectByExample(RectificationStandardExample example);

    RectificationStandard selectByPrimaryKey(Integer prodRectStandardId);

    int updateByExampleSelective(@Param("record") RectificationStandard record, @Param("example") RectificationStandardExample example);

    int updateByExample(@Param("record") RectificationStandard record, @Param("example") RectificationStandardExample example);

    int updateByPrimaryKeySelective(RectificationStandard record);

    int updateByPrimaryKey(RectificationStandard record);
}