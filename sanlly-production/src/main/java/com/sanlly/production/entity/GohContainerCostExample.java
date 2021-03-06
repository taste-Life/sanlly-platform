package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GohContainerCostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public GohContainerCostExample() {
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

        public Criteria andProdGohContainerCostIdIsNull() {
            addCriterion("prod_goh_container_cost_id is null");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerCostIdIsNotNull() {
            addCriterion("prod_goh_container_cost_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerCostIdEqualTo(Integer value) {
            addCriterion("prod_goh_container_cost_id =", value, "prodGohContainerCostId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerCostIdNotEqualTo(Integer value) {
            addCriterion("prod_goh_container_cost_id <>", value, "prodGohContainerCostId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerCostIdGreaterThan(Integer value) {
            addCriterion("prod_goh_container_cost_id >", value, "prodGohContainerCostId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerCostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_goh_container_cost_id >=", value, "prodGohContainerCostId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerCostIdLessThan(Integer value) {
            addCriterion("prod_goh_container_cost_id <", value, "prodGohContainerCostId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerCostIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_goh_container_cost_id <=", value, "prodGohContainerCostId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerCostIdIn(List<Integer> values) {
            addCriterion("prod_goh_container_cost_id in", values, "prodGohContainerCostId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerCostIdNotIn(List<Integer> values) {
            addCriterion("prod_goh_container_cost_id not in", values, "prodGohContainerCostId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerCostIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_goh_container_cost_id between", value1, value2, "prodGohContainerCostId");
            return (Criteria) this;
        }

        public Criteria andProdGohContainerCostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_goh_container_cost_id not between", value1, value2, "prodGohContainerCostId");
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

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andInvoiceCostIsNull() {
            addCriterion("invoice_cost is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceCostIsNotNull() {
            addCriterion("invoice_cost is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceCostEqualTo(BigDecimal value) {
            addCriterion("invoice_cost =", value, "invoiceCost");
            return (Criteria) this;
        }

        public Criteria andInvoiceCostNotEqualTo(BigDecimal value) {
            addCriterion("invoice_cost <>", value, "invoiceCost");
            return (Criteria) this;
        }

        public Criteria andInvoiceCostGreaterThan(BigDecimal value) {
            addCriterion("invoice_cost >", value, "invoiceCost");
            return (Criteria) this;
        }

        public Criteria andInvoiceCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("invoice_cost >=", value, "invoiceCost");
            return (Criteria) this;
        }

        public Criteria andInvoiceCostLessThan(BigDecimal value) {
            addCriterion("invoice_cost <", value, "invoiceCost");
            return (Criteria) this;
        }

        public Criteria andInvoiceCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("invoice_cost <=", value, "invoiceCost");
            return (Criteria) this;
        }

        public Criteria andInvoiceCostIn(List<BigDecimal> values) {
            addCriterion("invoice_cost in", values, "invoiceCost");
            return (Criteria) this;
        }

        public Criteria andInvoiceCostNotIn(List<BigDecimal> values) {
            addCriterion("invoice_cost not in", values, "invoiceCost");
            return (Criteria) this;
        }

        public Criteria andInvoiceCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoice_cost between", value1, value2, "invoiceCost");
            return (Criteria) this;
        }

        public Criteria andInvoiceCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoice_cost not between", value1, value2, "invoiceCost");
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