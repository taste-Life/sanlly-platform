package com.sanlly.warehouse.models.output.returnwarehouse;

import java.util.Date;

/**
 * ClassName: ReturnWarehouseDetailOutput
 * Description: 退库明细输出类
 * date: 2019/9/19 19:18
 *
 * @author wannt
 * @since JDK 1.8
 */
public class ReturnWarehouseDetailOutput {

    private Integer wareReturnWarehouseDetailId;

    private Integer returnId;

    private Date returnDate;

    private Integer operator;

    private String spareParts;
    private String sparePartsLangLang;
    private String sparePartsNo;

    private Double returnNum;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String sparePartsBatch;

    public String getSparePartsLangLang() {
        return sparePartsLangLang;
    }

    public void setSparePartsLangLang(String sparePartsLangLang) {
        this.sparePartsLangLang = sparePartsLangLang;
    }

    public Integer getWareReturnWarehouseDetailId() {
        return wareReturnWarehouseDetailId;
    }

    public void setWareReturnWarehouseDetailId(Integer wareReturnWarehouseDetailId) {
        this.wareReturnWarehouseDetailId = wareReturnWarehouseDetailId;
    }

    public Integer getReturnId() {
        return returnId;
    }

    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts;
    }

    public Double getReturnNum() {
        return returnNum;
    }

    public void setReturnNum(Double returnNum) {
        this.returnNum = returnNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public String getSparePartsBatch() {
        return sparePartsBatch;
    }

    public void setSparePartsBatch(String sparePartsBatch) {
        this.sparePartsBatch = sparePartsBatch;
    }

	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}
    
}
