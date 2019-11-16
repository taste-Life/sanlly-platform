package com.sanlly.warehouse.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.StockoutEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.warehouse.constants.BillTypeConstants;
import com.sanlly.warehouse.constants.DefaultConstants;
import com.sanlly.warehouse.dao.WareStockMapper;
import com.sanlly.warehouse.dao.WareStockoutApplyDetailMapper;
import com.sanlly.warehouse.dao.WareStockoutApplyMapper;
import com.sanlly.warehouse.entity.*;
import com.sanlly.warehouse.enums.OutAuditStateEnum;
import com.sanlly.warehouse.enums.OutStatusEnum;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.stock.SearchStockInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutDetailInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutInput;
import com.sanlly.warehouse.models.input.stockoutApply.AddStockoutApplyDetailInout;
import com.sanlly.warehouse.models.input.stockoutApply.AddStockoutApplyInput;
import com.sanlly.warehouse.models.input.stockoutApply.SearchStockoutApplyInput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutDetailOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutOutput;
import com.sanlly.warehouse.models.output.stockoutApply.StockoutApplyDetailOutput;
import com.sanlly.warehouse.models.output.stockoutApply.StockoutApplyOutput;
import com.sanlly.warehouse.service.*;
import com.sanlly.warehouse.service.feign.AuthFeignClient;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * ClassName: WareStockoutApplyServiceImpl
 * Description: 出库申请服务层实现
 * date: 2019/8/16 13:02
 *
 * @author wannt
 * @since JDK 1.8
 */
@Service
public class WareStockoutApplyServiceImpl extends BaseServiceImpl implements WareStockoutApplyService {

    @Autowired
    private WareStockoutApplyMapper stockoutApplyMapper;

    @Autowired
    private WareStockoutApplyDetailMapper stockoutApplyDetailMapper;

    @Autowired
    private WareStockoutService stockoutService;

    @Autowired
    private WareStockService stockService;

    @Autowired
    private WareStockMapper stockMapper;

    @Autowired
    private BillTypeService billTypeService;

    @Autowired
    private AuthFeignClient authFeignClient;

    @Autowired
    private WareSparePartsService sparePartsService;

    @Autowired
    private WareDeliveryService deliveryService;

