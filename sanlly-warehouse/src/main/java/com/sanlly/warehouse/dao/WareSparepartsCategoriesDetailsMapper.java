package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareSparepartsCategoriesDetails;
import com.sanlly.warehouse.entity.WareSparepartsCategoriesDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareSparepartsCategoriesDetailsMapper {
    long countByExample(WareSparepartsCategoriesDetailsExample example);

    int deleteByExample(WareSparepartsCategoriesDetailsExample example);

    int deleteByPrimaryKey(Integer wareSparepartsCategoriesDetailsId);

    int insert(WareSparepartsCategoriesDetails record);

    int insertSelective(WareSparepartsCategoriesDetails record);

    List<WareSparepartsCategoriesDetails> selectByExample(WareSparepartsCategoriesDetailsExample example);

    WareSparepartsCategoriesDetails selectByPrimaryKey(Integer wareSparepartsCategoriesDetailsId);

    int updateByExampleSelective(@Param("record") WareSparepartsCategoriesDetails record, @Param("example") WareSparepartsCategoriesDetailsExample example);

    int updateByExample(@Param("record") WareSparepartsCategoriesDetails record, @Param("example") WareSparepartsCategoriesDetailsExample example);

    int updateByPrimaryKeySelective(WareSparepartsCategoriesDetails record);

    int updateByPrimaryKey(WareSparepartsCategoriesDetails record);
}