package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.CustomerDeliver;
import com.sanlly.warehouse.entity.CustomerDeliverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerDeliverMapper {
    long countByExample(CustomerDeliverExample example);

    int deleteByExample(CustomerDeliverExample example);

    int deleteByPrimaryKey(Integer wareCustomerDeliverId);

    int insert(CustomerDeliver record);

    int insertSelective(CustomerDeliver record);

    List<CustomerDeliver> selectByExample(CustomerDeliverExample example);

    CustomerDeliver selectByPrimaryKey(Integer wareCustomerDeliverId);

    int updateByExampleSelective(@Param("record") CustomerDeliver record, @Param("example") CustomerDeliverExample example);

    int updateByExample(@Param("record") CustomerDeliver record, @Param("example") CustomerDeliverExample example);

    int updateByPrimaryKeySelective(CustomerDeliver record);

    int updateByPrimaryKey(CustomerDeliver record);
}