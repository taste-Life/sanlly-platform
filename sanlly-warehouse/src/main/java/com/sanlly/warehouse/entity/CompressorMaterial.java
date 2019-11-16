package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CompressorMaterial {
    private Integer wareCompressorMaterialId;

    private String compressor;

    private String material;

    private BigDecimal repairOffer;

    private String descripZh;

    private String warehouse;

    private String warehouseType;

    private String repairWay;

    private String descripEn;

    private String type;

    private String isValid;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private BigDecimal cost;

    private String materialNo;

    private String compressorNo;

    public Integer getWareCompressorMaterialId() {
        return wareCompressorMaterialId;
    }

    public void setWareCompressorMaterialId(Integer wareCompressorMaterialId) {
        this.wareCompressorMaterialId = wareCompressorMaterialId;
    }

    public String getCompressor() {
        return compressor;
    }

    public void setCompressor(String compressor) {
        this.compressor = compressor == null ? null : compressor.trim();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    public BigDecimal getRepairOffer() {
        return repairOffer;
    }

    public void setRepairOffer(BigDecimal repairOffer) {
        this.repairOffer = repairOffer;
    }

    public String getDescripZh() {
        return descripZh;
    }

    public void setDescripZh(String descripZh) {
        this.descripZh = descripZh == null ? null : descripZh.trim();
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType == null ? null : warehouseType.trim();
    }

    public String getRepairWay() {
        return repairWay;
    }

    public void setRepairWay(String repairWay) {
        this.repairWay = repairWay == null ? null : repairWay.trim();
    }

    public String getDescripEn() {
        return descripEn;
    }

    public void setDescripEn(String descripEn) {
        this.descripEn = descripEn == null ? null : descripEn.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
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

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getMaterialNo() {
        return materialNo;
    }

    public void setMaterialNo(String materialNo) {
        this.materialNo = materialNo == null ? null : materialNo.trim();
    }

    public String getCompressorNo() {
        return compressorNo;
    }

    public void setCompressorNo(String compressorNo) {
        this.compressorNo = compressorNo == null ? null : compressorNo.trim();
    }
}