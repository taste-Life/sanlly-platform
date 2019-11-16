package com.sanlly.warehouse.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.enums.StockinEnum;
import com.sanlly.common.enums.StockoutEnum;
import com.sanlly.common.models.output.fixOut.PickingListOutInput;
import com.sanlly.common.models.output.fixOut.PlanStockInput;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.warehouse.constants.BillTypeConstants;
import com.sanlly.warehouse.dao.*;
import com.sanlly.warehouse.entity.*;
import com.sanlly.warehouse.models.input.stockin.AddStockinDetailInput;
import com.sanlly.warehouse.models.input.stockin.AddStockinInput;
import com.sanlly.warehouse.models.output.returnwarehouse.ReturnWarehouseDetailOutput;
import com.sanlly.warehouse.models.output.returnwarehouse.ReturnWarehouseOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutDetailOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutOutput;
import com.sanlly.warehouse.service.WareStockinService;
import com.sanlly.warehouse.service.feign.AuthFeignClient;
import com.sanlly.warehouse.service.feign.ProductionFeignClient;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.returnwarehouse.SearchReturnWarehouseInput;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.service.BillTypeService;
import com.sanlly.warehouse.service.ReturnWarehouseService;
import com.sanlly.warehouse.service.WareSparePartsService;
import com.sanlly.warehouse.service.WareStockService;

/**
 * ClassName: ReturnWarehouseService
 * Description: 退库服务层实现
 * date: 2019/9/19 17:33
 *
 * @author wannt
 * @since JDK 1.8
 */
@Service
public class ReturnWarehouseServiceImpl extends BaseServiceImpl implements ReturnWarehouseService {

	@Autowired
	private WareReturnWarehouseMapper returnWarehouseMapper;

	@Autowired
    private WareReturnWarehouseDetailMapper returnWarehouseDetailMapper;

	@Autowired
    private WareStockoutMapper stockoutMapper;

	@Autowired
    private WareStockoutDetailMapper stockoutDetailMapper;

	@Autowired
    private WareStockMapper stockMapper;

	@Autowired
    private BillTypeService billTypeService;

	@Autowired
    private AuthFeignClient authFeignClient;

    @Autowired
    private ProductionFeignClient productionFeignClient;

