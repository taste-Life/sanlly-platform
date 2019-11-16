package com.sanlly.finance.utils;

import com.alibaba.druid.util.StringUtils;

/**
 * 各种编号生成
* @Package com.sanlly.finance.utils 
* @Description: TODO 
* @author fjy   
* @date 2019年9月7日 上午11:32:45 
* @version V1.0   
 */
public class CodeUtil {

	/**
	 * 根据账单号和  版本号生成新的账单号
	* @Description: TODO 
	* @param billCode
	* @param versionNo
	* @return String  账单号+T01
	* @throws 
	 */
	public static String getVersionBillCode(String billCode,String versionNo) {
		String result=billCode;
		String vNo="T";
		if(!StringUtils.isEmpty(versionNo)) {
			//小于10 拼接0   
			if(Integer.parseInt(versionNo)<10) {
				vNo=vNo+"0"+Integer.parseInt(versionNo);
			}else {
				vNo=vNo+Integer.parseInt(versionNo);
			}
			result=billCode+vNo;
		}
		
		return result;
		
	}
}
