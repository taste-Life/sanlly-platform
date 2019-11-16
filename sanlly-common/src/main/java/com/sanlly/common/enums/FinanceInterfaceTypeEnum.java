package com.sanlly.common.enums;

/**
 * 接口类别
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月10日  
 *
 */
public enum FinanceInterfaceTypeEnum {

	/**
	 * 服务销售收入
	 */
	InterfaceType01("S001", "服务销售收入"),
	/**
	 * 销售收入（备件、劳保）
	 */
	InterfaceType02("S002", "销售收入（备件、劳保）"),
	/**
	 * 销售成本（备件、劳保）
	 */
	InterfaceType03("S005", "销售成本（备件、劳保）"),
	/**
	 * 服务采购
	 */
	InterfaceType04("P001", "服务采购"),
	/**
	 * 物料采购
	 */
	InterfaceType05("P002", "物料采购"),
	/**
	 * 委托加工费采购
	 */
	InterfaceType06("P003", "委托加工费采购"),
	/**
	 * 物料采购财务调账
	 */
	InterfaceType07("P005", "物料采购财务调账"),
	/**
	 * 委托加工费调整
	 */
	InterfaceType08("P006", "委托加工费调整"),
	/**
	 * 国外采购关税
	 */
	InterfaceType09("P008", "国外采购关税"),
	/**
	 * 国外采购增值税
	 */
	InterfaceType10("P009", "国外采购增值税"),
	/**
	 * 生产领料
	 */
	InterfaceType11("T001", "生产领料"),
	/**
	 * 委托加工领料
	 */
	InterfaceType12("T002", "委托加工领料"),
	/**
	 * 委托加工完工
	 */
	InterfaceType13("T003", "委托加工完工"),
	/**
	 * 库存调整
	 */
	InterfaceType14("T004", "库存调整"),
	/**
	 * 盘盈
	 */
	InterfaceType15("T005", "盘盈"),
	/**
	 * 盘亏
	 */
	InterfaceType16("T006", "盘亏");
	
	FinanceInterfaceTypeEnum() {

	}

	FinanceInterfaceTypeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
	private String code;

	private String message;

	

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
