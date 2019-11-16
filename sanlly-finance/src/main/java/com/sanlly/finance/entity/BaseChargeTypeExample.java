package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseChargeTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BaseChargeTypeExample() {
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

        public Criteria andChargeTypeIdIsNull() {
            addCriterion("charge_type_id is null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIdIsNotNull() {
            addCriterion("charge_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIdEqualTo(Integer value) {
            addCriterion("charge_type_id =", value, "chargeTypeId");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIdNotEqualTo(Integer value) {
            addCriterion("charge_type_id <>", value, "chargeTypeId");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIdGreaterThan(Integer value) {
            addCriterion("charge_type_id >", value, "chargeTypeId");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_type_id >=", value, "chargeTypeId");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIdLessThan(Integer value) {
            addCriterion("charge_type_id <", value, "chargeTypeId");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("charge_type_id <=", value, "chargeTypeId");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIdIn(List<Integer> values) {
            addCriterion("charge_type_id in", values, "chargeTypeId");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIdNotIn(List<Integer> values) {
            addCriterion("charge_type_id not in", values, "chargeTypeId");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("charge_type_id between", value1, value2, "chargeTypeId");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_type_id not between", value1, value2, "chargeTypeId");
            return (Criteria) this;
        }

        public Criteria andLangKeyIsNull() {
            addCriterion("lang_key is null");
            return (Criteria) this;
        }

        public Criteria andLangKeyIsNotNull() {
            addCriterion("lang_key is not null");
            return (Criteria) this;
        }

        public Criteria andLangKeyEqualTo(String value) {
            addCriterion("lang_key =", value, "langKey");
            return (Criteria) this;
        }

        public Criteria andLangKeyNotEqualTo(String value) {
            addCriterion("lang_key <>", value, "langKey");
            return (Criteria) this;
        }

        public Criteria andLangKeyGreaterThan(String value) {
            addCriterion("lang_key >", value, "langKey");
            return (Criteria) this;
        }

        public Criteria andLangKeyGreaterThanOrEqualTo(String value) {
            addCriterion("lang_key >=", value, "langKey");
            return (Criteria) this;
        }

        public Criteria andLangKeyLessThan(String value) {
            addCriterion("lang_key <", value, "langKey");
            return (Criteria) this;
        }

        public Criteria andLangKeyLessThanOrEqualTo(String value) {
            addCriterion("lang_key <=", value, "langKey");
            return (Criteria) this;
        }

        public Criteria andLangKeyLike(String value) {
            addCriterion("lang_key like", value, "langKey");
            return (Criteria) this;
        }

        public Criteria andLangKeyNotLike(String value) {
            addCriterion("lang_key not like", value, "langKey");
            return (Criteria) this;
        }

        public Criteria andLangKeyIn(List<String> values) {
            addCriterion("lang_key in", values, "langKey");
            return (Criteria) this;
        }

        public Criteria andLangKeyNotIn(List<String> values) {
            addCriterion("lang_key not in", values, "langKey");
            return (Criteria) this;
        }

        public Criteria andLangKeyBetween(String value1, String value2) {
            addCriterion("lang_key between", value1, value2, "langKey");
            return (Criteria) this;
        }

        public Criteria andLangKeyNotBetween(String value1, String value2) {
            addCriterion("lang_key not between", value1, value2, "langKey");
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

        public Criteria andBusinessCategoryIsNull() {
            addCriterion("business_category is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryIsNotNull() {
            addCriterion("business_category is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryEqualTo(String value) {
            addCriterion("business_category =", value, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryNotEqualTo(String value) {
            addCriterion("business_category <>", value, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryGreaterThan(String value) {
            addCriterion("business_category >", value, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("business_category >=", value, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryLessThan(String value) {
            addCriterion("business_category <", value, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryLessThanOrEqualTo(String value) {
            addCriterion("business_category <=", value, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryLike(String value) {
            addCriterion("business_category like", value, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryNotLike(String value) {
            addCriterion("business_category not like", value, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryIn(List<String> values) {
            addCriterion("business_category in", values, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryNotIn(List<String> values) {
            addCriterion("business_category not in", values, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryBetween(String value1, String value2) {
            addCriterion("business_category between", value1, value2, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessCategoryNotBetween(String value1, String value2) {
            addCriterion("business_category not between", value1, value2, "businessCategory");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("business_type like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("business_type not like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameIsNull() {
            addCriterion("charge_type_name is null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameIsNotNull() {
            addCriterion("charge_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameEqualTo(String value) {
            addCriterion("charge_type_name =", value, "chargeTypeName");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameNotEqualTo(String value) {
            addCriterion("charge_type_name <>", value, "chargeTypeName");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameGreaterThan(String value) {
            addCriterion("charge_type_name >", value, "chargeTypeName");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("charge_type_name >=", value, "chargeTypeName");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameLessThan(String value) {
            addCriterion("charge_type_name <", value, "chargeTypeName");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameLessThanOrEqualTo(String value) {
            addCriterion("charge_type_name <=", value, "chargeTypeName");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameLike(String value) {
            addCriterion("charge_type_name like", value, "chargeTypeName");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameNotLike(String value) {
            addCriterion("charge_type_name not like", value, "chargeTypeName");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameIn(List<String> values) {
            addCriterion("charge_type_name in", values, "chargeTypeName");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameNotIn(List<String> values) {
            addCriterion("charge_type_name not in", values, "chargeTypeName");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameBetween(String value1, String value2) {
            addCriterion("charge_type_name between", value1, value2, "chargeTypeName");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameNotBetween(String value1, String value2) {
            addCriterion("charge_type_name not between", value1, value2, "chargeTypeName");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameEnIsNull() {
            addCriterion("charge_type_name_en is null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameEnIsNotNull() {
            addCriterion("charge_type_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameEnEqualTo(String value) {
            addCriterion("charge_type_name_en =", value, "chargeTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameEnNotEqualTo(String value) {
            addCriterion("charge_type_name_en <>", value, "chargeTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameEnGreaterThan(String value) {
            addCriterion("charge_type_name_en >", value, "chargeTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("charge_type_name_en >=", value, "chargeTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameEnLessThan(String value) {
            addCriterion("charge_type_name_en <", value, "chargeTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameEnLessThanOrEqualTo(String value) {
            addCriterion("charge_type_name_en <=", value, "chargeTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameEnLike(String value) {
            addCriterion("charge_type_name_en like", value, "chargeTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameEnNotLike(String value) {
            addCriterion("charge_type_name_en not like", value, "chargeTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameEnIn(List<String> values) {
            addCriterion("charge_type_name_en in", values, "chargeTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameEnNotIn(List<String> values) {
            addCriterion("charge_type_name_en not in", values, "chargeTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameEnBetween(String value1, String value2) {
            addCriterion("charge_type_name_en between", value1, value2, "chargeTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNameEnNotBetween(String value1, String value2) {
            addCriterion("charge_type_name_en not between", value1, value2, "chargeTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andChargeCodeIsNull() {
            addCriterion("charge_code is null");
            return (Criteria) this;
        }

        public Criteria andChargeCodeIsNotNull() {
            addCriterion("charge_code is not null");
            return (Criteria) this;
        }

        public Criteria andChargeCodeEqualTo(String value) {
            addCriterion("charge_code =", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeNotEqualTo(String value) {
            addCriterion("charge_code <>", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeGreaterThan(String value) {
            addCriterion("charge_code >", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("charge_code >=", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeLessThan(String value) {
            addCriterion("charge_code <", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeLessThanOrEqualTo(String value) {
            addCriterion("charge_code <=", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeLike(String value) {
            addCriterion("charge_code like", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeNotLike(String value) {
            addCriterion("charge_code not like", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeIn(List<String> values) {
            addCriterion("charge_code in", values, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeNotIn(List<String> values) {
            addCriterion("charge_code not in", values, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeBetween(String value1, String value2) {
            addCriterion("charge_code between", value1, value2, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeNotBetween(String value1, String value2) {
            addCriterion("charge_code not between", value1, value2, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(BigDecimal value) {
            addCriterion("tax_rate =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(BigDecimal value) {
            addCriterion("tax_rate <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(BigDecimal value) {
            addCriterion("tax_rate >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_rate >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(BigDecimal value) {
            addCriterion("tax_rate <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_rate <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<BigDecimal> values) {
            addCriterion("tax_rate in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<BigDecimal> values) {
            addCriterion("tax_rate not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_rate between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_rate not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andIsCommonIsNull() {
            addCriterion("is_common is null");
            return (Criteria) this;
        }

        public Criteria andIsCommonIsNotNull() {
            addCriterion("is_common is not null");
            return (Criteria) this;
        }

        public Criteria andIsCommonEqualTo(String value) {
            addCriterion("is_common =", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonNotEqualTo(String value) {
            addCriterion("is_common <>", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonGreaterThan(String value) {
            addCriterion("is_common >", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonGreaterThanOrEqualTo(String value) {
            addCriterion("is_common >=", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonLessThan(String value) {
            addCriterion("is_common <", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonLessThanOrEqualTo(String value) {
            addCriterion("is_common <=", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonLike(String value) {
            addCriterion("is_common like", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonNotLike(String value) {
            addCriterion("is_common not like", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonIn(List<String> values) {
            addCriterion("is_common in", values, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonNotIn(List<String> values) {
            addCriterion("is_common not in", values, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonBetween(String value1, String value2) {
            addCriterion("is_common between", value1, value2, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonNotBetween(String value1, String value2) {
            addCriterion("is_common not between", value1, value2, "isCommon");
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

        public Criteria andChargeKeyIsNull() {
            addCriterion("charge_key is null");
            return (Criteria) this;
        }

        public Criteria andChargeKeyIsNotNull() {
            addCriterion("charge_key is not null");
            return (Criteria) this;
        }

        public Criteria andChargeKeyEqualTo(String value) {
            addCriterion("charge_key =", value, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyNotEqualTo(String value) {
            addCriterion("charge_key <>", value, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyGreaterThan(String value) {
            addCriterion("charge_key >", value, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyGreaterThanOrEqualTo(String value) {
            addCriterion("charge_key >=", value, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyLessThan(String value) {
            addCriterion("charge_key <", value, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyLessThanOrEqualTo(String value) {
            addCriterion("charge_key <=", value, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyLike(String value) {
            addCriterion("charge_key like", value, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyNotLike(String value) {
            addCriterion("charge_key not like", value, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyIn(List<String> values) {
            addCriterion("charge_key in", values, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyNotIn(List<String> values) {
            addCriterion("charge_key not in", values, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyBetween(String value1, String value2) {
            addCriterion("charge_key between", value1, value2, "chargeKey");
            return (Criteria) this;
        }

        public Criteria andChargeKeyNotBetween(String value1, String value2) {
            addCriterion("charge_key not between", value1, value2, "chargeKey");
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