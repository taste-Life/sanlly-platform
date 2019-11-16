package com.sanlly.purchase.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TenderMoneyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public TenderMoneyExample() {
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

        public Criteria andPurcMatterTenderSuppierIdIsNull() {
            addCriterion("purc_matter_tender_suppier_id is null");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderSuppierIdIsNotNull() {
            addCriterion("purc_matter_tender_suppier_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderSuppierIdEqualTo(Integer value) {
            addCriterion("purc_matter_tender_suppier_id =", value, "purcMatterTenderSuppierId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderSuppierIdNotEqualTo(Integer value) {
            addCriterion("purc_matter_tender_suppier_id <>", value, "purcMatterTenderSuppierId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderSuppierIdGreaterThan(Integer value) {
            addCriterion("purc_matter_tender_suppier_id >", value, "purcMatterTenderSuppierId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderSuppierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purc_matter_tender_suppier_id >=", value, "purcMatterTenderSuppierId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderSuppierIdLessThan(Integer value) {
            addCriterion("purc_matter_tender_suppier_id <", value, "purcMatterTenderSuppierId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderSuppierIdLessThanOrEqualTo(Integer value) {
            addCriterion("purc_matter_tender_suppier_id <=", value, "purcMatterTenderSuppierId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderSuppierIdIn(List<Integer> values) {
            addCriterion("purc_matter_tender_suppier_id in", values, "purcMatterTenderSuppierId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderSuppierIdNotIn(List<Integer> values) {
            addCriterion("purc_matter_tender_suppier_id not in", values, "purcMatterTenderSuppierId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderSuppierIdBetween(Integer value1, Integer value2) {
            addCriterion("purc_matter_tender_suppier_id between", value1, value2, "purcMatterTenderSuppierId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderSuppierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purc_matter_tender_suppier_id not between", value1, value2, "purcMatterTenderSuppierId");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIsNull() {
            addCriterion("purchase_type is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIsNotNull() {
            addCriterion("purchase_type is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEqualTo(String value) {
            addCriterion("purchase_type =", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotEqualTo(String value) {
            addCriterion("purchase_type <>", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeGreaterThan(String value) {
            addCriterion("purchase_type >", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_type >=", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLessThan(String value) {
            addCriterion("purchase_type <", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLessThanOrEqualTo(String value) {
            addCriterion("purchase_type <=", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLike(String value) {
            addCriterion("purchase_type like", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotLike(String value) {
            addCriterion("purchase_type not like", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIn(List<String> values) {
            addCriterion("purchase_type in", values, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotIn(List<String> values) {
            addCriterion("purchase_type not in", values, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeBetween(String value1, String value2) {
            addCriterion("purchase_type between", value1, value2, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotBetween(String value1, String value2) {
            addCriterion("purchase_type not between", value1, value2, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andMoneyTopIsNull() {
            addCriterion("money_top is null");
            return (Criteria) this;
        }

        public Criteria andMoneyTopIsNotNull() {
            addCriterion("money_top is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyTopEqualTo(Integer value) {
            addCriterion("money_top =", value, "moneyTop");
            return (Criteria) this;
        }

        public Criteria andMoneyTopNotEqualTo(Integer value) {
            addCriterion("money_top <>", value, "moneyTop");
            return (Criteria) this;
        }

        public Criteria andMoneyTopGreaterThan(Integer value) {
            addCriterion("money_top >", value, "moneyTop");
            return (Criteria) this;
        }

        public Criteria andMoneyTopGreaterThanOrEqualTo(Integer value) {
            addCriterion("money_top >=", value, "moneyTop");
            return (Criteria) this;
        }

        public Criteria andMoneyTopLessThan(Integer value) {
            addCriterion("money_top <", value, "moneyTop");
            return (Criteria) this;
        }

        public Criteria andMoneyTopLessThanOrEqualTo(Integer value) {
            addCriterion("money_top <=", value, "moneyTop");
            return (Criteria) this;
        }

        public Criteria andMoneyTopIn(List<Integer> values) {
            addCriterion("money_top in", values, "moneyTop");
            return (Criteria) this;
        }

        public Criteria andMoneyTopNotIn(List<Integer> values) {
            addCriterion("money_top not in", values, "moneyTop");
            return (Criteria) this;
        }

        public Criteria andMoneyTopBetween(Integer value1, Integer value2) {
            addCriterion("money_top between", value1, value2, "moneyTop");
            return (Criteria) this;
        }

        public Criteria andMoneyTopNotBetween(Integer value1, Integer value2) {
            addCriterion("money_top not between", value1, value2, "moneyTop");
            return (Criteria) this;
        }

        public Criteria andMoneyLowIsNull() {
            addCriterion("money_low is null");
            return (Criteria) this;
        }

        public Criteria andMoneyLowIsNotNull() {
            addCriterion("money_low is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyLowEqualTo(Integer value) {
            addCriterion("money_low =", value, "moneyLow");
            return (Criteria) this;
        }

        public Criteria andMoneyLowNotEqualTo(Integer value) {
            addCriterion("money_low <>", value, "moneyLow");
            return (Criteria) this;
        }

        public Criteria andMoneyLowGreaterThan(Integer value) {
            addCriterion("money_low >", value, "moneyLow");
            return (Criteria) this;
        }

        public Criteria andMoneyLowGreaterThanOrEqualTo(Integer value) {
            addCriterion("money_low >=", value, "moneyLow");
            return (Criteria) this;
        }

        public Criteria andMoneyLowLessThan(Integer value) {
            addCriterion("money_low <", value, "moneyLow");
            return (Criteria) this;
        }

        public Criteria andMoneyLowLessThanOrEqualTo(Integer value) {
            addCriterion("money_low <=", value, "moneyLow");
            return (Criteria) this;
        }

        public Criteria andMoneyLowIn(List<Integer> values) {
            addCriterion("money_low in", values, "moneyLow");
            return (Criteria) this;
        }

        public Criteria andMoneyLowNotIn(List<Integer> values) {
            addCriterion("money_low not in", values, "moneyLow");
            return (Criteria) this;
        }

        public Criteria andMoneyLowBetween(Integer value1, Integer value2) {
            addCriterion("money_low between", value1, value2, "moneyLow");
            return (Criteria) this;
        }

        public Criteria andMoneyLowNotBetween(Integer value1, Integer value2) {
            addCriterion("money_low not between", value1, value2, "moneyLow");
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