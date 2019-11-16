package com.sanlly.production.models.output.newContainer;

import java.util.List;

import com.sanlly.production.entity.ContainerOrderDetail;

/**
 * 新箱列表输出类
 * @author zhangkai
 *
 */
public class NewContainerListOutput {

	/*
	 * 新箱订单id
	 */
	private Integer prodContainerOrderId;
	/*
	 * 客户名称
	 */
    private String customerName;
    /*
     * 订单号
     */
    private String orderNo;
    /*
     * 所属月份
     */
    private String month;
    /*
     * 冷机公司
     */
    private String chillerCompanyName;
    /*
     * 数量
     */
    private Integer count;
    /*
     * 单台费用
     */
    private Long unitPrice;
    /*
     * 附加工时
     */
    private Double additionalWorkingHours;
    /*
     * 附加费用
     */
    private Long additionalCharges;
    /*
     * 单据金额
     */
    private Long orderPrice;
    /*
     * 是否测medem
     */
    private String testModem;
    /*
     * 是否装modem
     */
    private String installModem;
    /*
     * 是否测gps
     */
    private String testGps;
    /*
     * 是否装gps
     */
    private String installGps;
    /*
     * 审核状态
     */
    private String stateLang;
    /*
     * 制单日期
     */
    private String billDate;
    /*
     * 完成
     */
    private Integer isFinished;
    /*
     * 收费
     */
    private Long totalPrice;
    /*
     * 备注
     */
    private String remark;
    /*
     * 控制器
     */
    private String control;
    /*
     * 软件版本
     */
    private String softwareVersion;
    /*
     * 订单明细
     */
    private List<NewContainerDetailsOutput> details;
    /*
     * 状态key
     */
    private String stateKey;

	public Integer getProdContainerOrderId() {
		return prodContainerOrderId;
	}

	public void setProdContainerOrderId(Integer prodContainerOrderId) {
		this.prodContainerOrderId = prodContainerOrderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getChillerCompanyName() {
		return chillerCompanyName;
	}

	public void setChillerCompanyName(String chillerCompanyName) {
		this.chillerCompanyName = chillerCompanyName;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Long getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Long unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getAdditionalWorkingHours() {
		return additionalWorkingHours;
	}

	public void setAdditionalWorkingHours(Double additionalWorkingHours) {
		this.additionalWorkingHours = additionalWorkingHours;
	}

	public Long getAdditionalCharges() {
		return additionalCharges;
	}

	public void setAdditionalCharges(Long additionalCharges) {
		this.additionalCharges = additionalCharges;
	}

	public Long getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(Long orderPrice) {
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

	public String getStateLang() {
		return stateLang;
	}

	public void setStateLang(String stateLang) {
		this.stateLang = stateLang;
	}

	public String getBillDate() {
		return billDate;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public Integer getIsFinished() {
		return isFinished;
	}

	public void setIsFinished(Integer isFinished) {
		this.isFinished = isFinished;
	}

	public Long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Long totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getControl() {
		return control;
	}

	public void setControl(String control) {
		this.control = control;
	}

	public String getSoftwareVersion() {
		return softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

	public List<NewContainerDetailsOutput> getDetails() {
		return details;
	}

	public void setDetails(List<NewContainerDetailsOutput> details) {
		this.details = details;
	}

	public String getStateKey() {
		return stateKey;
	}

	public void setStateKey(String stateKey) {
		this.stateKey = stateKey;
	}


	
}
