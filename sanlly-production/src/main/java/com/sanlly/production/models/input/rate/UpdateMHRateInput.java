package com.sanlly.production.models.input.rate;

import java.math.BigDecimal;

/**
 * 编辑工时费率实体
 * @author wangxzh
 *
 */
public class UpdateMHRateInput {

	private Integer manhourRateId;

	private String rateCompany;

	private String containerUser;

	private BigDecimal contBodyManHourRate;

	private String contBodyQuotedCurrency;

	private String contBodyRateCurrency;

	private BigDecimal contBodyExchangeRate;

	private BigDecimal unitManHourRate;

	private String unitQuotedCurrency;

	private String unitRateCurrency;

	private BigDecimal unitExchangeRate;

	private BigDecimal dryContManHourRate;

	private String dryContQuotedCurrency;

	private String dryContRateCurrency;

	private BigDecimal dryContExchangeRate;

	private BigDecimal ptiRate;

	private BigDecimal billDiscountRate;

	public Integer getManhourRateId() {
		return manhourRateId;
	}

	public void setManhourRateId(Integer manhourRateId) {
		this.manhourRateId = manhourRateId;
	}

	public String getRateCompany() {
		return rateCompany;
	}

	public void setRateCompany(String rateCompany) {
		this.rateCompany = rateCompany;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public BigDecimal getContBodyManHourRate() {
		return contBodyManHourRate;
	}

	public void setContBodyManHourRate(BigDecimal contBodyManHourRate) {
		this.contBodyManHourRate = contBodyManHourRate;
	}

	public String getContBodyQuotedCurrency() {
		return contBodyQuotedCurrency;
	}

	public void setContBodyQuotedCurrency(String contBodyQuotedCurrency) {
		this.contBodyQuotedCurrency = contBodyQuotedCurrency;
	}

	public String getContBodyRateCurrency() {
		return contBodyRateCurrency;
	}

	public void setContBodyRateCurrency(String contBodyRateCurrency) {
		this.contBodyRateCurrency = contBodyRateCurrency;
	}

	public BigDecimal getContBodyExchangeRate() {
		return contBodyExchangeRate;
	}

	public void setContBodyExchangeRate(BigDecimal contBodyExchangeRate) {
		this.contBodyExchangeRate = contBodyExchangeRate;
	}

	public BigDecimal getUnitManHourRate() {
		return unitManHourRate;
	}

	public void setUnitManHourRate(BigDecimal unitManHourRate) {
		this.unitManHourRate = unitManHourRate;
	}

	public String getUnitQuotedCurrency() {
		return unitQuotedCurrency;
	}

	public void setUnitQuotedCurrency(String unitQuotedCurrency) {
		this.unitQuotedCurrency = unitQuotedCurrency;
	}

	public String getUnitRateCurrency() {
		return unitRateCurrency;
	}

	public void setUnitRateCurrency(String unitRateCurrency) {
		this.unitRateCurrency = unitRateCurrency;
	}

	public BigDecimal getUnitExchangeRate() {
		return unitExchangeRate;
	}

	public void setUnitExchangeRate(BigDecimal unitExchangeRate) {
		this.unitExchangeRate = unitExchangeRate;
	}

	public BigDecimal getDryContManHourRate() {
		return dryContManHourRate;
	}

	public void setDryContManHourRate(BigDecimal dryContManHourRate) {
		this.dryContManHourRate = dryContManHourRate;
	}

	public String getDryContQuotedCurrency() {
		return dryContQuotedCurrency;
	}

	public void setDryContQuotedCurrency(String dryContQuotedCurrency) {
		this.dryContQuotedCurrency = dryContQuotedCurrency;
	}

	public String getDryContRateCurrency() {
		return dryContRateCurrency;
	}

	public void setDryContRateCurrency(String dryContRateCurrency) {
		this.dryContRateCurrency = dryContRateCurrency;
	}

	public BigDecimal getDryContExchangeRate() {
		return dryContExchangeRate;
	}

	public void setDryContExchangeRate(BigDecimal dryContExchangeRate) {
		this.dryContExchangeRate = dryContExchangeRate;
	}

	public BigDecimal getPtiRate() {
		return ptiRate;
	}

	public void setPtiRate(BigDecimal ptiRate) {
		this.ptiRate = ptiRate;
	}

	public BigDecimal getBillDiscountRate() {
		return billDiscountRate;
	}

	public void setBillDiscountRate(BigDecimal billDiscountRate) {
		this.billDiscountRate = billDiscountRate;
	}

}
