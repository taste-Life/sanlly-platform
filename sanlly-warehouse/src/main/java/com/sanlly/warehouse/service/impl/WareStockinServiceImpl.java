package com.sanlly.warehouse.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.*;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.invoice.InvoiceTypeOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.common.utils.ComputeUtil;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.warehouse.constants.BillTypeConstants;
import com.sanlly.warehouse.constants.DefaultConstants;
import com.sanlly.warehouse.constants.WarehouseConstants;
import com.sanlly.warehouse.dao.WareSparePartsMapper;
import com.sanlly.warehouse.dao.WareStockMapper;
import com.sanlly.warehouse.dao.WareStockinDetailMapper;
import com.sanlly.warehouse.dao.WareStockinMapper;
import com.sanlly.warehouse.entity.*;
import com.sanlly.warehouse.enums.InteTypeEnum;
import com.sanlly.warehouse.models.input.CostPool.AddPurchasePoolInput;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.stock.AddStockInput;
import com.sanlly.warehouse.models.input.stockin.*;
import com.sanlly.warehouse.models.output.spareparts.SparePartsBriefOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.models.output.stockin.StockinDetailOutput;
import com.sanlly.warehouse.models.output.stockin.StockinOutput;
import com.sanlly.warehouse.service.*;
import com.sanlly.warehouse.service.feign.ProductionFeignClient;
import com.sanlly.warehouse.service.feign.PurchaseFeignClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * ClassName: WareStockinServiceImpl Description: 入库单服务层实现 date: 2019/8/2 15:24
 *
 * @author wannt
 * @since JDK 1.8
 */
@Service
public class WareStockinServiceImpl extends BaseServiceImpl implements WareStockinService {

	@Autowired
	private WareStockinMapper stockinMapper;

	@Autowired
	private WareStockinDetailMapper stockinDetailMapper;

	@Autowired
	private BillTypeService billTypeService;

	@Autowired
	private WareSparePartsMapper sparePartsMapper;

	@Autowired
	private WareSparePartsService sparePartsService;

	@Autowired
	private WareStockService stockService;

	@Autowired
	private PurchaseFeignClient purchaseFeignClient;

	@Autowired
	private WareStockMapper stockMapper;
	@Autowired
	private WarehouseTypeService warehouseTypeService;

	@Autowired
	private ProductionFeignClient productionFeignClient;
	@Autowired
	private PurchasePoolService purchasePoolService;
	@Autowired
	private WarehouseService warehouseService;

