package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareToolApply;
import com.sanlly.warehouse.entity.WareToolApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareToolApplyMapper {
    long countByExample(WareToolApplyExample example);

    int deleteByExample(WareToolApplyExample example);

    int deleteByPrimaryKey(Integer wareToolApplyId);

    int insert(WareToolApply record);

    int insertSelective(WareToolApply record);

    List<WareToolApply> selectByExample(WareToolApplyExample example);

    WareToolApply selectByPrimaryKey(Integer wareToolApplyId);

    int updateByExampleSelective(@Param("record") WareToolApply record, @Param("example") WareToolApplyExample example);

    int updateByExample(@Param("record") WareToolApply record, @Param("example") WareToolApplyExample example);

    int updateByPrimaryKeySelective(WareToolApply record);

    int updateByPrimaryKey(WareToolApply record);
}