package com.sanlly.finance.models.output;

import java.util.Date;

/**
 * 业务分类表 输出类
 * 
 * @Package com.sanlly.finance.models.input 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:33:03 
 * @version V1.0   
 */
public class BusinessCategoryOutput {
	// 主键ID
	private Integer id;
	//国际化Key
	private String langKey;
	//国际化Key
	private String langKeyNameLang;
	//业务类别Key
	private String businessType;
	//业务类别Key
	private String businessTypeNameLang;
	//分类名称
	private String categoryName;
	//分类英文
	private String categoryNameEn;
	// 是否启用
	private String isEnabled;
	// 是否启用
	private String isEnabledNameLang;
    //创建时间
    private Date createTime;
    //创建人
    private String createUser;
    //修改时间
    private Date updateTime;
    //修改人
    private String updateUser;
    
    
    
	public String getIsEnabledNameLang() {
		return isEnabledNameLang;
	}
	public void setIsEnabledNameLang(String isEnabledNameLang) {
		this.isEnabledNameLang = isEnabledNameLang;
	}
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
	public String getBusinessTypeNameLang() {
		return businessTypeNameLang;
	}
	public void setBusinessTypeNameLang(String businessTypeNameLang) {
		this.businessTypeNameLang = businessTypeNameLang;
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getLangKeyNameLang() {
		return langKeyNameLang;
	}
	public void setLangKeyNameLang(String langKeyNameLang) {
		this.langKeyNameLang = langKeyNameLang;
	}
    


    
	

}
