package com.sanlly.common.models.output.spare;


import java.math.BigDecimal;
import java.util.List;

/**
 * ClassName: SparePartsOutput
 * Description: 备件详细输出类
 * date: 2019/7/24 15:25
 *
 * @author wannt
 * @since JDK 1.8
 */
//@ApiModel("备件详细输出类")
public class SparePartsOutput {

//    @ApiModelProperty(value = "备件基础信息id",name = "wareSparePartsId")
    private Integer wareSparePartsId;

//    @ApiModelProperty(value = "key",name = "key")
    private String key;

//    @ApiModelProperty(value = "key",name = "keyLang")
    private String keyLangLang;

//    @ApiModelProperty(value = "备件大类",name = "sparePartsCategoriesLang")
    private String sparePartsCategoriesLangLang;

//    @ApiModelProperty(value = "备件大类",name = "sparePartsCategories")
    private String sparePartsCategories;

//    @ApiModelProperty(value = "备件明细类别",name = "sparePartsCategoriesDetailsLang")
    private String sparePartsCategoriesDetailsLangLang;

//    @ApiModelProperty(value = "备件明细类别",name = "sparePartsCategoriesDetails")
    private String sparePartsCategoriesDetails;

//    @ApiModelProperty(value = "备件号",name = "sparePartsNo")
    private String sparePartsNo;

//    @ApiModelProperty(value = "备件名称",name = "sparePartsName")
    private String sparePartsName;

//    @ApiModelProperty(value = "备件英文名称",name = "sparePartsNameEn")
    private String sparePartsNameEn;

//    @ApiModelProperty(value = "通用备件号",name = "sparePartsGeneralId")
    private String sparePartsGeneralId;

//    @ApiModelProperty(value = "备件规格",name = "sparePartsSpec")
    private String sparePartsSpec;

//    @ApiModelProperty(value = "型号",name = "model")
    private String model;

//    @ApiModelProperty(value = "是否可切割",name = "isIncise")
    private Integer isIncise;

//    @ApiModelProperty(value = "长度",name = "length")
    private Double length;

//    @ApiModelProperty(value = "宽度",name = "width")
    private Double width;

//    @ApiModelProperty(value = "备件单位",name = "sparePartsUnitLang")
    private String sparePartsUnitLangLang;

//    @ApiModelProperty(value = "备件单位",name = "sparePartsUnit")
    private String sparePartsUnit;

//    @ApiModelProperty(value = "生产厂商",name = "manufactureLang")
    private String manufactureLangLang;

//    @ApiModelProperty(value = "生产厂商",name = "manufacture")
    private String manufacture;

//    @ApiModelProperty(value = "ABC分类",name = "abc")
    private Integer abc;

//    @ApiModelProperty(value = "是否合并领料",name = "isMergerAcquisition")
    private Integer isMergerAcquisitionLangLang;

//    @ApiModelProperty(value = "是否合并领料",name = "isMergerAcquisition")
    private Integer isMergerAcquisition;

//    @ApiModelProperty(value = "部件明细",name = "componentDetailsLang")
    private String componentDetailsLangLang;

//    @ApiModelProperty(value = "部件明细",name = "componentDetails")
    private String componentDetails;

//    @ApiModelProperty(value = "报价价格",name = "quotePrice")
    private BigDecimal quotePrice;

//    @ApiModelProperty(value = "报价币种",name = "quoteCurrencyLang")
    private String quoteCurrencyLangLang;

//    @ApiModelProperty(value = "报价币种",name = "quoteCurrency")
    private String quoteCurrency;

//    @ApiModelProperty(value = "成本价格",name = "costPrice")
    private BigDecimal costPrice;

//    @ApiModelProperty(value = "参考价格",name = "referencePrice")
    private BigDecimal referencePrice;

//    @ApiModelProperty(value = "是否需退件",name = "isSendBack")
    private Integer isSendBack;

//    @ApiModelProperty(value = "是否需退件",name = "isSendBackLang")
    private Integer isSendBackLangLang;

//    @ApiModelProperty(value = "默认仓库类型",name = "defaultWarehouseTypeLang")
    private String defaultWarehouseTypeLangLang;

//    @ApiModelProperty(value = "默认仓库类型",name = "defaultWarehouseType")
    private String defaultWarehouseType;

//    @ApiModelProperty(value = "用途",name = "purpose")
    private String purpose;

//    @ApiModelProperty(value = "适用年限",name = "durableYears")
    private Integer durableYears;

//    @ApiModelProperty(value = "采购模式",name = "purchasingPattern")
    private String purchasingPattern;

//    @ApiModelProperty(value = "采购模式",name = "purchasingPatternLang")
    private String purchasingPatternLangLang;

//    @ApiModelProperty(value = "询价周期",name = "inquiryCycle")
    private Integer inquiryCycle;

//    @ApiModelProperty(value = "采购参考价格",name = "purchasingReferencePrice")
    private BigDecimal purchasingReferencePrice;

//    @ApiModelProperty(value = "上次入库价格",name = "lastEntryPrice")
    private BigDecimal lastEntryPrice;

//    @ApiModelProperty(value = "是否需维修",name = "isMaintain")
    private String isMaintain;

//    @ApiModelProperty(value = "是否需维修",name = "isMaintainLang")
    private String isMaintainLangLang;

//    @ApiModelProperty(value = "是否有效",name = "isValid")
    private String isValid;


//    @ApiModelProperty(value = "是否有效",name = "isValidLang")
    private String isValidLangLang;

//    @ApiModelProperty(value = "材质列表",name = "textureList")
    private List<String> textureList;

//    @ApiModelProperty(value = "适用机型列表",name = "unitList")
    private List<String> unitList;

//    @ApiModelProperty(value = "备件库存数量",name = "spareNum")
    private Double spareNum;
    
//    @ApiModelProperty(value = "出库限制月份",name = "stockoutRestrictMonth")
    private String stockoutRestrictMonth;
    
//    @ApiModelProperty(value = "是否耗材",name = "isConsumable")
    private String isConsumable;

