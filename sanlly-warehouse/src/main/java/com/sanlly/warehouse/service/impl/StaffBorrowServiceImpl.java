package com.sanlly.warehouse.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.sanlly.warehouse.models.input.staffborrow.StaffBorrowDetailInput;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.warehouse.constants.WarehouseConstants;
import com.sanlly.warehouse.dao.StaffBorrowDetailExtMapper;
import com.sanlly.warehouse.dao.StaffBorrowDetailMapper;
import com.sanlly.warehouse.dao.StaffBorrowExtMapper;
import com.sanlly.warehouse.dao.StaffBorrowMapper;
import com.sanlly.warehouse.entity.StaffBorrow;
import com.sanlly.warehouse.entity.StaffBorrowDetail;
import com.sanlly.warehouse.entity.StaffBorrowDetailExample;
import com.sanlly.warehouse.entity.StaffBorrowExample;
import com.sanlly.warehouse.enums.StaffBorrowStatusEnum;
import com.sanlly.warehouse.models.input.staffborrow.SearchStaffBorrowInput;
import com.sanlly.warehouse.models.input.staffborrow.StaffborrowInput;
import com.sanlly.warehouse.models.input.stockin.AddStockinDetailInput;
import com.sanlly.warehouse.models.input.stockin.StockInInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutDetailInput;
import com.sanlly.warehouse.models.input.stockout.StockOutInput;
import com.sanlly.warehouse.models.output.staffborrow.StaffBorrowDetailOutput;
import com.sanlly.warehouse.models.output.staffborrow.StaffBorrowOutput;
import com.sanlly.warehouse.service.BillTypeService;
import com.sanlly.warehouse.service.StaffBorrowService;
import com.sanlly.warehouse.service.WareStockService;
import com.sanlly.warehouse.service.WareStockinService;
import com.sanlly.warehouse.service.WareStockoutService;

/**
 * 员工借件service
 * 
 * @author lishzh
 *
 */
@Service
public class StaffBorrowServiceImpl extends BaseServiceImpl implements StaffBorrowService {

	@Autowired
	StaffBorrowMapper staffBorrowDao;

	@Autowired
	StaffBorrowExtMapper staffBorrowExtDao;

	@Autowired
	StaffBorrowDetailMapper staffBorrowDetailDao;

	@Autowired
	StaffBorrowDetailExtMapper staffBorrowDetailExtDao;

	@Autowired
	BillTypeService billTypeService;

	@Autowired
	WareStockService stockService;

	@Autowired
	private WareStockoutService stockoutService;

	@Autowired
	private WareStockinService stockinService;

	/**
	 * 添加员工借件单
	 */
	@Override
	@Transactional
	public void addStaffBorrow(StaffborrowInput input) {

		List<StaffborrowInput> inputs=new ArrayList<>();
		input.getDetails().forEach(d -> {
			boolean match=false;
			for (StaffborrowInput i:inputs){
				match = i.getDetails().stream().anyMatch(detail -> detail.getWarehouseType().equals(d.getWarehouseType()));
				if (match){
					i.getDetails().add(d);
				}
			}
			if (!match){
				StaffborrowInput sbi=new StaffborrowInput();
				List<StaffBorrowDetailInput> dis=new ArrayList<>();
				dis.add(d);
				BeanUtils.copyProperties(input,sbi);
				sbi.setDetails(dis);
				inputs.add(sbi);
			}
		});
		inputs.forEach(sbi -> {
			Arrays.asList(sbi.getContainerNo().split("/")).forEach(c -> {
				sbi.setContainerNo(c);
				// 保存借件单
				StaffBorrow staffBorrow = new StaffBorrow();
				BeanUtils.copyProperties(sbi, staffBorrow);
				// 生成借件单号
				staffBorrow.setStaffBorrowNo(billTypeService.getBillNumber(WarehouseConstants.BILL_STAFF_BORROW));
				// 未出库
				staffBorrow.setBillStatus(StaffBorrowStatusEnum.NOT_OUT.getCode());
				// 所属公司
				staffBorrow.setCompany(getCurrentCompanyKey());
				// 未删除
				staffBorrow.setIsDel(PlatformConstants.ISDEL_NO);
				// 创建人
				Integer currentUserId = getCurrentUserId();
				staffBorrow.setCreateUser(currentUserId);
				// 创建时间
				Date date = new Date();
				staffBorrow.setCreateTime(date);
				staffBorrowDao.insertSelective(staffBorrow);

				// 保存借件明细
				sbi.getDetails().forEach(detailInput -> {
					StaffBorrowDetail detail = new StaffBorrowDetail();
					BeanUtils.copyProperties(detailInput, detail);
					// 借件单id
					detail.setWareStaffBorrow(staffBorrow.getWareStaffBorrowId());
					// 未出库
					detail.setBillStatus(StaffBorrowStatusEnum.NOT_OUT.getCode());
					// 还件数量0
					detail.setReturnNum(WarehouseConstants.DOUBLE_ZERO);
					// 上箱数量0
					detail.setUpperContainerNum(WarehouseConstants.DOUBLE_ZERO);
					// 未删除
					detail.setIsDel(PlatformConstants.ISDEL_NO);
					// 创建时间
					detail.setCreateTime(date);
					// 创建人
					detail.setCreateUser(currentUserId);
					detail.setContainerNo(input.getContainerNo());
					staffBorrowDetailDao.insertSelective(detail);
				});
			});
		});


	}

