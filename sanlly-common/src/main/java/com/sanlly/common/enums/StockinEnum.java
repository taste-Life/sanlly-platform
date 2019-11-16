package com.sanlly.common.enums;

/**
 * ClassName: StockinEnum
 * Description: 入库状态枚举
 * date: 2019/8/6 10:41
 *
 * @author wannt
 * @since JDK 1.8
 */
public enum StockinEnum {
    NOIN("LEWASTOCKI001","未入库"),YESIN("LEWASTOCKI002","已入库"),PORTIONIN("LEWASTOCKI003","部分入库"),UNAUDIT("LEWASTOCKI004","已入库待审核");
    private String code;
    private String message;

    StockinEnum(String code, String message) {
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
