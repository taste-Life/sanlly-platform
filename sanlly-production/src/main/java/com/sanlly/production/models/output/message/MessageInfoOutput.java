package com.sanlly.production.models.output.message;

/**
 * 列表数据实体
 * @author wangxzh
 *
 */
public class MessageInfoOutput {

	private Integer prodMessageRuleId;

	private String isCommon;

	private String containerUserLang;

	private String ruleName;

	private String ruleCondition;

	private String ruleConditionJson;

	private String sendType;

	private String sendTitle;

	private String contentFormat;

	private String receiveUser;

	private String receiveEmail;

	private String remark;

	public Integer getProdMessageRuleId() {
		return prodMessageRuleId;
	}

	public void setProdMessageRuleId(Integer prodMessageRuleId) {
		this.prodMessageRuleId = prodMessageRuleId;
	}

	public String getIsCommon() {
		return isCommon;
	}

	public void setIsCommon(String isCommon) {
		this.isCommon = isCommon;
	}

	public String getContainerUserLang() {
		return containerUserLang;
	}

	public void setContainerUserLang(String containerUserLang) {
		this.containerUserLang = containerUserLang;
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

	public String getRuleConditionJson() {
		return ruleConditionJson;
	}

	public void setRuleConditionJson(String ruleConditionJson) {
		this.ruleConditionJson = ruleConditionJson;
	}

	public String getSendType() {
		return sendType;
	}

	public void setSendType(String sendType) {
		this.sendType = sendType;
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

}
