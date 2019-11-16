package com.sanlly.production.models.input.edi;

/**
 * 新增进场数据到edi池
 * @author RexSheng
 * 2019年10月14日 下午1:54:01
 */
public class AddEdiPoolInput {

	private AddEditPoolDetail[] details;
	
	private String[] ediType;
	
	private String importType;
	
	public AddEditPoolDetail[] getDetails() {
		return details;
	}

	public void setDetails(AddEditPoolDetail[] details) {
		this.details = details;
	}
	

	public String getImportType() {
		return importType;
	}

	public void setImportType(String importType) {
		this.importType = importType;
	}

	public String[] getEdiType() {
		return ediType;
	}

	public void setEdiType(String[] ediType) {
		this.ediType = ediType;
	}

	public static class AddEditPoolDetail{
		/**
		 * 进场id
		 */
		private String courseId;
		
		/**
		 * 箱号
		 */
		private String containerNo;
		
		/**
		 * 估价单号
		 */
		private String evaluationNo;
		
		/**
		 * 机组估价单号
		 */
		private String unitEvaluationNo;
		
		/*
		 * 箱类别
		 */
		private String containerCategory;

		public String getCourseId() {
			return courseId;
		}

		public void setCourseId(String courseId) {
			this.courseId = courseId;
		}

		public String getContainerNo() {
			return containerNo;
		}

		public void setContainerNo(String containerNo) {
			this.containerNo = containerNo;
		}

		public String getEvaluationNo() {
			return evaluationNo;
		}

		public void setEvaluationNo(String evaluationNo) {
			this.evaluationNo = evaluationNo;
		}

		public String getContainerCategory() {
			return containerCategory;
		}

		public void setContainerCategory(String containerCategory) {
			this.containerCategory = containerCategory;
		}

		public String getUnitEvaluationNo() {
			return unitEvaluationNo;
		}

		public void setUnitEvaluationNo(String unitEvaluationNo) {
			this.unitEvaluationNo = unitEvaluationNo;
		}
		
		
	}



	
}
