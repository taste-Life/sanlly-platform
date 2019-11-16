package com.sanlly.production.dao;

import com.sanlly.production.entity.UnitDiscount;
import com.sanlly.production.entity.UnitDiscountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitDiscountMapper {
    long countByExample(UnitDiscountExample example);

    int deleteByExample(UnitDiscountExample example);

    int deleteByPrimaryKey(Integer prodUnitDiscountId);

    int insert(UnitDiscount record);

    int insertSelective(UnitDiscount record);

    List<UnitDiscount> selectByExample(UnitDiscountExample example);

    UnitDiscount selectByPrimaryKey(Integer prodUnitDiscountId);

    int updateByExampleSelective(@Param("record") UnitDiscount record, @Param("example") UnitDiscountExample example);

    int updateByExample(@Param("record") UnitDiscount record, @Param("example") UnitDiscountExample example);

    int updateByPrimaryKeySelective(UnitDiscount record);

    int updateByPrimaryKey(UnitDiscount record);
}