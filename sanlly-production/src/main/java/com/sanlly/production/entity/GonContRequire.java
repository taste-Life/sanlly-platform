package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class GonContRequire {
    private Integer prodGonContRequireId;

    private String containerNo;

    private String containerType;

    private String structure;

    private String girder;

    private String rope;

    private String knot;

    private Double girderDistance;

    private Double knotDistance;

    private Double boardDistance;

    private Double contSkinWeight;

    private Double materialWeight;

    private String containerUser;

    private String restsRequire;

    private BigDecimal zyMoney;

    private BigDecimal companyMoney;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdGonContRequireId() {
        return prodGonContRequireId;
    }

    public void setProdGonContRequireId(Integer prodGonContRequireId) {
        this.prodGonContRequireId = prodGonContRequireId;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType == null ? null : containerType.trim();
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure == null ? null : structure.trim();
    }

    public String getGirder() {
        return girder;
    }

    public void setGirder(String girder) {
        this.girder = girder == null ? null : girder.trim();
    }

    public String getRope() {
        return rope;
    }

    public void setRope(String rope) {
        this.rope = rope == null ? null : rope.trim();
    }

    public String getKnot() {
        return knot;
    }

    public void setKnot(String knot) {
        this.knot = knot == null ? null : knot.trim();
    }

    public Double getGirderDistance() {
        return girderDistance;
    }

    public void setGirderDistance(Double girderDistance) {
        this.girderDistance = girderDistance;
    }

    public Double getKnotDistance() {
        return knotDistance;
    }

    public void setKnotDistance(Double knotDistance) {
        this.knotDistance = knotDistance;
    }

    public Double getBoardDistance() {
        return boardDistance;
    }

    public void setBoardDistance(Double boardDistance) {
        this.boardDistance = boardDistance;
    }

    public Double getContSkinWeight() {
        return contSkinWeight;
    }

    public void setContSkinWeight(Double contSkinWeight) {
        this.contSkinWeight = contSkinWeight;
    }

    public Double getMaterialWeight() {
        return materialWeight;
    }

    public void setMaterialWeight(Double materialWeight) {
        this.materialWeight = materialWeight;
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public String getRestsRequire() {
        return restsRequire;
    }

    public void setRestsRequire(String restsRequire) {
        this.restsRequire = restsRequire == null ? null : restsRequire.trim();
    }

    public BigDecimal getZyMoney() {
        return zyMoney;
    }

    public void setZyMoney(BigDecimal zyMoney) {
        this.zyMoney = zyMoney;
    }

    public BigDecimal getCompanyMoney() {
        return companyMoney;
    }

    public void setCompanyMoney(BigDecimal companyMoney) {
        this.companyMoney = companyMoney;
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