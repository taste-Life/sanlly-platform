package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareDepartments;
import com.sanlly.warehouse.entity.WareDepartmentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareDepartmentsMapper {
    long countByExample(WareDepartmentsExample example);

    int deleteByExample(WareDepartmentsExample example);

    int deleteByPrimaryKey(Integer wareDepartmentsId);

    int insert(WareDepartments record);

    int insertSelective(WareDepartments record);

    List<WareDepartments> selectByExample(WareDepartmentsExample example);

    WareDepartments selectByPrimaryKey(Integer wareDepartmentsId);

    int updateByExampleSelective(@Param("record") WareDepartments record, @Param("example") WareDepartmentsExample example);

    int updateByExample(@Param("record") WareDepartments record, @Param("example") WareDepartmentsExample example);

    int updateByPrimaryKeySelective(WareDepartments record);

    int updateByPrimaryKey(WareDepartments record);
}