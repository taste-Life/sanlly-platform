package com.sanlly.warehouse.models.input.repair;

import com.sanlly.common.models.input.PageInput;

import java.util.Date;

/**
 * @author lishzh
 */
public class SearchRepairInput extends PageInput {

    private Date startDate;//起始时间

    private Date endDate;//结束时间

    private String repairType;//修件类型

    private String isAssign;//是否分配

    private String department;//修理部门

    private String isReceive;//是否接收

    private String company;//所属公司

    private String customer;//客户

    private String isOver;

    private String isOut;

    private String isIn;

    private Integer isDel;

    private String sparePartNo;

    private String sparePartName;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSparePartNo() {
        return sparePartNo;
    }

    public void setSparePartNo(String sparePartNo) {
        this.sparePartNo = sparePartNo;
    }

    public String getSparePartName() {
        return sparePartName;
    }

    public void setSparePartName(String sparePartName) {
        this.sparePartName = sparePartName;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getIsOver() {
        return isOver;
    }

    public void setIsOver(String isOver) {
        this.isOver = isOver;
    }

    public String getIsOut() {
        return isOut;
    }

    public void setIsOut(String isOut) {
        this.isOut = isOut;
    }

    public String getIsIn() {
        return isIn;
    }

    public void setIsIn(String isIn) {
        this.isIn = isIn;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getIsReceive() {
        return isReceive;
    }

    public void setIsReceive(String isReceive) {
        this.isReceive = isReceive;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getIsAssign() {
        return isAssign;
    }

    public void setIsAssign(String isAssign) {
        this.isAssign = isAssign;
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

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    public SearchRepairInput() {
        super();
    }

    public SearchRepairInput(Integer index, Integer size) {
        super(index, size);
    }
}
