package com.sanlly.warehouse.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.netflix.discovery.converters.Auto;
import com.sanlly.common.models.output.stock.WareOutput;
import com.sanlly.warehouse.models.output.warehousetype.WarehouseTypeOutput;
import com.sanlly.warehouse.service.*;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.common.models.output.yard.YardOutput;
import com.sanlly.common.utils.ComputeUtil;
import com.sanlly.common.utils.DateUtil;
import com.sanlly.warehouse.constants.BillTypeConstants;
import com.sanlly.warehouse.constants.DefaultConstants;
import com.sanlly.warehouse.constants.WarehouseConstants;
import com.sanlly.warehouse.dao.StockNumMapper;
import com.sanlly.warehouse.dao.WareSparePartsMapper;
import com.sanlly.warehouse.dao.WareStockMapper;
import com.sanlly.warehouse.entity.WareEntryAdjustmentDetail;
import com.sanlly.warehouse.entity.WareSpareParts;
import com.sanlly.warehouse.entity.WareSparePartsExample;
import com.sanlly.warehouse.entity.WareStock;
import com.sanlly.warehouse.entity.WareStockExample;
import com.sanlly.warehouse.entity.WareWarehouse;
import com.sanlly.warehouse.models.input.borrowlend.SearchBorrowLendInput;
import com.sanlly.warehouse.models.input.entryadjustment.AddEntryAdjustmentDetailInput;
import com.sanlly.warehouse.models.input.spareparts.EditSparePartsInput;
import com.sanlly.warehouse.models.input.stock.AddStockInput;
import com.sanlly.warehouse.models.input.stock.EditStockInput;
import com.sanlly.warehouse.models.input.stock.EditStockNumInput;
import com.sanlly.warehouse.models.input.stock.SearchStockInput;
import com.sanlly.warehouse.models.input.stock.SearchStockNumInput;
import com.sanlly.warehouse.models.input.stockin.SearchStockinInput;
import com.sanlly.warehouse.models.input.stockout.AddStockoutDetailInput;
import com.sanlly.warehouse.models.input.wareearlywarning.AddAutoPurchaseRequisitionsInput;
import com.sanlly.warehouse.models.input.warehouse.AddWarehouseYardRelationInput;
import com.sanlly.warehouse.models.input.warehouse.EditWarehouseInput;
import com.sanlly.warehouse.models.output.borrowlend.BorrowLendOutput;
import com.sanlly.warehouse.models.output.spareparts.SparePartsOutput;
import com.sanlly.warehouse.models.output.stockin.StockinOutput;
import com.sanlly.warehouse.models.output.stockout.StockoutDetailOutput;
import com.sanlly.warehouse.models.output.warehouse.WareTypeYardOutput;
import com.sanlly.warehouse.models.output.warehouse.WarehouseByCompanyOutput;
import com.sanlly.warehouse.service.feign.ProductionFeignClient;
import org.springframework.util.CollectionUtils;

/**
 * ClassName: WareStockServiceImpl Description: 库存服务实现层 date: 2019/7/29 17:35
 *
 * @author wannt
 * @since JDK 1.8
 */
@Service
public class WareStockServiceImpl extends BaseServiceImpl implements WareStockService {

    @Autowired
    private WareStockMapper stockMapper;

    @Autowired
    private WareSparePartsMapper sparePartsMapper;

    @Autowired
    private PordCompanyService pordCompanyService;

    @Autowired
    private PurchaseRequisitionsService purchaseRequisitionsService;

    @Autowired
    private WareSparePartsService sparePartsService;

    @Autowired
    private StockNumMapper stockNumMapper;

    @Autowired
    private WarehouseService warehouseService;

    @Autowired
    private WareStockinService stockinService;

    @Autowired
    private BorrowService borrowService;

    @Autowired
    private ProductionFeignClient productionFeignClient;

    @Autowired
    private BillTypeService billTypeService;


    /**
     * 查询库存分页列表
     *
     * @param input
     * @return
     */
    @Override
    public PagedList<StockOutput> stockPageList(SearchStockInput input) {
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("create_time desc");
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (input.getSparePartsCategories() != null && input.getSparePartsCategories() != "") {
            criteria.andSparePartsCategoriesEqualTo(input.getSparePartsCategories());
        }
        if (input.getSparePartsName() != null && input.getSparePartsName() != "") {
            criteria.andSparePartsNameLike("%" + input.getSparePartsName() + "%");
        }
        if (input.getSparePartsNo() != null && input.getSparePartsNo() != "") {
            criteria.andSparePartsNoLike("%" + input.getSparePartsNo() + "%");
        }
        if (input.getCompany() != null && input.getCompany() != "") {
            criteria.andCompanyEqualTo(input.getCompany());
        }
        if (input.getWarehouse() != null && input.getWarehouse() != "") {
            criteria.andWarehouseEqualTo(input.getWarehouse());
        }
        if (input.getWarehouseType() != null && input.getWarehouseType() != "") {
            criteria.andWarehouseTypeEqualTo(input.getWarehouseType());
        }
        if (input.getMoreThanZero() != null && input.getMoreThanZero() != false) {
            criteria.andSurplusNumGreaterThan(DefaultConstants.DOUBLEDEFAULT);
        }
        if (input.getEscrowCompany() != null && input.getEscrowCompany() != "") {
            criteria.andEscrowCompanyEqualTo(input.getEscrowCompany());
        }
        if (input.getIsIncise() != null && input.getIsIncise() != "") {
            WareSparePartsExample sparePartsExample = new WareSparePartsExample();
            WareSparePartsExample.Criteria spCriteria = sparePartsExample.createCriteria();
            spCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            spCriteria.andIsInciseEqualTo(input.getIsIncise());
            List<String> arr = new ArrayList<>();
            for (WareSpareParts spareParts : sparePartsMapper.selectByExample(sparePartsExample)) {
                arr.add(spareParts.getKey());
            }
            criteria.andSparePartsIn(arr);
        }
        if (BillTypeConstants.RUBBISH.equals(input.getBillType())) {
            WareSparePartsExample spExample = new WareSparePartsExample();
            WareSparePartsExample.Criteria spCriteria = spExample.createCriteria();
            spCriteria.andIsInciseEqualTo(CommonEnum.YES.getCode());
            List<WareSpareParts> wareSpareParts = sparePartsMapper.selectByExample(spExample);
            List<String> spKeyList = new ArrayList<>();
            for (WareSpareParts wareSparePart : wareSpareParts) {
                spKeyList.add(wareSparePart.getKey());
            }
            criteria.andSparePartsIn(spKeyList);
            criteria.andSurplusAreaEqualTo(DefaultConstants.DOUBLEDEFAULT);
            criteria.andSurplusNumGreaterThan(DefaultConstants.DOUBLEDEFAULT);
        }
        // 只能看到本公司库存信息
        if (getCurrentCompanyKey() != null && getCurrentCompanyKey() != "") {
            criteria.andCompanyEqualTo(getCurrentCompanyKey());
        }
        // 需确定是否只显示登陆场站下仓库库存信息
//        criteria.andWarehouseIn();

        // 总页数
        Integer totalItemCount = (int) stockMapper.countByExample(example);
        PagedList<StockOutput> pagedList = new PagedList<>(input.getPageIndex(), input.getPageSize(), totalItemCount);
        // 分页查询
        example.setLimitStart(pagedList.getLimitStart());
        example.setLimitEnd(pagedList.getLimitEnd());
        List<WareStock> wareStocks = stockMapper.selectByExample(example);
        // 组装返回数据
        List<StockOutput> outputs = new ArrayList<>();

        for (WareStock wareStock : wareStocks) {
            StockOutput output = new StockOutput();
            BeanUtils.copyProperties(wareStock, output);
            output.setCompanyLangLang(wareStock.getCompany());
            output.setWarehouseLangLang(wareStock.getWarehouse());
            output.setEscrowCompanyLangLang(wareStock.getEscrowCompany());
            output.setWarehouseTypeLangLang(wareStock.getWarehouseType());
            SparePartsOutput parts = sparePartsService
                    .getSpareParts(new EditSparePartsInput(wareStock.getSpareParts()));
            output.setDefaultWarehouseType(parts.getDefaultWarehouseType());
            output.setDefaultWarehouseTypeLangLang(parts.getDefaultWarehouseTypeLangLang());
            output.setIsIncise(parts.getIsIncise());
            output.setSparePartsCategoriesLangLang(wareStock.getSparePartsCategories());
            output.setSparePartsUnitLangLang(wareStock.getSparePartsUnit());
            output.setSparePartsLangLang(wareStock.getSpareParts());
            output.setStockinDateStr(DateUtil.date2String(wareStock.getStockinDate()));
            output.setStorageLocation(wareStock.getStorageLocation());
            outputs.add(output);
        }
        pagedList.getDataList().addAll(outputs);
        return pagedList;
    }

