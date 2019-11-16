package com.sanlly.warehouse.models.output.laborInsurance.laborReturnStock;
/**
 * ClassName: LaborReturnStockDetailOutput
 * Description: 退库单明细输出类
 * date: 2019/9/17 10:38
 *
 * @author zhh
 * 
 */
public class LaborReturnStockDetailOutput {
	private Integer wareStockoutDetailLabaorId;
	
	private Integer stockoutDetailId;
	
	private Integer returnId;
	
	private String stockoutNo;
	
	private String spareParts;
	
	private String sparePartsNo;
	
	private String sparePartsNameLang;
	
	private String model;

    private Double returnNum;
    
    private String returnDate;
    
    private String sparePartsBatch;
    //已退库数量
    private Double returnedNum;
    
    private Double StockoutNum;

	public String getSpareParts() {
		return spareParts;
	}

	public void setSpareParts(String spareParts) {
		this.spareParts = spareParts;
	}

	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}

	public String getSparePartsNameLang() {
		return sparePartsNameLang;
	}

	public void setSparePartsNameLang(String sparePartsNameLang) {
		this.sparePartsNameLang = sparePartsNameLang;
	}

	public Double getReturnNum() {
		return returnNum;
	}

	public void setReturnNum(Double returnNum) {
		this.returnNum = returnNum;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public String getSparePartsBatch() {
		return sparePartsBatch;
	}

	public void setSparePartsBatch(String sparePartsBatch) {
		this.sparePartsBatch = sparePartsBatch;
	}

	public Double getReturnedNum() {
		return returnedNum;
	}

	public void setReturnedNum(Double returnedNum) {
		this.returnedNum = returnedNum;
	}

	public Double getStockoutNum() {
		return StockoutNum;
	}

	public void setStockoutNum(Double stockoutNum) {
		StockoutNum = stockoutNum;
	}

	public Integer getWareStockoutDetailLabaorId() {
		return wareStockoutDetailLabaorId;
	}

	public void setWareStockoutDetailLabaorId(Integer wareStockoutDetailLabaorId) {
		this.wareStockoutDetailLabaorId = wareStockoutDetailLabaorId;
	}

	public String getStockoutNo() {
		return stockoutNo;
	}

	public void setStockoutNo(String stockoutNo) {
		this.stockoutNo = stockoutNo;
	}

	public Integer getReturnId() {
		return returnId;
	}

	public void setReturnId(Integer returnId) {
		this.returnId = returnId;
	}

	public Integer getStockoutDetailId() {
		return stockoutDetailId;
	}

	public void setStockoutDetailId(Integer stockoutDetailId) {
		this.stockoutDetailId = stockoutDetailId;
	}

	
	
	
	
}
