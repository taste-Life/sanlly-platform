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
import com.sanlly.finance.dao.BaseDiscountMapper;
import com.sanlly.finance.entity.BaseDiscount;
import com.sanlly.finance.entity.BaseDiscountExample;
import com.sanlly.finance.models.input.BaseDiscountInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BaseDiscountOutput;
import com.sanlly.finance.service.BaseDiscountService;
import com.sanlly.finance.service.feign.AuthFeignClient;

/**
 * 	公司折扣实现类
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:37:58 
 * @version V1.0   
 */
@Service
public class BaseDiscountServiceImpl extends BaseServiceImpl implements BaseDiscountService {


	@Autowired
	private BaseDiscountMapper dao;

	@Autowired
	private AuthFeignClient authFeignClient;

	/**
	 * 检索集合
	 */
	@Override
	public List<BaseDiscountOutput> list(SearchBaseInput input) {
		BaseDiscountExample example = new BaseDiscountExample();
		BaseDiscountExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		// 公司
		if (!StringUtils.isEmpty(input.getCompanyKey())) {
			criteria.andCompanyKeyEqualTo(input.getCompanyKey());
		}
		// 场站
		if (!StringUtils.isEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}

		example.setOrderByClause(" ``create_time` DESC");
		List<BaseDiscount> list = dao.selectByExample(example);
		List<BaseDiscountOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
					BaseDiscountOutput output = new BaseDiscountOutput();
					// 复制属性值到新对象
					BeanUtils.copyProperties(a, output);
					output.setIsEnabledNameLang(a.getIsEnabled());
					output.setCompanyKeyNameLang(a.getCompanyKey());
					output.setYardNameLang(a.getYard());
					output.setContainerUserNameLang(a.getContainerUser());
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
	public PagedList<BaseDiscountOutput> getPage(SearchBaseInput input) {
		BaseDiscountExample example = new BaseDiscountExample();
		BaseDiscountExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		// 公司
		if (!StringUtils.isEmpty(input.getCompanyKey())) {
			criteria.andCompanyKeyEqualTo(input.getCompanyKey());
		}
		// 场站
		if (!StringUtils.isEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}

		int totalCount = (int) dao.countByExample(example);
		PagedList<BaseDiscountOutput> pagedList = new PagedList<BaseDiscountOutput>(input.getPageIndex(), input.getPageSize(),
				totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BaseDiscount> list = dao.selectByExample(example);
		List<BaseDiscountOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
					BaseDiscountOutput output = new BaseDiscountOutput();
					// 复制属性值到新对象
					BeanUtils.copyProperties(a, output);
					output.setIsEnabledNameLang(a.getIsEnabled());
					output.setCompanyKeyNameLang(a.getCompanyKey());
					output.setYardNameLang(a.getYard());
					output.setContainerUserNameLang(a.getContainerUser());
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
	public Boolean addOrUpadte(BaseDiscountInput input) {
		// TODO Auto-generated method stub
		BaseDiscount record = new BaseDiscount();
		BeanUtils.copyProperties(input, record);
		if (StringUtils.isEmpty(input.getId())) {
			// 获取key
			record.setIsDel(PlatformConstants.ISDEL_NO);
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			if (dao.insert(record) > 0) {
				return true;
			}
		} else {
			//查询一下信息
			BaseDiscount info=dao.selectByPrimaryKey(input.getId());
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
			BaseDiscount record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}

}
