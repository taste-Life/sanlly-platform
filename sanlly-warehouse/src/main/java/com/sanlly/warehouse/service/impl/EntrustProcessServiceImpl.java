package com.sanlly.warehouse.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.sanlly.warehouse.entity.*;
import com.sanlly.warehouse.models.input.stockin.SearchStockinInput;
import com.sanlly.warehouse.models.input.warehouse.AddWarehouseYardRelationInput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsBriefOutput;
import com.sanlly.warehouse.models.output.stockin.StockinOutput;
import com.sanlly.warehouse.models.output.warehouse.WareTypeYardOutput;
import com.sanlly.warehouse.service.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.AuditStateEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.warehouse.constants.WarehouseConstants;
import com.sanlly.warehouse.dao.EntrustMaterialMapper;
import com.sanlly.warehouse.dao.EntrustProcessMapper;
import com.sanlly.warehouse.dao.EntrustProductMapper;
import com.sanlly.warehouse.entity.EntrustProcessExample.Criteria;
import com.sanlly.warehouse.enums.EntrustProcessStatusEnum;
import com.sanlly.warehouse.models.input.entrustprocess.EntrustProcessInput;
import com.sanlly.warehouse.models.input.entrustprocess.SearchEntrustProcessInput;
import com.sanlly.warehouse.models.input.stockin.AddStockinDetailInput;
import com.sanlly.warehouse.models.input.stockin.StockInInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutDetailInput;
import com.sanlly.warehouse.models.input.stockout.StockOutInput;
import com.sanlly.warehouse.models.output.entrustprocess.EntrustProcessOutput;
import com.sanlly.warehouse.models.output.entrustprocess.MaterialOutput;
import com.sanlly.warehouse.models.output.entrustprocess.ProductOutput;

/**
 * 委托加工service
 *
 * @author lishzh
 */
@Service
public class EntrustProcessServiceImpl extends BaseServiceImpl implements EntrustProcessService {

    @Autowired
    private EntrustProcessMapper entrustProcessDao;

    @Autowired
    private EntrustMaterialMapper materialDao;

    @Autowired
    private EntrustProductMapper productDao;

    @Autowired
    private BillTypeService billTypeService;

    @Autowired
    private WareStockService stockService;

    @Autowired
    private WareStockoutService stockoutService;

    @Autowired
    private WareStockinService stockinService;

    @Autowired
    private WarehouseService warehouseService;

    @Autowired
    private WareSparePartsService sparePartsService;

    /**
     * 添加委托加工单
     *
     * @param input
     * @author lishzh
     */
    @Override
    @Transactional
    public void addEntrustProcess(EntrustProcessInput input) {
        input.setBillTypeName(WarehouseConstants.BILL_ENTRUST_PROCESS);
        input.setBillStatus(EntrustProcessStatusEnum.NOT_OUT.getCode());
        input.setAuditStatus(AuditStateEnum.UNAUDIT.getCode());
        generateEntrustProcess(input);
    }

