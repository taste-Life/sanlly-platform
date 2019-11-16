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

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.warehouse.constants.WarehouseConstants;
import com.sanlly.warehouse.dao.BorrowLendDetailExtMapper;
import com.sanlly.warehouse.dao.BorrowLendDetailMapper;
import com.sanlly.warehouse.dao.BorrowLendExtMapper;
import com.sanlly.warehouse.dao.BorrowLendMapper;
import com.sanlly.warehouse.dao.LendSaleDetailMapper;
import com.sanlly.warehouse.dao.LendSaleMapper;
import com.sanlly.warehouse.entity.BorrowLend;
import com.sanlly.warehouse.entity.BorrowLendDetail;
import com.sanlly.warehouse.entity.BorrowLendDetailExample;
import com.sanlly.warehouse.entity.LendSale;
import com.sanlly.warehouse.entity.LendSaleDetail;
import com.sanlly.warehouse.enums.StaffBorrowStatusEnum;
import com.sanlly.warehouse.models.input.borrowlend.BorrowLendDetailInput;
import com.sanlly.warehouse.models.input.borrowlend.BorrowLendInput;
import com.sanlly.warehouse.models.input.borrowlend.SearchBorrowLendInput;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutDetailInput;
import com.sanlly.warehouse.models.input.stockout.StockOutInput;
import com.sanlly.warehouse.models.output.borrowlend.BorrowLendDetailOutput;
import com.sanlly.warehouse.models.output.borrowlend.BorrowLendOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsBriefOutput;
import com.sanlly.warehouse.service.BillTypeService;
import com.sanlly.warehouse.service.LendService;
import com.sanlly.warehouse.service.WareSparePartsService;
import com.sanlly.warehouse.service.WareStockService;
import com.sanlly.warehouse.service.WareStockoutService;

/**
 * 借出service
 * 
 * @author lishzh
 *
 */
@Service
public class LendServiceImpl extends BaseServiceImpl implements LendService {

	@Autowired
	private BorrowLendMapper borrowLendDao;

	@Autowired
	private BorrowLendDetailMapper borrowLendDetailDao;

	@Autowired
	private BillTypeService billTypeService;

	@Autowired
	private BorrowLendExtMapper borrowLendExtDao;

	@Autowired
	private WareSparePartsService sparePartsService;

	@Autowired
	private WareStockoutService stockoutService;

	@Autowired
	WareStockService stockService;

	@Autowired
	private BorrowLendDetailExtMapper borrowLendDetailExtDao;

	@Autowired
	private LendSaleMapper lendSaleDao;

	@Autowired
	private LendSaleDetailMapper lendSaleDetailDao;

	/**
	 * 添加借出单
	 */
	@Override
	@Transactional
	public void addLend(BorrowLendInput input) {
		BorrowLend borrowLend = new BorrowLend();
		BeanUtils.copyProperties(input, borrowLend);
		// 生成单号
		String billNumber = billTypeService.getBillNumber(WarehouseConstants.BILL_LEND);
		if (StringUtils.isEmpty(billNumber)) {
			throw new SqlException("insertFail");
		}
		borrowLend.setBorrowLendNo(billNumber);
		borrowLend.setCompany(getCurrentCompanyKey());
		// 借出单
		borrowLend.setCategory(WarehouseConstants.BORROW_LEND_LEND);
		// 未审核
		borrowLend.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
		// 未出库
		borrowLend.setBillStatus(StaffBorrowStatusEnum.NOT_OUT.getCode());
		// 未删除
		borrowLend.setIsDel(PlatformConstants.ISDEL_NO);
		// 创建时间
		Date dete = new Date();
		borrowLend.setCreateTime(dete);
		// 创建用户
		Integer userId = getCurrentUserId();
		borrowLend.setCreateUser(userId);
		// 保存
		borrowLendDao.insertSelective(borrowLend);

		// 保存明细
		input.getDetails().forEach(detailInput -> {
			BorrowLendDetail detail = new BorrowLendDetail();
			BeanUtils.copyProperties(detailInput, detail);
			// 借入单id
			detail.setWareBorrowLendSlip(borrowLend.getWareBorrowLendSlipId());
			// 还件数量0.0
			detail.setReturnNum(WarehouseConstants.DOUBLE_ZERO);
			// 未删除
			detail.setIsDel(PlatformConstants.ISDEL_NO);
			// 创建时间
			detail.setCreateTime(dete);
			// 创建用户
			detail.setCreateUser(userId);
			borrowLendDetailDao.insertSelective(detail);
		});

	}

