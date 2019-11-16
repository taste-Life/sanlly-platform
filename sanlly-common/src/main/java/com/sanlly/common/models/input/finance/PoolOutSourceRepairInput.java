package com.sanlly.common.models.input.finance;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 	劳务外包费用池（修箱、洗箱）
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年9月17日 下午5:04:23 
* @version V1.0   
 */
public class PoolOutSourceRepairInput {

	//箱量
	private BigDecimal containerNumber;
	//公司key
	private String companyKey;
	//0 班组 1 外包商
	private Integer bzOrWb;
	//班组ID
	private Integer workdGroupId;
	//外包商
	private String outCompanyKey;
	//完工工时
	private BigDecimal finishedManHour;
    //用箱人code 判断是否中远用
    private String containerUserCode;
	//主键ID
    private Integer id;
	//进场主表ID
    private String prodCourseId;
	//箱ID
    private String prodContainerId;
	//箱号
    private String containerNo;
	//进场场站key，关联场站表
    private String yard;
	//批复时间
    private Date replyTime;
	//是否退租 0 :正常 1退租
    private String isBackLease;
	//保修序列号
    private String repairNumber;
	//用箱人key，关联用箱人表
    private String containerUser;
	//收费对象 同用箱人
    private String chargeObject;
	//估价批复确认日期
    private Date valuationReplyOkTime;
	//箱类别key，关联箱类别表
    private String containerCategory;
	//报价工时费
    private BigDecimal valuationManHourCost;
	//报价材料费
    private BigDecimal valuationMaterialCost;
	//报价总费用美金
    private BigDecimal valuationMoneyUsd;
	//报价总费用人民币
    private BigDecimal valuationMoneyRmb;
	//批复(含税)总费用美金
    private BigDecimal replyTaxTotalCostUsa;
	//批复(含税)总费用人民币
    private BigDecimal replyTaxTotalCostRmb;
	//批复(不含税)总费用美金
    private BigDecimal replyNotaxTotalCostUsa;
	//批复(不含税)总费用人民币
    private BigDecimal replyNotaxTotalCostRmb;
	//实收（美金含税）
    private BigDecimal realTaxTotalCostUsa;
	//实收（美金不含税）
    private BigDecimal realNotaxTotalCostUsa;
	//实收（人民币含税）
    private BigDecimal realTaxTotalCostRmb;
	//实收（人民币不含税）
    private BigDecimal realNotaxTotalCostRmb;
	//汇率
    private BigDecimal realRate;
	//实收币种
    private String realCurrencyType;
	//报价币种
    private String estCurrencyType;
	//批复工时
    private BigDecimal replyHourNumber;
	//批复工时费
    private BigDecimal replyManHourCost;
	//批复材料费
    private BigDecimal replyMaterialCost;
	//付费方
    private String payer;
	//批复费用录入人
    private Integer replyFreeUser;
	//批复费用录入时间
    private Date replyFreeTime;
	//批复费用确认人
    private Integer replyFreeOkUser;
	//批复费用确认时间
    private Date replyFreeOkTime;
	//核算部门
    private String deptKey;
	//部门代码
    private String deptCode;
	//费用类型
    private String chargeTypeKey;
	//费用状态
    private String freeStatus;
	//行状态 0 未加入：1 已加入
    private Integer itemStatus;
	//备注
    private String remarks;
	//无法收费原因
    private String noCostDesc;
	//费用池类型  用于区分费用  0 修箱 1洗箱
    private Integer poolType;
	//是否有效：0：正常；1：无效
    private String isEnabled;
	//删除标识：0：正常；1：删除
    private Integer isDel;
	//创建时间
    private Date createTime;
	//创建人
    private Integer createUser;
	//修改时间
    private Date updateTime;
	//修改人
    private Integer updateUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProdCourseId() {
        return prodCourseId;
    }

    public void setProdCourseId(String prodCourseId) {
        this.prodCourseId = prodCourseId == null ? null : prodCourseId.trim();
    }

    public String getProdContainerId() {
        return prodContainerId;
    }

