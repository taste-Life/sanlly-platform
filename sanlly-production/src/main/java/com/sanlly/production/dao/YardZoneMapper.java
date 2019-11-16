package com.sanlly.production.dao;

import com.sanlly.production.entity.YardZone;
import com.sanlly.production.entity.YardZoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YardZoneMapper {
    long countByExample(YardZoneExample example);

    int deleteByExample(YardZoneExample example);

    int deleteByPrimaryKey(Integer prodYardZoneId);

    int insert(YardZone record);

    int insertSelective(YardZone record);

    List<YardZone> selectByExample(YardZoneExample example);

    YardZone selectByPrimaryKey(Integer prodYardZoneId);

    int updateByExampleSelective(@Param("record") YardZone record, @Param("example") YardZoneExample example);

    int updateByExample(@Param("record") YardZone record, @Param("example") YardZoneExample example);

    int updateByPrimaryKeySelective(YardZone record);

    int updateByPrimaryKey(YardZone record);
}