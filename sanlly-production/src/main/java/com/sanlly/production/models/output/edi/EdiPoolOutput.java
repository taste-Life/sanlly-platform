package com.sanlly.production.models.output.edi;

import java.math.BigDecimal;

/**
 * edi池数据
 * @author RexSheng
 * 2019年10月14日 下午1:43:56
 */
public class EdiPoolOutput {
	
	/**
	 * 池id
	 */
	private Integer poolId;

	/**
	 * 进场id
	 */
	private String courseId;
	
	private String yardNameLang;
	
	private String containerUserNameLang;
	
	/**
	 * 箱号
	 */
	private String containerNo;
	
	/**
	 * edi类型
	 */
	private String ediTypeKey;
	
	/**
	 * edi类型
	 */
	private String ediTypeNameLang;
	
	/**
	 * 估价单号
	 */
	private String evaluationNo;
	
	
	/**
	 * 导出次数
	 */
	private Integer exportNumber;
	
	/**
	 * 箱类别
	 */
	private String containerCategoryKey;
	
	/**
	 * 箱类别
	 */
	private String containerCategoryNameLang;
	
	/**
	 * 发送状态
	 */
	private String state;
	
	/**
	 * 发送状态
	 */
	private String stateNameLang;
	
	/**
	 * cw费
	 */
	private BigDecimal cwFee;
	
	/**
	 * dpp费
	 */
	private BigDecimal dppFee;
	
	/**
	 * 卖方客户代码
	 */
	private String clientCode;
	
	public String getYardNameLang() {
		return yardNameLang;
	}

	public void setYardNameLang(String yardNameLang) {
		this.yardNameLang = yardNameLang;
	}

	public String getContainerUserNameLang() {
		return containerUserNameLang;
	}

	public void setContainerUserNameLang(String containerUserNameLang) {
		this.containerUserNameLang = containerUserNameLang;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getEdiTypeKey() {
		return ediTypeKey;
	}

	public void setEdiTypeKey(String ediTypeKey) {
		this.ediTypeKey = ediTypeKey;
	}

	public String getEdiTypeNameLang() {
		return ediTypeNameLang;
	}

	public void setEdiTypeNameLang(String ediTypeNameLang) {
		this.ediTypeNameLang = ediTypeNameLang;
	}

	public String getEvaluationNo() {
		return evaluationNo;
	}

	public void setEvaluationNo(String evaluationNo) {
		this.evaluationNo = evaluationNo;
	}

	public Integer getExportNumber() {
		return exportNumber;
	}

	public void setExportNumber(Integer exportNumber) {
		this.exportNumber = exportNumber;
	}

	public String getContainerCategoryKey() {
		return containerCategoryKey;
	}

	public void setContainerCategoryKey(String containerCategoryKey) {
		this.containerCategoryKey = containerCategoryKey;
	}

	public String getContainerCategoryNameLang() {
		return containerCategoryNameLang;
	}

	public void setContainerCategoryNameLang(String containerCategoryNameLang) {
		this.containerCategoryNameLang = containerCategoryNameLang;
	}

	public BigDecimal getCwFee() {
		return cwFee;
	}

	public void setCwFee(BigDecimal cwFee) {
		this.cwFee = cwFee;
	}

	public BigDecimal getDppFee() {
		return dppFee;
	}

	public void setDppFee(BigDecimal dppFee) {
		this.dppFee = dppFee;
	}

	public Integer getPoolId() {
		return poolId;
	}

	public void setPoolId(Integer poolId) {
		this.poolId = poolId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public String getStateNameLang() {
		return stateNameLang;
	}

	public void setStateNameLang(String stateNameLang) {
		this.stateNameLang = stateNameLang;
	}
	
	
}
