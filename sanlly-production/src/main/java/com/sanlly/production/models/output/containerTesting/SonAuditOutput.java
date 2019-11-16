package com.sanlly.production.models.output.containerTesting;

import java.util.List;

import com.sanlly.common.models.output.SelectOutput;
import com.sanlly.production.models.input.containerTesting.ReferraMoneyInput;
import com.sanlly.production.models.output.rate.SelectItemOutput;

/**
 * 获取自动审核条件信息
 * 
 * @Package com.sanlly.production.models.output.containerTesting 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月30日 上午11:43:42 
 * @version V1.0   
 */
public class SonAuditOutput {
	// 主表主键
	private Integer auditId;
	// 公司
	private String company;
	// 用箱人
	private String containerUser;
	// 箱类别
	private String containerCategory;
	// 限制条目是否启用
	private String isRestrict;
	// 检验员等级是否启用
	private String isInspector;
	// 报价金额是否启用
	private String isQuoted;
	// 报价金额条件
	private List<ReferraMoneyInput> moneyList;
	// A级检验员
	private List<SelectOutput> agradeList;
	// B级检验员
	private List<SelectOutput> bgradeList;
	// C级检验员
	private List<SelectOutput> cgradeList;
	// 限制条件
	private String[] rateCode;

	public Integer getAuditId() {
		return auditId;
	}

	public void setAuditId(Integer auditId) {
		this.auditId = auditId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public List<ReferraMoneyInput> getMoneyList() {
		return moneyList;
	}

	public void setMoneyList(List<ReferraMoneyInput> moneyList) {
		this.moneyList = moneyList;
	}

	

	public List<SelectOutput> getAgradeList() {
		return agradeList;
	}

	public void setAgradeList(List<SelectOutput> agradeList) {
		this.agradeList = agradeList;
	}

	public List<SelectOutput> getBgradeList() {
		return bgradeList;
	}

	public void setBgradeList(List<SelectOutput> bgradeList) {
		this.bgradeList = bgradeList;
	}

	public List<SelectOutput> getCgradeList() {
		return cgradeList;
	}

	public void setCgradeList(List<SelectOutput> cgradeList) {
		this.cgradeList = cgradeList;
	}

	public String[] getRateCode() {
		return rateCode;
	}

	public void setRateCode(String[] rateCode) {
		this.rateCode = rateCode;
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

}
