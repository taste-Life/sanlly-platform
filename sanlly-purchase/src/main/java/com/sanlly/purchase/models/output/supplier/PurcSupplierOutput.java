package com.sanlly.purchase.models.output.supplier;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sanlly.purchase.entity.*;
import com.sanlly.purchase.models.input.supplier.SupplierCompanyInput;
import com.sanlly.purchase.models.output.supplierType.SupplierTypeBasicOutput;

import java.util.Date;
import java.util.List;

public class PurcSupplierOutput {
    //主键id
    private Integer purcSupplierId;
    //联系手机号
    private String mobilePhoneNum;
    //供应商名称
    private String name;
    //供应商英文名称
    private String nameEn;
    //币种
    private String currency;
    //币种
    private String currencyLangLang;
    //社会统一信用代码
    private String creditCode;
    //国家
    private String country;
    //城市
    private String city;
    //注册地址
    private String regAddress;
    //经营地址
    private String busniessAddress;
    //法人代表
    private String legalPerson;
    //服务内容及范围
    private String servicesContent;
    //企业性质
    private String natureId;
    private String natureIdLangLang;

    //注册资金
    private String registeredFunds;
    //成立时间
    @JsonFormat(pattern = "yyyy-MM-dd", locale = "zh", timezone = "GMT+8")
    private Date foundDate;
    //结算信用期
    private String settlementCycle;

    private String vendorCode;

    private String sapId;
    //供应商有效期
    private String periodSupplier;
    //结算类型
    private String settlementType;
    //是否黑名单
    private String isBlack;
    private String isBlackLangLang;
    //是否特殊关联企业
    private String isSpecial;
    private String isSpecialLangLang;
    //当前状态
    private  String currentStatus;
    private  String currentStatusLangLang;
    private  String status;
    private  String statusLangLang;
    //是否淘汰
    private String isEliminate;
    private String isEliminateLangLang;
    //是否单一来源供应商
    private String isSingleSupplier;
    private String isSingleSupplierLangLang;
    //采购类型
    private String procureType;
    private String procureTypeLangLang;
    //注册方式
    private String registrationMethod;
    private String registrationMethodLangLang;
    //供应商库类别
    private String storehouseType;
    private String storehouseTypeLangLang;
    //供应商等级
    private String grade;
    @JsonFormat(pattern = "yyyy-MM-dd", locale = "zh", timezone = "GMT+8")
    private Date createTime;

    private Integer createUser;
    @JsonFormat(pattern = "yyyy-MM-dd", locale = "zh", timezone = "GMT+8")
    private Date updateTime;

    private Integer updateUser;

    private String key;
    // 供应商名称国际化
    private String supplierLangLang;
    // 结算信用期国际化
    private String settlementCycleLangLang;
    // 评价等级国际化
    private String gradeLangLang;
    //结算类型国际化
    private String settlementTypeLangLang;
    private Integer userId;
    //是否物料供应商
    private String isMaterials;
    //是否物料供应商
    private String isMaterialsLangLang;
    //供应商类别
    private List<SupplierTypeBasicOutput> supplierType;
    //公司联系方式
    private List<CompanycontactInformation> companycontactInformations;
    //联系人列表
    private List<ContactInformation> contactInformations;
    //管理文件列表
    private List<Management> managements;
    //资质文件列表
    private List<QualificationDocuments> qualificationDocuments;
    //银行信息列表
    private List<BankInformation> bankInformations;
    //公司列表
    private List<SupplierCompanyInput> companys;

    // 审核状态
    private String auditStatus;
    private String auditStatusLangLang;
    // 审核流程id
    private String processInstanceId;

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getCurrentStatusLangLang() {
        return currentStatusLangLang;
    }

