package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;
/**
 *  成本维修账单输出类
* @Package com.sanlly.finance.models.output 
* @Description: TODO 
* @author fjy   
* @date 2019年9月25日 上午10:49:55 
* @version V1.0   
 */
public class BillSourceRepairOutput {
	
	//主键ID
    private Integer billId;
    //账单编号
    private String billCode;
    //账单月份
    private String billMonth;
    //业务分类
    private String businessCategory;
    //业务类型
    private String businessType;
    //收费对象id
    private String containerUserId;
    //客户全称
    private String merchantsKey;
    //客户编号
    private String sapid;
    //费用类型
    private String chargecode;
    //费用类型
    private String chargeTypeKey;
    //场站
    private String yard;

    //箱类别key，关联箱类别表
    private String containerCategory;

    //实收币种
    private String realCurrencyType;
    //发票类型
    private String invoiceType;
    //实收汇率
    private BigDecimal realRate;
    //税率
    private BigDecimal taxRate;
    //税金(美金)
    private BigDecimal taxAmountUsa;
    //税金(人民币)
    private BigDecimal taxAmountRbm;
    //实收（美金含税）
    private BigDecimal realTaxTotalCostUsa;
    //实收（美金不含税）
    private BigDecimal realNotaxTotalCostUsa;
    //实收（人民币含税）
    private BigDecimal realTaxTotalCostRmb;
    //实收（人民币不含税）
    private BigDecimal realNotaxTotalCostRmb;
    //数量（箱量）
    private BigDecimal number;
    //账单审核人
    private Integer billAuditor;
    //账单审核时间
    private Date billAuditorTime;
    //账单驳回人
    private Integer billReturn;
    //账单驳回时间
    private Date billReturnTime;
    //账单驳回原因
    private String billReturnReason;
    //账单备注
    private String billRemark;
    //财务驳回人
    private Integer financeReturn;
    //财务驳回时间
    private Date financeReturnTime;
    //财务驳回原因
    private String financeReturnReason;
    //财务备注
    private String financeRemark;
    //版本号
    private String versionNo;
    //账单状态
    private String billStatus;
    //调账状态
    private String modifyBillStatus;
    //调账方式
    private String modifyBillType;
    //账单产生节点
    private String createNode;
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


    //区分1干箱 2冷箱 3保修 类型账单
    private Integer billType;
    
    
	// 是否有效：0：正常；1：无效
	private String isEnabledNameLang;
	// 创建人
	private String createUserName;
	// 修改人
	private String updateUserName;
	// 业务分类
	private String businessCategoryNameLang;
	// 业务类型
	private String businessTypeNameLang;
	// 收费对象id
	private String containerUserName;
	// 客户全称
	private String merchantsNameLang;

	// 箱类别key，关联箱类别表
	private String containerCategoryNameLang;

	// 报价币种
	private String estCurrencyTypeNameLang;
	// 实收币种
	private String realCurrencyTypeNameLang;

	// 账单审核人
	private String billAuditorName;

	// 账单驳回人
	private String billReturnName;
	// 财务驳回人
	private String financeReturnName;
	// 账单状态
	private String billStatusNameLang;

