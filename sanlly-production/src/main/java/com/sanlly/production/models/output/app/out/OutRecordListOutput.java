package com.sanlly.production.models.output.app.out;

/**
 * 出箱记录输出类
 * @author zhangkai
 *
 */
public class OutRecordListOutput {
	
	/*
	 * 出箱记录主键id
	 */
	private Integer prodOutContainerId;
	/*
	 * 操作者姓名
	 */
	private String operator;
	/*
	 * 批次号
	 */
	private String batchNumber;
	/*
	 * 箱号
	 */
	private String containerNo;
	/*
	 * 出箱时间
	 */
	private String createTime;
	
	public Integer getProdOutContainerId() {
		return prodOutContainerId;
	}

	public void setProdOutContainerId(Integer prodOutContainerId) {
		this.prodOutContainerId = prodOutContainerId;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	
}
