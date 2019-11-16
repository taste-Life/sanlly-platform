package com.sanlly.production.dao;

import com.sanlly.production.entity.AutomationPriority;
import com.sanlly.production.entity.AutomationPriorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AutomationPriorityMapper {
    long countByExample(AutomationPriorityExample example);

    int deleteByExample(AutomationPriorityExample example);

    int deleteByPrimaryKey(Integer prodAutomationPriorityId);

    int insert(AutomationPriority record);

    int insertSelective(AutomationPriority record);

    List<AutomationPriority> selectByExample(AutomationPriorityExample example);

    AutomationPriority selectByPrimaryKey(Integer prodAutomationPriorityId);

    int updateByExampleSelective(@Param("record") AutomationPriority record, @Param("example") AutomationPriorityExample example);

    int updateByExample(@Param("record") AutomationPriority record, @Param("example") AutomationPriorityExample example);

    int updateByPrimaryKeySelective(AutomationPriority record);

    int updateByPrimaryKey(AutomationPriority record);
}