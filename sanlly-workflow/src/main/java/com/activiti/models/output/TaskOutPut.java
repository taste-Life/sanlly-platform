package com.activiti.models.output;

import java.util.Date;

public class TaskOutPut {
	    private String taskId;
	    private String taskName;
	    private Date time;
	    private String processInstanceId;
	    private String status;
	    private String processDefKey;
	    private String category;
		public String getTaskId() {
			return taskId;
		}
		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
		public String getTaskName() {
			return taskName;
		}
		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}
		public Date getTime() {
			return time;
		}
		public void setTime(Date time) {
			this.time = time;
		}
		public String getProcessInstanceId() {
			return processInstanceId;
		}
		public void setProcessInstanceId(String processInstanceId) {
			this.processInstanceId = processInstanceId;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getProcessDefKey() {
			return processDefKey;
		}
		public void setProcessDefKey(String processDefKey) {
			this.processDefKey = processDefKey;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		 
	    
	    
}
