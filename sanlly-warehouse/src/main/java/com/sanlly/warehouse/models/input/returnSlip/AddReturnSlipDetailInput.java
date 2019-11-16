package com.sanlly.warehouse.models.input.returnSlip;

/**
 * ClassName: AddReturnSlipDetailInput
 * Description: 新增退货单明细输入类
 * date: 2019/9/16 9:46
 *
 * @author wannt
 * @since JDK 1.8
 */
public class AddReturnSlipDetailInput {

    // 备件批次
    private String sparePartsBatch;

    // 备件
    private String spareParts;

    // 入库数量
    private Double entryNum;

    // 退货数量
    private Double returnNum;

    public String getSparePartsBatch() {
        return sparePartsBatch;
    }

    public void setSparePartsBatch(String sparePartsBatch) {
        this.sparePartsBatch = sparePartsBatch;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public Double getEntryNum() {
        return entryNum;
    }

    public void setEntryNum(Double entryNum) {
        this.entryNum = entryNum;
    }

    public Double getReturnNum() {
        return returnNum;
    }

    public void setReturnNum(Double returnNum) {
        this.returnNum = returnNum;
    }
}
