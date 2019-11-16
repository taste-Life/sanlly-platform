package com.sanlly.production.models.output.fix;

/**
 *    
 * 
 * @Package com.sanlly.production.models.output.fix 
 * @Description: TODO 派工单列表
 * @author tianzhl   
 * @date 2019年9月7日 下午4:13:22 
 * @version V1.0   
 */
public class FixSparesOutput {

	// TODO 备件号
	private String sparesNum;

	// TODO 长
	private String length;

	// TODO 宽
	private String width;

	// TODO 数量
	private String quantity;

	// TODO 库存数量
	private String surplusNum;

	public String getSparesNum() {
		return sparesNum;
	}

	public void setSparesNum(String sparesNum) {
		this.sparesNum = sparesNum;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getSurplusNum() {
		return surplusNum;
	}

	public void setSurplusNum(String surplusNum) {
		this.surplusNum = surplusNum;
	}

}
