package com.sanlly.production.service;

import java.util.List;

import com.sanlly.common.models.output.SelectOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.edi.AddAutoPoolInput;
import com.sanlly.production.models.input.edi.AddAutoSendInput;
import com.sanlly.production.models.input.edi.AddEdiPoolInput;
import com.sanlly.production.models.input.edi.AddEdiSearchInput;
import com.sanlly.production.models.input.edi.AutoIntoPoolSearchInput;
import com.sanlly.production.models.input.edi.AutoSendSearchInput;
import com.sanlly.production.models.input.edi.CompanyCodeSearchInput;
import com.sanlly.production.models.input.edi.CompanyContainerUserSearchInput;
import com.sanlly.production.models.input.edi.CompanyEdiSearchInput;
import com.sanlly.production.models.input.edi.EdiFileSearchInput;
import com.sanlly.production.models.input.edi.EdiPoolSearchInput;
import com.sanlly.production.models.input.edi.EdiTypeContainerUserInput;
import com.sanlly.production.models.input.edi.EditAutoPoolInput;
import com.sanlly.production.models.input.edi.EditAutoSendInput;
import com.sanlly.production.models.input.edi.EditEdiConfigInput;
import com.sanlly.production.models.input.edi.EditEdiPoolInput;
import com.sanlly.production.models.input.edi.GenerateEvaluationNoInput;
import com.sanlly.production.models.input.edi.ImportEdiPoolInput;
import com.sanlly.production.models.input.edi.SendEdiInput;
import com.sanlly.production.models.output.edi.AddEdiResponseOutput;
import com.sanlly.production.models.output.edi.AutoIntoPoolDetailOutput;
import com.sanlly.production.models.output.edi.AutoIntoPoolOutput;
import com.sanlly.production.models.output.edi.AutoSendDetailOutput;
import com.sanlly.production.models.output.edi.AutoSendOutput;
import com.sanlly.production.models.output.edi.CompanyCodeOutput;
import com.sanlly.production.models.output.edi.CompanyContainerUserOutput;
import com.sanlly.production.models.output.edi.CompanyEdiConfigOutput;
import com.sanlly.production.models.output.edi.EdiEditInfoOutput;
import com.sanlly.production.models.output.edi.EdiFileDetailOutput;
import com.sanlly.production.models.output.edi.EdiPoolOutput;
import com.sanlly.production.models.output.edi.EditCompanyEdiOutput;
import com.sanlly.production.models.output.edi.ExportEdiOutput;
import com.sanlly.production.models.output.pti.AddEdiPoolOutput;

/**
 * edi接口
 * @author RexSheng
 * 2019年10月14日 下午1:33:23
 */
public interface EdiService {

	/**
	 * edi池列表查询
	 * @param input
	 * @return
	 */
	PagedList<EdiPoolOutput> getEdiPoolList(EdiPoolSearchInput input);
	
	/**
	 * edi池新增数据列表查询
	 * @param input
	 * @return
	 */
	List<AddEdiResponseOutput> addEdiPoolSearchList(AddEdiSearchInput input) throws Exception;
	
	/**
	 * edi池导入数据
	 * @param input
	 * @return
	 */
	List<AddEdiResponseOutput> importEdiPool(ImportEdiPoolInput input);
	
	/**
	 * edi池新增
	 * @param input
	 */
	AddEdiPoolOutput addPool(AddEdiPoolInput input);
	
	/**
	 * 校验估价单号格式
	 * @param format
	 * @return
	 */
	Boolean validateEvaluationFormat(String format);
	
	/**
	 * 重新生成估价单号
	 * @param input
	 */
	void reGenerateEvaluationNo(GenerateEvaluationNoInput input);
	
	/**
	 * edi池撤销数据
	 * @param input
	 */
	void deletePool(GenerateEvaluationNoInput input);
	
	/**
	 * edi池导出数据
	 * @param input
	 * @return 
	 * @throws Exception 
	 */
	ExportEdiOutput exportPool(GenerateEvaluationNoInput input) throws Exception;
	
	/**
	 * edi池发送
	 * @param input
	 * @return 
	 * @throws Exception 
	 */
	AddEdiPoolOutput sendPool(SendEdiInput input) throws Exception;
	
	/**
	 * 获取单条edi池数据
	 * @param input
	 */
	EdiEditInfoOutput getPoolInfo(Integer poolId);
	
	/**
	 * 修改edi池数据
	 * @param input
	 */
	void editPool(EditEdiPoolInput input);
	
	/**
	 * 客户edi类型配置查询
	 * @param input
	 * @return
	 */
	PagedList<CompanyEdiConfigOutput> getCompanyEdiList(CompanyEdiSearchInput input);
	
	/**
	 * 获取edi配置信息
	 * @param configId
	 * @return
	 */
	EditCompanyEdiOutput getCompanyEdiInfo(Integer configId);
	
