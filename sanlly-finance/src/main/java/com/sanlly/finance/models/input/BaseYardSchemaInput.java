package com.sanlly.finance.models.input;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 场站模式对应表
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年9月26日 下午2:21:38 
* @version V1.0   
 */
public class BaseYardSchemaInput {
	//主键
    private Integer id;
	//场站
    private String yard;
	//外包核算模式
    private String wbschema;
	//外包比例费率
    private BigDecimal wbscale;
	//维修核算模式
    private String wxschema;
	//维修比例费率
    private BigDecimal wxscale;
	//公司Key
    private String companyKey;
	//备注
    private String remarks;
	//是否启用
    private String isEnabled;
	//是否删除
    private Integer isDel;
	//创建时间
    private Date createTime;
	//创建用户
    private Integer createUser;
	//更新时间
    private Date updateTime;
	//更新用户
    private Integer updateUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public String getWbschema() {
        return wbschema;
    }

    public void setWbschema(String wbschema) {
        this.wbschema = wbschema == null ? null : wbschema.trim();
    }

    public BigDecimal getWbscale() {
        return wbscale;
    }

    public void setWbscale(BigDecimal wbscale) {
        this.wbscale = wbscale;
    }

    public String getWxschema() {
        return wxschema;
    }

    public void setWxschema(String wxschema) {
        this.wxschema = wxschema == null ? null : wxschema.trim();
    }

    public BigDecimal getWxscale() {
        return wxscale;
    }

    public void setWxscale(BigDecimal wxscale) {
        this.wxscale = wxscale;
    }

    public String getCompanyKey() {
        return companyKey;
    }

    public void setCompanyKey(String companyKey) {
        this.companyKey = companyKey == null ? null : companyKey.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled == null ? null : isEnabled.trim();
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