package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.models.input.xx.XxSearchInput;
import com.sanlly.production.models.output.xx.XxDetailOutput;

/**
 * xx箱接口
 * @author RexSheng
 * 2019年8月30日 下午3:09:18
 */
public interface XxService {

	/**
	 * 获取xx箱列表
	 * @param input
	 * @return
	 */
	PagedList<XxDetailOutput> getXxPagedList(XxSearchInput input);
	
	/**
	 * xx箱确认ok
	 * @param courseIds
	 */
	void confirmOk(String[] courseIds);
	
	/**
	 *  PTI ok确认列表
	 * @param input
	 * @return
	 */
	PagedList<XxDetailOutput> getPtiOkPagedList(XxSearchInput input);

	/**
	 * pti Not Ok确认
	 * @param prodCourseIds
	 */
	void ptiNotOkConfirm(String[] prodCourseIds);

	/**
	 * pti Ok确认
	 * @param prodCourseIds
	 */
	void ptiOkConfirm(String[] prodCourseIds);
	
	/**
	 * 创建pti信息
	 * @param course
	 * @param unitCourse
	 */
	void createPtiInfo(Course course,UnitCourse unitCourse);
	
	/**
	 * 创建pti信息
	 * @param course
	 * @param unitCourse
	 */
	void createPtiInfo(String prodCourseId);
}
