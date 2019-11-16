package com.sanlly.warehouse.models.output.returnwarehouse;

import java.util.Date;
import java.util.List;

/**
 * ClassName: ReturnWarehouseOutput
 * Description: 退库输出类
 * date: 2019/9/19 19:18
 *
 * @author wannt
 * @since JDK 1.8
 */
public class ReturnWarehouseOutput {
    private Integer wareReturnWarehouseId;

    private String returnNo;

    private String stockoutNo;

    private String no;

    private String billType;

    private Date returnDate;

    private Integer operator;

    private String returnReason;

    private Double returnNum;

    private Date createTime;
    private String createTimeStr;

    private Integer createUser;
    private String createUserStr;

    private Date updateTime;
    private String updateTimeStr;

    private Integer updateUser;
    private String updateUserStr;
    
    private String containerNo;

    private List<ReturnWarehouseDetailOutput> detailOutputList;


    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public String getUpdateTimeStr() {
        return updateTimeStr;
    }

    public void setUpdateTimeStr(String updateTimeStr) {
        this.updateTimeStr = updateTimeStr;
    }

    public String getCreateUserStr() {
        return createUserStr;
    }

    public void setCreateUserStr(String createUserStr) {
        this.createUserStr = createUserStr;
    }

    public String getUpdateUserStr() {
        return updateUserStr;
    }

    public void setUpdateUserStr(String updateUserStr) {
        this.updateUserStr = updateUserStr;
    }

    public List<ReturnWarehouseDetailOutput> getDetailOutputList() {
        return detailOutputList;
    }

    public void setDetailOutputList(List<ReturnWarehouseDetailOutput> detailOutputList) {
        this.detailOutputList = detailOutputList;
    }

    public Integer getWareReturnWarehouseId() {
        return wareReturnWarehouseId;
    }

    public void setWareReturnWarehouseId(Integer wareReturnWarehouseId) {
        this.wareReturnWarehouseId = wareReturnWarehouseId;
    }

    public String getReturnNo() {
        return returnNo;
    }

    public void setReturnNo(String returnNo) {
        this.returnNo = returnNo;
    }

    public String getStockoutNo() {
        return stockoutNo;
    }

    public void setStockoutNo(String stockoutNo) {
        this.stockoutNo = stockoutNo;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
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

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
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

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}
    
}
