package com.sanlly.warehouse.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.StockoutEnum;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.warehouse.constants.WarehouseConstants;
import com.sanlly.warehouse.dao.WareToolApplyDetailMapper;
import com.sanlly.warehouse.dao.WareToolApplyMapper;
import com.sanlly.warehouse.dao.WareToolManageExtMapper;
import com.sanlly.warehouse.dao.WareToolManageMapper;
import com.sanlly.warehouse.entity.WareToolApply;
import com.sanlly.warehouse.entity.WareToolApplyDetail;
import com.sanlly.warehouse.entity.WareToolApplyDetailExample;
import com.sanlly.warehouse.entity.WareToolApplyExample;
import com.sanlly.warehouse.entity.WareToolApplyExample.Criteria;
import com.sanlly.warehouse.entity.WareToolExtManage;
import com.sanlly.warehouse.entity.WareToolManage;
import com.sanlly.warehouse.enums.ToolApplyAuditEnum;
import com.sanlly.warehouse.enums.ToolApplyTypeEnum;
import com.sanlly.warehouse.enums.ToolDistributeStatusEnum;
import com.sanlly.warehouse.enums.ToolStatusEnum;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutDetailInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutInput;
import com.sanlly.warehouse.models.input.tool.SearchToolInput;
import com.sanlly.warehouse.models.input.tool.ToolDetailInput;
import com.sanlly.warehouse.models.input.tool.ToolInput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsBriefOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutOutput;
import com.sanlly.warehouse.models.output.tool.ToolDetailOutput;
import com.sanlly.warehouse.models.output.tool.ToolOutput;
import com.sanlly.warehouse.service.BillTypeService;
import com.sanlly.warehouse.service.ToolService;
import com.sanlly.warehouse.service.WareSparePartsService;
import com.sanlly.warehouse.service.WareStockService;
import com.sanlly.warehouse.service.WareStockoutService;

import javax.xml.crypto.Data;

/**
 * 工具服务实现类
 * 
 * @author lishzh
 *
 */
@Service
public class ToolServiceImpl extends BaseServiceImpl implements ToolService {

	@Autowired
	WareToolApplyMapper toolApplyDao;

	@Autowired
	WareToolApplyDetailMapper toolApplyDetailDao;

	@Autowired
	BillTypeService billTypeService;

	@Autowired
	WareSparePartsService sparePartsService;

	@Autowired
	WareStockoutService stockoutService;

	@Autowired
	WareToolManageMapper toolManageDao;

	@Autowired
	WareToolManageExtMapper toolManageExtDao;

	@Autowired
	private WareStockService stockService;

	/**
	 * 添加工具申请
	 */
	@Override
	@Transactional
	public void addToolApply(ToolInput input) {
		// 保存申请单
		WareToolApply toolApply = new WareToolApply();
		BeanUtils.copyProperties(input, toolApply);
		// 生成工具申请单号
		String billNumber = billTypeService.getBillNumber(WarehouseConstants.BILL_TOOL_APPLY);
		if (StringUtils.isEmpty(billNumber)) {
			throw new SqlException("insertFail");
		}
		toolApply.setToolApplyNo(billNumber);
		// 获取单据类型
		String billType = billTypeService.getBillTypeKeyByName(WarehouseConstants.BILL_TOOL_APPLY);
		if (StringUtils.isEmpty(billType)) {
			throw new SqlException("insertFail");
		}
		toolApply.setBillType(billType);
		// 未提交
		toolApply.setAuditStatus(ToolApplyAuditEnum.NOT_COMMIT.getCode());
		// 未出库
		toolApply.setStockoutStatus(StockoutEnum.NOTOUT.getCode());
		// 申请人
		Integer currentUserId = getCurrentUserId();
		if (currentUserId == null) {
			throw new SqlException("insertFail");
		}
		toolApply.setApplyUser(currentUserId);
		// 所属公司
		toolApply.setCpmpany(getCurrentCompanyKey());
		// 所属场站
		toolApply.setYard(getCurrentYardKey());
		// 未删除
		toolApply.setIsDel(PlatformConstants.ISDEL_NO);
		// 创建人
		toolApply.setCreateUser(currentUserId);
		// 创建时间
		Date date = new Date();
		toolApply.setCreateTime(date);
		// 申请时间
		toolApply.setApplyDate(date);
		toolApplyDao.insertSelective(toolApply);

		// 保存申请工具明细
		for (ToolDetailInput detailInput : input.getDetails()) {
			WareToolApplyDetail applyDetail = new WareToolApplyDetail();
			BeanUtils.copyProperties(detailInput, applyDetail);
			// 申请主表id
			applyDetail.setWareToolApplyId(toolApply.getWareToolApplyId());
			// 责任人
			// applyDetail.setLiablePerson(currentUserId);
			// 使用部门
			applyDetail.setUseDepartments(toolApply.getApplyDepartment());
			// 未出库
			applyDetail.setStockoutStatus(StockoutEnum.NOTOUT.getCode());
			// 已出库数量
			applyDetail.setOutedNum(WarehouseConstants.DOUBLE_ZERO);
			// 未派发
			applyDetail.setDistributeStatus(ToolDistributeStatusEnum.NOT_DISTRIBUTE.getCode());
			// 创建人
			applyDetail.setCreateUser(currentUserId);
			// 创建时间
			applyDetail.setCreateTime(date);
			// 未删除
			applyDetail.setIsDel(PlatformConstants.ISDEL_NO);
			toolApplyDetailDao.insertSelective(applyDetail);
		}
	}