    /**
     * 分页查询出库申请
     * @param input
     * @return
     */
    @Override
    public PagedList<StockoutApplyOutput> stockoutApplyPageList(SearchStockoutApplyInput input) {
        //组装查询条件
        WareStockoutApplyExample example = new WareStockoutApplyExample();
        WareStockoutApplyExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        example.setOrderByClause("create_time desc");
        if(input.getBillType()!=null && input.getBillType() != ""){
            criteria.andBillTypeEqualTo(input.getBillType());
        }
        if(input.getNo()!=null && input.getNo()!=""){
            criteria.andNoLike("%"+input.getNo()+"%");
        }
        if(input.getReceiveDepartment()!=null && input.getReceiveDepartment()!=""){
            criteria.andReceiveDepartmentEqualTo(input.getReceiveDepartment());
        }
        if(input.getReceiveUser() != null){
            criteria.andReceiveUserEqualTo(input.getReceiveUser());
        }
        if(input.getStockoutApplyNo()!=null && input.getStockoutApplyNo()!=""){
            criteria.andStockoutApplyNoLike("%"+input.getStockoutApplyNo()+"%");
        }
        if(input.getAuditStatus()!=null && input.getAuditStatus()!=""){
            criteria.andAuditStatusEqualTo(input.getAuditStatus());
        }
        if(input.getWarehouse()!=null && input.getWarehouse()!=""){
            criteria.andWarehouseEqualTo(input.getWarehouse());
        }
        if(input.getContainerNo()!=null&&input.getContainerNo()!="") {
        	criteria.andContainerNoLike("%"+input.getContainerNo()+"%");
//        	WareStockoutApplyDetailExample exampleDetail = new WareStockoutApplyDetailExample();
//            WareStockoutApplyDetailExample.Criteria criteriaDetail = exampleDetail.createCriteria();
//            criteriaDetail.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
//            criteriaDetail.andContainerNoLike("%"+input.getContainerNo()+"%");
//            List<WareStockoutApplyDetail> applyDetails = stockoutApplyDetailMapper.selectByExample(exampleDetail);
//            List<Integer> ids = new ArrayList<Integer>();
//            if(applyDetails!=null&&applyDetails.size()>0) {
//            	for(WareStockoutApplyDetail detail:applyDetails) {
//            		ids.add(detail.getWareStockoutApplyId());
//            	}
//            	criteria.andWareStockoutApplyIdIn(ids);
//            }else {
//            	return new PagedList<>(input.getPageIndex(),input.getPageSize(),0);
//            }
        }
        if(input.getStartDate()!=null && input.getEndDate()!=null){
            criteria.andCreateTimeBetween(input.getStartDate(),input.getEndDate());
        }else if(input.getStartDate()!=null){
            criteria.andCreateTimeBetween(input.getStartDate(),new Date());
        }else if(input.getEndDate()!=null){
            criteria.andCreateTimeBetween(new Date(0),input.getEndDate());
        }

        if((input.getSparePartsName()!=null && input.getSparePartsName()!="") || (input.getSparePartsNo()!=null && input.getSparePartsNo()!="")){
            //封装明细查询条件
            WareStockoutApplyDetailExample exampleDetail = new WareStockoutApplyDetailExample();
            WareStockoutApplyDetailExample.Criteria criteriaDetail = exampleDetail.createCriteria();
            criteriaDetail.andIsDelEqualTo(PlatformConstants.ISDEL_NO);

            //封装库存查询条件
            List<String> spareParts = sparePartsService.getSparePartsKeyListByLike(input.getSparePartsNo(), input.getSparePartsName());

            /*WareStockExample stockExample = new WareStockExample();
            WareStockExample.Criteria stockCrieria = stockExample.createCriteria();
            stockCrieria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            if(input.getSparePartsName()!=null && input.getSparePartsName()!=""){
                stockCrieria.andSparePartsNameLike("%"+input.getSparePartsName()+"%");
            }
            if(input.getSparePartsNo()!=null && input.getSparePartsNo()!=""){
                stockCrieria.andSparePartsNoLike("%"+input.getSparePartsNo()+"%");
            }
            List<WareStock> wareStocks = stockMapper.selectByExample(stockExample);
            List<String> sparePartsKeyList = new ArrayList<>();
            for (WareStock wareStock : wareStocks) {
                sparePartsKeyList.add(wareStock.getSpareParts());
            }*/
            if (!CollectionUtils.isEmpty(spareParts)){
                criteriaDetail.andSparePartsIn(spareParts);
            }
            List<WareStockoutApplyDetail> stockoutApplyDetails = stockoutApplyDetailMapper.selectByExample(exampleDetail);
            List<Integer> stockoutApplyIdList = new ArrayList<>();
            for (WareStockoutApplyDetail applyDetail : stockoutApplyDetails) {
                stockoutApplyIdList.add(applyDetail.getWareStockoutApplyId());
            }
            criteria.andWareStockoutApplyIdIn(stockoutApplyIdList);
        }
        //查询页数
        Integer totalItemCount =(int)stockoutApplyMapper.countByExample(example);
        PagedList<StockoutApplyOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        //组装返回数据
        List<WareStockoutApply> stockoutApplies = stockoutApplyMapper.selectByExample(example);
        List<StockoutApplyOutput> outputs = new ArrayList<>();
        for (WareStockoutApply stockoutApply : stockoutApplies) {
            StockoutApplyOutput output = new StockoutApplyOutput();
            BeanUtils.copyProperties(stockoutApply,output);
            output.setCompanyLangLang(stockoutApply.getCompany());
            output.setStatusLangLang(stockoutApply.getStatus());
            output.setWarehouseLangLang(stockoutApply.getWarehouse());
            output.setAuditStatusLangLang(stockoutApply.getAuditStatus());
            output.setWarehouseTypeLangLang(stockoutApply.getWarehouseType());
            output.setBillTypeLangLang(stockoutApply.getBillType());
            output.setReceiveDepartmentLangLang(stockoutApply.getReceiveDepartment());
            if(stockoutApply.getReceiveUser() != null){
                UserInfoOutput data = authFeignClient.getUserInfo(stockoutApply.getReceiveUser()).getData();
                if(data != null){
                    output.setReceiveUserStr(data.getUserName());
                }
            }
            if(stockoutApply.getCreateUser()!=null) {
            	output.setOperatorName(getUserNameByUserId(stockoutApply.getCreateUser()));
            }
            if(stockoutApply.getCreateTime()!=null) {
            	output.setOperatorTime(new SimpleDateFormat("yyyy-MM-dd").format(stockoutApply.getCreateTime()));
            }
            output.setReceiveUser(stockoutApply.getReceiveUser());
            output.setStockoutStatusLangLang(stockoutApply.getStockoutStatus());
            output.setApplyDetailList(getApplyDetail(stockoutApply.getWareStockoutApplyId()));
            outputs.add(output);
        }
        pagedList.getDataList().addAll(outputs);
        return pagedList;
    }


