package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BaseBillType;
import com.sanlly.finance.entity.BaseBillTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseBillTypeMapper {
    long countByExample(BaseBillTypeExample example);

    int deleteByExample(BaseBillTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseBillType record);

    int insertSelective(BaseBillType record);

    List<BaseBillType> selectByExample(BaseBillTypeExample example);

    BaseBillType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseBillType record, @Param("example") BaseBillTypeExample example);

    int updateByExample(@Param("record") BaseBillType record, @Param("example") BaseBillTypeExample example);

    int updateByPrimaryKeySelective(BaseBillType record);

    int updateByPrimaryKey(BaseBillType record);
}