package com.sanlly.warehouse.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.StockinEnum;
import com.sanlly.common.enums.StockoutEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.warehouse.constants.BillTypeConstants;
import com.sanlly.warehouse.dao.WareDeliverySlipDetailMapper;
import com.sanlly.warehouse.dao.WareDeliverySlipMapper;
import com.sanlly.warehouse.dao.WarePurchaseOrderMapper;
import com.sanlly.warehouse.entity.*;
import com.sanlly.warehouse.enums.DeliveryStatusEnum;
import com.sanlly.warehouse.models.input.delivery.AddDeliveryDetailInput;
import com.sanlly.warehouse.models.input.delivery.AddDeliveryInput;
import com.sanlly.warehouse.models.input.delivery.SearchDeliveryInput;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.stockin.AddStockinDetailInput;
import com.sanlly.warehouse.models.input.stockin.AddStockinInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutDetailInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutInput;
import com.sanlly.warehouse.models.input.stockoutApply.AddStockoutApplyDetailInout;
import com.sanlly.warehouse.models.input.stockoutApply.AddStockoutApplyInput;
import com.sanlly.warehouse.models.output.delivery.DeliveryDetailOutput;
import com.sanlly.warehouse.models.output.delivery.DeliveryOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.models.output.stockin.StockinOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutOutput;
import com.sanlly.warehouse.models.output.stockoutApply.StockoutApplyOutput;
import com.sanlly.warehouse.service.*;
import com.sanlly.warehouse.service.feign.PurchaseFeignClient;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;

/**
 * ClassName: WareDeliveryServiceImpl
 * Description: 送货单服务层实现
 * date: 2019/9/2 13:35
 *
 * @author wannt
 * @since JDK 1.8
 */
@Service
public class WareDeliveryServiceImpl extends BaseServiceImpl implements WareDeliveryService {

    @Autowired
    private WareDeliverySlipMapper deliverySlipMapper;

    @Autowired
    private WareDeliverySlipDetailMapper deliverySlipDetailMapper;

    @Autowired
    private WareSparePartsService sparePartsService;

    @Autowired
    private BillTypeService billTypeService;

    @Autowired
    private WarePurchaseOrderService purchaseOrderService;

    @Autowired
    private WareStockoutService stockoutService;

    @Autowired
    private WareStockinService stockinService;

    @Autowired
    private WarePurchaseOrderMapper purchaseOrderMapper;

    @Autowired
    private PurchaseFeignClient purchaseFeignClient;

    @Autowired
    private WareStockService stockService;

    @Autowired
    private WareStockoutApplyService stockoutApplyService;

    /**
     * 分页查询送货单
     * @param input
     * @return
     */
    @Override
    public PagedList<DeliveryOutput> pageList(SearchDeliveryInput input) {
        // 组装查询条件
        WareDeliverySlipExample example = new WareDeliverySlipExample();
        WareDeliverySlipExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        example.setOrderByClause("create_time desc");
        if (input.getWareDeliverySlipId() != null){
            criteria.andWareDeliverySlipIdEqualTo(input.getWareDeliverySlipId());
        }
        if (input.getDeliverySlipNo() != null && input.getDeliverySlipNo() != ""){
            criteria.andDeliverySlipNoLike("%"+input.getDeliverySlipNo()+"%");
        }
        if (input.getDeliveryStatus() != null && input.getDeliveryStatus() != ""){
            criteria.andDeliveryStatusEqualTo(input.getDeliveryStatus());
        }
        if(input.getLogisticsNum() != null && input.getLogisticsNum() != ""){
            criteria.andLogisticsNumLike("%"+input.getLogisticsNum()+"%");
        }
        if(input.getNo() != null && input.getNo() != ""){
            criteria.andNoLike("%"+input.getNo()+"%");
        }
        if(input.getPurchaseNo() != null && input.getPurchaseNo() != ""){
            criteria.andPurchaseNoLike("%"+input.getPurchaseNo()+"%");
        }
        if(input.getStartDate()!=null && input.getEndDate()!=null){
            criteria.andCreateTimeBetween(input.getStartDate(),input.getEndDate());
        }else if(input.getStartDate()!=null){
            criteria.andCreateTimeBetween(input.getStartDate(),new Date());
        }else if(input.getEndDate()!=null){
            criteria.andCreateTimeBetween(new Date(0),input.getEndDate());
        }
        if ((input.getSparePartsNo() != null && input.getSparePartsNo() != "")
                || (input.getSpareParts() != null && input.getSpareParts() != "")) {
            WareDeliverySlipDetailExample detailExample = new WareDeliverySlipDetailExample();
            WareDeliverySlipDetailExample.Criteria detailCriteria = detailExample.createCriteria();
            detailCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            if ((input.getSparePartsNo() != null && input.getSparePartsNo() != "")
                    || (input.getSpareParts() != null && input.getSpareParts() != "")) {
                List<String> KeyList = sparePartsService.getSparePartsKeyListByLike(input.getSparePartsNo(),
                        input.getSpareParts());
                detailCriteria.andSparePartsIn(KeyList);
            }
            List<WareDeliverySlipDetail> wareStockoutDetails = deliverySlipDetailMapper.selectByExample(detailExample);
            List<Integer> stockoutId = new ArrayList<>();
            for (WareDeliverySlipDetail stockoutDetail : wareStockoutDetails) {
                stockoutId.add(stockoutDetail.getWareDeliverySlipId());
            }
            criteria.andWareDeliverySlipIdIn(stockoutId);
        }
        // 只允许查看当前公司的数据
//        criteria.andCompanyEqualTo(getCurrentCompanyKey());
        // 查询页数
        Integer totalItemCount =(int)deliverySlipMapper.countByExample(example);
        PagedList<DeliveryOutput> pagedList = new PagedList<>(input.getPageIndex(),input.getPageSize(),totalItemCount);
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());

