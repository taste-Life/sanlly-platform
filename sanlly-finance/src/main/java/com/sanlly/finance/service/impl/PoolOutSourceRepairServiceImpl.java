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
import com.sanlly.common.enums.FinanceWBSchemaEnum;
import com.sanlly.common.models.input.finance.PoolOutSourceRepairInput;
import com.sanlly.common.models.input.finance.PoolRepairInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.utils.ComputeUtil;
import com.sanlly.finance.dao.BaseChargeRateMapper;
import com.sanlly.finance.dao.BaseChargeTypeMapper;
import com.sanlly.finance.dao.BaseExchangeRateMapper;
import com.sanlly.finance.dao.BaseOutHoursRateMapper;
import com.sanlly.finance.dao.BaseTaxRateMapper;
import com.sanlly.finance.dao.BaseWorkHoursRateMapper;
import com.sanlly.finance.dao.BaseYardSchemaMapper;
import com.sanlly.finance.dao.PoolOutSourceRepairMapper;
import com.sanlly.finance.entity.BaseAuditDept;
import com.sanlly.finance.entity.BaseChargeType;
import com.sanlly.finance.entity.BaseChargeTypeExample;
import com.sanlly.finance.entity.BaseOutHoursRate;
import com.sanlly.finance.entity.BaseOutHoursRateExample;
import com.sanlly.finance.entity.BaseWorkHoursRate;
import com.sanlly.finance.entity.BaseWorkHoursRateExample;
import com.sanlly.finance.entity.BaseYardSchema;
import com.sanlly.finance.entity.BaseYardSchemaExample;
import com.sanlly.finance.entity.PoolOutSourceRepair;
import com.sanlly.finance.entity.PoolOutSourceRepairExample;
import com.sanlly.finance.entity.PoolRepair;
import com.sanlly.finance.entity.PoolRepairExample;
import com.sanlly.finance.enums.ContainerCategoryEnum;
import com.sanlly.finance.models.input.BaseAuditDeptInput;
import com.sanlly.finance.models.input.PoolBaseInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.PoolOutSourceRepairOutput;
import com.sanlly.finance.service.BaseAuditDeptService;
import com.sanlly.finance.service.BaseExchangeRateService;
import com.sanlly.finance.service.PoolOutSourceRepairService;
import com.sanlly.finance.service.feign.AuthFeignClient;
import com.sanlly.finance.service.feign.ProductionFeignClient;

/**
 * 劳务外包费用池（修箱、洗箱）实现类
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:37:58 
 * @version V1.0   
 */
@Service
public class PoolOutSourceRepairServiceImpl extends BaseServiceImpl implements PoolOutSourceRepairService {

	@Autowired
	private PoolOutSourceRepairMapper dao;

	@Autowired
	private BaseExchangeRateMapper exchangeRateDao;

	@Autowired
	private BaseChargeTypeMapper chargeTypeDao;

	@Autowired
	private BaseChargeRateMapper chargeRateDao;

	@Autowired
	private BaseTaxRateMapper taxRateDao;

	@Autowired
	private BaseExchangeRateService exchangeRateService;

	@Autowired
	private BaseOutHoursRateMapper outHoursRateDao;

	@Autowired
	private BaseWorkHoursRateMapper workHoursRateDao;

	@Autowired
	private BaseYardSchemaMapper yardSchemaMapperDao;

	@Autowired
	private BaseAuditDeptService baseAuditDeptService;

	@Autowired
	private AuthFeignClient authFeignClient;

	@Autowired
	private ProductionFeignClient prodFeignClient;

