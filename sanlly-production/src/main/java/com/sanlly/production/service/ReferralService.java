package com.sanlly.production.service;

import java.math.BigDecimal;
import java.util.List;

import com.sanlly.common.models.input.referral.WorkGroupOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.Maintenance;
import com.sanlly.production.entity.ReferralEntry;
import com.sanlly.production.models.input.referral.AddReferralEntryInput;
import com.sanlly.production.models.input.referral.AddReferralInput;
import com.sanlly.production.models.input.referral.AnewReferraInput;
import com.sanlly.production.models.input.referral.ReferralOperateInput;
import com.sanlly.production.models.input.referral.SearchAutomationInput;
import com.sanlly.production.models.output.rate.SelectItemOutput;
import com.sanlly.production.models.output.referral.SearchAutomationOutput;

/**
 * 派工接口
 * 
 * @Package com.sanlly.production.service 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月5日 下午4:08:36 
 * @version V1.0   
 */
public interface ReferralService {

	/**
	 * 派工明细新增
	 * 
	 * @Description: TODO void @throws 
	 */
	void AddReferralEntry(AddReferralInput input);

	/**
	 * 预出库单添加
	 * 
	 * @Description: TODO
	 * @param course
	 * @param entry
	 *            void @throws 
	 */
	void addPlanStock(Course course, AddReferralEntryInput entry, String containerCategory);

	/**
	 * 预出库单添加
	 * 
	 * @Description: TODO
	 * @param course
	 * @param model
	 *            void @throws 
	 */
	void addPlanStock(Course course, ReferralEntry model);

	/**
	 * 预出库单添加，保修
	 * 
	 * @Description: TODO
	 * @param course
	 * @param model
	 * @param containerCategory
	 *            void @throws 
	 */
	void addMainPlanStock(Maintenance course, AddReferralEntryInput model, String containerCategory);

	/**
	 * 自动排程列表
	 * 
	 * @Description: TODO
	 * @param input
	 * @return PagedList<SearchAutomationOutput> @throws 
	 */
	PagedList<SearchAutomationOutput> getAutomationList(SearchAutomationInput input);

	/**
	 * 获取维修班组
	 * 
	 * @Description: TODO
	 * @return List<SelectItemOutput> @throws 
	 */
	List<SelectItemOutput> getDesignateUser(String yard, String containerCategory);

	/**
	 * 派工接口
	 * 
	 * @Description: TODO
	 * @param courseId
	 * @param containerCategory
	 *            void @throws 
	 */
	void referralOperate(ReferralOperateInput input);

	/**
	 * 修改派工条目是否修理字段
	 * 
	 * @Description: TODO
	 * @param entryIds
	 *            void @throws 
	 */
	void updateIsRepair(String[] entryIds);

	/**
	 * 取消派工
	 * 
	 * @Description: TODO
	 * @return String @throws 
	 */
	String cancelReferra(String courseId, String containerCategory);

	/**
	 * 重新派工
	 * 
	 * @Description: TODO
	 * @return String @throws 
	 */
	String anewReferra(AnewReferraInput input);

	/**
	 * 获取已出库成本
	 * 
	 * @Description: TODO
	 * @param courseId
	 * @param containerCategory
	 * @return BigDecimal @throws 
	 */
	BigDecimal getStockMoney(String courseId, String containerCategory);

	/**
	 * 根据用户获取工作组
	 * 
	 * @Description: TODO
	 * @param yard
	 * @param user
	 * @return WorkGroupOutput @throws 
	 */
	WorkGroupOutput getWorkGroupByUser(String yard, Integer user);

}
