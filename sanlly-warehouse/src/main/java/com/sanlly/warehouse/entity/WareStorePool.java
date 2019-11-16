package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareStorePool {
    private Integer wareStorePoolId;

    private String inteType;

    private String compCde;

    private String deptCde;

    private String pctrCde;

    private String cctrCde;

    private String legacyDocTyp;

    private String legacyOrdrNum;

    private String legacyOrdrId;

    private String bizDte;

    private String refBizNum;

    private String invtrTypCde;

    private String bizTypCde;

    private String tgtInvtrTyp;

    private String locCcyCde;

    private String locNetAmt;

    private String refProjNum;

    private String rmk;

    private String legacyCreByUsr;

    private String posDte;

    private String creDte;

    private String stats;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareStorePoolId() {
        return wareStorePoolId;
    }

    public void setWareStorePoolId(Integer wareStorePoolId) {
        this.wareStorePoolId = wareStorePoolId;
    }

    public String getInteType() {
        return inteType;
    }

    public void setInteType(String inteType) {
        this.inteType = inteType == null ? null : inteType.trim();
    }

    public String getCompCde() {
        return compCde;
    }

    public void setCompCde(String compCde) {
        this.compCde = compCde == null ? null : compCde.trim();
    }

    public String getDeptCde() {
        return deptCde;
    }

    public void setDeptCde(String deptCde) {
        this.deptCde = deptCde == null ? null : deptCde.trim();
    }

    public String getPctrCde() {
        return pctrCde;
    }

    public void setPctrCde(String pctrCde) {
        this.pctrCde = pctrCde == null ? null : pctrCde.trim();
    }

    public String getCctrCde() {
        return cctrCde;
    }

    public void setCctrCde(String cctrCde) {
        this.cctrCde = cctrCde == null ? null : cctrCde.trim();
    }

    public String getLegacyDocTyp() {
        return legacyDocTyp;
    }

    public void setLegacyDocTyp(String legacyDocTyp) {
        this.legacyDocTyp = legacyDocTyp == null ? null : legacyDocTyp.trim();
    }

    public String getLegacyOrdrNum() {
        return legacyOrdrNum;
    }

    public void setLegacyOrdrNum(String legacyOrdrNum) {
        this.legacyOrdrNum = legacyOrdrNum == null ? null : legacyOrdrNum.trim();
    }

    public String getLegacyOrdrId() {
        return legacyOrdrId;
    }

    public void setLegacyOrdrId(String legacyOrdrId) {
        this.legacyOrdrId = legacyOrdrId == null ? null : legacyOrdrId.trim();
    }

    public String getBizDte() {
        return bizDte;
    }

    public void setBizDte(String bizDte) {
        this.bizDte = bizDte == null ? null : bizDte.trim();
    }

    public String getRefBizNum() {
        return refBizNum;
    }

    public void setRefBizNum(String refBizNum) {
        this.refBizNum = refBizNum == null ? null : refBizNum.trim();
    }

    public String getInvtrTypCde() {
        return invtrTypCde;
    }

    public void setInvtrTypCde(String invtrTypCde) {
        this.invtrTypCde = invtrTypCde == null ? null : invtrTypCde.trim();
    }

    public String getBizTypCde() {
        return bizTypCde;
    }

    public void setBizTypCde(String bizTypCde) {
        this.bizTypCde = bizTypCde == null ? null : bizTypCde.trim();
    }

    public String getTgtInvtrTyp() {
        return tgtInvtrTyp;
    }

    public void setTgtInvtrTyp(String tgtInvtrTyp) {
        this.tgtInvtrTyp = tgtInvtrTyp == null ? null : tgtInvtrTyp.trim();
    }

    public String getLocCcyCde() {
        return locCcyCde;
    }

    public void setLocCcyCde(String locCcyCde) {
        this.locCcyCde = locCcyCde == null ? null : locCcyCde.trim();
    }

    public String getLocNetAmt() {
        return locNetAmt;
    }

    public void setLocNetAmt(String locNetAmt) {
        this.locNetAmt = locNetAmt == null ? null : locNetAmt.trim();
    }

    public String getRefProjNum() {
        return refProjNum;
    }

    public void setRefProjNum(String refProjNum) {
        this.refProjNum = refProjNum == null ? null : refProjNum.trim();
    }

    public String getRmk() {
        return rmk;
    }

    public void setRmk(String rmk) {
        this.rmk = rmk == null ? null : rmk.trim();
    }

    public String getLegacyCreByUsr() {
        return legacyCreByUsr;
    }

    public void setLegacyCreByUsr(String legacyCreByUsr) {
        this.legacyCreByUsr = legacyCreByUsr == null ? null : legacyCreByUsr.trim();
    }

    public String getPosDte() {
        return posDte;
    }

    public void setPosDte(String posDte) {
        this.posDte = posDte == null ? null : posDte.trim();
    }

    public String getCreDte() {
        return creDte;
    }

    public void setCreDte(String creDte) {
        this.creDte = creDte == null ? null : creDte.trim();
    }

    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats == null ? null : stats.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }
}