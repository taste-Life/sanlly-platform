package com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceReceive;

import java.math.BigDecimal;
import java.util.Date;
/**
 * ClassName: LaborReceiveDetailOutput
 * Description: 劳保申请明细信息输出类
 * date: 2019/8/16 13:51
 *
 * @author zhh
 */
public class LaborReceiveDetailOutput {
	//明细id
	private Integer wareLaborReceiveDetailId;
	//申请单id
	private Integer wareLaborReceive;
	//备件key
	private String spareParts;
	//国际化备件key
	private String sparePartsLangLang;
	private String sparePartsName;
	//备件号
	private String sparePartsNo;
    //型号
    private String model;
    //部门
    private String department;
    private String departmentLangLang;
    //使用人id
    private Integer user;
    //使用人
    private String userName;
    //实际剩余数量
    private Double actualSurplusNum;
    //申请数量
    private Double applicantNum;
    //出库数量
    private Double stockoutNum;
    //剩余出库数量
    private Double surplusNum;
    //已出库数量
    private Double stockoutedNum;
    //单价
    private BigDecimal price;
    //出库状态
    private String stockoutStatus;
    private String stockoutStatusLangLang;

    private String remark;
    //库存数量
    private Double totalNum;
    
    //分配日期
    private String assignDate;
    //上次分配日期
    private String lastAssignDate;
    //预计下次分配日期
    private String afterAssignDate;
    
    private Date createTime;

	public String getSpareParts() {
		return spareParts;
	}

	public void setSpareParts(String spareParts) {
		this.spareParts = spareParts;
	}

	public String getSparePartsLangLang() {
		return sparePartsLangLang;
	}

	public void setSparePartsLangLang(String sparePartsLangLang) {
		this.sparePartsLangLang = sparePartsLangLang;
	}

	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Double getActualSurplusNum() {
		return actualSurplusNum;
	}

	public void setActualSurplusNum(Double actualSurplusNum) {
		this.actualSurplusNum = actualSurplusNum;
	}

	public Double getApplicantNum() {
		return applicantNum;
	}

	public void setApplicantNum(Double applicantNum) {
		this.applicantNum = applicantNum;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getStockoutStatus() {
		return stockoutStatus;
	}

	public void setStockoutStatus(String stockoutStatus) {
		this.stockoutStatus = stockoutStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStockoutStatusLangLang() {
		return stockoutStatusLangLang;
	}

	public void setStockoutStatusLangLang(String stockoutStatusLangLang) {
		this.stockoutStatusLangLang = stockoutStatusLangLang;
	}

	public Integer getWareLaborReceiveDetailId() {
		return wareLaborReceiveDetailId;
	}

	public void setWareLaborReceiveDetailId(Integer wareLaborReceiveDetailId) {
		this.wareLaborReceiveDetailId = wareLaborReceiveDetailId;
	}

	public Integer getWareLaborReceive() {
		return wareLaborReceive;
	}

	public void setWareLaborReceive(Integer wareLaborReceive) {
		this.wareLaborReceive = wareLaborReceive;
	}

	public String getAssignDate() {
		return assignDate;
	}

	public void setAssignDate(String assignDate) {
		this.assignDate = assignDate;
	}

	public String getLastAssignDate() {
		return lastAssignDate;
	}

	public void setLastAssignDate(String lastAssignDate) {
		this.lastAssignDate = lastAssignDate;
	}

	public String getAfterAssignDate() {
		return afterAssignDate;
	}

	public void setAfterAssignDate(String afterAssignDate) {
		this.afterAssignDate = afterAssignDate;
	}

	public Double getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Double totalNum) {
		this.totalNum = totalNum;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public Double getStockoutNum() {
		return stockoutNum;
	}

	public void setStockoutNum(Double stockoutNum) {
		this.stockoutNum = stockoutNum;
	}

	public String getSparePartsName() {
		return sparePartsName;
	}

	public void setSparePartsName(String sparePartsName) {
		this.sparePartsName = sparePartsName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartmentLangLang() {
		return departmentLangLang;
	}

	public void setDepartmentLangLang(String departmentLangLang) {
		this.departmentLangLang = departmentLangLang;
	}

	public Double getStockoutedNum() {
		return stockoutedNum;
	}

	public void setStockoutedNum(Double stockoutedNum) {
		this.stockoutedNum = stockoutedNum;
	}

	public Double getSurplusNum() {
		return surplusNum;
	}

	public void setSurplusNum(Double surplusNum) {
		this.surplusNum = surplusNum;
	}
	
    
}
