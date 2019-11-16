package com.sanlly.warehouse.service;

import com.sanlly.warehouse.models.input.sparepartscategories.AddSparePartsCategoriesInput;
import com.sanlly.warehouse.models.input.sparepartscategories.EditSparePartsCategoriesInput;
import com.sanlly.warehouse.models.output.sparepartscategories.SparePartsCategoriesOutput;

import java.util.List;

/**
 * ClassName: WareSparePartsCategoriesService Description: 备件大类服务层 date:
 * 2019/7/25 17:53
 *
 * @author wannt
 * @since JDK 1.8
 */
public interface WareSparePartsCategoriesService {

	/**
	 * 获取备件大类列表
	 * 
	 * @return
	 */
	List<SparePartsCategoriesOutput> getSparePartsCategoriesList();

	/**
	 * 获取备件大类
	 * 
	 * @param input
	 * @return
	 */
	SparePartsCategoriesOutput getSparePartsCategories(EditSparePartsCategoriesInput input);

	/**
	 * 添加备件大类
	 * 
	 * @param input
	 */
	void addSparePartsCategories(AddSparePartsCategoriesInput input);

	/**
	 * 修改备件大类
	 * 
	 * @param input
	 */
	void updateSparePartsCategories(EditSparePartsCategoriesInput input);

	/**
	 * 根据ID批量删除备件大类
	 * 
	 * @param sparePartsCategoriesIds
	 */
	void deleteSparePartsCategories(Integer[] sparePartsCategoriesIds);

	/**
	 * 获取备件大类及明细类别
	 * 
	 * @return
	 */
	List<SparePartsCategoriesOutput> getSparePartCategoryWithDetails();
}