	/**
	 * 根据申请单id获取工具申请单
	 */
	@Override
	public ToolOutput getToolApplyById(Integer id) {
		WareToolApply toolApply = toolApplyDao.selectByPrimaryKey(id);
		// copy申请单主表
		ToolOutput output = new ToolOutput();
		output.setWareToolApplyId(toolApply.getWareToolApplyId());
		output.setToolApplyNo(toolApply.getToolApplyNo());
		output.setApplyType(toolApply.getApplyType());
		output.setApplyTypeLangLang(toolApply.getApplyType());
		output.setApplyDate(toolApply.getApplyDate());
		output.setAuditStatus(toolApply.getAuditStatus());
		output.setAuditStatusLangLang(toolApply.getAuditStatus());
		output.setRemark(toolApply.getRemark());
		// 申请人
		output.setApplyUser(toolApply.getApplyUser());
		// 获取申请人姓名
		output.setUserName(getUserNameByUserId(toolApply.getApplyUser()));
		// 查询出库状态
		output.setStockoutStatus(toolApply.getStockoutStatus());
		output.setStockoutStatusLangLang(toolApply.getStockoutStatus());

		// 查询明细
		WareToolApplyDetailExample detailExample = new WareToolApplyDetailExample();
		detailExample.createCriteria().andWareToolApplyIdEqualTo(toolApply.getWareToolApplyId());
		List<WareToolApplyDetail> details = toolApplyDetailDao.selectByExample(detailExample);
		List<ToolDetailOutput> detailOutputs = new ArrayList<>();
		for (WareToolApplyDetail applyDetail : details) {
			ToolDetailOutput detailOutput = new ToolDetailOutput();
			// 查询备件号
			EditSparePartsInput editSparePartsInput = new EditSparePartsInput();
			editSparePartsInput.setKey(applyDetail.getSpareParts());
			SparePartsBriefOutput spareParts = sparePartsService.getSparePartsBrief(editSparePartsInput);
			String sparePartsNo = "";
			// NPE
			if (spareParts != null) {
				sparePartsNo = spareParts.getSparePartsNo();
			}
			detailOutput.setSparePartsNo(sparePartsNo);
			detailOutput.setSpareParts(applyDetail.getSpareParts());
			detailOutput.setSparePartsLangLang(applyDetail.getSpareParts());

			detailOutput.setUseType(applyDetail.getUseType());
			detailOutput.setUseTypeLangLang(applyDetail.getUseType());
			detailOutput.setSparePartsNum(applyDetail.getSparePartsNum());
			// 出库状态
			detailOutput.setStockoutStatus(applyDetail.getStockoutStatus());
			detailOutput.setStockoutStatusLangLang(applyDetail.getStockoutStatus());

			// 若为报废申请 获取工具信息
			if (ToolApplyTypeEnum.SCRAP.getCode().equals(toolApply.getApplyType())) {
				WareToolManage toolManage = toolManageDao.selectByPrimaryKey(applyDetail.getWareToolManageId());
				detailOutput.setWareToolManageId(toolManage.getWareToolManageId());
				detailOutput.setNum(toolManage.getNum());// 现有数量
				// 查询使用人姓名(NPE)
				String useUser = "";
				Result<UserInfoOutput> useUserResult = authService.getUserInfo(toolManage.getUseUser());
				if (useUserResult != null && useUserResult.getData() != null
						&& useUserResult.getData().getUserName() != null) {
					useUser = useUserResult.getData().getUserName();
				}
				detailOutput.setUseUser(useUser);
				detailOutput.setUseDepartment(toolManage.getDepartment());// 使用部门
				detailOutput.setScrapNum(applyDetail.getScrapNum());
			} else {
				// 使用人
				detailOutput.setUserId(applyDetail.getUserId());
				detailOutput.setUseUser(getUserNameByUserId(applyDetail.getUserId()));
			}

			detailOutputs.add(detailOutput);
		}
		output.setDetails(detailOutputs);

		return output;
	}

	/**
	 * 查询detail output by toolApplyId
	 *
	 * @author lishzh
	 * @param toolApplyId
	 * @return
	 */
	List<ToolDetailOutput> getDetailOutputById(Integer toolApplyId) {
		// 查询明细
		WareToolApplyDetailExample detailExample = new WareToolApplyDetailExample();
		detailExample.createCriteria().andWareToolApplyIdEqualTo(toolApplyId);
		List<WareToolApplyDetail> details = toolApplyDetailDao.selectByExample(detailExample);
		List<ToolDetailOutput> detailOutputs = new ArrayList<>();
		for (WareToolApplyDetail applyDetail : details) {
			ToolDetailOutput detailOutput = new ToolDetailOutput();
			// 查询备件号
			EditSparePartsInput editSparePartsInput = new EditSparePartsInput();
			editSparePartsInput.setKey(applyDetail.getSpareParts());
			SparePartsBriefOutput spareParts = sparePartsService.getSparePartsBrief(editSparePartsInput);
			String sparePartsNo = "";
			// NPE
			if (spareParts != null) {
				sparePartsNo = spareParts.getSparePartsNo();
			}
			detailOutput.setSparePartsNo(sparePartsNo);
			detailOutput.setSpareParts(applyDetail.getSpareParts());
			detailOutput.setSparePartsLangLang(applyDetail.getSpareParts());

			detailOutput.setUseType(applyDetail.getUseType());
			detailOutput.setUseTypeLangLang(applyDetail.getUseType());
			detailOutput.setSparePartsNum(applyDetail.getSparePartsNum());
			// 出库状态
			detailOutput.setStockoutStatus(applyDetail.getStockoutStatus());
			detailOutput.setStockoutStatusLangLang(applyDetail.getStockoutStatus());

			// 使用人
			detailOutput.setUserId(applyDetail.getUserId());
			// 查询使用人姓名(NPE)
			String useUser = "";
			Result<UserInfoOutput> useUserResult = authService.getUserInfo(applyDetail.getUserId());
			if (useUserResult != null && useUserResult.getData() != null
					&& useUserResult.getData().getUserName() != null) {
				useUser = useUserResult.getData().getUserName();
			}
			detailOutput.setUseUser(useUser);

			detailOutputs.add(detailOutput);
		}

		return detailOutputs;
	}

