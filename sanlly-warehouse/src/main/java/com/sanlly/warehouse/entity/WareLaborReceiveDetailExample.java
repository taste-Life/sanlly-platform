package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareLaborReceiveDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareLaborReceiveDetailExample() {
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

        public Criteria andWareLaborReceiveDetailIdIsNull() {
            addCriterion("ware_labor_receive_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveDetailIdIsNotNull() {
            addCriterion("ware_labor_receive_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveDetailIdEqualTo(Integer value) {
            addCriterion("ware_labor_receive_detail_id =", value, "wareLaborReceiveDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveDetailIdNotEqualTo(Integer value) {
            addCriterion("ware_labor_receive_detail_id <>", value, "wareLaborReceiveDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveDetailIdGreaterThan(Integer value) {
            addCriterion("ware_labor_receive_detail_id >", value, "wareLaborReceiveDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_labor_receive_detail_id >=", value, "wareLaborReceiveDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveDetailIdLessThan(Integer value) {
            addCriterion("ware_labor_receive_detail_id <", value, "wareLaborReceiveDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_labor_receive_detail_id <=", value, "wareLaborReceiveDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveDetailIdIn(List<Integer> values) {
            addCriterion("ware_labor_receive_detail_id in", values, "wareLaborReceiveDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveDetailIdNotIn(List<Integer> values) {
            addCriterion("ware_labor_receive_detail_id not in", values, "wareLaborReceiveDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_labor_receive_detail_id between", value1, value2, "wareLaborReceiveDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_labor_receive_detail_id not between", value1, value2, "wareLaborReceiveDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveIsNull() {
            addCriterion("ware_labor_receive is null");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveIsNotNull() {
            addCriterion("ware_labor_receive is not null");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveEqualTo(Integer value) {
            addCriterion("ware_labor_receive =", value, "wareLaborReceive");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveNotEqualTo(Integer value) {
            addCriterion("ware_labor_receive <>", value, "wareLaborReceive");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveGreaterThan(Integer value) {
            addCriterion("ware_labor_receive >", value, "wareLaborReceive");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_labor_receive >=", value, "wareLaborReceive");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveLessThan(Integer value) {
            addCriterion("ware_labor_receive <", value, "wareLaborReceive");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveLessThanOrEqualTo(Integer value) {
            addCriterion("ware_labor_receive <=", value, "wareLaborReceive");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveIn(List<Integer> values) {
            addCriterion("ware_labor_receive in", values, "wareLaborReceive");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveNotIn(List<Integer> values) {
            addCriterion("ware_labor_receive not in", values, "wareLaborReceive");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveBetween(Integer value1, Integer value2) {
            addCriterion("ware_labor_receive between", value1, value2, "wareLaborReceive");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_labor_receive not between", value1, value2, "wareLaborReceive");
            return (Criteria) this;
        }

        public Criteria andUserIsNull() {
            addCriterion("`user` is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("`user` is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(Integer value) {
            addCriterion("`user` =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(Integer value) {
            addCriterion("`user` <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(Integer value) {
            addCriterion("`user` >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("`user` >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(Integer value) {
            addCriterion("`user` <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(Integer value) {
            addCriterion("`user` <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<Integer> values) {
            addCriterion("`user` in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<Integer> values) {
            addCriterion("`user` not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(Integer value1, Integer value2) {
            addCriterion("`user` between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(Integer value1, Integer value2) {
            addCriterion("`user` not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andSparePartsIsNull() {
            addCriterion("spare_parts is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsIsNotNull() {
            addCriterion("spare_parts is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsEqualTo(String value) {
            addCriterion("spare_parts =", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsNotEqualTo(String value) {
            addCriterion("spare_parts <>", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsGreaterThan(String value) {
            addCriterion("spare_parts >", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts >=", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsLessThan(String value) {
            addCriterion("spare_parts <", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsLessThanOrEqualTo(String value) {
            addCriterion("spare_parts <=", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsLike(String value) {
            addCriterion("spare_parts like", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsNotLike(String value) {
            addCriterion("spare_parts not like", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsIn(List<String> values) {
            addCriterion("spare_parts in", values, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsNotIn(List<String> values) {
            addCriterion("spare_parts not in", values, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsBetween(String value1, String value2) {
            addCriterion("spare_parts between", value1, value2, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsNotBetween(String value1, String value2) {
            addCriterion("spare_parts not between", value1, value2, "spareParts");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andApplicantNumIsNull() {
            addCriterion("applicant_num is null");
            return (Criteria) this;
        }

        public Criteria andApplicantNumIsNotNull() {
            addCriterion("applicant_num is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantNumEqualTo(Double value) {
            addCriterion("applicant_num =", value, "applicantNum");
            return (Criteria) this;
        }

        public Criteria andApplicantNumNotEqualTo(Double value) {
            addCriterion("applicant_num <>", value, "applicantNum");
            return (Criteria) this;
        }

        public Criteria andApplicantNumGreaterThan(Double value) {
            addCriterion("applicant_num >", value, "applicantNum");
            return (Criteria) this;
        }

        public Criteria andApplicantNumGreaterThanOrEqualTo(Double value) {
            addCriterion("applicant_num >=", value, "applicantNum");
            return (Criteria) this;
        }

        public Criteria andApplicantNumLessThan(Double value) {
            addCriterion("applicant_num <", value, "applicantNum");
            return (Criteria) this;
        }

        public Criteria andApplicantNumLessThanOrEqualTo(Double value) {
            addCriterion("applicant_num <=", value, "applicantNum");
            return (Criteria) this;
        }

        public Criteria andApplicantNumIn(List<Double> values) {
            addCriterion("applicant_num in", values, "applicantNum");
            return (Criteria) this;
        }

        public Criteria andApplicantNumNotIn(List<Double> values) {
            addCriterion("applicant_num not in", values, "applicantNum");
            return (Criteria) this;
        }

        public Criteria andApplicantNumBetween(Double value1, Double value2) {
            addCriterion("applicant_num between", value1, value2, "applicantNum");
            return (Criteria) this;
        }

        public Criteria andApplicantNumNotBetween(Double value1, Double value2) {
            addCriterion("applicant_num not between", value1, value2, "applicantNum");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusIsNull() {
            addCriterion("stockout_status is null");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusIsNotNull() {
            addCriterion("stockout_status is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusEqualTo(String value) {
            addCriterion("stockout_status =", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusNotEqualTo(String value) {
            addCriterion("stockout_status <>", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusGreaterThan(String value) {
            addCriterion("stockout_status >", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusGreaterThanOrEqualTo(String value) {
            addCriterion("stockout_status >=", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusLessThan(String value) {
            addCriterion("stockout_status <", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusLessThanOrEqualTo(String value) {
            addCriterion("stockout_status <=", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusLike(String value) {
            addCriterion("stockout_status like", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusNotLike(String value) {
            addCriterion("stockout_status not like", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusIn(List<String> values) {
            addCriterion("stockout_status in", values, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusNotIn(List<String> values) {
            addCriterion("stockout_status not in", values, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusBetween(String value1, String value2) {
            addCriterion("stockout_status between", value1, value2, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusNotBetween(String value1, String value2) {
            addCriterion("stockout_status not between", value1, value2, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andLastAssignDateIsNull() {
            addCriterion("last_assign_date is null");
            return (Criteria) this;
        }

        public Criteria andLastAssignDateIsNotNull() {
            addCriterion("last_assign_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastAssignDateEqualTo(Date value) {
            addCriterion("last_assign_date =", value, "lastAssignDate");
            return (Criteria) this;
        }

        public Criteria andLastAssignDateNotEqualTo(Date value) {
            addCriterion("last_assign_date <>", value, "lastAssignDate");
            return (Criteria) this;
        }

        public Criteria andLastAssignDateGreaterThan(Date value) {
            addCriterion("last_assign_date >", value, "lastAssignDate");
            return (Criteria) this;
        }

        public Criteria andLastAssignDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_assign_date >=", value, "lastAssignDate");
            return (Criteria) this;
        }

        public Criteria andLastAssignDateLessThan(Date value) {
            addCriterion("last_assign_date <", value, "lastAssignDate");
            return (Criteria) this;
        }

        public Criteria andLastAssignDateLessThanOrEqualTo(Date value) {
            addCriterion("last_assign_date <=", value, "lastAssignDate");
            return (Criteria) this;
        }

        public Criteria andLastAssignDateIn(List<Date> values) {
            addCriterion("last_assign_date in", values, "lastAssignDate");
            return (Criteria) this;
        }

        public Criteria andLastAssignDateNotIn(List<Date> values) {
            addCriterion("last_assign_date not in", values, "lastAssignDate");
            return (Criteria) this;
        }

        public Criteria andLastAssignDateBetween(Date value1, Date value2) {
            addCriterion("last_assign_date between", value1, value2, "lastAssignDate");
            return (Criteria) this;
        }

        public Criteria andLastAssignDateNotBetween(Date value1, Date value2) {
            addCriterion("last_assign_date not between", value1, value2, "lastAssignDate");
            return (Criteria) this;
        }

        public Criteria andNextAssignDateIsNull() {
            addCriterion("next_assign_date is null");
            return (Criteria) this;
        }

        public Criteria andNextAssignDateIsNotNull() {
            addCriterion("next_assign_date is not null");
            return (Criteria) this;
        }

        public Criteria andNextAssignDateEqualTo(Date value) {
            addCriterion("next_assign_date =", value, "nextAssignDate");
            return (Criteria) this;
        }

        public Criteria andNextAssignDateNotEqualTo(Date value) {
            addCriterion("next_assign_date <>", value, "nextAssignDate");
            return (Criteria) this;
        }

        public Criteria andNextAssignDateGreaterThan(Date value) {
            addCriterion("next_assign_date >", value, "nextAssignDate");
            return (Criteria) this;
        }

        public Criteria andNextAssignDateGreaterThanOrEqualTo(Date value) {
            addCriterion("next_assign_date >=", value, "nextAssignDate");
            return (Criteria) this;
        }

        public Criteria andNextAssignDateLessThan(Date value) {
            addCriterion("next_assign_date <", value, "nextAssignDate");
            return (Criteria) this;
        }

        public Criteria andNextAssignDateLessThanOrEqualTo(Date value) {
            addCriterion("next_assign_date <=", value, "nextAssignDate");
            return (Criteria) this;
        }

        public Criteria andNextAssignDateIn(List<Date> values) {
            addCriterion("next_assign_date in", values, "nextAssignDate");
            return (Criteria) this;
        }

        public Criteria andNextAssignDateNotIn(List<Date> values) {
            addCriterion("next_assign_date not in", values, "nextAssignDate");
            return (Criteria) this;
        }

        public Criteria andNextAssignDateBetween(Date value1, Date value2) {
            addCriterion("next_assign_date between", value1, value2, "nextAssignDate");
            return (Criteria) this;
        }

        public Criteria andNextAssignDateNotBetween(Date value1, Date value2) {
            addCriterion("next_assign_date not between", value1, value2, "nextAssignDate");
            return (Criteria) this;
        }

        public Criteria andIsLaborApplyIsNull() {
            addCriterion("is_labor_apply is null");
            return (Criteria) this;
        }

        public Criteria andIsLaborApplyIsNotNull() {
            addCriterion("is_labor_apply is not null");
            return (Criteria) this;
        }

        public Criteria andIsLaborApplyEqualTo(String value) {
            addCriterion("is_labor_apply =", value, "isLaborApply");
            return (Criteria) this;
        }

        public Criteria andIsLaborApplyNotEqualTo(String value) {
            addCriterion("is_labor_apply <>", value, "isLaborApply");
            return (Criteria) this;
        }

        public Criteria andIsLaborApplyGreaterThan(String value) {
            addCriterion("is_labor_apply >", value, "isLaborApply");
            return (Criteria) this;
        }

        public Criteria andIsLaborApplyGreaterThanOrEqualTo(String value) {
            addCriterion("is_labor_apply >=", value, "isLaborApply");
            return (Criteria) this;
        }

        public Criteria andIsLaborApplyLessThan(String value) {
            addCriterion("is_labor_apply <", value, "isLaborApply");
            return (Criteria) this;
        }

        public Criteria andIsLaborApplyLessThanOrEqualTo(String value) {
            addCriterion("is_labor_apply <=", value, "isLaborApply");
            return (Criteria) this;
        }

        public Criteria andIsLaborApplyLike(String value) {
            addCriterion("is_labor_apply like", value, "isLaborApply");
            return (Criteria) this;
        }

        public Criteria andIsLaborApplyNotLike(String value) {
            addCriterion("is_labor_apply not like", value, "isLaborApply");
            return (Criteria) this;
        }

        public Criteria andIsLaborApplyIn(List<String> values) {
            addCriterion("is_labor_apply in", values, "isLaborApply");
            return (Criteria) this;
        }

        public Criteria andIsLaborApplyNotIn(List<String> values) {
            addCriterion("is_labor_apply not in", values, "isLaborApply");
            return (Criteria) this;
        }

        public Criteria andIsLaborApplyBetween(String value1, String value2) {
            addCriterion("is_labor_apply between", value1, value2, "isLaborApply");
            return (Criteria) this;
        }

        public Criteria andIsLaborApplyNotBetween(String value1, String value2) {
            addCriterion("is_labor_apply not between", value1, value2, "isLaborApply");
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