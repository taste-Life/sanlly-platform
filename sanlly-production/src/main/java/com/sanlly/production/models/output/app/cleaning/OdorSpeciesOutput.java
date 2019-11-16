package com.sanlly.production.models.output.app.cleaning;

/**
 * 异味种类列表
 * @author RexSheng
 * 2019年8月26日 下午1:47:31
 */
public class OdorSpeciesOutput {

	private String odorSpeciesKey;
	
	private String odorSpeciesCode;
	
	private String odorSpeciesNameLang;

	public String getOdorSpeciesKey() {
		return odorSpeciesKey;
	}

	public void setOdorSpeciesKey(String odorSpeciesKey) {
		this.odorSpeciesKey = odorSpeciesKey;
	}

	public String getOdorSpeciesCode() {
		return odorSpeciesCode;
	}

	public void setOdorSpeciesCode(String odorSpeciesCode) {
		this.odorSpeciesCode = odorSpeciesCode;
	}

	public String getOdorSpeciesNameLang() {
		return odorSpeciesNameLang;
	}

	public void setOdorSpeciesNameLang(String odorSpeciesNameLang) {
		this.odorSpeciesNameLang = odorSpeciesNameLang;
	}
	
	
}
