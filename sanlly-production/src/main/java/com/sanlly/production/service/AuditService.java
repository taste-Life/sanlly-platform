package com.sanlly.production.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.containerTesting.AddMasterAuditInput;
import com.sanlly.production.models.input.containerTesting.AddSonAuditInput;
import com.sanlly.production.models.input.containerTesting.SearchAuditInput;
import com.sanlly.production.models.input.containerTesting.SearchAuditRateInput;
import com.sanlly.production.models.input.containerTesting.UpdateMasterAuditInput;
import com.sanlly.production.models.output.containerTesting.AuditAutomaticOutput;
import com.sanlly.production.models.output.containerTesting.SearchAuditOutput;
import com.sanlly.production.models.output.containerTesting.SearchAuditRateOutput;
import com.sanlly.production.models.output.containerTesting.SonAuditOutput;

/**
 * 自动审核接口
 * 
 * @Package com.sanlly.production.service 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月29日 下午7:59:18 
 * @version V1.0   
 */
public interface AuditService {
	/**
	 * 自动审核列表
	 * 
	 * @Description: TODO
	 * @param input
	 * @return PagedList<SearchAuditOutput> @throws 
	 */
	PagedList<SearchAuditOutput> getAuditPagedList(SearchAuditInput input);

	/**
	 * 自动审核主表新增
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	void addMasterAudit(AddMasterAuditInput input);

	/**
	 * 获取单条自动审核主表数据
	 * 
	 * @Description: TODO
	 * @param auditId
	 * @return AuditAutomaticOutput @throws 
	 */
	AuditAutomaticOutput getMasterAudit(Integer auditId);

	/**
	 * 自动审核主表编辑
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	void updateMasterAudit(UpdateMasterAuditInput input);

	/**
	 * 自动审核主表删除
	 * 
	 * @Description: TODO
	 * @param listIds
	 *            void @throws 
	 */
	void delMasterAudit(Integer[] listIds);

	/**
	 * 自动审核条件新增
	 * 
	 * @Description: TODO
	 * @param input
	 *            void @throws 
	 */
	void updateSonAudit(AddSonAuditInput input);

	/**
	 * 获取自动审核条件信息
	 * 
	 * @Description: TODO
	 * @param auditId
	 * @return SonAuditOutput @throws 
	 */
	SonAuditOutput getSonAudit(Integer auditId);

	/**
	 * 限制条目列表
	 * 
	 * @Description: TODO
	 * @param input
	 * @return PagedList<SearchAuditRateOutput> @throws 
	 */
	PagedList<SearchAuditRateOutput> getAuditRatePagedList(SearchAuditRateInput input);

	/**
	 * 自动审核接口
	 * 
	 * @Description: TODO
	 * @param courseId
	 *            void @throws 
	 */
	void auditAutomatic(String courseId, Boolean isUnit);

	/**
	 * 添加估价单明细
	 * 
	 * @Description: TODO
	 * @param courseId
	 *            void @throws 
	 */
	void AddEvaluationEntry(String courseId, Boolean isUnit, Boolean isAuto);

	/**
	 * 自动派工
	 * 
	 * @Description: TODO
	 * @param courseId
	 *            进场id
	 * @param isUnit
	 *            是否是机组：false:不是机组，true:是机组 void @throws 
	 */
	void referralAutomatic(String courseId, Boolean isUnit);

	/**
	 * 派工接口，保修使用
	 * 
	 * @Description: TODO
	 * @param courseId
	 *            void @throws 
	 */
	void mainReferral(String courseId);

	/**
	 * 估价接口，保修使用
	 * 
	 * @Description: TODO
	 * @param courseId
	 *            void @throws 
	 */
	void mainEvaluation(String courseId);

}
