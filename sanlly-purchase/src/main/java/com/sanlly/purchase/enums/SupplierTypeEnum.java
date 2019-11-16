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
public enum SupplierTypeEnum {
	SupplierTypeEnumA("SupplierTypeEnumA", "集团黑名单"),
	SupplierTypeEnumB("SupplierTypeEnumB", "公司黑名单"),
	SupplierTypeEnumC("SupplierTypeEnumC","特殊关联企业"),
	SupplierTypeEnumD("SupplierTypeEnumD","淘汰供应商");
	private String code;

	private String message;

	
	SupplierTypeEnum(String code, String message) {
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
	public static SupplierTypeEnum getSupplierTypeEnumByCode(String code){
		for(SupplierTypeEnum supplierTypeEnum : SupplierTypeEnum.values()){
			if(StringUtils.equals(code, supplierTypeEnum.getCode())){
				return supplierTypeEnum;
			}
		}
		return null;
	}

}
