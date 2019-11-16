package com.sanlly.common.models.input.lang;

import com.sanlly.common.enums.LanguageEnum;

/**
 * @Package com.sanlly.common.models.input.lang 
 * @Description: TODO 国际化输入实体
 * @author tianzhl   
 * @date 2019年8月14日 上午10:25:58 
 * @version V1.0   
 */
public class LangInput {

	// TODO 需翻译实体
	private Object object;

	// TODO 翻译语言
	private LanguageEnum lang;

	// TODO 请求地址
	private String uri;

	public LangInput() {
		super();
	}

	public LangInput(Object object, LanguageEnum lang) {
		super();
		this.object = object;
		this.lang = lang;
	}

	public LangInput(Object object, LanguageEnum lang, String uri) {
		super();
		this.object = object;
		this.lang = lang;
		this.uri = uri;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public LanguageEnum getLang() {
		return lang;
	}

	public void setLang(LanguageEnum lang) {
		this.lang = lang;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

}
