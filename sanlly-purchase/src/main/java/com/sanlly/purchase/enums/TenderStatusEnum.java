package com.sanlly.purchase.enums;


/**   
* @Package com.sanlly.purchase.enums 
* @Description: 招标状态 
* @author jlx   
* @date 2019年8月20日 上午11:28:42 
* @version V1.0   
*/
public enum TenderStatusEnum { 
	FAIL("TenderStatusEnum01", "流标"), SUCCESS("TenderStatusEnum02", "结束"), CANCEL("TenderStatusEnum03", "废标"), ING("TenderStatusEnum04", "进行中")
	,WAIT("TenderStatusEnum05","待开标");

	private String code;

	private String message;

	TenderStatusEnum() {
	}

	TenderStatusEnum(String code, String message) {
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
