package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.remark.CommonRemarksInput;
import com.sanlly.production.models.output.remark.CommonRemarksOutput;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.production.dao.CommonRemarksMapper;
import com.sanlly.production.entity.CommonRemarks;
import com.sanlly.production.entity.CommonRemarksExample;
import com.sanlly.production.entity.CommonRemarksExample.Criteria;
import com.sanlly.production.models.input.remark.CommonRemarkSelectInput;
import com.sanlly.production.models.output.remark.CommonRemarkSelectOutput;
import com.sanlly.production.service.CommonRemarkService;
/**
 * 
* @Package com.sanlly.production.service.impl 
* @Description: 常用备注 
* @author zhangkai   
* @date 2019年8月28日 下午2:47:31 
* @version V1.0   
 */
@Service
public class CommonRemarkServiceImpl extends BaseServiceImpl implements CommonRemarkService {
	
	@Autowired
	private CommonRemarksMapper commonRemarksMapper;

	@Autowired
	private LangServiceImpl lang;

	/**
	 * tianzhl要的接口
	 * @author zhangkai
	 */
	@Override
	public List<CommonRemarkSelectOutput> select(CommonRemarkSelectInput input) {
		CommonRemarksExample example = new CommonRemarksExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if (input.getCompany() != null && input.getCompany() != "") {
			criteria.andCompanyEqualTo(input.getCompany());
		}
		if (input.getContainerCategory() != null && input.getContainerCategory() != "") {
			criteria.andContainerCategoryEqualTo(input.getContainerCategory());
		}
		List<CommonRemarkSelectOutput> outputList = new ArrayList<CommonRemarkSelectOutput>();
		List<CommonRemarks> list = commonRemarksMapper.selectByExample(example);
		if (list == null || list.size() == 0) {
			return outputList;
		}
		for (CommonRemarks item : list) {
			CommonRemarkSelectOutput output = new CommonRemarkSelectOutput();
			output.setRemarksContentLang(item.getKey());
			outputList.add(output);
		}
		return outputList;
	}

	@Override
	public int update(CommonRemarksInput input) {
		CommonRemarks record = new CommonRemarks();
		BeanUtils.copyProperties(input, record);
		record.setUpdateUser(getCurrentUserId());
		record.setUpdateTime(new Date());
		return commonRemarksMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int add(CommonRemarksInput input) {
		CommonRemarks record = new CommonRemarks();
		BeanUtils.copyProperties(input, record);
		record.setKey(lang.getLangRuleKeyByTable("prod_common_remarks"));
		record.setIsDel(PlatformConstants.ISDEL_NO);
		record.setIsValid(PlatformConstants.ISVALID_YES);
		record.setCreateUser(getCurrentUserId());
		record.setCreateTime(new Date());
		return commonRemarksMapper.insertSelective(record);
	}

	@Override
	public PagedList<CommonRemarksOutput> pageList(PageInput input, String searchWords) {
		List<CommonRemarksOutput> outputList = new ArrayList<CommonRemarksOutput>();
		CommonRemarksExample example = new CommonRemarksExample();
		example.setOrderByClause("create_time DESC");
		CommonRemarksExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if (searchWords != null && !"".equals(searchWords)) {
			criteria.andRemarksContentLike("%"+searchWords.trim()+"%");
			CommonRemarksExample.Criteria criteria2 = example.createCriteria();
			criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			criteria2.andRemarksContentEnLike("%"+searchWords.trim()+"");
			example.or(criteria2);
		}
		Integer totalItemCount = (int)commonRemarksMapper.countByExample(example);
		PagedList<CommonRemarksOutput> pagedList = new PagedList<CommonRemarksOutput>(input.getPageIndex(), input.getPageSize(), totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<CommonRemarks> list = commonRemarksMapper.selectByExample(example);
		for (CommonRemarks item : list) {
			CommonRemarksOutput output = new CommonRemarksOutput();
			BeanUtils.copyProperties(item, output);
			output.setCompanyLang(item.getCompany());
			output.setContainerCategoryLang(item.getContainerCategory());
			outputList.add(output);
		}
		pagedList.setDataList(outputList);
		return pagedList;
	}

	@Override
	public int multiDelete(Integer[] ids) {
		for(Integer id : ids){
			CommonRemarks record = new CommonRemarks();
			record.setProdCommonRemarksId(id);
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateUser(getCurrentUserId());
			record.setUpdateTime(new Date());
			commonRemarksMapper.updateByPrimaryKeySelective(record);
		}
		return 1;
	}

	@Override
	public int multiValid(Integer[] ids, int valid) {
		for(Integer id : ids){
			CommonRemarks record = new CommonRemarks();
			record.setProdCommonRemarksId(id);
			record.setIsValid(valid);
			record.setUpdateUser(getCurrentUserId());
			record.setUpdateTime(new Date());
			commonRemarksMapper.updateByPrimaryKeySelective(record);
		}
		return 1;
	}


}
