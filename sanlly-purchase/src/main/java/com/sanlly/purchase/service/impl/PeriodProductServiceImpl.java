package com.sanlly.purchase.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.purchase.dao.MatterTenderPurchaseMapper;
import com.sanlly.purchase.dao.MatterTenderWarehouseMapper;
import com.sanlly.purchase.dao.PeriodProductMapper;
import com.sanlly.purchase.entity.MatterDemand;
import com.sanlly.purchase.entity.MatterDemandExample;
import com.sanlly.purchase.entity.MatterTenderPurchase;
import com.sanlly.purchase.entity.PeriodProduct;
import com.sanlly.purchase.entity.PeriodProductExample;
import com.sanlly.purchase.models.input.periodproduct.AddPeriodProductInput;
import com.sanlly.purchase.models.input.periodproduct.EditPeriodProductInput;
import com.sanlly.purchase.models.input.periodproduct.SearchPeriodProductInput;
import com.sanlly.purchase.models.output.MatterDemand.MatterDemandOutput;
import com.sanlly.purchase.models.output.feign.SparePartsOutput;
import com.sanlly.purchase.models.output.period.PeriodProductOutput;
import com.sanlly.purchase.service.AuthFigenClient;
import com.sanlly.purchase.service.PeriodProductService;
import com.sanlly.purchase.service.feign.WareFeignClient;

/**
 * 
 * Description: 周期性定价备件接口
 * 
 * @ClassName: PeriodProductServiceImpl
 * @date 2019年8月1日
 *
 * @author jlx
 */
@Service
public class PeriodProductServiceImpl extends BaseServiceImpl implements PeriodProductService {

	@Autowired
	private PeriodProductMapper periodProductDao;
	@Autowired
	private WareFeignClient wareFeignClient;
	@Autowired
	private AuthFigenClient authFigenClient;
	
	@Autowired
	private MatterTenderPurchaseMapper matterTenderPurchaseDao;

	/**
	 * 判断备件是否为周期性定价备件
	 * 
	 * @param product
	 * @return
	 */
	@Transactional
	@Override
	public void addPeriodProduct(AddPeriodProductInput input) {

		PeriodProductExample example = new PeriodProductExample();
		PeriodProductExample.Criteria criteria = example.createCriteria();
		// 1.判断备件在仓库中是否已存在周期性定价
		criteria.andProductEqualTo(input.getProduct());
		criteria.andWarehouseEqualTo(input.getWarehouse());
		criteria.andEndTimeGreaterThan(new Date());
		List<PeriodProduct> periodProductList = periodProductDao.selectByExample(example);
		// 2.如果存在更新备件的周期性定价供货截止时间为当前时间
		if(periodProductList.size()>0) {
			PeriodProduct upRecord = new PeriodProduct();
			upRecord.setPurcPeriodProductId(periodProductList.get(0).getPurcPeriodProductId());
			upRecord.setEndTime(new Date());
			periodProductDao.updateByPrimaryKeySelective(upRecord);
		}
		// 3.添加周期性定价
		PeriodProduct record = new PeriodProduct();
		BeanUtils.copyProperties(input, record);
		record.setIsDel(CommonEnum.NO.getCode());
		record.setCreateTime(new Date());
		record.setCreateUser(getCurrentUserId());

		periodProductDao.insertSelective(record);

	}

	/**
	 * 周期性定价备件的供应商
	 * 
	 * @param product
	 * @return
	 */
	@Override
	public PeriodProduct getSupplier(String product,String warehouse) {
		PeriodProductExample example = new PeriodProductExample();
		PeriodProductExample.Criteria criteria = example.createCriteria();
		// 备件key
		criteria.andProductEqualTo(product);
		// 供货截止时间大于等于当前时间
		criteria.andEndTimeGreaterThanOrEqualTo(new Date());
		// 仓库 
		criteria.andWarehouseEqualTo(warehouse);
		example.setOrderByClause("end_time desc");
		// 取得供应商
		List<PeriodProduct> periodProductList = periodProductDao.selectByExample(example);
		if(periodProductList.size()==0) {
			return null;
		}else {
			PeriodProduct periodProduct = periodProductList.get(0);
			return periodProduct;
		}
		
	}