	/**
	 * 修改借件单
	 */
	@Override
	@Transactional
	public void edidStaffBorrow(StaffborrowInput input) {
		// 查询所要修改的借件单
		StaffBorrow staffBorrow = staffBorrowDao.selectByPrimaryKey(input.getWareStaffBorrowId());
		// 只有未出库的才能修改
		if (StaffBorrowStatusEnum.NOT_OUT.getCode().equals(staffBorrow.getBillStatus())) {
			// 修改借件单
			BeanUtils.copyProperties(input, staffBorrow);
			// 修改时间
			Date date = new Date();
			staffBorrow.setUpdateTime(date);
			Integer userId = getCurrentUserId();
			staffBorrow.setUpdateUser(userId);
			staffBorrowDao.updateByPrimaryKeySelective(staffBorrow);

			// 删除原明细
			StaffBorrowDetailExample example = new StaffBorrowDetailExample();
			example.createCriteria().andWareStaffBorrowEqualTo(staffBorrow.getWareStaffBorrowId());
			staffBorrowDetailDao.deleteByExample(example);

			// 保存新借件明细
			input.getDetails().forEach(detailInput -> {
				StaffBorrowDetail detail = new StaffBorrowDetail();
				detail.setSparePartsCategories(detailInput.getSparePartsCategories());
				detail.setSpareParts(detailInput.getSpareParts());
				detail.setWarehouseType(detailInput.getWarehouseType());
				detail.setStorageLocation(detailInput.getStorageLocation());
				detail.setBorrowNum(detailInput.getBorrowNum());
				// 未出库
				detail.setBillStatus(StaffBorrowStatusEnum.NOT_OUT.getCode());
				detail.setRemark(detailInput.getRemark());
				detail.setSparePartsBatch(detailInput.getSparePartsBatch());
				detail.setWarehouse(detailInput.getWarehouse());
				// 借件单id
				detail.setWareStaffBorrow(staffBorrow.getWareStaffBorrowId());
				// 还件数量0
				detail.setReturnNum(0.0);
				// 上箱数量0
				detail.setUpperContainerNum(0.0);
				// 未删除
				detail.setIsDel(PlatformConstants.ISDEL_NO);
				// 创建时间
				detail.setCreateTime(staffBorrow.getCreateTime());
				// 修改时间
				detail.setUpdateTime(date);
				// 创建人
				detail.setCreateUser(staffBorrow.getCreateUser());
				detail.setUpdateUser(userId);
				Arrays.asList(input.getContainerNo().split("/")).forEach(c -> {
					detail.setContainerNo(c);
					staffBorrowDetailDao.insertSelective(detail);
				});
			});
		} else {
			throw new RuntimeException("updateFail");
		}
	}

