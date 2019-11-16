package com.sanlly.production.entity;

public class MaintenanceBatchDetail {
    private Integer prodMaintenanceBatchDetailId;

    private String partsTypeCode;

    private String partsDetailsCode;

    private String damageCode;

    private String repairCode;

    private Double quantity;

    private String sparesNumber;

    private String remarks;

    private Integer prodMaintenanceBatchId;

    public Integer getProdMaintenanceBatchDetailId() {
        return prodMaintenanceBatchDetailId;
    }

    public void setProdMaintenanceBatchDetailId(Integer prodMaintenanceBatchDetailId) {
        this.prodMaintenanceBatchDetailId = prodMaintenanceBatchDetailId;
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

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getSparesNumber() {
        return sparesNumber;
    }

    public void setSparesNumber(String sparesNumber) {
        this.sparesNumber = sparesNumber == null ? null : sparesNumber.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getProdMaintenanceBatchId() {
        return prodMaintenanceBatchId;
    }

    public void setProdMaintenanceBatchId(Integer prodMaintenanceBatchId) {
        this.prodMaintenanceBatchId = prodMaintenanceBatchId;
    }
}