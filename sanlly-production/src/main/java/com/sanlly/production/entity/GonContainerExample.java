package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GonContainerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public GonContainerExample() {
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

        public Criteria andProdGonContainerIdIsNull() {
            addCriterion("prod_gon_container_id is null");
            return (Criteria) this;
        }

        public Criteria andProdGonContainerIdIsNotNull() {
            addCriterion("prod_gon_container_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdGonContainerIdEqualTo(Integer value) {
            addCriterion("prod_gon_container_id =", value, "prodGonContainerId");
            return (Criteria) this;
        }

        public Criteria andProdGonContainerIdNotEqualTo(Integer value) {
            addCriterion("prod_gon_container_id <>", value, "prodGonContainerId");
            return (Criteria) this;
        }

        public Criteria andProdGonContainerIdGreaterThan(Integer value) {
            addCriterion("prod_gon_container_id >", value, "prodGonContainerId");
            return (Criteria) this;
        }

        public Criteria andProdGonContainerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_gon_container_id >=", value, "prodGonContainerId");
            return (Criteria) this;
        }

        public Criteria andProdGonContainerIdLessThan(Integer value) {
            addCriterion("prod_gon_container_id <", value, "prodGonContainerId");
            return (Criteria) this;
        }

        public Criteria andProdGonContainerIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_gon_container_id <=", value, "prodGonContainerId");
            return (Criteria) this;
        }

        public Criteria andProdGonContainerIdIn(List<Integer> values) {
            addCriterion("prod_gon_container_id in", values, "prodGonContainerId");
            return (Criteria) this;
        }

        public Criteria andProdGonContainerIdNotIn(List<Integer> values) {
            addCriterion("prod_gon_container_id not in", values, "prodGonContainerId");
            return (Criteria) this;
        }

        public Criteria andProdGonContainerIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_gon_container_id between", value1, value2, "prodGonContainerId");
            return (Criteria) this;
        }

        public Criteria andProdGonContainerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_gon_container_id not between", value1, value2, "prodGonContainerId");
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

        public Criteria andBeforeContainerTypeIsNull() {
            addCriterion("before_container_type is null");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeIsNotNull() {
            addCriterion("before_container_type is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeEqualTo(String value) {
            addCriterion("before_container_type =", value, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeNotEqualTo(String value) {
            addCriterion("before_container_type <>", value, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeGreaterThan(String value) {
            addCriterion("before_container_type >", value, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("before_container_type >=", value, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeLessThan(String value) {
            addCriterion("before_container_type <", value, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeLessThanOrEqualTo(String value) {
            addCriterion("before_container_type <=", value, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeLike(String value) {
            addCriterion("before_container_type like", value, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeNotLike(String value) {
            addCriterion("before_container_type not like", value, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeIn(List<String> values) {
            addCriterion("before_container_type in", values, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeNotIn(List<String> values) {
            addCriterion("before_container_type not in", values, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeBetween(String value1, String value2) {
            addCriterion("before_container_type between", value1, value2, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andBeforeContainerTypeNotBetween(String value1, String value2) {
            addCriterion("before_container_type not between", value1, value2, "beforeContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeIsNull() {
            addCriterion("after_container_type is null");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeIsNotNull() {
            addCriterion("after_container_type is not null");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeEqualTo(String value) {
            addCriterion("after_container_type =", value, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeNotEqualTo(String value) {
            addCriterion("after_container_type <>", value, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeGreaterThan(String value) {
            addCriterion("after_container_type >", value, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("after_container_type >=", value, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeLessThan(String value) {
            addCriterion("after_container_type <", value, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeLessThanOrEqualTo(String value) {
            addCriterion("after_container_type <=", value, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeLike(String value) {
            addCriterion("after_container_type like", value, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeNotLike(String value) {
            addCriterion("after_container_type not like", value, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeIn(List<String> values) {
            addCriterion("after_container_type in", values, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeNotIn(List<String> values) {
            addCriterion("after_container_type not in", values, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeBetween(String value1, String value2) {
            addCriterion("after_container_type between", value1, value2, "afterContainerType");
            return (Criteria) this;
        }

        public Criteria andAfterContainerTypeNotBetween(String value1, String value2) {
            addCriterion("after_container_type not between", value1, value2, "afterContainerType");
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

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andLaborCostIsNull() {
            addCriterion("labor_cost is null");
            return (Criteria) this;
        }

        public Criteria andLaborCostIsNotNull() {
            addCriterion("labor_cost is not null");
            return (Criteria) this;
        }

        public Criteria andLaborCostEqualTo(BigDecimal value) {
            addCriterion("labor_cost =", value, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostNotEqualTo(BigDecimal value) {
            addCriterion("labor_cost <>", value, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostGreaterThan(BigDecimal value) {
            addCriterion("labor_cost >", value, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("labor_cost >=", value, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostLessThan(BigDecimal value) {
            addCriterion("labor_cost <", value, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("labor_cost <=", value, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostIn(List<BigDecimal> values) {
            addCriterion("labor_cost in", values, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostNotIn(List<BigDecimal> values) {
            addCriterion("labor_cost not in", values, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("labor_cost between", value1, value2, "laborCost");
            return (Criteria) this;
        }

        public Criteria andLaborCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("labor_cost not between", value1, value2, "laborCost");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageIsNull() {
            addCriterion("vessel_voyage is null");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageIsNotNull() {
            addCriterion("vessel_voyage is not null");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageEqualTo(String value) {
            addCriterion("vessel_voyage =", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageNotEqualTo(String value) {
            addCriterion("vessel_voyage <>", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageGreaterThan(String value) {
            addCriterion("vessel_voyage >", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageGreaterThanOrEqualTo(String value) {
            addCriterion("vessel_voyage >=", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageLessThan(String value) {
            addCriterion("vessel_voyage <", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageLessThanOrEqualTo(String value) {
            addCriterion("vessel_voyage <=", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageLike(String value) {
            addCriterion("vessel_voyage like", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageNotLike(String value) {
            addCriterion("vessel_voyage not like", value, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageIn(List<String> values) {
            addCriterion("vessel_voyage in", values, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageNotIn(List<String> values) {
            addCriterion("vessel_voyage not in", values, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageBetween(String value1, String value2) {
            addCriterion("vessel_voyage between", value1, value2, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andVesselVoyageNotBetween(String value1, String value2) {
            addCriterion("vessel_voyage not between", value1, value2, "vesselVoyage");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoIsNull() {
            addCriterion("bill_of_lading_no is null");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoIsNotNull() {
            addCriterion("bill_of_lading_no is not null");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoEqualTo(String value) {
            addCriterion("bill_of_lading_no =", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoNotEqualTo(String value) {
            addCriterion("bill_of_lading_no <>", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoGreaterThan(String value) {
            addCriterion("bill_of_lading_no >", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoGreaterThanOrEqualTo(String value) {
            addCriterion("bill_of_lading_no >=", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoLessThan(String value) {
            addCriterion("bill_of_lading_no <", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoLessThanOrEqualTo(String value) {
            addCriterion("bill_of_lading_no <=", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoLike(String value) {
            addCriterion("bill_of_lading_no like", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoNotLike(String value) {
            addCriterion("bill_of_lading_no not like", value, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoIn(List<String> values) {
            addCriterion("bill_of_lading_no in", values, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoNotIn(List<String> values) {
            addCriterion("bill_of_lading_no not in", values, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoBetween(String value1, String value2) {
            addCriterion("bill_of_lading_no between", value1, value2, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andBillOfLadingNoNotBetween(String value1, String value2) {
            addCriterion("bill_of_lading_no not between", value1, value2, "billOfLadingNo");
            return (Criteria) this;
        }

        public Criteria andDestinationPortIsNull() {
            addCriterion("destination_port is null");
            return (Criteria) this;
        }

        public Criteria andDestinationPortIsNotNull() {
            addCriterion("destination_port is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationPortEqualTo(String value) {
            addCriterion("destination_port =", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortNotEqualTo(String value) {
            addCriterion("destination_port <>", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortGreaterThan(String value) {
            addCriterion("destination_port >", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortGreaterThanOrEqualTo(String value) {
            addCriterion("destination_port >=", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortLessThan(String value) {
            addCriterion("destination_port <", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortLessThanOrEqualTo(String value) {
            addCriterion("destination_port <=", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortLike(String value) {
            addCriterion("destination_port like", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortNotLike(String value) {
            addCriterion("destination_port not like", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortIn(List<String> values) {
            addCriterion("destination_port in", values, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortNotIn(List<String> values) {
            addCriterion("destination_port not in", values, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortBetween(String value1, String value2) {
            addCriterion("destination_port between", value1, value2, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortNotBetween(String value1, String value2) {
            addCriterion("destination_port not between", value1, value2, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeIsNull() {
            addCriterion("extract_cont_time is null");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeIsNotNull() {
            addCriterion("extract_cont_time is not null");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeEqualTo(Date value) {
            addCriterion("extract_cont_time =", value, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeNotEqualTo(Date value) {
            addCriterion("extract_cont_time <>", value, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeGreaterThan(Date value) {
            addCriterion("extract_cont_time >", value, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("extract_cont_time >=", value, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeLessThan(Date value) {
            addCriterion("extract_cont_time <", value, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeLessThanOrEqualTo(Date value) {
            addCriterion("extract_cont_time <=", value, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeIn(List<Date> values) {
            addCriterion("extract_cont_time in", values, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeNotIn(List<Date> values) {
            addCriterion("extract_cont_time not in", values, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeBetween(Date value1, Date value2) {
            addCriterion("extract_cont_time between", value1, value2, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andExtractContTimeNotBetween(Date value1, Date value2) {
            addCriterion("extract_cont_time not between", value1, value2, "extractContTime");
            return (Criteria) this;
        }

        public Criteria andAuditUserIsNull() {
            addCriterion("audit_user is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIsNotNull() {
            addCriterion("audit_user is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserEqualTo(Integer value) {
            addCriterion("audit_user =", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotEqualTo(Integer value) {
            addCriterion("audit_user <>", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserGreaterThan(Integer value) {
            addCriterion("audit_user >", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_user >=", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLessThan(Integer value) {
            addCriterion("audit_user <", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLessThanOrEqualTo(Integer value) {
            addCriterion("audit_user <=", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserIn(List<Integer> values) {
            addCriterion("audit_user in", values, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotIn(List<Integer> values) {
            addCriterion("audit_user not in", values, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserBetween(Integer value1, Integer value2) {
            addCriterion("audit_user between", value1, value2, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_user not between", value1, value2, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
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