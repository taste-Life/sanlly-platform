package com.sanlly.warehouse.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.enums.ConfirmStateEnum;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.warehouse.constants.WarehouseConstants;
import com.sanlly.warehouse.dao.TransferDetailMapper;
import com.sanlly.warehouse.dao.TransferMapper;
import com.sanlly.warehouse.dao.WareStockMapper;
import com.sanlly.warehouse.entity.Transfer;
import com.sanlly.warehouse.entity.TransferDetail;
import com.sanlly.warehouse.entity.TransferDetailExample;
import com.sanlly.warehouse.entity.TransferExample;
import com.sanlly.warehouse.entity.TransferExample.Criteria;
import com.sanlly.warehouse.entity.WareStock;
import com.sanlly.warehouse.entity.WareStockExample;
import com.sanlly.warehouse.models.input.stockin.AddStockinDetailInput;
import com.sanlly.warehouse.models.input.stockin.StockInInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutDetailInput;
import com.sanlly.warehouse.models.input.stockout.StockOutInput;
import com.sanlly.warehouse.models.input.transfer.AddTransferInput;
import com.sanlly.warehouse.models.input.transfer.EditTransferInput;
import com.sanlly.warehouse.models.input.transfer.SearchTransferInput;
import com.sanlly.warehouse.models.input.transfer.TransferDetailInput;
import com.sanlly.warehouse.models.output.transfer.TransferDetailOutput;
import com.sanlly.warehouse.models.output.transfer.TransferOutput;
import com.sanlly.warehouse.service.BillTypeService;
import com.sanlly.warehouse.service.TransferService;
import com.sanlly.warehouse.service.WareStockService;
import com.sanlly.warehouse.service.WareStockinService;
import com.sanlly.warehouse.service.WareStockoutService;

/**
 * 调拨 移动 下料服务实现类
 * 
 * @author lishzh
 *
 */
@Service
public class TransferServiceImpl extends BaseServiceImpl implements TransferService {

	@Autowired
	TransferMapper transferDao;

	@Autowired
	TransferDetailMapper transferDetailDao;

	@Autowired
	BillTypeService billTypeService;

	@Autowired
	WareStockMapper stockDao;

	@Autowired
	WareStockoutService stockoutService;

	@Autowired
	WareStockinService stockinService;

	@Autowired
	WareStockService stockService;

	/*
	 * 添加调拨单
	 */
	@Override
	@Transactional
	public void addTransfer(AddTransferInput input) {
		Transfer transfer = new Transfer();
		BeanUtils.copyProperties(input, transfer);
		// 生成调拨单号
		String billNumber = billTypeService.getBillNumber(WarehouseConstants.BILL_TRANSFER);
		if (StringUtils.isEmpty(billNumber)) {
			throw new SqlException("insertFail");
		}
		transfer.setTransferSlipNo(billNumber);
		// 获取单据类型
		String billType = billTypeService.getBillTypeKeyByName(WarehouseConstants.BILL_TRANSFER);
		if (StringUtils.isEmpty(billType)) {
			throw new SqlException("insertFail");
		}
		transfer.setBillType(billType);
		// 所属公司
		String companyKey = getCurrentCompanyKey();
		if (StringUtils.isEmpty(companyKey)) {
			throw new SqlException("insertFail");
		}
		transfer.setCompany(companyKey);
		// 未审核
		transfer.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
		// 未确认
		transfer.setBillStatus(ConfirmStateEnum.NOT_CONFIRMED.getCode());
		// 未删除
		transfer.setIsDel(PlatformConstants.ISDEL_NO);
		// 创建人
		Integer userId = getCurrentUserId();
		transfer.setCreateUser(userId);
		// 创建时间
		Date date = new Date();
		transfer.setCreateTime(date);
		// 保存调拨单
		transferDao.insertSelective(transfer);

		// 保存调拨单明细
		for (TransferDetailInput detailInput : input.getDetails()) {
			TransferDetail detail = new TransferDetail();
			BeanUtils.copyProperties(detailInput, detail);
			// 调拨单id
			detail.setWareTransferId(transfer.getWareTransferId());
			// 长宽默认0
			detail.setLength(Optional.ofNullable(detail.getLength()).orElse(WarehouseConstants.DOUBLE_ZERO));
			detail.setWidth(Optional.ofNullable(detail.getWidth()).orElse(WarehouseConstants.DOUBLE_ZERO));
			// 创建人
			detail.setCreateUser(userId);
			// 创建时间
			detail.setCreateTime(date);
			// 未删除
			detail.setIsDel(PlatformConstants.ISDEL_NO);
			transferDetailDao.insertSelective(detail);
		}
	}

