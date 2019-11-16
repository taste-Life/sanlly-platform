package com.sanlly.production.dao;

import com.sanlly.production.entity.ProdOut;
import com.sanlly.production.entity.ProdOutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdOutMapper {
    long countByExample(ProdOutExample example);

    int deleteByExample(ProdOutExample example);

    int deleteByPrimaryKey(Integer prodOutId);

    int insert(ProdOut record);

    int insertSelective(ProdOut record);

    List<ProdOut> selectByExampleWithBLOBs(ProdOutExample example);

    List<ProdOut> selectByExample(ProdOutExample example);

    ProdOut selectByPrimaryKey(Integer prodOutId);

    int updateByExampleSelective(@Param("record") ProdOut record, @Param("example") ProdOutExample example);

    int updateByExampleWithBLOBs(@Param("record") ProdOut record, @Param("example") ProdOutExample example);

    int updateByExample(@Param("record") ProdOut record, @Param("example") ProdOutExample example);

    int updateByPrimaryKeySelective(ProdOut record);

    int updateByPrimaryKeyWithBLOBs(ProdOut record);

    int updateByPrimaryKey(ProdOut record);
}