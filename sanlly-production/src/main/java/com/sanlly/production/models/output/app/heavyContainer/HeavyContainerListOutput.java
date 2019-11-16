package com.sanlly.production.models.output.app.heavyContainer;

/**
 * 
* @Package com.sanlly.production.models.output.app.heavyContainer 
* @Description: APP码头采集-箱列表输出类 
* @author zhangkai  
* @date 2019年9月2日 上午11:32:07 
* @version V1.0   
 */
public class HeavyContainerListOutput {
	
	/*
	 * 重箱监管入港id
	 */
	private Integer prodHeavyEnterId;
	/*
	 * 进场id
	 */
	private String prodCourseId;
	/*
	 * 箱号
	 */
	private String containerNo;
	/*
	 * 船名航次
	 */
	private String vesVos;
	/*
	 * 码头内位置
	 */
	private String position;
	/*
	 * 入港时间
	 */
	private String entryTime;
	/*
	 * 状态
	 */
	private String stateLang;
	public Integer getProdHeavyEnterId() {
		return prodHeavyEnterId;
	}
	public void setProdHeavyEnterId(Integer prodHeavyEnterId) {
		this.prodHeavyEnterId = prodHeavyEnterId;
	}
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
	public String getVesVos() {
		return vesVos;
	}
	public void setVesVos(String vesVos) {
		this.vesVos = vesVos;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}
	public String getStateLang() {
		return stateLang;
	}
	public void setStateLang(String stateLang) {
		this.stateLang = stateLang;
	}

	

}
