package com.sanlly.finance.service.impl;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.FinanceCostStatusEnum;
import com.sanlly.common.enums.FinanceIsEnabledEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.finance.dao.PoolCostTransportMapper;
import com.sanlly.finance.entity.PoolCostTransport;
import com.sanlly.finance.entity.PoolCostTransportExample;
import com.sanlly.finance.models.input.PoolBaseInput;
import com.sanlly.finance.models.input.PoolCostTransportInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.PoolCostTransportOutput;
import com.sanlly.finance.service.PoolCostTransportService;
import com.sanlly.finance.service.feign.AuthFeignClient;

/**
 * 	成本-运输费用池实现类
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:37:58 
 * @version V1.0   
 */
@Service
public class PoolCostTransportServiceImpl extends BaseServiceImpl implements PoolCostTransportService {

	@Autowired
	private PoolCostTransportMapper dao;

	@Autowired
	private AuthFeignClient authFeignClient;

	/**
	 * 查询分页
	 */
	@Override
	public PagedList<PoolCostTransportOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		PoolCostTransportExample example = new PoolCostTransportExample();
		PoolCostTransportExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录  和未启用的数据
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		if(!StringUtils.isEmpty(input.getName())){
			criteria.andContainerNoLike("%"+input.getName()+"%");
		}
		//费用状态
		if(!StringUtils.isEmpty(input.getCode())){
			criteria.andFreeStatusEqualTo(input.getCode());
		}
		int totalCount = (int) dao.countByExample(example);
		PagedList<PoolCostTransportOutput> pagedList = new PagedList<PoolCostTransportOutput>(input.getPageIndex(), input.getPageSize(),
				totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<PoolCostTransport> list = dao.selectByExample(example);
		List<PoolCostTransportOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
					PoolCostTransportOutput output = new PoolCostTransportOutput();
					// 复制属性值到新对象
					BeanUtils.copyProperties(a, output);
					output.setChargeTypeIdNameLang(a.getChargeTypeKey());//费用类型
					output.setContainerUserNameLang(a.getContainerUser());//用箱人
					output.setCostCenterNameLang(a.getCostCenter());//成本中心
					output.setDeptKeyNameLang(a.getDeptKey());//核算部门
					output.setFreeStatusNameLang(a.getFreeStatus());//费用状态
					output.setIntYardNameLang(a.getIntYard());//调入场站
					output.setOutYardNameLang(a.getOutYard());//调出场站
					
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
	public Boolean addOrUpadte(PoolCostTransportInput input) {
		// TODO Auto-generated method stub
		PoolCostTransport record = new PoolCostTransport();
		BeanUtils.copyProperties(input, record);
		if (StringUtils.isEmpty(input.getId())) {

			record.setIsDel(PlatformConstants.ISDEL_NO);
			record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			if (dao.insert(record) > 0) {
				return true;
			}
		} else {
			//查询一下信息
			PoolCostTransport info=dao.selectByPrimaryKey(input.getId());
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
	 *  	批量修改
	 */
	@Override
	public Boolean Upadtes(List<PoolCostTransportInput> input) {
		// TODO Auto-generated method stub
		PoolCostTransport record = new PoolCostTransport();
		BeanUtils.copyProperties(input, record);
	    if(input!=null) {
	    	for (PoolCostTransportInput PoolCostTransportInput : input) {
				if(PoolCostTransportInput.getId()!=null) {
					//查询一下信息
					PoolCostTransport info=dao.selectByPrimaryKey(PoolCostTransportInput.getId());
					BeanUtils.copyProperties(info, record);
					BeanUtils.copyProperties(PoolCostTransportInput, record);
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
			PoolCostTransport record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
			PoolCostTransport record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setFreeStatus(FinanceCostStatusEnum.COSTOK.getCode());
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
		PoolCostTransport record = dao.selectByPrimaryKey(Integer.parseInt(input.getId()));
		record.setFreeStatus(FinanceCostStatusEnum.NOCOST.getCode());
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		record.setNoCostDesc(input.getDesc());
		Integer result=dao.updateByPrimaryKey(record);
		if(result>0) {
			return true;
		}else {
			return false;
		}
		
	}

	/**
	 * 批量添加费用
	 */
	@Override
	public Boolean add(List<PoolCostTransportInput> list) {
		// TODO Auto-generated method stub
		if(list!=null && list.size()>0) {
			for (PoolCostTransportInput PoolCostTransportInput : list) {
				PoolCostTransport record = new PoolCostTransport();
				BeanUtils.copyProperties(PoolCostTransportInput, record);
				record.setIsDel(PlatformConstants.ISDEL_NO);
				record.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
				record.setCreateTime(new Date());
				record.setCreateUser(getCurrentUserId());
				dao.insert(record);
			}
			return true;
		}
		return false;
		
	}
	/**
	 * 	取消批复，删除未加入账单的费用
	 */
	@Override
	public Boolean cancleReply(List<PoolCostTransportInput> list) {
		// TODO Auto-generated method stub
		return null;
	}

}
