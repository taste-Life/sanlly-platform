package com.sanlly.warehouse.models.input.returnSlip;

import java.util.Date;
import java.util.List;

/**
 * ClassName: AddReturnSlipInput
 * Description: 新增退货单输入类
 * date: 2019/9/16 9:45
 *
 * @author wannt
 * @since JDK 1.8
 */
public class AddReturnSlipInput {

    // 源单号
    private String sourceId;

    // 退货单号
    private String returnBillNo;

    // 供应商
    private String supplier;

    // 发票类型
    private String invoiceType;


    private List<AddReturnSlipDetailInput> detailInputList;

    public List<AddReturnSlipDetailInput> getDetailInputList() {
        return detailInputList;
    }

    public void setDetailInputList(List<AddReturnSlipDetailInput> detailInputList) {
        this.detailInputList = detailInputList;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getReturnBillNo() {
        return returnBillNo;
    }

    public void setReturnBillNo(String returnBillNo) {
        this.returnBillNo = returnBillNo;
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
}
