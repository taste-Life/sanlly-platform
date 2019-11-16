package com.sanlly.warehouse.models.input.stockin;

import com.sanlly.common.models.input.PageInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * ClassName: SearchStockinInput
 * Description: 查询入库单输入类
 * date: 2019/8/2 10:30
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "查询入库单输入类")
public class SearchStockinInput extends PageInput {

    @ApiModelProperty(value = "入库单id",name = "wareStockinId")
    private Integer wareStockinId;

    @ApiModelProperty(value = "入库单号",name = "stockinNo")
    private String stockinNo;

    @ApiModelProperty(value = "入库状态",name = "entryStatus")
    private String entryStatus;

    @ApiModelProperty(value = "开始时间",name = "startTime")
    private Date startTime;

    @ApiModelProperty(value = "结束时间",name = "endTime")
    private Date endTime;

    @ApiModelProperty(value = "供应商",name = "supplierId")
    private String supplierId;

    @ApiModelProperty(value = "单据类型",name = "billType")
    private String billType;

    @ApiModelProperty(value = "审核状态",name = "auditStatus")
    private String auditStatus;

    @ApiModelProperty(value = "源单号",name = "no")
    private String no;

    @ApiModelProperty(value = "备件名称",name = "sparePartsName")
    private String sparePartsName;

    @ApiModelProperty(value = "备件号",name = "sparePartsNo")
    private String sparePartsNo;

    @ApiModelProperty(value = "代管公司",name = "escrowCompany")
    private String escrowCompany;

    @ApiModelProperty(value = "发票类型",name = "invoiceType")
    private String invoiceType;

    @ApiModelProperty(value = "所属仓库",name = "warehouse")
    private String warehouse;

    // 是否退货查询
    private Boolean ofReturn;

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public Boolean getOfReturn() {
        return ofReturn;
    }

    public void setOfReturn(Boolean ofReturn) {
        this.ofReturn = ofReturn;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public SearchStockinInput() {
    }

    public SearchStockinInput(Integer pageIndex, Integer pageSize) {
        super(pageIndex, pageSize);
    }

    public String getStockinNo() {
        return stockinNo;
    }

    public void setStockinNo(String stockinNo) {
        this.stockinNo = stockinNo;
    }

    public String getEntryStatus() {
        return entryStatus;
    }

    public void setEntryStatus(String entryStatus) {
        this.entryStatus = entryStatus;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
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

    public String getSparePartsName() {
        return sparePartsName;
    }

    public void setSparePartsName(String sparePartsName) {
        this.sparePartsName = sparePartsName;
    }

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo;
    }

    public String getEscrowCompany() {
        return escrowCompany;
    }

    public void setEscrowCompany(String escrowCompany) {
        this.escrowCompany = escrowCompany;
    }

    public Integer getWareStockinId() {
        return wareStockinId;
    }

    public void setWareStockinId(Integer wareStockinId) {
        this.wareStockinId = wareStockinId;
    }


}
