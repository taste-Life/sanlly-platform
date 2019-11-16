package com.sanlly.warehouse.models.output.asset;

import java.util.Date;

/**
 * ClassName: AssetApplyOutput
 * Description: 资产申请信息输出类
 * date: 2019/10/16 17:51
 *
 * @author zhh
 */
public class AssetApplyOutput {

	private Integer wareAssetApplyId;
	
    private String assetApplyNo;
	
	private String applyType;
	private String applyTypeNameLang;
	
	private String applyDate;
	
	private String auditStatus;
	
	private String auditStatusNameLang;

	public Integer getWareAssetApplyId() {
		return wareAssetApplyId;
	}

	public void setWareAssetApplyId(Integer wareAssetApplyId) {
		this.wareAssetApplyId = wareAssetApplyId;
	}

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

	

	public String getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getApplyTypeNameLang() {
		return applyTypeNameLang;
	}

	public void setApplyTypeNameLang(String applyTypeNameLang) {
		this.applyTypeNameLang = applyTypeNameLang;
	}

	public String getAuditStatusNameLang() {
		return auditStatusNameLang;
	}

	public void setAuditStatusNameLang(String auditStatusNameLang) {
		this.auditStatusNameLang = auditStatusNameLang;
	}
	
	
}