    /**
     * 新增出库申请
     * @param input
     */
    @Override
    @Transactional
    public void addStockoutApply(AddStockoutApplyInput input) {
        WareStockoutApply stockoutApply = new WareStockoutApply();
        BeanUtils.copyProperties(input,stockoutApply);
        stockoutApply.setAuditStatus(OutAuditStateEnum.UNAUDIT.getCode());
        stockoutApply.setIsDel(PlatformConstants.ISDEL_NO);
        stockoutApply.setStatus(OutStatusEnum.NO.getCode());
        stockoutApply.setStockoutStatus(StockoutEnum.NOTOUT.getCode());
        stockoutApply.setStockoutApplyNo(billTypeService.getBillNumberByKey(input.getBillType()));
        stockoutApply.setCompany(getCurrentCompanyKey());
        stockoutApply.setCreateTime(new Date());
        stockoutApply.setCreateUser(getCurrentUserId());
        stockoutApplyMapper.insert(stockoutApply);
        for (AddStockoutApplyDetailInout detailInout : input.getStockoutApplydetail()) {
            WareStockoutApplyDetail detail = new WareStockoutApplyDetail();
            detail.setLength(DefaultConstants.DOUBLEDEFAULT);
            detail.setStockoutArea(DefaultConstants.DOUBLEDEFAULT);
            detail.setStockoutNum(DefaultConstants.DOUBLEDEFAULT);
            detail.setStockoutSurplusNum(DefaultConstants.DOUBLEDEFAULT);
            detail.setStockoutSurplusArea(DefaultConstants.DOUBLEDEFAULT);
            detail.setWidth(DefaultConstants.DOUBLEDEFAULT);
            BeanUtils.copyProperties(detailInout,detail);
            detail.setWareStockoutApplyId(stockoutApply.getWareStockoutApplyId());
            detail.setCreateTime(new Date());
            detail.setStockoutSurplusNum(detailInout.getStockoutNum());
            detail.setStockoutStatus(StockoutEnum.NOTOUT.getCode());
            detail.setCreateUser(getCurrentUserId());
            detail.setIsDel(PlatformConstants.ISDEL_NO);
            detail.setYard(getCurrentYardKey());

            stockoutApplyDetailMapper.insert(detail);
        }
        if(BillTypeConstants.SUPPLIES.equals(input.getBillType())){
            if("LKWASPCRGE000004".equals(stockService.getStockByBatch(input.getStockoutApplydetail()[0].getSparePartsBatch(),input.getStockoutApplydetail()[0].getSpareParts()).getSparePartsCategories())){
                Integer[] arr = new Integer[1];
                arr[0] = stockoutApply.getWareStockoutApplyId();
                auditPassStockoutApplyOut(arr);
            }
        }
    }

