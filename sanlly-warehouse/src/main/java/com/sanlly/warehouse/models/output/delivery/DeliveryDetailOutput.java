package com.sanlly.warehouse.models.output.delivery;

import io.swagger.annotations.ApiModel;

import java.math.BigDecimal;

/**
 * ClassName: DeliveryDetailOutput
 * Description: 送货单明细输出类
 * date: 2019/9/2 10:41
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("送货单明细输出类")
public class DeliveryDetailOutput {

    // 送货单明细ID
    private Integer wareDeliverySlipDetailId;

    // 送货单主表ID
    private Integer wareDeliverySlipId;

    // 备件
    private String spareParts;
    private String sparePartsLangLang;

    // 备件号
    private String sparePartsNo;

    // 备件大类
    private String sparePartsCategories;
    private String sparePartsCategoriesLangLang;

    // 送货数量
    private Double num;

    // 运费
    private BigDecimal freight;

    // 单价
    private BigDecimal price;

    // 总价
    private BigDecimal totalAmount;

    // 所属公司
    private String company;
    private String companyLangLang;

    // 出库仓库
    private String outWarehouse;
    private String outWarehouseLangLang;

    // 入库数量
    private Double stockinNum;

    // 备注
    private String remark;

    // 入库状态
    private String stockinStatus;
    private String stockinStatusLangLang;

    public Integer getWareDeliverySlipDetailId() {
        return wareDeliverySlipDetailId;
    }

    public void setWareDeliverySlipDetailId(Integer wareDeliverySlipDetailId) {
        this.wareDeliverySlipDetailId = wareDeliverySlipDetailId;
    }

    public Integer getWareDeliverySlipId() {
        return wareDeliverySlipId;
    }

    public void setWareDeliverySlipId(Integer wareDeliverySlipId) {
        this.wareDeliverySlipId = wareDeliverySlipId;
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

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyLangLang() {
        return companyLangLang;
    }

    public void setCompanyLangLang(String companyLangLang) {
        this.companyLangLang = companyLangLang;
    }

    public String getOutWarehouse() {
        return outWarehouse;
    }

    public void setOutWarehouse(String outWarehouse) {
        this.outWarehouse = outWarehouse;
    }

    public String getOutWarehouseLangLang() {
        return outWarehouseLangLang;
    }

    public void setOutWarehouseLangLang(String outWarehouseLangLang) {
        this.outWarehouseLangLang = outWarehouseLangLang;
    }

    public Double getStockinNum() {
        return stockinNum;
    }

    public void setStockinNum(Double stockinNum) {
        this.stockinNum = stockinNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStockinStatus() {
        return stockinStatus;
    }

    public void setStockinStatus(String stockinStatus) {
        this.stockinStatus = stockinStatus;
    }

    public String getStockinStatusLangLang() {
        return stockinStatusLangLang;
    }

    public void setStockinStatusLangLang(String stockinStatusLangLang) {
        this.stockinStatusLangLang = stockinStatusLangLang;
    }
}
