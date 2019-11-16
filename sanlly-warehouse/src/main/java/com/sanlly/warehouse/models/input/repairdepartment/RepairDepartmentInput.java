package com.sanlly.warehouse.models.input.repairdepartment;

/**
 * @author lishzh
 */
public class RepairDepartmentInput {

    private Integer wareRepairDepartmentId;

    private String key;

    private String departmentNameEn;

    private String departmentName;

    private String remark;

    public Integer getWareRepairDepartmentId() {
        return wareRepairDepartmentId;
    }

    public void setWareRepairDepartmentId(Integer wareRepairDepartmentId) {
        this.wareRepairDepartmentId = wareRepairDepartmentId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDepartmentNameEn() {
        return departmentNameEn;
    }

    public void setDepartmentNameEn(String departmentNameEn) {
        this.departmentNameEn = departmentNameEn;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
