package com.sanlly.common.enums;

/**
 * 	调账状态 枚举
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年8月9日  
* 1全额冲回 2全额调账 3调账驳回 4调账待审核 5调账已审核 
 */
public enum FinanceModifyBillEnum {
	  
	/**
	 *	全额冲回
	 */
	FullReturn("LEFIMBILLSTATUS01","已冲回"),
	/**
	 *	全额调账
	 */
	FullAdjustment("LEFIMBILLSTATUS02","全额调账"),
	/**
	 *	调账驳回
	 */
	AdjustmentReturn("LEFIMBILLSTATUS03","调账驳回"),
	/**
	 *	调账已审核
	 */
	AdjustmentAudit("LEFIMBILLSTATUS04","调账已审核");
	
    private String code;
    private String message;

    FinanceModifyBillEnum(String code, String message) {
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
