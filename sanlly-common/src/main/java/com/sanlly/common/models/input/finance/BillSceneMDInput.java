package com.sanlly.common.models.input.finance;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 现场收费账单  主明细合体输入类
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年9月3日 下午2:36:54 
* @version V1.0   
 */
public class BillSceneMDInput {
	//箱类别（箱体、机组）
    private String containerCategory;
    //维修代码
    private String repairCode;
    //用箱人
    private String containerUser;
    //第三方费用
    private BigDecimal amount;
    //进场ID
    private String prodCourseId;
    //箱ID
    private String prodContainerId;
    //箱号
    private String containerNo;
    //公司
    private String companyKey;
    //场站
    private String yard;
    //进场类别key，关联进场类别表
    private String courseType;
    //进场时间
    private Date courseTime;
    //估价备注
    private String valuationRemarks;
    //备注
    private String remarks;


	public String getContainerCategory() {
		return containerCategory;
	}
	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}
	public String getRepairCode() {
		return repairCode;
	}
	public void setRepairCode(String repairCode) {
		this.repairCode = repairCode;
	}
	public String getContainerUser() {
		return containerUser;
	}
	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getProdContainerId() {
		return prodContainerId;
	}
	public void setProdContainerId(String prodContainerId) {
		this.prodContainerId = prodContainerId;
	}
	public String getContainerNo() {
		return containerNo;
	}
	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}
	public String getCompanyKey() {
		return companyKey;
	}
	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}
	public String getYard() {
		return yard;
	}
	public void setYard(String yard) {
		this.yard = yard;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public Date getCourseTime() {
		return courseTime;
	}
	public void setCourseTime(Date courseTime) {
		this.courseTime = courseTime;
	}
	public String getValuationRemarks() {
		return valuationRemarks;
	}
	public void setValuationRemarks(String valuationRemarks) {
		this.valuationRemarks = valuationRemarks;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getProdCourseId() {
		return prodCourseId;
	}
	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}


    
	
	
}