	/**
	 * 修改调拨单
	 */
	@Override
	@Transactional
	public void editTransfer(EditTransferInput input) {
		// 查询要修改的调拨单
		Transfer transfer = transferDao.selectByPrimaryKey(input.getWareTransferId());
		// 只有未审核和已驳回才能修改
		if (AuditStateEnum.UNAUDIT.getCode().equals(transfer.getAuditStatus())
				|| AuditStateEnum.REJECTED.getCode().equals(transfer.getAuditStatus())) {
			BeanUtils.copyProperties(input, transfer);
			// 修改人
			Integer userId = getCurrentUserId();
			transfer.setUpdateUser(userId);
			// 修改时间
			Date date = new Date();
			transfer.setUpdateTime(date);
			// 保存调拨单
			transferDao.updateByPrimaryKeySelective(transfer);

			// 删除原调拨明细
			TransferDetailExample detailExample = new TransferDetailExample();
			detailExample.createCriteria().andWareTransferIdEqualTo(input.getWareTransferId());
			transferDetailDao.deleteByExample(detailExample);

			// 保存新的调拨单明细
			for (TransferDetailInput detailInput : input.getDetails()) {
				TransferDetail detail = new TransferDetail();
				BeanUtils.copyProperties(detailInput, detail);
				// 调拨单id
				detail.setWareTransferId(transfer.getWareTransferId());
				// 长宽默认0
				detail.setLength(Optional.ofNullable(detail.getLength()).orElse(WarehouseConstants.DOUBLE_ZERO));
				detail.setWidth(Optional.ofNullable(detail.getWidth()).orElse(WarehouseConstants.DOUBLE_ZERO));
				// 创建人
				detail.setCreateUser(transfer.getCreateUser());
				// 创建时间
				detail.setCreateTime(transfer.getCreateTime());
				// 修改人
				detail.setUpdateUser(userId);
				// 修改时间
				detail.setUpdateTime(date);
				// 未删除
				detail.setIsDel(PlatformConstants.ISDEL_NO);
				transferDetailDao.insertSelective(detail);
			}
		}
	}

	/**
	 * 删除调拨单
	 */
	@Override
	@Transactional
	public void deleteTransfer(List<Integer> ids) {
		ids.forEach(id -> {
			// 查询要删除的调拨单
			Transfer transfer = transferDao.selectByPrimaryKey(id);
			// 只有未审核和已驳回才能删除
			if (AuditStateEnum.UNAUDIT.getCode().equals(transfer.getAuditStatus())
					|| AuditStateEnum.REJECTED.getCode().equals(transfer.getAuditStatus())) {
				// 调拨主表标记删除
				transfer.setIsDel(PlatformConstants.ISDEL_YES);
				transferDao.updateByPrimaryKeySelective(transfer);
				// 调拨明细标记删除
				getDetailById(id).forEach(detail -> {
					detail.setIsDel(PlatformConstants.ISDEL_YES);
					transferDetailDao.updateByPrimaryKeySelective(detail);
				});
			}

		});
	}

