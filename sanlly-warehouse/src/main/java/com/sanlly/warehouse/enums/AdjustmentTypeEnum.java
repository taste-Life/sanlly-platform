package com.sanlly.warehouse.enums;

public enum AdjustmentTypeEnum {

    NUM("AdjustmentTypeEnum1","调整数量"),WARETYPE("AdjustmentTypeEnum2","调整仓库类型"),TARIFF("AdjustmentTypeEnum3","调整关税")
    ,VAT("AdjustmentTypeEnum4","调整增值税"),FREIGHT("AdjustmentTypeEnum5","调整运费"),INVOICE("AdjustmentTypeEnum6","调整发票类型");

    private String code;
    private String message;

    AdjustmentTypeEnum() {
    }

    AdjustmentTypeEnum(String code, String message) {
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
