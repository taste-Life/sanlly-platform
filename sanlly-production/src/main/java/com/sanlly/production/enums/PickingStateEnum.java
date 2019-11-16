package com.sanlly.production.enums;

/**
 *    
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO 领料状态
 * @author tianzhl   
 * @date 2019年9月9日 下午6:48:54 
 * @version V1.0   
 */
public enum PickingStateEnum {
	/**
	 * 未领料
	 */
	NOPICKING("LEPICKING01", "未领料"),
	/**
	 * 已领料
	 */
	PICKINGED("LEPICKING02", "已领料"),
	/**
	 * 部分出库
	 */
	STOCKOUT("LEPICKING03", "部分出库"),
	/**
	 * 全部出库
	 */
	STOCKOUTALL("LEPICKING04", "全部出库"),
	/**
	 * 强制不出
	 */
	NOTSTOCKOUT("LEPICKING05", "强制不出"),
	/**
	 * 延期出库
	 */
	DELAYSTOCKOUT("LEPICKING06", "延期出库"),
	/**
	 * 已退库
	 */
	CANCELSTOCK("LEPICKING07", "已退库");

	private String code;

	private String message;

	PickingStateEnum() {

	}

	PickingStateEnum(String code, String message) {
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

	/**
	 * 根据值 获取枚举对象
	 * 
	 * @param value
	 * @return
	 */
	public static PickingStateEnum convertToEnum(String key) {
		for (PickingStateEnum examType : PickingStateEnum.values()) {
			if (key.equals(examType.getCode())) {
				return examType;
			}
		}
		return null;
	}
}