	/**
	 * 删除员工借件单
	 */
	@Override
	@Transactional
	public void deleteStaffBorrow(List<Integer> ids) {
		ids.forEach(id -> {
			// 查询要删除的借件单
			StaffBorrow staffBorrow = staffBorrowDao.selectByPrimaryKey(id);
			// 只有未出库的才能删除
			if (StaffBorrowStatusEnum.NOT_OUT.getCode().equals(staffBorrow.getBillStatus())) {
				// 删除借件单
				staffBorrow.setIsDel(PlatformConstants.ISDEL_YES);
				staffBorrowDao.updateByPrimaryKeySelective(staffBorrow);

				// 删除明细
				StaffBorrowDetailExample example = new StaffBorrowDetailExample();
				example.createCriteria().andWareStaffBorrowEqualTo(id);
				List<StaffBorrowDetail> details = staffBorrowDetailDao.selectByExample(example);
				details.forEach(detail -> {
					detail.setIsDel(PlatformConstants.ISDEL_YES);
					staffBorrowDetailDao.updateByPrimaryKeySelective(detail);
				});
			}
		});

	}

	/**
	 * 获取借件单列表
	 */
	@Override
	public PagedList<StaffBorrowOutput> getStaffBorrows(SearchStaffBorrowInput input) {
		// 添加检索条件
		PagedList<StaffBorrowOutput> page = new PagedList<>(input.getPageIndex(), input.getPageSize());
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
		map.put("containerNo", input.getContainerNo());
		// by单据状态
		map.put("status", input.getStatus());
		// by仓库
		map.put("warehouse", input.getWarehouse());
		// by仓库类型
		map.put("warehouseType", input.getWarehouseType());
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
		// 分页参数
		map.put("limitStart", page.getLimitStart());
		map.put("limitEnd", page.getLimitEnd());

		// 获取分页数据和总条数
		List<StaffBorrow> staffBorrows = staffBorrowExtDao.selectByCondition(map);
		int total = staffBorrowExtDao.getTotal();

		// 获取明细
		List<StaffBorrowOutput> outputs = new ArrayList<>();
		staffBorrows.forEach(sb -> {
			// copy
			StaffBorrowOutput output = new StaffBorrowOutput();
			BeanUtils.copyProperties(sb, output);
			output.setBillStatusLangLang(sb.getBillStatus());
			output.setBorrowTypeLangLang(sb.getBorrowType());
			// 借件人姓名
			output.setBorrowUserName(getUserNameByUserId(sb.getBorrowUser()));
			// 制单人
			output.setCreateUser(getUserNameByUserId(sb.getBorrowUser()));
			output.setCompanyLangLang(sb.getCompany());
			output.setYardLangLang(sb.getYard());

			// 查询明细
			output.setDetails(getDetailOutputById(sb.getWareStaffBorrowId()));
			// 出库明细
			output.setOutDetails(stockoutService.getStockDetailList(sb.getStaffBorrowNo()));
			outputs.add(output);
		});

		// return page
		page.setTotalItemCount(total);
		page.setDataList(outputs);
		return page;
	}

	/**
	 * 根据id获取借件单
	 */
	@Override
	public StaffBorrowOutput getStaffBorrowById(Integer id) {
		// 根据主键查询
		StaffBorrow staffBorrow = staffBorrowDao.selectByPrimaryKey(id);
		// copy
		StaffBorrowOutput output = new StaffBorrowOutput();
		BeanUtils.copyProperties(staffBorrow, output);
		output.setBillStatusLangLang(staffBorrow.getBillStatus());
		output.setBorrowTypeLangLang(staffBorrow.getBorrowType());
		// 借件人姓名
		output.setBorrowUserName(getUserNameByUserId(staffBorrow.getBorrowUser()));
		output.setCompanyLangLang(staffBorrow.getCompany());
		output.setYardLangLang(staffBorrow.getYard());

		// 查询明细
		output.setDetails(getDeduplicateDetailOutputById(staffBorrow.getWareStaffBorrowId()));

		output.setOutDetails(stockoutService.getStockDetailList(staffBorrow.getStaffBorrowNo()));

		return output;
	}

