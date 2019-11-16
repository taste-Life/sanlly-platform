package com.sanlly.production.dao;

import com.sanlly.production.entity.Pti;
import com.sanlly.production.entity.PtiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PtiMapper {
    long countByExample(PtiExample example);

    int deleteByExample(PtiExample example);

    int deleteByPrimaryKey(Integer prodPtiId);

    int insert(Pti record);

    int insertSelective(Pti record);

    List<Pti> selectByExample(PtiExample example);

    Pti selectByPrimaryKey(Integer prodPtiId);

    int updateByExampleSelective(@Param("record") Pti record, @Param("example") PtiExample example);

    int updateByExample(@Param("record") Pti record, @Param("example") PtiExample example);

    int updateByPrimaryKeySelective(Pti record);

    int updateByPrimaryKey(Pti record);
}