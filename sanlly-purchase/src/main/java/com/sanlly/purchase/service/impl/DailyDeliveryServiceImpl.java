package com.sanlly.purchase.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.output.Result;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.dao.PurchaseDeliveryDetailMapper;
import com.sanlly.purchase.dao.PurchaseDeliveryMapper;
import com.sanlly.purchase.dao.PurchaseOrderDetailMapper;
import com.sanlly.purchase.dao.PurchaseOrderMapper;
import com.sanlly.purchase.entity.PurchaseDelivery;
import com.sanlly.purchase.entity.PurchaseDeliveryDetail;
import com.sanlly.purchase.entity.PurchaseDeliveryDetailExample;
import com.sanlly.purchase.entity.PurchaseDeliveryExample;
import com.sanlly.purchase.entity.PurchaseOrder;
import com.sanlly.purchase.entity.PurchaseOrderDetail;
import com.sanlly.purchase.entity.PurchaseOrderDetailExample;
import com.sanlly.purchase.enums.OrderStatusEnum;
import com.sanlly.purchase.enums.ReciveStatusEnum;
import com.sanlly.purchase.enums.VerifyAccountEnum;
import com.sanlly.purchase.models.input.dailydeliver.AddDailyDeliveryInput;
import com.sanlly.purchase.models.input.matterdeliver.AddMatterDeliveryInput;
import com.sanlly.purchase.models.input.matterdeliver.SearchMatterDeliveryInput;
import com.sanlly.purchase.models.input.matterdeliver.StockinDetailOutput;
import com.sanlly.purchase.models.input.matterdeliver.StockinOutput;
import com.sanlly.purchase.models.output.dailydeliver.DailyDeliveryDetailOutput;
import com.sanlly.purchase.models.output.dailydeliver.DailyDeliveryOutput;
import com.sanlly.purchase.models.output.feign.SparePartsOutput;
import com.sanlly.purchase.models.output.feign.WareWarehouse;
import com.sanlly.purchase.service.DailyDeliveryService;
import com.sanlly.purchase.service.InvoiceTypeService;
import com.sanlly.purchase.service.feign.WareFeignClient;
/**
 * 
* @Package com.sanlly.purchase.service.impl 
* @Description: 日常采购-送货单 
* @author jlx   
* @date 2019年9月16日 上午11:23:58 
* @version V1.0   
 */
@Service
public class DailyDeliveryServiceImpl extends BaseServiceImpl implements DailyDeliveryService {

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
	
	/**
	 * 生成发货单
	 */
	@Transactional
	@Override
	public void addDailyDelivery(AddDailyDeliveryInput input) {
		PurchaseOrder purchaseOrder = purchaseOrderDao.selectByPrimaryKey(input.getPurcPurchaseOrderId());
		// 取得订单的送货单

		PurchaseDeliveryExample example = new PurchaseDeliveryExample();
		PurchaseDeliveryExample.Criteria criteria = example.createCriteria();
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
		record.setIsDayPruchase(CommonEnum.YES.getCode());
		record.setDeliveryNum(wareFeignClient.getBillNumber("送货单号",purchaseOrder.getPurchaseCompany()).getData());
		record.setPurchaseCompany(purchaseOrder.getPurchaseCompany());
		record.setPurchaseType(purchaseOrder.getPurchaseType());
		record.setPurchaseUserId(purchaseOrder.getPurchaseUserId());
		record.setPurcPurchaseOrder(input.getPurcPurchaseOrderId());
		record.setSupplier(purchaseOrder.getSupplier());
		record.setSupplyType(input.getSupplyType());
		record.setLogisticsCompany(input.getLogisticsCompany());
		record.setLogisticsNum(input.getLogisticsNum());
		record.setReciveStatus(ReciveStatusEnum.UNRECEIVE.getCode());
		record.setIsVerifyAccount(VerifyAccountEnum.UNVERIFY.getCode());
		record.setIsDel(CommonEnum.NO.getCode());
		record.setPurchaseTime(purchaseOrder.getCreateTime());
		record.setReciveAddress(input.getReciveAddress());
		record.setCreateTime(new Date());
		record.setCreateUser(getCurrentUserId());
		record.setInvoice(purchaseOrder.getInvoice());
		record.setFreight(input.getFreight());
		purchaseDeliveryDao.insertSelective(record);
		for(DailyDeliveryDetailOutput detail : input.getDetailOutputs()) {

			// 发货单详情信息组装
			PurchaseDeliveryDetail detailRecord = new PurchaseDeliveryDetail();
			BeanUtils.copyProperties(detail, detailRecord);
			detailRecord.setPurcPurchaseDelivery(record.getPurcPurchaseDeliveryId());

			detailRecord.setCreateTime(new Date());
			detailRecord.setCreateUser(getCurrentUserId());
			purchaseDeliveryDetailDao.insertSelective(detailRecord);
		}
		
	}

