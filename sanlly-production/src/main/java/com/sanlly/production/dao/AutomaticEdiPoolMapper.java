package com.sanlly.production.dao;

import com.sanlly.production.entity.AutomaticEdiPool;
import com.sanlly.production.entity.AutomaticEdiPoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AutomaticEdiPoolMapper {
    long countByExample(AutomaticEdiPoolExample example);

    int deleteByExample(AutomaticEdiPoolExample example);

    int deleteByPrimaryKey(Integer prodAutomaticEdiPoolId);

    int insert(AutomaticEdiPool record);

    int insertSelective(AutomaticEdiPool record);

    List<AutomaticEdiPool> selectByExample(AutomaticEdiPoolExample example);

    AutomaticEdiPool selectByPrimaryKey(Integer prodAutomaticEdiPoolId);

    int updateByExampleSelective(@Param("record") AutomaticEdiPool record, @Param("example") AutomaticEdiPoolExample example);

    int updateByExample(@Param("record") AutomaticEdiPool record, @Param("example") AutomaticEdiPoolExample example);

    int updateByPrimaryKeySelective(AutomaticEdiPool record);

    int updateByPrimaryKey(AutomaticEdiPool record);
}