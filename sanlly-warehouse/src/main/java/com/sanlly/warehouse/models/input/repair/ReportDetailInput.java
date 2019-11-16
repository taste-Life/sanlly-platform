package com.sanlly.warehouse.models.input.repair;

/**
 * @author lishzh
 */
public class ReportDetailInput {
    private Integer wareReportDetailId;

    private Integer wareRepairReportId;

    private String spareParts;

    private Double num;

    private String remark;

    public Integer getWareReportDetailId() {
        return wareReportDetailId;
    }

    public void setWareReportDetailId(Integer wareReportDetailId) {
        this.wareReportDetailId = wareReportDetailId;
    }

    public Integer getWareRepairReportId() {
        return wareRepairReportId;
    }

    public void setWareRepairReportId(Integer wareRepairReportId) {
        this.wareRepairReportId = wareRepairReportId;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
