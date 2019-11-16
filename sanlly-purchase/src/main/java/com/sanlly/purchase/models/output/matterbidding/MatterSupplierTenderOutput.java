package com.sanlly.purchase.models.output.matterbidding;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 
* @Package com.sanlly.purchase.models.output.matterbidding 
* @Description: 供应商报价记录 
* @author jlx   
* @date 2019年8月27日 上午11:06:59 
* @version V1.0   
 */
public class MatterSupplierTenderOutput {
	// 主键id
	private Integer purcSupplierTenderId;
	// 采购id
    private Integer tenderPurchaseId;
	// 供应商
    private String supplier;
    private String supplierLangLang;
	// 结算信用期
    private String settlementCycle;
    private String settlementCycleLangLang;
	// 评价等级
    private String grade;
    private String gradeLangLang;
	// 当前排名
    private Integer rank;
    // 是否推荐
    private String isRecommend;
	// 报价合计（按权重统计计算）
    private BigDecimal total;
	// 询价次数
    private Integer inquiryNum;
	// 竞价次数
    private Integer biddingNum;
	// 状态（是否中标）
    private String status;
    private  String statusLangLang;
	// 备注
    private String remark;
    // 报价时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    // 商品详细信息
    private List<MatterSupplierTenderProductOutput> productOutputList;

	public String getStatusLangLang() {
		return statusLangLang;
	}

	public void setStatusLangLang(String statusLangLang) {
		this.statusLangLang = statusLangLang;
	}

	public Integer getPurcSupplierTenderId() {
		return purcSupplierTenderId;
	}
	public void setPurcSupplierTenderId(Integer purcSupplierTenderId) {
		this.purcSupplierTenderId = purcSupplierTenderId;
	}
	public Integer getTenderPurchaseId() {
		return tenderPurchaseId;
	}
	public void setTenderPurchaseId(Integer tenderPurchaseId) {
		this.tenderPurchaseId = tenderPurchaseId;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getSupplierLangLang() {
		return supplierLangLang;
	}
	public void setSupplierLangLang(String supplierLangLang) {
		this.supplierLangLang = supplierLangLang;
	}
	public String getSettlementCycle() {
		return settlementCycle;
	}
	public void setSettlementCycle(String settlementCycle) {
		this.settlementCycle = settlementCycle;
	}
	public String getSettlementCycleLangLang() {
		return settlementCycleLangLang;
	}
	public void setSettlementCycleLangLang(String settlementCycleLangLang) {
		this.settlementCycleLangLang = settlementCycleLangLang;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGradeLangLang() {
		return gradeLangLang;
	}
	public void setGradeLangLang(String gradeLangLang) {
		this.gradeLangLang = gradeLangLang;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public String getIsRecommend() {
		return isRecommend;
	}
	public void setIsRecommend(String isRecommend) {
		this.isRecommend = isRecommend;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public Integer getInquiryNum() {
		return inquiryNum;
	}
	public void setInquiryNum(Integer inquiryNum) {
		this.inquiryNum = inquiryNum;
	}
	public Integer getBiddingNum() {
		return biddingNum;
	}
	public void setBiddingNum(Integer biddingNum) {
		this.biddingNum = biddingNum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public List<MatterSupplierTenderProductOutput> getProductOutputList() {
		return productOutputList;
	}
	public void setProductOutputList(List<MatterSupplierTenderProductOutput> productOutputList) {
		this.productOutputList = productOutputList;
	}
    
    
    
    
}
