package com.sanlly.common.models.output.stock;


import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName: StockOutput
 * Description: 库存输出类
 * date: 2019/7/29 10:35
 *
 * @author wannt
 * @since JDK 1.8
 */
public class StockOutput {

    // 库存id
    private Integer wareStockId;

    // 入库单号
    private String stockinNo;

    // 所属公司
    private String companyLangLang;
    private String company;

    // 仓库类型
    private String warehouseTypeLangLang;
    private String warehouseType;

    // 默认仓库类型
    private String defaultWarehouseTypeLangLang;
    private String defaultWarehouseType;

    // 所属仓库
    private String warehouseLangLang;
    private String warehouse;

    // 所属代管公司
    private String escrowCompanyLangLang;
    private String escrowCompany;

    // 库位
    private String storageLocation;

    // 备件大类
    private String sparePartsCategoriesLangLang;
    private String sparePartsCategories;

    // 备件号
    private String sparePartsNo;

    // 备件名称
    private String sparePartsName;

    // 备件key
    private String spareParts;

    // 备件名称
    private String sparePartsLangLang;

    // 备件单位
    private String sparePartsUnitLangLang;
    private String sparePartsUnit;

    // 长度
    private Double length;

    // 宽度
    private Double width;

    // 备件批次号
    private String sparePartsBatch;

    // 备件原始批次号
    private String sparePartsOriginalBatch;

    // 入库数量
    private Double entryNum;

    // 剩余数量
    private Double surplusNum;

    // 实际剩余数量
    private Double actualSurplusNum;

    // 原始面积
    private Double originalArea;

    // 剩余面积
    private Double surplusArea;

    // 发票单价
    private BigDecimal invoicePrice;

    // CORE
    private BigDecimal core;

    // 增值税
    private BigDecimal vat;

    // 关税状态
    private Integer tariffStatus;

    private String tariffStatusLangLang;

    // 关税
    private BigDecimal tariff;

    // 关税编号
    private String tariffNo;

    // 关税日期
//    private Date tariffDate;

    // 运费
    private BigDecimal freight;

    // 单价
    private BigDecimal unitPrice;

    // 是否合并领料
    private String isMergerAcquisition;
    private String isMergerAcquisitionLangLang;

    // 原始入库日期
//    private Date oldStockinDate;

    // 入库日期
//    private Date stockinDate;
    private String stockinDateStr;

    // 是否可切割
    private String isIncise;

    // 备注
    private String remark;

    private String sparesNum;

    private String sparesName;

    private String yard;

    private String yardName;

    private String warehouseName;

    private String warehouseTypeName;

    private BigDecimal price;

    private Double surplusQuantity;

    public String getSparesNum() {
        return sparesNum;
    }

    public void setSparesNum(String sparesNum) {
        this.sparesNum = sparesNum;
    }

    public String getSparesName() {
        return sparesName;
    }

