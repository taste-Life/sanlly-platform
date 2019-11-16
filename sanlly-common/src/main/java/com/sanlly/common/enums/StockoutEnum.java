package com.sanlly.common.enums;

/**
 * ClassName: StockoutEnum
 * Description: 出库状态枚举
 * date: 2019/8/5 19:29
 *
 * @author wannt
 * @since JDK 1.8
 */
public enum StockoutEnum {
    NOTOUT("LEWASTOCKO001","未出库"),YESOUT("LEWASTOCKO002","已出库"),PORTIONOUT("LEWASTOCKO003","部分出库"),RETURN("LEWASTOCKO004","全部退库"),PORTIONRETURN("LEWASTOCKO005","部分退库");
    private String code;
    private String message;

    StockoutEnum(String code, String message) {
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
