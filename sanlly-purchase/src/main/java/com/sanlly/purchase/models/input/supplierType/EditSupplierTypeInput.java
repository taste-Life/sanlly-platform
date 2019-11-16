package com.sanlly.purchase.models.input.supplierType;

import java.util.Date;

public class EditSupplierTypeInput {
	
	private Integer purcSupplierTypeId;
	//供应商类别名称
    private String supplierTypeName;

    private String supplierTypeEn;
    //范围
    private String scope;
    //采购项目
    private String procurementItem;
    //归口部门
    private String manageDepartment;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String key;

    public Integer getPurcSupplierTypeId() {
        return purcSupplierTypeId;
    }

    public void setPurcSupplierTypeId(Integer purcSupplierTypeId) {
        this.purcSupplierTypeId = purcSupplierTypeId;
    }

    public String getSupplierTypeName() {
        return supplierTypeName;
    }

    public void setSupplierTypeName(String supplierTypeName) {
        this.supplierTypeName = supplierTypeName == null ? null : supplierTypeName.trim();
    }

    public String getSupplierTypeEn() {
        return supplierTypeEn;
    }

    public void setSupplierTypeEn(String supplierTypeEn) {
        this.supplierTypeEn = supplierTypeEn == null ? null : supplierTypeEn.trim();
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }

    public String getProcurementItem() {
        return procurementItem;
    }

    public void setProcurementItem(String procurementItem) {
        this.procurementItem = procurementItem == null ? null : procurementItem.trim();
    }

    public String getManageDepartment() {
        return manageDepartment;
    }

    public void setManageDepartment(String manageDepartment) {
        this.manageDepartment = manageDepartment == null ? null : manageDepartment.trim();
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }
}
