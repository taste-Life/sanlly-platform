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
import com.sanlly.finance.dao.BaseExchangeRateMapper;
import com.sanlly.finance.entity.BaseExchangeRate;
import com.sanlly.finance.entity.BaseExchangeRateExample;
import com.sanlly.finance.models.input.BaseExchangeRateInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BaseExchangeRateOutput;
import com.sanlly.finance.service.BaseExchangeRateService;
import com.sanlly.finance.service.feign.AuthFeignClient;

/**
 * 汇率表实现类
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:37:58 
 * @version V1.0   
 */
@Service
public class BaseExchangeRateServiceImpl extends BaseServiceImpl implements BaseExchangeRateService {

	/**
	 * 核算部门 Mapper
	 */
	@Autowired
	private BaseExchangeRateMapper dao;

	@Autowired
	private AuthFeignClient authFeignClient;


	/**
	 * 查询分页
	 */
	@Override
	public PagedList<BaseExchangeRateOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		BaseExchangeRateExample example = new BaseExchangeRateExample();
		BaseExchangeRateExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		// 名称 中英文
		if (input.getName() != null && !StringUtils.isEmpty(input.getName().trim())) {
			// 查询年月
			criteria.andRateYearMonthLike("%" + input.getName().trim() + "%");
		}
		int totalCount = (int) dao.countByExample(example);
		PagedList<BaseExchangeRateOutput> pagedList = new PagedList<BaseExchangeRateOutput>(input.getPageIndex(),
				input.getPageSize(), totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BaseExchangeRate> list = dao.selectByExample(example);
		List<BaseExchangeRateOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
					BaseExchangeRateOutput output = new BaseExchangeRateOutput();
					// 复制属性值到新对象
					BeanUtils.copyProperties(a, output);
					
					output.setIsEnabledNameLang(a.getIsEnabled());
					// 查询用户
					// 创建人
					if (!StringUtils.isEmpty(a.getCreateUser())) {
						Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getCreateUser());
						output.setCreateUserName(user.getData().getUserName());
					}
					// 修改人
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
	public Boolean addOrUpadte(BaseExchangeRateInput input) {
		// TODO Auto-generated method stub
		BaseExchangeRate record = new BaseExchangeRate();
		BeanUtils.copyProperties(input, record);
		if (StringUtils.isEmpty(input.getExchangeRateId())) {

			record.setIsDel(PlatformConstants.ISDEL_NO);
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			if (dao.insert(record) > 0) {
				return true;
			}
		} else {
			// 查询一下信息
			BaseExchangeRate info = dao.selectByPrimaryKey(input.getExchangeRateId());
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
			BaseExchangeRate record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}

	/**
	 * 查询最新汇率
	 */
	@Override
	public String getNewRate() {
		// TODO Auto-generated method stub
		BaseExchangeRateExample example = new BaseExchangeRateExample();
		BaseExchangeRateExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		example.setOrderByClause(" `create_time` DESC");
		List<BaseExchangeRate> list = dao.selectByExample(example);
		String result = "1";
		if (list != null && list.size() > 0) {
			result = list.get(0) != null ? list.get(0).getExchangeRate().toString() : "1";
		}
		return result;
	}

}