	/**
	 * 获取调拨单列表
	 */
	@Override
	public PagedList<TransferOutput> getPageTransfers(SearchTransferInput input) {
		// 分页查询调拨单
		TransferExample tse = new TransferExample();
		tse.setOrderByClause("create_time desc");
		Criteria tsc = tse.createCriteria();
		tsc.andCategoryEqualTo(input.getCategory());
		tsc.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		// 根据起止日期
		if (input.getStartDate() != null && input.getEndDate() != null) {
			tsc.andCreateTimeBetween(input.getStartDate(), DateUtil.nextDay(input.getEndDate()));
		}
		// 根据调拨单号
		if (StringUtils.isNotEmpty(input.getNo())) {
			tsc.andTransferSlipNoLike("%" + input.getNo() + "%");
		}
		// 根据出库仓库
		if (StringUtils.isNotEmpty(input.getOutWarehouse())) {
			tsc.andOutWarehouseEqualTo(input.getOutWarehouse());
		}
		// 根据出库仓库类型
		if (StringUtils.isNotEmpty(input.getOutWarehouseType())) {
			tsc.andOutWarehouseTypeEqualTo(input.getOutWarehouseType());
		}
		// 根据入库仓库
		if (StringUtils.isNotEmpty(input.getInWarehouse())) {
			tsc.andInWarehouseEqualTo(input.getInWarehouse());
		}
		// 根据入库仓库类型
		if (StringUtils.isNotEmpty(input.getInWarehouseType())) {
			tsc.andInWarehouseTypeEqualTo(input.getInWarehouseType());
		}
		// 根据审核状态
		if (StringUtils.isNotEmpty(input.getAuditStatus())) {
			tsc.andAuditStatusEqualTo(input.getAuditStatus());
		}
		// 根据单据状态
		if (StringUtils.isNotEmpty(input.getBillStatus())) {
			tsc.andBillStatusEqualTo(input.getBillStatus());
		}

		// 查询总条数
		Integer total = (int) transferDao.countByExample(tse);

		// 分页查询
		PagedList<TransferOutput> page = new PagedList<>(input.getPageIndex(), input.getPageSize(), total);
		tse.setLimitStart(page.getLimitStart());
		tse.setLimitEnd(page.getLimitEnd());
		List<Transfer> transfers = transferDao.selectByExample(tse);
		List<TransferOutput> outputs = new ArrayList<>();

		// 查询调拨明细列表
		for (Transfer transfer : transfers) {
			// 拷贝属性
			TransferOutput transferOutput = new TransferOutput();
			BeanUtils.copyProperties(transfer, transferOutput);
			transferOutput.setCompanyLangLang(transfer.getCompany());
			transferOutput.setAuditStatusLangLang(transfer.getAuditStatus());
			transferOutput.setBillStatusLangLang(transfer.getBillStatus());
			transferOutput.setInWarehouseLangLang(transfer.getInWarehouse());
			transferOutput.setInWarehouseTypeLangLang(transfer.getInWarehouseType());
			transferOutput.setOutWarehouseLangLang(transfer.getOutWarehouse());
			transferOutput.setOutWarehouseTypeLangLang(transfer.getOutWarehouseType());
			// 获取用户信息
			transferOutput.setUser(authService.getUserInfo(transfer.getCreateUser()).getData().getUserName());
			// 查询明细
			transferOutput.setDetails(getDetailOutputById(transfer.getWareTransferId()));
			outputs.add(transferOutput);
		}

		page.getDataList().addAll(outputs);
		return page;
	}

	/**
	 * 根据id获取调拨单
	 */
	@Override
	public TransferOutput getTransferById(Integer transferId) {
		// 根据调拨单id获取调拨单
		Transfer transfer = transferDao.selectByPrimaryKey(transferId);
		TransferOutput transferOutput = new TransferOutput();
		BeanUtils.copyProperties(transfer, transferOutput);
		transferOutput.setCompanyLangLang(transfer.getCompany());
		transferOutput.setAuditStatusLangLang(transfer.getAuditStatus());
		transferOutput.setBillStatusLangLang(transfer.getBillStatus());
		transferOutput.setInWarehouseLangLang(transfer.getInWarehouse());
		transferOutput.setInWarehouseTypeLangLang(transfer.getInWarehouseType());
		transferOutput.setOutWarehouseLangLang(transfer.getOutWarehouse());
		transferOutput.setOutWarehouseTypeLangLang(transfer.getOutWarehouseType());
		// 获取用户信息
		transferOutput.setUser(authService.getUserInfo(transfer.getCreateUser()).getData().getUserName());

		// 查询明细
		transferOutput.setDetails(getDetailOutputById(transferId));

		return transferOutput;
	}

	/**
	 * 根据调拨单id查询调拨明细
	 *
	 * @author lishzh
	 * @param transferId
	 * @return
	 */
	List<TransferDetail> getDetailById(Integer transferId) {
		TransferDetailExample example = new TransferDetailExample();
		example.createCriteria().andWareTransferIdEqualTo(transferId);
		return transferDetailDao.selectByExample(example);
	}

	/**
	 * 根据调拨单id查询detail output
	 *
	 * @author lishzh
	 * @param transferId
	 * @return
	 */
	List<TransferDetailOutput> getDetailOutputById(Integer transferId) {
		List<TransferDetailOutput> detailOutputs = new ArrayList<>();
		getDetailById(transferId).forEach(detail -> {
			TransferDetailOutput detailOutput = new TransferDetailOutput();
			BeanUtils.copyProperties(detail, detailOutput);
			// 备件名
			detailOutput.setSparePartsLangLang(detail.getSpareParts());
			// 查询库存
			WareStockExample stockExample = new WareStockExample();
			stockExample.createCriteria().andSparePartsBatchEqualTo(detail.getSparePartsBatch())
					.andSparePartsEqualTo(detail.getSpareParts());
			List<WareStock> stocks = stockDao.selectByExample(stockExample);
			if (!CollectionUtils.isEmpty(stocks)) {
				detailOutput.setSparePartsNo(stocks.get(0).getSparePartsNo());
				detailOutput.setSurplusNum(stocks.get(0).getSurplusNum());
			}
			detailOutputs.add(detailOutput);
		});
		return detailOutputs;
	}

