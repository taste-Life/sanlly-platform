package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BusinessDetailExample() {
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

        public Criteria andBusinessDetaillIdIsNull() {
            addCriterion("business_detaill_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessDetaillIdIsNotNull() {
            addCriterion("business_detaill_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessDetaillIdEqualTo(Integer value) {
            addCriterion("business_detaill_id =", value, "businessDetaillId");
            return (Criteria) this;
        }

        public Criteria andBusinessDetaillIdNotEqualTo(Integer value) {
            addCriterion("business_detaill_id <>", value, "businessDetaillId");
            return (Criteria) this;
        }

        public Criteria andBusinessDetaillIdGreaterThan(Integer value) {
            addCriterion("business_detaill_id >", value, "businessDetaillId");
            return (Criteria) this;
        }

        public Criteria andBusinessDetaillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_detaill_id >=", value, "businessDetaillId");
            return (Criteria) this;
        }

        public Criteria andBusinessDetaillIdLessThan(Integer value) {
            addCriterion("business_detaill_id <", value, "businessDetaillId");
            return (Criteria) this;
        }

        public Criteria andBusinessDetaillIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_detaill_id <=", value, "businessDetaillId");
            return (Criteria) this;
        }

        public Criteria andBusinessDetaillIdIn(List<Integer> values) {
            addCriterion("business_detaill_id in", values, "businessDetaillId");
            return (Criteria) this;
        }

        public Criteria andBusinessDetaillIdNotIn(List<Integer> values) {
            addCriterion("business_detaill_id not in", values, "businessDetaillId");
            return (Criteria) this;
        }

        public Criteria andBusinessDetaillIdBetween(Integer value1, Integer value2) {
            addCriterion("business_detaill_id between", value1, value2, "businessDetaillId");
            return (Criteria) this;
        }

        public Criteria andBusinessDetaillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_detaill_id not between", value1, value2, "businessDetaillId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(Integer value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(Integer value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(Integer value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(Integer value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<Integer> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<Integer> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(Integer value1, Integer value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
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

        public Criteria andBillCodeIsNull() {
            addCriterion("bill_code is null");
            return (Criteria) this;
        }

        public Criteria andBillCodeIsNotNull() {
            addCriterion("bill_code is not null");
            return (Criteria) this;
        }

        public Criteria andBillCodeEqualTo(String value) {
            addCriterion("bill_code =", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotEqualTo(String value) {
            addCriterion("bill_code <>", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeGreaterThan(String value) {
            addCriterion("bill_code >", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bill_code >=", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeLessThan(String value) {
            addCriterion("bill_code <", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeLessThanOrEqualTo(String value) {
            addCriterion("bill_code <=", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeLike(String value) {
            addCriterion("bill_code like", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotLike(String value) {
            addCriterion("bill_code not like", value, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeIn(List<String> values) {
            addCriterion("bill_code in", values, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotIn(List<String> values) {
            addCriterion("bill_code not in", values, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeBetween(String value1, String value2) {
            addCriterion("bill_code between", value1, value2, "billCode");
            return (Criteria) this;
        }

        public Criteria andBillCodeNotBetween(String value1, String value2) {
            addCriterion("bill_code not between", value1, value2, "billCode");
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

        public Criteria andMerchantsKeyIsNull() {
            addCriterion("merchants_key is null");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyIsNotNull() {
            addCriterion("merchants_key is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyEqualTo(String value) {
            addCriterion("merchants_key =", value, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyNotEqualTo(String value) {
            addCriterion("merchants_key <>", value, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyGreaterThan(String value) {
            addCriterion("merchants_key >", value, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyGreaterThanOrEqualTo(String value) {
            addCriterion("merchants_key >=", value, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyLessThan(String value) {
            addCriterion("merchants_key <", value, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyLessThanOrEqualTo(String value) {
            addCriterion("merchants_key <=", value, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyLike(String value) {
            addCriterion("merchants_key like", value, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyNotLike(String value) {
            addCriterion("merchants_key not like", value, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyIn(List<String> values) {
            addCriterion("merchants_key in", values, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyNotIn(List<String> values) {
            addCriterion("merchants_key not in", values, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyBetween(String value1, String value2) {
            addCriterion("merchants_key between", value1, value2, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andMerchantsKeyNotBetween(String value1, String value2) {
            addCriterion("merchants_key not between", value1, value2, "merchantsKey");
            return (Criteria) this;
        }

        public Criteria andSapidIsNull() {
            addCriterion("sapid is null");
            return (Criteria) this;
        }

        public Criteria andSapidIsNotNull() {
            addCriterion("sapid is not null");
            return (Criteria) this;
        }

        public Criteria andSapidEqualTo(String value) {
            addCriterion("sapid =", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidNotEqualTo(String value) {
            addCriterion("sapid <>", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidGreaterThan(String value) {
            addCriterion("sapid >", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidGreaterThanOrEqualTo(String value) {
            addCriterion("sapid >=", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidLessThan(String value) {
            addCriterion("sapid <", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidLessThanOrEqualTo(String value) {
            addCriterion("sapid <=", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidLike(String value) {
            addCriterion("sapid like", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidNotLike(String value) {
            addCriterion("sapid not like", value, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidIn(List<String> values) {
            addCriterion("sapid in", values, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidNotIn(List<String> values) {
            addCriterion("sapid not in", values, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidBetween(String value1, String value2) {
            addCriterion("sapid between", value1, value2, "sapid");
            return (Criteria) this;
        }

        public Criteria andSapidNotBetween(String value1, String value2) {
            addCriterion("sapid not between", value1, value2, "sapid");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeIsNull() {
            addCriterion("currency_type is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeIsNotNull() {
            addCriterion("currency_type is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeEqualTo(String value) {
            addCriterion("currency_type =", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeNotEqualTo(String value) {
            addCriterion("currency_type <>", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeGreaterThan(String value) {
            addCriterion("currency_type >", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("currency_type >=", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeLessThan(String value) {
            addCriterion("currency_type <", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeLessThanOrEqualTo(String value) {
            addCriterion("currency_type <=", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeLike(String value) {
            addCriterion("currency_type like", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeNotLike(String value) {
            addCriterion("currency_type not like", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeIn(List<String> values) {
            addCriterion("currency_type in", values, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeNotIn(List<String> values) {
            addCriterion("currency_type not in", values, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeBetween(String value1, String value2) {
            addCriterion("currency_type between", value1, value2, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeNotBetween(String value1, String value2) {
            addCriterion("currency_type not between", value1, value2, "currencyType");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIsNull() {
            addCriterion("exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIsNotNull() {
            addCriterion("exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateEqualTo(BigDecimal value) {
            addCriterion("exchange_rate =", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotEqualTo(BigDecimal value) {
            addCriterion("exchange_rate <>", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThan(BigDecimal value) {
            addCriterion("exchange_rate >", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_rate >=", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThan(BigDecimal value) {
            addCriterion("exchange_rate <", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_rate <=", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIn(List<BigDecimal> values) {
            addCriterion("exchange_rate in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotIn(List<BigDecimal> values) {
            addCriterion("exchange_rate not in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_rate between", value1, value2, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_rate not between", value1, value2, "exchangeRate");
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

        public Criteria andTaxAmountIsNull() {
            addCriterion("tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andTaxAmountIsNotNull() {
            addCriterion("tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTaxAmountEqualTo(BigDecimal value) {
            addCriterion("tax_amount =", value, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAmountNotEqualTo(BigDecimal value) {
            addCriterion("tax_amount <>", value, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAmountGreaterThan(BigDecimal value) {
            addCriterion("tax_amount >", value, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_amount >=", value, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAmountLessThan(BigDecimal value) {
            addCriterion("tax_amount <", value, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_amount <=", value, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAmountIn(List<BigDecimal> values) {
            addCriterion("tax_amount in", values, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAmountNotIn(List<BigDecimal> values) {
            addCriterion("tax_amount not in", values, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_amount between", value1, value2, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_amount not between", value1, value2, "taxAmount");
            return (Criteria) this;
        }

        public Criteria andAmountRmbIsNull() {
            addCriterion("amount_rmb is null");
            return (Criteria) this;
        }

        public Criteria andAmountRmbIsNotNull() {
            addCriterion("amount_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andAmountRmbEqualTo(BigDecimal value) {
            addCriterion("amount_rmb =", value, "amountRmb");
            return (Criteria) this;
        }

        public Criteria andAmountRmbNotEqualTo(BigDecimal value) {
            addCriterion("amount_rmb <>", value, "amountRmb");
            return (Criteria) this;
        }

        public Criteria andAmountRmbGreaterThan(BigDecimal value) {
            addCriterion("amount_rmb >", value, "amountRmb");
            return (Criteria) this;
        }

        public Criteria andAmountRmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_rmb >=", value, "amountRmb");
            return (Criteria) this;
        }

        public Criteria andAmountRmbLessThan(BigDecimal value) {
            addCriterion("amount_rmb <", value, "amountRmb");
            return (Criteria) this;
        }

        public Criteria andAmountRmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_rmb <=", value, "amountRmb");
            return (Criteria) this;
        }

        public Criteria andAmountRmbIn(List<BigDecimal> values) {
            addCriterion("amount_rmb in", values, "amountRmb");
            return (Criteria) this;
        }

        public Criteria andAmountRmbNotIn(List<BigDecimal> values) {
            addCriterion("amount_rmb not in", values, "amountRmb");
            return (Criteria) this;
        }

        public Criteria andAmountRmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_rmb between", value1, value2, "amountRmb");
            return (Criteria) this;
        }

        public Criteria andAmountRmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_rmb not between", value1, value2, "amountRmb");
            return (Criteria) this;
        }

        public Criteria andAmountUsdIsNull() {
            addCriterion("amount_usd is null");
            return (Criteria) this;
        }

        public Criteria andAmountUsdIsNotNull() {
            addCriterion("amount_usd is not null");
            return (Criteria) this;
        }

        public Criteria andAmountUsdEqualTo(BigDecimal value) {
            addCriterion("amount_usd =", value, "amountUsd");
            return (Criteria) this;
        }

        public Criteria andAmountUsdNotEqualTo(BigDecimal value) {
            addCriterion("amount_usd <>", value, "amountUsd");
            return (Criteria) this;
        }

        public Criteria andAmountUsdGreaterThan(BigDecimal value) {
            addCriterion("amount_usd >", value, "amountUsd");
            return (Criteria) this;
        }

        public Criteria andAmountUsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_usd >=", value, "amountUsd");
            return (Criteria) this;
        }

        public Criteria andAmountUsdLessThan(BigDecimal value) {
            addCriterion("amount_usd <", value, "amountUsd");
            return (Criteria) this;
        }

        public Criteria andAmountUsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_usd <=", value, "amountUsd");
            return (Criteria) this;
        }

        public Criteria andAmountUsdIn(List<BigDecimal> values) {
            addCriterion("amount_usd in", values, "amountUsd");
            return (Criteria) this;
        }

        public Criteria andAmountUsdNotIn(List<BigDecimal> values) {
            addCriterion("amount_usd not in", values, "amountUsd");
            return (Criteria) this;
        }

        public Criteria andAmountUsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_usd between", value1, value2, "amountUsd");
            return (Criteria) this;
        }

        public Criteria andAmountUsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_usd not between", value1, value2, "amountUsd");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(String value) {
            addCriterion("invoice_type =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(String value) {
            addCriterion("invoice_type <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(String value) {
            addCriterion("invoice_type >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_type >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(String value) {
            addCriterion("invoice_type <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("invoice_type <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLike(String value) {
            addCriterion("invoice_type like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotLike(String value) {
            addCriterion("invoice_type not like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<String> values) {
            addCriterion("invoice_type in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<String> values) {
            addCriterion("invoice_type not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(String value1, String value2) {
            addCriterion("invoice_type between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("invoice_type not between", value1, value2, "invoiceType");
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

        public Criteria andVersionNoIsNull() {
            addCriterion("version_no is null");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNotNull() {
            addCriterion("version_no is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNoEqualTo(String value) {
            addCriterion("version_no =", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(String value) {
            addCriterion("version_no <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(String value) {
            addCriterion("version_no >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(String value) {
            addCriterion("version_no >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(String value) {
            addCriterion("version_no <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(String value) {
            addCriterion("version_no <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLike(String value) {
            addCriterion("version_no like", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotLike(String value) {
            addCriterion("version_no not like", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoIn(List<String> values) {
            addCriterion("version_no in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotIn(List<String> values) {
            addCriterion("version_no not in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoBetween(String value1, String value2) {
            addCriterion("version_no between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotBetween(String value1, String value2) {
            addCriterion("version_no not between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyIsNull() {
            addCriterion("company_key is null");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyIsNotNull() {
            addCriterion("company_key is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyEqualTo(String value) {
            addCriterion("company_key =", value, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyNotEqualTo(String value) {
            addCriterion("company_key <>", value, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyGreaterThan(String value) {
            addCriterion("company_key >", value, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyGreaterThanOrEqualTo(String value) {
            addCriterion("company_key >=", value, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyLessThan(String value) {
            addCriterion("company_key <", value, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyLessThanOrEqualTo(String value) {
            addCriterion("company_key <=", value, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyLike(String value) {
            addCriterion("company_key like", value, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyNotLike(String value) {
            addCriterion("company_key not like", value, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyIn(List<String> values) {
            addCriterion("company_key in", values, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyNotIn(List<String> values) {
            addCriterion("company_key not in", values, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyBetween(String value1, String value2) {
            addCriterion("company_key between", value1, value2, "companyKey");
            return (Criteria) this;
        }

        public Criteria andCompanyKeyNotBetween(String value1, String value2) {
            addCriterion("company_key not between", value1, value2, "companyKey");
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

        public Criteria andInterfaceTypeIsNull() {
            addCriterion("Interface_type is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIsNotNull() {
            addCriterion("Interface_type is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeEqualTo(String value) {
            addCriterion("Interface_type =", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotEqualTo(String value) {
            addCriterion("Interface_type <>", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeGreaterThan(String value) {
            addCriterion("Interface_type >", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Interface_type >=", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLessThan(String value) {
            addCriterion("Interface_type <", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLessThanOrEqualTo(String value) {
            addCriterion("Interface_type <=", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeLike(String value) {
            addCriterion("Interface_type like", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotLike(String value) {
            addCriterion("Interface_type not like", value, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeIn(List<String> values) {
            addCriterion("Interface_type in", values, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotIn(List<String> values) {
            addCriterion("Interface_type not in", values, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeBetween(String value1, String value2) {
            addCriterion("Interface_type between", value1, value2, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andInterfaceTypeNotBetween(String value1, String value2) {
            addCriterion("Interface_type not between", value1, value2, "interfaceType");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypeIsNull() {
            addCriterion("legacy_doc_type is null");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypeIsNotNull() {
            addCriterion("legacy_doc_type is not null");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypeEqualTo(String value) {
            addCriterion("legacy_doc_type =", value, "legacyDocType");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypeNotEqualTo(String value) {
            addCriterion("legacy_doc_type <>", value, "legacyDocType");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypeGreaterThan(String value) {
            addCriterion("legacy_doc_type >", value, "legacyDocType");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypeGreaterThanOrEqualTo(String value) {
            addCriterion("legacy_doc_type >=", value, "legacyDocType");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypeLessThan(String value) {
            addCriterion("legacy_doc_type <", value, "legacyDocType");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypeLessThanOrEqualTo(String value) {
            addCriterion("legacy_doc_type <=", value, "legacyDocType");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypeLike(String value) {
            addCriterion("legacy_doc_type like", value, "legacyDocType");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypeNotLike(String value) {
            addCriterion("legacy_doc_type not like", value, "legacyDocType");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypeIn(List<String> values) {
            addCriterion("legacy_doc_type in", values, "legacyDocType");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypeNotIn(List<String> values) {
            addCriterion("legacy_doc_type not in", values, "legacyDocType");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypeBetween(String value1, String value2) {
            addCriterion("legacy_doc_type between", value1, value2, "legacyDocType");
            return (Criteria) this;
        }

        public Criteria andLegacyDocTypeNotBetween(String value1, String value2) {
            addCriterion("legacy_doc_type not between", value1, value2, "legacyDocType");
            return (Criteria) this;
        }

        public Criteria andBillMonthIsNull() {
            addCriterion("bill_month is null");
            return (Criteria) this;
        }

        public Criteria andBillMonthIsNotNull() {
            addCriterion("bill_month is not null");
            return (Criteria) this;
        }

        public Criteria andBillMonthEqualTo(String value) {
            addCriterion("bill_month =", value, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthNotEqualTo(String value) {
            addCriterion("bill_month <>", value, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthGreaterThan(String value) {
            addCriterion("bill_month >", value, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthGreaterThanOrEqualTo(String value) {
            addCriterion("bill_month >=", value, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthLessThan(String value) {
            addCriterion("bill_month <", value, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthLessThanOrEqualTo(String value) {
            addCriterion("bill_month <=", value, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthLike(String value) {
            addCriterion("bill_month like", value, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthNotLike(String value) {
            addCriterion("bill_month not like", value, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthIn(List<String> values) {
            addCriterion("bill_month in", values, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthNotIn(List<String> values) {
            addCriterion("bill_month not in", values, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthBetween(String value1, String value2) {
            addCriterion("bill_month between", value1, value2, "billMonth");
            return (Criteria) this;
        }

        public Criteria andBillMonthNotBetween(String value1, String value2) {
            addCriterion("bill_month not between", value1, value2, "billMonth");
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

        public Criteria andSourceTableIsNull() {
            addCriterion("source_table is null");
            return (Criteria) this;
        }

        public Criteria andSourceTableIsNotNull() {
            addCriterion("source_table is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTableEqualTo(String value) {
            addCriterion("source_table =", value, "sourceTable");
            return (Criteria) this;
        }

        public Criteria andSourceTableNotEqualTo(String value) {
            addCriterion("source_table <>", value, "sourceTable");
            return (Criteria) this;
        }

        public Criteria andSourceTableGreaterThan(String value) {
            addCriterion("source_table >", value, "sourceTable");
            return (Criteria) this;
        }

        public Criteria andSourceTableGreaterThanOrEqualTo(String value) {
            addCriterion("source_table >=", value, "sourceTable");
            return (Criteria) this;
        }

        public Criteria andSourceTableLessThan(String value) {
            addCriterion("source_table <", value, "sourceTable");
            return (Criteria) this;
        }

        public Criteria andSourceTableLessThanOrEqualTo(String value) {
            addCriterion("source_table <=", value, "sourceTable");
            return (Criteria) this;
        }

        public Criteria andSourceTableLike(String value) {
            addCriterion("source_table like", value, "sourceTable");
            return (Criteria) this;
        }

        public Criteria andSourceTableNotLike(String value) {
            addCriterion("source_table not like", value, "sourceTable");
            return (Criteria) this;
        }

        public Criteria andSourceTableIn(List<String> values) {
            addCriterion("source_table in", values, "sourceTable");
            return (Criteria) this;
        }

        public Criteria andSourceTableNotIn(List<String> values) {
            addCriterion("source_table not in", values, "sourceTable");
            return (Criteria) this;
        }

        public Criteria andSourceTableBetween(String value1, String value2) {
            addCriterion("source_table between", value1, value2, "sourceTable");
            return (Criteria) this;
        }

        public Criteria andSourceTableNotBetween(String value1, String value2) {
            addCriterion("source_table not between", value1, value2, "sourceTable");
            return (Criteria) this;
        }

        public Criteria andSourceBillCodeIsNull() {
            addCriterion("source_bill_code is null");
            return (Criteria) this;
        }

        public Criteria andSourceBillCodeIsNotNull() {
            addCriterion("source_bill_code is not null");
            return (Criteria) this;
        }

        public Criteria andSourceBillCodeEqualTo(String value) {
            addCriterion("source_bill_code =", value, "sourceBillCode");
            return (Criteria) this;
        }

        public Criteria andSourceBillCodeNotEqualTo(String value) {
            addCriterion("source_bill_code <>", value, "sourceBillCode");
            return (Criteria) this;
        }

        public Criteria andSourceBillCodeGreaterThan(String value) {
            addCriterion("source_bill_code >", value, "sourceBillCode");
            return (Criteria) this;
        }

        public Criteria andSourceBillCodeGreaterThanOrEqualTo(String value) {
            addCriterion("source_bill_code >=", value, "sourceBillCode");
            return (Criteria) this;
        }

        public Criteria andSourceBillCodeLessThan(String value) {
            addCriterion("source_bill_code <", value, "sourceBillCode");
            return (Criteria) this;
        }

        public Criteria andSourceBillCodeLessThanOrEqualTo(String value) {
            addCriterion("source_bill_code <=", value, "sourceBillCode");
            return (Criteria) this;
        }

        public Criteria andSourceBillCodeLike(String value) {
            addCriterion("source_bill_code like", value, "sourceBillCode");
            return (Criteria) this;
        }

        public Criteria andSourceBillCodeNotLike(String value) {
            addCriterion("source_bill_code not like", value, "sourceBillCode");
            return (Criteria) this;
        }

        public Criteria andSourceBillCodeIn(List<String> values) {
            addCriterion("source_bill_code in", values, "sourceBillCode");
            return (Criteria) this;
        }

        public Criteria andSourceBillCodeNotIn(List<String> values) {
            addCriterion("source_bill_code not in", values, "sourceBillCode");
            return (Criteria) this;
        }

        public Criteria andSourceBillCodeBetween(String value1, String value2) {
            addCriterion("source_bill_code between", value1, value2, "sourceBillCode");
            return (Criteria) this;
        }

        public Criteria andSourceBillCodeNotBetween(String value1, String value2) {
            addCriterion("source_bill_code not between", value1, value2, "sourceBillCode");
            return (Criteria) this;
        }

        public Criteria andSourceBillIdIsNull() {
            addCriterion("source_bill_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceBillIdIsNotNull() {
            addCriterion("source_bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceBillIdEqualTo(Integer value) {
            addCriterion("source_bill_id =", value, "sourceBillId");
            return (Criteria) this;
        }

        public Criteria andSourceBillIdNotEqualTo(Integer value) {
            addCriterion("source_bill_id <>", value, "sourceBillId");
            return (Criteria) this;
        }

        public Criteria andSourceBillIdGreaterThan(Integer value) {
            addCriterion("source_bill_id >", value, "sourceBillId");
            return (Criteria) this;
        }

        public Criteria andSourceBillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_bill_id >=", value, "sourceBillId");
            return (Criteria) this;
        }

        public Criteria andSourceBillIdLessThan(Integer value) {
            addCriterion("source_bill_id <", value, "sourceBillId");
            return (Criteria) this;
        }

        public Criteria andSourceBillIdLessThanOrEqualTo(Integer value) {
            addCriterion("source_bill_id <=", value, "sourceBillId");
            return (Criteria) this;
        }

        public Criteria andSourceBillIdIn(List<Integer> values) {
            addCriterion("source_bill_id in", values, "sourceBillId");
            return (Criteria) this;
        }

        public Criteria andSourceBillIdNotIn(List<Integer> values) {
            addCriterion("source_bill_id not in", values, "sourceBillId");
            return (Criteria) this;
        }

        public Criteria andSourceBillIdBetween(Integer value1, Integer value2) {
            addCriterion("source_bill_id between", value1, value2, "sourceBillId");
            return (Criteria) this;
        }

        public Criteria andSourceBillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("source_bill_id not between", value1, value2, "sourceBillId");
            return (Criteria) this;
        }

        public Criteria andNetAmountIsNull() {
            addCriterion("net_amount is null");
            return (Criteria) this;
        }

        public Criteria andNetAmountIsNotNull() {
            addCriterion("net_amount is not null");
            return (Criteria) this;
        }

        public Criteria andNetAmountEqualTo(BigDecimal value) {
            addCriterion("net_amount =", value, "netAmount");
            return (Criteria) this;
        }

        public Criteria andNetAmountNotEqualTo(BigDecimal value) {
            addCriterion("net_amount <>", value, "netAmount");
            return (Criteria) this;
        }

        public Criteria andNetAmountGreaterThan(BigDecimal value) {
            addCriterion("net_amount >", value, "netAmount");
            return (Criteria) this;
        }

        public Criteria andNetAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("net_amount >=", value, "netAmount");
            return (Criteria) this;
        }

        public Criteria andNetAmountLessThan(BigDecimal value) {
            addCriterion("net_amount <", value, "netAmount");
            return (Criteria) this;
        }

        public Criteria andNetAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("net_amount <=", value, "netAmount");
            return (Criteria) this;
        }

        public Criteria andNetAmountIn(List<BigDecimal> values) {
            addCriterion("net_amount in", values, "netAmount");
            return (Criteria) this;
        }

        public Criteria andNetAmountNotIn(List<BigDecimal> values) {
            addCriterion("net_amount not in", values, "netAmount");
            return (Criteria) this;
        }

        public Criteria andNetAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_amount between", value1, value2, "netAmount");
            return (Criteria) this;
        }

        public Criteria andNetAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_amount not between", value1, value2, "netAmount");
            return (Criteria) this;
        }

        public Criteria andBillAuditorIsNull() {
            addCriterion("bill_auditor is null");
            return (Criteria) this;
        }

        public Criteria andBillAuditorIsNotNull() {
            addCriterion("bill_auditor is not null");
            return (Criteria) this;
        }

        public Criteria andBillAuditorEqualTo(Integer value) {
            addCriterion("bill_auditor =", value, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorNotEqualTo(Integer value) {
            addCriterion("bill_auditor <>", value, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorGreaterThan(Integer value) {
            addCriterion("bill_auditor >", value, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_auditor >=", value, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorLessThan(Integer value) {
            addCriterion("bill_auditor <", value, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorLessThanOrEqualTo(Integer value) {
            addCriterion("bill_auditor <=", value, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorIn(List<Integer> values) {
            addCriterion("bill_auditor in", values, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorNotIn(List<Integer> values) {
            addCriterion("bill_auditor not in", values, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorBetween(Integer value1, Integer value2) {
            addCriterion("bill_auditor between", value1, value2, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_auditor not between", value1, value2, "billAuditor");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeIsNull() {
            addCriterion("bill_auditor_time is null");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeIsNotNull() {
            addCriterion("bill_auditor_time is not null");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeEqualTo(Date value) {
            addCriterion("bill_auditor_time =", value, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeNotEqualTo(Date value) {
            addCriterion("bill_auditor_time <>", value, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeGreaterThan(Date value) {
            addCriterion("bill_auditor_time >", value, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bill_auditor_time >=", value, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeLessThan(Date value) {
            addCriterion("bill_auditor_time <", value, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeLessThanOrEqualTo(Date value) {
            addCriterion("bill_auditor_time <=", value, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeIn(List<Date> values) {
            addCriterion("bill_auditor_time in", values, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeNotIn(List<Date> values) {
            addCriterion("bill_auditor_time not in", values, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeBetween(Date value1, Date value2) {
            addCriterion("bill_auditor_time between", value1, value2, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andBillAuditorTimeNotBetween(Date value1, Date value2) {
            addCriterion("bill_auditor_time not between", value1, value2, "billAuditorTime");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNull() {
            addCriterion("material_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNotNull() {
            addCriterion("material_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeEqualTo(String value) {
            addCriterion("material_code =", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotEqualTo(String value) {
            addCriterion("material_code <>", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThan(String value) {
            addCriterion("material_code >", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("material_code >=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThan(String value) {
            addCriterion("material_code <", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThanOrEqualTo(String value) {
            addCriterion("material_code <=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLike(String value) {
            addCriterion("material_code like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotLike(String value) {
            addCriterion("material_code not like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIn(List<String> values) {
            addCriterion("material_code in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotIn(List<String> values) {
            addCriterion("material_code not in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeBetween(String value1, String value2) {
            addCriterion("material_code between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotBetween(String value1, String value2) {
            addCriterion("material_code not between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNull() {
            addCriterion("material_name is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNotNull() {
            addCriterion("material_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameEqualTo(String value) {
            addCriterion("material_name =", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotEqualTo(String value) {
            addCriterion("material_name <>", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThan(String value) {
            addCriterion("material_name >", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("material_name >=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThan(String value) {
            addCriterion("material_name <", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("material_name <=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLike(String value) {
            addCriterion("material_name like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotLike(String value) {
            addCriterion("material_name not like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIn(List<String> values) {
            addCriterion("material_name in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotIn(List<String> values) {
            addCriterion("material_name not in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameBetween(String value1, String value2) {
            addCriterion("material_name between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotBetween(String value1, String value2) {
            addCriterion("material_name not between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceIsNull() {
            addCriterion("material_price is null");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceIsNotNull() {
            addCriterion("material_price is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceEqualTo(BigDecimal value) {
            addCriterion("material_price =", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceNotEqualTo(BigDecimal value) {
            addCriterion("material_price <>", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceGreaterThan(BigDecimal value) {
            addCriterion("material_price >", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("material_price >=", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceLessThan(BigDecimal value) {
            addCriterion("material_price <", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("material_price <=", value, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceIn(List<BigDecimal> values) {
            addCriterion("material_price in", values, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceNotIn(List<BigDecimal> values) {
            addCriterion("material_price not in", values, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("material_price between", value1, value2, "materialPrice");
            return (Criteria) this;
        }

        public Criteria andMaterialPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("material_price not between", value1, value2, "materialPrice");
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

        public Criteria andNumberEqualTo(BigDecimal value) {
            addCriterion("`number` =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(BigDecimal value) {
            addCriterion("`number` <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(BigDecimal value) {
            addCriterion("`number` >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("`number` >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(BigDecimal value) {
            addCriterion("`number` <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("`number` <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<BigDecimal> values) {
            addCriterion("`number` in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<BigDecimal> values) {
            addCriterion("`number` not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("`number` between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("`number` not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andInBillTimeIsNull() {
            addCriterion("in_bill_time is null");
            return (Criteria) this;
        }

        public Criteria andInBillTimeIsNotNull() {
            addCriterion("in_bill_time is not null");
            return (Criteria) this;
        }

        public Criteria andInBillTimeEqualTo(Date value) {
            addCriterion("in_bill_time =", value, "inBillTime");
            return (Criteria) this;
        }

        public Criteria andInBillTimeNotEqualTo(Date value) {
            addCriterion("in_bill_time <>", value, "inBillTime");
            return (Criteria) this;
        }

        public Criteria andInBillTimeGreaterThan(Date value) {
            addCriterion("in_bill_time >", value, "inBillTime");
            return (Criteria) this;
        }

        public Criteria andInBillTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("in_bill_time >=", value, "inBillTime");
            return (Criteria) this;
        }

        public Criteria andInBillTimeLessThan(Date value) {
            addCriterion("in_bill_time <", value, "inBillTime");
            return (Criteria) this;
        }

        public Criteria andInBillTimeLessThanOrEqualTo(Date value) {
            addCriterion("in_bill_time <=", value, "inBillTime");
            return (Criteria) this;
        }

        public Criteria andInBillTimeIn(List<Date> values) {
            addCriterion("in_bill_time in", values, "inBillTime");
            return (Criteria) this;
        }

        public Criteria andInBillTimeNotIn(List<Date> values) {
            addCriterion("in_bill_time not in", values, "inBillTime");
            return (Criteria) this;
        }

        public Criteria andInBillTimeBetween(Date value1, Date value2) {
            addCriterion("in_bill_time between", value1, value2, "inBillTime");
            return (Criteria) this;
        }

        public Criteria andInBillTimeNotBetween(Date value1, Date value2) {
            addCriterion("in_bill_time not between", value1, value2, "inBillTime");
            return (Criteria) this;
        }

        public Criteria andInBillUserIsNull() {
            addCriterion("in_bill_user is null");
            return (Criteria) this;
        }

        public Criteria andInBillUserIsNotNull() {
            addCriterion("in_bill_user is not null");
            return (Criteria) this;
        }

        public Criteria andInBillUserEqualTo(Integer value) {
            addCriterion("in_bill_user =", value, "inBillUser");
            return (Criteria) this;
        }

        public Criteria andInBillUserNotEqualTo(Integer value) {
            addCriterion("in_bill_user <>", value, "inBillUser");
            return (Criteria) this;
        }

        public Criteria andInBillUserGreaterThan(Integer value) {
            addCriterion("in_bill_user >", value, "inBillUser");
            return (Criteria) this;
        }

        public Criteria andInBillUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_bill_user >=", value, "inBillUser");
            return (Criteria) this;
        }

        public Criteria andInBillUserLessThan(Integer value) {
            addCriterion("in_bill_user <", value, "inBillUser");
            return (Criteria) this;
        }

        public Criteria andInBillUserLessThanOrEqualTo(Integer value) {
            addCriterion("in_bill_user <=", value, "inBillUser");
            return (Criteria) this;
        }

        public Criteria andInBillUserIn(List<Integer> values) {
            addCriterion("in_bill_user in", values, "inBillUser");
            return (Criteria) this;
        }

        public Criteria andInBillUserNotIn(List<Integer> values) {
            addCriterion("in_bill_user not in", values, "inBillUser");
            return (Criteria) this;
        }

        public Criteria andInBillUserBetween(Integer value1, Integer value2) {
            addCriterion("in_bill_user between", value1, value2, "inBillUser");
            return (Criteria) this;
        }

        public Criteria andInBillUserNotBetween(Integer value1, Integer value2) {
            addCriterion("in_bill_user not between", value1, value2, "inBillUser");
            return (Criteria) this;
        }

        public Criteria andCreateBillUserIsNull() {
            addCriterion("create_bill_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateBillUserIsNotNull() {
            addCriterion("create_bill_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateBillUserEqualTo(Integer value) {
            addCriterion("create_bill_user =", value, "createBillUser");
            return (Criteria) this;
        }

        public Criteria andCreateBillUserNotEqualTo(Integer value) {
            addCriterion("create_bill_user <>", value, "createBillUser");
            return (Criteria) this;
        }

        public Criteria andCreateBillUserGreaterThan(Integer value) {
            addCriterion("create_bill_user >", value, "createBillUser");
            return (Criteria) this;
        }

        public Criteria andCreateBillUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_bill_user >=", value, "createBillUser");
            return (Criteria) this;
        }

        public Criteria andCreateBillUserLessThan(Integer value) {
            addCriterion("create_bill_user <", value, "createBillUser");
            return (Criteria) this;
        }

        public Criteria andCreateBillUserLessThanOrEqualTo(Integer value) {
            addCriterion("create_bill_user <=", value, "createBillUser");
            return (Criteria) this;
        }

        public Criteria andCreateBillUserIn(List<Integer> values) {
            addCriterion("create_bill_user in", values, "createBillUser");
            return (Criteria) this;
        }

        public Criteria andCreateBillUserNotIn(List<Integer> values) {
            addCriterion("create_bill_user not in", values, "createBillUser");
            return (Criteria) this;
        }

        public Criteria andCreateBillUserBetween(Integer value1, Integer value2) {
            addCriterion("create_bill_user between", value1, value2, "createBillUser");
            return (Criteria) this;
        }

        public Criteria andCreateBillUserNotBetween(Integer value1, Integer value2) {
            addCriterion("create_bill_user not between", value1, value2, "createBillUser");
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