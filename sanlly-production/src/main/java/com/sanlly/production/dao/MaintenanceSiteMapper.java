package com.sanlly.production.dao;

import com.sanlly.production.entity.MaintenanceSite;
import com.sanlly.production.entity.MaintenanceSiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaintenanceSiteMapper {
    long countByExample(MaintenanceSiteExample example);

    int deleteByExample(MaintenanceSiteExample example);

    int deleteByPrimaryKey(Integer prodMaintenanceSiteId);

    int insert(MaintenanceSite record);

    int insertSelective(MaintenanceSite record);

    List<MaintenanceSite> selectByExample(MaintenanceSiteExample example);

    MaintenanceSite selectByPrimaryKey(Integer prodMaintenanceSiteId);

    int updateByExampleSelective(@Param("record") MaintenanceSite record, @Param("example") MaintenanceSiteExample example);

    int updateByExample(@Param("record") MaintenanceSite record, @Param("example") MaintenanceSiteExample example);

    int updateByPrimaryKeySelective(MaintenanceSite record);

    int updateByPrimaryKey(MaintenanceSite record);
}