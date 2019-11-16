package com.sanlly.warehouse.models.input.stockin;

import java.math.BigDecimal;

/**
 * 
* @Package com.sanlly.warehouse.models.input.stockin 
* @Description: 国内采购入库，备件CBS类型不一致，拆分多条数据到SBS 
* @author jlx   
* @date 2019年10月23日 上午11:35:19 
* @version V1.0   
 */
public class AddPurchaseSBSInput {
	private String invtrTyp; //仅物料销售成本使用
	private BigDecimal locNetAmt; //本位币净额
	private BigDecimal locTaxAmt; //本位币税额
	private BigDecimal locTtlAmt; //本位金额
	private BigDecimal locNetAmtTariff; //本位币净额-关税
	private BigDecimal locTaxAmtTariff; //本位币税额-关税
	private BigDecimal locTtlAmtTariff; //本位金额-关税
	public String getInvtrTyp() {
		return invtrTyp;
	}
	public void setInvtrTyp(String invtrTyp) {
		this.invtrTyp = invtrTyp;
	}
	public BigDecimal getLocNetAmt() {
		return locNetAmt;
	}
	public void setLocNetAmt(BigDecimal locNetAmt) {
		this.locNetAmt = locNetAmt;
	}
	public BigDecimal getLocTaxAmt() {
		return locTaxAmt;
	}
	public void setLocTaxAmt(BigDecimal locTaxAmt) {
		this.locTaxAmt = locTaxAmt;
	}
	public BigDecimal getLocTtlAmt() {
		return locTtlAmt;
	}
	public void setLocTtlAmt(BigDecimal locTtlAmt) {
		this.locTtlAmt = locTtlAmt;
	}
	public BigDecimal getLocNetAmtTariff() {
		return locNetAmtTariff;
	}
	public void setLocNetAmtTariff(BigDecimal locNetAmtTariff) {
		this.locNetAmtTariff = locNetAmtTariff;
	}
	public BigDecimal getLocTaxAmtTariff() {
		return locTaxAmtTariff;
	}
	public void setLocTaxAmtTariff(BigDecimal locTaxAmtTariff) {
		this.locTaxAmtTariff = locTaxAmtTariff;
	}
	public BigDecimal getLocTtlAmtTariff() {
		return locTtlAmtTariff;
	}
	public void setLocTtlAmtTariff(BigDecimal locTtlAmtTariff) {
		this.locTtlAmtTariff = locTtlAmtTariff;
	}

	
	
}
