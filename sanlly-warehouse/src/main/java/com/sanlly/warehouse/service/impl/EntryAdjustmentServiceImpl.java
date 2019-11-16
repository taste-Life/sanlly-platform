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
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.FinanceCurrencyType;
import com.sanlly.common.enums.InvoiceCategoryEnum;
import com.sanlly.common.models.output.invoice.InvoiceTypeOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.utils.ComputeUtil;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.warehouse.constants.BillTypeConstants;
import com.sanlly.warehouse.dao.WareEntryAdjustmentDetailMapper;
import com.sanlly.warehouse.dao.WareEntryAdjustmentMapper;
import com.sanlly.warehouse.dao.WarePurchasePoolMapper;
import com.sanlly.warehouse.dao.WareSparePartsMapper;
import com.sanlly.warehouse.dao.WareStockExtMapper;
import com.sanlly.warehouse.dao.WareStockinDetailMapper;
import com.sanlly.warehouse.dao.WareStockinMapper;
import com.sanlly.warehouse.dao.WareStorePoolMapper;
import com.sanlly.warehouse.entity.WareEntryAdjustment;
import com.sanlly.warehouse.entity.WareEntryAdjustmentDetail;
import com.sanlly.warehouse.entity.WareEntryAdjustmentDetailExample;
import com.sanlly.warehouse.entity.WareEntryAdjustmentExample;
import com.sanlly.warehouse.entity.WarePurchasePool;
import com.sanlly.warehouse.entity.WareReturnWarehouse;
import com.sanlly.warehouse.entity.WareSpareParts;
import com.sanlly.warehouse.entity.WareSparePartsExample;
import com.sanlly.warehouse.entity.WareStock;
import com.sanlly.warehouse.entity.WareStockin;
import com.sanlly.warehouse.entity.WareStockinDetail;
import com.sanlly.warehouse.entity.WareStockinDetailExample;
import com.sanlly.warehouse.entity.WareStockinExample;
import com.sanlly.warehouse.entity.WareStockout;
import com.sanlly.warehouse.entity.WareStockoutDetail;
import com.sanlly.warehouse.entity.WareStorePool;
import com.sanlly.warehouse.enums.InteTypeEnum;
import com.sanlly.warehouse.models.input.CostPool.AddPurchasePoolInput;
import com.sanlly.warehouse.models.input.entryadjustment.AddEntryAdjustmentDetailInput;
import com.sanlly.warehouse.models.input.entryadjustment.AddEntryAdjustmentInput;
import com.sanlly.warehouse.models.input.entryadjustment.SearchEntryAdjustmentInput;
import com.sanlly.warehouse.models.input.stockin.AddPurchaseSBSInput;
import com.sanlly.warehouse.models.input.stockin.SearchStockinInput;
import com.sanlly.warehouse.models.output.entryadjustment.EntryAdjustmentDetailOutput;
import com.sanlly.warehouse.models.output.entryadjustment.EntryAdjustmentOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.models.output.stockin.StockinOutput;
import com.sanlly.warehouse.service.BillTypeService;
import com.sanlly.warehouse.service.EntryAdjustmentService;
import com.sanlly.warehouse.service.PurchasePoolService;
import com.sanlly.warehouse.service.StockoutService;
import com.sanlly.warehouse.service.WareStockService;
import com.sanlly.warehouse.service.WareStockinService;
import com.sanlly.warehouse.service.WareStockoutService;
import com.sanlly.warehouse.service.WarehouseService;
import com.sanlly.warehouse.service.feign.ProductionFeignClient;
import com.sanlly.warehouse.service.feign.PurchaseFeignClient;

/**
 * 
* @Package com.sanlly.warehouse.service.impl 
* @Description: 入库单调账 
* @author jlx   
* @date 2019年9月2日 上午10:01:01 
* @version V1.0   
 */
@Service
public class EntryAdjustmentServiceImpl extends BaseServiceImpl  implements EntryAdjustmentService {

    @Autowired
    private WareEntryAdjustmentMapper entryAdjustmentDao;
    @Autowired
    private WareEntryAdjustmentDetailMapper entryAdjustmentDetailDao;

