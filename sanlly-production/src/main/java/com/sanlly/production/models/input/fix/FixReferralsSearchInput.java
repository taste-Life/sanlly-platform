package com.sanlly.production.models.input.fix;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.fix 
 * @Description: TODO 派工单类型查询条件
 * @author tianzhl   
 * @date 2019年9月7日 下午3:50:12 
 * @version V1.0   
 */
public class FixReferralsSearchInput {

	// TODO 派工类型
	private String referralState;

	// TODO 箱类别
	private String containerCategory;

	// TODO 箱号
	private String containerNo;

	// TODO 页码
	private Integer index;

	// TODO 显示的数量
	private Integer size;

	public String getReferralState() {
		return referralState;
	}

	public void setReferralState(String referralState) {
		this.referralState = referralState;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

}
