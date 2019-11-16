package com.sanlly.purchase.models.input.demand;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
* @Package com.sanlly.purchase.models.input.demand
* @Description: 添加审核通过采购需求 
* @author jlx   
* @date 2019年8月19日 下午4:10:43 
* @version V1.0   
 */
public class AddMatterDemandInput implements Comparable<AddMatterDemandInput> {
	// 需求编号
	private String demandNo;
	// 是否日常采购
    private String isDayPruchase;
    // 备件号
    private String productNum;
    // 备件key
    private String product;
    // 大类
    private String genaralType;
    // 二级分类
    private String secondType;
    // 品牌
    private String productBrand;
    // 规格
    private String productSpecial;
    // 型号
    private String productModel;
    // 数量
    private Double productCount;
    // 要求到货日期
    private Date requireArriveTime;
    // 采购单位
    private String purchaseCompany;
    // 仓库
    private String warehouse;
    // 采购模式
    private String purchasingPattern;
    // 需求申请人
    private Integer applicantUserId;
    // 需求添加日期
    private Date demandTime;
    // 审核状态
    private String auditStatus;
    // 备注
    private String comments;
    

	@Override
	public int compareTo(AddMatterDemandInput input) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date dt1 = format.parse(format.format(this.getRequireArriveTime()));
			Date dt2 = format.parse(format.format(input.getRequireArriveTime()));
            // 这是由大向小排序   如果要由小向大转换比较符号就可以
			if (dt1.getTime() > dt2.getTime()) {
				return 1;
			} else if (dt1.getTime() < dt2.getTime()) {
				return -1;
			} else {
				return 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public String getDemandNo() {
		return demandNo;
	}
	public void setDemandNo(String demandNo) {
		this.demandNo = demandNo;
	}
	public String getIsDayPruchase() {
		return isDayPruchase;
	}
	public void setIsDayPruchase(String isDayPruchase) {
		this.isDayPruchase = isDayPruchase;
	}
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getGenaralType() {
		return genaralType;
	}
	public void setGenaralType(String genaralType) {
		this.genaralType = genaralType;
	}
	public String getSecondType() {
		return secondType;
	}
	public void setSecondType(String secondType) {
		this.secondType = secondType;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public String getProductSpecial() {
		return productSpecial;
	}
	public void setProductSpecial(String productSpecial) {
		this.productSpecial = productSpecial;
	}
	public String getProductModel() {
		return productModel;
	}
	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}
	public Double getProductCount() {
		return productCount;
	}
	public void setProductCount(Double productCount) {
		this.productCount = productCount;
	}
	public Date getRequireArriveTime() {
		return requireArriveTime;
	}
	public void setRequireArriveTime(Date requireArriveTime) {
		this.requireArriveTime = requireArriveTime;
	}
	public String getPurchaseCompany() {
		return purchaseCompany;
	}
	public void setPurchaseCompany(String purchaseCompany) {
		this.purchaseCompany = purchaseCompany;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	
	public String getPurchasingPattern() {
		return purchasingPattern;
	}
	public void setPurchasingPattern(String purchasingPattern) {
		this.purchasingPattern = purchasingPattern;
	}
	public Integer getApplicantUserId() {
		return applicantUserId;
	}
	public void setApplicantUserId(Integer applicantUserId) {
		this.applicantUserId = applicantUserId;
	}
	public Date getDemandTime() {
		return demandTime;
	}
	public void setDemandTime(Date demandTime) {
		this.demandTime = demandTime;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
    
    
}
