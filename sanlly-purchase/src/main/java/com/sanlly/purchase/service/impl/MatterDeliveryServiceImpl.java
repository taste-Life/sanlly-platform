package com.sanlly.purchase.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.utils.ComputeUtil;
import com.sanlly.purchase.dao.PurchaseDeliveryDetailMapper;
import com.sanlly.purchase.dao.PurchaseDeliveryMapper;
import com.sanlly.purchase.dao.PurchaseOrderDetailMapper;
import com.sanlly.purchase.dao.PurchaseOrderMapper;
import com.sanlly.purchase.dao.SupplierMapper;
import com.sanlly.purchase.entity.PurchaseDelivery;
import com.sanlly.purchase.entity.PurchaseDeliveryDetail;
import com.sanlly.purchase.entity.PurchaseDeliveryDetailExample;
import com.sanlly.purchase.entity.PurchaseDeliveryExample;
import com.sanlly.purchase.entity.PurchaseOrder;
import com.sanlly.purchase.entity.PurchaseOrderDetail;
import com.sanlly.purchase.entity.PurchaseOrderDetailExample;
import com.sanlly.purchase.entity.Supplier;
import com.sanlly.purchase.entity.SupplierExample;
import com.sanlly.purchase.enums.OrderStatusEnum;
import com.sanlly.purchase.enums.ReciveStatusEnum;
import com.sanlly.purchase.enums.VerifyAccountEnum;
import com.sanlly.purchase.models.input.matterdeliver.AddMatterDeliveryInput;
import com.sanlly.purchase.models.input.matterdeliver.SearchMatterDeliveryInput;
import com.sanlly.purchase.models.input.matterdeliver.StockinDetailOutput;
import com.sanlly.purchase.models.input.matterdeliver.StockinOutput;
import com.sanlly.purchase.models.output.feign.SparePartsOutput;
import com.sanlly.purchase.models.output.feign.WareWarehouse;
import com.sanlly.purchase.models.output.matterdeliver.MatterDeliveryDetailOutput;
import com.sanlly.purchase.models.output.matterdeliver.MatterDeliveryOutput;
import com.sanlly.purchase.service.InvoiceTypeService;
import com.sanlly.purchase.service.MatterDeliveryService;
import com.sanlly.purchase.service.feign.WareFeignClient;

/**
 * 
* @Package com.sanlly.purchase.service.impl 
* @Description: 物料采购-送货单 
* @author jlx   
* @date 2019年9月16日 上午11:23:11 
* @version V1.0   
 */
@Service
public class MatterDeliveryServiceImpl extends BaseServiceImpl implements MatterDeliveryService {

	@Autowired
	private PurchaseOrderMapper purchaseOrderDao;
	@Autowired
	private PurchaseOrderDetailMapper purchaseOrderDetailDao;
	@Autowired
	private PurchaseDeliveryMapper purchaseDeliveryDao;
	@Autowired
	private PurchaseDeliveryDetailMapper purchaseDeliveryDetailDao;
	@Autowired
	private WareFeignClient wareFeignClient;
	@Autowired
	private InvoiceTypeService invoiceTypeService;
	@Autowired
	private SupplierMapper supplierDao;
	
