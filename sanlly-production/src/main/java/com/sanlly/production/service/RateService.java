package com.sanlly.production.service;

import java.util.List;

import com.sanlly.production.models.input.rate.AddRateItemInput;
import com.sanlly.production.models.input.rate.AddSanRateInput;
import com.sanlly.production.models.input.rate.GetRateMessageInput;
import com.sanlly.production.models.input.rate.SearchRateInput;
import com.sanlly.production.models.input.rate.UpdateRateItemInput;
import com.sanlly.production.models.input.rate.UpdateSanRateInput;
import com.sanlly.production.models.output.rate.GetRateMessageOutput;
import com.sanlly.production.models.output.rate.RateGSItemOutput;
import com.sanlly.production.models.output.rate.RateQJItemOutput;
import com.sanlly.production.models.output.rate.SanRateOutput;
import com.sanlly.production.models.output.rate.SearchSanRateGSItemOutput;
import com.sanlly.production.models.output.rate.SearchSanRateOutput;
import com.sanlly.production.models.output.rate.SearchSanRateQJItemOutput;
import com.sanlly.production.models.output.rate.SearchUserRateOutput;
import com.sanlly.production.models.output.rate.SelectItemOutput;

/**
 * 费率管理接口
 * 
 * @author wangxzh
 *
 */
public interface RateService {

	/**
	 * 获取费率信息和付费方
	 * 
	 * @Description: TODO
	 * @param input
	 * @return GetRateMessageOutput @throws 
	 */
	GetRateMessageOutput getRateAndPayingMessage(GetRateMessageInput input);

	/**
	 * 获取材料费、工时费等费率接口
	 * 
	 * @param input
	 * @return
	 */
	GetRateMessageOutput getRateMessage(GetRateMessageInput input);

	/**
	 * 部件大类下拉
	 * 
	 * @param name
	 * @return
	 */
	List<SelectItemOutput> getPartsTypeSelect(String name);

	/**
	 * 部件明细下拉
	 * 
	 * @param name
	 * @return
	 */
	List<SelectItemOutput> getPartsDetailsSelect(String name);

	/**
	 * 维修代码下拉
	 * 
	 * @param name
	 * @return
	 */
	List<SelectItemOutput> getRepairSelect(String name);

	/**
	 * 材质代码下拉
	 * 
	 * @param name
	 * @return
	 */
	List<SelectItemOutput> getMaterialSelect(String name);

	/**
	 * 币种下拉
	 * 
	 * @Description: TODO
	 * @return List<SelectItemOutput> @throws 
	 */
	List<SelectItemOutput> getCurrencySelect();

	/**
	 * 获取部件明细
	 * 
	 * @Description: TODO
	 * @return List<SelectItemOutput> @throws 
	 */
	List<SelectItemOutput> getPartsSelect();

	/**
	 * SAN列表数据
	 * 
	 * @param input
	 * @return
	 */
	List<SearchSanRateOutput> getSanRateList(SearchRateInput input);

	/**
	 * SAN费率新增
	 * 
	 * @param input
	 */
	void addSanRate(AddSanRateInput input);

	/**
	 * SAN编辑数据获取
	 * 
	 * @param rateId
	 * @return
	 */
	SanRateOutput getUpdateSanRate(String rateId);

	/**
	 * SAN费率编辑
	 * 
	 * @param input
	 */
	void updateSanRate(UpdateSanRateInput input);

	/**
	 * SAN费率删除
	 * 
	 * @param listIds
	 */
	void delSanRate(String[] listIds);

	/**
	 * 用箱人费率列表
	 * 
	 * @param rateId
	 * @return
	 */
	List<SearchUserRateOutput> getUserRateList(String rateId);

	/**
	 * 费率详情（公式型）
	 * 
	 * @param rateId
	 * @return
	 */
	List<SearchSanRateGSItemOutput> getSanRateGSItemList(String rateId, String type);

	/**
	 * 费率详情（穷举型）
	 * 
	 * @param rateId
	 * @return
	 */
	List<SearchSanRateQJItemOutput> getSanRateQJItemList(String rateId, String type);

	/**
	 * 费率明细新增
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	void addRateItem(AddRateItemInput input);

	/**
	 * 获取公式型明细信息
	 * 
	 * @Description: TODO
	 * @param rateId
	 * @return RateGSItemOutput @throws 
	 */
	RateGSItemOutput getRateGSItemList(String rateId);

	/**
	 * 获取穷举型清洗信息
	 * 
	 * @Description: TODO
	 * @param rateId
	 * @return RateQJItemOutput @throws 
	 */
	RateQJItemOutput getRateQJItemList(String rateId);

	/**
	 * 费率条目信息编辑
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	void updateRateItem(UpdateRateItemInput input);

	/**
	 * 费率条目删除
	 * 
	 * @Description: TODO
	 * @param listIds
	 *            void @throws 
	 */
	void delRateItem(String[] listIds, String type);

	void rateTestGx();
	void rateTestLx();
	void rateTestJz();

}
