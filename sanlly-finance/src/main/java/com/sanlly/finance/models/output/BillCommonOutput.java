package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  通用账单输出实体类
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月17日  
 *
 */
public class BillCommonOutput {


	private Integer   id;
	//账单编号
	private String   bill_code;
	//账单月份
	private String   bill_month;
	//收费对象id
	private String   container_user_id;
	//客户全称
	private String   merchants_key;
	//客户编号
	private String   sapid;
	//箱类型
	private String   container_type;
	//箱类别
	private String   container_category;
	//报价工时费
	private BigDecimal   valuation_man_hour_cost;
	//报价材料费
	private BigDecimal   valuation_material_cost;
	//报价总费用美金
	private BigDecimal   valuation_money_usd;
	//报价总费用人民币
	private BigDecimal   valuation_money_rmb;
	//批复(含税)总费用美金
	private BigDecimal   reply_tax_total_cost_usa;
	//批复(含税)总费用人民币
	private BigDecimal   reply_tax_total_cost_rmb;
	//批复(不含税)总费用美金
	private BigDecimal   reply_notax_total_cost_usa;
	//批复(不含税)总费用人民币
	private BigDecimal   reply_notax_total_cost_rmb;
	//折扣
	private BigDecimal   discount_percent ;
	//临时折扣
	private BigDecimal   discount_percent_tmp;
	//减免金额
	private BigDecimal   reduction_amount;
	//报价币种
	private String   est_currency_type;
	//实收币种
	private String   real_currency_type;
	//实收汇率
	private BigDecimal   real_rate;
	//税率
	private BigDecimal   tax_rate;
	//税金(美金)
	private BigDecimal   tax_amount_usa;
	//税金(人民币)
	private BigDecimal   tax_amount_rbm;
	//实收（美金含税）
	private BigDecimal   real_tax_total_cost_usa;
	//实收（美金不含税）
	private BigDecimal   real_notax_total_cost_usa;
	//实收（人民币含税）
	private BigDecimal   real_tax_total_cost_rmb;
	//实收（人民币不含税）
	private BigDecimal   real_notax_total_cost_rmb;
	//数量
	private BigDecimal   number;
	//账单审核人
	private Integer   bill_auditor;
	//账单审核时间	
	private Date   bill_auditor_time;
	//账单驳回人
	private Integer   bill_return;
	//账单驳回时间
	private Date   bill_return_time;
	//账单驳回原因
	private String   bill_return_reason;
	//账单备注
	private String   bill_remark;
	//财务驳回人
	private Integer   finance_return;
	//财务驳回时间	
	private Date   finance_return_time;
	//财务驳回原因	
	private String   finance_return_reason;
	//财务备注	
	private String   finance_remark;
	//版本号	
	private String   version_no;
	//账单状态	
	private String   bill_status;
	//调账状态	
	private String   modify_bill_status;
	//调账方式	
	private String   modify_bill_type;
	//是否启用
	private String is_enabled;
	//创建时间	
	private Date   create_time;
	//创建人	
	private Integer   create_user;
	//修改时间	
	private Date   update_time;
	//修改人
	private Integer   update_user;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBill_code() {
		return bill_code;
	}
	public void setBill_code(String bill_code) {
		this.bill_code = bill_code;
	}
	public String getBill_month() {
		return bill_month;
	}
	public void setBill_month(String bill_month) {
		this.bill_month = bill_month;
	}
	public String getContainer_user_id() {
		return container_user_id;
	}
	public void setContainer_user_id(String container_user_id) {
		this.container_user_id = container_user_id;
	}
	public String getMerchants_key() {
		return merchants_key;
	}
	public void setMerchants_key(String merchants_key) {
		this.merchants_key = merchants_key;
	}
	public String getSapid() {
		return sapid;
	}
	public void setSapid(String sapid) {
		this.sapid = sapid;
	}
	public String getContainer_type() {
		return container_type;
	}
	public void setContainer_type(String container_type) {
		this.container_type = container_type;
	}
	public String getContainer_category() {
		return container_category;
	}
	public void setContainer_category(String container_category) {
		this.container_category = container_category;
	}
	public BigDecimal getValuation_man_hour_cost() {
		return valuation_man_hour_cost;
	}
	public void setValuation_man_hour_cost(BigDecimal valuation_man_hour_cost) {
		this.valuation_man_hour_cost = valuation_man_hour_cost;
	}
	public BigDecimal getValuation_material_cost() {
		return valuation_material_cost;
	}
	public void setValuation_material_cost(BigDecimal valuation_material_cost) {
		this.valuation_material_cost = valuation_material_cost;
	}
	public BigDecimal getValuation_money_usd() {
		return valuation_money_usd;
	}
	public void setValuation_money_usd(BigDecimal valuation_money_usd) {
		this.valuation_money_usd = valuation_money_usd;
	}
	public BigDecimal getValuation_money_rmb() {
		return valuation_money_rmb;
	}
	public void setValuation_money_rmb(BigDecimal valuation_money_rmb) {
		this.valuation_money_rmb = valuation_money_rmb;
	}
	public BigDecimal getReply_tax_total_cost_usa() {
		return reply_tax_total_cost_usa;
	}
	public void setReply_tax_total_cost_usa(BigDecimal reply_tax_total_cost_usa) {
		this.reply_tax_total_cost_usa = reply_tax_total_cost_usa;
	}
	public BigDecimal getReply_tax_total_cost_rmb() {
		return reply_tax_total_cost_rmb;
	}
	public void setReply_tax_total_cost_rmb(BigDecimal reply_tax_total_cost_rmb) {
		this.reply_tax_total_cost_rmb = reply_tax_total_cost_rmb;
	}
	public BigDecimal getReply_notax_total_cost_usa() {
		return reply_notax_total_cost_usa;
	}
	public void setReply_notax_total_cost_usa(BigDecimal reply_notax_total_cost_usa) {
		this.reply_notax_total_cost_usa = reply_notax_total_cost_usa;
	}
	public BigDecimal getReply_notax_total_cost_rmb() {
		return reply_notax_total_cost_rmb;
	}
	public void setReply_notax_total_cost_rmb(BigDecimal reply_notax_total_cost_rmb) {
		this.reply_notax_total_cost_rmb = reply_notax_total_cost_rmb;
	}
	public BigDecimal getDiscount_percent() {
		return discount_percent;
	}
	public void setDiscount_percent(BigDecimal discount_percent) {
		this.discount_percent = discount_percent;
	}
	public BigDecimal getDiscount_percent_tmp() {
		return discount_percent_tmp;
	}
	public void setDiscount_percent_tmp(BigDecimal discount_percent_tmp) {
		this.discount_percent_tmp = discount_percent_tmp;
	}
	public BigDecimal getReduction_amount() {
		return reduction_amount;
	}
	public void setReduction_amount(BigDecimal reduction_amount) {
		this.reduction_amount = reduction_amount;
	}
	public String getEst_currency_type() {
		return est_currency_type;
	}
	public void setEst_currency_type(String est_currency_type) {
		this.est_currency_type = est_currency_type;
	}
	public String getReal_currency_type() {
		return real_currency_type;
	}
	public void setReal_currency_type(String real_currency_type) {
		this.real_currency_type = real_currency_type;
	}
	public BigDecimal getReal_rate() {
		return real_rate;
	}
	public void setReal_rate(BigDecimal real_rate) {
		this.real_rate = real_rate;
	}
	public BigDecimal getTax_rate() {
		return tax_rate;
	}
	public void setTax_rate(BigDecimal tax_rate) {
		this.tax_rate = tax_rate;
	}
	public BigDecimal getTax_amount_usa() {
		return tax_amount_usa;
	}
	public void setTax_amount_usa(BigDecimal tax_amount_usa) {
		this.tax_amount_usa = tax_amount_usa;
	}
	public BigDecimal getTax_amount_rbm() {
		return tax_amount_rbm;
	}
	public void setTax_amount_rbm(BigDecimal tax_amount_rbm) {
		this.tax_amount_rbm = tax_amount_rbm;
	}
	public BigDecimal getReal_tax_total_cost_usa() {
		return real_tax_total_cost_usa;
	}
	public void setReal_tax_total_cost_usa(BigDecimal real_tax_total_cost_usa) {
		this.real_tax_total_cost_usa = real_tax_total_cost_usa;
	}
	public BigDecimal getReal_notax_total_cost_usa() {
		return real_notax_total_cost_usa;
	}
	public void setReal_notax_total_cost_usa(BigDecimal real_notax_total_cost_usa) {
		this.real_notax_total_cost_usa = real_notax_total_cost_usa;
	}
	public BigDecimal getReal_tax_total_cost_rmb() {
		return real_tax_total_cost_rmb;
	}
	public void setReal_tax_total_cost_rmb(BigDecimal real_tax_total_cost_rmb) {
		this.real_tax_total_cost_rmb = real_tax_total_cost_rmb;
	}
	public BigDecimal getReal_notax_total_cost_rmb() {
		return real_notax_total_cost_rmb;
	}
	public void setReal_notax_total_cost_rmb(BigDecimal real_notax_total_cost_rmb) {
		this.real_notax_total_cost_rmb = real_notax_total_cost_rmb;
	}
	public BigDecimal getNumber() {
		return number;
	}
	public void setNumber(BigDecimal number) {
		this.number = number;
	}
	public Integer getBill_auditor() {
		return bill_auditor;
	}
	public void setBill_auditor(Integer bill_auditor) {
		this.bill_auditor = bill_auditor;
	}
	public Date getBill_auditor_time() {
		return bill_auditor_time;
	}
	public void setBill_auditor_time(Date bill_auditor_time) {
		this.bill_auditor_time = bill_auditor_time;
	}
	public Integer getBill_return() {
		return bill_return;
	}
	public void setBill_return(Integer bill_return) {
		this.bill_return = bill_return;
	}
	public Date getBill_return_time() {
		return bill_return_time;
	}
	public void setBill_return_time(Date bill_return_time) {
		this.bill_return_time = bill_return_time;
	}
	public String getBill_return_reason() {
		return bill_return_reason;
	}
	public void setBill_return_reason(String bill_return_reason) {
		this.bill_return_reason = bill_return_reason;
	}
	public String getBill_remark() {
		return bill_remark;
	}
	public void setBill_remark(String bill_remark) {
		this.bill_remark = bill_remark;
	}
	public Integer getFinance_return() {
		return finance_return;
	}
	public void setFinance_return(Integer finance_return) {
		this.finance_return = finance_return;
	}
	public Date getFinance_return_time() {
		return finance_return_time;
	}
	public void setFinance_return_time(Date finance_return_time) {
		this.finance_return_time = finance_return_time;
	}
	public String getFinance_return_reason() {
		return finance_return_reason;
	}
	public void setFinance_return_reason(String finance_return_reason) {
		this.finance_return_reason = finance_return_reason;
	}
	public String getFinance_remark() {
		return finance_remark;
	}
	public void setFinance_remark(String finance_remark) {
		this.finance_remark = finance_remark;
	}
	public String getVersion_no() {
		return version_no;
	}
	public void setVersion_no(String version_no) {
		this.version_no = version_no;
	}
	public String getBill_status() {
		return bill_status;
	}
	public void setBill_status(String bill_status) {
		this.bill_status = bill_status;
	}
	public String getModify_bill_status() {
		return modify_bill_status;
	}
	public void setModify_bill_status(String modify_bill_status) {
		this.modify_bill_status = modify_bill_status;
	}
	public String getModify_bill_type() {
		return modify_bill_type;
	}
	public void setModify_bill_type(String modify_bill_type) {
		this.modify_bill_type = modify_bill_type;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Integer getCreate_user() {
		return create_user;
	}
	public void setCreate_user(Integer create_user) {
		this.create_user = create_user;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public Integer getUpdate_user() {
		return update_user;
	}
	public void setUpdate_user(Integer update_user) {
		this.update_user = update_user;
	}
	public String getIs_enabled() {
		return is_enabled;
	}
	public void setIs_enabled(String is_enabled) {
		this.is_enabled = is_enabled;
	}


	
	
	
	
	
	
}
