package com.sanlly.warehouse.models.input.CostPool;

import java.util.Date;

public class AddPurchasePoolInput {
	private String inteType; //接口类别
	private String compCde; //公司代码
	private String deptCde; //部门代码
	private String pctrCde; //利润中心
	private String cctrCde; //成本中心
	private String itmTypCde; //行项目类型
	private String legacyDocTyp; //业务类型
	private String legacyOrdrNum; //单据号
	private String legacyOrdrId; //单据id
	private String expsTyp; //费用类型
	private String placeLoc; //地点
	private String depot; //场站
	private String legacyCustId; //客户id
	private String custSapId; //sap id
	private String custNme; //客户名称
	private String invTyp; //发票类型
	private String invTaxRate; //发票税率
	private String purUsr; //采购人
	private String stockLoc; //仓库地点
	private String legacyVndrId; //供应商id
	private String vndrSapId; //供应商sap id
	private String vndrNme; //供应商名称
	private String bizDte; //业务日期
	private String refBizNum; //调整对应单据号
	private String chrgCde; //仅服务销售使用
	private String matrlTyp; //仅物料销售使用
	private String invtrTyp; //仅物料销售成本使用
	private String ccyCde; //币种
	private String incldTaxInd; //是否含税
	private String netAmt; //净额
	private String taxAmt; //税额
	private String ttlAmt; //总额
	private String locCcyCde; //本位币种
	private String locNetAmt; //本位币净额
	private String locTaxAmt; //本位币税额
	private String customTariffAmt; //关税
	private String locTtlAmt; //本位金额
	private String refProjNum; //研发项目
	private String rmk; //备注
	private String legacyCreByUsr; //制单人
	private String posDte; //记账时间
	private Date creDte; //添加时间
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
	public String getItmTypCde() {
		return itmTypCde;
	}
	public void setItmTypCde(String itmTypCde) {
		this.itmTypCde = itmTypCde;
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
	public String getExpsTyp() {
		return expsTyp;
	}
	public void setExpsTyp(String expsTyp) {
		this.expsTyp = expsTyp;
	}
	public String getPlaceLoc() {
		return placeLoc;
	}
	public void setPlaceLoc(String placeLoc) {
		this.placeLoc = placeLoc;
	}
	public String getDepot() {
		return depot;
	}
	public void setDepot(String depot) {
		this.depot = depot;
	}
	public String getLegacyCustId() {
		return legacyCustId;
	}
	public void setLegacyCustId(String legacyCustId) {
		this.legacyCustId = legacyCustId;
	}
	public String getCustSapId() {
		return custSapId;
	}
	public void setCustSapId(String custSapId) {
		this.custSapId = custSapId;
	}
	public String getCustNme() {
		return custNme;
	}
	public void setCustNme(String custNme) {
		this.custNme = custNme;
	}
	public String getInvTyp() {
		return invTyp;
	}
	public void setInvTyp(String invTyp) {
		this.invTyp = invTyp;
	}
	public String getInvTaxRate() {
		return invTaxRate;
	}
	public void setInvTaxRate(String invTaxRate) {
		this.invTaxRate = invTaxRate;
	}
	public String getPurUsr() {
		return purUsr;
	}
	public void setPurUsr(String purUsr) {
		this.purUsr = purUsr;
	}
	public String getStockLoc() {
		return stockLoc;
	}
	public void setStockLoc(String stockLoc) {
		this.stockLoc = stockLoc;
	}
	public String getLegacyVndrId() {
		return legacyVndrId;
	}
	public void setLegacyVndrId(String legacyVndrId) {
		this.legacyVndrId = legacyVndrId;
	}
	public String getVndrSapId() {
		return vndrSapId;
	}
	public void setVndrSapId(String vndrSapId) {
		this.vndrSapId = vndrSapId;
	}
	public String getVndrNme() {
		return vndrNme;
	}
	public void setVndrNme(String vndrNme) {
		this.vndrNme = vndrNme;
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
	public String getChrgCde() {
		return chrgCde;
	}
	public void setChrgCde(String chrgCde) {
		this.chrgCde = chrgCde;
	}
	public String getMatrlTyp() {
		return matrlTyp;
	}
	public void setMatrlTyp(String matrlTyp) {
		this.matrlTyp = matrlTyp;
	}
	public String getInvtrTyp() {
		return invtrTyp;
	}
	public void setInvtrTyp(String invtrTyp) {
		this.invtrTyp = invtrTyp;
	}
	public String getCcyCde() {
		return ccyCde;
	}
	public void setCcyCde(String ccyCde) {
		this.ccyCde = ccyCde;
	}
	public String getIncldTaxInd() {
		return incldTaxInd;
	}
	public void setIncldTaxInd(String incldTaxInd) {
		this.incldTaxInd = incldTaxInd;
	}
	public String getNetAmt() {
		return netAmt;
	}
	public void setNetAmt(String netAmt) {
		this.netAmt = netAmt;
	}
	public String getTaxAmt() {
		return taxAmt;
	}
	public void setTaxAmt(String taxAmt) {
		this.taxAmt = taxAmt;
	}
	public String getTtlAmt() {
		return ttlAmt;
	}
	public void setTtlAmt(String ttlAmt) {
		this.ttlAmt = ttlAmt;
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
	public String getLocTaxAmt() {
		return locTaxAmt;
	}
	public void setLocTaxAmt(String locTaxAmt) {
		this.locTaxAmt = locTaxAmt;
	}
	public String getCustomTariffAmt() {
		return customTariffAmt;
	}
	public void setCustomTariffAmt(String customTariffAmt) {
		this.customTariffAmt = customTariffAmt;
	}
	public String getLocTtlAmt() {
		return locTtlAmt;
	}
	public void setLocTtlAmt(String locTtlAmt) {
		this.locTtlAmt = locTtlAmt;
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
