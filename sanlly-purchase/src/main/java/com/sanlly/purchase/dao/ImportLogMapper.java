package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.ImportLog;
import com.sanlly.purchase.entity.ImportLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImportLogMapper {
    long countByExample(ImportLogExample example);

    int deleteByExample(ImportLogExample example);

    int deleteByPrimaryKey(Integer purcImportLogId);

    int insert(ImportLog record);

    int insertSelective(ImportLog record);

    List<ImportLog> selectByExample(ImportLogExample example);

    ImportLog selectByPrimaryKey(Integer purcImportLogId);

    int updateByExampleSelective(@Param("record") ImportLog record, @Param("example") ImportLogExample example);

    int updateByExample(@Param("record") ImportLog record, @Param("example") ImportLogExample example);

    int updateByPrimaryKeySelective(ImportLog record);

    int updateByPrimaryKey(ImportLog record);
}