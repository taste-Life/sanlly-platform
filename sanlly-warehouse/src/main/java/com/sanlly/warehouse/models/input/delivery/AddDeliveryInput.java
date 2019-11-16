package com.sanlly.warehouse.models.input.delivery;

import io.swagger.annotations.ApiModel;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * ClassName: AddDeliveryInput
 * Description: 新增送货单输入类
 * date: 2019/9/2 10:36
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("新增送货单输入类")
public class AddDeliveryInput {

    // 采购订单号
    private String purchaseNo;

    // 源单号
    private String no;

    // 单据类型
    private String billType;

    // 供应商
    private String supplier;

    // 发票类型
    private String invoiceType;

    // 送货数量
    private Double deliveryNum;

    // 运费
    private BigDecimal freight;

    // 物流公司
    private String logisticsCompany;

    // 物流单号
    private String logisticsNum;

    // 收货人
    private String receivingUser;

    // 收货地址
    private String receivingAddress;

    // 采购仓库
    private String intWarehouse;

    // 出库仓库
    private String outWarehouse;

    // 备注
    private String remark;

    // 明细列表
    private List<AddDeliveryDetailInput> detailOutputs;

    public String getPurchaseNo() {
        return purchaseNo;
    }

    public void setPurchaseNo(String purchaseNo) {
        this.purchaseNo = purchaseNo;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
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

    public String getOutWarehouse() {
        return outWarehouse;
    }

    public void setOutWarehouse(String outWarehouse) {
        this.outWarehouse = outWarehouse;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public List<AddDeliveryDetailInput> getDetailOutputs() {
        return detailOutputs;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public void setDetailOutputs(List<AddDeliveryDetailInput> detailOutputs) {
        this.detailOutputs = detailOutputs;
    }
}
