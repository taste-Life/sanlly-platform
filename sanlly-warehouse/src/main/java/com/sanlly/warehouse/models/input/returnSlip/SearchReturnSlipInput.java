package com.sanlly.warehouse.models.input.returnSlip;

import com.sanlly.common.models.input.PageInput;

import java.util.Date;

/**
 * ClassName: SearchReturnSlipInput
 * Description: 查询退货单输入类
 * date: 2019/9/16 9:44
 *
 * @author wannt
 * @since JDK 1.8
 */
public class SearchReturnSlipInput extends PageInput {

    public SearchReturnSlipInput() {
    }

    public SearchReturnSlipInput(Integer pageIndex, Integer pageSize) {
        super(pageIndex, pageSize);
    }

    // 退货单ID
    private Integer wareReturnSlipId;

    // 源单号
    private String sourceId;

    // 所属公司
    private String company;

    // 退货单号
    private String returnBillNo;

    // 退货日期
    private Date startDate;
    private Date endDate;

    // 供应商
    private String supplier;

    // 审核状态
    private String auditStatus;

    // 退货状态
    private String returnStatus;

    public Integer getWareReturnSlipId() {
        return wareReturnSlipId;
    }

    public void setWareReturnSlipId(Integer wareReturnSlipId) {
        this.wareReturnSlipId = wareReturnSlipId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getReturnBillNo() {
        return returnBillNo;
    }

    public void setReturnBillNo(String returnBillNo) {
        this.returnBillNo = returnBillNo;
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

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }
}
