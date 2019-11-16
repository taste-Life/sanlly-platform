package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareRefrigeratorCompany;
import com.sanlly.warehouse.entity.WareRefrigeratorCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareRefrigeratorCompanyMapper {
    long countByExample(WareRefrigeratorCompanyExample example);

    int deleteByExample(WareRefrigeratorCompanyExample example);

    int deleteByPrimaryKey(Integer wareRefrigeratorCompanyId);

    int insert(WareRefrigeratorCompany record);

    int insertSelective(WareRefrigeratorCompany record);

    List<WareRefrigeratorCompany> selectByExample(WareRefrigeratorCompanyExample example);

    WareRefrigeratorCompany selectByPrimaryKey(Integer wareRefrigeratorCompanyId);

    int updateByExampleSelective(@Param("record") WareRefrigeratorCompany record, @Param("example") WareRefrigeratorCompanyExample example);

    int updateByExample(@Param("record") WareRefrigeratorCompany record, @Param("example") WareRefrigeratorCompanyExample example);

    int updateByPrimaryKeySelective(WareRefrigeratorCompany record);

    int updateByPrimaryKey(WareRefrigeratorCompany record);
}