	/**
	 * 分页查询入库单
	 * 
	 * @param input
	 * @return
	 */
	@Override
	public PagedList<StockinOutput> stockinPageList(SearchStockinInput input) {
		// 组装查询条件
		WareStockinExample example = new WareStockinExample();
		WareStockinExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		example.setOrderByClause("create_time desc");

		if (input.getWareStockinId() != null) {
			criteria.andWareStockinIdEqualTo(input.getWareStockinId());
		}
		if (input.getNo() != null && input.getNo() != "") {
			criteria.andNoLike("%" + input.getNo() + "%");
		}
		if (input.getStockinNo() != null && input.getStockinNo() != "") {
			criteria.andStockinNoLike("%" + input.getStockinNo() + "%");
		}
		if (input.getEscrowCompany() != null && input.getEscrowCompany() != "") {
			criteria.andEscrowCompanyEqualTo(input.getEscrowCompany());
		}
		if (input.getEntryStatus() != null && input.getEntryStatus() != "") {
			criteria.andEntryStatusEqualTo(input.getEntryStatus());
		}
		if (input.getInvoiceType() != null && input.getInvoiceType() != "") {
			criteria.andInvoiceTypeEqualTo(input.getInvoiceType());
		}
		if (input.getSupplierId() != null && input.getSupplierId() != "") {
			criteria.andSupplierIdLike("%" + input.getSupplierId() + "%");
		}
		if (input.getBillType() != null && input.getBillType() != "") {
			criteria.andBillTypeEqualTo(input.getBillType());
		}
		if (input.getAuditStatus() != null && input.getAuditStatus() != "") {
			criteria.andAuditStatusEqualTo(input.getAuditStatus());
		}
		if (input.getStartTime() != null && input.getEndTime() != null) {
			criteria.andCreateTimeBetween(input.getStartTime(), input.getEndTime());
		} else if (input.getStartTime() != null) {
			criteria.andCreateTimeBetween(input.getStartTime(), new Date());
		} else if (input.getEndTime() != null) {
			criteria.andCreateTimeBetween(new Date(0), input.getEndTime());
		}
		if (input.getWarehouse() != null && input.getWarehouse() != "") {
			criteria.andEntryWarehouseEqualTo(input.getWarehouse());
		}
		if ((input.getSparePartsName() != null && input.getSparePartsName() != "")
				|| (input.getSparePartsNo() != null && input.getSparePartsNo() != "")) {
			WareStockinDetailExample exampleDetail = new WareStockinDetailExample();
			WareStockinDetailExample.Criteria criteriaDetail = exampleDetail.createCriteria();
			criteriaDetail.andIsDelEqualTo(PlatformConstants.ISDEL_NO);

			WareSparePartsExample exampleSpareParts = new WareSparePartsExample();
			WareSparePartsExample.Criteria criteriaSpareParts = exampleSpareParts.createCriteria();
			criteriaSpareParts.andIsDelEqualTo(PlatformConstants.ISDEL_NO);

			if (input.getSparePartsName() != null && input.getSparePartsName() != "") {
				criteriaSpareParts.andSparePartsNameLike("%" + input.getSparePartsName() + "%");
			}
			if (input.getSparePartsNo() != null && input.getSparePartsNo() != "") {
				criteriaSpareParts.andSparePartsNoLike("%" + input.getSparePartsNo() + "%");
			}

			List<WareSpareParts> wareSpareParts = sparePartsMapper.selectByExample(exampleSpareParts);
			List<String> sparePartsKeyList = new ArrayList<>();
			for (WareSpareParts wareSparePart : wareSpareParts) {
				sparePartsKeyList.add(wareSparePart.getKey());
			}
			criteriaDetail.andSparePartsIn(sparePartsKeyList);
			List<WareStockinDetail> wareStockinDetails = stockinDetailMapper.selectByExample(exampleDetail);
			List<Integer> stockinId = new ArrayList<>();
			for (WareStockinDetail detail : wareStockinDetails) {
				stockinId.add(detail.getWareStockinId());
			}
			criteria.andWareStockinIdIn(stockinId);

		}
		if (input.getOfReturn() != null && input.getOfReturn() == true) {
			criteria.andBillTypeEqualTo(BillTypeConstants.SHDH);
			criteria.andEntryStatusEqualTo(StockinEnum.YESIN.getCode());

		}

		// 查询页数
		Integer totalItemCount = (int) stockinMapper.countByExample(example);
		PagedList<StockinOutput> pagedList = new PagedList<>(input.getPageIndex(), input.getPageSize(), totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		// 组装返回数据
		List<WareStockin> wareStockins = stockinMapper.selectByExample(example);
		List<StockinOutput> outputs = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (WareStockin wareStockin : wareStockins) {
			StockinOutput output = new StockinOutput();
			BeanUtils.copyProperties(wareStockin, output);
			output.setCompanyLangLang(wareStockin.getCompany());
			output.setEvaluateStatusLangLang(wareStockin.getEvaluateStatus());
			output.setBillTypeLangLang(wareStockin.getBillType());
			output.setEntryWarehouseLangLang(wareStockin.getEntryWarehouse());
			output.setInvoiceTypeLangLang(wareStockin.getInvoiceType());
			output.setSupplierIdLangLang(wareStockin.getSupplierId());
			output.setImage(wareStockin.getImage());
			output.setEntryStatusLangLang(wareStockin.getEntryStatus());
			output.setAuditStatusLangLang(wareStockin.getAuditStatus());
			output.setEscrowCompanyLangLang(wareStockin.getEscrowCompany());
			output.setOperator(getCurrentUserId());
			output.setOperatorName(getUserNameByUserId(getCurrentUserId()));
			if(wareStockin.getUpdateTime()!=null) {
				output.setStockInDate(sdf.format(wareStockin.getUpdateTime()));
			}
			
			List<WareStockinDetail> stockinDetailList = getStockinDetailList(wareStockin.getWareStockinId());
			List<StockinDetailOutput> detailOutputs = new ArrayList<>();
			for (WareStockinDetail stockinDetail : stockinDetailList) {
				StockinDetailOutput detailOutput = new StockinDetailOutput();
				BeanUtils.copyProperties(stockinDetail, detailOutput);
				SparePartsBriefOutput sparePartsBrief = sparePartsService
						.getSparePartsBrief(new EditSparePartsInput(stockinDetail.getSpareParts()));
				detailOutput.setSpareParts(sparePartsBrief.getKey());
				detailOutput.setSparePartsNo(sparePartsBrief.getSparePartsNo());
				detailOutput.setSparePartsCategories(sparePartsBrief.getSparePartsCategories());
				detailOutput.setWarehouseLangLang(stockinDetail.getWarehouse());
				detailOutput.setSparePartsCategoriesLangLang(detailOutput.getSparePartsCategories());
				detailOutput.setSparePartsLangLang(detailOutput.getSpareParts());
				detailOutput.setWarehouseTypeLangLang(stockinDetail.getWarehouseType());
				if (input.getOfReturn() != null && input.getOfReturn() == true) {
					StockOutput stockByBatch = stockService.getStockByBatch(stockinDetail.getStockinBatch(),
							stockinDetail.getSpareParts());
					detailOutput.setStockNum(stockByBatch.getActualSurplusNum());
				}
				detailOutputs.add(detailOutput);
			}
			output.setStockinDetail(detailOutputs);
			outputs.add(output);
		}
		pagedList.getDataList().addAll(outputs);
		return pagedList;
	}

	/**
	 * 根据入库单ID获取入库单
	 *
	 * @param id
	 * @author lishzh
	 */
	@Override
	public StockinOutput getStockinById(Integer id) {
		WareStockin wareStockin = stockinMapper.selectByPrimaryKey(id);
		StockinOutput output = new StockinOutput();
		BeanUtils.copyProperties(wareStockin, output);
		output.setCompanyLangLang(wareStockin.getCompany());
		output.setEvaluateStatusLangLang(wareStockin.getEvaluateStatus());
		output.setBillTypeLangLang(wareStockin.getBillType());
		output.setEntryWarehouseLangLang(wareStockin.getEntryWarehouse());
		output.setInvoiceTypeLangLang(wareStockin.getInvoiceType());
		output.setSupplierIdLangLang(wareStockin.getSupplierId());
		output.setImage(wareStockin.getImage());
		output.setEntryStatusLangLang(wareStockin.getEntryStatus());
		output.setAuditStatusLangLang(wareStockin.getAuditStatus());
		output.setEscrowCompanyLangLang(wareStockin.getEscrowCompany());
		output.setOperator(getCurrentUserId());
		output.setOperatorName(getUserNameByUserId(getCurrentUserId()));
		output.setStockInDate(DateUtil.date2String(wareStockin.getCreateTime()));
		output.setStockinDetail(getDetailOutputs(id));
		return output;
	}

	/**
	 *根据入库单ID获取detail outputs
	 *
	 *@author lishzh
	 */
	public List<StockinDetailOutput> getDetailOutputs(Integer id){
		return getStockinDetailList(id).stream().map(d -> {
			StockinDetailOutput output = new StockinDetailOutput();
			BeanUtils.copyProperties(d, output);
			SparePartsBriefOutput sparePart = sparePartsService
					.getSparePartsBrief(new EditSparePartsInput(d.getSpareParts()));
			output.setSpareParts(sparePart.getKey());
			output.setSparePartsNo(sparePart.getSparePartsNo());
			output.setSparePartsCategories(sparePart.getSparePartsCategoriesDetails());
			output.setWarehouseLangLang(d.getWarehouse());
			output.setSparePartsCategoriesLangLang(output.getSparePartsCategories());
			output.setSparePartsLangLang(output.getSpareParts());
			output.setWarehouseTypeLangLang(d.getWarehouseType());
			return output;
		}).collect(Collectors.toList());
	}

	/**
	 * 新增入库单
	 * 
	 * @param input
	 */
	@Override
	@Transactional
	public Integer addStockin(AddStockinInput input) {
		WareStockin stockin = new WareStockin();
		BeanUtils.copyProperties(input, stockin);
		stockin.setStockinNo(billTypeService.getBillNumberByKey(BillTypeConstants.STOCKIN));
		stockin.setCompany(getCurrentCompanyKey());
		stockin.setNo(input.getNo());
		stockin.setImage(input.getImage());
		stockin.setIsStockSbs(CommonEnum.NO.getCode());
		if (input.getEntryStatus() != null && input.getEntryStatus() != "") {
			stockin.setEntryStatus(input.getEntryStatus());
		} else if(BillTypeConstants.SHDH.equals(input.getBillType())){
			stockin.setEntryStatus(StockinEnum.UNAUDIT.getCode());
		} else {
			stockin.setEntryStatus(StockinEnum.NOIN.getCode());
		}
		if (input.getAuditStatus() != null && input.getAuditStatus() != "") {
			stockin.setAuditStatus(input.getAuditStatus());
		} else {
			stockin.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
		}
		stockin.setEvaluateStatus(CommonEnum.NO.getCode());
		stockin.setIsDel(PlatformConstants.ISDEL_NO);
		stockin.setCreateTime(new Date());
		stockin.setCreateUser(getCurrentUserId());
		stockinMapper.insert(stockin);
		for (AddStockinDetailInput detailInput : input.getStockinDetail()) {
			WareStockinDetail stockinDetail = new WareStockinDetail();
			BeanUtils.copyProperties(detailInput, stockinDetail);
			SparePartsOutput spareParts = sparePartsService
					.getSpareParts(new EditSparePartsInput(detailInput.getSpareParts()));
			stockinDetail.setLength(spareParts.getLength());
			stockinDetail.setWidth(spareParts.getWidth());
			if (spareParts.getLength() != null && spareParts.getWidth() == null) {
				// 只有长度
				stockinDetail.setEntryArea(spareParts.getLength() * detailInput.getEntryNum());
			} else if (spareParts.getLength() != null && spareParts.getWidth() != null) {
				// 有长度有宽度
				stockinDetail.setEntryArea(spareParts.getLength() * spareParts.getWidth() * detailInput.getEntryNum());
			} else {
				stockinDetail.setEntryArea(0D);
			}
			stockinDetail.setDeliveryNum(detailInput.getDeliveryNum());
			stockinDetail.setEntryNum(detailInput.getEntryNum());
			stockinDetail.setSurplusNum(detailInput.getEntryNum());
			stockinDetail.setEntryPrice(detailInput.getEntryPrice());
			if(BillTypeConstants.SHDH.equals(input.getBillType())) {
				stockinDetail.setWarehouseType(stockinDetail.getWarehouseType());
				if (stockinDetail.getWarehouseType() == null || stockinDetail.getWarehouseType() == "") {
					stockinDetail.setWarehouseType(sparePartsService
							.getSpareParts(new EditSparePartsInput(detailInput.getSpareParts())).getDefaultWarehouseType());
				}
			}else {
				stockinDetail.setWarehouseType(input.getWarehouseType());
				if (stockinDetail.getWarehouseType() == null || stockinDetail.getWarehouseType() == "") {
					stockinDetail.setWarehouseType(sparePartsService
							.getSpareParts(new EditSparePartsInput(detailInput.getSpareParts())).getDefaultWarehouseType());
				}
			}
			stockinDetail.setEntryPrice(detailInput.getEntryPrice());
			stockinDetail.setVat(detailInput.getVat());
			stockinDetail.setFreight(detailInput.getFreight());
			stockinDetail.setCore(detailInput.getCore());
			stockinDetail.setInvoicePrice(detailInput.getInvoicePrice());
			stockinDetail.setTariff(detailInput.getTariff());
			stockinDetail.setSpareParts(detailInput.getSpareParts());
			stockinDetail.setCreateTime(new Date());
			stockinDetail.setCreateUser(getCurrentUserId());
			stockinDetail.setIsDel(PlatformConstants.ISDEL_NO);
			stockinDetail.setStockinBatch(getBatch(stockinDetail.getWarehouseType(), sparePartsService
					.getSparePartsBrief(new EditSparePartsInput(stockinDetail.getSpareParts())).getSparePartsNo()));
			stockinDetail.setSparePartsOriginalBatch(stockinDetail.getStockinBatch());
			stockinDetail.setWareStockinId(stockin.getWareStockinId());
			stockinDetail.setSurplusNum(detailInput.getEntryNum());
			stockinDetailMapper.insert(stockinDetail);
		}
		// 供应商评价-采购送货
		if(BillTypeConstants.SHDH.equals(input.getBillType())) {
			purchaseFeignClient.evaluatePriceAndTimely(input.getNo(),getCurrentUserId());
		}
		return stockin.getWareStockinId();
	}

	/**
	 * 修改入库单
	 * 
	 * @param input
	 */
	@Override
	public void editStockin(EditStockinInput input) {
		WareStockin stockin = new WareStockin();
		BeanUtils.copyProperties(input, stockin);
		stockin.setUpdateTime(new Date());
		stockin.setUpdateUser(getCurrentUserId());
		stockinMapper.updateByPrimaryKeySelective(stockin);
	}

	/**
	 * 入库单批量审核通过
	 * 
	 * @param ids
	 */
	@Override
	@Transactional
	public void auditPassStockin(Integer[] ids) {
		WareStockinExample example = new WareStockinExample();
		WareStockinExample.Criteria criteria = example.createCriteria();
		criteria.andWareStockinIdIn(Arrays.asList(ids));
		List<WareStockin> wareStockins = stockinMapper.selectByExample(example);
		for (WareStockin wareStockin : wareStockins) {
			if (!AuditStateEnum.UNAUDIT.getCode().equals(wareStockin.getAuditStatus())) {
				throw new RuntimeException("auditErr");
			}
		}
		WareStockin stockin = new WareStockin();
		stockin.setUpdateUser(getCurrentUserId());
		stockin.setUpdateTime(new Date());
		stockin.setAuditStatus(AuditStateEnum.AUDITED.getCode());
		stockinMapper.updateByExampleSelective(stockin, example);
		stockin(ids);

	}

	/**
	 * 入库单批量驳回
	 * 
	 * @param ids
	 * @param reasonsRejection
	 */
	@Override
	@Transactional
	public void auditRejectStockin(Integer[] ids, String reasonsRejection) {
		WareStockinExample example = new WareStockinExample();
		WareStockinExample.Criteria criteria = example.createCriteria();
		criteria.andWareStockinIdIn(Arrays.asList(ids));
		List<WareStockin> wareStockins = stockinMapper.selectByExample(example);
		for (WareStockin wareStockin : wareStockins) {
			if (!AuditStateEnum.UNAUDIT.getCode().equals(wareStockin.getAuditStatus())) {
				throw new RuntimeException("auditErr");
			}
		}

		WareStockin stockin = new WareStockin();
		stockin.setUpdateUser(getCurrentUserId());
		stockin.setUpdateTime(new Date());
		stockin.setAuditStatus(AuditStateEnum.REJECTED.getCode());
		stockin.setReasonsRejection(reasonsRejection);
		stockinMapper.updateByExampleSelective(stockin, example);
	}

	/**
	 * 批量入库
	 * 
	 * @param ids
	 */
	@Override
	@Transactional
	public void stockin(Integer[] ids) {
		WareStockinExample example = new WareStockinExample();
		WareStockinExample.Criteria criteria = example.createCriteria();
		criteria.andWareStockinIdIn(Arrays.asList(ids));
		List<WareStockin> wareStockins = stockinMapper.selectByExample(example);
		for (WareStockin wareStockin : wareStockins) {
			Map<String, AddPurchaseSBSInput> purchaseMap = new HashMap<String, AddPurchaseSBSInput>();

			String currency = purchaseFeignClient.getCurrencyByKey(wareStockin.getSupplierId()).getData();
			for (WareStockinDetail stockinDetail : getStockinDetailList(wareStockin.getWareStockinId())) {
				AddStockInput stockInput = new AddStockInput();
				BeanUtils.copyProperties(stockinDetail, stockInput);
				stockInput.setStockinNo(wareStockin.getStockinNo());
				stockInput.setCompany(wareStockin.getCompany());
				stockInput.setWarehouseType(stockinDetail.getWarehouseType());
				stockInput.setWarehouse(wareStockin.getEntryWarehouse());
				stockInput.setEscrowCompany(wareStockin.getEscrowCompany());
				stockInput.setStorageLocation(stockinDetail.getStorageLocation());
				SparePartsOutput spareParts = sparePartsService
						.getSpareParts(new EditSparePartsInput(stockinDetail.getSpareParts()));
				stockInput.setSparePartsCategories(spareParts.getSparePartsCategories());
				if (spareParts.getLength() != null && spareParts.getLength() != 0
						&& (spareParts.getWidth() == null || spareParts.getWidth() == 0)) {
					stockInput.setOriginalArea(spareParts.getLength());
				} else if (spareParts.getLength() != null && spareParts.getLength() != 0
						&& spareParts.getWidth() != null && spareParts.getWidth() != 0) {
					stockInput.setOriginalArea(spareParts.getLength() * spareParts.getWidth());
				} else {
					stockInput.setOriginalArea(0D);
				}
				stockInput.setSparePartsName(spareParts.getSparePartsName());
				stockInput.setSparePartsNo(spareParts.getSparePartsNo());
				stockInput.setSpareParts(stockinDetail.getSpareParts());
				stockInput.setSparePartsUnit(spareParts.getSparePartsUnit());
				stockInput.setLength(spareParts.getLength());
				stockInput.setWidth(spareParts.getWidth());
				stockInput.setSparePartsBatch(stockinDetail.getStockinBatch());
				stockInput.setSparePartsOriginalBatch(stockinDetail.getSparePartsOriginalBatch());
				stockInput.setEntryNum(stockinDetail.getEntryNum());
				stockInput.setInvoicePrice(stockinDetail.getInvoicePrice());
				stockInput.setCore(stockinDetail.getCore());
				stockInput.setVat(stockinDetail.getVat());
				stockInput.setTariffStatus(stockinDetail.getTariffStatus());
				stockInput.setTariff(stockinDetail.getTariff());
				stockInput.setTariffDate(stockinDetail.getTariffDate());
				stockInput.setTariffNo(stockinDetail.getTariffNo());
				stockInput.setFreight(stockinDetail.getFreight());
				stockInput.setUnitPrice(stockinDetail.getEntryPrice());
				stockInput.setOldStockinDate(stockinDetail.getOldStockinDate());
				stockInput.setStockinDate(new Date());
				stockService.addStock(stockInput);

				// 上传SBS
				String CBSType = warehouseTypeService.getCBSType(stockinDetail.getWarehouseType());
				if (BillTypeConstants.SHDH.equals(wareStockin.getBillType())
						&& FinanceCurrencyType.CNY.getCode().equals(currency)) {
					// 采购入库-国内
					if (purchaseMap.containsKey(CBSType)) {
						AddPurchaseSBSInput purchaseSBSInput = purchaseMap.get(CBSType);
						purchaseSBSInput.setLocNetAmt(ComputeUtil.add(purchaseSBSInput.getLocNetAmt(), ComputeUtil
								.mul(stockinDetail.getEntryPrice(), new BigDecimal(stockinDetail.getEntryNum()))));
						purchaseSBSInput.setLocTtlAmt(ComputeUtil.add(purchaseSBSInput.getLocTtlAmt(),
								ComputeUtil.add(purchaseSBSInput.getLocNetAmt(), stockinDetail.getVat())));
						purchaseSBSInput.setLocTaxAmt(ComputeUtil.add(purchaseSBSInput.getLocTaxAmt(),
								ComputeUtil.sub(purchaseSBSInput.getLocTtlAmt(), purchaseSBSInput.getLocNetAmt())));
					} else {
						AddPurchaseSBSInput purchaseSBSInput = new AddPurchaseSBSInput();
						purchaseSBSInput.setInvtrTyp(CBSType);
						purchaseSBSInput.setLocNetAmt(ComputeUtil.mul(stockinDetail.getEntryPrice(),
								new BigDecimal(stockinDetail.getEntryNum())));
						purchaseSBSInput
								.setLocTtlAmt(ComputeUtil.add(purchaseSBSInput.getLocNetAmt(), stockinDetail.getVat()));
						purchaseSBSInput.setLocTaxAmt(
								ComputeUtil.sub(purchaseSBSInput.getLocTtlAmt(), purchaseSBSInput.getLocNetAmt()));
						purchaseMap.put(CBSType, purchaseSBSInput);
					}
				} else if (BillTypeConstants.SHDH.equals(wareStockin.getBillType())
						&& !FinanceCurrencyType.CNY.getCode().equals(currency)) {
					// 采购入库-进口
					if (purchaseMap.containsKey(CBSType)) {
						AddPurchaseSBSInput purchaseSBSInput = purchaseMap.get(CBSType);
						purchaseSBSInput.setLocNetAmt(ComputeUtil.add(purchaseSBSInput.getLocNetAmt(), ComputeUtil
								.mul(stockinDetail.getInvoicePrice(), new BigDecimal(stockinDetail.getEntryNum())))); // 发票单价*数量

						purchaseSBSInput
								.setLocNetAmtTariff(ComputeUtil.add(purchaseSBSInput.getLocNetAmtTariff(), ComputeUtil
										.mul(stockinDetail.getTariff(), new BigDecimal(stockinDetail.getEntryNum()))));// 关税*数量取两位小数，求和
						purchaseSBSInput.setLocTtlAmtTariff(ComputeUtil.add(purchaseSBSInput.getLocTtlAmtTariff(),
								ComputeUtil.add(stockinDetail.getVat(), purchaseSBSInput.getLocNetAmtTariff()))); // 增值税+关税*数量
						purchaseSBSInput.setLocTaxAmtTariff(ComputeUtil.sub(purchaseSBSInput.getLocTtlAmtTariff(),
								purchaseSBSInput.getLocNetAmtTariff())); // （增值税+关税*数量）取两位小数求和-（关税*数量）取两位小数求和
					} else {
						AddPurchaseSBSInput purchaseSBSInput = new AddPurchaseSBSInput();
						purchaseSBSInput.setInvtrTyp(CBSType);
						purchaseSBSInput.setLocNetAmt(ComputeUtil.mul(stockinDetail.getInvoicePrice(),
								new BigDecimal(stockinDetail.getEntryNum()))); // 发票单价*数量取两位小数

						purchaseSBSInput.setLocNetAmtTariff(ComputeUtil.mul(stockinDetail.getTariff(),
								new BigDecimal(stockinDetail.getEntryNum())));// 增值税+关税*数量
						purchaseSBSInput.setLocTtlAmtTariff(
								ComputeUtil.add(stockinDetail.getVat(), purchaseSBSInput.getLocNetAmtTariff())); // 增值税+关税*数量
						purchaseSBSInput.setLocTaxAmtTariff(ComputeUtil.sub(purchaseSBSInput.getLocTtlAmtTariff(),
								purchaseSBSInput.getLocNetAmtTariff())); // （增值税+关税*数量）取两位小数求和-（关税*数量）取两位小数
						purchaseMap.put(CBSType, purchaseSBSInput);
					}

				}
				// 上传SBS

			}
			// 上传SBS
			if (BillTypeConstants.SHDH.equals(wareStockin.getBillType())
					&& FinanceCurrencyType.CNY.getCode().equals(currency)) {
				uploadSbs(wareStockin, purchaseMap);
			} else if (BillTypeConstants.SHDH.equals(wareStockin.getBillType())
					&& !FinanceCurrencyType.CNY.getCode().equals(currency)) {
				uploadSbsOverseas(wareStockin, purchaseMap);
			}
			// 上传SBS
		}

		WareStockin stockin = new WareStockin();
		stockin.setUpdateUser(getCurrentUserId());
		stockin.setUpdateTime(new Date());
		stockin.setEntryStatus(StockinEnum.YESIN.getCode());
		stockinMapper.updateByExampleSelective(stockin, example);

		for (Integer id : ids) {
			SearchStockinInput input = new SearchStockinInput(1, 1);
			input.setWareStockinId(id);
			stockinRerurn(stockinPageList(input).getDataList().get(0));
		}
	}

	/**
	 * 
	 * @Description: 上传数据到SBS费用池 - 物料国内采购入库
	 * @param wareStockin
	 *            void @throws 
	 */
	private void uploadSbs(WareStockin wareStockin, Map<String, AddPurchaseSBSInput> purchaseMap) {
		for (String CBSType : purchaseMap.keySet()) {
			AddPurchaseSBSInput purchaseSBSInput = purchaseMap.get(CBSType);
			// 添加入库备件成本至采购费用池
			AddPurchasePoolInput purchasePoolInput = new AddPurchasePoolInput();
			purchasePoolInput.setBizDte(DateUtil.date2String(new Date())); // 业务日期
			purchasePoolInput.setCcyCde(FinanceCurrencyType.CNY.getCode()); // 币种
			purchasePoolInput.setCompCde(productionFeignClient.getCompanyCode(wareStockin.getCompany()).getData()); // 公司代码
			purchasePoolInput.setIncldTaxInd("Y"); // 是否含税
			if (BillTypeConstants.SHDH.equals(wareStockin.getBillType())) {
				purchasePoolInput.setInteType(InteTypeEnum.P002.getCode()); // 接口类别
			}

			InvoiceTypeOutput invoiceType = purchaseFeignClient.getInvoice(wareStockin.getInvoiceType()).getData();
			if (invoiceType != null) {
				Double rate = invoiceType.getInvoicePoint() * 100;
				purchasePoolInput.setInvTaxRate(String.valueOf(rate.intValue())); // 发票税率
				purchasePoolInput.setInvTyp(invoiceType.getInvoiceCategroy()); // 发票类型
			}
			purchasePoolInput.setInvtrTyp(CBSType); // 仅物料销售成本使用
			if (BillTypeConstants.SHDH.equals(wareStockin.getBillType())) {
				purchasePoolInput.setItmTypCde(InteTypeEnum.P002.getCode()); // 行项目类型
			}
			purchasePoolInput.setLegacyCreByUsr(wareStockin.getCreateUser().toString()); // 制单人
			purchasePoolInput.setLegacyDocTyp(wareStockin.getBillType()); // 业务类型
			purchasePoolInput.setLegacyOrdrId(wareStockin.getWareStockinId().toString()); // 单据id
			purchasePoolInput.setLegacyOrdrNum(wareStockin.getStockinNo()); // 单据号
			purchasePoolInput.setLegacyVndrId(wareStockin.getSupplierId()); // 供应商id
			purchasePoolInput.setLocCcyCde(FinanceCurrencyType.CNY.getCode()); // 本位币种
			purchasePoolInput.setLocNetAmt(String.valueOf(purchaseSBSInput.getLocNetAmt())); // 本位币净额
			purchasePoolInput.setLocTtlAmt(String.valueOf(purchaseSBSInput.getLocTtlAmt())); // 本位金额
			purchasePoolInput.setLocTaxAmt(String.valueOf(purchaseSBSInput.getLocTaxAmt())); // 本位币税额
			purchasePoolInput.setPurUsr(wareStockin.getPurchaseUserId().toString()); // 采购人
			purchasePoolInput.setRefBizNum(wareStockin.getStockinNo()); // 调整对应单据号
			if (CommonEnum.YES.getCode().equals(warehouseService.getLockStatus(wareStockin.getCompany()))) {
				purchasePoolInput.setStats("O"); // 锁库传SBS
			} else {
				purchasePoolInput.setStats("I"); // 默认状态
			}
			purchasePoolInput.setNetAmt(String.valueOf(purchaseSBSInput.getLocNetAmt())); // 净额
			purchasePoolInput.setTtlAmt(String.valueOf(purchaseSBSInput.getLocTtlAmt())); // 总额
			purchasePoolInput.setTaxAmt(String.valueOf(purchaseSBSInput.getLocTaxAmt())); // 税额
			purchasePoolInput.setVndrNme(wareStockin.getSupplierId()); // 供应商名称
			purchasePoolInput
					.setVndrSapId(purchaseFeignClient.getSupplierSapByKey(wareStockin.getSupplierId()).getData()); // 供应商sap
			purchasePoolService.addPurchasePool(purchasePoolInput);
		}
	}

	/**
	 * 
	 * @Description: 上传数据到SBS费用池 - 物料国内采购入库
	 * @param wareStockin
	 *            void @throws 
	 */
	private void uploadSbsOverseas(WareStockin wareStockin, Map<String, AddPurchaseSBSInput> purchaseMap) {
		for (String CBSType : purchaseMap.keySet()) {
			AddPurchaseSBSInput purchaseSBSInput = purchaseMap.get(CBSType);
			// 添加入库备件成本至采购费用池
			AddPurchasePoolInput purchasePoolInput = new AddPurchasePoolInput();
			// 采购入库（含关税）
			purchasePoolInput.setBizDte(DateUtil.date2String(new Date())); // 业务日期
			purchasePoolInput.setCcyCde(FinanceCurrencyType.CNY.getCode()); // 币种
			purchasePoolInput.setCompCde(productionFeignClient.getCompanyCode(wareStockin.getCompany()).getData()); // 公司代码
			purchasePoolInput.setIncldTaxInd("Y"); // 是否含税
			purchasePoolInput.setInteType(InteTypeEnum.P002.getCode()); // 接口类别
			InvoiceTypeOutput invoiceType = purchaseFeignClient.getInvoice(wareStockin.getInvoiceType()).getData();
			if (invoiceType != null) {
				Double rate = invoiceType.getInvoicePoint() * 100;
				purchasePoolInput.setInvTaxRate(String.valueOf(rate.intValue())); // 发票税率
				purchasePoolInput.setInvTyp(invoiceType.getInvoiceCategroy()); // 发票类型
			}

			purchasePoolInput.setInvtrTyp(CBSType); // 仅物料销售成本使用
			purchasePoolInput.setItmTypCde(InteTypeEnum.P002.getCode()); // 行项目类型
			purchasePoolInput.setLegacyCreByUsr(wareStockin.getCreateUser().toString()); // 制单人
			purchasePoolInput.setLegacyDocTyp(wareStockin.getBillType()); // 业务类型
			purchasePoolInput.setLegacyOrdrId(wareStockin.getWareStockinId().toString() + "+GW+00"); // 单据id
			purchasePoolInput.setLegacyOrdrNum(wareStockin.getStockinNo() + "GW00"); // 单据号
			purchasePoolInput.setLegacyVndrId(wareStockin.getSupplierId()); // 供应商id
			purchasePoolInput.setLocCcyCde(FinanceCurrencyType.CNY.getCode()); // 本位币种
			purchasePoolInput.setLocNetAmt(String.valueOf(purchaseSBSInput.getLocNetAmt())); // 本位币净额
			purchasePoolInput.setLocTtlAmt(String.valueOf(purchaseSBSInput.getLocNetAmt())); // 本位金额
			purchasePoolInput.setLocTaxAmt(String.valueOf(purchaseSBSInput.getLocNetAmt())); // 本位币税额
			purchasePoolInput.setPurUsr(wareStockin.getPurchaseUserId().toString()); // 采购人
			purchasePoolInput.setRefBizNum(wareStockin.getStockinNo()); // 调整对应单据号
			if (CommonEnum.YES.getCode().equals(warehouseService.getLockStatus(wareStockin.getCompany()))) {
				purchasePoolInput.setStats("O"); // 锁库传SBS
			} else {
				purchasePoolInput.setStats("I"); // 默认状态
			}
			purchasePoolInput.setNetAmt(String.valueOf(purchaseSBSInput.getLocNetAmt())); // 净额
			purchasePoolInput.setTtlAmt(String.valueOf(purchaseSBSInput.getLocNetAmt())); // 总额
			purchasePoolInput.setTaxAmt(String.valueOf(purchaseSBSInput.getLocNetAmt())); // 税额
			purchasePoolInput.setVndrNme(wareStockin.getSupplierId()); // 供应商名称
			purchasePoolInput
					.setVndrSapId(purchaseFeignClient.getSupplierSapByKey(wareStockin.getSupplierId()).getData()); // 供应商sap
			purchasePoolService.addPurchasePool(purchasePoolInput);

			// 关税
			purchasePoolInput.setChrgCde("CUSTOM"); // 仅服务销售使用
			purchasePoolInput.setCustomTariffAmt(String.valueOf(purchaseSBSInput.getLocNetAmtTariff()));// 关税
			
			purchasePoolInput.setInvTaxRate("0"); // 发票税率
			purchasePoolInput.setInvTyp(InvoiceCategoryEnum.GENERAL.getCode()); // 发票类型
			purchasePoolInput.setLegacyOrdrId(wareStockin.getWareStockinId().toString() + "GW01"); // 单据id
			purchasePoolInput.setLegacyOrdrNum(wareStockin.getStockinNo() + "GW01"); // 单据号
			purchasePoolInput.setLocNetAmt(String.valueOf(purchaseSBSInput.getLocNetAmtTariff())); // 本位币净额
			purchasePoolInput.setLocTtlAmt(String.valueOf(purchaseSBSInput.getLocTtlAmtTariff())); // 本位金额
			purchasePoolInput.setLocTaxAmt(String.valueOf(purchaseSBSInput.getLocTaxAmtTariff())); // 本位币税额
			purchasePoolInput.setNetAmt(String.valueOf(purchaseSBSInput.getLocNetAmtTariff())); // 净额
			purchasePoolInput.setTtlAmt(String.valueOf(purchaseSBSInput.getLocTtlAmtTariff())); // 总额
			purchasePoolInput.setTaxAmt(String.valueOf(purchaseSBSInput.getLocTaxAmtTariff())); // 税额
			purchasePoolInput.setVndrNme("LKSUPPLIER000146"); // 供应商名称
			purchasePoolInput.setVndrSapId(wareStockin.getSupplierId());
			purchasePoolService.addPurchasePool(purchasePoolInput);
		}
	}

	/**
	 * 入库回调
	 */
	private void stockinRerurn(StockinOutput stockinOutput) {

		if (BillTypeConstants.SHDH.equals(stockinOutput.getBillType())) {
			// 采购送货单
			purchaseFeignClient.deliveryStockin(stockinOutput);
		}
	}

	/**
	 * 新增代管入库单
	 * 
	 * @param input
	 */
	@Override
	@Transactional
	public void addEscrowIn(AddStockinInput input) {
		WareStockin stockin = new WareStockin();
		BeanUtils.copyProperties(input, stockin);
		stockin.setStockinNo(billTypeService.getBillNumber(input.getBillType()));
		stockin.setEntryStatus(StockinEnum.NOIN.getCode());
		stockin.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
		stockin.setIsDel(PlatformConstants.ISDEL_NO);
		stockin.setCreateTime(new Date());
		stockin.setCreateUser(getCurrentUserId());
		stockinMapper.insert(stockin);

		for (AddStockinDetailInput detailInput : input.getStockinDetail()) {
			WareStockinDetail stockinDetail = new WareStockinDetail();
			BeanUtils.copyProperties(detailInput, stockinDetail);
			stockinDetail.setCreateTime(new Date());
			stockinDetail.setCreateUser(getCurrentUserId());
			stockinDetail.setIsDel(PlatformConstants.ISDEL_NO);
			stockinDetail.setStockinBatch(getBatch(detailInput.getWarehouseType(), sparePartsService
					.getSparePartsBrief(new EditSparePartsInput(detailInput.getSpareParts())).getSparePartsNo()));
			stockinDetail.setWareStockinId(stockin.getWareStockinId());
			stockinDetailMapper.insert(stockinDetail);
		}
	}

	/**
	 * 根据入库单id获取入库明细列表
	 * 
	 * @param stockinId
	 * @return
	 */
	public List<WareStockinDetail> getStockinDetailList(Integer stockinId) {
		WareStockinDetailExample example = new WareStockinDetailExample();
		WareStockinDetailExample.Criteria criteria = example.createCriteria();
		criteria.andWareStockinIdEqualTo(stockinId);
		return stockinDetailMapper.selectByExample(example);
	}

	/**
	 * 生成批次号 仓库类型编码/备件号/日期（yyMMdd）八位序列号
	 * 
	 * @param warehouseType
	 * @param sparePartsNo
	 * @return
	 */
	public String getBatch(String warehouseType, String sparePartsNo) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		int length = warehouseType.length();
		// 仓库类型编码
		String str = "000";
		if (length >= 3) {
			str = warehouseType.substring(length - 3, length);
		}
		// 日期
		String format = sdf.format(new Date());
		String substring = format.substring(1, format.length());
		// 八位序列号
		String random = genRandomNum();

		String returnStr = str + "/" + sparePartsNo + "/" + substring + "/" + random;

		return returnStr;
	}

