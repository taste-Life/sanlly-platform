package com.sanlly.purchase.models.output.StorehouseType;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StorehouseTypeOutput {
	private Integer purcStorehouseTypeId;

    private String storehouseTypeName;

    private String storehouseTypeEn;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date createTime;

    private Integer createUser;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date updateTime;

    private Integer updateUser;
    
    private String updateUserName;

    private String key;
    
    private String keyNameLang;

    public Integer getPurcStorehouseTypeId() {
        return purcStorehouseTypeId;
    }

    public void setPurcStorehouseTypeId(Integer purcStorehouseTypeId) {
        this.purcStorehouseTypeId = purcStorehouseTypeId;
    }

    public String getStorehouseTypeName() {
        return storehouseTypeName;
    }

    public void setStorehouseTypeName(String storehouseTypeName) {
        this.storehouseTypeName = storehouseTypeName == null ? null : storehouseTypeName.trim();
    }

    public String getStorehouseTypeEn() {
        return storehouseTypeEn;
    }

    public void setStorehouseTypeEn(String storehouseTypeEn) {
        this.storehouseTypeEn = storehouseTypeEn == null ? null : storehouseTypeEn.trim();
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

	public String getKeyNameLang() {
		return keyNameLang;
	}

	public void setKeyNameLang(String keyNameLang) {
		this.keyNameLang = keyNameLang;
	}

	public String getUpdateUserName() {
		return updateUserName;
	}

	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}
    
    
}
