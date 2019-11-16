package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 发票详细输出类
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月12日  
 *
 */
public class BusinessInvoiceOutput {
	//发票id
	private Integer businessInvoiceId;
	//商务结算id
    private Integer businessId;
    //发票号
    private String invoiceCode;
    //发票金额
    private BigDecimal invoiceAmount;
    //开票时间
    private Date invoiceDatetime;
    //发票状态
    private String invoiceStatus;
    //发票状态 国际化
    private String invoiceStatusNameLang;
    //费用状态 国际化
    private String chargeStatusNameLang;
    //费用状态
    private String chargeStatus;
    //备注
    private String remarks;
    //启用标识
    private String isEnabled;
	// 是否启用
	private String isEnabledNameLang;
    //创建时间
    private Date createTime;
    //创建人
    private Integer createUser;
	public Integer getBusinessInvoiceId() {
		return businessInvoiceId;
	}
	public void setBusinessInvoiceId(Integer businessInvoiceId) {
		this.businessInvoiceId = businessInvoiceId;
	}
	public Integer getBusinessId() {
		return businessId;
	}
	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}
	public String getInvoiceCode() {
		return invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}
	public BigDecimal getInvoiceAmount() {
		return invoiceAmount;
	}
	public void setInvoiceAmount(BigDecimal invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public Date getInvoiceDatetime() {
		return invoiceDatetime;
	}
	public void setInvoiceDatetime(Date invoiceDatetime) {
		this.invoiceDatetime = invoiceDatetime;
	}
	public String getInvoiceStatus() {
		return invoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}
	public String getInvoiceStatusNameLang() {
		return invoiceStatusNameLang;
	}
	public void setInvoiceStatusNameLang(String invoiceStatusNameLang) {
		this.invoiceStatusNameLang = invoiceStatusNameLang;
	}
	public String getChargeStatusNameLang() {
		return chargeStatusNameLang;
	}
	public void setChargeStatusNameLang(String chargeStatusNameLang) {
		this.chargeStatusNameLang = chargeStatusNameLang;
	}
	public String getChargeStatus() {
		return chargeStatus;
	}
	public void setChargeStatus(String chargeStatus) {
		this.chargeStatus = chargeStatus;
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
	public String getIsEnabledNameLang() {
		return isEnabledNameLang;
	}
	public void setIsEnabledNameLang(String isEnabledNameLang) {
		this.isEnabledNameLang = isEnabledNameLang;
	}
 
    
    
    
}
