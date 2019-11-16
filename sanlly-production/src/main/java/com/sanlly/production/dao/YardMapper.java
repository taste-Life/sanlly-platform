package com.sanlly.production.dao;

import com.sanlly.production.entity.Yard;
import com.sanlly.production.entity.YardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YardMapper {
    long countByExample(YardExample example);

    int deleteByExample(YardExample example);

    int deleteByPrimaryKey(Integer prodYardId);

    int insert(Yard record);

    int insertSelective(Yard record);

    List<Yard> selectByExample(YardExample example);

    Yard selectByPrimaryKey(Integer prodYardId);

    int updateByExampleSelective(@Param("record") Yard record, @Param("example") YardExample example);

    int updateByExample(@Param("record") Yard record, @Param("example") YardExample example);

    int updateByPrimaryKeySelective(Yard record);

    int updateByPrimaryKey(Yard record);
}