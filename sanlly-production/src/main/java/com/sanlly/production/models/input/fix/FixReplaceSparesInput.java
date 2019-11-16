package com.sanlly.production.models.input.fix;

import java.util.List;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.fix 
 * @Description: TODO 换件
 * @author tianzhl   
 * @date 2019年9月7日 下午3:50:12 
 * @version V1.0   
 */
public class FixReplaceSparesInput {

	// TODO 箱进场Id
	private String prodCourseId;

	// TODO 箱类别
	private String containerCategory;

	// TODO 备件号
	private List<FixSparesNumSubmitInput> sparesNumList;

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public List<FixSparesNumSubmitInput> getSparesNumList() {
		return sparesNumList;
	}

	public void setSparesNumList(List<FixSparesNumSubmitInput> sparesNumList) {
		this.sparesNumList = sparesNumList;
	}

}
