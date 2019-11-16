package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PtiRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PtiRateExample() {
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

        public Criteria andProdPtiRateIdIsNull() {
            addCriterion("prod_pti_rate_id is null");
            return (Criteria) this;
        }

        public Criteria andProdPtiRateIdIsNotNull() {
            addCriterion("prod_pti_rate_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdPtiRateIdEqualTo(Integer value) {
            addCriterion("prod_pti_rate_id =", value, "prodPtiRateId");
            return (Criteria) this;
        }

        public Criteria andProdPtiRateIdNotEqualTo(Integer value) {
            addCriterion("prod_pti_rate_id <>", value, "prodPtiRateId");
            return (Criteria) this;
        }

        public Criteria andProdPtiRateIdGreaterThan(Integer value) {
            addCriterion("prod_pti_rate_id >", value, "prodPtiRateId");
            return (Criteria) this;
        }

        public Criteria andProdPtiRateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_pti_rate_id >=", value, "prodPtiRateId");
            return (Criteria) this;
        }

        public Criteria andProdPtiRateIdLessThan(Integer value) {
            addCriterion("prod_pti_rate_id <", value, "prodPtiRateId");
            return (Criteria) this;
        }

        public Criteria andProdPtiRateIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_pti_rate_id <=", value, "prodPtiRateId");
            return (Criteria) this;
        }

        public Criteria andProdPtiRateIdIn(List<Integer> values) {
            addCriterion("prod_pti_rate_id in", values, "prodPtiRateId");
            return (Criteria) this;
        }

        public Criteria andProdPtiRateIdNotIn(List<Integer> values) {
            addCriterion("prod_pti_rate_id not in", values, "prodPtiRateId");
            return (Criteria) this;
        }

        public Criteria andProdPtiRateIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_pti_rate_id between", value1, value2, "prodPtiRateId");
            return (Criteria) this;
        }

        public Criteria andProdPtiRateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_pti_rate_id not between", value1, value2, "prodPtiRateId");
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

        public Criteria andContainerUserEqualTo(Integer value) {
            addCriterion("container_user =", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserNotEqualTo(Integer value) {
            addCriterion("container_user <>", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserGreaterThan(Integer value) {
            addCriterion("container_user >", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("container_user >=", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserLessThan(Integer value) {
            addCriterion("container_user <", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserLessThanOrEqualTo(Integer value) {
            addCriterion("container_user <=", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserIn(List<Integer> values) {
            addCriterion("container_user in", values, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserNotIn(List<Integer> values) {
            addCriterion("container_user not in", values, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserBetween(Integer value1, Integer value2) {
            addCriterion("container_user between", value1, value2, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserNotBetween(Integer value1, Integer value2) {
            addCriterion("container_user not between", value1, value2, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerSizeIsNull() {
            addCriterion("container_size is null");
            return (Criteria) this;
        }

        public Criteria andContainerSizeIsNotNull() {
            addCriterion("container_size is not null");
            return (Criteria) this;
        }

        public Criteria andContainerSizeEqualTo(String value) {
            addCriterion("container_size =", value, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeNotEqualTo(String value) {
            addCriterion("container_size <>", value, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeGreaterThan(String value) {
            addCriterion("container_size >", value, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeGreaterThanOrEqualTo(String value) {
            addCriterion("container_size >=", value, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeLessThan(String value) {
            addCriterion("container_size <", value, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeLessThanOrEqualTo(String value) {
            addCriterion("container_size <=", value, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeLike(String value) {
            addCriterion("container_size like", value, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeNotLike(String value) {
            addCriterion("container_size not like", value, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeIn(List<String> values) {
            addCriterion("container_size in", values, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeNotIn(List<String> values) {
            addCriterion("container_size not in", values, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeBetween(String value1, String value2) {
            addCriterion("container_size between", value1, value2, "containerSize");
            return (Criteria) this;
        }

        public Criteria andContainerSizeNotBetween(String value1, String value2) {
            addCriterion("container_size not between", value1, value2, "containerSize");
            return (Criteria) this;
        }

        public Criteria andPtiTypeIsNull() {
            addCriterion("pti_type is null");
            return (Criteria) this;
        }

        public Criteria andPtiTypeIsNotNull() {
            addCriterion("pti_type is not null");
            return (Criteria) this;
        }

        public Criteria andPtiTypeEqualTo(String value) {
            addCriterion("pti_type =", value, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeNotEqualTo(String value) {
            addCriterion("pti_type <>", value, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeGreaterThan(String value) {
            addCriterion("pti_type >", value, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pti_type >=", value, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeLessThan(String value) {
            addCriterion("pti_type <", value, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeLessThanOrEqualTo(String value) {
            addCriterion("pti_type <=", value, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeLike(String value) {
            addCriterion("pti_type like", value, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeNotLike(String value) {
            addCriterion("pti_type not like", value, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeIn(List<String> values) {
            addCriterion("pti_type in", values, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeNotIn(List<String> values) {
            addCriterion("pti_type not in", values, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeBetween(String value1, String value2) {
            addCriterion("pti_type between", value1, value2, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiTypeNotBetween(String value1, String value2) {
            addCriterion("pti_type not between", value1, value2, "ptiType");
            return (Criteria) this;
        }

        public Criteria andPtiRateIsNull() {
            addCriterion("pti_rate is null");
            return (Criteria) this;
        }

        public Criteria andPtiRateIsNotNull() {
            addCriterion("pti_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPtiRateEqualTo(Long value) {
            addCriterion("pti_rate =", value, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateNotEqualTo(Long value) {
            addCriterion("pti_rate <>", value, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateGreaterThan(Long value) {
            addCriterion("pti_rate >", value, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateGreaterThanOrEqualTo(Long value) {
            addCriterion("pti_rate >=", value, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateLessThan(Long value) {
            addCriterion("pti_rate <", value, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateLessThanOrEqualTo(Long value) {
            addCriterion("pti_rate <=", value, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateIn(List<Long> values) {
            addCriterion("pti_rate in", values, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateNotIn(List<Long> values) {
            addCriterion("pti_rate not in", values, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateBetween(Long value1, Long value2) {
            addCriterion("pti_rate between", value1, value2, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateNotBetween(Long value1, Long value2) {
            addCriterion("pti_rate not between", value1, value2, "ptiRate");
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