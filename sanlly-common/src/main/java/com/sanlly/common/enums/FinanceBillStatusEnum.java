package com.sanlly.common.enums;

/**
 * 	账单状态 枚举
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年8月9日  
* 1、已生成 2待审核 3已审核 4已驳回 5财务驳回
 */
public enum FinanceBillStatusEnum {
	  
	/**
	 *	已生成
	 */
	CREATE("LEFIBILLSTATUS01","已生成"),
	/**
	 *	待审核
	 */
	NOAUDITOR("LEFIBILLSTATUS02","待审核"),
	/**
	 *	已审核
	 */
	AUDITOR("LEFIBILLSTATUS03","已审核"),
	/**
	 *	已驳回
	 */
	BILLRETURN("LEFIBILLSTATUS04","已驳回"),
	/**
	 *	财务驳回
	 */
	FINANCERETURN("LEFIBILLSTATUS05","财务驳回");
	
    private String code;
    private String message;

    FinanceBillStatusEnum(String code, String message) {
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
