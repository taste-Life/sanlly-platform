package com.sanlly.common.enums;

/**
 * 财务驳回原因
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月12日  
 * 驳回原因：实际收费客户错误；客户重新确认，调整金额；汇率调整；税率调整；其他。
 *
 */
public enum FinanceRejectEnum {
	 SJSFKHCW("LEFIREJECTENUM01","实际收费客户错误"),
	 KHCXQR("LEFIREJECTENUM02","客户重新确认"),
	 TZJE("LEFIREJECTENUM03","调整金额"),
	 TZHL("LEFIREJECTENUM04","汇率调整"),
	 TZSL("LEFIREJECTENUM05","税率调整"),
	 OTHER("LEFIREJECTENUM06","其他");
    private String code;
    private String message;
    
    FinanceRejectEnum() {

	}
    FinanceRejectEnum(String code, String message) {
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
