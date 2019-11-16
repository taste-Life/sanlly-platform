package com.sanlly.common.models.output.base;

import java.util.Date;

public class ContainerUserOutput {

	private Integer prodContainerUserId;

    private String key;

    private String containerUserCode;

    private String containerUserName;

    private String containerUserNameEn;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

	public Integer getIsValid() {
		return isValid;
	}

	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}

	public Integer getProdContainerUserId() {
		return prodContainerUserId;
	}

	public void setProdContainerUserId(Integer prodContainerUserId) {
		this.prodContainerUserId = prodContainerUserId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getContainerUserCode() {
		return containerUserCode;
	}

	public void setContainerUserCode(String containerUserCode) {
		this.containerUserCode = containerUserCode;
	}

	public String getContainerUserName() {
		return containerUserName;
	}

	public void setContainerUserName(String containerUserName) {
		this.containerUserName = containerUserName;
	}

	public String getContainerUserNameEn() {
		return containerUserNameEn;
	}

	public void setContainerUserNameEn(String containerUserNameEn) {
		this.containerUserNameEn = containerUserNameEn;
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