    /**
     * 分组分页查询库存数量
     *
     * @param input
     * @return
     */
    @Override
    public PagedList<StockOutput> stockNumPageList(SearchStockNumInput input) {
        input.setLimitStart((input.getPageIndex() - 1) * input.getPageSize());
        input.setLimitEnd(input.getPageIndex() * input.getPageSize());
        if (input.getYard() != null && input.getYard() != "") {
            AddWarehouseYardRelationInput relationInput = new AddWarehouseYardRelationInput();
            relationInput.setYard(input.getYard());
            WareTypeYardOutput warehouseByYard = warehouseService.getWarehouseByYard(relationInput);
            List<String> warehouseList = new ArrayList<>();
            for (WarehouseByCompanyOutput warehouseByCompanyOutput : warehouseByYard.getDataList()) {
                warehouseList.add(warehouseByCompanyOutput.getKey());
            }
            input.setWarehouseList(warehouseList);
        }
        List<WareStock> stockNum = stockNumMapper.getStockNum(input);
        List<StockOutput> outputs = new ArrayList<>();
        for (WareStock wareStock : stockNum) {
            StockOutput output = new StockOutput();
            BeanUtils.copyProperties(wareStock, output);
            output.setCompanyLangLang(wareStock.getCompany());
            output.setWarehouseLangLang(wareStock.getWarehouse());
            output.setEscrowCompanyLangLang(wareStock.getEscrowCompany());
            output.setWarehouseTypeLangLang(wareStock.getWarehouseType());
            output.setSparePartsCategoriesLangLang(wareStock.getSparePartsCategories());
            output.setSparePartsUnitLangLang(wareStock.getSparePartsUnit());
            output.setSparePartsLangLang(wareStock.getSpareParts());
            output.setStorageLocation(wareStock.getStorageLocation());
            outputs.add(output);
        }
        PagedList<StockOutput> pagedList = new PagedList<>(input.getPageIndex(), input.getPageSize(),
                stockNumMapper.getTotalCount(input));
        pagedList.getDataList().addAll(outputs);
        return pagedList;
    }

    /**
     * 新增库存
     *
     * @param input
     */
    @Override
    @Transactional
    public void addStock(AddStockInput input) {
        WareStock stock = new WareStock();
        BeanUtils.copyProperties(input, stock);
        stock.setLength(input.getLength());
        stock.setWidth(input.getWidth());
        stock.setIsDel(PlatformConstants.ISDEL_NO);
        // 未锁库时更新库存
//		if(!getWarehouseLockStatus(input.getWarehouse())) {
//		}
        stock.setSurplusNum(input.getEntryNum());
        stock.setActualSurplusNum(input.getEntryNum());
        stock.setOriginalArea(input.getOriginalArea());
        stock.setSurplusArea(input.getOriginalArea() * input.getEntryNum());
        stock.setSpareParts(input.getSpareParts());
        stock.setCreateTime(new Date());
        stock.setCreateUser(getCurrentUserId());
        stockMapper.insert(stock);
    }

    /**
     * 修改基础库存信息
     * 注意:若库存有长度宽度,则面积为长*宽 若只有长度,面积为长度 没有长宽面积为零
     *
     * @param input
     */
    @Override
    @Transactional
    public void editStock(EditStockInput input) {
        WareStock stock = stockMapper.selectByPrimaryKey(input.getWareStockId());
        stock.setSparePartsCategories(input.getSparePartsCategories());
        stock.setLength(input.getLength());
        stock.setWidth(input.getWidth());
        stock.setUnitPrice(input.getUnitPrice());
        stock.setInvoicePrice(input.getInvoicePrice());
        stock.setRemark(input.getRemark());
        if (input.getLength() != null && input.getLength() != 0 && (input.getWidth() == null || input.getWidth() == 0)) {
            stock.setOriginalArea(input.getLength());
            stock.setSurplusArea(input.getLength() * stock.getActualSurplusNum());
        } else if (input.getLength() != null && input.getLength() != 0 && input.getWidth() != null && input.getWidth() != 0) {
            stock.setOriginalArea(input.getLength() * input.getWidth());
            stock.setSurplusArea(input.getLength() * input.getWidth() * stock.getActualSurplusNum());
        } else {
            stock.setOriginalArea(input.getLength() * input.getWidth());
            stock.setSurplusArea(input.getLength() * input.getWidth() * stock.getActualSurplusNum());
        }
        stock.setUpdateTime(new Date());
        stock.setUpdateUser(getCurrentUserId());
        stockMapper.updateByPrimaryKeySelective(stock);
    }

