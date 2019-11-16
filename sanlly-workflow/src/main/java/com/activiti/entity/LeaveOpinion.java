package com.activiti.entity;

import java.io.Serializable;
import java.util.Date;

public class LeaveOpinion implements Serializable {
	// 审批人id
	private String opId;
	// 审批人姓名
	private String opName;
	// 审批意见
	private String opinion;
	// 审批时间
	private Date createTime;
	// 是否通过
	private boolean flag;
	// 流程id
	private String taskId;

	public String getOpId() {
		return opId;
	}

	public void setOpId(String opId) {
		this.opId = opId;
	}

	public String getOpName() {
		return opName;
	}

	public void setOpName(String opName) {
		this.opName = opName;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