	private BigDecimal zero =new BigDecimal(0);
	
	
	/**
	 * 生成发货单
	 */
	@Transactional
	@Override
	public void addMatterDelivery(AddMatterDeliveryInput input) {
		PurchaseOrder purchaseOrder = purchaseOrderDao.selectByPrimaryKey(input.getPurcPurchaseOrderId());

		PurchaseDeliveryExample example = new PurchaseDeliveryExample();
		PurchaseDeliveryExample.Criteria criteria = example.createCriteria();
		
		PurchaseDeliveryDetailExample detailExample = new PurchaseDeliveryDetailExample();
		PurchaseDeliveryDetailExample.Criteria detailCriteria = detailExample.createCriteria();
		
		PurchaseOrderDetailExample orderDetailExample = new PurchaseOrderDetailExample();
		PurchaseOrderDetailExample.Criteria orderDetailCriteria = orderDetailExample.createCriteria();
		// 取得订单的送货单
		criteria.andPurcPurchaseOrderEqualTo(purchaseOrder.getPurcPurchaseOrderId());
		criteria.andIsDelEqualTo(CommonEnum.NO.getCode());
		List<PurchaseDelivery> deliverys = purchaseDeliveryDao.selectByExample(example);
		if(deliverys.size()==0) {
			PurchaseOrder orderRecord = new PurchaseOrder();
			orderRecord.setPurcPurchaseOrderId(input.getPurcPurchaseOrderId());
			orderRecord.setOrderStatus(OrderStatusEnum.SENDED.getCode());
			orderRecord.setUpdateTime(new Date());
			orderRecord.setUpdateUser(getCurrentUserId());
			purchaseOrderDao.updateByPrimaryKeySelective(orderRecord);
		}
		// 发货单信息组装
		PurchaseDelivery record = new PurchaseDelivery();
		record.setTenderId(purchaseOrder.getTenderId());
		record.setIsDayPruchase(CommonEnum.NO.getCode());
		record.setDeliveryNum(wareFeignClient.getBillNumber("送货单号",purchaseOrder.getPurchaseCompany()).getData());
		record.setPurchaseCompany(purchaseOrder.getPurchaseCompany());
		record.setPurchaseWare(purchaseOrder.getPurchaseWare());
		record.setPurchaseType(purchaseOrder.getPurchaseType());
		record.setPurchaseUserId(purchaseOrder.getPurchaseUserId());
		record.setPurcPurchaseOrder(input.getPurcPurchaseOrderId());
		record.setSupplier(purchaseOrder.getSupplier());
		record.setComments(purchaseOrder.getComments());
		record.setSupplyType(input.getSupplyType());
		record.setLogisticsCompany(input.getLogisticsCompany());
		record.setLogisticsNum(input.getLogisticsNum());
		record.setReciveStatus(ReciveStatusEnum.UNRECEIVE.getCode());
		record.setIsVerifyAccount(VerifyAccountEnum.UNVERIFY.getCode());
		record.setIsDel(CommonEnum.NO.getCode());
		record.setBilltotalamount(BigDecimal.ZERO);
		record.setPurchaseTime(purchaseOrder.getCreateTime());
		record.setReciveAddress(input.getReciveAddress());
		record.setCreateTime(new Date());
		record.setCreateUser(getCurrentUserId());
		record.setInvoice(purchaseOrder.getInvoice());
		record.setFreight(input.getFreight());
		record.setTariff(input.getTariff());
		purchaseDeliveryDao.insertSelective(record);
		for(MatterDeliveryDetailOutput detail : input.getDetailOutputs()) {
			if(detail.getDeliveryCount()==0) {
				continue;
			}
			// 发货单详情信息组装
			PurchaseDeliveryDetail detailRecord = new PurchaseDeliveryDetail();
			BeanUtils.copyProperties(detail, detailRecord);
			detailRecord.setPurcPurchaseDelivery(record.getPurcPurchaseDeliveryId());
			detailRecord.setReciveCount(0d);
			detailRecord.setCreateTime(new Date());
			detailRecord.setCreateUser(getCurrentUserId());
			purchaseDeliveryDetailDao.insertSelective(detailRecord);
		}		

		// 订单采购数取得
		orderDetailCriteria.andPurcPurchaseOrderEqualTo(purchaseOrder.getPurcPurchaseOrderId());		
		List<PurchaseOrderDetail> orderDetails = purchaseOrderDetailDao.selectByExample(orderDetailExample);
		Map<String, List<PurchaseOrderDetail>> orderGroupByProduct = orderDetails.stream().collect(Collectors.groupingBy(PurchaseOrderDetail::getDemandNo));
		// 取得订单的送货单
		deliverys = purchaseDeliveryDao.selectByExample(example);
		
		// 取得订单送货详情
		List<Integer> deliveryIds = deliverys.stream().map(PurchaseDelivery::getPurcPurchaseDeliveryId).collect(Collectors.toList());
		detailCriteria.andPurcPurchaseDeliveryIn(deliveryIds);
		List<PurchaseDeliveryDetail> deliveryDetails= purchaseDeliveryDetailDao.selectByExample(detailExample);
		deliveryDetails = deliveryDetails.stream().filter(d->d.getDeliveryCount()>0).collect(Collectors.toList());
		Map<String, List<PurchaseDeliveryDetail>> deliveryGroupByProduct = deliveryDetails.stream().collect(Collectors.groupingBy(PurchaseDeliveryDetail::getDemandNo));
		
//		for(Map.Entry<String, List<PurchaseOrderDetail>> entry : orderGroupByProduct.entrySet()){
//			Double orderProducts = entry.getValue().stream().mapToDouble(PurchaseOrderDetail::getOrderNum).sum();
//			Double deliveryProducts = deliveryGroupByProduct.get(entry.getKey()).stream().mapToDouble(PurchaseDeliveryDetail::getDeliveryCount).sum();
//
//			if(deliveryProducts>orderProducts*1.1) {
//				throw new RuntimeException("deliveryCountOverError");
//			}
//		}
		for(Map.Entry<String, List<PurchaseDeliveryDetail>> entry : deliveryGroupByProduct.entrySet()){
			Double orderProducts = orderGroupByProduct.get(entry.getKey()).stream().mapToDouble(PurchaseOrderDetail::getOrderNum).sum();
			Double deliveryProducts = entry.getValue().stream().mapToDouble(PurchaseDeliveryDetail::getDeliveryCount).sum();
			
			if(deliveryProducts>orderProducts*1.1) {
				throw new RuntimeException("deliveryCountOverError");
			}
		}
		
	}

