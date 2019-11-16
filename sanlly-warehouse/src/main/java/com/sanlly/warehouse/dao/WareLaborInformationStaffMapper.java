package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareLaborInformationStaff;
import com.sanlly.warehouse.entity.WareLaborInformationStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareLaborInformationStaffMapper {
    long countByExample(WareLaborInformationStaffExample example);

    int deleteByExample(WareLaborInformationStaffExample example);

    int deleteByPrimaryKey(Integer wareLaborInformationStaffId);

    int insert(WareLaborInformationStaff record);

    int insertSelective(WareLaborInformationStaff record);

    List<WareLaborInformationStaff> selectByExample(WareLaborInformationStaffExample example);

    WareLaborInformationStaff selectByPrimaryKey(Integer wareLaborInformationStaffId);

    int updateByExampleSelective(@Param("record") WareLaborInformationStaff record, @Param("example") WareLaborInformationStaffExample example);

    int updateByExample(@Param("record") WareLaborInformationStaff record, @Param("example") WareLaborInformationStaffExample example);

    int updateByPrimaryKeySelective(WareLaborInformationStaff record);

    int updateByPrimaryKey(WareLaborInformationStaff record);
}