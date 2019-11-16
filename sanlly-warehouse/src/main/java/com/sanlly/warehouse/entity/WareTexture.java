package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareTexture {
    private Integer wareTextureId;

    private String key;

    private String textureNo;

    private String textureNameEn;

    private String textureName;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareTextureId() {
        return wareTextureId;
    }

    public void setWareTextureId(Integer wareTextureId) {
        this.wareTextureId = wareTextureId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getTextureNo() {
        return textureNo;
    }

    public void setTextureNo(String textureNo) {
        this.textureNo = textureNo == null ? null : textureNo.trim();
    }

    public String getTextureNameEn() {
        return textureNameEn;
    }

    public void setTextureNameEn(String textureNameEn) {
        this.textureNameEn = textureNameEn == null ? null : textureNameEn.trim();
    }

    public String getTextureName() {
        return textureName;
    }

    public void setTextureName(String textureName) {
        this.textureName = textureName == null ? null : textureName.trim();
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