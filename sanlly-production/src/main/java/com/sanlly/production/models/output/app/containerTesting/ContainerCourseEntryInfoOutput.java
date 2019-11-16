package com.sanlly.production.models.output.app.containerTesting;

import java.util.List;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.app.containerTesting 
 * @Description: TODO 箱体进场条目信息实体-输出
 * @author tianzhl   
 * @date 2019年8月9日 下午5:00:23 
 * @version V1.0   
 */
public class ContainerCourseEntryInfoOutput {

	// TODO 修后照片
	private String afterPhoto;
	// TODO 速验照片
	private String speedPhoto;
	// TODO 箱照片
	private String testingPhoto;
	// TODO 签字照片
	private String signaturePic;
	// TODO 是否预检区
	private String isPreview;
	// TODO 条目明细列表
	private List<ContainerCourseEntryOutput> dataList;

	public String getAfterPhoto() {
		return afterPhoto;
	}

	public void setAfterPhoto(String afterPhoto) {
		this.afterPhoto = afterPhoto;
	}

	public String getSpeedPhoto() {
		return speedPhoto;
	}

	public void setSpeedPhoto(String speedPhoto) {
		this.speedPhoto = speedPhoto;
	}

	public String getTestingPhoto() {
		return testingPhoto;
	}

	public void setTestingPhoto(String testingPhoto) {
		this.testingPhoto = testingPhoto;
	}

	public String getSignaturePic() {
		return signaturePic;
	}

	public void setSignaturePic(String signaturePic) {
		this.signaturePic = signaturePic;
	}

	public String getIsPreview() {
		return isPreview;
	}

	public void setIsPreview(String isPreview) {
		this.isPreview = isPreview;
	}

	public List<ContainerCourseEntryOutput> getDataList() {
		return dataList;
	}

	public void setDataList(List<ContainerCourseEntryOutput> dataList) {
		this.dataList = dataList;
	}

}
