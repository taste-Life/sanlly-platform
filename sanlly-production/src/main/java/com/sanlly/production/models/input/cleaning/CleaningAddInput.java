package com.sanlly.production.models.input.cleaning;

import com.sanlly.common.enums.CommonEnum;
import com.sanlly.production.enums.CleaningSourceEnum;

/**
 * 新增洗箱
 * @author RexSheng
 * 2019年8月22日 下午5:41:29
 */
public class CleaningAddInput {

	/**
	 * 进场id
	 */
	private String courseId;
	
	/**
	 * 箱类别
	 */
	private String containerCategory;
	
	/**
	 * 洗箱来源
	 */
	private CleaningSourceEnum source;
	
	/**
	 * 是否特殊箱
	 */
	private CommonEnum isSpecial;
	

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public CleaningSourceEnum getSource() {
		return source;
	}

	public void setSource(CleaningSourceEnum source) {
		this.source = source;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public CommonEnum getIsSpecial() {
		return isSpecial;
	}

	public void setIsSpecial(CommonEnum isSpecial) {
		this.isSpecial = isSpecial;
	}
	
	
}
