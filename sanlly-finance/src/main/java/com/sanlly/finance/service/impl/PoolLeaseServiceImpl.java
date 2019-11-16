package com.sanlly.finance.service.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.FinanceBudgetTypeEnum;
import com.sanlly.common.enums.FinanceIsEnabledEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.finance.dao.PoolLeaseMapper;
import com.sanlly.finance.entity.BaseAuditDept;
import com.sanlly.finance.entity.PoolLease;
import com.sanlly.finance.entity.PoolLeaseExample;
import com.sanlly.finance.models.input.BaseAuditDeptInput;
import com.sanlly.finance.models.input.PoolBaseInput;
import com.sanlly.finance.models.input.PoolLeaseInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.PoolLeaseOutput;
import com.sanlly.finance.service.BaseAuditDeptService;
import com.sanlly.finance.service.PoolLeaseService;
import com.sanlly.finance.service.feign.AuthFeignClient;

/**
 * 	场地租赁费用实现类
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:37:58 
 * @version V1.0   
 */
@Service
public class PoolLeaseServiceImpl extends BaseServiceImpl implements PoolLeaseService {

	@Autowired
	private PoolLeaseMapper dao;

	@Autowired
	private AuthFeignClient authFeignClient;
	
	@Autowired
	private BaseAuditDeptService baseAuditDeptService;

	/**
	 * 查询分页
	 */
	@Override
	public PagedList<PoolLeaseOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		PoolLeaseExample example = new PoolLeaseExample();
		PoolLeaseExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录  和未启用的数据
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		if(!StringUtils.isEmpty(input.getName())){
			criteria.andCustomerNameLike("%"+input.getName()+"%");
		}
		int totalCount = (int) dao.countByExample(example);
		PagedList<PoolLeaseOutput> pagedList = new PagedList<PoolLeaseOutput>(input.getPageIndex(), input.getPageSize(),
				totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<PoolLease> list = dao.selectByExample(example);
		List<PoolLeaseOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
					PoolLeaseOutput output = new PoolLeaseOutput();
					// 复制属性值到新对象
					BeanUtils.copyProperties(a, output);
					output.setDeptKeyNameLang(a.getDeptKey());
					output.setIsEnabledNameLang(a.getIsEnabled());
					output.setChargeTypeIdNameLang(a.getChargeTypeKey());
					output.setCustomerNameNameLang(a.getCustomerName());
					output.setContainerUserNameLang(a.getContainerUser());
					output.setChargeObjectNameLang(a.getChargeObject());
					output.setFormulaTypeNameLang(a.getFormulaType());
					output.setCompanyKeyNameLang(a.getCompanyKey());
					output.setYardNameLang(a.getYard());
					output.setChargeInoutTypeNameLang(a.getChargeInoutType());
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
	public Boolean addOrUpadte(PoolLeaseInput input) {
		// TODO Auto-generated method stub
		PoolLease record = new PoolLease();
		BeanUtils.copyProperties(input, record);
		if (StringUtils.isEmpty(input.getId())) {

			record.setIsDel(PlatformConstants.ISDEL_NO);
			//查询核算部门
			if(record.getChargeInoutType().equals(FinanceBudgetTypeEnum.INCOME.getCode())) {//收入   租赁  利润中心
				// 核算部门查询
				BaseAuditDeptInput badInput = new BaseAuditDeptInput();
				//场站
				badInput.setYard(record.getYard());
				 
				BaseAuditDept baDept = baseAuditDeptService.getInfo(badInput);
				if (baDept != null) {
					record.setDeptKey(baDept.getProfitDept());// 通过场站查询得到 利润中心\
				}
			}else {
				// 核算部门查询
				BaseAuditDeptInput badInput = new BaseAuditDeptInput();
				//场站
				badInput.setYard(record.getYard());
				 
				BaseAuditDept baDept = baseAuditDeptService.getInfo(badInput);
				if (baDept != null) {
					record.setDeptKey(baDept.getCostDept());// 通过场站查询得到 利润中心\
					record.setDeptCode(baDept.getCostCenterCode());
				}
			}
			
			//查询费用类型
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			if (dao.insert(record) > 0) {
				return true;
			}
		} else {
			//查询一下信息
			PoolLease info=dao.selectByPrimaryKey(input.getId());
			BeanUtils.copyProperties(info, record);
			BeanUtils.copyProperties(input, record);
			record.setIsDel(info.getIsDel());
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			if (dao.updateByPrimaryKey(record) > 0) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 *  	批量修改
	 */
	@Override
	public Boolean Upadtes(List<PoolLeaseInput> input) {
		// TODO Auto-generated method stub
		PoolLease record = new PoolLease();
		BeanUtils.copyProperties(input, record);
	    if(input!=null) {
	    	for (PoolLeaseInput PoolLeaseInput : input) {
				if(PoolLeaseInput.getId()!=null) {
					//查询一下信息
					PoolLease info=dao.selectByPrimaryKey(PoolLeaseInput.getId());
					BeanUtils.copyProperties(info, record);
					BeanUtils.copyProperties(PoolLeaseInput, record);
					record.setUpdateTime(new Date());
					record.setUpdateUser(getCurrentUserId());
					dao.updateByPrimaryKey(record);
				}
			}
	    	return true;
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
			PoolLease record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}


	/**
	 * 批量费用确认
	 */
	@Override
	public Boolean costOk(String[] ids) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ids.length; i++) {
			PoolLease record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}

	/**
	 * 无法收费
	 */
	@Override
	public Boolean NoCharge(PoolBaseInput input) {
		// TODO Auto-generated method stub
		PoolLease record = dao.selectByPrimaryKey(Integer.parseInt(input.getId()));
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		Integer result=dao.updateByPrimaryKey(record);
		if(result>0) {
			return true;
		}else {
			return false;
		}
		
	}

}