	@Autowired
	private BillTypeService billTypeService;
	@Autowired
	private ProductionFeignClient productionFeignClient;
	@Autowired
	private PurchasePoolService purchasePoolService;
	@Autowired
	private WarePurchasePoolMapper warePurchasePoolDao;
	@Autowired
	private PurchaseFeignClient purchaseFeignClient;
	@Autowired
	private WarehouseService warehouseService;
	@Autowired
	private WareStockinMapper stockinMapper;
	@Autowired
	private WareStockinDetailMapper stockinDetailMapper;
	@Autowired
	private WareStockService stockService;
	@Autowired
	private WareStockoutService stockoutService;
	@Autowired
	private WareStorePoolMapper wareStorePoolDao;
	@Autowired
	private WareStockExtMapper wareStockExtDao;
	/**
	 * 调账单分页查询
	 */
	@Override
	public PagedList<EntryAdjustmentOutput> entryAdjustmentPageList(SearchEntryAdjustmentInput input) {
		
		WareEntryAdjustmentDetailExample dExample = new WareEntryAdjustmentDetailExample();
		WareEntryAdjustmentDetailExample.Criteria dCriteria = dExample.createCriteria();
		//组装查询条件
		WareEntryAdjustmentExample example = new WareEntryAdjustmentExample();
        WareEntryAdjustmentExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        example.setOrderByClause("create_time desc");
        if(StringUtils.isNotEmpty(input.getEntryAdjustmentNo())) {
        	criteria.andEntryAdjustmentNoLike("%"+input.getEntryAdjustmentNo()+"%");
        }
        if(StringUtils.isNotEmpty(input.getStockinNo())) {
        	criteria.andStockinNoLike("%"+input.getStockinNo()+"%");
        }
        if(StringUtils.isNotEmpty(input.getAuditStatus())) {
        	criteria.andAuditStatusEqualTo(input.getAuditStatus());
        } 
        //总条数
        Integer totalItemCount = (int)entryAdjustmentDao.countByExample(example);
        PagedList<EntryAdjustmentOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        //分页查询
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<WareEntryAdjustment> entryAdjustments = entryAdjustmentDao.selectByExample(example);
        
        //组装返回值
        List<EntryAdjustmentOutput> dataList = new ArrayList<>();
        for (WareEntryAdjustment entryAdjustment : entryAdjustments) {
        	EntryAdjustmentOutput output = new EntryAdjustmentOutput();
            BeanUtils.copyProperties(entryAdjustment,output);
            output.setCompanyLangLang(entryAdjustment.getCompany());
            output.setBillTypeLangLang(entryAdjustment.getBillType());
            output.setAdjustmentInvoiceLangLang(entryAdjustment.getAdjustmentInvoice());
            output.setAuditStatusLangLang(entryAdjustment.getAuditStatus());
            output.setOldInvoiceLangLang(entryAdjustment.getOldInvoice());
            // 调账单明细取得组装
            dCriteria.andEntryAdjustmentEqualTo(entryAdjustment.getWareEntryAdjustmentId());
            List<WareEntryAdjustmentDetail> details = entryAdjustmentDetailDao.selectByExample(dExample);

            List<EntryAdjustmentDetailOutput> detaiOutputList = new ArrayList<>();
            for (WareEntryAdjustmentDetail detail : details) {
            	EntryAdjustmentDetailOutput detaiOutput = new EntryAdjustmentDetailOutput();
                BeanUtils.copyProperties(detail,detaiOutput); 
                detaiOutput.setSparePartsLangLang(detail.getSpareParts());
                detaiOutput.setOldWarehouseTypeLangLang(detail.getOldWarehouseType());
                detaiOutput.setAdjustmentWarehouseTypeLangLang(detail.getAdjustmentWarehouseType());
                detaiOutputList.add(detaiOutput);
            }
            output.setEntryAdjustmentDetailOutputs(detaiOutputList);
            dataList.add(output);
        }
        pagedList.getDataList().addAll(dataList);
        return pagedList;
	}
	/**
	 * 添加调账单
	 */
	@Override
	@Transactional
	public void addEntryAdjustment(AddEntryAdjustmentInput input) {
		// 取得调账入库单相关信息
		WareStockinExample example = new WareStockinExample();
		WareStockinExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andStockinNoEqualTo(input.getStockinNo());
		List<WareStockin> stockins= stockinMapper.selectByExample(example);
		if(stockins==null||stockins.size()==0) {
			throw new RuntimeException("error");
		}
		WareStockin wareStockin = stockins.get(0);
		// 入库单明细信息
		WareStockinDetailExample exampleDetail = new WareStockinDetailExample();
		WareStockinDetailExample.Criteria criteriaDetail = exampleDetail.createCriteria();
		criteriaDetail.andWareStockinIdEqualTo(wareStockin.getWareStockinId());
		List<WareStockinDetail>  oldStockinDetails = stockinDetailMapper.selectByExample(exampleDetail);

		// 1.生成调账单
		WareEntryAdjustment record = new WareEntryAdjustment();
		// 调账单号
		record.setEntryAdjustmentNo(billTypeService.getBillNumberByKey(BillTypeConstants.TZ));
		record.setStockinNo(input.getStockinNo());
		record.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
		record.setAdjustmentPerson(getCurrentUserId());
		record.setCompany(wareStockin.getCompany());
		record.setEntryWarehouse(wareStockin.getEntryWarehouse());
		record.setBillType(wareStockin.getBillType());
		// 原始发票类型
		record.setOldInvoice(wareStockin.getInvoiceType());
		// 调整发票类型
		record.setAdjustmentInvoice(input.getAdjustmentInvoice());
		// 原始运费
		record.setOldFreight(wareStockin.getFreight());
		// 调整运费
		record.setAdjustmentFreight(input.getAdjustmentFreight());
		record.setVat(input.getVat());
		record.setTariff(input.getTariff());
		record.setBillTotalAmount(input.getBillTotalAmount());
		record.setIsDel(PlatformConstants.ISDEL_NO);
		record.setCreateTime(new Date());
		record.setCreateUser(getCurrentUserId());
		entryAdjustmentDao.insert(record);
		for(int i=0;i< oldStockinDetails.size();i++) {
			
			WareStockinDetail oldStockinDetail = oldStockinDetails.get(i);
			AddEntryAdjustmentDetailInput adjustmentDetail = input.getStockinAdjustmentDetail().get(i);
			
			WareEntryAdjustmentDetail detailRecord = new WareEntryAdjustmentDetail();
			detailRecord.setEntryAdjustment(record.getWareEntryAdjustmentId());
			detailRecord.setSpareParts(oldStockinDetail.getSpareParts());
			// 原始仓库类型
			detailRecord.setOldWarehouseType(oldStockinDetail.getWarehouseType());
			// 调整仓库类型
			detailRecord.setAdjustmentWarehouseType(adjustmentDetail.getWarehouseType());
			
			// 原始增值税
			detailRecord.setOldVat(oldStockinDetail.getVat());
			// 调整增值税
			detailRecord.setAdjustmentVat(adjustmentDetail.getVat());
			
			// 原始数量
			detailRecord.setOldNum(oldStockinDetail.getEntryNum());
			// 调整数量
			detailRecord.setAdjustmentNum(adjustmentDetail.getEntryNum());
			
			// 数量调减时，剩余库存必须充足
			Double stockNum = stockService.getStockByBatch(oldStockinDetail.getStockinBatch(), oldStockinDetail.getSpareParts()).getActualSurplusNum();
			if(detailRecord.getOldNum()-detailRecord.getAdjustmentNum()>stockNum) {
				throw new RuntimeException("stockNumError");
			}
			// 原始关税
			detailRecord.setOldTariff(oldStockinDetail.getTariff());
			// 调整关税
			detailRecord.setAdjustmentTariff(adjustmentDetail.getTariff());
			
			detailRecord.setEntryPrice(adjustmentDetail.getEntryPrice());
			detailRecord.setInvoicePrice(adjustmentDetail.getInvoicePrice());
			
			detailRecord.setIsDel(PlatformConstants.ISDEL_NO);
			detailRecord.setCreateTime(new Date());
			detailRecord.setCreateUser(getCurrentUserId());
			entryAdjustmentDetailDao.insertSelective(detailRecord);
		}
		
	}
	@Override
	@Transactional
	public void auditEntryAdjustment(Integer wareEntryAdjustmentId) {
		// 仓库类型修改flag
		boolean warehouseTypeFlag = false;
		// 增值税修改flag
		boolean vatFlag = false;
		// 关税修改flag
		boolean tariffFlag = false;
		// 入库数量修改flag
		boolean entryNumFlag = false;
		// 运费修改flag
		boolean freightFlag = false;
		// 发票类型修改flag
		boolean invoiceFlag = false;		
		
		// 数量发生变化-传至公共部门金额
		BigDecimal numFreightTotal = new BigDecimal("0");
		// 调整后传供应商总金额
		BigDecimal adjustmentSupplierTotal = new BigDecimal("0");
		// 调整后传供应商净额
		BigDecimal adjustmentSupplierNoTax = new BigDecimal("0");
		// 原始传供应商总金额
		BigDecimal oldSupplierTotal = new BigDecimal("0");
		// 原始传供应商净额
		BigDecimal oldSupplierNoTax = new BigDecimal("0");
		// 调整后传国家金库总金额
		BigDecimal adjustmentNationTotal = new BigDecimal("0");
		// 原始传国家金库总金额
		BigDecimal oldNationTotal = new BigDecimal("0");
		
		// 调账单信息取得
		WareEntryAdjustment adjustment = entryAdjustmentDao.selectByPrimaryKey(wareEntryAdjustmentId);
		WareEntryAdjustmentDetailExample adjustmentDetailExample = new WareEntryAdjustmentDetailExample();
		WareEntryAdjustmentDetailExample.Criteria adjustmentDetailCriteria = adjustmentDetailExample.createCriteria();
		adjustmentDetailCriteria.andEntryAdjustmentEqualTo(wareEntryAdjustmentId);
		List<WareEntryAdjustmentDetail> adjustmentDetails = entryAdjustmentDetailDao.selectByExample(adjustmentDetailExample);
		
		// 取得费用池信息
		WarePurchasePool purchasePool = purchasePoolService.getDataByStockinNo(adjustment.getStockinNo());
		
		// 取得调账入库单相关信息
		WareStockinExample example = new WareStockinExample();
		WareStockinExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andStockinNoEqualTo(adjustment.getStockinNo());
		List<WareStockin> stockins= stockinMapper.selectByExample(example);
		if(stockins==null||stockins.size()==0) {
			throw new RuntimeException("error");
		}
		WareStockin wareStockin = stockins.get(0);
		// 币种取得
		String currency = purchaseFeignClient.getCurrencyByKey(wareStockin.getSupplierId()).getData();
		// 入库单明细信息
		WareStockinDetailExample exampleDetail = new WareStockinDetailExample();
		WareStockinDetailExample.Criteria criteriaDetail = exampleDetail.createCriteria();
		criteriaDetail.andWareStockinIdEqualTo(wareStockin.getWareStockinId());
		List<WareStockinDetail>  oldStockinDetails = stockinDetailMapper.selectByExample(exampleDetail);

		if(!adjustment.getOldInvoice().equals(adjustment.getAdjustmentInvoice())) {
			invoiceFlag=true;
		}
		if(adjustment.getOldFreight().compareTo(adjustment.getAdjustmentFreight())!=0) {
			freightFlag =true;
		}
		for(int i=0;i< oldStockinDetails.size();i++) {
			
			WareStockinDetail oldStockinDetail = oldStockinDetails.get(i);
			WareEntryAdjustmentDetail adjustmentDetail = adjustmentDetails.get(i);
		
			if(!adjustmentDetail.getOldWarehouseType().equals(adjustmentDetail.getAdjustmentWarehouseType())) {
				warehouseTypeFlag=true;
			}
			if(adjustmentDetail.getOldVat().compareTo(adjustmentDetail.getAdjustmentVat())!=0) {
				vatFlag =true;
			}
			if(adjustmentDetail.getOldNum().compareTo(adjustmentDetail.getAdjustmentNum())!=0) {
				entryNumFlag =true;
			}
			// 数量调减时，剩余库存必须充足
			Double stockNum = stockService.getStockByBatch(oldStockinDetail.getStockinBatch(), oldStockinDetail.getSpareParts()).getActualSurplusNum();
			if(adjustmentDetail.getOldNum()-adjustmentDetail.getAdjustmentNum()>stockNum) {
				throw new RuntimeException("stockNumError");
			}
			if(adjustmentDetail.getOldTariff().compareTo(adjustmentDetail.getAdjustmentTariff())!=0) {
				tariffFlag =true;
			}
			// 单价发生变化，对已出库的备件列表以此模拟退库操作
			if(ComputeUtil.sub(adjustmentDetail.getEntryPrice(), oldStockinDetail.getEntryPrice()).compareTo(BigDecimal.ZERO)!=0) {
				getReturnOutStock(adjustmentDetail,oldStockinDetail);
			}
			numFreightTotal = ComputeUtil.add(numFreightTotal, ComputeUtil.mul(new BigDecimal(oldStockinDetail.getEntryNum()-adjustmentDetail.getAdjustmentNum()), oldStockinDetail.getFreight()==null?BigDecimal.ZERO:oldStockinDetail.getFreight()));
			
			// 3. 修改入库单明细 -数量、仓库类型、关税、增值税发生变化时	
			if(invoiceFlag||warehouseTypeFlag||tariffFlag||vatFlag) {
				WareStockinDetail stockinDetailRecord = new WareStockinDetail();
				stockinDetailRecord.setWareStockinDetailId(oldStockinDetail.getWareStockinDetailId());
				// 增值税
				stockinDetailRecord.setVat(adjustmentDetail.getAdjustmentVat());
				// 关税
				stockinDetailRecord.setTariff(adjustmentDetail.getAdjustmentTariff());
				// 入库数量
				stockinDetailRecord.setEntryNum(adjustmentDetail.getAdjustmentNum());
				// 发票单价
				stockinDetailRecord.setInvoicePrice(adjustmentDetail.getInvoicePrice());
				// 入库单价
				stockinDetailRecord.setEntryPrice(adjustmentDetail.getEntryPrice());
				// 仓库类型
				stockinDetailRecord.setWarehouseType(adjustmentDetail.getAdjustmentWarehouseType());
				stockinDetailRecord.setUpdateTime(new Date());
				stockinDetailRecord.setUpdateUser(getCurrentUserId());
				stockinDetailMapper.updateByPrimaryKeySelective(stockinDetailRecord);
				
			}
			// 4. 修改库存-数量、仓库类型、关税、增值税
			if(entryNumFlag) {
				stockService.setStock(oldStockinDetail.getSparePartsOriginalBatch(), oldStockinDetail.getSpareParts(), adjustmentDetail.getAdjustmentNum());
			}
			if(tariffFlag||vatFlag) {
				stockService.setStock(oldStockinDetail.getSparePartsOriginalBatch(), oldStockinDetail.getSpareParts(), adjustmentDetail);
			}
			if(warehouseTypeFlag) {
				stockService.setStock(oldStockinDetail.getSparePartsOriginalBatch(), oldStockinDetail.getSpareParts(), adjustmentDetail.getAdjustmentWarehouseType(), adjustmentDetail.getEntryPrice());
			}
			
		}
		if(freightFlag||tariffFlag||vatFlag||invoiceFlag) {
			// 2. 修改入库单 -仓库类型、关税、增值税、运费发生变化时
			WareStockin stockinRecord = new WareStockin();
			// 更新字段
			stockinRecord.setWareStockinId(wareStockin.getWareStockinId());
			if(tariffFlag||vatFlag||invoiceFlag) {
				// 单据总金额
				stockinRecord.setBillTotalAmount(adjustment.getBillTotalAmount());
				// 发票类型
				stockinRecord.setInvoiceType(adjustment.getAdjustmentInvoice());
				// 关税
				stockinRecord.setTariff(adjustment.getTariff());
				// 增值税
				stockinRecord.setVat(adjustment.getVat());
			}
			if(freightFlag) {
				// 运费
				stockinRecord.setFreight(adjustment.getAdjustmentFreight());
			}
			stockinMapper.updateByPrimaryKeySelective(stockinRecord);
		}

		// 5. 上传SBS

		if(FinanceCurrencyType.CNY.getCode().equals(currency)) {
			// 传供应商
			oldSupplierTotal = ComputeUtil.add(wareStockin.getBillTotalAmount(), wareStockin.getVat());
			oldSupplierTotal = ComputeUtil.sub(oldSupplierTotal, wareStockin.getFreight());
			oldSupplierTotal = ComputeUtil.sub(oldSupplierTotal, wareStockin.getTariff());
			oldSupplierNoTax = ComputeUtil.sub(oldSupplierTotal,wareStockin.getVat());
			adjustmentSupplierTotal = ComputeUtil.add(adjustment.getBillTotalAmount(), adjustment.getVat());
			adjustmentSupplierTotal = ComputeUtil.sub(adjustmentSupplierTotal, adjustment.getAdjustmentFreight());
			adjustmentSupplierTotal = ComputeUtil.sub(adjustmentSupplierTotal, adjustment.getTariff());
			adjustmentSupplierNoTax = ComputeUtil.sub(adjustmentSupplierTotal, adjustment.getVat());
		}else {
			// 传供应商
//			oldSupplierTotal = ComputeUtil.add(wareStockin.getBillTotalAmount(), wareStockin.getVat());
			oldSupplierTotal = ComputeUtil.sub(wareStockin.getBillTotalAmount(), wareStockin.getFreight());
			oldSupplierTotal = ComputeUtil.sub(oldSupplierTotal, wareStockin.getTariff());
			
//			adjustmentSupplierTotal = ComputeUtil.add(input.getBillTotalAmount(), input.getVat());
			adjustmentSupplierTotal = ComputeUtil.sub(adjustment.getBillTotalAmount(), adjustment.getAdjustmentFreight());
			adjustmentSupplierTotal = ComputeUtil.sub(adjustmentSupplierTotal, adjustment.getTariff());	
			// 传国家金库
			oldNationTotal = ComputeUtil.add(wareStockin.getTariff(), wareStockin.getVat());
			adjustmentNationTotal = ComputeUtil.add(adjustment.getTariff(), adjustment.getVat());
			
			
		}
		
		// 5.1 国家金库-关税总额+增值税总额发生变化
		if(oldNationTotal.compareTo(adjustmentNationTotal)!=0) {
			purchasePool.setChrgCde("CUSTOM");
			// 关税（关税*数量，取两位小数，求和）
			purchasePool.setCustomTariffAmt(String.valueOf(ComputeUtil.sub(adjustmentNationTotal, oldNationTotal)));
			// 发票税率（整数）0
			purchasePool.setInvTaxRate("0");
			// 普票
			purchasePool.setInvTyp(InvoiceCategoryEnum.GENERAL.getCode());
			// 制单人
			purchasePool.setLegacyCreByUsr(adjustment.getCreateUser().toString());
			// 入库单ID+GW+00(递增)
			purchasePool.setLegacyOrdrId(purchasePoolService.getLegacyOrdrId(wareStockin.getWareStockinId().toString()));
			// 入库单号+GW+00(递增)
			purchasePool.setLegacyOrdrNum(purchasePoolService.getLegacyOrdrNum(wareStockin.getStockinNo()));
			// 供应商代码
			purchasePool.setLegacyVndrId(wareStockin.getSupplierId());
			// 关税*数量取两位小数，求和
			purchasePool.setLocNetAmt(String.valueOf(ComputeUtil.sub(adjustment.getTariff(), wareStockin.getTariff())));
			// 增值税+关税*数量
			purchasePool.setLocTtlAmt(String.valueOf(ComputeUtil.sub(adjustmentNationTotal, oldNationTotal)));
			// （增值税+关税*数量）取两位小数求和-（关税*数量）取两位小数求和
			purchasePool.setLocTaxAmt(String.valueOf(ComputeUtil.sub(adjustment.getVat(), wareStockin.getVat())));
			purchasePool.setNetAmt(purchasePool.getLocNetAmt());
			purchasePool.setTaxAmt(purchasePool.getLocTaxAmt());
			purchasePool.setTtlAmt(purchasePool.getLocTtlAmt());
			if (CommonEnum.YES.getCode().equals(warehouseService.getLockStatus(wareStockin.getCompany()))) {
				purchasePool.setStats("O"); // 锁库传SBS
			} else {
				purchasePool.setStats("I"); // 默认状态
			}
			// 国家金库-海关税款
			purchasePool.setVndrNme("LKSUPPLIER000146");
			purchasePool.setVndrSapId(wareStockin.getSupplierId());
			purchasePool.setWarePurchasePoolId(null);
			purchasePool.setIsDel(0);
			purchasePool.setCreateTime(new Date());
			purchasePool.setCreateUser(getCurrentUserId());
			warePurchasePoolDao.insertSelective(purchasePool);
		}
		// 5.2快递服务商-运费总额 发生变化
		if(wareStockin.getFreight().compareTo(adjustment.getAdjustmentFreight())!=0) {
			purchasePool.setChrgCde("");
			// 关税（关税*数量，取两位小数，求和）
			purchasePool.setCustomTariffAmt("0");
			InvoiceTypeOutput invoiceType = purchaseFeignClient.getInvoice(wareStockin.getFreightInvoiceType()).getData();
			if (invoiceType != null) {
				Double rate = invoiceType.getInvoicePoint() * 100;
				purchasePool.setInvTaxRate(String.valueOf(rate.intValue())); // 发票税率
				purchasePool.setInvTyp(invoiceType.getInvoiceCategroy()); // 发票类型
			}
			// 制单人
			purchasePool.setLegacyCreByUsr(adjustment.getCreateUser().toString());
			// 入库单ID+GW+00(递增)
			purchasePool.setLegacyOrdrId(purchasePoolService.getLegacyOrdrId(wareStockin.getWareStockinId().toString()));
			// 入库单号+GW+00(递增)
			purchasePool.setLegacyOrdrNum(purchasePoolService.getLegacyOrdrNum(wareStockin.getStockinNo()));
			// 供应商代码（物流公司）
			purchasePool.setLegacyVndrId(wareStockin.getLogisticsCompany());
			// 本位币净额：运费金额取两位小数，求和
			purchasePool.setLocNetAmt(String.valueOf(ComputeUtil.sub(adjustment.getAdjustmentFreight(), wareStockin.getFreight())));
			// 本位币金额：运费金额加增值税取两位小数，求和 TODO 待 
//			purchasePool.setLocTtlAmt(String.valueOf(ComputeUtil.sub(adjustmentNationTotal, oldNationTotal)));
//			// 税额（运费金额加增值税计算-运费金额计算）
//			purchasePool.setLocTaxAmt(String.valueOf(ComputeUtil.sub(adjustment.getVat(), wareStockin.getVat())));
			purchasePool.setNetAmt(purchasePool.getLocNetAmt());
			purchasePool.setTaxAmt(purchasePool.getLocTaxAmt());
			purchasePool.setTtlAmt(purchasePool.getLocTtlAmt());
			if (CommonEnum.YES.getCode().equals(warehouseService.getLockStatus(wareStockin.getCompany()))) {
				purchasePool.setStats("O"); // 锁库传SBS
			} else {
				purchasePool.setStats("I"); // 默认状态
			}
			// 供应商名称（物流公司）
			purchasePool.setVndrNme(wareStockin.getSupplierId());
			purchasePool.setVndrSapId(wareStockin.getSupplierId());
			purchasePool.setWarePurchasePoolId(null);
			purchasePool.setIsDel(0);
			purchasePool.setCreateTime(new Date());
			purchasePool.setCreateUser(getCurrentUserId());
			warePurchasePoolDao.insertSelective(purchasePool);
		}
		// 5.3供应商-发票单价*数量+增值税总额发生变化
		if(oldSupplierTotal.compareTo(adjustmentSupplierTotal)!=0) {
			// purchase
			purchasePool.setChrgCde("");
			// 关税（关税*数量，取两位小数，求和）
			purchasePool.setCustomTariffAmt("0");
			InvoiceTypeOutput invoiceType = purchaseFeignClient.getInvoice(adjustment.getAdjustmentInvoice()).getData();
			if (invoiceType != null) {
				Double rate = invoiceType.getInvoicePoint() * 100;
				purchasePool.setInvTaxRate(String.valueOf(rate.intValue())); // 发票税率
				purchasePool.setInvTyp(invoiceType.getInvoiceCategroy()); // 发票类型
			}
			// 制单人
			purchasePool.setLegacyCreByUsr(adjustment.getCreateUser().toString());
			// 入库单ID+GW+00(递增)
			purchasePool.setLegacyOrdrId(purchasePoolService.getLegacyOrdrId(wareStockin.getWareStockinId().toString()));
			// 入库单号+GW+00(递增)
			purchasePool.setLegacyOrdrNum(purchasePoolService.getLegacyOrdrNum(wareStockin.getStockinNo()));
			// 供应商代码
			purchasePool.setLegacyVndrId(wareStockin.getSupplierId());

			if(FinanceCurrencyType.CNY.getCode().equals(currency)) {
				// 本位币净额：发票单价取两位小数，求和
				purchasePool.setLocNetAmt(String.valueOf(ComputeUtil.sub(adjustmentSupplierNoTax, oldSupplierNoTax)));
				// 本位币金额：发票单价加增值税取两位小数，求和
				purchasePool.setLocTtlAmt(String.valueOf(ComputeUtil.sub(adjustmentSupplierTotal, oldSupplierTotal)));
				// 税额（发票单价加增值税计算-金额计算）
				purchasePool.setLocTaxAmt(String.valueOf(ComputeUtil.sub(adjustment.getVat(), wareStockin.getVat())));
			}else {
				// 本位币净额：发票单价取两位小数，求和
				purchasePool.setLocNetAmt(String.valueOf(ComputeUtil.sub(adjustmentSupplierTotal, oldSupplierTotal)));
				// 本位币净额：发票单价取两位小数，求和
				purchasePool.setLocTtlAmt(String.valueOf(ComputeUtil.sub(adjustmentSupplierTotal, oldSupplierTotal)));
				// 0
				purchasePool.setLocTaxAmt("0");
				
			}
			purchasePool.setNetAmt(purchasePool.getLocNetAmt());
			purchasePool.setTaxAmt(purchasePool.getLocTaxAmt());
			purchasePool.setTtlAmt(purchasePool.getLocTtlAmt());
			if (CommonEnum.YES.getCode().equals(warehouseService.getLockStatus(wareStockin.getCompany()))) {
				purchasePool.setStats("O"); // 锁库传SBS
			} else {
				purchasePool.setStats("I"); // 默认状态
			}
			// 供应商名称（物流公司）
			purchasePool.setVndrNme(wareStockin.getSupplierId());
			purchasePool.setVndrSapId(wareStockin.getSupplierId());
			purchasePool.setWarePurchasePoolId(null);
			purchasePool.setIsDel(0);
			purchasePool.setCreateTime(new Date());
			purchasePool.setCreateUser(getCurrentUserId());
			warePurchasePoolDao.insertSelective(purchasePool);
		}
		// 5.4公共部门-（原始数量-现有数量）*均摊运费+（现有总运费-原有总运费）发生变化
		numFreightTotal = ComputeUtil.add(numFreightTotal,ComputeUtil.sub(adjustment.getAdjustmentFreight(),wareStockin.getFreight()));
		if(numFreightTotal.compareTo(BigDecimal.ZERO)!=0) {
			// store
			WareStorePool storePoolRecord = new WareStorePool();
			storePoolRecord.setBizDte(DateUtil.date2String(adjustment.getCreateTime()));
			storePoolRecord.setBizTypCde("102");
			// TODO 修改为公共部门的代码
			storePoolRecord.setCctrCde("公共部门成本中心（各公司股东公共部门）");
			storePoolRecord.setCompCde(purchasePool.getCompCde());
			storePoolRecord.setCreDte(DateUtil.date2String(adjustment.getCreateTime()));
			// TODO 修改为公共部门的代码
			storePoolRecord.setDeptCde("公共部门成本中心（各公司股东公共部门）");
			storePoolRecord.setInteType("T001");
			storePoolRecord.setInvtrTypCde(purchasePool.getInvtrTyp());
			storePoolRecord.setLegacyCreByUsr(String.valueOf(adjustment.getCreateUser()));
			storePoolRecord.setLegacyDocTyp(purchasePool.getLegacyDocTyp());
			storePoolRecord.setLegacyOrdrId(String.valueOf(adjustment.getWareEntryAdjustmentId()));
			storePoolRecord.setLegacyOrdrNum(adjustment.getEntryAdjustmentNo());
			storePoolRecord.setLocCcyCde("CNY");
			storePoolRecord.setLocNetAmt(String.valueOf(numFreightTotal));
			// TODO 修改为公共部门的代码
			storePoolRecord.setPctrCde("公共部门成本中心（各公司股东公共部门）");
			if (CommonEnum.YES.getCode().equals(warehouseService.getLockStatus(wareStockin.getCompany()))) {
				storePoolRecord.setStats("O"); // 锁库传SBS
			} else {
				storePoolRecord.setStats("I"); // 默认状态
			}
			storePoolRecord.setIsDel(0);
			storePoolRecord.setCreateTime(new Date());
			storePoolRecord.setCreateUser(getCurrentUserId());
			wareStorePoolDao.insertSelective(storePoolRecord);
		}
		WareEntryAdjustment adjustmentRecord = new WareEntryAdjustment();
		adjustmentRecord.setWareEntryAdjustmentId(wareEntryAdjustmentId);
		adjustmentRecord.setAuditStatus(AuditStateEnum.AUDITED.getCode());
		entryAdjustmentDao.updateByPrimaryKeySelective(adjustmentRecord);
		
	}
	/**
	 * 
	* @Description: 模拟退库-出库操作
	* @param originalBatch
	* @return int
	* @throws 
	 */
	private Double getReturnOutStock(WareEntryAdjustmentDetail detailRecord,WareStockinDetail wareStockin) {
		// 1.根据原始批次号取得入库数量和当前库存数量
		WareStock wareStock = stockService.getStockInfoByOriginalBatch(wareStockin.getSparePartsOriginalBatch(), wareStockin.getSpareParts());

		// 2.入库数量>库存数量=》有出库单
		if(wareStock.getEntryNum().compareTo(wareStock.getActualSurplusNum())==0) {
			return 0d;
		}
		// 3.根据批次号取得出库单
//		List<String> batches = stockService.getBatchByOriginalBatch(wareStockin.getSparePartsOriginalBatch(), wareStockin.getSpareParts());
//		if(batches.size()==0) {
//			return 0d;
//		}
//		List<WareStockoutDetail> details = stockoutService.getStockOutDetailList(batches, wareStockin.getSpareParts());
//		if(details==null||details.size()==0) {
//			return 0d;
//		}
//		List<WareStockout> stockOuts =stockoutService.getStockOut(details.stream().map(WareStockoutDetail::getWareStockoutId).collect(Collectors.toList()));

		Map<String, Object> map = new HashMap<>();
		map.put("sparePartsOriginalBatch", wareStockin.getSparePartsOriginalBatch());
		map.put("spareParts", wareStockin.getSpareParts());
		List<WareReturnWarehouse>  returnWarehouses = wareStockExtDao.selectStockOutNumByOriginalBatchAndparts(map);
		// 4.根据出库单生成退库单，同时修改出库单  更新退库数量
		// 4.1 生成退库单
		// 4.2修改出库单
		// 4.3生成出库单
		for(WareReturnWarehouse wareReturnWarehouse:returnWarehouses) {
			
		}
		// 5.生成新的出库单
		// 6.上传SBS（（调账单价-原始单价）*（入库数量-库存数量））
		return 0d;
	}
	

	

}
