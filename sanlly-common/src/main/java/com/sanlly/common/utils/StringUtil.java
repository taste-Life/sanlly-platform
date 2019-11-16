package com.sanlly.common.utils;

import java.math.BigDecimal;

public class StringUtil {

	/**
	 * @Description 创建指定长度的数字类型随机数
	 * @param length 长度
	 * @return String 指定长度的随机数
	 * @author SUNBIN
	 * @date 2017年9月27日
	 */
	public static String valueOf(Object object) {
		return object == null ? null : String.valueOf(object);
	}
	
	
	/** 
	* @Description: TODO Double 取整数字符串部分
	* @param obj
	* @return String
	* @throws 
	*/
	public static String doubleToIntString(Double obj) {
		return obj == null ? "0" : String.valueOf(obj.intValue());
	}
	
	/** 
	* @Description: TODO Double 取整数字符串部分
	* @param obj
	* @return String
	* @throws 
	*/
	public static String doubleToEffectString(Double obj) {
		if(obj == null) {
			return "0";
		}
		BigDecimal b = new BigDecimal(obj);  
	    //保留2位小数  
	    double result = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();  
		return String.valueOf(result);
	}
	
	/** 
	* @Description: TODO Double 取整数字符串部分
	* @param obj
	* @return String
	* @throws 
	*/
	public static String bigDecimalToEffectString(BigDecimal obj) {
		if(obj == null) {
			return "0";
		}
	    //保留2位小数  
	    double result = obj.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();  
		return String.valueOf(result);
	}
}
