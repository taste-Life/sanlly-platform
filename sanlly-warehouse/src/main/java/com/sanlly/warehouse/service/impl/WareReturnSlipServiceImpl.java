package com.sanlly.warehouse.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.warehouse.constants.BillTypeConstants;
import com.sanlly.warehouse.dao.WareReturnSlipDetailMapper;
import com.sanlly.warehouse.dao.WareReturnSlipMapper;
import com.sanlly.warehouse.dao.WareStockMapper;
import com.sanlly.warehouse.entity.*;
import com.sanlly.warehouse.enums.ReturnEnum;
import com.sanlly.warehouse.models.input.returnSlip.AddReturnSlipDetailInput;
import com.sanlly.warehouse.models.input.returnSlip.AddReturnSlipInput;
import com.sanlly.warehouse.models.input.returnSlip.SearchReturnSlipInput;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.stockin.SearchStockinInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutDetailInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutInput;
import com.sanlly.warehouse.models.output.returnSlip.ReturnSlipDetailOutput;
import com.sanlly.warehouse.models.output.returnSlip.ReturnSlipOutput;
import com.sanlly.warehouse.models.output.stockin.StockinDetailOutput;
import com.sanlly.warehouse.models.output.stockin.StockinOutput;
import com.sanlly.warehouse.service.*;
import com.sanlly.warehouse.service.feign.AuthFeignClient;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * ClassName: WareReturnSlipServiceImpl
 * Description: 退货单服务层实现
 * date: 2019/9/16 10:01
 *
 * @author wannt
 * @since JDK 1.8
 */
@Service
public class WareReturnSlipServiceImpl extends BaseServiceImpl implements WareReturnSlipService {

    @Autowired
    private WareReturnSlipMapper returnSlipMapper;

    @Autowired
    private WareReturnSlipDetailMapper returnSlipDetailMapper;

    @Autowired
    private WareStockService stockService;

    @Autowired
    private WareSparePartsService sparePartsService;

    @Autowired
    private BillTypeService billTypeService;

    @Autowired
    private WareStockoutService stockoutService;

    @Autowired
    private WareStockinService stockinService;

    @Autowired
    private WareStockMapper stockMapper;

    @Autowired
    private AuthFeignClient authFeignClient;

    /**
     *  查询退货单分页列表
     * @param input
     * @return
     */
    @Override
    public PagedList<ReturnSlipOutput> pageList(SearchReturnSlipInput input) {
        // 组装查询条件
        WareReturnSlipExample example = new WareReturnSlipExample();
        WareReturnSlipExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        example.setOrderByClause("create_time desc");
        if(input.getWareReturnSlipId() != null){
            criteria.andWareReturnSlipIdEqualTo(input.getWareReturnSlipId());
        }
        if(input.getAuditStatus() != null && input.getAuditStatus() != ""){
            criteria.andAuditStatusEqualTo(input.getAuditStatus());
        }
        if(input.getCompany() != null && input.getCompany() != ""){
            criteria.andCompanyEqualTo(input.getCompany());
        }
//        else {
//            criteria.andCompanyEqualTo(getCurrentCompanyKey());
//        }
        if(input.getReturnBillNo() != null && input.getReturnBillNo() != ""){
            criteria.andReturnBillNoLike("%"+input.getReturnBillNo()+"%");
        }
        if(input.getReturnStatus() != null && input.getReturnStatus() != ""){
            criteria.andReturnStatusEqualTo(input.getReturnStatus());
        }
        if(input.getSupplier() != null && input.getSupplier() != ""){
            criteria.andSupplierEqualTo(input.getSupplier());
        }
        if(input.getSourceId() != null && input.getSourceId() != ""){
            criteria.andSourceIdLike("%"+input.getSourceId()+"%");
        }
        if(input.getStartDate()!=null && input.getEndDate()!=null){
            criteria.andCreateTimeBetween(input.getStartDate(),input.getEndDate());
        }else if(input.getStartDate()!=null){
            criteria.andCreateTimeBetween(input.getStartDate(),new Date());
        }else if(input.getEndDate()!=null){
            criteria.andCreateTimeBetween(new Date(0),input.getEndDate());
        }

        // 查询页数
        Integer totalItemCount = (int) returnSlipMapper.countByExample(example);
        PagedList<ReturnSlipOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());

