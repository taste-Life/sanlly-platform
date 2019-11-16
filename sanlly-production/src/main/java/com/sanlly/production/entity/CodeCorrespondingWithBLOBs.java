package com.sanlly.production.entity;

public class CodeCorrespondingWithBLOBs extends CodeCorresponding {
    private String positionCode;

    private String partsTypeCode;

    private String partsDetailsCode;

    private String repairCode;

    private String partsRepairCode;

    private String damageCode;

    private String materialCode;

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
}