	/**
	 * 查询分页
	 */
	@Override
	public PagedList<PoolOutSourceRepairOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		PoolOutSourceRepairExample example = new PoolOutSourceRepairExample();
		PoolOutSourceRepairExample.Criteria criteria = example.createCriteria();
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
		PagedList<PoolOutSourceRepairOutput> pagedList = new PagedList<PoolOutSourceRepairOutput>(input.getPageIndex(),
				input.getPageSize(), totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<PoolOutSourceRepair> list = dao.selectByExample(example);
		List<PoolOutSourceRepairOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			PoolOutSourceRepairOutput output = new PoolOutSourceRepairOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
			output.setChargeTypeIdNameLang(a.getChargeTypeKey());
			output.setDeptKeyNameLang(a.getDeptKey());
			output.setFreeStatusNameLang(a.getFreeStatus());
			output.setIsEnabledNameLang(a.getIsEnabled());
			output.setYardNameLang(a.getYard());
			output.setIsBackLeaseNameLang(a.getIsBackLease());
			output.setContainerUserNameLang(a.getContainerUser());
			output.setContainerCategoryNameLang(a.getContainerCategory());

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
	public Boolean addOrUpadte(PoolOutSourceRepairInput input) {
		// TODO Auto-generated method stub
		PoolOutSourceRepair record = new PoolOutSourceRepair();
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
			PoolOutSourceRepair info = dao.selectByPrimaryKey(input.getId());
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
	public Boolean Upadtes(List<PoolOutSourceRepairInput> input) {
		// TODO Auto-generated method stub
		PoolOutSourceRepair record = new PoolOutSourceRepair();
		BeanUtils.copyProperties(input, record);
		if (input != null) {
			for (PoolOutSourceRepairInput PoolOutSourceRepairInput : input) {
				if (PoolOutSourceRepairInput.getId() != null) {
					// 查询一下信息
					PoolOutSourceRepair info = dao.selectByPrimaryKey(PoolOutSourceRepairInput.getId());
					BeanUtils.copyProperties(info, record);
					BeanUtils.copyProperties(PoolOutSourceRepairInput, record);
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
			PoolOutSourceRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
			PoolOutSourceRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
		PoolOutSourceRepair record = dao.selectByPrimaryKey(Integer.parseInt(input.getId()));
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
	public Boolean add(List<PoolOutSourceRepairInput> list) {
		// TODO Auto-generated method stub
		if (list != null && list.size() > 0) {
			for (PoolOutSourceRepairInput PoolOutSourceRepairInput : list) {
				PoolOutSourceRepair record = new PoolOutSourceRepair();
				BeanUtils.copyProperties(PoolOutSourceRepairInput, record);
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
	 * 取消批复，删除未加入账单的费用
	 */
	@Override
	public Boolean cancleReply(PoolOutSourceRepairInput input) {
		// TODO Auto-generated method stub
		if (input != null && !StringUtils.isEmpty(input.getProdCourseId())
				&& !StringUtils.isEmpty(input.getContainerCategory())) {

			PoolOutSourceRepairExample example = new PoolOutSourceRepairExample();
			example.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId())
					.andContainerCategoryEqualTo(input.getContainerCategory());
			List<PoolOutSourceRepair> recordList = dao.selectByExample(example);

			List<PoolOutSourceRepair> recordList1 = recordList.stream().filter(x -> x.getItemStatus() == 1)
					.collect(Collectors.toList());
			// 有费用已加入账单，无法删除
			if (recordList1 != null && recordList1.size() > 0) {
				return false;
			}
			// 全部删除
			if (recordList != null && recordList.size() > 0) {
				for (PoolOutSourceRepair poolRepair : recordList) {
					dao.deleteByPrimaryKey(poolRepair.getId());
				}
			}
			return true;

		}
		return false;
	}

	/**
	 * 外包完工 生成费用 修箱
	 */
	@Override
	public Boolean wbFinishedRepair(PoolOutSourceRepairInput input) {

		PoolOutSourceRepair record = new PoolOutSourceRepair();
		// 1查询汇率
		BigDecimal exchangeRate = new BigDecimal(exchangeRateService.getNewRate());// 得到汇率
		BigDecimal wbScale = new BigDecimal(0.00);// 外包比例
		BigDecimal hourCost = new BigDecimal(0.00);// 工时费
		String hourCurrency = "";// 工时币种

		BaseYardSchemaExample example = new BaseYardSchemaExample();
		BaseYardSchemaExample.Criteria criteria = example.createCriteria();
		if (!StringUtils.isEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}
		List<BaseYardSchema> list = yardSchemaMapperDao.selectByExample(example);
		if (list != null && list.size() > 0) {
			// 判断是那种核算模式
			BaseYardSchema ysetting = list.get(0);
			// 得到外包维修比例
			if (!StringUtils.isEmpty(ysetting.getWxscale())) {
				wbScale = ysetting.getWbscale();
			}

			if (ysetting.getWxschema().equals(FinanceWBSchemaEnum.WBSchema1.getCode())) {// 完工工时*费率 完工时根据修理班组获取相应费率产生
				BeanUtils.copyProperties(input, record);

				record.setPoolType(0);// 修箱0 洗箱1

				// 得到班组工时费率
				BaseWorkHoursRateExample osrexample = new BaseWorkHoursRateExample();
				osrexample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
						.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode())
						.andWorkGroupIdEqualTo(input.getWorkdGroupId());// 班组费率
//								.andCompanyKeyEqualTo(input.getCompanyKey()).andRateTypeEqualTo(0);// 工时费
				List<BaseWorkHoursRate> osrList = workHoursRateDao.selectByExample(osrexample);
				if (osrList != null && osrList.size() > 0) {
					hourCost = osrList.get(0).getAmount();// 班组费率
					hourCurrency = osrList.get(0).getCurrencyType();// 工时币种
				}
				// 完工工时*工时费率
				BigDecimal cost = ComputeUtil.mul(input.getFinishedManHour(), hourCost);
				if (hourCurrency.equals(FinanceCurrencyType.CNY.getCode())) {// 人民币
					record.setRealCurrencyType(FinanceCurrencyType.CNY.getCode());
//							// 判断是否是中远的 将金额存放到不含税
//							// 不是中远的，金额放到含税里面
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
//							// 判断是否是中远的 将金额存放到不含税
//							// 不是中远的，金额放到含税里面
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
				if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())) {
					// 根据箱类别 判断费用类型
					record.setChargeTypeKey("LKFICHARGT000100");//
				} else if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())) {
					// 根据箱类别 判断费用类型
					record.setChargeTypeKey("LKFICHARGT000070");//
				} else if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
					// 根据箱类别 判断费用类型
					record.setChargeTypeKey("LKFICHARGT000059");//
				}

				record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
				record.setItemStatus(0);
				// 查询核算部门 根据场站查询利润中心
				BaseChargeTypeExample bctExample = new BaseChargeTypeExample();
				bctExample.createCriteria().andLangKeyEqualTo(record.getChargeTypeKey());
				List<BaseChargeType> bctList = chargeTypeDao.selectByExample(bctExample);
				String tmpChargeKey = "";
				// 得到费用key
				if (bctList != null && bctList.size() > 0) {
					tmpChargeKey = bctList.get(0).getChargeKey();
				}

				// 核算部门查询
				BaseAuditDeptInput badInput = new BaseAuditDeptInput();
				// 场站
				badInput.setYard(record.getYard());
				// 箱类别
				badInput.setContainerCategory(input.getContainerCategory());
				// 费用类型
				badInput.setChargeKey(tmpChargeKey);

				BaseAuditDept baDept = baseAuditDeptService.getInfo(badInput);
				if (baDept != null) {
					record.setDeptKey(baDept.getCostDept());// 通过场站查询得到 成本中心
					record.setDeptCode(baDept.getCostCenterCode());
				}

				record.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
				record.setIsDel(PlatformConstants.ISDEL_NO);
				record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
				record.setCreateTime(new Date());
				record.setCreateUser(getCurrentUserId());

				dao.insert(record);
				return true;

			} else if (ysetting.getWxschema().equals(FinanceWBSchemaEnum.WBSchema4.getCode())) {// 报价材料费*比例， 完工时生成
				// 根据报价材料费 计算劳务外包成本

				BeanUtils.copyProperties(input, record);
				// 清空干扰
				record.setRealCurrencyType("");
				record.setRealNotaxTotalCostRmb(null);
				record.setRealNotaxTotalCostUsa(null);
				record.setRealTaxTotalCostRmb(null);
				record.setRealTaxTotalCostUsa(null);

				record.setPoolType(0);// 修箱0 洗箱1

				// 报价材料费
				BigDecimal tmp1 = input.getValuationMaterialCost();
				BigDecimal cost = ComputeUtil.mul(tmp1, wbScale);// 报价
				if (input.getEstCurrencyType().equals(FinanceCurrencyType.CNY.getCode())) {// 人民币
					record.setRealCurrencyType(FinanceCurrencyType.CNY.getCode());
					// 判断是否是中远的 将金额存放到不含税
					// 不是中远的，金额放到含税里面
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
//							// 判断是否是中远的 将金额存放到不含税
//							// 不是中远的，金额放到含税里面
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
				if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())) {
					// 根据箱类别 判断费用类型
					record.setChargeTypeKey("LKFICHARGT000100");//
				} else if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())) {
					// 根据箱类别 判断费用类型
					record.setChargeTypeKey("LKFICHARGT000070");//
				} else if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
					// 根据箱类别 判断费用类型
					record.setChargeTypeKey("LKFICHARGT000059");//
				}

				record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
				record.setItemStatus(0);
				// 查询核算部门 根据场站查询利润中心
				BaseChargeTypeExample bctExample = new BaseChargeTypeExample();
				bctExample.createCriteria().andLangKeyEqualTo(record.getChargeTypeKey());
				List<BaseChargeType> bctList = chargeTypeDao.selectByExample(bctExample);
				String tmpChargeKey = "";
				// 得到费用key
				if (bctList != null && bctList.size() > 0) {
					tmpChargeKey = bctList.get(0).getChargeKey();
				}
				// 核算部门查询
				BaseAuditDeptInput badInput = new BaseAuditDeptInput();
				// 场站
				badInput.setYard(record.getYard());
				// 箱类别
				badInput.setContainerCategory(input.getContainerCategory());
				// 费用类型
				badInput.setChargeKey(tmpChargeKey);

				BaseAuditDept baDept = baseAuditDeptService.getInfo(badInput);
				if (baDept != null) {
					record.setDeptKey(baDept.getCostDept());// 通过场站查询得到 成本中心
				}

				record.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
				record.setIsDel(PlatformConstants.ISDEL_NO);
				record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
				record.setCreateTime(new Date());
				record.setCreateUser(getCurrentUserId());

				dao.insert(record);
				return true;

			} else if (ysetting.getWxschema().equals(FinanceWBSchemaEnum.WBSchema5.getCode())) {// 获取外包商的费率计算

				BeanUtils.copyProperties(input, record);

				record.setPoolType(0);// 修箱0 洗箱1
				String chargeKey = "";
				// 根据箱类型查询不同的费用类型
				if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())) {
					// 根据箱类别 判断费用类型
					record.setChargeTypeKey("LKFICHARGT000100");//
					chargeKey = "LKFICHARGE000046";
				} else if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())) {
					// 根据箱类别 判断费用类型
					record.setChargeTypeKey("LKFICHARGT000070");//
					chargeKey = "LKFICHARGE000060";
				} else if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
					// 根据箱类别 判断费用类型
					record.setChargeTypeKey("LKFICHARGT000059");//
					chargeKey = "LKFICHARGE000060";
				}

				// 得到外包商费率
				BaseOutHoursRateExample osrexample = new BaseOutHoursRateExample();
				osrexample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
						.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode())
						.andCompanyKeyEqualTo(input.getCompanyKey()).andOutSourcerEqualTo(input.getOutCompanyKey());// 外包商key
				List<BaseOutHoursRate> osrList = outHoursRateDao.selectByExample(osrexample);
				if (osrList != null && osrList.size() > 0) {
					hourCost = osrList.get(0).getAmount();// 取应付费用
					hourCurrency = osrList.get(0).getCurrencyType();// 工时币种
				}
				// 外包商费率
				BigDecimal cost = hourCost;
				if (hourCurrency.equals(FinanceCurrencyType.CNY.getCode())) {// 人民币
					record.setRealCurrencyType(FinanceCurrencyType.CNY.getCode());
//							// 判断是否是中远的 将金额存放到不含税
//							// 不是中远的，金额放到含税里面
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
//							// 判断是否是中远的 将金额存放到不含税
//							// 不是中远的，金额放到含税里面
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

				record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
				record.setItemStatus(0);
				// 查询核算部门 根据场站查询利润中心
				String tmpChargeKey = "";
				BaseChargeTypeExample bctExample = new BaseChargeTypeExample();
				bctExample.createCriteria().andLangKeyEqualTo(record.getChargeTypeKey());
				List<BaseChargeType> bctList = chargeTypeDao.selectByExample(bctExample);
				// 得到费用key
				if (bctList != null && bctList.size() > 0) {
					tmpChargeKey = bctList.get(0).getChargeKey();
				}

				// 核算部门查询
				BaseAuditDeptInput badInput = new BaseAuditDeptInput();
				// 场站
				badInput.setYard(record.getYard());
				// 箱类别
				badInput.setContainerCategory(record.getContainerCategory());
				// 费用类型
				badInput.setChargeKey(tmpChargeKey);

				BaseAuditDept baDept = baseAuditDeptService.getInfo(badInput);
				if (baDept != null) {
					record.setDeptKey(baDept.getCostDept());// 通过场站查询得到 成本中心
					record.setDeptCode(baDept.getCostCenterCode());
				}

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
	 * 外包完工时 调用生成 劳务外包费用 洗箱
	 */
	@Override
	public Boolean wbFinishedClean(PoolOutSourceRepairInput input) {
		// TODO Auto-generated method stub

		PoolOutSourceRepair record = new PoolOutSourceRepair();
		// 1查询汇率
		BigDecimal exchangeRate = new BigDecimal(exchangeRateService.getNewRate());// 得到汇率
		BigDecimal wbScale = new BigDecimal(0.00);// 外包比例
		BigDecimal hourCost = new BigDecimal(0.00);// 工时费
		String hourCurrency = "";// 工时币种

		BaseYardSchemaExample example = new BaseYardSchemaExample();
		BaseYardSchemaExample.Criteria criteria = example.createCriteria();
		if (!StringUtils.isEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}
		List<BaseYardSchema> list = yardSchemaMapperDao.selectByExample(example);
		if (list != null && list.size() > 0) {
			// 判断是那种核算模式
			BaseYardSchema ysetting = list.get(0);
			// 得到外包维修比例
			if (!StringUtils.isEmpty(ysetting.getWxscale())) {
				wbScale = ysetting.getWbscale();
			}
			BeanUtils.copyProperties(input, record);

			record.setPoolType(0);// 修箱0 洗箱1
			String chargeKey = "";
			// 根据箱类型查询不同的费用类型
			if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())) {
				// 根据箱类别 判断费用类型
				record.setChargeTypeKey("LKFICHARGT000018");//
				chargeKey = "LKFICHARGE000068";
			} else if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())) {
				// 根据箱类别 判断费用类型
				record.setChargeTypeKey("LKFICHARGT000011");//
				chargeKey = "LKFICHARGE000068";
			} else if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
				// 根据箱类别 判断费用类型
				record.setChargeTypeKey("LKFICHARGT000011");//
				chargeKey = "LKFICHARGE000068";
			}
			// 得到外包商费率
			BaseOutHoursRateExample osrexample = new BaseOutHoursRateExample();
			osrexample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode())
					.andCompanyKeyEqualTo(input.getCompanyKey()).andOutSourcerEqualTo(input.getOutCompanyKey());// 外包商key
			List<BaseOutHoursRate> osrList = outHoursRateDao.selectByExample(osrexample);
			if (osrList != null && osrList.size() > 0) {
				hourCost = osrList.get(0).getAmount();// 取应付费用
				hourCurrency = osrList.get(0).getCurrencyType();// 工时币种
			}
			// 外包商费率
			BigDecimal cost = ComputeUtil.mul(hourCost, input.getContainerNumber());
			if (hourCurrency.equals(FinanceCurrencyType.CNY.getCode())) {// 人民币
				record.setRealCurrencyType(FinanceCurrencyType.CNY.getCode());
//							// 判断是否是中远的 将金额存放到不含税
//							// 不是中远的，金额放到含税里面
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
//							// 判断是否是中远的 将金额存放到不含税
//							// 不是中远的，金额放到含税里面
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

			record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
			record.setItemStatus(0);
			// 查询核算部门 根据场站查询利润中心
			String tmpChargeKey = "";
			BaseChargeTypeExample bctExample = new BaseChargeTypeExample();
			bctExample.createCriteria().andLangKeyEqualTo(record.getChargeTypeKey());
			List<BaseChargeType> bctList = chargeTypeDao.selectByExample(bctExample);
			// 得到费用key
			if (bctList != null && bctList.size() > 0) {
				tmpChargeKey = bctList.get(0).getChargeKey();
			}

			// 核算部门查询
			BaseAuditDeptInput badInput = new BaseAuditDeptInput();
			// 场站
			badInput.setYard(record.getYard());
			// 箱类别
			badInput.setContainerCategory(record.getContainerCategory());
			// 费用类型
			badInput.setChargeKey(tmpChargeKey);

			BaseAuditDept baDept = baseAuditDeptService.getInfo(badInput);
			if (baDept != null) {
				record.setDeptKey(baDept.getCostDept());// 通过场站查询得到 成本中心
				record.setDeptCode(baDept.getCostCenterCode());
			}

			record.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
			record.setIsDel(PlatformConstants.ISDEL_NO);
			record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());

			dao.insert(record);
			return true;

		}
		return false;
	}

	/**
	 * 劳务外包（修箱） 修理账单确认 实际修理收入*比例，批复费用确认时产生
	 */
	@Override
	public Boolean wxBillOk(PoolRepairInput input) {
		// TODO Auto-generated method stub
		// 判断是否外包
		Boolean isWb = prodFeignClient.isWb(input.getProdCourseId(), input.getContainerCategory());

//		if(!isWb) {//不是外包
//			return false;
//		}

		// 根据进场id 判断是否外包 比例通过场站模式配置获取
		PoolOutSourceRepair record = new PoolOutSourceRepair();
		// 1查询汇率
		BigDecimal exchangeRate = new BigDecimal(exchangeRateService.getNewRate());// 得到汇率
		BigDecimal wbScale = new BigDecimal(0.00);// 外包比例
		BigDecimal hourCost = new BigDecimal(0.00);// 工时费
		String hourCurrency = "";// 工时币种

		BaseYardSchemaExample example = new BaseYardSchemaExample();
		BaseYardSchemaExample.Criteria criteria = example.createCriteria();
		if (!StringUtils.isEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}
		List<BaseYardSchema> list = yardSchemaMapperDao.selectByExample(example);
		if (list != null && list.size() > 0) {
			// 判断是那种核算模式
			BaseYardSchema ysetting = list.get(0);
			// 得到外包维修比例
			if (!StringUtils.isEmpty(ysetting.getWxscale())) {
				wbScale = ysetting.getWbscale();
			}
			BeanUtils.copyProperties(input, record);

			record.setPoolType(0);// 修箱0 洗箱1
			String chargeKey = "";
			// 根据箱类型查询不同的费用类型
			if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())) {
				// 根据箱类别 判断费用类型
				record.setChargeTypeKey("LKFICHARGT000100");//
				chargeKey = "LKFICHARGE000058";
			} else if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())) {
				// 根据箱类别 判断费用类型
				record.setChargeTypeKey("LKFICHARGT000070");//
				chargeKey = "LKFICHARGE000058";
			} else if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
				// 根据箱类别 判断费用类型
				record.setChargeTypeKey("LKFICHARGT000059");//
				chargeKey = "LKFICHARGE000058";
			}
			// 根据进场ID查询 修箱 洗箱费用

			Boolean isCos = false;
			// 修箱账单 的 金额和币种 人民币
			if (input.getRealTaxTotalCostRmb() != null && !input.getRealTaxTotalCostRmb().equals(0.00)) {
				hourCost = input.getRealTaxTotalCostRmb();// 取应付费用
				hourCurrency = FinanceCurrencyType.CNY.getCode();// 工时币种
				isCos = false;
			} else if (input.getRealTaxTotalCostUsa() != null && !input.getRealTaxTotalCostUsa().equals(0.00)) {// 美金
				hourCost = input.getRealTaxTotalCostUsa();// 取应付费用
				hourCurrency = FinanceCurrencyType.USD.getCode();// 工时币种
				isCos = false;
			} else if (input.getRealNotaxTotalCostRmb() != null && !input.getRealNotaxTotalCostRmb().equals(0.00)) {// 人民币不含税
				hourCost = input.getRealNotaxTotalCostRmb();// 取应付费用
				hourCurrency = FinanceCurrencyType.CNY.getCode();// 工时币种
				isCos = true;
			} else if (input.getRealNotaxTotalCostUsa() != null && !input.getRealNotaxTotalCostUsa().equals(0.00)) {// 美金不含税
				hourCost = input.getRealNotaxTotalCostUsa();// 取应付费用
				hourCurrency = FinanceCurrencyType.USD.getCode();// 工时币种
				isCos = true;
			}

			// 实际修理收入*比例
			BigDecimal cost = ComputeUtil.mul(hourCost, wbScale);
			if (hourCurrency.equals(FinanceCurrencyType.CNY.getCode())) {// 人民币
				record.setRealCurrencyType(FinanceCurrencyType.CNY.getCode());
				// 判断是否是中远的 将金额存放到不含税
				// 不是中远的，金额放到含税里面
				if (isCos) {
					record.setRealNotaxTotalCostRmb(cost);
					// 人民币换算美金
					record.setRealNotaxTotalCostUsa(ComputeUtil.div(cost, exchangeRate, 2));
					record.setReplyNotaxTotalCostRmb(cost);
					record.setReplyNotaxTotalCostUsa(record.getRealNotaxTotalCostUsa());
				} else {
					record.setRealTaxTotalCostRmb(cost);
					// 人民币换算美金
					record.setRealTaxTotalCostUsa(ComputeUtil.div(cost, exchangeRate, 2));

					record.setReplyTaxTotalCostRmb(cost);
					record.setReplyTaxTotalCostUsa(record.getRealTaxTotalCostUsa());
				}

			} else {// 美金
				record.setRealCurrencyType(FinanceCurrencyType.USD.getCode());
				// 判断是否是中远的 将金额存放到不含税
				// 不是中远的，金额放到含税里面
				if (isCos) {
					record.setRealNotaxTotalCostUsa(cost);
					// 人民币换算美金
					record.setRealNotaxTotalCostRmb(ComputeUtil.mul(cost, exchangeRate));

					record.setReplyNotaxTotalCostUsa(cost);
					record.setReplyNotaxTotalCostRmb(record.getRealNotaxTotalCostRmb());
				} else {
					record.setRealTaxTotalCostUsa(cost);
					// 人民币换算美金
					record.setRealTaxTotalCostRmb(ComputeUtil.mul(cost, exchangeRate));

					record.setReplyTaxTotalCostUsa(cost);
					record.setReplyTaxTotalCostRmb(record.getRealTaxTotalCostRmb());

				}
			}
			// 查询外包商信息
			String sfdx = prodFeignClient.getWbInfo(record.getProdContainerId(), record.getContainerCategory());
			record.setContainerUser(sfdx);

			record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
			record.setItemStatus(0);
			// 查询核算部门 根据场站查询利润中心
			String tmpChargeKey = "";
			BaseChargeTypeExample bctExample = new BaseChargeTypeExample();
			bctExample.createCriteria().andLangKeyEqualTo(record.getChargeTypeKey());
			List<BaseChargeType> bctList = chargeTypeDao.selectByExample(bctExample);
			// 得到费用key
			if (bctList != null && bctList.size() > 0) {
				tmpChargeKey = bctList.get(0).getChargeKey();
				
			}

			// 核算部门查询
			BaseAuditDeptInput badInput = new BaseAuditDeptInput();
			// 场站
			badInput.setYard(record.getYard());
			// 箱类别
			badInput.setContainerCategory(record.getContainerCategory());
			// 费用类型
			badInput.setChargeKey(tmpChargeKey);

			BaseAuditDept baDept = baseAuditDeptService.getInfo(badInput);
			if (baDept != null) {
				record.setDeptKey(baDept.getCostDept());// 通过场站查询得到 成本中心
				record.setDeptCode(baDept.getCostCenterCode());// 通过场站查询得到 成本中心
			}

			record.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
			record.setIsDel(PlatformConstants.ISDEL_NO);
			record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			record.setReplyTime(null);

			dao.insert(record);
			return true;

		}
		return false;
	}

	/**
	 * 批复 劳务外包（修箱） （实际修理收入-洗箱条目费用）*比例，批复费用确认时产生。 洗箱条目获取？？
	 */
	@Override
	public Boolean wxReply(PoolOutSourceRepairInput input) {
		// TODO Auto-generated method stub
		return null;
	}

}
