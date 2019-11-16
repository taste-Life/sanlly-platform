package com.sanlly.finance.models.output;

import java.math.BigDecimal;
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
public class SchemaOutput {

	// 主键ID
	private Integer id;
	// 国际化Key
	private String langKey;
	
	// 国际化Key
	private String langKeyNameLang;
	
	// 模式名称
	private String schemaName;
	// 模式名称 英文
	private String schemaNameEn;
	// 公式
	private String formula;
	// 比例
	private BigDecimal ratio;
	// 是否启用
	private String isEnabled;
	// 是否启用
	private String isEnabledNameLang;
	// 创建时间
	private Date createTime;
	// 创建人
	private String createUser;
	// 修改时间
	private Date updateTime;
	// 修改人
	private String updateUser;


	
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
	public String getSchemaName() {
		return schemaName;
	}
	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}
	public String getSchemaNameEn() {
		return schemaNameEn;
	}
	public void setSchemaNameEn(String schemaNameEn) {
		this.schemaNameEn = schemaNameEn;
	}
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
	public BigDecimal getRatio() {
		return ratio;
	}
	public void setRatio(BigDecimal ratio) {
		this.ratio = ratio;
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
	public String getIsEnabledNameLang() {
		return isEnabledNameLang;
	}
	public void setIsEnabledNameLang(String isEnabledNameLang) {
		this.isEnabledNameLang = isEnabledNameLang;
	}
	public String getLangKeyNameLang() {
		return langKeyNameLang;
	}
	public void setLangKeyNameLang(String langKeyNameLang) {
		this.langKeyNameLang = langKeyNameLang;
	}
	
	

}
