package com.sanlly.common.enums;

/**
 * 	调账方式 枚举
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年8月9日  
* 1全额冲回 2全额调账 
 */
public enum FinanceModifyBillTypeEnum {
	  
	/**
	 *	全额冲回
	 */
	FullReturn("LEFIMBILLTYPES01","全额冲回"),
	/**
	 *	全额调账
	 */
	FullAdjustment("LEFIMBILLTYPE02","全额调账");
	
    private String code;
    private String message;

    FinanceModifyBillTypeEnum(String code, String message) {
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
