package com.sanlly.purchase.models.input.specialsupplier;

import com.sanlly.common.models.input.PageInput;

import java.util.Date;

public class SearchSpecialSupplierInput extends PageInput{
	 	private Integer specialSupplierId;

	    private String name;

	    private Date createTime;

	    private Integer createUser;

	    private Date updateTime;

	    private Integer updateUser;

	    private String nameEn;

	    private String supplierType;
	    
	    public SearchSpecialSupplierInput(Integer pageIndex,Integer pageSize){
			super(pageIndex,pageSize);
		}
	    

	    public Integer getSpecialSupplierId() {
	        return specialSupplierId;
	    }

	    public void setSpecialSupplierId(Integer specialSupplierId) {
	        this.specialSupplierId = specialSupplierId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name == null ? null : name.trim();
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

	    public String getNameEn() {
	        return nameEn;
	    }

	    public void setNameEn(String nameEn) {
	        this.nameEn = nameEn == null ? null : nameEn.trim();
	    }

	    public String getSupplierType() {
	        return supplierType;
	    }

	    public void setSupplierType(String supplierType) {
	        this.supplierType = supplierType;
	    }
}