    /**
     * 生成委托加工单
     *
     * @author lishzh
     */
    @Override
    public Integer generateEntrustProcess(EntrustProcessInput input) {
        // 保存委托加工单
        EntrustProcess entrustProcess = new EntrustProcess();
        BeanUtils.copyProperties(input, entrustProcess);
        String company = getCurrentCompanyKey();
        // 生成单号
        entrustProcess.setEntrustedProcessingNo(
                billTypeService.getBillNumber(input.getBillTypeName(), company));
        // 若有加工费则计算出相关费用
        if (input.getProcessingChargesTax() != null
                && input.getProcessingChargesTax().doubleValue() > WarehouseConstants.DOUBLE_ZERO) {
            // 获取增值税率
            Double taxRate = Optional.ofNullable(purchaseService.getInvoiceTypes(input.getProcessingInvoiceType()))
                    .orElseThrow(() -> new RuntimeException("insert fail")).getData();
            BigDecimal tr = new BigDecimal(taxRate);
            // 增值税率加1
            BigDecimal tro = tr.add(new BigDecimal(WarehouseConstants.DOUBLE_ONE));
            // 增值税
            entrustProcess.setProcessingChargesVat(
                    input.getProcessingChargesTax().multiply(tr).divide(tro, RoundingMode.HALF_UP));
            // 加工费不含税
            entrustProcess.setProcessingCharges(input.getProcessingChargesTax().divide(tro, RoundingMode.HALF_UP));
        } else {
            entrustProcess.setProcessingChargesTax(new BigDecimal(WarehouseConstants.DOUBLE_ZERO));
            entrustProcess.setProcessingChargesVat(new BigDecimal(WarehouseConstants.DOUBLE_ZERO));
            entrustProcess.setProcessingCharges(new BigDecimal(WarehouseConstants.DOUBLE_ZERO));

        }
        // 出库金额
        BigDecimal outAmount = input.getMaterials().stream()
                .map(mi -> mi.getPrice().multiply(new BigDecimal(mi.getProcessingNum()))).reduce(BigDecimal::add)
                .orElseGet(() -> new BigDecimal(WarehouseConstants.DOUBLE_ZERO));

        input.getProducts().forEach(p -> {
            p.setTotalAmount(outAmount.add(entrustProcess.getProcessingCharges()));
        });
        // 入库金额
        BigDecimal inAmount = input.getProducts().stream().map(pi -> pi.getTotalAmount()).reduce(BigDecimal::add)
                .orElseGet(() -> new BigDecimal(WarehouseConstants.DOUBLE_ZERO));
        entrustProcess.setEntryAmount(inAmount);
        entrustProcess.setStockoutAmount(outAmount);
        // 未审核
        entrustProcess.setAuditStatus(input.getAuditStatus());
        // 单据状态
        entrustProcess.setBillStatus(input.getBillStatus());
        // 所属公司
        entrustProcess.setCompany(company);
        // 创建时间
        Date date = new Date();
        entrustProcess.setCreateTime(date);
        // 创建人
        Integer userId = getCurrentUserId();
        entrustProcess.setCreateUser(userId);
        // 未删除
        entrustProcess.setIsDel(PlatformConstants.ISDEL_NO);
        entrustProcessDao.insertSelective(entrustProcess);

        // 保存加工材料
        input.getMaterials().stream().forEach(m -> {
            EntrustMaterial material = new EntrustMaterial();
            BeanUtils.copyProperties(m, material);
            material.setEntrustedProcessingId(entrustProcess.getWareEntrustedProcessingId());
            material.setCompany(company);
            material.setStockoutStatus(EntrustProcessStatusEnum.NOT_OUT.getCode());
            material.setCreateTime(date);
            material.setCreateUser(userId);
            material.setIsDel(PlatformConstants.ISDEL_NO);
            materialDao.insertSelective(material);
        });

        // 保存加工成品
        input.getProducts().forEach(p -> {
            EntrustProduct product = new EntrustProduct();
            BeanUtils.copyProperties(p, product);
            BigDecimal total = entrustProcess.getProcessingCharges().add(outAmount);
            product.setTotalAmount(total);
            if (p.getEntryNum().doubleValue() > 0) {
                BigDecimal invoicePrice = total.divide(new BigDecimal(p.getEntryNum()), RoundingMode.HALF_UP);
                product.setInvoicePrice(invoicePrice);
            }

            product.setEntrustedProcessingId(entrustProcess.getWareEntrustedProcessingId());
            product.setCompany(company);
            product.setEntryStatus(EntrustProcessStatusEnum.NOT_OUT.getCode());
            product.setCreateTime(date);
            product.setCreateUser(userId);
            product.setIsDel(PlatformConstants.ISDEL_NO);

            productDao.insertSelective(product);
        });

        return entrustProcess.getWareEntrustedProcessingId();
    }

