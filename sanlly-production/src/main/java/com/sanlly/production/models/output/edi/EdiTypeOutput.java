package com.sanlly.production.models.output.edi;

public class EdiTypeOutput {

    private Integer prodEdiTypeId;

    private String key;

    private String ediTypeCode;

    private String ediTypeName;

    private String ediTypeNameEn;

    private Integer isDel;

    private Integer isValid;

    public Integer getProdEdiTypeId() {
        return prodEdiTypeId;
    }

    public void setProdEdiTypeId(Integer prodEdiTypeId) {
        this.prodEdiTypeId = prodEdiTypeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getEdiTypeCode() {
        return ediTypeCode;
    }

    public void setEdiTypeCode(String ediTypeCode) {
        this.ediTypeCode = ediTypeCode == null ? null : ediTypeCode.trim();
    }

    public String getEdiTypeName() {
        return ediTypeName;
    }

    public void setEdiTypeName(String ediTypeName) {
        this.ediTypeName = ediTypeName == null ? null : ediTypeName.trim();
    }

    public String getEdiTypeNameEn() {
        return ediTypeNameEn;
    }

    public void setEdiTypeNameEn(String ediTypeNameEn) {
        this.ediTypeNameEn = ediTypeNameEn == null ? null : ediTypeNameEn.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}
