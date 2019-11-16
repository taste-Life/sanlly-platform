package com.sanlly.warehouse.models.input.laborInsurance.laborStaff;

import java.util.Date;
/**
 * 用户劳保信息类
 * @author zhh
 * 2019年8月22日 上午10:08:23
 */
public class LaborStaffInput {
	//身高
	private Double height;
    //体重
    private Double weight;
    //夏装型号
    private String summerWear;
    //春秋装型号
    private String springAutumnWear;
    //棉衣型号
    private String cottonPaddedClothes;
    //矮帮钢头鞋
    private Integer steelHeadedShoesShort;
    //高帮钢头鞋
    private Integer steelHeadedShoesHigh;
    //绝缘鞋型号
    private Integer insulatingShoes;
    //棉鞋型号
    private Integer cottonPaddedShoes;
    //雨衣型号
    private String rainCoat;
    //雨鞋型号
    private Integer rainShoes;
    //入职时间
    private Date initiationTime;
    //离职时间
    private Date leaveTime;
    //离职状态
    private String isLeave;
    //启用状态
    private String isEnabled;
    
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getSummerWear() {
		return summerWear;
	}
	public void setSummerWear(String summerWear) {
		this.summerWear = summerWear;
	}
	public String getSpringAutumnWear() {
		return springAutumnWear;
	}
	public void setSpringAutumnWear(String springAutumnWear) {
		this.springAutumnWear = springAutumnWear;
	}
	public String getCottonPaddedClothes() {
		return cottonPaddedClothes;
	}
	public void setCottonPaddedClothes(String cottonPaddedClothes) {
		this.cottonPaddedClothes = cottonPaddedClothes;
	}
	public Integer getSteelHeadedShoesShort() {
		return steelHeadedShoesShort;
	}
	public void setSteelHeadedShoesShort(Integer steelHeadedShoesShort) {
		this.steelHeadedShoesShort = steelHeadedShoesShort;
	}
	public Integer getSteelHeadedShoesHigh() {
		return steelHeadedShoesHigh;
	}
	public void setSteelHeadedShoesHigh(Integer steelHeadedShoesHigh) {
		this.steelHeadedShoesHigh = steelHeadedShoesHigh;
	}
	public Integer getInsulatingShoes() {
		return insulatingShoes;
	}
	public void setInsulatingShoes(Integer insulatingShoes) {
		this.insulatingShoes = insulatingShoes;
	}
	public Integer getCottonPaddedShoes() {
		return cottonPaddedShoes;
	}
	public void setCottonPaddedShoes(Integer cottonPaddedShoes) {
		this.cottonPaddedShoes = cottonPaddedShoes;
	}
	public String getRainCoat() {
		return rainCoat;
	}
	public void setRainCoat(String rainCoat) {
		this.rainCoat = rainCoat;
	}
	public Integer getRainShoes() {
		return rainShoes;
	}
	public void setRainShoes(Integer rainShoes) {
		this.rainShoes = rainShoes;
	}
	public Date getInitiationTime() {
		return initiationTime;
	}
	public void setInitiationTime(Date initiationTime) {
		this.initiationTime = initiationTime;
	}
	
	public Date getLeaveTime() {
		return leaveTime;
	}
	public void setLeaveTime(Date leaveTime) {
		this.leaveTime = leaveTime;
	}
	public String getIsEnabled() {
		return isEnabled;
	}
	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}
	public String getIsLeave() {
		return isLeave;
	}
	public void setIsLeave(String isLeave) {
		this.isLeave = isLeave;
	}
    
}
