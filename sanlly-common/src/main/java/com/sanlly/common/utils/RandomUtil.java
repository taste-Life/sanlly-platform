package com.sanlly.common.utils;

public class RandomUtil {
	
	public static String createRandomKaptcha(int length) {
		String retStr = "";
		String strTable = "1234567890abcdefghijkmnpqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int len = strTable.length();
		boolean bDone = true;
		do {
			retStr = "";
			int count = 0;
			for (int i = 0; i < length; i++) {
				double dblR = Math.random() * len;
				int intR = (int) Math.floor(dblR);
				char c = strTable.charAt(intR);
				if (('0' <= c) && (c <= '9')) {
					count++;
				}
				retStr += strTable.charAt(intR);
			}
			if (count >= 2) {
				bDone = false;
			}
		} while (bDone);

		return retStr;
	}

	/**
	 * @Description 创建指定数量的随机字符串
	 * @param numberFlag true纯数字 false数字加字母
	 * @param length 长度
	 * @return String 返回指定长度的随机数字
	 * @author SUNBIN
	 * @date 2017年9月27日
	 */
	public static String createRandom(boolean numberFlag, int length) {
		String retStr = "";
		String strTable = numberFlag ? "1234567890" : "1234567890abcdefghijkmnpqrstuvwxyz";
		int len = strTable.length();
		boolean bDone = true;
		do {
			retStr = "";
			int count = 0;
			for (int i = 0; i < length; i++) {
				double dblR = Math.random() * len;
				int intR = (int) Math.floor(dblR);
				char c = strTable.charAt(intR);
				if (('0' <= c) && (c <= '9')) {
					count++;
				}
				retStr += strTable.charAt(intR);
			}
			if (count >= 2) {
				bDone = false;
			}
		} while (bDone);

		return retStr;
	}

	/**
	 * @Description 创建指定长度的数字类型随机数
	 * @param length 长度
	 * @return String 指定长度的随机数
	 * @author SUNBIN
	 * @date 2017年9月27日
	 */
	public static String createRandom(int length) {
		return createRandom(true, length);
	}
}