    public void setCurrentStatusLangLang(String currentStatusLangLang) {
        this.currentStatusLangLang = currentStatusLangLang;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusLangLang() {
        return statusLangLang;
    }

    public void setStatusLangLang(String statusLangLang) {
        this.statusLangLang = statusLangLang;
    }

    //供应材料
    private List<SpecialOutput> specials;

    public String getCurrencyLangLang() {
        return currencyLangLang;
    }

    public void setCurrencyLangLang(String currencyLangLang) {
        this.currencyLangLang = currencyLangLang;
    }

    public String getRegistrationMethodLangLang() {
        return registrationMethodLangLang;
    }

    public void setRegistrationMethodLangLang(String registrationMethodLangLang) {
        this.registrationMethodLangLang = registrationMethodLangLang;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getIsMaterials() {
        return isMaterials;
    }

    public void setIsMaterials(String isMaterials) {
        this.isMaterials = isMaterials;
    }

    public String getIsMaterialsLangLang() {
        return isMaterialsLangLang;
    }

    public void setIsMaterialsLangLang(String isMaterialsLangLang) {
        this.isMaterialsLangLang = isMaterialsLangLang;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNatureIdLangLang() {
        return natureIdLangLang;
    }

    public void setNatureIdLangLang(String natureIdLangLang) {
        this.natureIdLangLang = natureIdLangLang;
    }

    public String getProcureTypeLangLang() {
        return procureTypeLangLang;
    }

    public void setProcureTypeLangLang(String procureTypeLangLang) {
        this.procureTypeLangLang = procureTypeLangLang;
    }

    public String getStorehouseTypeLangLang() {
        return storehouseTypeLangLang;
    }

    public void setStorehouseTypeLangLang(String storehouseTypeLangLang) {
        this.storehouseTypeLangLang = storehouseTypeLangLang;
    }

    public String getIsBlack() {
        return isBlack;
    }

    public void setIsBlack(String isBlack) {
        this.isBlack = isBlack;
    }

    public String getIsBlackLangLang() {
        return isBlackLangLang;
    }

    public void setIsBlackLangLang(String isBlackLangLang) {
        this.isBlackLangLang = isBlackLangLang;
    }

    public String getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(String isSpecial) {
        this.isSpecial = isSpecial;
    }

    public String getIsSpecialLangLang() {
        return isSpecialLangLang;
    }

    public void setIsSpecialLangLang(String isSpecialLangLang) {
        this.isSpecialLangLang = isSpecialLangLang;
    }

    public String getIsEliminate() {
        return isEliminate;
    }

    public void setIsEliminate(String isEliminate) {
        this.isEliminate = isEliminate;
    }

    public String getIsEliminateLangLang() {
        return isEliminateLangLang;
    }

    public void setIsEliminateLangLang(String isEliminateLangLang) {
        this.isEliminateLangLang = isEliminateLangLang;
    }

    public String getIsSingleSupplier() {
        return isSingleSupplier;
    }

    public void setIsSingleSupplier(String isSingleSupplier) {
        this.isSingleSupplier = isSingleSupplier;
    }

    public String getIsSingleSupplierLangLang() {
        return isSingleSupplierLangLang;
    }

    public void setIsSingleSupplierLangLang(String isSingleSupplierLangLang) {
        this.isSingleSupplierLangLang = isSingleSupplierLangLang;
    }

    public List<SupplierCompanyInput> getCompanys() {
        return companys;
    }

    public void setCompanys(List<SupplierCompanyInput> companys) {
        this.companys = companys;
    }

    public List<SpecialOutput> getSpecials() {
        return specials;
    }

    public void setSpecials(List<SpecialOutput> specials) {
        this.specials = specials;
    }

    public String getSettlementTypeLangLang() {
        return settlementTypeLangLang;
    }

    public void setSettlementTypeLangLang(String settlementTypeLangLang) {
        this.settlementTypeLangLang = settlementTypeLangLang;
    }

    public String getAuditStatusLangLang() {
        return auditStatusLangLang;
    }

    public void setAuditStatusLangLang(String auditStatusLangLang) {
        this.auditStatusLangLang = auditStatusLangLang;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public List<SupplierTypeBasicOutput> getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(List<SupplierTypeBasicOutput> supplierType) {
        this.supplierType = supplierType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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
        this.mobilePhoneNum = mobilePhoneNum == null ? null : mobilePhoneNum.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode == null ? null : creditCode.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getRegAddress() {
        return regAddress;
    }

    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress == null ? null : regAddress.trim();
    }

    public String getBusniessAddress() {
        return busniessAddress;
    }

    public void setBusniessAddress(String busniessAddress) {
        this.busniessAddress = busniessAddress == null ? null : busniessAddress.trim();
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public String getServicesContent() {
        return servicesContent;
    }

    public void setServicesContent(String servicesContent) {
        this.servicesContent = servicesContent == null ? null : servicesContent.trim();
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
        this.registeredFunds = registeredFunds == null ? null : registeredFunds.trim();
    }

    public Date getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(Date foundDate) {
        this.foundDate = foundDate;
    }

    public String getSettlementCycle() {
        return settlementCycle;
    }

    public void setSettlementCycle(String settlementCycle) {
        this.settlementCycle = settlementCycle == null ? null : settlementCycle.trim();
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode == null ? null : vendorCode.trim();
    }

    public String getSapId() {
        return sapId;
    }

    public void setSapId(String sapId) {
        this.sapId = sapId == null ? null : sapId.trim();
    }

    public String getPeriodSupplier() {
        return periodSupplier;
    }

    public void setPeriodSupplier(String periodSupplier) {
        this.periodSupplier = periodSupplier == null ? null : periodSupplier.trim();
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType;
    }


    public String getProcureType() {
        return procureType;
    }

    public void setProcureType(String procureType) {
        this.procureType = procureType == null ? null : procureType.trim();
    }

    public String getRegistrationMethod() {
        return registrationMethod;
    }

    public void setRegistrationMethod(String registrationMethod) {
        this.registrationMethod = registrationMethod;
    }

    public String getStorehouseType() {
        return storehouseType;
    }

    public void setStorehouseType(String storehouseType) {
        this.storehouseType = storehouseType == null ? null : storehouseType.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public List<CompanycontactInformation> getCompanycontactInformations() {
        return companycontactInformations;
    }

    public void setCompanycontactInformations(List<CompanycontactInformation> companycontactInformations) {
        this.companycontactInformations = companycontactInformations;
    }

    public List<ContactInformation> getContactInformations() {
        return contactInformations;
    }

    public void setContactInformations(List<ContactInformation> contactInformations) {
        this.contactInformations = contactInformations;
    }

    public List<Management> getManagements() {
        return managements;
    }

    public void setManagements(List<Management> managements) {
        this.managements = managements;
    }

    public List<QualificationDocuments> getQualificationDocuments() {
        return qualificationDocuments;
    }

    public void setQualificationDocuments(List<QualificationDocuments> qualificationDocuments) {
        this.qualificationDocuments = qualificationDocuments;
    }

    public List<BankInformation> getBankInformations() {
        return bankInformations;
    }

    public void setBankInformations(List<BankInformation> bankInformations) {
        this.bankInformations = bankInformations;
    }

    public String getSupplierLangLang() {
        return supplierLangLang;
    }

    public void setSupplierLangLang(String supplierLangLang) {
        this.supplierLangLang = supplierLangLang;
    }

    public String getSettlementCycleLangLang() {
        return settlementCycleLangLang;
    }

    public void setSettlementCycleLangLang(String settlementCycleLangLang) {
        this.settlementCycleLangLang = settlementCycleLangLang;
    }

    public String getGradeLangLang() {
        return gradeLangLang;
    }

    public void setGradeLangLang(String gradeLangLang) {
        this.gradeLangLang = gradeLangLang;
    }


}
