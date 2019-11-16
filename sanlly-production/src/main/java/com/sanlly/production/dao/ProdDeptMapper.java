package com.sanlly.production.dao;

import com.sanlly.production.entity.ProdDept;
import com.sanlly.production.entity.ProdDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdDeptMapper {
    long countByExample(ProdDeptExample example);

    int deleteByExample(ProdDeptExample example);

    int deleteByPrimaryKey(Integer prodProdDeptId);

    int insert(ProdDept record);

    int insertSelective(ProdDept record);

    List<ProdDept> selectByExample(ProdDeptExample example);

    ProdDept selectByPrimaryKey(Integer prodProdDeptId);

    int updateByExampleSelective(@Param("record") ProdDept record, @Param("example") ProdDeptExample example);

    int updateByExample(@Param("record") ProdDept record, @Param("example") ProdDeptExample example);

    int updateByPrimaryKeySelective(ProdDept record);

    int updateByPrimaryKey(ProdDept record);
}