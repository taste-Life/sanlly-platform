package com.sanlly.finance.models.input;

import java.util.Date;

/**
 * 账单类型输入实体类
 * 
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author fjy
 * @date 2019年8月9日
 *
 */
public class BillTypeInput {
	/**
	 * 主键
	 */
	private Integer billId;
	/**
	 * 国际化key
	 */
	private String langKey;
	/**
	 * 账单中文名
	 */
	private String billName;
	/**
	 * 账单英文名
	 */
	private String billNameEn;
	/**
	 * 账单号前缀  暂时定死为 Z
	 */
    private String billPrefix="Z";
	/**
	 * 账单简码
	 */
	private String billCode;
	/**
	 * 账单自增序列
	 */
	private String billIdentityCode;
	/**
	 * 备注
	 */
	private String remarks;
	// 是否有效
	private String isEnabled;
	// 是否删除
	private Integer isDel;
	// 创建时间
	private Date createTime;
	// 创建人
	private Integer createUser;
	// 修改时间
	private Date updateTime;
	// 修改人
	private Integer updateUser;
	public Integer getBillId() {
		return billId;
	}
	public void setBillId(Integer billId) {
		this.billId = billId;
	}
	public String getLangKey() {
		return langKey;
	}
	public void setLangKey(String langKey) {
		this.langKey = langKey;
	}
	public String getBillName() {
		return billName;
	}
	public void setBillName(String billName) {
		this.billName = billName;
	}
	public String getBillNameEn() {
		return billNameEn;
	}
	public void setBillNameEn(String billNameEn) {
		this.billNameEn = billNameEn;
	}
	public String getBillPrefix() {
		return billPrefix;
	}
	public void setBillPrefix(String billPrefix) {
		this.billPrefix = billPrefix;
	}
	public String getBillCode() {
		return billCode;
	}
	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}
	public String getBillIdentityCode() {
		return billIdentityCode;
	}
	public void setBillIdentityCode(String billIdentityCode) {
		this.billIdentityCode = billIdentityCode;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getIsEnabled() {
		return isEnabled;
	}
	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}
	public Integer getIsDel() {
		return isDel;
	}
	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getCreateUser() {
		return createUser;
	}
	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(Integer updateUser) {
		this.updateUser = updateUser;
	}


	
}