	/**
	 * 调拨单审核
	 */
	@Override
	public void transferAudit(List<Integer> ids) {
		// 审核
		ids.forEach(id -> {
			// 查询要审核的调拨单
			Transfer transfer = transferDao.selectByPrimaryKey(id);
			// 只有未审核和已驳回的才能审核
			if (AuditStateEnum.UNAUDIT.getCode().equals(transfer.getAuditStatus())
					|| AuditStateEnum.REJECTED.getCode().equals(transfer.getAuditStatus())) {
				transfer.setAuditStatus(AuditStateEnum.AUDITED.getCode());
				transferDao.updateByPrimaryKeySelective(transfer);
			}
		});
	}

	/**
	 * 调拨单驳回
	 */
	@Override
	public void transferReject(EditTransferInput input) {
		// 查询要驳回的调拨单
		Transfer transfer = transferDao.selectByPrimaryKey(input.getWareTransferId());
		// 只有未审核和已驳回的才能驳回
		if (AuditStateEnum.UNAUDIT.getCode().equals(transfer.getAuditStatus())
				|| AuditStateEnum.REJECTED.getCode().equals(transfer.getAuditStatus())) {
			transfer.setAuditStatus(AuditStateEnum.REJECTED.getCode());
			transfer.setReasonsRejection(input.getReasonsRejection());
			transferDao.updateByPrimaryKeySelective(transfer);
		}
	}

	/**
	 * 调拨单确认
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void transferConfirm(List<Integer> ids) {
		for (Integer id : ids) {
			// 查询待确认的调拨单
			Transfer transfer = transferDao.selectByPrimaryKey(id);
			// 只有审核通过的才能确认
			if (AuditStateEnum.AUDITED.getCode().equals(transfer.getAuditStatus())) {
				// 更新单据状态
				transfer.setBillStatus(ConfirmStateEnum.CONFIRMED.getCode());
				transferDao.updateByPrimaryKeySelective(transfer);

				// 出库单set input params
				StockOutInput stockOutInput = new StockOutInput();
				// 源单号
				stockOutInput.setNo(transfer.getTransferSlipNo());
				stockOutInput.setCompany(transfer.getCompany());
				stockOutInput.setWarehouse(transfer.getOutWarehouse());
				// 单据类型
				stockOutInput.setBillType(transfer.getBillType());

				// 入库单set input params
				StockInInput stockInInput = new StockInInput();
				// 源单号
				stockInInput.setNo(transfer.getTransferSlipNo());
				// 单据类型
				stockInInput.setBillType(transfer.getBillType());
				stockInInput.setCompany(transfer.getCompany());
				// 入库仓库
				stockInInput.setEntryWarehouse(transfer.getInWarehouse());

				// 获取调拨明细
				List<TransferDetail> details = getDetailById(id);

				// 出库明细List
				List<AddStockoutDetailInput> stockoutDetailInputList = new ArrayList<>();
				// 入库明细List
				List<AddStockinDetailInput> stockinDetailInputList = new ArrayList<>();
				details.forEach(detail -> {
					// 出库明细
					AddStockoutDetailInput AddStockoutDetailInput = new AddStockoutDetailInput();
					AddStockoutDetailInput.setStockoutNum(detail.getNum());
					AddStockoutDetailInput.setSparePartsBatch(detail.getSparePartsBatch());
					AddStockoutDetailInput.setSpareParts(detail.getSpareParts());
					stockoutDetailInputList.add(AddStockoutDetailInput);

					// StockOutput stock = stockService.getStockByBatch(detail.getSparePartsBatch(),
					// detail.getSpareParts());

					// 入库单明细
					AddStockinDetailInput stockinDetail = new AddStockinDetailInput();
					stockinDetail.setSpareParts(detail.getSpareParts());
					stockinDetail.setEntryNum(detail.getNum());
					stockinDetail.setStorageLocation(detail.getStorageLocation());
					stockinDetail.setWarehouseType(transfer.getInWarehouseType());
					stockinDetail.setLength(detail.getLength());
					stockinDetail.setWidth(detail.getWidth());

					stockinDetail.setStockinBatch(detail.getSparePartsBatch());
					;

					stockinDetailInputList.add(stockinDetail);

				});

				// 直接出库
				stockOutInput.setStockoutDetailInputList(
						stockoutDetailInputList.toArray(new AddStockoutDetailInput[stockoutDetailInputList.size()]));
				stockoutService.directOut(stockOutInput);

				// 调拨入库
				stockInInput.setStockinDetail(
						stockinDetailInputList.toArray(new AddStockinDetailInput[stockinDetailInputList.size()]));
				stockinService.TransferIn(stockInInput);

			}
		}
	}

}
