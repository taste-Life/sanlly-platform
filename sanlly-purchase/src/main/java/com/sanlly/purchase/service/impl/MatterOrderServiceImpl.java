package com.sanlly.purchase.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.dao.PurchaseOrderDetailMapper;
import com.sanlly.purchase.dao.PurchaseOrderMapper;
import com.sanlly.purchase.entity.MatterTemporaryPurchase;
import com.sanlly.purchase.entity.PurchaseOrder;
import com.sanlly.purchase.entity.PurchaseOrderDetail;
import com.sanlly.purchase.entity.PurchaseOrderDetailExample;
import com.sanlly.purchase.entity.PurchaseOrderExample;
import com.sanlly.purchase.enums.OrderStatusEnum;
import com.sanlly.purchase.models.input.matterorder.AddPurchaseOrderDetailInput;
import com.sanlly.purchase.models.input.matterorder.AddPurchaseOrderInput;
import com.sanlly.purchase.models.input.matterorder.SearchPurchaseOrderInput;
import com.sanlly.purchase.models.output.feign.SparePartsOutput;
import com.sanlly.purchase.models.output.feign.WareWarehouse;
import com.sanlly.purchase.models.output.matterorder.PurchaseOrderDetailOutput;
import com.sanlly.purchase.models.output.matterorder.PurchaseOrderOutput;
import com.sanlly.purchase.models.output.matterpurchase.MatterPurchaseOutput;
import com.sanlly.purchase.service.MatterOrderService;
import com.sanlly.purchase.service.feign.WareFeignClient;

/**
 * 
* @Package com.sanlly.purchase.service.impl 
* @Description: 订单服务层 
* @author jlx   
* @date 2019年9月4日 下午1:29:36 
* @version V1.0   
 */
@Service
public class MatterOrderServiceImpl extends BaseServiceImpl implements MatterOrderService {

	@Autowired
	PurchaseOrderMapper purchaseOrderDao;
	@Autowired
	PurchaseOrderDetailMapper purchaseOrderDetailDao;
	@Autowired
	private WareFeignClient wareFeignClient;
	
