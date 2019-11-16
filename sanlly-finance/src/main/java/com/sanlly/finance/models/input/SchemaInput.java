package com.sanlly.finance.models.input;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 模式对应表 输入类
 * 
 * @Package com.sanlly.finance.models.input 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:33:03 
 * @version V1.0   
 */
public class SchemaInput {

	// 主键ID
	private Integer id;
	// 国际化Key
	private String langKey;
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


	
}
