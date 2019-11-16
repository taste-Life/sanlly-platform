package com.sanlly.purchase.enums;


/**   
* @Package com.sanlly.purchase.enums 
* @Description: 招标采购关联供应商类型 
* @author jlx   
* @date 2019年8月20日 下午6:03:19 
* @version V1.0   
*/
public enum PurchaseSupplierTypeEnum {
	INVITE("PurcSuppTypeEnum0", "邀请"), FIRSTTRIAL("PurcSuppTypeEnum1", "初审"), SIGN("PurcSuppTypeEnum2", "签到");
	
	private String code;

	private String message;

	PurchaseSupplierTypeEnum() {
	}

	PurchaseSupplierTypeEnum(String code, String message) {
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
