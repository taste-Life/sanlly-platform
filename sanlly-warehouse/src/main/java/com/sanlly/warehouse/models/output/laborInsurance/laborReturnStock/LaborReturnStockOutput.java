package com.sanlly.warehouse.models.output.laborInsurance.laborReturnStock;

import java.util.Date;
import java.util.List;


/**
 * ClassName: LaborReturnStockOutput
 * Description: 退库单输出类
 * date: 2019/9/17 10:38
 *
 * @author zhh
 * 
 */
public class LaborReturnStockOutput {
	private Integer wareReturnWarehouseLaborId;
	
	private String returnNo;
	
	private String stockoutNo;

	private String returnReason;

	private String user;

	private String returnDate;
	
	private String auditStatus;
	
	private String auditStatusLangLang;

	List<LaborReturnStockDetailOutput> details;

	public String getStockoutNo() {
		return stockoutNo;
	}

	public void setStockoutNo(String stockoutNo) {
		this.stockoutNo = stockoutNo;
	}

	public String getReturnReason() {
		return returnReason;
	}

	public void setReturnReason(String returnReason) {
		this.returnReason = returnReason;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getAuditStatusLangLang() {
		return auditStatusLangLang;
	}

	public void setAuditStatusLangLang(String auditStatusLangLang) {
		this.auditStatusLangLang = auditStatusLangLang;
	}

	public String getReturnNo() {
		return returnNo;
	}

	public void setReturnNo(String returnNo) {
		this.returnNo = returnNo;
	}

	public List<LaborReturnStockDetailOutput> getDetails() {
		return details;
	}

	public void setDetails(List<LaborReturnStockDetailOutput> details) {
		this.details = details;
	}

	public Integer getWareReturnWarehouseLaborId() {
		return wareReturnWarehouseLaborId;
	}

	public void setWareReturnWarehouseLaborId(Integer wareReturnWarehouseLaborId) {
		this.wareReturnWarehouseLaborId = wareReturnWarehouseLaborId;
	}

	


}
