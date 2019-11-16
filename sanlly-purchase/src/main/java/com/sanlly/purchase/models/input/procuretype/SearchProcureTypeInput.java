package com.sanlly.purchase.models.input.procuretype;

import java.util.Date;

import com.sanlly.common.models.input.PageInput;

public class SearchProcureTypeInput extends PageInput{
	//采购类型id
    private Integer purcProcureTypeId;
    //采购类型名称
    private String procureTypeName;
    
    private String procureTypeEn;
    //是否删除
    private Integer isDel;
    //创建时间
    private Date createTime;
    //创建人
    private Integer createUser;
    //修改时间
    private Date updateTime;
    //修改人
    private Integer updateUser;
    
    private String key;

    
    
    

	public SearchProcureTypeInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
		// TODO Auto-generated constructor stub
	}

	public Integer getPurcProcureTypeId() {
        return purcProcureTypeId;
    }

    public void setPurcProcureTypeId(Integer purcProcureTypeId) {
        this.purcProcureTypeId = purcProcureTypeId;
    }

    public String getProcureTypeName() {
        return procureTypeName;
    }

    public void setProcureTypeName(String procureTypeName) {
        this.procureTypeName = procureTypeName == null ? null : procureTypeName.trim();
    }

    public String getProcureTypeEn() {
        return procureTypeEn;
    }

    public void setProcureTypeEn(String procureTypeEn) {
        this.procureTypeEn = procureTypeEn == null ? null : procureTypeEn.trim();
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