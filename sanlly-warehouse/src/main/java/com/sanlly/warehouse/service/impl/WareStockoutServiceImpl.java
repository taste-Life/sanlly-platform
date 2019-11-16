package com.sanlly.warehouse.service.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.sanlly.warehouse.dao.ShouldReturnMapper;
import com.sanlly.warehouse.entity.*;
import com.sanlly.warehouse.enums.ReturnStatusEnum;
import com.sanlly.warehouse.models.input.stock.SearchStockInput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsBriefOutput;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.enums.StockoutEnum;
import com.sanlly.common.models.exception.SqlException;
import com.sanlly.common.models.input.fixIn.PickingListSearchInput;
import com.sanlly.common.models.input.referral.WorkGroupOutput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.fixOut.PickingListDetailOutput;
import com.sanlly.common.models.output.fixOut.PickingListEntryOutput;
import com.sanlly.common.models.output.fixOut.PickingListOutInput;
import com.sanlly.common.models.output.fixOut.PickingListOutput;
import com.sanlly.common.models.output.fixOut.PickingListSparesOutput;
import com.sanlly.common.models.output.fixOut.PlanStockInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.warehouse.constants.BillTypeConstants;
import com.sanlly.warehouse.constants.DefaultConstants;
import com.sanlly.warehouse.dao.WareStockoutDetailMapper;
import com.sanlly.warehouse.dao.WareStockoutMapper;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutDetailInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutInput;
import com.sanlly.warehouse.models.input.stockout.EditStockoutInput;
import com.sanlly.warehouse.models.input.stockout.SearchStockoutInput;
import com.sanlly.warehouse.models.input.stockout.StockOutInput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutAppOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutDetailAppOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutDetailOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutOutput;
import com.sanlly.warehouse.service.BillTypeService;
import com.sanlly.warehouse.service.PurchaseRequisitionsService;
import com.sanlly.warehouse.service.StaffBorrowService;
import com.sanlly.warehouse.service.ToolService;
import com.sanlly.warehouse.service.WareDeliveryService;
import com.sanlly.warehouse.service.WareSparePartsService;
import com.sanlly.warehouse.service.WareStockService;
import com.sanlly.warehouse.service.WareStockoutApplyService;
import com.sanlly.warehouse.service.WareStockoutService;
import com.sanlly.warehouse.service.WarehouseService;
import com.sanlly.warehouse.service.feign.AuthFeignClient;
import com.sanlly.warehouse.service.feign.ProductionFeignClient;

/**
 * ClassName: WareStockoutServiceImpl Description: 出库服务实现层 date: 2019/8/6 15:39
 *
 * @author wannt
 * @since JDK 1.8
 */
@Service
public class WareStockoutServiceImpl extends BaseServiceImpl implements WareStockoutService {

	@Autowired
	private WareStockoutMapper stockoutMapper;

	@Autowired
	private WareStockoutDetailMapper stockoutDetailMapper;

	@Autowired
	private WareSparePartsService sparePartsService;

	@Autowired
	private WareStockService stockService;

	@Autowired
	private BillTypeService billTypeService;

	@Autowired
	private PurchaseRequisitionsService purchaseRequisitionsService;

	@Autowired
	private AuthFeignClient authFeignService;

	@Autowired
	private WareStockoutApplyService stockoutApplyService;

	@Autowired
	private ToolService toolService;

	@Autowired
	private WarehouseService warehouseService;

	@Autowired
	private WareDeliveryService deliveryService;

	@Autowired
	private AuthFeignClient authFeignClient;

	@Autowired
	private ProductionFeignClient productionFeignClient;

	@Autowired
	private StaffBorrowService staffBorrowService;

	@Autowired
	ShouldReturnMapper shouldReturnDao;



