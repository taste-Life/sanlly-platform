package com.sanlly.production.models.output.referral;

/**
 * 维修班组待维修的箱子数
 * 
 * @Package com.sanlly.production.models.output.referral 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月11日 下午2:09:05 
 * @version V1.0   
 */
public class UserContainerNumberOutput {
	// 维修班组
	private Integer user;
	// 箱数
	private Integer number;

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}
