package com.sanlly.production.models.output.workgrouptype;

import java.util.Date;

/**
 * @author zhq
 * @date 2019/10/29
 * @description
 */
public class WorkGroupTypeOutput {

    private Integer prodWorkGroupTypeId;

    private String key;

    private String keyNameLang;

    public String getKeyNameLang() {
        return keyNameLang;
    }

    public void setKeyNameLang(String keyNameLang) {
        this.keyNameLang = keyNameLang;
    }

    private String workGroupName;

    private String workGroupNameEn;

    private Integer isValid;

    private Integer createUser;

    private Date createTime;

    private Integer updateUser;

    private Date updateTime;

    public Integer getProdWorkGroupTypeId() {
        return prodWorkGroupTypeId;
    }

    public void setProdWorkGroupTypeId(Integer prodWorkGroupTypeId) {
        this.prodWorkGroupTypeId = prodWorkGroupTypeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getWorkGroupName() {
        return workGroupName;
    }

    public void setWorkGroupName(String workGroupName) {
        this.workGroupName = workGroupName;
    }

    public String getWorkGroupNameEn() {
        return workGroupNameEn;
    }

    public void setWorkGroupNameEn(String workGroupNameEn) {
        this.workGroupNameEn = workGroupNameEn;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
