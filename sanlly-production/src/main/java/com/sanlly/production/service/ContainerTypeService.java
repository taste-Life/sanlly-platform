package com.sanlly.production.service;

import java.util.List;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.input.base.ContainerTypeInput;
import com.sanlly.common.models.output.base.ContainerTypeOutput;
import com.sanlly.common.models.output.pagination.PagedList;

public interface ContainerTypeService {

	/**
	 * 查询列表
	 * @return
	 * @author zhangkai
	 */
	List<ContainerTypeOutput> list();
	
	/**
	 * 根据主键查询
	 * @param id
	 * @return
	 * @author zhangkai
	 */
	ContainerTypeOutput query(Integer id);
	
	/**
	 * 根据主键更新
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	int update(ContainerTypeInput input);
	
	/**
	 * 新增
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	int add(ContainerTypeInput input);
	
	/**
	 * 逻辑删除
	 * @param id
	 * @return
	 * @author zhangkai
	 */
	int delete(Integer id);

	PagedList<ContainerTypeOutput> pageList(PageInput input, String searchWords);

	int multiDelete(Integer[] ids);

	int multiValid(Integer[] ids,int valid);
}
