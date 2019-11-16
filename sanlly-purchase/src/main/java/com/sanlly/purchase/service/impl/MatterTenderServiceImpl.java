package com.sanlly.purchase.service.impl;

import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.purchase.dao.*;
import com.sanlly.purchase.entity.*;
import com.sanlly.purchase.enums.*;
import com.sanlly.purchase.models.input.MultiSelectInput;
import com.sanlly.purchase.models.input.matterorder.AddPurchaseOrderDetailInput;
import com.sanlly.purchase.models.input.matterorder.AddPurchaseOrderInput;
import com.sanlly.purchase.models.input.mattertender.AddMatterTenderInput;
import com.sanlly.purchase.models.input.mattertender.AddMatterTenderResultInput;
import com.sanlly.purchase.models.input.mattertender.SearchMatterTenderInput;
import com.sanlly.purchase.models.input.periodproduct.AddPeriodProductInput;
import com.sanlly.purchase.models.input.supplier.SearchPurcSupplierInput;
import com.sanlly.purchase.models.output.MatterDemand.MatterDemandOutput;
import com.sanlly.purchase.models.output.feign.SparePartsOutput;
import com.sanlly.purchase.models.output.feign.WareWarehouse;
import com.sanlly.purchase.models.output.mattertender.*;
import com.sanlly.purchase.models.output.supplier.PurcSupplierOutput;
import com.sanlly.purchase.service.*;
import com.sanlly.purchase.service.feign.WareFeignClient;
import com.sanlly.purchase.utils.MailUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 
 * @Package com.sanlly.purchase.service.impl 
 * @Description: 招标采购实现类
 * @author jlx   
 * @date 2019年8月19日 下午4:58:43 
 * @version V1.0   
 */
@Service
public class MatterTenderServiceImpl extends BaseServiceImpl implements MatterTenderService {

	// 招标采购
	@Autowired
	private MatterTenderPurchaseMapper matterTenderPurchaseDao;
	// 招标备件
	@Autowired
	private MatterTenderProductMapper matterTenderProductDao;
	// 招标仓库
	@Autowired
	private MatterTenderWarehouseMapper matterTenderWarehouseDao;
	// 邀请供应商
	@Autowired
	private MatterTenderSuppierMapper matterTenderSuppierDao;
	// 招标公告
	@Autowired
	private TenderNoticeMapper tenderNoticeDao;
	@Autowired
	private MatterDemandMapper matterDemandDao;
	@Autowired
	private WareFeignClient wareFeignClient;
	@Autowired
	private SupplierService supplierService;
	@Autowired
	private AuthFigenClient authFigenClient;
	@Autowired
	private PeriodProductService periodProductService;
	@Autowired
	private MatterOrderService purchaseOrderService;

