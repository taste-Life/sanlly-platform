package com.sanlly.common.utils;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**   
* @Package com.sanlly.common.utils 
* @Description: TODO 后端翻译字符串
* @author tianzhl   
* @date 2019年8月13日 下午6:51:10 
* @version V1.0   
*/
public class LangUtil {

	public static void main(String[] args) {
		String str = "{\"code\": 0,\"message\": null,\"data\": {\"remarksList\": [{\"key\": \"1\",\"remarksTypeLang\": \"testkey00001\",\"company\": \"sanlly\",\"remarksContent\": \"食品箱\",\"remarksContentEn\": \"食品箱\"},{\"key\": \"2\",\"remarksTypeLang\": \"testkey00001\",\"company\": \"sanlly\",\"remarksContent\": \"龙眼箱\",\"remarksContentEn\": \"龙眼箱\"},{\"key\": \"3\",\"remarksType\": \"testkey00001\",\"company\": \"sanlly\",\"remarksContent\": \"洗箱\",\"remarksContentEn\": \"洗箱\"},{\"key\": \"4\",\"remarksTypeLang\": \"testkey00001\",\"company\": \"sanlly\",\"remarksContent\": \"备注1\",\"remarksContentEn\": \"备注1\"},{\"key\": \"5\",\"remarksTypeLang\": \"testkey00001\",\"company\": \"sanlly\",\"remarksContent\": \"备注2\",\"remarksContentEn\": \"备注2\"}],\"shortcutList\": null,\"checkDetailList\": null}}";
		JSONObject jsonObj = JSON.parseObject(str);
//		System.err.println(langObject(jsonObj));
	}

	/** 
	* @Description: TODO 对象翻译后转为对象
	* @param body 翻译对象
	* @param isEnglish 是否英文
	* @return JSONObject 翻译后对象
	* @throws 
	*/
	public static JSONObject lang(Object body, Boolean isEnglish) {
		JSONObject jsonObj = JSON.parseObject(JSON.toJSONString(body));
		return JSON.parseObject(langObject(jsonObj, isEnglish));
	}

	/** 
	* @Description: TODO  翻译对象
	* @param Obj 对象
	* @param isEnglish 是否英文
	* @return String 翻译后对象字符串
	* @throws 
	*/
	private static String langObject(JSONObject Obj, Boolean isEnglish) {
		String jsonstr = "";
		for (Map.Entry<String, Object> entry : Obj.entrySet()) {
			Object object = entry.getValue();
			String str = "\"" + entry.getKey() + "\":";
			if (object == null) {
				str += "null";
			} else if (JSONObject.class.equals(object.getClass())) {
				str += langObject((JSONObject) object, isEnglish);
			} else if (JSONArray.class.equals(object.getClass())) {
				str += langArray((JSONArray) object, isEnglish);
			} else {
				if (entry.getKey().endsWith("Lang")) {
					str = "\"" + entry.getKey().substring(0, entry.getKey().length() - 4) + "\":\""
							+ langValue(object.toString(), isEnglish) + "\"";
				} else {
					if (String.class.equals(object.getClass())) {
						str += "\"" + object.toString() + "\"";
					} else {
						str += object.toString();
					}
				}
			}
			jsonstr += str + ",";
		}
		if (jsonstr.endsWith(",")) {
			jsonstr = jsonstr.substring(0, jsonstr.length() - 1);
		}
		return "{" + jsonstr + "}";
	}

	/** 
	* @Description: TODO 翻译数组
	* @param array 数组
	* @param isEnglish 是否英文
	* @return String 翻译后数组字符串
	* @throws 
	*/
	private static String langArray(JSONArray array, Boolean isEnglish) {
		String arr = "";
		for (Object obj : array) {
			System.err.println(obj.getClass() + ":"+obj.toString());
			arr += langObject((JSONObject) obj, isEnglish) + ",";
		}
		if (arr.endsWith(",")) {
			arr = arr.substring(0, arr.length() - 1);
		}
		return "[" + arr + "]";
	}

	/** 
	* @Description: TODO 翻译单个key
	* @param key key
	* @param isEnglish 是否英文
	* @return String 翻译后字符串
	* @throws 
	*/
	private static String langValue(String key, Boolean isEnglish) {
		if (isEnglish) {
			return "ENGLISH";
		} else {
			return "中文";
		}
	}

}