    public Integer getWareSparePartsId() {
        return wareSparePartsId;
    }

    public void setWareSparePartsId(Integer wareSparePartsId) {
        this.wareSparePartsId = wareSparePartsId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKeyLangLang() {
        return keyLangLang;
    }

    public void setKeyLangLang(String keyLangLang) {
        this.keyLangLang = keyLangLang;
    }

    public String getSparePartsCategoriesLangLang() {
        return sparePartsCategoriesLangLang;
    }

    public void setSparePartsCategoriesLangLang(String sparePartsCategoriesLangLang) {
        this.sparePartsCategoriesLangLang = sparePartsCategoriesLangLang;
    }

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories;
    }

    public String getSparePartsCategoriesDetailsLangLang() {
        return sparePartsCategoriesDetailsLangLang;
    }

    public void setSparePartsCategoriesDetailsLangLang(String sparePartsCategoriesDetailsLangLang) {
        this.sparePartsCategoriesDetailsLangLang = sparePartsCategoriesDetailsLangLang;
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

    public Integer getIsIncise() {
        return isIncise;
    }

    public void setIsIncise(Integer isIncise) {
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

    public String getSparePartsUnitLangLang() {
        return sparePartsUnitLangLang;
    }

    public void setSparePartsUnitLangLang(String sparePartsUnitLangLang) {
        this.sparePartsUnitLangLang = sparePartsUnitLangLang;
    }

    public String getSparePartsUnit() {
        return sparePartsUnit;
    }

    public void setSparePartsUnit(String sparePartsUnit) {
        this.sparePartsUnit = sparePartsUnit;
    }

    public String getManufactureLangLang() {
        return manufactureLangLang;
    }

    public void setManufactureLangLang(String manufactureLangLang) {
        this.manufactureLangLang = manufactureLangLang;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public Integer getAbc() {
        return abc;
    }

    public void setAbc(Integer abc) {
        this.abc = abc;
    }

    public Integer getIsMergerAcquisitionLangLang() {
        return isMergerAcquisitionLangLang;
    }

    public void setIsMergerAcquisitionLangLang(Integer isMergerAcquisitionLangLang) {
        this.isMergerAcquisitionLangLang = isMergerAcquisitionLangLang;
    }

    public Integer getIsMergerAcquisition() {
        return isMergerAcquisition;
    }

    public void setIsMergerAcquisition(Integer isMergerAcquisition) {
        this.isMergerAcquisition = isMergerAcquisition;
    }

    public String getComponentDetailsLangLang() {
        return componentDetailsLangLang;
    }

    public void setComponentDetailsLangLang(String componentDetailsLangLang) {
        this.componentDetailsLangLang = componentDetailsLangLang;
    }

    public String getComponentDetails() {
        return componentDetails;
    }

    public void setComponentDetails(String componentDetails) {
        this.componentDetails = componentDetails;
    }

    public BigDecimal getQuotePrice() {
        return quotePrice;
    }

    public void setQuotePrice(BigDecimal quotePrice) {
        this.quotePrice = quotePrice;
    }

    public String getQuoteCurrencyLangLang() {
        return quoteCurrencyLangLang;
    }

    public void setQuoteCurrencyLangLang(String quoteCurrencyLangLang) {
        this.quoteCurrencyLangLang = quoteCurrencyLangLang;
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

    public Integer getIsSendBack() {
        return isSendBack;
    }

    public void setIsSendBack(Integer isSendBack) {
        this.isSendBack = isSendBack;
    }

    public Integer getIsSendBackLangLang() {
        return isSendBackLangLang;
    }

    public void setIsSendBackLangLang(Integer isSendBackLangLang) {
        this.isSendBackLangLang = isSendBackLangLang;
    }

    public String getDefaultWarehouseTypeLangLang() {
        return defaultWarehouseTypeLangLang;
    }

    public void setDefaultWarehouseTypeLangLang(String defaultWarehouseTypeLangLang) {
        this.defaultWarehouseTypeLangLang = defaultWarehouseTypeLangLang;
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

    public String getPurchasingPatternLangLang() {
        return purchasingPatternLangLang;
    }

    public void setPurchasingPatternLangLang(String purchasingPatternLangLang) {
        this.purchasingPatternLangLang = purchasingPatternLangLang;
    }

    public Integer getInquiryCycle() {
        return inquiryCycle;
    }

    public void setInquiryCycle(Integer inquiryCycle) {
        this.inquiryCycle = inquiryCycle;
    }

    public BigDecimal getPurchasingReferencePrice() {
        return purchasingReferencePrice;
    }

    public void setPurchasingReferencePrice(BigDecimal purchasingReferencePrice) {
        this.purchasingReferencePrice = purchasingReferencePrice;
    }

    public BigDecimal getLastEntryPrice() {
        return lastEntryPrice;
    }

    public void setLastEntryPrice(BigDecimal lastEntryPrice) {
        this.lastEntryPrice = lastEntryPrice;
    }

    public String getIsMaintain() {
        return isMaintain;
    }

    public void setIsMaintain(String isMaintain) {
        this.isMaintain = isMaintain;
    }

    public String getIsMaintainLangLang() {
        return isMaintainLangLang;
    }

    public void setIsMaintainLangLang(String isMaintainLangLang) {
        this.isMaintainLangLang = isMaintainLangLang;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getIsValidLangLang() {
        return isValidLangLang;
    }

    public void setIsValidLangLang(String isValidLangLang) {
        this.isValidLangLang = isValidLangLang;
    }

    public List<String> getTextureList() {
        return textureList;
    }

    public void setTextureList(List<String> textureList) {
        this.textureList = textureList;
    }

    public List<String> getUnitList() {
        return unitList;
    }

    public void setUnitList(List<String> unitList) {
        this.unitList = unitList;
    }

    public Double getSpareNum() {
        return spareNum;
    }

    public void setSpareNum(Double spareNum) {
        this.spareNum = spareNum;
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
    
}
