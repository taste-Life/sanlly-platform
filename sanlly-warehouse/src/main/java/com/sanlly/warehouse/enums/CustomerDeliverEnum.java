package com.sanlly.warehouse.enums;

/**
 * @author lishzh
 */
public enum CustomerDeliverEnum {

    OUTED("LECUSTDELI01","出库完毕"),
    NOT_OUT("LECUSTDELI02","出库待审核");


    private String code;

    private String message;

    CustomerDeliverEnum(String code, String message) {
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
