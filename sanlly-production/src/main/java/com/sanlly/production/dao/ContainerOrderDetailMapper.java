package com.sanlly.production.dao;

import com.sanlly.production.entity.ContainerOrderDetail;
import com.sanlly.production.entity.ContainerOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContainerOrderDetailMapper {
    long countByExample(ContainerOrderDetailExample example);

    int deleteByExample(ContainerOrderDetailExample example);

    int deleteByPrimaryKey(Integer prodContainerOrderDetailId);

    int insert(ContainerOrderDetail record);

    int insertSelective(ContainerOrderDetail record);

    List<ContainerOrderDetail> selectByExample(ContainerOrderDetailExample example);

    ContainerOrderDetail selectByPrimaryKey(Integer prodContainerOrderDetailId);

    int updateByExampleSelective(@Param("record") ContainerOrderDetail record, @Param("example") ContainerOrderDetailExample example);

    int updateByExample(@Param("record") ContainerOrderDetail record, @Param("example") ContainerOrderDetailExample example);

    int updateByPrimaryKeySelective(ContainerOrderDetail record);

    int updateByPrimaryKey(ContainerOrderDetail record);
}