	/**
	 * 生成订单
	 */
	@Transactional
	@Override
	public void addPurchaseOrder(AddPurchaseOrderInput input) {
		
		// 订单
		PurchaseOrder record = new PurchaseOrder();
		BeanUtils.copyProperties(input, record);
		record.setIsDayPruchase(CommonEnum.NO.getCode());
		record.setOrderStatus(OrderStatusEnum.UNDELIVER.getCode());
		record.setCreateTime(new Date());
		record.setCreateUser(getCurrentUserId());	
		record.setOrderNo(wareFeignClient.getBillNumber("订单编号",getCurrentCompanyKey()).getData());
		purchaseOrderDao.insertSelective(record);
		
		// 订单商品详情
		for(AddPurchaseOrderDetailInput detail:input.getDetails()) {
			PurchaseOrderDetail detailRecord = new PurchaseOrderDetail();

			BeanUtils.copyProperties(detail, detailRecord);

			SparePartsOutput rsSparePart = wareFeignClient.getSparePart(detail.getProduct()).getData();
			if(rsSparePart!=null) {
				detailRecord.setSparePartsNo(rsSparePart.getSparePartsNo());
			}
			detailRecord.setCreateTime(new Date());
			detailRecord.setCreateUser(getCurrentUserId());	
			detailRecord.setPurcPurchaseOrder(record.getPurcPurchaseOrderId());
			purchaseOrderDetailDao.insertSelective(detailRecord);
		}
		
	}
	/**
	 * 订单分页列表
	 */
	@Override
	public PagedList<PurchaseOrderOutput> getPurchaseOrderPagedList(SearchPurchaseOrderInput input) {
		PurchaseOrderExample example = new PurchaseOrderExample();
		PurchaseOrderExample.Criteria criteria = example.createCriteria();
		
		PurchaseOrderDetailExample detailExample = new PurchaseOrderDetailExample();
		PurchaseOrderDetailExample.Criteria detailCriteria = detailExample.createCriteria();

		// 查询条件
		// 备件号
		if(StringUtils.isNotEmpty(input.getSparePartsNo())) {
			detailCriteria.andSparePartsNoLike("%"+input.getSparePartsNo()+"%");
			List<PurchaseOrderDetail> details = purchaseOrderDetailDao.selectByExample(detailExample);
			criteria.andPurcPurchaseOrderIdIn(details.stream().map(PurchaseOrderDetail::getPurcPurchaseOrder).collect(Collectors.toList()));
		}
		// 采购单位
		if(StringUtils.isNotEmpty(input.getPurchaseCompany())) {
			criteria.andPurchaseCompanyEqualTo(input.getPurchaseCompany());
		}	
		// 供应商
		if(StringUtils.isNotEmpty(input.getSupplier())) {
			criteria.andSupplierEqualTo(input.getSupplier());
		}
		// 采购模式
		if(StringUtils.isNotEmpty(input.getPurchasingPattern())) {
			criteria.andPurchaseTypeEqualTo(input.getPurchasingPattern());
		}
		// 订单状态
		if(StringUtils.isNotEmpty(input.getOrderStatus())) {
			criteria.andOrderStatusEqualTo(input.getOrderStatus());
		}
		// 是否日常采购
		criteria.andIsDayPruchaseEqualTo(CommonEnum.NO.getCode());
		example.setOrderByClause("create_time desc");
		// 总条数
		Integer totalItemCount = (int) purchaseOrderDao.countByExample(example);
		// 分页查询
		PagedList<PurchaseOrderOutput> pagedList = new PagedList<PurchaseOrderOutput>(input.getPageIndex(),
				input.getPageSize(), totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<PurchaseOrder> purchaseOrders = purchaseOrderDao.selectByExample(example);
		List<PurchaseOrderOutput> purchaseOrderOutputs = new ArrayList<>();

		// 数据组装
		for (PurchaseOrder po : purchaseOrders) {
			PurchaseOrderOutput poo = new PurchaseOrderOutput();
			BeanUtils.copyProperties(po, poo);
			poo.setPurchaseCompanyLangLang(po.getPurchaseCompany());
			poo.setPurchaseWareLangLang(po.getPurchaseWare());
			poo.setPurchaseTypeLangLang(po.getPurchaseType());
			poo.setSupplierLangLang(po.getSupplier());
			poo.setOrderStatusLangLang(po.getOrderStatus());
			poo.setInvoiceLangLang(po.getInvoice());

			WareWarehouse warehouse = wareFeignClient.getWarehouseDetail(po.getPurchaseWare()).getData();
			if (warehouse != null) {
				poo.setReciverAddress(warehouse.getWarehouseAddr());
			}
			poo.setOrderStatusLangLang(po.getOrderStatus());
			
			detailExample.clear();
			detailCriteria = detailExample.createCriteria();
			detailCriteria.andPurcPurchaseOrderEqualTo(po.getPurcPurchaseOrderId());
			List<PurchaseOrderDetail> details = purchaseOrderDetailDao.selectByExample(detailExample);
			List<PurchaseOrderDetailOutput> detailOutputs = new ArrayList<>();
			BigDecimal total = new BigDecimal("0");
			// 订单商品数据组装
			for(PurchaseOrderDetail detail : details) {
				PurchaseOrderDetailOutput detailOutput = new PurchaseOrderDetailOutput();
				BeanUtils.copyProperties(detail, detailOutput);
				detailOutput.setProductLangLang(detail.getProduct());
				SparePartsOutput rsSparePart = wareFeignClient.getSparePart(detail.getProduct()).getData();
				if(rsSparePart!=null) {
					detailOutput.setSparePartsNo(rsSparePart.getSparePartsNo());
					detailOutput.setSparePartsCategoriesLangLang(rsSparePart.getSparePartsCategories());
					detailOutput.setSparePartsCategoriesDetailsLangLang(rsSparePart.getSparePartsCategoriesDetails());
					
					detailOutput.setSpecification(rsSparePart.getSparePartsSpec());
					detailOutput.setModel(rsSparePart.getModel());
					detailOutput.setSparePartsUnitLangLang(rsSparePart.getSparePartsUnit());
				}
				detailOutput.setTotal(detail.getUnitPrice().multiply(new BigDecimal(detail.getOrderNum())));
				detailOutputs.add(detailOutput);
				total = total.add(detailOutput.getTotal());
			}
			poo.setDetails(detailOutputs);
			poo.setTotal(total);
			
			purchaseOrderOutputs.add(poo);
		}
		// 将分页数据放入结果中
		pagedList.getDataList().addAll(purchaseOrderOutputs);
		return pagedList;
	}
	/**
	 * 更新订单状态为完成
	 */
	@Override
	public void updateOrderStatus(Integer purcPurchaseOrderId) {

		PurchaseOrder record = new PurchaseOrder();
		record.setPurcPurchaseOrderId(purcPurchaseOrderId);
		record.setOrderStatus(OrderStatusEnum.FINISH.getCode());
		purchaseOrderDao.updateByPrimaryKeySelective(record);
		
	}
	

}
