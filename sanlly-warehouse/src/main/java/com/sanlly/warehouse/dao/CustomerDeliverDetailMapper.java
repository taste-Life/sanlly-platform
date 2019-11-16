package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.CustomerDeliverDetail;
import com.sanlly.warehouse.entity.CustomerDeliverDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerDeliverDetailMapper {
    long countByExample(CustomerDeliverDetailExample example);

    int deleteByExample(CustomerDeliverDetailExample example);

    int deleteByPrimaryKey(Integer wareCustomerDeliverDetaillId);

    int insert(CustomerDeliverDetail record);

    int insertSelective(CustomerDeliverDetail record);

    List<CustomerDeliverDetail> selectByExample(CustomerDeliverDetailExample example);

    CustomerDeliverDetail selectByPrimaryKey(Integer wareCustomerDeliverDetaillId);

    int updateByExampleSelective(@Param("record") CustomerDeliverDetail record, @Param("example") CustomerDeliverDetailExample example);

    int updateByExample(@Param("record") CustomerDeliverDetail record, @Param("example") CustomerDeliverDetailExample example);

    int updateByPrimaryKeySelective(CustomerDeliverDetail record);

    int updateByPrimaryKey(CustomerDeliverDetail record);
}