package com.sanlly.purchase.enums;

/**
 * 
* @Package com.sanlly.purchase.enums 
* @Description: 订单状态 
* @author jlx   
* @date 2019年9月4日 下午7:50:54 
* @version V1.0   
 */
public enum OrderStatusEnum {
	UNDELIVER("OrderStatusEnum0", "未发货"), PARTDELIVER("OrderStatusEnum1", "部分发货"), FINISH("OrderStatusEnum2", "完成"), SENDED("OrderStatusEnum3", "已发货");

	private String code;

	private String message;

	OrderStatusEnum() {
	}

	OrderStatusEnum(String code, String message) {
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
