package com.sanlly.production.entity;

import java.util.Date;

public class EdiFile {
    private Integer editFileId;

    private String editFileFormat;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getEditFileId() {
        return editFileId;
    }

    public void setEditFileId(Integer editFileId) {
        this.editFileId = editFileId;
    }

    public String getEditFileFormat() {
        return editFileFormat;
    }

    public void setEditFileFormat(String editFileFormat) {
        this.editFileFormat = editFileFormat == null ? null : editFileFormat.trim();
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