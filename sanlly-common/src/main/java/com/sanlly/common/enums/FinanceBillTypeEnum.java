package com.sanlly.common.enums;

/**
 * 账单类型 枚举  同步数据库账单类型表数据
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年8月9日  
*
 */
public enum FinanceBillTypeEnum {
	//收入 INCOME
	//成本 COST
	//PTI账单
	/**
	 * 现场收费账单
	 */
	XCSFZD("LKFIBITYPE000001","现场收费账单"),
	/**
	 * 冷箱修理账单
	 */
	LXXLZD("LKFIBITYPE000002","冷箱修理账单"),
	/**
	 * 干箱修理账单
	 */
	GXXLZD("LKFIBITYPE000003","干箱修理账单"),
	/**
	 *保修账单
	 */
	BXXLZD("LKFIBITYPE000004","保修账单"),
	/**
	 *PTI账单
	 */
	PTIZD("LKFIBITYPE000005","PTI账单"),
	/**
	 *劳务外包账单
	 */
	LWWBZD("LKFIBITYPE000006","劳务外包账单"),
	/**
	 *送修账单
	 */
	SXZD("LKFIBITYPE000007","送修账单"),
	/**
	 *挂衣箱账单
	 */
	GYXZD("LKFIBITYPE000008","挂衣箱账单"),
	/**
	 *新箱账单
	 */
	XXZD("LKFIBITYPE000009","新箱账单"),
	/**
	 *租赁账单
	 */
	ZLZD("LKFIBITYPE000010","租赁账单"),
	/**
	 *通用账单
	 */
	TYZD("LKFIBITYPE000011","通用账单"),
	/**
	 *运输费账单
	 */
	YSZD("LKFIBITYPE000012","运输费账单"),
	/**
	 *成本维修账单
	 */
	CBWXZD("LKFIBITYPE000013","成本维修账单");
	
 	
	
    private String code;
    private String message;

    FinanceBillTypeEnum(String code, String message) {
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
