package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BaseCPDept;
import com.sanlly.finance.entity.BaseCPDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseCPDeptMapper {
    long countByExample(BaseCPDeptExample example);

    int deleteByExample(BaseCPDeptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseCPDept record);

    int insertSelective(BaseCPDept record);

    List<BaseCPDept> selectByExample(BaseCPDeptExample example);

    BaseCPDept selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseCPDept record, @Param("example") BaseCPDeptExample example);

    int updateByExample(@Param("record") BaseCPDept record, @Param("example") BaseCPDeptExample example);

    int updateByPrimaryKeySelective(BaseCPDept record);

    int updateByPrimaryKey(BaseCPDept record);
}