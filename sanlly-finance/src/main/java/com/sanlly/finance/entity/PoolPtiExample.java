package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PoolPtiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PoolPtiExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdIsNull() {
            addCriterion("prod_course_id is null");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdIsNotNull() {
            addCriterion("prod_course_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdEqualTo(String value) {
            addCriterion("prod_course_id =", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdNotEqualTo(String value) {
            addCriterion("prod_course_id <>", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdGreaterThan(String value) {
            addCriterion("prod_course_id >", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("prod_course_id >=", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdLessThan(String value) {
            addCriterion("prod_course_id <", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdLessThanOrEqualTo(String value) {
            addCriterion("prod_course_id <=", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdLike(String value) {
            addCriterion("prod_course_id like", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdNotLike(String value) {
            addCriterion("prod_course_id not like", value, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdIn(List<String> values) {
            addCriterion("prod_course_id in", values, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdNotIn(List<String> values) {
            addCriterion("prod_course_id not in", values, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdBetween(String value1, String value2) {
            addCriterion("prod_course_id between", value1, value2, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdCourseIdNotBetween(String value1, String value2) {
            addCriterion("prod_course_id not between", value1, value2, "prodCourseId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdIsNull() {
            addCriterion("prod_container_id is null");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdIsNotNull() {
            addCriterion("prod_container_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdEqualTo(Integer value) {
            addCriterion("prod_container_id =", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdNotEqualTo(Integer value) {
            addCriterion("prod_container_id <>", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdGreaterThan(Integer value) {
            addCriterion("prod_container_id >", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_container_id >=", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdLessThan(Integer value) {
            addCriterion("prod_container_id <", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_container_id <=", value, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdIn(List<Integer> values) {
            addCriterion("prod_container_id in", values, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdNotIn(List<Integer> values) {
            addCriterion("prod_container_id not in", values, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_container_id between", value1, value2, "prodContainerId");
            return (Criteria) this;
        }

        public Criteria andProdContainerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_container_id not between", value1, value2, "prodContainerId");
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

        public Criteria andNumberIsNull() {
            addCriterion("`number` is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("`number` is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("`number` =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("`number` <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("`number` >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("`number` >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("`number` <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("`number` <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("`number` in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("`number` not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("`number` between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("`number` not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andPtiCostIsNull() {
            addCriterion("pti_cost is null");
            return (Criteria) this;
        }

        public Criteria andPtiCostIsNotNull() {
            addCriterion("pti_cost is not null");
            return (Criteria) this;
        }

        public Criteria andPtiCostEqualTo(BigDecimal value) {
            addCriterion("pti_cost =", value, "ptiCost");
            return (Criteria) this;
        }

        public Criteria andPtiCostNotEqualTo(BigDecimal value) {
            addCriterion("pti_cost <>", value, "ptiCost");
            return (Criteria) this;
        }

        public Criteria andPtiCostGreaterThan(BigDecimal value) {
            addCriterion("pti_cost >", value, "ptiCost");
            return (Criteria) this;
        }

        public Criteria andPtiCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pti_cost >=", value, "ptiCost");
            return (Criteria) this;
        }

        public Criteria andPtiCostLessThan(BigDecimal value) {
            addCriterion("pti_cost <", value, "ptiCost");
            return (Criteria) this;
        }

        public Criteria andPtiCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pti_cost <=", value, "ptiCost");
            return (Criteria) this;
        }

        public Criteria andPtiCostIn(List<BigDecimal> values) {
            addCriterion("pti_cost in", values, "ptiCost");
            return (Criteria) this;
        }

        public Criteria andPtiCostNotIn(List<BigDecimal> values) {
            addCriterion("pti_cost not in", values, "ptiCost");
            return (Criteria) this;
        }

        public Criteria andPtiCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pti_cost between", value1, value2, "ptiCost");
            return (Criteria) this;
        }

        public Criteria andPtiCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pti_cost not between", value1, value2, "ptiCost");
            return (Criteria) this;
        }

        public Criteria andPtiOkdateIsNull() {
            addCriterion("pti_okdate is null");
            return (Criteria) this;
        }

        public Criteria andPtiOkdateIsNotNull() {
            addCriterion("pti_okdate is not null");
            return (Criteria) this;
        }

        public Criteria andPtiOkdateEqualTo(Date value) {
            addCriterion("pti_okdate =", value, "ptiOkdate");
            return (Criteria) this;
        }

        public Criteria andPtiOkdateNotEqualTo(Date value) {
            addCriterion("pti_okdate <>", value, "ptiOkdate");
            return (Criteria) this;
        }

        public Criteria andPtiOkdateGreaterThan(Date value) {
            addCriterion("pti_okdate >", value, "ptiOkdate");
            return (Criteria) this;
        }

        public Criteria andPtiOkdateGreaterThanOrEqualTo(Date value) {
            addCriterion("pti_okdate >=", value, "ptiOkdate");
            return (Criteria) this;
        }

        public Criteria andPtiOkdateLessThan(Date value) {
            addCriterion("pti_okdate <", value, "ptiOkdate");
            return (Criteria) this;
        }

        public Criteria andPtiOkdateLessThanOrEqualTo(Date value) {
            addCriterion("pti_okdate <=", value, "ptiOkdate");
            return (Criteria) this;
        }

        public Criteria andPtiOkdateIn(List<Date> values) {
            addCriterion("pti_okdate in", values, "ptiOkdate");
            return (Criteria) this;
        }

        public Criteria andPtiOkdateNotIn(List<Date> values) {
            addCriterion("pti_okdate not in", values, "ptiOkdate");
            return (Criteria) this;
        }

        public Criteria andPtiOkdateBetween(Date value1, Date value2) {
            addCriterion("pti_okdate between", value1, value2, "ptiOkdate");
            return (Criteria) this;
        }

        public Criteria andPtiOkdateNotBetween(Date value1, Date value2) {
            addCriterion("pti_okdate not between", value1, value2, "ptiOkdate");
            return (Criteria) this;
        }

        public Criteria andOldCostIsNull() {
            addCriterion("old_cost is null");
            return (Criteria) this;
        }

        public Criteria andOldCostIsNotNull() {
            addCriterion("old_cost is not null");
            return (Criteria) this;
        }

        public Criteria andOldCostEqualTo(BigDecimal value) {
            addCriterion("old_cost =", value, "oldCost");
            return (Criteria) this;
        }

        public Criteria andOldCostNotEqualTo(BigDecimal value) {
            addCriterion("old_cost <>", value, "oldCost");
            return (Criteria) this;
        }

        public Criteria andOldCostGreaterThan(BigDecimal value) {
            addCriterion("old_cost >", value, "oldCost");
            return (Criteria) this;
        }

        public Criteria andOldCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("old_cost >=", value, "oldCost");
            return (Criteria) this;
        }

        public Criteria andOldCostLessThan(BigDecimal value) {
            addCriterion("old_cost <", value, "oldCost");
            return (Criteria) this;
        }

        public Criteria andOldCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("old_cost <=", value, "oldCost");
            return (Criteria) this;
        }

        public Criteria andOldCostIn(List<BigDecimal> values) {
            addCriterion("old_cost in", values, "oldCost");
            return (Criteria) this;
        }

        public Criteria andOldCostNotIn(List<BigDecimal> values) {
            addCriterion("old_cost not in", values, "oldCost");
            return (Criteria) this;
        }

        public Criteria andOldCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_cost between", value1, value2, "oldCost");
            return (Criteria) this;
        }

        public Criteria andOldCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_cost not between", value1, value2, "oldCost");
            return (Criteria) this;
        }

        public Criteria andOldCurrencyTypeIsNull() {
            addCriterion("old_currency_type is null");
            return (Criteria) this;
        }

        public Criteria andOldCurrencyTypeIsNotNull() {
            addCriterion("old_currency_type is not null");
            return (Criteria) this;
        }

        public Criteria andOldCurrencyTypeEqualTo(String value) {
            addCriterion("old_currency_type =", value, "oldCurrencyType");
            return (Criteria) this;
        }

        public Criteria andOldCurrencyTypeNotEqualTo(String value) {
            addCriterion("old_currency_type <>", value, "oldCurrencyType");
            return (Criteria) this;
        }

        public Criteria andOldCurrencyTypeGreaterThan(String value) {
            addCriterion("old_currency_type >", value, "oldCurrencyType");
            return (Criteria) this;
        }

        public Criteria andOldCurrencyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("old_currency_type >=", value, "oldCurrencyType");
            return (Criteria) this;
        }

        public Criteria andOldCurrencyTypeLessThan(String value) {
            addCriterion("old_currency_type <", value, "oldCurrencyType");
            return (Criteria) this;
        }

        public Criteria andOldCurrencyTypeLessThanOrEqualTo(String value) {
            addCriterion("old_currency_type <=", value, "oldCurrencyType");
            return (Criteria) this;
        }

        public Criteria andOldCurrencyTypeLike(String value) {
            addCriterion("old_currency_type like", value, "oldCurrencyType");
            return (Criteria) this;
        }

        public Criteria andOldCurrencyTypeNotLike(String value) {
            addCriterion("old_currency_type not like", value, "oldCurrencyType");
            return (Criteria) this;
        }

        public Criteria andOldCurrencyTypeIn(List<String> values) {
            addCriterion("old_currency_type in", values, "oldCurrencyType");
            return (Criteria) this;
        }

        public Criteria andOldCurrencyTypeNotIn(List<String> values) {
            addCriterion("old_currency_type not in", values, "oldCurrencyType");
            return (Criteria) this;
        }

        public Criteria andOldCurrencyTypeBetween(String value1, String value2) {
            addCriterion("old_currency_type between", value1, value2, "oldCurrencyType");
            return (Criteria) this;
        }

        public Criteria andOldCurrencyTypeNotBetween(String value1, String value2) {
            addCriterion("old_currency_type not between", value1, value2, "oldCurrencyType");
            return (Criteria) this;
        }

        public Criteria andCurrentRateIsNull() {
            addCriterion("current_rate is null");
            return (Criteria) this;
        }

        public Criteria andCurrentRateIsNotNull() {
            addCriterion("current_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentRateEqualTo(BigDecimal value) {
            addCriterion("current_rate =", value, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateNotEqualTo(BigDecimal value) {
            addCriterion("current_rate <>", value, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateGreaterThan(BigDecimal value) {
            addCriterion("current_rate >", value, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_rate >=", value, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateLessThan(BigDecimal value) {
            addCriterion("current_rate <", value, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_rate <=", value, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateIn(List<BigDecimal> values) {
            addCriterion("current_rate in", values, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateNotIn(List<BigDecimal> values) {
            addCriterion("current_rate not in", values, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_rate between", value1, value2, "currentRate");
            return (Criteria) this;
        }

        public Criteria andCurrentRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_rate not between", value1, value2, "currentRate");
            return (Criteria) this;
        }

        public Criteria andIsFormulaIsNull() {
            addCriterion("is_formula is null");
            return (Criteria) this;
        }

        public Criteria andIsFormulaIsNotNull() {
            addCriterion("is_formula is not null");
            return (Criteria) this;
        }

        public Criteria andIsFormulaEqualTo(String value) {
            addCriterion("is_formula =", value, "isFormula");
            return (Criteria) this;
        }

        public Criteria andIsFormulaNotEqualTo(String value) {
            addCriterion("is_formula <>", value, "isFormula");
            return (Criteria) this;
        }

        public Criteria andIsFormulaGreaterThan(String value) {
            addCriterion("is_formula >", value, "isFormula");
            return (Criteria) this;
        }

        public Criteria andIsFormulaGreaterThanOrEqualTo(String value) {
            addCriterion("is_formula >=", value, "isFormula");
            return (Criteria) this;
        }

        public Criteria andIsFormulaLessThan(String value) {
            addCriterion("is_formula <", value, "isFormula");
            return (Criteria) this;
        }

        public Criteria andIsFormulaLessThanOrEqualTo(String value) {
            addCriterion("is_formula <=", value, "isFormula");
            return (Criteria) this;
        }

        public Criteria andIsFormulaLike(String value) {
            addCriterion("is_formula like", value, "isFormula");
            return (Criteria) this;
        }

        public Criteria andIsFormulaNotLike(String value) {
            addCriterion("is_formula not like", value, "isFormula");
            return (Criteria) this;
        }

        public Criteria andIsFormulaIn(List<String> values) {
            addCriterion("is_formula in", values, "isFormula");
            return (Criteria) this;
        }

        public Criteria andIsFormulaNotIn(List<String> values) {
            addCriterion("is_formula not in", values, "isFormula");
            return (Criteria) this;
        }

        public Criteria andIsFormulaBetween(String value1, String value2) {
            addCriterion("is_formula between", value1, value2, "isFormula");
            return (Criteria) this;
        }

        public Criteria andIsFormulaNotBetween(String value1, String value2) {
            addCriterion("is_formula not between", value1, value2, "isFormula");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaIsNull() {
            addCriterion("compute_formula is null");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaIsNotNull() {
            addCriterion("compute_formula is not null");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaEqualTo(String value) {
            addCriterion("compute_formula =", value, "computeFormula");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaNotEqualTo(String value) {
            addCriterion("compute_formula <>", value, "computeFormula");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaGreaterThan(String value) {
            addCriterion("compute_formula >", value, "computeFormula");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaGreaterThanOrEqualTo(String value) {
            addCriterion("compute_formula >=", value, "computeFormula");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaLessThan(String value) {
            addCriterion("compute_formula <", value, "computeFormula");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaLessThanOrEqualTo(String value) {
            addCriterion("compute_formula <=", value, "computeFormula");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaLike(String value) {
            addCriterion("compute_formula like", value, "computeFormula");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaNotLike(String value) {
            addCriterion("compute_formula not like", value, "computeFormula");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaIn(List<String> values) {
            addCriterion("compute_formula in", values, "computeFormula");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaNotIn(List<String> values) {
            addCriterion("compute_formula not in", values, "computeFormula");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaBetween(String value1, String value2) {
            addCriterion("compute_formula between", value1, value2, "computeFormula");
            return (Criteria) this;
        }

        public Criteria andComputeFormulaNotBetween(String value1, String value2) {
            addCriterion("compute_formula not between", value1, value2, "computeFormula");
            return (Criteria) this;
        }

        public Criteria andChargeCurrencyTypeIsNull() {
            addCriterion("charge_currency_type is null");
            return (Criteria) this;
        }

        public Criteria andChargeCurrencyTypeIsNotNull() {
            addCriterion("charge_currency_type is not null");
            return (Criteria) this;
        }

        public Criteria andChargeCurrencyTypeEqualTo(String value) {
            addCriterion("charge_currency_type =", value, "chargeCurrencyType");
            return (Criteria) this;
        }

        public Criteria andChargeCurrencyTypeNotEqualTo(String value) {
            addCriterion("charge_currency_type <>", value, "chargeCurrencyType");
            return (Criteria) this;
        }

        public Criteria andChargeCurrencyTypeGreaterThan(String value) {
            addCriterion("charge_currency_type >", value, "chargeCurrencyType");
            return (Criteria) this;
        }

        public Criteria andChargeCurrencyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("charge_currency_type >=", value, "chargeCurrencyType");
            return (Criteria) this;
        }

        public Criteria andChargeCurrencyTypeLessThan(String value) {
            addCriterion("charge_currency_type <", value, "chargeCurrencyType");
            return (Criteria) this;
        }

        public Criteria andChargeCurrencyTypeLessThanOrEqualTo(String value) {
            addCriterion("charge_currency_type <=", value, "chargeCurrencyType");
            return (Criteria) this;
        }

        public Criteria andChargeCurrencyTypeLike(String value) {
            addCriterion("charge_currency_type like", value, "chargeCurrencyType");
            return (Criteria) this;
        }

        public Criteria andChargeCurrencyTypeNotLike(String value) {
            addCriterion("charge_currency_type not like", value, "chargeCurrencyType");
            return (Criteria) this;
        }

        public Criteria andChargeCurrencyTypeIn(List<String> values) {
            addCriterion("charge_currency_type in", values, "chargeCurrencyType");
            return (Criteria) this;
        }

        public Criteria andChargeCurrencyTypeNotIn(List<String> values) {
            addCriterion("charge_currency_type not in", values, "chargeCurrencyType");
            return (Criteria) this;
        }

        public Criteria andChargeCurrencyTypeBetween(String value1, String value2) {
            addCriterion("charge_currency_type between", value1, value2, "chargeCurrencyType");
            return (Criteria) this;
        }

        public Criteria andChargeCurrencyTypeNotBetween(String value1, String value2) {
            addCriterion("charge_currency_type not between", value1, value2, "chargeCurrencyType");
            return (Criteria) this;
        }

        public Criteria andOptionValueIsNull() {
            addCriterion("option_value is null");
            return (Criteria) this;
        }

        public Criteria andOptionValueIsNotNull() {
            addCriterion("option_value is not null");
            return (Criteria) this;
        }

        public Criteria andOptionValueEqualTo(String value) {
            addCriterion("option_value =", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueNotEqualTo(String value) {
            addCriterion("option_value <>", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueGreaterThan(String value) {
            addCriterion("option_value >", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueGreaterThanOrEqualTo(String value) {
            addCriterion("option_value >=", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueLessThan(String value) {
            addCriterion("option_value <", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueLessThanOrEqualTo(String value) {
            addCriterion("option_value <=", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueLike(String value) {
            addCriterion("option_value like", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueNotLike(String value) {
            addCriterion("option_value not like", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueIn(List<String> values) {
            addCriterion("option_value in", values, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueNotIn(List<String> values) {
            addCriterion("option_value not in", values, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueBetween(String value1, String value2) {
            addCriterion("option_value between", value1, value2, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueNotBetween(String value1, String value2) {
            addCriterion("option_value not between", value1, value2, "optionValue");
            return (Criteria) this;
        }

        public Criteria andRealCostIsNull() {
            addCriterion("real_cost is null");
            return (Criteria) this;
        }

        public Criteria andRealCostIsNotNull() {
            addCriterion("real_cost is not null");
            return (Criteria) this;
        }

        public Criteria andRealCostEqualTo(BigDecimal value) {
            addCriterion("real_cost =", value, "realCost");
            return (Criteria) this;
        }

        public Criteria andRealCostNotEqualTo(BigDecimal value) {
            addCriterion("real_cost <>", value, "realCost");
            return (Criteria) this;
        }

        public Criteria andRealCostGreaterThan(BigDecimal value) {
            addCriterion("real_cost >", value, "realCost");
            return (Criteria) this;
        }

        public Criteria andRealCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_cost >=", value, "realCost");
            return (Criteria) this;
        }

        public Criteria andRealCostLessThan(BigDecimal value) {
            addCriterion("real_cost <", value, "realCost");
            return (Criteria) this;
        }

        public Criteria andRealCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_cost <=", value, "realCost");
            return (Criteria) this;
        }

        public Criteria andRealCostIn(List<BigDecimal> values) {
            addCriterion("real_cost in", values, "realCost");
            return (Criteria) this;
        }

        public Criteria andRealCostNotIn(List<BigDecimal> values) {
            addCriterion("real_cost not in", values, "realCost");
            return (Criteria) this;
        }

        public Criteria andRealCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_cost between", value1, value2, "realCost");
            return (Criteria) this;
        }

        public Criteria andRealCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_cost not between", value1, value2, "realCost");
            return (Criteria) this;
        }

        public Criteria andDeptKeyIsNull() {
            addCriterion("dept_key is null");
            return (Criteria) this;
        }

        public Criteria andDeptKeyIsNotNull() {
            addCriterion("dept_key is not null");
            return (Criteria) this;
        }

        public Criteria andDeptKeyEqualTo(String value) {
            addCriterion("dept_key =", value, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyNotEqualTo(String value) {
            addCriterion("dept_key <>", value, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyGreaterThan(String value) {
            addCriterion("dept_key >", value, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyGreaterThanOrEqualTo(String value) {
            addCriterion("dept_key >=", value, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyLessThan(String value) {
            addCriterion("dept_key <", value, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyLessThanOrEqualTo(String value) {
            addCriterion("dept_key <=", value, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyLike(String value) {
            addCriterion("dept_key like", value, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyNotLike(String value) {
            addCriterion("dept_key not like", value, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyIn(List<String> values) {
            addCriterion("dept_key in", values, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyNotIn(List<String> values) {
            addCriterion("dept_key not in", values, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyBetween(String value1, String value2) {
            addCriterion("dept_key between", value1, value2, "deptKey");
            return (Criteria) this;
        }

        public Criteria andDeptKeyNotBetween(String value1, String value2) {
            addCriterion("dept_key not between", value1, value2, "deptKey");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeIsNull() {
            addCriterion("charge_inout_type is null");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeIsNotNull() {
            addCriterion("charge_inout_type is not null");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeEqualTo(String value) {
            addCriterion("charge_inout_type =", value, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeNotEqualTo(String value) {
            addCriterion("charge_inout_type <>", value, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeGreaterThan(String value) {
            addCriterion("charge_inout_type >", value, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeGreaterThanOrEqualTo(String value) {
            addCriterion("charge_inout_type >=", value, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeLessThan(String value) {
            addCriterion("charge_inout_type <", value, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeLessThanOrEqualTo(String value) {
            addCriterion("charge_inout_type <=", value, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeLike(String value) {
            addCriterion("charge_inout_type like", value, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeNotLike(String value) {
            addCriterion("charge_inout_type not like", value, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeIn(List<String> values) {
            addCriterion("charge_inout_type in", values, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeNotIn(List<String> values) {
            addCriterion("charge_inout_type not in", values, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeBetween(String value1, String value2) {
            addCriterion("charge_inout_type between", value1, value2, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andChargeInoutTypeNotBetween(String value1, String value2) {
            addCriterion("charge_inout_type not between", value1, value2, "chargeInoutType");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNull() {
            addCriterion("dept_code is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("dept_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("dept_code =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("dept_code <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("dept_code >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dept_code >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("dept_code <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("dept_code <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("dept_code like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("dept_code not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("dept_code in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("dept_code not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("dept_code between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("dept_code not between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyIsNull() {
            addCriterion("charge_type_key is null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyIsNotNull() {
            addCriterion("charge_type_key is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyEqualTo(String value) {
            addCriterion("charge_type_key =", value, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyNotEqualTo(String value) {
            addCriterion("charge_type_key <>", value, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyGreaterThan(String value) {
            addCriterion("charge_type_key >", value, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyGreaterThanOrEqualTo(String value) {
            addCriterion("charge_type_key >=", value, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyLessThan(String value) {
            addCriterion("charge_type_key <", value, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyLessThanOrEqualTo(String value) {
            addCriterion("charge_type_key <=", value, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyLike(String value) {
            addCriterion("charge_type_key like", value, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyNotLike(String value) {
            addCriterion("charge_type_key not like", value, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyIn(List<String> values) {
            addCriterion("charge_type_key in", values, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyNotIn(List<String> values) {
            addCriterion("charge_type_key not in", values, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyBetween(String value1, String value2) {
            addCriterion("charge_type_key between", value1, value2, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andChargeTypeKeyNotBetween(String value1, String value2) {
            addCriterion("charge_type_key not between", value1, value2, "chargeTypeKey");
            return (Criteria) this;
        }

        public Criteria andFreeStatusIsNull() {
            addCriterion("free_status is null");
            return (Criteria) this;
        }

        public Criteria andFreeStatusIsNotNull() {
            addCriterion("free_status is not null");
            return (Criteria) this;
        }

        public Criteria andFreeStatusEqualTo(String value) {
            addCriterion("free_status =", value, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusNotEqualTo(String value) {
            addCriterion("free_status <>", value, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusGreaterThan(String value) {
            addCriterion("free_status >", value, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("free_status >=", value, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusLessThan(String value) {
            addCriterion("free_status <", value, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusLessThanOrEqualTo(String value) {
            addCriterion("free_status <=", value, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusLike(String value) {
            addCriterion("free_status like", value, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusNotLike(String value) {
            addCriterion("free_status not like", value, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusIn(List<String> values) {
            addCriterion("free_status in", values, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusNotIn(List<String> values) {
            addCriterion("free_status not in", values, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusBetween(String value1, String value2) {
            addCriterion("free_status between", value1, value2, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStatusNotBetween(String value1, String value2) {
            addCriterion("free_status not between", value1, value2, "freeStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNull() {
            addCriterion("item_status is null");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNotNull() {
            addCriterion("item_status is not null");
            return (Criteria) this;
        }

        public Criteria andItemStatusEqualTo(Integer value) {
            addCriterion("item_status =", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotEqualTo(Integer value) {
            addCriterion("item_status <>", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThan(Integer value) {
            addCriterion("item_status >", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_status >=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThan(Integer value) {
            addCriterion("item_status <", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThanOrEqualTo(Integer value) {
            addCriterion("item_status <=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusIn(List<Integer> values) {
            addCriterion("item_status in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotIn(List<Integer> values) {
            addCriterion("item_status not in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusBetween(Integer value1, Integer value2) {
            addCriterion("item_status between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("item_status not between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andNoCostDescIsNull() {
            addCriterion("no_cost_desc is null");
            return (Criteria) this;
        }

        public Criteria andNoCostDescIsNotNull() {
            addCriterion("no_cost_desc is not null");
            return (Criteria) this;
        }

        public Criteria andNoCostDescEqualTo(String value) {
            addCriterion("no_cost_desc =", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescNotEqualTo(String value) {
            addCriterion("no_cost_desc <>", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescGreaterThan(String value) {
            addCriterion("no_cost_desc >", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescGreaterThanOrEqualTo(String value) {
            addCriterion("no_cost_desc >=", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescLessThan(String value) {
            addCriterion("no_cost_desc <", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescLessThanOrEqualTo(String value) {
            addCriterion("no_cost_desc <=", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescLike(String value) {
            addCriterion("no_cost_desc like", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescNotLike(String value) {
            addCriterion("no_cost_desc not like", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescIn(List<String> values) {
            addCriterion("no_cost_desc in", values, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescNotIn(List<String> values) {
            addCriterion("no_cost_desc not in", values, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescBetween(String value1, String value2) {
            addCriterion("no_cost_desc between", value1, value2, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescNotBetween(String value1, String value2) {
            addCriterion("no_cost_desc not between", value1, value2, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andPoolTypeIsNull() {
            addCriterion("pool_type is null");
            return (Criteria) this;
        }

        public Criteria andPoolTypeIsNotNull() {
            addCriterion("pool_type is not null");
            return (Criteria) this;
        }

        public Criteria andPoolTypeEqualTo(Integer value) {
            addCriterion("pool_type =", value, "poolType");
            return (Criteria) this;
        }

        public Criteria andPoolTypeNotEqualTo(Integer value) {
            addCriterion("pool_type <>", value, "poolType");
            return (Criteria) this;
        }

        public Criteria andPoolTypeGreaterThan(Integer value) {
            addCriterion("pool_type >", value, "poolType");
            return (Criteria) this;
        }

        public Criteria andPoolTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pool_type >=", value, "poolType");
            return (Criteria) this;
        }

        public Criteria andPoolTypeLessThan(Integer value) {
            addCriterion("pool_type <", value, "poolType");
            return (Criteria) this;
        }

        public Criteria andPoolTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pool_type <=", value, "poolType");
            return (Criteria) this;
        }

        public Criteria andPoolTypeIn(List<Integer> values) {
            addCriterion("pool_type in", values, "poolType");
            return (Criteria) this;
        }

        public Criteria andPoolTypeNotIn(List<Integer> values) {
            addCriterion("pool_type not in", values, "poolType");
            return (Criteria) this;
        }

        public Criteria andPoolTypeBetween(Integer value1, Integer value2) {
            addCriterion("pool_type between", value1, value2, "poolType");
            return (Criteria) this;
        }

        public Criteria andPoolTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pool_type not between", value1, value2, "poolType");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNull() {
            addCriterion("is_enabled is null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNotNull() {
            addCriterion("is_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledEqualTo(String value) {
            addCriterion("is_enabled =", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotEqualTo(String value) {
            addCriterion("is_enabled <>", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThan(String value) {
            addCriterion("is_enabled >", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("is_enabled >=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThan(String value) {
            addCriterion("is_enabled <", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThanOrEqualTo(String value) {
            addCriterion("is_enabled <=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLike(String value) {
            addCriterion("is_enabled like", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotLike(String value) {
            addCriterion("is_enabled not like", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIn(List<String> values) {
            addCriterion("is_enabled in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotIn(List<String> values) {
            addCriterion("is_enabled not in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledBetween(String value1, String value2) {
            addCriterion("is_enabled between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotBetween(String value1, String value2) {
            addCriterion("is_enabled not between", value1, value2, "isEnabled");
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

        public Criteria andContainerCategoryIsNull() {
            addCriterion("container_category is null");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryIsNotNull() {
            addCriterion("container_category is not null");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryEqualTo(String value) {
            addCriterion("container_category =", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryNotEqualTo(String value) {
            addCriterion("container_category <>", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryGreaterThan(String value) {
            addCriterion("container_category >", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("container_category >=", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryLessThan(String value) {
            addCriterion("container_category <", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryLessThanOrEqualTo(String value) {
            addCriterion("container_category <=", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryLike(String value) {
            addCriterion("container_category like", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryNotLike(String value) {
            addCriterion("container_category not like", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryIn(List<String> values) {
            addCriterion("container_category in", values, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryNotIn(List<String> values) {
            addCriterion("container_category not in", values, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryBetween(String value1, String value2) {
            addCriterion("container_category between", value1, value2, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryNotBetween(String value1, String value2) {
            addCriterion("container_category not between", value1, value2, "containerCategory");
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