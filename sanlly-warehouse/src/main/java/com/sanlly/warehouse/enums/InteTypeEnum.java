package com.sanlly.warehouse.enums;

/**
 * 
* @Package com.sanlly.warehouse.enums 
* @Description: 接口类别 
* @author jlx   
* @date 2019年10月21日 上午11:49:41 
* @version V1.0   
 */
public enum InteTypeEnum {
	P002("P002","物料采购"),P003("P003","委托加工费采购");

    private String code;
    private String message;

    InteTypeEnum() {
    }

    InteTypeEnum(String code, String message) {
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
