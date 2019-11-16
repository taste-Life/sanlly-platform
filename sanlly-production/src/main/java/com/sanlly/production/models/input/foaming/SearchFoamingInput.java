package com.sanlly.production.models.input.foaming;

import com.sanlly.common.models.input.PageInput;

/**
 * 发泡列表参数
 * 
 * @Package com.sanlly.production.models.input.foaming 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月4日 下午2:08:18 
 * @version V1.0   
 */
public class SearchFoamingInput extends PageInput {
	// 箱号
	private String containerNo;
	// 发泡状态
	private String state;

	public SearchFoamingInput() {

	}

	public SearchFoamingInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