    @Autowired
    private WareStockinService stockinService;
    @Autowired
    private WareStockService stockService;
    @Autowired
    private WareSparePartsService sparePartsService;
	/**
	 * 添加退库单
	 */
	@Override
	@Transactional
	public void addReturnWarehouse(StockoutOutput input) {
	    AddStockinInput addInput = new AddStockinInput();
	    addInput.setCompany(input.getCompany());
	    addInput.setEntryWarehouse(input.getWarehouse());
	    addInput.setBillType(input.getBillType());
	    addInput.setNo(input.getNo());
	    addInput.setAuditStatus(AuditStateEnum.AUDITED.getCode());
	    addInput.setEntryStatus(StockinEnum.YESIN.getCode());
        PickingListOutInput pickingListOutInput = new PickingListOutInput();
        pickingListOutInput.setReferralNo(input.getNo());
        List<PlanStockInput> planStockInputs = new ArrayList<>();
        pickingListOutInput.setPlanStockList(planStockInputs);
		WareReturnWarehouse returnWarehouse = new WareReturnWarehouse();
        returnWarehouse.setBillType(BillTypeConstants.LLD);
        returnWarehouse.setCreateTime(new Date());
        returnWarehouse.setCreateUser(getCurrentUserId());
        returnWarehouse.setIsDel(PlatformConstants.ISDEL_NO);
        returnWarehouse.setNo(input.getNo());
        returnWarehouse.setReturnDate(new Date());
        returnWarehouse.setReturnNo(billTypeService.getBillNumberByKey(BillTypeConstants.TK));
        returnWarehouse.setStockoutNo(input.getStockoutNo());
        returnWarehouse.setOperator(getCurrentUserId());
        returnWarehouse.setReturnReason(input.getReasonsRejection());
        returnWarehouseMapper.insert(returnWarehouse);
        List<AddStockinDetailInput> addDetailInputs = new ArrayList<>();
        for (StockoutDetailOutput detailOutput : input.getDetailOutputs()) {
            AddStockinDetailInput addDetailInput = new AddStockinDetailInput();
            addDetailInput.setEntryPrice(detailOutput.getUnitPrice());
            addDetailInput.setWarehouseType(detailOutput.getWarehouseType());
            addDetailInput.setWarehouse(input.getWarehouse());
            addDetailInput.setStockinBatch(detailOutput.getSparePartsBatch());
            addDetailInput.setStorageLocation(detailOutput.getStorageLocation());
            addDetailInput.setEntryNum(detailOutput.getReturnNum());
            addDetailInput.setSpareParts(detailOutput.getSpareParts());
            addDetailInputs.add(addDetailInput);
            PlanStockInput planStockInput = new PlanStockInput();
            planStockInput.setReferralEntryId(detailOutput.getReferralDetailId());

            // 需要获取领料数量
            planStockInput.setQuantity(String.valueOf(detailOutput.getReturnNum() / detailOutput.getStockoutNum() * detailOutput.getProdNum()));


            planStockInputs.add(planStockInput);
            WareReturnWarehouseDetail detail = new WareReturnWarehouseDetail();
            detail.setCreateTime(new Date());
            detail.setCreateUser(getCurrentUserId());
            detail.setIsDel(PlatformConstants.ISDEL_NO);
            detail.setOperator(getCurrentUserId());
            detail.setReturnDate(new Date());
            detail.setReturnId(returnWarehouse.getWareReturnWarehouseId());
            detail.setReturnNum(detailOutput.getReturnNum());
            detail.setSpareParts(detailOutput.getSpareParts());
            detail.setSparePartsBatch(detailOutput.getSparePartsBatch());
            returnWarehouseDetailMapper.insert(detail);

            // 修改出库单
            WareStockoutDetail wareStockoutDetail = stockoutDetailMapper.selectByPrimaryKey(detailOutput.getWareStockoutOrderDetailId());
            Double b =  wareStockoutDetail.getStockoutNum();
            Boolean flag = true;
            wareStockoutDetail.setStockoutNum(wareStockoutDetail.getStockoutNum() - detailOutput.getReturnNum());
            if(b != wareStockoutDetail.getStockoutNum()){
                if(wareStockoutDetail.getStockoutNum() == 0){
                    wareStockoutDetail.setStockoutStatus(StockoutEnum.RETURN.getCode());
                }else {
                    wareStockoutDetail.setStockoutStatus(StockoutEnum.PORTIONRETURN.getCode());
                    flag = false;
                }
            }
            WareStockout wareStockout = stockoutMapper.selectByPrimaryKey(input.getWareStockoutId());
            wareStockout.setUpdateTime(new Date());
            wareStockout.setUpdateUser(getCurrentUserId());
            if(flag){
                wareStockout.setStockoutStatus(StockoutEnum.RETURN.getCode());
            }else {
                wareStockout.setStockoutStatus(StockoutEnum.PORTIONRETURN.getCode());
            }
            stockoutMapper.updateByPrimaryKeySelective(wareStockout);
            stockoutDetailMapper.updateByPrimaryKeySelective(wareStockoutDetail);

            // 修改库存
            WareStockExample stockExample = new WareStockExample();
            WareStockExample.Criteria stockCriteria = stockExample.createCriteria();
            stockCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            stockCriteria.andSparePartsBatchEqualTo(detailOutput.getSparePartsBatch());
            stockCriteria.andSparePartsEqualTo(detailOutput.getSpareParts());
            WareStock stock = stockMapper.selectByExample(stockExample).get(0);

            if(stock.getSurplusArea() != null && stock.getSurplusArea() != 0){
                // 有面积需退面积
                stock.setSurplusArea(stock.getSurplusArea() + detailOutput.getStockoutArea());
            }else if(stock.getLength() != null && stock.getLength() != 0 && (stock.getWidth() == null || stock.getWidth() == 0)){
                // 有长度需退长度
                stock.setLength(stock.getLength() + detailOutput.getLength());
            }
            // 退数量
//            if(!stockService.getWarehouseLockStatus(stock.getWarehouse())) {
//            }
            stock.setSurplusNum(stock.getSurplusNum() + detailOutput.getReturnNum());
            stock.setActualSurplusNum(stock.getActualSurplusNum() + detailOutput.getReturnNum());

            stockMapper.updateByPrimaryKeySelective(stock);
        }
        pickingListOutInput.setPlanStockList(planStockInputs);
        productionFeignClient.pickingListBack(pickingListOutInput);


        AddStockinDetailInput[] arr = new AddStockinDetailInput[addDetailInputs.size()];
        AddStockinDetailInput[] addStockinDetailInputs = addDetailInputs.toArray(arr);
        addInput.setStockinDetail(addStockinDetailInputs);
        stockinService.addStockin(addInput);
	}

