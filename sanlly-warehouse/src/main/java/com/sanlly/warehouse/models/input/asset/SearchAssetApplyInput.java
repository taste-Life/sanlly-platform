package com.sanlly.warehouse.models.input.asset;

import java.util.Date;

import com.sanlly.common.models.input.PageInput;

/**
 * ClassName: SearchAssetApplyInput
 * Description: 查询资产申请输入类
 * date: 2019/10/16 17:51
 *
 * @author zhh
 */
public class SearchAssetApplyInput extends PageInput{

	private String assetApplyNo;
	
	private String applyType;
	
	private Date applyDate;
	
	private String auditStatus;

	public String getAssetApplyNo() {
		return assetApplyNo;
	}

	public void setAssetApplyNo(String assetApplyNo) {
		this.assetApplyNo = assetApplyNo;
	}

	public String getApplyType() {
		return applyType;
	}

	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public SearchAssetApplyInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SearchAssetApplyInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
		// TODO Auto-generated constructor stub
	}
	
	
}
