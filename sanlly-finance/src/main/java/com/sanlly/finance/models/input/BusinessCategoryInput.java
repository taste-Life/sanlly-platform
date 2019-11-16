package com.sanlly.finance.models.input;

import java.util.Date;

/**
 * 业务分类表 输入类
 * 
 * @Package com.sanlly.finance.models.input 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:33:03 
 * @version V1.0   
 */
public class BusinessCategoryInput {
	// 主键ID
	private Integer id;
	//国际化Key
	private String langKey;
	//业务类别Key
	private String businessType;
	//分类名称
	private String categoryName;
	//分类英文
	private String categoryNameEn;
	// 是否启用
	private String isEnabled;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLangKey() {
		return langKey;
	}
	public void setLangKey(String langKey) {
		this.langKey = langKey;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryNameEn() {
		return categoryNameEn;
	}
	public void setCategoryNameEn(String categoryNameEn) {
		this.categoryNameEn = categoryNameEn;
	}
	public String getIsEnabled() {
		return isEnabled;
	}
	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}
	
	

}
