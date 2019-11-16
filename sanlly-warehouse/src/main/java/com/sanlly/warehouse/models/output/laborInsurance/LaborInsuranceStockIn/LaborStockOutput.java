package com.sanlly.warehouse.models.output.laborInsurance.LaborInsuranceStockIn;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName: LaborStockOutput
 * Description: 库存输出类
 * date: 2019/8/26 10:30
 *
 * @author zhh
 */
public class LaborStockOutput {
	private Integer wareLaborStockId;

    private String laborStockNo;

    private String no;

    private String company;
    private String companyLangLang;

    private String warehouseType;
    private String warehouseTypeLangLang;

    private String warehouse;
    private String warehouseLangLang;

    private String storageLocation;

    private String spareParts;
    
    private String sparePartsLangLang;
    
    private String sparePartsNo;
    
    private String sparePartsCategoriesDetails;
    private String sparePartsCategoriesDetailsLangLang;

    private String sparePartsCode;

    private String stockoutRestrictMonth;

    private Integer durableYears;

    private String isConsumable;
    private String isConsumableLangLang;

    private Double actualSurplusNum;
    
    private Double surplusNum;
    
    private String model;

    private BigDecimal unitPrice;

    private Date stockinDate;

    private String remark;
    private Double totalNum;
    //发票单价
    private BigDecimal invoicePrice;
    

	public Integer getWareLaborStockId() {
		return wareLaborStockId;
	}

	public void setWareLaborStockId(Integer wareLaborStockId) {
		this.wareLaborStockId = wareLaborStockId;
	}

	public String getLaborStockNo() {
		return laborStockNo;
	}

	public void setLaborStockNo(String laborStockNo) {
		this.laborStockNo = laborStockNo;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getWarehouseType() {
		return warehouseType;
	}

	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

	public String getSpareParts() {
		return spareParts;
	}

	public void setSpareParts(String spareParts) {
		this.spareParts = spareParts;
	}

	public String getSparePartsCode() {
		return sparePartsCode;
	}

	public void setSparePartsCode(String sparePartsCode) {
		this.sparePartsCode = sparePartsCode;
	}

	public String getStockoutRestrictMonth() {
		return stockoutRestrictMonth;
	}

	public void setStockoutRestrictMonth(String stockoutRestrictMonth) {
		this.stockoutRestrictMonth = stockoutRestrictMonth;
	}

	public Integer getDurableYears() {
		return durableYears;
	}

	public void setDurableYears(Integer durableYears) {
		this.durableYears = durableYears;
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

	public Double getActualSurplusNum() {
		return actualSurplusNum;
	}

	public void setActualSurplusNum(Double actualSurplusNum) {
		this.actualSurplusNum = actualSurplusNum;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Date getStockinDate() {
		return stockinDate;
	}

	public void setStockinDate(Date stockinDate) {
		this.stockinDate = stockinDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getWarehouseLangLang() {
		return warehouseLangLang;
	}

	public void setWarehouseLangLang(String warehouseLangLang) {
		this.warehouseLangLang = warehouseLangLang;
	}

	public String getSparePartsLangLang() {
		return sparePartsLangLang;
	}

	public void setSparePartsLangLang(String sparePartsLangLang) {
		this.sparePartsLangLang = sparePartsLangLang;
	}

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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompanyLangLang() {
		return companyLangLang;
	}

	public void setCompanyLangLang(String companyLangLang) {
		this.companyLangLang = companyLangLang;
	}

	public String getWarehouseTypeLangLang() {
		return warehouseTypeLangLang;
	}

	public void setWarehouseTypeLangLang(String warehouseTypeLangLang) {
		this.warehouseTypeLangLang = warehouseTypeLangLang;
	}

	public Double getSurplusNum() {
		return surplusNum;
	}

	public void setSurplusNum(Double surplusNum) {
		this.surplusNum = surplusNum;
	}

	public Double getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Double totalNum) {
		this.totalNum = totalNum;
	}

	public BigDecimal getInvoicePrice() {
		return invoicePrice;
	}

	public void setInvoicePrice(BigDecimal invoicePrice) {
		this.invoicePrice = invoicePrice;
	}   
    

}
