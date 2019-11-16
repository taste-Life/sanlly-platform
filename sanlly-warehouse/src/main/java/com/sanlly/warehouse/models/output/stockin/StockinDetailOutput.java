package com.sanlly.warehouse.models.output.stockin;

import com.sanlly.warehouse.models.output.spareparts.SparePartsBriefOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName: StockinDetailOutput
 * Description: 入库单明细输出类
 * date: 2019/8/5 11:22
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("入库单明细输出类")
public class StockinDetailOutput {
    // 入库单明细输出类ID
    private Integer wareStockinDetailId;

    // 入库单id
    private Integer wareStockinId;

    // 入库批次
    private String stockinBatch;

    // 原始入库批次
    private String sparePartsOriginalBatch;

    // 备件
    private String spareParts;
    private String sparePartsLangLang;

    // 备件号
    private String sparePartsNo;

    // 备件大类
    private String sparePartsCategories;
    private String sparePartsCategoriesLangLang;

    // 长度
    private Double length;

    // 宽度
    private Double width;

    // 入库面积
    private Double entryArea;

    // 送货数量
    private Double deliveryNum;

    // 总金额
    private BigDecimal totalAmount;

    // 入库数量
    private Double entryNum;

    // 库存面积
    private Double stockNum;

    // 库位
    private String storageLocation;

    // 关税
    private BigDecimal tariff;

    // 关税状态
    private String tariffStatus;
    private String tariffStatusLangLang;

    // 关税编号
    private String tariffNo;

    // 关税日期
    private Date tariffDate;

    // 增值税
    private BigDecimal vat;

    // 运费
    private BigDecimal freight;

    // 所属仓库
    private String warehouse;
    private String warehouseLangLang;

    // 仓库类型
    private String warehouseType;
    private String warehouseTypeLangLang;

    // 发票单价
    private BigDecimal unitPrice;
    // 单价
    private BigDecimal invoicePrice;

    // core
    private BigDecimal core;

    // 入库单价
    private BigDecimal entryPrice;

    // 上次入库日期
    private Date oldStockinDate;

    // 备注
    private String remark;

    public Double getStockNum() {
        return stockNum;
    }

    public void setStockNum(Double stockNum) {
        this.stockNum = stockNum;
    }

    public Integer getWareStockinDetailId() {
        return wareStockinDetailId;
    }

    public void setWareStockinDetailId(Integer wareStockinDetailId) {
        this.wareStockinDetailId = wareStockinDetailId;
    }

    public Integer getWareStockinId() {
        return wareStockinId;
    }

    public void setWareStockinId(Integer wareStockinId) {
        this.wareStockinId = wareStockinId;
    }

    public String getStockinBatch() {
        return stockinBatch;
    }

    public void setStockinBatch(String stockinBatch) {
        this.stockinBatch = stockinBatch;
    }

    public String getSparePartsOriginalBatch() {
        return sparePartsOriginalBatch;
    }

    public void setSparePartsOriginalBatch(String sparePartsOriginalBatch) {
        this.sparePartsOriginalBatch = sparePartsOriginalBatch;
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

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo;
    }

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories;
    }

    public String getSparePartsCategoriesLangLang() {
        return sparePartsCategoriesLangLang;
    }

    public void setSparePartsCategoriesLangLang(String sparePartsCategoriesLangLang) {
        this.sparePartsCategoriesLangLang = sparePartsCategoriesLangLang;
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

    public Double getEntryArea() {
        return entryArea;
    }

    public void setEntryArea(Double entryArea) {
        this.entryArea = entryArea;
    }

    public Double getDeliveryNum() {
        return deliveryNum;
    }

    public void setDeliveryNum(Double deliveryNum) {
        this.deliveryNum = deliveryNum;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getEntryNum() {
        return entryNum;
    }

    public void setEntryNum(Double entryNum) {
        this.entryNum = entryNum;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public BigDecimal getTariff() {
        return tariff;
    }

    public void setTariff(BigDecimal tariff) {
        this.tariff = tariff;
    }

    public String getTariffStatus() {
        return tariffStatus;
    }

    public void setTariffStatus(String tariffStatus) {
        this.tariffStatus = tariffStatus;
    }

    public String getTariffStatusLangLang() {
        return tariffStatusLangLang;
    }

    public void setTariffStatusLangLang(String tariffStatusLangLang) {
        this.tariffStatusLangLang = tariffStatusLangLang;
    }

    public String getTariffNo() {
        return tariffNo;
    }

    public void setTariffNo(String tariffNo) {
        this.tariffNo = tariffNo;
    }

    public Date getTariffDate() {
        return tariffDate;
    }

    public void setTariffDate(Date tariffDate) {
        this.tariffDate = tariffDate;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getWarehouseLangLang() {
        return warehouseLangLang;
    }

    public void setWarehouseLangLang(String warehouseLangLang) {
        this.warehouseLangLang = warehouseLangLang;
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
    }

    public String getWarehouseTypeLangLang() {
        return warehouseTypeLangLang;
    }

    public void setWarehouseTypeLangLang(String warehouseTypeLangLang) {
        this.warehouseTypeLangLang = warehouseTypeLangLang;
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

    public BigDecimal getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(BigDecimal entryPrice) {
        this.entryPrice = entryPrice;
    }

    public Date getOldStockinDate() {
        return oldStockinDate;
    }

    public void setOldStockinDate(Date oldStockinDate) {
        this.oldStockinDate = oldStockinDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
    
}
