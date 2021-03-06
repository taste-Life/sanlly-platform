package com.sanlly.common.models.output.base;

import java.util.Date;

public class ContainerTypeOutput {

	private Integer prodContainerTypeId;

    private String key;

    private String containerTypeName;

    private String containerTypeNameEn;

    private String containerCategory;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private  Integer isValid;

	public Integer getIsValid() {
		return isValid;
	}

	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}

	public Integer getProdContainerTypeId() {
		return prodContainerTypeId;
	}

	public void setProdContainerTypeId(Integer prodContainerTypeId) {
		this.prodContainerTypeId = prodContainerTypeId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getContainerTypeName() {
		return containerTypeName;
	}

	public void setContainerTypeName(String containerTypeName) {
		this.containerTypeName = containerTypeName;
	}

	public String getContainerTypeNameEn() {
		return containerTypeNameEn;
	}

	public void setContainerTypeNameEn(String containerTypeNameEn) {
		this.containerTypeNameEn = containerTypeNameEn;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
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