    /**
     * 修改委托加工单
     */
    @Override
    public void editEntrustProcess(EntrustProcessInput input) {
        // 修改委托加工单
        EntrustProcess entrustProcess = new EntrustProcess();
        BeanUtils.copyProperties(input, entrustProcess);
        // 修改时间
        Date date = new Date();
        entrustProcess.setUpdateTime(date);
        // 修改人
        Integer userId = getCurrentUserId();
        entrustProcess.setUpdateUser(userId);
        entrustProcess.setProcessingCharges(new BigDecimal(WarehouseConstants.DOUBLE_ZERO));
        // 若有加工费则计算出相关费用
        if (input.getProcessingChargesTax() != null
                && input.getProcessingChargesTax().doubleValue() > WarehouseConstants.DOUBLE_ZERO) {
            // 获取增值税率
            Double taxRate = Optional.ofNullable(purchaseService.getInvoiceTypes(input.getProcessingInvoiceType()))
                    .orElseThrow(() -> new RuntimeException("insert fail")).getData();
            BigDecimal tr = new BigDecimal(taxRate);
            // 增值税率加1
            BigDecimal tro = tr.add(new BigDecimal(WarehouseConstants.DOUBLE_ONE));
            // 增值税
            entrustProcess.setProcessingChargesVat(
                    input.getProcessingChargesTax().multiply(tr).divide(tro, RoundingMode.HALF_UP));
            // 加工费不含税
            entrustProcess.setProcessingCharges(input.getProcessingChargesTax().divide(tro, RoundingMode.HALF_UP));
        }
        // 出库金额
        BigDecimal outAmount = input.getMaterials().stream()
                .map(mi -> mi.getPrice().multiply(new BigDecimal(mi.getProcessingNum()))).reduce(BigDecimal::add)
                .orElseGet(() -> new BigDecimal(WarehouseConstants.DOUBLE_ZERO));
        entrustProcess.setStockoutAmount(outAmount);
        // 入库金额
        BigDecimal inAmount = input.getProducts().stream().map(pi -> pi.getTotalAmount()).reduce(BigDecimal::add)
                .orElseGet(() -> new BigDecimal(WarehouseConstants.DOUBLE_ZERO));
        entrustProcess.setEntryAmount(inAmount);

        entrustProcessDao.updateByPrimaryKeySelective(entrustProcess);

        // 删除原加工材料
        EntrustMaterialExample me = new EntrustMaterialExample();
        me.createCriteria().andEntrustedProcessingIdEqualTo(entrustProcess.getWareEntrustedProcessingId());
        materialDao.deleteByExample(me);

        // 删除原加工成品
        EntrustProductExample pe = new EntrustProductExample();
        pe.createCriteria().andEntrustedProcessingIdEqualTo(entrustProcess.getWareEntrustedProcessingId());
        productDao.deleteByExample(pe);

        String company = getCurrentCompanyKey();
        // 保存加工材料
        input.getMaterials().forEach(m -> {
            EntrustMaterial material = new EntrustMaterial();
            BeanUtils.copyProperties(m, material);
            material.setEntrustedProcessingId(entrustProcess.getWareEntrustedProcessingId());
            material.setCompany(company);
            material.setStockoutStatus(EntrustProcessStatusEnum.NOT_OUT.getCode());
            material.setCreateTime(date);
            material.setCreateUser(userId);
            material.setIsDel(PlatformConstants.ISDEL_NO);

            materialDao.insertSelective(material);
        });

        // 保存加工成品
        input.getProducts().forEach(p -> {
            EntrustProduct product = new EntrustProduct();
            BeanUtils.copyProperties(p, product);
            BigDecimal total = entrustProcess.getProcessingCharges().add(outAmount);
            product.setTotalAmount(total);
            if (p.getEntryNum().doubleValue() > 0) {
                BigDecimal invoicePrice = total.divide(new BigDecimal(p.getEntryNum()), RoundingMode.HALF_UP);
                product.setInvoicePrice(invoicePrice);
            }

            product.setEntrustedProcessingId(entrustProcess.getWareEntrustedProcessingId());
            product.setCompany(company);
            product.setEntryStatus(EntrustProcessStatusEnum.NOT_OUT.getCode());
            product.setCreateTime(date);
            product.setCreateUser(userId);
            product.setIsDel(PlatformConstants.ISDEL_NO);

            productDao.insertSelective(product);
        });

    }

