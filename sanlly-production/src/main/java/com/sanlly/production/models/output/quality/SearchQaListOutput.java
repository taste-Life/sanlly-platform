package com.sanlly.production.models.output.quality;

/**
 * 安全品控质检
 * 
 * @Package com.sanlly.production.models.output.quality 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月19日 上午10:57:25 
 * @version V1.0   
 */
public class SearchQaListOutput {
	// 进场id
	private String courseId;
	// 箱类别
	private String containerCategoryKey;
	// 箱类别
	private String containerCategoryLang;
	// 箱号
	private String containerNo;
	// 用箱人
	private String containerUserLang;
	// 进场类型
	private String courseTypeLang;
	// 公司
	private String companyLang;
	// 场站
	private String yardLang;
	// 班组
	private String designateUser;
	// 派工时间
	private String referralTime;
	// 完工时间
	private String finishTime;
	// 子公司质检结果
	private String qualityResultLang;
	// 品控质检结果
	private String pkQualityStateKey;
	// 品控质检结果
	private String pkQualityStateLang;

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getContainerCategoryKey() {
		return containerCategoryKey;
	}

	public void setContainerCategoryKey(String containerCategoryKey) {
		this.containerCategoryKey = containerCategoryKey;
	}

	public String getContainerCategoryLang() {
		return containerCategoryLang;
	}

	public void setContainerCategoryLang(String containerCategoryLang) {
		this.containerCategoryLang = containerCategoryLang;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getContainerUserLang() {
		return containerUserLang;
	}

	public void setContainerUserLang(String containerUserLang) {
		this.containerUserLang = containerUserLang;
	}

	public String getCourseTypeLang() {
		return courseTypeLang;
	}

	public void setCourseTypeLang(String courseTypeLang) {
		this.courseTypeLang = courseTypeLang;
	}

	public String getCompanyLang() {
		return companyLang;
	}

	public void setCompanyLang(String companyLang) {
		this.companyLang = companyLang;
	}

	public String getYardLang() {
		return yardLang;
	}

	public void setYardLang(String yardLang) {
		this.yardLang = yardLang;
	}

	public String getDesignateUser() {
		return designateUser;
	}

	public void setDesignateUser(String designateUser) {
		this.designateUser = designateUser;
	}

	public String getReferralTime() {
		return referralTime;
	}

	public void setReferralTime(String referralTime) {
		this.referralTime = referralTime;
	}

	public String getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public String getQualityResultLang() {
		return qualityResultLang;
	}

	public void setQualityResultLang(String qualityResultLang) {
		this.qualityResultLang = qualityResultLang;
	}

	public String getPkQualityStateKey() {
		return pkQualityStateKey;
	}

	public void setPkQualityStateKey(String pkQualityStateKey) {
		this.pkQualityStateKey = pkQualityStateKey;
	}

	public String getPkQualityStateLang() {
		return pkQualityStateLang;
	}

	public void setPkQualityStateLang(String pkQualityStateLang) {
		this.pkQualityStateLang = pkQualityStateLang;
	}

}
