package com.sanlly.warehouse.models.input.transfer;

import java.util.List;

public class EditTransferInput extends AddTransferInput {

	private Integer wareTransferId;

	private List<Integer> ids;

	private String auditStatus;

	private String reasonsRejection;

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
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

	public Integer getWareTransferId() {
		return wareTransferId;
	}

	public void setWareTransferId(Integer wareTransferId) {
		this.wareTransferId = wareTransferId;
	}

}
