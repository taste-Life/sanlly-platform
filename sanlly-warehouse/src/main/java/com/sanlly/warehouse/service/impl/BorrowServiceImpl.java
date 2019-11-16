package com.sanlly.warehouse.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.sanlly.warehouse.models.input.stock.SearchStockInput;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.enums.StockoutEnum;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.warehouse.constants.WarehouseConstants;
import com.sanlly.warehouse.dao.BorrowLendDetailExtMapper;
import com.sanlly.warehouse.dao.BorrowLendDetailMapper;
import com.sanlly.warehouse.dao.BorrowLendExtMapper;
import com.sanlly.warehouse.dao.BorrowLendMapper;
import com.sanlly.warehouse.dao.BorrowRepayDetailMapper;
import com.sanlly.warehouse.dao.BorrowRepayMapper;
import com.sanlly.warehouse.entity.BorrowLend;
import com.sanlly.warehouse.entity.BorrowLendDetail;
import com.sanlly.warehouse.entity.BorrowLendDetailExample;
import com.sanlly.warehouse.entity.BorrowRepay;
import com.sanlly.warehouse.entity.BorrowRepayDetail;
import com.sanlly.warehouse.entity.BorrowRepayDetailExample;
import com.sanlly.warehouse.entity.BorrowRepayExample;
import com.sanlly.warehouse.enums.BorrowStatusEnum;
import com.sanlly.warehouse.enums.BorrowTypeEnum;
import com.sanlly.warehouse.models.input.borrowlend.BorrowLendInput;
import com.sanlly.warehouse.models.input.borrowlend.SearchBorrowLendInput;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.stockin.AddStockinDetailInput;
import com.sanlly.warehouse.models.input.stockin.SearchStockinInput;
import com.sanlly.warehouse.models.input.stockin.StockInInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutDetailInput;
import com.sanlly.warehouse.models.input.stockout.StockOutInput;
import com.sanlly.warehouse.models.output.borrowlend.BorrowLendDetailOutput;
import com.sanlly.warehouse.models.output.borrowlend.BorrowLendOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsBriefOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.models.output.stockin.StockinDetailOutput;
import com.sanlly.warehouse.models.output.stockin.StockinOutput;
import com.sanlly.warehouse.service.BillTypeService;
import com.sanlly.warehouse.service.BorrowService;
import com.sanlly.warehouse.service.WareSparePartsService;
import com.sanlly.warehouse.service.WareStockService;
import com.sanlly.warehouse.service.WareStockinService;
import com.sanlly.warehouse.service.WareStockoutService;

/**
 * 借入service
 * 
 * @author lishzh
 *
 */
@Service
public class BorrowServiceImpl extends BaseServiceImpl implements BorrowService {

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
	private WareStockinService stockinService;

	@Autowired
	private BorrowLendDetailExtMapper borrowLendDetailExtDao;

	@Autowired
	private BorrowRepayMapper borrowRepayDao;

	@Autowired
	private BorrowRepayDetailMapper borrowRepayDetailDao;

	@Autowired
	private WareStockoutService stockoutService;

	@Autowired
	WareStockService stockService;
	

