package com.sanlly.production.dao;

import com.sanlly.production.entity.SparesAlgorithm;
import com.sanlly.production.entity.SparesAlgorithmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SparesAlgorithmMapper {
    long countByExample(SparesAlgorithmExample example);

    int deleteByExample(SparesAlgorithmExample example);

    int deleteByPrimaryKey(Integer prodSparesAlgorithmId);

    int insert(SparesAlgorithm record);

    int insertSelective(SparesAlgorithm record);

    List<SparesAlgorithm> selectByExample(SparesAlgorithmExample example);

    SparesAlgorithm selectByPrimaryKey(Integer prodSparesAlgorithmId);

    int updateByExampleSelective(@Param("record") SparesAlgorithm record, @Param("example") SparesAlgorithmExample example);

    int updateByExample(@Param("record") SparesAlgorithm record, @Param("example") SparesAlgorithmExample example);

    int updateByPrimaryKeySelective(SparesAlgorithm record);

    int updateByPrimaryKey(SparesAlgorithm record);
}