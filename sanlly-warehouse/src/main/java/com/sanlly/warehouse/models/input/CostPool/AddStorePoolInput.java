package com.sanlly.warehouse.models.input.CostPool;

import java.util.Date;

public class AddStorePoolInput {
	private String inteType; //接口类别
	private String compCde; //公司代码
	private String deptCde; //部门代码
	private String pctrCde; //利润中心
	private String cctrCde; //成本中心
	private String legacyDocTyp; // 单据类型
	private String legacyOrdrNum; //单据号
	private String legacyOrdrId; //单据号
	private String bizDte; //业务日期
	private String refBizNum; //预留字段，对应的单据号
	private String invtrTypCde; //仓库类型
	private String bizTypCde; //业务类型
	private String tgtInvtrTyp; //库存增加时使用
	private String locCcyCde; //本位币
	private String locNetAmt; //本位币金额
	private String refProjNum; //研发项目
	private String rmk; //备注
	private String legacyCreByUsr; //制单人
	private String posDte; //记账日期
	private Date creDte; // 添加时间
	private String stats; //默认状态
	public String getInteType() {
		return inteType;
	}
	public void setInteType(String inteType) {
		this.inteType = inteType;
	}
	public String getCompCde() {
		return compCde;
	}
	public void setCompCde(String compCde) {
		this.compCde = compCde;
	}
	public String getDeptCde() {
		return deptCde;
	}
	public void setDeptCde(String deptCde) {
		this.deptCde = deptCde;
	}
	public String getPctrCde() {
		return pctrCde;
	}
	public void setPctrCde(String pctrCde) {
		this.pctrCde = pctrCde;
	}
	public String getCctrCde() {
		return cctrCde;
	}
	public void setCctrCde(String cctrCde) {
		this.cctrCde = cctrCde;
	}
	public String getLegacyDocTyp() {
		return legacyDocTyp;
	}
	public void setLegacyDocTyp(String legacyDocTyp) {
		this.legacyDocTyp = legacyDocTyp;
	}
	public String getLegacyOrdrNum() {
		return legacyOrdrNum;
	}
	public void setLegacyOrdrNum(String legacyOrdrNum) {
		this.legacyOrdrNum = legacyOrdrNum;
	}
	public String getLegacyOrdrId() {
		return legacyOrdrId;
	}
	public void setLegacyOrdrId(String legacyOrdrId) {
		this.legacyOrdrId = legacyOrdrId;
	}
	public String getBizDte() {
		return bizDte;
	}
	public void setBizDte(String bizDte) {
		this.bizDte = bizDte;
	}
	public String getRefBizNum() {
		return refBizNum;
	}
	public void setRefBizNum(String refBizNum) {
		this.refBizNum = refBizNum;
	}
	public String getInvtrTypCde() {
		return invtrTypCde;
	}
	public void setInvtrTypCde(String invtrTypCde) {
		this.invtrTypCde = invtrTypCde;
	}
	public String getBizTypCde() {
		return bizTypCde;
	}
	public void setBizTypCde(String bizTypCde) {
		this.bizTypCde = bizTypCde;
	}
	public String getTgtInvtrTyp() {
		return tgtInvtrTyp;
	}
	public void setTgtInvtrTyp(String tgtInvtrTyp) {
		this.tgtInvtrTyp = tgtInvtrTyp;
	}
	public String getLocCcyCde() {
		return locCcyCde;
	}
	public void setLocCcyCde(String locCcyCde) {
		this.locCcyCde = locCcyCde;
	}
	public String getLocNetAmt() {
		return locNetAmt;
	}
	public void setLocNetAmt(String locNetAmt) {
		this.locNetAmt = locNetAmt;
	}
	public String getRefProjNum() {
		return refProjNum;
	}
	public void setRefProjNum(String refProjNum) {
		this.refProjNum = refProjNum;
	}
	public String getRmk() {
		return rmk;
	}
	public void setRmk(String rmk) {
		this.rmk = rmk;
	}
	public String getLegacyCreByUsr() {
		return legacyCreByUsr;
	}
	public void setLegacyCreByUsr(String legacyCreByUsr) {
		this.legacyCreByUsr = legacyCreByUsr;
	}
	public String getPosDte() {
		return posDte;
	}
	public void setPosDte(String posDte) {
		this.posDte = posDte;
	}
	public Date getCreDte() {
		return creDte;
	}
	public void setCreDte(Date creDte) {
		this.creDte = creDte;
	}
	public String getStats() {
		return stats;
	}
	public void setStats(String stats) {
		this.stats = stats;
	}
	

}