    /**
     * 修改出库申请
     * @param input
     */
    @Override
    @Transactional
    public void editStockoutApply(StockoutApplyOutput input) {
        WareStockoutApply stockoutApply = stockoutApplyMapper.selectByPrimaryKey(input.getWareStockoutApplyId());
        if(!OutAuditStateEnum.UNAUDIT.getCode().equals(input.getAuditStatus()) && !OutAuditStateEnum.REJECTED.getCode().equals(input.getAuditStatus())){
            throw new RuntimeException("auditErr");
        }
        BeanUtils.copyProperties(input,stockoutApply);
        stockoutApply.setAuditStatus(OutAuditStateEnum.UNAUDIT.getCode());
        stockoutApply.setUpdateUser(getCurrentUserId());
        stockoutApply.setUpdateTime(new Date());
        stockoutApplyMapper.updateByPrimaryKeySelective(stockoutApply);
        WareStockoutApplyDetailExample example = new WareStockoutApplyDetailExample();
        WareStockoutApplyDetailExample.Criteria criteria = example.createCriteria();
        criteria.andWareStockoutApplyIdEqualTo(stockoutApply.getWareStockoutApplyId());
        WareStockoutApplyDetail del = new WareStockoutApplyDetail();
        del.setIsDel(PlatformConstants.ISDEL_YES);
        del.setUpdateUser(getCurrentUserId());
        del.setUpdateTime(new Date());
        stockoutApplyDetailMapper.updateByExampleSelective(del,example);
        for (StockoutApplyDetailOutput detailInout : input.getApplyDetailList()) {
            WareStockoutApplyDetail detail = new WareStockoutApplyDetail();
            BeanUtils.copyProperties(detailInout,detail);
            detail.setWareStockoutOrderDetailId(null);
            detail.setStockoutNum(detailInout.getStockoutNum());
            detail.setWareStockoutApplyId(stockoutApply.getWareStockoutApplyId());
            detail.setIsDel(PlatformConstants.ISDEL_NO);
            detail.setCreateTime(new Date());
            detail.setCreateUser(getCurrentUserId());
            stockoutApplyDetailMapper.insert(detail);
        }
    }


    /**
     * 批量审核通过出库申请
     * @param ids
     */
    @Override
    @Transactional
    public void auditPassStockoutApply(Integer[] ids) {
        WareStockoutApplyExample example = new WareStockoutApplyExample();
        WareStockoutApplyExample.Criteria criteria = example.createCriteria();
        criteria.andWareStockoutApplyIdIn(Arrays.asList(ids));
        List<WareStockoutApply> applies = stockoutApplyMapper.selectByExample(example);
        for (WareStockoutApply apply : applies) {
            if(!OutAuditStateEnum.UNAUDIT.getCode().equals(apply.getAuditStatus())){
                throw new RuntimeException("auditErr");
            }
        }
        WareStockoutApply apply = new WareStockoutApply();
        apply.setUpdateTime(new Date());
        apply.setUpdateUser(getCurrentUserId());
        apply.setAuditStatus(OutAuditStateEnum.AUDITED.getCode());
        //apply.setStockoutStatus(StockoutEnum.YESOUT.getCode());
        stockoutApplyMapper.updateByExampleSelective(apply,example);
    }

    /**
     * 批量审核通过出库申请 并出库
     * @param ids
     */
    @Override
    @Transactional
    public void auditPassStockoutApplyOut(Integer[] ids) {
        WareStockoutApplyExample example = new WareStockoutApplyExample();
        WareStockoutApplyExample.Criteria criteria = example.createCriteria();
        criteria.andWareStockoutApplyIdIn(Arrays.asList(ids));
        List<WareStockoutApply> applies = stockoutApplyMapper.selectByExample(example);
        for (WareStockoutApply apply : applies) {
            if(!OutAuditStateEnum.UNAUDIT.getCode().equals(apply.getAuditStatus())){
                throw new RuntimeException("auditErr");
            }
        }
        WareStockoutApply apply = new WareStockoutApply();
        apply.setUpdateTime(new Date());
        apply.setUpdateUser(getCurrentUserId());
        apply.setAuditStatus(OutAuditStateEnum.AUDITED.getCode());
        apply.setStockoutStatus(StockoutEnum.YESOUT.getCode());
        stockoutApplyMapper.updateByExampleSelective(apply,example);
        //生成出库单
        createStockout(ids);
    }

