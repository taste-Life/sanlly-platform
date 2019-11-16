package com.sanlly.common.models.output.fixOut;

import java.util.List;

/**
 *    
 * 
 * @Package com.sanlly.production.models.output.fix 
 * @Description: TODO 领料备件列表
 * @author tianzhl   
 * @date 2019年9月7日 下午4:08:09 
 * @version V1.0   
 */
public class PickingListSparesOutput {

	private String sparesNumber;

	private String sparesNumberNameLang;

	private String length;

	private String width;

	private String quantity;

	private String pickingQuantity;

	private String surplusQuantity;

	private String pickingStateLang;

	private List<PickingListEntryOutput> planStockList;

	public String getSparesNumber() {
		return sparesNumber;
	}

	public void setSparesNumber(String sparesNumber) {
		this.sparesNumber = sparesNumber;
	}

	public String getSparesNumberNameLang() {
		return sparesNumberNameLang;
	}

	public void setSparesNumberNameLang(String sparesNumberNameLang) {
		this.sparesNumberNameLang = sparesNumberNameLang;
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

	public String getPickingQuantity() {
		return pickingQuantity;
	}

	public void setPickingQuantity(String pickingQuantity) {
		this.pickingQuantity = pickingQuantity;
	}

	public String getSurplusQuantity() {
		return surplusQuantity;
	}

	public void setSurplusQuantity(String surplusQuantity) {
		this.surplusQuantity = surplusQuantity;
	}

	public String getPickingStateLang() {
		return pickingStateLang;
	}

	public void setPickingStateLang(String pickingStateLang) {
		this.pickingStateLang = pickingStateLang;
	}

	public List<PickingListEntryOutput> getPlanStockList() {
		return planStockList;
	}

	public void setPlanStockList(List<PickingListEntryOutput> planStockList) {
		this.planStockList = planStockList;
	}

}