	/**
	 * 分页查询出库单
	 * 
	 * @param input
	 * @return
	 */
	@Override
	public PagedList<StockoutOutput> stockoutPageList(SearchStockoutInput input) {
		// 组装查询条件
		WareStockoutExample example = new WareStockoutExample();
		WareStockoutExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("create_time desc");
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if (input.getWareStockoutId() != null) {
			criteria.andWareStockoutIdEqualTo(input.getWareStockoutId());
		}
		if (input.getWarehouse() != null && input.getWarehouse() != "") {
			criteria.andWarehouseEqualTo(input.getWarehouse());
		}
		if (input.getBillType() != null && input.getBillType() != "") {
			criteria.andBillTypeEqualTo(input.getBillType());
		}
		if (input.getStockoutNo() != null && input.getStockoutNo() != "" && input.getIsLike() == null) {
			criteria.andStockoutNoEqualTo(input.getStockoutNo());
		}else {
			criteria.andStockoutNoLike("%"+input.getStockoutNo()+"%");
		}
		if (input.getAdvanceWarehouseReceipt() != null && input.getAdvanceWarehouseReceipt() != "") {
			criteria.andAdvanceWarehouseReceiptNoLike("%" + input.getAdvanceWarehouseReceipt() + "%");
		}
		if (input.getNo() != null && input.getNo() != "") {
			criteria.andNoLike("%" + input.getNo() + "%");
		}
		if (input.getReceiveDepartment() != null && input.getReceiveDepartment() != "") {
			criteria.andReceiveDepartmentEqualTo(input.getReceiveDepartment());
		}
		if (input.getStartDate() != null && input.getEndDate() != null) {
			criteria.andCreateTimeBetween(input.getStartDate(), input.getEndDate());
		} else if (input.getStartDate() != null) {
			criteria.andCreateTimeBetween(input.getStartDate(), new Date());
		} else if (input.getEndDate() != null) {
			criteria.andCreateTimeBetween(new Date(0), input.getEndDate());
		}
		if ((input.getSparePartsNo() != null && input.getSparePartsNo() != "")
				|| (input.getSparePartsName() != null && input.getSparePartsName() != "")
				|| (input.getWarehouseType() != null && input.getWarehouseType() != "")) {
			WareStockoutDetailExample detailExample = new WareStockoutDetailExample();
			WareStockoutDetailExample.Criteria detailCriteria = detailExample.createCriteria();
			detailCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			if ((input.getSparePartsNo() != null && input.getSparePartsNo() != "")
					|| (input.getSparePartsName() != null && input.getSparePartsName() != "")) {
				List<String> KeyList = sparePartsService.getSparePartsKeyListByLike(input.getSparePartsNo(),
						input.getSparePartsName());
				detailCriteria.andSparePartsIn(KeyList);
			}
			if (input.getWarehouseType() != null && input.getWarehouseType() != "") {
				detailCriteria.andDefaultWarehouseTypeEqualTo(input.getWarehouseType());
				;
			}
			List<WareStockoutDetail> wareStockoutDetails = stockoutDetailMapper.selectByExample(detailExample);
			List<Integer> stockoutId = new ArrayList<>();
			for (WareStockoutDetail stockoutDetail : wareStockoutDetails) {
				stockoutId.add(stockoutDetail.getWareStockoutId());
			}
			criteria.andWareStockoutIdIn(stockoutId);
		}
		if(input.getIsReturn() != null && input.getIsReturn() != ""){
			WareStockoutDetailExample detailExample = new WareStockoutDetailExample();
			WareStockoutDetailExample.Criteria detailCriteria = detailExample.createCriteria();
			detailCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			detailCriteria.andStockoutNumGreaterThan(0D);
			List<Integer> list = new ArrayList<>();
			for (WareStockoutDetail wareStockoutDetail : stockoutDetailMapper.selectByExample(detailExample)) {
				list.add(wareStockoutDetail.getWareStockoutId());
			}
			criteria.andWareStockoutIdIn(list);
		}
		if ("Yanf".equals(input.getBillType())) {
			criteria.andResearchNoIsNotNull();
		}
		if(StringUtils.isNotEmpty(input.getContainerNo())) {
			criteria.andContainerNoLike("%"+input.getContainerNo()+"%");
		}
		// 查询页数
		Integer totalItemCount = (int) stockoutMapper.countByExample(example);
		PagedList<StockoutOutput> pagedList = new PagedList<>(input.getPageIndex(), input.getPageSize(),
				totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		// 组装返回数据
		List<WareStockout> wareStockouts = stockoutMapper.selectByExample(example);
		List<StockoutOutput> outputs = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (WareStockout wareStockout : wareStockouts) {
			StockoutOutput output = new StockoutOutput();
			BeanUtils.copyProperties(wareStockout, output);
			output.setCompanyLangLang(wareStockout.getCompany());
			output.setStatusLangLang(wareStockout.getStatus());
			output.setWarehouseLangLang(wareStockout.getWarehouse());
			output.setAuditStatusLangLang(wareStockout.getAuditStatus());
			output.setBillTypeLangLang(wareStockout.getBillType());
			if(wareStockout.getReceiveUser() != null){
				UserInfoOutput data = authFeignService.getUserInfo(wareStockout.getReceiveUser()).getData();
				if(data != null){
					output.setReceiveUserStr(data.getUserName());
				}
			}
			output.setReceiveDepartmentLangLang(wareStockout.getReceiveDepartment());
			output.setStockoutStatusLangLang(wareStockout.getStockoutStatus());
			output.setIsStockSbsLangLang(wareStockout.getIsStockSbs());
			output.setDetailOutputs(getStockDetailList(wareStockout));
			if(wareStockout.getCreateUser()!=null) {
				output.setCreateUserName(getUserNameByUserId(wareStockout.getCreateUser()));
			}
            if(wareStockout.getCreateTime()!=null) {
            	output.setCreateTime(sdf.format(wareStockout.getCreateTime()));
            }
            
			outputs.add(output);
		}
		pagedList.getDataList().addAll(outputs);

		return pagedList;
	}

	/**
	 * 新增出库单
	 * 
	 * @param input
	 */
	@Override
	@Transactional
	public Integer addStockout(AddStockoutInput input) {
        for (AddStockoutDetailInput detailInput : input.getStockoutDetailInputList()) {
            stockService.setStock(detailInput);
        }
		WareStockout stockout = new WareStockout();
		BeanUtils.copyProperties(input,stockout);
		stockout.setStockoutNo(billTypeService.getBillNumberByKey(BillTypeConstants.STOCKOUT));
		stockout.setAdvanceWarehouseReceiptNo(input.getAdvanceWarehouseReceiptNo());
		stockout.setNo(input.getNo());
		stockout.setCompany(input.getCompany());
		stockout.setWarehouse(input.getWarehouse());
		stockout.setBillType(input.getBillType());
		stockout.setStockoutStatus(StockoutEnum.YESOUT.getCode());
		stockout.setReceiveDepartment(input.getReceiveDepartment());
		stockout.setReceiveUser(input.getReceiveUser());
		stockout.setStatus(CommonEnum.NO.getCode());
		stockout.setIsStockSbs(CommonEnum.NO.getCode());
		stockout.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
		stockout.setIsDel(PlatformConstants.ISDEL_NO);
		stockout.setCreateTime(new Date());
		stockout.setCreateUser(getCurrentUserId());
		stockoutMapper.insert(stockout);
		AddStockoutDetailInput[] detailInputList = input.getStockoutDetailInputList();
		for (AddStockoutDetailInput detailInput : detailInputList) {
			WareStockoutDetail stockoutDetail = new WareStockoutDetail();
			BeanUtils.copyProperties(detailInput, stockoutDetail);
			stockoutDetail.setStockoutArea(DefaultConstants.DOUBLEDEFAULT);
			stockoutDetail.setStockoutSurplusArea(DefaultConstants.DOUBLEDEFAULT);
			stockoutDetail.setStockoutNum(DefaultConstants.DOUBLEDEFAULT);
			stockoutDetail.setStockoutSurplusNum(DefaultConstants.DOUBLEDEFAULT);
			stockoutDetail.setLength(DefaultConstants.DOUBLEDEFAULT);
			stockoutDetail.setWidth(DefaultConstants.DOUBLEDEFAULT);

			if(detailInput.getStockoutArea() != null){
				stockoutDetail.setStockoutArea(detailInput.getStockoutArea());
			}
			if(detailInput.getStockoutNum() != null){
				stockoutDetail.setStockoutNum(detailInput.getStockoutNum());
			}
			if(detailInput.getStockoutLength() != null){
				stockoutDetail.setLength(detailInput.getStockoutLength());
			}

			stockoutDetail.setWareStockoutId(stockout.getWareStockoutId());
			stockoutDetail.setDefaultWarehouseType(detailInput.getDefaultWarehouseType());
			stockoutDetail.setSparePartsBatch(detailInput.getSparePartsBatch());
			stockoutDetail.setSpareParts(detailInput.getSpareParts());
			if(detailInput.getUseUser() != null){
				stockoutDetail.setUseUser(detailInput.getUseUser().toString());
			}
			stockoutDetail.setYard(detailInput.getYard());
			stockoutDetail.setIsDel(PlatformConstants.ISDEL_NO);
			stockoutDetail.setStockoutStatus(StockoutEnum.YESOUT.getCode());
			stockoutDetail.setContainerNo(detailInput.getContainerNo());
			stockoutDetail.setCreateTime(new Date());
			stockoutDetail.setCreateUser(getCurrentUserId());
			stockoutDetail.setProdNum(detailInput.getProdNum());
			stockoutDetailMapper.insert(stockoutDetail);
		}
        return stockout.getWareStockoutId();
	}

	/**
	 * 新增出库单直接出库
	 * @param input
	 */
	@Override
	@Transactional
	public void addStockoutPass(AddStockoutInput input) {
		Integer id = addStockout(input);
		SearchStockoutInput search = new SearchStockoutInput(1,1);
		search.setWareStockoutId(id);
		stockout(stockoutPageList(search).getDataList().get(0));
	}

	/**
	 * 修改出库单
	 * 
	 * @param input
	 */
	@Override
	@Transactional
	public void editStockout(EditStockoutInput input) {
		WareStockout stockout = new WareStockout();
		BeanUtils.copyProperties(input, stockout);
		stockout.setUpdateTime(new Date());
		stockout.setUpdateUser(getCurrentUserId());
		stockoutMapper.updateByPrimaryKeySelective(stockout);
	}

	/**
	 * 根据出库单id查询出库明细
	 *
	 * @param wareStockout
	 * @return
	 */
	@Override
	public List<StockoutDetailOutput> getStockDetailList(WareStockout wareStockout) {
		WareStockoutDetailExample example = new WareStockoutDetailExample();
		WareStockoutDetailExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andWareStockoutIdEqualTo(wareStockout.getWareStockoutId());
		List<WareStockoutDetail> wareStockoutDetails = stockoutDetailMapper.selectByExample(example);
		List<StockoutDetailOutput> outputs = new ArrayList<>();
		for (WareStockoutDetail stockoutDetail : wareStockoutDetails) {
			StockoutDetailOutput output = new StockoutDetailOutput();
			BeanUtils.copyProperties(stockoutDetail, output);
			output.setDefaultWarehouseTypeLangLang(stockoutDetail.getDefaultWarehouseType());
			output.setSparePartsLangLang(stockoutDetail.getSpareParts());
			output.setYardLangLang(stockoutDetail.getYard());
			output.setStockoutStatusLangLang(stockoutDetail.getStockoutStatus());
			output.setStockoutArea(stockoutDetail.getStockoutArea());
			if (stockoutDetail.getSparePartsBatch() != null && stockoutDetail.getSparePartsBatch() != "") {
				StockOutput stockByBatch = stockService.getStockByBatch(stockoutDetail.getSparePartsBatch(), stockoutDetail.getSpareParts());
				if(stockByBatch != null){
					output.setStorageLocation(stockByBatch.getStorageLocation());
					output.setWarehouseTypeLangLang(stockByBatch.getWarehouseType());
					output.setLength(stockByBatch.getLength());
					output.setStockNum(stockByBatch.getActualSurplusNum());
					output.setWidth(stockByBatch.getWidth());
					output.setWarehouseTypeLangLang(stockByBatch.getWarehouseType());
					output.setSparePartsCategoriesLangLang(stockByBatch.getSparePartsCategories());
					output.setSparePartsCategories(stockByBatch.getSparePartsCategories());
					output.setSparePartsNo(stockByBatch.getSparePartsNo());
					output.setUnitPrice(stockByBatch.getUnitPrice());
					output.setStockArea(stockByBatch.getSurplusArea());
				}
			} else {
				EditSparePartsInput input = new EditSparePartsInput();
				input.setKey(stockoutDetail.getSpareParts());
				SparePartsOutput spareParts = sparePartsService.getSpareParts(input);
				if(spareParts != null){
					output.setSparePartsCategoriesLangLang(spareParts.getSparePartsCategories());
					output.setSparePartsCategories(spareParts.getSparePartsCategories());
					output.setSparePartsNo(spareParts.getSparePartsNo());
				}
				output.setStockNum(stockService.getStockNum(stockoutDetail.getSpareParts()));
			}
			output.setProdNum(stockoutDetail.getProdNum());
			outputs.add(output);
		}
		return outputs;
	}

	/**
	 * 批量审核
	 *
	 * @param ids
	 */
	@Override
	@Transactional
	public void passAudit(Integer[] ids) {
		WareStockoutExample example = new WareStockoutExample();
		WareStockoutExample.Criteria criteria = example.createCriteria();
		criteria.andWareStockoutIdIn(Arrays.asList(ids));
		List<WareStockout> stockouts = stockoutMapper.selectByExample(example);
		for (WareStockout stockout : stockouts) {
			if (!AuditStateEnum.UNAUDIT.getCode().equals(stockout.getAuditStatus())) {
				throw new RuntimeException("auditErr");
			}
		}

		WareStockout stockout = new WareStockout();
		stockout.setUpdateUser(getCurrentUserId());
		stockout.setUpdateTime(new Date());
		stockout.setAuditStatus(AuditStateEnum.AUDITED.getCode());
		stockoutMapper.updateByExampleSelective(stockout, example);
	}

	/**
	 * 批量驳回出库
	 *
	 * @param ids
	 * @param reasonsRejection
	 */
	@Override
	@Transactional
	public void rejectAudit(Integer[] ids, String reasonsRejection) {
		WareStockoutExample example = new WareStockoutExample();
		WareStockoutExample.Criteria criteria = example.createCriteria();
		criteria.andWareStockoutIdIn(Arrays.asList(ids));
		List<WareStockout> stockouts = stockoutMapper.selectByExample(example);
		for (WareStockout stockout : stockouts) {
			if (!AuditStateEnum.UNAUDIT.getCode().equals(stockout.getAuditStatus())) {
				throw new RuntimeException("auditErr");
			}
		}

		WareStockout stockout = new WareStockout();
		stockout.setUpdateUser(getCurrentUserId());
		stockout.setUpdateTime(new Date());
		stockout.setAuditStatus(AuditStateEnum.REJECTED.getCode());
		stockout.setReasonsRejection(reasonsRejection);
		stockoutMapper.updateByExampleSelective(stockout, example);
	}

	/**
	 * app 分页查询出库单
	 * 
	 * @param input
	 * @return
	 */
	@Override
	public PagedList<StockoutAppOutput> getAppList(SearchStockoutInput input) {
		PickingListSearchInput pickInput = new PickingListSearchInput();
		pickInput.setPageIndex(input.getPageIndex());
		pickInput.setPageSize(input.getPageSize());

		if(input.getStockoutNo() != null && input.getStockoutNo() != ""){
			pickInput.setReferralNo(input.getStockoutNo());
		}else {
			pickInput.setReferralNo("");
		}

		PagedList<PickingListOutput> data = productionFeignClient.pickingList(pickInput).getData();
		PagedList<StockoutAppOutput> pagedList = new PagedList<StockoutAppOutput>(input.getPageIndex(), input.getPageSize());
		pagedList.setTotalItemCount(data.getTotalItemCount());
		List<StockoutAppOutput> outputs = new ArrayList<>();
		for (PickingListOutput listOutput : data.getDataList()) {
			StockoutAppOutput output = new StockoutAppOutput();
			output.setStockoutNo(listOutput.getReferralNo());
			if(listOutput.getPickingUser() != null) {
				Result<UserInfoOutput> rlt = authFeignClient.getUserInfo(Integer.valueOf(listOutput.getPickingUser()));
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						output.setReceiveUser(user.getUserName());
					}
				}
			}
			output.setStockoutId(listOutput.getReferralNo());
			output.setStockoutDate(listOutput.getPickingTime());
			output.setStockoutStateLang(listOutput.getPickingState());
			WorkGroupOutput data1 = productionFeignClient.getWorkGroupByUser(getCurrentYardKey(), getCurrentUserId()).getData();
			if(data1 != null){
				output.setReceiveDepartmentLang(data1.getProdDept());
			}
			outputs.add(output);
		}
		pagedList.getDataList().addAll(outputs);
		return pagedList;
	}

	/**
	 * app 分页查询出库单明细
	 * 
	 * @param stockoutId
	 * @return
	 */
	@Override
	public List<StockoutDetailAppOutput> getDetailListApp(String stockoutId) {
		PickingListDetailOutput data = productionFeignClient.pickingListDetail(stockoutId).getData();
		List<StockoutDetailAppOutput> outputs = new ArrayList<>();
		if(data != null){
			if(data.getSparesList() != null){
				for (PickingListSparesOutput pick : data.getSparesList()) {
					StockoutDetailAppOutput output = new StockoutDetailAppOutput();
					output.setSparesNum(pick.getSparesNumberNameLang());
					output.setSurplusNum(pick.getSurplusQuantity());
					output.setQuantity(pick.getQuantity());
					output.setSparePartsLang(pick.getSparesNumberNameLang());
					output.setLength(pick.getLength());
					output.setWidth(pick.getWidth());
					output.setDetailId(pick.getSparesNumber());
					output.setIsOut(pick.getPickingStateLang());
					outputs.add(output);
				}
			}
		}
		return outputs;
	}

	/**
	 * app 出库
	 * 
	 * @param stockoutId
	 * @param detailId
	 */
	@Override
	@Transactional
	public void stockOutApp(String stockoutId, List<String> detailId) {
		PickingListDetailOutput data = getPicking(stockoutId);
		for (PickingListSparesOutput sparesOutput : data.getSparesList()) {
			for (String s : detailId) {
				if(!s.equals(sparesOutput.getSparesNumber())){
					data.getSparesList().remove(sparesOutput);
				}else {
					for (PickingListEntryOutput entryOutput : sparesOutput.getPlanStockList()) {
						if(entryOutput.getBorrowQuantity() > entryOutput.getQuantity()){
							// 借件数量大于领料数量
							entryOutput.setStockoutNum(0D);
						}else if(entryOutput.getBorrowQuantity() < entryOutput.getQuantity()){
							// 借件数量小于领料数量
							entryOutput.setStockoutNum(entryOutput.getQuantity() - entryOutput.getBorrowQuantity());
						}else {
							// 没有借件直接出库
							entryOutput.setStockoutNum(entryOutput.getQuantity() - entryOutput.getPickingQuantity());
						}
					}
				}
			}
		}
		// 出库
		prodOut(data);
		PickingListOutInput pickingListOutInput = new PickingListOutInput();
		pickingListOutInput.setReferralNo(stockoutId);
		List<PlanStockInput> list = new ArrayList<>();
		for (PickingListSparesOutput pick : data.getSparesList()) {
			for (PickingListEntryOutput pickEn : pick.getPlanStockList()) {
				for (String s : detailId) {
					if(pickEn.getSparesNumber().equals(s)){
						PlanStockInput input = new PlanStockInput();
						input.setReferralEntryId(pickEn.getReferralEntryId());
						input.setQuantity(Double.toString((pickEn.getQuantity() - pickEn.getBorrowQuantity() - pickEn.getPickingQuantity())));
						list.add(input);
					}
				}
			}
		}
		pickingListOutInput.setPlanStockList(list);
		productionFeignClient.pickingListOut(pickingListOutInput);
	}

	/**
	 * App 根据单号查询已出库详情
	 * 
	 * @param stockoutId
	 * @return
	 */
	@Override
	public List<StockoutDetailAppOutput> stockoutDetailsConfirm(String stockoutId) {
		PickingListDetailOutput data = productionFeignClient.pickingListDetail(stockoutId).getData();
		List<StockoutDetailAppOutput> outputs = new ArrayList<>();
		for (PickingListSparesOutput pick : data.getSparesList()) {
			StockoutDetailAppOutput output = new StockoutDetailAppOutput();
			output.setDetailId(pick.getSparesNumber());
			output.setWidth(pick.getWidth());
			output.setLength(pick.getLength());
			output.setSparePartsLang(pick.getSparesNumberNameLang());
			output.setQuantity(pick.getQuantity());
			output.setSurplusNum(pick.getSurplusQuantity());
			output.setSparesNum(pick.getSparesNumber());
			output.setSparesId(pick.getSparesNumber());
			outputs.add(output);
		}
		return outputs;
	}

	/**
	 * app 出库确认
	 * 
	 * @param stockoutId
	 */
	@Override
	@Transactional
	public void stockoutConfirm(String stockoutId, String userId) {

	}

	/**
	 * 出库
	 * 
	 * @param input
	 */
	@Override
	@Transactional
	public void stockout(StockoutOutput input) {
		WareStockout stockout = stockoutMapper.selectByPrimaryKey(input.getWareStockoutId());
		if (stockout.getWarehouse() == null) {
			stockout.setWarehouse(input.getWarehouse());
		}
		for (StockoutDetailOutput detailOutput : input.getDetailOutputs()) {
			WareStockoutDetail detail = stockoutDetailMapper.selectByPrimaryKey(detailOutput.getWareStockoutOrderDetailId());
			if (detail.getSparePartsBatch() == null || detail.getSparePartsBatch() == "") {
				detail.setSparePartsBatch(detailOutput.getSparePartsBatch());
			}
			if (detailOutput.getOutNum() != null) {
				detail.setStockoutSurplusNum(detail.getStockoutSurplusNum() - detailOutput.getOutNum());
			}
			if (detailOutput.getOutArea() != null) {
				detail.setStockoutSurplusArea(detail.getStockoutSurplusArea() - detailOutput.getOutArea());
			}
			if (detail.getStockoutSurplusNum() != null) {
				if (detail.getStockoutSurplusNum() < 0) {
					// 本次出库数量大于计划出库数量
					throw new RuntimeException("errOutNum");
				}
			}
			if (detail.getStockoutSurplusArea() != null) {
				if (detail.getStockoutSurplusArea() < 0) {
					// 本次出库面积大于计划出库面积
					throw new RuntimeException("errOutArea");
				}
			}
			stockService.setStock(detailOutput);

			if (detail.getStockoutSurplusNum() == 0 && detail.getStockoutSurplusArea() == 0) {
				detail.setStockoutStatus(StockoutEnum.YESOUT.getCode());
			} else if (detail.getStockoutSurplusNum() > 0 || detail.getStockoutSurplusArea() > 0) {
				detail.setStockoutStatus(StockoutEnum.PORTIONOUT.getCode());
			}
			detail.setUpdateTime(new Date());
			detail.setUpdateUser(getCurrentUserId());
			stockoutDetailMapper.updateByPrimaryKeySelective(detail);
		}
		WareStockoutDetailExample example = new WareStockoutDetailExample();
		WareStockoutDetailExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andWareStockoutIdEqualTo(stockout.getWareStockoutId());
		List<WareStockoutDetail> stockoutDetails = stockoutDetailMapper.selectByExample(example);
		List<String> stockoutStateList = new ArrayList<>();
		for (WareStockoutDetail stockoutDetail : stockoutDetails) {
			if (StockoutEnum.YESOUT.getCode().equals(stockoutDetail.getStockoutStatus())) {
				stockoutStateList.add(stockoutDetail.getStockoutStatus());
			}
		}
		stockout.setUpdateTime(new Date());
		stockout.setUpdateUser(getCurrentUserId());
		if (stockoutStateList.size() == stockoutDetails.size()) {
			// 全部出库
			stockout.setStockoutStatus(StockoutEnum.YESOUT.getCode());
		} else {
			// 部分出库
			stockout.setStockoutStatus(StockoutEnum.PORTIONOUT.getCode());
		}
		stockoutMapper.updateByPrimaryKeySelective(stockout);

		// 修改原单出库状态
		SearchStockoutInput searchInput = new SearchStockoutInput();
		searchInput.setWareStockoutId(stockout.getWareStockoutId());
		searchInput.setPageIndex(1);
		searchInput.setPageSize(1);
		PagedList<StockoutOutput> pagedList = stockoutPageList(searchInput);
		StockoutOutput output = pagedList.getDataList().get(0);
		setStockoutStatus(output);
	}

	public void setStockoutStatus(StockoutOutput input) {

		if (BillTypeConstants.TOOL.equals(input.getBillType())) {
			// 工具申请单
			toolService.toolStockedManage(input);
		}
	}

	/**
	 * 新增出库单
	 * 
	 * @author lishzh
	 * @param input
	 */
	@Override
	@Transactional
	public void addStockout(StockOutInput input) {
		// 保存出库单
		WareStockout stockout = new WareStockout();
		BeanUtils.copyProperties(input, stockout);
		// 根据单据类型名称生成单号
		String billNumber = billTypeService.getBillNumberByKey(input.getBillType());
		if (StringUtils.isEmpty(billNumber)) {
			throw new SqlException("insertFail");
		}
		stockout.setStockoutNo(billNumber);
		// 未删除
		stockout.setIsDel(PlatformConstants.ISDEL_NO);
		// 创建时间
		Date date = new Date();
		stockout.setCreateTime(date);
		// 创建用户
		Integer userId = getCurrentUserId();
		stockout.setCreateUser(userId);
		stockoutMapper.insertSelective(stockout);

		// 保存出库明细
		AddStockoutDetailInput[] detailInputList = input.getStockoutDetailInputList();
		for (AddStockoutDetailInput detailInput : detailInputList) {
			WareStockoutDetail stockoutDetail = new WareStockoutDetail();
			BeanUtils.copyProperties(detailInput, stockoutDetail);
			// 出库单id
			stockoutDetail.setWareStockoutId(stockout.getWareStockoutId());
			// 未删除
			stockoutDetail.setIsDel(PlatformConstants.ISDEL_NO);
			// 创建时间
			stockoutDetail.setCreateTime(date);
			// 创建用户
			stockoutDetail.setCreateUser(userId);
			stockoutDetailMapper.insertSelective(stockoutDetail);
		}
	}

	/**
	 * 直接出库
	 */
	@Override
	@Transactional
	public void directOut(StockOutInput input) {
		// 修改库存
		for (AddStockoutDetailInput detailInput : input.getStockoutDetailInputList()) {
			// 修改库存和传SBS
			StockoutDetailOutput stockoutDetailOutput = new StockoutDetailOutput();
			stockoutDetailOutput.setSpareParts(detailInput.getSpareParts());
			stockoutDetailOutput.setSparePartsBatch(detailInput.getSparePartsBatch());
			stockoutDetailOutput.setOutNum(detailInput.getStockoutNum());
			stockService.setStock(stockoutDetailOutput);
			// 该备件全部出库
			detailInput.setStockoutStatus(StockoutEnum.YESOUT.getCode());
		}

		// 生成出库单
		// 已确认
		input.setStatus(CommonEnum.YES.getCode());
		// 已审核
		input.setAuditStatus(AuditStateEnum.AUDITED.getCode());
		// 已传SBS
		input.setIsStockSbs(CommonEnum.YES.getCode());
		// 出库单已全部出库
		input.setStockoutStatus(StockoutEnum.YESOUT.getCode());
		addStockout(input);

	}

	/**
	 * 根据源单号获取该源单的出库明细
	 */
	@Override
	public List<StockoutDetailOutput> getStockDetailList(String sourceNo) {
		// NPE
		if (StringUtils.isEmpty(sourceNo)) {
			return null;
		}
		// 根据源单号获取出库单
		WareStockoutExample stockoutExample = new WareStockoutExample();
		stockoutExample.createCriteria().andNoEqualTo(sourceNo);
		List<WareStockout> stockouts = stockoutMapper.selectByExample(stockoutExample);
		if (CollectionUtils.isEmpty(stockouts)) {
			return null;
		}
		// 根据出库单id获取出库明细
		return getStockDetailList(stockouts.get(0));
	}

	/**
	 * 根据原单号获取出库单列表
	 * @param no
	 * @return
	 */
	@Override
	public List<StockoutOutput> getOrderByNo(String no) {
        // 组装查询条件
        WareStockoutExample example = new WareStockoutExample();
        WareStockoutExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
	    criteria.andNoEqualTo(no);
        List<WareStockout> wareStockouts = stockoutMapper.selectByExample(example);
        List<StockoutOutput> outputs = new ArrayList<>();
        for (WareStockout wareStockout : wareStockouts) {
            StockoutOutput output = new StockoutOutput();
            BeanUtils.copyProperties(wareStockout, output);
            output.setCompanyLangLang(wareStockout.getCompany());
            output.setStatusLangLang(wareStockout.getStatus());
            output.setWarehouseLangLang(wareStockout.getWarehouse());
            output.setAuditStatusLangLang(wareStockout.getAuditStatus());
            output.setBillTypeLangLang(wareStockout.getBillType());
            output.setReceiveDepartmentLangLang(wareStockout.getReceiveDepartment());
            output.setStockoutStatusLangLang(wareStockout.getStockoutStatus());
            output.setIsStockSbsLangLang(wareStockout.getIsStockSbs());
//            output.setCreateUserLang(authFeignClient.getUserInfo(wareStockout.getCreateUser()).getData().getUserName());
//            output.setUpdateUserLang(authFeignClient.getUserInfo(wareStockout.getUpdateUser()).getData().getUserName());
            output.setCreateTime(DateUtil.date2String(wareStockout.getCreateTime()));
            output.setUpdateTime(DateUtil.date2String(wareStockout.getUpdateTime()));
            output.setDetailOutputs(getStockDetailList(wareStockout));
            outputs.add(output);
        }
        return outputs;
	}

	/**
	 * 生产领料出库
	 * @param input
	 */
	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void  prodOut(PickingListDetailOutput input) {
        PickingListOutInput pickingListOutInput = new PickingListOutInput();
        pickingListOutInput.setReferralNo(input.getReferralNo());
        AddStockoutInput stockoutInput = new AddStockoutInput();
        stockoutInput.setNo(input.getReferralNo());
        stockoutInput.setBillType(BillTypeConstants.LLD);
        stockoutInput.setCompany(getCurrentCompanyKey());
        if(getCurrentYardKey() != null){
			stockoutInput.setWarehouse(productionFeignClient.queryByKey(getCurrentYardKey()).getData().getDefaultWarehouse());
		}else {
        	throw new RuntimeException("notFoundYard");
		}
//        stockoutInput.setReceiveDepartment(productionFeignClient.getWorkGroupByUser(getCurrentYardKey(),getCurrentUserId()).getData().getProdDept());
        stockoutInput.setReceiveUser(Integer.parseInt(input.getCreateUser()));
        List<AddStockoutDetailInput> detailInputs = new ArrayList<>();
        List<PlanStockInput> planStockInputs = new ArrayList<>();
        for (PickingListSparesOutput sparesOutput : input.getSparesList()) {
            for (PickingListEntryOutput entryOutput : sparesOutput.getPlanStockList()) {
				SparePartsOutput sparePartByNo = sparePartsService.getSparePartByNo(entryOutput.getSparesNumber());
				if(entryOutput.getLength() != null && entryOutput.getLength() != 0 && (entryOutput.getWidth() == null || entryOutput.getWidth() == 0) && CommonEnum.YES.getCode().equals(sparePartByNo.getIsIncise())){
            		// 根据长度 出面积
					List<StockOutput> stocks = stockService.autoGetStockByArea(stockoutInput.getWarehouse(), sparePartsService.getKeyByNo(entryOutput.getSparesNumber()), entryOutput.getLength() * entryOutput.getWidth() * entryOutput.getStockoutNum());
					PlanStockInput planStockInput = new PlanStockInput();
					if(entryOutput.getBorrowQuantity() >= entryOutput.getQuantity()){
						planStockInput.setQuantity(String.valueOf(entryOutput.getQuantity() - entryOutput.getPickingQuantity()));
					}else {
						planStockInput.setQuantity(String.valueOf(entryOutput.getBorrowQuantity() + entryOutput.getStockoutNum()));
					}
					planStockInput.setReferralEntryId(entryOutput.getReferralEntryId());
					planStockInputs.add(planStockInput);
					for (StockOutput stock : stocks) {
						AddStockoutDetailInput addInput = new AddStockoutDetailInput();
						BeanUtils.copyProperties(stock,input);
						addInput.setStockoutNum(stock.getActualSurplusNum());
						Double all = entryOutput.getLength() * entryOutput.getStockoutNum();

						addInput.setProdNum((stock.getSurplusArea() / all) * entryOutput.getStockoutNum());
						addInput.setSpareParts(stock.getSpareParts());
						addInput.setStockoutArea(stock.getSurplusArea());
						addInput.setUseUser(Integer.parseInt(input.getCreateUser()));
						addInput.setReferralDetailId(entryOutput.getReferralEntryId());
						addInput.setSparePartsBatch(stock.getSparePartsBatch());
						addInput.setDefaultWarehouseType(stock.getWarehouseType());
						addInput.setContainerNo(entryOutput.getContainerNo());
						if(entryOutput.getStockoutNum() != 0){
							detailInputs.add(addInput);
						}
					}
					if(entryOutput.getBorrowQuantity() > 0 && entryOutput.getBorrowQuantity() < entryOutput.getQuantity()){
						staffBorrowService.upContainer(entryOutput.getContainerNo(),sparePartsService.getKeyByNo(entryOutput.getSparesNumber()),entryOutput.getStaffBorrowType(),entryOutput.getBorrowQuantity());
					}else if(entryOutput.getBorrowQuantity() >= entryOutput.getQuantity()){
						staffBorrowService.upContainer(entryOutput.getContainerNo(),sparePartsService.getKeyByNo(entryOutput.getSparesNumber()),entryOutput.getStaffBorrowType(),entryOutput.getQuantity() - entryOutput.getPickingQuantity());
					}
				}else if(entryOutput.getLength() != null && entryOutput.getLength() != 0 && entryOutput.getWidth() != null && entryOutput.getWidth() != 0 && CommonEnum.YES.getCode().equals(sparePartByNo.getIsIncise())){
            		// 出面积
					List<StockOutput> stocks = stockService.autoGetStockByArea(stockoutInput.getWarehouse(), sparePartsService.getKeyByNo(entryOutput.getSparesNumber()), entryOutput.getLength() * entryOutput.getWidth() * entryOutput.getStockoutNum());
					PlanStockInput planStockInput = new PlanStockInput();
					if(entryOutput.getBorrowQuantity() >= entryOutput.getQuantity()){
						planStockInput.setQuantity(String.valueOf(entryOutput.getQuantity() - entryOutput.getPickingQuantity()));
					}else {
						planStockInput.setQuantity(String.valueOf(entryOutput.getBorrowQuantity() + entryOutput.getStockoutNum()));
					}
					planStockInput.setReferralEntryId(entryOutput.getReferralEntryId());
					planStockInputs.add(planStockInput);
					for (StockOutput stock : stocks) {
						AddStockoutDetailInput addInput = new AddStockoutDetailInput();
						BeanUtils.copyProperties(stock,input);
						addInput.setStockoutNum(stock.getActualSurplusNum());
						Double all = entryOutput.getLength() * entryOutput.getWidth() * entryOutput.getStockoutNum();
						addInput.setProdNum((stock.getSurplusArea() / all) * entryOutput.getStockoutNum());
						addInput.setSpareParts(stock.getSpareParts());
						addInput.setStockoutArea(stock.getSurplusArea());
						addInput.setUseUser(Integer.parseInt(input.getCreateUser()));
						addInput.setReferralDetailId(entryOutput.getReferralEntryId());
						addInput.setSparePartsBatch(stock.getSparePartsBatch());
						addInput.setDefaultWarehouseType(stock.getWarehouseType());
						addInput.setContainerNo(entryOutput.getContainerNo());
						if(entryOutput.getStockoutNum() != 0){
							detailInputs.add(addInput);
						}
					}
					if(entryOutput.getBorrowQuantity() > 0 && entryOutput.getBorrowQuantity() < entryOutput.getQuantity()){
						staffBorrowService.upContainer(entryOutput.getContainerNo(),sparePartsService.getKeyByNo(entryOutput.getSparesNumber()),entryOutput.getStaffBorrowType(),entryOutput.getBorrowQuantity());
					}else if(entryOutput.getBorrowQuantity() >= entryOutput.getQuantity()){
						staffBorrowService.upContainer(entryOutput.getContainerNo(),sparePartsService.getKeyByNo(entryOutput.getSparesNumber()),entryOutput.getStaffBorrowType(),entryOutput.getQuantity() - entryOutput.getPickingQuantity());
					}
				}else if(CommonEnum.YES.getCode().equals(sparePartByNo.getIsIncise())){
					// 可切割备件出数量
					List<StockOutput> stocks = stockService.autoGetStock(stockoutInput.getWarehouse(), sparePartsService.getKeyByNo(entryOutput.getSparesNumber()), entryOutput.getStockoutNum(),"LKWARETYPE000009");
					PlanStockInput planStockInput = new PlanStockInput();
					if(entryOutput.getBorrowQuantity() >= entryOutput.getQuantity()){
						planStockInput.setQuantity(String.valueOf(entryOutput.getQuantity() - entryOutput.getPickingQuantity()));
					}else {
						planStockInput.setQuantity(String.valueOf(entryOutput.getBorrowQuantity() + entryOutput.getStockoutNum()));
					}
					planStockInput.setReferralEntryId(entryOutput.getReferralEntryId());
					planStockInputs.add(planStockInput);
					for (StockOutput stock : stocks) {
						AddStockoutDetailInput addInput = new AddStockoutDetailInput();
						BeanUtils.copyProperties(stock,input);
						addInput.setStockoutNum(stock.getActualSurplusNum());
						addInput.setSpareParts(stock.getSpareParts());
						addInput.setUseUser(Integer.parseInt(input.getCreateUser()));
						addInput.setProdNum(stock.getActualSurplusNum());
						addInput.setReferralDetailId(entryOutput.getReferralEntryId());
						addInput.setSparePartsBatch(stock.getSparePartsBatch());
						addInput.setDefaultWarehouseType(stock.getWarehouseType());
						addInput.setContainerNo(entryOutput.getContainerNo());
						if(entryOutput.getStockoutNum() != 0){
							detailInputs.add(addInput);
						}
					}
					if(entryOutput.getBorrowQuantity() > 0 && entryOutput.getBorrowQuantity() < entryOutput.getQuantity()){
						staffBorrowService.upContainer(entryOutput.getContainerNo(),sparePartsService.getKeyByNo(entryOutput.getSparesNumber()),entryOutput.getStaffBorrowType(),entryOutput.getBorrowQuantity());
					}else if(entryOutput.getBorrowQuantity() >= entryOutput.getQuantity()){
						staffBorrowService.upContainer(entryOutput.getContainerNo(),sparePartsService.getKeyByNo(entryOutput.getSparesNumber()),entryOutput.getStaffBorrowType(),entryOutput.getQuantity() - entryOutput.getPickingQuantity());
					}
				} else {
            		// 出数量
					List<StockOutput> stocks = stockService.autoGetStock(stockoutInput.getWarehouse(), sparePartsService.getKeyByNo(entryOutput.getSparesNumber()), entryOutput.getStockoutNum());
					PlanStockInput planStockInput = new PlanStockInput();
					if(entryOutput.getBorrowQuantity() >= entryOutput.getQuantity()){
						planStockInput.setQuantity(String.valueOf(entryOutput.getQuantity() - entryOutput.getPickingQuantity()));
					}else {
						planStockInput.setQuantity(String.valueOf(entryOutput.getBorrowQuantity() + entryOutput.getStockoutNum()));
					}
					planStockInput.setReferralEntryId(entryOutput.getReferralEntryId());
					planStockInputs.add(planStockInput);
					for (StockOutput stock : stocks) {
						AddStockoutDetailInput addInput = new AddStockoutDetailInput();
						BeanUtils.copyProperties(stock,input);
						addInput.setStockoutNum(stock.getActualSurplusNum());
						addInput.setSpareParts(stock.getSpareParts());
						addInput.setUseUser(Integer.parseInt(input.getCreateUser()));
						addInput.setProdNum(stock.getActualSurplusNum());
						addInput.setReferralDetailId(entryOutput.getReferralEntryId());
						addInput.setSparePartsBatch(stock.getSparePartsBatch());
						addInput.setDefaultWarehouseType(stock.getWarehouseType());
						addInput.setContainerNo(entryOutput.getContainerNo());
						if(entryOutput.getStockoutNum() != 0){
							detailInputs.add(addInput);
						}
					}
					if(entryOutput.getBorrowQuantity() > 0 && entryOutput.getBorrowQuantity() < entryOutput.getQuantity()){
						staffBorrowService.upContainer(entryOutput.getContainerNo(),sparePartsService.getKeyByNo(entryOutput.getSparesNumber()),entryOutput.getStaffBorrowType(),entryOutput.getBorrowQuantity());
					}else if(entryOutput.getBorrowQuantity() >= entryOutput.getQuantity()){
						staffBorrowService.upContainer(entryOutput.getContainerNo(),sparePartsService.getKeyByNo(entryOutput.getSparesNumber()),entryOutput.getStaffBorrowType(),entryOutput.getQuantity() - entryOutput.getPickingQuantity());
					}
				}
            }
        }
		pickingListOutInput.setPlanStockList(planStockInputs);
        productionFeignClient.pickingListOut(pickingListOutInput);
        AddStockoutDetailInput[] arr = new AddStockoutDetailInput[detailInputs.size()];
		detailInputs.toArray(arr);
        stockoutInput.setStockoutDetailInputList(arr);
        addStockout(stockoutInput);

		detailInputs.forEach(d -> {
            SparePartsBriefOutput sparePart = sparePartsService.getSparePart(d.getSpareParts(), null);

            ShouldReturn shouldReturn=new ShouldReturn();
            shouldReturn.setSpareParts(d.getSpareParts());
            if (sparePart!=null){
                shouldReturn.setSparePartsNo(sparePart.getSparePartsNo());
            }
            shouldReturn.setOutYard(getCurrentYardKey());
            shouldReturn.setOutWarehouse(stockoutInput.getWarehouse());
            shouldReturn.setReturnNum(d.getProdNum());
            shouldReturn.setStockoutGo(d.getContainerNo());
            shouldReturn.setReceiveUser(stockoutInput.getReceiveUser());
            shouldReturn.setCreateTime(new Date());
            shouldReturn.setCreateUser(getCurrentUserId());
			shouldReturn.setReturnStatus(ReturnStatusEnum.NOT_RETURN.getCode());
            shouldReturn.setIsDel(PlatformConstants.ISDEL_NO);

            shouldReturnDao.insertSelective(shouldReturn);
		});
    }

	/**
	 * 根据领料单号批量出库
	 * @param nos
	 */
	@Override
	public void prodOutOfNos(String[] nos) {
		for (String no : nos) {
			PickingListDetailOutput data = productionFeignClient.pickingListDetail(no).getData();
			for (PickingListSparesOutput pickingListSparesOutput : data.getSparesList()) {
				for (PickingListEntryOutput pickingListEntryOutput : pickingListSparesOutput.getPlanStockList()) {
					pickingListEntryOutput.setStockoutNum(pickingListEntryOutput.getQuantity());
				}
			}
			prodOut(data);
		}
	}

	/**
     * 生产领料退库
     * @param input
     */
    @Override
    public void prodReturn(List<StockoutOutput> input) {

    }

    /**
     * 根据原单号查询出库单
     * @param no
     * @return
     */
    @Override
    public List<StockoutOutput> byNo(String no) {
        WareStockoutExample example = new WareStockoutExample();
        WareStockoutExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("create_time desc");
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andNoEqualTo(no);
        List<WareStockout> wareStockouts = stockoutMapper.selectByExample(example);
        List<StockoutOutput> outputs = new ArrayList<>();
        for (WareStockout wareStockout : wareStockouts) {
            StockoutOutput output = new StockoutOutput();
            BeanUtils.copyProperties(wareStockout, output);
            output.setCompanyLangLang(wareStockout.getCompany());
            output.setStatusLangLang(wareStockout.getStatus());
            output.setWarehouseLangLang(wareStockout.getWarehouse());
            output.setAuditStatusLangLang(wareStockout.getAuditStatus());
            output.setBillTypeLangLang(wareStockout.getBillType());
            output.setReceiveDepartmentLangLang(wareStockout.getReceiveDepartment());
            output.setStockoutStatusLangLang(wareStockout.getStockoutStatus());
            output.setIsStockSbsLangLang(wareStockout.getIsStockSbs());
            output.setDetailOutputs(getStockDetailList(wareStockout));

            outputs.add(output);
        }
        return outputs;
    }

	/**
	 * 根据领料单号箱号获取总价
	 * @param referralNo
	 * @param containerNo
	 * @return
	 */
	@Override
	public BigDecimal getTotalAmount(String referralNo, String containerNo) {
    	Double totalAmount = 0D;
    	WareStockoutExample example = new WareStockoutExample();
		WareStockoutExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andNoEqualTo(referralNo);
		List<WareStockout> wareStockouts = stockoutMapper.selectByExample(example);
		for (WareStockout wareStockout : wareStockouts) {
			WareStockoutDetailExample detailExample = new WareStockoutDetailExample();
			WareStockoutDetailExample.Criteria detailCriteria = detailExample.createCriteria();
			detailCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			detailCriteria.andContainerNoEqualTo(containerNo);
			List<WareStockoutDetail> wareStockoutDetails = stockoutDetailMapper.selectByExample(detailExample);
			for (WareStockoutDetail wareStockoutDetail : wareStockoutDetails) {
				StockOutput stock = stockService.getStockByBatch(wareStockoutDetail.getSparePartsBatch(), wareStockoutDetail.getSpareParts());
				totalAmount += stock.getUnitPrice().doubleValue() * wareStockoutDetail.getStockoutNum();
			}
		}
		return BigDecimal.valueOf(totalAmount);
	}

	/**
	 * 根据领料单号获取明细
	 * @param referralNo
	 * @return
	 */
	@Override
	public PickingListDetailOutput getPicking(String referralNo) {
		Result<PickingListDetailOutput> result = productionFeignClient.pickingListDetail(referralNo);
		PickingListDetailOutput data = new PickingListDetailOutput();
		if (result != null && result.getCode() == 0 && result.getData() != null) {
			data = result.getData();
			if(data != null ){
				if(data.getSparesList() != null){
					for (PickingListSparesOutput pickingListSparesOutput : data.getSparesList()) {
						// 查询可切割备件库存数量
						SparePartsOutput sparePart = sparePartsService.getSparePartByNo(pickingListSparesOutput.getSparesNumber());
						if(sparePart != null){
							if(CommonEnum.YES.getCode().equals(sparePart.getIsIncise())){
								//备件可切割
								pickingListSparesOutput.setSurplusQuantity(String.valueOf(stockService.isIncGetNum(sparePart.getKey(),getCurrentCompanyKey(),getCurrentYardKey())));
							}else {
								SearchStockInput searchStockInput=new SearchStockInput();
								searchStockInput.setCompany(getCurrentCompanyKey());
								searchStockInput.setYard(getCurrentYardKey());
								searchStockInput.setSpareParts(sparePart.getKey());
								double sum = stockService.getStock(searchStockInput).stream().mapToDouble(s -> s.getActualSurplusNum()).summaryStatistics().getSum();
								pickingListSparesOutput.setSurplusQuantity(String.valueOf(sum));
							}
						}
						for (PickingListEntryOutput pickingListEntryOutput : pickingListSparesOutput.getPlanStockList()) {
							Double borrowNum = staffBorrowService.getBorrowNum(pickingListEntryOutput.getContainerNo(), sparePartsService.getKeyByNo(pickingListEntryOutput.getSparesNumber()), pickingListEntryOutput.getStaffBorrowType());
							pickingListEntryOutput.setBorrowQuantity(borrowNum);
						}
					}
				}
			}
		}
		return data;
	}

	/**
	 * 根据批次号和备件号取得出库明细
	 */
	@Override
	public List<WareStockoutDetail> getStockOutDetailList(List<String> batchs, String sparePartsKey) {
		WareStockoutDetailExample example = new WareStockoutDetailExample();
		WareStockoutDetailExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andSparePartsBatchIn(batchs);
		criteria.andSparePartsEqualTo(sparePartsKey);
		return stockoutDetailMapper.selectByExample(example);
	}

	/**
	 * 根据id取得上传SBS的出库单 
	 */
	@Override
	public List<WareStockout> getStockOut(List<Integer> ids) {
    	WareStockoutExample example = new WareStockoutExample();
		WareStockoutExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andWareStockoutIdIn(ids);
		criteria.andIsStockSbsEqualTo(CommonEnum.YES.getCode());
		return stockoutMapper.selectByExample(example);
	}
}
