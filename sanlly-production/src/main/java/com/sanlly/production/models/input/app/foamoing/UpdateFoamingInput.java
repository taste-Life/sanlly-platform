package com.sanlly.production.models.input.app.foamoing;

/**
 * 发泡信息编辑
 * 
 * @Package com.sanlly.production.models.input.app.foamoing 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月3日 下午4:58:55 
 * @version V1.0   
 */
public class UpdateFoamingInput {
	// 进场id
	private String prodCourseId;
	// 备注
	private String remarks;
	// 发泡图片
	private String foamingPic;

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
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

}