        // 组装返回数据
        List<WareReturnSlip> wareReturnSlips = returnSlipMapper.selectByExample(example);
        List<ReturnSlipOutput> outputs = new ArrayList<>();
        for (WareReturnSlip wareReturnSlip : wareReturnSlips) {
            ReturnSlipOutput output = new ReturnSlipOutput();
            BeanUtils.copyProperties(wareReturnSlip,output);
            output.setCompanyLangLang(wareReturnSlip.getCompany());
            SearchStockinInput stockinInput = new SearchStockinInput(1,1);
            stockinInput.setStockinNo(wareReturnSlip.getSourceId());
            StockinOutput stockinOutput = stockinService.stockinPageList(stockinInput).getDataList().get(0);
            output.setWarehouse(stockinOutput.getEntryWarehouse());
            output.setWarehouseLangLang(stockinOutput.getEntryWarehouse());
            output.setReturnDateStr(DateUtil.date2String(wareReturnSlip.getReturnDate()));
            output.setSupplierLangLang(wareReturnSlip.getSupplier());
            output.setAuditStatusLangLang(wareReturnSlip.getAuditStatus());
            output.setInvoiceTypeLangLang(wareReturnSlip.getInvoiceType());
            output.setReturnStatusLangLang(wareReturnSlip.getReturnStatus());
            output.setDetailOutputList(getDetailList(wareReturnSlip.getWareReturnSlipId()));
            output.setCreateTimeStr(DateUtil.date2String(wareReturnSlip.getCreateTime()));
            UserInfoOutput data = authFeignClient.getUserInfo(wareReturnSlip.getCreateUser()).getData();
            if(data != null){
                output.setCreateUserStr(data.getUserName());
            }
            outputs.add(output);
        }
        pagedList.getDataList().addAll(outputs);
        return pagedList;
    }

    /**
     * 新增退货单
     * @param input
     */
    @Override
    @Transactional
    public void add(AddReturnSlipInput input) {
        WareReturnSlip returnSlip = new WareReturnSlip();
        BeanUtils.copyProperties(input,returnSlip);
        returnSlip.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
        returnSlip.setCreateTime(new Date());
        returnSlip.setCompany(getCurrentCompanyKey());
        returnSlip.setCreateUser(getCurrentUserId());
        returnSlip.setIsDel(PlatformConstants.ISDEL_NO);
        returnSlip.setReturnDate(new Date());
        returnSlip.setReturnStatus(ReturnEnum.NO.getCode());
        returnSlip.setReturnBillNo(billTypeService.getBillNumberByKey(BillTypeConstants.CGTH));
        returnSlipMapper.insert(returnSlip);
        for (AddReturnSlipDetailInput detailInput : input.getDetailInputList()) {
            WareReturnSlipDetail detail = new WareReturnSlipDetail();
            BeanUtils.copyProperties(detailInput,detail);
            detail.setWareReturnSlipId(returnSlip.getWareReturnSlipId());
            detail.setCreateTime(new Date());
            detail.setCreateUser(getCurrentUserId());
            detail.setIsDel(PlatformConstants.ISDEL_NO);
            returnSlipDetailMapper.insert(detail);
            lockStock(detail);
        }
    }

    /**
     * 修改退货单
     * @param input
     */
    @Override
    @Transactional
    public void edit(ReturnSlipOutput input) {
        WareReturnSlip returnSlip = returnSlipMapper.selectByPrimaryKey(input.getWareReturnSlipId());
        if(!AuditStateEnum.UNAUDIT.getCode().equals(returnSlip.getAuditStatus())){
            throw new RuntimeException("auditErr");
        }
        for (ReturnSlipDetailOutput output : input.getDetailOutputList()) {
            WareReturnSlipDetail detail = returnSlipDetailMapper.selectByPrimaryKey(output.getWareReturnSlipDetailId());
            unLockStock(detail);
            detail.setReturnNum(output.getReturnNum());
            lockStock(detail);
            detail.setUpdateTime(new Date());
            detail.setUpdateUser(getCurrentUserId());
            returnSlipDetailMapper.updateByPrimaryKeySelective(detail);
        }
    }

    /**
     * 锁库存
     * @param detail
     */
    private void lockStock(WareReturnSlipDetail detail){
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andSparePartsEqualTo(detail.getSpareParts());
        criteria.andSparePartsBatchEqualTo(detail.getSparePartsBatch());
        WareStock stock = stockMapper.selectByExample(example).get(0);
        if (stock.getActualSurplusNum() - detail.getReturnNum() < 0){
            throw new RuntimeException("stockmErr");
        }else {
            stock.setActualSurplusNum(stock.getActualSurplusNum() - detail.getReturnNum());
//            if(!stockService.getWarehouseLockStatus(stock.getWarehouse())) {
//            }
            stock.setSurplusNum(stock.getSurplusNum() - detail.getReturnNum());
        }
        stockMapper.updateByPrimaryKeySelective(stock);
    }

    /**
     * 解锁库存
     * @param detail
     */
    private void unLockStock(WareReturnSlipDetail detail){
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andSparePartsEqualTo(detail.getSpareParts());
        criteria.andSparePartsBatchEqualTo(detail.getSparePartsBatch());
        WareStock stock = stockMapper.selectByExample(example).get(0);
        stock.setActualSurplusNum(stock.getActualSurplusNum() + detail.getReturnNum());
//        if(!stockService.getWarehouseLockStatus(stock.getWarehouse())) {
//        }
        stock.setSurplusNum(stock.getSurplusNum() + detail.getReturnNum());
        stockMapper.updateByPrimaryKeySelective(stock);
    }

    /**
     * 退货单批量审核通过
     * @param ids
     */
    @Override
    @Transactional
    public void auditPass(Integer[] ids) {
        WareReturnSlipExample example = new WareReturnSlipExample();
        WareReturnSlipExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andWareReturnSlipIdIn(Arrays.asList(ids));
        List<WareReturnSlip> wareReturnSlips = returnSlipMapper.selectByExample(example);
        for (WareReturnSlip wareReturnSlip : wareReturnSlips) {
            if(!AuditStateEnum.UNAUDIT.getCode().equals(wareReturnSlip.getAuditStatus())){
                throw new RuntimeException("auditErr");
            }
        }
        WareReturnSlip returnSlip = new WareReturnSlip();
        returnSlip.setUpdateTime(new Date());
        returnSlip.setUpdateUser(getCurrentUserId());
        returnSlip.setAuditStatus(AuditStateEnum.AUDITED.getCode());
        returnSlipMapper.updateByExampleSelective(returnSlip,example);
//        stockout(ids);
    }


    /**
     * 根据Id批量删除
     * @param ids
     */
    @Override
    public void slipDel(Integer[] ids) {
        WareReturnSlipExample example = new WareReturnSlipExample();
        WareReturnSlipExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andWareReturnSlipIdIn(Arrays.asList(ids));
        List<WareReturnSlip> wareReturnSlips = returnSlipMapper.selectByExample(example);
        for (WareReturnSlip wareReturnSlip : wareReturnSlips) {
            if(!AuditStateEnum.UNAUDIT.getCode().equals(wareReturnSlip.getAuditStatus())){
                throw new RuntimeException("auditErr");
            }
        }
        WareReturnSlip returnSlip = new WareReturnSlip();
        returnSlip.setUpdateTime(new Date());
        returnSlip.setUpdateUser(getCurrentUserId());
        returnSlip.setIsDel(PlatformConstants.ISDEL_YES);
        returnSlipMapper.updateByExampleSelective(returnSlip,example);
    }

    /**
     * 批量驳回退货单
     * @param ids
     * @param str
     */
    @Override
    @Transactional
    public void auditReject(Integer[] ids, String str) {
        WareReturnSlipExample example = new WareReturnSlipExample();
        WareReturnSlipExample.Criteria criteria = example.createCriteria();
        criteria.andWareReturnSlipIdIn(Arrays.asList(ids));
        List<WareReturnSlip> wareReturnSlips = returnSlipMapper.selectByExample(example);
        for (WareReturnSlip wareReturnSlip : wareReturnSlips) {
            if(!AuditStateEnum.UNAUDIT.getCode().equals(wareReturnSlip.getAuditStatus())){
                throw new RuntimeException("auditErr");
            }
            WareReturnSlipDetailExample detailExample = new WareReturnSlipDetailExample();
            WareReturnSlipDetailExample.Criteria detailExampleCriteria = detailExample.createCriteria();
            detailExampleCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            detailExampleCriteria.andWareReturnSlipIdEqualTo(wareReturnSlip.getWareReturnSlipId());
            List<WareReturnSlipDetail> wareReturnSlipDetails = returnSlipDetailMapper.selectByExample(detailExample);
            for (WareReturnSlipDetail wareReturnSlipDetail : wareReturnSlipDetails) {
                unLockStock(wareReturnSlipDetail);
            }
        }
        WareReturnSlip returnSlip = new WareReturnSlip();
        returnSlip.setUpdateTime(new Date());
        returnSlip.setUpdateUser(getCurrentUserId());
        returnSlip.setAuditStatus(AuditStateEnum.REJECTED.getCode());
        returnSlip.setReasonsRejection(str);
        returnSlipMapper.updateByExampleSelective(returnSlip,example);
    }

    /**
     * 获取退货单明细
     * @param id
     * @return
     */
    private List<ReturnSlipDetailOutput> getDetailList(Integer id){
        WareReturnSlip returnSlip = returnSlipMapper.selectByPrimaryKey(id);
        WareReturnSlipDetailExample example = new WareReturnSlipDetailExample();
        WareReturnSlipDetailExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andWareReturnSlipIdEqualTo(id);
        List<WareReturnSlipDetail> wareReturnSlips = returnSlipDetailMapper.selectByExample(example);
        List<ReturnSlipDetailOutput> outputs = new ArrayList<>();
        for (WareReturnSlipDetail detail : wareReturnSlips) {
            ReturnSlipDetailOutput output = new ReturnSlipDetailOutput();
            BeanUtils.copyProperties(detail,output);
            StockOutput stockByBatch = stockService.getStockByBatch(detail.getSparePartsBatch(), detail.getSpareParts());
            output.setSparePartsCategories(stockByBatch.getSparePartsCategories());
            output.setSparePartsCategoriesLangLang(stockByBatch.getSparePartsCategories());
            output.setSparePartsNo(stockByBatch.getSparePartsNo());
            SearchStockinInput stockinInput = new SearchStockinInput(1,1);
            stockinInput.setStockinNo(returnSlip.getSourceId());
            StockinOutput stockinOutput = stockinService.stockinPageList(stockinInput).getDataList().get(0);
            for (StockinDetailOutput stockinDetailOutput : stockinOutput.getStockinDetail()) {
                if(detail.getSpareParts().equals(stockinDetailOutput.getSpareParts()) && detail.getSparePartsBatch().equals(stockinDetailOutput.getStockinBatch())){
                    output.setEntryNum(stockinDetailOutput.getEntryNum());
                }
            }
            output.setSparePartsLangLang(detail.getSpareParts());
            outputs.add(output);
        }
        return outputs;
    }

    /**
     * 生成出库单
     */
    @Override
    @Transactional
    public void stockout(Integer[] ids){
        WareReturnSlipExample example = new WareReturnSlipExample();
        WareReturnSlipExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andWareReturnSlipIdIn(Arrays.asList(ids));
        List<WareReturnSlip> wareReturnSlips = returnSlipMapper.selectByExample(example);

        for (WareReturnSlip wareReturnSlip : wareReturnSlips) {
            WareReturnSlipDetailExample detailExample = new WareReturnSlipDetailExample();
            WareReturnSlipDetailExample.Criteria detailCriteria = detailExample.createCriteria();
            detailCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            detailCriteria.andWareReturnSlipIdEqualTo(wareReturnSlip.getWareReturnSlipId());
            List<WareReturnSlipDetail> wareReturnSlipDetails = returnSlipDetailMapper.selectByExample(detailExample);
            for (WareReturnSlipDetail wareReturnSlipDetail : wareReturnSlipDetails) {
                unLockStock(wareReturnSlipDetail);
            }

            AddStockoutInput stockoutInput = new AddStockoutInput();
            stockoutInput.setBillType(BillTypeConstants.CGTH);
            stockoutInput.setCompany(getCurrentCompanyKey());
            stockoutInput.setNo(wareReturnSlip.getReturnBillNo());
            SearchStockinInput searchStockinInput = new SearchStockinInput(1,1);
            searchStockinInput.setStockinNo(wareReturnSlip.getSourceId());
            stockoutInput.setWarehouse(stockinService.stockinPageList(searchStockinInput).getDataList().get(0).getEntryWarehouse());
            stockoutInput.setReceiveDepartment(null);
            List<AddStockoutDetailInput> detailInputs = new ArrayList<>();
            for (ReturnSlipDetailOutput output : getDetailList(wareReturnSlip.getWareReturnSlipId())) {
                AddStockoutDetailInput detailInput = new AddStockoutDetailInput();
                detailInput.setSparePartsBatch(output.getSparePartsBatch());
                detailInput.setSpareParts(output.getSpareParts());
                detailInput.setStockoutNum(output.getReturnNum());
                detailInputs.add(detailInput);
            }
            AddStockoutDetailInput[] array=detailInputs.toArray(new AddStockoutDetailInput[detailInputs.size()]);
            stockoutInput.setStockoutDetailInputList(detailInputs.toArray(array));
            stockoutService.addStockout(stockoutInput);
            wareReturnSlip.setReturnStatus(ReturnEnum.YES.getCode());
            wareReturnSlip.setUpdateUser(getCurrentUserId());
            wareReturnSlip.setUpdateTime(new Date());
            returnSlipMapper.updateByPrimaryKeySelective(wareReturnSlip);
        }
    }
}
