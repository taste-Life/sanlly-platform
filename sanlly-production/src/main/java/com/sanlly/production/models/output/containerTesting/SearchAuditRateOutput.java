package com.sanlly.production.models.output.containerTesting;

/**
 * 限制条目列表
 * 
 * @Package com.sanlly.production.models.output.containerTesting 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月2日 上午10:38:46 
 * @version V1.0   
 */
public class SearchAuditRateOutput {
	// 箱类别
	private String containerCategoryLang;
	// 费率代码
	private String rateCode;
	// 部件明细
	private String partsDetails;
	// 维修代码
	private String repair;

	public String getContainerCategoryLang() {
		return containerCategoryLang;
	}

	public void setContainerCategoryLang(String containerCategoryLang) {
		this.containerCategoryLang = containerCategoryLang;
	}

	public String getRateCode() {
		return rateCode;
	}

	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
	}

	public String getPartsDetails() {
		return partsDetails;
	}

	public void setPartsDetails(String partsDetails) {
		this.partsDetails = partsDetails;
	}

	public String getRepair() {
		return repair;
	}

	public void setRepair(String repair) {
		this.repair = repair;
	}

}
