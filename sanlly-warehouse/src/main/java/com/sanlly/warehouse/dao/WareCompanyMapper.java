package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareCompany;
import com.sanlly.warehouse.entity.WareCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareCompanyMapper {
    long countByExample(WareCompanyExample example);

    int deleteByExample(WareCompanyExample example);

    int deleteByPrimaryKey(Integer wareCompanyId);

    int insert(WareCompany record);

    int insertSelective(WareCompany record);

    List<WareCompany> selectByExample(WareCompanyExample example);

    WareCompany selectByPrimaryKey(Integer wareCompanyId);

    int updateByExampleSelective(@Param("record") WareCompany record, @Param("example") WareCompanyExample example);

    int updateByExample(@Param("record") WareCompany record, @Param("example") WareCompanyExample example);

    int updateByPrimaryKeySelective(WareCompany record);

    int updateByPrimaryKey(WareCompany record);
}