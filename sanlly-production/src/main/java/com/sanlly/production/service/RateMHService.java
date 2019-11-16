package com.sanlly.production.service;

import java.math.BigDecimal;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.rate.AddMHRateInput;
import com.sanlly.production.models.input.rate.SearchMHRateInput;
import com.sanlly.production.models.input.rate.UpdateMHRateInput;
import com.sanlly.production.models.output.rate.MHRateOutput;
import com.sanlly.production.models.output.rate.SearchMHRateOutput;

/**
 * 工时费率接口
 * 
 * @Package com.sanlly.production.service 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月20日 上午10:32:50 
 * @version V1.0   
 */
public interface RateMHService {
	/**
	 * 工时费率列表
	 * 
	 * @Description: TODO
	 * @param input
	 * @return PagedList<SearchMHRateOutput> @throws 
	 */
	PagedList<SearchMHRateOutput> getZYRatePagedList(SearchMHRateInput input);

	/**
	 * 工时费率新增
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	void addMHRate(AddMHRateInput input);

	/**
	 * 工时费率编辑获取单条信息
	 * 
	 * @Description: TODO
	 * @param rateId
	 * @return MHRateOutput @throws 
	 */
	MHRateOutput getMHRate(Integer rateId);

	/**
	 * 工时费率编辑
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	void updateMHRate(UpdateMHRateInput input);

	/**
	 * 工时费率删除
	 * 
	 * @Description: TODO
	 * @param listIds
	 *            void @throws 
	 */
	void delMHRate(Integer[] listIds);

	/**
	 * 获取用箱人报价币种
	 * 
	 * @Description: TODO
	 * @param containerUser
	 * @return String @throws 
	 */
	String getUserCurrency(String company, String containerUser, String containerCategory);

	/**
	 * 用箱人人民币转美金
	 * 
	 * @Description: TODO
	 * @param company
	 * @param containerUser
	 * @param containerCategory
	 * @param money
	 * @return String @throws 
	 */
	BigDecimal getCNYtoUSD(String company, String containerUser, String containerCategory, BigDecimal money);

	/**
	 * 用箱人美金转人民币
	 * 
	 * @Description: TODO
	 * @param company
	 * @param containerUser
	 * @param containerCategory
	 * @param money
	 * @return String @throws 
	 */
	BigDecimal getUSDtoCNY(String company, String containerUser, String containerCategory, BigDecimal money);

}