    /**
     * 删除委托加工单
     */
    @Override
    public void deleteEntrustProcess(List<Integer> ids) {
        ids.forEach(id -> {
            // 删除委托加工单
            EntrustProcess entrustProcess = entrustProcessDao.selectByPrimaryKey(id);
            entrustProcess.setIsDel(PlatformConstants.ISDEL_YES);
            entrustProcessDao.updateByPrimaryKeySelective(entrustProcess);

            // 删除原加工材料
            EntrustMaterialExample me = new EntrustMaterialExample();
            me.createCriteria().andEntrustedProcessingIdEqualTo(id);
            EntrustMaterial material = new EntrustMaterial();
            material.setIsDel(PlatformConstants.ISDEL_YES);
            materialDao.updateByExampleSelective(material, me);

            // 删除原加工成品
            EntrustProductExample pe = new EntrustProductExample();
            pe.createCriteria().andEntrustedProcessingIdEqualTo(id);
            EntrustProduct product = new EntrustProduct();
            product.setIsDel(PlatformConstants.ISDEL_YES);
            productDao.updateByExampleSelective(product, pe);

        });

    }

    /**
     * 获取委托加工列表
     */
    @Override
    public PagedList<EntrustProcessOutput> getEntrustProcess(SearchEntrustProcessInput input) {
        // set condition
        EntrustProcessExample example = new EntrustProcessExample();
        Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (input.getStartDate() != null) {
            criteria.andCreateTimeGreaterThanOrEqualTo(input.getStartDate());
        }
        if (input.getEndDate() != null) {
            criteria.andCreateTimeLessThan(DateUtil.nextDay(input.getEndDate()));
        }

        // get total
        int total = (int) entrustProcessDao.countByExample(example);

        // 排序 分页
        PagedList<EntrustProcessOutput> page = new PagedList<>(input.getPageIndex(), input.getPageSize(), total);
        example.setOrderByClause("create_time desc");
        example.setLimitStart(page.getLimitStart());
        example.setLimitEnd(page.getLimitEnd());

        // entity -> output
        List<EntrustProcessOutput> outputs = new ArrayList<>();
        entrustProcessDao.selectByExample(example).forEach(ep -> {
            EntrustProcessOutput output = new EntrustProcessOutput();
            BeanUtils.copyProperties(ep, output);
            output.setInvoiceTypeLangLang(ep.getProcessingInvoiceType());
            output.setBillStatusLangLang(ep.getBillStatus());
            output.setAuditStatusLangLang(ep.getAuditStatus());
            output.setCreateUser(getUserNameByUserId(ep.getCreateUser()));
            // 加工材料列表
            output.setMaterials(getMaterialOutputsById(ep.getWareEntrustedProcessingId()));
            // 加工产品列表
            output.setProducts(getProductOutputsById(ep.getWareEntrustedProcessingId()));

            outputs.add(output);
        });

        page.getDataList().addAll(outputs);
        return page;
    }

    /**
     * 根据id获取委托加工单
     */
    @Override
    public EntrustProcessOutput getEntrustProcessById(Integer id) {
        EntrustProcess entrustProcess = entrustProcessDao.selectByPrimaryKey(id);
        EntrustProcessOutput output = new EntrustProcessOutput();
        BeanUtils.copyProperties(entrustProcess, output);
        // 加工材料列表
        output.setMaterials(getMaterialOutputsById(entrustProcess.getWareEntrustedProcessingId()));
        // 加工产品列表
        output.setProducts(getProductOutputsById(entrustProcess.getWareEntrustedProcessingId()));
        return output;
    }

