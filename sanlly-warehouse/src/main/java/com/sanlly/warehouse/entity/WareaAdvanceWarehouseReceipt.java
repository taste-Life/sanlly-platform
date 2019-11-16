package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareaAdvanceWarehouseReceipt {
    private Integer wareAdvanceWarehouseReceiptId;

    private String advanceWarehouseReceiptNo;

    private String containerNo;

    private String no;

    private String stockoutNo;

    private String spareParts;

    private Double sparePartsNum;

    private Double receiveNum;

    private String warehouse;

    private String company;

    private Double borrowNum;

    private Double receiveMaterialNum;

    private String isDelay;

    private String stockoutStatus;

    private Double receivePieceNum;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareAdvanceWarehouseReceiptId() {
        return wareAdvanceWarehouseReceiptId;
    }

    public void setWareAdvanceWarehouseReceiptId(Integer wareAdvanceWarehouseReceiptId) {
        this.wareAdvanceWarehouseReceiptId = wareAdvanceWarehouseReceiptId;
    }

    public String getAdvanceWarehouseReceiptNo() {
        return advanceWarehouseReceiptNo;
    }

    public void setAdvanceWarehouseReceiptNo(String advanceWarehouseReceiptNo) {
        this.advanceWarehouseReceiptNo = advanceWarehouseReceiptNo == null ? null : advanceWarehouseReceiptNo.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getStockoutNo() {
        return stockoutNo;
    }

    public void setStockoutNo(String stockoutNo) {
        this.stockoutNo = stockoutNo == null ? null : stockoutNo.trim();
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public Double getSparePartsNum() {
        return sparePartsNum;
    }

    public void setSparePartsNum(Double sparePartsNum) {
        this.sparePartsNum = sparePartsNum;
    }

    public Double getReceiveNum() {
        return receiveNum;
    }

    public void setReceiveNum(Double receiveNum) {
        this.receiveNum = receiveNum;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public Double getBorrowNum() {
        return borrowNum;
    }

    public void setBorrowNum(Double borrowNum) {
        this.borrowNum = borrowNum;
    }

    public Double getReceiveMaterialNum() {
        return receiveMaterialNum;
    }

    public void setReceiveMaterialNum(Double receiveMaterialNum) {
        this.receiveMaterialNum = receiveMaterialNum;
    }

    public String getIsDelay() {
        return isDelay;
    }

    public void setIsDelay(String isDelay) {
        this.isDelay = isDelay == null ? null : isDelay.trim();
    }

    public String getStockoutStatus() {
        return stockoutStatus;
    }

    public void setStockoutStatus(String stockoutStatus) {
        this.stockoutStatus = stockoutStatus == null ? null : stockoutStatus.trim();
    }

    public Double getReceivePieceNum() {
        return receivePieceNum;
    }

    public void setReceivePieceNum(Double receivePieceNum) {
        this.receivePieceNum = receivePieceNum;
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