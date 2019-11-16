package com.sanlly.production.models.input.unit;

public class UnitRepairInput {
    private Integer prodUnitRepairId;

    private String repairCode;

    private String repairName;

    private String repairRemarks;

    private Integer isDel;

    private Integer isValid;

    public Integer getProdUnitRepairId() {
        return prodUnitRepairId;
    }

    public void setProdUnitRepairId(Integer prodUnitRepairId) {
        this.prodUnitRepairId = prodUnitRepairId;
    }

    public String getRepairCode() {
        return repairCode;
    }

    public void setRepairCode(String repairCode) {
        this.repairCode = repairCode == null ? null : repairCode.trim();
    }

    public String getRepairName() {
        return repairName;
    }

    public void setRepairName(String repairName) {
        this.repairName = repairName == null ? null : repairName.trim();
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
