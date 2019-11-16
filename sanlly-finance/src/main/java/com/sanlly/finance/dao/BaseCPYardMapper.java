package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BaseCPYard;
import com.sanlly.finance.entity.BaseCPYardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseCPYardMapper {
    long countByExample(BaseCPYardExample example);

    int deleteByExample(BaseCPYardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseCPYard record);

    int insertSelective(BaseCPYard record);

    List<BaseCPYard> selectByExample(BaseCPYardExample example);

    BaseCPYard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseCPYard record, @Param("example") BaseCPYardExample example);

    int updateByExample(@Param("record") BaseCPYard record, @Param("example") BaseCPYardExample example);

    int updateByPrimaryKeySelective(BaseCPYard record);

    int updateByPrimaryKey(BaseCPYard record);
}