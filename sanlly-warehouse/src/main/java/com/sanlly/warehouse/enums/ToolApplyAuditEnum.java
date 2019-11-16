package com.sanlly.warehouse.enums;

/**
 * 工具申请审核状态枚举
 * @author lishzh
 *
 */
public enum ToolApplyAuditEnum {
	
	NOT_COMMIT("LETOOLAPPLYAUDIT01","未提交"),
	COMMITED("LETOOLAPPLYAUDIT02","已提交"),
	DEPARTMENT_REJECTED("LETOOLAPPLYAUDIT03","部门驳回"),
	DEPARTMENT_AUDITED("LETOOLAPPLYAUDIT04","部门已审核"),
	SUPERVISOR_AUDITED("LETOOLAPPLYAUDIT05","主管已审核");
	
	private String code;

	private String message;
	
	private ToolApplyAuditEnum() {
		// TODO Auto-generated constructor stub
	}
	

	private ToolApplyAuditEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
