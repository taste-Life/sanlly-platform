package com.sanlly.warehouse.models.input.tool;

import java.util.Date;

/**
 * 工具明细
 * 
 * @author lishzh
 *
 */
public class ToolDetailInput {

	private Integer wareToolApplyDetailId;// 明细表id

	private Integer wareToolApplyId;// 工具申请表id

	private String spareParts;// 备件

	private Integer userId;// 使用人

	private Integer liablePerson;// 责任人

	private Integer newLiablePerson;// 新责任人

	private String inDepartments;// 调入部门

	private String useDepartments;// 使用部门
	
	private String useDepartment;// 使用部门

	private String useType;// 使用类型

	private String distributeStatus;// 派发状态

	private Double sparePartsNum;// 工具备件数量

	private Double scrapNum;// 报废数量

	private Date distributeDate;// 派发日期

	private Integer wareToolManageId;// 工具管理id

	private Double transferNum;// 调拨数量
	
	private Double outNum;// 出库
	
    private String sparePartsBatch;

	public String getUseDepartment() {
		return useDepartment;
	}

	public void setUseDepartment(String useDepartment) {
		this.useDepartment = useDepartment;
	}

	public String getSparePartsBatch() {
		return sparePartsBatch;
	}

	public void setSparePartsBatch(String sparePartsBatch) {
		this.sparePartsBatch = sparePartsBatch;
	}

	public Double getOutNum() {
		return outNum;
	}

	public void setOutNum(Double outNum) {
		this.outNum = outNum;
	}

	public Double getTransferNum() {
		return transferNum;
	}

	public void setTransferNum(Double transferNum) {
		this.transferNum = transferNum;
	}

	public Integer getWareToolManageId() {
		return wareToolManageId;
	}

	public void setWareToolManageId(Integer wareToolManageId) {
		this.wareToolManageId = wareToolManageId;
	}

	public Integer getWareToolApplyDetailId() {
		return wareToolApplyDetailId;
	}

	public void setWareToolApplyDetailId(Integer wareToolApplyDetailId) {
		this.wareToolApplyDetailId = wareToolApplyDetailId;
	}

	public Integer getWareToolApplyId() {
		return wareToolApplyId;
	}

	public void setWareToolApplyId(Integer wareToolApplyId) {
		this.wareToolApplyId = wareToolApplyId;
	}

	public String getSpareParts() {
		return spareParts;
	}

	public void setSpareParts(String spareParts) {
		this.spareParts = spareParts;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getLiablePerson() {
		return liablePerson;
	}

	public void setLiablePerson(Integer liablePerson) {
		this.liablePerson = liablePerson;
	}

	public Integer getNewLiablePerson() {
		return newLiablePerson;
	}

	public void setNewLiablePerson(Integer newLiablePerson) {
		this.newLiablePerson = newLiablePerson;
	}


	public String getInDepartments() {
		return inDepartments;
	}

	public void setInDepartments(String inDepartments) {
		this.inDepartments = inDepartments;
	}

	public String getUseDepartments() {
		return useDepartments;
	}

	public void setUseDepartments(String useDepartments) {
		this.useDepartments = useDepartments;
	}

	public String getUseType() {
		return useType;
	}

	public void setUseType(String useType) {
		this.useType = useType;
	}

	public String getDistributeStatus() {
		return distributeStatus;
	}

	public void setDistributeStatus(String distributeStatus) {
		this.distributeStatus = distributeStatus;
	}

	public Double getSparePartsNum() {
		return sparePartsNum;
	}

	public void setSparePartsNum(Double sparePartsNum) {
		this.sparePartsNum = sparePartsNum;
	}

	public Double getScrapNum() {
		return scrapNum;
	}

	public void setScrapNum(Double scrapNum) {
		this.scrapNum = scrapNum;
	}

	public Date getDistributeDate() {
		return distributeDate;
	}

	public void setDistributeDate(Date distributeDate) {
		this.distributeDate = distributeDate;
	}

}
