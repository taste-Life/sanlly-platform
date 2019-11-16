package com.sanlly.warehouse.models.input.asset;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName: AddAssetInput
 * Description: 添加资产输入类
 * date: 2019/10/9 17:51
 *
 * @author zhh
 */
public class AddAssetInput {
	//所属公司
    private String company;
    //所属部门
    private String departments;
    private String departmentsName;
    //账外资产类别
    private String outAssetType;
    //责任人
    private Integer liablePerson;
    //所属场站
    private String yard;
    //使用地点
    private String place;
    //资产
    private String asset;
    //资产编号
    private String assetNo;
    //资产名称
    private String assetName;
    //序列号
    private String serial;
    //型号
    private String model;
    //生产厂商
    private String manufacturer;
    //名称
    private String name;
    //数量
    private Double num;
    //Windows版本
    private String windowsModel;
    //计算机名称
    private String computerName;
    //IP地址
    private String ipAddr;
    //购买价格
    private BigDecimal purchasePrice;
    //购买日期
    private Date purchaseDate;
    //报废日期
    private Date scrapDate;
    //使用状态
    private String useStatus;
    //备注
    private String remark;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepartments() {
		return departments;
	}
	public void setDepartments(String departments) {
		this.departments = departments;
	}
	public String getOutAssetType() {
		return outAssetType;
	}
	public void setOutAssetType(String outAssetType) {
		this.outAssetType = outAssetType;
	}
	public Integer getLiablePerson() {
		return liablePerson;
	}
	public void setLiablePerson(Integer liablePerson) {
		this.liablePerson = liablePerson;
	}
	public String getYard() {
		return yard;
	}
	public void setYard(String yard) {
		this.yard = yard;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAssetNo() {
		return assetNo;
	}
	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getNum() {
		return num;
	}
	public void setNum(Double num) {
		this.num = num;
	}
	public String getWindowsModel() {
		return windowsModel;
	}
	public void setWindowsModel(String windowsModel) {
		this.windowsModel = windowsModel;
	}
	public String getComputerName() {
		return computerName;
	}
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	public String getIpAddr() {
		return ipAddr;
	}
	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}
	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public Date getScrapDate() {
		return scrapDate;
	}
	public void setScrapDate(Date scrapDate) {
		this.scrapDate = scrapDate;
	}
	public String getUseStatus() {
		return useStatus;
	}
	public void setUseStatus(String useStatus) {
		this.useStatus = useStatus;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getAsset() {
		return asset;
	}
	public void setAsset(String asset) {
		this.asset = asset;
	}
	public String getDepartmentsName() {
		return departmentsName;
	}
	public void setDepartmentsName(String departmentsName) {
		this.departmentsName = departmentsName;
	}
    

}