	/**
	 * 修改借出单
	 */
	@Override
	@Transactional
	public void editLend(BorrowLendInput input) {
		// 查询要修改的借入单
		BorrowLend borrowLend = borrowLendDao.selectByPrimaryKey(input.getWareBorrowLendSlipId());
		// 只有未出库的才能修改
		if (StaffBorrowStatusEnum.NOT_OUT.getCode().equals(borrowLend.getBillStatus())) {
			BeanUtils.copyProperties(input, borrowLend);
			// 修改时间
			Date dete = new Date();
			borrowLend.setUpdateTime(dete);
			// 修改用户
			Integer userId = getCurrentUserId();
			borrowLend.setUpdateUser(userId);
			// 更新
			borrowLendDao.updateByPrimaryKeySelective(borrowLend);

			// 删除原明细
			BorrowLendDetailExample example = new BorrowLendDetailExample();
			example.createCriteria().andWareBorrowLendSlipEqualTo(input.getWareBorrowLendSlipId());
			borrowLendDetailDao.deleteByExample(example);

			// 保存新明细
			input.getDetails().forEach(detailInput -> {
				BorrowLendDetail detail = new BorrowLendDetail();
				BeanUtils.copyProperties(detailInput, detail);
				// 借入单id
				detail.setWareBorrowLendSlip(borrowLend.getWareBorrowLendSlipId());
				// 还件数量0.0
				detail.setReturnNum(WarehouseConstants.DOUBLE_ZERO);
				// 未删除
				detail.setIsDel(PlatformConstants.ISDEL_NO);
				// 创建时间
				detail.setCreateTime(borrowLend.getCreateTime());
				// 创建用户
				detail.setCreateUser(borrowLend.getCreateUser());
				// 修改时间
				detail.setUpdateTime(dete);
				// 修改用户
				detail.setUpdateUser(userId);
				// 保存
				borrowLendDetailDao.insertSelective(detail);
			});

		}

	}

	/**
	 * 删除借出单
	 */
	@Override
	@Transactional
	public void deleteLend(List<Integer> ids) {
		ids.forEach(id -> {
			// 查询要删除的借入单
			BorrowLend borrowLend = borrowLendDao.selectByPrimaryKey(id);
			// 只有未出库的才能删除
			if (StaffBorrowStatusEnum.NOT_OUT.getCode().equals(borrowLend.getBillStatus())) {
				// 标记删除
				borrowLend.setIsDel(PlatformConstants.ISDEL_YES);
				// 更新
				borrowLendDao.updateByPrimaryKeySelective(borrowLend);

				// 删除明细
				BorrowLendDetailExample example = new BorrowLendDetailExample();
				example.createCriteria().andWareBorrowLendSlipEqualTo(id);
				// 标记删除
				BorrowLendDetail detail = new BorrowLendDetail();
				detail.setIsDel(PlatformConstants.ISDEL_YES);
				// 更新
				borrowLendDetailDao.updateByExampleSelective(detail, example);
			}
		});

	}

	/**
	 * 根据id获取借出单
	 */
	@Override
	public BorrowLendOutput getLendById(Integer id) {
		// 根据主键查询
		BorrowLend borrowLend = borrowLendDao.selectByPrimaryKey(id);
		// copy
		BorrowLendOutput output = new BorrowLendOutput();
		BeanUtils.copyProperties(borrowLend, output);
		// 借件类型
		// output.setBorrowTypeLangLang(borrowLend.getBorrowType());
		// 单据状态
		output.setBillStatusLangLang(borrowLend.getBillStatus());
		// 制单人
		output.setCreateUser(getUserNameByUserId(borrowLend.getCreateUser()));
		// 明细
		output.setDetails(getDetailOutputsById(id));
		// 出库明细
		output.setOutDetails(stockoutService.getStockDetailList(borrowLend.getBorrowLendNo()));

		return output;
	}

