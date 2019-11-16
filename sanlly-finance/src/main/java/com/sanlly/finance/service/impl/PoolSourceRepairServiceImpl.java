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
import com.sanlly.common.enums.FinanceCostStatusEnum;
import com.sanlly.common.enums.FinanceCurrencyType;
import com.sanlly.common.enums.FinanceIsEnabledEnum;
import com.sanlly.common.enums.FinanceWXSchemaEnum;
import com.sanlly.common.models.input.finance.PoolRepairInput;
import com.sanlly.common.models.input.finance.PoolSourceRepairInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.ContainerUserOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.utils.ComputeUtil;
import com.sanlly.finance.dao.BaseChargeTypeMapper;
import com.sanlly.finance.dao.BaseWorkHoursRateMapper;
import com.sanlly.finance.dao.BaseYardSchemaMapper;
import com.sanlly.finance.dao.PoolSourceRepairMapper;
import com.sanlly.finance.entity.BaseAuditDept;
import com.sanlly.finance.entity.BaseChargeType;
import com.sanlly.finance.entity.BaseChargeTypeExample;
import com.sanlly.finance.entity.BaseWorkHoursRate;
import com.sanlly.finance.entity.BaseWorkHoursRateExample;
import com.sanlly.finance.entity.BaseYardSchema;
import com.sanlly.finance.entity.BaseYardSchemaExample;
import com.sanlly.finance.entity.PoolSourceRepair;
import com.sanlly.finance.entity.PoolSourceRepairExample;
import com.sanlly.finance.enums.ContainerCategoryEnum;
import com.sanlly.finance.models.input.BaseAuditDeptInput;
import com.sanlly.finance.models.input.PoolBaseInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.PoolSourceRepairOutput;
import com.sanlly.finance.service.BaseAuditDeptService;
import com.sanlly.finance.service.BaseExchangeRateService;
import com.sanlly.finance.service.PoolSourceRepairService;
import com.sanlly.finance.service.feign.AuthFeignClient;
import com.sanlly.finance.service.feign.ProductionFeignClient;

/**
 * 成本维修 干箱 冷箱实现类
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:37:58 
 * @version V1.0   
 */
@Service
public class PoolSourceRepairServiceImpl extends BaseServiceImpl implements PoolSourceRepairService {

	@Autowired
	private PoolSourceRepairMapper dao;
	// 场站配置中心
	@Autowired
	private BaseChargeTypeMapper chargeTypeDao;

	// 汇率查询
	@Autowired
	private BaseExchangeRateService exchangeRateService;

	@Autowired
	private AuthFeignClient authFeignClient;

	@Autowired
	private ProductionFeignClient productionFeignClient;

	@Autowired
	private BaseAuditDeptService baseAuditDeptService;

	@Autowired
	private BaseYardSchemaMapper yardSchemaMapperDao;

	@Autowired
	private BaseWorkHoursRateMapper workHoursRateDao;