    /**
     * 领导批量审核通过出库申请
     * @param ids
     */
    @Override
    @Transactional
    public void leadAuditPassStockoutApply(Integer[] ids) {
        WareStockoutApplyExample example = new WareStockoutApplyExample();
        WareStockoutApplyExample.Criteria criteria = example.createCriteria();
        criteria.andWareStockoutApplyIdIn(Arrays.asList(ids));
        List<WareStockoutApply> applies = stockoutApplyMapper.selectByExample(example);
        for (WareStockoutApply apply : applies) {
            if(!OutAuditStateEnum.AUDITED.getCode().equals(apply.getAuditStatus()) && !OutAuditStateEnum.UNAUDIT.getCode().equals(apply.getAuditStatus())){
                throw new RuntimeException("auditErr");
            }
        }
        WareStockoutApply apply = new WareStockoutApply();
        apply.setUpdateTime(new Date());
        apply.setUpdateUser(getCurrentUserId());
        apply.setAuditStatus(OutAuditStateEnum.LEADAUDITED.getCode());
        apply.setStockoutStatus(StockoutEnum.YESOUT.getCode());
        stockoutApplyMapper.updateByExampleSelective(apply,example);
        for (Integer id : ids) {
            List<StockoutApplyDetailOutput> applyDetail = getApplyDetail(id);
            for (StockoutApplyDetailOutput detailOutput : applyDetail) {
                WareStockoutApplyDetail detail = stockoutApplyDetailMapper.selectByPrimaryKey(detailOutput.getWareStockoutOrderDetailId());
                detail.setStockoutStatus(StockoutEnum.YESOUT.getCode());
                stockoutApplyDetailMapper.updateByPrimaryKeySelective(detail);
            }
        }
        //生成出库单
        createStockout(ids);
    }


    /**
     * 批量驳回出库申请
     * @param ids
     * @param reasonRejection
     */
    @Override
    @Transactional
    public void auditRejectStockoutApply(Integer[] ids, String reasonRejection) {
        WareStockoutApplyExample example = new WareStockoutApplyExample();
        WareStockoutApplyExample.Criteria criteria = example.createCriteria();
        criteria.andWareStockoutApplyIdIn(Arrays.asList(ids));
        List<WareStockoutApply> applies = stockoutApplyMapper.selectByExample(example);
        for (WareStockoutApply apply : applies) {
            if(!OutAuditStateEnum.AUDITED.getCode().equals(apply.getAuditStatus()) && !OutAuditStateEnum.UNAUDIT.getCode().equals(apply.getAuditStatus())){
                throw new RuntimeException("auditErr");
            }
        }
        WareStockoutApply apply = new WareStockoutApply();
        apply.setUpdateTime(new Date());
        apply.setUpdateUser(getCurrentUserId());
        apply.setAuditStatus(OutAuditStateEnum.REJECTED.getCode());
        apply.setReasonsRejection(reasonRejection);
        stockoutApplyMapper.updateByExampleSelective(apply,example);
    }


    /**
     * 批量修改出库申请单状态
     * @param ids
     */
    @Override
    @Transactional
    public void editStockoutApplyStatus(Integer[] ids) {
        WareStockoutApplyExample example = new WareStockoutApplyExample();
        WareStockoutApplyExample.Criteria criteria = example.createCriteria();
        criteria.andWareStockoutApplyIdIn(Arrays.asList(ids));
        List<WareStockoutApply> applies = stockoutApplyMapper.selectByExample(example);
        for (WareStockoutApply apply : applies) {
            if(!OutStatusEnum.NO.getCode().equals(apply.getStatus())){
                throw new RuntimeException("statusErr");
            }
        }

        WareStockoutApply apply = new WareStockoutApply();
        apply.setUpdateTime(new Date());
        apply.setUpdateUser(getCurrentUserId());
        apply.setStatus(OutStatusEnum.YES.getCode());
        stockoutApplyMapper.updateByExampleSelective(apply,example);
    }

//    /**
//     * 出库回调
//     * @param input
//     */
//    @Override
//    @Transactional
//    public void applyStockedManage(StockoutOutput input) {
//        //修改主单据出库状态
//        WareStockoutApplyExample example = new WareStockoutApplyExample();
//        WareStockoutApplyExample.Criteria criteria = example.createCriteria();
//        criteria.andStockoutApplyNoEqualTo(input.getNo());
//        WareStockoutApply stockoutApply = stockoutApplyMapper.selectByExample(example).get(0);
//        stockoutApply.setStockoutStatus(input.getStockoutStatus());
//
//        //修改明细出库状态
//        WareStockoutApplyDetailExample detailExample = new WareStockoutApplyDetailExample();
//        WareStockoutApplyDetailExample.Criteria detailCriteria = detailExample.createCriteria();
//        detailCriteria.andWareStockoutApplyIdEqualTo(stockoutApply.getWareStockoutApplyId());
//        detailCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
//        List<WareStockoutApplyDetail> applyDetails = stockoutApplyDetailMapper.selectByExample(detailExample);
//        for (StockoutDetailOutput detailOutput : input.getDetailOutputs()) {
//            for (WareStockoutApplyDetail applyDetail : applyDetails) {
//                if(detailOutput.getSpareParts().equals(applyDetail.getSpareParts())&&detailOutput.getSparePartsBatch().equals(applyDetail.getSparePartsBatch())){
//                    if(!detailOutput.getStockoutStatus().equals(applyDetail.getStockoutStatus())){
//                        applyDetail.setStockoutStatus(detailOutput.getStockoutStatus());
//                        stockoutApplyDetailMapper.updateByPrimaryKeySelective(applyDetail);
//                    }
//                }
//            }
//        }
//        stockoutApplyMapper.updateByPrimaryKeySelective(stockoutApply);
//    }

