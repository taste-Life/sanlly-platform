package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BusinessExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andBillTypeIsNull() {
            addCriterion("bill_type is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(String value) {
            addCriterion("bill_type =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(String value) {
            addCriterion("bill_type <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(String value) {
            addCriterion("bill_type >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bill_type >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(String value) {
            addCriterion("bill_type <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(String value) {
            addCriterion("bill_type <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLike(String value) {
            addCriterion("bill_type like", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotLike(String value) {
            addCriterion("bill_type not like", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<String> values) {
            addCriterion("bill_type in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<String> values) {
            addCriterion("bill_type not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(String value1, String value2) {
            addCriterion("bill_type between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(String value1, String value2) {
            addCriterion("bill_type not between", value1, value2, "billType");
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

        public Criteria andTaxTotalCostUsdIsNull() {
            addCriterion("tax_total_cost_usd is null");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostUsdIsNotNull() {
            addCriterion("tax_total_cost_usd is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostUsdEqualTo(BigDecimal value) {
            addCriterion("tax_total_cost_usd =", value, "taxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostUsdNotEqualTo(BigDecimal value) {
            addCriterion("tax_total_cost_usd <>", value, "taxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostUsdGreaterThan(BigDecimal value) {
            addCriterion("tax_total_cost_usd >", value, "taxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostUsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_total_cost_usd >=", value, "taxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostUsdLessThan(BigDecimal value) {
            addCriterion("tax_total_cost_usd <", value, "taxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostUsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_total_cost_usd <=", value, "taxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostUsdIn(List<BigDecimal> values) {
            addCriterion("tax_total_cost_usd in", values, "taxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostUsdNotIn(List<BigDecimal> values) {
            addCriterion("tax_total_cost_usd not in", values, "taxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostUsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_total_cost_usd between", value1, value2, "taxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostUsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_total_cost_usd not between", value1, value2, "taxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostUsdIsNull() {
            addCriterion("notax_total_cost_usd is null");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostUsdIsNotNull() {
            addCriterion("notax_total_cost_usd is not null");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostUsdEqualTo(BigDecimal value) {
            addCriterion("notax_total_cost_usd =", value, "notaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostUsdNotEqualTo(BigDecimal value) {
            addCriterion("notax_total_cost_usd <>", value, "notaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostUsdGreaterThan(BigDecimal value) {
            addCriterion("notax_total_cost_usd >", value, "notaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostUsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("notax_total_cost_usd >=", value, "notaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostUsdLessThan(BigDecimal value) {
            addCriterion("notax_total_cost_usd <", value, "notaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostUsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("notax_total_cost_usd <=", value, "notaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostUsdIn(List<BigDecimal> values) {
            addCriterion("notax_total_cost_usd in", values, "notaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostUsdNotIn(List<BigDecimal> values) {
            addCriterion("notax_total_cost_usd not in", values, "notaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostUsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("notax_total_cost_usd between", value1, value2, "notaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostUsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("notax_total_cost_usd not between", value1, value2, "notaxTotalCostUsd");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostRmbIsNull() {
            addCriterion("tax_total_cost_rmb is null");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostRmbIsNotNull() {
            addCriterion("tax_total_cost_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostRmbEqualTo(BigDecimal value) {
            addCriterion("tax_total_cost_rmb =", value, "taxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostRmbNotEqualTo(BigDecimal value) {
            addCriterion("tax_total_cost_rmb <>", value, "taxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostRmbGreaterThan(BigDecimal value) {
            addCriterion("tax_total_cost_rmb >", value, "taxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostRmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_total_cost_rmb >=", value, "taxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostRmbLessThan(BigDecimal value) {
            addCriterion("tax_total_cost_rmb <", value, "taxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostRmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_total_cost_rmb <=", value, "taxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostRmbIn(List<BigDecimal> values) {
            addCriterion("tax_total_cost_rmb in", values, "taxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostRmbNotIn(List<BigDecimal> values) {
            addCriterion("tax_total_cost_rmb not in", values, "taxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostRmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_total_cost_rmb between", value1, value2, "taxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andTaxTotalCostRmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_total_cost_rmb not between", value1, value2, "taxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostRmbIsNull() {
            addCriterion("notax_total_cost_rmb is null");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostRmbIsNotNull() {
            addCriterion("notax_total_cost_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostRmbEqualTo(BigDecimal value) {
            addCriterion("notax_total_cost_rmb =", value, "notaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostRmbNotEqualTo(BigDecimal value) {
            addCriterion("notax_total_cost_rmb <>", value, "notaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostRmbGreaterThan(BigDecimal value) {
            addCriterion("notax_total_cost_rmb >", value, "notaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostRmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("notax_total_cost_rmb >=", value, "notaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostRmbLessThan(BigDecimal value) {
            addCriterion("notax_total_cost_rmb <", value, "notaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostRmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("notax_total_cost_rmb <=", value, "notaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostRmbIn(List<BigDecimal> values) {
            addCriterion("notax_total_cost_rmb in", values, "notaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostRmbNotIn(List<BigDecimal> values) {
            addCriterion("notax_total_cost_rmb not in", values, "notaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostRmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("notax_total_cost_rmb between", value1, value2, "notaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andNotaxTotalCostRmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("notax_total_cost_rmb not between", value1, value2, "notaxTotalCostRmb");
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

        public Criteria andTaxAmountUsdIsNull() {
            addCriterion("tax_amount_usd is null");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdIsNotNull() {
            addCriterion("tax_amount_usd is not null");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdEqualTo(BigDecimal value) {
            addCriterion("tax_amount_usd =", value, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdNotEqualTo(BigDecimal value) {
            addCriterion("tax_amount_usd <>", value, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdGreaterThan(BigDecimal value) {
            addCriterion("tax_amount_usd >", value, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_amount_usd >=", value, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdLessThan(BigDecimal value) {
            addCriterion("tax_amount_usd <", value, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_amount_usd <=", value, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdIn(List<BigDecimal> values) {
            addCriterion("tax_amount_usd in", values, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdNotIn(List<BigDecimal> values) {
            addCriterion("tax_amount_usd not in", values, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_amount_usd between", value1, value2, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_amount_usd not between", value1, value2, "taxAmountUsd");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbIsNull() {
            addCriterion("tax_amount_rmb is null");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbIsNotNull() {
            addCriterion("tax_amount_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbEqualTo(BigDecimal value) {
            addCriterion("tax_amount_rmb =", value, "taxAmountRmb");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbNotEqualTo(BigDecimal value) {
            addCriterion("tax_amount_rmb <>", value, "taxAmountRmb");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbGreaterThan(BigDecimal value) {
            addCriterion("tax_amount_rmb >", value, "taxAmountRmb");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_amount_rmb >=", value, "taxAmountRmb");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbLessThan(BigDecimal value) {
            addCriterion("tax_amount_rmb <", value, "taxAmountRmb");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_amount_rmb <=", value, "taxAmountRmb");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbIn(List<BigDecimal> values) {
            addCriterion("tax_amount_rmb in", values, "taxAmountRmb");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbNotIn(List<BigDecimal> values) {
            addCriterion("tax_amount_rmb not in", values, "taxAmountRmb");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_amount_rmb between", value1, value2, "taxAmountRmb");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_amount_rmb not between", value1, value2, "taxAmountRmb");
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