package com.sanlly.production.models.input.rate;

import java.util.List;

import com.sanlly.production.models.output.rate.SelectItemOutput;

/**
 * 代码对应新增实体
 * 
 * @Package com.sanlly.production.models.input.rate 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月28日 下午1:33:59 
 * @version V1.0   
 */
public class AddCode {
	// 箱类别
	private String containerCategory;
	// 位置代码
	private String positionCode;
	// 部件大类
	private String partsTypeCode;
	// 部件明细
	private String partsDetailsCode;
	// 维修代码
	private String repairCode;
	// 部件维修代码
	private String partsRepairCode;
	// 部件维修类型
	private String partsRepairType;
	// 损坏代码
	private List<SelectItemOutput> damageCode;
	// 材质代码
	private List<SelectItemOutput> materialCode;
	// 默认材质代码
	private String selectMaterialCode;
	// 是否广州使用
	private String isGuangZhou;

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
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

	public String getPartsRepairType() {
		return partsRepairType;
	}

	public void setPartsRepairType(String partsRepairType) {
		this.partsRepairType = partsRepairType;
	}

	public List<SelectItemOutput> getDamageCode() {
		return damageCode;
	}

	public void setDamageCode(List<SelectItemOutput> damageCode) {
		this.damageCode = damageCode;
	}

	public List<SelectItemOutput> getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(List<SelectItemOutput> materialCode) {
		this.materialCode = materialCode;
	}

	public String getSelectMaterialCode() {
		return selectMaterialCode;
	}

	public void setSelectMaterialCode(String selectMaterialCode) {
		this.selectMaterialCode = selectMaterialCode;
	}

	public String getIsGuangZhou() {
		return isGuangZhou;
	}

	public void setIsGuangZhou(String isGuangZhou) {
		this.isGuangZhou = isGuangZhou;
	}

}
