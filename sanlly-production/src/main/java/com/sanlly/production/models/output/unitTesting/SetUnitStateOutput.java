package com.sanlly.production.models.output.unitTesting;

/**
 * 设置机组状态输出类
 * @author RexSheng
 * 2019年8月22日 上午10:15:55
 */
public class SetUnitStateOutput {

	/**
	 * 需要删除条目的箱号
	 */
	private String[] delContainerNo;
	
	/**
	 * 机组提交成功的id
	 */
	private String[] courseId;
	
	/**
	 * 需要上传条目照片的箱号
	 */
	private String[] needPhotoContainerNo;
	
	/**
	 * 错误消息
	 */
	private String errorMessage;

	public String[] getDelContainerNo() {
		return delContainerNo;
	}

	public void setDelContainerNo(String[] delContainerNo) {
		this.delContainerNo = delContainerNo;
	}

	public String[] getCourseId() {
		return courseId;
	}

	public void setCourseId(String[] courseId) {
		this.courseId = courseId;
	}

	public String[] getNeedPhotoContainerNo() {
		return needPhotoContainerNo;
	}

	public void setNeedPhotoContainerNo(String[] needPhotoContainerNo) {
		this.needPhotoContainerNo = needPhotoContainerNo;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
