package com.sanlly.production.models.output.rate;

/**
 * 代码对应列表返回实体
 * 
 * @Package com.sanlly.production.models.output.rate 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月27日 上午11:20:46 
 * @version V1.0   
 */
public class SearchRateCodeOutput {
	// 主键
	private Integer codeId;
	// 箱类别
	private String containerCategoryLang;
	// 位置代码
	private String positionCode;
	// 部件大类
	private String partsTypeCode;
	// 部件明细
	private String partsDetailsCode;
	// 维修代码
	private String repairCode;
	// 部件修理代码
	private String partsRepairCode;
	// 部件修理分类
	private String partsRepairTypeLang;
	// 损坏代码
	private String damageCode;
	// 材质代码
	private String materialCode;
	// 默认材质代码
	private String selectMaterialCode;

	public Integer getCodeId() {
		return codeId;
	}

	public void setCodeId(Integer codeId) {
		this.codeId = codeId;
	}

	public String getContainerCategoryLang() {
		return containerCategoryLang;
	}

	public void setContainerCategoryLang(String containerCategoryLang) {
		this.containerCategoryLang = containerCategoryLang;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getPartsTypeCode() {
		return partsTypeCode;
	}

	public void setPartsTypeCode(String partsTypeCode) {
		this.partsTypeCode = partsTypeCode;
	}

	public String getPartsDetailsCode() {
		return partsDetailsCode;
	}

	public void setPartsDetailsCode(String partsDetailsCode) {
		this.partsDetailsCode = partsDetailsCode;
	}

	public String getRepairCode() {
		return repairCode;
	}

	public void setRepairCode(String repairCode) {
		this.repairCode = repairCode;
	}

	public String getPartsRepairCode() {
		return partsRepairCode;
	}

	public void setPartsRepairCode(String partsRepairCode) {
		this.partsRepairCode = partsRepairCode;
	}

	public String getDamageCode() {
		return damageCode;
	}

	public void setDamageCode(String damageCode) {
		this.damageCode = damageCode;
	}

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public String getSelectMaterialCode() {
		return selectMaterialCode;
	}

	public void setSelectMaterialCode(String selectMaterialCode) {
		this.selectMaterialCode = selectMaterialCode;
	}

	public String getPartsRepairTypeLang() {
		return partsRepairTypeLang;
	}

	public void setPartsRepairTypeLang(String partsRepairTypeLang) {
		this.partsRepairTypeLang = partsRepairTypeLang;
	}

}
