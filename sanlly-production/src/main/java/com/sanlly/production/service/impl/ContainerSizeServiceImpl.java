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
import com.sanlly.common.models.input.base.ContainerSizeInput;
import com.sanlly.common.models.output.base.ContainerSizeOutput;
import com.sanlly.production.dao.ContainerSizeMapper;
import com.sanlly.production.entity.ContainerSize;
import com.sanlly.production.entity.ContainerSizeExample;
import com.sanlly.production.entity.ContainerSizeExample.Criteria;
import com.sanlly.production.service.ContainerSizeService;

@Service
public class ContainerSizeServiceImpl extends BaseServiceImpl implements ContainerSizeService {

	@Autowired
	private ContainerSizeMapper containerSizeMapper;
	@Autowired
	private LangServiceImpl lang;
	
	/**
	 * 查询列表
	 * @return
	 * @author zhangkai
	 */
	@Override
	public List<ContainerSizeOutput> list() {
		List<ContainerSizeOutput> outputList = new ArrayList<ContainerSizeOutput>();
		ContainerSizeExample example = new ContainerSizeExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<ContainerSize> list = containerSizeMapper.selectByExample(example);
		for (ContainerSize item : list) {
			ContainerSizeOutput output = new ContainerSizeOutput();
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
	public ContainerSizeOutput query(Integer id) {
		ContainerSize record = containerSizeMapper.selectByPrimaryKey(id);
		ContainerSizeOutput output = new ContainerSizeOutput();
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
	public int update(ContainerSizeInput input) {
		ContainerSize record = new ContainerSize();
		BeanUtils.copyProperties(input, record);
		record.setUpdateUser(getCurrentUserId());
		record.setUpdateTime(new Date());
		return containerSizeMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 新增
	 * @param input
	 * @return
	 * @author zhangkai
	 */
	@Override
	public int add(ContainerSizeInput input) {
		ContainerSize record = new ContainerSize();
		BeanUtils.copyProperties(input, record);
		record.setKey(lang.getLangRuleKeyByTable("prod_size"));
		record.setIsDel(PlatformConstants.ISDEL_NO);
		record.setIsValid(PlatformConstants.IS_ADMIN_YES);
		record.setCreateUser(getCurrentUserId());
		record.setCreateTime(new Date());
		return containerSizeMapper.insertSelective(record);
	}

	/**
	 * 逻辑删除
	 * @param id
	 * @return
	 * @author zhangkai
	 */
	@Override
	public int delete(Integer id) {
		ContainerSize record = new ContainerSize();
		record.setIsDel(PlatformConstants.ISDEL_YES);
		record.setUpdateUser(getCurrentUserId());
		record.setUpdateTime(new Date());
		return containerSizeMapper.updateByPrimaryKeySelective(record);
	}

	/**
	*@Description: 箱型尺寸分页列表
	*@Param: [input, searchWords]
	*@return: com.sanlly.common.models.output.pagination.PagedList<com.sanlly.common.models.output.base.ContainerSizeOutput>
	*@Author: zjd
	*@date: 2019-09-25
	*/
	@Override
	public PagedList<ContainerSizeOutput> pageList(PageInput input, String searchWords) {
		List<ContainerSizeOutput> outputList = new ArrayList<ContainerSizeOutput>();
		ContainerSizeExample example = new ContainerSizeExample();
		example.setOrderByClause("create_time DESC");
		Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if (searchWords != null &&  !"".equals(searchWords)) {
			criteria.andSizeNameLike("%"+searchWords.trim()+"%");
			Criteria criteria2 = example.createCriteria();
			criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			criteria2.andSizeNameEnLike("%"+searchWords.trim()+"");
			example.or(criteria2);
		}
		Integer totalItemCount = (int)containerSizeMapper.countByExample(example);
		PagedList<ContainerSizeOutput> pagedList = new PagedList<ContainerSizeOutput>(input.getPageIndex(), input.getPageSize(), totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<ContainerSize> list = containerSizeMapper.selectByExample(example);
		for (ContainerSize item : list) {
			ContainerSizeOutput output = new ContainerSizeOutput();
			BeanUtils.copyProperties(item, output);
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}

	/**
	*@Description: 批量删除
	*@Param: [ids]
	*@return: int
	*@Author: zjd
	*@date: 2019-09-25
	*/
	@Override
	public int multiDelete(Integer[] ids) {
		for (Integer id : ids){
			ContainerSize record = new ContainerSize();
			record.setProdSizeId(id);
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateUser(getCurrentUserId());
			record.setUpdateTime(new Date());
			containerSizeMapper.updateByPrimaryKeySelective(record);
		}
		return 1;
	}
	/**
	*@Description: 批量设置有效性
	*@Param: [ids, valid]
	*@return: int
	*@Author: zjd
	*@date: 2019-09-25
	*/
	@Override
	public int multiValid(Integer[] ids, int valid) {
		for (Integer id : ids){
			ContainerSize record = new ContainerSize();
			record.setProdSizeId(id);
			record.setIsValid(valid);
			record.setUpdateUser(getCurrentUserId());
			record.setUpdateTime(new Date());
			containerSizeMapper.updateByPrimaryKeySelective(record);
		}
		return 1;
	}
}