    /**
     * 修改库存数量(减少)
     *
     * @param input
     */
    @Override
    @Transactional
    public void editStockNum(EditStockNumInput input) {
        WareStock stock = stockMapper.selectByPrimaryKey(input.getWareStockId());
        if (input.getNum() != null) {
            if (stock.getActualSurplusNum() - input.getNum() < 0) {
                throw new RuntimeException("inventoryWarning");
            }
            stock.setActualSurplusNum(stock.getActualSurplusNum() - input.getNum());
            /**
             * 根据公司是否锁库判定是否修改剩余数量(待完善)
             */
            // 未锁库时更新库存
//			if(!getWarehouseLockStatus(stockMapper.selectByPrimaryKey(input.getWareStockId()).getWarehouse())) {
//		}
            stock.setSurplusNum(stock.getSurplusNum() - input.getNum());

        }
        if (input.getArea() != null) {
            if (stock.getSurplusArea() - input.getArea() < 0) {
                throw new RuntimeException("inventoryWarning");
            }
            stock.setSurplusArea(stock.getSurplusArea() - input.getArea());
        }

        stock.setUpdateUser(getCurrentUserId());
        stock.setUpdateTime(new Date());
        stockMapper.updateByPrimaryKeySelective(stock);

        // 自动采购接口
        AddAutoPurchaseRequisitionsInput purchaseRequisitionsInput = new AddAutoPurchaseRequisitionsInput();
        purchaseRequisitionsInput.setWarehouse(stock.getWarehouse());
        String[] spArr = new String[1];
        spArr[0] = stock.getSpareParts();
        purchaseRequisitionsInput.setSpareParts(spArr);
        Double[] numArr = new Double[1];
        numArr[0] = 0D;
        purchaseRequisitionsInput.setTotalRequisitionsNum(numArr);
        purchaseRequisitionsService.addAutoPurchaseRequisitions(purchaseRequisitionsInput);
    }

    /**
     * 根据备件批次号和备件key获取库存信息输出类
     *
     * @param Batch
     * @param sparePartsKey
     * @return
     */
    @Override
    public StockOutput getStockByBatch(String Batch, String sparePartsKey) {
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        criteria.andSparePartsEqualTo(sparePartsKey);
        criteria.andSparePartsBatchEqualTo(Batch);
        List<WareStock> wareStocks = stockMapper.selectByExample(example);
        if (wareStocks.size() < 1) {
            return null;
        }
        WareStock stock = wareStocks.get(0);
        StockOutput output = new StockOutput();
        BeanUtils.copyProperties(stock, output);
        output.setCompanyLangLang(stock.getCompany());
        output.setWarehouseLangLang(stock.getWarehouse());
        output.setEscrowCompanyLangLang(stock.getEscrowCompany());
        output.setWarehouseTypeLangLang(stock.getWarehouseType());
        output.setSparePartsCategoriesLangLang(stock.getSparePartsCategories());
        output.setSparePartsUnitLangLang(stock.getSparePartsUnit());
        return output;
    }

    /**
     * 修改库存数量,面积
     *
     * @param stockDetail
     */
    @Override
    public void setStock(StockoutDetailOutput stockDetail) {
        if (StringUtils.isEmpty(stockDetail.getSparePartsBatch()) || StringUtils.isEmpty(stockDetail.getSpareParts())) {
            throw new RuntimeException("conditionError");
        }
        WareStock stock = getStock(stockDetail.getSparePartsBatch(), stockDetail.getSpareParts());

        if (stockDetail.getOutNum() != null) {
            // 修改前台显示库存数量,锁库待完善
            // 未锁库时更新库存
//			if(!getWarehouseLockStatus(stock.getWarehouse())) {
//			}
            stock.setSurplusNum(stock.getSurplusNum() - stockDetail.getOutNum());
            stock.setActualSurplusNum(stock.getActualSurplusNum() - stockDetail.getOutNum());
            if (stock.getActualSurplusNum() < 0) {
                throw new RuntimeException("stockErr");
            }
        }
        if (stockDetail.getOutArea() != null) {
            stock.setSurplusArea(stock.getSurplusArea() - stockDetail.getOutArea());
            if (stock.getSurplusArea() < 0) {
                throw new RuntimeException("stockAreaErr");
            }
        }

        stock.setUpdateTime(new Date());
        stock.setUpdateUser(getCurrentUserId());
        stockMapper.updateByPrimaryKeySelective(stock);
        AddAutoPurchaseRequisitionsInput purchaseRequisitionsInput = new AddAutoPurchaseRequisitionsInput();
        purchaseRequisitionsInput.setWarehouse(stock.getWarehouse());
        String[] spArr = new String[1];
        spArr[0] = stock.getSpareParts();
        purchaseRequisitionsInput.setSpareParts(spArr);
        Double[] numArr = new Double[1];
        numArr[0] = 0D;
        purchaseRequisitionsInput.setTotalRequisitionsNum(numArr);
        purchaseRequisitionsService.addAutoPurchaseRequisitions(purchaseRequisitionsInput);
    }

    /**
     * 修改库存数量,面积,长度
     *
     * @param stockDetail
     */
    @Override
    public void setStock(AddStockoutDetailInput stockDetail) {
        if (stockDetail.getSparePartsBatch() == null || stockDetail.getSpareParts() == null) {
            throw new RuntimeException("conditionError");
        }
        WareStock stock = getStock(stockDetail.getSparePartsBatch(), stockDetail.getSpareParts());

        if (stockDetail.getStockoutNum() != null && stockDetail.getStockoutNum() != 0) {
            // 修改前台显示库存数量,锁库待完善
//			if(!getWarehouseLockStatus(stock.getWarehouse())) {
//			}	
            stock.setSurplusNum(stock.getSurplusNum() - stockDetail.getStockoutNum());
            stock.setActualSurplusNum(stock.getActualSurplusNum() - stockDetail.getStockoutNum());
        }
        if (stockDetail.getStockoutArea() != null && stockDetail.getStockoutArea() != 0) {
            stock.setSurplusArea(stock.getSurplusArea() - stockDetail.getStockoutArea());
        }
        if (stockDetail.getStockoutLength() != null && stockDetail.getStockoutLength() != 0) {
            stock.setLength(stock.getLength() - stockDetail.getStockoutLength());
        }
        if (stock.getSurplusArea() != null) {
            if (stock.getSurplusArea() < 0) {
                throw new RuntimeException("stockAreaErr");
            }
        }
        if (stock.getActualSurplusNum() != null) {
            if (stock.getActualSurplusNum() < 0) {
                throw new RuntimeException("stockErr");
            }
        }
        if (stock.getLength() != null) {
            if (stock.getLength() < 0) {
                throw new RuntimeException("lengthErr");
            }
        }
        stock.setUpdateTime(new Date());
        stock.setUpdateUser(getCurrentUserId());
        stockMapper.updateByPrimaryKeySelective(stock);
        AddAutoPurchaseRequisitionsInput purchaseRequisitionsInput = new AddAutoPurchaseRequisitionsInput();
        purchaseRequisitionsInput.setWarehouse(stock.getWarehouse());
        String[] spArr = new String[1];
        spArr[0] = stock.getSpareParts();
        purchaseRequisitionsInput.setSpareParts(spArr);
        Double[] numArr = new Double[1];
        numArr[0] = 0D;
        purchaseRequisitionsInput.setTotalRequisitionsNum(numArr);
        purchaseRequisitionsService.addAutoPurchaseRequisitions(purchaseRequisitionsInput);
    }

    /**
     * 根据备件批次号和备件key获取库存信息
     *
     * @param Batch
     * @param sparePartsKey
     * @return
     */
    public WareStock getStock(String Batch, String sparePartsKey) {
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        criteria.andSparePartsEqualTo(sparePartsKey);
        criteria.andSparePartsBatchEqualTo(Batch);
        List<WareStock> wareStocks = stockMapper.selectByExample(example);
        WareStock stock = wareStocks.get(0);
        return stock;
    }

