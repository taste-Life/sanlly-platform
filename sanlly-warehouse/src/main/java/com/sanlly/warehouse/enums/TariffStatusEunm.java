package com.sanlly.warehouse.enums;

/**
 * ClassName: TariffStatusEunm
 * Description: 关税状态枚举
 * date: 2019/7/30 10:33
 *
 * @author wannt
 * @since JDK 1.8
 */
public enum TariffStatusEunm {
    PROVISIONAL("LEWATARIFF001","暂估"),KNOW("LEWATARIFF002","已知"),NONE("LEWATARIFF003","没有");

    private String code;

    private String message;

    TariffStatusEunm(String code, String message) {
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
