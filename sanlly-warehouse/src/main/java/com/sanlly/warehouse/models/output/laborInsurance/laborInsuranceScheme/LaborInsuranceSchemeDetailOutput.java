package com.sanlly.warehouse.models.output.laborInsurance.laborInsuranceScheme;
/**
 * ClassName: LaborInsuranceSchemeDetailOutput
 * Description: 劳保方案明细信息输出类
 * date: 2019/8/12 10:50
 *
 * @author zhh
 */
public class LaborInsuranceSchemeDetailOutput {
	//劳保方案key
	private String wareLaborInsurance;
	//国际化劳保方案key
	private String warehouseInsuranceLangLang;
	//备件key
	private String spareParts;
	//国际化备件key
	private String sparePartsLangLang;
	//备件号
	private String sparePartsNo;
    //备件名称
    private String sparePartsName;
    //备件名称英文
    private String sparePartsNameEn;
    //首次分配数量
    private Double firstNum;
    //周期使用期限
    private Integer cycleTerm;
    //首次使用期限
    private Integer firstTerm;
    //周期分配数量
    private Double cycleNum;
    //备注
    private String remark;
    
	public String getWareLaborInsurance() {
		return wareLaborInsurance;
	}
	public void setWareLaborInsurance(String wareLaborInsurance) {
		this.wareLaborInsurance = wareLaborInsurance;
	}
	public String getWarehouseInsuranceLangLang() {
		return warehouseInsuranceLangLang;
	}
	public void setWarehouseInsuranceLangLang(String warehouseInsuranceLangLang) {
		this.warehouseInsuranceLangLang = warehouseInsuranceLangLang;
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
	public String getSparePartsNo() {
		return sparePartsNo;
	}
	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}
	public String getSparePartsName() {
		return sparePartsName;
	}
	public void setSparePartsName(String sparePartsName) {
		this.sparePartsName = sparePartsName;
	}
	public String getSparePartsNameEn() {
		return sparePartsNameEn;
	}
	public void setSparePartsNameEn(String sparePartsNameEn) {
		this.sparePartsNameEn = sparePartsNameEn;
	}
	public Double getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(Double firstNum) {
		this.firstNum = firstNum;
	}
	public Integer getCycleTerm() {
		return cycleTerm;
	}
	public void setCycleTerm(Integer cycleTerm) {
		this.cycleTerm = cycleTerm;
	}
	public Integer getFirstTerm() {
		return firstTerm;
	}
	public void setFirstTerm(Integer firstTerm) {
		this.firstTerm = firstTerm;
	}
	public Double getCycleNum() {
		return cycleNum;
	}
	public void setCycleNum(Double cycleNum) {
		this.cycleNum = cycleNum;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	
}
