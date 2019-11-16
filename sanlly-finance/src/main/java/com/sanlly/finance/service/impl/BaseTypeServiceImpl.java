package com.sanlly.finance.service.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.FinanceIsEnabledEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.finance.dao.BaseTypeMapper;
import com.sanlly.finance.entity.BaseType;
import com.sanlly.finance.entity.BaseTypeExample;
import com.sanlly.finance.models.input.BaseTypeInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BaseTypeOutput;
import com.sanlly.finance.service.BaseTypeService;
import com.sanlly.finance.service.feign.AuthFeignClient;
import com.sanlly.finance.service.feign.ProductionFeignClient;

/**
 * 业务分类：冷箱：冷箱机组维修/冷箱箱体维修/PTI/其他          干箱：干箱维修/移箱/其他
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:37:58 
 * @version V1.0   
 */
@Service
public class BaseTypeServiceImpl extends BaseServiceImpl implements BaseTypeService {


	@Autowired
	private BaseTypeMapper dao;

	@Autowired
	private AuthFeignClient authFeignClient;

	@Autowired
	private ProductionFeignClient productionFeignClient;

	// 国际化表明
	private String tableName = "finance_base_type";

	/**
	 * 检索集合
	 */
	@Override
	public List<BaseTypeOutput> list(SearchBaseInput input) {
		BaseTypeExample example = new BaseTypeExample();
		BaseTypeExample.Criteria criteria = example.createCriteria();
		BaseTypeExample.Criteria criteria2 = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		// 名称 中英文
				if (!StringUtils.isEmpty(input.getName())) {
					criteria.andTypeNameLike("%" + input.getName().trim() + "%");
					criteria2.andTypeNameEnLike("%" + input.getName().trim() + "%");
				}

		example.or(criteria2);
		example.setOrderByClause(" `create_time` DESC");
		List<BaseType> list = dao.selectByExample(example);
		List<BaseTypeOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
					BaseTypeOutput output = new BaseTypeOutput();
					// 复制属性值到新对象
					BeanUtils.copyProperties(a, output);
					output.setTypeNameNameLang(a.getLangKey());
					output.setIsEnabledNameLang(a.getIsEnabled());

					// 查询用户
					// 创建人
					if (!StringUtils.isEmpty(a.getCreateUser())) {
						Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getCreateUser());
						output.setCreateUserName(user.getData().getUserName());
					}
					// 修改人创建人
					if (!StringUtils.isEmpty(a.getUpdateUser())) {
						Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getUpdateUser());
						output.setUpdateUserName(user.getData().getUserName());
					}

					return output;
				}).collect(Collectors.toList());

		return outputList;
	}

	/**
	 * 查询分页
	 */
	@Override
	public PagedList<BaseTypeOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		BaseTypeExample example = new BaseTypeExample();
		BaseTypeExample.Criteria criteria = example.createCriteria();
		BaseTypeExample.Criteria criteria2 = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		// 名称 中英文
		if (!StringUtils.isEmpty(input.getName())) {
			criteria.andTypeNameLike("%" + input.getName().trim() + "%");
			criteria2.andTypeNameEnLike("%" + input.getName().trim() + "%");
		}

		example.or(criteria2);
		int totalCount = (int) dao.countByExample(example);
		PagedList<BaseTypeOutput> pagedList = new PagedList<BaseTypeOutput>(input.getPageIndex(), input.getPageSize(),
				totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BaseType> list = dao.selectByExample(example);
		List<BaseTypeOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
					BaseTypeOutput output = new BaseTypeOutput();
					// 复制属性值到新对象
					BeanUtils.copyProperties(a, output);
					output.setTypeNameNameLang(a.getLangKey());
					output.setIsEnabledNameLang(a.getIsEnabled());
					// 查询用户
					// 创建人
					if (!StringUtils.isEmpty(a.getCreateUser())) {
						Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getCreateUser());
						output.setCreateUserName(user.getData().getUserName());
					}
					// 修改人创建人
					if (!StringUtils.isEmpty(a.getUpdateUser())) {
						Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getUpdateUser());
						output.setUpdateUserName(user.getData().getUserName());
					}


					return output;
				}).collect(Collectors.toList());
		pagedList.setDataList(outputList);
		return pagedList;
	}

	/**
	 * 修改或者添加
	 */
	@Override
	public Boolean addOrUpadte(BaseTypeInput input) {
		// TODO Auto-generated method stub
		BaseType record = new BaseType();
		BeanUtils.copyProperties(input, record);
		if (StringUtils.isEmpty(input.getId())) {
			// 获取key
			Result<String> key = productionFeignClient.getKey(tableName);
			record.setLangKey(key.getData());
			record.setIsDel(PlatformConstants.ISDEL_NO);
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			if (dao.insert(record) > 0) {
				return true;
			}
		} else {
			//查询一下信息
			BaseType info=dao.selectByPrimaryKey(input.getId());
			BeanUtils.copyProperties(info, record);
			BeanUtils.copyProperties(input, record);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			if (dao.updateByPrimaryKey(record) > 0) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 批量删除
	 */
	@Override
	public Boolean deletes(String[] ids) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ids.length; i++) {
			BaseType record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}

}
