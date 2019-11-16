package com.sanlly.production.models.input.goh;

import com.sanlly.common.models.input.PageInput;

/**
 * 挂衣箱列表
 * 
 * @Package com.sanlly.production.models.input.goh 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月23日 下午2:19:14 
 * @version V1.0   
 */
public class SearchGohContainerInput extends PageInput {
	// 箱号
	private String containerNo;
	// 用箱人
	private String containerUser;
	// 场站
	private String yard;
	// 是否存在条目
	private String isEntry;
	// 改制类型
	private String reshapeType;

	public SearchGohContainerInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public String getIsEntry() {
		return isEntry;
	}

	public void setIsEntry(String isEntry) {
		this.isEntry = isEntry;
	}

	public String getReshapeType() {
		return reshapeType;
	}

	public void setReshapeType(String reshapeType) {
		this.reshapeType = reshapeType;
	}

}