	/**
	 * 修改工具申请单
	 */
	@Override
	@Transactional
	public void editToolApply(ToolInput input) {
		// 查询所要修改的申请单
		WareToolApply toolApply = toolApplyDao.selectByPrimaryKey(input.getWareToolApplyId());
		// 只有未提交和部门驳回的才能修改
		if (ToolApplyAuditEnum.NOT_COMMIT.getCode().equals(toolApply.getAuditStatus())
				|| ToolApplyAuditEnum.DEPARTMENT_REJECTED.getCode().equals(toolApply.getAuditStatus())) {
			BeanUtils.copyProperties(input, toolApply);
			// 修改后更新状态为未提交
			toolApply.setAuditStatus(ToolApplyAuditEnum.NOT_COMMIT.getCode());
			// 修改时间
			Date date = new Date();
			toolApply.setUpdateTime(date);
			// 修改人
			Integer currentUserId = getCurrentUserId();
			toolApply.setUpdateUser(currentUserId);
			toolApplyDao.updateByPrimaryKeySelective(toolApply);

			// 删除原申请明细
			WareToolApplyDetailExample example = new WareToolApplyDetailExample();
			example.createCriteria().andWareToolApplyIdEqualTo(input.getWareToolApplyId());
			toolApplyDetailDao.deleteByExample(example);

			// 保存新申请工具明细
			for (ToolDetailInput detailInput : input.getDetails()) {
				WareToolApplyDetail applyDetail = new WareToolApplyDetail();
				BeanUtils.copyProperties(detailInput, applyDetail);
				// 申请主表id
				applyDetail.setWareToolApplyId(toolApply.getWareToolApplyId());
				// 责任人
				// applyDetail.setLiablePerson(currentUserId);
				// 使用部门
				applyDetail.setUseDepartments(toolApply.getApplyDepartment());
				// 未出库
				applyDetail.setStockoutStatus(StockoutEnum.NOTOUT.getCode());
				// 已出库数量
				applyDetail.setOutedNum(WarehouseConstants.DOUBLE_ZERO);
				// 未派发
				applyDetail.setDistributeStatus(ToolDistributeStatusEnum.NOT_DISTRIBUTE.getCode());
				// 创建人
				applyDetail.setCreateUser(currentUserId);
				// 创建时间
				applyDetail.setCreateTime(toolApply.getCreateTime());
				// 修改人
				applyDetail.setUpdateUser(currentUserId);
				// 修改时间
				applyDetail.setUpdateTime(date);
				// 未删除
				applyDetail.setIsDel(PlatformConstants.ISDEL_NO);
				toolApplyDetailDao.insertSelective(applyDetail);
			}
		} else {
			throw new SqlException("updateFail");
		}

	}

	/**
	 * 删除工具申请单
	 */
	@Override
	@Transactional
	public void deleteToolApply(List<Integer> ids) {
		ids.stream().forEach(id -> {
			// 获取原审核状态
			WareToolApply toolApply = toolApplyDao.selectByPrimaryKey(id);
			// 只有未提交和部门驳回才能删除
			if (ToolApplyAuditEnum.NOT_COMMIT.getCode().equals(toolApply.getAuditStatus())
					|| ToolApplyAuditEnum.DEPARTMENT_REJECTED.getCode().equals(toolApply.getAuditStatus())) {
				toolApply.setIsDel(PlatformConstants.ISDEL_YES);
				// 标记删除
				toolApplyDao.updateByPrimaryKeySelective(toolApply);

				// 删除明细
				WareToolApplyDetailExample example = new WareToolApplyDetailExample();
				example.createCriteria().andWareToolApplyIdEqualTo(id);
				List<WareToolApplyDetail> details = toolApplyDetailDao.selectByExample(example);
				details.forEach(detail -> {
					detail.setIsDel(PlatformConstants.IS_ADMIN_YES);
					toolApplyDetailDao.updateByPrimaryKeySelective(detail);
				});
			} else {
				throw new RuntimeException("deleteFail");
			}
		});

	}

	/**
	 * 获取工具申请分页列表
	 */
	@Override
	public PagedList<ToolOutput> getToolApplys(SearchToolInput input) {
		// 查询申请主表
		WareToolApplyExample applyExample = new WareToolApplyExample();
		// 根据申请时间倒序排序
		applyExample.setOrderByClause("apply_date desc");
		Criteria applyCriteria = applyExample.createCriteria();
		// 未删除
		applyCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		// 根据申请单号
		if (StringUtils.isNotEmpty(input.getNo())) {
			applyCriteria.andToolApplyNoLike("%" + input.getNo() + "%");
		}
		if (StringUtils.isNotEmpty(input.getAuditStatus())) {
			applyCriteria.andAuditStatusEqualTo(input.getAuditStatus());
		}
		// 根据起止日期
		/*
		 * if (input.getStartDate() != null && input.getEndDate() != null) {
		 * applyCriteria.andApplyDateGreaterThanOrEqualTo(input.getStartDate());
		 * applyCriteria.andApplyDateLessThanOrEqualTo(input.getEndDate()); }
		 */
		if (input.getStartDate() != null && input.getEndDate() != null) {
			Date endDate = new Date(input.getEndDate().getTime()+1*24*60*60*1000);
			applyCriteria.andCreateTimeBetween(input.getStartDate(), endDate);
		} else if (input.getStartDate() != null) {
			applyCriteria.andCreateTimeBetween(input.getStartDate(), new Date());
		} else if (input.getEndDate() != null) {
			Date endDate = new Date(input.getEndDate().getTime()+1*24*60*60*1000);
			applyCriteria.andCreateTimeBetween(new Date(0), endDate);
		}
		// 根据用户id
		if (input.getUserId() != null) {
			applyCriteria.andApplyUserEqualTo(input.getUserId());
		}

		// 查询总条数
		int total = (int) toolApplyDao.countByExample(applyExample);
		PagedList<ToolOutput> page = new PagedList<>(input.getPageIndex(), input.getPageSize(), total);
		applyExample.setLimitStart(page.getLimitStart());
		applyExample.setLimitEnd(page.getLimitEnd());

		// 分页查询
		List<WareToolApply> toolApplies = toolApplyDao.selectByExample(applyExample);

		// 获取申请工具明细列表
		List<ToolOutput> outputs = new ArrayList<>();
		for (WareToolApply toolApply : toolApplies) {
			// copy申请主表
			ToolOutput output = new ToolOutput();
			BeanUtils.copyProperties(toolApply, output);
			output.setWareToolApplyId(toolApply.getWareToolApplyId());
			output.setToolApplyNo(toolApply.getToolApplyNo());
			output.setApplyType(toolApply.getApplyType());
			output.setApplyTypeLangLang(toolApply.getApplyType());
			output.setApplyDate(toolApply.getApplyDate());
			output.setAuditStatus(toolApply.getAuditStatus());
			output.setAuditStatusLangLang(toolApply.getAuditStatus());
			output.setRemark(toolApply.getRemark());
			// 申请人
			output.setApplyUser(toolApply.getApplyUser());
			// 获取申请人姓名 (NPE)
			String userName = "";
			Result<UserInfoOutput> applyUserResult = authService.getUserInfo(toolApply.getApplyUser());
			if (applyUserResult != null && applyUserResult.getData() != null
					&& applyUserResult.getData().getUserName() != null) {
				userName = applyUserResult.getData().getUserName();
			}
			output.setUserName(userName);
			// 查询出库状态
			output.setStockoutStatus(toolApply.getStockoutStatus());
			output.setStockoutStatusLangLang(toolApply.getStockoutStatus());

			// 查询明细
			WareToolApplyDetailExample detailExample = new WareToolApplyDetailExample();
			detailExample.createCriteria().andWareToolApplyIdEqualTo(toolApply.getWareToolApplyId());
			List<WareToolApplyDetail> details = toolApplyDetailDao.selectByExample(detailExample);
			List<ToolDetailOutput> detailOutputs = new ArrayList<>();
			for (WareToolApplyDetail applyDetail : details) {
				ToolDetailOutput detailOutput = new ToolDetailOutput();
				BeanUtils.copyProperties(applyDetail, detailOutput);
				detailOutput.setWareToolApplyDetailId(applyDetail.getWareToolApplyDetailId());
				// 查询备件号
				EditSparePartsInput editSparePartsInput = new EditSparePartsInput();
				editSparePartsInput.setKey(applyDetail.getSpareParts());
				SparePartsBriefOutput spareParts = sparePartsService.getSparePartsBrief(editSparePartsInput);
				String sparePartsNo = "";
				// NPE
				if (spareParts != null) {
					sparePartsNo = spareParts.getSparePartsNo();
				}
				detailOutput.setSparePartsNo(sparePartsNo);
				detailOutput.setSpareParts(applyDetail.getSpareParts());
				detailOutput.setSparePartsLangLang(applyDetail.getSpareParts());
				// 使用人
				detailOutput.setUserId(applyDetail.getUserId());
				// 查询使用人姓名(NPE)
				String useUser = "";
				Result<UserInfoOutput> useUserResult = authService.getUserInfo(applyDetail.getUserId());
				if (useUserResult != null && useUserResult.getData() != null
						&& useUserResult.getData().getUserName() != null) {
					useUser = useUserResult.getData().getUserName();
				}
				detailOutput.setUseDepartment(applyDetail.getUseDepartments());
				detailOutput.setUseDepartmentLangLang(applyDetail.getUseDepartments());
				detailOutput.setUseUser(useUser);
				detailOutput.setUseType(applyDetail.getUseType());
				detailOutput.setUseTypeLangLang(applyDetail.getUseType());
				detailOutput.setSparePartsNum(applyDetail.getSparePartsNum());
				// 出库状态
				detailOutput.setStockoutStatus(applyDetail.getStockoutStatus());
				detailOutput.setStockoutStatusLangLang(applyDetail.getStockoutStatus());
				
				
				//detailOutput.setStock(stockService.getStockNum(applyDetail.getSpareParts()));
				
				
				detailOutputs.add(detailOutput);
			}
			output.setDetails(detailOutputs);
			outputs.add(output);
		}

		page.getDataList().addAll(outputs);
		return page;
	}