	/**
	 * 根据员工借件单id获取detail entity 根据备件批次去重
	 *
	 * @author lishzh
	 * @param staffBorrowId
	 * @return
	 */
	public List<StaffBorrowDetail> getDeduplicateDetailById(Integer staffBorrowId) {
		StaffBorrowDetailExample example = new StaffBorrowDetailExample();
		example.createCriteria().andWareStaffBorrowEqualTo(staffBorrowId);
		return staffBorrowDetailDao.selectByExample(example).stream()
				.collect(Collectors.collectingAndThen(
						Collectors.toCollection(
								() -> new TreeSet<>(Comparator.comparing(StaffBorrowDetail::getSparePartsBatch))),
						ArrayList::new));
	}

	/**
	 * 根据员工借件单id获取detail entity 不去重
	 *
	 * @author lishzh
	 * @param staffBorrowId
	 * @return
	 */
	public List<StaffBorrowDetail> getDetailById(Integer staffBorrowId) {
		StaffBorrowDetailExample example = new StaffBorrowDetailExample();
		example.createCriteria().andWareStaffBorrowEqualTo(staffBorrowId);
		return staffBorrowDetailDao.selectByExample(example);
	}

	/**
	 * 根据员工借件单id获取detail output 不去重
	 *
	 * @author lishzh
	 * @param staffBorrowId
	 * @return
	 */
	List<StaffBorrowDetailOutput> getDetailOutputById(Integer staffBorrowId) {
		List<StaffBorrowDetailOutput> detailOutputs = new ArrayList<>();
		getDetailById(staffBorrowId).forEach(detail -> {
			StaffBorrowDetailOutput detailOutput = new StaffBorrowDetailOutput();
			BeanUtils.copyProperties(detail, detailOutput);
			detailOutput.setSparePartsLangLang(detail.getSpareParts());
			detailOutput.setWarehouseLangLang(detail.getWarehouse());
			detailOutput.setWarehouseTypeLangLang(detail.getWarehouseType());
			// 查询库位
			StockOutput stockOutput = stockService.getStockByBatch(detail.getSparePartsBatch(), detail.getSpareParts());
			detailOutput.setStorageLocation(stockOutput.getStorageLocation());
			// 备件号
			detailOutput.setSparePartsNo(stockOutput.getSparePartsNo());
			// 查询所属公司
			detailOutput.setCompanyLangLang(stockOutput.getCompany());
			// 库存
			detailOutput.setSurplusNum(stockOutput.getSurplusNum());
			// 单据状态
			detailOutput.setBillStatusLangLang(detail.getBillStatus());
			detailOutputs.add(detailOutput);
		});
		return detailOutputs;
	}

	/**
	 * 根据员工借件单id获取借件单 明细不去重
	 *
	 * @author lishzh
	 * @param staffBorrowId
	 * @return
	 */
	@Override
	public StaffBorrowOutput getStaffBorrow(Integer staffBorrowId) {
		// 根据主键查询
		StaffBorrow staffBorrow = staffBorrowDao.selectByPrimaryKey(staffBorrowId);
		// copy
		StaffBorrowOutput output = new StaffBorrowOutput();
		BeanUtils.copyProperties(staffBorrow, output);
		output.setBillStatusLangLang(staffBorrow.getBillStatus());
		output.setBorrowTypeLangLang(staffBorrow.getBorrowType());
		// 借件人姓名
		output.setBorrowUserName(getUserNameByUserId(staffBorrow.getBorrowUser()));
		output.setCompanyLangLang(staffBorrow.getCompany());
		output.setYardLangLang(staffBorrow.getYard());

		// 查询明细
		List<StaffBorrowDetailOutput> detailOutputs = new ArrayList<>();
		getDetailById(staffBorrowId).forEach(detail -> {
			StaffBorrowDetailOutput detailOutput = new StaffBorrowDetailOutput();
			BeanUtils.copyProperties(detail, detailOutput);
			detailOutput.setSparePartsLangLang(detail.getSpareParts());
			detailOutput.setWarehouseLangLang(detail.getWarehouse());
			detailOutput.setWarehouseTypeLangLang(detail.getWarehouseType());
			// 查询库位
			StockOutput stockOutput = stockService.getStockByBatch(detail.getSparePartsBatch(), detail.getSpareParts());
			detailOutput.setStorageLocation(stockOutput.getStorageLocation());
			// 备件号
			detailOutput.setSparePartsNo(stockOutput.getSparePartsNo());
			// 查询所属公司
			detailOutput.setCompanyLangLang(stockOutput.getCompany());
			// 库存
			detailOutput.setSurplusNum(stockOutput.getSurplusNum());
			// 单据状态
			detailOutput.setBillStatusLangLang(detail.getBillStatus());
			detailOutputs.add(detailOutput);
		});

		output.setDetails(detailOutputs);
		output.setOutDetails(stockoutService.getStockDetailList(staffBorrow.getStaffBorrowNo()));

		return output;
	}