	/**
	 * 修改edi配置信息
	 * @param input
	 */
	void updateCompanyEdiInfo(EditEdiConfigInput input);
	
	/**
	 *  新增edi配置信息
	 * @param input
	 */
	void addCompanyEdiInfo(EditEdiConfigInput input);
	
	/**
	 *  删除edi配置信息
	 * @param ids
	 */
	void deleteCompanyEdiInfo(Integer[] ids);
	
	/**
	 * 获取所有EDI文件格式名
	 * @return
	 */
	List<SelectOutput> getAllFileFormat();
	
	/**
	 * 获取所有EXCEL模板
	 * @return
	 */
	List<String> getAllExcelTemplates();
	
	/**
	 * 根据公司，用箱人获取对应的edi类型
	 * @param input
	 * @return
	 */
	List<String> getAllEdiConfigByContainerUser(EdiTypeContainerUserInput input);
	
	/**
	 * edi自动报价配置，查询列表
	 * @param input
	 * @return
	 */
	PagedList<AutoSendOutput> getAutoSendList(AutoSendSearchInput input);
	
	/**
	 * 新增自动报价配置
	 * @param input
	 */
	void addAutoSendConfig(AddAutoSendInput input);
	
	/**
	 * 获取自动报价配置
	 * @param id
	 * @return
	 */
	AutoSendDetailOutput getAutoSendConfig(Integer id);
	
	/**
	 * 修改自动报价配置
	 * @param input
	 */
	void updateAutoSendConfig(EditAutoSendInput input);
	
	/**
	 * 删除自动报价配置
	 * @param id
	 */
	void deleteAutoSendConfig(Integer[] ids);
	
	/**
	 * 自动进入edi池配置查询列表
	 * @param input
	 * @return
	 */
	PagedList<AutoIntoPoolOutput> getAutoPoolList(AutoIntoPoolSearchInput input);
	
	/**
	 * 自动进入edi池详细信息
	 * @param input
	 * @return
	 */
	AutoIntoPoolDetailOutput getAutoPoolDetail(Integer id);
	
	/**
	 * 新增自动进入edi池配置
	 * @param input
	 */
	void addAutoPoolConfig(AddAutoPoolInput input);
	
	/**
	 * 修改自动进入edi池配置
	 * @param input
	 */
	void updateAutoPoolConfig(EditAutoPoolInput input);
	
	/**
	 * 删除自动进入edi池配置
	 * @param id
	 */
	void deleteAutoPoolConfig(Integer[] ids);
	
	/**
	 * EDI文件格式列表
	 * @param input
	 * @return
	 */
	PagedList<EdiFileDetailOutput> getFileFormatPagedList(EdiFileSearchInput input);
	
	/**
	 * 新增EDI文件格式
	 * @param input
	 * @return
	 */
	void addFileFormat(EdiFileDetailOutput input);
	
	/**
	 * 修改EDI文件格式
	 * @param input
	 * @return
	 */
	void updateFileFormat(EdiFileDetailOutput input);
	
	/**
	 * 删除EDI文件格式
	 * @param input
	 * @return
	 */
	void deleteFileFormat(Integer[] ids);
	
	/**
	 * 获取EDI文件格式
	 * @param input
	 * @return
	 */
	EdiFileDetailOutput getFileFormat(Integer id);
	
	/**
	 * 公司-用箱人 接收地址配置搜索条件
	 * @param input
	 * @return
	 */
	PagedList<CompanyContainerUserOutput> getCompanyContainerUserPagedList(CompanyContainerUserSearchInput input);
	
	/**
	 * 获取公司-用箱人 接收地址配置
	 * @param id
	 * @return
	 */
	CompanyContainerUserOutput getCompanyContainerUser(Integer id);
	
	/**
	 * 新增公司-用箱人 接收地址配置
	 * @param input
	 */
	void addCompanyContainerUser(CompanyContainerUserOutput input);
	
	/**
	 * 修改公司-用箱人 接收地址配置
	 * @param input
	 */
	void updateCompanyContainerUser(CompanyContainerUserOutput input);
	
	/**
	 * 删除公司-用箱人 接收地址配置
	 * @param ids
	 */
	void deleteCompanyContainerUser(Integer[] ids);
	
	/**
	 * 公司与代码对应搜索列表
	 * @param input
	 * @return
	 */
	PagedList<CompanyCodeOutput> getCompanyCodePagedList(CompanyCodeSearchInput input);
	
	/**
	 * 获取公司与代码对应
	 * @param id
	 * @return
	 */
	CompanyCodeOutput getCompanyCode(Integer id);
	
	/**
	 * 新增公司与代码对应
	 * @param input
	 */
	void addCompanyCode(CompanyCodeOutput input);
	
	/**
	 * 修改公司与代码对应
	 * @param input
	 */
	void updateCompanyCode(CompanyCodeOutput input);
	
	/**
	 * 删除公司与代码对应
	 * @param ids
	 */
	void deleteCompanyCode(Integer[] ids);
}
