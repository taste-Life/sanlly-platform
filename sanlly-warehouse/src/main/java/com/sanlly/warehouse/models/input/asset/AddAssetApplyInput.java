package com.sanlly.warehouse.models.input.asset;

import java.util.Date;

/**
 * ClassName: AddAssetApplyInput
 * Description: 添加资产领用，调拨，报废申请共用输入类
 * date: 2019/10/9 17:51
 *
 * @author zhh
 */
public class AddAssetApplyInput {
	private Integer assetManageId;
	
	private String company;

    private String applyType;

    private String applyDepartment;

    private Integer applyUser;

    private Date applyDate;

    private Integer oldUser;

    private Integer newUser;

    private String newDepartment;

    private String oldDepartment;

    private String scrapReson;

    private String asset;

    private Double applyNum;

    private String remark;

    private String reasonsRejection;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getApplyType() {
		return applyType;
	}

	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public String getApplyDepartment() {
		return applyDepartment;
	}

	public void setApplyDepartment(String applyDepartment) {
		this.applyDepartment = applyDepartment;
	}

	public Integer getApplyUser() {
		return applyUser;
	}

	public void setApplyUser(Integer applyUser) {
		this.applyUser = applyUser;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public Integer getOldUser() {
		return oldUser;
	}

	public void setOldUser(Integer oldUser) {
		this.oldUser = oldUser;
	}

	public Integer getNewUser() {
		return newUser;
	}

	public void setNewUser(Integer newUser) {
		this.newUser = newUser;
	}

	public String getNewDepartment() {
		return newDepartment;
	}

	public void setNewDepartment(String newDepartment) {
		this.newDepartment = newDepartment;
	}

	public String getOldDepartment() {
		return oldDepartment;
	}

	public void setOldDepartment(String oldDepartment) {
		this.oldDepartment = oldDepartment;
	}

	public String getScrapReson() {
		return scrapReson;
	}

	public void setScrapReson(String scrapReson) {
		this.scrapReson = scrapReson;
	}

	public String getAsset() {
		return asset;
	}

	public void setAsset(String asset) {
		this.asset = asset;
	}

	public Double getApplyNum() {
		return applyNum;
	}

	public void setApplyNum(Double applyNum) {
		this.applyNum = applyNum;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getReasonsRejection() {
		return reasonsRejection;
	}

	public void setReasonsRejection(String reasonsRejection) {
		this.reasonsRejection = reasonsRejection;
	}

	public Integer getAssetManageId() {
		return assetManageId;
	}

	public void setAssetManageId(Integer assetManageId) {
		this.assetManageId = assetManageId;
	}

	
    
}
