package com.sanlly.production.dao;

import com.sanlly.production.entity.Reason;
import com.sanlly.production.entity.ReasonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReasonMapper {
    long countByExample(ReasonExample example);

    int deleteByExample(ReasonExample example);

    int deleteByPrimaryKey(Integer prodReasonId);

    int insert(Reason record);

    int insertSelective(Reason record);

    List<Reason> selectByExample(ReasonExample example);

    Reason selectByPrimaryKey(Integer prodReasonId);

    int updateByExampleSelective(@Param("record") Reason record, @Param("example") ReasonExample example);

    int updateByExample(@Param("record") Reason record, @Param("example") ReasonExample example);

    int updateByPrimaryKeySelective(Reason record);

    int updateByPrimaryKey(Reason record);
}