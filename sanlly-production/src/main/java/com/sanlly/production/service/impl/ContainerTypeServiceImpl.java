package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.input.base.ContainerTypeInput;
import com.sanlly.common.models.output.base.ContainerTypeOutput;
import com.sanlly.production.dao.ContainerTypeMapper;
import com.sanlly.production.entity.ContainerType;
import com.sanlly.production.entity.ContainerTypeExample;
import com.sanlly.production.entity.ContainerTypeExample.Criteria;
import com.sanlly.production.service.ContainerTypeService;

@Service
public class ContainerTypeServiceImpl extends BaseServiceImpl implements ContainerTypeService {

	@Autowired
	private ContainerTypeMapper containerTypeMapper;
	@Autowired
	private LangServiceImpl lang;
	
	/**
	 * 查询列表
	 * @return
	 * @author zhangkai
	 */
	@Override
	public List<ContainerTypeOutput> list() {
		List<ContainerTypeOutput> outputList = new ArrayList<ContainerTypeOutput>();
		ContainerTypeExample example = new ContainerTypeExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<ContainerType> list = containerTypeMapper.selectByExample(example);
		for (ContainerType item : list) {
			ContainerTypeOutput output = new ContainerTypeOutput();
			BeanUtils.copyProperties(item, output);
			outputList.add(output);
		}
		return outputList;
	}

	/**
	 * 
	 * 根据主键查询
	 * @param id
	 * @return 
	 * @author zhangkai
	 */
	@Override
	public ContainerTypeOutput query(Integer id) {
		ContainerType record = containerTypeMapper.selectByPrimaryKey(id);
		ContainerTypeOutput output = new ContainerTypeOutput();
		BeanUtils.copyProperties(record, output);
		return output;
	}

	/**
	 * 根据主键更新
	 * @param company
	 * @return
	 * @author zhangkai
	 */
	@Override
	public int update(ContainerTypeInput input) {
		ContainerType record = new ContainerType();
		BeanUtils.copyProperties(input, record);
		record.setUpdateUser(getCurrentUserId());
		record.setUpdateTime(new Date());
		return containerTypeMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 新增
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	@Override
	public int add(ContainerTypeInput input) {
		ContainerType record = new ContainerType();
		BeanUtils.copyProperties(input, record);
		record.setKey(lang.getLangRuleKeyByTable("prod_container_type"));
		record.setIsDel(PlatformConstants.ISDEL_NO);
		record.setIsValid(PlatformConstants.ISVALID_YES);
		record.setCreateUser(getCurrentUserId());
		record.setCreateTime(new Date());
		return containerTypeMapper.insertSelective(record);
	}

	/**
	 * 逻辑删除
	 * @param id
	 * @return
	 * @author zhangkai
	 */
	@Override
	public int delete(Integer id) {
		ContainerType record = new ContainerType();
		record.setIsDel(PlatformConstants.ISDEL_YES);
		record.setUpdateUser(getCurrentUserId());
		record.setUpdateTime(new Date());
		return containerTypeMapper.updateByPrimaryKeySelective(record);
	}

	/**
	*@Description: 箱型分页列表
	*@Param: [input, searchWords]
	*@return: com.sanlly.common.models.output.pagination.PagedList<com.sanlly.common.models.output.base.ContainerTypeOutput>
	*@Author: zjd
	*@date: 2019-09-25
	*/
	@Override
	public PagedList<ContainerTypeOutput> pageList(PageInput input, String searchWords) {
		List<ContainerTypeOutput> outputList = new ArrayList<ContainerTypeOutput>();
		ContainerTypeExample example = new ContainerTypeExample();
		example.setOrderByClause("create_time DESC");
		Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if (searchWords != null && !"".equals(searchWords)) {
			criteria.andContainerTypeNameLike("%"+searchWords.trim()+"%");
			Criteria criteria2 = example.createCriteria();
			criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			criteria2.andContainerTypeNameEnLike("%"+searchWords.trim()+"");
			Criteria criteria3 = example.createCriteria();
			criteria3.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			criteria3.andContainerCategoryLike("%"+searchWords.trim()+"%");
			example.or(criteria2);
			example.or(criteria3);
		}
		Integer totalItemCount = (int)containerTypeMapper.countByExample(example);
		PagedList<ContainerTypeOutput> pagedList = new PagedList<ContainerTypeOutput>
				(input.getPageIndex(), input.getPageSize(), totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<ContainerType> list = containerTypeMapper.selectByExample(example);
		for (ContainerType item : list) {
			ContainerTypeOutput output = new ContainerTypeOutput();
			BeanUtils.copyProperties(item, output);
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}

	/**
	*@Description: 批量删除箱型
	*@Param: [ids]
	*@return: int
	*@Author: zjd
	*@date: 2019-09-25
	*/
	@Override
	public int multiDelete(Integer[] ids) {
		for (Integer id : ids){
			ContainerType record = new ContainerType();
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setProdContainerTypeId(id);
			record.setUpdateUser(getCurrentUserId());
			record.setUpdateTime(new Date());
			containerTypeMapper.updateByPrimaryKeySelective(record);
		}
		return 1;
	}

	/**
	*@Description: 批量设置有效性
	*@Param: [ids]
	*@return: int
	*@Author: zjd
	*@date: 2019-09-25
	*/
	@Override
	public int multiValid(Integer[] ids,int valid) {
		for (Integer id : ids){
			ContainerType record = new ContainerType();
			record.setProdContainerTypeId(id);
			record.setIsValid(valid);
			record.setUpdateUser(getCurrentUserId());
			record.setUpdateTime(new Date());
			containerTypeMapper.updateByPrimaryKeySelective(record);
		}
		return 1;
	}

}