    /**
     * 根据申请单id查询申请单明细
     * @param stockoutApplyId
     * @return
     */
    public List<StockoutApplyDetailOutput> getApplyDetail(Integer stockoutApplyId){
        WareStockoutApplyDetailExample example = new WareStockoutApplyDetailExample();
        WareStockoutApplyDetailExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andWareStockoutApplyIdEqualTo(stockoutApplyId);
        List<WareStockoutApplyDetail> applyDetail = stockoutApplyDetailMapper.selectByExample(example);

        List<StockoutApplyDetailOutput> detailOutputs = new ArrayList<>();
        for (WareStockoutApplyDetail stockoutApplyDetail : applyDetail) {
            StockoutApplyDetailOutput detailOutput = new StockoutApplyDetailOutput();
            BeanUtils.copyProperties(stockoutApplyDetail,detailOutput);
            detailOutput.setYardLangLang(stockoutApplyDetail.getYard());
            detailOutput.setSparePartsLangLang(stockoutApplyDetail.getSpareParts());
            detailOutput.setStockoutStatusLangLang(stockoutApplyDetail.getStockoutStatus());
            detailOutput.setDefaultWarehouseTypeLangLang(stockoutApplyDetail.getDefaultWarehouseType());
            detailOutput.setContainerNo(stockoutApplyDetail.getContainerNo());
            if(detailOutput.getSparePartsBatch() != null && detailOutput.getSparePartsBatch() != ""){
                StockOutput stock = stockService.getStockByBatch(detailOutput.getSparePartsBatch(), detailOutput.getSpareParts());
                if(stock != null){
                    detailOutput.setStockNum(stock.getActualSurplusNum());
                    detailOutput.setSparePartsCategories(stock.getSparePartsCategories());
                    detailOutput.setStorageLocation(stock.getStorageLocation());
                    detailOutput.setWarehouseType(stock.getWarehouseType());
                    detailOutput.setWarehouseTypeLangLang(stock.getWarehouseType());
                    detailOutput.setSparePartsCategoriesLangLang(stock.getSparePartsCategories());
                    detailOutput.setSparePartsNo(stock.getSparePartsNo());
                }
            }else {
                SparePartsOutput spareParts = sparePartsService.getSpareParts(new EditSparePartsInput(stockoutApplyDetail.getSpareParts()));
                if(spareParts != null){
                    detailOutput.setSparePartsCategories(spareParts.getSparePartsCategories());
                    detailOutput.setWarehouseTypeLangLang(spareParts.getDefaultWarehouseType());
                    detailOutput.setSparePartsCategoriesLangLang(spareParts.getSparePartsCategories());
                    detailOutput.setSparePartsNo(spareParts.getSparePartsNo());
                }
            }
            detailOutput.setWareStockoutApplyId(stockoutApplyDetail.getWareStockoutApplyId());
            detailOutput.setWareStockoutOrderDetailId(stockoutApplyDetail.getWareStockoutOrderDetailId());
            detailOutputs.add(detailOutput);
        }
        return detailOutputs;
    }

