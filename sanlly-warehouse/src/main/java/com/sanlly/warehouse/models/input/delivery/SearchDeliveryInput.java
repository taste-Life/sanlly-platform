package com.sanlly.warehouse.models.input.delivery;

import com.sanlly.common.models.input.PageInput;
import io.swagger.annotations.ApiModel;

import java.util.Date;
import java.util.List;

/**
 * ClassName: SearchDeliveryInput
 * Description: 查询送货单输入类
 * date: 2019/9/2 10:37
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel("查询送货单输入类")
public class SearchDeliveryInput extends PageInput {


    // 送货单 id
    private Integer wareDeliverySlipId;

    // 采购订单号
    private String purchaseNo;

    // 送货单号
    private String deliverySlipNo;

    // 源单号
    private String no;

    // 送货状态
    private String deliveryStatus;

    // 物流单号
    private String logisticsNum;

    // 所属公司
    private String company;

    // 开始日期
    private Date startDate;

    // 结束日期
    private Date endDate;

    // 备件名
    private String spareParts;

    // 备件号
    private String sparePartsNo;

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo;
    }

    public SearchDeliveryInput() {
    }

    public SearchDeliveryInput(Integer pageIndex, Integer pageSize) {
        super(pageIndex, pageSize);
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

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getLogisticsNum() {
        return logisticsNum;
    }

    public void setLogisticsNum(String logisticsNum) {
        this.logisticsNum = logisticsNum;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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
}
