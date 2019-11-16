package com.sanlly.warehouse.enums;

/**
 * ClassName: ReturnEnum
 * Description:
 * date: 2019/9/16 10:37
 *
 * @author wannt
 * @since JDK 1.8
 */
public enum ReturnEnum {
    NO("LEWARETURN001","未退货"),YES("LEWARETURN002","已退货");
    private String code;

    private String message;

    ReturnEnum(String code, String message) {
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
