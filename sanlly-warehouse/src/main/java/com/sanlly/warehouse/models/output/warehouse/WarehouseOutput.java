package com.sanlly.warehouse.models.output.warehouse;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * ClassName: WarehouseOutput
 * Description: 仓库信息输出类
 * date: 2019/7/25 17:51
 *
 * @author zhh
 */
public class WarehouseOutput{
	//仓库key
	private String key;
	//国际化仓库key
	private String keyLangLang;
	//仓库名称
	private String warehouseName;
	//仓库英文名称
	private String warehouseNameEn;
	//仓库地址
    private String warehouseAddr;

    //公司key
    private String company;
    //国际化公司key
    private String companyLangLang;
    //公司名称
    private String companyName;
    //公司英文名称
    private String companyNameEn;
    //是否锁库
    private String warehouseStatus;
    //是否锁库
    private String warehouseStatusLangLang;
    // 锁库时间	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date lockTime;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getKeyLangLang() {
		return keyLangLang;
	}

	public void setKeyLangLang(String keyLangLang) {
		this.keyLangLang = keyLangLang;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getWarehouseNameEn() {
		return warehouseNameEn;
	}

	public void setWarehouseNameEn(String warehouseNameEn) {
		this.warehouseNameEn = warehouseNameEn;
	}

	public String getWarehouseAddr() {
		return warehouseAddr;
	}

	public void setWarehouseAddr(String warehouseAddr) {
		this.warehouseAddr = warehouseAddr;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompanyLangLang() {
		return companyLangLang;
	}

	public void setCompanyLangLang(String companyLangLang) {
		this.companyLangLang = companyLangLang;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyNameEn() {
		return companyNameEn;
	}

	public void setCompanyNameEn(String companyNameEn) {
		this.companyNameEn = companyNameEn;
	}

	public String getWarehouseStatus() {
		return warehouseStatus;
	}

	public void setWarehouseStatus(String warehouseStatus) {
		this.warehouseStatus = warehouseStatus;
	}

	public String getWarehouseStatusLangLang() {
		return warehouseStatusLangLang;
	}

	public void setWarehouseStatusLangLang(String warehouseStatusLangLang) {
		this.warehouseStatusLangLang = warehouseStatusLangLang;
	}

	public Date getLockTime() {
		return lockTime;
	}

	public void setLockTime(Date lockTime) {
		this.lockTime = lockTime;
	}
    
	
}
