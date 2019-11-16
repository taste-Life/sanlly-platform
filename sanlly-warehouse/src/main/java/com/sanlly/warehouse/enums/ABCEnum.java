package com.sanlly.warehouse.enums;

/**
 * ClassName: ABCEnum
 * Description:
 * date: 2019/7/27 13:26
 *
 * @author wannt
 * @since JDK 1.8
 */
public enum ABCEnum {
    A(1,"A"),B(2,"B"),C(3,"C");

    private Integer code;
    private String message;

    ABCEnum() {
    }

    ABCEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
