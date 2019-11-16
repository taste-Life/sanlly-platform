package com.sanlly.warehouse.models.input.spareparts;

/**
 * 机组检验条目录入，搜索备件
 * @author RexSheng
 * 2019年8月7日 上午9:29:32
 */
public class SparePartsTestingInput {

	private String companyKey;
	
	private String unitTypeKey;
	
	private String partsTypeKey;
	
	private String partsDetailKey;

	public String getCompanyKey() {
		return companyKey;
	}

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}

	public String getUnitTypeKey() {
		return unitTypeKey;
	}

	public void setUnitTypeKey(String unitTypeKey) {
		this.unitTypeKey = unitTypeKey;
	}

	public String getPartsTypeKey() {
		return partsTypeKey;
	}

	public void setPartsTypeKey(String partsTypeKey) {
		this.partsTypeKey = partsTypeKey;
	}

	public String getPartsDetailKey() {
		return partsDetailKey;
	}

	public void setPartsDetailKey(String partsDetailKey) {
		this.partsDetailKey = partsDetailKey;
	}
	
	
}
