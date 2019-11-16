package com.sanlly.production.models.input.app.cleaning;

/**
 * 洗箱列表搜索
 * 
 * @author RexSheng 2019年8月24日 下午4:11:07
 */
public class CleaningSearchInput {

	/**
	 * 类型，0洗箱员，1预检员
	 */
	private Integer type;

	/**
	 * 区位
	 */
	private String zone;

	/**
	 * 箱号
	 */
	private String containerNo;

	/**
	 * 洗箱状态
	 */
	private String cleaningState;

	/**
	 * 页码
	 */
	private Integer index;

	/**
	 * 页大小
	 */
	private Integer size;

	/**
	 * 箱类别
	 */
	private String containerCategory;

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getCleaningState() {
		return cleaningState;
	}

	public void setCleaningState(String cleaningState) {
		this.cleaningState = cleaningState;
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

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

}