    /**
     * 获取加工材料entity
     *
     * @param id
     * @return
     * @author lishzh
     */
    List<EntrustMaterial> getMaterialsById(Integer id) {
        EntrustMaterialExample example = new EntrustMaterialExample();
        example.createCriteria().andEntrustedProcessingIdEqualTo(id);
        return materialDao.selectByExample(example);
    }

    /**
     * 获取加工成品entity
     *
     * @param id
     * @return
     * @author lishzh
     */
    List<EntrustProduct> getProductsById(Integer id) {
        EntrustProductExample example = new EntrustProductExample();
        example.createCriteria().andEntrustedProcessingIdEqualTo(id);
        return productDao.selectByExample(example);
    }

    /**
     * 获取加工材料output
     *
     * @param id
     * @return
     * @author lishzh
     */
    List<MaterialOutput> getMaterialOutputsById(Integer id) {
        List<MaterialOutput> materialOutputs = new ArrayList<>();
        getMaterialsById(id).forEach(m -> {
            MaterialOutput mo = new MaterialOutput();
            BeanUtils.copyProperties(m, mo);

            mo.setCompanyLangLang(m.getCompany());
            mo.setSparePartsLangLang(m.getSpareParts());
            mo.setWarehouseLangLang(m.getWarehouse());
            mo.setWarehouseTypeLangLang(m.getWarehouseType());
            StockOutput stockOutput = stockService.getStockByBatch(m.getSparePartsBatch(), m.getSpareParts());

            if (stockOutput != null) {
                mo.setActualSurplusNum(stockOutput.getActualSurplusNum());
                mo.setSparePartsNo(stockOutput.getSparePartsNo());
                mo.setStorageLocation(stockOutput.getStorageLocation());
            }

            materialOutputs.add(mo);
        });
        return materialOutputs;
    }

    /**
     * 获取加工成品output
     *
     * @param id
     * @return
     * @author lishzh
     */
    List<ProductOutput> getProductOutputsById(Integer id) {
        EntrustProductExample example = new EntrustProductExample();
        example.createCriteria().andEntrustedProcessingIdEqualTo(id);
        List<ProductOutput> productOutputs = new ArrayList<>();
        productDao.selectByExample(example).forEach(p -> {
            ProductOutput po = new ProductOutput();
            BeanUtils.copyProperties(p, po);
            po.setSparePartsLangLang(p.getSpareParts());
            po.setWarehouseLangLang(p.getWarehouse());
            po.setWarehouseTypeLangLang(p.getWarehouseType());
            SparePartsBriefOutput sparePart = sparePartsService.getSparePart(p.getSpareParts(), null);
            Optional.ofNullable(sparePart).ifPresent(s -> {
                po.setSparePartsNo(s.getSparePartsNo());
                po.setCategoryLangLang(s.getSparePartsCategories());
            });
            productOutputs.add(po);
        });
        return productOutputs;
    }