	/**
	 * 生成八位随机码
	 * 
	 * @return
	 */
	private String genRandomNum() {
		int maxNum = 36;
		int i;
		int count = 0;
		char[] str = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		StringBuffer pwd = new StringBuffer("");
		Random r = new Random();
		while (count < 8) {
			i = Math.abs(r.nextInt(maxNum));
			if (i >= 0 && i < str.length) {
				pwd.append(str[i]);
				count++;
			}
		}
		return pwd.toString();
	}

	/**
	 * 新增自动审核入库单
	 * 
	 * @param input
	 */
	@Override
	@Transactional
	public void addStockinAudited(AddStockinInput input) {
		WareStockin stockin = new WareStockin();
		BeanUtils.copyProperties(input, stockin);
		stockin.setStockinNo(billTypeService.getBillNumberByKey(input.getBillType()));
		// 全部入库
		stockin.setEntryStatus(StockinEnum.YESIN.getCode());
		// 已审核
		stockin.setAuditStatus(AuditStateEnum.AUDITED.getCode());
		stockin.setIsDel(PlatformConstants.ISDEL_NO);
		stockin.setCreateTime(new Date());
		stockin.setCreateUser(getCurrentUserId());
		stockinMapper.insert(stockin);
		for (AddStockinDetailInput detailInput : input.getStockinDetail()) {
			WareStockinDetail stockinDetail = new WareStockinDetail();
			BeanUtils.copyProperties(detailInput, stockinDetail);
			stockinDetail.setWarehouseType(detailInput.getWarehouseType());
			if (stockinDetail.getWarehouseType() == null || stockinDetail.getWarehouseType() == "") {
				stockinDetail.setWarehouseType(input.getWarehouseType());
			}
			stockinDetail.setSpareParts(detailInput.getKey());
			stockinDetail.setCreateTime(new Date());
			stockinDetail.setCreateUser(getCurrentUserId());
			stockinDetail.setIsDel(PlatformConstants.ISDEL_NO);
			stockinDetail.setStockinBatch(getBatch(stockinDetail.getWarehouseType(), sparePartsService
					.getSparePartsBrief(new EditSparePartsInput(stockinDetail.getSpareParts())).getSparePartsNo()));
			stockinDetail.setWareStockinId(stockin.getWareStockinId());
			stockinDetailMapper.insert(stockinDetail);
		}
	}