	/**
	 * 提交申请单
	 */
	@Override
	@Transactional
	public void submitToolApply(List<Integer> ids) {
		ids.stream().forEach(id -> {
			// 获取原审核状态
			WareToolApply toolApply = toolApplyDao.selectByPrimaryKey(id);
			// 未提交才可提交
			if (ToolApplyAuditEnum.NOT_COMMIT.getCode().equals(toolApply.getAuditStatus())) {
				toolApply.setAuditStatus(ToolApplyAuditEnum.COMMITED.getCode());
				toolApplyDao.updateByPrimaryKeySelective(toolApply);

			} else {
				throw new RuntimeException("submitFail");
			}
		});
	}

	/**
	 * 部门审核
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void departmentAudit(List<Integer> ids) {
		ids.forEach(id -> {
			// 获取原审核状态
			WareToolApply toolApply = toolApplyDao.selectByPrimaryKey(id);
			// 已提交才能审核
			if (ToolApplyAuditEnum.COMMITED.getCode().equals(toolApply.getAuditStatus())) {
				toolApply.setAuditStatus(ToolApplyAuditEnum.DEPARTMENT_AUDITED.getCode());
				toolApplyDao.updateByPrimaryKeySelective(toolApply);
			} else {
				throw new RuntimeException("auditFail");
			}

		});
	}

	/**
	 * 部门驳回
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void departmentReject(ToolInput input) {
		// 获取原审核状态
		WareToolApply toolApply = toolApplyDao.selectByPrimaryKey(input.getWareToolApplyId());
		// 已提交才能驳回
		if (ToolApplyAuditEnum.COMMITED.getCode().equals(toolApply.getAuditStatus())) {
			toolApply.setAuditStatus(ToolApplyAuditEnum.DEPARTMENT_REJECTED.getCode());
			toolApply.setReasonsRejection(input.getReasonsRejection());
			toolApplyDao.updateByPrimaryKeySelective(toolApply);
		} else {
			throw new RuntimeException("auditFail");
		}
	}

	/**
	 * 主管审核
	 */
	@Override
	@Transactional
	public void supervisorAudit(List<Integer> ids) {
		ids.forEach(id -> {
			// 获取原审核状态
			WareToolApply toolApply = toolApplyDao.selectByPrimaryKey(id);
			// 部门审核通过主管才可审核
			if (ToolApplyAuditEnum.DEPARTMENT_AUDITED.getCode().equals(toolApply.getAuditStatus())) {
				toolApply.setAuditStatus(ToolApplyAuditEnum.SUPERVISOR_AUDITED.getCode());
				toolApplyDao.updateByPrimaryKeySelective(toolApply);

				// 新工具申请的审核
				/*
				 * if (ToolApplyTypeEnum.NORMAL_USE.getCode().equals(toolApply.getApplyType()))
				 * { // 填写预出库单信息 AddStockoutInput input = new AddStockoutInput(); // 获取单据类型
				 * String billType =
				 * billTypeService.getBillTypeKeyByName(WarehouseConstants.BILL_TOOL_APPLY); if
				 * (StringUtils.isEmpty(billType)) { throw new SqlException("insertFail"); }
				 * input.setBillType(billType); input.setNo(toolApply.getToolApplyNo()); //
				 * 获取申请人姓名 (NPE) String userName = ""; Result<UserInfoOutput> applyUserResult =
				 * authService.getUserInfo(toolApply.getApplyUser()); if (applyUserResult !=
				 * null && applyUserResult.getData() != null &&
				 * applyUserResult.getData().getUserName() != null) { userName =
				 * applyUserResult.getData().getUserName(); } input.setReceiveUser(userName); //
				 * TODO 部门接口完成后 根据领用人查询对用部门 input.setReceiveDepartment("IT部"); String company =
				 * ""; if (StringUtils.isNotEmpty(toolApply.getCpmpany())) { company =
				 * toolApply.getCpmpany(); } input.setCompany(company);
				 * 
				 * // 填写预出库单明细 WareToolApplyDetailExample example = new
				 * WareToolApplyDetailExample();
				 * example.createCriteria().andWareToolApplyIdEqualTo(id);
				 * List<WareToolApplyDetail> details =
				 * toolApplyDetailDao.selectByExample(example); List<AddStockoutDetailInput>
				 * detailInputs = new ArrayList<>(); details.forEach(tad -> {
				 * AddStockoutDetailInput di = new AddStockoutDetailInput();
				 * di.setSpareParts(tad.getSpareParts());
				 * di.setStockoutNum(tad.getSparePartsNum()); // 获取使用人姓名 (NPE) String useUser =
				 * ""; Result<UserInfoOutput> useUserResult =
				 * authService.getUserInfo(tad.getUserId()); if (useUserResult != null &&
				 * useUserResult.getData() != null && useUserResult.getData().getUserName() !=
				 * null) { useUser = useUserResult.getData().getUserName(); }
				 * di.setUseUser(useUser); // 查询默认仓库类型 EditSparePartsInput editSparePartsInput =
				 * new EditSparePartsInput(); editSparePartsInput.setKey(tad.getSpareParts());
				 * SparePartsBriefOutput spareParts =
				 * sparePartsService.getSparePartsBrief(editSparePartsInput);
				 * di.setDefaultWarehouseType(spareParts.getDefaultWarehouseType());
				 * di.setYard(toolApply.getYard());
				 * 
				 * detailInputs.add(di); });
				 * 
				 * AddStockoutDetailInput[] dis = new AddStockoutDetailInput[details.size()];
				 * AddStockoutDetailInput[] inputs = detailInputs.toArray(dis);
				 * input.setStockoutDetailInputList(inputs); // 生成预出库单
				 * stockoutService.addStockout(input); }
				 */

				// 报废申请的审核
				if (ToolApplyTypeEnum.SCRAP.getCode().equals(toolApply.getApplyType())) {
					// 修改工具数量并更新状态
					// 查询报废工具明细
					WareToolApplyDetailExample detailExample = new WareToolApplyDetailExample();
					detailExample.createCriteria().andWareToolApplyIdEqualTo(id);
					List<WareToolApplyDetail> details = toolApplyDetailDao.selectByExample(detailExample);
					details.forEach(detail -> {
						// 现有数量-报废数量
						WareToolManage toolManage = toolManageDao.selectByPrimaryKey(detail.getWareToolManageId());
						double num = toolManage.getNum() - detail.getScrapNum();
						toolManage.setNum(num);
						// 如果已经全部报废则更新为已报废
						if (num <= 0) {
							toolManage.setUpdateTime(new Date());
							toolManage.setToolStatus(ToolStatusEnum.SCRAP.getCode());
						} else {
							WareToolManage scrapToolManage = new WareToolManage();
							BeanUtils.copyProperties(toolManage, scrapToolManage);
							scrapToolManage.setWareToolManageId(null);
							scrapToolManage.setToolStatus(ToolStatusEnum.SCRAP.getCode());
							scrapToolManage.setNum(detail.getScrapNum());
							scrapToolManage.setUpdateTime(new Date());
							toolManageDao.insertSelective(scrapToolManage);
						}
						toolManageDao.updateByPrimaryKeySelective(toolManage);
					});
				}

			} else {
				throw new RuntimeException("auditFail");
			}
		});

	}

