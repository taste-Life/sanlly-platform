package com.sanlly.production.models.output;

import java.util.Date;

public class ActiveProcessOutPut {

	 private Integer id;

	    private String processKey;

	    private String processName;

	    private Integer processId;

	    private String processVersion;

	    private String workKey;

	    private String workName;

	    private String workNameEn;

	    private Integer isDel;

	    private Date createTime;

	    private Integer createUser;

	    private Date updateTime;

	    private Integer updateUser;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getProcessKey() {
			return processKey;
		}

		public void setProcessKey(String processKey) {
			this.processKey = processKey;
		}

		public String getProcessName() {
			return processName;
		}

		public void setProcessName(String processName) {
			this.processName = processName;
		}

		public Integer getProcessId() {
			return processId;
		}

		public void setProcessId(Integer processId) {
			this.processId = processId;
		}

		public String getProcessVersion() {
			return processVersion;
		}

		public void setProcessVersion(String processVersion) {
			this.processVersion = processVersion;
		}

		public String getWorkKey() {
			return workKey;
		}

		public void setWorkKey(String workKey) {
			this.workKey = workKey;
		}

		public String getWorkName() {
			return workName;
		}

		public void setWorkName(String workName) {
			this.workName = workName;
		}

		public String getWorkNameEn() {
			return workNameEn;
		}

		public void setWorkNameEn(String workNameEn) {
			this.workNameEn = workNameEn;
		}

		public Integer getIsDel() {
			return isDel;
		}

		public void setIsDel(Integer isDel) {
			this.isDel = isDel;
		}

		public Date getCreateTime() {
			return createTime;
		}

		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}

		public Integer getCreateUser() {
			return createUser;
		}

		public void setCreateUser(Integer createUser) {
			this.createUser = createUser;
		}

		public Date getUpdateTime() {
			return updateTime;
		}

		public void setUpdateTime(Date updateTime) {
			this.updateTime = updateTime;
		}

		public Integer getUpdateUser() {
			return updateUser;
		}

		public void setUpdateUser(Integer updateUser) {
			this.updateUser = updateUser;
		}
	    
	    
}
