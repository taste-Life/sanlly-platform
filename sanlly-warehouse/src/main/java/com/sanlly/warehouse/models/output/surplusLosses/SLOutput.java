package com.sanlly.warehouse.models.output.surplusLosses;

import java.util.List;

/**
 * ClassName: SLOutput
 * Description: 盘盈盘亏输出类
 * date: 2019/10/30 10:51
 *
 * @author zhh
 */
public class SLOutput {
	//主键id
	private Integer wareSurplusLossesId;
	//盘盈盘亏单号
	private String surplusLossesNo;
	//所属场站
	private String yard;
	//国际化所属场站
	private String yardLangLang;
	//所属仓库
	private String warehouse;
	//国际化所属仓库
	private String warehouseLangLang;
	//单据状态
	private String billStatus;
	//国际化单据状态
	private String billStatusLangLang;
	//制单人
	private Integer createUser;
	//制单人姓名
	private String userName;
	//制单时间
	private String createTime;
	//备注
	private String remark;
	//所属公司
	private String company;
	//明细
	private List<SLDetailOutput> detailList;
	public Integer getWareSurplusLossesId() {
		return wareSurplusLossesId;
	}
	public void setWareSurplusLossesId(Integer wareSurplusLossesId) {
		this.wareSurplusLossesId = wareSurplusLossesId;
	}
	public String getSurplusLossesNo() {
		return surplusLossesNo;
	}
	public void setSurplusLossesNo(String surplusLossesNo) {
		this.surplusLossesNo = surplusLossesNo;
	}
	public String getYard() {
		return yard;
	}
	public void setYard(String yard) {
		this.yard = yard;
	}
	public String getYardLangLang() {
		return yardLangLang;
	}
	public void setYardLangLang(String yardLangLang) {
		this.yardLangLang = yardLangLang;
	}
	public String getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}
	public String getBillStatusLangLang() {
		return billStatusLangLang;
	}
	public void setBillStatusLangLang(String billStatusLangLang) {
		this.billStatusLangLang = billStatusLangLang;
	}
	public Integer getCreateUser() {
		return createUser;
	}
	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public List<SLDetailOutput> getDetailList() {
		return detailList;
	}
	public void setDetailList(List<SLDetailOutput> detailList) {
		this.detailList = detailList;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getWarehouseLangLang() {
		return warehouseLangLang;
	}
	public void setWarehouseLangLang(String warehouseLangLang) {
		this.warehouseLangLang = warehouseLangLang;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	

}