	/**
	 * 获取借出单列表
	 */
	@Override
	public PagedList<BorrowLendOutput> getLends(SearchBorrowLendInput input) {
		// 添加检索条件
		PagedList<BorrowLendOutput> page = new PagedList<>(input.getPageIndex(), input.getPageSize());
		Map<String, Object> map = new HashMap<>(13);
		// by起始时间
		map.put("startDate", input.getStartDate());
		// by结束时间
		map.put("endDate", input.getEndDate());
		// by场站
		map.put("yard", input.getYard());
		// by借件单号
		map.put("no", input.getNo());
		// by箱号
		// map.put("containerNo", input.getContainerNo());
		// by单据状态
		map.put("status", input.getStatus());
		// by备件号
		map.put("sparePartsNo", input.getSparePartsNo());
		// by备件名
		if (isChineseRequest()) {
			map.put("sparePartsName", input.getSparePartsName());
			map.put("sparePartsNameEn", null);
		} else {
			map.put("sparePartsNameEn", input.getSparePartsName());
			map.put("sparePartsName", null);
		}
		map.put("category", WarehouseConstants.BORROW_LEND_LEND);
		// 分页参数
		map.put("limitStart", page.getLimitStart());
		map.put("limitEnd", page.getLimitEnd());
		map.put("category", WarehouseConstants.BORROW_LEND_LEND);

		// 获取分页数据和总条数
		List<BorrowLend> borrows = borrowLendExtDao.selectByCondition(map);
		int total = borrowLendExtDao.getTotal();

		// 获取明细
		List<BorrowLendOutput> outputs = new ArrayList<>();
		borrows.forEach(borrow -> {
			// copy
			BorrowLendOutput output = new BorrowLendOutput();
			BeanUtils.copyProperties(borrow, output);
			// 审核状态
			output.setAuditStatusLangLang(borrow.getAuditStatus());
			// 场站
			output.setYardLangLang(borrow.getYard());
			// 入库仓库
			output.setInWarehouseLangLang(borrow.getInWarehouse());
			// 借件类型
			output.setBorrowTypeLangLang(borrow.getBorrowType());
			// 单据状态
			output.setBillStatusLangLang(borrow.getBillStatus());
			// 制单人
			output.setCreateUser(getUserNameByUserId(borrow.getCreateUser()));

			// 查询明细
			output.setDetails(getDetailOutputsById(borrow.getWareBorrowLendSlipId()));

			outputs.add(output);
		});

		// return page
		page.setTotalItemCount(total);
		page.setDataList(outputs);
		return page;
	}

	/**
	 * 根据借出单id获取detail outputs
	 *
	 * @author lishzh
	 * @param id
	 * @return 明细output
	 */
	public List<BorrowLendDetailOutput> getDetailOutputsById(Integer id) {
		// 查询明细
		BorrowLendDetailExample example = new BorrowLendDetailExample();
		example.createCriteria().andWareBorrowLendSlipEqualTo(id);
		List<BorrowLendDetail> details = borrowLendDetailDao.selectByExample(example);
		List<BorrowLendDetailOutput> detailOutputs = new ArrayList<>();
		details.forEach(detail -> {
			BorrowLendDetailOutput detailOutput = new BorrowLendDetailOutput();
			BeanUtils.copyProperties(detail, detailOutput);
			EditSparePartsInput input = new EditSparePartsInput();
			input.setKey(detail.getSpareParts());
			detailOutput.setSparePartsNo(sparePartsService.getSparePartsBrief(input).getSparePartsNo());
			detailOutput.setSparePartsLangLang(detail.getSpareParts());
			detailOutput.setOutWarehouseTypeLangLang(detail.getOutWarehouseType());
			detailOutput.setInWarehouseTypeLangLang(detail.getInWarehouseType());
			// 查询库位
			StockOutput stockOutput = stockService.getStockByBatch(detail.getSparePartsBatch(), detail.getSpareParts());
			// 查询所属公司
			detailOutput.setCompanyLangLang(stockOutput.getCompany());
			// 库存
			detailOutput.setSurplusNum(stockOutput.getSurplusNum());
			detailOutputs.add(detailOutput);
		});

		return detailOutputs;

	}

