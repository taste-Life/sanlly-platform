package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GohContainerRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public GohContainerRateExample() {
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

        public Criteria andProdGohContainerRateIdIsNull() {
            addCriterion("prod_goh_container_rate_id is null");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerRateIdIsNotNull() {
            addCriterion("prod_goh_container_rate_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerRateIdEqualTo(Integer value) {
            addCriterion("prod_goh_container_rate_id =", value, "prodGohContainerRateId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerRateIdNotEqualTo(Integer value) {
            addCriterion("prod_goh_container_rate_id <>", value, "prodGohContainerRateId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerRateIdGreaterThan(Integer value) {
            addCriterion("prod_goh_container_rate_id >", value, "prodGohContainerRateId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerRateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_goh_container_rate_id >=", value, "prodGohContainerRateId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerRateIdLessThan(Integer value) {
            addCriterion("prod_goh_container_rate_id <", value, "prodGohContainerRateId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerRateIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_goh_container_rate_id <=", value, "prodGohContainerRateId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerRateIdIn(List<Integer> values) {
            addCriterion("prod_goh_container_rate_id in", values, "prodGohContainerRateId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerRateIdNotIn(List<Integer> values) {
            addCriterion("prod_goh_container_rate_id not in", values, "prodGohContainerRateId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerRateIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_goh_container_rate_id between", value1, value2, "prodGohContainerRateId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerRateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_goh_container_rate_id not between", value1, value2, "prodGohContainerRateId");
            return (Criteria) this;
        }

        public Criteria andStructureIsNull() {
            addCriterion("`structure` is null");
            return (Criteria) this;
        }

        public Criteria andStructureIsNotNull() {
            addCriterion("`structure` is not null");
            return (Criteria) this;
        }

        public Criteria andStructureEqualTo(String value) {
            addCriterion("`structure` =", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotEqualTo(String value) {
            addCriterion("`structure` <>", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureGreaterThan(String value) {
            addCriterion("`structure` >", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureGreaterThanOrEqualTo(String value) {
            addCriterion("`structure` >=", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLessThan(String value) {
            addCriterion("`structure` <", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLessThanOrEqualTo(String value) {
            addCriterion("`structure` <=", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLike(String value) {
            addCriterion("`structure` like", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotLike(String value) {
            addCriterion("`structure` not like", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureIn(List<String> values) {
            addCriterion("`structure` in", values, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotIn(List<String> values) {
            addCriterion("`structure` not in", values, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureBetween(String value1, String value2) {
            addCriterion("`structure` between", value1, value2, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotBetween(String value1, String value2) {
            addCriterion("`structure` not between", value1, value2, "structure");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeIsNull() {
            addCriterion("reshape_type is null");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeIsNotNull() {
            addCriterion("reshape_type is not null");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeEqualTo(String value) {
            addCriterion("reshape_type =", value, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeNotEqualTo(String value) {
            addCriterion("reshape_type <>", value, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeGreaterThan(String value) {
            addCriterion("reshape_type >", value, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("reshape_type >=", value, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeLessThan(String value) {
            addCriterion("reshape_type <", value, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeLessThanOrEqualTo(String value) {
            addCriterion("reshape_type <=", value, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeLike(String value) {
            addCriterion("reshape_type like", value, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeNotLike(String value) {
            addCriterion("reshape_type not like", value, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeIn(List<String> values) {
            addCriterion("reshape_type in", values, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeNotIn(List<String> values) {
            addCriterion("reshape_type not in", values, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeBetween(String value1, String value2) {
            addCriterion("reshape_type between", value1, value2, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andReshapeTypeNotBetween(String value1, String value2) {
            addCriterion("reshape_type not between", value1, value2, "reshapeType");
            return (Criteria) this;
        }

        public Criteria andTierNumberIsNull() {
            addCriterion("tier_number is null");
            return (Criteria) this;
        }

        public Criteria andTierNumberIsNotNull() {
            addCriterion("tier_number is not null");
            return (Criteria) this;
        }

        public Criteria andTierNumberEqualTo(String value) {
            addCriterion("tier_number =", value, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberNotEqualTo(String value) {
            addCriterion("tier_number <>", value, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberGreaterThan(String value) {
            addCriterion("tier_number >", value, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberGreaterThanOrEqualTo(String value) {
            addCriterion("tier_number >=", value, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberLessThan(String value) {
            addCriterion("tier_number <", value, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberLessThanOrEqualTo(String value) {
            addCriterion("tier_number <=", value, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberLike(String value) {
            addCriterion("tier_number like", value, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberNotLike(String value) {
            addCriterion("tier_number not like", value, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberIn(List<String> values) {
            addCriterion("tier_number in", values, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberNotIn(List<String> values) {
            addCriterion("tier_number not in", values, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberBetween(String value1, String value2) {
            addCriterion("tier_number between", value1, value2, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andTierNumberNotBetween(String value1, String value2) {
            addCriterion("tier_number not between", value1, value2, "tierNumber");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("`size` is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("`size` is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("`size` =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("`size` <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("`size` >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("`size` >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("`size` <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("`size` <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("`size` like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("`size` not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("`size` in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("`size` not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("`size` between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("`size` not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andRateNameIsNull() {
            addCriterion("rate_name is null");
            return (Criteria) this;
        }

        public Criteria andRateNameIsNotNull() {
            addCriterion("rate_name is not null");
            return (Criteria) this;
        }

        public Criteria andRateNameEqualTo(String value) {
            addCriterion("rate_name =", value, "rateName");
            return (Criteria) this;
        }

        public Criteria andRateNameNotEqualTo(String value) {
            addCriterion("rate_name <>", value, "rateName");
            return (Criteria) this;
        }

        public Criteria andRateNameGreaterThan(String value) {
            addCriterion("rate_name >", value, "rateName");
            return (Criteria) this;
        }

        public Criteria andRateNameGreaterThanOrEqualTo(String value) {
            addCriterion("rate_name >=", value, "rateName");
            return (Criteria) this;
        }

        public Criteria andRateNameLessThan(String value) {
            addCriterion("rate_name <", value, "rateName");
            return (Criteria) this;
        }

        public Criteria andRateNameLessThanOrEqualTo(String value) {
            addCriterion("rate_name <=", value, "rateName");
            return (Criteria) this;
        }

        public Criteria andRateNameLike(String value) {
            addCriterion("rate_name like", value, "rateName");
            return (Criteria) this;
        }

        public Criteria andRateNameNotLike(String value) {
            addCriterion("rate_name not like", value, "rateName");
            return (Criteria) this;
        }

        public Criteria andRateNameIn(List<String> values) {
            addCriterion("rate_name in", values, "rateName");
            return (Criteria) this;
        }

        public Criteria andRateNameNotIn(List<String> values) {
            addCriterion("rate_name not in", values, "rateName");
            return (Criteria) this;
        }

        public Criteria andRateNameBetween(String value1, String value2) {
            addCriterion("rate_name between", value1, value2, "rateName");
            return (Criteria) this;
        }

        public Criteria andRateNameNotBetween(String value1, String value2) {
            addCriterion("rate_name not between", value1, value2, "rateName");
            return (Criteria) this;
        }

        public Criteria andSparesNumberIsNull() {
            addCriterion("spares_number is null");
            return (Criteria) this;
        }

        public Criteria andSparesNumberIsNotNull() {
            addCriterion("spares_number is not null");
            return (Criteria) this;
        }

        public Criteria andSparesNumberEqualTo(String value) {
            addCriterion("spares_number =", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberNotEqualTo(String value) {
            addCriterion("spares_number <>", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberGreaterThan(String value) {
            addCriterion("spares_number >", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberGreaterThanOrEqualTo(String value) {
            addCriterion("spares_number >=", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberLessThan(String value) {
            addCriterion("spares_number <", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberLessThanOrEqualTo(String value) {
            addCriterion("spares_number <=", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberLike(String value) {
            addCriterion("spares_number like", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberNotLike(String value) {
            addCriterion("spares_number not like", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberIn(List<String> values) {
            addCriterion("spares_number in", values, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberNotIn(List<String> values) {
            addCriterion("spares_number not in", values, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberBetween(String value1, String value2) {
            addCriterion("spares_number between", value1, value2, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberNotBetween(String value1, String value2) {
            addCriterion("spares_number not between", value1, value2, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andNumberExplainIsNull() {
            addCriterion("number_explain is null");
            return (Criteria) this;
        }

        public Criteria andNumberExplainIsNotNull() {
            addCriterion("number_explain is not null");
            return (Criteria) this;
        }

        public Criteria andNumberExplainEqualTo(String value) {
            addCriterion("number_explain =", value, "numberExplain");
            return (Criteria) this;
        }

        public Criteria andNumberExplainNotEqualTo(String value) {
            addCriterion("number_explain <>", value, "numberExplain");
            return (Criteria) this;
        }

        public Criteria andNumberExplainGreaterThan(String value) {
            addCriterion("number_explain >", value, "numberExplain");
            return (Criteria) this;
        }

        public Criteria andNumberExplainGreaterThanOrEqualTo(String value) {
            addCriterion("number_explain >=", value, "numberExplain");
            return (Criteria) this;
        }

        public Criteria andNumberExplainLessThan(String value) {
            addCriterion("number_explain <", value, "numberExplain");
            return (Criteria) this;
        }

        public Criteria andNumberExplainLessThanOrEqualTo(String value) {
            addCriterion("number_explain <=", value, "numberExplain");
            return (Criteria) this;
        }

        public Criteria andNumberExplainLike(String value) {
            addCriterion("number_explain like", value, "numberExplain");
            return (Criteria) this;
        }

        public Criteria andNumberExplainNotLike(String value) {
            addCriterion("number_explain not like", value, "numberExplain");
            return (Criteria) this;
        }

        public Criteria andNumberExplainIn(List<String> values) {
            addCriterion("number_explain in", values, "numberExplain");
            return (Criteria) this;
        }

        public Criteria andNumberExplainNotIn(List<String> values) {
            addCriterion("number_explain not in", values, "numberExplain");
            return (Criteria) this;
        }

        public Criteria andNumberExplainBetween(String value1, String value2) {
            addCriterion("number_explain between", value1, value2, "numberExplain");
            return (Criteria) this;
        }

        public Criteria andNumberExplainNotBetween(String value1, String value2) {
            addCriterion("number_explain not between", value1, value2, "numberExplain");
            return (Criteria) this;
        }

        public Criteria andManHourIsNull() {
            addCriterion("man_hour is null");
            return (Criteria) this;
        }

        public Criteria andManHourIsNotNull() {
            addCriterion("man_hour is not null");
            return (Criteria) this;
        }

        public Criteria andManHourEqualTo(Double value) {
            addCriterion("man_hour =", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourNotEqualTo(Double value) {
            addCriterion("man_hour <>", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourGreaterThan(Double value) {
            addCriterion("man_hour >", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourGreaterThanOrEqualTo(Double value) {
            addCriterion("man_hour >=", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourLessThan(Double value) {
            addCriterion("man_hour <", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourLessThanOrEqualTo(Double value) {
            addCriterion("man_hour <=", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourIn(List<Double> values) {
            addCriterion("man_hour in", values, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourNotIn(List<Double> values) {
            addCriterion("man_hour not in", values, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourBetween(Double value1, Double value2) {
            addCriterion("man_hour between", value1, value2, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourNotBetween(Double value1, Double value2) {
            addCriterion("man_hour not between", value1, value2, "manHour");
            return (Criteria) this;
        }

        public Criteria andIsMultiplyQuantityIsNull() {
            addCriterion("is_multiply_quantity is null");
            return (Criteria) this;
        }

        public Criteria andIsMultiplyQuantityIsNotNull() {
            addCriterion("is_multiply_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andIsMultiplyQuantityEqualTo(String value) {
            addCriterion("is_multiply_quantity =", value, "isMultiplyQuantity");
            return (Criteria) this;
        }

        public Criteria andIsMultiplyQuantityNotEqualTo(String value) {
            addCriterion("is_multiply_quantity <>", value, "isMultiplyQuantity");
            return (Criteria) this;
        }

        public Criteria andIsMultiplyQuantityGreaterThan(String value) {
            addCriterion("is_multiply_quantity >", value, "isMultiplyQuantity");
            return (Criteria) this;
        }

        public Criteria andIsMultiplyQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("is_multiply_quantity >=", value, "isMultiplyQuantity");
            return (Criteria) this;
        }

        public Criteria andIsMultiplyQuantityLessThan(String value) {
            addCriterion("is_multiply_quantity <", value, "isMultiplyQuantity");
            return (Criteria) this;
        }

        public Criteria andIsMultiplyQuantityLessThanOrEqualTo(String value) {
            addCriterion("is_multiply_quantity <=", value, "isMultiplyQuantity");
            return (Criteria) this;
        }

        public Criteria andIsMultiplyQuantityLike(String value) {
            addCriterion("is_multiply_quantity like", value, "isMultiplyQuantity");
            return (Criteria) this;
        }

        public Criteria andIsMultiplyQuantityNotLike(String value) {
            addCriterion("is_multiply_quantity not like", value, "isMultiplyQuantity");
            return (Criteria) this;
        }

        public Criteria andIsMultiplyQuantityIn(List<String> values) {
            addCriterion("is_multiply_quantity in", values, "isMultiplyQuantity");
            return (Criteria) this;
        }

        public Criteria andIsMultiplyQuantityNotIn(List<String> values) {
            addCriterion("is_multiply_quantity not in", values, "isMultiplyQuantity");
            return (Criteria) this;
        }

        public Criteria andIsMultiplyQuantityBetween(String value1, String value2) {
            addCriterion("is_multiply_quantity between", value1, value2, "isMultiplyQuantity");
            return (Criteria) this;
        }

        public Criteria andIsMultiplyQuantityNotBetween(String value1, String value2) {
            addCriterion("is_multiply_quantity not between", value1, value2, "isMultiplyQuantity");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberIsNull() {
            addCriterion("cardinal_number is null");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberIsNotNull() {
            addCriterion("cardinal_number is not null");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberEqualTo(Double value) {
            addCriterion("cardinal_number =", value, "cardinalNumber");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberNotEqualTo(Double value) {
            addCriterion("cardinal_number <>", value, "cardinalNumber");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberGreaterThan(Double value) {
            addCriterion("cardinal_number >", value, "cardinalNumber");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberGreaterThanOrEqualTo(Double value) {
            addCriterion("cardinal_number >=", value, "cardinalNumber");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberLessThan(Double value) {
            addCriterion("cardinal_number <", value, "cardinalNumber");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberLessThanOrEqualTo(Double value) {
            addCriterion("cardinal_number <=", value, "cardinalNumber");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberIn(List<Double> values) {
            addCriterion("cardinal_number in", values, "cardinalNumber");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberNotIn(List<Double> values) {
            addCriterion("cardinal_number not in", values, "cardinalNumber");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberBetween(Double value1, Double value2) {
            addCriterion("cardinal_number between", value1, value2, "cardinalNumber");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberNotBetween(Double value1, Double value2) {
            addCriterion("cardinal_number not between", value1, value2, "cardinalNumber");
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