package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareToolManage;
import com.sanlly.warehouse.entity.WareToolManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareToolManageMapper {
    long countByExample(WareToolManageExample example);

    int deleteByExample(WareToolManageExample example);

    int deleteByPrimaryKey(Integer wareToolManageId);

    int insert(WareToolManage record);

    int insertSelective(WareToolManage record);

    List<WareToolManage> selectByExample(WareToolManageExample example);

    WareToolManage selectByPrimaryKey(Integer wareToolManageId);

    int updateByExampleSelective(@Param("record") WareToolManage record, @Param("example") WareToolManageExample example);

    int updateByExample(@Param("record") WareToolManage record, @Param("example") WareToolManageExample example);

    int updateByPrimaryKeySelective(WareToolManage record);

    int updateByPrimaryKey(WareToolManage record);
}