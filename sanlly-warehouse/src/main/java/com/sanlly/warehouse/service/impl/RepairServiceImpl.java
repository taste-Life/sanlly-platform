package com.sanlly.warehouse.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.input.finance.BillGiveRepairInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.customerdeliver.CustomerDeliverDetailOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.warehouse.constants.WarehouseConstants;
import com.sanlly.warehouse.dao.*;
import com.sanlly.warehouse.entity.*;
import com.sanlly.warehouse.enums.*;
import com.sanlly.warehouse.models.input.customerdeliver.CustomerDeliverInput;
import com.sanlly.warehouse.models.input.entrustprocess.EntrustProcessInput;
import com.sanlly.warehouse.models.input.entrustprocess.MaterialInput;
import com.sanlly.warehouse.models.input.entrustprocess.ProductInput;
import com.sanlly.warehouse.models.input.repair.RepairReportInput;
import com.sanlly.warehouse.models.input.repair.ReturnStoreInput;
import com.sanlly.warehouse.models.input.repair.SearchRepairInput;
import com.sanlly.warehouse.models.input.stock.EditStockInput;
import com.sanlly.warehouse.models.input.stock.SearchStockInput;
import com.sanlly.warehouse.models.input.stockin.AddStockinDetailInput;
import com.sanlly.warehouse.models.input.stockin.SearchStockinInput;
import com.sanlly.warehouse.models.input.stockin.StockInInput;
import com.sanlly.warehouse.models.output.ablerepair.AbleRepairOutput;
import com.sanlly.warehouse.models.output.customerdeliver.CustomerDeliverOutput;
import com.sanlly.warehouse.models.output.repair.RepairStoreOutput;
import com.sanlly.warehouse.models.output.repair.ReturnStoreOutput;
import com.sanlly.warehouse.models.output.repair.ShouldReturnOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsBriefOutput;
import com.sanlly.warehouse.models.output.stockin.StockinOutput;
import com.sanlly.warehouse.service.*;
import com.sanlly.warehouse.service.feign.FinanceFeignClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 备件修理service implement
 *
 * @author lishzh
 */
@Service
public class RepairServiceImpl extends BaseServiceImpl implements RepairService {

    @Autowired
    private ReturnStoreMapper returnStoreDao;

    @Autowired
    private WareSparePartsService sparePartsService;

    @Autowired
    private BillTypeService billTypeService;

    @Autowired
    private RepairStoreMapper repairStoreDao;

    @Autowired
    private RepairReportMapper repairReportDao;

    @Autowired
    private RepairReportDetailMapper repairReportDetailDao;

    @Autowired
    private EntrustProcessService entrustProcessService;

    @Autowired
    private WareStockinService stockinService;

    @Autowired
    private CustomerDeliverMapper customerDeliverDao;

    @Autowired
    private CustomerDeliverDetailMapper customerDeliverDetailDao;

    @Autowired
    private WareStockService stockService;

    @Autowired
    private WareStockoutService stockoutService;

    @Autowired
    private EntrustProcessMapper entrustProcessDao;

    @Autowired
    private ShouldReturnMapper shouldReturnDao;

    @Autowired
    private AbleRepairService ableRepairService;

    @Autowired
    private FinanceFeignClient financeClient;

    /**
     * 添加至应退件库
     *
     * @param shouldReturn
     * @author lishzh
     */
    @Override
    public void addShouldReturn(ShouldReturn shouldReturn) {

    }

    @Override
    public PagedList<ShouldReturnOutput> getShouldReturn(SearchRepairInput input) {
        ShouldReturnExample example=new ShouldReturnExample();
        ShouldReturnExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotEmpty(input.getSparePartNo())){
            criteria.andSparePartsNoLike("%"+input.getSparePartNo()+"%");
        }
        if (StringUtils.isNotEmpty(input.getStatus())){
            criteria.andReturnStatusEqualTo(input.getStatus());
        }
        int total=(int)shouldReturnDao.countByExample(example);
        PagedList<ShouldReturnOutput> page=new PagedList<>(input.getPageIndex(),input.getPageSize(),total);
        example.setLimitStart(page.getLimitStart());
        example.setLimitEnd(page.getLimitEnd());
        example.setOrderByClause("create_time desc");

        List<ShouldReturnOutput> outputs = shouldReturnDao.selectByExample(example).stream().map(sr -> {
            ShouldReturnOutput output = new ShouldReturnOutput();
            output.setWareShouldReturnId(sr.getWareShouldReturnId());
            output.setSpareParts(sr.getSpareParts());
            output.setSparePartsLangLang(sr.getSpareParts());
            output.setSparePartsNo(sr.getSparePartsNo());
            output.setOutYardLangLang(sr.getOutYard());
            output.setOutWarehouseLangLang(sr.getOutWarehouse());
            output.setStockoutGo(sr.getStockoutGo());
            output.setReturnNum(sr.getReturnNum());
            output.setReceiveUserName(getUserNameByUserId(sr.getReceiveUser()));
            output.setCreateTime(sr.getCreateTime());
            output.setReturnStatusLangLang(sr.getReturnStatus());
            return output;
        }).collect(Collectors.toList());

        page.setDataList(outputs);

