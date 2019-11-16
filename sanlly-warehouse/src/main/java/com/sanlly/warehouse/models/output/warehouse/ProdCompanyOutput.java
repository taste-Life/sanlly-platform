package com.sanlly.warehouse.models.output.warehouse;
/**
 * ClassName: ProdCompanyOutput
 * Description: 公司信息输出类
 * date: 2019/7/25 17:51
 *
 * @author zhh
 */
public class ProdCompanyOutput {
	private Integer companyId;
	//公司key
	private String key;
	//国际化公司key
	private String keyLangLang;
	//公司名称
	private String companyName;
	//公司英文名称
	private String companyNameEn;
	
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyNameEn() {
		return companyNameEn;
	}
	public void setCompanyNameEn(String companyNameEn) {
		this.companyNameEn = companyNameEn;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
    
	
}
