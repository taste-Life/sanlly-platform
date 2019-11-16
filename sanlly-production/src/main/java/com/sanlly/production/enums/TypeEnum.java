package com.sanlly.production.enums;

/**
 * @author zhq
 * @date 2019/10/29
 * @description
 */
public enum TypeEnum {
    OUTSOURCING("TypeEnumOutSourcing", "外包"),
    SELF_SUPPORT("TypeEnumSelfSupport", "自营");
    private final String code;
    private final String message;

    TypeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
