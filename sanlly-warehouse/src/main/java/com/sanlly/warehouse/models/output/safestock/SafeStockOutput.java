package com.sanlly.warehouse.models.output.safestock;

public class SafeStockOutput {
    private Integer wareSafeStockId;
    private String warehouse;
    private String warehouseLangLang;

    private String spareParts;
    private String sparePartsLangLang;

    private Double safeStockNum;

    private Double stockUpperNum;
    
    private String sparePartsCategoriesLangLang;

    private String sparePartsCategoriesDetailsLangLang;
    
    private String sparePartsNo;

	public Integer getWareSafeStockId() {
		return wareSafeStockId;
	}

	public void setWareSafeStockId(Integer wareSafeStockId) {
		this.wareSafeStockId = wareSafeStockId;
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

	public String getSpareParts() {
		return spareParts;
	}

	public void setSpareParts(String spareParts) {
		this.spareParts = spareParts;
	}

	public String getSparePartsLangLang() {
		return sparePartsLangLang;
	}

	public void setSparePartsLangLang(String sparePartsLangLang) {
		this.sparePartsLangLang = sparePartsLangLang;
	}

	public Double getSafeStockNum() {
		return safeStockNum;
	}

	public void setSafeStockNum(Double safeStockNum) {
		this.safeStockNum = safeStockNum;
	}

	public Double getStockUpperNum() {
		return stockUpperNum;
	}

	public void setStockUpperNum(Double stockUpperNum) {
		this.stockUpperNum = stockUpperNum;
	}

	public String getSparePartsCategoriesLangLang() {
		return sparePartsCategoriesLangLang;
	}

	public void setSparePartsCategoriesLangLang(String sparePartsCategoriesLangLang) {
		this.sparePartsCategoriesLangLang = sparePartsCategoriesLangLang;
	}

	public String getSparePartsCategoriesDetailsLangLang() {
		return sparePartsCategoriesDetailsLangLang;
	}

	public void setSparePartsCategoriesDetailsLangLang(String sparePartsCategoriesDetailsLangLang) {
		this.sparePartsCategoriesDetailsLangLang = sparePartsCategoriesDetailsLangLang;
	}

	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}

    
}