	/**
	 * 根据员工借件单id获取detail output
	 *
	 * @author lishzh
	 * @param staffBorrowId
	 * @return
	 */
	List<StaffBorrowDetailOutput> getDeduplicateDetailOutputById(Integer staffBorrowId) {
		List<StaffBorrowDetailOutput> detailOutputs = new ArrayList<>();
		getDeduplicateDetailById(staffBorrowId).forEach(detail -> {
			StaffBorrowDetailOutput detailOutput = new StaffBorrowDetailOutput();
			BeanUtils.copyProperties(detail, detailOutput);
			detailOutput.setSparePartsLangLang(detail.getSpareParts());
			detailOutput.setWarehouseLangLang(detail.getWarehouse());
			detailOutput.setWarehouseTypeLangLang(detail.getWarehouseType());
			// 查询库位
			StockOutput stockOutput = stockService.getStockByBatch(detail.getSparePartsBatch(), detail.getSpareParts());
			detailOutput.setStorageLocation(stockOutput.getStorageLocation());
			// 备件号
			detailOutput.setSparePartsNo(stockOutput.getSparePartsNo());
			// 查询所属公司
			detailOutput.setCompanyLangLang(stockOutput.getCompany());
			// 库存
			detailOutput.setSurplusNum(stockOutput.getSurplusNum());
			// 单据状态
			detailOutput.setBillStatusLangLang(detail.getBillStatus());
			detailOutputs.add(detailOutput);
		});
		return detailOutputs;
	}

