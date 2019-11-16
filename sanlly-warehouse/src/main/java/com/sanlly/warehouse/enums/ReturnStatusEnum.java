package com.sanlly.warehouse.enums;

/**
 * @author lishzh
 */
public enum ReturnStatusEnum {

    NOT_RETURN("RETURNSTATUS01", "未退件"),
    RETURNED("RETURNSTATUS02", "已退件");


    private String code;

    private String message;

    private ReturnStatusEnum(String code, String message) {
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
