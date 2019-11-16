package com.sanlly.production.models.input.app.heavyContainer;

import java.util.List;

/**
 * APP重箱监管-批量设置位置和入港时间输入类
 * @author zhangkai
 *
 */
public class HeavyContainerSetPositionInput {

	/*
	 * 重箱监管入港id集合
	 */
	private String prodHeavyEnterIds;
	/*
	 * 位置
	 */
	private String position;
	/*
	 * 入港时间
	 */
	private String entryTime;
	
	
	public String getProdHeavyEnterIds() {
		return prodHeavyEnterIds;
	}
	public void setProdHeavyEnterIds(String prodHeavyEnterIds) {
		this.prodHeavyEnterIds = prodHeavyEnterIds;
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
	
	
}
