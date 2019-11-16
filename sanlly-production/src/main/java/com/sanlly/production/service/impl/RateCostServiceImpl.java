package com.sanlly.production.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.sanlly.production.service.WarehouseClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.InvalidException;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.CostRateMapper;
import com.sanlly.production.dao.RateExtMapper;
import com.sanlly.production.dao.SparesAlgorithmMapper;
import com.sanlly.production.dao.SparesParameterMapper;
import com.sanlly.production.entity.CostRate;
import com.sanlly.production.entity.CostRateExample;
import com.sanlly.production.entity.SparesAlgorithm;
import com.sanlly.production.entity.SparesAlgorithmExample;
import com.sanlly.production.entity.SparesParameter;
import com.sanlly.production.entity.SparesParameterExample;
import com.sanlly.production.models.input.rate.AddCostRateInput;
import com.sanlly.production.models.input.rate.SearchCostRateInput;
import com.sanlly.production.models.input.rate.UpdateCostRateInput;
import com.sanlly.production.models.output.rate.CostRateOutput;
import com.sanlly.production.models.output.rate.SearchCostRateMasterOutput;
import com.sanlly.production.models.output.rate.SearchCostRateSonOutput;
import com.sanlly.production.models.output.rate.SelectItemOutput;
import com.sanlly.production.service.RateCostService;

@Service
public class RateCostServiceImpl extends BaseServiceImpl implements RateCostService {

	@Autowired
	private RateExtMapper rateExtMapper;

	@Autowired
	private SparesParameterMapper parameterMapper;

	@Autowired
	private SparesAlgorithmMapper algorithmMapper;

	@Autowired
	private CostRateMapper costRateMapper;

	@Autowired
	private WarehouseClient warehouseClient;

	/**
	 * 分页列表查询
	 */
	public PagedList<SearchCostRateMasterOutput> getRatePagedList(SearchCostRateInput input) {
		Integer pageIndex = input.getPageIndex();
		Integer beginIndex = (input.getPageIndex() - 1) * input.getPageSize();
		input.setPageIndex(beginIndex);
		// 列表
		List<SearchCostRateMasterOutput> list = rateExtMapper.getCostRatePagedList(input);
		// 总数
		Integer totalItemCount = rateExtMapper.getCostRatePagedCount(input);
		PagedList<SearchCostRateMasterOutput> pagedList = new PagedList<>(pageIndex, input.getPageSize(),
				totalItemCount, list);
		input.setPageIndex(pageIndex);
		return pagedList;
	}

	/**
	 * 根据费率查询备件信息
	 */
	@Override
	public List<SearchCostRateSonOutput> getSparesMessage(String rateId) {
		List<SearchCostRateSonOutput> list = new ArrayList<SearchCostRateSonOutput>();
		CostRateExample example = new CostRateExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andRateIdEqualTo(rateId);
		List<CostRate> cost = costRateMapper.selectByExample(example);
		for (CostRate item : cost) {
			SearchCostRateSonOutput model = new SearchCostRateSonOutput();
			model.setCostRateId(item.getProdCostRateId());
			model.setPositionCode(item.getPositionCode()); // 位置代码
			model.setContainerTypeLang(item.getContainerType()); // 箱型
			model.setSizeLang(item.getSize()); // 尺寸
			model.setSparesTypeLang(item.getSparesType()); // 备件类别
			model.setSpares(item.getSpares()); // 备件号
			model.setUseAlgorithmLang(item.getUseAlgorithm()); // 使用算法
			model.setUseCoefficientOneLang(item.getUseCoefficientOne()); // 使用系数1
			model.setUseCoefficientTwoLang(item.getUseCoefficientTwo()); // 使用系数2
			model.setUseConstant(item.getUseConstant()); // 使用常数
			model.setRemark(item.getRemark()); // 备注
			list.add(model);
		}
		return list;
	}

	/**
	 * 新增成本费率条目
	 */
	@Override
	public void addCostRate(AddCostRateInput input) {
		CostRate model = new CostRate();
		model.setProdCostRateId(UUID.randomUUID().toString());
		model.setRateId(input.getRateId()); // 费率主键
		if (StringUtils.isNotEmpty(input.getPositionCode()))
			model.setPositionCode(input.getPositionCode().toUpperCase()); // 位置代码
		model.setSize(input.getSize()); // 尺寸
		model.setContainerType(input.getContainerType()); // 箱型
		model.setSparesType(input.getSparesType()); // 备件类别
		model.setSpares(input.getSpares()); // 备件号
		model.setUseAlgorithm(input.getUseAlgorithm()); // 使用算法
		model.setUseCoefficientOne(input.getUseCoefficientOne()); // 使用系数1
		model.setUseCoefficientTwo(input.getUseCoefficientTwo()); // 使用系数2
		model.setUseConstant(input.getUseConstant()); // 使用常数
		model.setRemark(input.getRemark()); // 备注
		model.setIsDel(PlatformConstants.ISDEL_NO);
		model.setCreateUser(getCurrentUserId());
		model.setCreateTime(new Date());
		costRateMapper.insert(model);
	}

