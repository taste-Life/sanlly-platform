package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareShipSupplyReplaceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareShipSupplyReplaceExample() {
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

        public Criteria andWareShipSupplyReplaceIdIsNull() {
            addCriterion("ware_ship_supply_replace_id is null");
            return (Criteria) this;
        }

        public Criteria andWareShipSupplyReplaceIdIsNotNull() {
            addCriterion("ware_ship_supply_replace_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareShipSupplyReplaceIdEqualTo(Integer value) {
            addCriterion("ware_ship_supply_replace_id =", value, "wareShipSupplyReplaceId");
            return (Criteria) this;
        }

        public Criteria andWareShipSupplyReplaceIdNotEqualTo(Integer value) {
            addCriterion("ware_ship_supply_replace_id <>", value, "wareShipSupplyReplaceId");
            return (Criteria) this;
        }

        public Criteria andWareShipSupplyReplaceIdGreaterThan(Integer value) {
            addCriterion("ware_ship_supply_replace_id >", value, "wareShipSupplyReplaceId");
            return (Criteria) this;
        }

        public Criteria andWareShipSupplyReplaceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_ship_supply_replace_id >=", value, "wareShipSupplyReplaceId");
            return (Criteria) this;
        }

        public Criteria andWareShipSupplyReplaceIdLessThan(Integer value) {
            addCriterion("ware_ship_supply_replace_id <", value, "wareShipSupplyReplaceId");
            return (Criteria) this;
        }

        public Criteria andWareShipSupplyReplaceIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_ship_supply_replace_id <=", value, "wareShipSupplyReplaceId");
            return (Criteria) this;
        }

        public Criteria andWareShipSupplyReplaceIdIn(List<Integer> values) {
            addCriterion("ware_ship_supply_replace_id in", values, "wareShipSupplyReplaceId");
            return (Criteria) this;
        }

        public Criteria andWareShipSupplyReplaceIdNotIn(List<Integer> values) {
            addCriterion("ware_ship_supply_replace_id not in", values, "wareShipSupplyReplaceId");
            return (Criteria) this;
        }

        public Criteria andWareShipSupplyReplaceIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_ship_supply_replace_id between", value1, value2, "wareShipSupplyReplaceId");
            return (Criteria) this;
        }

        public Criteria andWareShipSupplyReplaceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_ship_supply_replace_id not between", value1, value2, "wareShipSupplyReplaceId");
            return (Criteria) this;
        }

        public Criteria andShipSupplyReplaceNoIsNull() {
            addCriterion("ship_supply_replace_no is null");
            return (Criteria) this;
        }

        public Criteria andShipSupplyReplaceNoIsNotNull() {
            addCriterion("ship_supply_replace_no is not null");
            return (Criteria) this;
        }

        public Criteria andShipSupplyReplaceNoEqualTo(String value) {
            addCriterion("ship_supply_replace_no =", value, "shipSupplyReplaceNo");
            return (Criteria) this;
        }

        public Criteria andShipSupplyReplaceNoNotEqualTo(String value) {
            addCriterion("ship_supply_replace_no <>", value, "shipSupplyReplaceNo");
            return (Criteria) this;
        }

        public Criteria andShipSupplyReplaceNoGreaterThan(String value) {
            addCriterion("ship_supply_replace_no >", value, "shipSupplyReplaceNo");
            return (Criteria) this;
        }

        public Criteria andShipSupplyReplaceNoGreaterThanOrEqualTo(String value) {
            addCriterion("ship_supply_replace_no >=", value, "shipSupplyReplaceNo");
            return (Criteria) this;
        }

        public Criteria andShipSupplyReplaceNoLessThan(String value) {
            addCriterion("ship_supply_replace_no <", value, "shipSupplyReplaceNo");
            return (Criteria) this;
        }

        public Criteria andShipSupplyReplaceNoLessThanOrEqualTo(String value) {
            addCriterion("ship_supply_replace_no <=", value, "shipSupplyReplaceNo");
            return (Criteria) this;
        }

        public Criteria andShipSupplyReplaceNoLike(String value) {
            addCriterion("ship_supply_replace_no like", value, "shipSupplyReplaceNo");
            return (Criteria) this;
        }

        public Criteria andShipSupplyReplaceNoNotLike(String value) {
            addCriterion("ship_supply_replace_no not like", value, "shipSupplyReplaceNo");
            return (Criteria) this;
        }

        public Criteria andShipSupplyReplaceNoIn(List<String> values) {
            addCriterion("ship_supply_replace_no in", values, "shipSupplyReplaceNo");
            return (Criteria) this;
        }

        public Criteria andShipSupplyReplaceNoNotIn(List<String> values) {
            addCriterion("ship_supply_replace_no not in", values, "shipSupplyReplaceNo");
            return (Criteria) this;
        }

        public Criteria andShipSupplyReplaceNoBetween(String value1, String value2) {
            addCriterion("ship_supply_replace_no between", value1, value2, "shipSupplyReplaceNo");
            return (Criteria) this;
        }

        public Criteria andShipSupplyReplaceNoNotBetween(String value1, String value2) {
            addCriterion("ship_supply_replace_no not between", value1, value2, "shipSupplyReplaceNo");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("`no` is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("`no` is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("`no` =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("`no` <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("`no` >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("`no` >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("`no` <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("`no` <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("`no` like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("`no` not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("`no` in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("`no` not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("`no` between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("`no` not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andReplaceCompanyIsNull() {
            addCriterion("replace_company is null");
            return (Criteria) this;
        }

        public Criteria andReplaceCompanyIsNotNull() {
            addCriterion("replace_company is not null");
            return (Criteria) this;
        }

        public Criteria andReplaceCompanyEqualTo(String value) {
            addCriterion("replace_company =", value, "replaceCompany");
            return (Criteria) this;
        }

        public Criteria andReplaceCompanyNotEqualTo(String value) {
            addCriterion("replace_company <>", value, "replaceCompany");
            return (Criteria) this;
        }

        public Criteria andReplaceCompanyGreaterThan(String value) {
            addCriterion("replace_company >", value, "replaceCompany");
            return (Criteria) this;
        }

        public Criteria andReplaceCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("replace_company >=", value, "replaceCompany");
            return (Criteria) this;
        }

        public Criteria andReplaceCompanyLessThan(String value) {
            addCriterion("replace_company <", value, "replaceCompany");
            return (Criteria) this;
        }

        public Criteria andReplaceCompanyLessThanOrEqualTo(String value) {
            addCriterion("replace_company <=", value, "replaceCompany");
            return (Criteria) this;
        }

        public Criteria andReplaceCompanyLike(String value) {
            addCriterion("replace_company like", value, "replaceCompany");
            return (Criteria) this;
        }

        public Criteria andReplaceCompanyNotLike(String value) {
            addCriterion("replace_company not like", value, "replaceCompany");
            return (Criteria) this;
        }

        public Criteria andReplaceCompanyIn(List<String> values) {
            addCriterion("replace_company in", values, "replaceCompany");
            return (Criteria) this;
        }

        public Criteria andReplaceCompanyNotIn(List<String> values) {
            addCriterion("replace_company not in", values, "replaceCompany");
            return (Criteria) this;
        }

        public Criteria andReplaceCompanyBetween(String value1, String value2) {
            addCriterion("replace_company between", value1, value2, "replaceCompany");
            return (Criteria) this;
        }

        public Criteria andReplaceCompanyNotBetween(String value1, String value2) {
            addCriterion("replace_company not between", value1, value2, "replaceCompany");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCompanyIsNull() {
            addCriterion("ship_supply_company is null");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCompanyIsNotNull() {
            addCriterion("ship_supply_company is not null");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCompanyEqualTo(String value) {
            addCriterion("ship_supply_company =", value, "shipSupplyCompany");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCompanyNotEqualTo(String value) {
            addCriterion("ship_supply_company <>", value, "shipSupplyCompany");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCompanyGreaterThan(String value) {
            addCriterion("ship_supply_company >", value, "shipSupplyCompany");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("ship_supply_company >=", value, "shipSupplyCompany");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCompanyLessThan(String value) {
            addCriterion("ship_supply_company <", value, "shipSupplyCompany");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCompanyLessThanOrEqualTo(String value) {
            addCriterion("ship_supply_company <=", value, "shipSupplyCompany");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCompanyLike(String value) {
            addCriterion("ship_supply_company like", value, "shipSupplyCompany");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCompanyNotLike(String value) {
            addCriterion("ship_supply_company not like", value, "shipSupplyCompany");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCompanyIn(List<String> values) {
            addCriterion("ship_supply_company in", values, "shipSupplyCompany");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCompanyNotIn(List<String> values) {
            addCriterion("ship_supply_company not in", values, "shipSupplyCompany");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCompanyBetween(String value1, String value2) {
            addCriterion("ship_supply_company between", value1, value2, "shipSupplyCompany");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCompanyNotBetween(String value1, String value2) {
            addCriterion("ship_supply_company not between", value1, value2, "shipSupplyCompany");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCzIsNull() {
            addCriterion("ship_supply_cz is null");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCzIsNotNull() {
            addCriterion("ship_supply_cz is not null");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCzEqualTo(String value) {
            addCriterion("ship_supply_cz =", value, "shipSupplyCz");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCzNotEqualTo(String value) {
            addCriterion("ship_supply_cz <>", value, "shipSupplyCz");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCzGreaterThan(String value) {
            addCriterion("ship_supply_cz >", value, "shipSupplyCz");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCzGreaterThanOrEqualTo(String value) {
            addCriterion("ship_supply_cz >=", value, "shipSupplyCz");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCzLessThan(String value) {
            addCriterion("ship_supply_cz <", value, "shipSupplyCz");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCzLessThanOrEqualTo(String value) {
            addCriterion("ship_supply_cz <=", value, "shipSupplyCz");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCzLike(String value) {
            addCriterion("ship_supply_cz like", value, "shipSupplyCz");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCzNotLike(String value) {
            addCriterion("ship_supply_cz not like", value, "shipSupplyCz");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCzIn(List<String> values) {
            addCriterion("ship_supply_cz in", values, "shipSupplyCz");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCzNotIn(List<String> values) {
            addCriterion("ship_supply_cz not in", values, "shipSupplyCz");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCzBetween(String value1, String value2) {
            addCriterion("ship_supply_cz between", value1, value2, "shipSupplyCz");
            return (Criteria) this;
        }

        public Criteria andShipSupplyCzNotBetween(String value1, String value2) {
            addCriterion("ship_supply_cz not between", value1, value2, "shipSupplyCz");
            return (Criteria) this;
        }

        public Criteria andShipSupplyPriceIsNull() {
            addCriterion("ship_supply_price is null");
            return (Criteria) this;
        }

        public Criteria andShipSupplyPriceIsNotNull() {
            addCriterion("ship_supply_price is not null");
            return (Criteria) this;
        }

        public Criteria andShipSupplyPriceEqualTo(BigDecimal value) {
            addCriterion("ship_supply_price =", value, "shipSupplyPrice");
            return (Criteria) this;
        }

        public Criteria andShipSupplyPriceNotEqualTo(BigDecimal value) {
            addCriterion("ship_supply_price <>", value, "shipSupplyPrice");
            return (Criteria) this;
        }

        public Criteria andShipSupplyPriceGreaterThan(BigDecimal value) {
            addCriterion("ship_supply_price >", value, "shipSupplyPrice");
            return (Criteria) this;
        }

        public Criteria andShipSupplyPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ship_supply_price >=", value, "shipSupplyPrice");
            return (Criteria) this;
        }

        public Criteria andShipSupplyPriceLessThan(BigDecimal value) {
            addCriterion("ship_supply_price <", value, "shipSupplyPrice");
            return (Criteria) this;
        }

        public Criteria andShipSupplyPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ship_supply_price <=", value, "shipSupplyPrice");
            return (Criteria) this;
        }

        public Criteria andShipSupplyPriceIn(List<BigDecimal> values) {
            addCriterion("ship_supply_price in", values, "shipSupplyPrice");
            return (Criteria) this;
        }

        public Criteria andShipSupplyPriceNotIn(List<BigDecimal> values) {
            addCriterion("ship_supply_price not in", values, "shipSupplyPrice");
            return (Criteria) this;
        }

        public Criteria andShipSupplyPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ship_supply_price between", value1, value2, "shipSupplyPrice");
            return (Criteria) this;
        }

        public Criteria andShipSupplyPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ship_supply_price not between", value1, value2, "shipSupplyPrice");
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

        public Criteria andCustomerIsNull() {
            addCriterion("customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("customer like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("customer not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("customer not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNull() {
            addCriterion("bill_status is null");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNotNull() {
            addCriterion("bill_status is not null");
            return (Criteria) this;
        }

        public Criteria andBillStatusEqualTo(String value) {
            addCriterion("bill_status =", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotEqualTo(String value) {
            addCriterion("bill_status <>", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThan(String value) {
            addCriterion("bill_status >", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThanOrEqualTo(String value) {
            addCriterion("bill_status >=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThan(String value) {
            addCriterion("bill_status <", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThanOrEqualTo(String value) {
            addCriterion("bill_status <=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLike(String value) {
            addCriterion("bill_status like", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotLike(String value) {
            addCriterion("bill_status not like", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusIn(List<String> values) {
            addCriterion("bill_status in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotIn(List<String> values) {
            addCriterion("bill_status not in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusBetween(String value1, String value2) {
            addCriterion("bill_status between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotBetween(String value1, String value2) {
            addCriterion("bill_status not between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andShipSupplyDateIsNull() {
            addCriterion("ship_supply_date is null");
            return (Criteria) this;
        }

        public Criteria andShipSupplyDateIsNotNull() {
            addCriterion("ship_supply_date is not null");
            return (Criteria) this;
        }

        public Criteria andShipSupplyDateEqualTo(Date value) {
            addCriterion("ship_supply_date =", value, "shipSupplyDate");
            return (Criteria) this;
        }

        public Criteria andShipSupplyDateNotEqualTo(Date value) {
            addCriterion("ship_supply_date <>", value, "shipSupplyDate");
            return (Criteria) this;
        }

        public Criteria andShipSupplyDateGreaterThan(Date value) {
            addCriterion("ship_supply_date >", value, "shipSupplyDate");
            return (Criteria) this;
        }

        public Criteria andShipSupplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ship_supply_date >=", value, "shipSupplyDate");
            return (Criteria) this;
        }

        public Criteria andShipSupplyDateLessThan(Date value) {
            addCriterion("ship_supply_date <", value, "shipSupplyDate");
            return (Criteria) this;
        }

        public Criteria andShipSupplyDateLessThanOrEqualTo(Date value) {
            addCriterion("ship_supply_date <=", value, "shipSupplyDate");
            return (Criteria) this;
        }

        public Criteria andShipSupplyDateIn(List<Date> values) {
            addCriterion("ship_supply_date in", values, "shipSupplyDate");
            return (Criteria) this;
        }

        public Criteria andShipSupplyDateNotIn(List<Date> values) {
            addCriterion("ship_supply_date not in", values, "shipSupplyDate");
            return (Criteria) this;
        }

        public Criteria andShipSupplyDateBetween(Date value1, Date value2) {
            addCriterion("ship_supply_date between", value1, value2, "shipSupplyDate");
            return (Criteria) this;
        }

        public Criteria andShipSupplyDateNotBetween(Date value1, Date value2) {
            addCriterion("ship_supply_date not between", value1, value2, "shipSupplyDate");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberIsNull() {
            addCriterion("voyage_number is null");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberIsNotNull() {
            addCriterion("voyage_number is not null");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberEqualTo(String value) {
            addCriterion("voyage_number =", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotEqualTo(String value) {
            addCriterion("voyage_number <>", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberGreaterThan(String value) {
            addCriterion("voyage_number >", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberGreaterThanOrEqualTo(String value) {
            addCriterion("voyage_number >=", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberLessThan(String value) {
            addCriterion("voyage_number <", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberLessThanOrEqualTo(String value) {
            addCriterion("voyage_number <=", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberLike(String value) {
            addCriterion("voyage_number like", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotLike(String value) {
            addCriterion("voyage_number not like", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberIn(List<String> values) {
            addCriterion("voyage_number in", values, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotIn(List<String> values) {
            addCriterion("voyage_number not in", values, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberBetween(String value1, String value2) {
            addCriterion("voyage_number between", value1, value2, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotBetween(String value1, String value2) {
            addCriterion("voyage_number not between", value1, value2, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNull() {
            addCriterion("ship_name is null");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNotNull() {
            addCriterion("ship_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipNameEqualTo(String value) {
            addCriterion("ship_name =", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotEqualTo(String value) {
            addCriterion("ship_name <>", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThan(String value) {
            addCriterion("ship_name >", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThanOrEqualTo(String value) {
            addCriterion("ship_name >=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThan(String value) {
            addCriterion("ship_name <", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThanOrEqualTo(String value) {
            addCriterion("ship_name <=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLike(String value) {
            addCriterion("ship_name like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotLike(String value) {
            addCriterion("ship_name not like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameIn(List<String> values) {
            addCriterion("ship_name in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotIn(List<String> values) {
            addCriterion("ship_name not in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameBetween(String value1, String value2) {
            addCriterion("ship_name between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotBetween(String value1, String value2) {
            addCriterion("ship_name not between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(String value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(String value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("audit_status like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("audit_status not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<String> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<String> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionIsNull() {
            addCriterion("reasons_rejection is null");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionIsNotNull() {
            addCriterion("reasons_rejection is not null");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionEqualTo(String value) {
            addCriterion("reasons_rejection =", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionNotEqualTo(String value) {
            addCriterion("reasons_rejection <>", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionGreaterThan(String value) {
            addCriterion("reasons_rejection >", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionGreaterThanOrEqualTo(String value) {
            addCriterion("reasons_rejection >=", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionLessThan(String value) {
            addCriterion("reasons_rejection <", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionLessThanOrEqualTo(String value) {
            addCriterion("reasons_rejection <=", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionLike(String value) {
            addCriterion("reasons_rejection like", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionNotLike(String value) {
            addCriterion("reasons_rejection not like", value, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionIn(List<String> values) {
            addCriterion("reasons_rejection in", values, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionNotIn(List<String> values) {
            addCriterion("reasons_rejection not in", values, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionBetween(String value1, String value2) {
            addCriterion("reasons_rejection between", value1, value2, "reasonsRejection");
            return (Criteria) this;
        }

        public Criteria andReasonsRejectionNotBetween(String value1, String value2) {
            addCriterion("reasons_rejection not between", value1, value2, "reasonsRejection");
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