package com.sanlly.production.models.input.referral;

import java.util.List;

/**
 * 派工主表实体
 * 
 * @Package com.sanlly.production.models.input.referral 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月5日 下午2:47:24 
 * @version V1.0   
 */
public class AddReferralInput {
	// 进场id
	private String course;
	// 派工单明细
	private List<AddReferralEntryInput> entryList;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public List<AddReferralEntryInput> getEntryList() {
		return entryList;
	}

	public void setEntryList(List<AddReferralEntryInput> entryList) {
		this.entryList = entryList;
	}

}
