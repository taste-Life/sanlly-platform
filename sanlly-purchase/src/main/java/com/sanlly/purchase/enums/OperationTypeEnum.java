package com.sanlly.purchase.enums;

import org.apache.commons.lang.StringUtils;

/**
 * @Description: TODO
 * @ClassName: OperationTypeEnum
 * @Date: 2019/10/24 10:08
 * @Version 1.0
 * @Author mqz
 */
public enum  OperationTypeEnum {


    OperationTypeEnum01("OperationTypeEnum01", "加入"),
    OperationTypeEnum02("OperationTypeEnum02", "移除");



    private String code;

    private String message;

    OperationTypeEnum() {
    }

    OperationTypeEnum(String code, String message) {
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
    public static OperationTypeEnum getOperationTypeEnumByCode(String code){
        for(OperationTypeEnum operationTypeEnum : OperationTypeEnum.values()){
            if(StringUtils.equals(code, operationTypeEnum.getCode())){
                return operationTypeEnum;
            }
        }
        return null;
    }
}
