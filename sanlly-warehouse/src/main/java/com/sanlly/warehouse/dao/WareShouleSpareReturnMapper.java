package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareShouleSpareReturn;
import com.sanlly.warehouse.entity.WareShouleSpareReturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareShouleSpareReturnMapper {
    long countByExample(WareShouleSpareReturnExample example);

    int deleteByExample(WareShouleSpareReturnExample example);

    int deleteByPrimaryKey(Integer wareShouleSpareReturnId);

    int insert(WareShouleSpareReturn record);

    int insertSelective(WareShouleSpareReturn record);

    List<WareShouleSpareReturn> selectByExample(WareShouleSpareReturnExample example);

    WareShouleSpareReturn selectByPrimaryKey(Integer wareShouleSpareReturnId);

    int updateByExampleSelective(@Param("record") WareShouleSpareReturn record, @Param("example") WareShouleSpareReturnExample example);

    int updateByExample(@Param("record") WareShouleSpareReturn record, @Param("example") WareShouleSpareReturnExample example);

    int updateByPrimaryKeySelective(WareShouleSpareReturn record);

    int updateByPrimaryKey(WareShouleSpareReturn record);
}