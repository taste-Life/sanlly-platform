package com.sanlly.common.constants;

/**
 *   系统常量
 * @author 生旭鹏
 *
 */
public class PlatformConstants {

	/**
	 * 非删除标记
	 */
	public static final Integer ISDEL_NO=0;
	
	/**
	 * 已删除标记
	 */
	public static final Integer ISDEL_YES=1;
	
    /**
     * 项目的license
     */
    public static final String LICENSE = "made by sanlly";
	
	/**
	 * 非管理员
	 */
	public static final Integer IS_ADMIN_NO=0;
	
	/**
	 * 管理员
	 */
	public static final Integer IS_ADMIN_YES=1;
	
	/**
	 * 用户默认密码
	 */
	public static final String DEFAULT_PASSWORD="123456";
	
	/**
	 * session中用户信息的key
	 */
	public static final String SESSION_KEY_USER="user";
	
	/**
	 * 登陆的验证码长度4
	 */
	public static final Integer KAPTCHA_LENGTH=4;
	
	/**
	 * web登陆超时时间（秒）-30天
	 */
	public static final Long DEFAULT_TIMEOUT_WEB=2_592_000L;
	
	/**
	 * app登陆超时时间（秒）-10年
	 */
	public static final Long DEFAULT_TIMEOUT_APP=315_360_000L;
	
	/**
	 * 无需登录校验的url请求前缀
	 */
	public static final String[] ANONYMOUS_URL=new String[] {"/web/auth/kaptcha","/web/flow",
			"/web/prod/download","/web/auth/login","/web/auth/logout","/web/purc/suppliers/mailActivation","/web/purc/registersuppliers",
			"/web/prod/company/list","/web/prod/prodYard","/app/prod/login","/app/prod/companys","/web/prod/pti/export",
			"/web/purc/matterTenders/noticelist","/web/purc/matterTenders/detail","/web/purc/dailyTenders/detail",
			"/web/prod/inspectionDemand/select","/web/prod/qrcode","/app/prod/qrcode","/web/prod/pay/save","/web/purc/baseSelect","/web/prod/supplierSelect","/web/prod/pay/updatePayBackInfo"};

	/**
	 * 供应商注册菜单  流程标识用
	 */
	public static final String PurcSupplierReview_MenuCode="PurcSupplierReviewList";
	
	/**
	 * 采购审核菜单  流程标识用
	 */
	public static final String PurcAuditMatter_MenuCode="AuditMatterPurchase";
	
	/**
	 * 启用标记
	 */
	public static final Integer ISENABLED_NO=0;
	
	/**
	 * 禁用标记
	 */
	public static final Integer ISENABLED_YES=1;
	
	/**
	 * 坏机组变为好机组的提示删除条目代码
	 */
	public static final String MESSAGE_DEL_ENTRY="changeFail";
	
	
	/**
	 * 有效
	 */
	public static final Integer ISVALID_YES = 1;
	
	/**
	 * 无效
	 */
	public static final Integer ISVALID_NO = 0;
	
	/**
	 * 是总部
	 */
	public static final Integer ISHEAD_YES = 1;
	
	/**
	 * 非总部
	 */
	public static final Integer ISHEAD_NO = 0;
	
}