    /**
     * 出库审核
     */
    @Override
    @Transactional
    public void audit(List<Integer> ids) {
        ids.forEach(id -> {
            EntrustProcess entrustProcess = entrustProcessDao.selectByPrimaryKey(id);
            // 只有未审核的才能审核
            if (AuditStateEnum.UNAUDIT.getCode().equals(entrustProcess.getAuditStatus())) {
                entrustProcess.setAuditStatus(AuditStateEnum.AUDITED.getCode());
                entrustProcess.setBillStatus(EntrustProcessStatusEnum.ALL_OUT.getCode());
                List<EntrustMaterial> materials = getMaterialsById(entrustProcess.getWareEntrustedProcessingId());

                // 出库
                StockOutInput stockOutInput = new StockOutInput();
                stockOutInput.setNo(entrustProcess.getEntrustedProcessingNo());
                stockOutInput.setCompany(entrustProcess.getCompany());
                String billType = billTypeService.getBillTypeKeyByName(WarehouseConstants.BILL_ENTRUST_PROCESS);
                stockOutInput.setBillType(billType);
                List<AddStockoutDetailInput> details = new ArrayList<>();
                // 入库明细List
                List<AddStockinDetailInput> stockinDetailInputList = new ArrayList<>();
                materials.forEach(m -> {
                    stockOutInput.setWarehouse(m.getWarehouse());
                    AddStockoutDetailInput detail = new AddStockoutDetailInput();
                    detail.setDefaultWarehouseType(m.getWarehouseType());
                    detail.setSpareParts(m.getSpareParts());
                    detail.setSparePartsBatch(m.getSparePartsBatch());
                    detail.setStockoutNum(m.getProcessingNum());
                    details.add(detail);
                    m.setStockoutStatus(EntrustProcessStatusEnum.ALL_OUT.getCode());

                    // 入库单明细
                    AddStockinDetailInput stockinDetail = new AddStockinDetailInput();
                    stockinDetail.setSpareParts(m.getSpareParts());
                    stockinDetail.setEntryNum(m.getProcessingNum());
                    stockinDetail.setStorageLocation("");
                    stockinDetail.setWarehouseType("LKWARETYPE000018");//委托加工库
                    stockinDetail.setLength(WarehouseConstants.DOUBLE_ZERO);
                    stockinDetail.setWidth(WarehouseConstants.DOUBLE_ZERO);

                    stockinDetail.setStockinBatch(detail.getSparePartsBatch());
                    stockinDetailInputList.add(stockinDetail);


                    materialDao.updateByPrimaryKeySelective(m);
                });
                stockOutInput.setStockoutDetailInputList(details.toArray(new AddStockoutDetailInput[details.size()]));

                stockoutService.directOut(stockOutInput);

                // 加工材料入委托加工库
                // 入库单set input params
                StockInInput stockInInput = new StockInInput();
                // 源单号
                stockInInput.setNo(entrustProcess.getEntrustedProcessingNo());
                // 单据类型
                stockInInput.setBillType(billType);
                stockInInput.setCompany(entrustProcess.getCompany());
                // 入库仓库
                AddWarehouseYardRelationInput input = new AddWarehouseYardRelationInput();
                input.setYard(getCurrentYardKey());
                WareTypeYardOutput warehouse = warehouseService.getWarehouseByYard(input);
                stockInInput.setEntryWarehouse(warehouse.getDefaultWarehouse());


                // 调拨入库
                stockInInput.setStockinDetail(
                        stockinDetailInputList.toArray(new AddStockinDetailInput[stockinDetailInputList.size()]));
                stockinService.TransferIn(stockInInput);

                entrustProcessDao.updateByPrimaryKeySelective(entrustProcess);

                SearchStockinInput searchStockinInput = new SearchStockinInput(1, 1);
                searchStockinInput.setNo(entrustProcess.getEntrustedProcessingNo());

                PagedList<StockinOutput> stockin = stockinService.stockinPageList(searchStockinInput);
                stockin.getDataList().stream().findFirst().ifPresent(s -> {
                    s.getStockinDetail().forEach(d -> {
                        materials.stream().filter(m -> m.getSpareParts().equals(d.getSpareParts())).findFirst().ifPresent(m -> {
                            m.setInBatch(d.getStockinBatch());
                            materialDao.updateByPrimaryKeySelective(m);
                        });
                    });
                });
            }
        });

    }

    /**
     * 出库驳回
     */
    @Override
    public void reject(EntrustProcessInput input) {
        EntrustProcess entrustProcess = entrustProcessDao.selectByPrimaryKey(input.getWareEntrustedProcessingId());
        // 只有未审核的才能审核
        if (AuditStateEnum.UNAUDIT.getCode().equals(entrustProcess.getAuditStatus())) {
            entrustProcess.setAuditStatus(AuditStateEnum.REJECTED.getCode());
            entrustProcess.setReasonsRejection(input.getReasonsRejection());
            entrustProcessDao.updateByPrimaryKeySelective(entrustProcess);
        }
    }

