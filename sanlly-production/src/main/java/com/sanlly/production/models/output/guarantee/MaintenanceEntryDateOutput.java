package com.sanlly.production.models.output.guarantee;

/**
 * 机组保修app端根据箱号获取进场时间输出类
 * @author zhangkai
 *
 */
public class MaintenanceEntryDateOutput {
	
	/*
	 * 进场id
	 */
	private String prodCourseId;

	/*
	 * 进场时间
	 */
	private String entryDate;
	
	

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public String getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	
	
}