	/**
	 * 工具出库
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void toolOut(ToolInput input) {

		WareToolApply toolApply = toolApplyDao.selectByPrimaryKey(input.getWareToolApplyId());

		AddStockoutInput stockoutInput = new AddStockoutInput();
		stockoutInput.setNo(toolApply.getToolApplyNo());
		stockoutInput.setBillType(toolApply.getBillType());
		stockoutInput.setCompany(getCurrentCompanyKey());
		stockoutInput.setReceiveUser(toolApply.getApplyUser());
		stockoutInput.setWarehouse(input.getOutWarehouse());

		List<AddStockoutDetailInput> stockOutDetailInputs = new ArrayList<>();

		input.getDetails().stream().forEach(di -> {
			WareToolApplyDetail detail = toolApplyDetailDao.selectByPrimaryKey(di.getWareToolApplyDetailId());

			// StockoutEnum
			String outStatus = "";

			// 总出库数量
			double totalOutNum = new BigDecimal(di.getOutNum()).add(new BigDecimal(detail.getOutedNum())).doubleValue();
			if (totalOutNum > detail.getSparePartsNum()) {
				throw new RuntimeException("numOut");
			} else if (totalOutNum == detail.getSparePartsNum()) {
				outStatus = StockoutEnum.YESOUT.getCode();
			} else if (totalOutNum < detail.getSparePartsNum()) {
				outStatus = StockoutEnum.PORTIONOUT.getCode();
			}

			detail.setStockoutStatus(outStatus);
			detail.setOutedNum(totalOutNum);
			toolApplyDetailDao.updateByPrimaryKeySelective(detail);

			List<StockOutput> stockOutputs = stockService.autoGetStock(input.getOutWarehouse(), detail.getSpareParts(),
					di.getOutNum());
			for (StockOutput stock : stockOutputs) {
				AddStockoutDetailInput stockoutDetailInput = new AddStockoutDetailInput();
				BeanUtils.copyProperties(stock, input);
				stockoutDetailInput.setStockoutNum(stock.getActualSurplusNum());
				stockoutDetailInput.setSpareParts(stock.getSpareParts());
				stockoutDetailInput.setUseUser(toolApply.getApplyUser());
				stockoutDetailInput.setSparePartsBatch(stock.getSparePartsBatch());
				stockoutDetailInput.setDefaultWarehouseType(stock.getWarehouseType());
				stockOutDetailInputs.add(stockoutDetailInput);
				
				ToolDetailInput toolDetailInput=new ToolDetailInput();
				toolDetailInput.setSpareParts(stock.getSpareParts());
				toolDetailInput.setSparePartsBatch(stock.getSparePartsBatch());
				toolDetailInput.setOutNum(stockoutDetailInput.getStockoutNum());
				toolDetailInput.setUseType(di.getUseType());
				toolDetailInput.setUseDepartment(di.getUseDepartment());
				toolDetailInput.setUseDepartments(di.getUseDepartments());
				toolDetailInput.setUserId(di.getUserId());
				addToolManage(toolDetailInput);
			}

			

		});

		stockoutInput.setStockoutDetailInputList(
				stockOutDetailInputs.toArray(new AddStockoutDetailInput[stockOutDetailInputs.size()]));

		stockoutService.addStockout(stockoutInput);

		toolApply.setStockoutStatus(getDetailOutputById(toolApply.getWareToolApplyId()).stream()
				.map(d -> d.getStockoutStatus()).filter(d -> StockoutEnum.PORTIONOUT.getCode().equals(d)).findFirst()
				.orElse(StockoutEnum.YESOUT.getCode()));
		toolApplyDao.updateByPrimaryKeySelective(toolApply);
	}

	/**
	 * 
	 *
	 * @author lishzh
	 * @param input
	 */
	public void addToolManage(ToolDetailInput input) {
		// 插入到工具管理表
		WareToolManage toolManage = new WareToolManage();
		// 备件key
		toolManage.setSpareParts(input.getSpareParts());
		// 备件批次
		toolManage.setSparePartsBatch(input.getSparePartsBatch());
		// 出库数量
		toolManage.setNum(input.getOutNum());
		// 正常使用
		toolManage.setToolStatus(ToolStatusEnum.NORMAL.getCode());
		// 使用类型
		toolManage.setType(input.getUseType());
		// 使用部门
		toolManage.setDepartment(input.getUseDepartment());
		// 未派发
		toolManage.setDistributeStatus(ToolDistributeStatusEnum.NOT_DISTRIBUTE.getCode());
		// 使用人
		toolManage.setUseUser(input.getUserId());
		// 插入时间
		toolManage.setCreateTime(new Date());
		// 未删除
		toolManage.setIsDel(PlatformConstants.ISDEL_NO);

		toolManageDao.insertSelective(toolManage);

	}

