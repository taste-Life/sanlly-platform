package com.sanlly.purchase.enums;

/**
 * @Description: TODO
 * @ClassName: SupplierStatusEnum
 * @Date: 2019/10/28 10:51
 * @Version 1.0
 * @Author mqz
 */
public enum  SupplierStatusEnum {
    ENABLE("ENABLE","使用中"),DISABLE("DISABLE","不可用");
    private String code;

    private String message;

    SupplierStatusEnum() {
    }

    SupplierStatusEnum(String code, String message) {
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
