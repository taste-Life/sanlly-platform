package com.sanlly.production.models.output.foaming;

/**
 * 发泡列表
 * 
 * @Package com.sanlly.production.models.output.foaming 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月4日 下午2:11:43 
 * @version V1.0   
 */
public class SearchFoamingOutput {
	// 发泡id
	private Integer foamingId;
	// 箱号
	private String containerNo;
	// 用箱人
	private String containerUserLang;
	// 派工时间
	private String referralTime;
	// 进场类型
	private String courseTypeLang;
	// 场站
	private String yardLang;
	// 是否发泡
	private String isFoamingLang;
	// 图片
	private String photo;

	public Integer getFoamingId() {
		return foamingId;
	}

	public void setFoamingId(Integer foamingId) {
		this.foamingId = foamingId;
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

	public String getReferralTime() {
		return referralTime;
	}

	public void setReferralTime(String referralTime) {
		this.referralTime = referralTime;
	}

	public String getCourseTypeLang() {
		return courseTypeLang;
	}

	public void setCourseTypeLang(String courseTypeLang) {
		this.courseTypeLang = courseTypeLang;
	}

	public String getYardLang() {
		return yardLang;
	}

	public void setYardLang(String yardLang) {
		this.yardLang = yardLang;
	}

	public String getIsFoamingLang() {
		return isFoamingLang;
	}

	public void setIsFoamingLang(String isFoamingLang) {
		this.isFoamingLang = isFoamingLang;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
