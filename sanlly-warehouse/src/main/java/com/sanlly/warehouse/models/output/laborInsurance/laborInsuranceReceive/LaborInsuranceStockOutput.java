package com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceReceive;

public class LaborInsuranceStockOutput {
	    //劳保库存id
		private Integer wareLaborStockId;
		//备件key
		private String spareParts;
		//国际化备件key
		private String sparePartsLangLang;
		//备件号
		private String sparePartsNo;
        //备件名称
	    private String sparePartsName;
        //备件名称英文
	    private String sparePartsNameEn;
	    //劳保类别key
	    private String sparePartsCategoriesDetails;
	    //国际化劳保类别key
	    private String sparePartsCategoriesDetailsLangLang;
	    //劳保类别名称
	    private String sparepartsCategoriesDetailsName;
	    //使用年限
	    private Integer durableYears;
	    //出库限制月份
	    private String stockoutRestrictMonth;
	    //是否耗材
	    private String isConsumable;
	    
	    private String isConsumableLangLang;
	    //备注
	    private String remark;
	    //所属仓库key
	    private String warehouse;
	    //国际化所属仓库key
	    private String warehouseLangLang;
	    
		public Integer getWareLaborStockId() {
			return wareLaborStockId;
		}
		public void setWareLaborStockId(Integer wareLaborStockId) {
			this.wareLaborStockId = wareLaborStockId;
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
		public String getSparepartsCategoriesDetailsName() {
			return sparepartsCategoriesDetailsName;
		}
		public void setSparepartsCategoriesDetailsName(String sparepartsCategoriesDetailsName) {
			this.sparepartsCategoriesDetailsName = sparepartsCategoriesDetailsName;
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
		public String getIsConsumableLangLang() {
			return isConsumableLangLang;
		}
		public void setIsConsumableLangLang(String isConsumableLangLang) {
			this.isConsumableLangLang = isConsumableLangLang;
		}
		
		
	}
