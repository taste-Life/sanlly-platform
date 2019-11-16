package com.sanlly.warehouse.enums;

/**
 * ClassName: TermEnum
 * Description:劳保使用期限
 * date: 2019/8/13 10:02
 *
 * @author zhh
 * 
 */
public enum TermEnum {
	IMMEDIATE(0,"即时"),HALFMOON(100,"半月"),ONEMOON(1,"一个月"),TWOMOON(2,"两个月"),THREEMOON(3,"三个月"),FOURMOON(4,"四个月"),SIXMOON(6,"六个月"),TENMOON(10,"十个月"),ONEYREA(12,"一年"),ONEHALFYEAR(118,"一年半"),TWOYEAR(24,"两年"),THREEYEAR(36,"三年"),FOURYEAR(48,"四年"),FIVEYEAR(60,"五年"),
	INFINITY(9999,"无限大");
    private Integer code;
    private String message;

    TermEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

	public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
