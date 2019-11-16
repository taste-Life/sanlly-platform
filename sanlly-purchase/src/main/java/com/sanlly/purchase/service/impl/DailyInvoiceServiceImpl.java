package com.sanlly.purchase.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.dao.PurchaseBillMapper;
import com.sanlly.purchase.dao.PurchaseDeliveryDetailMapper;
import com.sanlly.purchase.dao.PurchaseDeliveryMapper;
import com.sanlly.purchase.entity.PurchaseBill;
import com.sanlly.purchase.entity.PurchaseBillExample;
import com.sanlly.purchase.entity.PurchaseDelivery;
import com.sanlly.purchase.entity.PurchaseDeliveryDetail;
import com.sanlly.purchase.entity.PurchaseDeliveryDetailExample;
import com.sanlly.purchase.entity.PurchaseDeliveryExample;
import com.sanlly.purchase.enums.VerifyAccountEnum;
import com.sanlly.purchase.models.input.matterinvoice.AddMatterInvoiceInput;
import com.sanlly.purchase.models.input.matterinvoice.SearchMatterInvoiceInput;
import com.sanlly.purchase.models.output.matterdeliver.MatterDeliveryOutput;
import com.sanlly.purchase.models.output.matterinvoice.MatterInvoiceOutput;
import com.sanlly.purchase.service.DailyInvoiceService;

/**
 * 
* @Package com.sanlly.purchase.service.impl 
* @Description: 日常采购-发票管理  
* @author jlx   
* @date 2019年9月16日 上午11:22:27 
* @version V1.0   
 */
@Service
public class DailyInvoiceServiceImpl extends BaseServiceImpl implements DailyInvoiceService {

