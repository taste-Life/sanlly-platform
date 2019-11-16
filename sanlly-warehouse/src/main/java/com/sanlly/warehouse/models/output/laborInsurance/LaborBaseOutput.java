package com.sanlly.warehouse.models.output.laborInsurance;
/**
 * ClassName: LaborBaseOutput
 * Description: 劳保基础类
 * date: 2019/8/01 17:51
 *
 * @author zhh
 */
import java.math.BigDecimal;

public class LaborBaseOutput {
	//备件号
	private String sparePartsNo;
	//备件名称
	private String sparePartsName;
    //劳保类别
    private String sparePartsCategoriesDetails;
    //国际化劳保类别key
    private String sparePartsCategoriesDetailsLangLang;
    //使用年限
    private Integer durableYears;
    //出库限制月份
    private String stockoutRestrictMonth;
    //是否耗材
    private String isConsumable;
    //国际化是否耗材
    private String isConsumableLangLang;
    //型号
    private String model;
    //单价
    private BigDecimal unitPrice;
    //参考价格
    private BigDecimal purchasingReferencePrice;
    //库存数量
    private Double actualSurplusNum;
    //备注
    private String remark;
    //所属仓库key
    private String warehouse;
    //国际化所属仓库key
    private String warehouseLangLang;
	public String getSparePartsNo() {
		return sparePartsNo;
	}
	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}
	public String getSparePartsCategoriesDetails() {
		return sparePartsCategoriesDetails;
	}
	public void setSparePartsCategoriesDetails(String sparePartsCategoriesDetails) {
		this.sparePartsCategoriesDetails = sparePartsCategoriesDetails;
	}
	public String getSparePartsCategoriesDetailsLangLang() {
		return sparePartsCategoriesDetailsLangLang;
	}
	public void setSparePartsCategoriesDetailsLangLang(String sparePartsCategoriesDetailsLangLang) {
		this.sparePartsCategoriesDetailsLangLang = sparePartsCategoriesDetailsLangLang;
	}
	public Integer getDurableYears() {
		return durableYears;
	}
	public void setDurableYears(Integer durableYears) {
		this.durableYears = durableYears;
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
	public String getIsConsumableLangLang() {
		return isConsumableLangLang;
	}
	public void setIsConsumableLangLang(String isConsumableLangLang) {
		this.isConsumableLangLang = isConsumableLangLang;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Double getActualSurplusNum() {
		return actualSurplusNum;
	}
	public void setActualSurplusNum(Double actualSurplusNum) {
		this.actualSurplusNum = actualSurplusNum;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getWarehouseLangLang() {
		return warehouseLangLang;
	}
	public void setWarehouseLangLang(String warehouseLangLang) {
		this.warehouseLangLang = warehouseLangLang;
	}
	public BigDecimal getPurchasingReferencePrice() {
		return purchasingReferencePrice;
	}
	public void setPurchasingReferencePrice(BigDecimal purchasingReferencePrice) {
		this.purchasingReferencePrice = purchasingReferencePrice;
	}
	public String getSparePartsName() {
		return sparePartsName;
	}
	public void setSparePartsName(String sparePartsName) {
		this.sparePartsName = sparePartsName;
	}
    
    
    
}
