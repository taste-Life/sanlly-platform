package com.sanlly.purchase.models.input.supplier;

/**
 * @Description: 批量导入供应商
 * @ClassName: ImportSupplierInput
 * @Date: 2019/10/18 13:03
 * @Version 1.0
 * @Author mqz
 */
public class ImportSupplierInput {
    //主键id
    private Integer purcSupplierId;
    //联系手机号
    private String mobilePhoneNum;
    //中文名称
    private String name;
    //英文名称
    private String nameEn;
    //社会信用代码
    private String creditCode;
    //国家
    private String country;
    //城市
    private String city;
    //注册地址
    private String regAddress;
    //经营地址
    private String busniessAddress;
    //法人
    private String legalPerson;
    //服务范围
    private String servicesContent;
    //企业性质
    private String natureId;
    //注册资金
    private String registeredFunds;
    //成立日期
    private String foundDate;
    //结算信用期
    private String settlementCycle;
    //供应商代码
    private String vendorCode;
    private String sapId;
    //供应商有效期
    private String periodSupplier;
    //结算类型
    private String settlementType;
    //是否黑名单
    private String isBlack;
    //是否特殊关联企业
    private String isSpecial;
    //采购类型
    private String procureType;
    //注册方式
    private Integer registrationMethod;
    //库类别
    private String storehouseType;
    //是否单一来源
    private String isSingleSupplier;
    //供应商等级
    private String grade;
    //是否淘汰
    private String isEliminate;
    //币种
    private String currency;
    //开户行
    private String openBank;
    //账号
    private String cardNo;
    //收款账号说明
    private String accountDesc;

    //联系人
    private String contactPerson;
    //公司电话
    private String companyPhone;
    //移动电话
    private String mobilePhone;
    //邮件
    private String emailAddress;
    //其他联系方式
    private String contactOther;
    //供应公司名称
    private String supplierCompany;
    //供应商类别
    private String supplierType;
    //备件大类
    private String firstSpecial;
    //备件明细类别
    private String secondSpecial;

    public String getFirstSpecial() {
        return firstSpecial;
    }

    public void setFirstSpecial(String firstSpecial) {
        this.firstSpecial = firstSpecial;
    }

    public String getSecondSpecial() {
        return secondSpecial;
    }

    public void setSecondSpecial(String secondSpecial) {
        this.secondSpecial = secondSpecial;
    }

    public String getSupplierCompany() {
        return supplierCompany;
    }

    public void setSupplierCompany(String supplierCompany) {
        this.supplierCompany = supplierCompany;
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }

    public String getOpenBank() {
        return openBank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getAccountDesc() {
        return accountDesc;
    }

    public void setAccountDesc(String accountDesc) {
        this.accountDesc = accountDesc;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactOther() {
        return contactOther;
    }

    public void setContactOther(String contactOther) {
        this.contactOther = contactOther;
    }

    public Integer getPurcSupplierId() {
        return purcSupplierId;
    }

    public void setPurcSupplierId(Integer purcSupplierId) {
        this.purcSupplierId = purcSupplierId;
    }

    public String getMobilePhoneNum() {
        return mobilePhoneNum;
    }

    public void setMobilePhoneNum(String mobilePhoneNum) {
        this.mobilePhoneNum = mobilePhoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegAddress() {
        return regAddress;
    }

    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress;
    }

    public String getBusniessAddress() {
        return busniessAddress;
    }

    public void setBusniessAddress(String busniessAddress) {
        this.busniessAddress = busniessAddress;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getServicesContent() {
        return servicesContent;
    }

    public void setServicesContent(String servicesContent) {
        this.servicesContent = servicesContent;
    }

    public String getNatureId() {
        return natureId;
    }

    public void setNatureId(String natureId) {
        this.natureId = natureId;
    }

    public String getRegisteredFunds() {
        return registeredFunds;
    }

    public void setRegisteredFunds(String registeredFunds) {
        this.registeredFunds = registeredFunds;
    }

    public String getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(String foundDate) {
        this.foundDate = foundDate;
    }

    public String getSettlementCycle() {
        return settlementCycle;
    }

    public void setSettlementCycle(String settlementCycle) {
        this.settlementCycle = settlementCycle;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getSapId() {
        return sapId;
    }

    public void setSapId(String sapId) {
        this.sapId = sapId;
    }

    public String getPeriodSupplier() {
        return periodSupplier;
    }

    public void setPeriodSupplier(String periodSupplier) {
        this.periodSupplier = periodSupplier;
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType;
    }

    public String getIsBlack() {
        return isBlack;
    }

    public void setIsBlack(String isBlack) {
        this.isBlack = isBlack;
    }


    public String getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(String isSpecial) {
        this.isSpecial = isSpecial;
    }


    public String getProcureType() {
        return procureType;
    }

    public void setProcureType(String procureType) {
        this.procureType = procureType;
    }

    public Integer getRegistrationMethod() {
        return registrationMethod;
    }

    public void setRegistrationMethod(Integer registrationMethod) {
        this.registrationMethod = registrationMethod;
    }

    public String getStorehouseType() {
        return storehouseType;
    }

    public void setStorehouseType(String storehouseType) {
        this.storehouseType = storehouseType;
    }

    public String getIsSingleSupplier() {
        return isSingleSupplier;
    }

    public void setIsSingleSupplier(String isSingleSupplier) {
        this.isSingleSupplier = isSingleSupplier;
    }

    public String getIsEliminate() {
        return isEliminate;
    }

    public void setIsEliminate(String isEliminate) {
        this.isEliminate = isEliminate;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
