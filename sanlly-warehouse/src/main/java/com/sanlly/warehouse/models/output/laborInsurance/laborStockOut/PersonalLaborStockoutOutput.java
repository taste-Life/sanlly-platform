package com.sanlly.warehouse.models.output.laborInsurance.laborStockOut;
/**
 * ClassName: PersonalLaborStockoutOutput
 * Description: 个人劳保待出库输出类
 * date: 2019/9/16 13:58
 *
 * @author zhh
 * @since JDK 1.8
 */
public class PersonalLaborStockoutOutput {

	//备件号
    private String sparePartsNo;
    //备件名称
    private String sparePartsLangLang;
    //备件key
    private String spareParts;
    //型号
    private String model;
    //申请数量
    private Double applicantNum;
    //已出库数量
    private Double stockoutNum;
    //出库状态
    private String stockoutStatus;
    private String stockoutStatusLangLang;
    //申请日期
    private String applicantDate;
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
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getApplicantNum() {
		return applicantNum;
	}
	public void setApplicantNum(Double applicantNum) {
		this.applicantNum = applicantNum;
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
	public String getApplicantDate() {
		return applicantDate;
	}
	public void setApplicantDate(String applicantDate) {
		this.applicantDate = applicantDate;
	}
    
}
