package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BorrowLendDetail {
    private Integer wareBorrowSlipDetailId;

    private Integer wareBorrowLendSlip;

    private String spareParts;

    private String sparePartsBatch;

    private String stockinSpareParts;

    private String stockinSparePartsName;

    private String escrowCompany;

    private String inWarehouseType;

    private String outWarehouseType;

    private String outStorageLocation;

    private String inStorageLocation;

    private Double borrowNum;

    private Double repayNum;

    private Double returnNum;

    private BigDecimal borrowPrice;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareBorrowSlipDetailId() {
        return wareBorrowSlipDetailId;
    }

    public void setWareBorrowSlipDetailId(Integer wareBorrowSlipDetailId) {
        this.wareBorrowSlipDetailId = wareBorrowSlipDetailId;
    }

    public Integer getWareBorrowLendSlip() {
        return wareBorrowLendSlip;
    }

    public void setWareBorrowLendSlip(Integer wareBorrowLendSlip) {
        this.wareBorrowLendSlip = wareBorrowLendSlip;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public String getSparePartsBatch() {
        return sparePartsBatch;
    }

    public void setSparePartsBatch(String sparePartsBatch) {
        this.sparePartsBatch = sparePartsBatch == null ? null : sparePartsBatch.trim();
    }

    public String getStockinSpareParts() {
        return stockinSpareParts;
    }

    public void setStockinSpareParts(String stockinSpareParts) {
        this.stockinSpareParts = stockinSpareParts == null ? null : stockinSpareParts.trim();
    }

    public String getStockinSparePartsName() {
        return stockinSparePartsName;
    }

    public void setStockinSparePartsName(String stockinSparePartsName) {
        this.stockinSparePartsName = stockinSparePartsName == null ? null : stockinSparePartsName.trim();
    }

    public String getEscrowCompany() {
        return escrowCompany;
    }

    public void setEscrowCompany(String escrowCompany) {
        this.escrowCompany = escrowCompany == null ? null : escrowCompany.trim();
    }

    public String getInWarehouseType() {
        return inWarehouseType;
    }

    public void setInWarehouseType(String inWarehouseType) {
        this.inWarehouseType = inWarehouseType == null ? null : inWarehouseType.trim();
    }

    public String getOutWarehouseType() {
        return outWarehouseType;
    }

    public void setOutWarehouseType(String outWarehouseType) {
        this.outWarehouseType = outWarehouseType == null ? null : outWarehouseType.trim();
    }

    public String getOutStorageLocation() {
        return outStorageLocation;
    }

    public void setOutStorageLocation(String outStorageLocation) {
        this.outStorageLocation = outStorageLocation == null ? null : outStorageLocation.trim();
    }

    public String getInStorageLocation() {
        return inStorageLocation;
    }

    public void setInStorageLocation(String inStorageLocation) {
        this.inStorageLocation = inStorageLocation == null ? null : inStorageLocation.trim();
    }

    public Double getBorrowNum() {
        return borrowNum;
    }

    public void setBorrowNum(Double borrowNum) {
        this.borrowNum = borrowNum;
    }

    public Double getRepayNum() {
        return repayNum;
    }

    public void setRepayNum(Double repayNum) {
        this.repayNum = repayNum;
    }

    public Double getReturnNum() {
        return returnNum;
    }

    public void setReturnNum(Double returnNum) {
        this.returnNum = returnNum;
    }

    public BigDecimal getBorrowPrice() {
        return borrowPrice;
    }

    public void setBorrowPrice(BigDecimal borrowPrice) {
        this.borrowPrice = borrowPrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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