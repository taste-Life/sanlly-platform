package com.sanlly.production.models.output.app.unitTesting;

/**
 * 维修历史记录-进场列表
 * 
 * @author RexSheng 2019年8月12日 上午10:16:04
 */
public class UnitTestingHistoryOutput {

	/**
	 * 进场id
	 */
	private String prodCourseId;

	/**
	 * 箱号
	 */
	private String containerNo;

	/**
	 * 尺寸
	 */
	private String sizeLang;

	/**
	 * 具体箱型
	 */
	private String containerTypeLang;

	/**
	 * 进场类别
	 */
	private String entryTypeLang;

	/**
	 * 用箱人
	 */
	private String containerUserLang;

	/**
	 * 进场日期
	 */
	private String entryDate;

	/**
	 * 箱况
	 */
	private String containerConditionLang;

	/**
	 * 场站
	 */
	private String yardLang;

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	public String getSizeLang() {
		return sizeLang;
	}

	public void setSizeLang(String sizeLang) {
		this.sizeLang = sizeLang;
	}

	public String getContainerTypeLang() {
		return containerTypeLang;
	}

	public void setContainerTypeLang(String containerTypeLang) {
		this.containerTypeLang = containerTypeLang;
	}

	public String getEntryTypeLang() {
		return entryTypeLang;
	}

	public void setEntryTypeLang(String entryTypeLang) {
		this.entryTypeLang = entryTypeLang;
	}

	public String getContainerUserLang() {
		return containerUserLang;
	}

	public void setContainerUserLang(String containerUserLang) {
		this.containerUserLang = containerUserLang;
	}

	public String getContainerConditionLang() {
		return containerConditionLang;
	}

	public void setContainerConditionLang(String containerConditionLang) {
		this.containerConditionLang = containerConditionLang;
	}

	public String getYardLang() {
		return yardLang;
	}

	public void setYardLang(String yardLang) {
		this.yardLang = yardLang;
	}

}
