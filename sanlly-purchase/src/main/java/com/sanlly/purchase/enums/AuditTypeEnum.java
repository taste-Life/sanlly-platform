package com.sanlly.purchase.enums;

/**
 * @Description: TODO
 * @ClassName: AuditTypeEnum
 * @Date: 2019/10/24 16:30
 * @Version 1.0
 * @Author mqz
 */
public enum  AuditTypeEnum {
    AuditTypeEnum01("AuditTypeEnum01", "注册审核"),
    AuditTypeEnum02("AuditTypeEnum02", "加入黑名单审核"),
    AuditTypeEnum03("AuditTypeEnum03", "移除黑名单审核"),
    AuditTypeEnum04("AuditTypeEnum04", "加入淘汰审核"),
    AuditTypeEnum05("AuditTypeEnum05", "移除淘汰审核");

    private String code;

    private String message;

    AuditTypeEnum() {
    }

    AuditTypeEnum(String code, String message) {
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
