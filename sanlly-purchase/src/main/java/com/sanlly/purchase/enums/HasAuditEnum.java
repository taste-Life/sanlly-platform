package com.sanlly.purchase.enums;

/**
 * @Description: TODO
 * @ClassName: HasAuditEnum
 * @Date: 2019/10/31 10:12
 * @Version 1.0
 * @Author mqz
 */
public enum  HasAuditEnum {
    AUDITED("AUDITED","已审核"),AUDITING("AUDITING","未审核");

    private String code;

    private String message;

    HasAuditEnum() {
    }

    HasAuditEnum(String code, String message) {
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
