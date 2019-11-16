package com.sanlly.production.enums;

/**
 *    
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO 机组选件库存-类型
 * @author tianzhl   
 * @date 2019年10月30日 下午4:23:44 
 * @version V1.0   
 */
public enum SpareStockModuleEnum {
	/**
	 * 机组在航
	 */
	UNDERWAY("KESSTYPE01", "机组在航"),
	/**
	 * 机组保修
	 */
	GUARANTEE("KESSTYPE02", "机组保修"),
	/**
	 * 退租箱
	 */
	SURRENDER("KESSTYPE03", "退租箱"),
	/**
	 * 估价
	 */
	EVALUATE("KESSTYPE04", "估价"),
	/**
	 * 仓储出库
	 */
	STOCKOUT("KESSTYPE05", "仓储出库");

	private String code;

	private String message;

	SpareStockModuleEnum() {

	}

	SpareStockModuleEnum(String code, String message) {
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
