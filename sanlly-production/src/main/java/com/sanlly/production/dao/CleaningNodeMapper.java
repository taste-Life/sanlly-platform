package com.sanlly.production.dao;

import com.sanlly.production.entity.CleaningNode;
import com.sanlly.production.entity.CleaningNodeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CleaningNodeMapper {
    long countByExample(CleaningNodeExample example);

    int deleteByExample(CleaningNodeExample example);

    int deleteByPrimaryKey(Integer prodCleaningNode);

    int insert(CleaningNode record);

    int insertSelective(CleaningNode record);

    List<CleaningNode> selectByExample(CleaningNodeExample example);

    CleaningNode selectByPrimaryKey(Integer prodCleaningNode);

    int updateByExampleSelective(@Param("record") CleaningNode record, @Param("example") CleaningNodeExample example);

    int updateByExample(@Param("record") CleaningNode record, @Param("example") CleaningNodeExample example);

    int updateByPrimaryKeySelective(CleaningNode record);

    int updateByPrimaryKey(CleaningNode record);
}