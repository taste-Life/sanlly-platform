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
import com.sanlly.finance.dao.BaseWorkHoursRateMapper;
import com.sanlly.finance.dao.WorkGroupMapper;
import com.sanlly.finance.entity.BaseWorkHoursRate;
import com.sanlly.finance.entity.BaseWorkHoursRateExample;
import com.sanlly.finance.entity.WorkGroup;
import com.sanlly.finance.entity.WorkGroupExample;
import com.sanlly.finance.models.input.BaseWorkHoursRateInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BaseWorkHoursRateOutput;
import com.sanlly.finance.models.output.WorkGroupOutput;
import com.sanlly.finance.service.BaseWorkHoursRateService;
import com.sanlly.finance.service.feign.AuthFeignClient;
import com.sanlly.finance.service.feign.ProductionFeignClient;

/**
 * 	维修班组工时费率表
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:37:58 
 * @version V1.0   
 */
@Service
public class BaseWorkHoursRateServiceImpl extends BaseServiceImpl implements BaseWorkHoursRateService {

	@Autowired
	private BaseWorkHoursRateMapper dao;

	@Autowired
	private AuthFeignClient authFeignClient;

	@Autowired
	private ProductionFeignClient productionFeignClient;

	@Autowired
	private WorkGroupMapper workGroupDao;// 根据生产中的班组查询用户名

	/**
	 * 检索集合
	 */
	@Override
	public List<BaseWorkHoursRateOutput> list(SearchBaseInput input) {
		BaseWorkHoursRateExample example = new BaseWorkHoursRateExample();
		BaseWorkHoursRateExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		//根据公司key
		if(!StringUtils.isEmpty(input.getCompanyKey())) {
			criteria.andCompanyKeyEqualTo(input.getCompanyKey());
		}
		
		//根据场站key
		if(!StringUtils.isEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}
		
//		// 公司中英文检索
//		if (input.getCompanyName() != null && !StringUtils.isEmpty(input.getCompanyName().trim())) {
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
//		if (!StringUtils.isEmpty(input.getYard().trim())) {
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
		List<BaseWorkHoursRate> list = dao.selectByExample(example);
		List<BaseWorkHoursRateOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			BaseWorkHoursRateOutput output = new BaseWorkHoursRateOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
			output.setIsEnabledNameLang(a.getIsEnabled());
			output.setCompanyKeyNameLang(a.getCompanyKey());
			output.setYardNameLang(a.getYard());
			
			// 根据班组取用户名称
			if (a.getWorkGroupId() != null) {
				WorkGroup wg = workGroupDao.selectByPrimaryKey(a.getWorkGroupId());
				if (wg.getUser() != null) {
					Result<UserInfoOutput> user = authFeignClient.getUserDetail(wg.getUser());
					output.setWorkGroupName(user.getData().getUserName());
				}
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
	public PagedList<BaseWorkHoursRateOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		BaseWorkHoursRateExample example = new BaseWorkHoursRateExample();
		BaseWorkHoursRateExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		//根据公司key
		if(!StringUtils.isEmpty(input.getCompanyKey())) {
			criteria.andCompanyKeyEqualTo(input.getCompanyKey());
		}
		
		//根据场站key
		if(!StringUtils.isEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}
		
//		// 公司中英文检索
//		if (input.getCompanyName() != null && !StringUtils.isEmpty(input.getCompanyName().trim())) {
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
//		if (!StringUtils.isEmpty(input.getYard().trim())) {
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
		PagedList<BaseWorkHoursRateOutput> pagedList = new PagedList<BaseWorkHoursRateOutput>(input.getPageIndex(),
				input.getPageSize(), totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BaseWorkHoursRate> list = dao.selectByExample(example);
		List<BaseWorkHoursRateOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			BaseWorkHoursRateOutput output = new BaseWorkHoursRateOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
			output.setIsEnabledNameLang(a.getIsEnabled());
			output.setCompanyKeyNameLang(a.getCompanyKey());
			output.setYardNameLang(a.getYard());
			// 根据班组取用户名称
			if (a.getWorkGroupId() != null) {
				WorkGroup wg = workGroupDao.selectByPrimaryKey(a.getWorkGroupId());
				if (wg.getUser() != null) {
					Result<UserInfoOutput> user = authFeignClient.getUserDetail(wg.getUser());
					output.setWorkGroupName(user.getData().getUserName());
				}
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
	public Boolean addOrUpadte(BaseWorkHoursRateInput input) {
		// TODO Auto-generated method stub
		BaseWorkHoursRate record = new BaseWorkHoursRate();
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
			BaseWorkHoursRate info = dao.selectByPrimaryKey(input.getId());
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
			BaseWorkHoursRate record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}

	/**
	 * 	根据 公司 场站 获取班组下拉框
	 */
	@Override
	public List<WorkGroupOutput> getWorkGroupList(SearchBaseInput input) {
		// TODO Auto-generated method stub
				WorkGroupExample example = new WorkGroupExample();
				WorkGroupExample.Criteria criteria = example.createCriteria();
				// 公司
				if (!StringUtils.isEmpty(input.getCompanyName())) {
					criteria.andCompanyEqualTo(input.getCompanyName());
				}
				// 场站
				if (!StringUtils.isEmpty(input.getYard())) {
					criteria.andYardEqualTo(input.getYard());
				}

				example.setOrderByClause(" `create_time` DESC");
				List<WorkGroup> list = workGroupDao.selectByExample(example);
				List<WorkGroupOutput> outlist = list.stream().map(a -> {
					WorkGroupOutput output = new WorkGroupOutput();
					output.setProdWorkGroupId(a.getProdWorkGroupId());
					// 查询填充用户名
					// 创建用户
					if (!StringUtils.isEmpty(a.getUser())) {
						Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getUser());
						output.setWorkgroupName(user.getData().getUserName());
					}
					return output;
				}).collect(Collectors.toList());
				return outlist;
	}

}