    /**
     * 根据备件key获取库存数量
     *
     * @param spKey
     * @return
     */
    @Override
    public Double getStockNum(String spKey) {
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        criteria.andSparePartsEqualTo(spKey);
        criteria.andCompanyEqualTo(getCurrentCompanyKey());
        List<WareStock> wareStocks = stockMapper.selectByExample(example);
        Double sum = 0D;
        for (WareStock wareStock : wareStocks) {
            sum += wareStock.getActualSurplusNum();
        }
        return sum;
    }

    /**
     * 根据公司,仓库,查询备件库存总数
     *
     * @param company
     * @param warehouse
     * @param spareParts
     * @return
     */
    @Override
    public Double getStockByCompanyOrSP(String company, String warehouse, String spareParts) {
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andCompanyEqualTo(company);
        criteria.andWarehouseEqualTo(warehouse);
        criteria.andSparePartsEqualTo(spareParts);
        List<WareStock> wareStocks = stockMapper.selectByExample(example);
        Double num = 0D;
        for (WareStock stock : wareStocks) {
            num += stock.getActualSurplusNum();
        }

        return num;
    }

    /**
     * 根据公司,仓库,查询备件库存总数
     *
     * @param company
     * @param warehouse
     * @param spareParts
     * @param warehouseType
     * @return
     */
    @Override
    public Double getStockByCompanyOrSP(String company, String warehouse, String spareParts, String warehouseType) {
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        if (company != null && company != "") {
            criteria.andCompanyEqualTo(company);
        }
        if (warehouse != null && warehouse != "") {
            criteria.andWarehouseEqualTo(warehouse);
        }
        criteria.andSparePartsEqualTo(spareParts);
        criteria.andWarehouseTypeEqualTo(warehouseType);
        List<WareStock> wareStocks = stockMapper.selectByExample(example);
        Double num = 0D;
        for (WareStock stock : wareStocks) {
            num += stock.getActualSurplusNum();
        }

        return num;
    }

    /**
     * 根据备件和数量自动获取库存批次
     * 注意:遵循先入先出,若库存不足则报understock
     *
     * @param warehouse
     * @param spareParts
     * @param num
     * @return
     */
    @Override
    public List<StockOutput> autoGetStock(String warehouse, String spareParts, Double num) {
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("create_time asc");
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andSparePartsEqualTo(spareParts);
        criteria.andWarehouseEqualTo(warehouse);
        List<WareStock> wareStocks = stockMapper.selectByExample(example);
        List<StockOutput> outputs = new ArrayList<>();
        double count = num;
        for (WareStock wareStock : wareStocks) {
            if (wareStock.getActualSurplusNum() > 0) {
                if (num - wareStock.getActualSurplusNum() <= 0) {
                    // 数量已够 跳出循环
                    wareStock.setActualSurplusNum(count);
                    count = 0D;
                    outputs.add(getOutput(wareStock));
                    break;
                } else {
                    num -= wareStock.getActualSurplusNum();
                    count -= wareStock.getActualSurplusNum();
                    outputs.add(getOutput(wareStock));
                }
            }
        }
        if (count > 0) {
            throw new RuntimeException("understock");
        }

        return outputs;
    }

    /**
     * 根据备件和数量,仓库类型自动获取库存批次
     *
     * @param warehouse
     * @param spareParts
     * @param num
     * @return
     */
    @Override
    public List<StockOutput> autoGetStock(String warehouse, String spareParts, Double num, String warehouseType) {
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("create_time asc");
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andSparePartsEqualTo(spareParts);
        criteria.andWarehouseEqualTo(warehouse);
        criteria.andWarehouseTypeEqualTo(warehouseType);
        List<WareStock> wareStocks = stockMapper.selectByExample(example);
        List<StockOutput> outputs = new ArrayList<>();
        double count = num;
        for (WareStock wareStock : wareStocks) {
            if (wareStock.getActualSurplusNum() > 0) {
                if (num - wareStock.getActualSurplusNum() <= 0) {
                    // 数量已够 跳出循环
                    wareStock.setActualSurplusNum(count);
                    count = 0D;
                    outputs.add(getOutput(wareStock));
                    break;
                } else {
                    num -= wareStock.getActualSurplusNum();
                    count -= wareStock.getActualSurplusNum();
                    outputs.add(getOutput(wareStock));
                }
            }
        }
        if (count > 0) {
            throw new RuntimeException("understock");
        }

        return outputs;
    }

    /**
     * 根据备件和长度自动获取库存批次
     * 注意:若要出面积,只能是在箱体切割材料库中出,若key有变化,代码需改变
     *
     * @param warehouse
     * @param spareParts
     * @param length
     * @return
     */
    @Override
    public List<StockOutput> autoGetStockByLen(String warehouse, String spareParts, Double length) {
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("create_time asc");
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andSparePartsEqualTo(spareParts);
        criteria.andWarehouseEqualTo(warehouse);
        criteria.andWarehouseTypeEqualTo("LKWARETYPE000009");
        List<WareStock> wareStocks = stockMapper.selectByExample(example);
        List<StockOutput> outputs = new ArrayList<>();
        SparePartsOutput spareParts1 = sparePartsService.getSpareParts(new EditSparePartsInput(spareParts));
        double count = length;
        for (WareStock wareStock : wareStocks) {
            if (wareStock.getLength() > 0 && wareStock.getActualSurplusNum() > 0) {
                if (count - wareStock.getLength() <= 0) {
                    // 长度已够 跳出循环
                    wareStock.setLength(count);
                    wareStock.setActualSurplusNum(count / spareParts1.getLength());
                    count = 0D;
                    outputs.add(getOutput(wareStock));
                    break;
                } else {
                    length -= wareStock.getLength();
                    count -= wareStock.getLength();
                    outputs.add(getOutput(wareStock));
                }
            }
        }
        if (count > 0) {
            throw new RuntimeException("understock");
        }

        return outputs;
    }

    /**
     * 根据备件和面积自动获取库存批次
     * 注意:若要出面积,只能是在箱体切割材料库中出,若key有变化,代码需改变
     *
     * @param warehouse
     * @param spareParts
     * @param area
     * @return
     */
    @Override
    public List<StockOutput> autoGetStockByArea(String warehouse, String spareParts, Double area) {
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("create_time asc");
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andSparePartsEqualTo(spareParts);
        criteria.andWarehouseEqualTo(warehouse);
        criteria.andWarehouseTypeEqualTo("LKWARETYPE000009");
        List<WareStock> wareStocks = stockMapper.selectByExample(example);
        List<StockOutput> outputs = new ArrayList<>();
        SparePartsOutput spareParts1 = sparePartsService.getSpareParts(new EditSparePartsInput(spareParts));
        double count = area;
        for (WareStock wareStock : wareStocks) {
            if (wareStock.getSurplusArea() > 0 && wareStock.getActualSurplusNum() > 0) {
                if (count - wareStock.getSurplusArea() <= 0) {
                    // 面积已够 跳出循环
                    wareStock.setSurplusArea(count);
                    wareStock.setActualSurplusNum(count / (spareParts1.getLength() * spareParts1.getWidth()));
                    count = 0D;
                    outputs.add(getOutput(wareStock));
                    break;
                } else {
                    area -= wareStock.getSurplusArea();
                    count -= wareStock.getSurplusArea();
                    outputs.add(getOutput(wareStock));
                }
            }
        }
        if (count > 0) {
            throw new RuntimeException("understock");
        }
        return outputs;
    }

