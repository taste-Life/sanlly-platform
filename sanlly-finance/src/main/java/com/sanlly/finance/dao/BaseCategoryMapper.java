package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BaseCategory;
import com.sanlly.finance.entity.BaseCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseCategoryMapper {
    long countByExample(BaseCategoryExample example);

    int deleteByExample(BaseCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseCategory record);

    int insertSelective(BaseCategory record);

    List<BaseCategory> selectByExample(BaseCategoryExample example);

    BaseCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseCategory record, @Param("example") BaseCategoryExample example);

    int updateByExample(@Param("record") BaseCategory record, @Param("example") BaseCategoryExample example);

    int updateByPrimaryKeySelective(BaseCategory record);

    int updateByPrimaryKey(BaseCategory record);
}