	/**
	 * 出库
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void lendOut(Integer id) {
		// 获取借出单
		BorrowLend borrowLend = borrowLendDao.selectByPrimaryKey(id);
		// 只有未出库状态才能出库
		if (StaffBorrowStatusEnum.NOT_OUT.getCode().equals(borrowLend.getBillStatus())) {
			// 借出单直接出库
			// set出库参数
			StockOutInput stockOutInput = new StockOutInput();
			stockOutInput.setNo(borrowLend.getBorrowLendNo());
			stockOutInput.setCompany(borrowLend.getCompany());
			// 获取单据类型
			String billType = billTypeService.getBillTypeKeyByName(WarehouseConstants.BILL_LEND);
			if (StringUtils.isEmpty(billType)) {
				throw new SqlException("insertFail");
			}
			stockOutInput.setBillType(billType);
			// 领料部门
			String department = "it部";
			if (StringUtils.isEmpty(department)) {
				throw new SqlException("insertFail");
			}
			stockOutInput.setReceiveDepartment(department);
			// 领料人
			stockOutInput.setReceiveUser(borrowLend.getBorrowUser());

			// 获取借件明细
			BorrowLendDetailExample example = new BorrowLendDetailExample();
			example.createCriteria().andWareBorrowLendSlipEqualTo(borrowLend.getWareBorrowLendSlipId());
			List<BorrowLendDetail> details = borrowLendDetailDao.selectByExample(example);

			// set出库明细
			List<AddStockoutDetailInput> stockoutDetailInputList = new ArrayList<>();
			details.forEach(detail -> {
				AddStockoutDetailInput AddStockoutDetailInput = new AddStockoutDetailInput();
				AddStockoutDetailInput.setStockoutNum(detail.getBorrowNum());
				AddStockoutDetailInput.setSparePartsBatch(detail.getSparePartsBatch());
				AddStockoutDetailInput.setSpareParts(detail.getSpareParts());
				AddStockoutDetailInput.setUseUser(borrowLend.getBorrowUser());
				AddStockoutDetailInput.setYard(borrowLend.getYard());
				stockoutDetailInputList.add(AddStockoutDetailInput);
			});
			AddStockoutDetailInput[] addStockoutDetailInputArrays = stockoutDetailInputList
					.toArray(new AddStockoutDetailInput[stockoutDetailInputList.size()]);
			stockOutInput.setStockoutDetailInputList(addStockoutDetailInputArrays);

			// 直接出库
			stockoutService.directOut(stockOutInput);

			// 更新借件单出库状态
			borrowLend.setBillStatus(StaffBorrowStatusEnum.ALL_OUT.getCode());
			borrowLendDao.updateByPrimaryKeySelective(borrowLend);

		} else {
			throw new RuntimeException("outFail");
		}

	}

	/**
	 * 借出未还
	 */
	@Override
	public PagedList<BorrowLendDetailOutput> getNotRepay(SearchBorrowLendInput input) {
		// 添加检索条件
		PagedList<BorrowLendDetailOutput> page = new PagedList<>(input.getPageIndex(), input.getPageSize());
		Map<String, Object> map = new HashMap<>(13);
		// by借件单号
		map.put("no", input.getNo());
		// by箱号
		// map.put("containerNo", input.getContainerNo());
		// by备件号
		map.put("sparePartsNo", input.getSparePartsNo());
		// by备件号
		map.put("category", WarehouseConstants.BORROW_LEND_LEND);
		// 分页参数
		map.put("limitStart", page.getLimitStart());
		map.put("limitEnd", page.getLimitEnd());

		// 查询未还
		List<BorrowLendDetailOutput> outputs = new ArrayList<>();
		borrowLendDetailExtDao.selectByCondition(map).forEach(detail -> {
			BorrowLend borrowLend = borrowLendDao.selectByPrimaryKey(detail.getWareBorrowLendSlip());
			BorrowLendDetailOutput output = new BorrowLendDetailOutput();
			BeanUtils.copyProperties(detail, output);
			
			output.setSparePartsLangLang(detail.getSpareParts());
			output.setOutWarehouseType(detail.getOutWarehouseType());
			output.setOutWarehouseTypeLangLang(detail.getOutWarehouseType());
			output.setInWarehouseType(detail.getInWarehouseType());
			output.setInWarehouseTypeLangLang(detail.getInWarehouseType());
			
			EditSparePartsInput editSparePartsInput=new EditSparePartsInput();
			editSparePartsInput.setKey(detail.getSpareParts());
			SparePartsBriefOutput sparePartsBrief = sparePartsService.getSparePartsBrief(editSparePartsInput);
			// 备件号
			output.setSparePartsNo(sparePartsBrief.getSparePartsNo());
			if (detail.getSparePartsBatch()!=null) {
				// 查询库位
				StockOutput stockOutput = stockService.getStockByBatch(detail.getSparePartsBatch(), detail.getSpareParts());
				//output.setStorageLocation(stockOutput.getStorageLocation());
				// 备件号
				//output.setSparePartsNo(stockOutput.getSparePartsNo());
				// 查询所属公司
				output.setCompanyLangLang(borrowLend.getCompany());
				// 库存
				output.setSurplusNum(stockOutput.getSurplusNum());
			}
			
			output.setSparePartsLangLang(detail.getSpareParts());
			outputs.add(output);
		});
		// 获取总条数
		int total = borrowLendDetailExtDao.getTotal();

		// return page
		page.setTotalItemCount(total);
		page.setDataList(outputs);
		return page;

	}

