package com.sanlly.production.models.input.containerTesting;

import java.util.List;

import com.sanlly.production.models.output.rate.SelectItemOutput;

/**
 * 自动审核条件新增
 * 
 * @Package com.sanlly.production.models.input.containerTesting 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月30日 上午11:31:46 
 * @version V1.0   
 */
public class AddSonAuditInput {
	// 主表主键
	private Integer auditId;
	// 限制条目是否启用
	private String isRestrict;
	// 检验员等级是否启用
	private String isInspector;
	// 报价金额是否启用
	private String isQuoted;
	// 报价金额条件
	private List<ReferraMoneyInput> moneyList;
	// A级检验员
	private List<SelectItemOutput> agradeList;
	// B级检验员
	private List<SelectItemOutput> bgradeList;
	// C级检验员
	private List<SelectItemOutput> cgradeList;
	// 限制条件
	private String[] rateCode;

	public Integer getAuditId() {
		return auditId;
	}

	public void setAuditId(Integer auditId) {
		this.auditId = auditId;
	}

	public String getIsRestrict() {
		return isRestrict;
	}

	public void setIsRestrict(String isRestrict) {
		this.isRestrict = isRestrict;
	}

	public String getIsInspector() {
		return isInspector;
	}

	public void setIsInspector(String isInspector) {
		this.isInspector = isInspector;
	}

	public String getIsQuoted() {
		return isQuoted;
	}

	public void setIsQuoted(String isQuoted) {
		this.isQuoted = isQuoted;
	}

	public List<ReferraMoneyInput> getMoneyList() {
		return moneyList;
	}

	public void setMoneyList(List<ReferraMoneyInput> moneyList) {
		this.moneyList = moneyList;
	}

	public List<SelectItemOutput> getAgradeList() {
		return agradeList;
	}

	public void setAgradeList(List<SelectItemOutput> agradeList) {
		this.agradeList = agradeList;
	}

	public List<SelectItemOutput> getBgradeList() {
		return bgradeList;
	}

	public void setBgradeList(List<SelectItemOutput> bgradeList) {
		this.bgradeList = bgradeList;
	}

	public List<SelectItemOutput> getCgradeList() {
		return cgradeList;
	}

	public void setCgradeList(List<SelectItemOutput> cgradeList) {
		this.cgradeList = cgradeList;
	}

	public String[] getRateCode() {
		return rateCode;
	}

	public void setRateCode(String[] rateCode) {
		this.rateCode = rateCode;
	}

}
