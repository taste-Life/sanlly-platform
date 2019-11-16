package com.sanlly.production.entity;

import java.util.Date;

public class GohContRequire {
    private Integer prodGohContRequireId;

    private String requireName;

    private Integer estimatedQuantity;

    private Double beamQuantity;

    private Double ropeQuantity;

    private Double knotQuantity;

    private Double beamDistance;

    private Double knotDistance;

    private Double aroundDistance;

    private String remarks;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String requireContent;

    public Integer getProdGohContRequireId() {
        return prodGohContRequireId;
    }

    public void setProdGohContRequireId(Integer prodGohContRequireId) {
        this.prodGohContRequireId = prodGohContRequireId;
    }

    public String getRequireName() {
        return requireName;
    }

    public void setRequireName(String requireName) {
        this.requireName = requireName == null ? null : requireName.trim();
    }

    public Integer getEstimatedQuantity() {
        return estimatedQuantity;
    }

    public void setEstimatedQuantity(Integer estimatedQuantity) {
        this.estimatedQuantity = estimatedQuantity;
    }

    public Double getBeamQuantity() {
        return beamQuantity;
    }

    public void setBeamQuantity(Double beamQuantity) {
        this.beamQuantity = beamQuantity;
    }

    public Double getRopeQuantity() {
        return ropeQuantity;
    }

    public void setRopeQuantity(Double ropeQuantity) {
        this.ropeQuantity = ropeQuantity;
    }

    public Double getKnotQuantity() {
        return knotQuantity;
    }

    public void setKnotQuantity(Double knotQuantity) {
        this.knotQuantity = knotQuantity;
    }

    public Double getBeamDistance() {
        return beamDistance;
    }

    public void setBeamDistance(Double beamDistance) {
        this.beamDistance = beamDistance;
    }

    public Double getKnotDistance() {
        return knotDistance;
    }

    public void setKnotDistance(Double knotDistance) {
        this.knotDistance = knotDistance;
    }

    public Double getAroundDistance() {
        return aroundDistance;
    }

    public void setAroundDistance(Double aroundDistance) {
        this.aroundDistance = aroundDistance;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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

    public String getRequireContent() {
        return requireContent;
    }

    public void setRequireContent(String requireContent) {
        this.requireContent = requireContent == null ? null : requireContent.trim();
    }
}