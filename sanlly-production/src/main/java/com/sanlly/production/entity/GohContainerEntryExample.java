package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GohContainerEntryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public GohContainerEntryExample() {
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

        public Criteria andProdGohContainerEntryIdIsNull() {
            addCriterion("prod_goh_container_entry_id is null");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerEntryIdIsNotNull() {
            addCriterion("prod_goh_container_entry_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerEntryIdEqualTo(Integer value) {
            addCriterion("prod_goh_container_entry_id =", value, "prodGohContainerEntryId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerEntryIdNotEqualTo(Integer value) {
            addCriterion("prod_goh_container_entry_id <>", value, "prodGohContainerEntryId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerEntryIdGreaterThan(Integer value) {
            addCriterion("prod_goh_container_entry_id >", value, "prodGohContainerEntryId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerEntryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_goh_container_entry_id >=", value, "prodGohContainerEntryId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerEntryIdLessThan(Integer value) {
            addCriterion("prod_goh_container_entry_id <", value, "prodGohContainerEntryId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerEntryIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_goh_container_entry_id <=", value, "prodGohContainerEntryId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerEntryIdIn(List<Integer> values) {
            addCriterion("prod_goh_container_entry_id in", values, "prodGohContainerEntryId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerEntryIdNotIn(List<Integer> values) {
            addCriterion("prod_goh_container_entry_id not in", values, "prodGohContainerEntryId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerEntryIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_goh_container_entry_id between", value1, value2, "prodGohContainerEntryId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerEntryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_goh_container_entry_id not between", value1, value2, "prodGohContainerEntryId");
            return (Criteria) this;
        }

        public Criteria andGohContainerIsNull() {
            addCriterion("goh_container is null");
            return (Criteria) this;
        }

        public Criteria andGohContainerIsNotNull() {
            addCriterion("goh_container is not null");
            return (Criteria) this;
        }

        public Criteria andGohContainerEqualTo(Integer value) {
            addCriterion("goh_container =", value, "gohContainer");
            return (Criteria) this;
        }

        public Criteria andGohContainerNotEqualTo(Integer value) {
            addCriterion("goh_container <>", value, "gohContainer");
            return (Criteria) this;
        }

        public Criteria andGohContainerGreaterThan(Integer value) {
            addCriterion("goh_container >", value, "gohContainer");
            return (Criteria) this;
        }

        public Criteria andGohContainerGreaterThanOrEqualTo(Integer value) {
            addCriterion("goh_container >=", value, "gohContainer");
            return (Criteria) this;
        }

        public Criteria andGohContainerLessThan(Integer value) {
            addCriterion("goh_container <", value, "gohContainer");
            return (Criteria) this;
        }

        public Criteria andGohContainerLessThanOrEqualTo(Integer value) {
            addCriterion("goh_container <=", value, "gohContainer");
            return (Criteria) this;
        }

        public Criteria andGohContainerIn(List<Integer> values) {
            addCriterion("goh_container in", values, "gohContainer");
            return (Criteria) this;
        }

        public Criteria andGohContainerNotIn(List<Integer> values) {
            addCriterion("goh_container not in", values, "gohContainer");
            return (Criteria) this;
        }

        public Criteria andGohContainerBetween(Integer value1, Integer value2) {
            addCriterion("goh_container between", value1, value2, "gohContainer");
            return (Criteria) this;
        }

        public Criteria andGohContainerNotBetween(Integer value1, Integer value2) {
            addCriterion("goh_container not between", value1, value2, "gohContainer");
            return (Criteria) this;
        }

        public Criteria andEntryNameIsNull() {
            addCriterion("entry_name is null");
            return (Criteria) this;
        }

        public Criteria andEntryNameIsNotNull() {
            addCriterion("entry_name is not null");
            return (Criteria) this;
        }

        public Criteria andEntryNameEqualTo(String value) {
            addCriterion("entry_name =", value, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameNotEqualTo(String value) {
            addCriterion("entry_name <>", value, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameGreaterThan(String value) {
            addCriterion("entry_name >", value, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameGreaterThanOrEqualTo(String value) {
            addCriterion("entry_name >=", value, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameLessThan(String value) {
            addCriterion("entry_name <", value, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameLessThanOrEqualTo(String value) {
            addCriterion("entry_name <=", value, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameLike(String value) {
            addCriterion("entry_name like", value, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameNotLike(String value) {
            addCriterion("entry_name not like", value, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameIn(List<String> values) {
            addCriterion("entry_name in", values, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameNotIn(List<String> values) {
            addCriterion("entry_name not in", values, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameBetween(String value1, String value2) {
            addCriterion("entry_name between", value1, value2, "entryName");
            return (Criteria) this;
        }

        public Criteria andEntryNameNotBetween(String value1, String value2) {
            addCriterion("entry_name not between", value1, value2, "entryName");
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

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Double value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Double value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Double value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Double value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Double value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Double value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Double> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Double> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Double value1, Double value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Double value1, Double value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
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

        public Criteria andPayingPartyIsNull() {
            addCriterion("paying_party is null");
            return (Criteria) this;
        }

        public Criteria andPayingPartyIsNotNull() {
            addCriterion("paying_party is not null");
            return (Criteria) this;
        }

        public Criteria andPayingPartyEqualTo(String value) {
            addCriterion("paying_party =", value, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNotEqualTo(String value) {
            addCriterion("paying_party <>", value, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyGreaterThan(String value) {
            addCriterion("paying_party >", value, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyGreaterThanOrEqualTo(String value) {
            addCriterion("paying_party >=", value, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyLessThan(String value) {
            addCriterion("paying_party <", value, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyLessThanOrEqualTo(String value) {
            addCriterion("paying_party <=", value, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyLike(String value) {
            addCriterion("paying_party like", value, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNotLike(String value) {
            addCriterion("paying_party not like", value, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyIn(List<String> values) {
            addCriterion("paying_party in", values, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNotIn(List<String> values) {
            addCriterion("paying_party not in", values, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyBetween(String value1, String value2) {
            addCriterion("paying_party between", value1, value2, "payingParty");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNotBetween(String value1, String value2) {
            addCriterion("paying_party not between", value1, value2, "payingParty");
            return (Criteria) this;
        }

        public Criteria andStandardCostIsNull() {
            addCriterion("standard_cost is null");
            return (Criteria) this;
        }

        public Criteria andStandardCostIsNotNull() {
            addCriterion("standard_cost is not null");
            return (Criteria) this;
        }

        public Criteria andStandardCostEqualTo(BigDecimal value) {
            addCriterion("standard_cost =", value, "standardCost");
            return (Criteria) this;
        }

        public Criteria andStandardCostNotEqualTo(BigDecimal value) {
            addCriterion("standard_cost <>", value, "standardCost");
            return (Criteria) this;
        }

        public Criteria andStandardCostGreaterThan(BigDecimal value) {
            addCriterion("standard_cost >", value, "standardCost");
            return (Criteria) this;
        }

        public Criteria andStandardCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_cost >=", value, "standardCost");
            return (Criteria) this;
        }

        public Criteria andStandardCostLessThan(BigDecimal value) {
            addCriterion("standard_cost <", value, "standardCost");
            return (Criteria) this;
        }

        public Criteria andStandardCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_cost <=", value, "standardCost");
            return (Criteria) this;
        }

        public Criteria andStandardCostIn(List<BigDecimal> values) {
            addCriterion("standard_cost in", values, "standardCost");
            return (Criteria) this;
        }

        public Criteria andStandardCostNotIn(List<BigDecimal> values) {
            addCriterion("standard_cost not in", values, "standardCost");
            return (Criteria) this;
        }

        public Criteria andStandardCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standard_cost between", value1, value2, "standardCost");
            return (Criteria) this;
        }

        public Criteria andStandardCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standard_cost not between", value1, value2, "standardCost");
            return (Criteria) this;
        }

        public Criteria andNonstandardCostIsNull() {
            addCriterion("nonstandard_cost is null");
            return (Criteria) this;
        }

        public Criteria andNonstandardCostIsNotNull() {
            addCriterion("nonstandard_cost is not null");
            return (Criteria) this;
        }

        public Criteria andNonstandardCostEqualTo(BigDecimal value) {
            addCriterion("nonstandard_cost =", value, "nonstandardCost");
            return (Criteria) this;
        }

        public Criteria andNonstandardCostNotEqualTo(BigDecimal value) {
            addCriterion("nonstandard_cost <>", value, "nonstandardCost");
            return (Criteria) this;
        }

        public Criteria andNonstandardCostGreaterThan(BigDecimal value) {
            addCriterion("nonstandard_cost >", value, "nonstandardCost");
            return (Criteria) this;
        }

        public Criteria andNonstandardCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nonstandard_cost >=", value, "nonstandardCost");
            return (Criteria) this;
        }

        public Criteria andNonstandardCostLessThan(BigDecimal value) {
            addCriterion("nonstandard_cost <", value, "nonstandardCost");
            return (Criteria) this;
        }

        public Criteria andNonstandardCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nonstandard_cost <=", value, "nonstandardCost");
            return (Criteria) this;
        }

        public Criteria andNonstandardCostIn(List<BigDecimal> values) {
            addCriterion("nonstandard_cost in", values, "nonstandardCost");
            return (Criteria) this;
        }

        public Criteria andNonstandardCostNotIn(List<BigDecimal> values) {
            addCriterion("nonstandard_cost not in", values, "nonstandardCost");
            return (Criteria) this;
        }

        public Criteria andNonstandardCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nonstandard_cost between", value1, value2, "nonstandardCost");
            return (Criteria) this;
        }

        public Criteria andNonstandardCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nonstandard_cost not between", value1, value2, "nonstandardCost");
            return (Criteria) this;
        }

        public Criteria andIsDevanningIsNull() {
            addCriterion("is_devanning is null");
            return (Criteria) this;
        }

        public Criteria andIsDevanningIsNotNull() {
            addCriterion("is_devanning is not null");
            return (Criteria) this;
        }

        public Criteria andIsDevanningEqualTo(String value) {
            addCriterion("is_devanning =", value, "isDevanning");
            return (Criteria) this;
        }

        public Criteria andIsDevanningNotEqualTo(String value) {
            addCriterion("is_devanning <>", value, "isDevanning");
            return (Criteria) this;
        }

        public Criteria andIsDevanningGreaterThan(String value) {
            addCriterion("is_devanning >", value, "isDevanning");
            return (Criteria) this;
        }

        public Criteria andIsDevanningGreaterThanOrEqualTo(String value) {
            addCriterion("is_devanning >=", value, "isDevanning");
            return (Criteria) this;
        }

        public Criteria andIsDevanningLessThan(String value) {
            addCriterion("is_devanning <", value, "isDevanning");
            return (Criteria) this;
        }

        public Criteria andIsDevanningLessThanOrEqualTo(String value) {
            addCriterion("is_devanning <=", value, "isDevanning");
            return (Criteria) this;
        }

        public Criteria andIsDevanningLike(String value) {
            addCriterion("is_devanning like", value, "isDevanning");
            return (Criteria) this;
        }

        public Criteria andIsDevanningNotLike(String value) {
            addCriterion("is_devanning not like", value, "isDevanning");
            return (Criteria) this;
        }

        public Criteria andIsDevanningIn(List<String> values) {
            addCriterion("is_devanning in", values, "isDevanning");
            return (Criteria) this;
        }

        public Criteria andIsDevanningNotIn(List<String> values) {
            addCriterion("is_devanning not in", values, "isDevanning");
            return (Criteria) this;
        }

        public Criteria andIsDevanningBetween(String value1, String value2) {
            addCriterion("is_devanning between", value1, value2, "isDevanning");
            return (Criteria) this;
        }

        public Criteria andIsDevanningNotBetween(String value1, String value2) {
            addCriterion("is_devanning not between", value1, value2, "isDevanning");
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