package com.sanlly.production.dao;

import com.sanlly.production.entity.CompanyCode;
import com.sanlly.production.entity.CompanyCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyCodeMapper {
    long countByExample(CompanyCodeExample example);

    int deleteByExample(CompanyCodeExample example);

    int deleteByPrimaryKey(Integer prodCompanyCodeId);

    int insert(CompanyCode record);

    int insertSelective(CompanyCode record);

    List<CompanyCode> selectByExample(CompanyCodeExample example);

    CompanyCode selectByPrimaryKey(Integer prodCompanyCodeId);

    int updateByExampleSelective(@Param("record") CompanyCode record, @Param("example") CompanyCodeExample example);

    int updateByExample(@Param("record") CompanyCode record, @Param("example") CompanyCodeExample example);

    int updateByPrimaryKeySelective(CompanyCode record);

    int updateByPrimaryKey(CompanyCode record);
}