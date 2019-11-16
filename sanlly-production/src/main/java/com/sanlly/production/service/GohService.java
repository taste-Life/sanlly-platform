package com.sanlly.production.service;

import java.text.ParseException;
import java.util.List;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.goh.GohContainerCourseAddInput;
import com.sanlly.production.models.input.goh.GohContainerEntryInput;
import com.sanlly.production.models.input.goh.GohContainerGohAddInput;
import com.sanlly.production.models.input.goh.GohEntryRateInput;
import com.sanlly.production.models.input.goh.GohListInput;
import com.sanlly.production.models.input.goh.GohRequireAddInput;
import com.sanlly.production.models.input.goh.GohRequireUpdateInput;
import com.sanlly.production.models.input.goh.SearchGohContainerInput;
import com.sanlly.production.models.input.goh.SearchGohRequireInput;
import com.sanlly.production.models.output.goh.GohContainerEntryOutput;
import com.sanlly.production.models.output.goh.GohContainerOutput;
import com.sanlly.production.models.output.goh.GohRequireOutput;
import com.sanlly.production.models.output.goh.SearchCourseOutput;
import com.sanlly.production.models.output.goh.SearecGohOutput;
import com.sanlly.production.models.output.goh.SearecGohRequireOutput;
import com.sanlly.production.models.output.rate.SelectItemOutput;

/**
 * 挂衣箱接口
 * 
 * @Package com.sanlly.production.service 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月21日 下午4:10:11 
 * @version V1.0   
 */
public interface GohService {

	/**
	 * 改制要求列表
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Result<SearecGohOutput> @throws 
	 */
	PagedList<SearecGohRequireOutput> getGohList(SearchGohRequireInput input);

	/**
	 * 根据改制要求获取挂衣箱
	 * 
	 * @Description: TODO
	 * @param gohId
	 * @return PagedList<SearecGohOutput> @throws 
	 */
	PagedList<SearecGohOutput> getGohOne(Integer gohId, Integer index, Integer size);

	/**
	 * 获取挂衣箱列表
	 * 
	 * @Description: TODO
	 * @param input
	 * @return PagedList<SearecGohOutput> @throws 
	 */
	PagedList<SearecGohOutput> getGohList(GohListInput input);

	/**
	 * 改制要求指新增
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	void addRequire(GohRequireAddInput input);

	/**
	 * 获取单条改制要求信息
	 * 
	 * @Description: TODO
	 * @param requireId
	 *            void @throws 
	 */
	GohRequireOutput getGohRequire(Integer requireId);

	/**
	 * 删除改制要求和挂衣箱的绑定关系
	 * 
	 * @Description: TODO
	 * @param gohIds
	 *            void @throws 
	 */
	void delGohList(Integer[] gohIds);

	/**
	 * 改制要求编辑
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	void updateRequire(GohRequireUpdateInput input);

	/**
	 * 挂衣箱基础信息添加
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	void addGohContainer(GohContainerCourseAddInput input);

	/**
	 * 挂衣箱列表
	 * 
	 * @Description: TODO
	 * @param input
	 * @return PagedList<SearecGohOutput> @throws 
	 */
	PagedList<SearecGohOutput> getGohContainerList(SearchGohContainerInput input);

	/**
	 * 获取挂衣箱条目
	 * 
	 * @Description: TODO
	 * @param gohId
	 * @return PagedList<GohContainerEntryOutput> @throws 
	 */
	List<GohContainerEntryOutput> getGohContainerEntryList(Integer gohId);

	/**
	 * 挂衣箱添加
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	Integer addGohContainerByGoh(GohContainerGohAddInput input) throws ParseException;

	/**
	 * 获取进场列表
	 * 
	 * @Description: TODO
	 * @param input
	 * @return PagedList<SearchCourseOutput> @throws 
	 */
	PagedList<SearchCourseOutput> getCourseList(GohListInput input);

	/**
	 * 根据进场id添加挂衣箱
	 * 
	 * @Description: TODO
	 * @param listIds
	 *            void @throws 
	 */
	void addGohContainerByCourseIds(String[] listIds);

	/**
	 * 获取挂衣箱信息
	 * 
	 * @Description: TODO
	 * @param gohId
	 * @return GohContainerOutput @throws 
	 */
	GohContainerOutput getGohContainer(Integer gohId);

	/**
	 * 获取挂衣箱费率
	 * 
	 * @Description: TODO
	 * @param input
	 * @return List<SelectItemOutput> @throws 
	 */
	List<SelectItemOutput> getRateNameSelectList(GohEntryRateInput input);

	/**
	 * 获取备件号
	 * 
	 * @Description: TODO
	 * @param input
	 * @return List<SelectItemOutput> @throws 
	 */
	List<SelectItemOutput> getSparesNumberSelectList(GohEntryRateInput input);

	/**
	 * 获取对应数量
	 * 
	 * @Description: TODO
	 * @param input
	 * @return List<SelectItemOutput> @throws 
	 */
	List<SelectItemOutput> getQuantitySelectList(GohEntryRateInput input);

	/**
	 * 计算工时
	 * 
	 * @Description: TODO
	 * @param rateId
	 * @param quantity
	 * @return Double @throws 
	 */
	String getManHourInfo(GohEntryRateInput input);

	/**
	 * 删除挂衣箱条目
	 * 
	 * @Description: TODO
	 * @param ids
	 *            void @throws 
	 */
	void delGohEntryList(Integer[] ids);

	/**
	 * 获取挂衣箱改制费用
	 * 
	 * @Description: TODO
	 * @param input
	 * @return String @throws 
	 */
	String getGohMoney(GohEntryRateInput input);

	/**
	 * 检验状态
	 * 
	 * @Description: TODO
	 * @param id
	 * @param state
	 *            void @throws 
	 */
	void updateTestingState(Integer id, String state);

	/**
	 * 派工状态
	 * 
	 * @Description: TODO
	 * @param id
	 * @param state
	 *            void @throws 
	 */
	void updateReferralState(Integer id, String state);

	/**
	 * 获取拆箱条目
	 * 
	 * @Description: TODO
	 * @param input
	 * @return GohContainerEntryInput @throws 
	 */
	GohContainerEntryInput getDevanning(GohEntryRateInput input);

	/**
	 * 领料
	 * 
	 * @Description: TODO
	 * @param id
	 *            void @throws 
	 */
	void addPickingList(Integer id);

}
