package com.sanlly.warehouse.models.input.spareparts;

import java.math.BigDecimal;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * ClassName: ImportSparePartsInput
 * Description: 备件导入输入类
 * date: 2019/11/8 15:23
 *
 * @author zhh
 * @since JDK 1.8
 */
@ApiModel(value = "备件导入输入类")
public class ImportSparePartsInput {


    @ApiModelProperty(value = "备件大类",name = "sparePartsCategoriesName")
    private String sparePartsCategoriesName;
    private String sparePartsCategories;
    
    @ApiModelProperty(value = "备件明细类别",name = "sparePartsCategoriesDetailsName")
    private String sparePartsCategoriesDetailsName;
    private String sparePartsCategoriesDetails;
    
    @ApiModelProperty(value = "备件号",name = "sparePartsNo")
    private String sparePartsNo;

    @ApiModelProperty(value = "备件名",name = "sparePartsName")
    private String sparePartsName;

    @ApiModelProperty(value = "备件英文名",name = "sparePartsNameEn")
    private String sparePartsNameEn;

    @ApiModelProperty(value = "通用备件号",name = "sparePartsGeneralId")
    private String sparePartsGeneralId;

    @ApiModelProperty(value = "备件规格",name = "sparePartsSpec")
    private String sparePartsSpec;

    @ApiModelProperty(value = "型号",name = "model")
    private String model;

    @ApiModelProperty(value = "是否可切割",name = "isIncise")
    private String isIncise;
    private String isInciseStr;
    @ApiModelProperty(value = "长度",name = "length")
    private Double length;

    @ApiModelProperty(value = "宽度",name = "width")
    private Double width;

    @ApiModelProperty(value = "材质",name = "texture")
    private String texture;

    @ApiModelProperty(value = "备件单位",name = "sparePartsUnitName")
    private String sparePartsUnitName;
    private String sparePartsUnit;
    
    @ApiModelProperty(value = "冷机生产厂商",name = "manufactureName")
    private String manufactureName;
    private String manufacture;
    
    @ApiModelProperty(value = "ABC类型",name = "abc")
    private String abc;
    
    @ApiModelProperty(value = "是否合并领料",name = "isMergerAcquisition")
    private String isMergerAcquisition;
    private String isMergerAcquisitionStr;
    @ApiModelProperty(value = "部件明细",name = "componentDetails")
    private String componentDetails;

    @ApiModelProperty(value = "适用机型",name = "applicableModels")
    private String applicableModels;

    @ApiModelProperty(value = "报价价格",name = "quotePrice")
    private BigDecimal quotePrice;

    @ApiModelProperty(value = "报价币种",name = "quoteCurrency")
    private String quoteCurrency;
    private String quoteCurrencyStr;
    @ApiModelProperty(value = "成本价格",name = "costPrice")
    private BigDecimal costPrice;

    @ApiModelProperty(value = "参考价格",name = "referencePrice")
    private BigDecimal referencePrice;

    @ApiModelProperty(value = "是否需退件",name = "isSendBack")
    private String isSendBack;
    private String isSendBackStr;
    @ApiModelProperty(value = "默认仓库类型",name = "defaultWarehouseTypeName")
    private String defaultWarehouseTypeName;
    private String defaultWarehouseType;

    @ApiModelProperty(value = "用途",name = "purpose")
    private String purpose;

    @ApiModelProperty(value = "使用年限",name = "durableYears")
    private Integer durableYears;

    @ApiModelProperty(value = "采购模式",name = "purchasingPattern")
    private String purchasingPattern;
    private String purchasingPatternStr;
    @ApiModelProperty(value = "询价周期",name = "inquiryCycle")
    private String inquiryCycle;
    private String inquiryCycleStr;
    @ApiModelProperty(value = "采购参考价格",name = "purchasingReferencePrice")
    private BigDecimal purchasingReferencePrice;

    @ApiModelProperty(value = "出库限制月份",name = "stockoutRestrictMonth")
    private String stockoutRestrictMonth;
    
    @ApiModelProperty(value = "是否耗材",name = "isConsumable")
    private String isConsumable;
    private String isConsumableStr;
    @ApiModelProperty(value = "是否有效",name = "isValid")
    private String isValid;
    private String isValidStr;
	public String getSparePartsCategoriesName() {
		return sparePartsCategoriesName;
	}

	public void setSparePartsCategoriesName(String sparePartsCategoriesName) {
		this.sparePartsCategoriesName = sparePartsCategoriesName;
	}

	public String getSparePartsCategories() {
		return sparePartsCategories;
	}

	public void setSparePartsCategories(String sparePartsCategories) {
		this.sparePartsCategories = sparePartsCategories;
	}

	public String getSparePartsCategoriesDetailsName() {
		return sparePartsCategoriesDetailsName;
	}

	public void setSparePartsCategoriesDetailsName(String sparePartsCategoriesDetailsName) {
		this.sparePartsCategoriesDetailsName = sparePartsCategoriesDetailsName;
	}

	public String getSparePartsCategoriesDetails() {
		return sparePartsCategoriesDetails;
	}

