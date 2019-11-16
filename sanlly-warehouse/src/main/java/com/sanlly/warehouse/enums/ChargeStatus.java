package com.sanlly.warehouse.enums;

/**
 * ClassName: ChargeStatus
 * Description:
 * date: 2019/8/22 15:25
 *
 * @author wannt
 * @since JDK 1.8
 */
public enum ChargeStatus {
    NO("LEWACHARGEEN01","未收费"),ALL("LEWACHARGEEN02","全部收费"),PART("LEWACHARGEEN03","部分收费");
    private String code;
    private String message;

    ChargeStatus(String code, String message) {
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
