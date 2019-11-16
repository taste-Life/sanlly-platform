package com.sanlly.warehouse.models.output.laborInsurance.laborSell;

import java.math.BigDecimal;

/**
 * ClassName: LaborSellDetailOutput
 * Description: 劳保销售申请明细信息输出类
 * date: 2019/9/3 13:51
 *
 * @author zhh
 */
public class LaborSellDetailOutput {
	//id
	private Integer wareSellProgrammeDetailId;
	//申请单id
	private Integer wareSellProgramme;
	//备件key
	private String spareParts;
	//国际化备件key
	private String sparePartsLangLang;
	private String sparePartsName;
	//备件号
	private String sparePartsNo;
    //型号
    private String model;
    //使用人
    private Integer user;
    private String userName;
    
    //出库状态
    private String stockoutStatus;
    private String stockoutStatusLangLang;
    //剩余数量
    private Double actualSurplusNum;
    //已出库数量
    private Double stockoutNum;
    //库存数量
    private Double totalNum;
    //申请数量
    private Double applyNum;
    
    //已退库数量
    private Double returnedNum;
    //出库批次
    private String sparePartsBatch;
    //单价
    private BigDecimal price;
    //总金额
    private BigDecimal totalAmount;

    private String remark;

	public Integer getWareSellProgrammeDetailId() {
		return wareSellProgrammeDetailId;
	}

	public void setWareSellProgrammeDetailId(Integer wareSellProgrammeDetailId) {
		this.wareSellProgrammeDetailId = wareSellProgrammeDetailId;
	}

	public Integer getWareSellProgramme() {
		return wareSellProgramme;
	}

	public void setWareSellProgramme(Integer wareSellProgramme) {
		this.wareSellProgramme = wareSellProgramme;
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Double getActualSurplusNum() {
		return actualSurplusNum;
	}

	public void setActualSurplusNum(Double actualSurplusNum) {
		this.actualSurplusNum = actualSurplusNum;
	}

	public Double getApplyNum() {
		return applyNum;
	}

	public void setApplyNum(Double applyNum) {
		this.applyNum = applyNum;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Double getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Double totalNum) {
		this.totalNum = totalNum;
	}

	public Double getStockoutNum() {
		return stockoutNum;
	}

	public void setStockoutNum(Double stockoutNum) {
		this.stockoutNum = stockoutNum;
	}

	public String getStockoutStatus() {
		return stockoutStatus;
	}

	public void setStockoutStatus(String stockoutStatus) {
		this.stockoutStatus = stockoutStatus;
	}

	public String getStockoutStatusLangLang() {
		return stockoutStatusLangLang;
	}

	public void setStockoutStatusLangLang(String stockoutStatusLangLang) {
		this.stockoutStatusLangLang = stockoutStatusLangLang;
	}

	public Double getReturnedNum() {
		return returnedNum;
	}

	public void setReturnedNum(Double returnedNum) {
		this.returnedNum = returnedNum;
	}

	public String getSparePartsBatch() {
		return sparePartsBatch;
	}

	public void setSparePartsBatch(String sparePartsBatch) {
		this.sparePartsBatch = sparePartsBatch;
	}

	public String getSparePartsName() {
		return sparePartsName;
	}

	public void setSparePartsName(String sparePartsName) {
		this.sparePartsName = sparePartsName;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
    
    
}
