package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareLaborInsurance;
import com.sanlly.warehouse.entity.WareLaborInsuranceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareLaborInsuranceMapper {
    long countByExample(WareLaborInsuranceExample example);

    int deleteByExample(WareLaborInsuranceExample example);

    int deleteByPrimaryKey(Integer wareLaborInsuranceId);

    int insert(WareLaborInsurance record);

    int insertSelective(WareLaborInsurance record);

    List<WareLaborInsurance> selectByExample(WareLaborInsuranceExample example);

    WareLaborInsurance selectByPrimaryKey(Integer wareLaborInsuranceId);

    int updateByExampleSelective(@Param("record") WareLaborInsurance record, @Param("example") WareLaborInsuranceExample example);

    int updateByExample(@Param("record") WareLaborInsurance record, @Param("example") WareLaborInsuranceExample example);

    int updateByPrimaryKeySelective(WareLaborInsurance record);

    int updateByPrimaryKey(WareLaborInsurance record);
}