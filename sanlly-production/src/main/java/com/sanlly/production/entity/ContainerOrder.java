package com.sanlly.production.entity;

import java.util.Date;

public class ContainerOrder {
    private Integer prodContainerOrderId;

    private String customerName;

    private String orderNo;

    private String month;

    private String chillerCompanyName;

    private Integer count;

    private Long unitPrice;

    private Double additionalWorkingHours;

    private Long additionalCharges;

    private Long orderPrice;

    private String testModem;

    private String installModem;

    private String testGps;

    private String installGps;

    private String state;

    private Date billDate;

    private Integer isFinished;

    private Long totalPrice;

    private String remark;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isDel;

    private String softwareversion;

    private String control;

    public Integer getProdContainerOrderId() {
        return prodContainerOrderId;
    }

    public void setProdContainerOrderId(Integer prodContainerOrderId) {
        this.prodContainerOrderId = prodContainerOrderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getChillerCompanyName() {
        return chillerCompanyName;
    }

    public void setChillerCompanyName(String chillerCompanyName) {
        this.chillerCompanyName = chillerCompanyName == null ? null : chillerCompanyName.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getAdditionalWorkingHours() {
        return additionalWorkingHours;
    }

    public void setAdditionalWorkingHours(Double additionalWorkingHours) {
        this.additionalWorkingHours = additionalWorkingHours;
    }

    public Long getAdditionalCharges() {
        return additionalCharges;
    }

    public void setAdditionalCharges(Long additionalCharges) {
        this.additionalCharges = additionalCharges;
    }

    public Long getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Long orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getTestModem() {
        return testModem;
    }

    public void setTestModem(String testModem) {
        this.testModem = testModem == null ? null : testModem.trim();
    }

    public String getInstallModem() {
        return installModem;
    }

    public void setInstallModem(String installModem) {
        this.installModem = installModem == null ? null : installModem.trim();
    }

    public String getTestGps() {
        return testGps;
    }

    public void setTestGps(String testGps) {
        this.testGps = testGps == null ? null : testGps.trim();
    }

    public String getInstallGps() {
        return installGps;
    }

    public void setInstallGps(String installGps) {
        this.installGps = installGps == null ? null : installGps.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Integer getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(Integer isFinished) {
        this.isFinished = isFinished;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getSoftwareversion() {
        return softwareversion;
    }

    public void setSoftwareversion(String softwareversion) {
        this.softwareversion = softwareversion == null ? null : softwareversion.trim();
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control == null ? null : control.trim();
    }
}