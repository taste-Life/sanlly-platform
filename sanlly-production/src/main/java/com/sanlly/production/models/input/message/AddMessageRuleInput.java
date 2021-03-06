package com.sanlly.production.models.input.message;

/**
 * 消息规则新增实体
 * @author wangxzh
 *
 */
public class AddMessageRuleInput {

	private String isCommon;

	private String contUserKey;

	private String ruleName;

	private String ruleCondition;

	private String ruleConditionJson;

	private Integer sendType;

	private String sendTitle;

	private String contentFormat;

	private String receiveUser;

	private String receiveEmail;

	private String remark;

	public String getContUserKey() {
		return contUserKey;
	}

	public void setContUserKey(String contUserKey) {
		this.contUserKey = contUserKey;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleCondition() {
		return ruleCondition;
	}

	public void setRuleCondition(String ruleCondition) {
		this.ruleCondition = ruleCondition;
	}

	public Integer getSendType() {
		return sendType;
	}

	public void setSendType(Integer sendType) {
		this.sendType = sendType;
	}

	public String getIsCommon() {
		return isCommon;
	}

	public void setIsCommon(String isCommon) {
		this.isCommon = isCommon;
	}

	public String getSendTitle() {
		return sendTitle;
	}

	public void setSendTitle(String sendTitle) {
		this.sendTitle = sendTitle;
	}

	public String getContentFormat() {
		return contentFormat;
	}

	public void setContentFormat(String contentFormat) {
		this.contentFormat = contentFormat;
	}

	public String getReceiveUser() {
		return receiveUser;
	}

	public void setReceiveUser(String receiveUser) {
		this.receiveUser = receiveUser;
	}

	public String getReceiveEmail() {
		return receiveEmail;
	}

	public void setReceiveEmail(String receiveEmail) {
		this.receiveEmail = receiveEmail;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRuleConditionJson() {
		return ruleConditionJson;
	}

	public void setRuleConditionJson(String ruleConditionJson) {
		this.ruleConditionJson = ruleConditionJson;
	}

}
