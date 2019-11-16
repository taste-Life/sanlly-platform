package com.sanlly.production.dao;

import com.sanlly.production.entity.SparesParameter;
import com.sanlly.production.entity.SparesParameterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SparesParameterMapper {
    long countByExample(SparesParameterExample example);

    int deleteByExample(SparesParameterExample example);

    int deleteByPrimaryKey(Integer prodSparesParameterId);

    int insert(SparesParameter record);

    int insertSelective(SparesParameter record);

    List<SparesParameter> selectByExample(SparesParameterExample example);

    SparesParameter selectByPrimaryKey(Integer prodSparesParameterId);

    int updateByExampleSelective(@Param("record") SparesParameter record, @Param("example") SparesParameterExample example);

    int updateByExample(@Param("record") SparesParameter record, @Param("example") SparesParameterExample example);

    int updateByPrimaryKeySelective(SparesParameter record);

    int updateByPrimaryKey(SparesParameter record);
}