	/**
	 * 查询分页
	 */
	@Override
	public PagedList<PoolSourceRepairOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		PoolSourceRepairExample example = new PoolSourceRepairExample();
		PoolSourceRepairExample.Criteria criteria = example.createCriteria();
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
		// 费用池类型
		if (!StringUtils.isEmpty(input.getPoolType())) {
			criteria.andPoolTypeEqualTo(input.getPoolType());
		}
		int totalCount = (int) dao.countByExample(example);
		PagedList<PoolSourceRepairOutput> pagedList = new PagedList<PoolSourceRepairOutput>(input.getPageIndex(),
				input.getPageSize(), totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<PoolSourceRepair> list = dao.selectByExample(example);
		List<PoolSourceRepairOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			PoolSourceRepairOutput output = new PoolSourceRepairOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
			output.setChargeTypeIdNameLang(a.getChargeTypeKey());
			output.setDeptKeyNameLang(a.getDeptKey());
			output.setFreeStatusNameLang(a.getFreeStatus());
			output.setIsEnabledNameLang(a.getIsEnabled());
			output.setRealCurrencyTypeNameLang(a.getRealCurrencyType());
			output.setContainerCategoryNameLang(a.getContainerCategory());
			output.setYardNameLang(a.getYard());
			output.setContainerUserNameLang(a.getChargeObject());
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
	public Boolean addOrUpadte(PoolSourceRepairInput input) {
		// TODO Auto-generated method stub
		PoolSourceRepair record = new PoolSourceRepair();
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
			PoolSourceRepair info = dao.selectByPrimaryKey(input.getId());
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
	public Boolean Upadtes(List<PoolSourceRepairInput> input) {
		// TODO Auto-generated method stub
		PoolSourceRepair record = new PoolSourceRepair();
		BeanUtils.copyProperties(input, record);
		if (input != null) {
			for (PoolSourceRepairInput PoolSourceRepairInput : input) {
				if (PoolSourceRepairInput.getId() != null) {
					// 查询一下信息
					PoolSourceRepair info = dao.selectByPrimaryKey(PoolSourceRepairInput.getId());
					BeanUtils.copyProperties(info, record);
					BeanUtils.copyProperties(PoolSourceRepairInput, record);
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
			PoolSourceRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
			PoolSourceRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
		PoolSourceRepair record = dao.selectByPrimaryKey(Integer.parseInt(input.getId()));
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
	 * 批量添加费用
	 */
	@Override
	public Boolean add(List<PoolSourceRepairInput> list) {
		// TODO Auto-generated method stub
		if (list != null && list.size() > 0) {
			for (PoolSourceRepairInput PoolSourceRepairInput : list) {
				PoolSourceRepair record = new PoolSourceRepair();
				BeanUtils.copyProperties(PoolSourceRepairInput, record);
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
	 * 干箱完工时，生成费用 判断场站核算模式 是完工产生 还是 修理账单确认产生
	 */
	@Override
	public Boolean finishedGX(PoolSourceRepairInput input) {
		// TODO Auto-generated method stub
		// 1、根据公司 场站 查询核算模式，如果不是完工模式则不插入费用
		BaseYardSchemaExample example = new BaseYardSchemaExample();
		BaseYardSchemaExample.Criteria criteria = example.createCriteria();
		if (!StringUtils.isEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}
		List<BaseYardSchema> list = yardSchemaMapperDao.selectByExample(example);

		if (list != null && list.size() > 0) {
			// 判断是那种核算模式
			BaseYardSchema ysetting = list.get(0);
			if (ysetting.getWxschema().equals(FinanceWXSchemaEnum.WXSchema2.getCode())) {// 修理节点产生
				return false;
			} else {// 开始插入成本费用
				PoolSourceRepair record = new PoolSourceRepair();
				BeanUtils.copyProperties(input, record);
				// 设置费用池类型
				if (!StringUtils.isEmpty(input.getContainerCategory())
						&& input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())) {
					record.setPoolType(0);
				} else {
					record.setPoolType(1);
				}

				// 1查询汇率
				BigDecimal exchangeRate = new BigDecimal(exchangeRateService.getNewRate());// 得到汇率
				BigDecimal wxScale = new BigDecimal(0.00);// 维修比例
				BigDecimal hourCost = new BigDecimal(0.00);// 工时费
				String hourCurrency = "";// 工时币种
				// 得到维修比例
				if (!StringUtils.isEmpty(ysetting.getWxscale())) {
					wxScale = ysetting.getWxscale();
				}
				// 得到工时费率
				BaseWorkHoursRateExample osrexample = new BaseWorkHoursRateExample();
				osrexample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
						.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode())
						.andCompanyKeyEqualTo(input.getCompanyKey()).andYardEqualTo(input.getYard()).andWorkGroupIdEqualTo(Integer.parseInt(input.getWorkGroupId()));// 工时费
				List<BaseWorkHoursRate> osrList = workHoursRateDao.selectByExample(osrexample);
				if (osrList != null && osrList.size() > 0) {
					hourCost = osrList.get(0).getAmount();// 取应付费用
					hourCurrency = osrList.get(0).getCurrencyType();// 工时币种
				}

//				完工工时*工时费率*比例
				BigDecimal tmp1 = ComputeUtil.mul(input.getFinishedManHour(), hourCost);
				BigDecimal cost = ComputeUtil.mul(tmp1, wxScale);// 成本费用
				if (hourCurrency.equals(FinanceCurrencyType.CNY.getCode())) {// 人民币
					record.setRealCurrencyType(FinanceCurrencyType.CNY.getCode());
//					// 判断是否是中远的 将金额存放到不含税
//					// 不是中远的，金额放到含税里面
					if (input.getContainerUserCode().equals("COS")) {
						record.setRealNotaxTotalCostRmb(cost);
						// 人民币换算美金
						record.setRealNotaxTotalCostUsa(ComputeUtil.div(cost, exchangeRate, 2));
					} else {
						record.setRealTaxTotalCostRmb(cost);
						// 人民币换算美金
						record.setRealTaxTotalCostUsa(ComputeUtil.div(cost, exchangeRate, 2));
					}

				} else {// 美金
					record.setRealCurrencyType(FinanceCurrencyType.USD.getCode());
//					// 判断是否是中远的 将金额存放到不含税
//					// 不是中远的，金额放到含税里面
					if (input.getContainerUserCode().equals("COS")) {
						record.setRealNotaxTotalCostUsa(cost);
						// 人民币换算美金
						record.setRealNotaxTotalCostRmb(ComputeUtil.mul(cost, exchangeRate));
					} else {
						record.setRealTaxTotalCostUsa(cost);
						// 人民币换算美金
						record.setRealTaxTotalCostRmb(ComputeUtil.mul(cost, exchangeRate));
					}
				}

//				// 完工工时*比例*工时费率
//				if (input.getEstCurrencyType().equals("LKCURRENCY000001")) {// 人民币
//					// 工时费率币种是 人民币
//					if (hourCurrency.equals(FinanceCurrencyType.RMB.getCode())) {
//						Double tmp1 = ComputeUtil.mul(input.getFinishedManHour(), hourCost);
//						Double cost = ComputeUtil.mul(tmp1, wxScale);// 成本费用
//						record.setRealCurrencyType(FinanceCurrencyType.RMB.getCode());
//						// 判断是否是中远的 将金额存放到不含税
//						// 不是中远的，金额放到含税里面
//						if (input.getContainerUserCode().equals("COS")) {
//							record.setRealNotaxTotalCostRmb(cost);
//							// 人民币换算美金
//							record.setRealNotaxTotalCostUsa(ComputeUtil.div(cost, exchangeRate, 2));
//						} else {
//							record.setRealTaxTotalCostRmb(cost);
//							// 人民币换算美金
//							record.setRealTaxTotalCostUsa(ComputeUtil.div(cost, exchangeRate, 2));
//						}
//
//					} else {// 如果工时费用按美金计算
//							// 将工时费换成人民币工时费
//						Double rmbhourCost = ComputeUtil.mul(hourCost, exchangeRate);
//						Double tmp1 = ComputeUtil.mul(input.getFinishedManHour(), rmbhourCost);
//						Double cost = ComputeUtil.mul(tmp1, wxScale);// 成本费用
//						record.setRealCurrencyType(FinanceCurrencyType.RMB.getCode());
//						// 判断是否是中远的 将金额存放到不含税
//						// 不是中远的，金额放到含税里面
//						if (input.getContainerUserCode().equals("COS")) {
//							record.setRealNotaxTotalCostRmb(cost);
//							// 人民币换算美金
//							record.setRealNotaxTotalCostUsa(ComputeUtil.div(cost, exchangeRate, 2));
//						} else {
//							record.setRealTaxTotalCostRmb(cost);
//							// 人民币换算美金
//							record.setRealTaxTotalCostUsa(ComputeUtil.div(cost, exchangeRate, 2));
//						}
//
//					}
//
//				} else {// 美元
//						// 工时费率币种是 美元 和报价相同
//					if (hourCurrency.equals(FinanceCurrencyType.USD.getCode())) {
//						Double tmp1 = ComputeUtil.mul(input.getFinishedManHour(), hourCost);
//						Double cost = ComputeUtil.mul(tmp1, wxScale);// 成本费用
//						record.setRealCurrencyType(FinanceCurrencyType.USD.getCode());
//						// 判断是否是中远的 将金额存放到不含税
//						// 不是中远的，金额放到含税里面
//						if (input.getContainerUserCode().equals("COS")) {
//							record.setRealNotaxTotalCostUsa(cost);
//							// 美金换算人民币
//							record.setRealNotaxTotalCostRmb(ComputeUtil.mul(cost, exchangeRate));
//						} else {
//							record.setRealTaxTotalCostRmb(cost);
//							// 美金换算人民币
//							record.setRealTaxTotalCostUsa(ComputeUtil.mul(cost, exchangeRate));
//						}
//
//					} else {// 如果工时费用人民币计算
//							// 将工时费换成美金工时费
//						Double usdhourCost = ComputeUtil.div(hourCost, exchangeRate);
//						Double tmp1 = ComputeUtil.mul(input.getFinishedManHour(), usdhourCost);
//						Double cost = ComputeUtil.mul(tmp1, wxScale);// 成本费用
//						record.setRealCurrencyType(FinanceCurrencyType.USD.getCode());
//						// 判断是否是中远的 将金额存放到不含税
//						// 不是中远的，金额放到含税里面
//						if (input.getContainerUserCode().equals("COS")) {
//							record.setRealNotaxTotalCostUsa(cost);
//							// 人民币换算美金
//							record.setRealNotaxTotalCostRmb(ComputeUtil.mul(cost, exchangeRate));
//						} else {
//							record.setRealTaxTotalCostUsa(cost);
//							// 人民币换算美金
//							record.setRealTaxTotalCostRmb(ComputeUtil.mul(cost, exchangeRate));
//						}
//
//					}
//				}

				record.setPoolType(0);// 干箱
				// 根据箱类别 判断费用类型
				record.setChargeTypeKey("LKFICHARGT000103");//

				record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
				record.setItemStatus(0);
				// 查询核算部门 根据场站查询利润中心
				String tmpChargeKey="";
				BaseChargeTypeExample bctExample=new BaseChargeTypeExample();
				bctExample.createCriteria().andLangKeyEqualTo(record.getChargeTypeKey());
				List<BaseChargeType> bctList=chargeTypeDao.selectByExample(bctExample);
				//得到费用key
				if(bctList!=null && bctList.size()>0) {
					tmpChargeKey=bctList.get(0).getChargeKey();
				}

				// 核算部门查询
				BaseAuditDeptInput badInput = new BaseAuditDeptInput();
				//场站
				badInput.setYard(record.getYard());
				//箱类别
				badInput.setContainerCategory(record.getContainerCategory());
				//费用类型
				badInput.setChargeKey(tmpChargeKey);

				BaseAuditDept baDept = baseAuditDeptService.getInfo(badInput);
				if (baDept != null) {
					record.setDeptKey(baDept.getProfitCenter());// 通过场站查询得到 成本中心
					record.setDeptCode(baDept.getProfitCenterCode());
				}
				//收费对象 同用箱人
				record.setChargeObject(record.getContainerUser());
				
				record.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
				record.setIsDel(PlatformConstants.ISDEL_NO);
				record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
				record.setCreateTime(new Date());
				record.setCreateUser(getCurrentUserId());

				dao.insert(record);
				return true;
			}
		}
		return false;
	}

	/**
	 * 修理账单确认，生成费用 判断场站核算模式 是完工产生 还是 修理账单确认产生
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Boolean @throws 
	 */
	@Override
	public Boolean wxBillOk(PoolRepairInput input) {
		// TODO Auto-generated method stub
		// 1、根据公司 场站 查询核算模式，如果不是完工模式则不插入费用

		BaseYardSchemaExample example = new BaseYardSchemaExample();
		BaseYardSchemaExample.Criteria criteria = example.createCriteria();
		if (!StringUtils.isEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}
		List<BaseYardSchema> list = yardSchemaMapperDao.selectByExample(example);
		if (list != null && list.size() > 0) {
			// 判断是那种核算模式
			BaseYardSchema ysetting = list.get(0);
			if (ysetting.getWxschema().equals(FinanceWXSchemaEnum.WXSchema1.getCode())) {// 完工产生，走完工的口
				return false;
			} else {// 开始插入成本费用 修理账单ok确认节点产生
				PoolSourceRepair record = new PoolSourceRepair();
				BeanUtils.copyProperties(input, record);
				// 1查询汇率
				BigDecimal exchangeRate = new BigDecimal(exchangeRateService.getNewRate());// 得到汇率
				BigDecimal wxScale = new BigDecimal(0.00);// 比例
				// 得到维修比例
				if (!StringUtils.isEmpty(ysetting.getWxscale())) {
					wxScale = ysetting.getWxscale();
				}
				// 判断实收币种
				if (input.getRealCurrencyType().equals(FinanceCurrencyType.CNY.getCode())) {
					record.setRealCurrencyType(FinanceCurrencyType.CNY.getCode());
					// 根据用箱人 得到用箱人code
					ContainerUserOutput cuoser = productionFeignClient.getContainerUserByKey(input.getContainerUser())
							.getData();
					if (cuoser.getContainerUserCode().equals("COS")) {
						BigDecimal cost = ComputeUtil.mul(input.getRealNotaxTotalCostRmb(), wxScale);

						record.setRealNotaxTotalCostRmb(cost);
						record.setRealNotaxTotalCostUsa(ComputeUtil.div(cost, exchangeRate, 2));
					} else {
						BigDecimal cost = ComputeUtil.mul(input.getRealNotaxTotalCostRmb(), wxScale);

						record.setRealTaxTotalCostRmb(cost);
						record.setRealTaxTotalCostUsa(ComputeUtil.div(cost, exchangeRate, 2));
					}

				} else {
					// 根据用箱人 得到用箱人code
					ContainerUserOutput cuoser = productionFeignClient.getContainerUserByKey(input.getContainerUser())
							.getData();
					record.setRealCurrencyType(FinanceCurrencyType.USD.getCode());
					if (cuoser.getContainerUserCode().equals("COS")) {
						BigDecimal cost = ComputeUtil.mul(input.getRealNotaxTotalCostUsa(), wxScale);
						record.setRealNotaxTotalCostUsa(cost);
						record.setRealNotaxTotalCostRmb(ComputeUtil.mul(cost, exchangeRate));
					} else {
						BigDecimal cost = ComputeUtil.mul(input.getRealNotaxTotalCostUsa(), wxScale);
						record.setRealTaxTotalCostUsa(cost);
						record.setRealTaxTotalCostRmb(ComputeUtil.mul(cost, exchangeRate));
					}
				}

				if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())) {
					record.setPoolType(0);// 收入
					// 根据箱类别 判断费用类型
					record.setChargeTypeKey("LKFICHARGT000103");//
				} else if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())) {
					record.setPoolType(1);// 收入
					// 根据箱类别 判断费用类型
					record.setChargeTypeKey("LKFICHARGT000072");//
				} else if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
					record.setPoolType(1);// 收入
					// 根据箱类别 判断费用类型
					record.setChargeTypeKey("LKFICHARGT000061");//
				}

				record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
				record.setItemStatus(0);
				// 查询核算部门 根据场站查询利润中心
				String tmpChargeKey="";
				BaseChargeTypeExample bctExample=new BaseChargeTypeExample();
				bctExample.createCriteria().andLangKeyEqualTo(record.getChargeTypeKey());
				List<BaseChargeType> bctList=chargeTypeDao.selectByExample(bctExample);
				//得到费用key
				if(bctList!=null && bctList.size()>0) {
					tmpChargeKey=bctList.get(0).getChargeKey();
				}

				// 核算部门查询
				BaseAuditDeptInput badInput = new BaseAuditDeptInput();
				//场站
				badInput.setYard(record.getYard());
				//箱类别
				badInput.setContainerCategory(record.getContainerCategory());
				//费用类型
				badInput.setChargeKey(tmpChargeKey);

				BaseAuditDept baDept = baseAuditDeptService.getInfo(badInput);
				if (baDept != null) {
					record.setDeptKey(baDept.getProfitCenter());// 通过场站查询得到 成本中心
					record.setDeptCode(baDept.getProfitCenterCode());
				}
				//收费对象 同用箱人
				record.setChargeObject(record.getContainerUser());
				
				record.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
				record.setIsDel(PlatformConstants.ISDEL_NO);
				record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
				record.setCreateTime(new Date());
				record.setCreateUser(getCurrentUserId());

				dao.insert(record);

				return true;
			}
		}
		return false;
	}

}