	/**
	 * 招标采购分页列表
	 */
	@Override
	public PagedList<MatterTenderOutput> getMatterTenderPagedList(SearchMatterTenderInput input) {
		// 招标采购
		MatterTenderPurchaseExample example = new MatterTenderPurchaseExample();
		MatterTenderPurchaseExample.Criteria criteria = example.createCriteria();

		// 招标备件
		MatterTenderProductExample mtpexample = new MatterTenderProductExample();
		MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
		// 招标供应商
		MatterTenderSuppierExample mtsexample = new MatterTenderSuppierExample();
		MatterTenderSuppierExample.Criteria mtscriteria = mtsexample.createCriteria();
		// 招标仓库
		MatterTenderWarehouseExample mtwexample = new MatterTenderWarehouseExample();
		MatterTenderWarehouseExample.Criteria mtwcriteria = mtwexample.createCriteria();

		// 招标截止时间
		if (input.getTenderCreateTimeStart() != null && input.getTenderCreateTimeEnd() != null) {
			criteria.andCreateTimeGreaterThanOrEqualTo(input.getTenderCreateTimeStart());
			criteria.andCreateTimeLessThanOrEqualTo(input.getTenderCreateTimeEnd());
		}
		// 采购单位
		if (StringUtils.isNotEmpty(input.getPurchaseCompany())) {
			criteria.andPurchaseCompanyEqualTo(input.getPurchaseCompany());
		}
		// 招标状态
		if (StringUtils.isNotEmpty(input.getTenderStatus())) {
			criteria.andTenderStatusEqualTo(input.getTenderStatus());
		}
		// 招标方式
		if (StringUtils.isNotEmpty(input.getTenderMethod())) {
			criteria.andTenderMethodEqualTo(input.getTenderMethod());
		}
		// 招标项目名称
		if (StringUtils.isNotEmpty(input.getTenderName())) {
			criteria.andTenderNameLike("%" + input.getTenderName() + "%");
		}

		// 是否周期性定价
		criteria.andIsPeriodEqualTo(input.getIsPeriod());
		// 是否日常采购
		criteria.andIsDayPruchaseEqualTo(CommonEnum.NO.getCode());
		// 招标
		criteria.andTenderTypeEqualTo(PurchasingPatternEnum.TENDER.getCode());
		criteria.andIsDelEqualTo(CommonEnum.NO.getCode());
		example.setOrderByClause("create_time desc");
		// 总条数
		Integer totalItemCount = (int) matterTenderPurchaseDao.countByExample(example);
		// 分页查询
		PagedList<MatterTenderOutput> pagedList = new PagedList<MatterTenderOutput>(input.getPageIndex(),
				input.getPageSize(), totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());

		List<MatterTenderPurchase> matterTenderList = matterTenderPurchaseDao.selectByExample(example);
		List<MatterTenderOutput> mtOutputList = new ArrayList<MatterTenderOutput>();
		for (MatterTenderPurchase mtp : matterTenderList) {
			MatterTenderOutput mtOutput = new MatterTenderOutput();
			BeanUtils.copyProperties(mtp, mtOutput);
			mtOutput.setInvoiceLangLang(mtp.getInvoice());
			mtOutput.setIsPeriodLangLang(mtp.getIsPeriod());
			mtOutput.setPurchaseCompanyLangLang(mtp.getPurchaseCompany());
			mtOutput.setSelectSupplierLangLang(mtp.getSelectSupplier());
			mtOutput.setTenderMethodLangLang(mtp.getTenderMethod());
			mtOutput.setTenderStatusLangLang(mtp.getTenderStatus());
			mtOutput.setTenderTypeLangLang(mtp.getTenderType());

			// 需求申请人
			UserInfoOutput rs = authFigenClient.userDetail(mtp.getBuyerId()).getData();
			if (rs != null) {
				mtOutput.setStrBuyer(rs.getUserName());
			}

			// 应邀供应商
			mtsexample.clear();
			mtscriteria = mtsexample.createCriteria();
			mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
			mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.INVITE.getCode());

			List<MatterTenderSuppier> mtsInviteList = matterTenderSuppierDao.selectByExample(mtsexample);
			List<MatterTenderSupplierOutput> inviteSupplierList = new ArrayList<MatterTenderSupplierOutput>();
			// 应邀供应商数据组装
			for (MatterTenderSuppier mtSuppier : mtsInviteList) {
				MatterTenderSupplierOutput mtso = new MatterTenderSupplierOutput();
				mtso.setSupplier(mtSuppier.getSupplier());
				mtso.setSupplierLangLang(mtSuppier.getSupplier());

				// 调用供应商接口取得
				SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
				spsInput.setKey(mtSuppier.getSupplier());
				PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);
				mtso.setGrade(supplierOutput.getGrade());
				mtso.setGradeLangLang(supplierOutput.getGrade());
				mtso.setSettlementCycle(supplierOutput.getSettlementCycle());
				mtso.setSettlementCycleLangLang(supplierOutput.getSettlementCycle());
				inviteSupplierList.add(mtso);
			}
			mtOutput.setTenderInviteSupplierOutputList(inviteSupplierList);
			// 初审供应商
			mtsexample.clear();
			mtscriteria = mtsexample.createCriteria();
			mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
			mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.FIRSTTRIAL.getCode());

			List<MatterTenderSuppier> mtsFirstList = matterTenderSuppierDao.selectByExample(mtsexample);
			List<MatterTenderSupplierOutput> firstSupplierList = new ArrayList<MatterTenderSupplierOutput>();
			// 应邀供应商数据组装
			for (MatterTenderSuppier mtSuppier : mtsFirstList) {
				MatterTenderSupplierOutput mtso = new MatterTenderSupplierOutput();
				mtso.setSupplier(mtSuppier.getSupplier());
				mtso.setSupplierLangLang(mtSuppier.getSupplier());

				// 调用供应商接口取得
				SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
				spsInput.setKey(mtSuppier.getSupplier());
				PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);
				mtso.setGrade(supplierOutput.getGrade());
				mtso.setGradeLangLang(supplierOutput.getGrade());
				mtso.setSettlementCycle(supplierOutput.getSettlementCycle());
				mtso.setSettlementCycleLangLang(supplierOutput.getSettlementCycle());
				firstSupplierList.add(mtso);
			}
			mtOutput.setTenderFirstSupplierOutputList(firstSupplierList);
			// 签到供应商
			mtsexample.clear();
			mtscriteria = mtsexample.createCriteria();
			mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
			mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.SIGN.getCode());

			List<MatterTenderSuppier> mtsSignList = matterTenderSuppierDao.selectByExample(mtsexample);
			List<MatterTenderSupplierOutput> signSupplierList = new ArrayList<MatterTenderSupplierOutput>();
			// 应邀供应商数据组装
			for (MatterTenderSuppier mtSuppier : mtsSignList) {
				MatterTenderSupplierOutput mtso = new MatterTenderSupplierOutput();
				mtso.setSupplier(mtSuppier.getSupplier());
				mtso.setSupplierLangLang(mtSuppier.getSupplier());

				// 调用供应商接口取得
				SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
				spsInput.setKey(mtSuppier.getSupplier());
				PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);
				mtso.setGrade(supplierOutput.getGrade());
				mtso.setGradeLangLang(supplierOutput.getGrade());
				mtso.setSettlementCycle(supplierOutput.getSettlementCycle());
				mtso.setSettlementCycleLangLang(supplierOutput.getSettlementCycle());
				signSupplierList.add(mtso);
			}
			mtOutput.setTenderSignSupplierOutputList(signSupplierList);

			// 招标备件
			mtpexample.clear();
			mtpcriteria = mtpexample.createCriteria();
			mtpcriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());

			List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
			List<MatterTenderProductOutput> productList = new ArrayList<MatterTenderProductOutput>();
			// 采购备件数据组装
			for (MatterTenderProduct mtProduct : mtpList) {
				MatterTenderProductOutput mtpo = new MatterTenderProductOutput();
				BeanUtils.copyProperties(mtProduct, mtpo);
				mtpo.setWarehouseLangLang(mtProduct.getWarehouse());
				SparePartsOutput rsSparePart = wareFeignClient.getSparePart(mtProduct.getProduct()).getData();
				if (rsSparePart != null) {
					mtpo.setSparePartsNo(rsSparePart.getSparePartsNo());
					mtpo.setProductLangLang(rsSparePart.getKey());
					mtpo.setGenaralTypeLangLang(rsSparePart.getSparePartsCategories());
					mtpo.setSecondType(rsSparePart.getSparePartsCategoriesDetails());
					mtpo.setSecondTypeLangLang(rsSparePart.getSparePartsCategoriesDetails());
					mtpo.setProductSpecial(rsSparePart.getSparePartsSpec());
					mtpo.setProductModel(rsSparePart.getModel());
					mtpo.setSparePartsUnitLangLang(rsSparePart.getSparePartsUnit());
					mtpo.setLastPrice(wareFeignClient.getLastEntryPrice(mtProduct.getProduct(), mtProduct.getWarehouse()).getData());
				}
				productList.add(mtpo);
			}
			mtOutput.setTenderProductOutputList(productList);

			// 招标仓库
			mtwexample.clear();
			mtwcriteria = mtwexample.createCriteria();
			mtwcriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());

			List<MatterTenderWarehouse> mtwList = matterTenderWarehouseDao.selectByExample(mtwexample);
			List<MatterTenderWarehouseOutput> warehouseList = new ArrayList<MatterTenderWarehouseOutput>();
			// 采购仓库数据组装
			for (MatterTenderWarehouse mtWarehouse : mtwList) {
				MatterTenderWarehouseOutput mtwo = new MatterTenderWarehouseOutput();
//				Result rsWarehouse = wareFeignClient.getWarehouses(mtWarehouse.getWarehouse());
//
//				if (rsWarehouse != null) {
//					Map<String, Object> map = (Map<String, Object>) rsWarehouse.getData();
//					mtwo.setWarehouseAddress(map.get("warehouseAddr").toString());
//				}
				WareWarehouse warehouse = wareFeignClient.getWarehouseDetail(mtWarehouse.getWarehouse()).getData();

				if (warehouse != null) {
					mtwo.setWarehouseAddress(warehouse.getWarehouseAddr());
				}
				mtwo.setWarehouse(mtWarehouse.getWarehouse());
				mtwo.setWarehouseLangLang(mtWarehouse.getWarehouse());
				warehouseList.add(mtwo);
			}
			mtOutput.setWarehouseOutputList(warehouseList);

			mtOutputList.add(mtOutput);
		}

		// 将分页数据放入结果中
		pagedList.getDataList().addAll(mtOutputList);
		return pagedList;
	}

	/**
	 * 招标发布
	 * @throws Exception 
	 */
	@Transactional
	@Override
	public void addMatterTender(AddMatterTenderInput input) throws Exception {
		List<String> secondSpecials = new ArrayList<>();
		List<String> supplierKeys = new ArrayList<>();
		// 0.判断备件是否已生成招采
		// 采购需求备件
		List<Integer> demandIdList = new ArrayList<Integer>(); 
		for (MatterDemandOutput demand : input.getMatterDemandList()) {
			demandIdList.add(demand.getPurcMatterDemandId());
			// 非周期性定价的招标，需求数量必须大于0
			if(CommonEnum.NO.getCode().equals(input.getIsPeriod())&&(demand.getProductCount()==null || demand.getProductCount()==0)) {
				throw new RuntimeException("ProductCountError");
			}
		}
		MatterDemandExample mdExample = new MatterDemandExample();
		MatterDemandExample.Criteria mdCriteria = mdExample.createCriteria();
		mdCriteria.andPurcMatterDemandIdIn(demandIdList);
		mdCriteria.andIsCreateOrderEqualTo(PurchaseStatusEnum.CREATED.getCode());
		int count = (int)matterDemandDao.countByExample(mdExample);
		if(count>0) {
			throw new RuntimeException("TenderExist");
		}
		
		// 1.插入招标采购表
		MatterTenderPurchase record = new MatterTenderPurchase();
		BeanUtils.copyProperties(input, record);
		record.setIsDayPruchase(CommonEnum.NO.getCode());
		record.setTenderType(PurchasingPatternEnum.TENDER.getCode());
		record.setBuyerId(getCurrentUserId());
		record.setIsDel(CommonEnum.NO.getCode());
		record.setCreateTime(new Date());
		record.setCreateUser(getCurrentUserId());
		if (input.getFirstInstanceTime()==null) {
			record.setIsFirstTrial(CommonEnum.NO.getCode());
		}else {
			record.setIsFirstTrial(CommonEnum.YES.getCode());
		}
		record.setTenderStatus(TenderStatusEnum.ING.getCode());
		matterTenderPurchaseDao.insertSelective(record);
		if(CommonEnum.YES.getCode().equals(input.getIsPeriod())) {
			// 2.插入仓库表
			for (MultiSelectInput warehouse : input.getWarehouseInputs()) {
				MatterTenderWarehouse whRecord = new MatterTenderWarehouse();
				whRecord.setTenderPurchaseId(record.getPurcMatterTenderPurchaseId());
				whRecord.setWarehouse(warehouse.getValue());
				whRecord.setCreateTime(new Date());
				whRecord.setCreateUser(getCurrentUserId());
				matterTenderWarehouseDao.insertSelective(whRecord);
			}
		}

		// 3.插入招标备件表
//		BigDecimal sum = new BigDecimal("0");
//		List<MatterTenderProduct> productList = new ArrayList<MatterTenderProduct>();
		for (MatterDemandOutput demand : input.getMatterDemandList()) {

			MatterTenderProduct pRecord = new MatterTenderProduct();
			BeanUtils.copyProperties(demand, pRecord);
			// 取得备件参考价格
			SparePartsOutput rsSparePart = wareFeignClient.getSparePart(demand.getProduct()).getData();
			if (rsSparePart != null) {
				pRecord.setLastPrice(wareFeignClient.getLastEntryPrice(demand.getProduct(), demand.getWarehouse()).getData());
				pRecord.setPurchasingReferencePrice(rsSparePart.getPurchasingReferencePrice() == null ? new BigDecimal("0")
						: rsSparePart.getPurchasingReferencePrice());
//				sum = sum.add(pRecord.getPurchasingReferencePrice());
				secondSpecials.add(rsSparePart.getSparePartsCategoriesDetails());
			}
			pRecord.setWeight(demand.getWeight());
			pRecord.setTenderPurchaseId(record.getPurcMatterTenderPurchaseId());
			pRecord.setDeliveryTime(demand.getRequireArriveTime());
			pRecord.setCreateTime(new Date());
			pRecord.setCreateUser(getCurrentUserId());
			 matterTenderProductDao.insertSelective(pRecord);
		}

		// 4.插入邀请供应商表
		if (TenderMethodEnum.INVITE.getCode().equals(input.getTenderMethod())) {
			for (String supplier : input.getPurcSupplierIds()) {
				MatterTenderSuppier sRecord = new MatterTenderSuppier();
				sRecord.setTenderPurchaseId(record.getPurcMatterTenderPurchaseId());
				sRecord.setSupplier(supplier);
				sRecord.setType(PurchaseSupplierTypeEnum.INVITE.getCode());
				sRecord.setCreateTime(new Date());
				sRecord.setCreateUser(getCurrentUserId());
				matterTenderSuppierDao.insertSelective(sRecord);
				supplierKeys.add(supplier);
			}
		}else {
			List<PurcSupplierOutput> suppliers = supplierService.getSupplierBySecondSpecial(secondSpecials.toArray(new String[secondSpecials.size()]), "", "");
			for(PurcSupplierOutput supplier: suppliers) {
				MatterTenderSuppier sRecord = new MatterTenderSuppier();
				sRecord.setTenderPurchaseId(record.getPurcMatterTenderPurchaseId());
				sRecord.setSupplier(supplier.getKey());
//				sRecord.setType(PurchaseSupplierTypeEnum.INVITE.getCode());
				sRecord.setCreateTime(new Date());
				sRecord.setCreateUser(getCurrentUserId());
				matterTenderSuppierDao.insertSelective(sRecord);
				supplierKeys.add(supplier.getKey());
			}
		}
		sendMail(secondSpecials.toArray(
				new String[secondSpecials.size()]), 
				supplierKeys.toArray(new String[supplierKeys.size()]),
//				input.getTenderContent(),
				"鑫三利集采平台发布招标采购，请登录查看。",
				input.getTenderName()
				);
		// 5.插入招标公告表
		TenderNotice tenderNotice = new TenderNotice();
		tenderNotice.setTenderPurchaseId(record.getPurcMatterTenderPurchaseId());
		tenderNotice.setNoticeType(NoticeTypeEnum.PUBLISH.getCode());
		tenderNotice.setCreateTime(new Date());
		tenderNotice.setCreateUser(getCurrentUserId());
		tenderNoticeDao.insert(tenderNotice);
		
		// 6.更新需求表
		for (MatterDemandOutput mdOutput : input.getMatterDemandList()) {
			MatterDemand md = new MatterDemand();
			md.setPurcMatterDemandId(mdOutput.getPurcMatterDemandId());
			md.setIsCreateOrder(PurchaseStatusEnum.CREATED.getCode());
			md.setTenderType(PurchasingPatternEnum.TENDER.getCode());
			md.setUpdateTime(new Date());
			md.setUpdateUser(getCurrentUserId());
			matterDemandDao.updateByPrimaryKeySelective(md);
		}
		
	}

	/**
	 * 初审结果录入
	 */
	@Transactional
	@Override
	public void addFirstTrial(Integer purcMatterTenderPurchaseId, String[] supplierInputs) throws Exception {

		List<String> secondSpecials = new ArrayList<>();
		List<String> supplierKeys = new ArrayList<>();
		// 初审时间check
		// 招标采购
		MatterTenderPurchaseExample example = new MatterTenderPurchaseExample();
		MatterTenderPurchaseExample.Criteria criteria = example.createCriteria();
		criteria.andPurcMatterTenderPurchaseIdEqualTo(purcMatterTenderPurchaseId);
		MatterTenderPurchase purchase = matterTenderPurchaseDao.selectByPrimaryKey(purcMatterTenderPurchaseId);
		if(purchase.getFirstInstanceTime().compareTo(new Date())>0) {
			throw new RuntimeException("FirstTrialTimeGreaterThanNow");
		}
		
		MatterTenderSuppierExample mtsexample = new MatterTenderSuppierExample();
		MatterTenderSuppierExample.Criteria mtscriteria = mtsexample.createCriteria();
		
		// 初审供应商
		mtsexample.clear();
		mtscriteria = mtsexample.createCriteria();
		mtscriteria.andTenderPurchaseIdEqualTo(purcMatterTenderPurchaseId);
		mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.FIRSTTRIAL.getCode());

		List<MatterTenderSuppier> mtsFirstList = matterTenderSuppierDao.selectByExample(mtsexample);
		if(mtsFirstList.size()>0) {
			throw new RuntimeException("FirstTrialExist");
		}
		for (String supplier : supplierInputs) {
			MatterTenderSuppier sRecord = new MatterTenderSuppier();
			sRecord.setTenderPurchaseId(purcMatterTenderPurchaseId);
			sRecord.setSupplier(supplier);
			sRecord.setType(PurchaseSupplierTypeEnum.FIRSTTRIAL.getCode());
			sRecord.setCreateTime(new Date());
			sRecord.setCreateUser(getCurrentUserId());
			matterTenderSuppierDao.insertSelective(sRecord);
			supplierKeys.add(supplier);
		}
		

		sendMail(secondSpecials.toArray(
				new String[secondSpecials.size()]), 
				supplierKeys.toArray(new String[supplierKeys.size()]),
//				purchase.getTenderContent(),
				"鑫三利集采平台招标采购初审完成，请登录查看。",
				purchase.getTenderName() + "初审完成"
				);

		// 插入招标公告表
		TenderNotice tenderNotice = new TenderNotice();
		tenderNotice.setTenderPurchaseId(purcMatterTenderPurchaseId);
		tenderNotice.setNoticeType(NoticeTypeEnum.FIRSTTRIAL.getCode());
		tenderNotice.setCreateTime(new Date());
		tenderNotice.setCreateUser(getCurrentUserId());
		tenderNoticeDao.insert(tenderNotice);
	}

	/**
	 * 招标结果录入
	 */
	@Transactional
	@Override
	public void addTenderResult(AddMatterTenderResultInput input) {
		

		// 招标备件
//		MatterTenderProductExample mtpexample = new MatterTenderProductExample();
//		MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
		// 招标仓库
		MatterTenderWarehouseExample mtwexample = new MatterTenderWarehouseExample();
		MatterTenderWarehouseExample.Criteria mtwcriteria = mtwexample.createCriteria();
		// 采购需求
		MatterDemandExample mdexample = new MatterDemandExample();

		MatterTenderPurchase matterTenderPurchase = matterTenderPurchaseDao
				.selectByPrimaryKey(input.getPurcMatterTenderPurchaseId());
		// 判断招标截止时间是否大于当前时间
		if(matterTenderPurchase.getTenderEndTime().compareTo(new Date())>=0){
			throw new RuntimeException("TenderEndTimeGreaterNow");
		}
		// 判断招标结果是否已经录入
		if(!TenderStatusEnum.ING.getCode().equals(matterTenderPurchase.getTenderStatus())) {
			throw new RuntimeException("TenderResultExist");
		}
		
		// 1.更新招标采购表
		MatterTenderPurchase record = new MatterTenderPurchase();
		record.setInvoice(input.getInvoiceType());
		record.setPurcMatterTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
		record.setSelectSupplier(input.getSupplier());
		record.setTenderStatus(input.getTenderStatus());
		record.setReason(input.getReason());
		matterTenderPurchaseDao.updateByPrimaryKeySelective(record);
		if(TenderStatusEnum.SUCCESS.getCode().equals(input.getTenderStatus())) {
			// 更新招标备件价格
			for (MatterTenderProductOutput product : input.getTenderProductOutputList()) {
				MatterTenderProduct productRecord = new MatterTenderProduct();
				productRecord.setPurcMatterTenderProductId(product.getPurcMatterTenderProductId());
				productRecord.setPrice(product.getPrice());
				matterTenderProductDao.updateByPrimaryKeySelective(productRecord);
			}
			if (CommonEnum.YES.getCode().equals(matterTenderPurchase.getIsPeriod())) {
				// 2.插入周期性定价表
				// 取得招标备件
				// mtpcriteria.andTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId());
				// List<MatterTenderProduct> mtpList =
				// matterTenderProductDao.selectByExample(mtpexample);
				// 取得招标仓库
				mtwcriteria.andTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId());
				List<MatterTenderWarehouse> mtwList = matterTenderWarehouseDao.selectByExample(mtwexample);
				for (MatterTenderProductOutput product : input.getTenderProductOutputList()) {
					for (MatterTenderWarehouse warehouse : mtwList) {
		
						AddPeriodProductInput periodInput = new AddPeriodProductInput();
						periodInput.setProductPrice(product.getPrice());
						periodInput.setDemandNo(product.getDemandNo());
						periodInput.setTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
						periodInput.setProduct(product.getProduct());
						periodInput.setPurchaseCompany(matterTenderPurchase.getPurchaseCompany());
						periodInput.setWarehouse(warehouse.getWarehouse());
						periodInput.setProductPrice(product.getPrice());
						periodInput.setInvoice(input.getInvoiceType());
						periodInput.setSupplier(input.getSupplier());
						periodInput.setTenderType(PurchasingPatternEnum.TENDER.getCode());
						periodInput.setEndTime(matterTenderPurchase.getSupplyEndTime());
						periodInput.setProductNum(product.getSparePartsNo());
						periodInput.setProductUnit(product.getSparePartsUnit());
						periodInput.setComments(product.getComments());
						periodProductService.addPeriodProduct(periodInput);
					}
				}
		
				// 插入招标公告表
				TenderNotice tenderNotice = new TenderNotice();
				tenderNotice.setTenderPurchaseId(input.getPurcMatterTenderPurchaseId());
				tenderNotice.setNoticeType(NoticeTypeEnum.RESULT.getCode());
				tenderNotice.setCreateTime(new Date());
				tenderNotice.setCreateUser(getCurrentUserId());
				tenderNoticeDao.insert(tenderNotice);
		
			}else {
				// 生成订单 
				
				
				MatterTenderPurchase purchase = matterTenderPurchaseDao
						.selectByPrimaryKey(input.getPurcMatterTenderPurchaseId());
				createOrder(purchase);
			}

		}else {
			// 更新需求的采购状态

			MatterTenderProductExample mtpexample = new MatterTenderProductExample();
			MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
			mtpcriteria.andTenderPurchaseIdEqualTo(input.getPurcMatterTenderPurchaseId());
			List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
			for(MatterTenderProduct product:mtpList) {
				mdexample.clear();
				MatterDemandExample.Criteria mdCriteria = mdexample.createCriteria();
				mdCriteria.andDemandNoEqualTo(product.getDemandNo());
				MatterDemand md = new MatterDemand();
				// 将采购需求状态改回未采购
				md.setIsCreateOrder(PurchaseStatusEnum.UNCREATED.getCode());
				matterDemandDao.updateByExampleSelective(md, mdexample);
			}
		}
	}

	/**
	 * 招标详情
	 */
	@Override
	public MatterTenderOutput gettMatterTenderDetail(Integer purcMatterTenderPurchaseId) {

		// 招标采购
		MatterTenderPurchaseExample example = new MatterTenderPurchaseExample();
		MatterTenderPurchaseExample.Criteria criteria = example.createCriteria();

		// 招标备件
		MatterTenderProductExample mtpexample = new MatterTenderProductExample();
		MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();
		// 招标供应商
		MatterTenderSuppierExample mtsexample = new MatterTenderSuppierExample();
		MatterTenderSuppierExample.Criteria mtscriteria = mtsexample.createCriteria();
		// 招标仓库
		MatterTenderWarehouseExample mtwexample = new MatterTenderWarehouseExample();
		MatterTenderWarehouseExample.Criteria mtwcriteria = mtwexample.createCriteria();

		MatterTenderPurchase mtp = matterTenderPurchaseDao.selectByPrimaryKey(purcMatterTenderPurchaseId);
		MatterTenderOutput mtOutput = new MatterTenderOutput();
		BeanUtils.copyProperties(mtp, mtOutput);
		mtOutput.setInvoiceLangLang(mtp.getInvoice());
		mtOutput.setIsPeriodLangLang(mtp.getIsPeriod());
		mtOutput.setPurchaseCompanyLangLang(mtp.getPurchaseCompany());
		mtOutput.setSelectSupplierLangLang(mtp.getSelectSupplier());
		mtOutput.setTenderMethodLangLang(mtp.getTenderMethod());
		mtOutput.setTenderStatusLangLang(mtp.getTenderStatus());
		mtOutput.setTenderTypeLangLang(mtp.getTenderType());

		// 需求申请人
		UserInfoOutput rs = authFigenClient.userDetail(mtp.getBuyerId()).getData();
		if (rs != null) {
			mtOutput.setStrBuyer(rs.getUserName());
		}

		// 应邀供应商
		mtsexample.clear();
		mtscriteria = mtsexample.createCriteria();
		mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
		mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.INVITE.getCode());

		List<MatterTenderSuppier> mtsInviteList = matterTenderSuppierDao.selectByExample(mtsexample);
		List<MatterTenderSupplierOutput> inviteSupplierList = new ArrayList<MatterTenderSupplierOutput>();
		// 应邀供应商数据组装
		for (MatterTenderSuppier mtSuppier : mtsInviteList) {
			MatterTenderSupplierOutput mtso = new MatterTenderSupplierOutput();
			mtso.setSupplier(mtSuppier.getSupplier());
			mtso.setSupplierLangLang(mtSuppier.getSupplier());

			// 调用供应商接口取得
			SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
			spsInput.setKey(mtSuppier.getSupplier());
			PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);
			mtso.setGrade(supplierOutput.getGrade());
			mtso.setGradeLangLang(supplierOutput.getGrade());
			mtso.setSettlementCycle(supplierOutput.getSettlementCycle());
			mtso.setSettlementCycleLangLang(supplierOutput.getSettlementCycle());
			inviteSupplierList.add(mtso);
		}
		mtOutput.setTenderInviteSupplierOutputList(inviteSupplierList);
		// 初审供应商
		mtsexample.clear();
		mtscriteria = mtsexample.createCriteria();
		mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
		mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.FIRSTTRIAL.getCode());

		List<MatterTenderSuppier> mtsFirstList = matterTenderSuppierDao.selectByExample(mtsexample);
		List<MatterTenderSupplierOutput> firstSupplierList = new ArrayList<MatterTenderSupplierOutput>();
		// 应邀供应商数据组装
		for (MatterTenderSuppier mtSuppier : mtsFirstList) {
			MatterTenderSupplierOutput mtso = new MatterTenderSupplierOutput();
			mtso.setSupplier(mtSuppier.getSupplier());
			mtso.setSupplierLangLang(mtSuppier.getSupplier());

			// 调用供应商接口取得
			SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
			spsInput.setKey(mtSuppier.getSupplier());
			PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);
			mtso.setGrade(supplierOutput.getGrade());
			mtso.setGradeLangLang(supplierOutput.getGrade());
			mtso.setSettlementCycle(supplierOutput.getSettlementCycle());
			mtso.setSettlementCycleLangLang(supplierOutput.getSettlementCycle());
			firstSupplierList.add(mtso);
		}
		mtOutput.setTenderFirstSupplierOutputList(firstSupplierList);
		// 签到供应商
		mtsexample.clear();
		mtscriteria = mtsexample.createCriteria();
		mtscriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());
		mtscriteria.andTypeEqualTo(PurchaseSupplierTypeEnum.SIGN.getCode());

		List<MatterTenderSuppier> mtsSignList = matterTenderSuppierDao.selectByExample(mtsexample);
		List<MatterTenderSupplierOutput> signSupplierList = new ArrayList<MatterTenderSupplierOutput>();
		// 应邀供应商数据组装
		for (MatterTenderSuppier mtSuppier : mtsSignList) {
			MatterTenderSupplierOutput mtso = new MatterTenderSupplierOutput();
			mtso.setSupplier(mtSuppier.getSupplier());
			mtso.setSupplierLangLang(mtSuppier.getSupplier());

			// 调用供应商接口取得
			SearchPurcSupplierInput spsInput = new SearchPurcSupplierInput(0, 0);
			spsInput.setKey(mtSuppier.getSupplier());
			PurcSupplierOutput supplierOutput = supplierService.getSupplierByKey(spsInput);
			mtso.setGrade(supplierOutput.getGrade());
			mtso.setGradeLangLang(supplierOutput.getGrade());
			mtso.setSettlementCycle(supplierOutput.getSettlementCycle());
			mtso.setSettlementCycleLangLang(supplierOutput.getSettlementCycle());
			signSupplierList.add(mtso);
		}
		mtOutput.setTenderSignSupplierOutputList(signSupplierList);

		// 招标备件
		mtpexample.clear();
		mtpcriteria = mtpexample.createCriteria();
		mtpcriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());

		List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
		List<MatterTenderProductOutput> productList = new ArrayList<MatterTenderProductOutput>();
		// 采购备件数据组装
		for (MatterTenderProduct mtProduct : mtpList) {
			MatterTenderProductOutput mtpo = new MatterTenderProductOutput();
			BeanUtils.copyProperties(mtProduct, mtpo);
			SparePartsOutput rsSparePart = wareFeignClient.getSparePart(mtProduct.getProduct()).getData();

			if (rsSparePart != null) {
				mtpo.setSparePartsNo(rsSparePart.getSparePartsNo());
				mtpo.setProductLangLang(rsSparePart.getKey());
				mtpo.setGenaralTypeLangLang(rsSparePart.getSparePartsCategories());
				mtpo.setSecondType(rsSparePart.getSparePartsCategoriesDetails());
				mtpo.setSecondTypeLangLang(rsSparePart.getSparePartsCategoriesDetails());
				mtpo.setProductSpecial(rsSparePart.getSparePartsSpec());
				mtpo.setProductModel(rsSparePart.getModel());
				mtpo.setSparePartsUnitLangLang(rsSparePart.getSparePartsUnit());
				mtpo.setLastPrice(wareFeignClient.getLastEntryPrice(mtProduct.getProduct(), mtProduct.getWarehouse()).getData());
			}
			productList.add(mtpo);
		}
		mtOutput.setTenderProductOutputList(productList);

		// 招标仓库
		mtwexample.clear();
		mtwcriteria = mtwexample.createCriteria();
		mtwcriteria.andTenderPurchaseIdEqualTo(mtp.getPurcMatterTenderPurchaseId());

		List<MatterTenderWarehouse> mtwList = matterTenderWarehouseDao.selectByExample(mtwexample);
		List<MatterTenderWarehouseOutput> warehouseList = new ArrayList<MatterTenderWarehouseOutput>();
		// 采购仓库数据组装
		for (MatterTenderWarehouse mtWarehouse : mtwList) {
			MatterTenderWarehouseOutput mtwo = new MatterTenderWarehouseOutput();
//			Result rsWarehouse = wareFeignClient.getWarehouses(mtWarehouse.getWarehouse());
//
//			if (rsWarehouse != null) {
//				Map<String, Object> map = (Map<String, Object>) rsWarehouse.getData();
//				mtwo.setWarehouseAddress(map.get("warehouseAddr").toString());
//			}
			WareWarehouse warehouse = wareFeignClient.getWarehouseDetail(mtWarehouse.getWarehouse()).getData();

			if (warehouse != null) {
				mtwo.setWarehouseAddress(warehouse.getWarehouseAddr());
			}
			mtwo.setWarehouse(mtWarehouse.getWarehouse());
			mtwo.setWarehouseLangLang(mtWarehouse.getWarehouse());
			warehouseList.add(mtwo);
		}
		mtOutput.setWarehouseOutputList(warehouseList);

		return mtOutput;
	}

	/**
	 * 公告列表
	 */
	@Override
	public List<TenderNoticeOutput> getTenderNoticeList() {
		// 招标采购
//		MatterTenderPurchaseExample example = new MatterTenderPurchaseExample();
		// 招标公告
		TenderNoticeExample tnExample = new TenderNoticeExample();
		tnExample.setOrderByClause("create_time desc");
		
		List<TenderNotice> noticeList = tenderNoticeDao.selectByExample(tnExample);

		List<TenderNoticeOutput> noticeOutputList = new ArrayList<TenderNoticeOutput>();
		for (TenderNotice notice : noticeList) {
			TenderNoticeOutput noticeOutput = new TenderNoticeOutput();
			BeanUtils.copyProperties(notice, noticeOutput);
			MatterTenderPurchase tenderPurchase = matterTenderPurchaseDao.selectByPrimaryKey(notice.getTenderPurchaseId());
			noticeOutput.setNoticeType(notice.getNoticeType());
			noticeOutput.setNoticeTypeLangLang(notice.getNoticeType());
			noticeOutput.setTenderName(tenderPurchase.getTenderName());
			noticeOutput.setTenderId(tenderPurchase.getTenderId());
			noticeOutput.setTenderType(tenderPurchase.getTenderType());
			noticeOutput.setTenderTypeLangLang(tenderPurchase.getTenderType());
			noticeOutput.setPurchaseCompany(tenderPurchase.getPurchaseCompany());
			noticeOutput.setPurchaseCompanyLangLang(tenderPurchase.getPurchaseCompany());
			noticeOutput.setCreateTime(tenderPurchase.getCreateTime());
			noticeOutput.setFirstInstanceTime(tenderPurchase.getFirstInstanceTime());
			noticeOutput.setTenderEndTime(tenderPurchase.getTenderEndTime());
			noticeOutput.setTenderStatus(tenderPurchase.getTenderStatus());
			noticeOutput.setTenderStatusLangLang(tenderPurchase.getTenderStatus());
			noticeOutput.setSelectSupplier(tenderPurchase.getSelectSupplier());
			noticeOutput.setSelectSupplierLangLang(tenderPurchase.getSelectSupplier());
			noticeOutput.setIsDayPruchase(tenderPurchase.getIsDayPruchase());
			noticeOutputList.add(noticeOutput);
		}

		return noticeOutputList;
	}

	/**
	 * 招标备件列表 
	 */
	@Override
	public List<MatterTenderProductOutput> gettMatterTenderProductList(Integer purcMatterTenderPurchaseId) {

		// 招标备件
		MatterTenderProductExample mtpexample = new MatterTenderProductExample();
		MatterTenderProductExample.Criteria mtpcriteria = mtpexample.createCriteria();		

		// 招标备件
		mtpexample.clear();
		mtpcriteria = mtpexample.createCriteria();
		mtpcriteria.andTenderPurchaseIdEqualTo(purcMatterTenderPurchaseId);

		List<MatterTenderProduct> mtpList = matterTenderProductDao.selectByExample(mtpexample);
		List<MatterTenderProductOutput> productList = new ArrayList<MatterTenderProductOutput>();
		// 采购备件数据组装
		for (MatterTenderProduct mtProduct : mtpList) {
			MatterTenderProductOutput mtpo = new MatterTenderProductOutput();
			BeanUtils.copyProperties(mtProduct, mtpo);
			SparePartsOutput rsSparePart = wareFeignClient.getSparePart(mtProduct.getProduct()).getData();

			if (rsSparePart != null) {
				mtpo.setSparePartsNo(rsSparePart.getSparePartsNo());
				mtpo.setProductLangLang(rsSparePart.getKey());
				mtpo.setGenaralTypeLangLang(rsSparePart.getSparePartsCategories());
				mtpo.setSecondType(rsSparePart.getSparePartsCategoriesDetails());
				mtpo.setSecondTypeLangLang(rsSparePart.getSparePartsCategoriesDetails());
				mtpo.setProductSpecial(rsSparePart.getSparePartsSpec());
				mtpo.setProductModel(rsSparePart.getModel());
				mtpo.setSparePartsUnitLangLang(rsSparePart.getSparePartsUnit());
				mtpo.setLastPrice(rsSparePart.getLastEntryPrice());
				if(mtProduct.getPrice()==null) {
					mtpo.setPrice(new BigDecimal("0"));
				}
			}
			productList.add(mtpo);
		}

		return productList;
	}

	/**
	 * 采购单审核通过生成订单
	 * @param purcMatterTemporaryPurchaseId
	 * @return
	 */
	private void createOrder(MatterTenderPurchase matterTenderPurchase) {
		// 调用订单接口向订单表插入数据	
		MatterTenderProductExample example = new MatterTenderProductExample();
		MatterTenderProductExample.Criteria criteria = example.createCriteria();
		criteria.andTenderPurchaseIdEqualTo(matterTenderPurchase.getPurcMatterTenderPurchaseId());
		List<MatterTenderProduct> products = matterTenderProductDao.selectByExample(example);
		List<MatterTenderProduct> wareHouses = products.stream().collect(
	            Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(MatterTenderProduct::getWarehouse))), ArrayList::new));
		for(MatterTenderProduct wareHouse:wareHouses) {
			// 组装采购订单
			AddPurchaseOrderInput input = new AddPurchaseOrderInput();
			input.setPurchaseCompany(matterTenderPurchase.getPurchaseCompany());
			input.setPurchaseWare(wareHouse.getWarehouse());
			input.setPurchaseType(matterTenderPurchase.getTenderType());
			input.setPurchaseUserId(matterTenderPurchase.getCreateUser());
			input.setSupplier(matterTenderPurchase.getSelectSupplier());
			input.setPurchaseTime(matterTenderPurchase.getCreateTime());
			input.setInvoice(matterTenderPurchase.getInvoice());
			// 组装采购商品详情数据
			List<AddPurchaseOrderDetailInput> details = new ArrayList<>();
			for(MatterTenderProduct product:products) {
				if(wareHouse.getWarehouse().equals(product.getWarehouse())) {
					AddPurchaseOrderDetailInput  detail = new AddPurchaseOrderDetailInput();
					detail.setDemandNo(product.getDemandNo());
					detail.setProduct(product.getProduct());
					detail.setOrderNum(product.getProductCount());
					detail.setUnitPrice(product.getPrice());
					detail.setComments(product.getComments());
					detail.setRequiredDeliveryDate(product.getDeliveryTime());
					details.add(detail);
				}
				
			}
			input.setDetails(details);
			purchaseOrderService.addPurchaseOrder(input);
		}
	}
	
	/**
	 * 
	* @Description: 为招标相关供应商发送邮件 
	* @param secondSpecials 
	* @param supplierKeys void
	 * @throws Exception 
	* @throws 
	 */
	@Override
	public void sendMail(String[] secondSpecials,String[] supplierKeys,String text,String subject) {
		try {			
			// 邀请供应商
			if (supplierKeys.length != 0) {
				for (String key : supplierKeys) {
					SearchPurcSupplierInput input = new SearchPurcSupplierInput();
					input.setKey(key);
					PurcSupplierOutput supplier = supplierService.getSupplierByKey(input);
					if (supplier.getContactInformations().size() > 0
							&& StringUtils.isNotEmpty(supplier.getContactInformations().get(0).getEmailAddress())) {
						MailUtil.sendMail(supplier.getContactInformations().get(0).getEmailAddress(), text==null?"":text, subject==null?"":subject);
					}
				}

			} else {
				// 公开招标方式，根据招标备件明细取得供应供应商
				List<PurcSupplierOutput> suppliers = supplierService.getSupplierBySecondSpecial(secondSpecials, "", "");
				for (PurcSupplierOutput supplier : suppliers) {
					if (supplier.getContactInformations().size() > 0
							&& StringUtils.isNotEmpty(supplier.getContactInformations().get(0).getEmailAddress())) {
						MailUtil.sendMail(supplier.getContactInformations().get(0).getEmailAddress(), text==null?"":text, subject==null?"":subject);
					}
				}
			}
		} catch (Exception e) {
			if(e.getMessage()!=null&&"NoSupplier".equals(e.getMessage().toString())) {
				throw new RuntimeException("NoSupplier");
			}
//			throw new RuntimeException("sendMailFail");
		}
	}

}
