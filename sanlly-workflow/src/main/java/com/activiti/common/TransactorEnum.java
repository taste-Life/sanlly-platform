package com.activiti.common;

public enum TransactorEnum {
	/**
	 * 本部门部长
	 */
	ACTIVITI_DEPT_MINISTER("ACTIVITI_DEPT_MINISTER","1"),
	/**
	 * 本部门总监
	 */
	ACTIVITI_DEPT_DIRECTOR("ACTIVITI_DEPT_DIRECTOR","2"),
	/**
	 * 总经理
	 */
	ACTIVITI_DEPT_GM("ACTIVITI_DEPT_GM","3"),
	/**
	 * 董事长
	 */
	ACTIVITI_DEPT_CHAIRMAN("ACTIVITI_DEPT_CHAIRMAN","4");
	
	// 成员变量  
    private String type;  
    private String url;  
    
    // 构造方法  
    private TransactorEnum(String type, String url) {  
        this.type = type;  
        this.url = url;  
    }  
    /**
     * 根据类型获取url
     * @param type
     * @return
     */
    public static String getUrl(String type) {  
        for (TransactorEnum c : TransactorEnum.values()) {  
            if (c.type == type) {  
                return c.url;  
            }  
        }  
        return null;  
    }
    
}
