package com.sanlly.production.models.output.app.Foaming;

/**
 * 发泡列表app
 * 
 * @Package com.sanlly.production.models.output.app.Foaming 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月3日 下午1:55:44 
 * @version V1.0   
 */
public class SearchFoamingAppOutput {
	// 进场id
	private String prodCourseId;
	// 箱号
	private String containerNo;
	// 备注
	private String remarks;
	// 发泡图片
	private String foamingPic;
	// 发泡人
	private String foamingUser;
	// 发泡时间
	private String foamingDate;
	// 发泡状态
	private String foamingState;

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getFoamingPic() {
		return foamingPic;
	}

	public void setFoamingPic(String foamingPic) {
		this.foamingPic = foamingPic;
	}

	public String getFoamingUser() {
		return foamingUser;
	}

	public void setFoamingUser(String foamingUser) {
		this.foamingUser = foamingUser;
	}

	public String getFoamingDate() {
		return foamingDate;
	}

	public void setFoamingDate(String foamingDate) {
		this.foamingDate = foamingDate;
	}

	public String getFoamingState() {
		return foamingState;
	}

	public void setFoamingState(String foamingState) {
		this.foamingState = foamingState;
	}

}
