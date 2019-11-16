package com.sanlly.production.models.input.app.out;

import com.sanlly.common.models.input.PageInput;

/**
 * 原移箱搜索
 * @author RexSheng
 * 2019年8月27日 下午3:01:15
 */
public class MoveSearchInput extends PageInput{

	private String containerNo;

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}
}