	/**
	 * 发货单分页列表
	 */
	@Override
	public PagedList<MatterDeliveryOutput> getMatterDeliveryPagedList(SearchMatterDeliveryInput input) {
		
		PurchaseDeliveryExample example = new PurchaseDeliveryExample();
		PurchaseDeliveryExample.Criteria criteria = example.createCriteria();
		
		PurchaseDeliveryDetailExample detailExample = new PurchaseDeliveryDetailExample();
		PurchaseDeliveryDetailExample.Criteria detailCriteria = detailExample.createCriteria();
		
		
		// 查询条件
		// 供货方式
		if(StringUtils.isNotEmpty(input.getSupplyType())) {
			criteria.andSupplyTypeEqualTo(input.getSupplyType());
		}		
		// 采购单位
		if(StringUtils.isNotEmpty(input.getPurchaseCompany())) {
			criteria.andPurchaseCompanyEqualTo(input.getPurchaseCompany());
		}		
		// 收货状态
		if(StringUtils.isNotEmpty(input.getReciveStatus())) {
			criteria.andReciveStatusEqualTo(input.getReciveStatus());
		}
		// 对账状态
		if(StringUtils.isNotEmpty(input.getIsVerifyAccount())) {
			criteria.andIsVerifyAccountEqualTo(input.getIsVerifyAccount());
		}		
		// 送货单号
		if(StringUtils.isNotEmpty(input.getDeliveryNum())) {
			criteria.andDeliveryNumLike("%"+input.getDeliveryNum()+"%");
		}		
		// 供应商
		if(StringUtils.isNotEmpty(input.getSupplier())) {
			criteria.andSupplierEqualTo(input.getSupplier());
		}
		criteria.andIsDayPruchaseEqualTo(CommonEnum.NO.getCode());
		criteria.andIsDelEqualTo(CommonEnum.NO.getCode());
		example.setOrderByClause("create_time desc");
		
		// 总条数
		Integer totalItemCount = (int) purchaseDeliveryDao.countByExample(example);
		// 分页查询
		PagedList<MatterDeliveryOutput> pagedList = new PagedList<MatterDeliveryOutput>(input.getPageIndex(),
				input.getPageSize(), totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<PurchaseDelivery> deliverys = purchaseDeliveryDao.selectByExample(example);
		
		// 取得送货供应商信息。
		List<String> supplierKeys=deliverys.stream().map(PurchaseDelivery::getSupplier).collect(Collectors.toList());
        SupplierExample supplierExample = new SupplierExample();
        SupplierExample.Criteria supplierCriteria = supplierExample.createCriteria();
        supplierCriteria.andKeyIn(supplierKeys);
        List<Supplier> suppliers = supplierDao.selectByExample(supplierExample);
        Map<String, Supplier> supplierMap = suppliers.stream().collect(Collectors.toMap(Supplier::getKey, a -> a,(k1,k2)->k1));
        
        
		List<MatterDeliveryOutput> deliveryOutputs = new ArrayList<>();
		// 数据组装
		for (PurchaseDelivery delivery : deliverys) {
			MatterDeliveryOutput deliveryOutput = new MatterDeliveryOutput();
			BigDecimal total = new BigDecimal(0);
			BigDecimal totalMoney=new BigDecimal("0");
			BeanUtils.copyProperties(delivery, deliveryOutput);
			deliveryOutput.setCurrency(supplierMap.get(delivery.getSupplier()).getCurrency());
			deliveryOutput.setPurchaseCompanyLangLang(delivery.getPurchaseCompany());
			deliveryOutput.setIsVerifyAccountLangLang(delivery.getIsVerifyAccount());
			deliveryOutput.setPurchaseTypeLangLang(delivery.getPurchaseType());
			deliveryOutput.setReciveStatusLangLang(delivery.getReciveStatus());
			deliveryOutput.setSupplierLangLang(delivery.getSupplier());
			deliveryOutput.setSupplyTypeLangLang(delivery.getSupplyType());
			deliveryOutput.setIsVerifyAccountLangLang(delivery.getIsVerifyAccount());
			deliveryOutput.setReciveAddress(delivery.getReciveAddress());
			deliveryOutput.setInvoiceLangLang(delivery.getInvoice());
			deliveryOutput.setInvoicePoint(invoiceTypeService.getInvoiceTypes(delivery.getInvoice()));

			detailExample.clear(); 
			detailCriteria = detailExample.createCriteria();
			detailCriteria.andPurcPurchaseDeliveryEqualTo(delivery.getPurcPurchaseDeliveryId());
			List<PurchaseDeliveryDetail> details = purchaseDeliveryDetailDao.selectByExample(detailExample);
			List<MatterDeliveryDetailOutput> detailOutputs = new ArrayList<>();
			for(PurchaseDeliveryDetail detail : details) {
				MatterDeliveryDetailOutput detailOutput = new MatterDeliveryDetailOutput();

				BeanUtils.copyProperties(detail, detailOutput);
				detailOutput.setProductLangLang(detail.getProduct());
				SparePartsOutput rsSparePart = wareFeignClient.getSparePart(detail.getProduct()).getData();
				if(rsSparePart!=null) {
					detailOutput.setSparePartsUnitLangLang(rsSparePart.getSparePartsUnit());
					detailOutput.setSparePartsCategoriesLangLang(rsSparePart.getSparePartsCategories());
					detailOutput.setSparePartsCategoriesDetailsLangLang(rsSparePart.getSparePartsCategoriesDetails());
					detailOutput.setWarehouseType(rsSparePart.getDefaultWarehouseType());
				}
				detailOutput.setTotalMoney(detail.getUnitPrice().multiply(new BigDecimal(detail.getDeliveryCount().toString())));
				totalMoney=totalMoney.add(detailOutput.getTotalMoney());
				detailOutput.setReciveSumAmount(detail.getReciveSumAmount());
				//total = total.add(detail.getReciveSumAmount()==null?(new BigDecimal(0)):detail.getReciveSumAmount());
				detailOutputs.add(detailOutput);
			}
			//deliveryOutput.setTotal(total);
			deliveryOutput.setTotalMoney(totalMoney);
			deliveryOutput.setDetails(detailOutputs);
			deliveryOutputs.add(deliveryOutput);
		}
		// 将分页数据放入结果中
		pagedList.getDataList().addAll(deliveryOutputs);
		return pagedList;
	}
	/**
	 * 取得送货单信息
	 */
	@Override
	public List<MatterDeliveryDetailOutput> getDeliveryInfo(Integer purcPurchaseOrderId) {
		
		PurchaseOrderDetailExample detailExample = new PurchaseOrderDetailExample();
		PurchaseOrderDetailExample.Criteria detailCriteria = detailExample.createCriteria();
		
		PurchaseOrder purchaseOrder = purchaseOrderDao.selectByPrimaryKey(purcPurchaseOrderId);

		detailCriteria.andPurcPurchaseOrderEqualTo(purcPurchaseOrderId);
		List<PurchaseOrderDetail> details = purchaseOrderDetailDao.selectByExample(detailExample);
		List<MatterDeliveryDetailOutput> detailOutputs = new ArrayList<>();
		// 订单商品数据组装
		for (PurchaseOrderDetail detail : details) {
			MatterDeliveryDetailOutput detailOutput = new MatterDeliveryDetailOutput();
			BeanUtils.copyProperties(detail, detailOutput);
			detailOutput.setProductLangLang(detail.getProduct());
			WareWarehouse warehouse = wareFeignClient.getWarehouseDetail(purchaseOrder.getPurchaseWare()).getData();
			if(warehouse!=null) {
				detailOutput.setReciveAddress(warehouse.getWarehouseAddr());
			}
			SparePartsOutput rsSparePart = wareFeignClient.getSparePart(detail.getProduct()).getData();
			if(rsSparePart!=null) {
				detailOutput.setSparePartsNo(rsSparePart.getSparePartsNo());
				detailOutput.setSparePartsCategoriesLangLang(rsSparePart.getSparePartsCategories());
				detailOutput.setSparePartsCategoriesDetailsLangLang(rsSparePart.getSparePartsCategoriesDetails());
				detailOutput.setSpecification(rsSparePart.getSparePartsSpec());
				detailOutput.setModel(rsSparePart.getModel());
				detailOutput.setSparePartsUnitLangLang(rsSparePart.getSparePartsUnit());
			}
			detailOutput.setDeliveryCount(detail.getOrderNum()-(detail.getDeliverNum()==null?0d:detail.getDeliverNum()));
			
			detailOutputs.add(detailOutput);
		}

		return detailOutputs;
	}

	/**
	 * 删除送货单
	 */
	@Override
	public void delMatterDelivery(Integer[] purcPurchaseDeliveryIds) {
		
		PurchaseDeliveryExample example = new PurchaseDeliveryExample();
		PurchaseDeliveryExample.Criteria criteria = example.createCriteria();
		
		criteria.andPurcPurchaseDeliveryIdIn(Arrays.asList(purcPurchaseDeliveryIds));
		criteria.andReciveStatusEqualTo(ReciveStatusEnum.RECEIVED.getCode());
		// 收货条数
		Integer totalItemCount = (int) purchaseDeliveryDao.countByExample(example);
		// 已收货不能删除
		if(totalItemCount>0) {
			throw new RuntimeException("deliveryReceived");
		} else {
			// 未收货的数据可以删除
			PurchaseDelivery record = new PurchaseDelivery();
			record.setIsDel(CommonEnum.YES.getCode());
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			example.clear();
			criteria = example.createCriteria();
			criteria.andPurcPurchaseDeliveryIdIn(Arrays.asList(purcPurchaseDeliveryIds));
			purchaseDeliveryDao.updateByExampleSelective(record, example);
		}
	}

	/**
	 * 送货单入库
	 */
	@Transactional
	@Override
	public void deliveryStockin(StockinOutput stockinOutput) {

		PurchaseDeliveryExample example = new PurchaseDeliveryExample();
		PurchaseDeliveryExample.Criteria criteria = example.createCriteria();

		PurchaseDeliveryDetailExample detailDExample = new PurchaseDeliveryDetailExample();
		PurchaseDeliveryDetailExample.Criteria detailDCriteria = detailDExample.createCriteria();
		
		PurchaseOrderDetailExample detailOExample = new PurchaseOrderDetailExample();
		PurchaseOrderDetailExample.Criteria detailOCriteria = detailOExample.createCriteria();
		
		// 订单完成flag
		boolean orderFinish = true;
		boolean deliveryFinish = true;
		
		// 取得送货单信息
		criteria.andDeliveryNumEqualTo(stockinOutput.getNo());		
		List<PurchaseDelivery> deliverys = purchaseDeliveryDao.selectByExample(example);
		if(deliverys.size()!=1) {
			throw new RuntimeException("deliveryUpdateFail");
		}

		PurchaseDelivery delivery = deliverys.get(0);
		
		// 取得送货单详情
		detailDCriteria.andPurcPurchaseDeliveryEqualTo(delivery.getPurcPurchaseDeliveryId());
		List<PurchaseDeliveryDetail> deliveryDetails = purchaseDeliveryDetailDao.selectByExample(detailDExample);
		// 取得订单详情
		detailOCriteria.andPurcPurchaseOrderEqualTo(delivery.getPurcPurchaseOrder());
		List<PurchaseOrderDetail> orderDetails = purchaseOrderDetailDao.selectByExample(detailOExample);
		
		for(StockinDetailOutput detail:stockinOutput.getStockinDetail()) {
			for(PurchaseDeliveryDetail deliveryDetail:deliveryDetails) {
				if(detail.getSpareParts().equals(deliveryDetail.getProduct())) {
					// 更新送货单详情
					PurchaseDeliveryDetail deliveryDRecord = new PurchaseDeliveryDetail();
					deliveryDRecord.setPurcPurchaseDeliveryDetailId(deliveryDetail.getPurcPurchaseDeliveryDetailId());
					deliveryDRecord.setReciveCount(deliveryDetail.getReciveCount()+detail.getEntryNum());
					deliveryDRecord.setActualArrivalDate(new Date());
					deliveryDRecord.setEntryPrice(detail.getEntryPrice());
					deliveryDRecord.setUpdateTime(new Date());
					deliveryDRecord.setUpdateUser(getCurrentUserId());
//					deliveryDRecord.setReciveSumAmount(detail.getEntryPrice().multiply(new BigDecimal(detail.getEntryNum())));
					purchaseDeliveryDetailDao.updateByPrimaryKeySelective(deliveryDRecord);
					if(deliveryDRecord.getReciveCount().compareTo(detail.getDeliveryNum())<0) {
						deliveryFinish = false;
					}
					break;
				}
			}
			for(PurchaseOrderDetail orderDetail:orderDetails) {
				if(detail.getSpareParts().equals(orderDetail.getProduct())) {
					// 更新订单详情
					PurchaseOrderDetail orderDRecord = new PurchaseOrderDetail();
					orderDRecord.setPurcPurchaseOrderDetailId(orderDetail.getPurcPurchaseOrderDetailId());
					Double deliverNum = orderDetail.getDeliverNum()==null?0d:orderDetail.getDeliverNum();
					Double entryNum = detail.getEntryNum()==null?0d:detail.getEntryNum();
					orderDRecord.setDeliverNum(deliverNum+entryNum);
					if(orderDRecord.getDeliverNum() < orderDetail.getOrderNum()) {
						// 订单数量大于送货数量
						orderFinish = false;
					}
					orderDRecord.setUpdateTime(new Date());
					orderDRecord.setUpdateUser(getCurrentUserId());
					purchaseOrderDetailDao.updateByPrimaryKeySelective(orderDRecord);
				}
			}
		}

		// 更新送货单状态
		PurchaseDelivery deliveryRecord = new PurchaseDelivery(); 
		deliveryRecord.setBilltotalamount(ComputeUtil.add(delivery.getBilltotalamount(), stockinOutput.getBillTotalAmount()));
		deliveryRecord.setInvoice(stockinOutput.getInvoiceType());
		deliveryRecord.setVat(ComputeUtil.add(delivery.getVat(),stockinOutput.getVat()));
		deliveryRecord.setTariff(ComputeUtil.add(delivery.getTariff(),stockinOutput.getTariff()));
		deliveryRecord.setFreight(ComputeUtil.add(delivery.getFreight(),stockinOutput.getFreight()));
		deliveryRecord.setPurcPurchaseDeliveryId(delivery.getPurcPurchaseDeliveryId());
		if(deliveryFinish) {
			deliveryRecord.setReciveStatus(ReciveStatusEnum.RECEIVED.getCode());
		}else {
			deliveryRecord.setReciveStatus(ReciveStatusEnum.PARTRECEIVED.getCode());
		}
		deliveryRecord.setUpdateTime(new Date());
		deliveryRecord.setUpdateUser(getCurrentUserId());
		purchaseDeliveryDao.updateByPrimaryKeySelective(deliveryRecord);
		

		// 更新订单状态
		PurchaseOrder orderRecord = new PurchaseOrder();
		if(orderFinish) {
			orderRecord.setOrderStatus(OrderStatusEnum.FINISH.getCode());
		}else {
			orderRecord.setOrderStatus(OrderStatusEnum.PARTDELIVER.getCode());
		}
		orderRecord.setPurcPurchaseOrderId(delivery.getPurcPurchaseOrder());
		orderRecord.setUpdateTime(new Date());
		orderRecord.setUpdateUser(getCurrentUserId());
		purchaseOrderDao.updateByPrimaryKeySelective(orderRecord);		
		
	}

	/**
	 * 对账
	 */
	@Override
	public void verifyMatterDelivery(Integer[] purcPurchaseDeliveryIds) {
		PurchaseDeliveryExample example = new PurchaseDeliveryExample();
		PurchaseDeliveryExample.Criteria criteria = example.createCriteria();
		
		criteria.andPurcPurchaseDeliveryIdIn(Arrays.asList(purcPurchaseDeliveryIds));
		criteria.andIsVerifyAccountNotEqualTo(VerifyAccountEnum.UNVERIFY.getCode());
		// 未对账以外条数
		Integer totalItemCount = (int) purchaseDeliveryDao.countByExample(example);
		// 已对账或待确认不能对账
		if(totalItemCount>0) {
			throw new RuntimeException("deliveryVerifyed");
		} else {
			// 未对账的数据可以对账
			PurchaseDelivery record = new PurchaseDelivery();
			record.setIsVerifyAccount(VerifyAccountEnum.VERIFING.getCode());
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			example.clear();
			criteria = example.createCriteria();
			criteria.andPurcPurchaseDeliveryIdIn(Arrays.asList(purcPurchaseDeliveryIds));
			purchaseDeliveryDao.updateByExampleSelective(record, example);
		}
		
	}

	/**
	 * 对账确认
	 */
	@Override
	public void verifyOkMatterDelivery(Integer[] purcPurchaseDeliveryIds) {
		PurchaseDeliveryExample example = new PurchaseDeliveryExample();
		PurchaseDeliveryExample.Criteria criteria = example.createCriteria();
		
		criteria.andPurcPurchaseDeliveryIdIn(Arrays.asList(purcPurchaseDeliveryIds));
		criteria.andIsVerifyAccountNotEqualTo(VerifyAccountEnum.VERIFING.getCode());
		// 对账待确认以外条数
		Integer totalItemCount = (int) purchaseDeliveryDao.countByExample(example);
		// 已对账或未对账不能确认对账
		if(totalItemCount>0) {
			throw new RuntimeException("deliveryVerifyed");
		} else {
			// 待对账确认的数据可以对账确认
			PurchaseDelivery record = new PurchaseDelivery();
			record.setIsVerifyAccount(VerifyAccountEnum.VERIFIED.getCode());
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			example.clear();
			criteria = example.createCriteria();
			criteria.andPurcPurchaseDeliveryIdIn(Arrays.asList(purcPurchaseDeliveryIds));
			purchaseDeliveryDao.updateByExampleSelective(record, example);
		}
		
	}


	/**
	 * 发货单分页列表
	 */
	@Override
	public PagedList<MatterDeliveryOutput> getVerifyPagedList(SearchMatterDeliveryInput input) {
		
		PurchaseDeliveryExample example = new PurchaseDeliveryExample();
		PurchaseDeliveryExample.Criteria criteria = example.createCriteria();
		
		PurchaseDeliveryDetailExample detailExample = new PurchaseDeliveryDetailExample();
		PurchaseDeliveryDetailExample.Criteria detailCriteria = detailExample.createCriteria();
		
		
		// 查询条件
		// 供货方式
//		if(StringUtils.isNotEmpty(input.getSupplyType())) {
//			criteria.andSupplyTypeEqualTo(input.getSupplyType());
//		}		
		// 采购单位
		if(StringUtils.isNotEmpty(input.getPurchaseCompany())) {
			criteria.andPurchaseCompanyEqualTo(input.getPurchaseCompany());
		}		
		// 收货状态
//		if(StringUtils.isNotEmpty(input.getReciveStatus())) {
			criteria.andReciveStatusEqualTo(ReciveStatusEnum.RECEIVED.getCode());
//		}	
		// 供应商
		if (StringUtils.isNotEmpty(input.getSupplier())) {
			criteria.andSupplierEqualTo(input.getSupplier());
		}
		// 对账状态
		if(StringUtils.isNotEmpty(input.getIsVerifyAccount())) {
			criteria.andIsVerifyAccountEqualTo(input.getIsVerifyAccount());
		}		
		// 送货单号
		if(StringUtils.isNotEmpty(input.getDeliveryNum())) {
			criteria.andDeliveryNumLike("%"+input.getDeliveryNum()+"%");
		}
		criteria.andIsDayPruchaseEqualTo(CommonEnum.NO.getCode());
		criteria.andIsDelEqualTo(CommonEnum.NO.getCode());
		example.setOrderByClause("create_time desc");
		
		// 总条数
		Integer totalItemCount = (int) purchaseDeliveryDao.countByExample(example);
		// 分页查询
		PagedList<MatterDeliveryOutput> pagedList = new PagedList<MatterDeliveryOutput>(input.getPageIndex(),
				input.getPageSize(), totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<PurchaseDelivery> deliverys = purchaseDeliveryDao.selectByExample(example);
		List<MatterDeliveryOutput> deliveryOutputs = new ArrayList<>();
		// 数据组装
		for (PurchaseDelivery delivery : deliverys) {
			MatterDeliveryOutput deliveryOutput = new MatterDeliveryOutput();
//			BigDecimal total = new BigDecimal(0);
			BeanUtils.copyProperties(delivery, deliveryOutput);
			deliveryOutput.setPurchaseCompanyLangLang(delivery.getPurchaseCompany());
			deliveryOutput.setIsVerifyAccountLangLang(delivery.getIsVerifyAccount());
			deliveryOutput.setPurchaseTypeLangLang(delivery.getPurchaseType());
			deliveryOutput.setReciveStatusLangLang(delivery.getReciveStatus());
			deliveryOutput.setSupplierLangLang(delivery.getSupplier());
			deliveryOutput.setSupplyTypeLangLang(delivery.getSupplyType());
			deliveryOutput.setIsVerifyAccountLangLang(delivery.getIsVerifyAccount());
			deliveryOutput.setReciveAddress(delivery.getReciveAddress());
			deliveryOutput.setInvoiceLangLang(delivery.getInvoice());
			deliveryOutput.setInvoicePoint(invoiceTypeService.getInvoiceTypes(delivery.getInvoice()));
			
//			if(delivery.getTariff()!=null) {
//				deliveryOutput.setNoTaxAmount(delivery.getBilltotalamount().add(delivery.getTariff()));
//			}else {
				deliveryOutput.setNoTaxAmount(delivery.getBilltotalamount().subtract(delivery.getTariff()));
//			}
			deliveryOutput.setTaxFee(delivery.getVat()==null?zero:delivery.getVat());
			deliveryOutput.setTotal(deliveryOutput.getNoTaxAmount().add(deliveryOutput.getTaxFee()).add(delivery.getTariff()));
			
			detailExample.clear(); 
			detailCriteria = detailExample.createCriteria();
			detailCriteria.andPurcPurchaseDeliveryEqualTo(delivery.getPurcPurchaseDeliveryId());
			List<PurchaseDeliveryDetail> details = purchaseDeliveryDetailDao.selectByExample(detailExample);
			List<MatterDeliveryDetailOutput> detailOutputs = new ArrayList<>();
			for(PurchaseDeliveryDetail detail : details) {
				MatterDeliveryDetailOutput detailOutput = new MatterDeliveryDetailOutput();

				BeanUtils.copyProperties(detail, detailOutput);
				detailOutput.setProductLangLang(detail.getProduct());
				SparePartsOutput rsSparePart = wareFeignClient.getSparePart(detail.getProduct()).getData();
				if(rsSparePart!=null) {
					detailOutput.setSparePartsUnitLangLang(rsSparePart.getSparePartsUnit());
	
					detailOutput.setSparePartsCategoriesLangLang(rsSparePart.getSparePartsCategories());
					detailOutput.setSparePartsCategoriesDetailsLangLang(rsSparePart.getSparePartsCategoriesDetails());
				}
				detailOutput.setReciveSumAmount(detail.getEntryPrice().multiply(new BigDecimal(detail.getReciveCount()==null?0d:detail.getReciveCount())));
//				total = total.add(detailOutput.getReciveSumAmount()==null?(new BigDecimal(0)):detailOutput.getReciveSumAmount());
				detailOutputs.add(detailOutput);
			}
//			deliveryOutput.setTotal(total);
//			deliveryOutput.setNoTaxAmount(deliveryOutput.getTotal().divide(new BigDecimal(1+invoiceTypeService.getInvoiceTypes(delivery.getInvoice())),2,BigDecimal.ROUND_HALF_UP));
//			deliveryOutput.setTaxFee(deliveryOutput.getTotal().subtract(deliveryOutput.getNoTaxAmount()));
			deliveryOutput.setDetails(detailOutputs);
			deliveryOutputs.add(deliveryOutput);
		}
		// 将分页数据放入结果中
		pagedList.getDataList().addAll(deliveryOutputs);
		return pagedList;
	}

	@Override
	public MatterDeliveryOutput getMatterDeliveryTOStockin(SearchMatterDeliveryInput input) {
		
		PurchaseDeliveryDetailExample detailExample = new PurchaseDeliveryDetailExample();
		PurchaseDeliveryDetailExample.Criteria detailCriteria = detailExample.createCriteria();
		// 取得送货供应商信息。		
        SupplierExample supplierExample = new SupplierExample();
        SupplierExample.Criteria supplierCriteria = supplierExample.createCriteria();

		MatterDeliveryOutput deliveryOutput = new MatterDeliveryOutput();
		PurchaseDelivery delivery = purchaseDeliveryDao.selectByPrimaryKey(input.getPurcPurchaseDeliveryId());
		BeanUtils.copyProperties(delivery, deliveryOutput);
		Date date=null;
		PagedList<StockinOutput> ouputs= wareFeignClient.stockinPageList("","",date,date,"","","","",delivery.getDeliveryNum(),"","","",false,1,200).getData();
		
		for(StockinOutput stockinOutput:ouputs.getDataList()) {
			if(AuditStateEnum.UNAUDIT.getCode().equals(stockinOutput.getAuditStatus())) {
				throw new RuntimeException("unAudit");
			}
		}
        supplierCriteria.andKeyEqualTo(delivery.getSupplier());
        List<Supplier> suppliers = supplierDao.selectByExample(supplierExample);
        if(suppliers!=null&&suppliers.size()>0) {
        	deliveryOutput.setCurrency(suppliers.get(0).getCurrency());
        }
		deliveryOutput.setPurchaseCompanyLangLang(delivery.getPurchaseCompany());
		deliveryOutput.setIsVerifyAccountLangLang(delivery.getIsVerifyAccount());
		deliveryOutput.setPurchaseTypeLangLang(delivery.getPurchaseType());
		deliveryOutput.setReciveStatusLangLang(delivery.getReciveStatus());
		deliveryOutput.setSupplierLangLang(delivery.getSupplier());
		deliveryOutput.setSupplyTypeLangLang(delivery.getSupplyType());
		deliveryOutput.setIsVerifyAccountLangLang(delivery.getIsVerifyAccount());
		deliveryOutput.setReciveAddress(delivery.getReciveAddress());
		deliveryOutput.setInvoiceLangLang(delivery.getInvoice());
		deliveryOutput.setInvoicePoint(invoiceTypeService.getInvoiceTypes(delivery.getInvoice()));
		
		detailCriteria.andPurcPurchaseDeliveryEqualTo(input.getPurcPurchaseDeliveryId());
		// 送货单明细id
		if(input.getPurcPurchaseDeliveryDetailIds()!=null && input.getPurcPurchaseDeliveryDetailIds().length>0) {
			detailCriteria.andPurcPurchaseDeliveryDetailIdIn(Arrays.asList(input.getPurcPurchaseDeliveryDetailIds()));
		}
		List<PurchaseDeliveryDetail> details = purchaseDeliveryDetailDao.selectByExample(detailExample);

		List<MatterDeliveryDetailOutput> detailOutputs = new ArrayList<>();
		for(PurchaseDeliveryDetail detail : details) {
			if(detail.getReciveCount().compareTo(detail.getDeliveryCount())<0) {
				MatterDeliveryDetailOutput detailOutput = new MatterDeliveryDetailOutput();
	
				BeanUtils.copyProperties(detail, detailOutput);
				detailOutput.setProductLangLang(detail.getProduct());
				SparePartsOutput rsSparePart = wareFeignClient.getSparePart(detail.getProduct()).getData();
				if(rsSparePart!=null) {
					detailOutput.setSparePartsUnitLangLang(rsSparePart.getSparePartsUnit());
					detailOutput.setSparePartsCategoriesLangLang(rsSparePart.getSparePartsCategories());
					detailOutput.setSparePartsCategoriesDetailsLangLang(rsSparePart.getSparePartsCategoriesDetails());
					detailOutput.setWarehouseType(rsSparePart.getDefaultWarehouseType());
				}
				detailOutput.setReciveSumAmount(detail.getReciveSumAmount());
				detailOutputs.add(detailOutput);
			}
		}
		deliveryOutput.setDetails(detailOutputs);
		return deliveryOutput;
	}

}
