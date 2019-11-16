package com.sanlly.warehouse.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareLaborInsuranceDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareLaborInsuranceDetailExample() {
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

        public Criteria andWareLaborInsuranceDetailIdIsNull() {
            addCriterion("ware_labor_insurance_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceDetailIdIsNotNull() {
            addCriterion("ware_labor_insurance_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceDetailIdEqualTo(Integer value) {
            addCriterion("ware_labor_insurance_detail_id =", value, "wareLaborInsuranceDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceDetailIdNotEqualTo(Integer value) {
            addCriterion("ware_labor_insurance_detail_id <>", value, "wareLaborInsuranceDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceDetailIdGreaterThan(Integer value) {
            addCriterion("ware_labor_insurance_detail_id >", value, "wareLaborInsuranceDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_labor_insurance_detail_id >=", value, "wareLaborInsuranceDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceDetailIdLessThan(Integer value) {
            addCriterion("ware_labor_insurance_detail_id <", value, "wareLaborInsuranceDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_labor_insurance_detail_id <=", value, "wareLaborInsuranceDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceDetailIdIn(List<Integer> values) {
            addCriterion("ware_labor_insurance_detail_id in", values, "wareLaborInsuranceDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceDetailIdNotIn(List<Integer> values) {
            addCriterion("ware_labor_insurance_detail_id not in", values, "wareLaborInsuranceDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_labor_insurance_detail_id between", value1, value2, "wareLaborInsuranceDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_labor_insurance_detail_id not between", value1, value2, "wareLaborInsuranceDetailId");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceIsNull() {
            addCriterion("ware_labor_insurance is null");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceIsNotNull() {
            addCriterion("ware_labor_insurance is not null");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceEqualTo(String value) {
            addCriterion("ware_labor_insurance =", value, "wareLaborInsurance");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceNotEqualTo(String value) {
            addCriterion("ware_labor_insurance <>", value, "wareLaborInsurance");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceGreaterThan(String value) {
            addCriterion("ware_labor_insurance >", value, "wareLaborInsurance");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("ware_labor_insurance >=", value, "wareLaborInsurance");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceLessThan(String value) {
            addCriterion("ware_labor_insurance <", value, "wareLaborInsurance");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceLessThanOrEqualTo(String value) {
            addCriterion("ware_labor_insurance <=", value, "wareLaborInsurance");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceLike(String value) {
            addCriterion("ware_labor_insurance like", value, "wareLaborInsurance");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceNotLike(String value) {
            addCriterion("ware_labor_insurance not like", value, "wareLaborInsurance");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceIn(List<String> values) {
            addCriterion("ware_labor_insurance in", values, "wareLaborInsurance");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceNotIn(List<String> values) {
            addCriterion("ware_labor_insurance not in", values, "wareLaborInsurance");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceBetween(String value1, String value2) {
            addCriterion("ware_labor_insurance between", value1, value2, "wareLaborInsurance");
            return (Criteria) this;
        }

        public Criteria andWareLaborInsuranceNotBetween(String value1, String value2) {
            addCriterion("ware_labor_insurance not between", value1, value2, "wareLaborInsurance");
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

        public Criteria andFirstNumIsNull() {
            addCriterion("first_num is null");
            return (Criteria) this;
        }

        public Criteria andFirstNumIsNotNull() {
            addCriterion("first_num is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNumEqualTo(Double value) {
            addCriterion("first_num =", value, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumNotEqualTo(Double value) {
            addCriterion("first_num <>", value, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumGreaterThan(Double value) {
            addCriterion("first_num >", value, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumGreaterThanOrEqualTo(Double value) {
            addCriterion("first_num >=", value, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumLessThan(Double value) {
            addCriterion("first_num <", value, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumLessThanOrEqualTo(Double value) {
            addCriterion("first_num <=", value, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumIn(List<Double> values) {
            addCriterion("first_num in", values, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumNotIn(List<Double> values) {
            addCriterion("first_num not in", values, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumBetween(Double value1, Double value2) {
            addCriterion("first_num between", value1, value2, "firstNum");
            return (Criteria) this;
        }

        public Criteria andFirstNumNotBetween(Double value1, Double value2) {
            addCriterion("first_num not between", value1, value2, "firstNum");
            return (Criteria) this;
        }

        public Criteria andCycleTermIsNull() {
            addCriterion("cycle_term is null");
            return (Criteria) this;
        }

        public Criteria andCycleTermIsNotNull() {
            addCriterion("cycle_term is not null");
            return (Criteria) this;
        }

        public Criteria andCycleTermEqualTo(Integer value) {
            addCriterion("cycle_term =", value, "cycleTerm");
            return (Criteria) this;
        }

        public Criteria andCycleTermNotEqualTo(Integer value) {
            addCriterion("cycle_term <>", value, "cycleTerm");
            return (Criteria) this;
        }

        public Criteria andCycleTermGreaterThan(Integer value) {
            addCriterion("cycle_term >", value, "cycleTerm");
            return (Criteria) this;
        }

        public Criteria andCycleTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("cycle_term >=", value, "cycleTerm");
            return (Criteria) this;
        }

        public Criteria andCycleTermLessThan(Integer value) {
            addCriterion("cycle_term <", value, "cycleTerm");
            return (Criteria) this;
        }

        public Criteria andCycleTermLessThanOrEqualTo(Integer value) {
            addCriterion("cycle_term <=", value, "cycleTerm");
            return (Criteria) this;
        }

        public Criteria andCycleTermIn(List<Integer> values) {
            addCriterion("cycle_term in", values, "cycleTerm");
            return (Criteria) this;
        }

        public Criteria andCycleTermNotIn(List<Integer> values) {
            addCriterion("cycle_term not in", values, "cycleTerm");
            return (Criteria) this;
        }

        public Criteria andCycleTermBetween(Integer value1, Integer value2) {
            addCriterion("cycle_term between", value1, value2, "cycleTerm");
            return (Criteria) this;
        }

        public Criteria andCycleTermNotBetween(Integer value1, Integer value2) {
            addCriterion("cycle_term not between", value1, value2, "cycleTerm");
            return (Criteria) this;
        }

        public Criteria andFirstTermIsNull() {
            addCriterion("first_term is null");
            return (Criteria) this;
        }

        public Criteria andFirstTermIsNotNull() {
            addCriterion("first_term is not null");
            return (Criteria) this;
        }

        public Criteria andFirstTermEqualTo(Integer value) {
            addCriterion("first_term =", value, "firstTerm");
            return (Criteria) this;
        }

        public Criteria andFirstTermNotEqualTo(Integer value) {
            addCriterion("first_term <>", value, "firstTerm");
            return (Criteria) this;
        }

        public Criteria andFirstTermGreaterThan(Integer value) {
            addCriterion("first_term >", value, "firstTerm");
            return (Criteria) this;
        }

        public Criteria andFirstTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_term >=", value, "firstTerm");
            return (Criteria) this;
        }

        public Criteria andFirstTermLessThan(Integer value) {
            addCriterion("first_term <", value, "firstTerm");
            return (Criteria) this;
        }

        public Criteria andFirstTermLessThanOrEqualTo(Integer value) {
            addCriterion("first_term <=", value, "firstTerm");
            return (Criteria) this;
        }

        public Criteria andFirstTermIn(List<Integer> values) {
            addCriterion("first_term in", values, "firstTerm");
            return (Criteria) this;
        }

        public Criteria andFirstTermNotIn(List<Integer> values) {
            addCriterion("first_term not in", values, "firstTerm");
            return (Criteria) this;
        }

        public Criteria andFirstTermBetween(Integer value1, Integer value2) {
            addCriterion("first_term between", value1, value2, "firstTerm");
            return (Criteria) this;
        }

        public Criteria andFirstTermNotBetween(Integer value1, Integer value2) {
            addCriterion("first_term not between", value1, value2, "firstTerm");
            return (Criteria) this;
        }

        public Criteria andCycleNumIsNull() {
            addCriterion("cycle_num is null");
            return (Criteria) this;
        }

        public Criteria andCycleNumIsNotNull() {
            addCriterion("cycle_num is not null");
            return (Criteria) this;
        }

        public Criteria andCycleNumEqualTo(Double value) {
            addCriterion("cycle_num =", value, "cycleNum");
            return (Criteria) this;
        }

        public Criteria andCycleNumNotEqualTo(Double value) {
            addCriterion("cycle_num <>", value, "cycleNum");
            return (Criteria) this;
        }

        public Criteria andCycleNumGreaterThan(Double value) {
            addCriterion("cycle_num >", value, "cycleNum");
            return (Criteria) this;
        }

        public Criteria andCycleNumGreaterThanOrEqualTo(Double value) {
            addCriterion("cycle_num >=", value, "cycleNum");
            return (Criteria) this;
        }

        public Criteria andCycleNumLessThan(Double value) {
            addCriterion("cycle_num <", value, "cycleNum");
            return (Criteria) this;
        }

        public Criteria andCycleNumLessThanOrEqualTo(Double value) {
            addCriterion("cycle_num <=", value, "cycleNum");
            return (Criteria) this;
        }

        public Criteria andCycleNumIn(List<Double> values) {
            addCriterion("cycle_num in", values, "cycleNum");
            return (Criteria) this;
        }

        public Criteria andCycleNumNotIn(List<Double> values) {
            addCriterion("cycle_num not in", values, "cycleNum");
            return (Criteria) this;
        }

        public Criteria andCycleNumBetween(Double value1, Double value2) {
            addCriterion("cycle_num between", value1, value2, "cycleNum");
            return (Criteria) this;
        }

        public Criteria andCycleNumNotBetween(Double value1, Double value2) {
            addCriterion("cycle_num not between", value1, value2, "cycleNum");
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