	/**
	 * 借件单出库
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void staffBorrowOut(Integer staffBorrowId) {
		// 获取借出单
		StaffBorrow staffBorrow = staffBorrowDao.selectByPrimaryKey(staffBorrowId);
		// 只有未出库状态才能出库
		if (StaffBorrowStatusEnum.NOT_OUT.getCode().equals(staffBorrow.getBillStatus())) {
			// 借出单直接出库
			// set出库参数
			StockOutInput stockOutInput = new StockOutInput();
			stockOutInput.setNo(staffBorrow.getStaffBorrowNo());
			stockOutInput.setCompany(staffBorrow.getCompany());
			// 获取单据类型
			String billType = billTypeService.getBillTypeKeyByName(WarehouseConstants.BILL_STAFF_BORROW);
			if (StringUtils.isEmpty(billType)) {
				throw new SqlException("insertFail");
			}
			stockOutInput.setBillType(billType);
			// 领料部门
			String department = staffBorrow.getBorrowDepartment();
			if (StringUtils.isEmpty(department)) {
				throw new SqlException("insertFail");
			}
			stockOutInput.setReceiveDepartment(department);
			// 领料人
			stockOutInput.setReceiveUser(staffBorrow.getBorrowUser());

			// 获取借件明细
			StaffBorrowDetailExample example = new StaffBorrowDetailExample();
			example.createCriteria().andWareStaffBorrowEqualTo(staffBorrowId);
			List<StaffBorrowDetail> details = staffBorrowDetailDao.selectByExample(example);
			// set出库明细
			List<AddStockoutDetailInput> stockoutDetailInputList = new ArrayList<>();
			details.forEach(detail -> {
				AddStockoutDetailInput AddStockoutDetailInput = new AddStockoutDetailInput();
				AddStockoutDetailInput.setStockoutNum(detail.getBorrowNum());
				AddStockoutDetailInput.setSparePartsBatch(detail.getSparePartsBatch());
				AddStockoutDetailInput.setSpareParts(detail.getSpareParts());
				AddStockoutDetailInput.setUseUser(staffBorrow.getBorrowUser());
				AddStockoutDetailInput.setYard(staffBorrow.getYard());
				stockoutDetailInputList.add(AddStockoutDetailInput);
			});
			AddStockoutDetailInput[] addStockoutDetailInputArrays = stockoutDetailInputList
					.toArray(new AddStockoutDetailInput[stockoutDetailInputList.size()]);
			stockOutInput.setStockoutDetailInputList(addStockoutDetailInputArrays);

			// 直接出库
			stockoutService.directOut(stockOutInput);

			// 更新借件单出库状态
			staffBorrow.setBillStatus(StaffBorrowStatusEnum.ALL_OUT.getCode());
			staffBorrowDao.updateByPrimaryKeySelective(staffBorrow);

			// 更新明细出库状态
			details.forEach(detail -> {
				detail.setBillStatus(StaffBorrowStatusEnum.ALL_OUT.getCode());
				staffBorrowDetailDao.updateByPrimaryKeySelective(detail);
			});
		} else {
			throw new RuntimeException("outFail");
		}
	}

	/**
	 * 借件单还库
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void staffRepay(StaffborrowInput input) {
		// 查询要修改的借件单
		StaffBorrow staffBorrow = staffBorrowDao.selectByPrimaryKey(input.getWareStaffBorrowId());
		// 只有全部出库或者部分还库的借件单才能还库
		if (StaffBorrowStatusEnum.ALL_OUT.getCode().equals(staffBorrow.getBillStatus())
				|| StaffBorrowStatusEnum.PART_RETURN.getCode().equals(staffBorrow.getBillStatus())) {

			List<StaffBorrowDetail> details = getDetailById(staffBorrow.getWareStaffBorrowId());

			// 入库单set input params
			StockInInput stockInInput = new StockInInput();
			// 源单号
			stockInInput.setNo(staffBorrow.getStaffBorrowNo());
			// 单据类型
			stockInInput.setBillType(billTypeService.getBillTypeKeyByName(WarehouseConstants.BILL_STAFF_BORROW));
			stockInInput.setCompany(staffBorrow.getCompany());
			// 入库仓库
			stockInInput.setEntryWarehouse(details.stream().findFirst()
					.orElseThrow(() -> new RuntimeException("not found warehouse")).getWarehouse());

			// 默认全部还库
			String billStatus = StaffBorrowStatusEnum.ALL_RETURN.getCode();
			// 入库明细List
			List<AddStockinDetailInput> stockinDetailInputList = new ArrayList<>();
			for (StaffBorrowDetail detail : details) {
				// 本次还库数量
				double repayNum = input.getDetails().stream()
						.filter(di -> di.getWareStaffBorrowDetailId().equals(detail.getWareStaffBorrowDetailId()))
						.map(di -> di.getRepayNum()).findFirst().orElse(WarehouseConstants.DOUBLE_ZERO);
				// 总还库数量
				double totalRepayNum = detail.getReturnNum() + repayNum;
				// 上箱数量
				double upperContainerNum = detail.getUpperContainerNum();
				// 借件数量
				double borrowNum = detail.getBorrowNum();
				if (totalRepayNum + upperContainerNum > borrowNum) {
					// 若还库数量+上箱数量>借件数量则视为异常操作
					throw new RuntimeException("numOut");
				} else if (totalRepayNum + upperContainerNum == borrowNum) {
					// 若还库数量+上箱数量=借件数量则该备件全部还库
					detail.setBillStatus(StaffBorrowStatusEnum.ALL_RETURN.getCode());
				} else if (totalRepayNum + upperContainerNum == WarehouseConstants.DOUBLE_ZERO) {
					// 若还库数量+上箱数量=0
				} else {
					// 若还库数量+上箱数量>借件数量则该备件部分还库,同时修改借件单还库状态为部分还库
					billStatus = StaffBorrowStatusEnum.PART_RETURN.getCode();
					detail.setBillStatus(billStatus);
				}
				// 更新还库数量
				detail.setReturnNum(totalRepayNum);
				// 更新明细状态
				staffBorrowDetailDao.updateByPrimaryKeySelective(detail);

				// 入库单明细
				if (repayNum > 0) {
					AddStockinDetailInput stockinDetail = new AddStockinDetailInput();
					stockinDetail.setSpareParts(detail.getSpareParts());
					stockinDetail.setEntryNum(repayNum);
					stockinDetail.setStorageLocation(detail.getStorageLocation());
					stockinDetail.setWarehouseType(detail.getWarehouseType());

					// 入库单的批次是原库存批次
					stockinDetail.setStockinBatch(detail.getSparePartsBatch());
					// 入库单的原始批次是原库存的原始批次
					stockinDetail.setOriginBatch(detail.getSparePartsOriginalBatch());
					// 根据原库存批次更新库存数量
					stockinDetail.setSourceBatch(detail.getSparePartsBatch());
					stockinDetailInputList.add(stockinDetail);
				}

			}
			// 更新借件单单据状态
			staffBorrow.setBillStatus(billStatus);
			staffBorrowDao.updateByPrimaryKeySelective(staffBorrow);

			// 生成入库单并修改库存
			stockInInput.setStockinDetail(
					stockinDetailInputList.toArray(new AddStockinDetailInput[stockinDetailInputList.size()]));
			stockinService.returnIn(stockInInput);
		}

	}

	/**
	 * 借件未还查询
	 */
	@Override
	public PagedList<StaffBorrowDetailOutput> getNotRepay(SearchStaffBorrowInput input) {
		// 添加检索条件
		PagedList<StaffBorrowDetailOutput> page = new PagedList<>(input.getPageIndex(), input.getPageSize());
		Map<String, Object> map = new HashMap<>(13);
		// by借件单号
		map.put("no", input.getNo());
		// by箱号
		// map.put("containerNo", input.getContainerNo());
		// by备件号
		map.put("sparePartsNo", input.getSparePartsNo());
		// by备件号
		map.put("borrowUser", input.getUserId());
		// 分页参数
		map.put("limitStart", page.getLimitStart());
		map.put("limitEnd", page.getLimitEnd());

		// 查询未还
		List<StaffBorrowDetailOutput> outputs = new ArrayList<>();
		staffBorrowDetailExtDao.selectByCondition(map).forEach(detail -> {
			StaffBorrowDetailOutput output = new StaffBorrowDetailOutput();
			BeanUtils.copyProperties(detail, output);
			output.setSparePartsLangLang(detail.getSpareParts());
			output.setWarehouseLangLang(detail.getWarehouse());
			output.setWarehouseTypeLangLang(detail.getWarehouseType());
			// 查询库位
			StockOutput stockOutput = stockService.getStockByBatch(detail.getSparePartsBatch(), detail.getSpareParts());
			output.setStorageLocation(stockOutput.getStorageLocation());
			// 备件号
			output.setSparePartsNo(stockOutput.getSparePartsNo());
			// 查询所属公司
			output.setCompanyLangLang(stockOutput.getCompany());
			// 库存
			output.setSurplusNum(stockOutput.getSurplusNum());
			// 单据状态
			output.setBillStatusLangLang(detail.getBillStatus());
			outputs.add(output);
		});
		// 获取总条数
		int total = staffBorrowDetailExtDao.getTotal();

		// return page
		page.setTotalItemCount(total);
		page.setDataList(outputs);
		return page;

	}

