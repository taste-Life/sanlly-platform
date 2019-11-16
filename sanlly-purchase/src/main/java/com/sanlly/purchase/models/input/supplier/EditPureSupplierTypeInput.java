package com.sanlly.purchase.models.input.supplier;

import java.util.Date;

public class EditPureSupplierTypeInput {
	 private Integer pureSupplierTypeId;

	    private String supplierType;

	    private String scope;

	    private String procurementItem;

	    private String manageDepartment;

	    private Date createTime;

	    private Integer createUser;

	    private Date updateTime;

	    private Integer updateUser;

	    private String key;

	    public Integer getPureSupplierTypeId() {
	        return pureSupplierTypeId;
	    }

	    public void setPureSupplierTypeId(Integer pureSupplierTypeId) {
	        this.pureSupplierTypeId = pureSupplierTypeId;
	    }

	    public String getSupplierType() {
	        return supplierType;
	    }

	    public void setSupplierType(String supplierType) {
	        this.supplierType = supplierType == null ? null : supplierType.trim();
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
