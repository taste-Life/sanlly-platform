package com.sanlly.production.dao;

import com.sanlly.production.entity.CompanyUsecont;
import com.sanlly.production.entity.CompanyUsecontExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyUsecontMapper {
    long countByExample(CompanyUsecontExample example);

    int deleteByExample(CompanyUsecontExample example);

    int deleteByPrimaryKey(Integer prodCompanyUsecontId);

    int insert(CompanyUsecont record);

    int insertSelective(CompanyUsecont record);

    List<CompanyUsecont> selectByExample(CompanyUsecontExample example);

    CompanyUsecont selectByPrimaryKey(Integer prodCompanyUsecontId);

    int updateByExampleSelective(@Param("record") CompanyUsecont record, @Param("example") CompanyUsecontExample example);

    int updateByExample(@Param("record") CompanyUsecont record, @Param("example") CompanyUsecontExample example);

    int updateByPrimaryKeySelective(CompanyUsecont record);

    int updateByPrimaryKey(CompanyUsecont record);
}