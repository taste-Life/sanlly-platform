package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.QualificationDocuments;
import com.sanlly.purchase.entity.QualificationDocumentsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QualificationDocumentsMapper {
    long countByExample(QualificationDocumentsExample example);

    int deleteByExample(QualificationDocumentsExample example);

    int deleteByPrimaryKey(Integer purcQualificationDocumentsId);

    int insert(QualificationDocuments record);

    int insertSelective(QualificationDocuments record);

    List<QualificationDocuments> selectByExample(QualificationDocumentsExample example);

    QualificationDocuments selectByPrimaryKey(Integer purcQualificationDocumentsId);

    int updateByExampleSelective(@Param("record") QualificationDocuments record, @Param("example") QualificationDocumentsExample example);

    int updateByExample(@Param("record") QualificationDocuments record, @Param("example") QualificationDocumentsExample example);

    int updateByPrimaryKeySelective(QualificationDocuments record);

    int updateByPrimaryKey(QualificationDocuments record);
}