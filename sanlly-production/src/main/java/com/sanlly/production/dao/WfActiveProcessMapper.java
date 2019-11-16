package com.sanlly.production.dao;

import com.sanlly.production.entity.WfActiveProcess;
import com.sanlly.production.entity.WfActiveProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WfActiveProcessMapper {
    long countByExample(WfActiveProcessExample example);

    int deleteByExample(WfActiveProcessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WfActiveProcess record);

    int insertSelective(WfActiveProcess record);

    List<WfActiveProcess> selectByExample(WfActiveProcessExample example);

    WfActiveProcess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WfActiveProcess record, @Param("example") WfActiveProcessExample example);

    int updateByExample(@Param("record") WfActiveProcess record, @Param("example") WfActiveProcessExample example);

    int updateByPrimaryKeySelective(WfActiveProcess record);

    int updateByPrimaryKey(WfActiveProcess record);
}