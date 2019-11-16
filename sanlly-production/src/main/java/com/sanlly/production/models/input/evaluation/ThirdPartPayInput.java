package com.sanlly.production.models.input.evaluation;

import java.math.BigDecimal;
import java.util.List;

/**
 * 第三方付费接口
 * @author RexSheng
 * 2019年9月11日 下午1:31:30
 */
public class ThirdPartPayInput {

	/**
	 * 进场id
	 */
	private String prodCourseId;

	/**
	 * 箱类别
	 */
	private String containerCategory;
	
	/**
	 * 用箱人批复费用
	 */
	private BigDecimal totalReplyMoney;
	
	/**
	 * 是否生成条目历史版本记录
	 */
	private Boolean createVersionHistory;

	/**
	 * 所有条目
	 */
	private List<AddEvaluationEntryInput> tableData;
	/**
	 * 条目明细
	 */
	private List<AddEvaluationEntryInput> entries;
	
	/**
	 * 是否箱东
	 */
	private Boolean isMaster;

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

	public List<AddEvaluationEntryInput> getEntries() {
		return entries;
	}

	public void setEntries(List<AddEvaluationEntryInput> entries) {
		this.entries = entries;
	}

	public List<AddEvaluationEntryInput> getTableData() {
		return tableData;
	}

	public void setTableData(List<AddEvaluationEntryInput> tableData) {
		this.tableData = tableData;
	}

	public BigDecimal getTotalReplyMoney() {
		return totalReplyMoney;
	}

	public void setTotalReplyMoney(BigDecimal totalReplyMoney) {
		this.totalReplyMoney = totalReplyMoney;
	}

	public Boolean getCreateVersionHistory() {
		return createVersionHistory;
	}

	public void setCreateVersionHistory(Boolean createVersionHistory) {
		this.createVersionHistory = createVersionHistory;
	}

	public Boolean getIsMaster() {
		return isMaster;
	}

	public void setIsMaster(Boolean isMaster) {
		this.isMaster = isMaster;
	}

}
