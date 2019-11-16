package com.sanlly.production.models.input.fix;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.fix 
 * @Description: TODO 单箱操作
 * @author tianzhl   
 * @date 2019年9月7日 下午3:50:12 
 * @version V1.0   
 */
public class FixReferralSingleInput {

	// TODO 箱进场Id
	private String prodCourseId;

	// TODO 箱类别
	private String containerCategory;

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

}