        return page;
    }

    /**
     * 维修 保修退件转备件修理
     *
     * @param ids
     * @author lishzh
     */
    @Override
    public void returnRepair(List<Integer> ids) {
        List<AbleRepairOutput> ableRepairs = ableRepairService.getAbleRepairs();

        List<ReturnStoreInput> returnStores=new ArrayList<>();
        ids.forEach(id -> {

            ShouldReturn shouldReturn = shouldReturnDao.selectByPrimaryKey(id);
            ableRepairs.stream().filter(ar -> ar.getSpareParts().equals(shouldReturn.getSpareParts())).findFirst().ifPresent(ar -> {
                ReturnStoreInput rsi=new ReturnStoreInput();
                rsi.setSourceType(ReturnSourceEnum.REPAIR.getCode());
                rsi.setSpareParts(shouldReturn.getSpareParts());
                rsi.setNum(shouldReturn.getReturnNum());
                returnStores.add(rsi);
            });


        });
        addReturnStore(returnStores);
    }

    /**
     * 采购旧件转维修
     *
     * @param stockInNo
     * @author lishzh
     */
    @Override
    public void oldRepair(String stockInNo) {
        SearchStockinInput searchStockinInput = new SearchStockinInput(1, 1);
        searchStockinInput.setStockinNo(stockInNo);
        PagedList<StockinOutput> stockin = stockinService.stockinPageList(searchStockinInput);
        stockin.getDataList().forEach(s -> {
        });
        List<ReturnStoreInput> returnStores=new ArrayList<>();
        stockin.getDataList().stream().findFirst().ifPresent(s -> {
            s.getStockinDetail().forEach(d -> {
                if ("LKWARETYPE000006".equals(d.getWarehouseType())){

                    ReturnStoreInput rsi=new ReturnStoreInput();
                    rsi.setSourceType(ReturnSourceEnum.PURCHASE.getCode());
                    rsi.setSpareParts(d.getSpareParts());
                    rsi.setNum(d.getEntryNum());
                    returnStores.add(rsi);
                }
            });
        });
        addReturnStore(returnStores);
    }

    /**
     * 添加到退件库
     *
     * @author lishzh
     */
    @Override
    public void addReturnStore(List<ReturnStoreInput> inputs) {
        inputs.forEach(input -> {
            SparePartsBriefOutput sparePart = Optional.ofNullable(sparePartsService.getSparePart(input.getSpareParts(), null)).orElseThrow(() -> new RuntimeException("spare part not found"));
            ReturnStore rs = new ReturnStore();
            rs.setSourceType(input.getSourceType());
            rs.setCustomer(input.getCustomer());
            rs.setSpareParts(input.getSpareParts());
            rs.setSparePartsNo(sparePart.getSparePartsNo());
            rs.setSparePartsName(sparePart.getSparePartsName());
            rs.setNum(input.getNum());
            rs.setCompany(getCurrentCompanyKey());
            rs.setYard(input.getYard());
            rs.setContainerNo(input.getContainerNo());
            rs.setUseContainerUser(input.getUseContainerUser());

            if (ReturnSourceEnum.DELIVER.getCode().equals(rs.getSourceType()) || ReturnSourceEnum.ORIGINAL.getCode().equals(rs.getSourceType())) {
                //如果是送修或者原件维修,则为送修件
                rs.setRepairType(RepairTypeEnum.DELIVER.getCode());
            } else {
                //如果是维修 保修退件或者采购旧件则为非送修件
                rs.setRepairType(RepairTypeEnum.OTHER.getCode());
            }
            //未分配修理部门
            rs.setIsAssign(CommonEnum.NO.getCode());
            rs.setIsReceive(CommonEnum.NO.getCode());
            Date date = new Date();
            rs.setAcceptDate(date);
            rs.setIsDel(PlatformConstants.ISDEL_NO);
            rs.setCreateTime(date);
            rs.setCreateUser(getCurrentUserId());

            returnStoreDao.insertSelective(rs);
        });
    }

    /**
     * 获取退件库中尚未分配的件
     *
     * @author lishzh
     */
    @Override
    public PagedList<ReturnStoreOutput> getReturnStores(SearchRepairInput input) {
        //查询总记录数
        ReturnStoreExample example = new ReturnStoreExample();
        ReturnStoreExample.Criteria criteria = example.createCriteria();
        //未删除
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        //是否已分配
        if (StringUtils.isNotEmpty(input.getIsAssign())) {
            criteria.andIsAssignEqualTo(input.getIsAssign());
        }
        //是否已接收
        if (StringUtils.isNotEmpty(input.getIsReceive())) {
            criteria.andIsReceiveEqualTo(input.getIsReceive());
        }
        //修件类型
        if (StringUtils.isNotEmpty(input.getRepairType())) {
            criteria.andRepairTypeEqualTo(input.getRepairType());
        }
        //修理部门
        if (StringUtils.isNotEmpty(input.getDepartment())) {
            criteria.andRepairDepartmentEqualTo(input.getDepartment());
        }
        int total = (int) returnStoreDao.countByExample(example);

        //分页查询
        PagedList<ReturnStoreOutput> page = new PagedList<>(input.getPageIndex(), input.getPageSize(), total);
        example.setLimitStart(page.getLimitStart());
        example.setLimitEnd(page.getLimitEnd());
        example.setOrderByClause("create_time desc");
        List<ReturnStore> rss = returnStoreDao.selectByExample(example);

        List<ReturnStoreOutput> outputs = rss.stream().map(r -> {
            ReturnStoreOutput output = new ReturnStoreOutput();
            output.setWareReturnStoreId(r.getWareReturnStoreId());
            output.setAcceptDate(r.getAcceptDate());
            output.setCompany(r.getCompany());
            output.setCompanyLangLang(r.getCompany());
            output.setCustomer(r.getCustomer());
            output.setCustomerLangLang(r.getCustomer());
            output.setNum(r.getNum());
            output.setRemark(r.getRemark());
            output.setRepairType(r.getRepairType());
            output.setRepairTypeLangLang(r.getRepairType());
            output.setReturnType(r.getReturnType());
            output.setReturnTypeLangLang(r.getReturnType());
            output.setSourceType(r.getSourceType());
            output.setSourceTypeLangLang(r.getSourceType());
            output.setSpareParts(r.getSpareParts());
            output.setSparePartsLangLang(r.getSpareParts());
            output.setSparePartsNo(r.getSparePartsNo());
            output.setRepairDepartment(r.getRepairDepartment());
            output.setRepairDepartmentLangLang(r.getRepairDepartment());
            return output;
        }).collect(Collectors.toList());

        page.getDataList().addAll(outputs);

        return page;
    }


    /**
     * 分配修理部门
     *
     * @author lishzh
     */
    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void assignDepartment(List<ReturnStoreInput> inputs) {
        inputs.forEach(input -> {
            ReturnStore rs = returnStoreDao.selectByPrimaryKey(input.getWareReturnStoreId());
            //只有未分配的才能分配
            if (CommonEnum.NO.getCode().equals(rs.getIsAssign())) {
                rs.setIsAssign(CommonEnum.YES.getCode());
                String name = rs.getSparePartsName();
                rs.setRepairDepartment(input.getRepairDepartment());
                if (StringUtils.isNotEmpty(name) && name.contains("风机")) {
                    rs.setRepairDepartment("LKREPADEPA000009");
                }
                returnStoreDao.updateByPrimaryKeySelective(rs);
            }
        });
    }

    /**
     * 修理部门接收
     *
     * @author lishzh
     */
    @Override
    @Transactional
    public void departmentReceive(List<Integer> ids) {
        ids.forEach(id -> {
            //已接收
            ReturnStore rs = returnStoreDao.selectByPrimaryKey(id);
            rs.setIsReceive(CommonEnum.YES.getCode());
            returnStoreDao.updateByPrimaryKeySelective(rs);


            if (rs.getSparePartsName().contains("压缩机") || rs.getSparePartsName().contains("风机")) {
                int num = rs.getNum().intValue();
                for (int i = 0; i < num; i++) {
                    rs.setNum(WarehouseConstants.DOUBLE_ONE);
                    addRepairStore(rs);
                }
            } else {
                addRepairStore(rs);
            }
        });

    }

    /**
     * 添加至备件维修库
     *
     * @author lishzh
     */
    void addRepairStore(ReturnStore rs) {
        //添加至备件维修库
        RepairStore repairStore = new RepairStore();
        String billNumber = billTypeService.getBillNumber(WarehouseConstants.BILL_REPAIR, getCurrentCompanyKey());
        if (StringUtils.isEmpty(billNumber)) {
            throw new RuntimeException("no is empty");
        }
        //修理单号
        repairStore.setRepairNo(billNumber);
        //获取备件信息
        SparePartsBriefOutput sparePart = Optional.of(sparePartsService.getSparePart(rs.getSpareParts(), null)).orElseThrow(() -> new RuntimeException("spare part not found"));
        repairStore.setSpareParts(rs.getSpareParts());
        repairStore.setSparePartsCategories(sparePart.getSparePartsCategories());
        repairStore.setSparePartsName(sparePart.getSparePartsName());
        //所属公司
        repairStore.setCompany(getCurrentCompanyKey());
        //修理类型
        repairStore.setRepairType(rs.getSourceType());
        //客户
        repairStore.setCustomer(rs.getCustomer());
        repairStore.setRepairDepartment(rs.getRepairDepartment());
        repairStore.setNum(rs.getNum());

        BigDecimal zero = new BigDecimal(WarehouseConstants.DOUBLE_ZERO);
        repairStore.setStockinPrice(zero);
        repairStore.setUseSparePartsPrice(zero);
        repairStore.setIsOver(CommonEnum.NO.getCode());
        repairStore.setIsOut(CommonEnum.NO.getCode());
        repairStore.setIsIn(CommonEnum.NO.getCode());
        repairStore.setIsDel(PlatformConstants.ISDEL_NO);
        repairStore.setCreateTime(new Date());
        repairStore.setCreateUser(getCurrentUserId());

        repairStoreDao.insertSelective(repairStore);
    }

    /**
     * 修理部门退回仓库
     * <p>
     * author lishzh
     */
    @Override
    public void departmentReturn(List<Integer> ids) {
        ids.forEach(id -> {
            ReturnStore rs = returnStoreDao.selectByPrimaryKey(id);
            //更新修理部门为null
            rs.setRepairDepartment(null);
            //更新为未分配状态
            rs.setIsAssign(CommonEnum.NO.getCode());
            returnStoreDao.updateByPrimaryKey(rs);
        });

    }

    /**
     * 查询备件维修库中的件
     *
     * @author lishzh
     */
    @Override
    public PagedList<RepairStoreOutput> getRepairStores(SearchRepairInput input) {
        RepairStoreExample example = new RepairStoreExample();
        RepairStoreExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotEmpty(input.getDepartment())) {
            criteria.andRepairDepartmentEqualTo(input.getDepartment());
        }
        if (StringUtils.isNotEmpty(input.getIsOver())) {
            criteria.andIsOverEqualTo(input.getIsOver());
        }
        if (StringUtils.isNotEmpty(input.getIsOut())) {
            criteria.andIsOutEqualTo(input.getIsOut());
        }
        if (StringUtils.isNotEmpty(input.getIsIn())) {
            criteria.andIsInEqualTo(input.getIsIn());
        }
        if (input.getIsDel() != null) {
            criteria.andIsDelEqualTo(input.getIsDel());
        }
        int total = (int) repairStoreDao.countByExample(example);
        PagedList<RepairStoreOutput> page = new PagedList<>(input.getPageIndex(), input.getPageSize(), total);

        List<RepairStoreOutput> outputs = repairStoreDao.selectByExample(example).stream().map(r -> {
            RepairStoreOutput output = new RepairStoreOutput();
            output.setWareRepairStoreId(r.getWareRepairStoreId());
            output.setRepairNo(r.getRepairNo());
            Optional.ofNullable(sparePartsService.getSparePart(r.getSpareParts(), null)).ifPresent(sp -> output.setSparePartsNo(sp.getSparePartsNo()));
            output.setSpareParts(r.getSpareParts());
            output.setSparePartsLangLang(r.getSpareParts());
            output.setContainerNo(r.getContainerNo());
            output.setCustomer(r.getCustomer());
            output.setCustomerLangLang(r.getCustomer());
            output.setNum(r.getNum());
            output.setRepairNum(r.getRepairNum());
            output.setWasteNum(r.getWasteNum());
            output.setCreateTime(r.getCreateTime());
            output.setRepairType(r.getRepairType());
            output.setRepairTypeLangLang(r.getRepairType());
            output.setCompany(r.getCompany());
            output.setCompanyLangLang(r.getCompany());
            output.setUseSparePartsPrice(r.getUseSparePartsPrice());

            //获取维修报告信息
            getRepairReportByStroeId(r.getWareRepairStoreId()).ifPresent(rr -> {
                output.setNewSerial(rr.getNewSerial());
            });

            return output;
        }).collect(Collectors.toList());

        page.getDataList().addAll(outputs);


        return page;
    }

    /**
     * 根据ID查询备件维修库中的件
     *
     * @author lishzh
     */
    @Override
    public RepairStoreOutput getRepairStoreById(Integer id) {
        RepairStore r = repairStoreDao.selectByPrimaryKey(id);

        RepairStoreOutput output = new RepairStoreOutput();
        output.setWareRepairStoreId(r.getWareRepairStoreId());
        output.setRepairNo(r.getRepairNo());

        Optional.ofNullable(sparePartsService.getSparePart(r.getSpareParts(), null)).ifPresent(sp -> output.setSparePartsNo(sp.getSparePartsNo()));
        output.setSpareParts(r.getSpareParts());
        output.setSparePartsLangLang(r.getSpareParts());

        //获取维修报告信息
        getRepairReportByStroeId(r.getWareRepairStoreId()).ifPresent(rr -> {
            output.setNewSerial(rr.getNewSerial());
            output.setWareRepairReportId(rr.getWareRepairReportId());
        });

        return output;
    }

    /**
     * 维修报告录入
     *
     * @author lishzh
     */
    @Override
    @Transactional
    public void addRepairReport(RepairReportInput input) {
        RepairStore rs = repairStoreDao.selectByPrimaryKey(input.getWareRepairStoreId());
        //是否压缩机
        boolean isCompressor = rs.getSparePartsName().contains("压缩机");
        //是否风机
        boolean isFan = rs.getSparePartsName().contains("风机");
        //是否送修件
        boolean isDeliver = ReturnSourceEnum.DELIVER.getCode().equals(rs.getRepairType())||ReturnSourceEnum.ORIGINAL.getCode().equals(rs.getRepairType());
        if (isCompressor||isFan){
            input.setRepairNum(rs.getNum());
            input.setWasteNum(WarehouseConstants.DOUBLE_ZERO);
        }

        if (input.getProcessingChargesTax()==null){
            input.setProcessingChargesTax(new BigDecimal(WarehouseConstants.DOUBLE_ZERO));
        }
        //保存维修报告
        RepairReport rr = new RepairReport();
        rr.setWareRepairStoreId(input.getWareRepairStoreId());
        rr.setReportNo(input.getReportNo());
        rr.setProcessingUnit(input.getProcessingUnit());
        rr.setProcessingChargesTax(input.getProcessingChargesTax());
        rr.setProcessingInvoiceType(input.getProcessingInvoiceType());
        rr.setManufacturer(input.getManufacturer());
        rr.setCompany(getCurrentCompanyKey());
        rr.setYard(input.getYard());
        rr.setTestUser(input.getTestUser());
        rr.setRepairUser(input.getRepairUser());
        rr.setRepairNum(input.getRepairNum());
        rr.setNewSerial(input.getNewSerial());
        rr.setFaultStorage(input.getFaultStorage());
        rr.setWasteNum(input.getWasteNum());
        rr.setChangeOriginal(input.getChangeOriginal());
        rr.setFaultRecord(input.getFaultRecord());
        rr.setRepairRecord(input.getRepairRecord());
        rr.setRepairAmount(input.getRepairAmount());
        rr.setRepairReason(input.getRepairReason());
        rr.setAuditStatus(input.getAuditStatus());
        rr.setRemark(input.getRemark());
        //维修部门

        rr.setRepairDepartment(rs.getRepairDepartment());
        Integer userId = getCurrentUserId();
        //报告录入人
        rr.setRecordUser(userId);
        rr.setCreateUser(userId);
        Date date = new Date();
        rr.setCreateTime(date);
        rr.setIsDel(PlatformConstants.ISDEL_NO);
        repairReportDao.insertSelective(rr);
        if (input.getDetails() != null) {
            //保存明细
            input.getDetails().stream().forEach(d -> {
                RepairReportDetail rrd = new RepairReportDetail();
                rrd.setWareRepairReportId(rr.getWareRepairReportId());
                rrd.setSpareParts(d.getSpareParts());
                rrd.setNum(d.getNum());
                rrd.setRemark(d.getRemark());
                rrd.setCreateTime(date);
                rrd.setCreateUser(userId);
                rrd.setIsDel(PlatformConstants.ISDEL_NO);
                repairReportDetailDao.insertSelective(rrd);
            });
        }


        if (isCompressor){
            if (!isDeliver){
                //turnProcess(rs.getWareRepairStoreId());
            }
        }else if (isFan){
            if (!isDeliver){
                turnProcess(rs.getWareRepairStoreId());
                //更新状态为修毕
                rs.setIsOver(CommonEnum.YES.getCode());
                rs.setRepairNum(rr.getRepairNum());
                rs.setWasteNum(rr.getWasteNum());
            }
        }else {
            //更新状态为修毕
            rs.setIsOver(CommonEnum.YES.getCode());
            rs.setRepairNum(rr.getRepairNum());
            rs.setWasteNum(rr.getWasteNum());
        }
        repairStoreDao.updateByPrimaryKeySelective(rs);




        //报废

    }

    /**
     * 根据备件维修库ID获取维修报告
     *
     * @return Optional<RepairReport>
     * @author lishzh
     */
    Optional<RepairReport> getRepairReportByStroeId(Integer repairStoreId) {
        RepairReportExample example = new RepairReportExample();
        example.createCriteria().andWareRepairStoreIdEqualTo(repairStoreId);
        return repairReportDao.selectByExample(example).stream().findFirst();
    }

    /**
     * 获取压缩机维修材料库存
     *
     * @param spareParts
     * @author lishzh
     */
    @Override
    public List<Double> getStockNum(List<String> spareParts) {
        String yard = getCurrentYardKey();
        return spareParts.stream().map(sp -> {
            Double num=WarehouseConstants.DOUBLE_ZERO;

            num=stockService.getStockCompressorMaterial(yard,sp).stream().mapToDouble(StockOutput::getActualSurplusNum).summaryStatistics().getSum();

            return num;
        }).collect(Collectors.toList());
    }

    /**
     * 维修材料出库
     *
     * @param repairReportId
     * @author lishzh
     */
    @Override
    @Transactional
    public void materialOut(Integer repairReportId) {
        RepairReport repairReport = repairReportDao.selectByPrimaryKey(repairReportId);
        RepairStore repairStore = repairStoreDao.selectByPrimaryKey(repairReport.getWareRepairStoreId());
        //转委托加工
        Integer id = turnProcess(repairReportId);
        // 出库
        List<Integer> ids=new ArrayList<>();
        ids.add(id);
        entrustProcessService.audit(ids);

        //更新状态为修毕
        repairStore.setIsOver(CommonEnum.YES.getCode());
        repairStore.setRepairNum(repairReport.getRepairNum());
        repairStore.setWasteNum(repairReport.getWasteNum());
        repairStoreDao.updateByPrimaryKeySelective(repairStore);

    }

    /**
     * 转委托加工
     *
     * @author lishzh
     */
    @Override
    public Integer turnProcess(Integer repairReportId) {
        RepairReport repairReport = repairReportDao.selectByPrimaryKey(repairReportId);
        RepairStore repairStore = repairStoreDao.selectByPrimaryKey(repairReport.getWareRepairStoreId());
        //生成委托加工单

        EntrustProcessInput epInput = new EntrustProcessInput();
        epInput.setBillTypeName(WarehouseConstants.BILL_REPAIR_EP);
        epInput.setBillStatus(EntrustProcessStatusEnum.NOT_OUT.getCode());
        epInput.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
        epInput.setProcessingChargesTax(repairReport.getProcessingChargesTax());
        epInput.setProcessingInvoiceType(repairReport.getProcessingInvoiceType());
        epInput.setProcessingUnit(repairReport.getProcessingUnit());

        //加工材料
        String yard = getCurrentYardKey();
        List<MaterialInput> materials=new ArrayList<>();
        getReportDetails(repairReportId).forEach(rd -> {
            List<StockOutput> stock = stockService.getStockCompressorMaterial(yard, rd.getSpareParts());
            for (StockOutput so:stock){
                double needNum = rd.getNum() - so.getActualSurplusNum();
                if (needNum>WarehouseConstants.DOUBLE_ZERO){
                    MaterialInput mi = new MaterialInput();
                    mi.setWarehouse(so.getWarehouse());
                    mi.setWarehouseType(so.getWarehouseType());
                    mi.setSparePartsBatch(so.getSparePartsBatch());
                    mi.setSpareParts(rd.getSpareParts());
                    mi.setProcessingNum(so.getActualSurplusNum());
                    mi.setPrice(so.getUnitPrice());
                    materials.add(mi);
                }else {
                    MaterialInput mi = new MaterialInput();
                    mi.setWarehouse(so.getWarehouse());
                    mi.setWarehouseType(so.getWarehouseType());
                    mi.setSparePartsBatch(so.getSparePartsBatch());
                    mi.setSpareParts(rd.getSpareParts());
                    mi.setProcessingNum(rd.getNum());
                    mi.setPrice(so.getUnitPrice());
                    materials.add(mi);
                    break;
                }
            }
        });
        epInput.setMaterials(materials);

        //加工成品
        List<ProductInput> products = new ArrayList<>();
        ProductInput pi = new ProductInput();
        pi.setSpareParts(repairStore.getSpareParts());
        pi.setEntryNum(repairStore.getNum());
        products.add(pi);
        epInput.setProducts(products);


        Integer id = entrustProcessService.generateEntrustProcess(epInput);

        repairReport.setWareEntrustedProcessingId(id);
        repairReportDao.updateByPrimaryKeySelective(repairReport);

        return id;
    }

    /**
     * 获取报告明细
     *
     * @author lishzh
     */
    List<RepairReportDetail> getReportDetails(Integer repairReportId) {
        RepairReportDetailExample example = new RepairReportDetailExample();
        example.createCriteria().andWareRepairReportIdEqualTo(repairReportId);
        return repairReportDetailDao.selectByExample(example);
    }

    /**
     * 修毕出库
     *
     * @author lishzh
     */
    @Override
    @Transactional
    public void overOut(List<Integer> ids) {
        ids.forEach(repairStoreId -> {
            RepairStore rs = repairStoreDao.selectByPrimaryKey(repairStoreId);
            RepairReport repairReport = getRepairReportByStroeId(repairStoreId).orElseThrow(() -> new RuntimeException("report not found"));

            rs.setRepairNum(repairReport.getRepairNum());
            rs.setWasteNum(repairReport.getWasteNum());

            EntrustProcess entrustProcess = entrustProcessDao.selectByPrimaryKey(repairReport.getWareEntrustedProcessingId());
            if(entrustProcess!=null){
                rs.setStockinPrice(entrustProcess.getEntryAmount());
                rs.setUseSparePartsPrice(entrustProcess.getStockoutAmount());
            }else {
                rs.setStockinPrice(new BigDecimal(WarehouseConstants.DOUBLE_ZERO));
                rs.setUseSparePartsPrice(new BigDecimal(WarehouseConstants.DOUBLE_ZERO));
            }
            if (ReturnSourceEnum.DELIVER.getCode().equals(rs.getRepairType())
                    || ReturnSourceEnum.ORIGINAL.getCode().equals(rs.getRepairType())) {
                //送修或者原件维修


            } else {
                //退件或采购旧件
            }

            rs.setIsOut(CommonEnum.YES.getCode());
            repairStoreDao.updateByPrimaryKeySelective(rs);
        });
    }

    /**
     * 修毕审核入库
     *
     * @author lishzh
     */
    @Override
    @Transactional
    public void auditIn(List<Integer> ids) {
        ids.forEach(repairStoreId -> {
            RepairStore rs = repairStoreDao.selectByPrimaryKey(repairStoreId);

            RepairReport repairReport = getRepairReportByStroeId(repairStoreId).orElseThrow(() -> new RuntimeException("report not found"));


            //已入库
            rs.setIsIn(CommonEnum.YES.getCode());

            if (ReturnSourceEnum.DELIVER.getCode().equals(rs.getRepairType())) {
                //送修

            } else if (ReturnSourceEnum.ORIGINAL.getCode().equals(rs.getRepairType())) {
                //原件维修

            } else {
                //退件或采购旧件
                //获取库存
                SparePartsBriefOutput sparePart = sparePartsService.getSparePart(rs.getSpareParts(), null);

                SearchStockInput searchStockInput = new SearchStockInput(1,1000);
                searchStockInput.setCompany(getCurrentCompanyKey());
                searchStockInput.setWarehouseType("LKWARETYPE000006");
                searchStockInput.setSparePartsNo(sparePart.getSparePartsNo());
                PagedList<StockOutput> stock = stockService.stockPageList(searchStockInput);
                List<StockOutput> dataList = stock.getDataList();
                BigDecimal originAmount = new BigDecimal(WarehouseConstants.DOUBLE_ZERO);
                BigDecimal originPrice = new BigDecimal(WarehouseConstants.DOUBLE_ZERO);
                Double total = WarehouseConstants.DOUBLE_ZERO;
                if (!CollectionUtils.isEmpty(dataList)) {
                    for (StockOutput so : dataList) {
                        //原总金额
                        originAmount = so.getUnitPrice().multiply(new BigDecimal(so.getActualSurplusNum())).add(originAmount);
                        total += so.getActualSurplusNum();
                    }
                    //原单价
                    originPrice = originAmount.divide(new BigDecimal(total), 4, RoundingMode.HALF_UP);
                }
                BigDecimal newAmount = rs.getStockinPrice().multiply(new BigDecimal(rs.getRepairNum()));
                total += rs.getRepairNum();
                BigDecimal totalAmount = originAmount.add(newAmount);
                BigDecimal newPrice = totalAmount.divide(new BigDecimal(total), 4, RoundingMode.HALF_UP);

                String remark = "原入库价格:" + originPrice.toString()
                        + ",合计成本：" + totalAmount.toString()
                        + ";修复数量：" + rs.getRepairNum().toString()
                        + "，入库后加权平均价格:" + newPrice.toString();

                if (!CollectionUtils.isEmpty(dataList)) {
                    dataList.forEach(d -> {
                        EditStockInput editStockInput = new EditStockInput();
                        editStockInput.setWareStockId(d.getWareStockId());
                        editStockInput.setUnitPrice(newPrice);
                        editStockInput.setRemark(remark);
                        stockService.editStock(editStockInput);

                    });
                }


                // 入库
                // 入库单set input params
                StockInInput stockInInput = new StockInInput();
                // 源单号
                stockInInput.setNo(rs.getRepairNo());
                // 单据类型
                String billType = billTypeService.getBillTypeKeyByName(WarehouseConstants.BILL_REPAIR);
                stockInInput.setBillType(billType);
                stockInInput.setCompany(rs.getCompany());
                // 入库仓库
                stockInInput.setEntryWarehouse("LKWAREHOU000001");

                // 入库明细List
                List<AddStockinDetailInput> stockinDetailInputList = new ArrayList<>();
                // 入库单明细
                AddStockinDetailInput stockinDetail = new AddStockinDetailInput();
                stockinDetail.setSpareParts(rs.getSpareParts());
                stockinDetail.setEntryNum(rs.getRepairNum());
                stockinDetail.setStorageLocation("");
                stockinDetail.setEntryPrice(rs.getStockinPrice());
                stockinDetail.setWarehouseType("LKWARETYPE000006");
                stockinDetail.setLength(WarehouseConstants.DOUBLE_ZERO);
                stockinDetail.setWidth(WarehouseConstants.DOUBLE_ZERO);

                stockinDetailInputList.add(stockinDetail);
                stockInInput.setStockinDetail(
                        stockinDetailInputList.toArray(new AddStockinDetailInput[stockinDetailInputList.size()]));
                stockinService.directIn(stockInInput);
            }
            repairStoreDao.updateByPrimaryKeySelective(rs);
        });


    }

    /**
     * 添加客户送修出库单
     *
     * @author lishzh
     */
    @Override
    public void addCustomerDeliver(CustomerDeliverInput input) {
        CustomerDeliver cd = new CustomerDeliver();
        String billNumber = billTypeService.getBillNumber(WarehouseConstants.BILL_CUSTOMER_DELIVER, getCurrentCompanyKey());
        if (StringUtils.isEmpty(billNumber)) {
            throw new RuntimeException("no is empty");
        }
        cd.setStockoutNo(billNumber);
        cd.setCompany(getCurrentCompanyKey());
        cd.setCustomer(input.getCustomer());
        cd.setRemark(input.getRemark());
        cd.setOutStatus(CustomerDeliverEnum.NOT_OUT.getCode());
        cd.setChargeStatus(ChargeStatus.NO.getCode());
        cd.setRepairCost(new BigDecimal(WarehouseConstants.DOUBLE_ZERO));
        cd.setRepairIncome(new BigDecimal(WarehouseConstants.DOUBLE_ZERO));
        Date date = new Date();
        cd.setCreateTime(date);
        Integer userId = getCurrentUserId();
        cd.setCreateUser(userId);

        input.getDetails().forEach(d -> {
            BigDecimal cost = cd.getRepairCost().add(d.getRepairCost());
            cd.setRepairCost(cost);
            BigDecimal offer = cd.getRepairIncome().add(d.getRepairOffer());
            cd.setRepairIncome(offer);
            cd.setRepairProfit(offer);
        });
        customerDeliverDao.insertSelective(cd);

        input.getDetails().forEach(d -> {
            CustomerDeliverDetail detail = new CustomerDeliverDetail();
            detail.setWareCustomerDeliverId(cd.getWareCustomerDeliverId());
            detail.setNewSerial(d.getNewSerial());
            detail.setRepairCost(d.getRepairCost());
            detail.setRepairOffer(d.getRepairOffer());
            detail.setRepairIncome(detail.getRepairOffer().subtract(detail.getRepairCost()));
            detail.setSpareParts(d.getSpareParts());
            detail.setNum(d.getNum());
            detail.setRemark(d.getRemark());

            detail.setCreateTime(date);
            detail.setCreateUser(userId);
            detail.setIsDel(PlatformConstants.ISDEL_NO);
            customerDeliverDetailDao.insertSelective(detail);

            BigDecimal cost = cd.getRepairCost().add(detail.getRepairCost());
            cd.setRepairCost(cost);
            BigDecimal offer = cd.getRepairIncome().add(detail.getRepairOffer());
            cd.setRepairIncome(offer);
            cd.setRepairProfit(offer);

            RepairStore rs = repairStoreDao.selectByPrimaryKey(d.getWareRepairStoreId());
            rs.setIsDel(PlatformConstants.ISDEL_YES);
            repairStoreDao.updateByPrimaryKeySelective(rs);
        });




    }

    /**
     * 审核客户送修出库单
     *
     * @author lishzh
     */
    @Override
    @Transactional
    public void auditCustomerDeliver(List<Integer> ids) {
        List<BillGiveRepairInput> inputs=new ArrayList<>();
        String yard = getCurrentYardKey();
        ids.forEach(id -> {
            CustomerDeliver cd = customerDeliverDao.selectByPrimaryKey(id);
            if (CustomerDeliverEnum.NOT_OUT.getCode().equals(cd.getOutStatus())) {
                BillGiveRepairInput input=new BillGiveRepairInput();
                input.setCompanyKey(cd.getCompany());
                input.setYard(yard);
                input.setMerchantsKey(cd.getCustomer());
                input.setDeliverId(cd.getWareCustomerDeliverId());
                input.setRepairCost(cd.getRepairCost());
                input.setRepairIncome(cd.getRepairIncome());
                input.setRepairProfit(cd.getRepairProfit());
                inputs.add(input);

                cd.setChargeStatus(ChargeStatus.ALL.getCode());
                cd.setOutStatus(CustomerDeliverEnum.OUTED.getCode());
                customerDeliverDao.updateByPrimaryKeySelective(cd);
            }
        });
        Result<Boolean> res = financeClient.createBill(inputs);
        if (res==null||!res.getData()){
            throw new RuntimeException("charge fail");
        }
    }

    /**
     * 获取客户送修单
     *
     * @author lishzh
     */
    @Override
    public PagedList<CustomerDeliverOutput> getCustomerDelivers(SearchRepairInput input) {
        CustomerDeliverExample example = new CustomerDeliverExample();
        CustomerDeliverExample.Criteria criteria = example.createCriteria();
        if (input.getStartDate() != null) {
            criteria.andCreateTimeGreaterThanOrEqualTo(input.getStartDate());
        }
        if (input.getEndDate() != null) {
            criteria.andCreateTimeLessThanOrEqualTo(DateUtil.nextDay(input.getEndDate()));
        }
        if (StringUtils.isNotEmpty(input.getCompany())) {
            criteria.andCompanyEqualTo(input.getCompany());
        }
        if (StringUtils.isNotEmpty(input.getCustomer())) {
            criteria.andCustomerEqualTo(input.getCustomer());
        }
        int total = (int) customerDeliverDao.countByExample(example);

        PagedList<CustomerDeliverOutput> page = new PagedList<>(input.getPageIndex(), input.getPageSize(), total);
        example.setLimitStart(page.getLimitStart());
        example.setLimitEnd(page.getLimitEnd());
        example.setOrderByClause("create_time desc");
        List<CustomerDeliverOutput> outputs = customerDeliverDao.selectByExample(example).stream().map(cd -> {
            CustomerDeliverOutput output = new CustomerDeliverOutput();
            output.setWareCustomerDeliverId(cd.getWareCustomerDeliverId());
            output.setStockoutNo(cd.getStockoutNo());
            output.setCustomer(cd.getCustomer());
            output.setCustomerLangLang(cd.getCustomer());
            output.setCompany(cd.getCompany());
            output.setCompanyLangLang(cd.getCompany());
            output.setRepairCost(cd.getRepairCost());
            output.setRepairIncome(cd.getRepairIncome());
            output.setRepairProfit(cd.getRepairProfit());
            output.setOutStatus(cd.getOutStatus());
            output.setOutStatusLangLang(cd.getOutStatus());
            output.setChargeStatus(cd.getChargeStatus());
            output.setChargeStatusLangLang(cd.getChargeStatus());
            output.setDetails(getCustomerDeliverDetailOutputs(cd.getWareCustomerDeliverId()));
            return output;
        }).collect(Collectors.toList());

        page.setDataList(outputs);
        return page;
    }

    /**
     * 获取客户送修明细
     *
     * @author lishzh
     */
    @Override
    public List<CustomerDeliverDetailOutput> getCustomerDeliverDetailOutputs(Integer id) {
        CustomerDeliverDetailExample example = new CustomerDeliverDetailExample();
        example.createCriteria().andWareCustomerDeliverIdEqualTo(id);
        return customerDeliverDetailDao.selectByExample(example).stream().map(d -> {
            CustomerDeliverDetailOutput output = new CustomerDeliverDetailOutput();
            output.setSpareParts(d.getSpareParts());
            Optional.ofNullable(sparePartsService.getSparePart(d.getSpareParts(), null)).ifPresent(sp -> {
                output.setSparePartsNo(sp.getSparePartsNo());
            });
            output.setSparePartsLangLang(d.getSpareParts());
            output.setNewSerial(d.getNewSerial());
            output.setNum(d.getNum());
            output.setRepairCost(d.getRepairCost());
            output.setRepairOffer(d.getRepairOffer());
            output.setRepairIncome(d.getRepairIncome());
            output.setOutStatus(d.getOutStatus());
            output.setOutStatusLangLang(d.getOutStatus());
            output.setRemark(d.getRemark());
            return output;
        }).collect(Collectors.toList());
    }
}
