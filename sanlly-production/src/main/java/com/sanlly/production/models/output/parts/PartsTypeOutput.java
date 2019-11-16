package com.sanlly.production.models.output.parts;

public class PartsTypeOutput {
    private Integer prodPartsTypeId;

    private String key;

    private String containerCategory;

    private String partsTypeCode;

    private String partsTypeName;

    private String partsTypeNameEn;

    private Integer useNumber;

    private Integer isDel;

    private Integer isValid;

    public Integer getProdPartsTypeId() {
        return prodPartsTypeId;
    }

    public void setProdPartsTypeId(Integer prodPartsTypeId) {
        this.prodPartsTypeId = prodPartsTypeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public String getPartsTypeCode() {
        return partsTypeCode;
    }

    public void setPartsTypeCode(String partsTypeCode) {
        this.partsTypeCode = partsTypeCode == null ? null : partsTypeCode.trim();
    }

    public String getPartsTypeName() {
        return partsTypeName;
    }

    public void setPartsTypeName(String partsTypeName) {
        this.partsTypeName = partsTypeName == null ? null : partsTypeName.trim();
    }

    public String getPartsTypeNameEn() {
        return partsTypeNameEn;
    }

    public void setPartsTypeNameEn(String partsTypeNameEn) {
        this.partsTypeNameEn = partsTypeNameEn == null ? null : partsTypeNameEn.trim();
    }

    public Integer getUseNumber() {
        return useNumber;
    }

    public void setUseNumber(Integer useNumber) {
        this.useNumber = useNumber;
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
