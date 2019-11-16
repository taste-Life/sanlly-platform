package com.sanlly.production.dao;

import com.sanlly.production.entity.SpareParts;
import com.sanlly.production.entity.SparePartsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SparePartsMapper {
    long countByExample(SparePartsExample example);

    int deleteByExample(SparePartsExample example);

    int deleteByPrimaryKey(Integer wareSparePartsId);

    int insert(SpareParts record);

    int insertSelective(SpareParts record);

    List<SpareParts> selectByExample(SparePartsExample example);

    SpareParts selectByPrimaryKey(Integer wareSparePartsId);

    int updateByExampleSelective(@Param("record") SpareParts record, @Param("example") SparePartsExample example);

    int updateByExample(@Param("record") SpareParts record, @Param("example") SparePartsExample example);

    int updateByPrimaryKeySelective(SpareParts record);

    int updateByPrimaryKey(SpareParts record);
}