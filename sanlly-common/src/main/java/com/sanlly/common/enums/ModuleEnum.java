package com.sanlly.common.enums;

/**
 * ClassName: ModuleEnum
 * Description:
 * date: 2019/8/6 13:15
 *
 * @author wannt
 * @since JDK 1.8
 */
public enum ModuleEnum {
    WAREHOUSE("LEWAREMODULE001","仓储管理"),PRODUCTION("LEWAREMODULE002","生产维修"),PURCHASE("LEWAREMODULE003","集中采购");
    private String code;
    private String message;

    ModuleEnum(String code, String message) {
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
