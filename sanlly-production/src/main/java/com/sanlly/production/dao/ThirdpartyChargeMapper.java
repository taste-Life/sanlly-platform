package com.sanlly.production.dao;

import com.sanlly.production.entity.ThirdpartyCharge;
import com.sanlly.production.entity.ThirdpartyChargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThirdpartyChargeMapper {
    long countByExample(ThirdpartyChargeExample example);

    int deleteByExample(ThirdpartyChargeExample example);

    int deleteByPrimaryKey(Integer prodThirdpartyChargeId);

    int insert(ThirdpartyCharge record);

    int insertSelective(ThirdpartyCharge record);

    List<ThirdpartyCharge> selectByExample(ThirdpartyChargeExample example);

    ThirdpartyCharge selectByPrimaryKey(Integer prodThirdpartyChargeId);

    int updateByExampleSelective(@Param("record") ThirdpartyCharge record, @Param("example") ThirdpartyChargeExample example);

    int updateByExample(@Param("record") ThirdpartyCharge record, @Param("example") ThirdpartyChargeExample example);

    int updateByPrimaryKeySelective(ThirdpartyCharge record);

    int updateByPrimaryKey(ThirdpartyCharge record);
}