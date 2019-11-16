package com.sanlly.warehouse.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.enums.StockinEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.warehouse.constants.BillTypeConstants;
import com.sanlly.warehouse.dao.*;
import com.sanlly.warehouse.entity.*;
import com.sanlly.warehouse.enums.ShipSaleEnum;
import com.sanlly.warehouse.models.input.shipSale.*;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.stockin.AddStockinDetailInput;
import com.sanlly.warehouse.models.input.stockin.AddStockinInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutDetailInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutInput;
import com.sanlly.warehouse.models.output.shipSale.ShipSaleDetailOutput;
import com.sanlly.warehouse.models.output.shipSale.ShipSaleOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutDetailOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutOutput;
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
 * ClassName: WareShipSaleServiceImpl
 * Description: 供船服务层实现
 * date: 2019/9/17 11:27
 *
 * @author wannt
 * @since JDK 1.8
 */
@Service
public class WareShipSaleServiceImpl extends BaseServiceImpl implements WareShipSaleService {

    @Autowired
    private WareShipSupplyReplaceMapper shipSaleMapper;

    @Autowired
    private WareShipSupplyreplaceDetailMapper shipSaleDetailMapper;

    @Autowired
    private WareStockService stockService;

    @Autowired
    private WareSparePartsService sparePartsService;

    @Autowired
    private BillTypeService billTypeService;

    @Autowired
    private WareStockoutService stockoutService;

    @Autowired
    private WareStockoutMapper stockoutMapper;

    @Autowired
    private WareStockoutDetailMapper stockoutDetailMapper;

    @Autowired
    private WareStockinService stockinService;

    @Autowired
    private WareStockMapper stockMapper;

    @Autowired
    private AuthFeignClient authFeignClient;

    /**
     * 条件查询分页列表
     * @param input
     * @return
     */
    @Override
    public PagedList<ShipSaleOutput> pageList(SearchShipSaleInput input) {
        // 组装查询条件
        WareShipSupplyReplaceExample example = new WareShipSupplyReplaceExample();
        WareShipSupplyReplaceExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        example.setOrderByClause("create_time desc");

        if(input.getAuditStatus() != null && input.getAuditStatus() != ""){
            criteria.andAuditStatusEqualTo(input.getAuditStatus());
        }
        if(input.getBillStatus() != null && input.getBillStatus() != ""){
            criteria.andBillStatusEqualTo(input.getBillStatus());
        }
        if(input.getCustomer() != null && input.getCustomer() != ""){
            criteria.andCustomerLike("%"+input.getCustomer()+"%");
        }
        if(input.getNo() != null && input.getNo() != ""){
            criteria.andNoLike("%"+input.getNo()+"%");
        }
        if(input.getReplaceCompany() != null && input.getReplaceCompany() != ""){
            criteria.andReplaceCompanyEqualTo(input.getReplaceCompany());
        }
        if(input.getShipName() != null && input.getShipName() != ""){
            criteria.andShipNameLike("%"+input.getShipName()+"%");
        }
        if(input.getShipSupplyCompany() != null && input.getShipSupplyCompany() != ""){
            criteria.andShipSupplyCompanyEqualTo(input.getShipSupplyCompany());
        }
        if(input.getShipSupplyCz() != null && input.getShipSupplyCz() != ""){
            criteria.andShipSupplyCzEqualTo(input.getShipSupplyCz());
        }
        if(input.getShipSupplyReplaceNo() != null && input.getShipSupplyReplaceNo() != ""){
            criteria.andShipSupplyReplaceNoLike("%"+input.getShipSupplyReplaceNo()+"%");
        }
        if(input.getStatus() != null && input.getStatus() != ""){
            criteria.andStatusEqualTo(input.getStatus());
        }
        if(input.getVoyageNumber() != null && input.getVoyageNumber() != ""){
            criteria.andVoyageNumberEqualTo(input.getVoyageNumber());
        }
        if(input.getWareShipSupplyReplaceId() != null){
            criteria.andWareShipSupplyReplaceIdEqualTo(input.getWareShipSupplyReplaceId());
        }
        if(input.getBillType() != null && input.getBillType() != ""){
            criteria.andBillTypeEqualTo(input.getBillType());
        }

        if ((input.getSparePartsNo() != null && input.getSparePartsNo() != "") || (input.getSpareParts() != null && input.getSpareParts() != "")) {
            WareShipSupplyreplaceDetailExample detailExample = new WareShipSupplyreplaceDetailExample();
            WareShipSupplyreplaceDetailExample.Criteria detailCriteria = detailExample.createCriteria();
            detailCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            if ((input.getSparePartsNo() != null && input.getSparePartsNo() != "") || (input.getSpareParts() != null && input.getSpareParts() != "")) {
                List<String> KeyList = sparePartsService.getSparePartsKeyListByLike(input.getSparePartsNo(), input.getSpareParts());
                detailCriteria.andSparePartsIn(KeyList);
            }
            List<WareShipSupplyreplaceDetail> shipSupplyreplaceDetails = shipSaleDetailMapper.selectByExample(detailExample);
            List<Integer> shipId = new ArrayList<>();
            for (WareShipSupplyreplaceDetail shipetail : shipSupplyreplaceDetails) {
                shipId.add(shipetail.getWareShipSupplyReplaceId());
            }
            criteria.andWareShipSupplyReplaceIdIn(shipId);
        }

        // 查询页数
        Integer totalItemCount = (int) shipSaleMapper.countByExample(example);
        PagedList<ShipSaleOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());

