package com.sanlly.production.models.input.fix;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.fix 
 * @Description: TODO 派工单批量操作
 * @author tianzhl   
 * @date 2019年9月7日 下午3:50:12 
 * @version V1.0   
 */
public class FixReferralBatchInput {

	// TODO 箱进场Id
	private String[] prodCourseIdList;

	// TODO 箱类别
	private String containerCategory;

	public String[] getProdCourseIdList() {
		return prodCourseIdList;
	}

	public void setProdCourseIdList(String[] prodCourseIdList) {
		this.prodCourseIdList = prodCourseIdList;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}


}
