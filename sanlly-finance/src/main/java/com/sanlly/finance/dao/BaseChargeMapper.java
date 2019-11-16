package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BaseCharge;
import com.sanlly.finance.entity.BaseChargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseChargeMapper {
    long countByExample(BaseChargeExample example);

    int deleteByExample(BaseChargeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseCharge record);

    int insertSelective(BaseCharge record);

    List<BaseCharge> selectByExample(BaseChargeExample example);

    BaseCharge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseCharge record, @Param("example") BaseChargeExample example);

    int updateByExample(@Param("record") BaseCharge record, @Param("example") BaseChargeExample example);

    int updateByPrimaryKeySelective(BaseCharge record);

    int updateByPrimaryKey(BaseCharge record);
}