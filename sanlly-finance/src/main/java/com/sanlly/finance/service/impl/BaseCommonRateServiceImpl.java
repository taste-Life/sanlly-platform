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
import com.sanlly.finance.dao.BaseChargeMapper;
import com.sanlly.finance.dao.BaseCommonRateMapper;
import com.sanlly.finance.entity.BaseCharge;
import com.sanlly.finance.entity.BaseChargeExample;
import com.sanlly.finance.entity.BaseCommonRate;
import com.sanlly.finance.entity.BaseCommonRateExample;
import com.sanlly.finance.models.input.BaseCommonRateInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BaseCommonRateOutput;
import com.sanlly.finance.service.BaseCommonRateService;
import com.sanlly.finance.service.feign.AuthFeignClient;
import com.sanlly.finance.service.feign.ProductionFeignClient;

/**
 * 通用费率表
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:37:58 
 * @version V1.0   
 */
@Service
public class BaseCommonRateServiceImpl extends BaseServiceImpl implements BaseCommonRateService {


	@Autowired
	private BaseCommonRateMapper dao;
	@Autowired
	private BaseChargeMapper chargeDao;
	@Autowired
	private AuthFeignClient authFeignClient;

	/**
	 * 检索集合
	 */
	@Override
	public List<BaseCommonRateOutput> list(SearchBaseInput input) {
		BaseCommonRateExample example = new BaseCommonRateExample();
		BaseCommonRateExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		// 公司查询
		if (!StringUtils.isEmpty(input.getCompanyKey())) {
			criteria.andCompanyKeyEqualTo(input.getCompanyKey());
		}

		example.setOrderByClause(" `create_time` DESC");
		List<BaseCommonRate> list = dao.selectByExample(example);
		List<BaseCommonRateOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
					BaseCommonRateOutput output = new BaseCommonRateOutput();
					// 复制属性值到新对象
					BeanUtils.copyProperties(a, output);
					output.setIsEnabledNameLang(a.getIsEnabled());
					output.setChargeKeyNameLang(a.getChargeKey());
					output.setCompanyKeyNameLang(a.getCompanyKey());
					output.setContainerUserNameLang(a.getContainerUser());
					output.setYardNameLang(a.getYard());
					output.setContainerSizeNameLang(a.getContainerSize());
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
	public PagedList<BaseCommonRateOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		BaseCommonRateExample example = new BaseCommonRateExample();
		BaseCommonRateExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		// 公司查询
		if (!StringUtils.isEmpty(input.getCompanyKey())) {
			criteria.andCompanyKeyEqualTo(input.getCompanyKey());
		}
//		// 费用名称查询
//		if (!StringUtils.isEmpty(input.getName())) {
//			// List<BaseCharge> selectByExample(BaseChargeExample example);
//			BaseChargeExample bcexample=new BaseChargeExample();
//			BaseChargeExample.Criteria criteria1=bcexample.createCriteria();
//			BaseChargeExample.Criteria criteria2=bcexample.createCriteria();
//			criteria1.andChargeNameLike("%" + input.getName().trim() + "%");
//			criteria2.andChargeNameEnLike("%" + input.getName().trim() + "%");
//			bcexample.or(criteria2);
//			List<BaseCharge> bcList=chargeDao.selectByExample(bcexample);
//			List<String> bcListKey=bcList.stream().map(x->x.getLangKey()).collect(Collectors.toList());
//			
//			criteria.andChargeKeyIn(bcListKey);
//		}

		int totalCount = (int) dao.countByExample(example);
		PagedList<BaseCommonRateOutput> pagedList = new PagedList<BaseCommonRateOutput>(input.getPageIndex(), input.getPageSize(),
				totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BaseCommonRate> list = dao.selectByExample(example);
		List<BaseCommonRateOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
					BaseCommonRateOutput output = new BaseCommonRateOutput();
					// 复制属性值到新对象
					BeanUtils.copyProperties(a, output);
					output.setIsEnabledNameLang(a.getIsEnabled());
					output.setChargeKeyNameLang(a.getChargeKey());
					output.setCompanyKeyNameLang(a.getCompanyKey());
					output.setContainerUserNameLang(a.getContainerUser());
					output.setYardNameLang(a.getYard());
					output.setContainerSizeNameLang(a.getContainerSize());

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
	public Boolean addOrUpadte(BaseCommonRateInput input) {
		// TODO Auto-generated method stub
		BaseCommonRate record = new BaseCommonRate();
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
			BaseCommonRate info=dao.selectByPrimaryKey(input.getId());
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
			BaseCommonRate record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}

}
