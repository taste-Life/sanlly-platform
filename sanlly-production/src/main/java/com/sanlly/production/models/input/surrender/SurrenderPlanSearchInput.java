package com.sanlly.production.models.input.surrender;

import com.sanlly.common.models.input.PageInput;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.surrender 
 * @Description: TODO 退租箱-退租计划
 * @author tianzhl   
 * @date 2019年10月21日 上午10:57:24 
 * @version V1.0   
 */
public class SurrenderPlanSearchInput extends PageInput {

	// TODO 计划号
	private String planNo;

	// TODO 开始时间
	private String startTime;

	// TODO 结束时间
	private String endTime;

	// TODO 是否有效
	private String isValid;

	// TODO 计划状态
	private String planState;

	public String getPlanNo() {
		return planNo;
	}

	public void setPlanNo(String planNo) {
		this.planNo = planNo;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getIsValid() {
		return isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	public String getPlanState() {
		return planState;
	}

	public void setPlanState(String planState) {
		this.planState = planState;
	}

}