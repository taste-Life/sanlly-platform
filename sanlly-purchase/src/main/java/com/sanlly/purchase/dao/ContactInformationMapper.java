package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.ContactInformation;
import com.sanlly.purchase.entity.ContactInformationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContactInformationMapper {
    long countByExample(ContactInformationExample example);

    int deleteByExample(ContactInformationExample example);

    int deleteByPrimaryKey(Integer purcContactInformationId);

    int insert(ContactInformation record);

    int insertSelective(ContactInformation record);

    List<ContactInformation> selectByExample(ContactInformationExample example);

    ContactInformation selectByPrimaryKey(Integer purcContactInformationId);

    int updateByExampleSelective(@Param("record") ContactInformation record, @Param("example") ContactInformationExample example);

    int updateByExample(@Param("record") ContactInformation record, @Param("example") ContactInformationExample example);

    int updateByPrimaryKeySelective(ContactInformation record);

    int updateByPrimaryKey(ContactInformation record);
}