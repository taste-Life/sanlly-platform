package com.sanlly.finance.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.FinanceBudgetTypeEnum;
import com.sanlly.common.enums.FinanceCostStatusEnum;
import com.sanlly.common.enums.FinanceCurrencyType;
import com.sanlly.common.enums.FinanceIsEnabledEnum;
import com.sanlly.common.models.input.finance.PoolGonContainerInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.ContainerUserOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.utils.ComputeUtil;
import com.sanlly.finance.dao.PoolGonContainerMapper;
import com.sanlly.finance.entity.BaseAuditDept;
import com.sanlly.finance.entity.PoolGonContainer;
import com.sanlly.finance.entity.PoolGonContainerExample;
import com.sanlly.finance.models.input.BaseAuditDeptInput;
import com.sanlly.finance.models.input.PoolBaseInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.PoolGonContainerOutput;
import com.sanlly.finance.service.BaseAuditDeptService;
import com.sanlly.finance.service.BaseExchangeRateService;
import com.sanlly.finance.service.PoolGonContainerService;
import com.sanlly.finance.service.feign.AuthFeignClient;
import com.sanlly.finance.service.feign.ProductionFeignClient;

/**
 * 核算部门实现类
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:37:58 
 * @version V1.0   
 */
@Service
public class PoolGonContainerServiceImpl extends BaseServiceImpl implements PoolGonContainerService {

	@Autowired
	private PoolGonContainerMapper dao;

	@Autowired
	private AuthFeignClient authFeignClient;

	// 汇率查询
	@Autowired
	private BaseExchangeRateService exchangeRateService;
	
	@Autowired
	private BaseAuditDeptService baseAuditDeptService;
	
	@Autowired
	private ProductionFeignClient productionFeignClient;
	
	/**
	 * 查询分页
	 */
	@Override
	public PagedList<PoolGonContainerOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		PoolGonContainerExample example = new PoolGonContainerExample();
		PoolGonContainerExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录 和未启用的数据
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		if (!StringUtils.isEmpty(input.getName())) {
			criteria.andContainerNoLike("%" + input.getName() + "%");
		}
		// 费用状态
		if (!StringUtils.isEmpty(input.getCode())) {
			criteria.andFreeStatusEqualTo(input.getCode());
		}
		int totalCount = (int) dao.countByExample(example);
		PagedList<PoolGonContainerOutput> pagedList = new PagedList<PoolGonContainerOutput>(input.getPageIndex(),
				input.getPageSize(), totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<PoolGonContainer> list = dao.selectByExample(example);
		List<PoolGonContainerOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			PoolGonContainerOutput output = new PoolGonContainerOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
			output.setChargeTypeIdNameLang(a.getChargeTypeKey());
			output.setDeptKeyNameLang(a.getDeptKey());
			output.setFreeStatusNameLang(a.getFreeStatus());
			output.setIsEnabledNameLang(a.getIsEnabled());
			output.setYardNameLang(a.getYard());

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
	public Boolean addOrUpadte(PoolGonContainerInput input) {
		// TODO Auto-generated method stub
		PoolGonContainer record = new PoolGonContainer();
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
			// 查询一下信息
			PoolGonContainer info = dao.selectByPrimaryKey(input.getId());
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
	 * 批量修改
	 */
	@Override
	public Boolean Upadtes(List<PoolGonContainerInput> input) {
		// TODO Auto-generated method stub
		PoolGonContainer record = new PoolGonContainer();
		BeanUtils.copyProperties(input, record);
		if (input != null) {
			for (PoolGonContainerInput PoolGonContainerInput : input) {
				if (PoolGonContainerInput.getId() != null) {
					// 查询一下信息
					PoolGonContainer info = dao.selectByPrimaryKey(PoolGonContainerInput.getId());
					BeanUtils.copyProperties(info, record);
					BeanUtils.copyProperties(PoolGonContainerInput, record);
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
			PoolGonContainer record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
			PoolGonContainer record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
		PoolGonContainer record = dao.selectByPrimaryKey(Integer.parseInt(input.getId()));
		record.setFreeStatus(FinanceCostStatusEnum.NOCOST.getCode());
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		record.setNoCostDesc(input.getDesc());
		Integer result = dao.updateByPrimaryKey(record);
		if (result > 0) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * 挂衣箱批复
	 */
	@Override
	public Boolean replyAdd(PoolGonContainerInput input) {
		// TODO Auto-generated method stub
		PoolGonContainer record = new PoolGonContainer();
		BeanUtils.copyProperties(input, record);
		//查看汇率
		BigDecimal exchangeRate = new BigDecimal(exchangeRateService.getNewRate());// 得到汇率
		record.setRealRate(exchangeRate);
		//查询核算部门

		BaseAuditDeptInput badInput = new BaseAuditDeptInput();
		//场站
		badInput.setYard(record.getYard());
		//箱类别
		badInput.setContainerCategory(record.getContainerCategory());
		//费用类型
		badInput.setChargeKey("LKFICHARGE000049");//挂衣箱改装费
		record.setChargeTypeKey("LKFICHARGE000049");
		BaseAuditDept baDept = baseAuditDeptService.getInfo(badInput);
		if (baDept != null) {
			record.setDeptKey(baDept.getProfitDept());// 通过场站查询得到 利润中心\
			record.setDeptCode(baDept.getProfitCenterCode());
		}
		
		// 用箱人Code
		String containerUserCode = "";
		ContainerUserOutput cuoutput = productionFeignClient.getContainerUserByKey(input.getContainerUser())
				.getData();
		if (cuoutput != null) {
			containerUserCode = cuoutput.getContainerUserCode();
		}
		record.setRealCurrencyType(FinanceCurrencyType.CNY.getCode());//币种
		if(containerUserCode.equals("COS")) {//中远不含税  其它含税
			record.setRealNotaxTotalCostRmb(input.getRealTaxTotalCostRmb());
			//计算美金
			record.setRealNotaxTotalCostUsa(ComputeUtil.div(input.getRealTaxTotalCostRmb(), exchangeRate,2));
			record.setRealTaxTotalCostRmb(null);//置空
		}else {
//			record.setRealTaxTotalCostRmb(input.getRealTaxTotalCostRmb());
			//计算美金
			record.setRealTaxTotalCostUsa(ComputeUtil.div(input.getRealTaxTotalCostRmb(), exchangeRate,2));
		}
		
		record.setChargeInoutType(FinanceBudgetTypeEnum.INCOME.getCode());
		record.setIsDel(PlatformConstants.ISDEL_NO);
		record.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
		record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
		record.setItemStatus(0);
		record.setCreateTime(new Date());
		record.setCreateUser(getCurrentUserId());
		if (dao.insert(record) > 0) {
			return true;
		}

		return true;
	}

	/**
	 * 挂衣箱撤载 取消批复
	 */
	@Override
	public Boolean unReplyAdd(PoolGonContainerInput input) {
		// TODO Auto-generated method stub
		//根据进场id 删除费用
		//判断是否已加入账单
		PoolGonContainerExample example=new PoolGonContainerExample();
		example.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId());
		List<PoolGonContainer> list=dao.selectByExample(example);
		if(list!=null && list.size()>0) {
			//判断是否加入账单
			if(!list.get(0).getItemStatus().equals(0)) {
				return false;
			}else {
				dao.deleteByExample(example);
				return true;
			}
		}
		return false;
	}

}
