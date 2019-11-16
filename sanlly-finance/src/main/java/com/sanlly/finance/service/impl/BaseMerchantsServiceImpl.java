package com.sanlly.finance.service.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.finance.dao.BaseMerchantsMapper;
import com.sanlly.finance.entity.BaseMerchants;
import com.sanlly.finance.entity.BaseMerchantsExample;
import com.sanlly.finance.models.input.BaseMerchantsInput;
import com.sanlly.finance.models.input.SearchMerchantsInput;
import com.sanlly.finance.models.output.BaseMerchantsOutput;
import com.sanlly.finance.service.BaseMerchantsService;
import com.sanlly.finance.service.feign.AuthFeignClient;
import com.sanlly.finance.service.feign.ProductionFeignClient;

@Service
public class BaseMerchantsServiceImpl extends BaseServiceImpl implements BaseMerchantsService {

	@Autowired
	private BaseMerchantsMapper dao;

	@Autowired
	private ProductionFeignClient productionFeignClient;

	@Autowired
	private AuthFeignClient authFeignClient;

	private String merchantsTableName = "finance_base_merchants";

	/**
	 * 客户信息分页查询 Title: getMerchantsPage Description:
	 * 
	 * @param input
	 * @return
	 * @see com.sanlly.finance.service.BaseMerchantsService#getMerchantsPage(com.sanlly.finance.models.input.SearchMerchantsInput)
	 */
	@Override
	public PagedList<BaseMerchantsOutput> getMerchantsPage(SearchMerchantsInput input) {
		// TODO Auto-generated method stub
		BaseMerchantsExample example = new BaseMerchantsExample();
		BaseMerchantsExample.Criteria criteria = example.createCriteria();
		BaseMerchantsExample.Criteria criteria2 = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		// 客商名称
		if (input.getMerchantsName()!=null && !StringUtils.isEmpty(input.getMerchantsName().trim())) {
			criteria.andMerchantsNameLike("%"+input.getMerchantsName().trim()+"%");
			criteria2.andMerchantsNameEnLike("%"+input.getMerchantsName().trim()+"%");
		}
		example.or(criteria2);
		int totalCount = (int) dao.countByExample(example);
		PagedList<BaseMerchantsOutput> pagedList = new PagedList<BaseMerchantsOutput>(input.getPageIndex(), input.getPageSize(),
				totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BaseMerchants> merchantsList = dao.selectByExample(example);
		List<BaseMerchantsOutput> outputList = merchantsList.stream().map(a -> {
			BaseMerchantsOutput output = new BaseMerchantsOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
//			output.setCompanyKeyNameLang(a.getCompanyKey());
			output.setIsEnabledNameLang(a.getIsEnabled());
			output.setMerchantsKeyNameLang(a.getMerchantsKey());
			//创建用户
			if (!StringUtils.isEmpty(a.getCreateUser())) {
				Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getCreateUser());
				output.setCreateUserName(user.getData().getUserName());
			}
			//修改用户
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
	 * 客户信息全部导出 Title: exportMerchantsAll Description:
	 * 
	 * @param input
	 * @return
	 * @see com.sanlly.finance.service.BaseMerchantsService#exportMerchantsAll(com.sanlly.finance.models.input.SearchMerchantsInput)
	 */
	@Override
	public List<BaseMerchantsOutput> exportMerchantsAll(SearchMerchantsInput input) {
		// TODO Auto-generated method stub
		BaseMerchantsExample example = new BaseMerchantsExample();
		BaseMerchantsExample.Criteria criteria = example.createCriteria();
		BaseMerchantsExample.Criteria criteria2 = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		// 客商名称
		if (!StringUtils.isEmpty(input.getMerchantsName().trim())) {
			criteria.andMerchantsNameLike("%"+input.getMerchantsName().trim()+"%");
			criteria2.andMerchantsNameEnLike("%"+input.getMerchantsName().trim()+"%");
		}
		example.or(criteria2);
		example.setOrderByClause(" `create_time` DESC");
		List<BaseMerchants> merchantsList = dao.selectByExample(example);
		List<BaseMerchantsOutput> outputList = merchantsList.stream().map(a -> {
			BaseMerchantsOutput output = new BaseMerchantsOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
//			output.setCompanyKeyNameLang(a.getCompanyKey());
			output.setIsEnabledNameLang(a.getIsEnabled());
			output.setMerchantsKeyNameLang(a.getMerchantsKey());
			//创建用户
			if (!StringUtils.isEmpty(a.getCreateUser())) {
				Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getCreateUser());
				output.setCreateUserName(user.getData().getUserName());
			}
			//修改用户
			if (!StringUtils.isEmpty(a.getUpdateUser())) {
				Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getUpdateUser());
				output.setUpdateUserName(user.getData().getUserName());
			}

			return output;
		}).collect(Collectors.toList());

		return outputList;
	}

	/**
	 * 添加或者修改客户信息 Title: addOrUpadteMerchants Description:
	 * 
	 * @param input
	 * @return
	 * @see com.sanlly.finance.service.BaseMerchantsService#addOrUpadteMerchants(com.sanlly.finance.models.input.MerchantsInput)
	 */
	@Override
	public Boolean addOrUpadteMerchants(BaseMerchantsInput input) {
		// TODO Auto-generated method stub
		BaseMerchants record = new BaseMerchants();
		BeanUtils.copyProperties(input, record);
		if (StringUtils.isEmpty(input.getId())) {
			// 获取key
			Result<String> key = productionFeignClient.getKey(merchantsTableName);
			record.setMerchantsKey(key.getData());
			record.setIsDel(PlatformConstants.ISDEL_NO);
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			record.setCreditDate(input.getCreditDate());
			if (dao.insert(record) > 0) {
				return true;
			}
		} else {
			//查询一下信息
			BaseMerchants info=dao.selectByPrimaryKey(input.getId());
			BeanUtils.copyProperties(info, record);
			BeanUtils.copyProperties(input, record);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			record.setCreditDate(input.getCreditDate());
			if (dao.updateByPrimaryKey(record) > 0) {
				return true;
			}
		}

		return false;

	}

	/**
	 * 删除客户信息 Title: deletesMerchants Description:
	 * 
	 * @param ids
	 * @return
	 * @see com.sanlly.finance.service.BaseMerchantsService#deletesMerchants(java.lang.String[])
	 */
	@Override
	public Boolean deletesMerchants(String[] ids) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ids.length; i++) {
			BaseMerchants record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
//			dao.deleteByPrimaryKey(Integer.parseInt(ids[i]));
		}
		return true;
	}

	/**
	 * 根据条件查询客户信息列表
	 */
	@Override
	public List<BaseMerchantsOutput> list(SearchMerchantsInput input) {
		// TODO Auto-generated method stub
				BaseMerchantsExample example = new BaseMerchantsExample();
				BaseMerchantsExample.Criteria criteria = example.createCriteria();
				BaseMerchantsExample.Criteria criteria2 = example.createCriteria();
				// 过滤掉删除的记录
				criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				criteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				// 客商名称
				if (input.getMerchantsName()!=null && !StringUtils.isEmpty(input.getMerchantsName().trim())) {
					criteria.andMerchantsNameLike("%"+input.getMerchantsName().trim()+"%");
					criteria2.andMerchantsNameEnLike("%"+input.getMerchantsName().trim()+"%");
				}
				example.or(criteria2);
				example.setOrderByClause(" `create_time` DESC");
				List<BaseMerchants> merchantsList = dao.selectByExample(example);
				List<BaseMerchantsOutput> outputList = merchantsList.stream().map(a -> {
					BaseMerchantsOutput output = new BaseMerchantsOutput();
					// 复制属性值到新对象
					BeanUtils.copyProperties(a, output);
					output.setCompanyKeyNameLang(a.getCompanyKey());
					output.setIsEnabledNameLang(a.getIsEnabled());
					output.setMerchantsKeyNameLang(a.getMerchantsKey());
					//创建用户
					if (!StringUtils.isEmpty(a.getCreateUser())) {
						Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getCreateUser());
						output.setCreateUserName(user.getData().getUserName());
					}
					//修改用户
					if (!StringUtils.isEmpty(a.getUpdateUser())) {
						Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getUpdateUser());
						output.setUpdateUserName(user.getData().getUserName());
					}

					return output;
				}).collect(Collectors.toList());
				return outputList;
	}

}
