package com.sanlly.production.models.input.app.unitTesting;

/**
 * 维修历史记录-进场列表搜索条件
 * @author RexSheng
 * 2019年8月12日 上午10:13:08
 */
public class UnitTestingHistoryInput {

	/**
	 * 箱号
	 */
	private String containerNo;
	
	/**
	 * 箱型
	 */
	private String type;
	
	/**
	 * 要搜索的页码
	 */
	private Integer index;
	
	/**
	 * 每页显示的数量
	 */
	private Integer size;

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
