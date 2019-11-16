package com.sanlly.production.utils;

import java.math.BigDecimal;

import com.sanlly.common.constants.PayConstants;
import com.sanlly.common.utils.MD5Util;
import com.sanlly.production.service.impl.BaseServiceImpl;


/**
 * 支付工具类（通联）
 * @author zhangkai
 *
 */
public class PayUtil extends BaseServiceImpl{
	
	/**
	 * 获取生成支付二维码所需的url
	 * @param qrcode_no 二维码编码
	 * @param oid 订单号
	 * @param amt 支付金额
	 * @return
	 */
	public static String getQrCodeStr(String qrcodeNo, String oid, String amt) {
		// 将金额乘以100（即以分为单位），去掉小数位
		amt = new BigDecimal(amt).multiply(new BigDecimal(100)).stripTrailingZeros().toPlainString();
		// 按ASCII码顺序拼接字符串
		String asciiStr = "amt="+amt+"&appid="+PayConstants.APPID+"&c="+qrcodeNo+"&key="+PayConstants.KEY+"&oid="+oid;
		System.out.println(asciiStr);
		// 生成签名，签名规则对ASCII码字符串进行MD5加密，然后转换为全大写
		String signValue = MD5Util.getMD5(asciiStr).toUpperCase();
		// 拼接生成二维码所需的字符串
		String qrCodeStr = PayConstants.PREFIX+"?appid="+PayConstants.APPID+"&c="+qrcodeNo+"&oid="+oid+"&amt="+amt+"&sign="+signValue;
		// 控制台输出
		System.out.println("qrCodeStr: "+qrCodeStr);
		// 返回生成支付二维码需要的字符串
		return qrCodeStr;
	}
	
	public static void main(String[] args) {
		getQrCodeStr("EQBDVsfn", "10001", "0.01");
	}
}
