package com.sanlly.warehouse.models.input.spareparts;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * ClassName: AddSparePartsInput
 * Description: 备件增加输入类
 * date: 2019/7/24 15:23
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("备件增加输入类")
public class AddSparePartsInput {

    @ApiModelProperty(value = "备件大类",name = "sparePartsCategories")
    private String sparePartsCategories;

    @ApiModelProperty(value = "备件明细类别",name = "sparePartsCategoriesDetails")
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

    @ApiModelProperty(value = "长度",name = "length")
    private Double length;

    @ApiModelProperty(value = "宽度",name = "width")
    private Double width;

    @ApiModelProperty(value = "材质",name = "texture")
    private String texture;
    private List<String> textureList;

    @ApiModelProperty(value = "备件单位",name = "sparePartsUnit")
    private String sparePartsUnit;

    @ApiModelProperty(value = "冷机生产厂商",name = "manufacture")
    private String manufacture;

    @ApiModelProperty(value = "适用机型",name = "applicableModels")
    private String applicableModels;
    private List<String> applicableModelsList;

    @ApiModelProperty(value = "ABC类型",name = "abc")
    private String abc;

    @ApiModelProperty(value = "是否合并领料",name = "isMergerAcquisition")
    private String isMergerAcquisition;

    @ApiModelProperty(value = "部件明细",name = "componentDetails")
    private String componentDetails;
    private List<String> componentDetailsList;

    @ApiModelProperty(value = "报价价格",name = "quotePrice")
    private BigDecimal quotePrice;

    @ApiModelProperty(value = "报价币种",name = "quoteCurrency")
    private String quoteCurrency;

    @ApiModelProperty(value = "成本价格",name = "costPrice")
    private BigDecimal costPrice;

    @ApiModelProperty(value = "参考价格",name = "referencePrice")
    private BigDecimal referencePrice;

    @ApiModelProperty(value = "是否需退件",name = "isSendBack")
    private String isSendBack;

    @ApiModelProperty(value = "默认仓库类型",name = "defaultWarehouseType")
    private String defaultWarehouseType;

    @ApiModelProperty(value = "用途",name = "purpose")
    private String purpose;

    @ApiModelProperty(value = "使用年限",name = "durableYears")
    private Integer durableYears;

    @ApiModelProperty(value = "采购模式",name = "purchasingPattern")
    private String purchasingPattern;

    @ApiModelProperty(value = "询价周期",name = "inquiryCycle")
    private String inquiryCycle;

    @ApiModelProperty(value = "参考价格",name = "purchasingReferencePrice")
    private BigDecimal purchasingReferencePrice;

    @ApiModelProperty(value = "上次入库价格",name = "lastEntryPrice")
    private BigDecimal lastEntryPrice;

    @ApiModelProperty(value = "是否需维修",name = "isMaintain")
    private String isMaintain;
    
    @ApiModelProperty(value = "出库限制月份",name = "isMstockoutRestrictMonthaintain")
    private String[] stockoutRestrictMonth;
    
    @ApiModelProperty(value = "是否耗材",name = "isConsumable")
    private String isConsumable;



    public String getApplicableModels() {
        return applicableModels;
    }

    public void setApplicableModels(String applicableModels) {
        this.applicableModels = applicableModels;
    }

    public List<String> getTextureList() {
        return textureList;
    }

    public void setTextureList(List<String> textureList) {
        this.textureList = textureList;
    }

    public List<String> getApplicableModelsList() {
        return applicableModelsList;
    }

    public void setApplicableModelsList(List<String> applicableModelsList) {
        this.applicableModelsList = applicableModelsList;
    }

    public List<String> getComponentDetailsList() {
        return componentDetailsList;
    }

    public void setComponentDetailsList(List<String> componentDetailsList) {
        this.componentDetailsList = componentDetailsList;
    }

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories;
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

    public String getSparePartsUnit() {
        return sparePartsUnit;
    }

    public void setSparePartsUnit(String sparePartsUnit) {
        this.sparePartsUnit = sparePartsUnit;
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

	public String[] getStockoutRestrictMonth() {
		return stockoutRestrictMonth;
	}

	public void setStockoutRestrictMonth(String[] stockoutRestrictMonth) {
		this.stockoutRestrictMonth = stockoutRestrictMonth;
	}

	public String getIsConsumable() {
		return isConsumable;
	}

	public void setIsConsumable(String isConsumable) {
		this.isConsumable = isConsumable;
	}
    
}
