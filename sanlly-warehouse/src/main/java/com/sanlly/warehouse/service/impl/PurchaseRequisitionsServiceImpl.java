package com.sanlly.warehouse.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.dao.WarePurchaseRequisitionsMapper;
import com.sanlly.warehouse.dao.WareSafeStockMapper;
import com.sanlly.warehouse.dao.WareStockMapper;
import com.sanlly.warehouse.dao.WareStockinDetailMapper;
import com.sanlly.warehouse.dao.WareStockinMapper;
import com.sanlly.warehouse.entity.WarePurchaseRequisitions;
import com.sanlly.warehouse.entity.WarePurchaseRequisitionsExample;
import com.sanlly.warehouse.entity.WareSafeStock;
import com.sanlly.warehouse.entity.WareSafeStockExample;
import com.sanlly.warehouse.entity.WareStock;
import com.sanlly.warehouse.entity.WareStockExample;
import com.sanlly.warehouse.entity.WareStockinDetail;
import com.sanlly.warehouse.entity.WareStockinDetailExample;
import com.sanlly.warehouse.entity.WareStockinExample;
import com.sanlly.warehouse.entity.WareWarehouse;
import com.sanlly.warehouse.enums.PurchaseFromTypeEnum;
import com.sanlly.warehouse.models.input.purchase.AddMatterDemandInput;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.spareparts.SearchSparePartsInput;
import com.sanlly.warehouse.models.input.wareearlywarning.AddAutoPurchaseRequisitionsInput;
import com.sanlly.warehouse.models.input.wareearlywarning.AddManualPurchaseRequisitionsInput;
import com.sanlly.warehouse.models.input.wareearlywarning.AddManualRequisitionsSpartsInput;
import com.sanlly.warehouse.models.input.wareearlywarning.AddManualRequisitionsWareInput;
import com.sanlly.warehouse.models.input.wareearlywarning.EditPurchaseRequisitionsInput;
import com.sanlly.warehouse.models.input.wareearlywarning.SearchPurchaseRequisitionsInput;
import com.sanlly.warehouse.models.input.warehouse.EditWarehouseInput;
import com.sanlly.warehouse.models.output.purchaserequisitions.WarePurchaseRequisitionsListOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsBriefOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.models.output.warehouse.WarehouseByCompanyOutput;
import com.sanlly.warehouse.service.BillTypeService;
import com.sanlly.warehouse.service.PurchaseRequisitionsService;
import com.sanlly.warehouse.service.WareSparePartsService;
import com.sanlly.warehouse.service.WarehouseService;
import com.sanlly.warehouse.service.feign.PurchaseFeignClient;

@Service
public class PurchaseRequisitionsServiceImpl extends BaseServiceImpl implements PurchaseRequisitionsService {

	@Autowired
	private WarePurchaseRequisitionsMapper warePurchaseRequisitionsDao;
	@Autowired
	private WareStockinDetailMapper wareStockinDetailDao;
	@Autowired
	private WareStockMapper wareStockDao;
	@Autowired
	private WareSafeStockMapper wareSafeStockDao;
	@Autowired
	private WareSparePartsService wareSparePartsService;
	@Autowired
	private WarehouseService warehouseService;
	@Autowired
	private BillTypeService billTypeService;

	@Autowired
	private PurchaseFeignClient purchaseFeignClient;