	/**
	 * 根据箱号 备件 借件类型获取待还件
	 *
	 * @author lishzh
	 * @param containerNo
	 * @param spareParts
	 * @param borrowType
	 * @return
	 */
	public List<StaffBorrowDetail> getDetails(String containerNo, String spareParts, String borrowType) {
		// 全部出库和部分还库
		List<String> status = new ArrayList<>();
		status.add(StaffBorrowStatusEnum.ALL_OUT.getCode());
		status.add(StaffBorrowStatusEnum.PART_RETURN.getCode());

		// 根据箱号 借件类型 获取已经出库并且没有还完的借件单
		StaffBorrowExample staffBorrowExample = new StaffBorrowExample();
		staffBorrowExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andBorrowTypeEqualTo(borrowType)
				.andBillStatusIn(status).andContainerNoLike("%" + containerNo + "%");
		List<StaffBorrow> staffBorrows = staffBorrowDao.selectByExample(staffBorrowExample);

		// if empty return null
		if (CollectionUtils.isEmpty(staffBorrows)) {
			return null;
		}

		// 根据借件单 箱号 备件获取借件明细
		StaffBorrowDetailExample detailExample = new StaffBorrowDetailExample();
		List<Integer> ids = staffBorrows.stream().map(s -> s.getWareStaffBorrowId()).collect(Collectors.toList());
		detailExample.createCriteria().andWareStaffBorrowIn(ids).andContainerNoEqualTo(containerNo)
				.andSparePartsEqualTo(spareParts).andBillStatusIn(status).andIsDelEqualTo(PlatformConstants.ISDEL_NO);

		return staffBorrowDetailDao.selectByExample(detailExample);
	}

