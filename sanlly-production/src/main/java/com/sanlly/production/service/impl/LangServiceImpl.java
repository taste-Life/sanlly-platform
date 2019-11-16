package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.LanguageEnum;
import com.sanlly.common.models.input.lang.LangInput;
import com.sanlly.production.dao.LangCodeMapper;
import com.sanlly.production.dao.LangEnumMapper;
import com.sanlly.production.dao.LangKeyRuleMapper;
import com.sanlly.production.dao.LangKeyRuleMapperExt;
import com.sanlly.production.dao.LangMapper;
import com.sanlly.production.entity.LangCode;
import com.sanlly.production.entity.LangCodeExample;
import com.sanlly.production.entity.LangEnum;
import com.sanlly.production.entity.LangEnumExample;
import com.sanlly.production.entity.LangKeyRule;
import com.sanlly.production.entity.LangKeyRuleExample;
import com.sanlly.production.service.LangService;

/**
 *    
 * 
 * @Package com.sanlly.production.service 
 * @Description: TODO 国际化相关服务
 * @author tianzhl   
 * @date 2019年8月13日 下午7:09:55 
 * @version V1.0   
 */
@Service
public class LangServiceImpl implements LangService {

	private static Map<String, Map<String, String>> langDict;

	private static List<String> langCodeKeys;

	private static Object lockObj = new Object();

	@Autowired
	private LangKeyRuleMapperExt langKeyRuleDaoExt;

	@Autowired
	private LangKeyRuleMapper langKeyRuleDao;

	@Autowired
	private LangEnumMapper langEnumDao;

	@Autowired
	private LangCodeMapper langCodeDao;

	@Autowired
	private LangMapper LangDao;

