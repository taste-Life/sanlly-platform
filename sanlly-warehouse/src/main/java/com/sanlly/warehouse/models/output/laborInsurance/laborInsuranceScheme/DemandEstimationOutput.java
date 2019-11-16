package com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceScheme;

import java.math.BigDecimal;

/**
 * ClassName: DemandEstimationOutput
 * Description: 劳保福利需求预估信息输出类
 * date: 2019/10/08 14:50
 *
 * @author zhh
 */
public class DemandEstimationOutput {
    //备件名称
	private String sparePartsName;
	//备件号
	private String sparePartsNo;
	//备件key
	private String spareParts;
	//备件名称国际化
	private String sparePartsLangLang;
	//型号
	private String model;
	//需求数量
	private Double num;
	//需求总数
	private Double totalNum;
	//部门
	private String department;
	//员工姓名
	private String staffName;
	//单价
	private BigDecimal price;
	//总金额
	private BigDecimal totalAmount;
	//预需求日期
	private String date;
	public String getSparePartsName() {
		return sparePartsName;
	}
	public void setSparePartsName(String sparePartsName) {
		this.sparePartsName = sparePartsName;
	}
	public String getSparePartsNo() {
		return sparePartsNo;
	}
	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}
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
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getNum() {
		return num;
	}
	public void setNum(Double num) {
		this.num = num;
	}
	public Double getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(Double totalNum) {
		this.totalNum = totalNum;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
