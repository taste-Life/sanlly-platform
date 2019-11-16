package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PoolNewboxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PoolNewboxExample() {
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

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("`month` is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("`month` is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Integer value) {
            addCriterion("`month` =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Integer value) {
            addCriterion("`month` <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Integer value) {
            addCriterion("`month` >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("`month` >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Integer value) {
            addCriterion("`month` <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Integer value) {
            addCriterion("`month` <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Integer> values) {
            addCriterion("`month` in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Integer> values) {
            addCriterion("`month` not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Integer value1, Integer value2) {
            addCriterion("`month` between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("`month` not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andChillerCompanyNameIsNull() {
            addCriterion("chiller_company_name is null");
            return (Criteria) this;
        }

        public Criteria andChillerCompanyNameIsNotNull() {
            addCriterion("chiller_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andChillerCompanyNameEqualTo(String value) {
            addCriterion("chiller_company_name =", value, "chillerCompanyName");
            return (Criteria) this;
        }

        public Criteria andChillerCompanyNameNotEqualTo(String value) {
            addCriterion("chiller_company_name <>", value, "chillerCompanyName");
            return (Criteria) this;
        }

        public Criteria andChillerCompanyNameGreaterThan(String value) {
            addCriterion("chiller_company_name >", value, "chillerCompanyName");
            return (Criteria) this;
        }

        public Criteria andChillerCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("chiller_company_name >=", value, "chillerCompanyName");
            return (Criteria) this;
        }

        public Criteria andChillerCompanyNameLessThan(String value) {
            addCriterion("chiller_company_name <", value, "chillerCompanyName");
            return (Criteria) this;
        }

        public Criteria andChillerCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("chiller_company_name <=", value, "chillerCompanyName");
            return (Criteria) this;
        }

        public Criteria andChillerCompanyNameLike(String value) {
            addCriterion("chiller_company_name like", value, "chillerCompanyName");
            return (Criteria) this;
        }

        public Criteria andChillerCompanyNameNotLike(String value) {
            addCriterion("chiller_company_name not like", value, "chillerCompanyName");
            return (Criteria) this;
        }

        public Criteria andChillerCompanyNameIn(List<String> values) {
            addCriterion("chiller_company_name in", values, "chillerCompanyName");
            return (Criteria) this;
        }

        public Criteria andChillerCompanyNameNotIn(List<String> values) {
            addCriterion("chiller_company_name not in", values, "chillerCompanyName");
            return (Criteria) this;
        }

        public Criteria andChillerCompanyNameBetween(String value1, String value2) {
            addCriterion("chiller_company_name between", value1, value2, "chillerCompanyName");
            return (Criteria) this;
        }

        public Criteria andChillerCompanyNameNotBetween(String value1, String value2) {
            addCriterion("chiller_company_name not between", value1, value2, "chillerCompanyName");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("`count` is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("`count` is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("`count` =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("`count` <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("`count` >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("`count` >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("`count` <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("`count` <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("`count` in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("`count` not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("`count` between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("`count` not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(BigDecimal value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(BigDecimal value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<BigDecimal> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkingHoursIsNull() {
            addCriterion("additional_working_hours is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkingHoursIsNotNull() {
            addCriterion("additional_working_hours is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkingHoursEqualTo(BigDecimal value) {
            addCriterion("additional_working_hours =", value, "additionalWorkingHours");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkingHoursNotEqualTo(BigDecimal value) {
            addCriterion("additional_working_hours <>", value, "additionalWorkingHours");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkingHoursGreaterThan(BigDecimal value) {
            addCriterion("additional_working_hours >", value, "additionalWorkingHours");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkingHoursGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("additional_working_hours >=", value, "additionalWorkingHours");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkingHoursLessThan(BigDecimal value) {
            addCriterion("additional_working_hours <", value, "additionalWorkingHours");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkingHoursLessThanOrEqualTo(BigDecimal value) {
            addCriterion("additional_working_hours <=", value, "additionalWorkingHours");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkingHoursIn(List<BigDecimal> values) {
            addCriterion("additional_working_hours in", values, "additionalWorkingHours");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkingHoursNotIn(List<BigDecimal> values) {
            addCriterion("additional_working_hours not in", values, "additionalWorkingHours");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkingHoursBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("additional_working_hours between", value1, value2, "additionalWorkingHours");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkingHoursNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("additional_working_hours not between", value1, value2, "additionalWorkingHours");
            return (Criteria) this;
        }

        public Criteria andAdditionalChargesIsNull() {
            addCriterion("additional_charges is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalChargesIsNotNull() {
            addCriterion("additional_charges is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalChargesEqualTo(BigDecimal value) {
            addCriterion("additional_charges =", value, "additionalCharges");
            return (Criteria) this;
        }

        public Criteria andAdditionalChargesNotEqualTo(BigDecimal value) {
            addCriterion("additional_charges <>", value, "additionalCharges");
            return (Criteria) this;
        }

        public Criteria andAdditionalChargesGreaterThan(BigDecimal value) {
            addCriterion("additional_charges >", value, "additionalCharges");
            return (Criteria) this;
        }

        public Criteria andAdditionalChargesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("additional_charges >=", value, "additionalCharges");
            return (Criteria) this;
        }

        public Criteria andAdditionalChargesLessThan(BigDecimal value) {
            addCriterion("additional_charges <", value, "additionalCharges");
            return (Criteria) this;
        }

        public Criteria andAdditionalChargesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("additional_charges <=", value, "additionalCharges");
            return (Criteria) this;
        }

        public Criteria andAdditionalChargesIn(List<BigDecimal> values) {
            addCriterion("additional_charges in", values, "additionalCharges");
            return (Criteria) this;
        }

        public Criteria andAdditionalChargesNotIn(List<BigDecimal> values) {
            addCriterion("additional_charges not in", values, "additionalCharges");
            return (Criteria) this;
        }

        public Criteria andAdditionalChargesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("additional_charges between", value1, value2, "additionalCharges");
            return (Criteria) this;
        }

        public Criteria andAdditionalChargesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("additional_charges not between", value1, value2, "additionalCharges");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(BigDecimal value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(BigDecimal value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(BigDecimal value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(BigDecimal value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<BigDecimal> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<BigDecimal> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andTestModemIsNull() {
            addCriterion("test_modem is null");
            return (Criteria) this;
        }

        public Criteria andTestModemIsNotNull() {
            addCriterion("test_modem is not null");
            return (Criteria) this;
        }

        public Criteria andTestModemEqualTo(String value) {
            addCriterion("test_modem =", value, "testModem");
            return (Criteria) this;
        }

        public Criteria andTestModemNotEqualTo(String value) {
            addCriterion("test_modem <>", value, "testModem");
            return (Criteria) this;
        }

        public Criteria andTestModemGreaterThan(String value) {
            addCriterion("test_modem >", value, "testModem");
            return (Criteria) this;
        }

        public Criteria andTestModemGreaterThanOrEqualTo(String value) {
            addCriterion("test_modem >=", value, "testModem");
            return (Criteria) this;
        }

        public Criteria andTestModemLessThan(String value) {
            addCriterion("test_modem <", value, "testModem");
            return (Criteria) this;
        }

        public Criteria andTestModemLessThanOrEqualTo(String value) {
            addCriterion("test_modem <=", value, "testModem");
            return (Criteria) this;
        }

        public Criteria andTestModemLike(String value) {
            addCriterion("test_modem like", value, "testModem");
            return (Criteria) this;
        }

        public Criteria andTestModemNotLike(String value) {
            addCriterion("test_modem not like", value, "testModem");
            return (Criteria) this;
        }

        public Criteria andTestModemIn(List<String> values) {
            addCriterion("test_modem in", values, "testModem");
            return (Criteria) this;
        }

        public Criteria andTestModemNotIn(List<String> values) {
            addCriterion("test_modem not in", values, "testModem");
            return (Criteria) this;
        }

        public Criteria andTestModemBetween(String value1, String value2) {
            addCriterion("test_modem between", value1, value2, "testModem");
            return (Criteria) this;
        }

        public Criteria andTestModemNotBetween(String value1, String value2) {
            addCriterion("test_modem not between", value1, value2, "testModem");
            return (Criteria) this;
        }

        public Criteria andInstallModemIsNull() {
            addCriterion("install_modem is null");
            return (Criteria) this;
        }

        public Criteria andInstallModemIsNotNull() {
            addCriterion("install_modem is not null");
            return (Criteria) this;
        }

        public Criteria andInstallModemEqualTo(String value) {
            addCriterion("install_modem =", value, "installModem");
            return (Criteria) this;
        }

        public Criteria andInstallModemNotEqualTo(String value) {
            addCriterion("install_modem <>", value, "installModem");
            return (Criteria) this;
        }

        public Criteria andInstallModemGreaterThan(String value) {
            addCriterion("install_modem >", value, "installModem");
            return (Criteria) this;
        }

        public Criteria andInstallModemGreaterThanOrEqualTo(String value) {
            addCriterion("install_modem >=", value, "installModem");
            return (Criteria) this;
        }

        public Criteria andInstallModemLessThan(String value) {
            addCriterion("install_modem <", value, "installModem");
            return (Criteria) this;
        }

        public Criteria andInstallModemLessThanOrEqualTo(String value) {
            addCriterion("install_modem <=", value, "installModem");
            return (Criteria) this;
        }

        public Criteria andInstallModemLike(String value) {
            addCriterion("install_modem like", value, "installModem");
            return (Criteria) this;
        }

        public Criteria andInstallModemNotLike(String value) {
            addCriterion("install_modem not like", value, "installModem");
            return (Criteria) this;
        }

        public Criteria andInstallModemIn(List<String> values) {
            addCriterion("install_modem in", values, "installModem");
            return (Criteria) this;
        }

        public Criteria andInstallModemNotIn(List<String> values) {
            addCriterion("install_modem not in", values, "installModem");
            return (Criteria) this;
        }

        public Criteria andInstallModemBetween(String value1, String value2) {
            addCriterion("install_modem between", value1, value2, "installModem");
            return (Criteria) this;
        }

        public Criteria andInstallModemNotBetween(String value1, String value2) {
            addCriterion("install_modem not between", value1, value2, "installModem");
            return (Criteria) this;
        }

        public Criteria andTestGpsIsNull() {
            addCriterion("test_gps is null");
            return (Criteria) this;
        }

        public Criteria andTestGpsIsNotNull() {
            addCriterion("test_gps is not null");
            return (Criteria) this;
        }

        public Criteria andTestGpsEqualTo(String value) {
            addCriterion("test_gps =", value, "testGps");
            return (Criteria) this;
        }

        public Criteria andTestGpsNotEqualTo(String value) {
            addCriterion("test_gps <>", value, "testGps");
            return (Criteria) this;
        }

        public Criteria andTestGpsGreaterThan(String value) {
            addCriterion("test_gps >", value, "testGps");
            return (Criteria) this;
        }

        public Criteria andTestGpsGreaterThanOrEqualTo(String value) {
            addCriterion("test_gps >=", value, "testGps");
            return (Criteria) this;
        }

        public Criteria andTestGpsLessThan(String value) {
            addCriterion("test_gps <", value, "testGps");
            return (Criteria) this;
        }

        public Criteria andTestGpsLessThanOrEqualTo(String value) {
            addCriterion("test_gps <=", value, "testGps");
            return (Criteria) this;
        }

        public Criteria andTestGpsLike(String value) {
            addCriterion("test_gps like", value, "testGps");
            return (Criteria) this;
        }

        public Criteria andTestGpsNotLike(String value) {
            addCriterion("test_gps not like", value, "testGps");
            return (Criteria) this;
        }

        public Criteria andTestGpsIn(List<String> values) {
            addCriterion("test_gps in", values, "testGps");
            return (Criteria) this;
        }

        public Criteria andTestGpsNotIn(List<String> values) {
            addCriterion("test_gps not in", values, "testGps");
            return (Criteria) this;
        }

        public Criteria andTestGpsBetween(String value1, String value2) {
            addCriterion("test_gps between", value1, value2, "testGps");
            return (Criteria) this;
        }

        public Criteria andTestGpsNotBetween(String value1, String value2) {
            addCriterion("test_gps not between", value1, value2, "testGps");
            return (Criteria) this;
        }

        public Criteria andInstallGpsIsNull() {
            addCriterion("install_gps is null");
            return (Criteria) this;
        }

        public Criteria andInstallGpsIsNotNull() {
            addCriterion("install_gps is not null");
            return (Criteria) this;
        }

        public Criteria andInstallGpsEqualTo(String value) {
            addCriterion("install_gps =", value, "installGps");
            return (Criteria) this;
        }

        public Criteria andInstallGpsNotEqualTo(String value) {
            addCriterion("install_gps <>", value, "installGps");
            return (Criteria) this;
        }

        public Criteria andInstallGpsGreaterThan(String value) {
            addCriterion("install_gps >", value, "installGps");
            return (Criteria) this;
        }

        public Criteria andInstallGpsGreaterThanOrEqualTo(String value) {
            addCriterion("install_gps >=", value, "installGps");
            return (Criteria) this;
        }

        public Criteria andInstallGpsLessThan(String value) {
            addCriterion("install_gps <", value, "installGps");
            return (Criteria) this;
        }

        public Criteria andInstallGpsLessThanOrEqualTo(String value) {
            addCriterion("install_gps <=", value, "installGps");
            return (Criteria) this;
        }

        public Criteria andInstallGpsLike(String value) {
            addCriterion("install_gps like", value, "installGps");
            return (Criteria) this;
        }

        public Criteria andInstallGpsNotLike(String value) {
            addCriterion("install_gps not like", value, "installGps");
            return (Criteria) this;
        }

        public Criteria andInstallGpsIn(List<String> values) {
            addCriterion("install_gps in", values, "installGps");
            return (Criteria) this;
        }

        public Criteria andInstallGpsNotIn(List<String> values) {
            addCriterion("install_gps not in", values, "installGps");
            return (Criteria) this;
        }

        public Criteria andInstallGpsBetween(String value1, String value2) {
            addCriterion("install_gps between", value1, value2, "installGps");
            return (Criteria) this;
        }

        public Criteria andInstallGpsNotBetween(String value1, String value2) {
            addCriterion("install_gps not between", value1, value2, "installGps");
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

        public Criteria andBillDateIsNull() {
            addCriterion("bill_date is null");
            return (Criteria) this;
        }

        public Criteria andBillDateIsNotNull() {
            addCriterion("bill_date is not null");
            return (Criteria) this;
        }

        public Criteria andBillDateEqualTo(Date value) {
            addCriterion("bill_date =", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotEqualTo(Date value) {
            addCriterion("bill_date <>", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateGreaterThan(Date value) {
            addCriterion("bill_date >", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateGreaterThanOrEqualTo(Date value) {
            addCriterion("bill_date >=", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLessThan(Date value) {
            addCriterion("bill_date <", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLessThanOrEqualTo(Date value) {
            addCriterion("bill_date <=", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateIn(List<Date> values) {
            addCriterion("bill_date in", values, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotIn(List<Date> values) {
            addCriterion("bill_date not in", values, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateBetween(Date value1, Date value2) {
            addCriterion("bill_date between", value1, value2, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotBetween(Date value1, Date value2) {
            addCriterion("bill_date not between", value1, value2, "billDate");
            return (Criteria) this;
        }

        public Criteria andIsFinishedIsNull() {
            addCriterion("is_finished is null");
            return (Criteria) this;
        }

        public Criteria andIsFinishedIsNotNull() {
            addCriterion("is_finished is not null");
            return (Criteria) this;
        }

        public Criteria andIsFinishedEqualTo(Integer value) {
            addCriterion("is_finished =", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedNotEqualTo(Integer value) {
            addCriterion("is_finished <>", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedGreaterThan(Integer value) {
            addCriterion("is_finished >", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_finished >=", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedLessThan(Integer value) {
            addCriterion("is_finished <", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedLessThanOrEqualTo(Integer value) {
            addCriterion("is_finished <=", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedIn(List<Integer> values) {
            addCriterion("is_finished in", values, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedNotIn(List<Integer> values) {
            addCriterion("is_finished not in", values, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedBetween(Integer value1, Integer value2) {
            addCriterion("is_finished between", value1, value2, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_finished not between", value1, value2, "isFinished");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(BigDecimal value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(BigDecimal value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<BigDecimal> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
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

        public Criteria andNoCostDescIsNull() {
            addCriterion("no_cost_desc is null");
            return (Criteria) this;
        }

        public Criteria andNoCostDescIsNotNull() {
            addCriterion("no_cost_desc is not null");
            return (Criteria) this;
        }

        public Criteria andNoCostDescEqualTo(String value) {
            addCriterion("no_cost_desc =", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescNotEqualTo(String value) {
            addCriterion("no_cost_desc <>", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescGreaterThan(String value) {
            addCriterion("no_cost_desc >", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescGreaterThanOrEqualTo(String value) {
            addCriterion("no_cost_desc >=", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescLessThan(String value) {
            addCriterion("no_cost_desc <", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescLessThanOrEqualTo(String value) {
            addCriterion("no_cost_desc <=", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescLike(String value) {
            addCriterion("no_cost_desc like", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescNotLike(String value) {
            addCriterion("no_cost_desc not like", value, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescIn(List<String> values) {
            addCriterion("no_cost_desc in", values, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescNotIn(List<String> values) {
            addCriterion("no_cost_desc not in", values, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescBetween(String value1, String value2) {
            addCriterion("no_cost_desc between", value1, value2, "noCostDesc");
            return (Criteria) this;
        }

        public Criteria andNoCostDescNotBetween(String value1, String value2) {
            addCriterion("no_cost_desc not between", value1, value2, "noCostDesc");
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

        public Criteria andItemStatusIsNull() {
            addCriterion("item_status is null");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNotNull() {
            addCriterion("item_status is not null");
            return (Criteria) this;
        }

        public Criteria andItemStatusEqualTo(Integer value) {
            addCriterion("item_status =", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotEqualTo(Integer value) {
            addCriterion("item_status <>", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThan(Integer value) {
            addCriterion("item_status >", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_status >=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThan(Integer value) {
            addCriterion("item_status <", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThanOrEqualTo(Integer value) {
            addCriterion("item_status <=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusIn(List<Integer> values) {
            addCriterion("item_status in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotIn(List<Integer> values) {
            addCriterion("item_status not in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusBetween(Integer value1, Integer value2) {
            addCriterion("item_status between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("item_status not between", value1, value2, "itemStatus");
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