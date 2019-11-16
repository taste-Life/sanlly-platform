package com.sanlly.warehouse.enums;

/**
 * ClassName: DateEnum
 * Description: 询价周期
 * date: 2019/7/26 17:54
 *
 * @author wannt
 * @since JDK 1.8
 */
public enum DateEnum {
    QUARTER("LEWAREDATEEN01","季度"),HALFYEAR("LEWAREDATEEN02","半年"),YEAR("LEWAREDATEEN03","年");
    private String code;
    private String message;

    DateEnum(String code, String message) {
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