	@Autowired
	private PurchaseBillMapper purchaseBillDao;
	@Autowired
	private PurchaseDeliveryMapper purchaseDeliveryDao;
	@Autowired
	private PurchaseDeliveryDetailMapper purchaseDeliveryDetailDao;
	@Override
	public PagedList<MatterInvoiceOutput> getMatterInvoicePagedList(SearchMatterInvoiceInput input) {
		PurchaseBillExample example = new PurchaseBillExample();
		PurchaseBillExample.Criteria criteria = example.createCriteria();
		
		PurchaseDeliveryExample deliveryExample = new PurchaseDeliveryExample();
		PurchaseDeliveryExample.Criteria deliveryCriteria = deliveryExample.createCriteria();

		PurchaseDeliveryDetailExample detailExample = new PurchaseDeliveryDetailExample();
		PurchaseDeliveryDetailExample.Criteria detailCriteria = detailExample.createCriteria();
		
		// 查询条件	
		// 采购单位
		if(StringUtils.isNotEmpty(input.getPurchaseCompany())) {
			deliveryCriteria.andPurchaseCompanyEqualTo(input.getPurchaseCompany());
			List<PurchaseDelivery> purchaseDeliverys = purchaseDeliveryDao.selectByExample(deliveryExample);	
			criteria.andInvoiceNoIn(purchaseDeliverys.stream().map(PurchaseDelivery::getInvoiceNo).collect(Collectors.toList()));
		}		
		// 发票号
		if(StringUtils.isNotEmpty(input.getInvoiceNo())) {
			criteria.andInvoiceNoLike("%"+input.getInvoiceNo()+"%");
		}
		// 供应商
		if(StringUtils.isNotEmpty(input.getSupplier())) {
			criteria.andSupplierEqualTo(input.getSupplier());
		}	
		criteria.andIsDayPruchaseEqualTo(CommonEnum.YES.getCode());
		criteria.andIsDelEqualTo(CommonEnum.NO.getCode());
		example.setOrderByClause("create_time desc");
		

		// 总条数
		Integer totalItemCount = (int) purchaseBillDao.countByExample(example);
		// 分页查询
		PagedList<MatterInvoiceOutput> pagedList = new PagedList<MatterInvoiceOutput>(input.getPageIndex(),
				input.getPageSize(), totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<PurchaseBill> bills = purchaseBillDao.selectByExample(example);
		List<MatterInvoiceOutput> invoiceOutputs = new ArrayList<>();
		// 数据组装
		for (PurchaseBill bill : bills) {
			MatterInvoiceOutput output = new MatterInvoiceOutput();
			BeanUtils.copyProperties(bill, output);
			output.setInvoice(bill.getInvoice());
			output.setPurchaseCompanyLangLang(bill.getPurchaseCompany());
			output.setInvoiceLangLang(bill.getInvoice());
			output.setSupplierLangLang(bill.getSupplier());
			
			deliveryExample.clear();
			deliveryCriteria = deliveryExample.createCriteria();
			deliveryCriteria.andInvoiceNoEqualTo(bill.getInvoiceNo());
			List<PurchaseDelivery> purchaseDeliverys = purchaseDeliveryDao.selectByExample(deliveryExample);			
			List<MatterDeliveryOutput> deliveryOutputs = new ArrayList<>();
			for(PurchaseDelivery purchaseDelivery : purchaseDeliverys) {
				MatterDeliveryOutput dOutput = new MatterDeliveryOutput();
				BeanUtils.copyProperties(purchaseDelivery, dOutput);
				dOutput.setInvoiceLangLang(purchaseDelivery.getInvoice());
				dOutput.setPurchaseCompanyLangLang(purchaseDelivery.getPurchaseCompany());
				dOutput.setSupplierLangLang(purchaseDelivery.getSupplier());
				dOutput.setSupplyTypeLangLang(purchaseDelivery.getSupplyType());
				
				// 取得送货单收货总金额
				detailExample.clear(); 
				detailCriteria = detailExample.createCriteria();
				detailCriteria.andPurcPurchaseDeliveryEqualTo(purchaseDelivery.getPurcPurchaseDeliveryId());
				List<PurchaseDeliveryDetail> details = purchaseDeliveryDetailDao.selectByExample(detailExample);				
				BigDecimal total = new BigDecimal(0);
				for(PurchaseDeliveryDetail detail : details) {
					total = total.add(detail.getReciveSumAmount()==null?(new BigDecimal(0)):detail.getReciveSumAmount());					
				}
				dOutput.setTotal(total);
				deliveryOutputs.add(dOutput);
			}
			output.setDeliveryOutputs(deliveryOutputs);
			invoiceOutputs.add(output);
		}
		// 将分页数据放入结果中
		pagedList.getDataList().addAll(invoiceOutputs);
		return pagedList;
	}

	/**
	 * 发票录入
	 */
	@Transactional
	@Override
	public void addInvoice(AddMatterInvoiceInput input) {

		PurchaseBill bill = new PurchaseBill();
		bill.setInvoiceNo(input.getInvoiceNo());
		bill.setInvoice(input.getInvoice());
		bill.setNoTaxAmount(input.getNoTaxAmount());
		bill.setTaxFee(input.getTaxFee());
		bill.setTaxAmount(input.getTotal());
		bill.setIsDayPruchase(CommonEnum.YES.getCode());
		bill.setPurchaseCompany(input.getPurchaseCompanyLang());
		bill.setSupplier(input.getSupplier());
		bill.setCreateTime(new Date());
		bill.setCreateUser(getCurrentUserId());
		bill.setIsDel(CommonEnum.NO.getCode());
		purchaseBillDao.insertSelective(bill);

		for (Integer purcPurchaseDeliveryId : input.getPurcPurchaseDeliveryIds()) {
			PurchaseDelivery record = new PurchaseDelivery();
			record.setPurcPurchaseDeliveryId(purcPurchaseDeliveryId);
			record.setIsVerifyAccount(VerifyAccountEnum.INVOICED.getCode());
			record.setInvoiceNo(input.getInvoiceNo());
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			purchaseDeliveryDao.updateByPrimaryKeySelective(record);
		}
		
	}

	/**
	 * 删除发票
	 */
	@Transactional
	@Override
	public void delInvoice(Integer[] purcPurchaseBillIds) {
		for (Integer purcPurchaseBillId : purcPurchaseBillIds) {
			// 删除发票
			PurchaseBill record = new PurchaseBill();
			record.setPurcPurchaseBillId(purcPurchaseBillId);
			record.setIsDel(CommonEnum.YES.getCode());
			purchaseBillDao.updateByPrimaryKeySelective(record);
			PurchaseBill bill = purchaseBillDao.selectByPrimaryKey(purcPurchaseBillId);
			// 更新发货单对应的发票号
			PurchaseDeliveryExample deliveryExample = new PurchaseDeliveryExample();
			PurchaseDeliveryExample.Criteria deliveryCriteria = deliveryExample.createCriteria();
			deliveryCriteria.andInvoiceNoEqualTo(bill.getInvoiceNo());
			List<PurchaseDelivery> purchaseDeliverys = purchaseDeliveryDao.selectByExample(deliveryExample);
			for (PurchaseDelivery purchaseDelivery : purchaseDeliverys) {
				PurchaseDelivery upRecord = new PurchaseDelivery();
				upRecord.setPurcPurchaseDeliveryId(purchaseDelivery.getPurcPurchaseDeliveryId());
				upRecord.setInvoiceNo("");
				upRecord.setIsVerifyAccount(VerifyAccountEnum.VERIFIED.getCode());
				upRecord.setUpdateTime(new Date());
				upRecord.setUpdateUser(getCurrentUserId());
				purchaseDeliveryDao.updateByPrimaryKeySelective(upRecord);
			}
		}
		
	}
}