    public void setProdContainerId(String prodContainerId) {
        this.prodContainerId = prodContainerId == null ? null : prodContainerId.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public String getIsBackLease() {
        return isBackLease;
    }

    public void setIsBackLease(String isBackLease) {
        this.isBackLease = isBackLease == null ? null : isBackLease.trim();
    }

    public String getRepairNumber() {
        return repairNumber;
    }

    public void setRepairNumber(String repairNumber) {
        this.repairNumber = repairNumber == null ? null : repairNumber.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

     

    public String getChargeObject() {
		return chargeObject;
	}

	public void setChargeObject(String chargeObject) {
		this.chargeObject = chargeObject;
	}

	public Date getValuationReplyOkTime() {
        return valuationReplyOkTime;
    }

    public void setValuationReplyOkTime(Date valuationReplyOkTime) {
        this.valuationReplyOkTime = valuationReplyOkTime;
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public BigDecimal getValuationManHourCost() {
        return valuationManHourCost;
    }

    public void setValuationManHourCost(BigDecimal valuationManHourCost) {
        this.valuationManHourCost = valuationManHourCost;
    }

    public BigDecimal getValuationMaterialCost() {
        return valuationMaterialCost;
    }

    public void setValuationMaterialCost(BigDecimal valuationMaterialCost) {
        this.valuationMaterialCost = valuationMaterialCost;
    }

    public BigDecimal getValuationMoneyUsd() {
        return valuationMoneyUsd;
    }

    public void setValuationMoneyUsd(BigDecimal valuationMoneyUsd) {
        this.valuationMoneyUsd = valuationMoneyUsd;
    }

    public BigDecimal getValuationMoneyRmb() {
        return valuationMoneyRmb;
    }

    public void setValuationMoneyRmb(BigDecimal valuationMoneyRmb) {
        this.valuationMoneyRmb = valuationMoneyRmb;
    }

    public BigDecimal getReplyTaxTotalCostUsa() {
        return replyTaxTotalCostUsa;
    }

    public void setReplyTaxTotalCostUsa(BigDecimal replyTaxTotalCostUsa) {
        this.replyTaxTotalCostUsa = replyTaxTotalCostUsa;
    }

    public BigDecimal getReplyTaxTotalCostRmb() {
        return replyTaxTotalCostRmb;
    }

    public void setReplyTaxTotalCostRmb(BigDecimal replyTaxTotalCostRmb) {
        this.replyTaxTotalCostRmb = replyTaxTotalCostRmb;
    }

    public BigDecimal getReplyNotaxTotalCostUsa() {
        return replyNotaxTotalCostUsa;
    }

    public void setReplyNotaxTotalCostUsa(BigDecimal replyNotaxTotalCostUsa) {
        this.replyNotaxTotalCostUsa = replyNotaxTotalCostUsa;
    }

    public BigDecimal getReplyNotaxTotalCostRmb() {
        return replyNotaxTotalCostRmb;
    }

    public void setReplyNotaxTotalCostRmb(BigDecimal replyNotaxTotalCostRmb) {
        this.replyNotaxTotalCostRmb = replyNotaxTotalCostRmb;
    }

    public BigDecimal getRealTaxTotalCostUsa() {
        return realTaxTotalCostUsa;
    }

    public void setRealTaxTotalCostUsa(BigDecimal realTaxTotalCostUsa) {
        this.realTaxTotalCostUsa = realTaxTotalCostUsa;
    }

    public BigDecimal getRealNotaxTotalCostUsa() {
        return realNotaxTotalCostUsa;
    }

    public void setRealNotaxTotalCostUsa(BigDecimal realNotaxTotalCostUsa) {
        this.realNotaxTotalCostUsa = realNotaxTotalCostUsa;
    }

    public BigDecimal getRealTaxTotalCostRmb() {
        return realTaxTotalCostRmb;
    }

    public void setRealTaxTotalCostRmb(BigDecimal realTaxTotalCostRmb) {
        this.realTaxTotalCostRmb = realTaxTotalCostRmb;
    }

    public BigDecimal getRealNotaxTotalCostRmb() {
        return realNotaxTotalCostRmb;
    }

    public void setRealNotaxTotalCostRmb(BigDecimal realNotaxTotalCostRmb) {
        this.realNotaxTotalCostRmb = realNotaxTotalCostRmb;
    }

    public BigDecimal getRealRate() {
        return realRate;
    }

    public void setRealRate(BigDecimal realRate) {
        this.realRate = realRate;
    }

    public String getRealCurrencyType() {
        return realCurrencyType;
    }

    public void setRealCurrencyType(String realCurrencyType) {
        this.realCurrencyType = realCurrencyType == null ? null : realCurrencyType.trim();
    }

    public String getEstCurrencyType() {
        return estCurrencyType;
    }

    public void setEstCurrencyType(String estCurrencyType) {
        this.estCurrencyType = estCurrencyType == null ? null : estCurrencyType.trim();
    }

    public BigDecimal getReplyHourNumber() {
        return replyHourNumber;
    }

    public void setReplyHourNumber(BigDecimal replyHourNumber) {
        this.replyHourNumber = replyHourNumber;
    }

    public BigDecimal getReplyManHourCost() {
        return replyManHourCost;
    }

    public void setReplyManHourCost(BigDecimal replyManHourCost) {
        this.replyManHourCost = replyManHourCost;
    }

    public BigDecimal getReplyMaterialCost() {
        return replyMaterialCost;
    }

    public void setReplyMaterialCost(BigDecimal replyMaterialCost) {
        this.replyMaterialCost = replyMaterialCost;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer == null ? null : payer.trim();
    }

    public Integer getReplyFreeUser() {
        return replyFreeUser;
    }

    public void setReplyFreeUser(Integer replyFreeUser) {
        this.replyFreeUser = replyFreeUser;
    }

    public Date getReplyFreeTime() {
        return replyFreeTime;
    }

    public void setReplyFreeTime(Date replyFreeTime) {
        this.replyFreeTime = replyFreeTime;
    }

    public Integer getReplyFreeOkUser() {
        return replyFreeOkUser;
    }

    public void setReplyFreeOkUser(Integer replyFreeOkUser) {
        this.replyFreeOkUser = replyFreeOkUser;
    }

    public Date getReplyFreeOkTime() {
        return replyFreeOkTime;
    }

    public void setReplyFreeOkTime(Date replyFreeOkTime) {
        this.replyFreeOkTime = replyFreeOkTime;
    }

    public String getDeptKey() {
        return deptKey;
    }

    public void setDeptKey(String deptKey) {
        this.deptKey = deptKey == null ? null : deptKey.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }




    public String getChargeTypeKey() {
		return chargeTypeKey;
	}

	public void setChargeTypeKey(String chargeTypeKey) {
		this.chargeTypeKey = chargeTypeKey;
	}

	public String getFreeStatus() {
        return freeStatus;
    }

    public void setFreeStatus(String freeStatus) {
        this.freeStatus = freeStatus == null ? null : freeStatus.trim();
    }

    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getNoCostDesc() {
        return noCostDesc;
    }

    public void setNoCostDesc(String noCostDesc) {
        this.noCostDesc = noCostDesc == null ? null : noCostDesc.trim();
    }

    public Integer getPoolType() {
        return poolType;
    }

    public void setPoolType(Integer poolType) {
        this.poolType = poolType;
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

	public String getCompanyKey() {
		return companyKey;
	}

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}

	public BigDecimal getFinishedManHour() {
		return finishedManHour;
	}

	public void setFinishedManHour(BigDecimal finishedManHour) {
		this.finishedManHour = finishedManHour;
	}

	public String getContainerUserCode() {
		return containerUserCode;
	}

	public void setContainerUserCode(String containerUserCode) {
		this.containerUserCode = containerUserCode;
	}

	public Integer getBzOrWb() {
		return bzOrWb;
	}

	public void setBzOrWb(Integer bzOrWb) {
		this.bzOrWb = bzOrWb;
	}

	public Integer getWorkdGroupId() {
		return workdGroupId;
	}

	public void setWorkdGroupId(Integer workdGroupId) {
		this.workdGroupId = workdGroupId;
	}

	public BigDecimal getContainerNumber() {
		return containerNumber;
	}

	public void setContainerNumber(BigDecimal containerNumber) {
		this.containerNumber = containerNumber;
	}

	public String getOutCompanyKey() {
		return outCompanyKey;
	}

	public void setOutCompanyKey(String outCompanyKey) {
		this.outCompanyKey = outCompanyKey;
	}

	
    
}