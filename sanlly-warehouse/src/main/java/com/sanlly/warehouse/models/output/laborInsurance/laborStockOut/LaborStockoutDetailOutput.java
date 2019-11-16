package com.sanlly.warehouse.models.output.laborInsurance.laborStockOut;

import java.math.BigDecimal;

/**
 * ClassName: LaborStockoutDetailOutput
 * Description: 劳保出库详细输出类
 * date: 2019/9/5 13:58
 *
 * @author zhh
 * @since JDK 1.8
 */
public class LaborStockoutDetailOutput {
	//明细id
	private Integer wareStockoutDetailLabaorId;
	//原单明细id;
	private Integer noDetailId;
	//出库单id
	private Integer labaorStockout;
	private String stockoutNo;
	//国际化默认仓库类型key
    private String defaultWarehouseTypeLangLang;
    //仓库类型key
    private String defaultWarehouseType;
    
    //国际化出库状态key
    private String stockoutStatusLangLang;
    //出库状态key
    private String stockoutStatus;
    //出库数量
    private Double stockoutNum;
    //备件批次
    private String sparePartsBatch;
    //备件号
    private String sparePartsNo;
    //备件名称
    private String sparePartsLangLang;
    //备件key
    private String spareParts;
    //库存数量
    private Double totalNum;
    //库位
    private String storageLocation;
    //型号
    private String model;
    //单价
    private BigDecimal unitPrice;
    //使用人id
    private Integer useUser;
    //使用人
    private String userName;
    //场站国际化
    private String yardLangLang;
    //场站
    private String yard;
    //出库日期
    private String stockoutDate;
    
    //已退库数量
    private Double returnedNum;
	public Integer getWareStockoutDetailLabaorId() {
		return wareStockoutDetailLabaorId;
	}
	public void setWareStockoutDetailLabaorId(Integer wareStockoutDetailLabaorId) {
		this.wareStockoutDetailLabaorId = wareStockoutDetailLabaorId;
	}
	public Integer getLabaorStockout() {
		return labaorStockout;
	}
	public void setLabaorStockout(Integer labaorStockout) {
		this.labaorStockout = labaorStockout;
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
	
	public String getStockoutStatusLangLang() {
		return stockoutStatusLangLang;
	}
	public void setStockoutStatusLangLang(String stockoutStatusLangLang) {
		this.stockoutStatusLangLang = stockoutStatusLangLang;
	}
	public String getStockoutStatus() {
		return stockoutStatus;
	}
	public void setStockoutStatus(String stockoutStatus) {
		this.stockoutStatus = stockoutStatus;
	}
	public Double getStockoutNum() {
		return stockoutNum;
	}
	public void setStockoutNum(Double stockoutNum) {
		this.stockoutNum = stockoutNum;
	}
	
	public String getSparePartsBatch() {
		return sparePartsBatch;
	}
	public void setSparePartsBatch(String sparePartsBatch) {
		this.sparePartsBatch = sparePartsBatch;
	}
	public String getSparePartsNo() {
		return sparePartsNo;
	}
	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}
	public String getSparePartsLangLang() {
		return sparePartsLangLang;
	}
	public void setSparePartsLangLang(String sparePartsLangLang) {
		this.sparePartsLangLang = sparePartsLangLang;
	}
	public String getSpareParts() {
		return spareParts;
	}
	public void setSpareParts(String spareParts) {
		this.spareParts = spareParts;
	}
	
	public Double getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(Double totalNum) {
		this.totalNum = totalNum;
	}
	public String getStorageLocation() {
		return storageLocation;
	}
	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public String getYardLangLang() {
		return yardLangLang;
	}
	public void setYardLangLang(String yardLangLang) {
		this.yardLangLang = yardLangLang;
	}
	public String getYard() {
		return yard;
	}
	public void setYard(String yard) {
		this.yard = yard;
	}
	public Integer getUseUser() {
		return useUser;
	}
	public void setUseUser(Integer useUser) {
		this.useUser = useUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getStockoutDate() {
		return stockoutDate;
	}
	public void setStockoutDate(String stockoutDate) {
		this.stockoutDate = stockoutDate;
	}
	public Double getReturnedNum() {
		return returnedNum;
	}
	public void setReturnedNum(Double returnedNum) {
		this.returnedNum = returnedNum;
	}
	public String getStockoutNo() {
		return stockoutNo;
	}
	public void setStockoutNo(String stockoutNo) {
		this.stockoutNo = stockoutNo;
	}
	public Integer getNoDetailId() {
		return noDetailId;
	}
	public void setNoDetailId(Integer noDetailId) {
		this.noDetailId = noDetailId;
	}
	
    
}
