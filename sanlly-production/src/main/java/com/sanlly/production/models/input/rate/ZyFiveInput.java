package com.sanlly.production.models.input.rate;

/**
 * 中远五位代码获取
 * 
 * @Package com.sanlly.production.models.input.rate 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月24日 下午3:00:49 
 * @version V1.0   
 */
public class ZyFiveInput {
	// 五位代码
	private String fiveCode;
	// 箱型
	private String containerType;
	// 尺寸
	private String size;
	// 位置代码
	private String positionCode;
	// 公司
	private String company;

	public String getFiveCode() {
		return fiveCode;
	}

	public void setFiveCode(String fiveCode) {
		this.fiveCode = fiveCode;
	}

	public String getContainerType() {
		return containerType;
	}

	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
