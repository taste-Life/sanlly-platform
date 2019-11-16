package com.sanlly.warehouse.enums;

/**
 * @author lishzh
 */
public enum RepairTypeEnum {

    DELIVER("LEREPAIRTYPE01", "送修件"),
    OTHER("LEREPAIRTYPE02", "待修件");


    private String code;

    private String message;

    private RepairTypeEnum(String code, String message) {
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
