package com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceType;
/**
 * ClassName: LaborInsuranceTypeOutput
 * Description: 劳保类别输出类
 * date: 2019/8/10 10:50
 *
 * @author zhh
 */
public class LaborInsuranceTypeOutput {
	private Integer wareSparepartsCategoriesDetailsId;
	//劳保类别key
	private String key;
	//国际化劳保类别key
	private String keyLangLang;
	//劳保类别名称
	private String sparepartsCategoriesDetailsName;
	//劳保类别名称英文
	private String sparepartsCategoriesDetailsNameEn;
    
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getKeyLangLang() {
		return keyLangLang;
	}

	public void setKeyLangLang(String keyLangLang) {
		this.keyLangLang = keyLangLang;
	}

	public String getSparepartsCategoriesDetailsName() {
		return sparepartsCategoriesDetailsName;
	}

	public void setSparepartsCategoriesDetailsName(String sparepartsCategoriesDetailsName) {
		this.sparepartsCategoriesDetailsName = sparepartsCategoriesDetailsName;
	}

	public String getSparepartsCategoriesDetailsNameEn() {
		return sparepartsCategoriesDetailsNameEn;
	}

	public void setSparepartsCategoriesDetailsNameEn(String sparepartsCategoriesDetailsNameEn) {
		this.sparepartsCategoriesDetailsNameEn = sparepartsCategoriesDetailsNameEn;
	}

	public Integer getWareSparepartsCategoriesDetailsId() {
		return wareSparepartsCategoriesDetailsId;
	}

	public void setWareSparepartsCategoriesDetailsId(Integer wareSparepartsCategoriesDetailsId) {
		this.wareSparepartsCategoriesDetailsId = wareSparepartsCategoriesDetailsId;
	}

	
	
	

}
