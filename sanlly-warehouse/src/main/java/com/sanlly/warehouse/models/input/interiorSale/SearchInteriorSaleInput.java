package com.sanlly.warehouse.models.input.interiorSale;

import com.sanlly.common.models.input.PageInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * ClassName: SearchInteriorSaleInput
 * Description: 内部销售查询输入类
 * date: 2019/8/22 13:43
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("内部销售查询输入类")
public class SearchInteriorSaleInput extends PageInput {

    @ApiModelProperty(value = "采购单号",name = "purchasingOrderNo")
    private String purchasingOrderNo;

    @ApiModelProperty(value = "单据类型",name = "billType")
    private String billType;

    @ApiModelProperty(value = "结束时间",name = "endDate")
    private Date endDate;

    @ApiModelProperty(value = "开始时间",name = "startDate")
    private Date startDate;

    @ApiModelProperty(value = "采购仓库",name = "intWarehouse")
    private String intWarehouse;

    @ApiModelProperty(value = "所属仓库",name = "outWarehouse")
    private String outWarehouse;

    @ApiModelProperty(value = "审核状态",name = "auditStatus")
    private String auditStatus;

    public SearchInteriorSaleInput() {
    }

    public SearchInteriorSaleInput(Integer pageIndex, Integer pageSize) {
        super(pageIndex, pageSize);
    }

    public String getPurchasingOrderNo() {
        return purchasingOrderNo;
    }

    public void setPurchasingOrderNo(String purchasingOrderNo) {
        this.purchasingOrderNo = purchasingOrderNo;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }
}
