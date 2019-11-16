package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareWasteWarehouse {
    private Integer wareWasteWarehouseId;

    private String no;

    private String containerNo;

    private Integer client;

    private Integer useContainerUser;

    private String returnYard;

    private String company;

    private String spareParts;

    private String sparePartsBatch;

    private String stockinType;

    private String stockinRemark;

    private Date stockinDate;

    private Double stockinNum;

    private BigDecimal oldPrice;

    private String disposeNo;

    private Double wasteDisposeNum;

    private Date wasteDisposeDate;

    private BigDecimal wasteDisposePrice;

    private Integer wasteUser;

    private String wasteRemark;

    private String wasteDisposeStatus;

    private String auditStatus;

    private String reasonsRejection;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareWasteWarehouseId() {
        return wareWasteWarehouseId;
    }

    public void setWareWasteWarehouseId(Integer wareWasteWarehouseId) {
        this.wareWasteWarehouseId = wareWasteWarehouseId;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public Integer getClient() {
        return client;
    }

    public void setClient(Integer client) {
        this.client = client;
    }

    public Integer getUseContainerUser() {
        return useContainerUser;
    }

    public void setUseContainerUser(Integer useContainerUser) {
        this.useContainerUser = useContainerUser;
    }

    public String getReturnYard() {
        return returnYard;
    }

    public void setReturnYard(String returnYard) {
        this.returnYard = returnYard == null ? null : returnYard.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
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

    public String getStockinType() {
        return stockinType;
    }

    public void setStockinType(String stockinType) {
        this.stockinType = stockinType == null ? null : stockinType.trim();
    }

    public String getStockinRemark() {
        return stockinRemark;
    }

    public void setStockinRemark(String stockinRemark) {
        this.stockinRemark = stockinRemark == null ? null : stockinRemark.trim();
    }

    public Date getStockinDate() {
        return stockinDate;
    }

    public void setStockinDate(Date stockinDate) {
        this.stockinDate = stockinDate;
    }

    public Double getStockinNum() {
        return stockinNum;
    }

    public void setStockinNum(Double stockinNum) {
        this.stockinNum = stockinNum;
    }

    public BigDecimal getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(BigDecimal oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getDisposeNo() {
        return disposeNo;
    }

    public void setDisposeNo(String disposeNo) {
        this.disposeNo = disposeNo == null ? null : disposeNo.trim();
    }

    public Double getWasteDisposeNum() {
        return wasteDisposeNum;
    }

    public void setWasteDisposeNum(Double wasteDisposeNum) {
        this.wasteDisposeNum = wasteDisposeNum;
    }

    public Date getWasteDisposeDate() {
        return wasteDisposeDate;
    }

    public void setWasteDisposeDate(Date wasteDisposeDate) {
        this.wasteDisposeDate = wasteDisposeDate;
    }

    public BigDecimal getWasteDisposePrice() {
        return wasteDisposePrice;
    }

    public void setWasteDisposePrice(BigDecimal wasteDisposePrice) {
        this.wasteDisposePrice = wasteDisposePrice;
    }

    public Integer getWasteUser() {
        return wasteUser;
    }

    public void setWasteUser(Integer wasteUser) {
        this.wasteUser = wasteUser;
    }

    public String getWasteRemark() {
        return wasteRemark;
    }

    public void setWasteRemark(String wasteRemark) {
        this.wasteRemark = wasteRemark == null ? null : wasteRemark.trim();
    }

    public String getWasteDisposeStatus() {
        return wasteDisposeStatus;
    }

    public void setWasteDisposeStatus(String wasteDisposeStatus) {
        this.wasteDisposeStatus = wasteDisposeStatus == null ? null : wasteDisposeStatus.trim();
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public String getReasonsRejection() {
        return reasonsRejection;
    }

    public void setReasonsRejection(String reasonsRejection) {
        this.reasonsRejection = reasonsRejection == null ? null : reasonsRejection.trim();
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