    /**
     * 根据备件和数量自动获取库存批次
     *
     * @param warehouse
     * @param spareParts
     * @param num
     * @return
     */
    @Override
    public List<StockOutput> autoGetStock(String warehouse, String warehouseType, String spareParts, Double num) {
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("create_time asc");
        criteria.andSparePartsEqualTo(spareParts);
        criteria.andWarehouseEqualTo(warehouse);
        criteria.andWarehouseTypeEqualTo(warehouseType);
        List<WareStock> wareStocks = stockMapper.selectByExample(example);
        List<StockOutput> outputs = new ArrayList<>();
        double count = num;
        for (WareStock wareStock : wareStocks) {
            if (num - wareStock.getActualSurplusNum() <= 0) {
                // 数量已够 跳出循环
                wareStock.setActualSurplusNum(count);
                count = 0D;
                outputs.add(getOutput(wareStock));
                break;
            } else {
                num -= wareStock.getActualSurplusNum();
                count -= wareStock.getActualSurplusNum();
                outputs.add(getOutput(wareStock));
            }
        }
        if (count > 0) {
            throw new RuntimeException("understock");
        }

        return outputs;
    }

    /**
     * 根据备件号获取库存信息
     *
     * @param sparePartsNos
     * @return
     */
    @Override
    public List<StockOutput> getStockBySparePartsNos(List<String> sparePartsNos) {
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andSparePartsNoIn(sparePartsNos);
        List<WareStock> wareStocks = stockMapper.selectByExample(example);
        Map<String, StockOutput> map = new HashMap<String, StockOutput>();
        for (String sparePartsNo : sparePartsNos) {
            StockOutput output = new StockOutput();
            WareSparePartsExample example1 = new WareSparePartsExample();
            WareSparePartsExample.Criteria criteria1 = example1.createCriteria();
            criteria1.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
            criteria1.andSparePartsNoEqualTo(sparePartsNo);
            List<WareSpareParts> wareSpareParts = sparePartsMapper.selectByExample(example1);
            if (wareSpareParts != null && wareSpareParts.size() > 0) {
                output.setIsMergerAcquisition(wareSpareParts.get(0).getIsMergerAcquisition());
                output.setIsMergerAcquisitionLangLang(wareSpareParts.get(0).getIsMergerAcquisition());
            }
            output.setSparePartsNo(sparePartsNo);
            output.setActualSurplusNum(0d);
            map.put(sparePartsNo, output);
        }
        for (WareStock wareStock : wareStocks) {
            StockOutput output = getOutput(wareStock);
            if (map.containsKey(wareStock.getSpareParts())) {
                output.setIsMergerAcquisition(map.get(wareStock.getSpareParts()).getIsMergerAcquisition());
                output.setIsMergerAcquisitionLangLang(map.get(wareStock.getSpareParts()).getIsMergerAcquisition());
            }
            map.put(wareStock.getSpareParts(), output);
        }
        return new ArrayList<StockOutput>(map.values());
    }

    /**
     * 根据备件和仓库类型分组
     *
     * @param input
     * @return
     */
    @Override
    public PagedList<StockOutput> pageListGroup(SearchStockInput input) {
        return null;
    }

    /**
     * 查询公司下各仓库备件储量
     *
     * @param input
     * @return
     */
    @Override
    public PagedList<StockOutput> getStockByCompany(SearchStockNumInput input) {
        input.setLimitStart((input.getPageIndex() - 1) * input.getPageSize());
        input.setLimitEnd(input.getPageIndex() * input.getPageSize());
        List<WareStock> stockNum = stockNumMapper.getStockNumByCompany(input);
        List<StockOutput> outputs = new ArrayList<>();
        for (WareStock wareStock : stockNum) {
            StockOutput output = new StockOutput();
            BeanUtils.copyProperties(wareStock, output);
            output.setCompanyLangLang(wareStock.getCompany());
            output.setWarehouseLangLang(wareStock.getWarehouse());
            output.setWarehouseTypeLangLang(wareStock.getWarehouseType());
            output.setSparePartsCategoriesLangLang(wareStock.getSparePartsCategories());
            output.setSparePartsUnitLangLang(wareStock.getSparePartsUnit());
            output.setSparePartsLangLang(wareStock.getSpareParts());
            output.setStorageLocation(wareStock.getStorageLocation());
            output.setSurplusNum(wareStock.getSurplusNum());
            outputs.add(output);
        }
        PagedList<StockOutput> pagedList = new PagedList<>(input.getPageIndex(), input.getPageSize(),
                stockNumMapper.getTotalCountByCompany(input));
        pagedList.getDataList().addAll(outputs);
        return pagedList;
    }

    /**
     * 封装output
     *
     * @param wareStock
     * @return
     */
    private StockOutput getOutput(WareStock wareStock) {
        StockOutput output = new StockOutput();
        BeanUtils.copyProperties(wareStock, output);
        output.setCompanyLangLang(wareStock.getCompany());
        output.setWarehouseLangLang(wareStock.getWarehouse());
        output.setEscrowCompanyLangLang(wareStock.getEscrowCompany());
        output.setWarehouseTypeLangLang(wareStock.getWarehouseType());
        output.setSparePartsCategoriesLangLang(wareStock.getSparePartsCategories());
        output.setSparePartsUnitLangLang(wareStock.getSparePartsUnit());
        output.setSparePartsLangLang(wareStock.getSpareParts());
        output.setStorageLocation(wareStock.getStorageLocation());
        return output;
    }

    /**
     * 库存调拨
     */
    @Override
    public void stockTransfer(AddStockInput input) {
        WareStockExample example = new WareStockExample();
        example.createCriteria().andSparePartsBatchEqualTo(input.getSourceBatch())
                .andSparePartsEqualTo(input.getSpareParts());
        List<WareStock> stocks = stockMapper.selectByExample(example);

        WareStock source = stocks.stream().findFirst().orElseThrow(() -> new RuntimeException("not found"));
        WareStock target = new WareStock();

        target.setStockinNo(input.getStockinNo());
        target.setWarehouse(input.getWarehouse());
        target.setWarehouseType(input.getWarehouseType());
        target.setStorageLocation(input.getStorageLocation());
        target.setSpareParts(input.getSpareParts());
        target.setLength(input.getLength());
        target.setWidth(input.getWidth());
        target.setSparePartsBatch(input.getSparePartsBatch());
        target.setEntryNum(input.getEntryNum());
        // 未锁库时更新库存
//		if(!getWarehouseLockStatus(input.getWarehouse())) {
//		}
        target.setSurplusNum(target.getEntryNum());
        target.setActualSurplusNum(target.getEntryNum());
        if (target.getWidth() == WarehouseConstants.DOUBLE_ZERO) {
            target.setOriginalArea(target.getLength());
        } else {
            target.setOriginalArea(ComputeUtil.mul(new BigDecimal(target.getLength()), new BigDecimal(target.getWidth())).doubleValue());
        }

        target.setSurplusArea(
                new BigDecimal(input.getOriginalArea()).multiply(new BigDecimal(target.getEntryNum())).doubleValue());
        target.setStockinDate(input.getStockinDate());

        target.setCompany(source.getCompany());
        target.setEscrowCompany(source.getEscrowCompany());
        target.setSparePartsCategories(source.getSparePartsCategories());
        target.setSparePartsNo(source.getSparePartsNo());
        target.setSparePartsName(source.getSparePartsName());
        target.setSparePartsUnit(source.getSparePartsUnit());
        target.setSparePartsOriginalBatch(source.getSparePartsOriginalBatch());
        target.setInvoicePrice(source.getInvoicePrice());
        target.setCore(source.getCore());
        target.setVat(source.getVat());
        target.setTariff(source.getTariff());
        target.setTariffDate(source.getTariffDate());
        target.setTariffNo(source.getTariffNo());
        target.setTariffStatus(source.getTariffStatus());
        target.setFreight(source.getFreight());
        target.setUnitPrice(source.getUnitPrice());
        target.setOldStockinDate(source.getOldStockinDate());
        target.setIsDel(PlatformConstants.ISDEL_NO);
        target.setCreateTime(new Date());
        target.setCreateUser(getCurrentUserId());

        stockMapper.insertSelective(target);

    }

