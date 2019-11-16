package com.sanlly.production.dao;

import com.sanlly.production.entity.EdiFile;
import com.sanlly.production.entity.EdiFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EdiFileMapper {
    long countByExample(EdiFileExample example);

    int deleteByExample(EdiFileExample example);

    int deleteByPrimaryKey(Integer editFileId);

    int insert(EdiFile record);

    int insertSelective(EdiFile record);

    List<EdiFile> selectByExample(EdiFileExample example);

    EdiFile selectByPrimaryKey(Integer editFileId);

    int updateByExampleSelective(@Param("record") EdiFile record, @Param("example") EdiFileExample example);

    int updateByExample(@Param("record") EdiFile record, @Param("example") EdiFileExample example);

    int updateByPrimaryKeySelective(EdiFile record);

    int updateByPrimaryKey(EdiFile record);
}