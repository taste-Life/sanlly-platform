package com.sanlly.warehouse.models.input.purchaseOrder;

import com.sanlly.common.models.input.PageInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * ClassName: SearchPurchaseOrderInput
 * Description: 查询采购订单输入类
 * date: 2019/8/27 9:48
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("查询采购订单输入类")
public class SearchPurchaseOrderInput extends PageInput {

    public SearchPurchaseOrderInput() {
    }

    public SearchPurchaseOrderInput(Integer pageIndex, Integer pageSize) {
        super(pageIndex, pageSize);
    }

    @ApiModelProperty(name = "purchaseNo",value = "采购订单号")
    private String purchaseNo;

    @ApiModelProperty(name = "no",value = "源单号")
    private String no;

    @ApiModelProperty(name = "intWarehouse",value = "采购仓库")
    private String intWarehouse;

    @ApiModelProperty(name = "isFinish",value = "是否完毕")
    private String isFinish;

    @ApiModelProperty(name = "stockoutStatus",value = "出库状态")
    private String stockoutStatus;

    @ApiModelProperty(name = "startDate",value = "开始时间")
    private Date startDate;

    @ApiModelProperty(name = "endDate",value = "结束时间")
    private Date endDate;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getIntWarehouse() {
        return intWarehouse;
    }

    public void setIntWarehouse(String intWarehouse) {
        this.intWarehouse = intWarehouse;
    }

    public String getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(String isFinish) {
        this.isFinish = isFinish;
    }

    public String getStockoutStatus() {
        return stockoutStatus;
    }

    public void setStockoutStatus(String stockoutStatus) {
        this.stockoutStatus = stockoutStatus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getPurchaseNo() {
        return purchaseNo;
    }

    public void setPurchaseNo(String purchaseNo) {
        this.purchaseNo = purchaseNo;
    }
}
