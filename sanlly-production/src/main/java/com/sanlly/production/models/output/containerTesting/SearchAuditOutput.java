package com.sanlly.production.models.output.containerTesting;

import java.math.BigDecimal;

/**
 * 自动审核列表实体
 * 
 * @Package com.sanlly.production.models.output.containerTesting 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月30日 上午9:16:16 
 * @version V1.0   
 */
public class SearchAuditOutput {
	// 主键
	private Integer auditId;
	// 公司
	private String companyLang;
	// 用箱人
	private String containerUserLang;
	// 箱类别
	private String containerCategoryLang;
	// 自动审核是否启用
	private String isAuditEnableLang;
	// 自动派工是否启用
	private String isReferraEnableLang;
	// 自动派工金额
	private BigDecimal referraMoney;

	public Integer getAuditId() {
		return auditId;
	}

	public void setAuditId(Integer auditId) {
		this.auditId = auditId;
	}

	public String getCompanyLang() {
		return companyLang;
	}

	public void setCompanyLang(String companyLang) {
		this.companyLang = companyLang;
	}

	public String getContainerUserLang() {
		return containerUserLang;
	}

	public void setContainerUserLang(String containerUserLang) {
		this.containerUserLang = containerUserLang;
	}

	public String getContainerCategoryLang() {
		return containerCategoryLang;
	}

	public void setContainerCategoryLang(String containerCategoryLang) {
		this.containerCategoryLang = containerCategoryLang;
	}

	public String getIsAuditEnableLang() {
		return isAuditEnableLang;
	}

	public void setIsAuditEnableLang(String isAuditEnableLang) {
		this.isAuditEnableLang = isAuditEnableLang;
	}

	public String getIsReferraEnableLang() {
		return isReferraEnableLang;
	}

	public void setIsReferraEnableLang(String isReferraEnableLang) {
		this.isReferraEnableLang = isReferraEnableLang;
	}

	public BigDecimal getReferraMoney() {
		return referraMoney;
	}

	public void setReferraMoney(BigDecimal referraMoney) {
		this.referraMoney = referraMoney;
	}

}
