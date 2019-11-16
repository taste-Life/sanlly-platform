package com.sanlly.production.service;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.input.base.YardInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.yard.YardOutput;

import java.util.List;

public interface YardService {

	/**
	 * 查询列表
	 * @return
	 * @author zhangkai
	 */
    List<YardOutput> list(String companyKey);
	
	/**
	 * 根据主键查询
	 * @param id
	 * @return
	 * @author zhangkai
	 */
	YardOutput query(Integer id);
	
	/**
	 * 根据key查询
	 * @param key
	 * @return
	 * @author zhh
	 */
	YardOutput queryByKey(String key);
	
	/**
	 * 根据主键更新
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	int update(YardInput input);
	
	/**
	 * 新增
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	int add(YardInput input);
	
	/**
	 * 逻辑删除
	 * @param id
	 * @return
	 * @author zhangkai
	 */
	int delete(Integer id);
	
	
	/**
	 * 查询列表  检索条件
	 * @return
	 * @author fjy
	 */
	List<YardOutput> list(BaseSearchInput input);

	PagedList<YardOutput> pageList(PageInput input, String searchWords);

	int multiDelete(Integer[] ids);

	int multiValid(Integer[] ids, int valid);
}
