package com.sanlly.warehouse.models.input.interiorSale;

import com.sanlly.warehouse.models.output.interiorSale.InteriorSaleDetailOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * ClassName: EditInteriorSaleInput
 * Description: 修改内部销售输入类
 * date: 2019/8/22 13:46
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("修改内部销售输入类")
public class EditInteriorSaleInput {

    @ApiModelProperty(value = "内部销售单ID",name = "wareInternalProcurementId")
    private Integer wareInternalProcurementId;

    @ApiModelProperty(value = "采购单号",name = "purchasingOrderNo")
    private String purchasingOrderNo;

    @ApiModelProperty(value = "申请人",name = "applicantUser")
    private Integer applicantUser;

    @ApiModelProperty(value = "申请时间",name = "applicantDate")
    private String applicantDate;

    @ApiModelProperty(value = "收费状态",name = "chargeStatus")
    private String chargeStatus;

    @ApiModelProperty(value = "收货地址",name = "receivingAddress")
    private String receivingAddress;

    @ApiModelProperty(value = "收货人",name = "receivingUser")
    private String receivingUser;

    @ApiModelProperty(value = "采购仓库",name = "intWarehouse")
    private String intWarehouse;

    @ApiModelProperty(value = "所属公司",name = "company")
    private String company;

    @ApiModelProperty(value = "所属仓库",name = "outWarehouse")
    private String outWarehouse;

    @ApiModelProperty(value = "客户名称",name = "customerName")
    private String customerName;

    @ApiModelProperty(value = "状态",name = "status")
    private String status;

    @ApiModelProperty(value = "审核状态",name = "auditStatus")
    private String auditStatus;

    @ApiModelProperty(value = "驳回原因",name = "reasonsRejection")
    private String reasonsRejection;

    @ApiModelProperty(value = "备注",name = "remark")
    private String remark;

    @ApiModelProperty(value = "内部采购详细",name = "interiordetail")
    private EditInteriorSaleDetailInput[] interiordetail;


    public Integer getWareInternalProcurementId() {
        return wareInternalProcurementId;
    }

    public void setWareInternalProcurementId(Integer wareInternalProcurementId) {
        this.wareInternalProcurementId = wareInternalProcurementId;
    }

    public String getPurchasingOrderNo() {
        return purchasingOrderNo;
    }

    public void setPurchasingOrderNo(String purchasingOrderNo) {
        this.purchasingOrderNo = purchasingOrderNo;
    }

    public Integer getApplicantUser() {
        return applicantUser;
    }

    public void setApplicantUser(Integer applicantUser) {
        this.applicantUser = applicantUser;
    }

    public String getApplicantDate() {
        return applicantDate;
    }

    public void setApplicantDate(String applicantDate) {
        this.applicantDate = applicantDate;
    }

    public String getChargeStatus() {
        return chargeStatus;
    }

    public void setChargeStatus(String chargeStatus) {
        this.chargeStatus = chargeStatus;
    }

    public String getReceivingAddress() {
        return receivingAddress;
    }

    public void setReceivingAddress(String receivingAddress) {
        this.receivingAddress = receivingAddress;
    }

    public String getReceivingUser() {
        return receivingUser;
    }

    public void setReceivingUser(String receivingUser) {
        this.receivingUser = receivingUser;
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getReasonsRejection() {
        return reasonsRejection;
    }

    public void setReasonsRejection(String reasonsRejection) {
        this.reasonsRejection = reasonsRejection;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public EditInteriorSaleDetailInput[] getInteriordetail() {
        return interiordetail;
    }

    public void setInteriordetail(EditInteriorSaleDetailInput[] interiordetail) {
        this.interiordetail = interiordetail;
    }
}
