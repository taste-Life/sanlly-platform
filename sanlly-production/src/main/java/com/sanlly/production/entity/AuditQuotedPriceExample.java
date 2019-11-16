package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuditQuotedPriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public AuditQuotedPriceExample() {
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

        public Criteria andProdAuditQuotedPriceIdIsNull() {
            addCriterion("prod_audit_quoted_price_id is null");
            return (Criteria) this;
        }

        public Criteria andProdAuditQuotedPriceIdIsNotNull() {
            addCriterion("prod_audit_quoted_price_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdAuditQuotedPriceIdEqualTo(Integer value) {
            addCriterion("prod_audit_quoted_price_id =", value, "prodAuditQuotedPriceId");
            return (Criteria) this;
        }

        public Criteria andProdAuditQuotedPriceIdNotEqualTo(Integer value) {
            addCriterion("prod_audit_quoted_price_id <>", value, "prodAuditQuotedPriceId");
            return (Criteria) this;
        }

        public Criteria andProdAuditQuotedPriceIdGreaterThan(Integer value) {
            addCriterion("prod_audit_quoted_price_id >", value, "prodAuditQuotedPriceId");
            return (Criteria) this;
        }

        public Criteria andProdAuditQuotedPriceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_audit_quoted_price_id >=", value, "prodAuditQuotedPriceId");
            return (Criteria) this;
        }

        public Criteria andProdAuditQuotedPriceIdLessThan(Integer value) {
            addCriterion("prod_audit_quoted_price_id <", value, "prodAuditQuotedPriceId");
            return (Criteria) this;
        }

        public Criteria andProdAuditQuotedPriceIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_audit_quoted_price_id <=", value, "prodAuditQuotedPriceId");
            return (Criteria) this;
        }

        public Criteria andProdAuditQuotedPriceIdIn(List<Integer> values) {
            addCriterion("prod_audit_quoted_price_id in", values, "prodAuditQuotedPriceId");
            return (Criteria) this;
        }

        public Criteria andProdAuditQuotedPriceIdNotIn(List<Integer> values) {
            addCriterion("prod_audit_quoted_price_id not in", values, "prodAuditQuotedPriceId");
            return (Criteria) this;
        }

        public Criteria andProdAuditQuotedPriceIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_audit_quoted_price_id between", value1, value2, "prodAuditQuotedPriceId");
            return (Criteria) this;
        }

        public Criteria andProdAuditQuotedPriceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_audit_quoted_price_id not between", value1, value2, "prodAuditQuotedPriceId");
            return (Criteria) this;
        }

        public Criteria andAuditIdIsNull() {
            addCriterion("audit_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditIdIsNotNull() {
            addCriterion("audit_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditIdEqualTo(Integer value) {
            addCriterion("audit_id =", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotEqualTo(Integer value) {
            addCriterion("audit_id <>", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdGreaterThan(Integer value) {
            addCriterion("audit_id >", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_id >=", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdLessThan(Integer value) {
            addCriterion("audit_id <", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdLessThanOrEqualTo(Integer value) {
            addCriterion("audit_id <=", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdIn(List<Integer> values) {
            addCriterion("audit_id in", values, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotIn(List<Integer> values) {
            addCriterion("audit_id not in", values, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdBetween(Integer value1, Integer value2) {
            addCriterion("audit_id between", value1, value2, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_id not between", value1, value2, "auditId");
            return (Criteria) this;
        }

        public Criteria andTestingUserGradeIsNull() {
            addCriterion("testing_user_grade is null");
            return (Criteria) this;
        }

        public Criteria andTestingUserGradeIsNotNull() {
            addCriterion("testing_user_grade is not null");
            return (Criteria) this;
        }

        public Criteria andTestingUserGradeEqualTo(String value) {
            addCriterion("testing_user_grade =", value, "testingUserGrade");
            return (Criteria) this;
        }

        public Criteria andTestingUserGradeNotEqualTo(String value) {
            addCriterion("testing_user_grade <>", value, "testingUserGrade");
            return (Criteria) this;
        }

        public Criteria andTestingUserGradeGreaterThan(String value) {
            addCriterion("testing_user_grade >", value, "testingUserGrade");
            return (Criteria) this;
        }

        public Criteria andTestingUserGradeGreaterThanOrEqualTo(String value) {
            addCriterion("testing_user_grade >=", value, "testingUserGrade");
            return (Criteria) this;
        }

        public Criteria andTestingUserGradeLessThan(String value) {
            addCriterion("testing_user_grade <", value, "testingUserGrade");
            return (Criteria) this;
        }

        public Criteria andTestingUserGradeLessThanOrEqualTo(String value) {
            addCriterion("testing_user_grade <=", value, "testingUserGrade");
            return (Criteria) this;
        }

        public Criteria andTestingUserGradeLike(String value) {
            addCriterion("testing_user_grade like", value, "testingUserGrade");
            return (Criteria) this;
        }

        public Criteria andTestingUserGradeNotLike(String value) {
            addCriterion("testing_user_grade not like", value, "testingUserGrade");
            return (Criteria) this;
        }

        public Criteria andTestingUserGradeIn(List<String> values) {
            addCriterion("testing_user_grade in", values, "testingUserGrade");
            return (Criteria) this;
        }

        public Criteria andTestingUserGradeNotIn(List<String> values) {
            addCriterion("testing_user_grade not in", values, "testingUserGrade");
            return (Criteria) this;
        }

        public Criteria andTestingUserGradeBetween(String value1, String value2) {
            addCriterion("testing_user_grade between", value1, value2, "testingUserGrade");
            return (Criteria) this;
        }

        public Criteria andTestingUserGradeNotBetween(String value1, String value2) {
            addCriterion("testing_user_grade not between", value1, value2, "testingUserGrade");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyIsNull() {
            addCriterion("begin_money is null");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyIsNotNull() {
            addCriterion("begin_money is not null");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyEqualTo(BigDecimal value) {
            addCriterion("begin_money =", value, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyNotEqualTo(BigDecimal value) {
            addCriterion("begin_money <>", value, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyGreaterThan(BigDecimal value) {
            addCriterion("begin_money >", value, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("begin_money >=", value, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyLessThan(BigDecimal value) {
            addCriterion("begin_money <", value, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("begin_money <=", value, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyIn(List<BigDecimal> values) {
            addCriterion("begin_money in", values, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyNotIn(List<BigDecimal> values) {
            addCriterion("begin_money not in", values, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("begin_money between", value1, value2, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("begin_money not between", value1, value2, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyIsNull() {
            addCriterion("end_money is null");
            return (Criteria) this;
        }

        public Criteria andEndMoneyIsNotNull() {
            addCriterion("end_money is not null");
            return (Criteria) this;
        }

        public Criteria andEndMoneyEqualTo(BigDecimal value) {
            addCriterion("end_money =", value, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyNotEqualTo(BigDecimal value) {
            addCriterion("end_money <>", value, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyGreaterThan(BigDecimal value) {
            addCriterion("end_money >", value, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("end_money >=", value, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyLessThan(BigDecimal value) {
            addCriterion("end_money <", value, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("end_money <=", value, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyIn(List<BigDecimal> values) {
            addCriterion("end_money in", values, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyNotIn(List<BigDecimal> values) {
            addCriterion("end_money not in", values, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("end_money between", value1, value2, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("end_money not between", value1, value2, "endMoney");
            return (Criteria) this;
        }

        public Criteria andValuationStateIsNull() {
            addCriterion("valuation_state is null");
            return (Criteria) this;
        }

        public Criteria andValuationStateIsNotNull() {
            addCriterion("valuation_state is not null");
            return (Criteria) this;
        }

        public Criteria andValuationStateEqualTo(String value) {
            addCriterion("valuation_state =", value, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateNotEqualTo(String value) {
            addCriterion("valuation_state <>", value, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateGreaterThan(String value) {
            addCriterion("valuation_state >", value, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateGreaterThanOrEqualTo(String value) {
            addCriterion("valuation_state >=", value, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateLessThan(String value) {
            addCriterion("valuation_state <", value, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateLessThanOrEqualTo(String value) {
            addCriterion("valuation_state <=", value, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateLike(String value) {
            addCriterion("valuation_state like", value, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateNotLike(String value) {
            addCriterion("valuation_state not like", value, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateIn(List<String> values) {
            addCriterion("valuation_state in", values, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateNotIn(List<String> values) {
            addCriterion("valuation_state not in", values, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateBetween(String value1, String value2) {
            addCriterion("valuation_state between", value1, value2, "valuationState");
            return (Criteria) this;
        }

        public Criteria andValuationStateNotBetween(String value1, String value2) {
            addCriterion("valuation_state not between", value1, value2, "valuationState");
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