    public void setSparesName(String sparesName) {
        this.sparesName = sparesName;
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    public String getYardName() {
        return yardName;
    }

    public void setYardName(String yardName) {
        this.yardName = yardName;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseTypeName() {
        return warehouseTypeName;
    }

    public void setWarehouseTypeName(String warehouseTypeName) {
        this.warehouseTypeName = warehouseTypeName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Double getSurplusQuantity() {
        return surplusQuantity;
    }

    public void setSurplusQuantity(Double surplusQuantity) {
        this.surplusQuantity = surplusQuantity;
    }

    public Integer getWareStockId() {
        return wareStockId;
    }

    public void setWareStockId(Integer wareStockId) {
        this.wareStockId = wareStockId;
    }

    public String getStockinNo() {
        return stockinNo;
    }

    public void setStockinNo(String stockinNo) {
        this.stockinNo = stockinNo;
    }

    public String getCompanyLangLang() {
        return companyLangLang;
    }

    public void setCompanyLangLang(String companyLangLang) {
        this.companyLangLang = companyLangLang;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWarehouseTypeLangLang() {
        return warehouseTypeLangLang;
    }

    public void setWarehouseTypeLangLang(String warehouseTypeLangLang) {
        this.warehouseTypeLangLang = warehouseTypeLangLang;
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
    }

    public String getDefaultWarehouseTypeLangLang() {
        return defaultWarehouseTypeLangLang;
    }

    public void setDefaultWarehouseTypeLangLang(String defaultWarehouseTypeLangLang) {
        this.defaultWarehouseTypeLangLang = defaultWarehouseTypeLangLang;
    }

    public String getDefaultWarehouseType() {
        return defaultWarehouseType;
    }

    public void setDefaultWarehouseType(String defaultWarehouseType) {
        this.defaultWarehouseType = defaultWarehouseType;
    }

    public String getWarehouseLangLang() {
        return warehouseLangLang;
    }

    public void setWarehouseLangLang(String warehouseLangLang) {
        this.warehouseLangLang = warehouseLangLang;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getEscrowCompanyLangLang() {
        return escrowCompanyLangLang;
    }

    public void setEscrowCompanyLangLang(String escrowCompanyLangLang) {
        this.escrowCompanyLangLang = escrowCompanyLangLang;
    }

    public String getEscrowCompany() {
        return escrowCompany;
    }

    public void setEscrowCompany(String escrowCompany) {
        this.escrowCompany = escrowCompany;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public String getSparePartsCategoriesLangLang() {
        return sparePartsCategoriesLangLang;
    }

    public void setSparePartsCategoriesLangLang(String sparePartsCategoriesLangLang) {
        this.sparePartsCategoriesLangLang = sparePartsCategoriesLangLang;
    }

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories;
    }

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo;
    }

    public String getSparePartsName() {
        return sparePartsName;
    }

    public void setSparePartsName(String sparePartsName) {
        this.sparePartsName = sparePartsName;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public String getSparePartsLangLang() {
        return sparePartsLangLang;
    }

    public void setSparePartsLangLang(String sparePartsLangLang) {
        this.sparePartsLangLang = sparePartsLangLang;
    }

    public String getSparePartsUnitLangLang() {
        return sparePartsUnitLangLang;
    }

    public void setSparePartsUnitLangLang(String sparePartsUnitLangLang) {
        this.sparePartsUnitLangLang = sparePartsUnitLangLang;
    }

    public String getSparePartsUnit() {
        return sparePartsUnit;
    }

    public void setSparePartsUnit(String sparePartsUnit) {
        this.sparePartsUnit = sparePartsUnit;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public String getSparePartsBatch() {
        return sparePartsBatch;
    }

    public void setSparePartsBatch(String sparePartsBatch) {
        this.sparePartsBatch = sparePartsBatch;
    }

    public String getSparePartsOriginalBatch() {
        return sparePartsOriginalBatch;
    }

    public void setSparePartsOriginalBatch(String sparePartsOriginalBatch) {
        this.sparePartsOriginalBatch = sparePartsOriginalBatch;
    }

    public Double getEntryNum() {
        return entryNum;
    }

    public void setEntryNum(Double entryNum) {
        this.entryNum = entryNum;
    }

    public Double getSurplusNum() {
        return surplusNum;
    }

    public void setSurplusNum(Double surplusNum) {
        this.surplusNum = surplusNum;
    }

    public Double getActualSurplusNum() {
        return actualSurplusNum;
    }

    public void setActualSurplusNum(Double actualSurplusNum) {
        this.actualSurplusNum = actualSurplusNum;
    }

    public Double getOriginalArea() {
        return originalArea;
    }

    public void setOriginalArea(Double originalArea) {
        this.originalArea = originalArea;
    }

    public Double getSurplusArea() {
        return surplusArea;
    }

    public void setSurplusArea(Double surplusArea) {
        this.surplusArea = surplusArea;
    }

    public BigDecimal getInvoicePrice() {
        return invoicePrice;
    }

    public void setInvoicePrice(BigDecimal invoicePrice) {
        this.invoicePrice = invoicePrice;
    }

    public BigDecimal getCore() {
        return core;
    }

    public void setCore(BigDecimal core) {
        this.core = core;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public Integer getTariffStatus() {
        return tariffStatus;
    }

    public void setTariffStatus(Integer tariffStatus) {
        this.tariffStatus = tariffStatus;
    }

    public String getTariffStatusLangLang() {
        return tariffStatusLangLang;
    }

    public void setTariffStatusLangLang(String tariffStatusLangLang) {
        this.tariffStatusLangLang = tariffStatusLangLang;
    }

    public BigDecimal getTariff() {
        return tariff;
    }

    public void setTariff(BigDecimal tariff) {
        this.tariff = tariff;
    }

    public String getTariffNo() {
        return tariffNo;
    }

    public void setTariffNo(String tariffNo) {
        this.tariffNo = tariffNo;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getStockinDateStr() {
        return stockinDateStr;
    }

    public void setStockinDateStr(String stockinDateStr) {
        this.stockinDateStr = stockinDateStr;
    }

    public String getIsIncise() {
        return isIncise;
    }

    public void setIsIncise(String isIncise) {
        this.isIncise = isIncise;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIsMergerAcquisition() {
        return isMergerAcquisition;
    }

    public void setIsMergerAcquisition(String isMergerAcquisition) {
        this.isMergerAcquisition = isMergerAcquisition;
    }

    public String getIsMergerAcquisitionLangLang() {
        return isMergerAcquisitionLangLang;
    }

    public void setIsMergerAcquisitionLangLang(String isMergerAcquisitionLangLang) {
        this.isMergerAcquisitionLangLang = isMergerAcquisitionLangLang;
    }
}
