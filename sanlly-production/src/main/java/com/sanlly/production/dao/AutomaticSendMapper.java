package com.sanlly.production.dao;

import com.sanlly.production.entity.AutomaticSend;
import com.sanlly.production.entity.AutomaticSendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AutomaticSendMapper {
    long countByExample(AutomaticSendExample example);

    int deleteByExample(AutomaticSendExample example);

    int deleteByPrimaryKey(Integer prodAutomaticSendId);

    int insert(AutomaticSend record);

    int insertSelective(AutomaticSend record);

    List<AutomaticSend> selectByExample(AutomaticSendExample example);

    AutomaticSend selectByPrimaryKey(Integer prodAutomaticSendId);

    int updateByExampleSelective(@Param("record") AutomaticSend record, @Param("example") AutomaticSendExample example);

    int updateByExample(@Param("record") AutomaticSend record, @Param("example") AutomaticSendExample example);

    int updateByPrimaryKeySelective(AutomaticSend record);

    int updateByPrimaryKey(AutomaticSend record);
}