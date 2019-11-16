package com.sanlly.purchase.models.output;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sanlly.purchase.models.output.suppliercenter.*;

import java.util.Date;
import java.util.List;

/**
 * Description: TODO
 *
 * @ClassName: SupplierBascialInfoOutput
 * @Version 1.0
 * @Author mqz
 */
public class SupplierBascialInfoOutput {
    //供应商名称
    private String name;
    //供应商英文名称
    private String nameEn;
    //社会信用代码
    private String creditCode;
    //企业性质
    private String natureId;
    //法人代表
    private String legalPerson;
    //国家
    private String country;
    //城市
    private String city;
    //注册地址
    private String regAddress;
    //注册地址
    private String busniessAddress;
    //服务内容
    private String servicesContent;
    //成立日期
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date foundDate;
    //注册资金
    private String registeredFunds;

    //信用周期
    private String settlementCycle;
    private String settlementCycleLangLang;
    //企业性质
    private String natureIdLangLang;
    //采购类型
    private String procureType;
    //采购类型
    private String procureTypeLangLang;
    //库类别
    private String storehouseType;
    //库类别
    private String storehouseTypeLangLang;
    //结算类型
    private String settlementType;
    private String isBlack;
    private String settlementTypeLangLang;
    //是否黑名单
    private String isBlackLangLang;

    List<SupplierContactPersonOutput> supplierContactOutputs;
    List<SupplierBankInfoOutput> supplierBankInfoOutputs;
    List<SupplierMatterTypeOutput> supplierMatterTypeOutputs;
    List<SupplierQualificationFileOutput> supplierQualificationFileOutputs;
    List<SupplierManageFileOutput> supplierManageFileOutputs;
    List<SupplierCompanyOutput> supplierCompanyOutputs;
    List<SupplierCenterTypeOutput> supplierCenterTypeOutputs;

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

    public String getSettlementTypeLangLang() {
        return settlementTypeLangLang;
    }

    public void setSettlementTypeLangLang(String settlementTypeLangLang) {
        this.settlementTypeLangLang = settlementTypeLangLang;
    }

    public String getIsBlackLangLang() {
        return isBlackLangLang;
    }

    public void setIsBlackLangLang(String isBlackLangLang) {
        this.isBlackLangLang = isBlackLangLang;
    }

    public String getStorehouseType() {
        return storehouseType;
    }

    public void setStorehouseType(String storehouseType) {
        this.storehouseType = storehouseType;
    }

    public String getStorehouseTypeLangLang() {
        return storehouseTypeLangLang;
    }

    public void setStorehouseTypeLangLang(String storehouseTypeLangLang) {
        this.storehouseTypeLangLang = storehouseTypeLangLang;
    }

    public String getProcureTypeLangLang() {
        return procureTypeLangLang;
    }

    public void setProcureTypeLangLang(String procureTypeLangLang) {
        this.procureTypeLangLang = procureTypeLangLang;
    }

    public String getProcureType() {
        return procureType;
    }

    public void setProcureType(String procureType) {
        this.procureType = procureType;
    }


    public String getNatureIdLangLang() {
        return natureIdLangLang;
    }

    public void setNatureIdLangLang(String natureIdLangLang) {
        this.natureIdLangLang = natureIdLangLang;
    }

    public String getSettlementCycleLangLang() {
        return settlementCycleLangLang;
    }

    public void setSettlementCycleLangLang(String settlementCycleLangLang) {
        this.settlementCycleLangLang = settlementCycleLangLang;
    }

    public String getSettlementCycle() {
        return settlementCycle;
    }

    public void setSettlementCycle(String settlementCycle) {
        this.settlementCycle = settlementCycle;
    }


    public List<SupplierCenterTypeOutput> getSupplierCenterTypeOutputs() {
        return supplierCenterTypeOutputs;
    }

    public void setSupplierCenterTypeOutputs(List<SupplierCenterTypeOutput> supplierCenterTypeOutputs) {
        this.supplierCenterTypeOutputs = supplierCenterTypeOutputs;
    }

    public List<SupplierCompanyOutput> getSupplierCompanyOutputs() {
        return supplierCompanyOutputs;
    }

    public void setSupplierCompanyOutputs(List<SupplierCompanyOutput> supplierCompanyOutputs) {
        this.supplierCompanyOutputs = supplierCompanyOutputs;
    }

    public List<SupplierQualificationFileOutput> getSupplierQualificationFileOutputs() {
        return supplierQualificationFileOutputs;
    }

    public void setSupplierQualificationFileOutputs(List<SupplierQualificationFileOutput> supplierQualificationFileOutputs) {
        this.supplierQualificationFileOutputs = supplierQualificationFileOutputs;
    }

    public List<SupplierManageFileOutput> getSupplierManageFileOutputs() {
        return supplierManageFileOutputs;
    }

    public void setSupplierManageFileOutputs(List<SupplierManageFileOutput> supplierManageFileOutputs) {
        this.supplierManageFileOutputs = supplierManageFileOutputs;
    }

    public List<SupplierMatterTypeOutput> getSupplierMatterTypeOutputs() {
        return supplierMatterTypeOutputs;
    }

    public void setSupplierMatterTypeOutputs(List<SupplierMatterTypeOutput> supplierMatterTypeOutputs) {
        this.supplierMatterTypeOutputs = supplierMatterTypeOutputs;
    }

    public List<SupplierBankInfoOutput> getSupplierBankInfoOutputs() {
        return supplierBankInfoOutputs;
    }

    public void setSupplierBankInfoOutputs(List<SupplierBankInfoOutput> supplierBankInfoOutputs) {
        this.supplierBankInfoOutputs = supplierBankInfoOutputs;
    }


    public List<SupplierContactPersonOutput> getSupplierContactOutputs() {
        return supplierContactOutputs;
    }

    public void setSupplierContactOutputs(List<SupplierContactPersonOutput> supplierContactOutputs) {
        this.supplierContactOutputs = supplierContactOutputs;
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

    public String getNatureId() {
        return natureId;
    }

    public void setNatureId(String natureId) {
        this.natureId = natureId;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
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

    public String getServicesContent() {
        return servicesContent;
    }

    public void setServicesContent(String servicesContent) {
        this.servicesContent = servicesContent;
    }

    public Date getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(Date foundDate) {
        this.foundDate = foundDate;
    }

    public String getRegisteredFunds() {
        return registeredFunds;
    }

    public void setRegisteredFunds(String registeredFunds) {
        this.registeredFunds = registeredFunds;
    }

}
