package com.sanlly.production.models.input.edi;

/**
 * 重新生成估价单号
 * @author RexSheng
 * 2019年10月14日 下午2:21:54
 */
public class GenerateEvaluationNoInput {
	
	private GenerateEvaluationNoDetail[] details;
	
	public GenerateEvaluationNoDetail[] getDetails() {
		return details;
	}
	
	public void setDetails(GenerateEvaluationNoDetail[] details) {
		this.details = details;
	}
	
	public static class GenerateEvaluationNoDetail{
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