	/**
	 * 采购需求列表
	 * 
	 * @throws ParseException
	 */
	@Override
	public PagedList<WarePurchaseRequisitionsListOutput> getPageListPurchaseRequisitions(
			SearchPurchaseRequisitionsInput input) throws ParseException {
		WarePurchaseRequisitionsExample example = new WarePurchaseRequisitionsExample();
		WarePurchaseRequisitionsExample.Criteria criteria = example.createCriteria();

		// 查询条件
		if (StringUtils.isNotEmpty(input.getPurchaseRequisitionsNo())) {
			// 需求单号
			criteria.andPurchaseRequisitionsNoLike("%" + input.getPurchaseRequisitionsNo() + "%");
		}
		if (StringUtils.isNotEmpty(input.getSpareParts())) {
			// 备件key
			criteria.andSparePartsEqualTo(input.getSpareParts());
		}
		if (StringUtils.isNotEmpty(input.getWarehouse())) {
			// 仓库key
			criteria.andWarehouseEqualTo(input.getWarehouse());
		}
		// 登录人不是总部权限时，查看登录人所在分公司下的所有仓库
		// if (!isHeadCompanyLogin()) {
		EditWarehouseInput whInput = new EditWarehouseInput();
		// 登录人所在公司key
		whInput.setCompany(getCurrentCompanyKey());
		List<WarehouseByCompanyOutput> wbcoList = warehouseService.getWarehouseListByCompany(whInput);
		List<String> values = new ArrayList<String>();
		for (WarehouseByCompanyOutput wbco : wbcoList) {
			values.add(wbco.getKey());
		}
		if (values.size() > 0) {
			criteria.andWarehouseIn(values);
		}
		// }
		if (StringUtils.isNotEmpty(input.getSparePartsCategories())||StringUtils.isNotEmpty(input.getSparePartsName())) {
			SearchSparePartsInput searchSparePartsInput = new SearchSparePartsInput();
			searchSparePartsInput.setSparePartsCategories(input.getSparePartsCategories());
			searchSparePartsInput.setSparePartsName(input.getSparePartsName());
			List<SparePartsBriefOutput> spareParts = wareSparePartsService.sparePartsBriefList(searchSparePartsInput);
			List<String> keys = spareParts.stream().map(SparePartsBriefOutput::getKey).collect(Collectors.toList());
			criteria.andSparePartsIn(keys);
		}

		// 审核状态
		criteria.andAuditStatusEqualTo(input.getAuditStatus());
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		example.setOrderByClause("create_time desc");
		// 总条数
		Integer totalItemCount = (int) warePurchaseRequisitionsDao.countByExample(example);
		// 分页查询
		PagedList<WarePurchaseRequisitionsListOutput> pagedList = new PagedList<WarePurchaseRequisitionsListOutput>(
				input.getPageIndex(), input.getPageSize(), totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<WarePurchaseRequisitions> purchaseRequisitionsList = warePurchaseRequisitionsDao.selectByExample(example);
		List<WarePurchaseRequisitionsListOutput> wprOutputList = new ArrayList<WarePurchaseRequisitionsListOutput>();
		for (WarePurchaseRequisitions wpr : purchaseRequisitionsList) {

			WarePurchaseRequisitionsListOutput wprOutput = getPurchaseRequisitionsOutput(wpr.getSpareParts(),
					wpr.getWarehouse());
			BeanUtils.copyProperties(wpr, wprOutput);
			wprOutput.setRequireArriveTime(wpr.getRequireArriveTime());
			wprOutput.setAuditStatusLangLang(wpr.getAuditStatus());
			wprOutput.setRequisitionsTypeLangLang(wpr.getType());
			wprOutput.setPurchasingPatternLangLang(wpr.getPurchasingPattern());

			// 备件大类、备件号取得
			EditSparePartsInput sparePartsInput = new EditSparePartsInput();
			sparePartsInput.setKey(wpr.getSpareParts());
			SparePartsBriefOutput sparePartsBriefOutput = wareSparePartsService.getSparePartsBrief(sparePartsInput);
			wprOutput.setSparePartsCategoriesLangLang(sparePartsBriefOutput.getSparePartsCategories());
			wprOutput.setSparePartsCategoriesDetailsLangLang(sparePartsBriefOutput.getSparePartsCategoriesDetails());

			wprOutput.setSparePartsNo(sparePartsBriefOutput.getSparePartsNo());
			wprOutput.setWarehouseTypeLangLang(sparePartsBriefOutput.getDefaultWarehouseType());
			wprOutput.setSparePartsLangLang(wpr.getSpareParts());
			wprOutput.setWarehouseLangLang(wpr.getWarehouse());
			wprOutputList.add(wprOutput);
		}

		// 将分页数据放入结果中
		pagedList.getDataList().addAll(wprOutputList);
		return pagedList;
	}

	/**
	 * 需求列表输出关联信息取得
	 * 
	 * @param wpr
	 * @return
	 * @throws ParseException
	 */
	@Override
	public WarePurchaseRequisitionsListOutput getPurchaseRequisitionsOutput(String spareParts, String warehouse)
			throws ParseException {
		// 现有库存，安全库存，上一年度入库总量
		WarePurchaseRequisitionsListOutput wprOutput = new WarePurchaseRequisitionsListOutput();

		// 入库详情查询
		WareStockinDetailExample wsdExample = new WareStockinDetailExample();
		WareStockinDetailExample.Criteria wsdCriteria = wsdExample.createCriteria();
		// 库存查询
		WareStockExample wsExample = new WareStockExample();
		WareStockExample.Criteria wsCriteria = wsExample.createCriteria();
		// 安全库存查询
		WareSafeStockExample wssExample = new WareSafeStockExample();
		WareSafeStockExample.Criteria wssCriteria = wssExample.createCriteria();

		// 现有库存

		// wsCriteria.andCompanyEqualTo(getCurrentCompanyKey());
		wsCriteria.andSparePartsEqualTo(spareParts);
		wsCriteria.andWarehouseEqualTo(warehouse);
		List<WareStock> wareStockList = wareStockDao.selectByExample(wsExample);
		if (wareStockList.size() > 0) {
			wprOutput.setSurplusNum(wareStockList.stream().mapToDouble(WareStock::getActualSurplusNum).sum());
		}
		// 安全库存
		wssCriteria.andSparePartsEqualTo(spareParts);
		wssCriteria.andWarehouseEqualTo(warehouse);
		List<WareSafeStock> wareSafeStockList = wareSafeStockDao.selectByExample(wssExample);
		if (wareSafeStockList.size() > 0) {
			wprOutput.setSafeStockNum(wareSafeStockList.get(0).getSafeStockNum());
		}
		// 上一年度入库总量
		Calendar calendar = Calendar.getInstance();
		int lastYear = calendar.get(Calendar.YEAR) - 1;
		wsdCriteria.andCreateTimeGreaterThan(new SimpleDateFormat("yyyy-MM-dd").parse(lastYear + "-01-01"));
		wsdCriteria.andCreateTimeLessThan(new SimpleDateFormat("yyyy-MM-dd").parse(lastYear + "-12-31"));
		wsdCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		wsdCriteria.andSparePartsEqualTo(spareParts);
		wsdCriteria.andWarehouseEqualTo(warehouse);
		List<WareStockinDetail> wareStockinDetailList = wareStockinDetailDao.selectByExample(wsdExample);
		wprOutput.setEntryNumLastYear(
				wareStockinDetailList.stream().map(WareStockinDetail::getEntryNum).reduce(0d, (a, b) -> a + b));
		return wprOutput;
	}

	/**
	 * 删除采购需求
	 */
	@Override
	public void deletePurchaseRequisitions(Integer[] warePurchaseRequisitionsId) {

		WarePurchaseRequisitionsExample example = new WarePurchaseRequisitionsExample();
		WarePurchaseRequisitionsExample.Criteria criteria = example.createCriteria();
		criteria.andWarePurchaseRequisitionsIdIn(Arrays.asList(warePurchaseRequisitionsId));
		WarePurchaseRequisitions wpr = new WarePurchaseRequisitions();
		wpr.setIsDel(PlatformConstants.ISDEL_YES);
		wpr.setUpdateTime(new Date());
		wpr.setUpdateUser(getCurrentUserId());

		warePurchaseRequisitionsDao.updateByExampleSelective(wpr, example);

	}

	/**
	 * 编辑采购需求
	 * 
	 * @throws ParseException
	 */
	@Override
	public void editPurchaseRequisitions(EditPurchaseRequisitionsInput input) throws ParseException {

		WarePurchaseRequisitions wpp = warePurchaseRequisitionsDao
				.selectByPrimaryKey(input.getWarePurchaseRequisitionsId());
		BeanUtils.copyProperties(input, wpp);
		wpp.setRequireArriveTime(new SimpleDateFormat("yyyy-MM-dd").parse(input.getRequireArriveTime()));
		wpp.setUpdateTime(new Date());
		wpp.setUpdateUser(getCurrentUserId());
		warePurchaseRequisitionsDao.updateByPrimaryKey(wpp);

	}

	/**
	 * 手动添加采购需求
	 * 
	 * @throws ParseException
	 */
	@Override
	public void addManualPurchaseRequisitions(AddManualPurchaseRequisitionsInput input) throws ParseException {
		WarePurchaseRequisitions record = new WarePurchaseRequisitions();
		BeanUtils.copyProperties(input, record);
		// 采购需求单号 -自动生成
		record.setPurchaseRequisitionsNo(billTypeService.getBillNumber("采购需求单号", getCurrentCompanyKey()));
		// 要求到货日期
		// record.setRequireArriveTime(new
		// SimpleDateFormat("yyyy-MM-dd").parse(input.getRequireArriveTime()));
		// 采购单生成类型
		record.setType(PurchaseFromTypeEnum.MANUAL.getCode());
		record.setCreateTime(new Date());
		record.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
		record.setIsDel(PlatformConstants.ISDEL_NO);
		record.setCreateUser(getCurrentUserId());

		warePurchaseRequisitionsDao.insertSelective(record);

	}

	/**
	 * 自动添加采购需求，生产调用
	 */
	@Override
	public void addAutoPurchaseRequisitions(AddAutoPurchaseRequisitionsInput input) {
		String[] spareParts = input.getSpareParts();
		Double[] totalRequisitionsNum = input.getTotalRequisitionsNum();
		EditSparePartsInput spInput = new EditSparePartsInput();

		for (int i = 0; i < spareParts.length; i++) {

			// 采购需求申请数量
			Double applyNum = checkPurchaseRequisitions(input.getWarehouse(), spareParts[i], totalRequisitionsNum[i]);
			if (applyNum > 0) {
				WarePurchaseRequisitions record = new WarePurchaseRequisitions();
				record.setApplyNum(applyNum);
				record.setSpareParts(spareParts[i]);
				record.setWarehouse(input.getWarehouse());
				// 采购需求单号 -自动生成
				record.setPurchaseRequisitionsNo(billTypeService.getBillNumber("采购需求单号", getCurrentCompanyKey()));
				spInput.setKey(spareParts[i]);
				SparePartsOutput spOutput = wareSparePartsService.getSpareParts(spInput);

				BeanUtils.copyProperties(input, record);
				// 采购模式 TODO 吴彦祖更新国际化key
				record.setPurchasingPattern(spOutput.getPurchasingPattern());
				// 到货日期 TODO
				record.setRequireArriveTime(DateUtils.addDays(new Date(), 30));
				// 仓库类型
				record.setWarehouseType(spOutput.getDefaultWarehouseType());
				// 采购单生成类型
				record.setType(PurchaseFromTypeEnum.AUTO.getCode());
				// 默认未审核
				record.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());

				record.setIsDel(PlatformConstants.ISDEL_NO);
				record.setCreateTime(new Date());
				// 创建人
				record.setCreateUser(getCurrentUserId());
				warePurchaseRequisitionsDao.insertSelective(record);
			}
		}

	}

