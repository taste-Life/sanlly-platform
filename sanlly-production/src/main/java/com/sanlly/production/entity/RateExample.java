package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public RateExample() {
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

        public Criteria andProdRateIdIsNull() {
            addCriterion("prod_rate_id is null");
            return (Criteria) this;
        }

        public Criteria andProdRateIdIsNotNull() {
            addCriterion("prod_rate_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdRateIdEqualTo(String value) {
            addCriterion("prod_rate_id =", value, "prodRateId");
            return (Criteria) this;
        }

        public Criteria andProdRateIdNotEqualTo(String value) {
            addCriterion("prod_rate_id <>", value, "prodRateId");
            return (Criteria) this;
        }

        public Criteria andProdRateIdGreaterThan(String value) {
            addCriterion("prod_rate_id >", value, "prodRateId");
            return (Criteria) this;
        }

        public Criteria andProdRateIdGreaterThanOrEqualTo(String value) {
            addCriterion("prod_rate_id >=", value, "prodRateId");
            return (Criteria) this;
        }

        public Criteria andProdRateIdLessThan(String value) {
            addCriterion("prod_rate_id <", value, "prodRateId");
            return (Criteria) this;
        }

        public Criteria andProdRateIdLessThanOrEqualTo(String value) {
            addCriterion("prod_rate_id <=", value, "prodRateId");
            return (Criteria) this;
        }

        public Criteria andProdRateIdLike(String value) {
            addCriterion("prod_rate_id like", value, "prodRateId");
            return (Criteria) this;
        }

        public Criteria andProdRateIdNotLike(String value) {
            addCriterion("prod_rate_id not like", value, "prodRateId");
            return (Criteria) this;
        }

        public Criteria andProdRateIdIn(List<String> values) {
            addCriterion("prod_rate_id in", values, "prodRateId");
            return (Criteria) this;
        }

        public Criteria andProdRateIdNotIn(List<String> values) {
            addCriterion("prod_rate_id not in", values, "prodRateId");
            return (Criteria) this;
        }

        public Criteria andProdRateIdBetween(String value1, String value2) {
            addCriterion("prod_rate_id between", value1, value2, "prodRateId");
            return (Criteria) this;
        }

        public Criteria andProdRateIdNotBetween(String value1, String value2) {
            addCriterion("prod_rate_id not between", value1, value2, "prodRateId");
            return (Criteria) this;
        }

        public Criteria andStandardRateIsNull() {
            addCriterion("standard_rate is null");
            return (Criteria) this;
        }

        public Criteria andStandardRateIsNotNull() {
            addCriterion("standard_rate is not null");
            return (Criteria) this;
        }

        public Criteria andStandardRateEqualTo(String value) {
            addCriterion("standard_rate =", value, "standardRate");
            return (Criteria) this;
        }

        public Criteria andStandardRateNotEqualTo(String value) {
            addCriterion("standard_rate <>", value, "standardRate");
            return (Criteria) this;
        }

        public Criteria andStandardRateGreaterThan(String value) {
            addCriterion("standard_rate >", value, "standardRate");
            return (Criteria) this;
        }

        public Criteria andStandardRateGreaterThanOrEqualTo(String value) {
            addCriterion("standard_rate >=", value, "standardRate");
            return (Criteria) this;
        }

        public Criteria andStandardRateLessThan(String value) {
            addCriterion("standard_rate <", value, "standardRate");
            return (Criteria) this;
        }

        public Criteria andStandardRateLessThanOrEqualTo(String value) {
            addCriterion("standard_rate <=", value, "standardRate");
            return (Criteria) this;
        }

        public Criteria andStandardRateLike(String value) {
            addCriterion("standard_rate like", value, "standardRate");
            return (Criteria) this;
        }

        public Criteria andStandardRateNotLike(String value) {
            addCriterion("standard_rate not like", value, "standardRate");
            return (Criteria) this;
        }

        public Criteria andStandardRateIn(List<String> values) {
            addCriterion("standard_rate in", values, "standardRate");
            return (Criteria) this;
        }

        public Criteria andStandardRateNotIn(List<String> values) {
            addCriterion("standard_rate not in", values, "standardRate");
            return (Criteria) this;
        }

        public Criteria andStandardRateBetween(String value1, String value2) {
            addCriterion("standard_rate between", value1, value2, "standardRate");
            return (Criteria) this;
        }

        public Criteria andStandardRateNotBetween(String value1, String value2) {
            addCriterion("standard_rate not between", value1, value2, "standardRate");
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

        public Criteria andCalculationTypeIsNull() {
            addCriterion("calculation_type is null");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIsNotNull() {
            addCriterion("calculation_type is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeEqualTo(String value) {
            addCriterion("calculation_type =", value, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNotEqualTo(String value) {
            addCriterion("calculation_type <>", value, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeGreaterThan(String value) {
            addCriterion("calculation_type >", value, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("calculation_type >=", value, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeLessThan(String value) {
            addCriterion("calculation_type <", value, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeLessThanOrEqualTo(String value) {
            addCriterion("calculation_type <=", value, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeLike(String value) {
            addCriterion("calculation_type like", value, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNotLike(String value) {
            addCriterion("calculation_type not like", value, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIn(List<String> values) {
            addCriterion("calculation_type in", values, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNotIn(List<String> values) {
            addCriterion("calculation_type not in", values, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeBetween(String value1, String value2) {
            addCriterion("calculation_type between", value1, value2, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNotBetween(String value1, String value2) {
            addCriterion("calculation_type not between", value1, value2, "calculationType");
            return (Criteria) this;
        }

        public Criteria andRateCodeIsNull() {
            addCriterion("rate_code is null");
            return (Criteria) this;
        }

        public Criteria andRateCodeIsNotNull() {
            addCriterion("rate_code is not null");
            return (Criteria) this;
        }

        public Criteria andRateCodeEqualTo(String value) {
            addCriterion("rate_code =", value, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeNotEqualTo(String value) {
            addCriterion("rate_code <>", value, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeGreaterThan(String value) {
            addCriterion("rate_code >", value, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("rate_code >=", value, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeLessThan(String value) {
            addCriterion("rate_code <", value, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeLessThanOrEqualTo(String value) {
            addCriterion("rate_code <=", value, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeLike(String value) {
            addCriterion("rate_code like", value, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeNotLike(String value) {
            addCriterion("rate_code not like", value, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeIn(List<String> values) {
            addCriterion("rate_code in", values, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeNotIn(List<String> values) {
            addCriterion("rate_code not in", values, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeBetween(String value1, String value2) {
            addCriterion("rate_code between", value1, value2, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeNotBetween(String value1, String value2) {
            addCriterion("rate_code not between", value1, value2, "rateCode");
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

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andPartsTypeIsNull() {
            addCriterion("parts_type is null");
            return (Criteria) this;
        }

        public Criteria andPartsTypeIsNotNull() {
            addCriterion("parts_type is not null");
            return (Criteria) this;
        }

        public Criteria andPartsTypeEqualTo(String value) {
            addCriterion("parts_type =", value, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeNotEqualTo(String value) {
            addCriterion("parts_type <>", value, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeGreaterThan(String value) {
            addCriterion("parts_type >", value, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("parts_type >=", value, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeLessThan(String value) {
            addCriterion("parts_type <", value, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeLessThanOrEqualTo(String value) {
            addCriterion("parts_type <=", value, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeLike(String value) {
            addCriterion("parts_type like", value, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeNotLike(String value) {
            addCriterion("parts_type not like", value, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeIn(List<String> values) {
            addCriterion("parts_type in", values, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeNotIn(List<String> values) {
            addCriterion("parts_type not in", values, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeBetween(String value1, String value2) {
            addCriterion("parts_type between", value1, value2, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeNotBetween(String value1, String value2) {
            addCriterion("parts_type not between", value1, value2, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsIsNull() {
            addCriterion("parts_details is null");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsIsNotNull() {
            addCriterion("parts_details is not null");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsEqualTo(String value) {
            addCriterion("parts_details =", value, "partsDetails");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNotEqualTo(String value) {
            addCriterion("parts_details <>", value, "partsDetails");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsGreaterThan(String value) {
            addCriterion("parts_details >", value, "partsDetails");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("parts_details >=", value, "partsDetails");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsLessThan(String value) {
            addCriterion("parts_details <", value, "partsDetails");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsLessThanOrEqualTo(String value) {
            addCriterion("parts_details <=", value, "partsDetails");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsLike(String value) {
            addCriterion("parts_details like", value, "partsDetails");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNotLike(String value) {
            addCriterion("parts_details not like", value, "partsDetails");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsIn(List<String> values) {
            addCriterion("parts_details in", values, "partsDetails");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNotIn(List<String> values) {
            addCriterion("parts_details not in", values, "partsDetails");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsBetween(String value1, String value2) {
            addCriterion("parts_details between", value1, value2, "partsDetails");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNotBetween(String value1, String value2) {
            addCriterion("parts_details not between", value1, value2, "partsDetails");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameIsNull() {
            addCriterion("parts_details_name is null");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameIsNotNull() {
            addCriterion("parts_details_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameEqualTo(String value) {
            addCriterion("parts_details_name =", value, "partsDetailsName");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameNotEqualTo(String value) {
            addCriterion("parts_details_name <>", value, "partsDetailsName");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameGreaterThan(String value) {
            addCriterion("parts_details_name >", value, "partsDetailsName");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameGreaterThanOrEqualTo(String value) {
            addCriterion("parts_details_name >=", value, "partsDetailsName");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameLessThan(String value) {
            addCriterion("parts_details_name <", value, "partsDetailsName");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameLessThanOrEqualTo(String value) {
            addCriterion("parts_details_name <=", value, "partsDetailsName");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameLike(String value) {
            addCriterion("parts_details_name like", value, "partsDetailsName");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameNotLike(String value) {
            addCriterion("parts_details_name not like", value, "partsDetailsName");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameIn(List<String> values) {
            addCriterion("parts_details_name in", values, "partsDetailsName");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameNotIn(List<String> values) {
            addCriterion("parts_details_name not in", values, "partsDetailsName");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameBetween(String value1, String value2) {
            addCriterion("parts_details_name between", value1, value2, "partsDetailsName");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameNotBetween(String value1, String value2) {
            addCriterion("parts_details_name not between", value1, value2, "partsDetailsName");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameEnIsNull() {
            addCriterion("parts_details_name_en is null");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameEnIsNotNull() {
            addCriterion("parts_details_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameEnEqualTo(String value) {
            addCriterion("parts_details_name_en =", value, "partsDetailsNameEn");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameEnNotEqualTo(String value) {
            addCriterion("parts_details_name_en <>", value, "partsDetailsNameEn");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameEnGreaterThan(String value) {
            addCriterion("parts_details_name_en >", value, "partsDetailsNameEn");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("parts_details_name_en >=", value, "partsDetailsNameEn");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameEnLessThan(String value) {
            addCriterion("parts_details_name_en <", value, "partsDetailsNameEn");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameEnLessThanOrEqualTo(String value) {
            addCriterion("parts_details_name_en <=", value, "partsDetailsNameEn");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameEnLike(String value) {
            addCriterion("parts_details_name_en like", value, "partsDetailsNameEn");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameEnNotLike(String value) {
            addCriterion("parts_details_name_en not like", value, "partsDetailsNameEn");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameEnIn(List<String> values) {
            addCriterion("parts_details_name_en in", values, "partsDetailsNameEn");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameEnNotIn(List<String> values) {
            addCriterion("parts_details_name_en not in", values, "partsDetailsNameEn");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameEnBetween(String value1, String value2) {
            addCriterion("parts_details_name_en between", value1, value2, "partsDetailsNameEn");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsNameEnNotBetween(String value1, String value2) {
            addCriterion("parts_details_name_en not between", value1, value2, "partsDetailsNameEn");
            return (Criteria) this;
        }

        public Criteria andRepairIsNull() {
            addCriterion("repair is null");
            return (Criteria) this;
        }

        public Criteria andRepairIsNotNull() {
            addCriterion("repair is not null");
            return (Criteria) this;
        }

        public Criteria andRepairEqualTo(String value) {
            addCriterion("repair =", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairNotEqualTo(String value) {
            addCriterion("repair <>", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairGreaterThan(String value) {
            addCriterion("repair >", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairGreaterThanOrEqualTo(String value) {
            addCriterion("repair >=", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairLessThan(String value) {
            addCriterion("repair <", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairLessThanOrEqualTo(String value) {
            addCriterion("repair <=", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairLike(String value) {
            addCriterion("repair like", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairNotLike(String value) {
            addCriterion("repair not like", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairIn(List<String> values) {
            addCriterion("repair in", values, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairNotIn(List<String> values) {
            addCriterion("repair not in", values, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairBetween(String value1, String value2) {
            addCriterion("repair between", value1, value2, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairNotBetween(String value1, String value2) {
            addCriterion("repair not between", value1, value2, "repair");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNull() {
            addCriterion("material is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("material is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(String value) {
            addCriterion("material =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(String value) {
            addCriterion("material <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(String value) {
            addCriterion("material >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("material >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(String value) {
            addCriterion("material <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(String value) {
            addCriterion("material <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLike(String value) {
            addCriterion("material like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotLike(String value) {
            addCriterion("material not like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<String> values) {
            addCriterion("material in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<String> values) {
            addCriterion("material not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(String value1, String value2) {
            addCriterion("material between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(String value1, String value2) {
            addCriterion("material not between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andContainerUserDescribeIsNull() {
            addCriterion("container_user_describe is null");
            return (Criteria) this;
        }

        public Criteria andContainerUserDescribeIsNotNull() {
            addCriterion("container_user_describe is not null");
            return (Criteria) this;
        }

        public Criteria andContainerUserDescribeEqualTo(String value) {
            addCriterion("container_user_describe =", value, "containerUserDescribe");
            return (Criteria) this;
        }

        public Criteria andContainerUserDescribeNotEqualTo(String value) {
            addCriterion("container_user_describe <>", value, "containerUserDescribe");
            return (Criteria) this;
        }

        public Criteria andContainerUserDescribeGreaterThan(String value) {
            addCriterion("container_user_describe >", value, "containerUserDescribe");
            return (Criteria) this;
        }

        public Criteria andContainerUserDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("container_user_describe >=", value, "containerUserDescribe");
            return (Criteria) this;
        }

        public Criteria andContainerUserDescribeLessThan(String value) {
            addCriterion("container_user_describe <", value, "containerUserDescribe");
            return (Criteria) this;
        }

        public Criteria andContainerUserDescribeLessThanOrEqualTo(String value) {
            addCriterion("container_user_describe <=", value, "containerUserDescribe");
            return (Criteria) this;
        }

        public Criteria andContainerUserDescribeLike(String value) {
            addCriterion("container_user_describe like", value, "containerUserDescribe");
            return (Criteria) this;
        }

        public Criteria andContainerUserDescribeNotLike(String value) {
            addCriterion("container_user_describe not like", value, "containerUserDescribe");
            return (Criteria) this;
        }

        public Criteria andContainerUserDescribeIn(List<String> values) {
            addCriterion("container_user_describe in", values, "containerUserDescribe");
            return (Criteria) this;
        }

        public Criteria andContainerUserDescribeNotIn(List<String> values) {
            addCriterion("container_user_describe not in", values, "containerUserDescribe");
            return (Criteria) this;
        }

        public Criteria andContainerUserDescribeBetween(String value1, String value2) {
            addCriterion("container_user_describe between", value1, value2, "containerUserDescribe");
            return (Criteria) this;
        }

        public Criteria andContainerUserDescribeNotBetween(String value1, String value2) {
            addCriterion("container_user_describe not between", value1, value2, "containerUserDescribe");
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

        public Criteria andRateNameEnIsNull() {
            addCriterion("rate_name_en is null");
            return (Criteria) this;
        }

        public Criteria andRateNameEnIsNotNull() {
            addCriterion("rate_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andRateNameEnEqualTo(String value) {
            addCriterion("rate_name_en =", value, "rateNameEn");
            return (Criteria) this;
        }

        public Criteria andRateNameEnNotEqualTo(String value) {
            addCriterion("rate_name_en <>", value, "rateNameEn");
            return (Criteria) this;
        }

        public Criteria andRateNameEnGreaterThan(String value) {
            addCriterion("rate_name_en >", value, "rateNameEn");
            return (Criteria) this;
        }

        public Criteria andRateNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("rate_name_en >=", value, "rateNameEn");
            return (Criteria) this;
        }

        public Criteria andRateNameEnLessThan(String value) {
            addCriterion("rate_name_en <", value, "rateNameEn");
            return (Criteria) this;
        }

        public Criteria andRateNameEnLessThanOrEqualTo(String value) {
            addCriterion("rate_name_en <=", value, "rateNameEn");
            return (Criteria) this;
        }

        public Criteria andRateNameEnLike(String value) {
            addCriterion("rate_name_en like", value, "rateNameEn");
            return (Criteria) this;
        }

        public Criteria andRateNameEnNotLike(String value) {
            addCriterion("rate_name_en not like", value, "rateNameEn");
            return (Criteria) this;
        }

        public Criteria andRateNameEnIn(List<String> values) {
            addCriterion("rate_name_en in", values, "rateNameEn");
            return (Criteria) this;
        }

        public Criteria andRateNameEnNotIn(List<String> values) {
            addCriterion("rate_name_en not in", values, "rateNameEn");
            return (Criteria) this;
        }

        public Criteria andRateNameEnBetween(String value1, String value2) {
            addCriterion("rate_name_en between", value1, value2, "rateNameEn");
            return (Criteria) this;
        }

        public Criteria andRateNameEnNotBetween(String value1, String value2) {
            addCriterion("rate_name_en not between", value1, value2, "rateNameEn");
            return (Criteria) this;
        }

        public Criteria andIsContainerUserRateIsNull() {
            addCriterion("is_container_user_rate is null");
            return (Criteria) this;
        }

        public Criteria andIsContainerUserRateIsNotNull() {
            addCriterion("is_container_user_rate is not null");
            return (Criteria) this;
        }

        public Criteria andIsContainerUserRateEqualTo(String value) {
            addCriterion("is_container_user_rate =", value, "isContainerUserRate");
            return (Criteria) this;
        }

        public Criteria andIsContainerUserRateNotEqualTo(String value) {
            addCriterion("is_container_user_rate <>", value, "isContainerUserRate");
            return (Criteria) this;
        }

        public Criteria andIsContainerUserRateGreaterThan(String value) {
            addCriterion("is_container_user_rate >", value, "isContainerUserRate");
            return (Criteria) this;
        }

        public Criteria andIsContainerUserRateGreaterThanOrEqualTo(String value) {
            addCriterion("is_container_user_rate >=", value, "isContainerUserRate");
            return (Criteria) this;
        }

        public Criteria andIsContainerUserRateLessThan(String value) {
            addCriterion("is_container_user_rate <", value, "isContainerUserRate");
            return (Criteria) this;
        }

        public Criteria andIsContainerUserRateLessThanOrEqualTo(String value) {
            addCriterion("is_container_user_rate <=", value, "isContainerUserRate");
            return (Criteria) this;
        }

        public Criteria andIsContainerUserRateLike(String value) {
            addCriterion("is_container_user_rate like", value, "isContainerUserRate");
            return (Criteria) this;
        }

        public Criteria andIsContainerUserRateNotLike(String value) {
            addCriterion("is_container_user_rate not like", value, "isContainerUserRate");
            return (Criteria) this;
        }

        public Criteria andIsContainerUserRateIn(List<String> values) {
            addCriterion("is_container_user_rate in", values, "isContainerUserRate");
            return (Criteria) this;
        }

        public Criteria andIsContainerUserRateNotIn(List<String> values) {
            addCriterion("is_container_user_rate not in", values, "isContainerUserRate");
            return (Criteria) this;
        }

        public Criteria andIsContainerUserRateBetween(String value1, String value2) {
            addCriterion("is_container_user_rate between", value1, value2, "isContainerUserRate");
            return (Criteria) this;
        }

        public Criteria andIsContainerUserRateNotBetween(String value1, String value2) {
            addCriterion("is_container_user_rate not between", value1, value2, "isContainerUserRate");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsIsNull() {
            addCriterion("is_repeat_prompts is null");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsIsNotNull() {
            addCriterion("is_repeat_prompts is not null");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsEqualTo(String value) {
            addCriterion("is_repeat_prompts =", value, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsNotEqualTo(String value) {
            addCriterion("is_repeat_prompts <>", value, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsGreaterThan(String value) {
            addCriterion("is_repeat_prompts >", value, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsGreaterThanOrEqualTo(String value) {
            addCriterion("is_repeat_prompts >=", value, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsLessThan(String value) {
            addCriterion("is_repeat_prompts <", value, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsLessThanOrEqualTo(String value) {
            addCriterion("is_repeat_prompts <=", value, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsLike(String value) {
            addCriterion("is_repeat_prompts like", value, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsNotLike(String value) {
            addCriterion("is_repeat_prompts not like", value, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsIn(List<String> values) {
            addCriterion("is_repeat_prompts in", values, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsNotIn(List<String> values) {
            addCriterion("is_repeat_prompts not in", values, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsBetween(String value1, String value2) {
            addCriterion("is_repeat_prompts between", value1, value2, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsNotBetween(String value1, String value2) {
            addCriterion("is_repeat_prompts not between", value1, value2, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoIsNull() {
            addCriterion("is_must_photo is null");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoIsNotNull() {
            addCriterion("is_must_photo is not null");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoEqualTo(String value) {
            addCriterion("is_must_photo =", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoNotEqualTo(String value) {
            addCriterion("is_must_photo <>", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoGreaterThan(String value) {
            addCriterion("is_must_photo >", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("is_must_photo >=", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoLessThan(String value) {
            addCriterion("is_must_photo <", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoLessThanOrEqualTo(String value) {
            addCriterion("is_must_photo <=", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoLike(String value) {
            addCriterion("is_must_photo like", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoNotLike(String value) {
            addCriterion("is_must_photo not like", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoIn(List<String> values) {
            addCriterion("is_must_photo in", values, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoNotIn(List<String> values) {
            addCriterion("is_must_photo not in", values, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoBetween(String value1, String value2) {
            addCriterion("is_must_photo between", value1, value2, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoNotBetween(String value1, String value2) {
            addCriterion("is_must_photo not between", value1, value2, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsGzIsNull() {
            addCriterion("is_gz is null");
            return (Criteria) this;
        }

        public Criteria andIsGzIsNotNull() {
            addCriterion("is_gz is not null");
            return (Criteria) this;
        }

        public Criteria andIsGzEqualTo(String value) {
            addCriterion("is_gz =", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzNotEqualTo(String value) {
            addCriterion("is_gz <>", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzGreaterThan(String value) {
            addCriterion("is_gz >", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzGreaterThanOrEqualTo(String value) {
            addCriterion("is_gz >=", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzLessThan(String value) {
            addCriterion("is_gz <", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzLessThanOrEqualTo(String value) {
            addCriterion("is_gz <=", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzLike(String value) {
            addCriterion("is_gz like", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzNotLike(String value) {
            addCriterion("is_gz not like", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzIn(List<String> values) {
            addCriterion("is_gz in", values, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzNotIn(List<String> values) {
            addCriterion("is_gz not in", values, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzBetween(String value1, String value2) {
            addCriterion("is_gz between", value1, value2, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzNotBetween(String value1, String value2) {
            addCriterion("is_gz not between", value1, value2, "isGz");
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