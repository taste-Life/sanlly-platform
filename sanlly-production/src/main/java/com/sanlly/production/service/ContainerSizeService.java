package com.sanlly.production.service;

import java.util.List;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.input.base.ContainerSizeInput;
import com.sanlly.common.models.output.base.ContainerSizeOutput;
import com.sanlly.common.models.output.pagination.PagedList;

public interface ContainerSizeService {

	/**
	 * 查询列表
	 * @return
	 * @author zhangkai
	 */
	List<ContainerSizeOutput> list();
	
	/**
	 * 根据主键查询
	 * @param id
	 * @return
	 * @author zhangkai
	 */
	ContainerSizeOutput query(Integer id);
	
	/**
	 * 根据主键更新
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	int update(ContainerSizeInput input);
	
	/**
	 * 新增
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	int add(ContainerSizeInput input);
	
	/**
	 * 逻辑删除
	 * @param id
	 * @return
	 * @author zhangkai
	 */
	int delete(Integer id);

	PagedList<ContainerSizeOutput> pageList(PageInput input, String searchWords);

	int multiDelete(Integer[] ids);

	int multiValid(Integer[] ids, int valid);
}