	/**
	 * check是否生成采购需求
	 * 
	 * @param warehouse
	 * @param spareParts
	 * @param totalRequisitionsNum
	 * @return
	 */
	public Double checkPurchaseRequisitions(String warehouse, String spareParts, Double totalRequisitionsNum) {
		// 采购需求查询
		WarePurchaseRequisitionsExample example = new WarePurchaseRequisitionsExample();
		WarePurchaseRequisitionsExample.Criteria criteria = example.createCriteria();
		// 入库查询
		WareStockinExample wsiExample = new WareStockinExample();
		WareStockinExample.Criteria wsiCriteria = wsiExample.createCriteria();
		// 库存查询
		WareStockExample wsExample = new WareStockExample();
		WareStockExample.Criteria wsCriteria = wsExample.createCriteria();
		// 安全库存查询
		WareSafeStockExample wssExample = new WareSafeStockExample();
		WareSafeStockExample.Criteria wssCriteria = wssExample.createCriteria();

		// 生成最新的采购需求后入库次数
		Integer count = 0;
		// 库存数量
		Double stockNum = 0d;
		// 安全库存数量
		Double safeStockNum = 0d;
		// 库存上限数量
		Double safeUpperNum = 0d;

		// 根据备件key取得库存数量
		wsCriteria.andCompanyEqualTo(getCurrentCompanyKey());
		wsCriteria.andSparePartsEqualTo(spareParts);
		wsCriteria.andWarehouseEqualTo(warehouse);
		List<WareStock> wareStockList = wareStockDao.selectByExample(wsExample);
		if (wareStockList.size() > 0) {
			stockNum = wareStockList.stream().mapToDouble(WareStock::getActualSurplusNum).sum();
		} else {
			// 仓库没有备件信息不生成采购需求
			return 0d;
		}
		// 根据仓库key和备件key取得安全库存和库存上限
		wssCriteria.andWarehouseEqualTo(warehouse);
		wssCriteria.andSparePartsEqualTo(spareParts);
		wssCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<WareSafeStock> wareSafeStockList = wareSafeStockDao.selectByExample(wssExample);
		if (wareSafeStockList.size() > 0) {
			safeStockNum = wareSafeStockList.get(0).getSafeStockNum();
			safeUpperNum = wareSafeStockList.get(0).getStockUpperNum();
		} else {
			// 没有安全库存设置不生成采购需求
			return 0d;
		}
		// 需求数量+库存数量 > 安全库存 ，不生成采购需求
		if (stockNum - totalRequisitionsNum > safeStockNum) {
			return 0d;
		}

		// 确认备件是否已生成需求
		// 取得备件最新采购需求
		if (StringUtils.isNotEmpty(spareParts)) {
			// 备件key
			criteria.andSparePartsEqualTo(spareParts);
		}
		if (StringUtils.isNotEmpty(warehouse)) {
			// 仓库key
			criteria.andWarehouseEqualTo(warehouse);
		}
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		example.setOrderByClause("create_time desc");
		List<WarePurchaseRequisitions> warePurchaseRequisitionsList = warePurchaseRequisitionsDao
				.selectByExample(example);

		// 采购需求有备件相关需求
		if (warePurchaseRequisitionsList.size() > 0) {
			// 生成最新的采购需求后是否有入库
			wsCriteria.andCreateTimeGreaterThan(warePurchaseRequisitionsList.get(0).getCreateTime());
			count = (int) wareStockDao.countByExample(wsExample);
			if (count > 0) {
				// 有入库则生成采购需求
				// 需求数量=库存上限-安全库存
				return safeUpperNum - safeStockNum;
			} else {
				return 0d;
			}
		} else {
			// 采购需求列表没有该备件的采购需求，则生成采购需求
			// 需求数量=库存上限-安全库存
			return safeUpperNum - safeStockNum;
		}
	}

