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
import com.sanlly.finance.dao.BaseAuditDeptMapper;
import com.sanlly.finance.entity.BaseAuditDept;
import com.sanlly.finance.entity.BaseAuditDeptExample;
import com.sanlly.finance.models.input.BaseAuditDeptInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BaseAuditDeptOutput;
import com.sanlly.finance.service.BaseAuditDeptService;
import com.sanlly.finance.service.feign.AuthFeignClient;

/**
 * 核算部门
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:37:58 
 * @version V1.0   
 */
@Service
public class BaseAuditDeptServiceImpl extends BaseServiceImpl implements BaseAuditDeptService {

	@Autowired
	private BaseAuditDeptMapper dao;

	@Autowired
	private AuthFeignClient authFeignClient;

	/**
	 * 获取核算部门信息
	 */
	@Override
	public BaseAuditDept getInfo(BaseAuditDeptInput input) {
		BaseAuditDeptExample example = new BaseAuditDeptExample();
		BaseAuditDeptExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		// 根据公司
		if (!StringUtils.isEmpty(input.getCompanyKey())) {
			criteria.andCompanyKeyEqualTo(input.getCompanyKey());
		}
		// 根据场站
		if (!StringUtils.isEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}
		// 根据类别
		if (!StringUtils.isEmpty(input.getContainerCategory())) {
			criteria.andContainerCategoryEqualTo(input.getContainerCategory());
		}
		// 根据费用类型
		if (!StringUtils.isEmpty(input.getChargeKey())) {
			criteria.andChargeKeyEqualTo(input.getChargeKey());
		}

		example.setOrderByClause(" `create_time` DESC");
		List<BaseAuditDept> list = dao.selectByExample(example);
		if(list!=null && list.size()>0) {
			return list.get(0);
		}else {
			return null;
		}
	}

	/**
	 * 检索集合
	 */
	@Override
	public List<BaseAuditDeptOutput> list(SearchBaseInput input) {
		BaseAuditDeptExample example = new BaseAuditDeptExample();
		BaseAuditDeptExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());

		example.setOrderByClause(" `create_time` DESC");
		List<BaseAuditDept> list = dao.selectByExample(example);
		List<BaseAuditDeptOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			BaseAuditDeptOutput output = new BaseAuditDeptOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
			output.setCompanyKeyNameLang(a.getCompanyKey());
			output.setYardNameLang(a.getYard());
			output.setChargeKeyNameLang(a.getChargeKey());
			output.setContainerCategoryNameLang(a.getContainerCategory());
			output.setProfitCenterNameLang(a.getProfitCenter());
			output.setProfitDeptNameLang(a.getProfitDept());
			output.setCostCenterNameLang(a.getCostCenter());
			output.setCostDeptNameLang(a.getCostDept());
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
	public PagedList<BaseAuditDeptOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		BaseAuditDeptExample example = new BaseAuditDeptExample();
		BaseAuditDeptExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		int totalCount = (int) dao.countByExample(example);
		PagedList<BaseAuditDeptOutput> pagedList = new PagedList<BaseAuditDeptOutput>(input.getPageIndex(),
				input.getPageSize(), totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BaseAuditDept> list = dao.selectByExample(example);
		List<BaseAuditDeptOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			BaseAuditDeptOutput output = new BaseAuditDeptOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
			output.setCompanyKeyNameLang(a.getCompanyKey());
			output.setYardNameLang(a.getYard());
			output.setChargeKeyNameLang(a.getChargeKey());
			output.setContainerCategoryNameLang(a.getContainerCategory());
			output.setProfitCenterNameLang(a.getProfitCenter());
			output.setProfitDeptNameLang(a.getProfitDept());
			output.setCostCenterNameLang(a.getCostCenter());
			output.setCostDeptNameLang(a.getCostDept());
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
	public Boolean addOrUpadte(BaseAuditDeptInput input) {
		// TODO Auto-generated method stub
		BaseAuditDept record = new BaseAuditDept();
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
			BaseAuditDept info = dao.selectByPrimaryKey(input.getId());
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
			BaseAuditDept record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}

}
