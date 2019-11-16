package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Charge {
    private Integer prodChargeId;

    private String prodChargeCode;

    private String course;

    private String containerNo;

    private String containerType;

    private String containerCategory;

    private String size;

    private String containerUser;

    private String yard;

    private Date courseTime;

    private String courseType;

    private String chargeType;

    private BigDecimal depositMoney;

    private BigDecimal receivedMoney;

    private BigDecimal shouldBackMoney;

    private BigDecimal actualBackMoney;

    private String paymentType;

    private String isBackSpread;

    private Integer chargeUser;

    private Date chargeTime;

    private String companyName;

    private String taxIdenNo;

    private String companyAddress;

    private String companyPhone;

    private String bankName;

    private String bankAccount;

    private String refundBankName;

    private String refundBankAccount;

    private String accountName;

    private String invoiceRemarks;

    private String signaturePic;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String chargeState;

    private String allinpayTrxid;

    private String payInvoice;

    public Integer getProdChargeId() {
        return prodChargeId;
    }

    public void setProdChargeId(Integer prodChargeId) {
        this.prodChargeId = prodChargeId;
    }

    public String getProdChargeCode() {
        return prodChargeCode;
    }

    public void setProdChargeCode(String prodChargeCode) {
        this.prodChargeCode = prodChargeCode == null ? null : prodChargeCode.trim();
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
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

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public Date getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Date courseTime) {
        this.courseTime = courseTime;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType == null ? null : courseType.trim();
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType == null ? null : chargeType.trim();
    }

    public BigDecimal getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(BigDecimal depositMoney) {
        this.depositMoney = depositMoney;
    }

    public BigDecimal getReceivedMoney() {
        return receivedMoney;
    }

    public void setReceivedMoney(BigDecimal receivedMoney) {
        this.receivedMoney = receivedMoney;
    }

    public BigDecimal getShouldBackMoney() {
        return shouldBackMoney;
    }

    public void setShouldBackMoney(BigDecimal shouldBackMoney) {
        this.shouldBackMoney = shouldBackMoney;
    }

    public BigDecimal getActualBackMoney() {
        return actualBackMoney;
    }

    public void setActualBackMoney(BigDecimal actualBackMoney) {
        this.actualBackMoney = actualBackMoney;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }

    public String getIsBackSpread() {
        return isBackSpread;
    }

    public void setIsBackSpread(String isBackSpread) {
        this.isBackSpread = isBackSpread == null ? null : isBackSpread.trim();
    }

    public Integer getChargeUser() {
        return chargeUser;
    }

    public void setChargeUser(Integer chargeUser) {
        this.chargeUser = chargeUser;
    }

    public Date getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(Date chargeTime) {
        this.chargeTime = chargeTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getTaxIdenNo() {
        return taxIdenNo;
    }

    public void setTaxIdenNo(String taxIdenNo) {
        this.taxIdenNo = taxIdenNo == null ? null : taxIdenNo.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone == null ? null : companyPhone.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getRefundBankName() {
        return refundBankName;
    }

    public void setRefundBankName(String refundBankName) {
        this.refundBankName = refundBankName == null ? null : refundBankName.trim();
    }

    public String getRefundBankAccount() {
        return refundBankAccount;
    }

    public void setRefundBankAccount(String refundBankAccount) {
        this.refundBankAccount = refundBankAccount == null ? null : refundBankAccount.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getInvoiceRemarks() {
        return invoiceRemarks;
    }

    public void setInvoiceRemarks(String invoiceRemarks) {
        this.invoiceRemarks = invoiceRemarks == null ? null : invoiceRemarks.trim();
    }

    public String getSignaturePic() {
        return signaturePic;
    }

    public void setSignaturePic(String signaturePic) {
        this.signaturePic = signaturePic == null ? null : signaturePic.trim();
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

    public String getChargeState() {
        return chargeState;
    }

    public void setChargeState(String chargeState) {
        this.chargeState = chargeState == null ? null : chargeState.trim();
    }

    public String getAllinpayTrxid() {
        return allinpayTrxid;
    }

    public void setAllinpayTrxid(String allinpayTrxid) {
        this.allinpayTrxid = allinpayTrxid == null ? null : allinpayTrxid.trim();
    }

    public String getPayInvoice() {
        return payInvoice;
    }

    public void setPayInvoice(String payInvoice) {
        this.payInvoice = payInvoice == null ? null : payInvoice.trim();
    }
}