package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BusinessCategory;
import com.sanlly.finance.entity.BusinessCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessCategoryMapper {
    long countByExample(BusinessCategoryExample example);

    int deleteByExample(BusinessCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BusinessCategory record);

    int insertSelective(BusinessCategory record);

    List<BusinessCategory> selectByExample(BusinessCategoryExample example);

    BusinessCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BusinessCategory record, @Param("example") BusinessCategoryExample example);

    int updateByExample(@Param("record") BusinessCategory record, @Param("example") BusinessCategoryExample example);

    int updateByPrimaryKeySelective(BusinessCategory record);

    int updateByPrimaryKey(BusinessCategory record);
}