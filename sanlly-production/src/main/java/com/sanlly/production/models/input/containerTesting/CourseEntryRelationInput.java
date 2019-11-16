package com.sanlly.production.models.input.containerTesting;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.containerTesting 
 * @Description: TODO 进场明细条目查询实体-输入
 * @author tianzhl   
 * @date 2019年8月22日 上午9:05:14 
 * @version V1.0   
 */
public class CourseEntryRelationInput {

	// TODO 箱类别
	private String containerCategory;

	// TODO 位置代码
	private String positionCode;

	// TODO 部件
	private String partsTypeCode;

	// TODO 部件修理
	private String partsRepairCode;

	// TODO 部件明细
	private String partsDetailsCode;

	// TODO 修理
	private String repairCode;
	
	//修理名称或代码
	private String repaireName;

	public CourseEntryRelationInput() {
		super();
	}

	public CourseEntryRelationInput(String containerCategory, String positionCode, String partsTypeCode,
			String partsRepairCode, String partsDetailsCode, String repairCode) {
		super();
		this.containerCategory = containerCategory;
		this.positionCode = positionCode;
		this.partsTypeCode = partsTypeCode;
		this.partsRepairCode = partsRepairCode;
		this.partsDetailsCode = partsDetailsCode;
		this.repairCode = repairCode;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getPartsTypeCode() {
		return partsTypeCode;
	}

	public void setPartsTypeCode(String partsTypeCode) {
		this.partsTypeCode = partsTypeCode;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getPartsRepairCode() {
		return partsRepairCode;
	}

	public void setPartsRepairCode(String partsRepairCode) {
		this.partsRepairCode = partsRepairCode;
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

	public String getRepaireName() {
		return repaireName;
	}

	public void setRepaireName(String repaireName) {
		this.repaireName = repaireName;
	}

}
