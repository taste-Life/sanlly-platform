package com.sanlly.production.models.input.goh;

import com.sanlly.common.models.input.PageInput;

/**
 * 获取退租箱列表
 * 
 * @Package com.sanlly.production.models.input.goh 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月22日 下午1:38:00 
 * @version V1.0   
 */
public class GohListInput extends PageInput {
	// 箱号
	private String containerNo;
	// 用箱人
	private String containerUser;
	// 场站
	private String yard;

	public GohListInput(Integer pageIndex, Integer pageSize) {
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

}
