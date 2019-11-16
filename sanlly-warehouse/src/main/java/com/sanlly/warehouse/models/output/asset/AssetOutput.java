package com.sanlly.warehouse.models.output.asset;

import java.math.BigDecimal;

/**
 * ClassName: AssetOutput
 * Description: 资产输出类
 * date: 2019/10/9 17:51
 *
 * @author zhh
 */
public class AssetOutput {
	//主键
	private Integer wareAssetManagementId;
	//所属公司
    private String company;
    //国际化所属公司
    private String companyNameLang;
    //所属部门
    private String departments;
    //国际化部门
    private String departmentsNameLang;
    //账外资产类别
    private String outAssetType;
    //国际化资产类别
    private String outAssetTypeNameLang;
    //责任人
    private Integer liablePerson;
    //责任人姓名
    private String liablePersonName;
    //使用人
    private Integer user;
    //使用人姓名
    private String userName;
    //所属场站
    private String yard;
    //国际化场站
    private String yardNameLang;
    //使用地点
    private String place;
    //资产编号
    private String assetNo;
    //资产
    private String asset;
    //资产名称
    private String assetName;
    //国际化资产名称
    private String assetNameLangLang;
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
    private String purchaseDate;
    //报废日期
    private String scrapDate;
    //使用状态
    private String useStatus;
    //国际化使用状态
    private String useStatusNameLang;
    //领用日期
    private String applyDate;
    //备注
    private String remark;
    
	public Integer getWareAssetManagementId() {
		return wareAssetManagementId;
	}
	public void setWareAssetManagementId(Integer wareAssetManagementId) {
		this.wareAssetManagementId = wareAssetManagementId;
	}
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
    
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getScrapDate() {
		return scrapDate;
	}
	public void setScrapDate(String scrapDate) {
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
	public String getCompanyNameLang() {
		return companyNameLang;
	}
	public void setCompanyNameLang(String companyNameLang) {
		this.companyNameLang = companyNameLang;
	}
	public String getDepartmentsNameLang() {
		return departmentsNameLang;
	}
	public void setDepartmentsNameLang(String departmentsNameLang) {
		this.departmentsNameLang = departmentsNameLang;
	}
	public String getOutAssetTypeNameLang() {
		return outAssetTypeNameLang;
	}
	public void setOutAssetTypeNameLang(String outAssetTypeNameLang) {
		this.outAssetTypeNameLang = outAssetTypeNameLang;
	}
	public String getLiablePersonName() {
		return liablePersonName;
	}
	public void setLiablePersonName(String liablePersonName) {
		this.liablePersonName = liablePersonName;
	}
	public String getYardNameLang() {
		return yardNameLang;
	}
	public void setYardNameLang(String yardNameLang) {
		this.yardNameLang = yardNameLang;
	}
	public String getUseStatusNameLang() {
		return useStatusNameLang;
	}
	public void setUseStatusNameLang(String useStatusNameLang) {
		this.useStatusNameLang = useStatusNameLang;
	}
	public String getAssetNameLangLang() {
		return assetNameLangLang;
	}
	public void setAssetNameLangLang(String assetNameLangLang) {
		this.assetNameLangLang = assetNameLangLang;
	}
	public String getAsset() {
		return asset;
	}
	public void setAsset(String asset) {
		this.asset = asset;
	}
	public Integer getUser() {
		return user;
	}
	public void setUser(Integer user) {
		this.user = user;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}
    
    

}
