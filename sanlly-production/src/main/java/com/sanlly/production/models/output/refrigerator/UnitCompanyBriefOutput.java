package com.sanlly.production.models.output.refrigerator;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UnitCompanyBriefOutput {
	
	private Integer prodUnitCompanyId;

    private String key;

    private String unitCompanyCode;

    private String unitCompanyNameLang;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date createTime;

    private List<UnitTypeOutput> unitTypes;

	public Integer getProdUnitCompanyId() {
		return prodUnitCompanyId;
	}

	public void setProdUnitCompanyId(Integer prodUnitCompanyId) {
		this.prodUnitCompanyId = prodUnitCompanyId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getUnitCompanyCode() {
		return unitCompanyCode;
	}

	public void setUnitCompanyCode(String unitCompanyCode) {
		this.unitCompanyCode = unitCompanyCode;
	}

	public String getUnitCompanyNameLang() {
		return unitCompanyNameLang;
	}

	public void setUnitCompanyNameLang(String unitCompanyNameLang) {
		this.unitCompanyNameLang = unitCompanyNameLang;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public List<UnitTypeOutput> getUnitTypes() {
		return unitTypes;
	}

	public void setUnitTypes(List<UnitTypeOutput> unitTypes) {
		this.unitTypes = unitTypes;
	}
	
	

}
