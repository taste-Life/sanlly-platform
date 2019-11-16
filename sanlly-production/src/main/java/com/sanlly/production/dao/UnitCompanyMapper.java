package com.sanlly.production.dao;

import com.sanlly.production.entity.UnitCompany;
import com.sanlly.production.entity.UnitCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitCompanyMapper {
    long countByExample(UnitCompanyExample example);

    int deleteByExample(UnitCompanyExample example);

    int deleteByPrimaryKey(Integer prodUnitCompanyId);

    int insert(UnitCompany record);

    int insertSelective(UnitCompany record);

    List<UnitCompany> selectByExample(UnitCompanyExample example);

    UnitCompany selectByPrimaryKey(Integer prodUnitCompanyId);

    int updateByExampleSelective(@Param("record") UnitCompany record, @Param("example") UnitCompanyExample example);

    int updateByExample(@Param("record") UnitCompany record, @Param("example") UnitCompanyExample example);

    int updateByPrimaryKeySelective(UnitCompany record);

    int updateByPrimaryKey(UnitCompany record);
}