	/**
	 * 退库单分页列表
	 */
	@Override
	public PagedList<ReturnWarehouseOutput> getReturnWarehouses(SearchReturnWarehouseInput input) {
        WareReturnWarehouseExample example = new WareReturnWarehouseExample();
        WareReturnWarehouseExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        example.setOrderByClause("create_time desc");
        if(input.getRetuenNo() != null && input.getRetuenNo() != ""){
            criteria.andReturnNoLike("%"+input.getRetuenNo()+"%");
        }
        if(input.getStartDate()!=null && input.getEndDate()!=null){
            criteria.andCreateTimeBetween(input.getStartDate(),input.getEndDate());
        }else if(input.getStartDate()!=null){
            criteria.andCreateTimeBetween(input.getStartDate(),new Date());
        }else if(input.getEndDate()!=null){
            criteria.andCreateTimeBetween(new Date(0),input.getEndDate());
        }
        if(StringUtils.isNotEmpty(input.getSparePartsNo())) {
        	List<String> keyList = sparePartsService.getSparePartsKeyListByLike(input.getSparePartsNo(), "");
        	WareReturnWarehouseDetailExample detailExample = new WareReturnWarehouseDetailExample();
        	detailExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andSparePartsIn(keyList);
        	List<WareReturnWarehouseDetail> reDetails = returnWarehouseDetailMapper.selectByExample(detailExample);
        	if(reDetails!=null&&reDetails.size()>0) {
        		List<Integer> ids = new ArrayList<Integer>();
        		for(WareReturnWarehouseDetail detail: reDetails) {
        			ids.add(detail.getReturnId());
        		}
        		criteria.andWareReturnWarehouseIdIn(ids);
        	}else {
        		return new PagedList<ReturnWarehouseOutput>(input.getPageIndex(), input.getPageSize(), 0);
        	}
        }
        if(StringUtils.isNotEmpty(input.getContainerNo())) {
        	WareReturnWarehouseExample example2 = new WareReturnWarehouseExample();
        	example2.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            List<WareReturnWarehouse> reList = returnWarehouseMapper.selectByExample(example2);
            if(reList!=null&&reList.size()>0) {
            	List<Integer> ids = new ArrayList<Integer>();
            	for(WareReturnWarehouse returnWarehouse : reList) {
            		WareStockoutExample stockoutExample = new WareStockoutExample();
            		stockoutExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andStockoutNoEqualTo(returnWarehouse.getStockoutNo()).andContainerNoLike("%"+input.getContainerNo()+"%");
            		List<WareStockout> stockouts = stockoutMapper.selectByExample(stockoutExample);
            		if(stockouts!=null&&stockouts.size()>0) {
            			ids.add(returnWarehouse.getWareReturnWarehouseId());
            		}
            	}
            	if(ids!=null&&ids.size()>0) {
            		criteria.andWareReturnWarehouseIdIn(ids);
            	}else {
            		return new PagedList<ReturnWarehouseOutput>(input.getPageIndex(), input.getPageSize(), 0);
            	}
            }else {
            	return new PagedList<ReturnWarehouseOutput>(input.getPageIndex(), input.getPageSize(), 0);
            }
        }
        Integer totalItemCount = (int) returnWarehouseMapper.countByExample(example);
        PagedList<ReturnWarehouseOutput> pagedList = new PagedList<>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<WareReturnWarehouse> wareReturnWarehouses = returnWarehouseMapper.selectByExample(example);
        List<ReturnWarehouseOutput> outputs = new ArrayList<>();
        for (WareReturnWarehouse wareReturnWarehouse : wareReturnWarehouses) {
            ReturnWarehouseOutput output = new ReturnWarehouseOutput();
            BeanUtils.copyProperties(wareReturnWarehouse,output);
            //获取箱号
            WareStockoutExample stockoutExample = new WareStockoutExample();
    		stockoutExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andStockoutNoEqualTo(wareReturnWarehouse.getStockoutNo());
    		List<WareStockout> stockouts = stockoutMapper.selectByExample(stockoutExample);
    		if(stockouts!=null&&stockouts.size()>0) {
    			WareStockout stockout = stockouts.get(0);
    			output.setContainerNo(stockout.getContainerNo());
    		}
            if(wareReturnWarehouse.getCreateUser() != null){
                output.setCreateUserStr(authFeignClient.getUserInfo(wareReturnWarehouse.getCreateUser()).getData().getUserName());

            }
            if(wareReturnWarehouse.getUpdateUser() != null){
                output.setUpdateUserStr(authFeignClient.getUserInfo(wareReturnWarehouse.getUpdateUser()).getData().getUserName());

            }
            output.setCreateTimeStr(DateUtil.date2String(wareReturnWarehouse.getCreateTime()));
            output.setUpdateTimeStr(DateUtil.date2String(wareReturnWarehouse.getUpdateTime()));
            output.setDetailOutputList(getDetail(wareReturnWarehouse.getWareReturnWarehouseId()));
            outputs.add(output);
        }
        pagedList.getDataList().addAll(outputs);
        return pagedList;
    }

    /**
     * 获取退库单明细列表
     * @param id
     * @return
     */
    private List<ReturnWarehouseDetailOutput> getDetail(Integer id){
        WareReturnWarehouseDetailExample example = new WareReturnWarehouseDetailExample();
        WareReturnWarehouseDetailExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andReturnIdEqualTo(id);
        List<WareReturnWarehouseDetail> details = returnWarehouseDetailMapper.selectByExample(example);
        List<ReturnWarehouseDetailOutput> outputs = new ArrayList<>();
        for (WareReturnWarehouseDetail detail : details) {
            ReturnWarehouseDetailOutput output = new ReturnWarehouseDetailOutput();
            BeanUtils.copyProperties(detail,output);
            output.setSparePartsLangLang(detail.getSpareParts());
            output.setSparePartsNo(sparePartsService.getSparePartsBrief(new EditSparePartsInput(detail.getSpareParts())).getSparePartsNo());
            outputs.add(output);
        }
        return outputs;
    }


}
