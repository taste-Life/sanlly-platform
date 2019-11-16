package com.sanlly.production.models.input.containerTesting;

import java.math.BigDecimal;

/**
 * 保价费用
 * 
 * @Package com.sanlly.production.models.input.containerTesting 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月30日 上午11:34:47 
 * @version V1.0   
 */
public class ReferraMoneyInput {
	// 检验员等级
	private String grade;
	// 金额范围开始金额
	private BigDecimal beginMoney;
	// 金额范围结束金额
	private BigDecimal endMoney;
	// 估价状态
	private String valuationState;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public BigDecimal getBeginMoney() {
		return beginMoney;
	}

	public void setBeginMoney(BigDecimal beginMoney) {
		this.beginMoney = beginMoney;
	}

	public BigDecimal getEndMoney() {
		return endMoney;
	}

	public void setEndMoney(BigDecimal endMoney) {
		this.endMoney = endMoney;
	}

	public String getValuationState() {
		return valuationState;
	}

	public void setValuationState(String valuationState) {
		this.valuationState = valuationState;
	}

}
