package com.sanlly.warehouse.models.output.warehouse;

import java.util.List;

/**
 * ClassName: WarehouseByCompanyOutput
 * Description: 根据公司查询仓库输出类
 * date: 2019/7/25 19:36
 *
 * @author zhh
 */
public class WarehouseByCompanyOutput {
	//仓库key
	private String key;
	//国际化仓库仓库key
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
    //仓库类型
    private List<WarehouseTypeOutput> warehouseTypes;
    
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
	public List<WarehouseTypeOutput> getWarehouseTypes() {
		return warehouseTypes;
	}
	public void setWarehouseTypes(List<WarehouseTypeOutput> warehouseTypes) {
		this.warehouseTypes = warehouseTypes;
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
	public String getWarehouseAddr() {
		return warehouseAddr;
	}
	public void setWarehouseAddr(String warehouseAddr) {
		this.warehouseAddr = warehouseAddr;
	}
	
    
	
}
