package com.sanlly.production.service;

import java.util.List;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.input.base.ContainerUserInput;
import com.sanlly.common.models.output.SelectOutput;
import com.sanlly.common.models.output.base.ContainerUserOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.output.containerUser.ContUserSelectOutput;

public interface ContainerUserService {
	
	/**
	 * @author wangxiaozheng
	 */
	List<ContUserSelectOutput> contUserSelect();
	
	/**
	 * 查询列表
	 * @return
	 * @author zhangkai
	 */
	List<ContainerUserOutput> list();
	
	/**
	 * 根据主键查询
	 * @param id
	 * @return
	 * @author zhangkai
	 */
	ContainerUserOutput query(Integer id);
	
	/**
	 * 根据主键更新
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	int update(ContainerUserInput input);
	
	/**
	 * 新增
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	int add(ContainerUserInput input);
	
	/**
	 * 逻辑删除
	 * @param id
	 * @return
	 * @author zhangkai
	 */
	int delete(Integer id);
	
	/**
	 * 根据用箱人key查询
	 * @param key
	 * @return
	 * @author fjy
	 */
	ContainerUserOutput getContainerUserByKey(String key);

	PagedList<ContainerUserOutput> containerUserPageList(PageInput input, String searchWords);

	int multiValid(Integer[] ids, int valid);

	int multiDelete(Integer[] ids);
	
	/**
	 * 根据当前登录公司获取该公司用箱人
	 * @return
	 * @author zhangkai
	 */
	List<SelectOutput> getContainerUsersByCurrentCompany();
	
	/**
	 * 根据公司获取该公司用箱人
	 * @return
	 * @author fjy 财务用
	 */
	List<SelectOutput> getContainerUsersByCompany(String companyKey);
}
