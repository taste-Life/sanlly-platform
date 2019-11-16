package com.sanlly.production.service;

import java.util.List;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.input.base.ContainerGradeInput;
import com.sanlly.common.models.output.base.ContainerGradeOutput;
import com.sanlly.common.models.output.pagination.PagedList;

public interface ContainerGradeService {
	/**
	 * 查询列表
	 * @return
	 * @author zhangkai
	 */
	List<ContainerGradeOutput> list();
	
	/**
	 * 根据主键查询
	 * @param id
	 * @return
	 * @author zhangkai
	 */
	ContainerGradeOutput query(Integer id);
	
	/**
	 * 根据主键更新
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	int update(ContainerGradeInput input);
	
	/**
	 * 新增
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	int add(ContainerGradeInput input);
	
	/**
	 * 逻辑删除
	 * @param id
	 * @return
	 * @author zhangkai
	 */
	int delete(Integer id);

	PagedList<ContainerGradeOutput> pageList(PageInput input, String searchWords);

	int multiDelete(Integer[] ids);

	int multiValid(Integer[] ids, int valid);
}
