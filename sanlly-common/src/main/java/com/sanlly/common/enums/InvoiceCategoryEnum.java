package com.sanlly.common.enums;

/**
 * 
* @Package com.sanlly.warehouse.enums 
* @Description: 发票分类
* @author jlx   
* @date 2019年10月21日 上午11:49:41 
* @version V1.0   
 */
public enum InvoiceCategoryEnum {
	TAX("InvoiceCategoryEnum0","增值税"),GENERAL("InvoiceCategoryEnum1","普票");

    private String code;
    private String message;

    InvoiceCategoryEnum() {
    }

    InvoiceCategoryEnum(String code, String message) {
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
