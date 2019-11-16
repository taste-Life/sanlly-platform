package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MessageExample() {
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

        public Criteria andProdMessageIdIsNull() {
            addCriterion("prod_message_id is null");
            return (Criteria) this;
        }

        public Criteria andProdMessageIdIsNotNull() {
            addCriterion("prod_message_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdMessageIdEqualTo(Integer value) {
            addCriterion("prod_message_id =", value, "prodMessageId");
            return (Criteria) this;
        }

        public Criteria andProdMessageIdNotEqualTo(Integer value) {
            addCriterion("prod_message_id <>", value, "prodMessageId");
            return (Criteria) this;
        }

        public Criteria andProdMessageIdGreaterThan(Integer value) {
            addCriterion("prod_message_id >", value, "prodMessageId");
            return (Criteria) this;
        }

        public Criteria andProdMessageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_message_id >=", value, "prodMessageId");
            return (Criteria) this;
        }

        public Criteria andProdMessageIdLessThan(Integer value) {
            addCriterion("prod_message_id <", value, "prodMessageId");
            return (Criteria) this;
        }

        public Criteria andProdMessageIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_message_id <=", value, "prodMessageId");
            return (Criteria) this;
        }

        public Criteria andProdMessageIdIn(List<Integer> values) {
            addCriterion("prod_message_id in", values, "prodMessageId");
            return (Criteria) this;
        }

        public Criteria andProdMessageIdNotIn(List<Integer> values) {
            addCriterion("prod_message_id not in", values, "prodMessageId");
            return (Criteria) this;
        }

        public Criteria andProdMessageIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_message_id between", value1, value2, "prodMessageId");
            return (Criteria) this;
        }

        public Criteria andProdMessageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_message_id not between", value1, value2, "prodMessageId");
            return (Criteria) this;
        }

        public Criteria andMessageNotifierIsNull() {
            addCriterion("message_notifier is null");
            return (Criteria) this;
        }

        public Criteria andMessageNotifierIsNotNull() {
            addCriterion("message_notifier is not null");
            return (Criteria) this;
        }

        public Criteria andMessageNotifierEqualTo(String value) {
            addCriterion("message_notifier =", value, "messageNotifier");
            return (Criteria) this;
        }

        public Criteria andMessageNotifierNotEqualTo(String value) {
            addCriterion("message_notifier <>", value, "messageNotifier");
            return (Criteria) this;
        }

        public Criteria andMessageNotifierGreaterThan(String value) {
            addCriterion("message_notifier >", value, "messageNotifier");
            return (Criteria) this;
        }

        public Criteria andMessageNotifierGreaterThanOrEqualTo(String value) {
            addCriterion("message_notifier >=", value, "messageNotifier");
            return (Criteria) this;
        }

        public Criteria andMessageNotifierLessThan(String value) {
            addCriterion("message_notifier <", value, "messageNotifier");
            return (Criteria) this;
        }

        public Criteria andMessageNotifierLessThanOrEqualTo(String value) {
            addCriterion("message_notifier <=", value, "messageNotifier");
            return (Criteria) this;
        }

        public Criteria andMessageNotifierLike(String value) {
            addCriterion("message_notifier like", value, "messageNotifier");
            return (Criteria) this;
        }

        public Criteria andMessageNotifierNotLike(String value) {
            addCriterion("message_notifier not like", value, "messageNotifier");
            return (Criteria) this;
        }

        public Criteria andMessageNotifierIn(List<String> values) {
            addCriterion("message_notifier in", values, "messageNotifier");
            return (Criteria) this;
        }

        public Criteria andMessageNotifierNotIn(List<String> values) {
            addCriterion("message_notifier not in", values, "messageNotifier");
            return (Criteria) this;
        }

        public Criteria andMessageNotifierBetween(String value1, String value2) {
            addCriterion("message_notifier between", value1, value2, "messageNotifier");
            return (Criteria) this;
        }

        public Criteria andMessageNotifierNotBetween(String value1, String value2) {
            addCriterion("message_notifier not between", value1, value2, "messageNotifier");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andYardIsNull() {
            addCriterion("yard is null");
            return (Criteria) this;
        }

        public Criteria andYardIsNotNull() {
            addCriterion("yard is not null");
            return (Criteria) this;
        }

        public Criteria andYardEqualTo(String value) {
            addCriterion("yard =", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotEqualTo(String value) {
            addCriterion("yard <>", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardGreaterThan(String value) {
            addCriterion("yard >", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardGreaterThanOrEqualTo(String value) {
            addCriterion("yard >=", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardLessThan(String value) {
            addCriterion("yard <", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardLessThanOrEqualTo(String value) {
            addCriterion("yard <=", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardLike(String value) {
            addCriterion("yard like", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotLike(String value) {
            addCriterion("yard not like", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardIn(List<String> values) {
            addCriterion("yard in", values, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotIn(List<String> values) {
            addCriterion("yard not in", values, "yard");
            return (Criteria) this;
        }

        public Criteria andYardBetween(String value1, String value2) {
            addCriterion("yard between", value1, value2, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotBetween(String value1, String value2) {
            addCriterion("yard not between", value1, value2, "yard");
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

        public Criteria andContainerNoIsNull() {
            addCriterion("container_no is null");
            return (Criteria) this;
        }

        public Criteria andContainerNoIsNotNull() {
            addCriterion("container_no is not null");
            return (Criteria) this;
        }

        public Criteria andContainerNoEqualTo(String value) {
            addCriterion("container_no =", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotEqualTo(String value) {
            addCriterion("container_no <>", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoGreaterThan(String value) {
            addCriterion("container_no >", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoGreaterThanOrEqualTo(String value) {
            addCriterion("container_no >=", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoLessThan(String value) {
            addCriterion("container_no <", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoLessThanOrEqualTo(String value) {
            addCriterion("container_no <=", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoLike(String value) {
            addCriterion("container_no like", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotLike(String value) {
            addCriterion("container_no not like", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoIn(List<String> values) {
            addCriterion("container_no in", values, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotIn(List<String> values) {
            addCriterion("container_no not in", values, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoBetween(String value1, String value2) {
            addCriterion("container_no between", value1, value2, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotBetween(String value1, String value2) {
            addCriterion("container_no not between", value1, value2, "containerNo");
            return (Criteria) this;
        }

        public Criteria andInformMethodIsNull() {
            addCriterion("inform_method is null");
            return (Criteria) this;
        }

        public Criteria andInformMethodIsNotNull() {
            addCriterion("inform_method is not null");
            return (Criteria) this;
        }

        public Criteria andInformMethodEqualTo(String value) {
            addCriterion("inform_method =", value, "informMethod");
            return (Criteria) this;
        }

        public Criteria andInformMethodNotEqualTo(String value) {
            addCriterion("inform_method <>", value, "informMethod");
            return (Criteria) this;
        }

        public Criteria andInformMethodGreaterThan(String value) {
            addCriterion("inform_method >", value, "informMethod");
            return (Criteria) this;
        }

        public Criteria andInformMethodGreaterThanOrEqualTo(String value) {
            addCriterion("inform_method >=", value, "informMethod");
            return (Criteria) this;
        }

        public Criteria andInformMethodLessThan(String value) {
            addCriterion("inform_method <", value, "informMethod");
            return (Criteria) this;
        }

        public Criteria andInformMethodLessThanOrEqualTo(String value) {
            addCriterion("inform_method <=", value, "informMethod");
            return (Criteria) this;
        }

        public Criteria andInformMethodLike(String value) {
            addCriterion("inform_method like", value, "informMethod");
            return (Criteria) this;
        }

        public Criteria andInformMethodNotLike(String value) {
            addCriterion("inform_method not like", value, "informMethod");
            return (Criteria) this;
        }

        public Criteria andInformMethodIn(List<String> values) {
            addCriterion("inform_method in", values, "informMethod");
            return (Criteria) this;
        }

        public Criteria andInformMethodNotIn(List<String> values) {
            addCriterion("inform_method not in", values, "informMethod");
            return (Criteria) this;
        }

        public Criteria andInformMethodBetween(String value1, String value2) {
            addCriterion("inform_method between", value1, value2, "informMethod");
            return (Criteria) this;
        }

        public Criteria andInformMethodNotBetween(String value1, String value2) {
            addCriterion("inform_method not between", value1, value2, "informMethod");
            return (Criteria) this;
        }

        public Criteria andInformTypeIsNull() {
            addCriterion("inform_type is null");
            return (Criteria) this;
        }

        public Criteria andInformTypeIsNotNull() {
            addCriterion("inform_type is not null");
            return (Criteria) this;
        }

        public Criteria andInformTypeEqualTo(String value) {
            addCriterion("inform_type =", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeNotEqualTo(String value) {
            addCriterion("inform_type <>", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeGreaterThan(String value) {
            addCriterion("inform_type >", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeGreaterThanOrEqualTo(String value) {
            addCriterion("inform_type >=", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeLessThan(String value) {
            addCriterion("inform_type <", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeLessThanOrEqualTo(String value) {
            addCriterion("inform_type <=", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeLike(String value) {
            addCriterion("inform_type like", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeNotLike(String value) {
            addCriterion("inform_type not like", value, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeIn(List<String> values) {
            addCriterion("inform_type in", values, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeNotIn(List<String> values) {
            addCriterion("inform_type not in", values, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeBetween(String value1, String value2) {
            addCriterion("inform_type between", value1, value2, "informType");
            return (Criteria) this;
        }

        public Criteria andInformTypeNotBetween(String value1, String value2) {
            addCriterion("inform_type not between", value1, value2, "informType");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andInformTitleIsNull() {
            addCriterion("inform_title is null");
            return (Criteria) this;
        }

        public Criteria andInformTitleIsNotNull() {
            addCriterion("inform_title is not null");
            return (Criteria) this;
        }

        public Criteria andInformTitleEqualTo(String value) {
            addCriterion("inform_title =", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleNotEqualTo(String value) {
            addCriterion("inform_title <>", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleGreaterThan(String value) {
            addCriterion("inform_title >", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleGreaterThanOrEqualTo(String value) {
            addCriterion("inform_title >=", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleLessThan(String value) {
            addCriterion("inform_title <", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleLessThanOrEqualTo(String value) {
            addCriterion("inform_title <=", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleLike(String value) {
            addCriterion("inform_title like", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleNotLike(String value) {
            addCriterion("inform_title not like", value, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleIn(List<String> values) {
            addCriterion("inform_title in", values, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleNotIn(List<String> values) {
            addCriterion("inform_title not in", values, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleBetween(String value1, String value2) {
            addCriterion("inform_title between", value1, value2, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformTitleNotBetween(String value1, String value2) {
            addCriterion("inform_title not between", value1, value2, "informTitle");
            return (Criteria) this;
        }

        public Criteria andInformContentIsNull() {
            addCriterion("inform_content is null");
            return (Criteria) this;
        }

        public Criteria andInformContentIsNotNull() {
            addCriterion("inform_content is not null");
            return (Criteria) this;
        }

        public Criteria andInformContentEqualTo(String value) {
            addCriterion("inform_content =", value, "informContent");
            return (Criteria) this;
        }

        public Criteria andInformContentNotEqualTo(String value) {
            addCriterion("inform_content <>", value, "informContent");
            return (Criteria) this;
        }

        public Criteria andInformContentGreaterThan(String value) {
            addCriterion("inform_content >", value, "informContent");
            return (Criteria) this;
        }

        public Criteria andInformContentGreaterThanOrEqualTo(String value) {
            addCriterion("inform_content >=", value, "informContent");
            return (Criteria) this;
        }

        public Criteria andInformContentLessThan(String value) {
            addCriterion("inform_content <", value, "informContent");
            return (Criteria) this;
        }

        public Criteria andInformContentLessThanOrEqualTo(String value) {
            addCriterion("inform_content <=", value, "informContent");
            return (Criteria) this;
        }

        public Criteria andInformContentLike(String value) {
            addCriterion("inform_content like", value, "informContent");
            return (Criteria) this;
        }

        public Criteria andInformContentNotLike(String value) {
            addCriterion("inform_content not like", value, "informContent");
            return (Criteria) this;
        }

        public Criteria andInformContentIn(List<String> values) {
            addCriterion("inform_content in", values, "informContent");
            return (Criteria) this;
        }

        public Criteria andInformContentNotIn(List<String> values) {
            addCriterion("inform_content not in", values, "informContent");
            return (Criteria) this;
        }

        public Criteria andInformContentBetween(String value1, String value2) {
            addCriterion("inform_content between", value1, value2, "informContent");
            return (Criteria) this;
        }

        public Criteria andInformContentNotBetween(String value1, String value2) {
            addCriterion("inform_content not between", value1, value2, "informContent");
            return (Criteria) this;
        }

        public Criteria andIsHaveInformIsNull() {
            addCriterion("is_have_inform is null");
            return (Criteria) this;
        }

        public Criteria andIsHaveInformIsNotNull() {
            addCriterion("is_have_inform is not null");
            return (Criteria) this;
        }

        public Criteria andIsHaveInformEqualTo(Integer value) {
            addCriterion("is_have_inform =", value, "isHaveInform");
            return (Criteria) this;
        }

        public Criteria andIsHaveInformNotEqualTo(Integer value) {
            addCriterion("is_have_inform <>", value, "isHaveInform");
            return (Criteria) this;
        }

        public Criteria andIsHaveInformGreaterThan(Integer value) {
            addCriterion("is_have_inform >", value, "isHaveInform");
            return (Criteria) this;
        }

        public Criteria andIsHaveInformGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_have_inform >=", value, "isHaveInform");
            return (Criteria) this;
        }

        public Criteria andIsHaveInformLessThan(Integer value) {
            addCriterion("is_have_inform <", value, "isHaveInform");
            return (Criteria) this;
        }

        public Criteria andIsHaveInformLessThanOrEqualTo(Integer value) {
            addCriterion("is_have_inform <=", value, "isHaveInform");
            return (Criteria) this;
        }

        public Criteria andIsHaveInformIn(List<Integer> values) {
            addCriterion("is_have_inform in", values, "isHaveInform");
            return (Criteria) this;
        }

        public Criteria andIsHaveInformNotIn(List<Integer> values) {
            addCriterion("is_have_inform not in", values, "isHaveInform");
            return (Criteria) this;
        }

        public Criteria andIsHaveInformBetween(Integer value1, Integer value2) {
            addCriterion("is_have_inform between", value1, value2, "isHaveInform");
            return (Criteria) this;
        }

        public Criteria andIsHaveInformNotBetween(Integer value1, Integer value2) {
            addCriterion("is_have_inform not between", value1, value2, "isHaveInform");
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