	/**
	 * 发货单分页列表
	 */
	@Override
	public PagedList<DailyDeliveryOutput> getMatterDeliveryPagedList(SearchMatterDeliveryInput input) {
		
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
		criteria.andIsDayPruchaseEqualTo(CommonEnum.YES.getCode());
		criteria.andIsDelEqualTo(CommonEnum.NO.getCode());
		example.setOrderByClause("create_time desc");
		
		// 总条数
		Integer totalItemCount = (int) purchaseDeliveryDao.countByExample(example);
		// 分页查询
		PagedList<DailyDeliveryOutput> pagedList = new PagedList<DailyDeliveryOutput>(input.getPageIndex(),
				input.getPageSize(), totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<PurchaseDelivery> deliverys = purchaseDeliveryDao.selectByExample(example);
		List<DailyDeliveryOutput> deliveryOutputs = new ArrayList<>();
		// 数据组装
		for (PurchaseDelivery delivery : deliverys) {
			DailyDeliveryOutput deliveryOutput = new DailyDeliveryOutput();
			BigDecimal total = new BigDecimal(0);
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

			detailExample.clear(); 
			detailCriteria = detailExample.createCriteria();
			detailCriteria.andPurcPurchaseDeliveryEqualTo(delivery.getPurcPurchaseDeliveryId());
			List<PurchaseDeliveryDetail> details = purchaseDeliveryDetailDao.selectByExample(detailExample);
			List<DailyDeliveryDetailOutput> detailOutputs = new ArrayList<>();
			for(PurchaseDeliveryDetail detail : details) {
				DailyDeliveryDetailOutput detailOutput = new DailyDeliveryDetailOutput();

				BeanUtils.copyProperties(detail, detailOutput);
				total = total.add(detail.getReciveSumAmount()==null?(new BigDecimal(0)):detail.getReciveSumAmount());
				detailOutputs.add(detailOutput);
			}
			deliveryOutput.setTotal(total);
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
	public List<DailyDeliveryDetailOutput> getDeliveryInfo(Integer purcPurchaseOrderId) {
		
		PurchaseOrderDetailExample detailExample = new PurchaseOrderDetailExample();
		PurchaseOrderDetailExample.Criteria detailCriteria = detailExample.createCriteria();
		
		PurchaseOrder purchaseOrder = purchaseOrderDao.selectByPrimaryKey(purcPurchaseOrderId);

		detailCriteria.andPurcPurchaseOrderEqualTo(purcPurchaseOrderId);
		List<PurchaseOrderDetail> details = purchaseOrderDetailDao.selectByExample(detailExample);
		List<DailyDeliveryDetailOutput> detailOutputs = new ArrayList<>();
		// 订单商品数据组装
		for (PurchaseOrderDetail detail : details) {
			DailyDeliveryDetailOutput detailOutput = new DailyDeliveryDetailOutput();
			BeanUtils.copyProperties(detail, detailOutput);		
			detailOutput.setDeliveryCount(detail.getOrderNum()-(detail.getDeliverNum()==null?0d:detail.getDeliverNum()));
			detailOutput.setReciveAddress(purchaseOrder.getReciverAddress());
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
	 * 对账单分页列表
	 */
	@Override
	public PagedList<DailyDeliveryOutput> getVerifyPagedList(SearchMatterDeliveryInput input) {
		
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
		criteria.andIsDayPruchaseEqualTo(CommonEnum.YES.getCode());
		criteria.andIsDelEqualTo(CommonEnum.NO.getCode());
		example.setOrderByClause("create_time desc");
		
		// 总条数
		Integer totalItemCount = (int) purchaseDeliveryDao.countByExample(example);
		// 分页查询
		PagedList<DailyDeliveryOutput> pagedList = new PagedList<DailyDeliveryOutput>(input.getPageIndex(),
				input.getPageSize(), totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<PurchaseDelivery> deliverys = purchaseDeliveryDao.selectByExample(example);
		List<DailyDeliveryOutput> deliveryOutputs = new ArrayList<>();
		// 数据组装
		for (PurchaseDelivery delivery : deliverys) {
			DailyDeliveryOutput deliveryOutput = new DailyDeliveryOutput();
			BigDecimal total = new BigDecimal(0);
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

			detailExample.clear(); 
			detailCriteria = detailExample.createCriteria();
			detailCriteria.andPurcPurchaseDeliveryEqualTo(delivery.getPurcPurchaseDeliveryId());
			List<PurchaseDeliveryDetail> details = purchaseDeliveryDetailDao.selectByExample(detailExample);
			List<DailyDeliveryDetailOutput> detailOutputs = new ArrayList<>();
			for(PurchaseDeliveryDetail detail : details) {
				DailyDeliveryDetailOutput detailOutput = new DailyDeliveryDetailOutput();

				BeanUtils.copyProperties(detail, detailOutput);
				detailOutput.setReciveSumAmount(detail.getReciveSumAmount());
				total = total.add(detail.getReciveSumAmount()==null?(new BigDecimal(0)):detail.getReciveSumAmount());
				detailOutputs.add(detailOutput);
			}
			deliveryOutput.setTotal(total);
			deliveryOutput.setDetails(detailOutputs);
			deliveryOutputs.add(deliveryOutput);
		}
		// 将分页数据放入结果中
		pagedList.getDataList().addAll(deliveryOutputs);
		return pagedList;
	}

//	/**
//	 * 验收入库
//	 */
//	@Override
//	public void addAcceptDelivery(AddDailyDeliveryInput input) {
//		
//		for(DailyDeliveryDetailOutput detail : input.getDetailOutputs()) {
//
//			// 发货单详情信息组装
//			PurchaseDeliveryDetail detailRecord = new PurchaseDeliveryDetail();
//			detailRecord.setPurcPurchaseDelivery(detail.getPurcPurchaseDelivery());
//			detailRecord.setReciveCount(detail.getDeliveryCount());
//			detailRecord.set
//			detailRecord.setUpdateTime(new Date());
//			detailRecord.setUpdateUser(getCurrentUserId());
//			purchaseDeliveryDetailDao.insertSelective(detailRecord);
//		}
//		
//	}
	

	/**
	 * 取得送货单信息
	 */
	@Override
	public List<DailyDeliveryDetailOutput> getAcceptInfo(Integer purcPurchaseDeliveryId) {
		

		PurchaseDeliveryDetailExample detailExample = new PurchaseDeliveryDetailExample();
		PurchaseDeliveryDetailExample.Criteria detailCriteria = detailExample.createCriteria();
		

		detailCriteria.andPurcPurchaseDeliveryEqualTo(purcPurchaseDeliveryId);
		List<PurchaseDeliveryDetail> details = purchaseDeliveryDetailDao.selectByExample(detailExample);
		List<DailyDeliveryDetailOutput> detailOutputs = new ArrayList<>();
		// 订单商品数据组装
		for (PurchaseDeliveryDetail detail : details) {
			DailyDeliveryDetailOutput detailOutput = new DailyDeliveryDetailOutput();
			BeanUtils.copyProperties(detail, detailOutput);		
			detailOutput.setDeliveryCount(detail.getDeliveryCount());
			detailOutput.setReciveCount(detail.getDeliveryCount());
			detailOutputs.add(detailOutput);
		}

		return detailOutputs;
	}
	/**
	 * 验收入库
	 */
	@Transactional
	@Override
	public Result addAcceptDelivery(AddDailyDeliveryInput input) {

		PurchaseDeliveryExample example = new PurchaseDeliveryExample();
		PurchaseDeliveryExample.Criteria criteria = example.createCriteria();

		PurchaseDeliveryDetailExample detailDExample = new PurchaseDeliveryDetailExample();
		PurchaseDeliveryDetailExample.Criteria detailDCriteria = detailDExample.createCriteria();

		PurchaseOrderDetailExample detailOExample = new PurchaseOrderDetailExample();
		PurchaseOrderDetailExample.Criteria detailOCriteria = detailOExample.createCriteria();

		// 订单完成flag
		boolean orderFinish = true;

		PurchaseDelivery delivery = purchaseDeliveryDao.selectByPrimaryKey(input.getDetailOutputs().get(0).getPurcPurchaseDelivery());
		// 更新送货单状态
		PurchaseDelivery deliveryRecord = new PurchaseDelivery();
		deliveryRecord.setPurcPurchaseDeliveryId(input.getDetailOutputs().get(0).getPurcPurchaseDelivery());
		deliveryRecord.setReciveStatus(ReciveStatusEnum.RECEIVED.getCode());
		deliveryRecord.setUpdateTime(new Date());
		deliveryRecord.setUpdateUser(getCurrentUserId());
		purchaseDeliveryDao.updateByPrimaryKeySelective(deliveryRecord);


		// 取得送货单详情
		detailDCriteria.andPurcPurchaseDeliveryEqualTo(delivery.getPurcPurchaseDeliveryId());
		List<PurchaseDeliveryDetail> deliveryDetails = purchaseDeliveryDetailDao.selectByExample(detailDExample);
		// 取得订单详情
		detailOCriteria.andPurcPurchaseOrderEqualTo(delivery.getPurcPurchaseOrder());
		List<PurchaseOrderDetail> orderDetails = purchaseOrderDetailDao.selectByExample(detailOExample);

		for (DailyDeliveryDetailOutput detail : input.getDetailOutputs()) {
			Double reciveCount1=0.0;
			PurchaseDeliveryDetail purchaseDeliveryDetail=purchaseDeliveryDetailDao.selectByPrimaryKey(detail.getPurcPurchaseDeliveryDetailId());
			reciveCount1=detail.getReciveCount()+(purchaseDeliveryDetail.getReciveCount()==null?0.0:purchaseDeliveryDetail.getReciveCount());
			if (reciveCount1>purchaseDeliveryDetail.getDeliveryCount()){
				return Result.Error(ResultCodeEnum.ERROR.getCode(),"验收数量超过送货数量");
			}
			detail.setReciveCount(reciveCount1);
		}
		for (DailyDeliveryDetailOutput detail : input.getDetailOutputs()) {
			// 更新送货单详情
			PurchaseDeliveryDetail deliveryDRecord = new PurchaseDeliveryDetail();
			deliveryDRecord.setPurcPurchaseDeliveryDetailId(detail.getPurcPurchaseDeliveryDetailId());
			deliveryDRecord.setReciveCount(detail.getReciveCount());
			deliveryDRecord.setActualArrivalDate(new Date());
			deliveryDRecord.setUpdateTime(new Date());
			deliveryDRecord.setUpdateUser(getCurrentUserId());
			deliveryDRecord.setReciveSumAmount(detail.getUnitPrice().multiply(new BigDecimal(detail.getReciveCount())));
			purchaseDeliveryDetailDao.updateByPrimaryKeySelective(deliveryDRecord);
			for (PurchaseOrderDetail orderDetail : orderDetails) {
				if (detail.getDemandNo().equals(orderDetail.getDemandNo())) {
					// 更新订单详情
					PurchaseOrderDetail orderDRecord = new PurchaseOrderDetail();
					orderDRecord.setPurcPurchaseOrderDetailId(orderDetail.getPurcPurchaseOrderDetailId());
					Double deliverNum = orderDetail.getDeliverNum() == null ? 0d : orderDetail.getDeliverNum();
					Double reciveCount = detail.getReciveCount() == null ? 0d : detail.getReciveCount();
					orderDRecord.setDeliverNum(deliverNum + reciveCount);
					if (orderDRecord.getDeliverNum() < orderDetail.getOrderNum()) {
						// 订单数量大于送货数量
						orderFinish = false;
					}
					orderDRecord.setUpdateTime(new Date());
					orderDRecord.setUpdateUser(getCurrentUserId());
					purchaseOrderDetailDao.updateByPrimaryKeySelective(orderDRecord);
					break;
				}
			}

		}		

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
		return  Result.Success();
	}
}
