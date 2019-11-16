package com.sanlly.warehouse.entity;

/**
 * 工具扩展实体
 * 
 * @author lishzh
 *
 */
public class WareToolExtManage extends WareToolManage {

	private String sparePartsNo;

	private Integer scrapedNum;

	public Integer getScrapedNum() {
		return scrapedNum;
	}

	public void setScrapedNum(Integer scrapedNum) {
		this.scrapedNum = scrapedNum;
	}

	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}

}
