package com.sanlly.production.models.input.unit;

public class UnitRepairEntryInput {
    private Integer prodUnitRepairEntryId;

    private Integer unitRepair;

    private String partsTypeCode;

    private String partsDetailsCode;

    private String damageCode;

    private String repairCode;

    private String sparesNumber;

    private Integer quantity;

    private String repairRemarks;

    private Integer isDel;

    private Integer isValid;

    public Integer getProdUnitRepairEntryId() {
        return prodUnitRepairEntryId;
    }

    public void setProdUnitRepairEntryId(Integer prodUnitRepairEntryId) {
        this.prodUnitRepairEntryId = prodUnitRepairEntryId;
    }

    public Integer getUnitRepair() {
        return unitRepair;
    }

    public void setUnitRepair(Integer unitRepair) {
        this.unitRepair = unitRepair;
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

    public String getDamageCode() {
        return damageCode;
    }

    public void setDamageCode(String damageCode) {
        this.damageCode = damageCode == null ? null : damageCode.trim();
    }

    public String getRepairCode() {
        return repairCode;
    }

    public void setRepairCode(String repairCode) {
        this.repairCode = repairCode == null ? null : repairCode.trim();
    }

    public String getSparesNumber() {
        return sparesNumber;
    }

    public void setSparesNumber(String sparesNumber) {
        this.sparesNumber = sparesNumber == null ? null : sparesNumber.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getRepairRemarks() {
        return repairRemarks;
    }

    public void setRepairRemarks(String repairRemarks) {
        this.repairRemarks = repairRemarks == null ? null : repairRemarks.trim();
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
