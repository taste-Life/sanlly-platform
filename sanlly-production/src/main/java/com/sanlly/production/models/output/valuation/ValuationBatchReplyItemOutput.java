package com.sanlly.production.models.output.valuation;

/**
 * 批量批复记录输出类
 * @author zhangkai
 *
 */
public class ValuationBatchReplyItemOutput {

	/*
	 * 进场id
	 */
	private String prodCourseId;
	/*
	 * 箱号
	 */
	private String containerNo;
	/*
	 * 箱体费用
	 */
	private String containerCost;
	/*
	 * 机组费用
	 */
	private String unitCost;
	/*
	 * 总费用
	 */
	private String valuationMoneyRmb;
	/*
	 * 批复费用
	 */
	private String replyCost;
	/*
	 * 错误提示
	 */
	private String errorMessageLang;
	
	public String getContainerNo() {
		return containerNo;
	}
	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}
	public String getValuationMoneyRmb() {
		return valuationMoneyRmb;
	}
	public void setValuationMoneyRmb(String valuationMoneyRmb) {
		this.valuationMoneyRmb = valuationMoneyRmb;
	}
	public String getReplyCost() {
		return replyCost;
	}
	public void setReplyCost(String replyCost) {
		this.replyCost = replyCost;
	}
	public String getErrorMessageLang() {
		return errorMessageLang;
	}
	public void setErrorMessageLang(String errorMessageLang) {
		this.errorMessageLang = errorMessageLang;
	}
	public String getProdCourseId() {
		return prodCourseId;
	}
	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}
	public String getContainerCost() {
		return containerCost;
	}
	public void setContainerCost(String containerCost) {
		this.containerCost = containerCost;
	}
	public String getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(String unitCost) {
		this.unitCost = unitCost;
	}
	
	
	
}
