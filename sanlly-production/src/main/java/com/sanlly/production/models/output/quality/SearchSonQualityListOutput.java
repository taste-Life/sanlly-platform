package com.sanlly.production.models.output.quality;

/**
 * 子公司现场质检列表输出
 * 
 * @Package com.sanlly.production.models.output.quality 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月10日 下午1:49:53 
 * @version V1.0   
 */
public class SearchSonQualityListOutput {
	// 进场id
	private String courseId;
	// 箱类别
	private String containerCategory;
	// 箱号
	private String containerNo;
	// 进场类型
	private String courseTypeLang;
	// 指派班组
	private String designateUser;
	// 用箱人
	private String containerUserLang;
	// 维修状态
	private String referralStateLang;
	// 质检结果
	private String qualityResult;
	// 质检类型
	private String qualityTypeLang;
	// 派工时间
	private String referralTime;
	// 完工时间
	private String finishTime;
	// 是否质检
	private String isQualityLang;
	// 质检员
	private String qualityUser;
	// 质检时间
	private String qualityTime;
	// 列背景色
	private Boolean isChangeBg;

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getCourseTypeLang() {
		return courseTypeLang;
	}

	public void setCourseTypeLang(String courseTypeLang) {
		this.courseTypeLang = courseTypeLang;
	}

	public String getDesignateUser() {
		return designateUser;
	}

	public void setDesignateUser(String designateUser) {
		this.designateUser = designateUser;
	}

	public String getContainerUserLang() {
		return containerUserLang;
	}

	public void setContainerUserLang(String containerUserLang) {
		this.containerUserLang = containerUserLang;
	}

	public String getReferralStateLang() {
		return referralStateLang;
	}

	public void setReferralStateLang(String referralStateLang) {
		this.referralStateLang = referralStateLang;
	}

	public String getQualityTypeLang() {
		return qualityTypeLang;
	}

	public void setQualityTypeLang(String qualityTypeLang) {
		this.qualityTypeLang = qualityTypeLang;
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

	public String getIsQualityLang() {
		return isQualityLang;
	}

	public void setIsQualityLang(String isQualityLang) {
		this.isQualityLang = isQualityLang;
	}

	public String getQualityUser() {
		return qualityUser;
	}

	public void setQualityUser(String qualityUser) {
		this.qualityUser = qualityUser;
	}

	public String getQualityTime() {
		return qualityTime;
	}

	public void setQualityTime(String qualityTime) {
		this.qualityTime = qualityTime;
	}

	public String getQualityResult() {
		return qualityResult;
	}

	public void setQualityResult(String qualityResult) {
		this.qualityResult = qualityResult;
	}

	public Boolean getIsChangeBg() {
		return isChangeBg;
	}

	public void setIsChangeBg(Boolean isChangeBg) {
		this.isChangeBg = isChangeBg;
	}

}