	/**
	 * 添加借入单
	 */
	@Override
	@Transactional
	public void addBorrow(BorrowLendInput input) {
		BorrowLend borrowLend = new BorrowLend();
		BeanUtils.copyProperties(input, borrowLend);
		// 生成单号
		String billNumber = billTypeService.getBillNumber(WarehouseConstants.BILL_BORROW);
		if (StringUtils.isEmpty(billNumber)) {
			throw new SqlException("insertFail");
		}
		borrowLend.setBorrowLendNo(billNumber);
		borrowLend.setCompany(getCurrentCompanyKey());
		// 借入单
		borrowLend.setCategory(WarehouseConstants.BORROW_LEND_BORROW);
		// 未审核
		borrowLend.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
		// 待入库
		borrowLend.setBillStatus(BorrowStatusEnum.NOT_IN.getCode());
		// 未删除
		borrowLend.setIsDel(PlatformConstants.ISDEL_NO);
		// 创建时间
		Date dete = new Date();
		borrowLend.setCreateTime(dete);
		// 创建用户
		Integer userId = getCurrentUserId();
		borrowLend.setCreateUser(userId);
		// 保存借入单
		borrowLendDao.insertSelective(borrowLend);

		// 保存明细
		input.getDetails().forEach(detailInput -> {
			BorrowLendDetail detail = new BorrowLendDetail();
			BeanUtils.copyProperties(detailInput, detail);
			// 借入单id
			detail.setWareBorrowLendSlip(borrowLend.getWareBorrowLendSlipId());
			// 退库数量0.0
			detail.setReturnNum(WarehouseConstants.DOUBLE_ZERO);
			// 还件数量
			detail.setRepayNum(WarehouseConstants.DOUBLE_ZERO);
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
	 * 修改借入单
	 */
	@Override
	@Transactional
	public void editBorrow(BorrowLendInput input) {
		// 查询要修改的借入单
		BorrowLend borrowLend = borrowLendDao.selectByPrimaryKey(input.getWareBorrowLendSlipId());
		// 只有未审核和已驳回的才能修改
		if (AuditStateEnum.UNAUDIT.getCode().equals(borrowLend.getAuditStatus())
				|| AuditStateEnum.REJECTED.getCode().equals(borrowLend.getAuditStatus())) {
			BeanUtils.copyProperties(input, borrowLend);
			// 未审核
			borrowLend.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
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
				// 退库数量0.0
				detail.setReturnNum(WarehouseConstants.DOUBLE_ZERO);
				// 还件数量
				detail.setRepayNum(WarehouseConstants.DOUBLE_ZERO);
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
	 * 删除借入单
	 */
	@Override
	@Transactional
	public void deleteBorrow(List<Integer> ids) {
		ids.forEach(id -> {
			// 查询要删除的借入单
			BorrowLend borrowLend = borrowLendDao.selectByPrimaryKey(id);
			// 只有待入库的才能删除
			if (AuditStateEnum.UNAUDIT.getCode().equals(borrowLend.getAuditStatus())
					|| AuditStateEnum.REJECTED.getCode().equals(borrowLend.getAuditStatus())) {
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
	 * 根据id获取借入单
	 */
	@Override
	public BorrowLendOutput getBorrowById(Integer id) {
		// 根据主键查询
		BorrowLend borrowLend = borrowLendDao.selectByPrimaryKey(id);
		// copy
		BorrowLendOutput output = new BorrowLendOutput();
		BeanUtils.copyProperties(borrowLend, output);
		// 审核状态
		output.setAuditStatusLangLang(borrowLend.getAuditStatus());
		// 场站
		output.setYardLangLang(borrowLend.getYard());
		// 入库仓库
		output.setInWarehouseLangLang(borrowLend.getInWarehouse());
		// 借件类型
		output.setBorrowTypeLangLang(borrowLend.getBorrowType());
		// 单据状态
		output.setBillStatusLangLang(borrowLend.getBillStatus());
		// 制单人
		output.setCreateUser(getUserNameByUserId(borrowLend.getCreateUser()));
		// 明细
		output.setDetails(getDetailOutputsById(id));

		return output;
	}

	/**
	 * 获取借入单列表
	 */
	@Override
	public PagedList<BorrowLendOutput> getBorrows(SearchBorrowLendInput input) {
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
		map.put("category", WarehouseConstants.BORROW_LEND_BORROW);
		// 分页参数
		map.put("limitStart", page.getLimitStart());
		map.put("limitEnd", page.getLimitEnd());

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
	 * 根据借入单id获取detail outputs
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
			detailOutput.setInWarehouseTypeLangLang(detail.getInWarehouseType());
			detailOutputs.add(detailOutput);
		});

		return detailOutputs;

	}

	/**
	 * 借入单审核
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void auditBorrow(BorrowLendInput input) {
		// 查询要审核的借入单
		BorrowLend borrowLend = borrowLendDao.selectByPrimaryKey(input.getWareBorrowLendSlipId());
		// 只有未审核和已驳回的借入单才能审核
		if (AuditStateEnum.UNAUDIT.getCode().equals(borrowLend.getAuditStatus())
				|| AuditStateEnum.REJECTED.getCode().equals(borrowLend.getAuditStatus())) {
			// 审核状态
			borrowLend.setAuditStatus(input.getAuditStatus());
			// 驳回原因
			borrowLend.setReasonsRejection(input.getReasonsRejection());
			// 更新
			borrowLendDao.updateByPrimaryKeySelective(borrowLend);
		} else {
			throw new RuntimeException("auditFail");
		}
	}

	/**
	 * 入库
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void putInWarehouse(Integer id) {
		// 查询要入库的借入单
		BorrowLend borrowLend = borrowLendDao.selectByPrimaryKey(id);
		// 只有已审核的才能入库
		if (AuditStateEnum.AUDITED.getCode().equals(borrowLend.getAuditStatus())) {
			// 如果是代管库借入单,则代管库出库
			if (BorrowTypeEnum.ESCROW.getCode().equals(borrowLend.getBorrowType())) {
				// set出库参数
				StockOutInput stockOutInput = new StockOutInput();
				stockOutInput.setNo(borrowLend.getBorrowLendNo());
				stockOutInput.setCompany(borrowLend.getCompany());
				stockOutInput.setWarehouse(borrowLend.getOutWarehouse());
				// 获取单据类型
				String billType = billTypeService.getBillTypeKeyByName(WarehouseConstants.BILL_BORROW);
				if (StringUtils.isEmpty(billType)) {
					throw new SqlException("insertFail");
				}
				stockOutInput.setBillType(billType);

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
					AddStockoutDetailInput.setYard(borrowLend.getYard());
					stockoutDetailInputList.add(AddStockoutDetailInput);
				});
				AddStockoutDetailInput[] addStockoutDetailInputArrays = stockoutDetailInputList
						.toArray(new AddStockoutDetailInput[stockoutDetailInputList.size()]);
				stockOutInput.setStockoutDetailInputList(addStockoutDetailInputArrays);

				// 直接出库
				stockoutService.directOut(stockOutInput);

			}

			// 直接入库
			// set params
			BorrowLendDetailExample example = new BorrowLendDetailExample();
			example.createCriteria().andWareBorrowLendSlipEqualTo(borrowLend.getWareBorrowLendSlipId());
			List<BorrowLendDetail> borrowDetails = borrowLendDetailDao.selectByExample(example);
			BigDecimal totalPrice = new BigDecimal(WarehouseConstants.DOUBLE_ZERO);
			Double totalNum = WarehouseConstants.DOUBLE_ZERO;
			List<AddStockinDetailInput> stockinDetailInputs = new ArrayList<>();
			for (BorrowLendDetail bd : borrowDetails) {
				AddStockinDetailInput stockinDetail = new AddStockinDetailInput();
				stockinDetail.setSpareParts(bd.getSpareParts());
				stockinDetail.setEntryNum(bd.getBorrowNum());
				stockinDetail.setStorageLocation(bd.getInStorageLocation());
				stockinDetail.setWarehouseType(bd.getInWarehouseType());
				stockinDetail.setEntryPrice(bd.getBorrowPrice());
				
				if (BorrowTypeEnum.ESCROW.getCode().equals(borrowLend.getBorrowType())) {
					stockinDetail.setSparePartsNo(bd.getStockinSpareParts());
					stockinDetail.setSparePartsName(bd.getStockinSparePartsName());
				}else {
					SparePartsOutput spareParts = sparePartsService
							.getSpareParts(new EditSparePartsInput(stockinDetail.getSpareParts()));
					stockinDetail.setSparePartsNo(spareParts.getSparePartsNo());
					stockinDetail.setSparePartsName(spareParts.getSparePartsName());
				}

				//stockinDetail.setStockinBatch();

				totalPrice = totalPrice.add(bd.getBorrowPrice());
				totalNum += bd.getBorrowNum();
				stockinDetailInputs.add(stockinDetail);
			}
			StockInInput input = new StockInInput();
			// 源单号
			input.setNo(borrowLend.getBorrowLendNo());
			//
			String billType = billTypeService.getBillTypeKeyByName(WarehouseConstants.BILL_BORROW);
			input.setBillType(billType);

			input.setCompany(borrowLend.getCompany());

			input.setEntryWarehouse(borrowLend.getInWarehouse());

			input.setTotalAmount(totalPrice);

			input.setBillTotalAmount(totalPrice);

			input.setEntryedNum(totalNum);
			input.setStockinDetail(stockinDetailInputs.toArray(new AddStockinDetailInput[stockinDetailInputs.size()]));
			stockinService.borrowIn(input);

			borrowLend.setBillStatus(BorrowStatusEnum.ALL_IN.getCode());
			borrowLendDao.updateByPrimaryKeySelective(borrowLend);

			SearchStockinInput searchStockinInput = new SearchStockinInput(1, 1);
			searchStockinInput.setNo(borrowLend.getBorrowLendNo());
			// searchStockinInput.set
			PagedList<StockinOutput> pagedList = stockinService.stockinPageList(searchStockinInput);

			if (!CollectionUtils.isEmpty(pagedList.getDataList())) {
				StockinOutput stockinOutput = pagedList.getDataList().get(0);
				// borrowDetails
				for (BorrowLendDetail bd : borrowDetails) {
					bd.setSparePartsBatch(stockinOutput.getStockinDetail()
							.stream()
							.filter(sd -> sd.getSpareParts().equals(bd.getSpareParts()))
							.findFirst()
							.orElse(new StockinDetailOutput())
							.getStockinBatch());
					borrowLendDetailDao.updateByPrimaryKeySelective(bd);
				}
			}

		}
		// TODO Auto-generated method stub

	}

	/**
	 * 借入未还
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
		map.put("category", WarehouseConstants.BORROW_LEND_BORROW);
		// 分页参数
		map.put("limitStart", page.getLimitStart());
		map.put("limitEnd", page.getLimitEnd());

		// 查询未还
		List<BorrowLendDetailOutput> outputs = new ArrayList<>();
		borrowLendDetailExtDao.selectByCondition(map).forEach(detail -> {
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
			// 查询所属公司
			//output.setCompanyLangLang(sparePartsBrief.getCompany());
			if (detail.getSparePartsBatch()!=null) {
				// 查询库位
				StockOutput stockOutput = stockService.getStockByBatch(detail.getSparePartsBatch(), detail.getSpareParts());
				//output.setStorageLocation(stockOutput.getStorageLocation());
				
				// 库存
				output.setSurplusNum(stockOutput.getSurplusNum());
			}
			
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
	 * 还件申请
	 */
	@Override
	@Transactional
	public void repay(BorrowLendInput input) {
		BorrowRepay borrowRepay = new BorrowRepay();
		BeanUtils.copyProperties(input, borrowRepay);
		// 借入单id
		borrowRepay.setBorrowLendId(input.getWareBorrowLendSlipId());
		// 待出库
		borrowRepay.setBillStatus(StockoutEnum.NOTOUT.getCode());
		// 未删除
		borrowRepay.setIsDel(PlatformConstants.ISDEL_NO);
		// 创建时间
		Date dete = new Date();
		borrowRepay.setCreateTime(dete);
		// 创建用户
		Integer userId = getCurrentUserId();
		borrowRepay.setCreateUser(userId);
		// 保存
		borrowRepayDao.insertSelective(borrowRepay);

		// 保存明细
		input.getDetails().forEach(detailInput -> {
			BorrowRepayDetail detail = new BorrowRepayDetail();
			BeanUtils.copyProperties(detailInput, detail);
			detail.setBorrowRepayId(borrowRepay.getBorrowRepayId());
			detail.setBorrowLendDetailId(detailInput.getWareBorrowSlipDetailId());
			// 未删除
			detail.setIsDel(PlatformConstants.ISDEL_NO);
			// 创建时间
			detail.setCreateTime(dete);
			// 创建用户
			detail.setCreateUser(userId);
			borrowRepayDetailDao.insertSelective(detail);
		});

	}

	@Override
	public void editRepay(BorrowLendInput input) {
		// 查询要修改的借入单
		BorrowRepay borrowRepay = borrowRepayDao.selectByPrimaryKey(input.getBorrowRepayId());
		// 未出库
		if (StockoutEnum.NOTOUT.getCode().equals(borrowRepay.getBillStatus())) {
			BeanUtils.copyProperties(input, borrowRepay);
			// 修改时间
			Date dete = new Date();
			borrowRepay.setUpdateTime(dete);
			// 修改用户
			Integer userId = getCurrentUserId();
			borrowRepay.setUpdateUser(userId);
			// 更新
			borrowRepayDao.updateByPrimaryKeySelective(borrowRepay);

			// 删除原明细
			BorrowRepayDetailExample example = new BorrowRepayDetailExample();
			example.createCriteria().andBorrowRepayIdEqualTo(input.getBorrowRepayId())
					.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			borrowRepayDetailDao.deleteByExample(example);

			// 保存新明细
			input.getDetails().forEach(detailInput -> {
				BorrowRepayDetail detail = new BorrowRepayDetail();
				BeanUtils.copyProperties(detailInput, detail);
				// 借入单id
				detail.setBorrowLendDetailId(detailInput.getWareBorrowSlipDetailId());
				// 还件数量0.0
				// detail.setReturnNum(WarehouseConstants.DOUBLE_ZERO);
				// 未删除
				detail.setIsDel(PlatformConstants.ISDEL_NO);
				// 创建时间
				detail.setCreateTime(borrowRepay.getCreateTime());
				// 创建用户
				detail.setCreateUser(borrowRepay.getCreateUser());
				// 修改时间
				detail.setUpdateTime(dete);
				// 修改用户
				detail.setUpdateUser(userId);
				// 保存
				borrowRepayDetailDao.insertSelective(detail);
			});

		}

	}

	/**
	 * 删除还件申请
	 */
	@Override
	public void deleteRepay(List<Integer> ids) {
		ids.forEach(id -> {
			// 查询要删除的借入单
			BorrowRepay borrowRepay = borrowRepayDao.selectByPrimaryKey(id);
			// 只有待入库的才能删除
			if (StockoutEnum.NOTOUT.getCode().equals(borrowRepay.getBillStatus())) {
				// 标记删除
				borrowRepay.setIsDel(PlatformConstants.ISDEL_YES);
				// 更新
				borrowRepayDao.updateByPrimaryKeySelective(borrowRepay);

				// 删除明细
				BorrowRepayDetailExample example = new BorrowRepayDetailExample();
				example.createCriteria().andBorrowRepayIdEqualTo(id);
				// 标记删除
				BorrowRepayDetail detail = new BorrowRepayDetail();
				detail.setIsDel(PlatformConstants.ISDEL_YES);
				// 更新
				borrowRepayDetailDao.updateByExampleSelective(detail, example);
			}
		});

	}

	@Override
	public BorrowLendOutput getRepayById(Integer id) {
		// 根据主键查询
		BorrowLend borrowLend = borrowLendDao.selectByPrimaryKey(id);
		// copy
		BorrowLendOutput output = new BorrowLendOutput();
		BeanUtils.copyProperties(borrowLend, output);
		// 借件类型
		output.setBorrowTypeLangLang(borrowLend.getBorrowType());
		// 单据状态
		output.setBillStatusLangLang(borrowLend.getBillStatus());
		// 制单人
		output.setCreateUser(getUserNameByUserId(borrowLend.getCreateUser()));
		// 明细
		output.setDetails(getDetailOutputsById(id));

		return output;
	}

	/**
	 * 获取还件申请列表
	 */
	@Override
	public PagedList<BorrowLendOutput> getRepays(SearchBorrowLendInput input) {
		// 分页查询
		BorrowRepayExample example = new BorrowRepayExample();
		example.setOrderByClause("create_time desc");
		BorrowRepayExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		// 根据起止日期
		if (input.getStartDate() != null && input.getEndDate() != null) {
			criteria.andCreateTimeGreaterThanOrEqualTo(input.getStartDate());
			criteria.andCreateTimeLessThanOrEqualTo(input.getEndDate());
		}

		// 查询总条数
		// borrowRepayDao
		Integer total = (int) borrowRepayDao.countByExample(example);

		// 分页查询
		PagedList<BorrowLendOutput> page = new PagedList<>(input.getPageIndex(), input.getPageSize(), total);
		example.setLimitStart(page.getLimitStart());
		example.setLimitEnd(page.getLimitEnd());
		List<BorrowRepay> borrowRepays = borrowRepayDao.selectByExample(example);
		List<BorrowLendOutput> outputs = new ArrayList<>();

		borrowRepays.forEach(borrowRepay -> {
			// 拷贝属性
			BorrowLendOutput output = getBorrowById(borrowRepay.getBorrowLendId());
			output.setBorrowRepayId(borrowRepay.getBorrowRepayId());
			output.setBillStatus(borrowRepay.getBillStatus());
			output.setBillStatusLangLang(borrowRepay.getBillStatus());
			List<BorrowLendDetailOutput> detailOutputs = new ArrayList<>();
			for (BorrowLendDetailOutput dot : getRepayDetailOutputsById(borrowRepay.getBorrowRepayId())) {
				BorrowLendDetailOutput bldo = output.getDetails().stream()
						.filter(d -> d.getWareBorrowSlipDetailId().equals(dot.getWareBorrowSlipDetailId())).findFirst()
						.orElse(null);
				bldo.setRepayNum(dot.getRepayNum());
				bldo.setRepayPrice(dot.getRepayPrice());
				bldo.setBorrowPrice(dot.getBorrowPrice());
				detailOutputs.add(bldo);
			}
			// 查询明细
			output.setDetails(detailOutputs);
			outputs.add(output);
		});

		page.getDataList().addAll(outputs);
		return page;
	}

	/**
	 * 根据还件申请id获取该申请单
	 *
	 * @author lishzh
	 * @param 还件申请id borrowRepayId
	 * @return BorrowRepayDetail
	 */
	List<BorrowRepayDetail> getRepayDetailsById(Integer borrowRepayId) {
		BorrowRepayDetailExample example = new BorrowRepayDetailExample();
		example.createCriteria().andBorrowRepayIdEqualTo(borrowRepayId);
		return borrowRepayDetailDao.selectByExample(example);
	}

	/**
	 * 根据借入单还件id获取还件明细
	 *
	 * @author lishzh
	 * @param id
	 * @return 明细output
	 */
	public List<BorrowLendDetailOutput> getRepayDetailOutputsById(Integer id) {
		// 查询明细

		BorrowRepayDetailExample example = new BorrowRepayDetailExample();
		example.createCriteria().andBorrowRepayIdEqualTo(id);
		List<BorrowRepayDetail> details = borrowRepayDetailDao.selectByExample(example);
		List<BorrowLendDetailOutput> detailOutputs = new ArrayList<>();
		details.forEach(detail -> {
			BorrowLendDetail borrowLendDetail = borrowLendDetailDao.selectByPrimaryKey(detail.getBorrowLendDetailId());
			BorrowLendDetailOutput detailOutput = new BorrowLendDetailOutput();
			BeanUtils.copyProperties(borrowLendDetail, detailOutput);
			EditSparePartsInput input = new EditSparePartsInput();
			input.setKey(detail.getSpareParts());
			detailOutput.setSparePartsNo(sparePartsService.getSparePartsBrief(input).getSparePartsNo());
			detailOutput.setSparePartsLangLang(detail.getSpareParts());
			detailOutput.setRepayNum(detail.getRepayNum());
			detailOutput.setRepayPrice(detail.getRepayPrice());
			detailOutput.setWareBorrowSlipDetailId(detail.getBorrowLendDetailId());
			detailOutput.setSpareParts(detail.getSpareParts());
			detailOutput.setSparePartsBatch(detail.getSparePartsBatch());
			detailOutputs.add(detailOutput);
		});

		return detailOutputs;

	}

	/**
	 * 还件出库
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void repayOut(Integer id) {
		BorrowRepay borrowRepay = borrowRepayDao.selectByPrimaryKey(id);
		// 只有未出库才能出库
		if (StockoutEnum.NOTOUT.getCode().equals(borrowRepay.getBillStatus())) {
			BorrowLend borrowLend = borrowLendDao.selectByPrimaryKey(borrowRepay.getBorrowLendId());
			// 直接出库
			// set出库参数
			StockOutInput stockOutInput = new StockOutInput();
			stockOutInput.setNo(borrowLend.getBorrowLendNo());
			stockOutInput.setCompany(borrowLend.getCompany());
			// 获取单据类型
			String billType = billTypeService.getBillTypeKeyByName(WarehouseConstants.BILL_BORROW);
			if (StringUtils.isEmpty(billType)) {
				throw new SqlException("insertFail");
			}
			stockOutInput.setBillType(billType);

			// set出库明细
			List<AddStockoutDetailInput> stockoutDetailInputList = new ArrayList<>();
			List<BorrowRepayDetail> repayDetails = getRepayDetailsById(borrowRepay.getBorrowRepayId());
			repayDetails.forEach(detail -> {
				AddStockoutDetailInput AddStockoutDetailInput = new AddStockoutDetailInput();
				AddStockoutDetailInput.setStockoutNum(detail.getRepayNum());
				AddStockoutDetailInput.setSparePartsBatch(detail.getSparePartsBatch());
				AddStockoutDetailInput.setSpareParts(detail.getSpareParts());
				stockoutDetailInputList.add(AddStockoutDetailInput);
			});
			AddStockoutDetailInput[] addStockoutDetailInputArrays = stockoutDetailInputList
					.toArray(new AddStockoutDetailInput[stockoutDetailInputList.size()]);
			stockOutInput.setStockoutDetailInputList(addStockoutDetailInputArrays);

			// 直接出库
			stockoutService.directOut(stockOutInput);

			// 如果是代管借件则代管库入库
			if (BorrowTypeEnum.ESCROW.getCode().equals(borrowLend.getBorrowType())) {
				// 直接入库 set params
				BigDecimal totalPrice = new BigDecimal(WarehouseConstants.DOUBLE_ZERO);
				Double totalNum = WarehouseConstants.DOUBLE_ZERO;
				List<AddStockinDetailInput> stockinDetailInputs = new ArrayList<>();
				for (BorrowRepayDetail borrowRepayDetail : repayDetails) {
					BorrowLendDetail borrowLendDetail = borrowLendDetailDao
							.selectByPrimaryKey(borrowRepayDetail.getBorrowLendDetailId());
					AddStockinDetailInput stockinDetail = new AddStockinDetailInput();
					stockinDetail.setSpareParts(borrowRepayDetail.getSpareParts());
					stockinDetail.setEntryNum(borrowRepayDetail.getRepayNum());
					stockinDetail.setStorageLocation(borrowLendDetail.getOutStorageLocation());
					stockinDetail.setWarehouseType(borrowLendDetail.getOutWarehouseType());
					stockinDetail.setEntryPrice(borrowRepayDetail.getRepayPrice());
					totalPrice = totalPrice.add(borrowRepayDetail.getRepayPrice());
					totalNum += borrowRepayDetail.getRepayNum();
					stockinDetailInputs.add(stockinDetail);
				}
				StockInInput input = new StockInInput();
				// 源单号
				input.setNo(borrowLend.getBorrowLendNo());
				//
				input.setBillType(billTypeService.getBillTypeKeyByName(WarehouseConstants.BILL_BORROW));

				input.setCompany(borrowLend.getCompany());

				input.setEntryWarehouse(borrowLend.getOutWarehouse());

				input.setTotalAmount(totalPrice);

				input.setBillTotalAmount(totalPrice);

				input.setEntryedNum(totalNum);
				input.setStockinDetail(
						stockinDetailInputs.toArray(new AddStockinDetailInput[stockinDetailInputs.size()]));
				stockinService.directIn(input);
			}

			// 更新借件单出库状态
			borrowRepay.setBillStatus(StockoutEnum.YESOUT.getCode());
			borrowRepayDao.updateByPrimaryKeySelective(borrowRepay);

			String billStatus = BorrowStatusEnum.ALL_REPAY.getCode();
			for (BorrowLendDetailOutput detail : getDetailOutputsById(borrowRepay.getBorrowLendId())) {
				Double repayNum = Optional
						.ofNullable(repayDetails.stream()
								.filter(rd -> rd.getBorrowLendDetailId().equals(detail.getWareBorrowSlipDetailId()))
								.findFirst().orElse(new BorrowRepayDetail()).getRepayNum())
						.orElse(WarehouseConstants.DOUBLE_ZERO);
				// 总还件数量
				double totalRepayNum = new BigDecimal(Optional
						.ofNullable(repayDetails.stream()
								.filter(rd -> rd.getBorrowLendDetailId().equals(detail.getWareBorrowSlipDetailId()))
								.findFirst()
								.orElse(new BorrowRepayDetail())
								.getRepayNum())
						.orElse(WarehouseConstants.DOUBLE_ZERO))
						.add(new BigDecimal(detail.getRepayNum()))
								.add(new BigDecimal(detail.getReturnNum())).doubleValue();
				// 还件数量超出借件数量
				if (totalRepayNum > detail.getBorrowNum()) {
					throw new RuntimeException("outNum");
				} else if (totalRepayNum == detail.getBorrowNum()) {

				} else if (totalRepayNum < detail.getBorrowNum()) {
					billStatus = BorrowStatusEnum.PART_REPAY.getCode();
				}
				BorrowLendDetail borrowLendDetail = new BorrowLendDetail();
				borrowLendDetail.setWareBorrowSlipDetailId(detail.getWareBorrowSlipDetailId());
				borrowLendDetail.setRepayNum(totalRepayNum);
				borrowLendDetailDao.updateByPrimaryKeySelective(borrowLendDetail);

			}
			borrowLend.setBillStatus(billStatus);
			borrowLendDao.updateByPrimaryKeySelective(borrowLend);
		}

		// TODO Auto-generated method stub

	}

	/**
	 * 获取最新入库单价
	 *
	 * @param spareParts
	 * @author lishzh
	 */
	@Override
	public List<BigDecimal> getNewPrice(List<String> spareParts) {
		SearchStockInput input=new SearchStockInput();
		String company = getCurrentCompanyKey();
		return spareParts.stream().map(s -> {
			input.setCompany(company);
			input.setSpareParts(s);
			StockOutput so = stockService.getStock(input).stream().findFirst().orElseGet(StockOutput::new);
			return Optional.ofNullable(so.getUnitPrice()).orElseGet(() -> new BigDecimal(WarehouseConstants.DOUBLE_ZERO));

		}).collect(Collectors.toList());
	}
}
