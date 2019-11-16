package com.sanlly.warehouse.enums;

/**
 * ClassName: DeliveryStatusEnum
 * Description: 送货状态枚举
 * date: 2019/9/4 10:31
 *
 * @author wannt
 * @since JDK 1.8
 */
public enum DeliveryStatusEnum {
    NO("LEWADELIVERY01","已提交"),NOTOUT("LEWADELIVERY02","待出库"),YESOUT("LEWADELIVERY03","全部出库"),PORTIONOUT("LEWADELIVERY04","部分出库"),YESIN("LEWADELIVERY06","已入库"),PORTIONIN("LEWADELIVERY07","部分入库");

    private String code;
    private String message;

    DeliveryStatusEnum(String code, String message) {
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
