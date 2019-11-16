package com.sanlly.production.enums;

/**
 *    
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO 退租箱-退租计划状态
 * @author tianzhl   
 * @date 2019年10月21日 上午10:42:53 
 * @version V1.0   
 */
public enum SurrenderPlanStateEnum {
	/**
	 * 未进场
	 */
	NOT("LESURDPLANSTAT01", "未进场"),
	/**
	 * 部分进场
	 */
	PART("LESURDPLANSTAT02", "部分进场"),
	/**
	 * 全部进场
	 */
	ALL("LESURDPLANSTAT03", "全部进场"),
	/**
	 * 完成
	 */
	FINISH("LESURDPLANSTAT04", "完成");

	private String code;

	private String message;

	SurrenderPlanStateEnum() {

	}

	SurrenderPlanStateEnum(String code, String message) {
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