	/**
	 * 获取借件数量
	 */
	public Double getBorrowNum(String containerNo, String spareParts, String borrowType) {
		double num = WarehouseConstants.DOUBLE_ZERO;

		List<StaffBorrowDetail> details = getDetails(containerNo, spareParts, borrowType);
		if (details != null) {
			for (StaffBorrowDetail detail : details) {
				num = new BigDecimal(num)
						.add(new BigDecimal(detail.getBorrowNum()).subtract(new BigDecimal(detail.getReturnNum()))
								.subtract(new BigDecimal(detail.getUpperContainerNum())))
						.doubleValue();
			}
		}

		return num;
	}

	/**
	 * 借件上箱
	 */
	public void upContainer(String containerNo, String spareParts, String borrowType, Double num) {
		// 获取待还借件明细
		List<StaffBorrowDetail> details = getDetails(containerNo, spareParts, borrowType);
		for (StaffBorrowDetail detail : details) {
			// 上箱数量>0 更新当前明细上箱数量
			if (num > 0) {
				// 已还件数量=退件数量+上箱数量
				BigDecimal repayNum = new BigDecimal(detail.getReturnNum())
						.add(new BigDecimal(detail.getUpperContainerNum()));
				// 当前明细剩余需上箱数量=借件数量-已还数量
				BigDecimal needUpNum = new BigDecimal(detail.getBorrowNum()).subtract(repayNum);
				// 上箱后的剩余数量=上箱数量-当前明细剩余需上箱数量
				double surplusNum = new BigDecimal(num).subtract(needUpNum).doubleValue();
				if (surplusNum < 0) {
					// 总上箱数量=已上箱数量+上箱数量
					BigDecimal totalUpNum = new BigDecimal(detail.getUpperContainerNum()).add(new BigDecimal(num));
					detail.setUpperContainerNum(totalUpNum.doubleValue());

				} else {
					// 总上箱数量=已上箱数量+当前明细剩余需上箱数量
					BigDecimal totalUpNum = new BigDecimal(detail.getUpperContainerNum()).add(needUpNum);
					detail.setUpperContainerNum(totalUpNum.doubleValue());

				}

				// 更新上箱数量为上箱后的剩余数量
				num = surplusNum;

				// 更新借件明细的上箱数量
				staffBorrowDetailDao.updateByPrimaryKeySelective(detail);

				// 更新借件单的单据状态
				StaffBorrow staffBorrow = staffBorrowDao.selectByPrimaryKey(detail.getWareStaffBorrow());
				// 默认全部还库
				String billStatus = StaffBorrowStatusEnum.ALL_RETURN.getCode();
				List<StaffBorrowDetail> staffBorrowDetails = getDetailById(staffBorrow.getWareStaffBorrowId());
				for (StaffBorrowDetail sbd : staffBorrowDetails) {
					if (new BigDecimal(sbd.getBorrowNum()).subtract(new BigDecimal(sbd.getReturnNum()))
							.subtract(new BigDecimal(sbd.getUpperContainerNum())).doubleValue() > 0) {
						// 有一条明细为部分还,借入单即为部分还
						billStatus = StaffBorrowStatusEnum.PART_RETURN.getCode();
						sbd.setBillStatus(billStatus);
					} else {
						sbd.setBillStatus(StaffBorrowStatusEnum.ALL_RETURN.getCode());
					}
					// 更新明细还库状态
					staffBorrowDetailDao.updateByPrimaryKeySelective(sbd);
				}
				// 更新借件单单据状态
				staffBorrow.setBillStatus(billStatus);
				staffBorrowDao.updateByPrimaryKeySelective(staffBorrow);

			} else {
				// 上箱数量<=0 已全部上箱 break
				break;
			}

		}
	}

}