	public void setSparePartsCategoriesDetails(String sparePartsCategoriesDetails) {
		this.sparePartsCategoriesDetails = sparePartsCategoriesDetails;
	}

	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}

	public String getSparePartsName() {
		return sparePartsName;
	}

	public void setSparePartsName(String sparePartsName) {
		this.sparePartsName = sparePartsName;
	}

	public String getSparePartsNameEn() {
		return sparePartsNameEn;
	}

	public void setSparePartsNameEn(String sparePartsNameEn) {
		this.sparePartsNameEn = sparePartsNameEn;
	}

	public String getSparePartsGeneralId() {
		return sparePartsGeneralId;
	}

	public void setSparePartsGeneralId(String sparePartsGeneralId) {
		this.sparePartsGeneralId = sparePartsGeneralId;
	}

	public String getSparePartsSpec() {
		return sparePartsSpec;
	}

	public void setSparePartsSpec(String sparePartsSpec) {
		this.sparePartsSpec = sparePartsSpec;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getIsIncise() {
		return isIncise;
	}

	public void setIsIncise(String isIncise) {
		this.isIncise = isIncise;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getSparePartsUnitName() {
		return sparePartsUnitName;
	}

	public void setSparePartsUnitName(String sparePartsUnitName) {
		this.sparePartsUnitName = sparePartsUnitName;
	}

	public String getSparePartsUnit() {
		return sparePartsUnit;
	}

	public void setSparePartsUnit(String sparePartsUnit) {
		this.sparePartsUnit = sparePartsUnit;
	}

	public String getManufactureName() {
		return manufactureName;
	}

	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getAbc() {
		return abc;
	}

	public void setAbc(String abc) {
		this.abc = abc;
	}

	public String getIsMergerAcquisition() {
		return isMergerAcquisition;
	}

	public void setIsMergerAcquisition(String isMergerAcquisition) {
		this.isMergerAcquisition = isMergerAcquisition;
	}

	public String getComponentDetails() {
		return componentDetails;
	}

	public void setComponentDetails(String componentDetails) {
		this.componentDetails = componentDetails;
	}

	public String getApplicableModels() {
		return applicableModels;
	}

	public void setApplicableModels(String applicableModels) {
		this.applicableModels = applicableModels;
	}

	public BigDecimal getQuotePrice() {
		return quotePrice;
	}

	public void setQuotePrice(BigDecimal quotePrice) {
		this.quotePrice = quotePrice;
	}

	public String getQuoteCurrency() {
		return quoteCurrency;
	}

	public void setQuoteCurrency(String quoteCurrency) {
		this.quoteCurrency = quoteCurrency;
	}

	public BigDecimal getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}

	public BigDecimal getReferencePrice() {
		return referencePrice;
	}

	public void setReferencePrice(BigDecimal referencePrice) {
		this.referencePrice = referencePrice;
	}

	public String getIsSendBack() {
		return isSendBack;
	}

	public void setIsSendBack(String isSendBack) {
		this.isSendBack = isSendBack;
	}

	public String getDefaultWarehouseTypeName() {
		return defaultWarehouseTypeName;
	}

	public void setDefaultWarehouseTypeName(String defaultWarehouseTypeName) {
		this.defaultWarehouseTypeName = defaultWarehouseTypeName;
	}

	public String getDefaultWarehouseType() {
		return defaultWarehouseType;
	}

	public void setDefaultWarehouseType(String defaultWarehouseType) {
		this.defaultWarehouseType = defaultWarehouseType;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Integer getDurableYears() {
		return durableYears;
	}

	public void setDurableYears(Integer durableYears) {
		this.durableYears = durableYears;
	}

	public String getPurchasingPattern() {
		return purchasingPattern;
	}

	public void setPurchasingPattern(String purchasingPattern) {
		this.purchasingPattern = purchasingPattern;
	}

	public String getInquiryCycle() {
		return inquiryCycle;
	}

	public void setInquiryCycle(String inquiryCycle) {
		this.inquiryCycle = inquiryCycle;
	}

	public BigDecimal getPurchasingReferencePrice() {
		return purchasingReferencePrice;
	}

	public void setPurchasingReferencePrice(BigDecimal purchasingReferencePrice) {
		this.purchasingReferencePrice = purchasingReferencePrice;
	}

	public String getStockoutRestrictMonth() {
		return stockoutRestrictMonth;
	}

	public void setStockoutRestrictMonth(String stockoutRestrictMonth) {
		this.stockoutRestrictMonth = stockoutRestrictMonth;
	}

	public String getIsConsumable() {
		return isConsumable;
	}

	public void setIsConsumable(String isConsumable) {
		this.isConsumable = isConsumable;
	}

	public String getIsValid() {
		return isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	public String getIsInciseStr() {
		return isInciseStr;
	}

	public void setIsInciseStr(String isInciseStr) {
		this.isInciseStr = isInciseStr;
	}

	public String getIsMergerAcquisitionStr() {
		return isMergerAcquisitionStr;
	}

	public void setIsMergerAcquisitionStr(String isMergerAcquisitionStr) {
		this.isMergerAcquisitionStr = isMergerAcquisitionStr;
	}

	public String getQuoteCurrencyStr() {
		return quoteCurrencyStr;
	}

	public void setQuoteCurrencyStr(String quoteCurrencyStr) {
		this.quoteCurrencyStr = quoteCurrencyStr;
	}

	public String getIsSendBackStr() {
		return isSendBackStr;
	}

	public void setIsSendBackStr(String isSendBackStr) {
		this.isSendBackStr = isSendBackStr;
	}

	public String getPurchasingPatternStr() {
		return purchasingPatternStr;
	}

	public void setPurchasingPatternStr(String purchasingPatternStr) {
		this.purchasingPatternStr = purchasingPatternStr;
	}

	public String getInquiryCycleStr() {
		return inquiryCycleStr;
	}

	public void setInquiryCycleStr(String inquiryCycleStr) {
		this.inquiryCycleStr = inquiryCycleStr;
	}

	public String getIsConsumableStr() {
		return isConsumableStr;
	}

	public void setIsConsumableStr(String isConsumableStr) {
		this.isConsumableStr = isConsumableStr;
	}

	public String getIsValidStr() {
		return isValidStr;
	}

	public void setIsValidStr(String isValidStr) {
		this.isValidStr = isValidStr;
	}

	
	
}