	// 调账状态
	private String modifyBillStatusNameLang;
	// 调账方式
	private String modifyBillTypeNameLang;
	
	
	//是否有明细  有明细前台账单无法删除
	private Boolean isDetail;
	//是否入账，只有入账的才能冲回
	private Boolean isInBill;
	public Integer getBillId() {
		return billId;
	}
	public void setBillId(Integer billId) {
		this.billId = billId;
	}
	public String getBillCode() {
		return billCode;
	}
	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}
	public String getBillMonth() {
		return billMonth;
	}
	public void setBillMonth(String billMonth) {
		this.billMonth = billMonth;
	}
	public String getBusinessCategory() {
		return businessCategory;
	}
	public void setBusinessCategory(String businessCategory) {
		this.businessCategory = businessCategory;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getContainerUserId() {
		return containerUserId;
	}
	public void setContainerUserId(String containerUserId) {
		this.containerUserId = containerUserId;
	}
	public String getMerchantsKey() {
		return merchantsKey;
	}
	public void setMerchantsKey(String merchantsKey) {
		this.merchantsKey = merchantsKey;
	}
	public String getSapid() {
		return sapid;
	}
	public void setSapid(String sapid) {
		this.sapid = sapid;
	}
	 
	public String getChargecode() {
		return chargecode;
	}
	public void setChargecode(String chargecode) {
		this.chargecode = chargecode;
	}
	public String getChargeTypeKey() {
		return chargeTypeKey;
	}
	public void setChargeTypeKey(String chargeTypeKey) {
		this.chargeTypeKey = chargeTypeKey;
	}
	public String getYard() {
		return yard;
	}
	public void setYard(String yard) {
		this.yard = yard;
	}
	public String getContainerCategory() {
		return containerCategory;
	}
	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}
	public String getRealCurrencyType() {
		return realCurrencyType;
	}
	public void setRealCurrencyType(String realCurrencyType) {
		this.realCurrencyType = realCurrencyType;
	}
	public BigDecimal getRealRate() {
		return realRate;
	}
	public void setRealRate(BigDecimal realRate) {
		this.realRate = realRate;
	}
	public BigDecimal getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
	public BigDecimal getTaxAmountUsa() {
		return taxAmountUsa;
	}
	public void setTaxAmountUsa(BigDecimal taxAmountUsa) {
		this.taxAmountUsa = taxAmountUsa;
	}
	public BigDecimal getTaxAmountRbm() {
		return taxAmountRbm;
	}
	public void setTaxAmountRbm(BigDecimal taxAmountRbm) {
		this.taxAmountRbm = taxAmountRbm;
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
	public BigDecimal getNumber() {
		return number;
	}
	public void setNumber(BigDecimal number) {
		this.number = number;
	}
	public Integer getBillAuditor() {
		return billAuditor;
	}
	public void setBillAuditor(Integer billAuditor) {
		this.billAuditor = billAuditor;
	}
	public Date getBillAuditorTime() {
		return billAuditorTime;
	}
	public void setBillAuditorTime(Date billAuditorTime) {
		this.billAuditorTime = billAuditorTime;
	}
	public Integer getBillReturn() {
		return billReturn;
	}
	public void setBillReturn(Integer billReturn) {
		this.billReturn = billReturn;
	}
	public Date getBillReturnTime() {
		return billReturnTime;
	}
	public void setBillReturnTime(Date billReturnTime) {
		this.billReturnTime = billReturnTime;
	}
	public String getBillReturnReason() {
		return billReturnReason;
	}
	public void setBillReturnReason(String billReturnReason) {
		this.billReturnReason = billReturnReason;
	}
	public String getBillRemark() {
		return billRemark;
	}
	public void setBillRemark(String billRemark) {
		this.billRemark = billRemark;
	}
	public Integer getFinanceReturn() {
		return financeReturn;
	}
	public void setFinanceReturn(Integer financeReturn) {
		this.financeReturn = financeReturn;
	}
	public Date getFinanceReturnTime() {
		return financeReturnTime;
	}
	public void setFinanceReturnTime(Date financeReturnTime) {
		this.financeReturnTime = financeReturnTime;
	}
	public String getFinanceReturnReason() {
		return financeReturnReason;
	}
	public void setFinanceReturnReason(String financeReturnReason) {
		this.financeReturnReason = financeReturnReason;
	}
	public String getFinanceRemark() {
		return financeRemark;
	}
	public void setFinanceRemark(String financeRemark) {
		this.financeRemark = financeRemark;
	}
	public String getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public String getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}
	public String getModifyBillStatus() {
		return modifyBillStatus;
	}
	public void setModifyBillStatus(String modifyBillStatus) {
		this.modifyBillStatus = modifyBillStatus;
	}
	public String getModifyBillType() {
		return modifyBillType;
	}
	public void setModifyBillType(String modifyBillType) {
		this.modifyBillType = modifyBillType;
	}
	public String getCreateNode() {
		return createNode;
	}
	public void setCreateNode(String createNode) {
		this.createNode = createNode;
	}
	public String getIsEnabled() {
		return isEnabled;
	}
	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
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
	public Integer getBillType() {
		return billType;
	}
	public void setBillType(Integer billType) {
		this.billType = billType;
	}
	public String getIsEnabledNameLang() {
		return isEnabledNameLang;
	}
	public void setIsEnabledNameLang(String isEnabledNameLang) {
		this.isEnabledNameLang = isEnabledNameLang;
	}
	public String getCreateUserName() {
		return createUserName;
	}
	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}
	public String getUpdateUserName() {
		return updateUserName;
	}
	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}
	public String getBusinessCategoryNameLang() {
		return businessCategoryNameLang;
	}
	public void setBusinessCategoryNameLang(String businessCategoryNameLang) {
		this.businessCategoryNameLang = businessCategoryNameLang;
	}
	public String getBusinessTypeNameLang() {
		return businessTypeNameLang;
	}
	public void setBusinessTypeNameLang(String businessTypeNameLang) {
		this.businessTypeNameLang = businessTypeNameLang;
	}
	public String getContainerUserName() {
		return containerUserName;
	}
	public void setContainerUserName(String containerUserName) {
		this.containerUserName = containerUserName;
	}
	public String getMerchantsNameLang() {
		return merchantsNameLang;
	}
	public void setMerchantsNameLang(String merchantsNameLang) {
		this.merchantsNameLang = merchantsNameLang;
	}
	public String getContainerCategoryNameLang() {
		return containerCategoryNameLang;
	}
	public void setContainerCategoryNameLang(String containerCategoryNameLang) {
		this.containerCategoryNameLang = containerCategoryNameLang;
	}
	public String getEstCurrencyTypeNameLang() {
		return estCurrencyTypeNameLang;
	}
	public void setEstCurrencyTypeNameLang(String estCurrencyTypeNameLang) {
		this.estCurrencyTypeNameLang = estCurrencyTypeNameLang;
	}
	public String getRealCurrencyTypeNameLang() {
		return realCurrencyTypeNameLang;
	}
	public void setRealCurrencyTypeNameLang(String realCurrencyTypeNameLang) {
		this.realCurrencyTypeNameLang = realCurrencyTypeNameLang;
	}
	public String getBillAuditorName() {
		return billAuditorName;
	}
	public void setBillAuditorName(String billAuditorName) {
		this.billAuditorName = billAuditorName;
	}
	public String getBillReturnName() {
		return billReturnName;
	}
	public void setBillReturnName(String billReturnName) {
		this.billReturnName = billReturnName;
	}
	public String getFinanceReturnName() {
		return financeReturnName;
	}
	public void setFinanceReturnName(String financeReturnName) {
		this.financeReturnName = financeReturnName;
	}
	public String getBillStatusNameLang() {
		return billStatusNameLang;
	}
	public void setBillStatusNameLang(String billStatusNameLang) {
		this.billStatusNameLang = billStatusNameLang;
	}
	public String getModifyBillStatusNameLang() {
		return modifyBillStatusNameLang;
	}
	public void setModifyBillStatusNameLang(String modifyBillStatusNameLang) {
		this.modifyBillStatusNameLang = modifyBillStatusNameLang;
	}
	public String getModifyBillTypeNameLang() {
		return modifyBillTypeNameLang;
	}
	public void setModifyBillTypeNameLang(String modifyBillTypeNameLang) {
		this.modifyBillTypeNameLang = modifyBillTypeNameLang;
	}
	public Boolean getIsDetail() {
		return isDetail;
	}
	public void setIsDetail(Boolean isDetail) {
		this.isDetail = isDetail;
	}
	public Boolean getIsInBill() {
		return isInBill;
	}
	public void setIsInBill(Boolean isInBill) {
		this.isInBill = isInBill;
	}
	public String getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
    
    
    


	

    
    
    
}