        // 组装返回数据
        List<WareShipSupplyReplace> wareShipSupplyReplaces = shipSaleMapper.selectByExample(example);
        List<ShipSaleOutput> outputs = new ArrayList<>();
        for (WareShipSupplyReplace supplyReplace : wareShipSupplyReplaces) {
            ShipSaleOutput output = new ShipSaleOutput();
            BeanUtils.copyProperties(supplyReplace,output);
            output.setStatusLangLang(supplyReplace.getStatus());
            output.setAuditStatusLangLang(supplyReplace.getAuditStatus());
            output.setBillStatusLangLang(supplyReplace.getBillStatus());
            output.setReplaceCompanyLangLang(supplyReplace.getReplaceCompany());
            output.setShipSupplyCompanyLangLang(supplyReplace.getShipSupplyCompany());
            output.setShipSupplyCzLangLang(supplyReplace.getShipSupplyCz());
            output.setDetailOutputList(getDetailList(supplyReplace.getWareShipSupplyReplaceId()));
            output.setCreateTimeStr(DateUtil.date2String(supplyReplace.getCreateTime()));
            UserInfoOutput data = authFeignClient.getUserInfo(supplyReplace.getCreateUser()).getData();
            if(data != null){
                output.setCreateUserStr(data.getUserName());
            }
            output.setShipSupplyDateStr(DateUtil.date2String(supplyReplace.getShipSupplyDate()));
            outputs.add(output);
        }
        pagedList.getDataList().addAll(outputs);
        return pagedList;
    }

    /**
     * 新增供船单
     * @param input
     */
    @Override
    @Transactional
    public void add(AddShipSaleInput input) {
        WareShipSupplyReplace shipSupply = new WareShipSupplyReplace();
        BeanUtils.copyProperties(input,shipSupply);
        shipSupply.setBillType(input.getBillType());
        shipSupply.setShipSupplyReplaceNo(billTypeService.getBillNumberByKey(input.getBillType()));
        shipSupply.setCreateTime(new Date());
        shipSupply.setCreateUser(getCurrentUserId());
        shipSupply.setIsDel(PlatformConstants.ISDEL_NO);
        shipSupply.setBillStatus(ShipSaleEnum.SUBMIT.getCode());
        shipSupply.setShipSupplyCompany(getCurrentCompanyKey());
        shipSupply.setShipSupplyCz(getCurrentYardKey());
        shipSaleMapper.insert(shipSupply);
        for (AddShipSaleDetailInput detailInput : input.getDetailInputList()) {
            WareShipSupplyreplaceDetail detail = new WareShipSupplyreplaceDetail();
            BeanUtils.copyProperties(detailInput,detail);
            detail.setStockoutNum(0D);
            detail.setCreateTime(new Date());
            detail.setCreateUser(getCurrentUserId());
            detail.setIsDel(PlatformConstants.ISDEL_NO);
            detail.setWareShipSupplyReplaceId(shipSupply.getWareShipSupplyReplaceId());
            shipSaleDetailMapper.insert(detail);
        }
    }

    /**
     * 修改供船单
     * @param input
     */
    @Override
    @Transactional
    public void edit(EditShipSaleInput input) {
        WareShipSupplyReplace shipSupply = new WareShipSupplyReplace();
        BeanUtils.copyProperties(input,shipSupply);
        shipSupply.setUpdateTime(new Date());
        shipSupply.setUpdateUser(getCurrentUserId());
        shipSaleMapper.updateByPrimaryKeySelective(shipSupply);

        WareShipSupplyreplaceDetailExample detailExample = new WareShipSupplyreplaceDetailExample();
        WareShipSupplyreplaceDetailExample.Criteria detailExampleCriteria = detailExample.createCriteria();
        detailExampleCriteria.andWareShipSupplyReplaceIdEqualTo(input.getWareShipSupplyReplaceId());
        WareShipSupplyreplaceDetail del = new WareShipSupplyreplaceDetail();
        del.setIsDel(PlatformConstants.ISDEL_YES);
        shipSaleDetailMapper.updateByExampleSelective(del,detailExample);

        for (EditShipSaleDetailInput output : input.getDetailInputList()) {
            WareShipSupplyreplaceDetail detail = new WareShipSupplyreplaceDetail();
            BeanUtils.copyProperties(output,detail);
            detail.setWareShipSupplyReplaceId(input.getWareShipSupplyReplaceId());
            detail.setUpdateTime(new Date());
            detail.setUpdateUser(getCurrentUserId());
            shipSaleDetailMapper.insert(detail);
        }
    }

    /**
     * 修改状态
     * @param ids
     */
    @Override
    @Transactional
    public void editState(Integer[] ids) {
        WareShipSupplyReplaceExample example = new WareShipSupplyReplaceExample();
        WareShipSupplyReplaceExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andWareShipSupplyReplaceIdIn(Arrays.asList(ids));

        WareShipSupplyReplace supplyReplace = new WareShipSupplyReplace();
        supplyReplace.setUpdateUser(getCurrentUserId());
        supplyReplace.setUpdateTime(new Date());
        supplyReplace.setBillStatus(ShipSaleEnum.AFFIRM.getCode());

        shipSaleMapper.updateByExampleSelective(supplyReplace,example);
    }

    /**
     * 汇率确认
     * @param input
     */
    @Override
    @Transactional
    public void exchangeRate(EditShipSaleInput input) {
        WareShipSupplyReplace shipSupplyReplace = shipSaleMapper.selectByPrimaryKey(input.getWareShipSupplyReplaceId());
        if(!ShipSaleEnum.ALLOUT.getCode().equals(shipSupplyReplace.getBillStatus())){
            throw new RuntimeException("billStatusErr");
        }
        shipSupplyReplace.setExchangeRate(input.getExchangeRate());
        shipSupplyReplace.setBillStatus(ShipSaleEnum.RATE.getCode());
        shipSaleMapper.updateByPrimaryKeySelective(shipSupplyReplace);
        // 操作sbs
    }

    /**
     * 供船出库
     * @param input
     */
    @Override
    @Transactional
    public void shipSaleStockout(EditShipSaleInput input) {
        WareShipSupplyReplace shipSupplyReplace = shipSaleMapper.selectByPrimaryKey(input.getWareShipSupplyReplaceId());
        if(!(ShipSaleEnum.AFFIRM.getCode().equals(shipSupplyReplace.getBillStatus()) || ShipSaleEnum.PORTIONOUT.getCode().equals(shipSupplyReplace.getBillStatus()) || ShipSaleEnum.RETURN.getCode().equals(shipSupplyReplace.getBillStatus()) || ShipSaleEnum.ALLRETURN.getCode().equals(shipSupplyReplace.getBillStatus()))){
            throw new RuntimeException("billStatusErr");
        }
        WareShipSupplyreplaceDetailExample example = new WareShipSupplyreplaceDetailExample();
        WareShipSupplyreplaceDetailExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andWareShipSupplyReplaceIdEqualTo(shipSupplyReplace.getWareShipSupplyReplaceId());
        List<WareShipSupplyreplaceDetail> shipSupplyreplaceDetails = shipSaleDetailMapper.selectByExample(example);
        Boolean f = true;

        for (EditShipSaleDetailInput detailInput : input.getDetailInputList()) {
            for (WareShipSupplyreplaceDetail detail : shipSupplyreplaceDetails) {
                if(detail.getSpareParts().equals(detailInput.getSpareParts()) && detail.getWarehouse().equals(detailInput.getWarehouse()) && detail.getWarehouseType().equals(detailInput.getWarehouseType())){
                    detail.setStockoutNum(detail.getStockoutNum() + detailInput.getOutNum());
                    if(detail.getStockoutNum() > detail.getShipSupplyNum()){
                        throw new RuntimeException("numErr");
                    }
                    if(detail.getShipSupplyNum() > detail.getStockoutNum()){
                        f = false;
                    }
                }
                shipSaleDetailMapper.updateByPrimaryKeySelective(detail);
            }
        }


        if(f){
            shipSupplyReplace.setBillStatus(ShipSaleEnum.ALLOUT.getCode());
        }else {
            shipSupplyReplace.setBillStatus(ShipSaleEnum.PORTIONOUT.getCode());
        }
        shipSupplyReplace.setShipSupplyDate(new Date());
        shipSaleMapper.updateByPrimaryKeySelective(shipSupplyReplace);

        stockout(input);
    }

    /**
     * 供船退库
     * @param input
     */
    @Override
    @Transactional
    public void shipSaleReturn(EditShipSaleInput input) {
        WareShipSupplyReplace shipSupplyReplace = shipSaleMapper.selectByPrimaryKey(input.getWareShipSupplyReplaceId());
        if(!(ShipSaleEnum.PORTIONOUT.getCode().equals(shipSupplyReplace.getBillStatus()) || ShipSaleEnum.ALLOUT.getCode().equals(shipSupplyReplace.getBillStatus()) || ShipSaleEnum.RETURN.getCode().equals(shipSupplyReplace.getBillStatus()))){
            throw new RuntimeException("billStatusErr");
        }
        WareShipSupplyreplaceDetailExample example = new WareShipSupplyreplaceDetailExample();
        WareShipSupplyreplaceDetailExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andWareShipSupplyReplaceIdEqualTo(shipSupplyReplace.getWareShipSupplyReplaceId());
        List<WareShipSupplyreplaceDetail> shipSupplyreplaceDetails = shipSaleDetailMapper.selectByExample(example);
        Boolean f = true;
        for (StockoutOutput output : input.getTableData()) {
            AddStockinInput addInput = new AddStockinInput();
            addInput.setAuditStatus(AuditStateEnum.AUDITED.getCode());
            addInput.setEntryStatus(StockinEnum.YESIN.getCode());
            addInput.setCompany(output.getCompany());
            addInput.setNo(output.getNo());
            addInput.setBillType(output.getBillType());
            addInput.setEntryWarehouse(output.getWarehouse());
            List<AddStockinDetailInput> addDetailInputs = new ArrayList<>();

            WareStockout stockout = stockoutMapper.selectByPrimaryKey(output.getWareStockoutId());
            WareStockoutDetailExample detailExample = new WareStockoutDetailExample();
            WareStockoutDetailExample.Criteria criteria1 = detailExample.createCriteria();
            criteria1.andWareStockoutIdEqualTo(stockout.getWareStockoutId());
            List<WareStockoutDetail> wareStockoutDetails = stockoutDetailMapper.selectByExample(detailExample);
            for (StockoutDetailOutput detailOutput : output.getDetailOutputs()) {
                AddStockinDetailInput addDetailInput = new AddStockinDetailInput();
                addDetailInput.setEntryPrice(detailOutput.getUnitPrice());
                addDetailInput.setWarehouseType(detailOutput.getWarehouseType());
                addDetailInput.setWarehouse(output.getWarehouse());
                addDetailInput.setStockinBatch(detailOutput.getSparePartsBatch());
                addDetailInput.setStorageLocation(detailOutput.getStorageLocation());
                addDetailInput.setEntryNum(detailOutput.getReturnNum());
                addDetailInput.setSpareParts(detailOutput.getSpareParts());
                addDetailInputs.add(addDetailInput);
                for (WareStockoutDetail wareStockoutDetail : wareStockoutDetails) {
                    if(detailOutput.getWareStockoutOrderDetailId().equals(wareStockoutDetail.getWareStockoutOrderDetailId())){
                        wareStockoutDetail.setStockoutNum(wareStockoutDetail.getStockoutNum() - detailOutput.getReturnNum());
                        if(wareStockoutDetail.getStockoutNum() < 0D){
                            throw new RuntimeException("numErr");
                        }
                        stockoutDetailMapper.updateByPrimaryKeySelective(wareStockoutDetail);
                        continue;
                    }

                }
                for (WareShipSupplyreplaceDetail detail : shipSupplyreplaceDetails) {
                    if(detail.getSpareParts().equals(detailOutput.getSpareParts()) && detail.getWarehouse().equals(output.getWarehouse()) && detail.getWarehouseType().equals(detailOutput.getDefaultWarehouseType())){
                        detail.setStockoutNum(detail.getStockoutNum() - detailOutput.getReturnNum());
                        if(detail.getStockoutNum() < 0D){
                            throw new RuntimeException("numErr");
                        }
                        if(detail.getStockoutNum() > 0D){
                            f = false;
                        }
                        shipSaleDetailMapper.updateByPrimaryKeySelective(detail);
                        continue;
                    }
                }
                WareStockExample stockExample = new WareStockExample();
                WareStockExample.Criteria stockCriteria = stockExample.createCriteria();
                stockCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
                stockCriteria.andSparePartsEqualTo(detailOutput.getSpareParts());
                stockCriteria.andSparePartsBatchEqualTo(detailOutput.getSparePartsBatch());
                WareStock stock = stockMapper.selectByExample(stockExample).get(0);
//                if(!stockService.getWarehouseLockStatus(stock.getWarehouse())) {
//                }
                stock.setSurplusNum(stock.getSurplusNum() + detailOutput.getReturnNum());
                stock.setActualSurplusNum(stock.getActualSurplusNum() + detailOutput.getReturnNum());
                stock.setUpdateUser(getCurrentUserId());
                stock.setUpdateTime(new Date());
                stockMapper.updateByPrimaryKeySelective(stock);
            }
            stockoutMapper.updateByPrimaryKeySelective(stockout);
            AddStockinDetailInput[] arr = new AddStockinDetailInput[addDetailInputs.size()];
            AddStockinDetailInput[] addStockinDetailInputs = addDetailInputs.toArray(arr);
            addInput.setStockinDetail(addStockinDetailInputs);
            stockinService.addStockin(addInput);
        }
        if(f){
            shipSupplyReplace.setBillStatus(ShipSaleEnum.ALLRETURN.getCode());
        }else {
            shipSupplyReplace.setBillStatus(ShipSaleEnum.RETURN.getCode());
        }
        Double b = 0D;
        for (ShipSaleDetailOutput output : getDetailList(input.getWareShipSupplyReplaceId())) {
            b += output.getStockoutNum();
        }
        if(b == 0){
            shipSupplyReplace.setBillStatus(ShipSaleEnum.ALLRETURN.getCode());
        }

        shipSaleMapper.updateByPrimaryKeySelective(shipSupplyReplace);
    }

    /**
     * 取消供船
     * @param ids
     */
    @Override
    @Transactional
    public void shipSalecancel(Integer[] ids) {
        for (Integer id : ids) {
            WareShipSupplyReplace shipSupplyReplace = shipSaleMapper.selectByPrimaryKey(id);
            if(!(ShipSaleEnum.SUBMIT.getCode().equals(shipSupplyReplace.getBillStatus()) || ShipSaleEnum.AFFIRM.getCode().equals(shipSupplyReplace.getBillStatus()) || ShipSaleEnum.ALLRETURN.getCode().equals(shipSupplyReplace.getBillStatus()))){
                throw new RuntimeException("billStatusErr");
            }
            shipSupplyReplace.setBillStatus(ShipSaleEnum.CANCEL.getCode());
            shipSupplyReplace.setUpdateTime(new Date());
            shipSupplyReplace.setUpdateUser(getCurrentUserId());
            shipSaleMapper.updateByPrimaryKeySelective(shipSupplyReplace);
        }
    }

    /**
     * 获取供船明细
     * @param id
     * @return
     */
    private List<ShipSaleDetailOutput> getDetailList(Integer id){
        WareShipSupplyReplace shipSupplyReplace = shipSaleMapper.selectByPrimaryKey(id);
        WareShipSupplyreplaceDetailExample example = new WareShipSupplyreplaceDetailExample();
        WareShipSupplyreplaceDetailExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andWareShipSupplyReplaceIdEqualTo(id);
        List<WareShipSupplyreplaceDetail> wareShipSupplyreplaceDetails = shipSaleDetailMapper.selectByExample(example);
        List<ShipSaleDetailOutput> outputs = new ArrayList<>();
        for (WareShipSupplyreplaceDetail supplyreplaceDetail : wareShipSupplyreplaceDetails) {
            ShipSaleDetailOutput output = new ShipSaleDetailOutput();
            BeanUtils.copyProperties(supplyreplaceDetail,output);
            output.setWarehouseLangLang(supplyreplaceDetail.getWarehouse());
            output.setSparePartsLangLang(supplyreplaceDetail.getSpareParts());
            output.setWarehouseTypeLangLang(supplyreplaceDetail.getWarehouseType());
            SparePartsOutput spareParts = sparePartsService.getSpareParts(new EditSparePartsInput(supplyreplaceDetail.getSpareParts()));
            output.setSparePartsNo(spareParts.getSparePartsNo());
            Double stockByCompanyOrSP = stockService.getStockByCompanyOrSP(shipSupplyReplace.getShipSupplyCompany(), supplyreplaceDetail.getWarehouse(), supplyreplaceDetail.getSpareParts(), supplyreplaceDetail.getWarehouseType());
            output.setActualSurplusNum(stockByCompanyOrSP);
            outputs.add(output);
        }
        return outputs;
    }

    /**
     * 生成出库单
     * @param input
     */
    @Transactional
    public void stockout(EditShipSaleInput input){
        List<String> warehouseList = new ArrayList<>();
        for (EditShipSaleDetailInput detailInput : input.getDetailInputList()) {
            if(warehouseList.indexOf(detailInput.getWarehouse()) == -1){
                warehouseList.add(detailInput.getWarehouse());
            }
        }
        for (String s : warehouseList) {
            AddStockoutInput stockout = new AddStockoutInput();
            stockout.setBillType(BillTypeConstants.SHS);
            stockout.setCompany(input.getShipSupplyCompany());
            stockout.setNo(input.getShipSupplyReplaceNo());
            stockout.setWarehouse(s);
            List<AddStockoutDetailInput> detailInputs = new ArrayList<>();
            for (EditShipSaleDetailInput detailInput : input.getDetailInputList()) {
                List<StockOutput> stocks = stockService.autoGetStock(detailInput.getWarehouse(),detailInput.getWarehouseType() ,detailInput.getSpareParts(), detailInput.getOutNum());
                for (StockOutput stock : stocks) {
                    AddStockoutDetailInput stockoutDetailInput = new AddStockoutDetailInput();
                    BeanUtils.copyProperties(stock,input);
                    stockoutDetailInput.setStockoutNum(stock.getActualSurplusNum());
                    stockoutDetailInput.setSpareParts(stock.getSpareParts());
                    stockoutDetailInput.setSparePartsBatch(stock.getSparePartsBatch());
                    stockoutDetailInput.setDefaultWarehouseType(stock.getWarehouseType());
                    detailInputs.add(stockoutDetailInput);
                }
            }
            AddStockoutDetailInput[] arr = new AddStockoutDetailInput[detailInputs.size()];
            stockout.setStockoutDetailInputList(detailInputs.toArray(arr));
            stockoutService.addStockout(stockout);
        }
    }
}
