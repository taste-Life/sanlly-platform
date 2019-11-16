package com.sanlly.production.models.output.containerTesting;

/**
 *    
 * 
 * @Package com.sanlly.production.models.output.containerTesting 
 * @Description: TODO 箱体进场检验列表实体-输出
 * @author tianzhl   
 * @date 2019年8月14日 上午11:32:37 
 * @version V1.0   
 */
public class ContainerTestingListOutput {

	// TODO 进场id
	private String prodCourseId;

	// TODO 箱号
	private String containerNo;

	// TODO 尺寸
	private String sizeLang;

	// TODO 箱类别
	private String containerCategoryLang;

	// TODO 箱型
	private String containerTypeLang;

	// TODO 场站
	private String yardLang;

	// TODO 用箱人
	private String containerUserLang;

	// TODO 进场类型
	private String courseTypeLang;

	// TODO 进场时间
	private String courseTime;

	// TODO 检验人
	private String testingUser;

	// TODO 检验状态
	private String testingStateNameLang;

	// TODO 箱东
	private String containerOwnerLang;

	// TODO 检验状态
	private String testingState;

	// TODO 检验时间
	private String testingTime;

	// TODO 检验备注
	private String testingRemarks;

	// TODO 箱况
	private String containerCondition;

	// TODO 箱况
	private String containerConditionNameLang;

	// TODO 是否有条目
	private Boolean hasEntry;

	// TODO 是否有未上传照片的
	private Boolean noPhoto;

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

	public String getSizeLang() {
		return sizeLang;
	}

	public void setSizeLang(String sizeLang) {
		this.sizeLang = sizeLang;
	}

	public String getContainerCategoryLang() {
		return containerCategoryLang;
	}

	public void setContainerCategoryLang(String containerCategoryLang) {
		this.containerCategoryLang = containerCategoryLang;
	}

	public String getContainerTypeLang() {
		return containerTypeLang;
	}

	public void setContainerTypeLang(String containerTypeLang) {
		this.containerTypeLang = containerTypeLang;
	}

	public String getYardLang() {
		return yardLang;
	}

	public void setYardLang(String yardLang) {
		this.yardLang = yardLang;
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

	public String getCourseTime() {
		return courseTime;
	}

	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}

	public String getTestingUser() {
		return testingUser;
	}

	public void setTestingUser(String testingUser) {
		this.testingUser = testingUser;
	}

	public String getTestingStateNameLang() {
		return testingStateNameLang;
	}

	public void setTestingStateNameLang(String testingStateNameLang) {
		this.testingStateNameLang = testingStateNameLang;
	}

	public String getContainerOwnerLang() {
		return containerOwnerLang;
	}

	public void setContainerOwnerLang(String containerOwnerLang) {
		this.containerOwnerLang = containerOwnerLang;
	}

	public String getTestingState() {
		return testingState;
	}

	public void setTestingState(String testingState) {
		this.testingState = testingState;
	}

	public String getTestingTime() {
		return testingTime;
	}

	public void setTestingTime(String testingTime) {
		this.testingTime = testingTime;
	}

	public String getTestingRemarks() {
		return testingRemarks;
	}

	public void setTestingRemarks(String testingRemarks) {
		this.testingRemarks = testingRemarks;
	}

	public String getContainerCondition() {
		return containerCondition;
	}

	public void setContainerCondition(String containerCondition) {
		this.containerCondition = containerCondition;
	}

	public String getContainerConditionNameLang() {
		return containerConditionNameLang;
	}

	public void setContainerConditionNameLang(String containerConditionNameLang) {
		this.containerConditionNameLang = containerConditionNameLang;
	}

	public Boolean getHasEntry() {
		return hasEntry;
	}

	public void setHasEntry(Boolean hasEntry) {
		this.hasEntry = hasEntry;
	}

	public Boolean getNoPhoto() {
		return noPhoto;
	}

	public void setNoPhoto(Boolean noPhoto) {
		this.noPhoto = noPhoto;
	}

}
