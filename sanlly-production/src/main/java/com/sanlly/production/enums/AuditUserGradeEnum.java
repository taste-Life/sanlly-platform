package com.sanlly.production.enums;

/**
 * 检验员等级
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月30日 下午1:50:06 
 * @version V1.0   
 */
public enum AuditUserGradeEnum {
	/**
	 * A
	 */
	GRADE_A("A", "A"),
	/**
	 * B
	 */
	GRADE_B("B", "B"),
	/**
	 * C
	 */
	GRADE_C("C", "C");

	private String code;

	private String message;

	AuditUserGradeEnum() {

	}

	AuditUserGradeEnum(String code, String message) {
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
