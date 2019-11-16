package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BaseChargeType;
import com.sanlly.finance.entity.BaseChargeTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseChargeTypeMapper {
    long countByExample(BaseChargeTypeExample example);

    int deleteByExample(BaseChargeTypeExample example);

    int deleteByPrimaryKey(Integer chargeTypeId);

    int insert(BaseChargeType record);

    int insertSelective(BaseChargeType record);

    List<BaseChargeType> selectByExample(BaseChargeTypeExample example);

    BaseChargeType selectByPrimaryKey(Integer chargeTypeId);

    int updateByExampleSelective(@Param("record") BaseChargeType record, @Param("example") BaseChargeTypeExample example);

    int updateByExample(@Param("record") BaseChargeType record, @Param("example") BaseChargeTypeExample example);

    int updateByPrimaryKeySelective(BaseChargeType record);

    int updateByPrimaryKey(BaseChargeType record);
}