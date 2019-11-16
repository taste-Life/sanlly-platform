package com.sanlly.production.dao;

import com.sanlly.production.entity.CodeCorresponding;
import com.sanlly.production.entity.CodeCorrespondingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeCorrespondingMapper {
    long countByExample(CodeCorrespondingExample example);

    int deleteByExample(CodeCorrespondingExample example);

    int deleteByPrimaryKey(Integer prodCodeCorrespondingId);

    int insert(CodeCorresponding record);

    int insertSelective(CodeCorresponding record);

    List<CodeCorresponding> selectByExample(CodeCorrespondingExample example);

    CodeCorresponding selectByPrimaryKey(Integer prodCodeCorrespondingId);

    int updateByExampleSelective(@Param("record") CodeCorresponding record, @Param("example") CodeCorrespondingExample example);

    int updateByExample(@Param("record") CodeCorresponding record, @Param("example") CodeCorrespondingExample example);

    int updateByPrimaryKeySelective(CodeCorresponding record);

    int updateByPrimaryKey(CodeCorresponding record);
}