package com.sanlly.production.models.output.xx;

/**
 * xx箱列表信息
 * @author RexSheng
 * 2019年8月30日 下午2:45:35
 */
public class XxDetailOutput {
	
	/**
	 * 进场id
	 */
	private String courseId;

	/**
	 * 箱号
	 */
	private String containerNo;
	
	/**
	 * 用箱人
	 */
	private String containerUserLang;
	
	/**
	 * 进场类别
	 */
	private String courseTypeLang;
	
	/**
	 * xx状态
	 */
	private String xxStateLang;
	
	/**
	 * xx箱状态key
	 */
	private String xxStateKey;

	/**
	 * pit结果
	 */
	private String ptiResultLang;
	
	/**
	 * pti结果key
	 */
	private String ptiResultKey;

	/**
	 * pti最终结果
	 */
	private String ptiLastResultLang;

	/**
	 * 箱体状态
	 */
	private String containerStateLang;

	/**
	 * 机组状态
	 */
	private String unitStateLang;

	/**
	 * 箱体批复状态
	 */
	private String containerReplyStateLang;

	/**
	 * 机组批复状态
	 */
	private String unitReplyStateLang;

	/**
	 * 备注
	 */
	private String remark;

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}


	public String getContainerStateLang() {
		return containerStateLang;
	}

	public void setContainerStateLang(String containerStateLang) {
		this.containerStateLang = containerStateLang;
	}

	public String getUnitStateLang() {
		return unitStateLang;
	}

	public void setUnitStateLang(String unitStateLang) {
		this.unitStateLang = unitStateLang;
	}

	public String getContainerReplyStateLang() {
		return containerReplyStateLang;
	}

	public void setContainerReplyStateLang(String containerReplyStateLang) {
		this.containerReplyStateLang = containerReplyStateLang;
	}

	public String getUnitReplyStateLang() {
		return unitReplyStateLang;
	}

	public void setUnitReplyStateLang(String unitReplyStateLang) {
		this.unitReplyStateLang = unitReplyStateLang;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getContainerUserLang() {
		return containerUserLang;
	}

	public void setContainerUserLang(String containerUserLang) {
		this.containerUserLang = containerUserLang;
	}

	public String getCourseTypeLang() {
		return courseTypeLang;
	}

	public void setCourseTypeLang(String courseTypeLang) {
		this.courseTypeLang = courseTypeLang;
	}

	public String getXxStateLang() {
		return xxStateLang;
	}

	public void setXxStateLang(String xxStateLang) {
		this.xxStateLang = xxStateLang;
	}

	public String getPtiResultLang() {
		return ptiResultLang;
	}

	public void setPtiResultLang(String ptiResultLang) {
		this.ptiResultLang = ptiResultLang;
	}

	public String getPtiLastResultLang() {
		return ptiLastResultLang;
	}

	public void setPtiLastResultLang(String ptiLastResultLang) {
		this.ptiLastResultLang = ptiLastResultLang;
	}

	public String getXxStateKey() {
		return xxStateKey;
	}

	public void setXxStateKey(String xxStateKey) {
		this.xxStateKey = xxStateKey;
	}

	public String getPtiResultKey() {
		return ptiResultKey;
	}

	public void setPtiResultKey(String ptiResultKey) {
		this.ptiResultKey = ptiResultKey;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	
}
