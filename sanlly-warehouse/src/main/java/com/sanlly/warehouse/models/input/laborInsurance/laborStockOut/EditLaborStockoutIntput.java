package com.sanlly.warehouse.models.input.laborInsurance.laborStockOut;

/**
 * ClassName: EditLaborStockoutIntput
 * Description: 修改劳保出库单输入类
 * date: 2019/9/5 14:14
 *
 * @author zhh
 */
public class EditLaborStockoutIntput {
	//出库单id
    private Integer wareStockoutLabaorId;

    //出库状态
    private String stockoutStatus;

    //确认状态
    private String status;

    //是否已传sbs
    private String isStockSbs;

    //审核状态
    private String auditStatus;

    //驳回原因
    private String reasonsRejection;

    //领用部门
    private String receiveDepartment;

    //领用人
    private String receiveUser;

	public Integer getWareStockoutLabaorId() {
		return wareStockoutLabaorId;
	}

	public void setWareStockoutLabaorId(Integer wareStockoutLabaorId) {
		this.wareStockoutLabaorId = wareStockoutLabaorId;
	}

	public String getStockoutStatus() {
		return stockoutStatus;
	}

	public void setStockoutStatus(String stockoutStatus) {
		this.stockoutStatus = stockoutStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIsStockSbs() {
		return isStockSbs;
	}

	public void setIsStockSbs(String isStockSbs) {
		this.isStockSbs = isStockSbs;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getReasonsRejection() {
		return reasonsRejection;
	}

	public void setReasonsRejection(String reasonsRejection) {
		this.reasonsRejection = reasonsRejection;
	}

	public String getReceiveDepartment() {
		return receiveDepartment;
	}

	public void setReceiveDepartment(String receiveDepartment) {
		this.receiveDepartment = receiveDepartment;
	}

	public String getReceiveUser() {
		return receiveUser;
	}

	public void setReceiveUser(String receiveUser) {
		this.receiveUser = receiveUser;
	}
    

}