    /**
     * 加工成品入库
     */
    @Override
    @Transactional
    public void productIn(Integer id) {
        EntrustProcess entrustProcess = entrustProcessDao.selectByPrimaryKey(id);
        List<EntrustProduct> products = getProductsById(id);
        // 只有加工材料全部出库并且添加了成品条目才能入库
        if (EntrustProcessStatusEnum.ALL_OUT.getCode().equals(entrustProcess.getBillStatus())
                && !CollectionUtils.isEmpty(products)) {

            StockInInput stockInInput = new StockInInput();

            List<AddStockinDetailInput> details = new ArrayList<>();
            products.forEach(p -> {
                AddStockinDetailInput detail = new AddStockinDetailInput();
                detail.setSpareParts(p.getSpareParts());
                detail.setEntryNum(p.getEntryNum());
                detail.setStorageLocation(p.getStorageLocation());
                detail.setVat(p.getVat());
                detail.setWarehouse(p.getWarehouse());
                detail.setWarehouseType(p.getWarehouseType());
                detail.setInvoicePrice(p.getInvoicePrice());
                detail.setEntryPrice(p.getEntryPrice());
                detail.setLength(p.getEntryLength());
                detail.setWidth(p.getEntryWide());
                details.add(detail);

                stockInInput.setEntryWarehouse(p.getWarehouse());

                p.setEntryStatus(EntrustProcessStatusEnum.ALL_IN.getCode());
                productDao.updateByPrimaryKeySelective(p);
            });

            stockInInput.setBillType(billTypeService.getBillTypeKeyByName(WarehouseConstants.BILL_ENTRUST_PROCESS));
            stockInInput.setCompany(entrustProcess.getCompany());
            stockInInput.setTotalAmount(entrustProcess.getEntryAmount());
            stockInInput.setInvoiceType(entrustProcess.getProcessingInvoiceType());
            stockInInput.setVat(entrustProcess.getProcessingChargesVat());
            stockInInput.setStockinDetail(details.toArray(new AddStockinDetailInput[details.size()]));

            stockinService.directIn(stockInInput);

            entrustProcess.setBillStatus(EntrustProcessStatusEnum.ALL_IN.getCode());
            entrustProcessDao.updateByPrimaryKeySelective(entrustProcess);

            // 出库
            StockOutInput stockOutInput = new StockOutInput();
            stockOutInput.setNo(entrustProcess.getEntrustedProcessingNo());
            stockOutInput.setCompany(entrustProcess.getCompany());
            String billType = billTypeService.getBillTypeKeyByName(WarehouseConstants.BILL_ENTRUST_PROCESS);
            stockOutInput.setBillType(billType);
            AddWarehouseYardRelationInput input = new AddWarehouseYardRelationInput();
            input.setYard(getCurrentYardKey());
            WareTypeYardOutput warehouse = warehouseService.getWarehouseByYard(input);
            stockOutInput.setWarehouse(warehouse.getDefaultWarehouse());
            List<AddStockoutDetailInput> stockoutDetailInputs = new ArrayList<>();
            List<EntrustMaterial> materials = getMaterialsById(entrustProcess.getWareEntrustedProcessingId());
            materials.forEach(m -> {
                AddStockoutDetailInput detail = new AddStockoutDetailInput();
                detail.setDefaultWarehouseType("LKWARETYPE000018");
                detail.setSpareParts(m.getSpareParts());
                detail.setSparePartsBatch(m.getInBatch());
                detail.setStockoutNum(m.getProcessingNum());
                stockoutDetailInputs.add(detail);
                m.setStockoutStatus(EntrustProcessStatusEnum.ALL_OUT.getCode());
                materialDao.updateByPrimaryKeySelective(m);

            });
            stockOutInput.setStockoutDetailInputList(stockoutDetailInputs.toArray(new AddStockoutDetailInput[stockoutDetailInputs.size()]));

            stockoutService.directOut(stockOutInput);
        }
        // TODO Auto-generated method stub

    }

}
