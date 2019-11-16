package com.sanlly.finance.models.input;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 新箱费用池 输入类
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年8月26日 下午3:50:02 
* @version V1.0   
 */
public class PoolNewboxInput {
    private Integer id;

    private String orderNo;

    private Integer month;

    private String chillerCompanyName;

    private Integer count;

    private BigDecimal unitPrice;

    private BigDecimal additionalWorkingHours;

    private BigDecimal additionalCharges;

    private BigDecimal orderPrice;

    private String testModem;

    private String installModem;

    private String testGps;

    private String installGps;

    private String state;

    private Date billDate;

    private Integer isFinished;

    private BigDecimal totalPrice;

    private String deptCode;

    private String chargeTypeKey;

    private String remarks;
    
    private String noCostDesc;

    private String freeStatus;

    private Integer itemStatus;

    private String isEnabled;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public String getChillerCompanyName() {
        return chillerCompanyName;
    }

    public void setChillerCompanyName(String chillerCompanyName) {
        this.chillerCompanyName = chillerCompanyName == null ? null : chillerCompanyName.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getAdditionalWorkingHours() {
		return additionalWorkingHours;
	}

	public void setAdditionalWorkingHours(BigDecimal additionalWorkingHours) {
		this.additionalWorkingHours = additionalWorkingHours;
	}

	public BigDecimal getAdditionalCharges() {
		return additionalCharges;
	}

	public void setAdditionalCharges(BigDecimal additionalCharges) {
		this.additionalCharges = additionalCharges;
	}

	public BigDecimal getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(BigDecimal orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getTestModem() {
		return testModem;
	}

	public void setTestModem(String testModem) {
		this.testModem = testModem;
	}

	public String getInstallModem() {
		return installModem;
	}

	public void setInstallModem(String installModem) {
		this.installModem = installModem;
	}

	public String getTestGps() {
		return testGps;
	}

	public void setTestGps(String testGps) {
		this.testGps = testGps;
	}

	public String getInstallGps() {
		return installGps;
	}

	public void setInstallGps(String installGps) {
		this.installGps = installGps;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public Integer getIsFinished() {
		return isFinished;
	}

	public void setIsFinished(Integer isFinished) {
		this.isFinished = isFinished;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getChargeTypeKey() {
		return chargeTypeKey;
	}

	public void setChargeTypeKey(String chargeTypeKey) {
		this.chargeTypeKey = chargeTypeKey;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getNoCostDesc() {
		return noCostDesc;
	}

	public void setNoCostDesc(String noCostDesc) {
		this.noCostDesc = noCostDesc;
	}

	public String getFreeStatus() {
		return freeStatus;
	}

	public void setFreeStatus(String freeStatus) {
		this.freeStatus = freeStatus;
	}

	public Integer getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(Integer itemStatus) {
		this.itemStatus = itemStatus;
	}

	public String getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
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
 
}