        // 组装返回数据
        List<WareDeliverySlip> deliverySlips = deliverySlipMapper.selectByExample(example);
        List<DeliveryOutput> outputs = new ArrayList<>();
        for (WareDeliverySlip deliverySlip : deliverySlips) {
            DeliveryOutput output = new DeliveryOutput();
            BeanUtils.copyProperties(deliverySlip,output);
            output.setCompanyLangLang(getCurrentCompanyKey());
            Double point = purchaseFeignClient.getInvoiceTypes(deliverySlip.getInvoiceType()).getData();
            output.setInvoicePoint(point == null ? 0 : point);
            output.setSupplierLangLang(deliverySlip.getSupplier());
            output.setDeliveryStatusLangLang(deliverySlip.getDeliveryStatus());
            output.setIntWarehouseLangLang(deliverySlip.getIntWarehouse());
            output.setInvoiceTypeLangLang(deliverySlip.getInvoiceType());
            output.setOutWarehouseLangLang(deliverySlip.getOutWarehouse());
            output.setDetailOutputs(getDetail(deliverySlip.getWareDeliverySlipId()));
            output.setDeliveryDateStr(DateUtil.date2String(deliverySlip.getDeliveryDate()));
            output.setStatusLangLang(deliverySlip.getStatus());
            outputs.add(output);
        }
        pagedList.getDataList().addAll(outputs);
        return pagedList;
    }

    /**
     * 新增送货单
     * @param input
     */
    @Override
    @Transactional
    public void addDelivery(AddDeliveryInput input) {
        WareDeliverySlip deliverySlip = new WareDeliverySlip();
        BeanUtils.copyProperties(input,deliverySlip);
        deliverySlip.setCreateTime(new Date());
        deliverySlip.setCreateUser(getCurrentUserId());
        deliverySlip.setCompany(getCurrentCompanyKey());
        deliverySlip.setDeliveryDate(new Date());
        deliverySlip.setDeliveryStatus(DeliveryStatusEnum.NO.getCode());
        deliverySlip.setStatus(CommonEnum.NO.getCode());
        deliverySlip.setDeliverySlipNo(billTypeService.getBillNumberByKey(BillTypeConstants.DELIVERY));
        deliverySlip.setIsDel(PlatformConstants.ISDEL_NO);
        deliverySlipMapper.insert(deliverySlip);
        for (AddDeliveryDetailInput detailOutput : input.getDetailOutputs()) {
            WareDeliverySlipDetail detail = new WareDeliverySlipDetail();
            BeanUtils.copyProperties(detailOutput,detail);
            detail.setCreateTime(new Date());
            detail.setCreateUser(getCurrentUserId());
            if(detailOutput.getDeliveryNum() != null){
                detail.setNum(detailOutput.getDeliveryNum());
            }
            detail.setCompany(getCurrentCompanyKey());
            detail.setIsDel(PlatformConstants.ISDEL_NO);
            detail.setStockinStatus(StockinEnum.NOIN.getCode());
            detail.setWareDeliverySlipId(deliverySlip.getWareDeliverySlipId());
            deliverySlipDetailMapper.insert(detail);
        }
    }

    /**
     * 根据送货单批量生成出库申请单
     * @param ids
     */
    @Override
    @Transactional
    public void addStockout(Integer[] ids) {
        WareDeliverySlipExample example = new WareDeliverySlipExample();
        WareDeliverySlipExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andWareDeliverySlipIdIn(Arrays.asList(ids));
        List<WareDeliverySlip> deliverySlips = deliverySlipMapper.selectByExample(example);
        for (WareDeliverySlip deliverySlip : deliverySlips) {
            AddStockoutApplyInput applyInput = new AddStockoutApplyInput();
            applyInput.setCompany(getCurrentCompanyKey());
            applyInput.setBillType(BillTypeConstants.SHDH);
            applyInput.setNo(deliverySlip.getDeliverySlipNo());
            applyInput.setWarehouse(deliverySlip.getOutWarehouse());
            List<AddStockoutApplyDetailInout> inputs = new ArrayList<>();
            for (DeliveryDetailOutput detailOutput : getDetail(deliverySlip.getWareDeliverySlipId())) {
                AddStockoutApplyDetailInout detailInout = new AddStockoutApplyDetailInout();
                detailInout.setStockoutNum(detailOutput.getNum());
                detailInout.setSpareParts(detailOutput.getSpareParts());
                inputs.add(detailInout);
            }
            AddStockoutApplyDetailInout[] arr = new AddStockoutApplyDetailInout[inputs.size()];
            applyInput.setStockoutApplydetail(inputs.toArray(arr));
            stockoutApplyService.addStockoutApply(applyInput);
        }
    }




    /**
     * 根据送货单新增入库单
     * @param input
     */
    @Override
    @Transactional
    public void addStockin(AddStockinInput input) {
        System.out.println(input);
        stockinService.addStockin(input);
    }

    /**
     * 出库回调 修改送货单出库状态
     * @param input
     */
    @Override
    @Transactional
    public void editStockoutStatus(StockoutApplyOutput input) {
        WareDeliverySlipExample example = new WareDeliverySlipExample();
        WareDeliverySlipExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andDeliverySlipNoEqualTo(input.getNo());
        WareDeliverySlip deliverySlip = deliverySlipMapper.selectByExample(example).get(0);
        if(StockoutEnum.YESOUT.getCode().equals(input.getStockoutStatus())){
            deliverySlip.setDeliveryStatus(DeliveryStatusEnum.YESOUT.getCode());
        }else {
            deliverySlip.setDeliveryStatus(DeliveryStatusEnum.PORTIONOUT.getCode());
        }
        deliverySlipMapper.updateByPrimaryKeySelective(deliverySlip);
    }

    /**
     * 入库回调 修改送货单入库状态
     * @param output
     */
    @Override
    @Transactional
    public void editStockinStatus(StockinOutput output) {

    }

    /**
     * 根据ID 查询明细
     * @param id
     * @return
     */
    private List<DeliveryDetailOutput> getDetail(Integer id){
        WareDeliverySlipDetailExample example = new WareDeliverySlipDetailExample();
        WareDeliverySlipDetailExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andWareDeliverySlipIdEqualTo(id);
        List<WareDeliverySlipDetail> deliverySlipDetails = deliverySlipDetailMapper.selectByExample(example);
        List<DeliveryDetailOutput> outputs = new ArrayList<>();

        for (WareDeliverySlipDetail slipDetail : deliverySlipDetails) {
            DeliveryDetailOutput output = new DeliveryDetailOutput();
            BeanUtils.copyProperties(slipDetail,output);
            output.setCompanyLangLang(slipDetail.getCompany());
            output.setOutWarehouseLangLang(slipDetail.getOutWarehouse());
            output.setSparePartsLangLang(slipDetail.getSpareParts());
            SparePartsOutput spareParts = sparePartsService.getSpareParts(new EditSparePartsInput(slipDetail.getSpareParts()));
            output.setSparePartsCategories(spareParts.getSparePartsCategories());
            output.setSparePartsCategoriesLangLang(spareParts.getSparePartsCategories());
            output.setSparePartsNo(spareParts.getSparePartsNo());
            output.setStockinStatusLangLang(slipDetail.getStockinStatus());
            outputs.add(output);
        }
        return outputs;
    }

    /**
     * 批量状态确认
     * @param ids
     */
    @Override
    public void statusPass(Integer[] ids) {
        WareDeliverySlipExample example = new WareDeliverySlipExample();
        WareDeliverySlipExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andWareDeliverySlipIdIn(Arrays.asList(ids));
        List<WareDeliverySlip> wareDeliverySlips = deliverySlipMapper.selectByExample(example);
        for (WareDeliverySlip wareDeliverySlip : wareDeliverySlips) {
            if(!DeliveryStatusEnum.YESOUT.getCode().equals(wareDeliverySlip.getDeliveryStatus())){
                throw new RuntimeException("statusErr");
            }
        }
        WareDeliverySlip slip = new WareDeliverySlip();
        slip.setStatus(CommonEnum.YES.getCode());
        deliverySlipMapper.updateByExampleSelective(slip,example);
    }

    /**
     * 批量取消确认
     * @param ids
     */
    @Override
    public void statusCancel(Integer[] ids) {
        WareDeliverySlipExample example = new WareDeliverySlipExample();
        WareDeliverySlipExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andWareDeliverySlipIdIn(Arrays.asList(ids));
        List<WareDeliverySlip> wareDeliverySlips = deliverySlipMapper.selectByExample(example);
        for (WareDeliverySlip wareDeliverySlip : wareDeliverySlips) {
            if(!CommonEnum.YES.getCode().equals(wareDeliverySlip.getStatus())){
                throw new RuntimeException("statusErr");
            }
        }
        WareDeliverySlip slip = new WareDeliverySlip();
        slip.setStatus(CommonEnum.NO.getCode());
        deliverySlipMapper.updateByExampleSelective(slip,example);
    }
}
