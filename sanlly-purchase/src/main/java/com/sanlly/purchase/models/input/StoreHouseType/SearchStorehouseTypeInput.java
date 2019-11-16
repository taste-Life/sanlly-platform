package com.sanlly.purchase.models.input.StoreHouseType;

import com.sanlly.common.models.input.PageInput;

import java.util.Date;

public class SearchStorehouseTypeInput extends PageInput{
	private Integer purcStorehouseTypeid;

    private String storehouseTypeName;

    private String storehouseTypeEn;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String key;
    
    private String keyNameLang;
    
    public SearchStorehouseTypeInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
	}
    
    public Integer getPurcStorehouseTypeid() {
        return purcStorehouseTypeid;
    }

    public void setPurcStorehouseTypeid(Integer purcStorehouseTypeid) {
        this.purcStorehouseTypeid = purcStorehouseTypeid;
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
    
}