	/**
	 * 已出库工具管理
	 */
	@Override
	public void toolStockedManage(StockoutOutput input) {
		// 查询源单-工具申请单
		WareToolApplyExample applyExample = new WareToolApplyExample();
		applyExample.createCriteria().andToolApplyNoEqualTo(input.getNo());
		List<WareToolApply> toolApplies = toolApplyDao.selectByExample(applyExample);
		if (CollectionUtils.isEmpty(toolApplies)) {
			throw new RuntimeException("server error");
		}
		WareToolApply toolApply = toolApplies.get(0);
		// 更新源单出库状态
		toolApply.setStockoutStatus(input.getStockoutStatus());

		// 查询工具申请单明细
		WareToolApplyDetailExample example = new WareToolApplyDetailExample();
		example.createCriteria().andWareToolApplyIdEqualTo(toolApply.getWareToolApplyId());
		List<WareToolApplyDetail> details = toolApplyDetailDao.selectByExample(example);

		// 已出库工具进入工具管理中并更新明细出库状态
		input.getDetailOutputs().forEach(dop -> {
			// 找到对应申请单明细
			details.forEach(d -> {
				if (StringUtils.isEmpty(d.getSpareParts()) || StringUtils.isEmpty(dop.getSpareParts())) {
					throw new RuntimeException("server error");
				}
				if (d.getSpareParts().equals(dop.getSpareParts())) {
					// 插入到工具管理表
					WareToolManage toolManage = new WareToolManage();
					// 备件key
					toolManage.setSpareParts(d.getSpareParts());
					// 备件批次
					toolManage.setSparePartsBatch(dop.getSparePartsBatch());
					// 出库数量
					toolManage.setNum(dop.getOutNum());
					// 正常使用
					toolManage.setToolStatus(ToolStatusEnum.NORMAL.getCode());
					// 使用类型
					toolManage.setType(d.getUseType());
					// 使用部门
					toolManage.setDepartment(d.getUseDepartments());
					// 未派发
					toolManage.setDistributeStatus(ToolDistributeStatusEnum.NOT_DISTRIBUTE.getCode());
					// 使用人
					toolManage.setUseUser(d.getUserId());
					// 插入时间
					toolManage.setCreateTime(new Date());
					// 未删除
					toolManage.setIsDel(PlatformConstants.ISDEL_NO);

					toolManageDao.insertSelective(toolManage);

					// 更新此工具的出库状态
					d.setStockoutStatus(dop.getStockoutStatus());
					toolApplyDetailDao.updateByPrimaryKeySelective(d);
				}
			});

		});

	}

	/**
	 * 获取已出库的工具(工具管理列表)
	 */
	@Override
	public PagedList<ToolDetailOutput> getTools(SearchToolInput input) {
		PagedList<ToolDetailOutput> page = new PagedList<>(input.getPageIndex(), input.getPageSize());
		Map<String, Object> map = new HashMap<>(9);
		// 根据部门
		map.put("department", input.getDepartment());
		// 根据备件号
		map.put("sparePartsNo", input.getSparePartsNo());
		// 根据责任人
		map.put("liablePerson", input.getUserId());
		// 根据派发状态
		map.put("distributeStatus", input.getDistributeStatus());
		// 根据工具状态
		map.put("toolStatus", input.getToolStatus());
		// 根据备件名
		if (isChineseRequest()) {
			map.put("sparePartsName", input.getName());
			map.put("sparePartsNameEn", null);
		} else {
			map.put("sparePartsNameEn", input.getName());
			map.put("sparePartsName", null);
		}
		// 分页参数
		map.put("limitStart", page.getLimitStart());
		map.put("limitEnd", page.getLimitEnd());

		// 获取分页数据
		List<WareToolExtManage> tools = toolManageExtDao.selectPageTools(map);
		// 获取总条数
		int total = toolManageExtDao.getTotal();
		List<ToolDetailOutput> outputs = new ArrayList<>();
		tools.forEach(tool -> {
			ToolDetailOutput output = new ToolDetailOutput();
			output.setWareToolManageId(tool.getWareToolManageId());
			output.setUseDepartment(tool.getDepartment());
			output.setUseDepartmentLangLang(tool.getDepartment());
			output.setUseType(tool.getType());
			output.setUseTypeLangLang(tool.getType());
			output.setSpareParts(tool.getSpareParts());
			output.setSparePartsLangLang(tool.getSpareParts());
			output.setSparePartsNo(tool.getSparePartsNo());
			output.setSparePartsBatch(tool.getSparePartsBatch());
			output.setNum(tool.getNum());
			output.setTransferRecord(tool.getTransferRecord());
			if (ToolStatusEnum.SCRAP.getCode().equals(tool.getToolStatus())) {
				output.setScrapDate(tool.getUpdateTime());
			}
			// 返回已报废的数量
			// 多个报废申请单中申请报废同一工具,报废数量不能多于已有数量
			output.setScrapedNum(tool.getScrapedNum() == null ? 0 : tool.getScrapedNum());
			String useUser = "";
			Result<UserInfoOutput> userResult = authService.getUserInfo(tool.getUseUser());
			if (userResult != null && userResult.getData() != null && userResult.getData().getUserName() != null) {
				useUser = userResult.getData().getUserName();
			}
			output.setLiableUser(getUserNameByUserId(tool.getLiablePerson()));
			output.setLiablePerson(tool.getLiablePerson());
			output.setUseUser(useUser);
			output.setScrapDate(tool.getUpdateTime());
			output.setDistributeDate(tool.getDistributeDate());
			output.setDistributeStatus(tool.getDistributeStatus());
			output.setDistributeStatusLangLang(tool.getDistributeStatus());

			outputs.add(output);
		});

		page.setTotalItemCount(total);
		page.getDataList().addAll(outputs);

		return page;
	}

