package com.sanlly.production.models.output.repair;

public class RepairOutput {
    private Integer prodRepairId;

    private String key;

    private String containerCategory;

    private String repairCode;

    private String repairName;

    private String repairNameEn;

    private Integer useNumber;

    private Integer isDel;

    private Integer isValid;

    public Integer getProdRepairId() {
        return prodRepairId;
    }

    public void setProdRepairId(Integer prodRepairId) {
        this.prodRepairId = prodRepairId;
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

    public String getRepairNameEn() {
        return repairNameEn;
    }

    public void setRepairNameEn(String repairNameEn) {
        this.repairNameEn = repairNameEn == null ? null : repairNameEn.trim();
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
