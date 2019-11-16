package com.sanlly.warehouse.enums;

/**
 * 退件来源(修理件来源)
 *
 * @author lishzh
 */
public enum ReturnSourceEnum {

    REPAIR("LERETURNSOURCE01", "维修退件"),
    GUARANTEE("LERETURNSOURCE02", "保修退件"),
    ORIGINAL("LERETURNSOURCE03", "原件维修"),
    PURCHASE("LERETURNSOURCE04", "采购旧件"),
    DELIVER("LERETURNSOURCE05", "送修");


    private String code;

    private String message;

    private ReturnSourceEnum(String code, String message) {
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
