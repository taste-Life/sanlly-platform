package com.sanlly.finance.models.input;

import java.math.BigDecimal;

/**
 * 现场收费账单
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年9月3日 下午2:36:54 
* @version V1.0   
 */
public class BillInfoInput {
	//主键ID
    private Integer billId;
    //账单编号
    private String billCode;
    //账单月份
    private String billMonth;
    
    private String merchantsKey;
    //费用key
    private String chargeTypeKey;
    
    //费用编码
    private String chargecode;

    private String sapid;
    
    //税率
    private BigDecimal taxRate;
    
    //汇率 默认1
    private BigDecimal realRate;
    //币种
    private String  realCurrencyType;
    
    //账单备注
    private String billRemark;
    //公司
    private String companyKey;

	public Integer getBillId() {
		return billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	public String getBillCode() {
		return billCode;
	}

	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}

	public String getBillMonth() {
		return billMonth;
	}

	public void setBillMonth(String billMonth) {
		this.billMonth = billMonth;
	}

	public BigDecimal getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}

	public BigDecimal getRealRate() {
		return realRate;
	}

	public void setRealRate(BigDecimal realRate) {
		this.realRate = realRate;
	}

	public String getBillRemark() {
		return billRemark;
	}

	public void setBillRemark(String billRemark) {
		this.billRemark = billRemark;
	}

	public String getRealCurrencyType() {
		return realCurrencyType;
	}

	public void setRealCurrencyType(String realCurrencyType) {
		this.realCurrencyType = realCurrencyType;
	}

	public String getMerchantsKey() {
		return merchantsKey;
	}

	public void setMerchantsKey(String merchantsKey) {
		this.merchantsKey = merchantsKey;
	}

	public String getSapid() {
		return sapid;
	}

	public void setSapid(String sapid) {
		this.sapid = sapid;
	}

	public String getChargeTypeKey() {
		return chargeTypeKey;
	}

	public void setChargeTypeKey(String chargeTypeKey) {
		this.chargeTypeKey = chargeTypeKey;
	}

	public String getChargecode() {
		return chargecode;
	}

	public void setChargecode(String chargecode) {
		this.chargecode = chargecode;
	}

	public String getCompanyKey() {
		return companyKey;
	}

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}
    


	
	
}