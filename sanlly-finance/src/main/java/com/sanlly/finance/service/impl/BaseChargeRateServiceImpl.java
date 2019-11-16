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
import com.sanlly.finance.dao.BaseChargeRateMapper;
import com.sanlly.finance.dao.BaseTaxRateMapper;
import com.sanlly.finance.entity.BaseCharge;
import com.sanlly.finance.entity.BaseChargeExample;
import com.sanlly.finance.entity.BaseChargeRate;
import com.sanlly.finance.entity.BaseChargeRateExample;
import com.sanlly.finance.entity.BaseTaxRate;
import com.sanlly.finance.models.input.BaseChargeRateInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BaseChargeRateOutput;
import com.sanlly.finance.service.BaseChargeRateService;
import com.sanlly.finance.service.feign.AuthFeignClient;

/**
 * 费用类型税率对应表
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:37:58 
 * @version V1.0   
 */
@Service
public class BaseChargeRateServiceImpl extends BaseServiceImpl implements BaseChargeRateService {


	@Autowired
	private BaseChargeRateMapper dao;
	
	@Autowired
	private BaseChargeMapper chargeDao;
	
	@Autowired
	private BaseTaxRateMapper taxRateDao;

	@Autowired
	private AuthFeignClient authFeignClient;


	/**
	 * 检索集合
	 */
	@Override
	public List<BaseChargeRateOutput> list(SearchBaseInput input) {
		BaseChargeRateExample example = new BaseChargeRateExample();
		BaseChargeRateExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		
		// 费用名称查询税率
		if (!StringUtils.isEmpty(input.getName())) {
			BaseChargeExample bcexample=new BaseChargeExample();
			BaseChargeExample.Criteria criteria1= bcexample.createCriteria();
			BaseChargeExample.Criteria criteria2= bcexample.createCriteria();
			
			criteria1.andChargeNameLike(input.getName());
			criteria2.andChargeNameEnLike(input.getName());
			bcexample.or(criteria2);
			List<BaseCharge> bcList=chargeDao.selectByExample(bcexample);
			List<String> bcKey=bcList.stream().map(x->x.getLangKey()).collect(Collectors.toList());
			criteria.andChargeKeyIn(bcKey);
		}

		example.setOrderByClause(" `create_time` DESC");
		List<BaseChargeRate> list = dao.selectByExample(example);
		List<BaseChargeRateOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
					BaseChargeRateOutput output = new BaseChargeRateOutput();
					// 复制属性值到新对象
					BeanUtils.copyProperties(a, output);
					output.setChargeKeyNameLang(a.getChargeKey());
					output.setIsEnabledNameLang(a.getIsEnabled());
					if(a.getTaxRateId()!=null) {
						BaseTaxRate btr=taxRateDao.selectByPrimaryKey(a.getTaxRateId());
						output.setTaxRate(btr.getTaxRate());
					}

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
	public PagedList<BaseChargeRateOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		BaseChargeRateExample example = new BaseChargeRateExample();
		BaseChargeRateExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
				criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
				
				// 费用名称查询税率
				if (!StringUtils.isEmpty(input.getName())) {
					BaseChargeExample bcexample=new BaseChargeExample();
					BaseChargeExample.Criteria criteria1= bcexample.createCriteria();
					BaseChargeExample.Criteria criteria2= bcexample.createCriteria();
					
					criteria1.andChargeNameLike(input.getName());
					criteria2.andChargeNameEnLike(input.getName());
					bcexample.or(criteria2);
					List<BaseCharge> bcList=chargeDao.selectByExample(bcexample);
					List<String> bcKey=bcList.stream().map(x->x.getLangKey()).collect(Collectors.toList());
					criteria.andChargeKeyIn(bcKey);
				}

		int totalCount = (int) dao.countByExample(example);
		PagedList<BaseChargeRateOutput> pagedList = new PagedList<BaseChargeRateOutput>(input.getPageIndex(), input.getPageSize(),
				totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BaseChargeRate> list = dao.selectByExample(example);
		List<BaseChargeRateOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
					BaseChargeRateOutput output = new BaseChargeRateOutput();
					// 复制属性值到新对象
					BeanUtils.copyProperties(a, output);
					output.setChargeKeyNameLang(a.getChargeKey());
					output.setIsEnabledNameLang(a.getIsEnabled());
					if(a.getTaxRateId()!=null) {
						BaseTaxRate btr=taxRateDao.selectByPrimaryKey(a.getTaxRateId());
						output.setTaxRate(btr.getTaxRate());
					}

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
	public Boolean addOrUpadte(BaseChargeRateInput input) {
		// TODO Auto-generated method stub
		BaseChargeRate record = new BaseChargeRate();
		BeanUtils.copyProperties(input, record);
		if (StringUtils.isEmpty(input.getId())) {
			record.setIsDel(PlatformConstants.ISDEL_NO);
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			if (dao.insert(record) > 0) {
				return true;
			}
		} else {
			//查询一下信息
			BaseChargeRate info=dao.selectByPrimaryKey(input.getId());
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
			BaseChargeRate record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}

}
