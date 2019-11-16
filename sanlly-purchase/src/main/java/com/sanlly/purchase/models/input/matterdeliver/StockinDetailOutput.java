package com.sanlly.purchase.models.input.matterdeliver;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

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

    @ApiModelProperty(value = "入库批次号",name = "stockinBatch")
    private String stockinBatch;

    @ApiModelProperty(value = "备件大类",name = "sparePartsCategories")
    private String sparePartsCategoriesLangLang;
    private String sparePartsCategories;

    @ApiModelProperty(value = "备件号",name = "sparePartsNo")
    private String sparePartsNo;

    @ApiModelProperty(value = "备件",name = "spareParts")
    private String sparePartsLangLang;
    private String spareParts;

    @ApiModelProperty(value = "送货数量",name = "deliveryNum")
    private Double deliveryNum;

    @ApiModelProperty(value = "入库数量",name = "entryNum")
    private Double entryNum;

    @ApiModelProperty(value = "库位",name = "storageLocation")
    private String storageLocation;

    @ApiModelProperty(value = "关税",name = "tariff")
    private BigDecimal tariff;

    @ApiModelProperty(value = "增值税",name = "vat")
    private BigDecimal vat;

    @ApiModelProperty(value = "运费",name = "freight")
    private BigDecimal freight;

    @ApiModelProperty(value = "入库仓库",name = "warehouseLang")
    private String warehouseLangLang;
    private String warehouse;

    @ApiModelProperty(value = "默认仓库类型",name = "warehouseTypeLang")
    private String warehouseTypeLangLang;
    private String warehouseType;

    @ApiModelProperty(value = "发票单价",name = "invoicePrice")
    private BigDecimal invoicePrice;

    @ApiModelProperty(value = "CORE(不含税)",name = "core")
    private BigDecimal core;

    @ApiModelProperty(value = "入库单价",name = "entryPrice")
    private BigDecimal entryPrice;

    @ApiModelProperty(value = "备注",name = "remark")
    private String remark;

    public String getStockinBatch() {
        return stockinBatch;
    }

    public void setStockinBatch(String stockinBatch) {
        this.stockinBatch = stockinBatch;
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

    public String getSparePartsLangLang() {
        return sparePartsLangLang;
    }

    public void setSparePartsLangLang(String sparePartsLangLang) {
        this.sparePartsLangLang = sparePartsLangLang;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public Double getDeliveryNum() {
        return deliveryNum;
    }

    public void setDeliveryNum(Double deliveryNum) {
        this.deliveryNum = deliveryNum;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "StockinDetailOutput{" +
                "stockinBatch='" + stockinBatch + '\'' +
                ", sparePartsCategoriesLangLang='" + sparePartsCategoriesLangLang + '\'' +
                ", sparePartsCategories='" + sparePartsCategories + '\'' +
                ", sparePartsNo='" + sparePartsNo + '\'' +
                ", sparePartsLangLang='" + sparePartsLangLang + '\'' +
                ", spareParts='" + spareParts + '\'' +
                ", deliveryNum=" + deliveryNum +
                ", entryNum=" + entryNum +
                ", storageLocation='" + storageLocation + '\'' +
                ", tariff=" + tariff +
                ", vat=" + vat +
                ", freight=" + freight +
                ", warehouseLangLang='" + warehouseLangLang + '\'' +
                ", warehouse='" + warehouse + '\'' +
                ", warehouseTypeLangLang='" + warehouseTypeLangLang + '\'' +
                ", warehouseType='" + warehouseType + '\'' +
                ", invoicePrice=" + invoicePrice +
                ", core=" + core +
                ", entryPrice=" + entryPrice +
                ", remark='" + remark + '\'' +
                '}';
    }
}
