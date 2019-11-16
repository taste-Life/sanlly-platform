package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManhourRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ManhourRateExample() {
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

        public Criteria andProdManhourRateIdIsNull() {
            addCriterion("prod_manhour_rate_id is null");
            return (Criteria) this;
        }

        public Criteria andProdManhourRateIdIsNotNull() {
            addCriterion("prod_manhour_rate_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdManhourRateIdEqualTo(Integer value) {
            addCriterion("prod_manhour_rate_id =", value, "prodManhourRateId");
            return (Criteria) this;
        }

        public Criteria andProdManhourRateIdNotEqualTo(Integer value) {
            addCriterion("prod_manhour_rate_id <>", value, "prodManhourRateId");
            return (Criteria) this;
        }

        public Criteria andProdManhourRateIdGreaterThan(Integer value) {
            addCriterion("prod_manhour_rate_id >", value, "prodManhourRateId");
            return (Criteria) this;
        }

        public Criteria andProdManhourRateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_manhour_rate_id >=", value, "prodManhourRateId");
            return (Criteria) this;
        }

        public Criteria andProdManhourRateIdLessThan(Integer value) {
            addCriterion("prod_manhour_rate_id <", value, "prodManhourRateId");
            return (Criteria) this;
        }

        public Criteria andProdManhourRateIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_manhour_rate_id <=", value, "prodManhourRateId");
            return (Criteria) this;
        }

        public Criteria andProdManhourRateIdIn(List<Integer> values) {
            addCriterion("prod_manhour_rate_id in", values, "prodManhourRateId");
            return (Criteria) this;
        }

        public Criteria andProdManhourRateIdNotIn(List<Integer> values) {
            addCriterion("prod_manhour_rate_id not in", values, "prodManhourRateId");
            return (Criteria) this;
        }

        public Criteria andProdManhourRateIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_manhour_rate_id between", value1, value2, "prodManhourRateId");
            return (Criteria) this;
        }

        public Criteria andProdManhourRateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_manhour_rate_id not between", value1, value2, "prodManhourRateId");
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

        public Criteria andContbodyManhourRateIsNull() {
            addCriterion("contbody_manhour_rate is null");
            return (Criteria) this;
        }

        public Criteria andContbodyManhourRateIsNotNull() {
            addCriterion("contbody_manhour_rate is not null");
            return (Criteria) this;
        }

        public Criteria andContbodyManhourRateEqualTo(BigDecimal value) {
            addCriterion("contbody_manhour_rate =", value, "contbodyManhourRate");
            return (Criteria) this;
        }

        public Criteria andContbodyManhourRateNotEqualTo(BigDecimal value) {
            addCriterion("contbody_manhour_rate <>", value, "contbodyManhourRate");
            return (Criteria) this;
        }

        public Criteria andContbodyManhourRateGreaterThan(BigDecimal value) {
            addCriterion("contbody_manhour_rate >", value, "contbodyManhourRate");
            return (Criteria) this;
        }

        public Criteria andContbodyManhourRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("contbody_manhour_rate >=", value, "contbodyManhourRate");
            return (Criteria) this;
        }

        public Criteria andContbodyManhourRateLessThan(BigDecimal value) {
            addCriterion("contbody_manhour_rate <", value, "contbodyManhourRate");
            return (Criteria) this;
        }

        public Criteria andContbodyManhourRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("contbody_manhour_rate <=", value, "contbodyManhourRate");
            return (Criteria) this;
        }

        public Criteria andContbodyManhourRateIn(List<BigDecimal> values) {
            addCriterion("contbody_manhour_rate in", values, "contbodyManhourRate");
            return (Criteria) this;
        }

        public Criteria andContbodyManhourRateNotIn(List<BigDecimal> values) {
            addCriterion("contbody_manhour_rate not in", values, "contbodyManhourRate");
            return (Criteria) this;
        }

        public Criteria andContbodyManhourRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("contbody_manhour_rate between", value1, value2, "contbodyManhourRate");
            return (Criteria) this;
        }

        public Criteria andContbodyManhourRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("contbody_manhour_rate not between", value1, value2, "contbodyManhourRate");
            return (Criteria) this;
        }

        public Criteria andContbodyQuotedCurrencyIsNull() {
            addCriterion("contbody_quoted_currency is null");
            return (Criteria) this;
        }

        public Criteria andContbodyQuotedCurrencyIsNotNull() {
            addCriterion("contbody_quoted_currency is not null");
            return (Criteria) this;
        }

        public Criteria andContbodyQuotedCurrencyEqualTo(String value) {
            addCriterion("contbody_quoted_currency =", value, "contbodyQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyQuotedCurrencyNotEqualTo(String value) {
            addCriterion("contbody_quoted_currency <>", value, "contbodyQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyQuotedCurrencyGreaterThan(String value) {
            addCriterion("contbody_quoted_currency >", value, "contbodyQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyQuotedCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("contbody_quoted_currency >=", value, "contbodyQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyQuotedCurrencyLessThan(String value) {
            addCriterion("contbody_quoted_currency <", value, "contbodyQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyQuotedCurrencyLessThanOrEqualTo(String value) {
            addCriterion("contbody_quoted_currency <=", value, "contbodyQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyQuotedCurrencyLike(String value) {
            addCriterion("contbody_quoted_currency like", value, "contbodyQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyQuotedCurrencyNotLike(String value) {
            addCriterion("contbody_quoted_currency not like", value, "contbodyQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyQuotedCurrencyIn(List<String> values) {
            addCriterion("contbody_quoted_currency in", values, "contbodyQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyQuotedCurrencyNotIn(List<String> values) {
            addCriterion("contbody_quoted_currency not in", values, "contbodyQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyQuotedCurrencyBetween(String value1, String value2) {
            addCriterion("contbody_quoted_currency between", value1, value2, "contbodyQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyQuotedCurrencyNotBetween(String value1, String value2) {
            addCriterion("contbody_quoted_currency not between", value1, value2, "contbodyQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyRateCurrencyIsNull() {
            addCriterion("contbody_rate_currency is null");
            return (Criteria) this;
        }

        public Criteria andContbodyRateCurrencyIsNotNull() {
            addCriterion("contbody_rate_currency is not null");
            return (Criteria) this;
        }

        public Criteria andContbodyRateCurrencyEqualTo(String value) {
            addCriterion("contbody_rate_currency =", value, "contbodyRateCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyRateCurrencyNotEqualTo(String value) {
            addCriterion("contbody_rate_currency <>", value, "contbodyRateCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyRateCurrencyGreaterThan(String value) {
            addCriterion("contbody_rate_currency >", value, "contbodyRateCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyRateCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("contbody_rate_currency >=", value, "contbodyRateCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyRateCurrencyLessThan(String value) {
            addCriterion("contbody_rate_currency <", value, "contbodyRateCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyRateCurrencyLessThanOrEqualTo(String value) {
            addCriterion("contbody_rate_currency <=", value, "contbodyRateCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyRateCurrencyLike(String value) {
            addCriterion("contbody_rate_currency like", value, "contbodyRateCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyRateCurrencyNotLike(String value) {
            addCriterion("contbody_rate_currency not like", value, "contbodyRateCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyRateCurrencyIn(List<String> values) {
            addCriterion("contbody_rate_currency in", values, "contbodyRateCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyRateCurrencyNotIn(List<String> values) {
            addCriterion("contbody_rate_currency not in", values, "contbodyRateCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyRateCurrencyBetween(String value1, String value2) {
            addCriterion("contbody_rate_currency between", value1, value2, "contbodyRateCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyRateCurrencyNotBetween(String value1, String value2) {
            addCriterion("contbody_rate_currency not between", value1, value2, "contbodyRateCurrency");
            return (Criteria) this;
        }

        public Criteria andContbodyExchangeRateIsNull() {
            addCriterion("contbody_exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andContbodyExchangeRateIsNotNull() {
            addCriterion("contbody_exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andContbodyExchangeRateEqualTo(BigDecimal value) {
            addCriterion("contbody_exchange_rate =", value, "contbodyExchangeRate");
            return (Criteria) this;
        }

        public Criteria andContbodyExchangeRateNotEqualTo(BigDecimal value) {
            addCriterion("contbody_exchange_rate <>", value, "contbodyExchangeRate");
            return (Criteria) this;
        }

        public Criteria andContbodyExchangeRateGreaterThan(BigDecimal value) {
            addCriterion("contbody_exchange_rate >", value, "contbodyExchangeRate");
            return (Criteria) this;
        }

        public Criteria andContbodyExchangeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("contbody_exchange_rate >=", value, "contbodyExchangeRate");
            return (Criteria) this;
        }

        public Criteria andContbodyExchangeRateLessThan(BigDecimal value) {
            addCriterion("contbody_exchange_rate <", value, "contbodyExchangeRate");
            return (Criteria) this;
        }

        public Criteria andContbodyExchangeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("contbody_exchange_rate <=", value, "contbodyExchangeRate");
            return (Criteria) this;
        }

        public Criteria andContbodyExchangeRateIn(List<BigDecimal> values) {
            addCriterion("contbody_exchange_rate in", values, "contbodyExchangeRate");
            return (Criteria) this;
        }

        public Criteria andContbodyExchangeRateNotIn(List<BigDecimal> values) {
            addCriterion("contbody_exchange_rate not in", values, "contbodyExchangeRate");
            return (Criteria) this;
        }

        public Criteria andContbodyExchangeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("contbody_exchange_rate between", value1, value2, "contbodyExchangeRate");
            return (Criteria) this;
        }

        public Criteria andContbodyExchangeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("contbody_exchange_rate not between", value1, value2, "contbodyExchangeRate");
            return (Criteria) this;
        }

        public Criteria andUnitManhourRateIsNull() {
            addCriterion("unit_manhour_rate is null");
            return (Criteria) this;
        }

        public Criteria andUnitManhourRateIsNotNull() {
            addCriterion("unit_manhour_rate is not null");
            return (Criteria) this;
        }

        public Criteria andUnitManhourRateEqualTo(BigDecimal value) {
            addCriterion("unit_manhour_rate =", value, "unitManhourRate");
            return (Criteria) this;
        }

        public Criteria andUnitManhourRateNotEqualTo(BigDecimal value) {
            addCriterion("unit_manhour_rate <>", value, "unitManhourRate");
            return (Criteria) this;
        }

        public Criteria andUnitManhourRateGreaterThan(BigDecimal value) {
            addCriterion("unit_manhour_rate >", value, "unitManhourRate");
            return (Criteria) this;
        }

        public Criteria andUnitManhourRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_manhour_rate >=", value, "unitManhourRate");
            return (Criteria) this;
        }

        public Criteria andUnitManhourRateLessThan(BigDecimal value) {
            addCriterion("unit_manhour_rate <", value, "unitManhourRate");
            return (Criteria) this;
        }

        public Criteria andUnitManhourRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_manhour_rate <=", value, "unitManhourRate");
            return (Criteria) this;
        }

        public Criteria andUnitManhourRateIn(List<BigDecimal> values) {
            addCriterion("unit_manhour_rate in", values, "unitManhourRate");
            return (Criteria) this;
        }

        public Criteria andUnitManhourRateNotIn(List<BigDecimal> values) {
            addCriterion("unit_manhour_rate not in", values, "unitManhourRate");
            return (Criteria) this;
        }

        public Criteria andUnitManhourRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_manhour_rate between", value1, value2, "unitManhourRate");
            return (Criteria) this;
        }

        public Criteria andUnitManhourRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_manhour_rate not between", value1, value2, "unitManhourRate");
            return (Criteria) this;
        }

        public Criteria andUnitQuotedCurrencyIsNull() {
            addCriterion("unit_quoted_currency is null");
            return (Criteria) this;
        }

        public Criteria andUnitQuotedCurrencyIsNotNull() {
            addCriterion("unit_quoted_currency is not null");
            return (Criteria) this;
        }

        public Criteria andUnitQuotedCurrencyEqualTo(String value) {
            addCriterion("unit_quoted_currency =", value, "unitQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitQuotedCurrencyNotEqualTo(String value) {
            addCriterion("unit_quoted_currency <>", value, "unitQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitQuotedCurrencyGreaterThan(String value) {
            addCriterion("unit_quoted_currency >", value, "unitQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitQuotedCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("unit_quoted_currency >=", value, "unitQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitQuotedCurrencyLessThan(String value) {
            addCriterion("unit_quoted_currency <", value, "unitQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitQuotedCurrencyLessThanOrEqualTo(String value) {
            addCriterion("unit_quoted_currency <=", value, "unitQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitQuotedCurrencyLike(String value) {
            addCriterion("unit_quoted_currency like", value, "unitQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitQuotedCurrencyNotLike(String value) {
            addCriterion("unit_quoted_currency not like", value, "unitQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitQuotedCurrencyIn(List<String> values) {
            addCriterion("unit_quoted_currency in", values, "unitQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitQuotedCurrencyNotIn(List<String> values) {
            addCriterion("unit_quoted_currency not in", values, "unitQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitQuotedCurrencyBetween(String value1, String value2) {
            addCriterion("unit_quoted_currency between", value1, value2, "unitQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitQuotedCurrencyNotBetween(String value1, String value2) {
            addCriterion("unit_quoted_currency not between", value1, value2, "unitQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitRateCurrencyIsNull() {
            addCriterion("unit_rate_currency is null");
            return (Criteria) this;
        }

        public Criteria andUnitRateCurrencyIsNotNull() {
            addCriterion("unit_rate_currency is not null");
            return (Criteria) this;
        }

        public Criteria andUnitRateCurrencyEqualTo(String value) {
            addCriterion("unit_rate_currency =", value, "unitRateCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitRateCurrencyNotEqualTo(String value) {
            addCriterion("unit_rate_currency <>", value, "unitRateCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitRateCurrencyGreaterThan(String value) {
            addCriterion("unit_rate_currency >", value, "unitRateCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitRateCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("unit_rate_currency >=", value, "unitRateCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitRateCurrencyLessThan(String value) {
            addCriterion("unit_rate_currency <", value, "unitRateCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitRateCurrencyLessThanOrEqualTo(String value) {
            addCriterion("unit_rate_currency <=", value, "unitRateCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitRateCurrencyLike(String value) {
            addCriterion("unit_rate_currency like", value, "unitRateCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitRateCurrencyNotLike(String value) {
            addCriterion("unit_rate_currency not like", value, "unitRateCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitRateCurrencyIn(List<String> values) {
            addCriterion("unit_rate_currency in", values, "unitRateCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitRateCurrencyNotIn(List<String> values) {
            addCriterion("unit_rate_currency not in", values, "unitRateCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitRateCurrencyBetween(String value1, String value2) {
            addCriterion("unit_rate_currency between", value1, value2, "unitRateCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitRateCurrencyNotBetween(String value1, String value2) {
            addCriterion("unit_rate_currency not between", value1, value2, "unitRateCurrency");
            return (Criteria) this;
        }

        public Criteria andUnitExchangeRateIsNull() {
            addCriterion("unit_exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andUnitExchangeRateIsNotNull() {
            addCriterion("unit_exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andUnitExchangeRateEqualTo(BigDecimal value) {
            addCriterion("unit_exchange_rate =", value, "unitExchangeRate");
            return (Criteria) this;
        }

        public Criteria andUnitExchangeRateNotEqualTo(BigDecimal value) {
            addCriterion("unit_exchange_rate <>", value, "unitExchangeRate");
            return (Criteria) this;
        }

        public Criteria andUnitExchangeRateGreaterThan(BigDecimal value) {
            addCriterion("unit_exchange_rate >", value, "unitExchangeRate");
            return (Criteria) this;
        }

        public Criteria andUnitExchangeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_exchange_rate >=", value, "unitExchangeRate");
            return (Criteria) this;
        }

        public Criteria andUnitExchangeRateLessThan(BigDecimal value) {
            addCriterion("unit_exchange_rate <", value, "unitExchangeRate");
            return (Criteria) this;
        }

        public Criteria andUnitExchangeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_exchange_rate <=", value, "unitExchangeRate");
            return (Criteria) this;
        }

        public Criteria andUnitExchangeRateIn(List<BigDecimal> values) {
            addCriterion("unit_exchange_rate in", values, "unitExchangeRate");
            return (Criteria) this;
        }

        public Criteria andUnitExchangeRateNotIn(List<BigDecimal> values) {
            addCriterion("unit_exchange_rate not in", values, "unitExchangeRate");
            return (Criteria) this;
        }

        public Criteria andUnitExchangeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_exchange_rate between", value1, value2, "unitExchangeRate");
            return (Criteria) this;
        }

        public Criteria andUnitExchangeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_exchange_rate not between", value1, value2, "unitExchangeRate");
            return (Criteria) this;
        }

        public Criteria andDrycontManhourRateIsNull() {
            addCriterion("drycont_manhour_rate is null");
            return (Criteria) this;
        }

        public Criteria andDrycontManhourRateIsNotNull() {
            addCriterion("drycont_manhour_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDrycontManhourRateEqualTo(BigDecimal value) {
            addCriterion("drycont_manhour_rate =", value, "drycontManhourRate");
            return (Criteria) this;
        }

        public Criteria andDrycontManhourRateNotEqualTo(BigDecimal value) {
            addCriterion("drycont_manhour_rate <>", value, "drycontManhourRate");
            return (Criteria) this;
        }

        public Criteria andDrycontManhourRateGreaterThan(BigDecimal value) {
            addCriterion("drycont_manhour_rate >", value, "drycontManhourRate");
            return (Criteria) this;
        }

        public Criteria andDrycontManhourRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("drycont_manhour_rate >=", value, "drycontManhourRate");
            return (Criteria) this;
        }

        public Criteria andDrycontManhourRateLessThan(BigDecimal value) {
            addCriterion("drycont_manhour_rate <", value, "drycontManhourRate");
            return (Criteria) this;
        }

        public Criteria andDrycontManhourRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("drycont_manhour_rate <=", value, "drycontManhourRate");
            return (Criteria) this;
        }

        public Criteria andDrycontManhourRateIn(List<BigDecimal> values) {
            addCriterion("drycont_manhour_rate in", values, "drycontManhourRate");
            return (Criteria) this;
        }

        public Criteria andDrycontManhourRateNotIn(List<BigDecimal> values) {
            addCriterion("drycont_manhour_rate not in", values, "drycontManhourRate");
            return (Criteria) this;
        }

        public Criteria andDrycontManhourRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drycont_manhour_rate between", value1, value2, "drycontManhourRate");
            return (Criteria) this;
        }

        public Criteria andDrycontManhourRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drycont_manhour_rate not between", value1, value2, "drycontManhourRate");
            return (Criteria) this;
        }

        public Criteria andDrycontQuotedCurrencyIsNull() {
            addCriterion("drycont_quoted_currency is null");
            return (Criteria) this;
        }

        public Criteria andDrycontQuotedCurrencyIsNotNull() {
            addCriterion("drycont_quoted_currency is not null");
            return (Criteria) this;
        }

        public Criteria andDrycontQuotedCurrencyEqualTo(String value) {
            addCriterion("drycont_quoted_currency =", value, "drycontQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontQuotedCurrencyNotEqualTo(String value) {
            addCriterion("drycont_quoted_currency <>", value, "drycontQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontQuotedCurrencyGreaterThan(String value) {
            addCriterion("drycont_quoted_currency >", value, "drycontQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontQuotedCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("drycont_quoted_currency >=", value, "drycontQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontQuotedCurrencyLessThan(String value) {
            addCriterion("drycont_quoted_currency <", value, "drycontQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontQuotedCurrencyLessThanOrEqualTo(String value) {
            addCriterion("drycont_quoted_currency <=", value, "drycontQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontQuotedCurrencyLike(String value) {
            addCriterion("drycont_quoted_currency like", value, "drycontQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontQuotedCurrencyNotLike(String value) {
            addCriterion("drycont_quoted_currency not like", value, "drycontQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontQuotedCurrencyIn(List<String> values) {
            addCriterion("drycont_quoted_currency in", values, "drycontQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontQuotedCurrencyNotIn(List<String> values) {
            addCriterion("drycont_quoted_currency not in", values, "drycontQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontQuotedCurrencyBetween(String value1, String value2) {
            addCriterion("drycont_quoted_currency between", value1, value2, "drycontQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontQuotedCurrencyNotBetween(String value1, String value2) {
            addCriterion("drycont_quoted_currency not between", value1, value2, "drycontQuotedCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontRateCurrencyIsNull() {
            addCriterion("drycont_rate_currency is null");
            return (Criteria) this;
        }

        public Criteria andDrycontRateCurrencyIsNotNull() {
            addCriterion("drycont_rate_currency is not null");
            return (Criteria) this;
        }

        public Criteria andDrycontRateCurrencyEqualTo(String value) {
            addCriterion("drycont_rate_currency =", value, "drycontRateCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontRateCurrencyNotEqualTo(String value) {
            addCriterion("drycont_rate_currency <>", value, "drycontRateCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontRateCurrencyGreaterThan(String value) {
            addCriterion("drycont_rate_currency >", value, "drycontRateCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontRateCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("drycont_rate_currency >=", value, "drycontRateCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontRateCurrencyLessThan(String value) {
            addCriterion("drycont_rate_currency <", value, "drycontRateCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontRateCurrencyLessThanOrEqualTo(String value) {
            addCriterion("drycont_rate_currency <=", value, "drycontRateCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontRateCurrencyLike(String value) {
            addCriterion("drycont_rate_currency like", value, "drycontRateCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontRateCurrencyNotLike(String value) {
            addCriterion("drycont_rate_currency not like", value, "drycontRateCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontRateCurrencyIn(List<String> values) {
            addCriterion("drycont_rate_currency in", values, "drycontRateCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontRateCurrencyNotIn(List<String> values) {
            addCriterion("drycont_rate_currency not in", values, "drycontRateCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontRateCurrencyBetween(String value1, String value2) {
            addCriterion("drycont_rate_currency between", value1, value2, "drycontRateCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontRateCurrencyNotBetween(String value1, String value2) {
            addCriterion("drycont_rate_currency not between", value1, value2, "drycontRateCurrency");
            return (Criteria) this;
        }

        public Criteria andDrycontExchangeRateIsNull() {
            addCriterion("drycont_exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andDrycontExchangeRateIsNotNull() {
            addCriterion("drycont_exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDrycontExchangeRateEqualTo(BigDecimal value) {
            addCriterion("drycont_exchange_rate =", value, "drycontExchangeRate");
            return (Criteria) this;
        }

        public Criteria andDrycontExchangeRateNotEqualTo(BigDecimal value) {
            addCriterion("drycont_exchange_rate <>", value, "drycontExchangeRate");
            return (Criteria) this;
        }

        public Criteria andDrycontExchangeRateGreaterThan(BigDecimal value) {
            addCriterion("drycont_exchange_rate >", value, "drycontExchangeRate");
            return (Criteria) this;
        }

        public Criteria andDrycontExchangeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("drycont_exchange_rate >=", value, "drycontExchangeRate");
            return (Criteria) this;
        }

        public Criteria andDrycontExchangeRateLessThan(BigDecimal value) {
            addCriterion("drycont_exchange_rate <", value, "drycontExchangeRate");
            return (Criteria) this;
        }

        public Criteria andDrycontExchangeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("drycont_exchange_rate <=", value, "drycontExchangeRate");
            return (Criteria) this;
        }

        public Criteria andDrycontExchangeRateIn(List<BigDecimal> values) {
            addCriterion("drycont_exchange_rate in", values, "drycontExchangeRate");
            return (Criteria) this;
        }

        public Criteria andDrycontExchangeRateNotIn(List<BigDecimal> values) {
            addCriterion("drycont_exchange_rate not in", values, "drycontExchangeRate");
            return (Criteria) this;
        }

        public Criteria andDrycontExchangeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drycont_exchange_rate between", value1, value2, "drycontExchangeRate");
            return (Criteria) this;
        }

        public Criteria andDrycontExchangeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drycont_exchange_rate not between", value1, value2, "drycontExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateIsNull() {
            addCriterion("pti_rate is null");
            return (Criteria) this;
        }

        public Criteria andPtiRateIsNotNull() {
            addCriterion("pti_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPtiRateEqualTo(BigDecimal value) {
            addCriterion("pti_rate =", value, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateNotEqualTo(BigDecimal value) {
            addCriterion("pti_rate <>", value, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateGreaterThan(BigDecimal value) {
            addCriterion("pti_rate >", value, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pti_rate >=", value, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateLessThan(BigDecimal value) {
            addCriterion("pti_rate <", value, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pti_rate <=", value, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateIn(List<BigDecimal> values) {
            addCriterion("pti_rate in", values, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateNotIn(List<BigDecimal> values) {
            addCriterion("pti_rate not in", values, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pti_rate between", value1, value2, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andPtiRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pti_rate not between", value1, value2, "ptiRate");
            return (Criteria) this;
        }

        public Criteria andBillDiscountRateIsNull() {
            addCriterion("bill_discount_rate is null");
            return (Criteria) this;
        }

        public Criteria andBillDiscountRateIsNotNull() {
            addCriterion("bill_discount_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBillDiscountRateEqualTo(BigDecimal value) {
            addCriterion("bill_discount_rate =", value, "billDiscountRate");
            return (Criteria) this;
        }

        public Criteria andBillDiscountRateNotEqualTo(BigDecimal value) {
            addCriterion("bill_discount_rate <>", value, "billDiscountRate");
            return (Criteria) this;
        }

        public Criteria andBillDiscountRateGreaterThan(BigDecimal value) {
            addCriterion("bill_discount_rate >", value, "billDiscountRate");
            return (Criteria) this;
        }

        public Criteria andBillDiscountRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bill_discount_rate >=", value, "billDiscountRate");
            return (Criteria) this;
        }

        public Criteria andBillDiscountRateLessThan(BigDecimal value) {
            addCriterion("bill_discount_rate <", value, "billDiscountRate");
            return (Criteria) this;
        }

        public Criteria andBillDiscountRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bill_discount_rate <=", value, "billDiscountRate");
            return (Criteria) this;
        }

        public Criteria andBillDiscountRateIn(List<BigDecimal> values) {
            addCriterion("bill_discount_rate in", values, "billDiscountRate");
            return (Criteria) this;
        }

        public Criteria andBillDiscountRateNotIn(List<BigDecimal> values) {
            addCriterion("bill_discount_rate not in", values, "billDiscountRate");
            return (Criteria) this;
        }

        public Criteria andBillDiscountRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bill_discount_rate between", value1, value2, "billDiscountRate");
            return (Criteria) this;
        }

        public Criteria andBillDiscountRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bill_discount_rate not between", value1, value2, "billDiscountRate");
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