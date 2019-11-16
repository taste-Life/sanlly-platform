package com.sanlly.production.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.rate.AddCode;
import com.sanlly.production.models.input.rate.SearchRateCodeInput;
import com.sanlly.production.models.input.rate.UpdateCode;
import com.sanlly.production.models.output.rate.GetCodeMessageOutput;
import com.sanlly.production.models.output.rate.SearchRateCodeOutput;
import com.sanlly.production.models.output.rate.SelectItemOutput;

/**
 * 代码对应接口
 * 
 * @Package com.sanlly.production.service 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月27日 上午11:20:17 
 * @version V1.0   
 */
public interface RateCodeService {
	/**
	 * 代码对应列表
	 * 
	 * @Description: TODO
	 * @param input
	 * @return PagedList<SearchRateCodeOutput> @throws 
	 */
	PagedList<SearchRateCodeOutput> getRateCodePagedList(SearchRateCodeInput input);

	/**
	 * 部件修理分类下拉
	 * 
	 * @Description: TODO
	 * @return List<SelectItemOutput> @throws 
	 */
	List<SelectItemOutput> getPartsRepairTypeList();

	/**
	 * 部件修理分类下拉
	 * 
	 * @Description: TODO
	 * @return List<SelectItemOutput> @throws 
	 */
	List<SelectItemOutput> getDamageCodeList();

	/**
	 * 代码对应新增
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	void addCode(AddCode input);

	/**
	 * 获取单条代码对应信息
	 * 
	 * @Description: TODO
	 * @param codeId
	 * @return GetCodeMessageOutput @throws 
	 */
	GetCodeMessageOutput getUpdateCode(Integer codeId);

	/**
	 * 代码对应编辑
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	void updateCode(UpdateCode input);

	/**
	 * 代码对应删除
	 * 
	 * @Description: TODO
	 * @param listIds
	 *            void @throws 
	 */
	void delCode(Integer[] listIds);

}