    /**
     * 库存修改
     */
    @Override
    public void updateStock(AddStockInput input) {
        WareStockExample example = new WareStockExample();
        example.createCriteria().andSparePartsBatchEqualTo(input.getSourceBatch())
                .andSparePartsEqualTo(input.getSpareParts());
        List<WareStock> stocks = stockMapper.selectByExample(example);

        WareStock stock = stocks.stream().findFirst().orElseThrow(() -> new RuntimeException("not found"));
        stock.setUpdateTime(new Date());
        // 未锁库时更新库存
//		if(!getWarehouseLockStatus(input.getWarehouse())) {
//			
//		}
        stock.setSurplusNum(
                new BigDecimal(stock.getSurplusNum()).add(new BigDecimal(input.getEntryNum())).doubleValue());

        stock.setActualSurplusNum(stock.getSurplusNum());

        stockMapper.updateByPrimaryKeySelective(stock);

    }

    /**
     * 是否借入件
     */
    public boolean isBorrow(List<Integer> ids) {
        boolean flag = false;
        for (Integer id : ids) {
            WareStock stock = stockMapper.selectByPrimaryKey(id);
            SearchStockinInput searchStockinInput = new SearchStockinInput(1, 1);
            searchStockinInput.setStockinNo(stock.getStockinNo());
            PagedList<StockinOutput> stockPagedList = stockinService.stockinPageList(searchStockinInput);

            String sourceNo = stockPagedList.getDataList().get(0).getNo();

            SearchBorrowLendInput searchBorrowLendInput = new SearchBorrowLendInput(1, 1);
            searchBorrowLendInput.setNo(sourceNo);
            PagedList<BorrowLendOutput> borrowPagedList = borrowService.getBorrows(searchBorrowLendInput);

            flag = !borrowPagedList.getDataList().isEmpty();

        }

        return flag;
    }

    /**
     * 查询可切割备件库存
     *
     * @param key
     * @param company
     * @param yard
     * @return
     */
    @Override
    public Double isIncGetNum(String key, String company, String yard) {
        Result<YardOutput> result = productionFeignClient.queryByKey(getCurrentYardKey());
        String defaultWarehouse = "";
        if (result != null && result.getCode() == 0) {
            defaultWarehouse = result.getData().getDefaultWarehouse();
        }
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        criteria.andSparePartsEqualTo(key);
        criteria.andCompanyEqualTo(company);
        criteria.andWarehouseEqualTo(defaultWarehouse);
        criteria.andWarehouseTypeEqualTo("LKWARETYPE000009");
        List<WareStock> wareStocks = stockMapper.selectByExample(example);
        Double output = 0D;
        for (WareStock wareStock : wareStocks) {
            output += wareStock.getActualSurplusNum();
        }
        return output;
    }

    /**
     * 根据仓库 仓库类型 备件集合获取库存集合
     */
    public List<StockOutput> getStock(List<String> spareParts, String warehouse, String warehouseType) {
        WareStockExample example = new WareStockExample();
        List<StockOutput> stockOutputs = new ArrayList<>();
        spareParts.forEach(sp -> {
            example.createCriteria().andWarehouseEqualTo(warehouse)
                    .andWarehouseTypeEqualTo(warehouseType)
                    .andSparePartsEqualTo(sp);

            List<WareStock> stocks = stockMapper.selectByExample(example);
            double sum = stocks.stream().mapToDouble(WareStock::getSurplusNum).summaryStatistics().getSum();
            StockOutput stockOutput = new StockOutput();
            stockOutput.setSpareParts(sp);
            stockOutput.setSurplusNum(Optional.ofNullable(sum).orElse(WarehouseConstants.DOUBLE_ZERO));
            stockOutputs.add(stockOutput);
        });

        return stockOutputs;
    }

