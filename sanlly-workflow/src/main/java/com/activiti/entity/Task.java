package com.activiti.entity;

import java.util.Date;

public class Task {
	private String id;
	private String name;
	private Date createTime;
	private String assignee;
	private String processInstanceId;// 流程实例id
	private String processDefinitionId;// 流程定义id
	private String description;
	private String category;

	private String userName;
	private String reason;
	private String urlpath;
	
	private Object infoJson;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getProcessDefinitionId() {
		return processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getUrlpath() {
		return urlpath;
	}

	public void setUrlpath(String urlpath) {
		this.urlpath = urlpath;
	}

	public Task() {
	}

	public Task(org.activiti.engine.task.Task t) {
		this.id = t.getId();
		this.name = t.getName();
		this.createTime = t.getCreateTime();
		this.assignee = t.getAssignee();
		this.processInstanceId = t.getProcessInstanceId();
		this.processDefinitionId = t.getProcessDefinitionId();
		this.description = t.getDescription();
		this.category = t.getCategory();
	}

	public Object getInfoJson() {
		return infoJson;
	}

	public void setInfoJson(Object infoJson) {
		this.infoJson = infoJson;
	}
	
	
}
