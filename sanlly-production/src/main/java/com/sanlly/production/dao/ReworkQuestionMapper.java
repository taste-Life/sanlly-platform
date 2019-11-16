package com.sanlly.production.dao;

import com.sanlly.production.entity.ReworkQuestion;
import com.sanlly.production.entity.ReworkQuestionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReworkQuestionMapper {
    long countByExample(ReworkQuestionExample example);

    int deleteByExample(ReworkQuestionExample example);

    int deleteByPrimaryKey(Integer prodReworkQuestionId);

    int insert(ReworkQuestion record);

    int insertSelective(ReworkQuestion record);

    List<ReworkQuestion> selectByExample(ReworkQuestionExample example);

    ReworkQuestion selectByPrimaryKey(Integer prodReworkQuestionId);

    int updateByExampleSelective(@Param("record") ReworkQuestion record, @Param("example") ReworkQuestionExample example);

    int updateByExample(@Param("record") ReworkQuestion record, @Param("example") ReworkQuestionExample example);

    int updateByPrimaryKeySelective(ReworkQuestion record);

    int updateByPrimaryKey(ReworkQuestion record);
}