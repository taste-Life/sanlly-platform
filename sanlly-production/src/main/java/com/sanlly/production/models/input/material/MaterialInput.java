package com.sanlly.production.models.input.material;

public class MaterialInput {
    private Integer prodMaterialId;

    private String key;

    private String containerCategory;

    private String materialCode;

    private String materialName;

    private String materialNameEn;

    private Integer useNumber;

    private Integer isDel;

    private Integer isValid;

    public Integer getProdMaterialId() {
        return prodMaterialId;
    }

    public void setProdMaterialId(Integer prodMaterialId) {
        this.prodMaterialId = prodMaterialId;
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

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode == null ? null : materialCode.trim();
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    public String getMaterialNameEn() {
        return materialNameEn;
    }

    public void setMaterialNameEn(String materialNameEn) {
        this.materialNameEn = materialNameEn == null ? null : materialNameEn.trim();
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
