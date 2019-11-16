package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
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
import com.sanlly.production.models.output.edi.CompanyCodeOutput;
import com.sanlly.production.models.output.edi.CompanyContainerUserOutput;
import com.sanlly.production.models.output.edi.EdiFileDetailOutput;
import com.sanlly.production.service.EdiService;

/**
 * edi控制器
 * @author RexSheng
 * 2019年10月15日 下午3:49:55
 */
@RestController
public class EdiController {

	@Autowired
	private EdiService ediService;
	
	/**
	 * 获取EDI池列表
	 * @param ediType
	 * @param containerNo
	 * @param evaluationNo
	 * @param isSend
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/edi/pool")
	public Result getPoolList(
			@RequestParam(value="ediType",required = false) String[] ediType,
			@RequestParam(value="containerNo",required = false) String containerNo,
			@RequestParam(value="evaluationNo",required = false) String evaluationNo,
			@RequestParam(value="yard",required = false) String yard,
			@RequestParam(value="containerUser",required = false) String containerUser,
			@RequestParam(value="containerOwner",required = false) String containerOwner,
			@RequestParam(value="containerCategory",required = false) String containerCategory,
			@RequestParam(value="isSend",required = false) Boolean isSend,
			@RequestParam(value="index",required = true) Integer index,
			@RequestParam(value="size",required = true) Integer size
		) {
		EdiPoolSearchInput input=new EdiPoolSearchInput();
		input.setEdiType(ediType);
		input.setContainerNo(containerNo);
		input.setEvaluationNo(evaluationNo);
		input.setYard(yard);
		input.setContainerUser(containerUser);
		input.setContainerOwner(containerOwner);
		input.setContainerCategory(containerCategory);
		input.setIsSend(isSend);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(ediService.getEdiPoolList(input));
	}
	
	/**
	 * edi配置列表
	 * @param company
	 * @param containerUser
	 * @param containerCategory
	 * @param ediType
	 * @param isEnabled
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/edi/config")
	public Result getCompanyConfigList(
			@RequestParam(value="company",required=false) String company,
			@RequestParam(value="containerUser",required=false) String containerUser,
			@RequestParam(value="containerCategory",required=false) String containerCategory,
			@RequestParam(value="ediType",required=false) String ediType,
			@RequestParam(value="isEnabled",required=false) String isEnabled,
			@RequestParam(value="index",required=true) Integer index,
			@RequestParam(value="size",required=true) Integer size
			) {
		CompanyEdiSearchInput input=new CompanyEdiSearchInput();
		input.setCompany(company);
		input.setContainerUser(containerUser);
		input.setContainerCategory(containerCategory);
		input.setEdiType(ediType);
		input.setIsEnabled(isEnabled);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(ediService.getCompanyEdiList(input));
	}
	
	/**
	 * 获取edi配置
	 * @param configId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/edi/config/{id}")
	public Result getCompanyConfig(@PathVariable(value = "id") Integer configId) {
		return Result.Success(ediService.getCompanyEdiInfo(configId));
	}
	
	/**
	 * 新增edi配置
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/edi/config")
	public Result addCompanyConfig(@RequestBody EditEdiConfigInput input) {
		ediService.addCompanyEdiInfo(input);
		return Result.Success();
	}
	
	/**
	 * 修改edi配置
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/edi/config")
	public Result editCompanyConfig(@RequestBody EditEdiConfigInput input) {
		ediService.updateCompanyEdiInfo(input);
		return Result.Success();
	}
	
	/**
	 * 删除edi配置
	 * @param ids
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/edi/config")
	public Result delCompanyConfig(@RequestParam(value="ids") Integer[] ids) {
		ediService.deleteCompanyEdiInfo(ids);
		return Result.Success();
	}
	
	/**
	 * 获取所有edi文件格式
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/edi/files")
	public Result getAllFileFormat() {
		return Result.Success(ediService.getAllFileFormat());
	}
	
	/**
	 * 获取所有Excel模板
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/edi/templates")
	public Result getAllTemplates() {
		return Result.Success(ediService.getAllExcelTemplates());
	}
	
	/**
	 * edi池新增弹框显示进场列表
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/edi/pool/add")
	public Result getAddEdiPoolList(@RequestParam(value="yard",required = false) String[] yard,
			@RequestParam(value="containerNo",required = false) String containerNo,
			@RequestParam(value="containerUser",required = false) String containerUser,
			@RequestParam(value="containerOwner",required = false) String containerOwner,
			@RequestParam(value="containerCategory",required = false) String containerCategory,
			@RequestParam(value="beginCourseTime",required = false) String beginCourseTime,
			@RequestParam(value="endCourseTime",required = false) String endCourseTime,
			@RequestParam(value="beginAuditTime",required = false) String beginAuditTime,
			@RequestParam(value="endAuditTime",required = false) String endAuditTime,
			@RequestParam(value="beginFinishTime",required = false) String beginFinishTime,
			@RequestParam(value="endFinishTime",required = false) String endFinishTime,
			@RequestParam(value="importContainerNo",required = false) String[] importContainerNo) throws Exception {
		AddEdiSearchInput input=new AddEdiSearchInput();
		input.setYard(yard);
		input.setContainerNo(containerNo);
		input.setContainerUser(containerUser);
		input.setContainerOwner(containerOwner);
		input.setContainerCategory(containerCategory);
		input.setBeginCourseTime(beginCourseTime);
		input.setEndCourseTime(endCourseTime);
		input.setBeginAuditTime(beginAuditTime);
		input.setEndAuditTime(endAuditTime);
		input.setBeginFinishTime(beginFinishTime);
		input.setEndFinishTime(endFinishTime);
		input.setImportContainerNo(importContainerNo);
		return Result.Success(ediService.addEdiPoolSearchList(input));
	}
	
	/**
	 * edi池新增
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/edi/pool/add")
	public Result addEdiPool(@RequestBody AddEdiPoolInput input) {
		return Result.Success(ediService.addPool(input));
	}
	
	/**
	 * 重新生成估价单号
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/edi/pool/generate")
	public Result updateEvaluationNo(@RequestBody GenerateEvaluationNoInput input) {
		ediService.reGenerateEvaluationNo(input);
		return Result.Success();
	}
	
	/**
	 * 获取单条edi池数据
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/edi/pool/{id}")
	public Result getEdiPoolInfo(@PathVariable(value="id") Integer poolId) {
		return Result.Success(ediService.getPoolInfo(poolId));
	}
	
	/**
	 * 修改提交单条edi池数据
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/edi/pool")
	public Result updateEdiPoolInfo(@RequestBody EditEdiPoolInput input ) {
		ediService.editPool(input);
		return Result.Success();
	}
	
	/**
	 * 删除edi池数据
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/edi/pool")
	public Result deleteEdiPoolInfo(@RequestBody GenerateEvaluationNoInput input ) {
		ediService.deletePool(input);
		return Result.Success();
	}
	
	/**
	 * 导入edi池数据
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/edi/pool/import")
	public Result importEdiPool(@RequestBody ImportEdiPoolInput input ) {
		return Result.Success(ediService.importEdiPool(input));
	}
	
	/**
	 * 导入edi池数据
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/edi/config/containerUser")
	public Result ediPoolContainerUser(@RequestParam(value="company") String company,@RequestParam(value="containerUser") String containerUser) {
		EdiTypeContainerUserInput input =new EdiTypeContainerUserInput();
		input.setCompany(company);
		input.setContainerUser(containerUser);
		return Result.Success(ediService.getAllEdiConfigByContainerUser(input));
	}
	
	/**
	 * 导出edi池数据
	 * @param input
	 * @throws Exception 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/edi/pool/export")
	public Result exportEdiPool(@RequestBody GenerateEvaluationNoInput input) throws Exception {
		return Result.Success(ediService.exportPool(input));
	}
	
	/**
	 * EDI池发送报价
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/edi/pool/send")
	public Result sendEdi(@RequestBody SendEdiInput input) throws Exception {
		return Result.Success(ediService.sendPool(input));
	}
	
	/**
	 * 自动发送报价配置列表
	 * @param company
	 * @param containerUser
	 * @param containerCategory
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/edi/pool/auto")
	public Result autoSendList(@RequestParam(value="company",required = false) String company,
			@RequestParam(value="containerUser",required = false) String containerUser,
			@RequestParam(value="containerCategory",required = false) String containerCategory,
			@RequestParam(value="index",required = true) Integer index,
			@RequestParam(value="size",required = true) Integer size) {
		AutoSendSearchInput input=new AutoSendSearchInput();
		input.setCompany(company);
		input.setContainerCategory(containerCategory);
		input.setContainerUser(containerUser);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(ediService.getAutoSendList(input));
		
	}
	
	/**
	 * 获取单个发送报价配置
	 * @param company
	 * @param containerUser
	 * @param containerCategory
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/edi/pool/auto/{id}")
	public Result autoSendInfo(@PathVariable("id") Integer id) {
		return Result.Success(ediService.getAutoSendConfig(id));
	}
	
	/**
	 * 修改单个发送报价配置
	 * @param company
	 * @param containerUser
	 * @param containerCategory
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/edi/pool/auto")
	public Result updateAutoSend(@RequestBody EditAutoSendInput input) {
		ediService.updateAutoSendConfig(input);
		return Result.Success();
	}
	
	/**
	 * 新增发送报价配置
	 * @param company
	 * @param containerUser
	 * @param containerCategory
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/edi/pool/auto")
	public Result addAutoSend(@RequestBody AddAutoSendInput input) {
		ediService.addAutoSendConfig(input);
		return Result.Success();
	}
	
	/**
	 * 删除发送报价配置
	 * @param company
	 * @param containerUser
	 * @param containerCategory
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/edi/pool/auto")
	public Result delAutoSend(@RequestParam("ids") Integer[] ids) {
		ediService.deleteAutoSendConfig(ids);
		return Result.Success();
	}
	
	/**
	 * 自动进入EDI池配置列表
	 * @param company
	 * @param containerUser
	 * @param containerCategory
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/edi/pool/into")
	public Result autoIntoList(@RequestParam(value="company",required = false) String company,
			@RequestParam(value="containerUser",required = false) String containerUser,
			@RequestParam(value="containerCategory",required = false) String containerCategory,
			@RequestParam(value="index",required = true) Integer index,
			@RequestParam(value="size",required = true) Integer size) {
		AutoIntoPoolSearchInput input=new AutoIntoPoolSearchInput();
		input.setCompany(company);
		input.setContainerCategory(containerCategory);
		input.setContainerUser(containerUser);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(ediService.getAutoPoolList(input));
	}
	
	/**
	 * 获取单个自动进入EDI池配置
	 * @param company
	 * @param containerUser
	 * @param containerCategory
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/edi/pool/into/{id}")
	public Result autoIntoInfo(@PathVariable("id") Integer id) {
		return Result.Success(ediService.getAutoPoolDetail(id));
	}
	
	/**
	 * 修改单个自动进入EDI池配置
	 * @param company
	 * @param containerUser
	 * @param containerCategory
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/edi/pool/into")
	public Result updateIntoSend(@RequestBody EditAutoPoolInput input) {
		ediService.updateAutoPoolConfig(input);
		return Result.Success();
	}
	
	/**
	 * 新增自动进入EDI池配置
	 * @param company
	 * @param containerUser
	 * @param containerCategory
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/edi/pool/into")
	public Result addIntoSend(@RequestBody AddAutoPoolInput input) {
		ediService.addAutoPoolConfig(input);
		return Result.Success();
	}
	
	/**
	 * 删除自动进入EDI池配置
	 * @param company
	 * @param containerUser
	 * @param containerCategory
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/edi/pool/into")
	public Result delIntoSend(@RequestParam("ids") Integer[] ids) {
		ediService.deleteAutoPoolConfig(ids);
		return Result.Success();
	}
	
	/**
	 * EDI文件格式列表
	 * @param company
	 * @param containerUser
	 * @param containerCategory
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/edi/file/template")
	public Result fileList(@RequestParam(value="keyword",required = false) String keyword,
			@RequestParam(value="index",required = true) Integer index,
			@RequestParam(value="size",required = true) Integer size) {
		EdiFileSearchInput input=new EdiFileSearchInput();
		input.setKeyword(keyword);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(ediService.getFileFormatPagedList(input));
	}
	
	/**
	 *  获取EDI文件格式
	 * @param company
	 * @param containerUser
	 * @param containerCategory
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/edi/file/template/{id}")
	public Result getFile(@PathVariable("id") Integer id) {
		return Result.Success(ediService.getFileFormat(id));
	}
	
	/**
	 * 新增EDI文件格式
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/edi/file/template")
	public Result addFile(@RequestBody EdiFileDetailOutput input) {
		ediService.addFileFormat(input);
		return Result.Success();
	}
	
	
	/**
	 * 修改EDI文件格式
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/edi/file/template")
	public Result editFile(@RequestBody EdiFileDetailOutput input) {
		ediService.updateFileFormat(input);
		return Result.Success();
	}
	
	/**
	 *  删除EDI文件格式 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/edi/file/template")
	public Result delFile(@RequestParam("ids") Integer[] ids) {
		ediService.deleteFileFormat(ids);
		return Result.Success();
	}
	
	/**
	 * EDI公司-客户列表
	 * @param company
	 * @param containerUser
	 * @param containerCategory
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/edi/company/containerUser")
	public Result companyContainerUserList(@RequestParam(value="company",required = false) String company,
			@RequestParam(value="containerUser",required = false) String containerUser,
			@RequestParam(value="index",required = true) Integer index,
			@RequestParam(value="size",required = true) Integer size) {
		CompanyContainerUserSearchInput input=new CompanyContainerUserSearchInput();
		input.setCompany(company);
		input.setContainerUser(containerUser);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(ediService.getCompanyContainerUserPagedList(input));
	}
	
	/**
	 *  获取EDI公司-客户
	 * @param company
	 * @param containerUser
	 * @param containerCategory
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/edi/company/containerUser/{id}")
	public Result getCompanyContainerUser(@PathVariable("id") Integer id) {
		return Result.Success(ediService.getCompanyContainerUser(id));
	}
	
	/**
	 * 新增EDI公司-客户
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/edi/company/containerUser")
	public Result addCompanyContainerUser(@RequestBody CompanyContainerUserOutput input) {
		ediService.addCompanyContainerUser(input);
		return Result.Success();
	}
	
	/**
	 * 修改EDI公司-客户
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/edi/company/containerUser")
	public Result editCompanyContainerUser(@RequestBody CompanyContainerUserOutput input) {
		ediService.updateCompanyContainerUser(input);
		return Result.Success();
	}
	
	/**
	 *  删除EDI公司-客户
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/edi/company/containerUser")
	public Result delCompanyContainerUser(@RequestParam("ids") Integer[] ids) {
		ediService.deleteCompanyContainerUser(ids);
		return Result.Success();
	}
	
	/**
	 * EDI公司与代码对应列表
	 * @param company
	 * @param yard
	 * @param containerUser
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/edi/company/code")
	public Result companyCodeList(@RequestParam(value="company",required = false) String company,
			@RequestParam(value="yard",required = false) String yard,
			@RequestParam(value="containerUser",required = false) String containerUser,
			@RequestParam(value="index",required = true) Integer index,
			@RequestParam(value="size",required = true) Integer size) {
		CompanyCodeSearchInput input=new CompanyCodeSearchInput();
		input.setCompany(company);
		input.setContainerUser(containerUser);
		input.setYard(yard);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(ediService.getCompanyCodePagedList(input));
	}
	
	/**
	 *  获取EDI公司与代码对应
	 * @param company
	 * @param containerUser
	 * @param containerCategory
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/edi/company/code/{id}")
	public Result getCompanyCode(@PathVariable("id") Integer id) {
		return Result.Success(ediService.getCompanyCode(id));
	}
	
	/**
	 * 新增EDI公司与代码对应
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/edi/company/code")
	public Result addCompanyCode(@RequestBody CompanyCodeOutput input) {
		ediService.addCompanyCode(input);
		return Result.Success();
	}
	
	/**
	 * 修改EDI公司与代码对应
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/edi/company/code")
	public Result editCompanyCode(@RequestBody CompanyCodeOutput input) {
		ediService.updateCompanyCode(input);
		return Result.Success();
	}
	
	/**
	 *  删除EDI公司与代码对应
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/edi/company/code")
	public Result delCompanyCode(@RequestParam("ids") Integer[] ids) {
		ediService.deleteCompanyCode(ids);
		return Result.Success();
	}
}
