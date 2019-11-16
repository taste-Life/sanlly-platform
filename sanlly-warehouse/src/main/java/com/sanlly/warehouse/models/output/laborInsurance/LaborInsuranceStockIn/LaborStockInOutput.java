package com.sanlly.warehouse.models.output.laborInsurance.LaborInsuranceStockIn;

import java.math.BigDecimal;
import java.util.List;
/**
 * ClassName: LaborStockInOutput
 * Description: 入库单输出类
 * date: 2019/8/26 10:30
 *
 * @author zhh
 */
public class LaborStockInOutput {
	//入库单id
	private Integer wareStockinLabaorId;
	//所属仓库
	private String warehouse;
	//国际化仓库key
	private String warehouseNameLang;
	//入库单号
	private String labaorStockinNo;
	//审核状态
	private String auditStatus;
	//国际化审核状态
	private String auditStatusLangLang;
	//入库状态
	private String entryStatus;
	//国际化入库状态
	private String entryStatusLangLang;
	//所属公司
	private String company;
	//国际化公司key
	private String companyNameLang;
	//入库日期
	private String StockinDate;
	//供应商
	private String supplier;
	//供应商名称
	private String supplierNameLang;
	//总金额
	private BigDecimal totalAmount;
	//入库单明细
	private List<LaborStockInDetailOutput> detailList;

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String getLabaorStockinNo() {
		return labaorStockinNo;
	}

	public void setLabaorStockinNo(String labaorStockinNo) {
		this.labaorStockinNo = labaorStockinNo;
	}

	public String getStockinDate() {
		return StockinDate;
	}

	public void setStockinDate(String stockinDate) {
		StockinDate = stockinDate;
	}

	public String getWarehouseNameLang() {
		return warehouseNameLang;
	}

	public void setWarehouseNameLang(String warehouseNameLang) {
		this.warehouseNameLang = warehouseNameLang;
	}

	public Integer getWareStockinLabaorId() {
		return wareStockinLabaorId;
	}

	public void setWareStockinLabaorId(Integer wareStockinLabaorId) {
		this.wareStockinLabaorId = wareStockinLabaorId;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getEntryStatus() {
		return entryStatus;
	}

	public void setEntryStatus(String entryStatus) {
		this.entryStatus = entryStatus;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompanyNameLang() {
		return companyNameLang;
	}

	public void setCompanyNameLang(String companyNameLang) {
		this.companyNameLang = companyNameLang;
	}

	public List<LaborStockInDetailOutput> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<LaborStockInDetailOutput> detailList) {
		this.detailList = detailList;
	}

	public String getAuditStatusLangLang() {
		return auditStatusLangLang;
	}

	public void setAuditStatusLangLang(String auditStatusLangLang) {
		this.auditStatusLangLang = auditStatusLangLang;
	}

	public String getEntryStatusLangLang() {
		return entryStatusLangLang;
	}

	public void setEntryStatusLangLang(String entryStatusLangLang) {
		this.entryStatusLangLang = entryStatusLangLang;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getSupplierNameLang() {
		return supplierNameLang;
	}

	public void setSupplierNameLang(String supplierNameLang) {
		this.supplierNameLang = supplierNameLang;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	
    
}
