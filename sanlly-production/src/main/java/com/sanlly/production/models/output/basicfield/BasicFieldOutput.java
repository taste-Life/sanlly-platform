package com.sanlly.production.models.output.basicfield;

/**
 * @author zhq
 * @date 2019/11/6
 * @description
 */
public class BasicFieldOutput {
    private String fieldCode;

    private String fieldCodeNameLang;

    private String fieldName;

    private String fieldNameEn;

    public String getFieldCode() {
        return fieldCode;
    }

    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldNameEn() {
        return fieldNameEn;
    }

    public void setFieldNameEn(String fieldNameEn) {
        this.fieldNameEn = fieldNameEn;
    }

    public String getFieldCodeNameLang() {
        return fieldCodeNameLang;
    }

    public void setFieldCodeNameLang(String fieldCodeNameLang) {
        this.fieldCodeNameLang = fieldCodeNameLang;
    }
}