	/**
	 * 工具派发
	 */
	@Override
	@Transactional
	public void toolDistribute(List<ToolDetailInput> inputs) {
		inputs.forEach(input -> {
			WareToolManage toolManage = new WareToolManage();
			// 主键id
			toolManage.setWareToolManageId(input.getWareToolManageId());
			// 责任人
			toolManage.setLiablePerson(input.getLiablePerson());
			// 派发时间
			toolManage.setDistributeDate(new Date());
			// 已派发
			toolManage.setDistributeStatus(ToolDistributeStatusEnum.DISTRIBUTED.getCode());

			toolManageDao.updateByPrimaryKeySelective(toolManage);
		});

	}

	/**
	 * 报废申请
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void scrapApply(ToolInput input) {
		// 保存申请单
		WareToolApply toolApply = new WareToolApply();
		BeanUtils.copyProperties(input, toolApply);
		// 生成报废申请单号
		String billNumber = billTypeService.getBillNumber(WarehouseConstants.BILL_TOOL_APPLY);
		if (StringUtils.isEmpty(billNumber)) {
			throw new SqlException("insertFail");
		}
		toolApply.setToolApplyNo(billNumber);
		// 获取单据类型
		String billType = billTypeService.getBillTypeKeyByName(WarehouseConstants.BILL_TOOL_APPLY);
		if (StringUtils.isEmpty(billType)) {
			throw new SqlException("insertFail");
		}
		toolApply.setBillType(billType);
		// 未提交
		toolApply.setAuditStatus(ToolApplyAuditEnum.NOT_COMMIT.getCode());
		// 申请人
		Integer currentUserId = getCurrentUserId();
		if (currentUserId == null) {
			throw new SqlException("insertFail");
		}
		toolApply.setApplyUser(currentUserId);
		// 所属公司
		toolApply.setCpmpany(getCurrentCompanyKey());
		// 所属场站
		toolApply.setYard(getCurrentYardKey());
		// 未删除
		toolApply.setIsDel(PlatformConstants.ISDEL_NO);
		// 创建人
		toolApply.setCreateUser(currentUserId);
		// 创建时间
		Date date = new Date();
		toolApply.setCreateTime(date);
		// 申请时间
		toolApply.setApplyDate(date);
		toolApplyDao.insertSelective(toolApply);

		// 保存申请工具明细
		for (ToolDetailInput detailInput : input.getDetails()) {
			// 查询此工具所有被报废的数量
			WareToolApplyDetailExample example = new WareToolApplyDetailExample();
			example.createCriteria().andWareToolManageIdEqualTo(detailInput.getWareToolManageId())
					.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			List<WareToolApplyDetail> applyDetails = toolApplyDetailDao.selectByExample(example);
			// 查询现有数量
			WareToolManage toolManage = toolManageDao.selectByPrimaryKey(detailInput.getWareToolManageId());
			// 本次报废数量+之前所有被报废的数量不能多于现有数量
			double scrapedNum = detailInput.getScrapNum();
			for (WareToolApplyDetail ad : applyDetails) {
				scrapedNum += ad.getScrapNum();
			}
			if (scrapedNum > toolManage.getNum()) {
				throw new RuntimeException("applyFail");
			}
			// 插入明细
			WareToolApplyDetail applyDetail = new WareToolApplyDetail();
			BeanUtils.copyProperties(detailInput, applyDetail);
			applyDetail.setSparePartsNum(detailInput.getScrapNum());
			// 申请主表id
			applyDetail.setWareToolApplyId(toolApply.getWareToolApplyId());
			// 创建人
			applyDetail.setCreateUser(currentUserId);
			// 创建时间
			applyDetail.setCreateTime(date);
			// 未删除
			applyDetail.setIsDel(PlatformConstants.ISDEL_NO);
			toolApplyDetailDao.insertSelective(applyDetail);
		}

	}

	/**
	 * 修改报废申请
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void editScrapApply(ToolInput input) {
		// 查询所要修改的申请单
		WareToolApply toolApply = toolApplyDao.selectByPrimaryKey(input.getWareToolApplyId());
		// 只有未提交和部门驳回的才能修改
		if (ToolApplyAuditEnum.NOT_COMMIT.getCode().equals(toolApply.getAuditStatus())
				|| ToolApplyAuditEnum.DEPARTMENT_REJECTED.getCode().equals(toolApply.getAuditStatus())) {
			BeanUtils.copyProperties(input, toolApply);
			// 修改时间
			Date date = new Date();
			toolApply.setUpdateTime(date);
			// 修改人
			Integer currentUserId = getCurrentUserId();
			toolApply.setUpdateUser(currentUserId);
			toolApplyDao.updateByPrimaryKeySelective(toolApply);

			// 删除原申请明细
			WareToolApplyDetailExample example = new WareToolApplyDetailExample();
			example.createCriteria().andWareToolApplyIdEqualTo(input.getWareToolApplyId());
			toolApplyDetailDao.deleteByExample(example);

			// 保存新申请工具明细
			for (ToolDetailInput detailInput : input.getDetails()) {
				// 查询此工具所有被报废的数量
				WareToolApplyDetailExample applyDetailExample = new WareToolApplyDetailExample();
				applyDetailExample.createCriteria().andWareToolManageIdEqualTo(detailInput.getWareToolManageId())
						.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				List<WareToolApplyDetail> applyDetails = toolApplyDetailDao.selectByExample(applyDetailExample);
				// 查询现有数量
				WareToolManage toolManage = toolManageDao.selectByPrimaryKey(detailInput.getWareToolManageId());
				// 本次报废数量+之前所有被报废的数量不能多于现有数量
				double scrapedNum = detailInput.getScrapNum();
				for (WareToolApplyDetail ad : applyDetails) {
					scrapedNum += ad.getScrapNum();
				}
				if (scrapedNum > toolManage.getNum()) {
					throw new RuntimeException("applyFail");
				}
				// 插入明细
				WareToolApplyDetail applyDetail = new WareToolApplyDetail();
				BeanUtils.copyProperties(detailInput, applyDetail);
				// 申请主表id
				applyDetail.setWareToolApplyId(toolApply.getWareToolApplyId());
				// 责任人
				// applyDetail.setLiablePerson(currentUserId);
				// 使用部门
				applyDetail.setUseDepartments(toolApply.getApplyDepartment());
				// 未出库
				applyDetail.setStockoutStatus(StockoutEnum.NOTOUT.getCode());
				// 未派发
				applyDetail.setDistributeStatus(ToolDistributeStatusEnum.NOT_DISTRIBUTE.getCode());
				// 创建人
				applyDetail.setCreateUser(currentUserId);
				// 创建时间
				applyDetail.setCreateTime(toolApply.getCreateTime());
				// 修改人
				applyDetail.setUpdateUser(currentUserId);
				// 修改时间
				applyDetail.setUpdateTime(date);
				// 未删除
				applyDetail.setIsDel(PlatformConstants.ISDEL_NO);
				toolApplyDetailDao.insertSelective(applyDetail);
			}
		} else {
			throw new SqlException("updateFail");
		}

	}

	/**
	 * 主管审核报废申请单
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void supervisorAuditScrap(List<Integer> ids) {
		ids.stream().forEach(id -> {
			// 获取原审核状态
			WareToolApply toolApply = toolApplyDao.selectByPrimaryKey(id);
			// 部门审核通过主管才可审核
			if (ToolApplyAuditEnum.DEPARTMENT_AUDITED.getCode().equals(toolApply.getAuditStatus())) {
				toolApply.setAuditStatus(ToolApplyAuditEnum.SUPERVISOR_AUDITED.getCode());
				toolApplyDao.updateByPrimaryKeySelective(toolApply);

				// 修改工具数量并更新状态
				// 查询报废工具明细
				WareToolApplyDetailExample detailExample = new WareToolApplyDetailExample();
				detailExample.createCriteria().andWareToolApplyIdEqualTo(id);
				List<WareToolApplyDetail> details = toolApplyDetailDao.selectByExample(detailExample);
				details.forEach(detail -> {
					// 现有数量-报废数量
					WareToolManage toolManage = toolManageDao.selectByPrimaryKey(detail.getWareToolManageId());
					double num = toolManage.getNum() - detail.getScrapNum();
					//toolManage.setNum(num);
					Date date = new Date();
					// 如果已经全部报废则更新为已报废
					if (num <= 0) {
						toolManage.setToolStatus(ToolStatusEnum.SCRAP.getCode());
						toolManage.setUpdateTime(date);
						toolManageDao.updateByPrimaryKeySelective(toolManage);
					}else {
						// 部分报废
						WareToolManage scrapTool=new WareToolManage();
						scrapTool.setToolStatus(ToolStatusEnum.SCRAP.getCode());
						scrapTool.setUpdateTime(date);
						scrapTool.setNum(detail.getScrapNum());
						
						scrapTool.setDepartment(toolManage.getDepartment());
						scrapTool.setCompany(toolManage.getCompany());
						scrapTool.setType(toolManage.getType());
						scrapTool.setSpareParts(toolManage.getSpareParts());
						scrapTool.setSparePartsBatch(toolManage.getSparePartsBatch());
						scrapTool.setLiablePerson(toolManage.getLiablePerson());
						scrapTool.setDistributeDate(toolManage.getDistributeDate());
						scrapTool.setDistributeStatus(toolManage.getDistributeStatus());
						scrapTool.setTransferRecord(toolManage.getTransferRecord());
						scrapTool.setUseUser(toolManage.getUseUser());
						scrapTool.setCreateTime(date);
						Integer userId = getCurrentUserId();
						scrapTool.setCreateUser(userId);
						scrapTool.setUpdateUser(userId);
						scrapTool.setIsDel(PlatformConstants.ISDEL_NO);
						
						toolManageDao.insertSelective(scrapTool);
						
					}
					toolManageDao.updateByPrimaryKeySelective(toolManage);
				});

			} else {
				throw new RuntimeException("auditFail");
			}
		});

	}

	/**
	 * 工具调拨
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void toolTransfer(List<ToolDetailInput> inputs) {
		inputs.forEach(input -> {
			// 调拨数量不能多于现有数量
			WareToolManage toolManage = toolManageDao.selectByPrimaryKey(input.getWareToolManageId());
			if (toolManage.getNum() - input.getTransferNum() < 0) {
				throw new RuntimeException("transferFail");
			}

			// 调入部门
			toolManage.setDepartment(input.getInDepartments());

			// 记录调拨过程
			String record = input.getUseDepartment() + "调入" + input.getInDepartments() + ";";
			toolManage.setTransferRecord(record);
			if (toolManage.getNum() - input.getTransferNum() == 0) {
				// 调拨全部
				// 新责任人
				toolManage.setLiablePerson(input.getNewLiablePerson());
				toolManage.setUpdateTime(new Date());
				toolManageDao.updateByPrimaryKeySelective(toolManage);
			} else {
				// 部分调拨
				// 更新数量 现有数量-调拨数量
				toolManage.setNum(toolManage.getNum() - input.getTransferNum());
				toolManageDao.updateByPrimaryKeySelective(toolManage);
				// 新责任人
				toolManage.setLiablePerson(input.getNewLiablePerson());
				// 新增调拨工具
				// id置null
				toolManage.setWareToolManageId(null);
				// 现有数量为调拨数量
				toolManage.setNum(input.getTransferNum());
				// 创建时间
				toolManage.setCreateTime(new Date());
				toolManageDao.insertSelective(toolManage);
			}
		});
	}

}