	/**
	 * 周期性定价备件分页列表 
	 */
	@Override
	public PagedList<PeriodProductOutput> getPeriodProductPagedList(SearchPeriodProductInput input) {

		PeriodProductExample example = new PeriodProductExample();
		PeriodProductExample.Criteria criteria = example.createCriteria();
		// 招标截止时间
		if (input.getEndTimeStart() != null && input.getEndTimeEnd() != null) {
			criteria.andEndTimeGreaterThanOrEqualTo(input.getEndTimeStart());
			criteria.andEndTimeLessThanOrEqualTo(input.getEndTimeEnd());
		}
		// 采购单位
		if (StringUtils.isNotEmpty(input.getPurchaseCompany())) {
			criteria.andPurchaseCompanyEqualTo(input.getPurchaseCompany());
		}
		// 备件编号
		if (StringUtils.isNotEmpty(input.getProductNum())) {
			criteria.andProductNumLike("%"+input.getProductNum()+"%");
		}
		// 供应商
		if (StringUtils.isNotEmpty(input.getSupplier())) {
			criteria.andSupplierEqualTo(input.getSupplier());
		}
		criteria.andIsDelEqualTo(CommonEnum.NO.getCode());
		example.setOrderByClause("create_time desc");

		// 总条数
		Integer totalItemCount = (int) periodProductDao.countByExample(example);
		// 分页查询
		PagedList<PeriodProductOutput> pagedList = new PagedList<PeriodProductOutput>(input.getPageIndex(),
				input.getPageSize(), totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		
		List<PeriodProduct> periodProductList = periodProductDao.selectByExample(example);
		List<PeriodProductOutput> outputList = new ArrayList<PeriodProductOutput>();
		for(PeriodProduct period:periodProductList) {
			PeriodProductOutput output = new PeriodProductOutput();
			BeanUtils.copyProperties(period, output);
			output.setInvoiceLangLang(period.getInvoice());
			output.setPurchaseCompanyLangLang(period.getPurchaseCompany());
			output.setProductLangLang(period.getProduct());
			output.setProductUnitLangLang(period.getProductUnit());
			output.setTenderTypeLangLang(period.getTenderType());
			output.setWarehouseLangLang(period.getWarehouse());
			output.setSupplierLangLang(period.getSupplier());
			SparePartsOutput rsSparePart = wareFeignClient.getSparePart(period.getProduct()).getData();
			if (rsSparePart != null) {
				output.setGenaralTypeLangLang(rsSparePart.getSparePartsCategories());
				output.setSecondTypeLangLang(rsSparePart.getSparePartsCategoriesDetails());
				output.setProductSpecial(rsSparePart.getSparePartsSpec());
				output.setProductModel(rsSparePart.getModel());
				output.setProductUnit(rsSparePart.getSparePartsUnit());
			}
			// 单价变更人
			if(period.getPriceChangePerson()!=null) {
				
				UserInfoOutput rs = authFigenClient.userDetail(period.getPriceChangePerson()).getData();
				if (rs != null) {
					output.setStrPriceChangePerson(rs.getUserName());
				}
			}
			MatterTenderPurchase matterTenderPurchase =matterTenderPurchaseDao.selectByPrimaryKey(period.getTenderPurchaseId());
			output.setTenderId(matterTenderPurchase.getTenderId());
			outputList.add(output);
		}
		// 将分页数据放入结果中
		pagedList.getDataList().addAll(outputList);
		return pagedList;
	}

	/**
	 * 编辑周期性定价备件价格  
	 */
	@Transactional
	@Override
	public void UpdateProductPrice(EditPeriodProductInput input) {
		
		// 取得周期性定价数据
		PeriodProduct periodProduct =periodProductDao.selectByPrimaryKey(input.getPurcPeriodProductId());
		// 1.插入一条新的数据，单价变更人、单价变更时间
//		PeriodProduct insertPeriod = new PeriodProduct();
//		insertPeriod = periodProduct;
		periodProduct.setPurcPeriodProductId(null);
		periodProduct.setPriceChangePerson(getCurrentUserId());
		periodProduct.setPriceChangeTime(new Date());
		periodProduct.setProductPrice(input.getProductPrice());
		periodProductDao.insertSelective(periodProduct);
		// 2.更新原数据的供货截止时间(当前时间）、单价变更人、单价变更时间
		PeriodProduct updateRecord = new PeriodProduct();
		updateRecord.setPurcPeriodProductId(input.getPurcPeriodProductId());
		updateRecord.setEndTime(new Date());
		updateRecord.setPriceChangeTime(new Date());
		updateRecord.setPriceChangePerson(getCurrentUserId());
		periodProductDao.updateByPrimaryKeySelective(updateRecord);
		
		// 邮件通知 TODO
	}
	

	/**
	 * 重新招标备件信息取得
	 */
	@Override
	public List<MatterDemandOutput> getReTenderProductList(Integer[] periodProductIds) {
		PeriodProductExample example = new PeriodProductExample();
		PeriodProductExample.Criteria criteria = example.createCriteria();
		criteria.andPurcPeriodProductIdIn(Arrays.asList(periodProductIds));
		List<PeriodProduct> periodProductList = periodProductDao.selectByExample(example);
		List<MatterDemandOutput> mdOutputList = new ArrayList<MatterDemandOutput>();
		BigDecimal sum = new BigDecimal("0");

		for (PeriodProduct md : periodProductList) {

			MatterDemandOutput output = new MatterDemandOutput();
			BeanUtils.copyProperties(md, output);
			
			// 采购单位
			output.setPurchaseCompanyLangLang(md.getPurchaseCompany());
			// 仓库
			output.setWarehouseLangLang(md.getWarehouse());

			SparePartsOutput rsSparePart = wareFeignClient.getSparePart(md.getProduct()).getData();

			if (rsSparePart != null) {
				output.setGenaralTypeLangLang(rsSparePart.getSparePartsCategories());
				output.setSecondTypeLangLang(rsSparePart.getSparePartsCategoriesDetails());
				output.setSecondType(rsSparePart.getSparePartsCategoriesDetails());
				output.setProductSpecial(rsSparePart.getSparePartsSpec());
				output.setProductModel(rsSparePart.getModel());
				output.setProductLangLang(md.getProduct());
				output.setProductUnit(rsSparePart.getSparePartsUnit());
				output.setProductUnitLangLang(rsSparePart.getSparePartsUnit());
				output.setProductNum(rsSparePart.getSparePartsNo());
				output.setPurchasingReferencePrice(rsSparePart.getPurchasingReferencePrice() == null ? new BigDecimal("0")
						: rsSparePart.getPurchasingReferencePrice());
				sum = sum.add(rsSparePart.getPurchasingReferencePrice()== null ? new BigDecimal("0")
						: rsSparePart.getPurchasingReferencePrice());	
			}

			for (MatterDemandOutput matterDemand : mdOutputList) {
				// 权重计算
				if(sum.compareTo(BigDecimal.ZERO)==0) {
					matterDemand.setWeight(1d);
				}else if(matterDemand.getPurchasingReferencePrice().compareTo(BigDecimal.ZERO)==0){
					matterDemand.setWeight(1d);
				}else {
					matterDemand.setWeight(matterDemand.getPurchasingReferencePrice().divide(sum,2).doubleValue());
				}			
			}

			mdOutputList.add(output);
		}
		return mdOutputList;
		
	}
	

	/**
	 * 周期性定价备件到期提醒分页列表 
	 */
	@Override
	public PagedList<PeriodProductOutput> getPeriodProductRemindPagedList(SearchPeriodProductInput input) {

		PeriodProductExample example = new PeriodProductExample();
		PeriodProductExample.Criteria criteria = example.createCriteria();
		// 招标截止时间
		if (input.getEndTimeStart() != null && input.getEndTimeEnd() != null) {
			criteria.andEndTimeGreaterThanOrEqualTo(input.getEndTimeStart());
			criteria.andEndTimeLessThanOrEqualTo(input.getEndTimeEnd());
		}
		// 采购单位
		if (StringUtils.isNotEmpty(input.getPurchaseCompany())) {
			criteria.andPurchaseCompanyEqualTo(input.getPurchaseCompany());
		}
		// 备件编号
		if (StringUtils.isNotEmpty(input.getProductNum())) {
			criteria.andProductNumLike("%"+input.getPurchaseCompany()+"%");
		}
		// 供应商
		if (StringUtils.isNotEmpty(input.getSupplier())) {
			criteria.andSupplierEqualTo(input.getSupplier());
		}
		// 供货截止时间大于当前时间，小于当前时间加30天
		criteria.andEndTimeLessThan(DateUtils.addDays(new Date(), 30));
		criteria.andEndTimeGreaterThan(new Date());
		criteria.andIsDelEqualTo(CommonEnum.NO.getCode());
		example.setOrderByClause("create_time desc");

		// 总条数
		Integer totalItemCount = (int) periodProductDao.countByExample(example);
		// 分页查询
		PagedList<PeriodProductOutput> pagedList = new PagedList<PeriodProductOutput>(input.getPageIndex(),
				input.getPageSize(), totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		
		List<PeriodProduct> periodProductList = periodProductDao.selectByExample(example);
		List<PeriodProductOutput> outputList = new ArrayList<PeriodProductOutput>();
		for(PeriodProduct period:periodProductList) {
			PeriodProductOutput output = new PeriodProductOutput();
			BeanUtils.copyProperties(period, output);
			output.setInvoiceLangLang(period.getInvoice());
			output.setPurchaseCompanyLangLang(period.getPurchaseCompany());
			output.setProductLangLang(period.getProduct());
			output.setProductUnitLangLang(period.getProductUnit());
			output.setTenderTypeLangLang(period.getTenderType());
			output.setWarehouseLangLang(period.getWarehouse());
			output.setSupplierLangLang(period.getSupplier());
			SparePartsOutput rsSparePart = wareFeignClient.getSparePart(period.getProduct()).getData();
			if (rsSparePart != null) {
				output.setGenaralTypeLangLang(rsSparePart.getSparePartsCategories());
				output.setSecondTypeLangLang(rsSparePart.getSparePartsCategoriesDetails());
				output.setProductSpecial(rsSparePart.getSparePartsSpec());
				output.setProductModel(rsSparePart.getModel());
				output.setProductUnit(rsSparePart.getSparePartsUnit());
			}
			// 单价变更人
			if(period.getPriceChangePerson()!=null) {
				Result authRs = authFigenClient.userDetail(period.getPriceChangePerson());
				if (authRs != null) {
					Map<String, String> map = (Map<String, String>) authRs.getData();
					output.setStrPriceChangePerson(map.get("userName"));
				}
			}
			MatterTenderPurchase matterTenderPurchase =matterTenderPurchaseDao.selectByPrimaryKey(period.getTenderPurchaseId());
			output.setTenderId(matterTenderPurchase.getTenderId());
			outputList.add(output);
		}
		// 将分页数据放入结果中
		pagedList.getDataList().addAll(outputList);
		return pagedList;
	}

}