	/**
	 * 借件单还库
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void lendRepay(BorrowLendInput input) {
		// 查询借出单
		BorrowLend borrowLend = borrowLendDao.selectByPrimaryKey(input.getWareBorrowLendSlipId());
		// 只有全部出库或者部分还库的才能还库
		if (StaffBorrowStatusEnum.ALL_OUT.getCode().equals(borrowLend.getBillStatus())
				|| StaffBorrowStatusEnum.PART_RETURN.getCode().equals(borrowLend.getBillStatus())) {
			// 默认全部还库
			String billStatus = StaffBorrowStatusEnum.ALL_RETURN.getCode();
			// 查询明细
			BorrowLendDetailExample example = new BorrowLendDetailExample();
			example.createCriteria().andWareBorrowLendSlipEqualTo(borrowLend.getWareBorrowLendSlipId());
			for (BorrowLendDetail detail : borrowLendDetailDao.selectByExample(example)) {
				// 本次还库数量
				double repayNum = input.getDetails().stream()
						.filter(di -> di.getWareBorrowSlipDetailId().equals(detail.getWareBorrowSlipDetailId()))
						.map(di -> di.getRepayNum()).findFirst().orElse(WarehouseConstants.DOUBLE_ZERO);
				// 总还库数量
				double totalRepayNum = detail.getReturnNum() + repayNum;
				// 借件数量
				double borrowNum = detail.getBorrowNum();
				if (totalRepayNum > borrowNum) {
					// 若还库数量+上箱数量>借件数量则视为异常操作
					throw new RuntimeException("numOut");
				} else if (totalRepayNum == borrowNum) {
					// 若还库数量+上箱数量=借件数量则该备件全部还库
					// detail.setBillStatus(StaffBorrowStatusEnum.ALL_RETURN.getCode());
				} else {
					// 若还库数量+上箱数量>借件数量则该备件部分还库,同时修改借件单还库状态为部分还库
					billStatus = StaffBorrowStatusEnum.PART_RETURN.getCode();
				}
				// 更新还库数量
				detail.setReturnNum(totalRepayNum);
				// 更新明细状态
				borrowLendDetailDao.updateByPrimaryKeySelective(detail);
			}
			// 更新借件单单据状态
			borrowLend.setBillStatus(billStatus);
			borrowLendDao.updateByPrimaryKeySelective(borrowLend);

		}

	}

	/**
	 * 借出转售
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void lendSale(BorrowLendInput input) {
		// 查询借出单
		BorrowLend borrowLend = borrowLendDao.selectByPrimaryKey(input.getWareBorrowLendSlipId());
		// 只有全部出库或者部分还库的才能转售
		if (StaffBorrowStatusEnum.ALL_OUT.getCode().equals(borrowLend.getBillStatus())
				|| StaffBorrowStatusEnum.PART_RETURN.getCode().equals(borrowLend.getBillStatus())) {
			// 默认全部还库
			String billStatus = StaffBorrowStatusEnum.ALL_RETURN.getCode();

			// 生成售出单
			LendSale lendSale = new LendSale();
			BeanUtils.copyProperties(input, lendSale);
			lendSale.setBorrowLendId(input.getWareBorrowLendSlipId());
			lendSale.setIsDel(PlatformConstants.ISDEL_NO);
			// 创建时间
			Date dete = new Date();
			lendSale.setCreateTime(dete);
			// 创建用户
			Integer userId = getCurrentUserId();
			lendSale.setCreateUser(userId);
			lendSaleDao.insertSelective(lendSale);

			// 查询明细
			BorrowLendDetailExample example = new BorrowLendDetailExample();
			example.createCriteria().andWareBorrowLendSlipEqualTo(borrowLend.getWareBorrowLendSlipId());
			List<BorrowLendDetail> details = borrowLendDetailDao.selectByExample(example);
			for (BorrowLendDetailInput di : input.getDetails()) {
				BorrowLendDetail borrowLendDetail = details.stream()
						.filter(detail -> detail.getWareBorrowSlipDetailId().equals(di.getWareBorrowSlipDetailId()))
						.findFirst().orElseGet(null);
				// 总还库数量
				double totalReturnNum = new BigDecimal(di.getSaleNum())
						.add(new BigDecimal(borrowLendDetail.getReturnNum())).doubleValue();
				// 借件数量
				double borrowNum = borrowLendDetail.getBorrowNum();
				if (totalReturnNum > borrowNum) {
					// 若还库数量+上箱数量>借件数量则视为异常操作
					throw new RuntimeException("numOut");
				} else if (totalReturnNum == borrowNum) {
					// 若还库数量+上箱数量=借件数量则该备件全部还库
					// detail.setBillStatus(StaffBorrowStatusEnum.ALL_RETURN.getCode());
				} else {
					// 若还库数量+上箱数量>借件数量则该备件部分还库,同时修改借件单还库状态为部分还库
					billStatus = StaffBorrowStatusEnum.PART_RETURN.getCode();
				}
				// 更新还库数量
				borrowLendDetail.setReturnNum(totalReturnNum);
				// 更新明细状态
				borrowLendDetailDao.updateByPrimaryKeySelective(borrowLendDetail);

				LendSaleDetail lendSaleDetail = new LendSaleDetail();
				BeanUtils.copyProperties(di, lendSaleDetail);
				lendSaleDetail.setLendSaleId(lendSale.getLendSaleId());
				lendSaleDetail.setBorrowLendDetailId(di.getWareBorrowSlipDetailId());
				lendSaleDetail.setCreateTime(dete);
				lendSaleDetail.setCreateUser(userId);
				lendSaleDetail.setIsDel(PlatformConstants.ISDEL_NO);
				lendSaleDetailDao.insertSelective(lendSaleDetail);

			}

			// 更新借出单单据状态
			borrowLend.setBillStatus(billStatus);
			borrowLendDao.updateByPrimaryKeySelective(borrowLend);

		}

	}

}