    @Override
    public boolean getWarehouseLockStatus(String key) {

        EditWarehouseInput input = new EditWarehouseInput();
        input.setKey(key);
        WareWarehouse warehouse = warehouseService.getWarehouseDetail(input);
        if (CommonEnum.YES.getCode().equals(warehouse.getWarehouseStatus()) && warehouse.getLockTime() != null
                && (new Date()).after(warehouse.getLockTime())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 上次入库价格
     */
    @Override
    public BigDecimal getLastEntryPrice(String spareParts, String warehouse) {
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        criteria.andSparePartsEqualTo(spareParts);
        if (!StringUtils.isEmpty(warehouse)) {
            criteria.andWarehouseEqualTo(warehouse);
        }
        example.setOrderByClause("create_time desc");
        List<WareStock> wareStockinDetails = stockMapper.selectByExample(example);
        if (wareStockinDetails.size() > 0) {
            return ComputeUtil.add(wareStockinDetails.get(0).getInvoicePrice(), ComputeUtil
                    .div(wareStockinDetails.get(0).getVat(), new BigDecimal(wareStockinDetails.get(0).getEntryNum())));
        } else {
            return BigDecimal.ZERO;
        }
    }

    /**
     * 根据检索条件获得库存list
     *
     * @param input SearchStockInput
     * @return List<StockOutput> or empty list
     * @author lishzh
     */
    @Override
    public List<StockOutput> getStock(SearchStockInput input) {

        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotEmpty(input.getCompany())) {
            criteria.andCompanyEqualTo(input.getCompany());
        }
        if (StringUtils.isNotEmpty(input.getYard())) {
            AddWarehouseYardRelationInput relationInput = new AddWarehouseYardRelationInput();
            relationInput.setYard(input.getYard());
            WareTypeYardOutput warehouse = warehouseService.getWarehouseByYard(relationInput);
            if (warehouse != null && !CollectionUtils.isEmpty(warehouse.getDataList())) {
                criteria.andWarehouseIn(warehouse.getDataList().stream().map(w -> w.getKey()).collect(Collectors.toList()));
            }
        }
        if (StringUtils.isNotEmpty(input.getSpareParts())) {
            criteria.andSparePartsEqualTo(input.getSpareParts());
        }
        example.setOrderByClause("create_time desc");
        return stockMapper.selectByExample(example).stream().map(s -> {
            StockOutput output = new StockOutput();
            output.setWareStockId(s.getWareStockId());
            output.setActualSurplusNum(s.getActualSurplusNum());
            output.setSurplusNum(s.getSurplusNum());
            output.setSpareParts(s.getSpareParts());
            output.setSparePartsBatch(s.getSparePartsBatch());
            output.setSparesName(s.getSparePartsName());
            output.setWarehouse(s.getWarehouse());
            output.setWarehouseType(s.getWarehouseType());
            output.setCompany(s.getCompany());
            output.setUnitPrice(s.getUnitPrice());
            return output;
        }).collect(Collectors.toList());
    }

    /**
     * 机组进场检验获取库存
     *
     * @param sparesNum     备件号
     * @param billType      单据类型
     * @param containerUser 用箱人
     * @author lishzh
     */
    @Override
    public WareOutput getStockJZJCJY(String sparesNum, String billType, String yard, String containerUser) {
        //根据场站获取场站下的仓库
        AddWarehouseYardRelationInput input = new AddWarehouseYardRelationInput();
        input.setYard(yard);
        WareTypeYardOutput warehouse = warehouseService.getWarehouseByYard(input);
        //获取单据类型对应的仓库类型
        List<WarehouseTypeOutput> warehouseTypes = billTypeService.getWarehouseTypesByBill(billType);

        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        if (sparesNum.endsWith("-XF") || sparesNum.endsWith("-ES") || sparesNum.endsWith("-HS")) {
            //匹配带后缀备件号
            criteria.andSuffixNoEqualTo(sparesNum);
        } else {
            //匹配不带后缀备件号
            criteria.andSparePartsNoEqualTo(sparesNum);
        }
        if (warehouse != null && !CollectionUtils.isEmpty(warehouse.getDataList())) {
            criteria.andWarehouseIn(warehouse.getDataList().stream().map(w -> w.getKey()).collect(Collectors.toList()));
        } else {
            return null;
        }
        if (warehouseTypes != null && !warehouseTypes.isEmpty()) {
            criteria.andWarehouseTypeIn(warehouseTypes.stream().map(w -> w.getKey()).collect(Collectors.toList()));
        } else {
            return null;
        }

        List<StockOutput> outputs = new ArrayList<>();
        stockMapper.selectByExample(example).forEach(s -> {
            boolean match = false;
            for (StockOutput o:outputs){
                match = s.getWarehouse().concat(s.getWarehouseType()).equals(o.getWarehouse().concat(o.getWarehouseType()));
                if (match){
                    o.setActualSurplusNum(ComputeUtil.add(o.getActualSurplusNum(),s.getActualSurplusNum()));
                }
            }
            if (!match){
                StockOutput output = new StockOutput();
                output.setSparesNum(s.getSparePartsNo());
                output.setSparesName(s.getSparePartsName());
                output.setWarehouse(s.getWarehouse());
                output.setWarehouseType(s.getWarehouseType());
                output.setCompany(s.getCompany());
                output.setSurplusQuantity(s.getActualSurplusNum());
                if ("LKWARETYPE000021".equals(s.getWarehouseType())) {
                    //船公司件库 匹配用箱人
                    if (containerUser.equals(s.getEscrowCompany())) {
                        outputs.add(output);
                    }
                } else {
                    outputs.add(output);
                }
            }

        });

        WareOutput ware = new WareOutput();
        ware.setDefaultWarehouse(warehouse.getDefaultWarehouse());
        Optional.ofNullable(sparePartsService.getSparePart(null, sparesNum)).ifPresent(sp -> {
            ware.setDefaultWarehouseType(sp.getDefaultWarehouseType());
            ware.setQuotePrice(sp.getQuotePrice());
        });
        ware.setDataList(outputs);
        return ware;
    }

    /**
     * 备件修理压缩机材料出库获取库存
     *
     * @param yard
     * @param warehouseType
     * @return List<StockOutput> or empty list
     * @author lishzh
     */
    @Override
    public List<StockOutput> getStockCompressorMaterial(String yard, String warehouseType) {
        //根据场站获取场站下的仓库
        AddWarehouseYardRelationInput input = new AddWarehouseYardRelationInput();
        input.setYard(yard);
        WareTypeYardOutput warehouse = warehouseService.getWarehouseByYard(input);
        //获取单据类型对应的仓库类型

        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        if (warehouse != null && !CollectionUtils.isEmpty(warehouse.getDataList())) {
            criteria.andWarehouseIn(warehouse.getDataList().stream().map(w -> w.getKey()).collect(Collectors.toList()));
        }
        criteria.andWarehouseTypeEqualTo(warehouseType);


        List<StockOutput> outputs = new ArrayList<>();
        stockMapper.selectByExample(example).forEach(s -> {
            StockOutput output = new StockOutput();
            output.setWareStockId(s.getWareStockId());
            output.setActualSurplusNum(s.getActualSurplusNum());
            output.setSurplusNum(s.getSurplusNum());
            output.setSpareParts(s.getSpareParts());
            output.setSparePartsBatch(s.getSparePartsBatch());
            output.setSparesName(s.getSparePartsName());
            output.setWarehouse(s.getWarehouse());
            output.setWarehouseType(s.getWarehouseType());
            output.setCompany(s.getCompany());
            output.setUnitPrice(s.getUnitPrice());
            outputs.add(output);
        });
        return outputs;
    }

    /**
     * 根据备件原始批次号和备件key获取库存数量
     */
    @Override
    public Double getStockByOriginalBatch(String originalBatch, String sparePartsKey) {
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        criteria.andSparePartsEqualTo(sparePartsKey);
        criteria.andSparePartsOriginalBatchEqualTo(originalBatch);
        List<WareStock> wareStocks = stockMapper.selectByExample(example);
        if (wareStocks.size() < 1) {
            return 0D;
        }
        Double sum = 0D;
        for (WareStock wareStock : wareStocks) {
            sum += wareStock.getActualSurplusNum();
        }
        return sum;
    }

    /**
     * 根据备件原始批次号和备件key获取备件该批次的入库数量和库存数量
     */
    @Override
    public WareStock getStockInfoByOriginalBatch(String originalBatch, String sparePartsKey) {
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        criteria.andSparePartsEqualTo(sparePartsKey);
        criteria.andSparePartsOriginalBatchEqualTo(originalBatch);
        List<WareStock> wareStocks = stockMapper.selectByExample(example);
        if (wareStocks != null && wareStocks.size() < 1) {
            return null;
        }
        WareStock retStock = new WareStock();
        Double sum = 0D;
        for (WareStock wareStock : wareStocks) {
            sum += wareStock.getActualSurplusNum();
        }
        retStock.setActualSurplusNum(sum);
        retStock.setEntryNum(wareStocks.get(0).getEntryNum());
        return retStock;
    }

    /**
     * 根据备件原始批次号和备件key获取库存数量
     */
    @Override
    public List<String> getBatchByOriginalBatch(String originalBatch, String sparePartsKey) {
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        criteria.andSparePartsEqualTo(sparePartsKey);
        criteria.andSparePartsOriginalBatchEqualTo(originalBatch);
        List<WareStock> wareStocks = stockMapper.selectByExample(example);
        List<String> batches = new ArrayList<>();
        if (wareStocks != null && wareStocks.size() < 1) {
            return batches;
        }
        return wareStocks.stream().map(WareStock::getSparePartsBatch).collect(Collectors.toList());
    }

    /**
     * 修改库存-入库单调账-调整数量
     */
    @Override
    public void setStock(String originalBatch, String sparePartsKey, Double stock) {
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        criteria.andSparePartsEqualTo(sparePartsKey);
        criteria.andSparePartsOriginalBatchEqualTo(originalBatch);
        example.setOrderByClause("create_time");
        List<WareStock> wareStocks = stockMapper.selectByExample(example);
        // 已调整数量
        Double adjustmentFinshNum = 0d;
        for (WareStock wareStock : wareStocks) {
            if (wareStock.getEntryNum() < stock) {
                // 调增数量
                Double adjustmentNum = stock - wareStock.getEntryNum();
                // 调增
                wareStock.setEntryNum(stock);
                wareStock.setSurplusNum(wareStock.getSurplusNum() + adjustmentNum);
                wareStock.setActualSurplusNum(wareStock.getActualSurplusNum() + adjustmentNum);
                wareStock.setUpdateTime(new Date());
                wareStock.setUpdateUser(getCurrentUserId());
                stockMapper.updateByPrimaryKeySelective(wareStock);
                break;
            } else {
                // 调减数量
                Double adjustmentNum = wareStock.getEntryNum() - stock;
                // 调减
                if (adjustmentNum - adjustmentFinshNum > wareStock.getActualSurplusNum()) {
                    adjustmentFinshNum = adjustmentFinshNum + wareStock.getActualSurplusNum();
                    wareStock.setEntryNum(stock);
                    wareStock.setSurplusNum(0d);
                    wareStock.setActualSurplusNum(0d);
                    wareStock.setUpdateTime(new Date());
                    wareStock.setUpdateUser(getCurrentUserId());
                    stockMapper.updateByPrimaryKeySelective(wareStock);
                } else {
                    wareStock.setEntryNum(stock);
                    wareStock.setSurplusNum(wareStock.getSurplusNum() - (adjustmentNum - adjustmentFinshNum));
                    wareStock.setActualSurplusNum(wareStock.getActualSurplusNum() - (adjustmentNum - adjustmentFinshNum));
                    wareStock.setUpdateTime(new Date());
                    wareStock.setUpdateUser(getCurrentUserId());
                    stockMapper.updateByPrimaryKeySelective(wareStock);
                    break;
                }
            }
        }

    }

    /**
     * 修改库存-入库单调账-调整仓库类型
     */
    @Override
    public void setStock(String originalBatch, String sparePartsKey, String warehouseType, BigDecimal entryPrice) {
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        criteria.andSparePartsEqualTo(sparePartsKey);
        criteria.andSparePartsOriginalBatchEqualTo(originalBatch);
        List<WareStock> wareStocks = stockMapper.selectByExample(example);


        Map<String, Double> warehouseStock = wareStocks.stream().collect(Collectors.groupingBy(WareStock::getWarehouse, Collectors.summingDouble(WareStock::getActualSurplusNum)));
        Map<String, BigDecimal> unitPriceMap = new HashMap<String, BigDecimal>();
        for (String warehouse : warehouseStock.keySet()) {
            // 其他库调入修复件库
            if (warehouseType.equals("LKWARETYPE000006")) {
                example.clear();
                criteria = example.createCriteria();
                criteria.andSparePartsEqualTo(sparePartsKey);
                criteria.andWarehouseTypeEqualTo(warehouseType);
                criteria.andWarehouseEqualTo(warehouse);
                List<WareStock> oldWarehouseTypeStocks = stockMapper.selectByExample(example);
                // 修复件库有调整备件的库存
                if (oldWarehouseTypeStocks != null && oldWarehouseTypeStocks.size() > 0) {
                    // 修复件库原有备件数量
                    Double oldNum = oldWarehouseTypeStocks.stream().mapToDouble(WareStock::getActualSurplusNum).sum();
                    // 调整库存备件数量
                    Double adjustmentNum = warehouseStock.get(warehouse);
                    // 其他库调入修复件库时需要对相同备件号价格加权平均
                    BigDecimal oldTotalAmount = ComputeUtil.mul(oldWarehouseTypeStocks.get(0).getUnitPrice(), new BigDecimal(oldNum));
                    BigDecimal adjustmentAmount = ComputeUtil.mul(entryPrice, new BigDecimal(adjustmentNum));
                    BigDecimal Total = ComputeUtil.add(oldTotalAmount, adjustmentAmount);
                    BigDecimal unitPrice = ComputeUtil.div(Total, new BigDecimal(oldNum + adjustmentNum));
                    unitPriceMap.put(warehouse, unitPrice);
                    WareStock record = new WareStock();
                    record.setUnitPrice(unitPrice);
                    stockMapper.updateByExampleSelective(record, example);

                } else {
                    // 修复件库没有调整备件的库存
                    unitPriceMap.put(warehouse, entryPrice);
                }
            }
        }

        // 调整仓库类型的库存数
        for (WareStock wareStock : wareStocks) {
            WareStock updateRecord = new WareStock();
            updateRecord.setWareStockId(wareStock.getWareStockId());
            updateRecord.setSurplusNum(0d);
            updateRecord.setActualSurplusNum(0d);
            updateRecord.setUpdateTime(new Date());
            updateRecord.setUpdateUser(getCurrentUserId());
            stockMapper.updateByPrimaryKeySelective(updateRecord);
            WareStock insertRecord = new WareStock();
            BeanUtils.copyProperties(wareStock, insertRecord);
            insertRecord.setWarehouseType(warehouseType);
            insertRecord.setCreateTime(new Date());
            insertRecord.setCreateUser(getCurrentUserId());
            insertRecord.setUnitPrice(unitPriceMap.get(wareStock.getWarehouse()));
            stockMapper.insertSelective(insertRecord);

        }


    }

    /**
     * 修改库存-入库单调账-调整关税、增值税、单价
     */
    @Override
    public void setStock(String originalBatch, String sparePartsKey, WareEntryAdjustmentDetail adjustmentDetail) {
        WareStockExample example = new WareStockExample();
        WareStockExample.Criteria criteria = example.createCriteria();
        criteria.andSparePartsEqualTo(sparePartsKey);
        criteria.andSparePartsOriginalBatchEqualTo(originalBatch);
        List<WareStock> wareStocks = stockMapper.selectByExample(example);
        for (WareStock wareStock : wareStocks) {
            wareStock.setTariff(adjustmentDetail.getAdjustmentTariff());
            wareStock.setVat(adjustmentDetail.getAdjustmentVat());
            wareStock.setUnitPrice(adjustmentDetail.getEntryPrice());
            wareStock.setUpdateTime(new Date());
            wareStock.setUpdateUser(getCurrentUserId());
            stockMapper.updateByPrimaryKeySelective(wareStock);
        }

    }
}
