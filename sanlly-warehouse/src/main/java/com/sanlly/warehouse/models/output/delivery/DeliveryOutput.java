package com.sanlly.warehouse.models.output.delivery;

import io.swagger.annotations.ApiModel;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * ClassName: DeliveryOutput
 * Description: 送货单输出类
 * date: 2019/9/2 10:41
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("送货单输出类")
public class DeliveryOutput {

    // 送货单输出类
    private Integer wareDeliverySlipId;

    // 采购订单号
    private String purchaseNo;

    // 送货单号
    private String deliverySlipNo;

    // 源单号
    private String no;

    // 送货日期
    private Date deliveryDate;
    private String deliveryDateStr;

    // 供应商
    private String supplier;
    private String supplierLangLang;

    // 发票类型
    private String invoiceType;
    private String invoiceTypeLangLang;

    // 税点
    private Double invoicePoint;

    // 送货状态
    private String deliveryStatus;
    private String deliveryStatusLangLang;

    // 确认状态
    private String status;
    private String statusLangLang;

    // 送货数量
    private Double deliveryNum;

    // 物流公司
    private String logisticsCompany;

    // 物流单号
    private String logisticsNum;

    // 单据类型
    private String billType;

    // 收货人
    private String receivingUser;

    // 运费
    private BigDecimal freight;

    // 收货地址
    private String receivingAddress;

    // 采购仓库
    private String intWarehouse;
    private String intWarehouseLangLang;

    // 所属公司
    private String company;
    private String companyLangLang;

    // 出库仓库
    private String outWarehouse;
    private String outWarehouseLangLang;

    // 备注
    private String remark;

    // 明细列表
    private List<DeliveryDetailOutput> detailOutputs;

    public String getDeliveryDateStr() {
        return deliveryDateStr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusLangLang() {
        return statusLangLang;
    }

    public void setStatusLangLang(String statusLangLang) {
        this.statusLangLang = statusLangLang;
    }

    public void setDeliveryDateStr(String deliveryDateStr) {
        this.deliveryDateStr = deliveryDateStr;
    }

    public Integer getWareDeliverySlipId() {
        return wareDeliverySlipId;
    }

    public void setWareDeliverySlipId(Integer wareDeliverySlipId) {
        this.wareDeliverySlipId = wareDeliverySlipId;
    }

    public String getPurchaseNo() {
        return purchaseNo;
    }

    public void setPurchaseNo(String purchaseNo) {
        this.purchaseNo = purchaseNo;
    }

    public String getDeliverySlipNo() {
        return deliverySlipNo;
    }

    public void setDeliverySlipNo(String deliverySlipNo) {
        this.deliverySlipNo = deliverySlipNo;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getSupplierLangLang() {
        return supplierLangLang;
    }

    public void setSupplierLangLang(String supplierLangLang) {
        this.supplierLangLang = supplierLangLang;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceTypeLangLang() {
        return invoiceTypeLangLang;
    }

    public void setInvoiceTypeLangLang(String invoiceTypeLangLang) {
        this.invoiceTypeLangLang = invoiceTypeLangLang;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getDeliveryStatusLangLang() {
        return deliveryStatusLangLang;
    }

    public void setDeliveryStatusLangLang(String deliveryStatusLangLang) {
        this.deliveryStatusLangLang = deliveryStatusLangLang;
    }

    public Double getDeliveryNum() {
        return deliveryNum;
    }

    public void setDeliveryNum(Double deliveryNum) {
        this.deliveryNum = deliveryNum;
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public String getLogisticsNum() {
        return logisticsNum;
    }

    public void setLogisticsNum(String logisticsNum) {
        this.logisticsNum = logisticsNum;
    }

    public String getReceivingUser() {
        return receivingUser;
    }

    public void setReceivingUser(String receivingUser) {
        this.receivingUser = receivingUser;
    }

    public String getReceivingAddress() {
        return receivingAddress;
    }

    public void setReceivingAddress(String receivingAddress) {
        this.receivingAddress = receivingAddress;
    }

    public String getIntWarehouse() {
        return intWarehouse;
    }

    public void setIntWarehouse(String intWarehouse) {
        this.intWarehouse = intWarehouse;
    }

    public String getIntWarehouseLangLang() {
        return intWarehouseLangLang;
    }

    public void setIntWarehouseLangLang(String intWarehouseLangLang) {
        this.intWarehouseLangLang = intWarehouseLangLang;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<DeliveryDetailOutput> getDetailOutputs() {
        return detailOutputs;
    }

    public Double getInvoicePoint() {
        return invoicePoint;
    }

    public void setInvoicePoint(Double invoicePoint) {
        this.invoicePoint = invoicePoint;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public void setDetailOutputs(List<DeliveryDetailOutput> detailOutputs) {
        this.detailOutputs = detailOutputs;
    }
}
