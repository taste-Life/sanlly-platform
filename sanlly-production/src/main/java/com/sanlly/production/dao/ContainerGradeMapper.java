package com.sanlly.production.dao;

import com.sanlly.production.entity.ContainerGrade;
import com.sanlly.production.entity.ContainerGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContainerGradeMapper {
    long countByExample(ContainerGradeExample example);

    int deleteByExample(ContainerGradeExample example);

    int deleteByPrimaryKey(Integer prodContainerGradeId);

    int insert(ContainerGrade record);

    int insertSelective(ContainerGrade record);

    List<ContainerGrade> selectByExample(ContainerGradeExample example);

    ContainerGrade selectByPrimaryKey(Integer prodContainerGradeId);

    int updateByExampleSelective(@Param("record") ContainerGrade record, @Param("example") ContainerGradeExample example);

    int updateByExample(@Param("record") ContainerGrade record, @Param("example") ContainerGradeExample example);

    int updateByPrimaryKeySelective(ContainerGrade record);

    int updateByPrimaryKey(ContainerGrade record);
}