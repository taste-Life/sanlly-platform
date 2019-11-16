package com.sanlly.production.models.input.app.qualitys;

import com.sanlly.common.models.input.PageInput;

/**
 * 列表查询参数实体
 * 
 * @author wangxzh
 *
 */
public class SearchQualitysInput extends PageInput {

	private String type;

	private String containerNo;

	private String isQuality;

	private String qualityState;

	public SearchQualitysInput() {

	}

	public SearchQualitysInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getIsQuality() {
		return isQuality;
	}

	public void setIsQuality(String isQuality) {
		this.isQuality = isQuality;
	}

	public String getQualityState() {
		return qualityState;
	}

	public void setQualityState(String qualityState) {
		this.qualityState = qualityState;
	}

}
