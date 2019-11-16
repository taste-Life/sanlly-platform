package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareLaborInsuranceDetail;
import com.sanlly.warehouse.entity.WareLaborInsuranceDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareLaborInsuranceDetailMapper {
    long countByExample(WareLaborInsuranceDetailExample example);

    int deleteByExample(WareLaborInsuranceDetailExample example);

    int deleteByPrimaryKey(Integer wareLaborInsuranceDetailId);

    int insert(WareLaborInsuranceDetail record);

    int insertSelective(WareLaborInsuranceDetail record);

    List<WareLaborInsuranceDetail> selectByExample(WareLaborInsuranceDetailExample example);

    WareLaborInsuranceDetail selectByPrimaryKey(Integer wareLaborInsuranceDetailId);

    int updateByExampleSelective(@Param("record") WareLaborInsuranceDetail record, @Param("example") WareLaborInsuranceDetailExample example);

    int updateByExample(@Param("record") WareLaborInsuranceDetail record, @Param("example") WareLaborInsuranceDetailExample example);

    int updateByPrimaryKeySelective(WareLaborInsuranceDetail record);

    int updateByPrimaryKey(WareLaborInsuranceDetail record);
}