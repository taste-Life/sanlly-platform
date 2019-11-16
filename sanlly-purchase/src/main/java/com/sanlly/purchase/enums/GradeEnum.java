package com.sanlly.purchase.enums;

import org.apache.commons.lang.StringUtils;

/**
 * 
* Description: 
* @ClassName: GradeEnum
* @date 2019年9月4日
*
* @author mx
 */
public enum GradeEnum {
	GradeA("GradeEnumA", "A级-战略供应商"),
	GradeB("GradeEnumB", "B级-优质供应商"),
	GradeC("GradeEnumC", "C级-普通供应商"),
	GradeD("GradeEnumD", "D级-消极供应商"),
	GradeE("GradeEnumE", "E级-淘汰供应商");

	private String code;

	private String message;

	
	GradeEnum(String code, String message) {
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

	public static GradeEnum getGradeEnumEnumByCode(String code){
		for(GradeEnum gradeEnum : GradeEnum.values()){
			if(StringUtils.equals(code, gradeEnum.getMessage())){
				return gradeEnum;
			}
		}
		return null;
	}
}
