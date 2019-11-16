package com.sanlly.warehouse.models.input.stockout;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: EditStockoutInput
 * Description: 修改出库单输入类
 * date: 2019/8/6 14:54
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("修改出库单输入类")
public class EditStockoutInput {

    @ApiModelProperty(value = "出库单id",name = "wareStockoutId")
    private Integer wareStockoutId;

    @ApiModelProperty(value = "研发单号",name = "researchNo")
    private String researchNo;

    @ApiModelProperty(value = "出库状态",name = "stockoutStatus")
    private String stockoutStatus;

    @ApiModelProperty(value = "确认状态",name = "status")
    private String status;

    @ApiModelProperty(value = "是否已传sbs",name = "isStockSbs")
    private String isStockSbs;

    @ApiModelProperty(value = "审核状态",name = "auditStatus")
    private String auditStatus;

    @ApiModelProperty(value = "驳回原因",name = "reasonsRejection")
    private String reasonsRejection;

    @ApiModelProperty(value = "领用部门",name = "receiveDepartment")
    private String receiveDepartment;

    @ApiModelProperty(value = "领用人",name = "receiveUser")
    private String receiveUser;

    public String getResearchNo() {
        return researchNo;
    }

    public void setResearchNo(String researchNo) {
        this.researchNo = researchNo;
    }

    public String getStockoutStatus() {
        return stockoutStatus;
    }

    public void setStockoutStatus(String stockoutStatus) {
        this.stockoutStatus = stockoutStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsStockSbs() {
        return isStockSbs;
    }

    public void setIsStockSbs(String isStockSbs) {
        this.isStockSbs = isStockSbs;
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

    public Integer getWareStockoutId() {
        return wareStockoutId;
    }

    public void setWareStockoutId(Integer wareStockoutId) {
        this.wareStockoutId = wareStockoutId;
    }

    public String getReceiveDepartment() {
        return receiveDepartment;
    }

    public void setReceiveDepartment(String receiveDepartment) {
        this.receiveDepartment = receiveDepartment;
    }

    public String getReceiveUser() {
        return receiveUser;
    }

    public void setReceiveUser(String receiveUser) {
        this.receiveUser = receiveUser;
    }
}
