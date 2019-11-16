package com.sanlly.warehouse.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.dao.WareSparePartsCategoriesMapper;
import com.sanlly.warehouse.entity.WareSparePartsCategories;
import com.sanlly.warehouse.entity.WareSparePartsCategoriesExample;
import com.sanlly.warehouse.models.input.sparepartscategories.AddSparePartsCategoriesInput;
import com.sanlly.warehouse.models.input.sparepartscategories.EditSparePartsCategoriesInput;
import com.sanlly.warehouse.models.output.sparepartscategories.SparePartsCategoriesOutput;
import com.sanlly.warehouse.service.WareSparePartsCategoriesDetailsService;
import com.sanlly.warehouse.service.WareSparePartsCategoriesService;

/**
 * ClassName: WareSparePartsCategoriesServiceImpl Description: 备件大类服务层实现类 date:
 * 2019/7/25 17:53
 *
 * @author wannt
 * @since JDK 1.8
 */
@Service
public class WareSparePartsCategoriesServiceImpl extends BaseServiceImpl implements WareSparePartsCategoriesService {

	@Autowired
	private WareSparePartsCategoriesMapper sparePartsCategoriesMapper;

	@Autowired
	private WareSparePartsCategoriesDetailsService detailsService;

	private String wareSparePartsCategories = "ware_spare_parts_categories";

	/**
	 * 获取备件大类列表
	 * 
	 * @return
	 */
	@Override
	public List<SparePartsCategoriesOutput> getSparePartsCategoriesList() {
		// 组装查询条件
		WareSparePartsCategoriesExample example = new WareSparePartsCategoriesExample();
		WareSparePartsCategoriesExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		example.setOrderByClause("create_time desc");
		criteria.andWareSparePartsCategoriesIdIsNotNull();
		// 组装返回数据
		List<WareSparePartsCategories> wareSparePartsCategories = sparePartsCategoriesMapper.selectByExample(example);
		List<SparePartsCategoriesOutput> sparePartsCategoriesOutputs = new ArrayList<>();
		for (WareSparePartsCategories wareSparePartsCategory : wareSparePartsCategories) {
			SparePartsCategoriesOutput output = new SparePartsCategoriesOutput();
			BeanUtils.copyProperties(wareSparePartsCategory, output);
			output.setKeyLangLang(wareSparePartsCategory.getKey());
			sparePartsCategoriesOutputs.add(output);
		}
		return sparePartsCategoriesOutputs;
	}

	/**
	 * 获取备件大类
	 * 
	 * @param input
	 * @return
	 */
	@Override
	public SparePartsCategoriesOutput getSparePartsCategories(EditSparePartsCategoriesInput input) {
		WareSparePartsCategoriesExample example = new WareSparePartsCategoriesExample();
		WareSparePartsCategoriesExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if (input.getWareSparePartsCategoriesId() != null) {
			criteria.andWareSparePartsCategoriesIdEqualTo(input.getWareSparePartsCategoriesId());
		}
		if (input.getKey() != null && input.getKey() != "") {
			criteria.andKeyEqualTo(input.getKey());
		}
		// 组装返回数据
		List<WareSparePartsCategories> wareSparePartsCategories = sparePartsCategoriesMapper.selectByExample(example);
		WareSparePartsCategories categories = wareSparePartsCategories.get(0);
		SparePartsCategoriesOutput output = new SparePartsCategoriesOutput();
		BeanUtils.copyProperties(categories, output);
		output.setKeyLangLang(categories.getKey());
		return output;
	}

	/**
	 * 添加备件大类
	 * 
	 * @param input
	 */
	@Override
	@Transactional
	public void addSparePartsCategories(AddSparePartsCategoriesInput input) {
		WareSparePartsCategoriesExample example = new WareSparePartsCategoriesExample();
		WareSparePartsCategoriesExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andSparePartsCategoriesNameEqualTo(input.getSparePartsCategoriesName());
		List<WareSparePartsCategories> list = sparePartsCategoriesMapper.selectByExample(example);
		if (list.size() > 0) {
			throw new RuntimeException("isExist");
		}
		Result<String> result = productionService.getKey(wareSparePartsCategories);
		if (result == null || StringUtils.isEmpty(result.getData())) {
			throw new SqlException("insertFail");
		}
		WareSparePartsCategories wareSparePartsCategories = new WareSparePartsCategories();
		BeanUtils.copyProperties(input, wareSparePartsCategories);
		wareSparePartsCategories.setIsDel(PlatformConstants.ISDEL_NO);
		wareSparePartsCategories.setCreateTime(new Date());
		wareSparePartsCategories.setCreateUser(getCurrentUserId());
		wareSparePartsCategories.setKey(result.getData());
		sparePartsCategoriesMapper.insert(wareSparePartsCategories);
	}

	/**
	 * 修改备件大类
	 * 
	 * @param input
	 */
	@Override
	@Transactional
	public void updateSparePartsCategories(EditSparePartsCategoriesInput input) {
		WareSparePartsCategoriesExample example = new WareSparePartsCategoriesExample();
		WareSparePartsCategoriesExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andSparePartsCategoriesNameEqualTo(input.getSparePartsCategoriesName());
		List<WareSparePartsCategories> list = sparePartsCategoriesMapper.selectByExample(example);
		if (list.size() > 0) {
			if (!list.get(0).getWareSparePartsCategoriesId().equals(input.getWareSparePartsCategoriesId())) {
				throw new RuntimeException("isExist");
			}
		}
		WareSparePartsCategories wareSparePartsCategories = new WareSparePartsCategories();
		BeanUtils.copyProperties(input, wareSparePartsCategories);
		wareSparePartsCategories.setUpdateTime(new Date());
		wareSparePartsCategories.setUpdateUser(getCurrentUserId());
		sparePartsCategoriesMapper.updateByPrimaryKeySelective(wareSparePartsCategories);
	}

	/**
	 * 根据ID批量删除备件大类
	 * 
	 * @param sparePartsCategoriesIds
	 */
	@Override
	@Transactional
	public void deleteSparePartsCategories(Integer[] sparePartsCategoriesIds) {
		WareSparePartsCategoriesExample example = new WareSparePartsCategoriesExample();
		example.createCriteria().andWareSparePartsCategoriesIdIn(Arrays.asList(sparePartsCategoriesIds));
		WareSparePartsCategories sparePartsCategories = new WareSparePartsCategories();
		sparePartsCategories.setIsDel(PlatformConstants.ISDEL_YES);
		sparePartsCategories.setUpdateUser(getCurrentUserId());
		sparePartsCategories.setUpdateTime(new Date());
		sparePartsCategoriesMapper.updateByExampleSelective(sparePartsCategories, example);

	}

	/**
	 * 获取备件大类列表
	 * 
	 * @return
	 */
	@Override
	public List<SparePartsCategoriesOutput> getSparePartCategoryWithDetails() {
		List<SparePartsCategoriesOutput> details = getSparePartsCategoriesList();
		details.stream().forEach(ssc -> {
			ssc.setDetails(detailsService.getCategoriesDetailByCategoriesKey(ssc.getKey()));
		});
		return details;
	}

}
