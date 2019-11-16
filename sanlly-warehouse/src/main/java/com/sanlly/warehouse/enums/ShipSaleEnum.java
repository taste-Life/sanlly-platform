package com.sanlly.warehouse.enums;

/**
 * ClassName: ShipSaleEnum
 * Description:
 * date: 2019/9/17 13:27
 *
 * @author wannt
 * @since JDK 1.8
 */
public enum ShipSaleEnum {
    SUBMIT("LEWASHIPSALE01","已提交"),AFFIRM("LEWASHIPSALE02","已确认"),PORTIONOUT("LEWASHIPSALE03","部分出库"),ALLOUT("LEWASHIPSALE04","全部出库"),RATE("LEWASHIPSALE05","汇率确认"),RETURN("LEWASHIPSALE06","部分退库"),ALLRETURN("LEWASHIPSALE07","全部退库"),CANCEL("LEWASHIPSALE08","已取消");
    private String code;
    private String message;

    ShipSaleEnum(String code, String message) {
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