	/**
	 *  
	 * 
	 * @Description: TODO 国际化表key自动生成器
	 * @param tableName
	 * @return String @throws 
	 */
	@Override
	@Transactional
	public String getLangRuleKeyByTable(String tableName) {
		// 获取行锁 注：需要添加@Transactional注解才能生效，整个SQL结束时生效
		LangKeyRule langKeyRule = langKeyRuleDaoExt.selectByTableNameForUpdate(tableName);
		if (langKeyRule != null) {
			// 编码加一
			langKeyRule.setKeyNumber(langKeyRule.getKeyNumber() + 1);
			langKeyRule.setUpdateTime(new Date());
			langKeyRuleDao.updateByPrimaryKey(langKeyRule);
			// 返回自动生成编码
			return String.format(langKeyRule.getKeyPrefix() + "%06d", langKeyRule.getKeyNumber());
		}
		return null;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 国际化翻译
	 * @param input
	 * @return Object @throws 
	 */
	@Override
	public Object lang(LangInput input) {
		// 需翻译的为空
		if (input == null) {
			return null;
		}
		// 没有翻译语言
		if (input.getObject() == null || input.getLang() == null) {
			return input.getObject();
		}
		try {
			synchronized (lockObj) {
				// 加载元数据
				if (langDict == null) {
					landLangDict();
				}
				// 翻译
				JSONObject jsonObj = JSON
						.parseObject(JSON.toJSONString(input.getObject(), SerializerFeature.WriteMapNullValue));
				String objJson = langObject(jsonObj, input.getLang(), input.getUri());
				return JSON.parseObject(objJson);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// 翻译异常元数据返回
			return input.getObject();
		}
	}

	/**
	 *  
	 * 
	 * @Description: TODO 加载国际化元数据 @throws 
	 */
	private void landLangDict() {
		// 初始字典
		langDict = new HashMap<String, Map<String, String>>();
		langCodeKeys = new ArrayList<String>();
		// 中文字典
		Map<String, String> langDictZh = new HashMap<String, String>();
		// 英文字典
		Map<String, String> langDictEn = new HashMap<String, String>();
		// 基础表字典加载
		LangKeyRuleExample example = new LangKeyRuleExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<LangKeyRule> langKeyRules = langKeyRuleDao.selectByExample(example);
		if (langKeyRules != null && langKeyRules.size() > 0) {
			// 需要加载的表
			for (LangKeyRule langKeyRule : langKeyRules) {

				// 查询key以及翻译字段
				if (StringUtils.isNotBlank(langKeyRule.getTableName())
						&& StringUtils.isNotBlank(langKeyRule.getKeyColumn())
						&& StringUtils.isNotBlank(langKeyRule.getZhColumn())
						&& StringUtils.isNotBlank(langKeyRule.getEnColumn())) {
					try {
						List<Map<String, String>> recourdList = LangDao
								.selectLangTable("select `" + langKeyRule.getKeyColumn() + "`,`"
										+ langKeyRule.getEnColumn() + "`,`" + langKeyRule.getZhColumn() + "` from "
										+ langKeyRule.getTableName() + " WHERE is_del = 0");
						for (Map<String, String> record : recourdList) {
							langDictZh.put(record.get(langKeyRule.getKeyColumn()),
									record.get(langKeyRule.getZhColumn()));
							langDictEn.put(record.get(langKeyRule.getKeyColumn()),
									record.get(langKeyRule.getEnColumn()));
						}
					} catch (Exception e) {
						System.err.println("基础信息表【" + langKeyRule.getTableName() + "】异常");
						// TODO: handle exception
					}
				} else {
					System.err.println("基础信息表【" + langKeyRule.getTableName() + "】信息填写不完整，无法进行国际化");
				}
			}
		}
		// 枚举字典加载
		LangEnumExample langEnumExample = new LangEnumExample();
		langEnumExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<LangEnum> langEnums = langEnumDao.selectByExample(langEnumExample);
		if (langEnums != null && langEnums.size() > 0) {
			for (LangEnum langEnum : langEnums) {
				langDictZh.put(langEnum.getEnumKey(), langEnum.getEnumValue());
				langDictEn.put(langEnum.getEnumKey(), langEnum.getEnumValueEn());
			}
		}
		// 基础表字典加载
		LangCodeExample langCodeExample = new LangCodeExample();
		langCodeExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<LangCode> langCodeRules = langCodeDao.selectByExample(langCodeExample);
		if (langCodeRules != null && langCodeRules.size() > 0) {
			// 需要加载的表
			for (LangCode langCode : langCodeRules) {
				langCodeKeys.add(langCode.getKeyPrefix());
				// 查询key以及翻译字段
				if (StringUtils.isNotBlank(langCode.getTableName()) && StringUtils.isNotBlank(langCode.getCodeColumn())
						&& StringUtils.isNotBlank(langCode.getZhColumn())
						&& StringUtils.isNotBlank(langCode.getEnColumn())) {
					try {
						List<Map<String, String>> recourdList = LangDao
								.selectLangTable("select `" + langCode.getCodeColumn() + "`,`" + langCode.getEnColumn()
										+ "`,`" + langCode.getZhColumn() + "` from " + langCode.getTableName()
										+ " WHERE is_del = 0 and " + langCode.getCodeColumn() + " is not null");
						for (Map<String, String> record : recourdList) {
							langDictZh.put(langCode.getKeyPrefix() + record.get(langCode.getCodeColumn()),
									record.get(langCode.getZhColumn()));
							langDictEn.put(langCode.getKeyPrefix() + record.get(langCode.getCodeColumn()),
									record.get(langCode.getEnColumn()));
						}
					} catch (Exception e) {
						System.err.println("基础编码表【" + langCode.getTableName() + "】异常");
						// TODO: handle exception
					}
				} else {
					System.err.println("基础编码表【" + langCode.getTableName() + "】信息填写不完整，无法进行国际化");
				}
			}
		}
		langDict.put(LanguageEnum.LANGZH.getCode(), langDictZh);
		langDict.put(LanguageEnum.LANGEN.getCode(), langDictEn);

	}

	/**
	 *  
	 * 
	 * @Description: TODO 翻译对象
	 * @param Obj       对象
	 * @param isEnglish 是否英文
	 * @return String 翻译后对象字符串 @throws 
	 */
	private String langObject(JSONObject Obj, LanguageEnum lang, String uri) {
		String jsonstr = "";
		for (Map.Entry<String, Object> entry : Obj.entrySet()) {
			Object object = entry.getValue();
			String str = "\"" + entry.getKey() + "\":";
			// 返回内容为null
			if (object == null) {
				if (entry.getKey().endsWith("Lang")) {
					str = "\"" + entry.getKey().substring(0, entry.getKey().length() - 4) + "\":";
				}
				str += "null";
			} else if (JSONObject.class.equals(object.getClass())) {
				// 翻译对象
				str += langObject((JSONObject) object, lang, uri);
			} else if (JSONArray.class.equals(object.getClass())) {
				// 翻译数组
				str += langArray((JSONArray) object, lang, uri);
			} else {
				// 翻译字符串
				if (entry.getKey().endsWith("Lang")) {
					str = "\"" + entry.getKey().substring(0, entry.getKey().length() - 4) + "\":\""
							+ langValue(object.toString(), lang, entry.getKey(), uri) + "\"";
				} else {
					if (String.class.equals(object.getClass())) {
						str += "\"" + object.toString().replaceAll("\"", "\\\\\"") + "\"";
					} else {
						str += object.toString();
					}
				}
			}
			jsonstr += str + ",";
		}
		// 去除最后的空格
		if (jsonstr.endsWith(",")) {
			jsonstr = jsonstr.substring(0, jsonstr.length() - 1);
		}
		return "{" + jsonstr + "}";
	}

	/**
	 *  
	 * 
	 * @Description: TODO 翻译数组
	 * @param array     数组
	 * @param isEnglish 是否英文
	 * @return String 翻译后数组字符串 @throws 
	 */
	private String langArray(JSONArray array, LanguageEnum lang, String uri) {
		String arr = "";
		for (Object obj : array) {
			if (String.class.equals(obj.getClass())) {
				System.err.println("错误数据【" + obj + "】异常");
				arr += "\"" + obj + "\",";
			} else {
				arr += langObject((JSONObject) obj, lang, uri) + ",";
			}
		}
		if (arr.endsWith(",")) {
			arr = arr.substring(0, arr.length() - 1);
		}
		return "[" + arr + "]";
	}

	/**
	 *  
	 * 
	 * @Description: TODO 翻译单个key
	 * @param key       key
	 * @param isEnglish 是否英文
	 * @return String 翻译后字符串 @throws 
	 */
	public String langValue(String key, LanguageEnum lang, String name, String uri) {
		Map<String, String> dict = langDict.get(lang.getCode());
		if (StringUtils.isNotBlank(key) && dict != null) {
			String value = dict.get(key);
			if (value == null && !key.startsWith("LK") && !key.startsWith("LE")) {
				if (name != null) {
					if (name.toLowerCase().contains("damage")) {
						value = dict.get("LCDAMAGE" + key);
					} else if (name.toLowerCase().contains("material")) {
						value = dict.get("LCMATERIAL" + key);
					} else if (name.toLowerCase().contains("repair")) {
						value = dict.get("LCREPAIR" + key);
					}
					if (value != null) {
						return value;
					}
				}
				if (uri != null) {
					if (uri.toLowerCase().contains("damage")) {
						value = dict.get("LCDAMAGE" + key);
					} else if (uri.toLowerCase().contains("material")) {
						value = dict.get("LCMATERIAL" + key);
					} else if (uri.toLowerCase().contains("repair")) {
						value = dict.get("LCREPAIR" + key);
					}
					if (value != null) {
						return value;
					}
				}
				for (String codeKey : langCodeKeys) {
					value = dict.get(codeKey + key);
					if (value != null) {
						break;
					}
				}
			}
			return value == null ? "暂无国际化" : value;
		}
		return key;
	}

	@Override
	public void reload() {
		synchronized (lockObj) {
			landLangDict();
		}
	}

	@Override
	public String langValue(String key, LanguageEnum lang, String name) {
		// TODO Auto-generated method stub
		return langValue(key, lang, name, null);
	}
}