	/**
	 * 确认采购需求
	 */
	@Override
	@Transactional
	public Boolean AuditPurchaseRequisitions(Integer[] warePurchaseRequisitionsId, String auditStatus, String reject) {

		// 审核

		WarePurchaseRequisitionsExample example = new WarePurchaseRequisitionsExample();
		WarePurchaseRequisitionsExample.Criteria criteria = example.createCriteria();
		criteria.andWarePurchaseRequisitionsIdIn(Arrays.asList(warePurchaseRequisitionsId));
		WarePurchaseRequisitions wpr = new WarePurchaseRequisitions();
		wpr.setAuditStatus(auditStatus);
		wpr.setReasonsRejection(reject);
		wpr.setUpdateTime(new Date());
		wpr.setUpdateUser(getCurrentUserId());

		warePurchaseRequisitionsDao.updateByExampleSelective(wpr, example);
		if (auditStatus.equals(AuditStateEnum.REJECTED.getCode())) {
			return true;
		}
		// 审核通过的需求，插入采购模块需求表中
		List<WarePurchaseRequisitions> wprList = warePurchaseRequisitionsDao.selectByExample(example);
		List<AddMatterDemandInput> amdList = new ArrayList<AddMatterDemandInput>();
		for (WarePurchaseRequisitions item : wprList) {
			AddMatterDemandInput param = new AddMatterDemandInput();
			// 备件信息取得
			EditSparePartsInput sparePartsInput = new EditSparePartsInput();
			sparePartsInput.setKey(item.getSpareParts());
			SparePartsBriefOutput sparePartsBriefOutput = wareSparePartsService.getSparePartsBrief(sparePartsInput);

			// 仓库信息取得
			EditWarehouseInput ewInput = new EditWarehouseInput();
			ewInput.setKey(item.getWarehouse());
			WareWarehouse wwh = warehouseService.getWarehouseDetail(ewInput);
			param.setDemandNo(item.getPurchaseRequisitionsNo());
			param.setIsDayPruchase(CommonEnum.NO.getCode());
			param.setProductNum(sparePartsBriefOutput.getSparePartsNo());
			param.setProduct(item.getSpareParts());
			param.setGenaralType(sparePartsBriefOutput.getSparePartsCategories());
			param.setSecondType(sparePartsBriefOutput.getSparePartsCategoriesDetails());
			param.setProductCount(item.getApplyNum() == null ? 0d : item.getApplyNum());
			param.setRequireArriveTime(item.getRequireArriveTime());
			param.setPurchaseCompany(wwh.getCompany());
			param.setWarehouse(item.getWarehouse());
			param.setPurchasingPattern(item.getPurchasingPattern());
			param.setApplicantUserId(item.getCreateUser());
			param.setDemandTime(item.getCreateTime());
			param.setAuditStatus(item.getAuditStatus());
			param.setComments(item.getRemark());
			amdList.add(param);

		}
		try {
			Result rs = purchaseFeignClient.addMutiMatterDemand(amdList);
			if (rs == null || rs.getCode() != 0) {
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
				throw new RuntimeException("purchaseAddError");

			}
		} catch (Exception e) {
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			throw new RuntimeException("purchaseAddError");
		}
		return true;

	}

