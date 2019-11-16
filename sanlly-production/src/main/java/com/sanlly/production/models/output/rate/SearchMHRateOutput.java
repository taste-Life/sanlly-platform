package com.sanlly.production.models.output.rate;

import java.math.BigDecimal;

/**
 * 工时费率列表返回实体
 * @author wangxzh
 *
 */
public class SearchMHRateOutput {

	private Integer manhourRateId;

	private String companyLang;

	private String containerUserLang;

	private BigDecimal contBodyManHourRate;

	private String contBodyQuotedCurrencyLang;

	private String contBodyRateCurrencyLang;

	private BigDecimal contBodyExchangeRate;

	private BigDecimal unitManHourRate;

	private String unitQuotedCurrencyLang;

	private String unitRateCurrencyLang;

	private BigDecimal unitExchangeRate;

	private BigDecimal dryContManHourRate;

	private String dryContQuotedCurrencyLang;

	private String dryContRateCurrencyLang;

	private BigDecimal dryContExchangeRate;

	private BigDecimal PTIRate;

	private BigDecimal billDiscountRate;

	public Integer getManhourRateId() {
		return manhourRateId;
	}

	public void setManhourRateId(Integer manhourRateId) {
		this.manhourRateId = manhourRateId;
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

	public BigDecimal getContBodyManHourRate() {
		return contBodyManHourRate;
	}

	public void setContBodyManHourRate(BigDecimal contBodyManHourRate) {
		this.contBodyManHourRate = contBodyManHourRate;
	}

	public String getContBodyQuotedCurrencyLang() {
		return contBodyQuotedCurrencyLang;
	}

	public void setContBodyQuotedCurrencyLang(String contBodyQuotedCurrencyLang) {
		this.contBodyQuotedCurrencyLang = contBodyQuotedCurrencyLang;
	}

	public String getContBodyRateCurrencyLang() {
		return contBodyRateCurrencyLang;
	}

	public void setContBodyRateCurrencyLang(String contBodyRateCurrencyLang) {
		this.contBodyRateCurrencyLang = contBodyRateCurrencyLang;
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

	public String getUnitQuotedCurrencyLang() {
		return unitQuotedCurrencyLang;
	}

	public void setUnitQuotedCurrencyLang(String unitQuotedCurrencyLang) {
		this.unitQuotedCurrencyLang = unitQuotedCurrencyLang;
	}

	public String getUnitRateCurrencyLang() {
		return unitRateCurrencyLang;
	}

	public void setUnitRateCurrencyLang(String unitRateCurrencyLang) {
		this.unitRateCurrencyLang = unitRateCurrencyLang;
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

	public String getDryContQuotedCurrencyLang() {
		return dryContQuotedCurrencyLang;
	}

	public void setDryContQuotedCurrencyLang(String dryContQuotedCurrencyLang) {
		this.dryContQuotedCurrencyLang = dryContQuotedCurrencyLang;
	}

	public String getDryContRateCurrencyLang() {
		return dryContRateCurrencyLang;
	}

	public void setDryContRateCurrencyLang(String dryContRateCurrencyLang) {
		this.dryContRateCurrencyLang = dryContRateCurrencyLang;
	}

	public BigDecimal getDryContExchangeRate() {
		return dryContExchangeRate;
	}

	public void setDryContExchangeRate(BigDecimal dryContExchangeRate) {
		this.dryContExchangeRate = dryContExchangeRate;
	}

	public BigDecimal getPTIRate() {
		return PTIRate;
	}

	public void setPTIRate(BigDecimal pTIRate) {
		PTIRate = pTIRate;
	}

	public BigDecimal getBillDiscountRate() {
		return billDiscountRate;
	}

	public void setBillDiscountRate(BigDecimal billDiscountRate) {
		this.billDiscountRate = billDiscountRate;
	}

}