	/**
	 * 入库
	 * 
	 * @param input
	 */
	@Override
	@Transactional
	public void in(StockinOutput input) {

	}

	/**
	 * 添加入库单
	 */
	@Override
	@Transactional
	public Integer addStockin(StockInInput input) {
		WareStockin stockin = new WareStockin();
		BeanUtils.copyProperties(input, stockin);
		// 入库单号
		String billNumber = billTypeService.getBillNumberByKey(BillTypeConstants.STOCKIN);
		if (StringUtils.isEmpty(billNumber)) {
			throw new RuntimeException("insertFail");
		}
		stockin.setStockinNo(billNumber);
		// 未删除
		stockin.setIsDel(PlatformConstants.ISDEL_NO);
		// 创建时间
		stockin.setCreateTime(new Date());
		// 创建用户
		stockin.setCreateUser(getCurrentUserId());
		// 保存借入单
		stockinMapper.insert(stockin);
		// 保存明细
		for (AddStockinDetailInput detailInput : input.getStockinDetail()) {
			WareStockinDetail stockinDetail = new WareStockinDetail();
			stockinDetail.setDeliveryNum(DefaultConstants.DOUBLEDEFAULT);
			stockinDetail.setEntryArea(DefaultConstants.DOUBLEDEFAULT);
			stockinDetail.setEntryNum(DefaultConstants.DOUBLEDEFAULT);
			stockinDetail.setSurplusNum(DefaultConstants.DOUBLEDEFAULT);
			BeanUtils.copyProperties(detailInput, stockinDetail);
			stockinDetail
					.setLength(Optional.ofNullable(detailInput.getLength()).orElse(DefaultConstants.DOUBLEDEFAULT));
			stockinDetail.setWidth(Optional.ofNullable(detailInput.getWidth()).orElse(DefaultConstants.DOUBLEDEFAULT));
			// 如果参数中没有入库的仓库类型则入库仓库类型为备件默认仓库类型
			if (StringUtils.isEmpty(detailInput.getWarehouseType())) {
				stockinDetail.setWarehouseType(sparePartsService
						.getSpareParts(new EditSparePartsInput(detailInput.getSpareParts())).getDefaultWarehouseType());
			}

			// 创建时间
			stockinDetail.setCreateTime(new Date());
			// 创建用户
			stockinDetail.setCreateUser(getCurrentUserId());
			// 未删除
			stockinDetail.setIsDel(PlatformConstants.ISDEL_NO);
			stockinDetail.setEntryArea(new BigDecimal(stockinDetail.getLength())
					.multiply(new BigDecimal(stockinDetail.getWidth())).doubleValue());
			// 生成入库批次
			stockinDetail.setStockinBatch(getBatch(stockinDetail.getWarehouseType(), sparePartsService
					.getSparePartsBrief(new EditSparePartsInput(stockinDetail.getSpareParts())).getSparePartsNo()));
			// 原始批次
			stockinDetail.setSparePartsOriginalBatch(stockinDetail.getStockinBatch());
			// 入库单id
			stockinDetail.setWareStockinId(stockin.getWareStockinId());
			stockinDetail.setSurplusNum(detailInput.getEntryNum());
			stockinDetailMapper.insert(stockinDetail);
		}
		return stockin.getWareStockinId();

	}

