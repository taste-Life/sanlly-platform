package com.sanlly.production.models.input.edi;

import com.sanlly.common.models.input.PageInput;

/**
 * EDI文件搜索
 * @author RexSheng
 * 2019年10月22日 下午5:49:11
 */
public class EdiFileSearchInput extends PageInput{

	private String keyword;

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	
}