	@Transactional
	@Override
	public void addManualWareRequisitions(AddManualRequisitionsWareInput input) {
		WarePurchaseRequisitions record = new WarePurchaseRequisitions();
		BeanUtils.copyProperties(input, record);
		// 默认使用批量备注
		boolean remarkFlag = false;
		List<AddManualRequisitionsSpartsInput> reqDetails = new ArrayList<>(Arrays.asList(input.getStockinDetail()));
		if (reqDetails.stream().filter(d -> StringUtils.isNotEmpty(d.getRemark())).collect(Collectors.toList())
				.size() > 0) {
			remarkFlag = true;
		}
		for (AddManualRequisitionsSpartsInput spInput : input.getStockinDetail()) {
			record.setApplyNum(spInput.getApplyNum());
			record.setSpareParts(spInput.getSpareParts());
			// 采购需求单号 -自动生成
			record.setPurchaseRequisitionsNo(billTypeService.getBillNumber("采购需求单号", getCurrentCompanyKey()));
			// 采购单生成类型
			record.setType(PurchaseFromTypeEnum.MANUAL.getCode());
			record.setCreateTime(new Date());
			record.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
			record.setIsDel(PlatformConstants.ISDEL_NO);
			record.setCreateUser(getCurrentUserId());
			if (remarkFlag) {
				record.setRemark(spInput.getRemark());
			}

			warePurchaseRequisitionsDao.insertSelective(record);
		}

	}

}
