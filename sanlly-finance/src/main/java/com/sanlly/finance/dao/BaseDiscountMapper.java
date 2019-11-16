package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BaseDiscount;
import com.sanlly.finance.entity.BaseDiscountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseDiscountMapper {
    long countByExample(BaseDiscountExample example);

    int deleteByExample(BaseDiscountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseDiscount record);

    int insertSelective(BaseDiscount record);

    List<BaseDiscount> selectByExample(BaseDiscountExample example);

    BaseDiscount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseDiscount record, @Param("example") BaseDiscountExample example);

    int updateByExample(@Param("record") BaseDiscount record, @Param("example") BaseDiscountExample example);

    int updateByPrimaryKeySelective(BaseDiscount record);

    int updateByPrimaryKey(BaseDiscount record);
}