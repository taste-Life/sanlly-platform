package com.sanlly.production.models.output.unitTesting;

/**
 * 先修列表展示
 * @author RexSheng
 * 2019年9月23日 下午4:29:34
 */
public class PreFixOutput {
	//进场Id
	private String prodCourseId;
	//箱号
	private String containerNo;
	//区位
	private String zoneLang;
	//机组类型-好/坏机
	private String unitStateLang;
	//机组类型key
	private String unitStateKey;
	//用箱人
	private String containerUserLang;
	//尺寸
	private String sizeLang;
	//箱型
	private String containerTypeLang;
	//进场日期
	private String entryDate;
	
	//进场类别
	private String entryStateLang;

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

	public String getZoneLang() {
		return zoneLang;
	}

	public void setZoneLang(String zoneLang) {
		this.zoneLang = zoneLang;
	}

	public String getUnitStateLang() {
		return unitStateLang;
	}

	public void setUnitStateLang(String unitStateLang) {
		this.unitStateLang = unitStateLang;
	}

	public String getContainerUserLang() {
		return containerUserLang;
	}

	public void setContainerUserLang(String containerUserLang) {
		this.containerUserLang = containerUserLang;
	}

	public String getSizeLang() {
		return sizeLang;
	}

	public void setSizeLang(String sizeLang) {
		this.sizeLang = sizeLang;
	}

	public String getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	public String getEntryStateLang() {
		return entryStateLang;
	}

	public void setEntryStateLang(String entryStateLang) {
		this.entryStateLang = entryStateLang;
	}

	public String getContainerTypeLang() {
		return containerTypeLang;
	}

	public void setContainerTypeLang(String containerTypeLang) {
		this.containerTypeLang = containerTypeLang;
	}

	public String getUnitStateKey() {
		return unitStateKey;
	}

	public void setUnitStateKey(String unitStateKey) {
		this.unitStateKey = unitStateKey;
	}
	
	
}
