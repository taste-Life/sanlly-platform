package com.sanlly.production.models.input.containerTesting;

import java.math.BigDecimal;

/**
 * 自动审核主表增加
 * 
 * @Package com.sanlly.production.models.input.containerTesting 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月30日 上午9:34:54 
 * @version V1.0   
 */
public class AddMasterAuditInput {
	// 公司
	private String company;
	// 用箱人
	private String containerUser;
	// 箱类别
	private String containerCategory;
	// 自动审核是否启用
	private String isAuditEnable;
	// 自动派工是否启用
	private String isReferraEnable;
	// 自动派工金额
	private BigDecimal referraMoney;

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

	public String getIsAuditEnable() {
		return isAuditEnable;
	}

	public void setIsAuditEnable(String isAuditEnable) {
		this.isAuditEnable = isAuditEnable;
	}

	public String getIsReferraEnable() {
		return isReferraEnable;
	}

	public void setIsReferraEnable(String isReferraEnable) {
		this.isReferraEnable = isReferraEnable;
	}

	public BigDecimal getReferraMoney() {
		return referraMoney;
	}

	public void setReferraMoney(BigDecimal referraMoney) {
		this.referraMoney = referraMoney;
	}

}
