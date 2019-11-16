package com.sanlly.production.dao;

import com.sanlly.production.entity.TeamZone;
import com.sanlly.production.entity.TeamZoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamZoneMapper {
    long countByExample(TeamZoneExample example);

    int deleteByExample(TeamZoneExample example);

    int deleteByPrimaryKey(Integer prodTeamZoneId);

    int insert(TeamZone record);

    int insertSelective(TeamZone record);

    List<TeamZone> selectByExample(TeamZoneExample example);

    TeamZone selectByPrimaryKey(Integer prodTeamZoneId);

    int updateByExampleSelective(@Param("record") TeamZone record, @Param("example") TeamZoneExample example);

    int updateByExample(@Param("record") TeamZone record, @Param("example") TeamZoneExample example);

    int updateByPrimaryKeySelective(TeamZone record);

    int updateByPrimaryKey(TeamZone record);
}