	/**
	 * 获取单条条目信息
	 */
	@Override
	public CostRateOutput getCostItemMessage(String rateId) {
		CostRate cost = costRateMapper.selectByPrimaryKey(rateId);
		if (cost.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			CostRateOutput model = new CostRateOutput();
			model.setCostRateId(cost.getProdCostRateId());
			model.setPositionCode(cost.getPositionCode()); // 位置代码
			model.setSize(cost.getSize()); // 尺寸
			model.setContainerType(cost.getContainerType()); // 箱型
			model.setSparesType(cost.getSparesType()); // 备件类别
			model.setSpares(cost.getSpares()); // 备件号
			model.setUseAlgorithm(cost.getUseAlgorithm()); // 使用算法
			model.setUseCoefficientOne(cost.getUseCoefficientOne()); // 使用系数1
			model.setUseCoefficientTwo(cost.getUseCoefficientTwo()); // 使用系数2
			model.setUseConstant(cost.getUseConstant()); // 使用常数
			model.setRemark(cost.getRemark()); // 备注
			return model;
		}
		return null;
	}

	/**
	 * 编辑成本费用条目
	 */
	@Override
	public void updateCostRate(UpdateCostRateInput input) {
		CostRate model = costRateMapper.selectByPrimaryKey(input.getCostRateId());
		if (model.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			if (StringUtils.isNotEmpty(input.getPositionCode()))
				model.setPositionCode(input.getPositionCode().toUpperCase()); // 位置代码
			model.setSize(input.getSize()); // 尺寸
			model.setContainerType(input.getContainerType()); // 箱型
			model.setSparesType(input.getSparesType()); // 备件类别
			model.setSpares(input.getSpares()); // 备件号
			model.setUseAlgorithm(input.getUseAlgorithm()); // 使用算法
			model.setUseCoefficientOne(input.getUseCoefficientOne()); // 使用系数1
			model.setUseCoefficientTwo(input.getUseCoefficientTwo()); // 使用系数2
			model.setUseConstant(input.getUseConstant()); // 使用常数
			model.setRemark(input.getRemark()); // 备注
			model.setUpdateUser(getCurrentUserId());
			model.setUpdateTime(new Date());
			costRateMapper.updateByPrimaryKey(model);
			return;
		}
		throw new InvalidException("编辑失败");
	}

	/**
	 * 删除条目
	 */
	@Override
	public void delCostRate(String[] listIds) {
		CostRateExample example = new CostRateExample();
		example.createCriteria().andProdCostRateIdIn(Arrays.asList(listIds));
		CostRate model = new CostRate();
		model.setIsDel(PlatformConstants.ISDEL_YES);
		model.setUpdateUser(getCurrentUserId());
		model.setUpdateTime(new Date());
		costRateMapper.updateByExampleSelective(model, example);
	}

	/**
	 * 算法下拉
	 */
	@Override
	public List<SelectItemOutput> getAlgorithmList() {
		SparesAlgorithmExample example = new SparesAlgorithmExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<SparesAlgorithm> list = algorithmMapper.selectByExample(example);
		return list.stream().map(a -> {
			SelectItemOutput output = new SelectItemOutput();
			output.setValue(a.getKey());
			output.setLabelLang(a.getKey());
			output.setCode(a.getSparesParameterCode()); // 编码
			return output;
		}).collect(Collectors.toList());
	}

	/**
	 * 常用系数下拉
	 */
	@Override
	public List<SelectItemOutput> getCoefficientList() {
		SparesParameterExample example = new SparesParameterExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<SparesParameter> list = parameterMapper.selectByExample(example);
		return list.stream().map(a -> {
			SelectItemOutput output = new SelectItemOutput();
			output.setValue(a.getKey());
			output.setLabelLang(a.getKey());
			return output;
		}).collect(Collectors.toList());
	}

	/**
	 * 部件下拉
	 */
	@Override
	public List<SelectItemOutput> getSparesList() {
		Result<List<SelectItemOutput>> list = warehouseClient.getDeviceList();
		if (list != null && list.getData().size() > 0)
			return list.getData();
		return new ArrayList<SelectItemOutput>();
	}

}
