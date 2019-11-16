package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareEscrowCompany;
import com.sanlly.warehouse.entity.WareEscrowCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareEscrowCompanyMapper {
    long countByExample(WareEscrowCompanyExample example);

    int deleteByExample(WareEscrowCompanyExample example);

    int deleteByPrimaryKey(Integer wareEscrowCompanyId);

    int insert(WareEscrowCompany record);

    int insertSelective(WareEscrowCompany record);

    List<WareEscrowCompany> selectByExample(WareEscrowCompanyExample example);

    WareEscrowCompany selectByPrimaryKey(Integer wareEscrowCompanyId);

    int updateByExampleSelective(@Param("record") WareEscrowCompany record, @Param("example") WareEscrowCompanyExample example);

    int updateByExample(@Param("record") WareEscrowCompany record, @Param("example") WareEscrowCompanyExample example);

    int updateByPrimaryKeySelective(WareEscrowCompany record);

    int updateByPrimaryKey(WareEscrowCompany record);
}