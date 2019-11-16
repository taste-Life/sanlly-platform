package com.sanlly.production.models.output.allot;

/**
 * 坏箱调拨输出类
 * @author zhangkai
 *
 */
public class AllotOutput {
	/*
	 * 主键id
	 */
	private Integer prodBadContainerAllocationId;
	/*
	 * 调出场站进场
	 */
    private String outCourse;
    /*
	 * 调入场站进场
	 */
    private String inCourse;
    /*
	 * 调拨编号
	 */
    private String allocationNo;
    /*
	 * 进场id
	 */
    private String course;
    /*
	 * 箱号
	 */
    private String containerNo;
    /*
	 * 调出场站
	 */
    private String exitYardLang;
    /*
     * 调出场站key
     */
    private String exitYardKey;
    /*
	 * 调入场站
	 */
    private String entryYardLang;
    /*
     * 调入场站key
     */
    private String entryYardKey;
    /*
	 * 用箱人
	 */
    private String containerUserLang;
    /*
     * 用箱人key
     */
    private String containerUserKey;
    /*
	 * 车队
	 */
    private String fleet;
    /*
	 * 车牌号
	 */
    private String plateNo;
    /*
	 * 费用
	 */
    private Long cost;
    /*
	 * 调箱时间
	 */
    private String allocationTime;
    /*
	 * 调拨状态
	 */
    private String stateLang;
    /*
     * 调拨状态key
     */
    private String stateKey;
    /*
	 * 调拨原因
	 */
    private String reason;
    /*
	 * 备注
	 */
    private String remark;
    /*
	 * 
	 */
    private Long costCenter;
    /*
	 * 调拨类型 调入、调回
	 */
    private String allocationTypeLang;
    /*
     * 调拨类型key 
     */
    private String allocationTypeKey;
    /*
	 * 指令发出人
	 */
    private String directiveIssuer;
    /*
	 * 指令发出时间
	 */
    private String directiveTime;
    /*
	 * 确认人
	 */
    private String identifyPeople;
    /*
	 * 确认时间
	 */
    private String identifyTime;
    
	public Integer getProdBadContainerAllocationId() {
		return prodBadContainerAllocationId;
	}
	public void setProdBadContainerAllocationId(Integer prodBadContainerAllocationId) {
		this.prodBadContainerAllocationId = prodBadContainerAllocationId;
	}
	public String getOutCourse() {
		return outCourse;
	}
	public void setOutCourse(String outCourse) {
		this.outCourse = outCourse;
	}
	public String getInCourse() {
		return inCourse;
	}
	public void setInCourse(String inCourse) {
		this.inCourse = inCourse;
	}
	public String getAllocationNo() {
		return allocationNo;
	}
	public void setAllocationNo(String allocationNo) {
		this.allocationNo = allocationNo;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getContainerNo() {
		return containerNo;
	}
	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}
	public String getExitYardLang() {
		return exitYardLang;
	}
	public void setExitYardLang(String exitYardLang) {
		this.exitYardLang = exitYardLang;
	}
	public String getExitYardKey() {
		return exitYardKey;
	}
	public void setExitYardKey(String exitYardKey) {
		this.exitYardKey = exitYardKey;
	}
	public String getEntryYardLang() {
		return entryYardLang;
	}
	public void setEntryYardLang(String entryYardLang) {
		this.entryYardLang = entryYardLang;
	}
	public String getEntryYardKey() {
		return entryYardKey;
	}
	public void setEntryYardKey(String entryYardKey) {
		this.entryYardKey = entryYardKey;
	}
	public String getContainerUserLang() {
		return containerUserLang;
	}
	public void setContainerUserLang(String containerUserLang) {
		this.containerUserLang = containerUserLang;
	}
	public String getContainerUserKey() {
		return containerUserKey;
	}
	public void setContainerUserKey(String containerUserKey) {
		this.containerUserKey = containerUserKey;
	}
	public String getFleet() {
		return fleet;
	}
	public void setFleet(String fleet) {
		this.fleet = fleet;
	}
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public Long getCost() {
		return cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}
	public String getAllocationTime() {
		return allocationTime;
	}
	public void setAllocationTime(String allocationTime) {
		this.allocationTime = allocationTime;
	}
	public String getStateLang() {
		return stateLang;
	}
	public void setStateLang(String stateLang) {
		this.stateLang = stateLang;
	}
	public String getStateKey() {
		return stateKey;
	}
	public void setStateKey(String stateKey) {
		this.stateKey = stateKey;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Long getCostCenter() {
		return costCenter;
	}
	public void setCostCenter(Long costCenter) {
		this.costCenter = costCenter;
	}
	public String getAllocationTypeLang() {
		return allocationTypeLang;
	}
	public void setAllocationTypeLang(String allocationTypeLang) {
		this.allocationTypeLang = allocationTypeLang;
	}
	public String getAllocationTypeKey() {
		return allocationTypeKey;
	}
	public void setAllocationTypeKey(String allocationTypeKey) {
		this.allocationTypeKey = allocationTypeKey;
	}
	public String getDirectiveIssuer() {
		return directiveIssuer;
	}
	public void setDirectiveIssuer(String directiveIssuer) {
		this.directiveIssuer = directiveIssuer;
	}
	public String getDirectiveTime() {
		return directiveTime;
	}
	public void setDirectiveTime(String directiveTime) {
		this.directiveTime = directiveTime;
	}
	public String getIdentifyPeople() {
		return identifyPeople;
	}
	public void setIdentifyPeople(String identifyPeople) {
		this.identifyPeople = identifyPeople;
	}
	public String getIdentifyTime() {
		return identifyTime;
	}
	public void setIdentifyTime(String identifyTime) {
		this.identifyTime = identifyTime;
	}
	
    
}
