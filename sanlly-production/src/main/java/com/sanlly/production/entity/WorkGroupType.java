package com.sanlly.production.entity;

import java.util.Date;

/**
 * @author zhq
 * @date 2019/10/24
 * @description 工作组类别表
 */
public class WorkGroupType {
    private Integer prodWorkGroupTypeId;

    private String key;

    private String workGroupName;

    private String workGroupNameEn;

    private Integer isValid;

    private Integer isDel;

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
        this.key = key == null ? null : key.trim();
    }

    public String getWorkGroupName() {
        return workGroupName;
    }

    public void setWorkGroupName(String workGroupName) {
        this.workGroupName = workGroupName == null ? null : workGroupName.trim();
    }

    public String getWorkGroupNameEn() {
        return workGroupNameEn;
    }

    public void setWorkGroupNameEn(String workGroupNameEn) {
        this.workGroupNameEn = workGroupNameEn == null ? null : workGroupNameEn.trim();
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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