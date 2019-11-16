package com.sanlly.warehouse.models.input.delivery;

import com.sanlly.warehouse.models.output.delivery.DeliveryDetailOutput;
import io.swagger.annotations.ApiModel;

import java.util.Date;
import java.util.List;

/**
 * ClassName: EditDeliveryInput
 * Description: 修改送货单输入类
 * date: 2019/9/2 10:39
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("修改送货单输入类")
public class EditDeliveryInput {

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

    // 供应商
    private String supplier;

    // 发票类型
    private String invoiceType;

    // 送货状态
    private String deliveryStatus;

    // 送货数量
    private Double deliveryNum;

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

    // 所属公司
    private String company;

    // 出库仓库
    private String outWarehouse;

    // 备注
    private String remark;

    // 明细列表
    private List<EditDeliveryDetailInput> detailOutputs;

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

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public List<EditDeliveryDetailInput> getDetailOutputs() {
        return detailOutputs;
    }

    public void setDetailOutputs(List<EditDeliveryDetailInput> detailOutputs) {
        this.detailOutputs = detailOutputs;
    }
}
