package com.sanlly.production.enums;

/**
 * 自动排程五个条件
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月10日 下午3:59:07 
 * @version V1.0   
 */
public enum AutomationPriorityEnum {
	/**
	 * 用箱人
	 */
	CONTAINERUSER("AutomationEnum01", "ContainerPriority", 1),
	/**
	 * 用箱人维修周期
	 */
	REPAIRPERIOD("AutomationEnum02", "RepairPeriod", 1),
	/**
	 * 紧急程度
	 */
	URGENCY("AutomationEnum03", "Grade", -1),
	/**
	 * 工时
	 */
	MANHOUR("AutomationEnum04", "ManHour", 1),
	/**
	 * 派工时长
	 */
	REFERRALTIME("AutomationEnum05", "ReferralHours", -1);

	private String code;

	private String message;
	// 使用1，-1对比较结果集操作，已达到排序操作
	private Integer base;

	AutomationPriorityEnum() {

	}

	AutomationPriorityEnum(String code, String message, Integer base) {
		this.code = code;
		this.message = message;
		this.base = base;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getBase() {
		return base;
	}

	public void setBase(Integer base) {
		this.base = base;
	}

	public static AutomationPriorityEnum getMessageByCode(String code) {
		for (AutomationPriorityEnum automation : AutomationPriorityEnum.values()) {
			if (code.equals(automation.getCode())) {
				return automation;
			}
		}
		return null;
	}
}
