package com.sanlly.production.dao;

import com.sanlly.production.entity.CompanyEdiType;
import com.sanlly.production.entity.CompanyEdiTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyEdiTypeMapper {
    long countByExample(CompanyEdiTypeExample example);

    int deleteByExample(CompanyEdiTypeExample example);

    int deleteByPrimaryKey(Integer prodCompanyEdiTypeId);

    int insert(CompanyEdiType record);

    int insertSelective(CompanyEdiType record);

    List<CompanyEdiType> selectByExample(CompanyEdiTypeExample example);

    CompanyEdiType selectByPrimaryKey(Integer prodCompanyEdiTypeId);

    int updateByExampleSelective(@Param("record") CompanyEdiType record, @Param("example") CompanyEdiTypeExample example);

    int updateByExample(@Param("record") CompanyEdiType record, @Param("example") CompanyEdiTypeExample example);

    int updateByPrimaryKeySelective(CompanyEdiType record);

    int updateByPrimaryKey(CompanyEdiType record);
}