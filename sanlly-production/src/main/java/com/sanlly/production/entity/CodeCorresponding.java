package com.sanlly.production.entity;

import java.util.Date;

public class CodeCorresponding {
    private Integer prodCodeCorrespondingId;

    private String containerCategory;

    private String positionCode;

    private String partsTypeCode;

    private String partsDetailsCode;

    private String partsRepairType;

    private String repairCode;

    private String partsRepairCode;

    private String damageCode;

    private String materialCode;

    private String selectMaterialCode;

    private String isGz;

    private Integer useNumber;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdCodeCorrespondingId() {
        return prodCodeCorrespondingId;
    }

    public void setProdCodeCorrespondingId(Integer prodCodeCorrespondingId) {
        this.prodCodeCorrespondingId = prodCodeCorrespondingId;
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode == null ? null : positionCode.trim();
    }

    public String getPartsTypeCode() {
        return partsTypeCode;
    }

    public void setPartsTypeCode(String partsTypeCode) {
        this.partsTypeCode = partsTypeCode == null ? null : partsTypeCode.trim();
    }

    public String getPartsDetailsCode() {
        return partsDetailsCode;
    }

    public void setPartsDetailsCode(String partsDetailsCode) {
        this.partsDetailsCode = partsDetailsCode == null ? null : partsDetailsCode.trim();
    }

    public String getPartsRepairType() {
        return partsRepairType;
    }

    public void setPartsRepairType(String partsRepairType) {
        this.partsRepairType = partsRepairType == null ? null : partsRepairType.trim();
    }

    public String getRepairCode() {
        return repairCode;
    }

    public void setRepairCode(String repairCode) {
        this.repairCode = repairCode == null ? null : repairCode.trim();
    }

    public String getPartsRepairCode() {
        return partsRepairCode;
    }

    public void setPartsRepairCode(String partsRepairCode) {
        this.partsRepairCode = partsRepairCode == null ? null : partsRepairCode.trim();
    }

    public String getDamageCode() {
        return damageCode;
    }

    public void setDamageCode(String damageCode) {
        this.damageCode = damageCode == null ? null : damageCode.trim();
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode == null ? null : materialCode.trim();
    }

    public String getSelectMaterialCode() {
        return selectMaterialCode;
    }

    public void setSelectMaterialCode(String selectMaterialCode) {
        this.selectMaterialCode = selectMaterialCode == null ? null : selectMaterialCode.trim();
    }

    public String getIsGz() {
        return isGz;
    }

    public void setIsGz(String isGz) {
        this.isGz = isGz == null ? null : isGz.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }
}