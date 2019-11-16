package com.sanlly.warehouse.models.input.stockin;

import com.sanlly.common.models.output.pagination.PagedList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: AddStockinInput
 * Description: 新增入库单输入类
 * date: 2019/8/2 10:30
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "新增入库单输入类")
public class AddStockinInput {

    @ApiModelProperty(value = "源单号",name = "no")
    private String no;

    @ApiModelProperty(value = "源单据类型",name = "billType")
    private String billType;

    @ApiModelProperty(value = "所属公司",name = "company")
    private String company;

    @ApiModelProperty(value = "所属代管公司",name = "escrowCompany")
    private String escrowCompany;

    @ApiModelProperty(value = "入库仓库",name = "entryWarehouse")
    private String entryWarehouse;

    @ApiModelProperty(value = "入库状态",name = "entryStatus")
    private String entryStatus;

    @ApiModelProperty(value = "供应商",name = "supplierId")
    private String supplierId;

    @ApiModelProperty(value = "单据总金额",name = "billTotalAmount")
    private BigDecimal billTotalAmount;

    @ApiModelProperty(value = "发票类型",name = "invoiceType")
    private String invoiceType;

    @ApiModelProperty(value = "物流公司",name = "logisticsCompany")
    private String logisticsCompany;

    @ApiModelProperty(value = "总金额",name = "totalAmount")
    private BigDecimal totalAmount;

    @ApiModelProperty(value = "关税",name = "tariff")
    private BigDecimal tariff;

    @ApiModelProperty(value = "增值税",name = "vat")
    private BigDecimal vat;

    @ApiModelProperty(value = "运费",name = "freight")
    private BigDecimal freight;

    @ApiModelProperty(value = "已入库数量",name = "entryedNum")
    private Double entryedNum;

    @ApiModelProperty(value = "仓库类型",name = "warehouseType")
    private String warehouseType;

    @ApiModelProperty(value = "入库单明细列表",name = "stockinDetail")
    private AddStockinDetailInput[] stockinDetail;

    @ApiModelProperty(value = "备注",name = "remark")
    private String remark;

    @ApiModelProperty(value = "图片",name = "")
    private String image;

    @ApiModelProperty(value = "审核状态",name = "auditStatus")
    private String auditStatus;
	// 采购人
    private Integer purchaseUserId;
    // 币种
    private String currency;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEntryWarehouse() {
        return entryWarehouse;
    }

    public void setEntryWarehouse(String entryWarehouse) {
        this.entryWarehouse = entryWarehouse;
    }

    public String getEntryStatus() {
        return entryStatus;
    }

    public void setEntryStatus(String entryStatus) {
        this.entryStatus = entryStatus;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public BigDecimal getBillTotalAmount() {
        return billTotalAmount;
    }

    public void setBillTotalAmount(BigDecimal billTotalAmount) {
        this.billTotalAmount = billTotalAmount;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
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

    public Double getEntryedNum() {
        return entryedNum;
    }

    public void setEntryedNum(Double entryedNum) {
        this.entryedNum = entryedNum;
    }

    public AddStockinDetailInput[] getStockinDetail() {
        return stockinDetail;
    }

    public void setStockinDetail(AddStockinDetailInput[] stockinDetail) {
        this.stockinDetail = stockinDetail;
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getEscrowCompany() {
        return escrowCompany;
    }

    public void setEscrowCompany(String escrowCompany) {
        this.escrowCompany = escrowCompany;
    }
    

    public Integer getPurchaseUserId() {
		return purchaseUserId;
	}

	public void setPurchaseUserId(Integer purchaseUserId) {
		this.purchaseUserId = purchaseUserId;
	}
	

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
    public String toString() {
        return "AddStockinInput{" +
                "no='" + no + '\'' +
                ", billType='" + billType + '\'' +
                ", company='" + company + '\'' +
                ", escrowCompany='" + escrowCompany + '\'' +
                ", entryWarehouse='" + entryWarehouse + '\'' +
                ", entryStatus='" + entryStatus + '\'' +
                ", supplierId='" + supplierId + '\'' +
                ", billTotalAmount=" + billTotalAmount +
                ", invoiceType='" + invoiceType + '\'' +
                ", logisticsCompany='" + logisticsCompany + '\'' +
                ", totalAmount=" + totalAmount +
                ", tariff=" + tariff +
                ", vat=" + vat +
                ", freight=" + freight +
                ", entryedNum=" + entryedNum +
                ", warehouseType='" + warehouseType + '\'' +
                ", stockinDetail=" + Arrays.toString(stockinDetail) +
                ", remark='" + remark + '\'' +
                '}';
    }
}
