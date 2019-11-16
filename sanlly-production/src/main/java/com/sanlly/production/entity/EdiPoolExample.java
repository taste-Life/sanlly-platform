package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EdiPoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public EdiPoolExample() {
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

        public Criteria andProdEdiPoolIdIsNull() {
            addCriterion("prod_edi_pool_id is null");
            return (Criteria) this;
        }

        public Criteria andProdEdiPoolIdIsNotNull() {
            addCriterion("prod_edi_pool_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdEdiPoolIdEqualTo(Integer value) {
            addCriterion("prod_edi_pool_id =", value, "prodEdiPoolId");
            return (Criteria) this;
        }

        public Criteria andProdEdiPoolIdNotEqualTo(Integer value) {
            addCriterion("prod_edi_pool_id <>", value, "prodEdiPoolId");
            return (Criteria) this;
        }

        public Criteria andProdEdiPoolIdGreaterThan(Integer value) {
            addCriterion("prod_edi_pool_id >", value, "prodEdiPoolId");
            return (Criteria) this;
        }

        public Criteria andProdEdiPoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_edi_pool_id >=", value, "prodEdiPoolId");
            return (Criteria) this;
        }

        public Criteria andProdEdiPoolIdLessThan(Integer value) {
            addCriterion("prod_edi_pool_id <", value, "prodEdiPoolId");
            return (Criteria) this;
        }

        public Criteria andProdEdiPoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_edi_pool_id <=", value, "prodEdiPoolId");
            return (Criteria) this;
        }

        public Criteria andProdEdiPoolIdIn(List<Integer> values) {
            addCriterion("prod_edi_pool_id in", values, "prodEdiPoolId");
            return (Criteria) this;
        }

        public Criteria andProdEdiPoolIdNotIn(List<Integer> values) {
            addCriterion("prod_edi_pool_id not in", values, "prodEdiPoolId");
            return (Criteria) this;
        }

        public Criteria andProdEdiPoolIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_edi_pool_id between", value1, value2, "prodEdiPoolId");
            return (Criteria) this;
        }

        public Criteria andProdEdiPoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_edi_pool_id not between", value1, value2, "prodEdiPoolId");
            return (Criteria) this;
        }

        public Criteria andCourseIsNull() {
            addCriterion("course is null");
            return (Criteria) this;
        }

        public Criteria andCourseIsNotNull() {
            addCriterion("course is not null");
            return (Criteria) this;
        }

        public Criteria andCourseEqualTo(String value) {
            addCriterion("course =", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotEqualTo(String value) {
            addCriterion("course <>", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThan(String value) {
            addCriterion("course >", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThanOrEqualTo(String value) {
            addCriterion("course >=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThan(String value) {
            addCriterion("course <", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThanOrEqualTo(String value) {
            addCriterion("course <=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLike(String value) {
            addCriterion("course like", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotLike(String value) {
            addCriterion("course not like", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseIn(List<String> values) {
            addCriterion("course in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotIn(List<String> values) {
            addCriterion("course not in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseBetween(String value1, String value2) {
            addCriterion("course between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotBetween(String value1, String value2) {
            addCriterion("course not between", value1, value2, "course");
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

        public Criteria andEdiTypeIsNull() {
            addCriterion("edi_type is null");
            return (Criteria) this;
        }

        public Criteria andEdiTypeIsNotNull() {
            addCriterion("edi_type is not null");
            return (Criteria) this;
        }

        public Criteria andEdiTypeEqualTo(String value) {
            addCriterion("edi_type =", value, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeNotEqualTo(String value) {
            addCriterion("edi_type <>", value, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeGreaterThan(String value) {
            addCriterion("edi_type >", value, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("edi_type >=", value, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeLessThan(String value) {
            addCriterion("edi_type <", value, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeLessThanOrEqualTo(String value) {
            addCriterion("edi_type <=", value, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeLike(String value) {
            addCriterion("edi_type like", value, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeNotLike(String value) {
            addCriterion("edi_type not like", value, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeIn(List<String> values) {
            addCriterion("edi_type in", values, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeNotIn(List<String> values) {
            addCriterion("edi_type not in", values, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeBetween(String value1, String value2) {
            addCriterion("edi_type between", value1, value2, "ediType");
            return (Criteria) this;
        }

        public Criteria andEdiTypeNotBetween(String value1, String value2) {
            addCriterion("edi_type not between", value1, value2, "ediType");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoIsNull() {
            addCriterion("evaluate_no is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoIsNotNull() {
            addCriterion("evaluate_no is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoEqualTo(String value) {
            addCriterion("evaluate_no =", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoNotEqualTo(String value) {
            addCriterion("evaluate_no <>", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoGreaterThan(String value) {
            addCriterion("evaluate_no >", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_no >=", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoLessThan(String value) {
            addCriterion("evaluate_no <", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoLessThanOrEqualTo(String value) {
            addCriterion("evaluate_no <=", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoLike(String value) {
            addCriterion("evaluate_no like", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoNotLike(String value) {
            addCriterion("evaluate_no not like", value, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoIn(List<String> values) {
            addCriterion("evaluate_no in", values, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoNotIn(List<String> values) {
            addCriterion("evaluate_no not in", values, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoBetween(String value1, String value2) {
            addCriterion("evaluate_no between", value1, value2, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andEvaluateNoNotBetween(String value1, String value2) {
            addCriterion("evaluate_no not between", value1, value2, "evaluateNo");
            return (Criteria) this;
        }

        public Criteria andExportNumberIsNull() {
            addCriterion("export_number is null");
            return (Criteria) this;
        }

        public Criteria andExportNumberIsNotNull() {
            addCriterion("export_number is not null");
            return (Criteria) this;
        }

        public Criteria andExportNumberEqualTo(Integer value) {
            addCriterion("export_number =", value, "exportNumber");
            return (Criteria) this;
        }

        public Criteria andExportNumberNotEqualTo(Integer value) {
            addCriterion("export_number <>", value, "exportNumber");
            return (Criteria) this;
        }

        public Criteria andExportNumberGreaterThan(Integer value) {
            addCriterion("export_number >", value, "exportNumber");
            return (Criteria) this;
        }

        public Criteria andExportNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("export_number >=", value, "exportNumber");
            return (Criteria) this;
        }

        public Criteria andExportNumberLessThan(Integer value) {
            addCriterion("export_number <", value, "exportNumber");
            return (Criteria) this;
        }

        public Criteria andExportNumberLessThanOrEqualTo(Integer value) {
            addCriterion("export_number <=", value, "exportNumber");
            return (Criteria) this;
        }

        public Criteria andExportNumberIn(List<Integer> values) {
            addCriterion("export_number in", values, "exportNumber");
            return (Criteria) this;
        }

        public Criteria andExportNumberNotIn(List<Integer> values) {
            addCriterion("export_number not in", values, "exportNumber");
            return (Criteria) this;
        }

        public Criteria andExportNumberBetween(Integer value1, Integer value2) {
            addCriterion("export_number between", value1, value2, "exportNumber");
            return (Criteria) this;
        }

        public Criteria andExportNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("export_number not between", value1, value2, "exportNumber");
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

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("`state` like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("`state` not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andCwFeeIsNull() {
            addCriterion("cw_fee is null");
            return (Criteria) this;
        }

        public Criteria andCwFeeIsNotNull() {
            addCriterion("cw_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCwFeeEqualTo(BigDecimal value) {
            addCriterion("cw_fee =", value, "cwFee");
            return (Criteria) this;
        }

        public Criteria andCwFeeNotEqualTo(BigDecimal value) {
            addCriterion("cw_fee <>", value, "cwFee");
            return (Criteria) this;
        }

        public Criteria andCwFeeGreaterThan(BigDecimal value) {
            addCriterion("cw_fee >", value, "cwFee");
            return (Criteria) this;
        }

        public Criteria andCwFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cw_fee >=", value, "cwFee");
            return (Criteria) this;
        }

        public Criteria andCwFeeLessThan(BigDecimal value) {
            addCriterion("cw_fee <", value, "cwFee");
            return (Criteria) this;
        }

        public Criteria andCwFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cw_fee <=", value, "cwFee");
            return (Criteria) this;
        }

        public Criteria andCwFeeIn(List<BigDecimal> values) {
            addCriterion("cw_fee in", values, "cwFee");
            return (Criteria) this;
        }

        public Criteria andCwFeeNotIn(List<BigDecimal> values) {
            addCriterion("cw_fee not in", values, "cwFee");
            return (Criteria) this;
        }

        public Criteria andCwFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cw_fee between", value1, value2, "cwFee");
            return (Criteria) this;
        }

        public Criteria andCwFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cw_fee not between", value1, value2, "cwFee");
            return (Criteria) this;
        }

        public Criteria andDppFeeIsNull() {
            addCriterion("dpp_fee is null");
            return (Criteria) this;
        }

        public Criteria andDppFeeIsNotNull() {
            addCriterion("dpp_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDppFeeEqualTo(BigDecimal value) {
            addCriterion("dpp_fee =", value, "dppFee");
            return (Criteria) this;
        }

        public Criteria andDppFeeNotEqualTo(BigDecimal value) {
            addCriterion("dpp_fee <>", value, "dppFee");
            return (Criteria) this;
        }

        public Criteria andDppFeeGreaterThan(BigDecimal value) {
            addCriterion("dpp_fee >", value, "dppFee");
            return (Criteria) this;
        }

        public Criteria andDppFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dpp_fee >=", value, "dppFee");
            return (Criteria) this;
        }

        public Criteria andDppFeeLessThan(BigDecimal value) {
            addCriterion("dpp_fee <", value, "dppFee");
            return (Criteria) this;
        }

        public Criteria andDppFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dpp_fee <=", value, "dppFee");
            return (Criteria) this;
        }

        public Criteria andDppFeeIn(List<BigDecimal> values) {
            addCriterion("dpp_fee in", values, "dppFee");
            return (Criteria) this;
        }

        public Criteria andDppFeeNotIn(List<BigDecimal> values) {
            addCriterion("dpp_fee not in", values, "dppFee");
            return (Criteria) this;
        }

        public Criteria andDppFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dpp_fee between", value1, value2, "dppFee");
            return (Criteria) this;
        }

        public Criteria andDppFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dpp_fee not between", value1, value2, "dppFee");
            return (Criteria) this;
        }

        public Criteria andClientCodeIsNull() {
            addCriterion("client_code is null");
            return (Criteria) this;
        }

        public Criteria andClientCodeIsNotNull() {
            addCriterion("client_code is not null");
            return (Criteria) this;
        }

        public Criteria andClientCodeEqualTo(String value) {
            addCriterion("client_code =", value, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeNotEqualTo(String value) {
            addCriterion("client_code <>", value, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeGreaterThan(String value) {
            addCriterion("client_code >", value, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeGreaterThanOrEqualTo(String value) {
            addCriterion("client_code >=", value, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeLessThan(String value) {
            addCriterion("client_code <", value, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeLessThanOrEqualTo(String value) {
            addCriterion("client_code <=", value, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeLike(String value) {
            addCriterion("client_code like", value, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeNotLike(String value) {
            addCriterion("client_code not like", value, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeIn(List<String> values) {
            addCriterion("client_code in", values, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeNotIn(List<String> values) {
            addCriterion("client_code not in", values, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeBetween(String value1, String value2) {
            addCriterion("client_code between", value1, value2, "clientCode");
            return (Criteria) this;
        }

        public Criteria andClientCodeNotBetween(String value1, String value2) {
            addCriterion("client_code not between", value1, value2, "clientCode");
            return (Criteria) this;
        }

        public Criteria andWestimAdviceIsNull() {
            addCriterion("westim_advice is null");
            return (Criteria) this;
        }

        public Criteria andWestimAdviceIsNotNull() {
            addCriterion("westim_advice is not null");
            return (Criteria) this;
        }

        public Criteria andWestimAdviceEqualTo(String value) {
            addCriterion("westim_advice =", value, "westimAdvice");
            return (Criteria) this;
        }

        public Criteria andWestimAdviceNotEqualTo(String value) {
            addCriterion("westim_advice <>", value, "westimAdvice");
            return (Criteria) this;
        }

        public Criteria andWestimAdviceGreaterThan(String value) {
            addCriterion("westim_advice >", value, "westimAdvice");
            return (Criteria) this;
        }

        public Criteria andWestimAdviceGreaterThanOrEqualTo(String value) {
            addCriterion("westim_advice >=", value, "westimAdvice");
            return (Criteria) this;
        }

        public Criteria andWestimAdviceLessThan(String value) {
            addCriterion("westim_advice <", value, "westimAdvice");
            return (Criteria) this;
        }

        public Criteria andWestimAdviceLessThanOrEqualTo(String value) {
            addCriterion("westim_advice <=", value, "westimAdvice");
            return (Criteria) this;
        }

        public Criteria andWestimAdviceLike(String value) {
            addCriterion("westim_advice like", value, "westimAdvice");
            return (Criteria) this;
        }

        public Criteria andWestimAdviceNotLike(String value) {
            addCriterion("westim_advice not like", value, "westimAdvice");
            return (Criteria) this;
        }

        public Criteria andWestimAdviceIn(List<String> values) {
            addCriterion("westim_advice in", values, "westimAdvice");
            return (Criteria) this;
        }

        public Criteria andWestimAdviceNotIn(List<String> values) {
            addCriterion("westim_advice not in", values, "westimAdvice");
            return (Criteria) this;
        }

        public Criteria andWestimAdviceBetween(String value1, String value2) {
            addCriterion("westim_advice between", value1, value2, "westimAdvice");
            return (Criteria) this;
        }

        public Criteria andWestimAdviceNotBetween(String value1, String value2) {
            addCriterion("westim_advice not between", value1, value2, "westimAdvice");
            return (Criteria) this;
        }

        public Criteria andEdiVersionIsNull() {
            addCriterion("edi_version is null");
            return (Criteria) this;
        }

        public Criteria andEdiVersionIsNotNull() {
            addCriterion("edi_version is not null");
            return (Criteria) this;
        }

        public Criteria andEdiVersionEqualTo(Integer value) {
            addCriterion("edi_version =", value, "ediVersion");
            return (Criteria) this;
        }

        public Criteria andEdiVersionNotEqualTo(Integer value) {
            addCriterion("edi_version <>", value, "ediVersion");
            return (Criteria) this;
        }

        public Criteria andEdiVersionGreaterThan(Integer value) {
            addCriterion("edi_version >", value, "ediVersion");
            return (Criteria) this;
        }

        public Criteria andEdiVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("edi_version >=", value, "ediVersion");
            return (Criteria) this;
        }

        public Criteria andEdiVersionLessThan(Integer value) {
            addCriterion("edi_version <", value, "ediVersion");
            return (Criteria) this;
        }

        public Criteria andEdiVersionLessThanOrEqualTo(Integer value) {
            addCriterion("edi_version <=", value, "ediVersion");
            return (Criteria) this;
        }

        public Criteria andEdiVersionIn(List<Integer> values) {
            addCriterion("edi_version in", values, "ediVersion");
            return (Criteria) this;
        }

        public Criteria andEdiVersionNotIn(List<Integer> values) {
            addCriterion("edi_version not in", values, "ediVersion");
            return (Criteria) this;
        }

        public Criteria andEdiVersionBetween(Integer value1, Integer value2) {
            addCriterion("edi_version between", value1, value2, "ediVersion");
            return (Criteria) this;
        }

        public Criteria andEdiVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("edi_version not between", value1, value2, "ediVersion");
            return (Criteria) this;
        }

        public Criteria andConditionIsNull() {
            addCriterion("`condition` is null");
            return (Criteria) this;
        }

        public Criteria andConditionIsNotNull() {
            addCriterion("`condition` is not null");
            return (Criteria) this;
        }

        public Criteria andConditionEqualTo(String value) {
            addCriterion("`condition` =", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotEqualTo(String value) {
            addCriterion("`condition` <>", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionGreaterThan(String value) {
            addCriterion("`condition` >", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionGreaterThanOrEqualTo(String value) {
            addCriterion("`condition` >=", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionLessThan(String value) {
            addCriterion("`condition` <", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionLessThanOrEqualTo(String value) {
            addCriterion("`condition` <=", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionLike(String value) {
            addCriterion("`condition` like", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotLike(String value) {
            addCriterion("`condition` not like", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionIn(List<String> values) {
            addCriterion("`condition` in", values, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotIn(List<String> values) {
            addCriterion("`condition` not in", values, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionBetween(String value1, String value2) {
            addCriterion("`condition` between", value1, value2, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotBetween(String value1, String value2) {
            addCriterion("`condition` not between", value1, value2, "condition");
            return (Criteria) this;
        }

        public Criteria andGateinAdviceIsNull() {
            addCriterion("gatein_advice is null");
            return (Criteria) this;
        }

        public Criteria andGateinAdviceIsNotNull() {
            addCriterion("gatein_advice is not null");
            return (Criteria) this;
        }

        public Criteria andGateinAdviceEqualTo(String value) {
            addCriterion("gatein_advice =", value, "gateinAdvice");
            return (Criteria) this;
        }

        public Criteria andGateinAdviceNotEqualTo(String value) {
            addCriterion("gatein_advice <>", value, "gateinAdvice");
            return (Criteria) this;
        }

        public Criteria andGateinAdviceGreaterThan(String value) {
            addCriterion("gatein_advice >", value, "gateinAdvice");
            return (Criteria) this;
        }

        public Criteria andGateinAdviceGreaterThanOrEqualTo(String value) {
            addCriterion("gatein_advice >=", value, "gateinAdvice");
            return (Criteria) this;
        }

        public Criteria andGateinAdviceLessThan(String value) {
            addCriterion("gatein_advice <", value, "gateinAdvice");
            return (Criteria) this;
        }

        public Criteria andGateinAdviceLessThanOrEqualTo(String value) {
            addCriterion("gatein_advice <=", value, "gateinAdvice");
            return (Criteria) this;
        }

        public Criteria andGateinAdviceLike(String value) {
            addCriterion("gatein_advice like", value, "gateinAdvice");
            return (Criteria) this;
        }

        public Criteria andGateinAdviceNotLike(String value) {
            addCriterion("gatein_advice not like", value, "gateinAdvice");
            return (Criteria) this;
        }

        public Criteria andGateinAdviceIn(List<String> values) {
            addCriterion("gatein_advice in", values, "gateinAdvice");
            return (Criteria) this;
        }

        public Criteria andGateinAdviceNotIn(List<String> values) {
            addCriterion("gatein_advice not in", values, "gateinAdvice");
            return (Criteria) this;
        }

        public Criteria andGateinAdviceBetween(String value1, String value2) {
            addCriterion("gatein_advice between", value1, value2, "gateinAdvice");
            return (Criteria) this;
        }

        public Criteria andGateinAdviceNotBetween(String value1, String value2) {
            addCriterion("gatein_advice not between", value1, value2, "gateinAdvice");
            return (Criteria) this;
        }

        public Criteria andGateoutImpordateIsNull() {
            addCriterion("gateout_impordate is null");
            return (Criteria) this;
        }

        public Criteria andGateoutImpordateIsNotNull() {
            addCriterion("gateout_impordate is not null");
            return (Criteria) this;
        }

        public Criteria andGateoutImpordateEqualTo(Date value) {
            addCriterion("gateout_impordate =", value, "gateoutImpordate");
            return (Criteria) this;
        }

        public Criteria andGateoutImpordateNotEqualTo(Date value) {
            addCriterion("gateout_impordate <>", value, "gateoutImpordate");
            return (Criteria) this;
        }

        public Criteria andGateoutImpordateGreaterThan(Date value) {
            addCriterion("gateout_impordate >", value, "gateoutImpordate");
            return (Criteria) this;
        }

        public Criteria andGateoutImpordateGreaterThanOrEqualTo(Date value) {
            addCriterion("gateout_impordate >=", value, "gateoutImpordate");
            return (Criteria) this;
        }

        public Criteria andGateoutImpordateLessThan(Date value) {
            addCriterion("gateout_impordate <", value, "gateoutImpordate");
            return (Criteria) this;
        }

        public Criteria andGateoutImpordateLessThanOrEqualTo(Date value) {
            addCriterion("gateout_impordate <=", value, "gateoutImpordate");
            return (Criteria) this;
        }

        public Criteria andGateoutImpordateIn(List<Date> values) {
            addCriterion("gateout_impordate in", values, "gateoutImpordate");
            return (Criteria) this;
        }

        public Criteria andGateoutImpordateNotIn(List<Date> values) {
            addCriterion("gateout_impordate not in", values, "gateoutImpordate");
            return (Criteria) this;
        }

        public Criteria andGateoutImpordateBetween(Date value1, Date value2) {
            addCriterion("gateout_impordate between", value1, value2, "gateoutImpordate");
            return (Criteria) this;
        }

        public Criteria andGateoutImpordateNotBetween(Date value1, Date value2) {
            addCriterion("gateout_impordate not between", value1, value2, "gateoutImpordate");
            return (Criteria) this;
        }

        public Criteria andGateoutAdviceIsNull() {
            addCriterion("gateout_advice is null");
            return (Criteria) this;
        }

        public Criteria andGateoutAdviceIsNotNull() {
            addCriterion("gateout_advice is not null");
            return (Criteria) this;
        }

        public Criteria andGateoutAdviceEqualTo(String value) {
            addCriterion("gateout_advice =", value, "gateoutAdvice");
            return (Criteria) this;
        }

        public Criteria andGateoutAdviceNotEqualTo(String value) {
            addCriterion("gateout_advice <>", value, "gateoutAdvice");
            return (Criteria) this;
        }

        public Criteria andGateoutAdviceGreaterThan(String value) {
            addCriterion("gateout_advice >", value, "gateoutAdvice");
            return (Criteria) this;
        }

        public Criteria andGateoutAdviceGreaterThanOrEqualTo(String value) {
            addCriterion("gateout_advice >=", value, "gateoutAdvice");
            return (Criteria) this;
        }

        public Criteria andGateoutAdviceLessThan(String value) {
            addCriterion("gateout_advice <", value, "gateoutAdvice");
            return (Criteria) this;
        }

        public Criteria andGateoutAdviceLessThanOrEqualTo(String value) {
            addCriterion("gateout_advice <=", value, "gateoutAdvice");
            return (Criteria) this;
        }

        public Criteria andGateoutAdviceLike(String value) {
            addCriterion("gateout_advice like", value, "gateoutAdvice");
            return (Criteria) this;
        }

        public Criteria andGateoutAdviceNotLike(String value) {
            addCriterion("gateout_advice not like", value, "gateoutAdvice");
            return (Criteria) this;
        }

        public Criteria andGateoutAdviceIn(List<String> values) {
            addCriterion("gateout_advice in", values, "gateoutAdvice");
            return (Criteria) this;
        }

        public Criteria andGateoutAdviceNotIn(List<String> values) {
            addCriterion("gateout_advice not in", values, "gateoutAdvice");
            return (Criteria) this;
        }

        public Criteria andGateoutAdviceBetween(String value1, String value2) {
            addCriterion("gateout_advice between", value1, value2, "gateoutAdvice");
            return (Criteria) this;
        }

        public Criteria andGateoutAdviceNotBetween(String value1, String value2) {
            addCriterion("gateout_advice not between", value1, value2, "gateoutAdvice");
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

        public Criteria andGateinRefferenceIsNull() {
            addCriterion("GATEIN_REFFERENCE is null");
            return (Criteria) this;
        }

        public Criteria andGateinRefferenceIsNotNull() {
            addCriterion("GATEIN_REFFERENCE is not null");
            return (Criteria) this;
        }

        public Criteria andGateinRefferenceEqualTo(String value) {
            addCriterion("GATEIN_REFFERENCE =", value, "gateinRefference");
            return (Criteria) this;
        }

        public Criteria andGateinRefferenceNotEqualTo(String value) {
            addCriterion("GATEIN_REFFERENCE <>", value, "gateinRefference");
            return (Criteria) this;
        }

        public Criteria andGateinRefferenceGreaterThan(String value) {
            addCriterion("GATEIN_REFFERENCE >", value, "gateinRefference");
            return (Criteria) this;
        }

        public Criteria andGateinRefferenceGreaterThanOrEqualTo(String value) {
            addCriterion("GATEIN_REFFERENCE >=", value, "gateinRefference");
            return (Criteria) this;
        }

        public Criteria andGateinRefferenceLessThan(String value) {
            addCriterion("GATEIN_REFFERENCE <", value, "gateinRefference");
            return (Criteria) this;
        }

        public Criteria andGateinRefferenceLessThanOrEqualTo(String value) {
            addCriterion("GATEIN_REFFERENCE <=", value, "gateinRefference");
            return (Criteria) this;
        }

        public Criteria andGateinRefferenceLike(String value) {
            addCriterion("GATEIN_REFFERENCE like", value, "gateinRefference");
            return (Criteria) this;
        }

        public Criteria andGateinRefferenceNotLike(String value) {
            addCriterion("GATEIN_REFFERENCE not like", value, "gateinRefference");
            return (Criteria) this;
        }

        public Criteria andGateinRefferenceIn(List<String> values) {
            addCriterion("GATEIN_REFFERENCE in", values, "gateinRefference");
            return (Criteria) this;
        }

        public Criteria andGateinRefferenceNotIn(List<String> values) {
            addCriterion("GATEIN_REFFERENCE not in", values, "gateinRefference");
            return (Criteria) this;
        }

        public Criteria andGateinRefferenceBetween(String value1, String value2) {
            addCriterion("GATEIN_REFFERENCE between", value1, value2, "gateinRefference");
            return (Criteria) this;
        }

        public Criteria andGateinRefferenceNotBetween(String value1, String value2) {
            addCriterion("GATEIN_REFFERENCE not between", value1, value2, "gateinRefference");
            return (Criteria) this;
        }

        public Criteria andWestimAuthamtIsNull() {
            addCriterion("WESTIM_AUTHAMT is null");
            return (Criteria) this;
        }

        public Criteria andWestimAuthamtIsNotNull() {
            addCriterion("WESTIM_AUTHAMT is not null");
            return (Criteria) this;
        }

        public Criteria andWestimAuthamtEqualTo(String value) {
            addCriterion("WESTIM_AUTHAMT =", value, "westimAuthamt");
            return (Criteria) this;
        }

        public Criteria andWestimAuthamtNotEqualTo(String value) {
            addCriterion("WESTIM_AUTHAMT <>", value, "westimAuthamt");
            return (Criteria) this;
        }

        public Criteria andWestimAuthamtGreaterThan(String value) {
            addCriterion("WESTIM_AUTHAMT >", value, "westimAuthamt");
            return (Criteria) this;
        }

        public Criteria andWestimAuthamtGreaterThanOrEqualTo(String value) {
            addCriterion("WESTIM_AUTHAMT >=", value, "westimAuthamt");
            return (Criteria) this;
        }

        public Criteria andWestimAuthamtLessThan(String value) {
            addCriterion("WESTIM_AUTHAMT <", value, "westimAuthamt");
            return (Criteria) this;
        }

        public Criteria andWestimAuthamtLessThanOrEqualTo(String value) {
            addCriterion("WESTIM_AUTHAMT <=", value, "westimAuthamt");
            return (Criteria) this;
        }

        public Criteria andWestimAuthamtLike(String value) {
            addCriterion("WESTIM_AUTHAMT like", value, "westimAuthamt");
            return (Criteria) this;
        }

        public Criteria andWestimAuthamtNotLike(String value) {
            addCriterion("WESTIM_AUTHAMT not like", value, "westimAuthamt");
            return (Criteria) this;
        }

        public Criteria andWestimAuthamtIn(List<String> values) {
            addCriterion("WESTIM_AUTHAMT in", values, "westimAuthamt");
            return (Criteria) this;
        }

        public Criteria andWestimAuthamtNotIn(List<String> values) {
            addCriterion("WESTIM_AUTHAMT not in", values, "westimAuthamt");
            return (Criteria) this;
        }

        public Criteria andWestimAuthamtBetween(String value1, String value2) {
            addCriterion("WESTIM_AUTHAMT between", value1, value2, "westimAuthamt");
            return (Criteria) this;
        }

        public Criteria andWestimAuthamtNotBetween(String value1, String value2) {
            addCriterion("WESTIM_AUTHAMT not between", value1, value2, "westimAuthamt");
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