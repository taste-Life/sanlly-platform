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
import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.company.CompanyOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.models.output.yard.YardOutput;
import com.sanlly.finance.dao.BasePtiRateMapper;
import com.sanlly.finance.entity.BasePtiRate;
import com.sanlly.finance.entity.BasePtiRateExample;
import com.sanlly.finance.models.input.BasePtiRateInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BasePtiRateOutput;
import com.sanlly.finance.service.BasePtiRateService;
import com.sanlly.finance.service.feign.AuthFeignClient;
import com.sanlly.finance.service.feign.ProductionFeignClient;

/**
 * 业务分类：冷箱：冷箱机组维修/冷箱箱体维修/PTI/其他 干箱：干箱维修/移箱/其他
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:37:58 
 * @version V1.0   
 */
@Service
public class BasePtiRateServiceImpl extends BaseServiceImpl implements BasePtiRateService {

	@Autowired
	private BasePtiRateMapper dao;

	@Autowired
	private AuthFeignClient authFeignClient;

	@Autowired
	private ProductionFeignClient productionFeignClient;

	/**
	 * 检索集合
	 */
	@Override
	public List<BasePtiRateOutput> list(SearchBaseInput input) {
		BasePtiRateExample example = new BasePtiRateExample();
		BasePtiRateExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		// 根据公司key
		if (!StringUtils.isEmpty(input.getCompanyKey())) {
			criteria.andCompanyKeyEqualTo(input.getCompanyKey());
		}

		// 根据场站key
		if (!StringUtils.isEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}
//		// 公司中英文检索
//		if (input.getCompanyName() != null && !StringUtils.isEmpty(input.getCompanyName())) {
//			BaseSearchInput baseInput = new BaseSearchInput();
//			baseInput.setName(input.getName());
//			Result<List<CompanyOutput>> rl = productionFeignClient.companyList(baseInput);
//			if (rl != null) {
//				List<CompanyOutput> listYard = rl.getData();
//				List<String> ids = listYard.stream().map(y -> y.getKey().toString()).collect(Collectors.toList());
//				criteria.andCompanyKeyIn(ids);
//
//			}
//		}
//		// 名称 中英文 根据场站名称查询
//		if (!StringUtils.isEmpty(input.getYard())) {
//			BaseSearchInput baseInput = new BaseSearchInput();
//			baseInput.setName(input.getName());
//			Result<List<YardOutput>> rl = productionFeignClient.yardList(baseInput);
//			if (rl != null) {
//				List<YardOutput> listYard = rl.getData();
//				List<String> ids = listYard.stream().map(y -> y.getKey().toString()).collect(Collectors.toList());
//				criteria.andYardIn(ids);
//
//			}
//		}
		example.setOrderByClause(" `create_time` DESC");
		List<BasePtiRate> list = dao.selectByExample(example);
		List<BasePtiRateOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			BasePtiRateOutput output = new BasePtiRateOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
			output.setIsEnabledNameLang(a.getIsEnabled());
			output.setCompanyKeyNameLang(a.getCompanyKey());
			output.setContainerUserNameLang(a.getContainerUser());
			output.setYardNameLang(a.getYard());
			output.setIsFormulaYfNameLang(a.getIsFormulaYf());
			output.setIsFormulaYsNameLang(a.getIsFormulaYs());
			output.setContainerSizeNameLang(a.getContainerSize());
			output.setComputeFormulaYfNameLang(a.getComputeFormulaYf());
//			output.setCurrencyTypeYsNameLang(a.getCurrencyTypeYs());
//			output.setCurrencyTypeYfNameLang(a.getCurrencyTypeYf());
			output.setComputeFormulaYsNameLang(a.getComputeFormulaYs());

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
	public PagedList<BasePtiRateOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		BasePtiRateExample example = new BasePtiRateExample();
		BasePtiRateExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		// 根据公司key
		if (!StringUtils.isEmpty(input.getCompanyKey())) {
			criteria.andCompanyKeyEqualTo(input.getCompanyKey());
		}

		// 根据场站key
		if (!StringUtils.isEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}
//		// 公司中英文检索
//		if (input.getCompanyName() != null && !StringUtils.isEmpty(input.getCompanyName())) {
//			BaseSearchInput baseInput = new BaseSearchInput();
//			baseInput.setName(input.getName());
//			Result<List<CompanyOutput>> rl = productionFeignClient.companyList(baseInput);
//			if (rl != null) {
//				List<CompanyOutput> listYard = rl.getData();
//				List<String> ids = listYard.stream().map(y -> y.getKey().toString()).collect(Collectors.toList());
//				criteria.andCompanyKeyIn(ids);
//
//			}
//		}
//		// 名称 中英文 根据场站名称查询
//		if (!StringUtils.isEmpty(input.getYard())) {
//			BaseSearchInput baseInput = new BaseSearchInput();
//			baseInput.setName(input.getName());
//			Result<List<YardOutput>> rl = productionFeignClient.yardList(baseInput);
//			if (rl != null) {
//				List<YardOutput> listYard = rl.getData();
//				List<String> ids = listYard.stream().map(y -> y.getKey().toString()).collect(Collectors.toList());
//				criteria.andYardIn(ids);
//
//			}
//		}
		int totalCount = (int) dao.countByExample(example);
		PagedList<BasePtiRateOutput> pagedList = new PagedList<BasePtiRateOutput>(input.getPageIndex(),
				input.getPageSize(), totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BasePtiRate> list = dao.selectByExample(example);
		List<BasePtiRateOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			BasePtiRateOutput output = new BasePtiRateOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
			output.setIsEnabledNameLang(a.getIsEnabled());
			output.setCompanyKeyNameLang(a.getCompanyKey());
			output.setContainerUserNameLang(a.getContainerUser());
			output.setYardNameLang(a.getYard());
			output.setIsFormulaYfNameLang(a.getIsFormulaYf());
			output.setIsFormulaYsNameLang(a.getIsFormulaYs());
			output.setContainerSizeNameLang(a.getContainerSize());
			output.setComputeFormulaYfNameLang(a.getComputeFormulaYf());
//			output.setCurrencyTypeYsNameLang(a.getCurrencyTypeYs());
//			output.setCurrencyTypeYfNameLang(a.getCurrencyTypeYf());
			output.setComputeFormulaYsNameLang(a.getComputeFormulaYs());

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
	public Boolean addOrUpadte(BasePtiRateInput input) {
		// TODO Auto-generated method stub
		BasePtiRate record = new BasePtiRate();
		BeanUtils.copyProperties(input, record);
		if (StringUtils.isEmpty(input.getId())) {
			record.setIsDel(PlatformConstants.ISDEL_NO);
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			if (dao.insert(record) > 0) {
				return true;
			}
		} else {
			// 查询一下信息
			BasePtiRate info = dao.selectByPrimaryKey(input.getId());
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
			BasePtiRate record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}

}
