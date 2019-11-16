package com.sanlly.production.models.input.edi;

import com.sanlly.production.entity.CompanyCode;

public class AddEdiMessageInput {

	private String methodName;
	private EdiMessageInput[] ediMessageInputs;//进场id和箱类型数组
	private CompanyCode ediConfig;//EDI配置对象，获取用箱人，发送发，接收方
	public CompanyCode getEdiConfig() {
		return ediConfig;
	}

	public void setEdiConfig(CompanyCode ediConfig) {
		this.ediConfig = ediConfig;
	}

	public EdiMessageInput[] getEdiMessageInputs() {
		return ediMessageInputs;
	}

	public void setEdiMessageInputs(EdiMessageInput[] ediMessageInputs) {
		this.ediMessageInputs = ediMessageInputs;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public static class EdiMessageInput{
		private String courseId;

		private String containerCategory;

		public String getCourseId() {
			return courseId;
		}

		public void setCourseId(String courseId) {
			this.courseId = courseId;
		}

		public String getContainerCategory() {
			return containerCategory;
		}

		public void setContainerCategory(String containerCategory) {
			this.containerCategory = containerCategory;
		}
	}
	
	
}
