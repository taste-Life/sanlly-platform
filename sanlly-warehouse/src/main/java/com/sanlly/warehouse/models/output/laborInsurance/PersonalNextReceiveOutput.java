package com.sanlly.warehouse.models.output.laborInsurance;
/**
 * ClassName: PersonalNextReceiveOutput
 * Description: 个人劳保下期可领用输出类
 * date: 2019/9/19 13:58
 *
 * @author zhh
 * @since JDK 1.8
 */
public class PersonalNextReceiveOutput {

    private String sparePartsNo;
	
	private String spareParts;
	
	private String sparePartsNameLang;
	
	private String model;
	
    private Double assignNum;
	
    private String assignDate;

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

	public String getSparePartsNameLang() {
		return sparePartsNameLang;
	}

	public void setSparePartsNameLang(String sparePartsNameLang) {
		this.sparePartsNameLang = sparePartsNameLang;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getAssignNum() {
		return assignNum;
	}

	public void setAssignNum(Double assignNum) {
		this.assignNum = assignNum;
	}

	public String getAssignDate() {
		return assignDate;
	}

	public void setAssignDate(String assignDate) {
		this.assignDate = assignDate;
	}
    
    
}
