package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MessageRuleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andProdMessageRuleIdIsNull() {
            addCriterion("prod_message_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andProdMessageRuleIdIsNotNull() {
            addCriterion("prod_message_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdMessageRuleIdEqualTo(Integer value) {
            addCriterion("prod_message_rule_id =", value, "prodMessageRuleId");
            return (Criteria) this;
        }

        public Criteria andProdMessageRuleIdNotEqualTo(Integer value) {
            addCriterion("prod_message_rule_id <>", value, "prodMessageRuleId");
            return (Criteria) this;
        }

        public Criteria andProdMessageRuleIdGreaterThan(Integer value) {
            addCriterion("prod_message_rule_id >", value, "prodMessageRuleId");
            return (Criteria) this;
        }

        public Criteria andProdMessageRuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_message_rule_id >=", value, "prodMessageRuleId");
            return (Criteria) this;
        }

        public Criteria andProdMessageRuleIdLessThan(Integer value) {
            addCriterion("prod_message_rule_id <", value, "prodMessageRuleId");
            return (Criteria) this;
        }

        public Criteria andProdMessageRuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_message_rule_id <=", value, "prodMessageRuleId");
            return (Criteria) this;
        }

        public Criteria andProdMessageRuleIdIn(List<Integer> values) {
            addCriterion("prod_message_rule_id in", values, "prodMessageRuleId");
            return (Criteria) this;
        }

        public Criteria andProdMessageRuleIdNotIn(List<Integer> values) {
            addCriterion("prod_message_rule_id not in", values, "prodMessageRuleId");
            return (Criteria) this;
        }

        public Criteria andProdMessageRuleIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_message_rule_id between", value1, value2, "prodMessageRuleId");
            return (Criteria) this;
        }

        public Criteria andProdMessageRuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_message_rule_id not between", value1, value2, "prodMessageRuleId");
            return (Criteria) this;
        }

        public Criteria andIsCommonIsNull() {
            addCriterion("is_common is null");
            return (Criteria) this;
        }

        public Criteria andIsCommonIsNotNull() {
            addCriterion("is_common is not null");
            return (Criteria) this;
        }

        public Criteria andIsCommonEqualTo(String value) {
            addCriterion("is_common =", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonNotEqualTo(String value) {
            addCriterion("is_common <>", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonGreaterThan(String value) {
            addCriterion("is_common >", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonGreaterThanOrEqualTo(String value) {
            addCriterion("is_common >=", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonLessThan(String value) {
            addCriterion("is_common <", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonLessThanOrEqualTo(String value) {
            addCriterion("is_common <=", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonLike(String value) {
            addCriterion("is_common like", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonNotLike(String value) {
            addCriterion("is_common not like", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonIn(List<String> values) {
            addCriterion("is_common in", values, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonNotIn(List<String> values) {
            addCriterion("is_common not in", values, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonBetween(String value1, String value2) {
            addCriterion("is_common between", value1, value2, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonNotBetween(String value1, String value2) {
            addCriterion("is_common not between", value1, value2, "isCommon");
            return (Criteria) this;
        }

        public Criteria andContainerUserIsNull() {
            addCriterion("container_user is null");
            return (Criteria) this;
        }

        public Criteria andContainerUserIsNotNull() {
            addCriterion("container_user is not null");
            return (Criteria) this;
        }

        public Criteria andContainerUserEqualTo(String value) {
            addCriterion("container_user =", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserNotEqualTo(String value) {
            addCriterion("container_user <>", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserGreaterThan(String value) {
            addCriterion("container_user >", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserGreaterThanOrEqualTo(String value) {
            addCriterion("container_user >=", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserLessThan(String value) {
            addCriterion("container_user <", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserLessThanOrEqualTo(String value) {
            addCriterion("container_user <=", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserLike(String value) {
            addCriterion("container_user like", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserNotLike(String value) {
            addCriterion("container_user not like", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserIn(List<String> values) {
            addCriterion("container_user in", values, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserNotIn(List<String> values) {
            addCriterion("container_user not in", values, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserBetween(String value1, String value2) {
            addCriterion("container_user between", value1, value2, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserNotBetween(String value1, String value2) {
            addCriterion("container_user not between", value1, value2, "containerUser");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNull() {
            addCriterion("rule_name is null");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNotNull() {
            addCriterion("rule_name is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNameEqualTo(String value) {
            addCriterion("rule_name =", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotEqualTo(String value) {
            addCriterion("rule_name <>", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThan(String value) {
            addCriterion("rule_name >", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("rule_name >=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThan(String value) {
            addCriterion("rule_name <", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThanOrEqualTo(String value) {
            addCriterion("rule_name <=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLike(String value) {
            addCriterion("rule_name like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotLike(String value) {
            addCriterion("rule_name not like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameIn(List<String> values) {
            addCriterion("rule_name in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotIn(List<String> values) {
            addCriterion("rule_name not in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameBetween(String value1, String value2) {
            addCriterion("rule_name between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotBetween(String value1, String value2) {
            addCriterion("rule_name not between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleConditionIsNull() {
            addCriterion("rule_condition is null");
            return (Criteria) this;
        }

        public Criteria andRuleConditionIsNotNull() {
            addCriterion("rule_condition is not null");
            return (Criteria) this;
        }

        public Criteria andRuleConditionEqualTo(String value) {
            addCriterion("rule_condition =", value, "ruleCondition");
            return (Criteria) this;
        }

        public Criteria andRuleConditionNotEqualTo(String value) {
            addCriterion("rule_condition <>", value, "ruleCondition");
            return (Criteria) this;
        }

        public Criteria andRuleConditionGreaterThan(String value) {
            addCriterion("rule_condition >", value, "ruleCondition");
            return (Criteria) this;
        }

        public Criteria andRuleConditionGreaterThanOrEqualTo(String value) {
            addCriterion("rule_condition >=", value, "ruleCondition");
            return (Criteria) this;
        }

        public Criteria andRuleConditionLessThan(String value) {
            addCriterion("rule_condition <", value, "ruleCondition");
            return (Criteria) this;
        }

        public Criteria andRuleConditionLessThanOrEqualTo(String value) {
            addCriterion("rule_condition <=", value, "ruleCondition");
            return (Criteria) this;
        }

        public Criteria andRuleConditionLike(String value) {
            addCriterion("rule_condition like", value, "ruleCondition");
            return (Criteria) this;
        }

        public Criteria andRuleConditionNotLike(String value) {
            addCriterion("rule_condition not like", value, "ruleCondition");
            return (Criteria) this;
        }

        public Criteria andRuleConditionIn(List<String> values) {
            addCriterion("rule_condition in", values, "ruleCondition");
            return (Criteria) this;
        }

        public Criteria andRuleConditionNotIn(List<String> values) {
            addCriterion("rule_condition not in", values, "ruleCondition");
            return (Criteria) this;
        }

        public Criteria andRuleConditionBetween(String value1, String value2) {
            addCriterion("rule_condition between", value1, value2, "ruleCondition");
            return (Criteria) this;
        }

        public Criteria andRuleConditionNotBetween(String value1, String value2) {
            addCriterion("rule_condition not between", value1, value2, "ruleCondition");
            return (Criteria) this;
        }

        public Criteria andRuleConditionJsonIsNull() {
            addCriterion("rule_condition_json is null");
            return (Criteria) this;
        }

        public Criteria andRuleConditionJsonIsNotNull() {
            addCriterion("rule_condition_json is not null");
            return (Criteria) this;
        }

        public Criteria andRuleConditionJsonEqualTo(String value) {
            addCriterion("rule_condition_json =", value, "ruleConditionJson");
            return (Criteria) this;
        }

        public Criteria andRuleConditionJsonNotEqualTo(String value) {
            addCriterion("rule_condition_json <>", value, "ruleConditionJson");
            return (Criteria) this;
        }

        public Criteria andRuleConditionJsonGreaterThan(String value) {
            addCriterion("rule_condition_json >", value, "ruleConditionJson");
            return (Criteria) this;
        }

        public Criteria andRuleConditionJsonGreaterThanOrEqualTo(String value) {
            addCriterion("rule_condition_json >=", value, "ruleConditionJson");
            return (Criteria) this;
        }

        public Criteria andRuleConditionJsonLessThan(String value) {
            addCriterion("rule_condition_json <", value, "ruleConditionJson");
            return (Criteria) this;
        }

        public Criteria andRuleConditionJsonLessThanOrEqualTo(String value) {
            addCriterion("rule_condition_json <=", value, "ruleConditionJson");
            return (Criteria) this;
        }

        public Criteria andRuleConditionJsonLike(String value) {
            addCriterion("rule_condition_json like", value, "ruleConditionJson");
            return (Criteria) this;
        }

        public Criteria andRuleConditionJsonNotLike(String value) {
            addCriterion("rule_condition_json not like", value, "ruleConditionJson");
            return (Criteria) this;
        }

        public Criteria andRuleConditionJsonIn(List<String> values) {
            addCriterion("rule_condition_json in", values, "ruleConditionJson");
            return (Criteria) this;
        }

        public Criteria andRuleConditionJsonNotIn(List<String> values) {
            addCriterion("rule_condition_json not in", values, "ruleConditionJson");
            return (Criteria) this;
        }

        public Criteria andRuleConditionJsonBetween(String value1, String value2) {
            addCriterion("rule_condition_json between", value1, value2, "ruleConditionJson");
            return (Criteria) this;
        }

        public Criteria andRuleConditionJsonNotBetween(String value1, String value2) {
            addCriterion("rule_condition_json not between", value1, value2, "ruleConditionJson");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNull() {
            addCriterion("send_type is null");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNotNull() {
            addCriterion("send_type is not null");
            return (Criteria) this;
        }

        public Criteria andSendTypeEqualTo(String value) {
            addCriterion("send_type =", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotEqualTo(String value) {
            addCriterion("send_type <>", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThan(String value) {
            addCriterion("send_type >", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThanOrEqualTo(String value) {
            addCriterion("send_type >=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThan(String value) {
            addCriterion("send_type <", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThanOrEqualTo(String value) {
            addCriterion("send_type <=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLike(String value) {
            addCriterion("send_type like", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotLike(String value) {
            addCriterion("send_type not like", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeIn(List<String> values) {
            addCriterion("send_type in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotIn(List<String> values) {
            addCriterion("send_type not in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeBetween(String value1, String value2) {
            addCriterion("send_type between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotBetween(String value1, String value2) {
            addCriterion("send_type not between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTitleIsNull() {
            addCriterion("send_title is null");
            return (Criteria) this;
        }

        public Criteria andSendTitleIsNotNull() {
            addCriterion("send_title is not null");
            return (Criteria) this;
        }

        public Criteria andSendTitleEqualTo(String value) {
            addCriterion("send_title =", value, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleNotEqualTo(String value) {
            addCriterion("send_title <>", value, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleGreaterThan(String value) {
            addCriterion("send_title >", value, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleGreaterThanOrEqualTo(String value) {
            addCriterion("send_title >=", value, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleLessThan(String value) {
            addCriterion("send_title <", value, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleLessThanOrEqualTo(String value) {
            addCriterion("send_title <=", value, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleLike(String value) {
            addCriterion("send_title like", value, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleNotLike(String value) {
            addCriterion("send_title not like", value, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleIn(List<String> values) {
            addCriterion("send_title in", values, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleNotIn(List<String> values) {
            addCriterion("send_title not in", values, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleBetween(String value1, String value2) {
            addCriterion("send_title between", value1, value2, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andSendTitleNotBetween(String value1, String value2) {
            addCriterion("send_title not between", value1, value2, "sendTitle");
            return (Criteria) this;
        }

        public Criteria andContentFormatIsNull() {
            addCriterion("content_format is null");
            return (Criteria) this;
        }

        public Criteria andContentFormatIsNotNull() {
            addCriterion("content_format is not null");
            return (Criteria) this;
        }

        public Criteria andContentFormatEqualTo(String value) {
            addCriterion("content_format =", value, "contentFormat");
            return (Criteria) this;
        }

        public Criteria andContentFormatNotEqualTo(String value) {
            addCriterion("content_format <>", value, "contentFormat");
            return (Criteria) this;
        }

        public Criteria andContentFormatGreaterThan(String value) {
            addCriterion("content_format >", value, "contentFormat");
            return (Criteria) this;
        }

        public Criteria andContentFormatGreaterThanOrEqualTo(String value) {
            addCriterion("content_format >=", value, "contentFormat");
            return (Criteria) this;
        }

        public Criteria andContentFormatLessThan(String value) {
            addCriterion("content_format <", value, "contentFormat");
            return (Criteria) this;
        }

        public Criteria andContentFormatLessThanOrEqualTo(String value) {
            addCriterion("content_format <=", value, "contentFormat");
            return (Criteria) this;
        }

        public Criteria andContentFormatLike(String value) {
            addCriterion("content_format like", value, "contentFormat");
            return (Criteria) this;
        }

        public Criteria andContentFormatNotLike(String value) {
            addCriterion("content_format not like", value, "contentFormat");
            return (Criteria) this;
        }

        public Criteria andContentFormatIn(List<String> values) {
            addCriterion("content_format in", values, "contentFormat");
            return (Criteria) this;
        }

        public Criteria andContentFormatNotIn(List<String> values) {
            addCriterion("content_format not in", values, "contentFormat");
            return (Criteria) this;
        }

        public Criteria andContentFormatBetween(String value1, String value2) {
            addCriterion("content_format between", value1, value2, "contentFormat");
            return (Criteria) this;
        }

        public Criteria andContentFormatNotBetween(String value1, String value2) {
            addCriterion("content_format not between", value1, value2, "contentFormat");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIsNull() {
            addCriterion("receive_user is null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIsNotNull() {
            addCriterion("receive_user is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserEqualTo(String value) {
            addCriterion("receive_user =", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotEqualTo(String value) {
            addCriterion("receive_user <>", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserGreaterThan(String value) {
            addCriterion("receive_user >", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserGreaterThanOrEqualTo(String value) {
            addCriterion("receive_user >=", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLessThan(String value) {
            addCriterion("receive_user <", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLessThanOrEqualTo(String value) {
            addCriterion("receive_user <=", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLike(String value) {
            addCriterion("receive_user like", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotLike(String value) {
            addCriterion("receive_user not like", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIn(List<String> values) {
            addCriterion("receive_user in", values, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotIn(List<String> values) {
            addCriterion("receive_user not in", values, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserBetween(String value1, String value2) {
            addCriterion("receive_user between", value1, value2, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotBetween(String value1, String value2) {
            addCriterion("receive_user not between", value1, value2, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailIsNull() {
            addCriterion("receive_email is null");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailIsNotNull() {
            addCriterion("receive_email is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailEqualTo(String value) {
            addCriterion("receive_email =", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailNotEqualTo(String value) {
            addCriterion("receive_email <>", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailGreaterThan(String value) {
            addCriterion("receive_email >", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailGreaterThanOrEqualTo(String value) {
            addCriterion("receive_email >=", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailLessThan(String value) {
            addCriterion("receive_email <", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailLessThanOrEqualTo(String value) {
            addCriterion("receive_email <=", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailLike(String value) {
            addCriterion("receive_email like", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailNotLike(String value) {
            addCriterion("receive_email not like", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailIn(List<String> values) {
            addCriterion("receive_email in", values, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailNotIn(List<String> values) {
            addCriterion("receive_email not in", values, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailBetween(String value1, String value2) {
            addCriterion("receive_email between", value1, value2, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailNotBetween(String value1, String value2) {
            addCriterion("receive_email not between", value1, value2, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Integer value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Integer value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Integer value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Integer value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Integer value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Integer> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Integer> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Integer value1, Integer value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(Integer value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(Integer value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(Integer value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(Integer value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(Integer value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<Integer> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<Integer> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(Integer value1, Integer value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}