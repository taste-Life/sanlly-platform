package com.sanlly.purchase.models.input.supplier;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.purchase.entity.*;

import java.util.Date;
import java.util.List;

public class SearchPurcSupplierInput extends PageInput {
    //主键
    private Integer purcSupplierId;
    //手机号
    private String mobilePhoneNum;
    //供应商名称
    private String name;
    //供应商英文名称
    private String nameEn;
    //社会统一信用代码
    private String creditCode;
    //供应商类别
    private String supplierType;
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
    //服务内容
    private String servicesContent;
    //企业性质
    private String natureId;
    //注册资金
    private String registeredFunds;
    //成立日期
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
    //是否特殊关联企业
    private String isSpecial;
    //采购类型
    private String procureType;
    //注册方式
    private String registrationMethod;
    //供应商库类别
    private String storehouseType;
   //是否单一来源供应商
    private String isSingleSupplier;
    //供应商等级
    private String grade;
    //
    private String isEliminate;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String key;
    private  String auditStatus;

    public String getSettlementType() {
        return settlementType;
    }

    public String getIsBlack() {
        return isBlack;
    }

    public String getIsSpecial() {
        return isSpecial;
    }

    public String getRegistrationMethod() {
        return registrationMethod;
    }

    public String getIsSingleSupplier() {
        return isSingleSupplier;
    }

    public String getIsEliminate() {
        return isEliminate;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    //币种
    private String currency;
    //公司联系方式
    private List<CompanycontactInformation> companycontactInformations;
    //联系人列表
    private List<ContactInformation> contactInformation;
    //管理文件列表
    private List<Management> managements;
    //资质文件列表
    private List<QualificationDocuments> qualificationDocuments;
    //银行信息列表
    private List<BankInformation> bankInformations;

    public SearchPurcSupplierInput(Integer pageIndex, Integer pageSize) {
        super(pageIndex, pageSize);
    }


    public SearchPurcSupplierInput() {
        super();
        // TODO Auto-generated constructor stub
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

    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
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

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType == null ? null : supplierType.trim();
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

	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}

	public void setIsBlack(String isBlack) {
		this.isBlack = isBlack;
	}

	public void setIsSpecial(String isSpecial) {
		this.isSpecial = isSpecial;
	}

	public void setRegistrationMethod(String registrationMethod) {
		this.registrationMethod = registrationMethod;
	}

	public void setIsSingleSupplier(String isSingleSupplier) {
		this.isSingleSupplier = isSingleSupplier;
	}

	public void setIsEliminate(String isEliminate) {
		this.isEliminate = isEliminate;
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



    public String getProcureType() {
        return procureType;
    }

    public void setProcureType(String procureType) {
        this.procureType = procureType == null ? null : procureType.trim();
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


    public List<ContactInformation> getContactInformation() {
        return contactInformation;
    }


    public void setContactInformation(List<ContactInformation> contactInformation) {
        this.contactInformation = contactInformation;
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


}
