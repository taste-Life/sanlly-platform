package com.sanlly.production.service;

import java.util.List;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.input.base.CourseTypeInput;
import com.sanlly.common.models.output.base.CourseTypeOutput;
import com.sanlly.common.models.output.pagination.PagedList;

public interface CourseTypeService {

	/**
	 * 查询列表
	 * @return
	 * @author zhangkai
	 */
	List<CourseTypeOutput> list();
	
	/**
	 * 根据主键查询
	 * @param id
	 * @return
	 * @author zhangkai
	 */
	CourseTypeOutput query(Integer id);
	
	/**
	 * 根据主键更新
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	int update(CourseTypeInput input);
	
	/**
	 * 新增
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	int add(CourseTypeInput input);
	
	/**
	 * 逻辑删除
	 * @param id
	 * @return
	 * @author zhangkai
	 */
	int delete(Integer id);

	PagedList<CourseTypeOutput> pageList(PageInput input, String searchWords);

	int multiDelete(Integer[] ids);

	int multiValid(Integer[] ids, int valid);
}
