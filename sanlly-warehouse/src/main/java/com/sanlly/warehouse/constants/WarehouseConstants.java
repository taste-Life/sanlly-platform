package com.sanlly.warehouse.constants;

/**
 * 仓储常量
 * 
 * @author lishzh
 *
 */
public class WarehouseConstants {

	/**
	 * 单据类型是否可见-不可见
	 */
	public static final Integer NOT_SHOW = 0;

	/**
	 * 单据类型是否可见-可见
	 */
	public static final Integer SHOW = 1;

	/**
	 * 确认状态-未确认
	 */
	public static final Integer CONFIRM_NO = 1;

	/**
	 * 确认状态-已确认
	 */
	public static final Integer CONFIRM_YES = 2;

	/**
	 * 劳保方案状态-无效
	 */
	public static final Integer ISVALID_NO = 0;

	/**
	 * 劳保方案状态-有效
	 */
	public static final Integer ISVALID_YES = 1;

	/********************** (标记备件调拨表数据所属类别常量) *********************/

	/**
	 * 备件调拨
	 */
	public static final Integer TRANSFER_CATEGORY_TRANSFER = 1;
	/**
	 * 库存移动
	 */
	public static final Integer TRANSFER_CATEGORY_MOVE = 2;
	/**
	 * 箱体下料
	 */
	public static final Integer TRANSFER_CATEGORY_XIALIAO = 3;

	/**
	 * 单据类型自增默认值
	 */
	public static final Integer DEFAULT_VALUE = 0;

	/********************** (标记借入借出表数据所属类别常量) *********************/
	/**
	 * 借入单
	 */
	public static final Integer BORROW_LEND_BORROW = 1;
	/**
	 * 借出单
	 */
	public static final Integer BORROW_LEND_LEND = 2;

	/******************************* 单据名称常量(生成单号等) ****************************** */

	/**
	 * 单据类型名称-工具申请单
	 */
	public static final String BILL_TOOL_APPLY = "工具申请单";
	/**
	 * 单据类型名称-调拨单
	 */
	public static final String BILL_TRANSFER = "调拨单";
	/**
	 * 单据类型名称-员工借件单
	 */
	public static final String BILL_STAFF_BORROW = "员工借件单";
	/**
	 * 单据类型名称-备件借入单
	 */
	public static final String BILL_BORROW = "备件借入单";
	/**
	 * 单据类型名称-备件借出单
	 */
	public static final String BILL_LEND = "备件借出单";
	/**
	 * 单据类型名称-委托加工单
	 */
	public static final String BILL_ENTRUST_PROCESS = "委托加工单";
	/**
	 * 单据类型名称-备件维修单
	 */
	public static final String BILL_REPAIR = "备件维修单";
	/**
	 * 单据类型名称-备件维修委托加工单
	 */
	public static final String BILL_REPAIR_EP = "备件维修委托加工单";
	/**
	 * 单据类型名称-送修出库单
	 */
	public static final String BILL_CUSTOMER_DELIVER = "送修件出库单";

	/******************************* int常量值 ****************************** */
	/**
	 * int常量值-0
	 */
	public static final int INT_ZERO = 0;

	/******************************* double常量值 ****************************** */
	/**
	 * double常量值-0.0
	 */
	public static final double DOUBLE_ZERO = 0.0;

	/**
	 * double常量值-1.0
	 */
	public static final double DOUBLE_ONE = 1.0;

	/******************************* 员工劳保类型常量 ****************************** */

	/**
	 * 劳保类型-通用型号
	 */
	public static final String COMMON_MODEL = "通用型号";
	/**
	 * 劳保类型-夏装
	 */
	public static final String SUMMER_WEAR = "夏装";
	/**
	 * 劳保类型-春秋装
	 */
	public static final String SPRING_AUTUMN_WEAR = "春秋装";
	/**
	 * 劳保类型-棉衣
	 */
	public static final String COTTON_PADDED_CLOTHES = "棉衣";
	/**
	 * 劳保类型-矮帮钢头鞋
	 */
	public static final String STEEL_HEADED_SHOES_SHORT = "矮帮钢头鞋";
	/**
	 * 劳保类型-高帮钢头鞋
	 */
	public static final String STEEL_HEADED_SHOES_HIGH = "高帮钢头鞋";
	/**
	 * 劳保类型-绝缘鞋
	 */
	public static final String INSULATING_SHOES = "绝缘鞋";
	/**
	 * 劳保类型-棉鞋
	 */
	public static final String COTTON_PADDED_SHOES = "棉鞋";
	/**
	 * 劳保类型-雨衣
	 */
	public static final String RAIN_COAT = "雨衣";
	/**
	 * 劳保类型-雨鞋
	 */
	public static final String RAIN_SHOES = "雨鞋";
}