	/**
	 * 直接入库
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void directIn(StockInInput input) {
		// 已传SBS
		input.setIsStockSbs(CommonEnum.YES.getCode());
		// 已入库
		input.setEntryStatus(StockinEnum.YESIN.getCode());
		// 已审核
		input.setAuditStatus(AuditStateEnum.AUDITED.getCode());
		// 生成入库单
		Integer stockinId = addStockin(input);

		// 添加库存
		stockin(new Integer[] { stockinId });

	}

	/**
	 * 调拨入库
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void TransferIn(StockInInput input) {
		// 已传SBS
		input.setIsStockSbs(CommonEnum.YES.getCode());
		// 已入库
		input.setEntryStatus(StockinEnum.YESIN.getCode());
		// 已审核
		input.setAuditStatus(AuditStateEnum.AUDITED.getCode());
		// 生成入库单

		WareStockin stockin = new WareStockin();
		BeanUtils.copyProperties(input, stockin);
		// 入库单号
		String billNumber = billTypeService.getBillNumberByKey(BillTypeConstants.STOCKIN);
		if (StringUtils.isEmpty(billNumber)) {
			throw new RuntimeException("insertFail");
		}
		stockin.setStockinNo(billNumber);
		// 未删除
		stockin.setIsDel(PlatformConstants.ISDEL_NO);
		// 创建时间
		stockin.setCreateTime(new Date());
		// 创建用户
		stockin.setCreateUser(getCurrentUserId());
		// 保存借入单
		stockinMapper.insert(stockin);
		// 保存明细
		for (AddStockinDetailInput detailInput : input.getStockinDetail()) {
			WareStockinDetail stockinDetail = new WareStockinDetail();
			stockinDetail.setDeliveryNum(DefaultConstants.DOUBLEDEFAULT);
			stockinDetail.setEntryArea(DefaultConstants.DOUBLEDEFAULT);
			stockinDetail.setLength(DefaultConstants.DOUBLEDEFAULT);
			stockinDetail.setWidth(DefaultConstants.DOUBLEDEFAULT);
			stockinDetail.setEntryNum(DefaultConstants.DOUBLEDEFAULT);
			stockinDetail.setSurplusNum(DefaultConstants.DOUBLEDEFAULT);
			BeanUtils.copyProperties(detailInput, stockinDetail);
			// 如果参数中没有入库的仓库类型则入库仓库类型为备件默认仓库类型
			if (StringUtils.isEmpty(detailInput.getWarehouseType())) {
				stockinDetail.setWarehouseType(sparePartsService
						.getSpareParts(new EditSparePartsInput(detailInput.getSpareParts())).getDefaultWarehouseType());
			}

			// 创建时间
			stockinDetail.setCreateTime(new Date());
			// 创建用户
			stockinDetail.setCreateUser(getCurrentUserId());
			// 未删除
			stockinDetail.setIsDel(PlatformConstants.ISDEL_NO);
			stockinDetail.setEntryArea(new BigDecimal(stockinDetail.getLength())
					.multiply(new BigDecimal(stockinDetail.getWidth())).doubleValue());
			// 生成入库批次
			stockinDetail.setStockinBatch(getBatch(stockinDetail.getWarehouseType(), sparePartsService
					.getSparePartsBrief(new EditSparePartsInput(stockinDetail.getSpareParts())).getSparePartsNo()));
			// 原始批次
			stockinDetail.setSparePartsOriginalBatch(stockinDetail.getStockinBatch());
			// 入库单id
			stockinDetail.setWareStockinId(stockin.getWareStockinId());
			stockinDetail.setSurplusNum(detailInput.getEntryNum());
			stockinDetailMapper.insert(stockinDetail);

			AddStockInput stockInput = new AddStockInput();
			stockInput.setStockinNo(stockin.getStockinNo());
			stockInput.setStockinDate(stockin.getCreateTime());
			stockInput.setWarehouse(stockin.getEntryWarehouse());
			stockInput.setWarehouseType(stockinDetail.getWarehouseType());
			stockInput.setStorageLocation(stockinDetail.getStorageLocation());
			stockInput.setSpareParts(stockinDetail.getSpareParts());
			stockInput.setSparePartsBatch(stockinDetail.getStockinBatch());
			stockInput.setEntryNum(stockinDetail.getEntryNum());
			stockInput.setLength(stockinDetail.getLength());
			stockInput.setWidth(stockinDetail.getWidth());

			if (stockInput.getWidth() == WarehouseConstants.DOUBLE_ZERO) {
				stockInput.setOriginalArea(stockInput.getLength());
			} else {
				stockInput.setOriginalArea(
						ComputeUtil.mul(new BigDecimal(stockInput.getLength()), new BigDecimal(stockInput.getWidth()))
								.doubleValue());
			}

			stockInput.setSourceBatch(detailInput.getStockinBatch());

			stockService.stockTransfer(stockInput);
		}
	}

	/**
	 * 退库入库
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void returnIn(StockInInput input) {
		// 已传SBS
		input.setIsStockSbs(CommonEnum.YES.getCode());
		// 已入库
		input.setEntryStatus(StockinEnum.YESIN.getCode());
		// 已审核
		input.setAuditStatus(AuditStateEnum.AUDITED.getCode());

		// 生成入库单
		WareStockin stockin = new WareStockin();
		BeanUtils.copyProperties(input, stockin);
		// 入库单号
		String billNumber = billTypeService.getBillNumberByKey(BillTypeConstants.STOCKIN);
		if (StringUtils.isEmpty(billNumber)) {
			throw new RuntimeException("insertFail");
		}
		stockin.setStockinNo(billNumber);
		// 未删除
		stockin.setIsDel(PlatformConstants.ISDEL_NO);
		// 创建时间
		stockin.setCreateTime(new Date());
		// 创建用户
		stockin.setCreateUser(getCurrentUserId());
		// 保存借入单
		stockinMapper.insert(stockin);
		// 保存明细
		for (AddStockinDetailInput detailInput : input.getStockinDetail()) {
			WareStockinDetail stockinDetail = new WareStockinDetail();
			stockinDetail.setDeliveryNum(DefaultConstants.DOUBLEDEFAULT);
			stockinDetail.setEntryArea(DefaultConstants.DOUBLEDEFAULT);
			stockinDetail.setEntryNum(DefaultConstants.DOUBLEDEFAULT);
			stockinDetail.setSurplusNum(DefaultConstants.DOUBLEDEFAULT);
			BeanUtils.copyProperties(detailInput, stockinDetail);
			stockinDetail
					.setLength(Optional.ofNullable(detailInput.getLength()).orElse(DefaultConstants.DOUBLEDEFAULT));
			stockinDetail.setWidth(Optional.ofNullable(detailInput.getWidth()).orElse(DefaultConstants.DOUBLEDEFAULT));
			// 如果参数中没有入库的仓库类型则入库仓库类型为备件默认仓库类型
			if (StringUtils.isEmpty(detailInput.getWarehouseType())) {
				stockinDetail.setWarehouseType(sparePartsService
						.getSpareParts(new EditSparePartsInput(detailInput.getSpareParts())).getDefaultWarehouseType());
			}

			// 创建时间
			stockinDetail.setCreateTime(new Date());
			// 创建用户
			stockinDetail.setCreateUser(getCurrentUserId());
			// 未删除
			stockinDetail.setIsDel(PlatformConstants.ISDEL_NO);
			stockinDetail.setEntryArea(new BigDecimal(stockinDetail.getLength())
					.multiply(new BigDecimal(stockinDetail.getWidth())).doubleValue());
			// 生成入库批次
			stockinDetail.setStockinBatch(detailInput.getStockinBatch());
			// 原始批次
			stockinDetail.setSparePartsOriginalBatch(detailInput.getOriginBatch());
			// 入库单id
			stockinDetail.setWareStockinId(stockin.getWareStockinId());
			stockinDetail.setSurplusNum(detailInput.getEntryNum());
			stockinDetailMapper.insert(stockinDetail);

			AddStockInput stockInput = new AddStockInput();
			stockInput.setStockinNo(stockin.getStockinNo());
			stockInput.setStockinDate(stockin.getCreateTime());
			stockInput.setWarehouse(stockin.getEntryWarehouse());
			stockInput.setWarehouseType(stockinDetail.getWarehouseType());
			stockInput.setStorageLocation(stockinDetail.getStorageLocation());
			stockInput.setSpareParts(stockinDetail.getSpareParts());
			stockInput.setSparePartsBatch(stockinDetail.getStockinBatch());
			stockInput.setEntryNum(stockinDetail.getEntryNum());
			stockInput.setLength(stockinDetail.getLength());
			stockInput.setWidth(stockinDetail.getWidth());
			stockInput.setOriginalArea(new BigDecimal(stockinDetail.getLength())
					.multiply(new BigDecimal(stockinDetail.getWidth())).doubleValue());

			stockInput.setSourceBatch(detailInput.getStockinBatch());

			stockService.updateStock(stockInput);
		}
	}

	/**
	 * 代管库借入入库
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void borrowIn(StockInInput input) {
		// 已传SBS
		input.setIsStockSbs(CommonEnum.YES.getCode());
		// 已入库
		input.setEntryStatus(StockinEnum.YESIN.getCode());
		// 已审核
		input.setAuditStatus(AuditStateEnum.AUDITED.getCode());

		// 生成入库单
		WareStockin stockin = new WareStockin();
		BeanUtils.copyProperties(input, stockin);
		// 入库单号
		String billNumber = billTypeService.getBillNumberByKey(BillTypeConstants.STOCKIN);
		if (StringUtils.isEmpty(billNumber)) {
			throw new RuntimeException("insertFail");
		}
		stockin.setStockinNo(billNumber);
		// 未删除
		stockin.setIsDel(PlatformConstants.ISDEL_NO);
		// 创建时间
		stockin.setCreateTime(new Date());
		// 创建用户
		stockin.setCreateUser(getCurrentUserId());
		// 保存借入单
		stockinMapper.insert(stockin);
		// 保存明细
		for (AddStockinDetailInput detailInput : input.getStockinDetail()) {
			WareStockinDetail stockinDetail = new WareStockinDetail();
			stockinDetail.setDeliveryNum(DefaultConstants.DOUBLEDEFAULT);
			stockinDetail.setEntryArea(DefaultConstants.DOUBLEDEFAULT);
			stockinDetail.setEntryNum(DefaultConstants.DOUBLEDEFAULT);
			stockinDetail.setSurplusNum(DefaultConstants.DOUBLEDEFAULT);
			BeanUtils.copyProperties(detailInput, stockinDetail);
			stockinDetail
					.setLength(Optional.ofNullable(detailInput.getLength()).orElse(DefaultConstants.DOUBLEDEFAULT));
			stockinDetail.setWidth(Optional.ofNullable(detailInput.getWidth()).orElse(DefaultConstants.DOUBLEDEFAULT));
			// 如果参数中没有入库的仓库类型则入库仓库类型为备件默认仓库类型
			if (StringUtils.isEmpty(detailInput.getWarehouseType())) {
				stockinDetail.setWarehouseType(sparePartsService
						.getSpareParts(new EditSparePartsInput(detailInput.getSpareParts())).getDefaultWarehouseType());
			}

			// 创建时间
			stockinDetail.setCreateTime(new Date());
			// 创建用户
			stockinDetail.setCreateUser(getCurrentUserId());
			// 未删除
			stockinDetail.setIsDel(PlatformConstants.ISDEL_NO);
			stockinDetail.setEntryArea(new BigDecimal(stockinDetail.getLength())
					.multiply(new BigDecimal(stockinDetail.getWidth())).doubleValue());

			SparePartsBriefOutput sparePart = sparePartsService.getSparePart(detailInput.getSpareParts(), null);
			// 生成入库批次
			stockinDetail.setStockinBatch(getBatch(detailInput.getWarehouseType(),sparePart.getSparePartsNo()));
			// 原始批次
			stockinDetail.setSparePartsOriginalBatch(detailInput.getOriginBatch());
			// 入库单id
			stockinDetail.setWareStockinId(stockin.getWareStockinId());
			stockinDetail.setSurplusNum(detailInput.getEntryNum());
			stockinDetailMapper.insert(stockinDetail);

			AddStockInput stockInput = new AddStockInput();

			BeanUtils.copyProperties(stockinDetail, stockInput);
			stockInput.setStockinNo(stockin.getStockinNo());
			stockInput.setCompany(stockin.getCompany());
			stockInput.setWarehouseType(stockinDetail.getWarehouseType());
			stockInput.setWarehouse(stockin.getEntryWarehouse());
			stockInput.setEscrowCompany(stockin.getEscrowCompany());
			stockInput.setStorageLocation(stockinDetail.getStorageLocation());
			SparePartsOutput spareParts = sparePartsService
					.getSpareParts(new EditSparePartsInput(stockinDetail.getSpareParts()));
			stockInput.setSparePartsCategories(spareParts.getSparePartsCategories());
			stockInput.setSpareParts(stockinDetail.getSpareParts());
			stockInput.setSparePartsUnit(spareParts.getSparePartsUnit());
			stockInput.setLength(stockinDetail.getLength());
			stockInput.setWidth(stockinDetail.getWidth());
			stockInput.setSparePartsBatch(stockinDetail.getStockinBatch());
			stockInput.setSparePartsOriginalBatch(stockinDetail.getSparePartsOriginalBatch());
			stockInput.setEntryNum(stockinDetail.getEntryNum());
			stockInput.setOriginalArea(stockinDetail.getEntryArea());
			stockInput.setInvoicePrice(stockinDetail.getInvoicePrice());
			stockInput.setCore(stockinDetail.getCore());
			stockInput.setVat(stockinDetail.getVat());
			stockInput.setTariffStatus(stockinDetail.getTariffStatus());
			stockInput.setTariff(stockinDetail.getTariff());
			stockInput.setTariffDate(stockinDetail.getTariffDate());
			stockInput.setTariffNo(stockinDetail.getTariffNo());
			stockInput.setFreight(stockinDetail.getFreight());
			stockInput.setUnitPrice(stockinDetail.getEntryPrice());
			stockInput.setOldStockinDate(stockinDetail.getOldStockinDate());
			stockInput.setStockinDate(new Date());

			stockInput.setSparePartsNo(detailInput.getSparePartsNo());
			stockInput.setSparePartsName(detailInput.getSparePartsName());

			stockService.addStock(stockInput);

		}
	}

	/**
	 * 评分考核项目：质量及服务水平
	 */
	@Override
	public void evaluateQualityAndService(String deliveryNum, Double qualityScore, Double serviceScore) {
		Result rs = purchaseFeignClient.evaluateQualityAndService(deliveryNum, qualityScore, serviceScore,getCurrentUserId());
		
		if(rs.getCode()==0) {
			WareStockinExample example = new WareStockinExample();
			WareStockinExample.Criteria criteria = example.createCriteria();
			criteria.andNoEqualTo(deliveryNum);
			criteria.andAuditStatusEqualTo(AuditStateEnum.AUDITED.getCode());
			WareStockin stockin = new WareStockin();
			stockin.setEvaluateStatus(CommonEnum.YES.getCode());
			stockinMapper.updateByExampleSelective(stockin, example);
		}else {
			throw new RuntimeException("evaluateError");
		}
	}

}
