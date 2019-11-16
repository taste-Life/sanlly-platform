package com.sanlly.purchase.enums;

/**
 * @Description: TODO
 * @ClassName: RegistrationMethodEnum
 * @Date: 2019/10/21 10:12
 * @Version 1.0
 * @Author mqz
 */
public enum  RegistrationMethodEnum {
    ACTIVE("RegistrationEnum0", "主动注册"), PASSIVE("RegistrationEnum1", "管理员注册")
    ,IMPORT("RegistrationEnum2", "批量导入");

    private String code;

    private String message;

    RegistrationMethodEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    RegistrationMethodEnum() {
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