    /**
     * 生成出库单
     */
    @Transactional
    public void createStockout(Integer[] ids){
        WareStockoutApplyExample example = new WareStockoutApplyExample();
        WareStockoutApplyExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andWareStockoutApplyIdIn(Arrays.asList(ids));
        List<WareStockoutApply> stockoutApplies = stockoutApplyMapper.selectByExample(example);

        for (WareStockoutApply stockoutApply : stockoutApplies) {
            AddStockoutInput stockoutInput = new AddStockoutInput();
            BeanUtils.copyProperties(stockoutApply,stockoutInput);
            stockoutInput.setNo(stockoutApply.getStockoutApplyNo());
            List<AddStockoutDetailInput> inputList = new ArrayList<>();
            for (StockoutApplyDetailOutput detail : getApplyDetail(stockoutApply.getWareStockoutApplyId())) {
                AddStockoutDetailInput detailInput = new AddStockoutDetailInput();
                BeanUtils.copyProperties(detail,detailInput);
                detailInput.setDefaultWarehouseType(detail.getDefaultWarehouseType());
                inputList.add(detailInput);
            }
            AddStockoutDetailInput[] array=inputList.toArray(new AddStockoutDetailInput[inputList.size()]);
            stockoutInput.setStockoutDetailInputList(inputList.toArray(array));
            stockoutService.addStockout(stockoutInput);
        }
    }

    /**
     * 无批次号生成出库单
     */
    @Override
    @Transactional
    public void createOut(StockoutApplyOutput input){
        AddStockoutInput outInput = new AddStockoutInput();
        outInput.setWarehouse(input.getWarehouse());
        outInput.setCompany(input.getCompany());
        outInput.setReceiveUser(input.getReceiveUser());
        outInput.setReceiveDepartment(input.getReceiveDepartment());
        outInput.setBillType(input.getBillType());
        outInput.setNo(input.getNo());
        List<AddStockoutDetailInput> outDetailInputs = new ArrayList<>();
        for (StockoutApplyDetailOutput detailOutput : input.getApplyDetailList()) {
            List<StockOutput> stocks = stockService.autoGetStock(input.getWarehouse(), detailOutput.getSpareParts(), detailOutput.getOutNum());
            for (StockOutput stock : stocks) {
                AddStockoutDetailInput detailInput = new AddStockoutDetailInput();
                detailInput.setDefaultWarehouseType(stock.getDefaultWarehouseType());
                detailInput.setStockoutNum(stock.getActualSurplusNum());
                detailInput.setSpareParts(stock.getSpareParts());
                detailInput.setSparePartsBatch(stock.getSparePartsBatch());
                outDetailInputs.add(detailInput);
            }
        }
        AddStockoutDetailInput[] arr = new AddStockoutDetailInput[outDetailInputs.size()];
        AddStockoutDetailInput[] inputs = outDetailInputs.toArray(arr);
        outInput.setStockoutDetailInputList(inputs);
        stockoutService.addStockout(outInput);

        WareStockoutApply stockoutApply = stockoutApplyMapper.selectByPrimaryKey(input.getWareStockoutApplyId());

        WareStockoutApplyDetailExample detailExample = new WareStockoutApplyDetailExample();
        WareStockoutApplyDetailExample.Criteria criteria = detailExample.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andWareStockoutApplyIdEqualTo(stockoutApply.getWareStockoutApplyId());
        Boolean f = true;
        List<WareStockoutApplyDetail> wareStockoutApplyDetails = stockoutApplyDetailMapper.selectByExample(detailExample);
        for (WareStockoutApplyDetail wareStockoutApplyDetail : wareStockoutApplyDetails) {
            for (StockoutApplyDetailOutput detailOutput : input.getApplyDetailList()) {
                if(wareStockoutApplyDetail.getSpareParts().equals(detailOutput.getSpareParts())){
                    wareStockoutApplyDetail.setStockoutSurplusNum(wareStockoutApplyDetail.getStockoutSurplusNum() - detailOutput.getOutNum());
                    stockoutApplyDetailMapper.updateByPrimaryKeySelective(wareStockoutApplyDetail);
                    if(wareStockoutApplyDetail.getStockoutSurplusNum() > 0){
                        f = false;
                    }
                }
            }
        }
        if(f){
            stockoutApply.setStockoutStatus(StockoutEnum.YESOUT.getCode());
            input.setStockoutStatus(StockoutEnum.YESOUT.getCode());
        }else {
            stockoutApply.setStockoutStatus(StockoutEnum.PORTIONOUT.getCode());
            input.setStockoutStatus(StockoutEnum.PORTIONOUT.getCode());
        }
        stockoutApplyMapper.updateByPrimaryKey(stockoutApply);
        deliveryService.editStockoutStatus(input);
    }
}
