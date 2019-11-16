package com.sanlly.purchase.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public SupplierExample() {
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

        public Criteria andPurcSupplierIdIsNull() {
            addCriterion("purc_supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andPurcSupplierIdIsNotNull() {
            addCriterion("purc_supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurcSupplierIdEqualTo(Integer value) {
            addCriterion("purc_supplier_id =", value, "purcSupplierId");
            return (Criteria) this;
        }

        public Criteria andPurcSupplierIdNotEqualTo(Integer value) {
            addCriterion("purc_supplier_id <>", value, "purcSupplierId");
            return (Criteria) this;
        }

        public Criteria andPurcSupplierIdGreaterThan(Integer value) {
            addCriterion("purc_supplier_id >", value, "purcSupplierId");
            return (Criteria) this;
        }

        public Criteria andPurcSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purc_supplier_id >=", value, "purcSupplierId");
            return (Criteria) this;
        }

        public Criteria andPurcSupplierIdLessThan(Integer value) {
            addCriterion("purc_supplier_id <", value, "purcSupplierId");
            return (Criteria) this;
        }

        public Criteria andPurcSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("purc_supplier_id <=", value, "purcSupplierId");
            return (Criteria) this;
        }

        public Criteria andPurcSupplierIdIn(List<Integer> values) {
            addCriterion("purc_supplier_id in", values, "purcSupplierId");
            return (Criteria) this;
        }

        public Criteria andPurcSupplierIdNotIn(List<Integer> values) {
            addCriterion("purc_supplier_id not in", values, "purcSupplierId");
            return (Criteria) this;
        }

        public Criteria andPurcSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("purc_supplier_id between", value1, value2, "purcSupplierId");
            return (Criteria) this;
        }

        public Criteria andPurcSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purc_supplier_id not between", value1, value2, "purcSupplierId");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumIsNull() {
            addCriterion("mobile_phone_num is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumIsNotNull() {
            addCriterion("mobile_phone_num is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumEqualTo(String value) {
            addCriterion("mobile_phone_num =", value, "mobilePhoneNum");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumNotEqualTo(String value) {
            addCriterion("mobile_phone_num <>", value, "mobilePhoneNum");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumGreaterThan(String value) {
            addCriterion("mobile_phone_num >", value, "mobilePhoneNum");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_phone_num >=", value, "mobilePhoneNum");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumLessThan(String value) {
            addCriterion("mobile_phone_num <", value, "mobilePhoneNum");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumLessThanOrEqualTo(String value) {
            addCriterion("mobile_phone_num <=", value, "mobilePhoneNum");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumLike(String value) {
            addCriterion("mobile_phone_num like", value, "mobilePhoneNum");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumNotLike(String value) {
            addCriterion("mobile_phone_num not like", value, "mobilePhoneNum");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumIn(List<String> values) {
            addCriterion("mobile_phone_num in", values, "mobilePhoneNum");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumNotIn(List<String> values) {
            addCriterion("mobile_phone_num not in", values, "mobilePhoneNum");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumBetween(String value1, String value2) {
            addCriterion("mobile_phone_num between", value1, value2, "mobilePhoneNum");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNumNotBetween(String value1, String value2) {
            addCriterion("mobile_phone_num not between", value1, value2, "mobilePhoneNum");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNull() {
            addCriterion("name_en is null");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNotNull() {
            addCriterion("name_en is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnEqualTo(String value) {
            addCriterion("name_en =", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotEqualTo(String value) {
            addCriterion("name_en <>", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThan(String value) {
            addCriterion("name_en >", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("name_en >=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThan(String value) {
            addCriterion("name_en <", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanOrEqualTo(String value) {
            addCriterion("name_en <=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLike(String value) {
            addCriterion("name_en like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotLike(String value) {
            addCriterion("name_en not like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnIn(List<String> values) {
            addCriterion("name_en in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotIn(List<String> values) {
            addCriterion("name_en not in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnBetween(String value1, String value2) {
            addCriterion("name_en between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotBetween(String value1, String value2) {
            addCriterion("name_en not between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIsNull() {
            addCriterion("credit_code is null");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIsNotNull() {
            addCriterion("credit_code is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCodeEqualTo(String value) {
            addCriterion("credit_code =", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotEqualTo(String value) {
            addCriterion("credit_code <>", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeGreaterThan(String value) {
            addCriterion("credit_code >", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeGreaterThanOrEqualTo(String value) {
            addCriterion("credit_code >=", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLessThan(String value) {
            addCriterion("credit_code <", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLessThanOrEqualTo(String value) {
            addCriterion("credit_code <=", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLike(String value) {
            addCriterion("credit_code like", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotLike(String value) {
            addCriterion("credit_code not like", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIn(List<String> values) {
            addCriterion("credit_code in", values, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotIn(List<String> values) {
            addCriterion("credit_code not in", values, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeBetween(String value1, String value2) {
            addCriterion("credit_code between", value1, value2, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotBetween(String value1, String value2) {
            addCriterion("credit_code not between", value1, value2, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andRegAddressIsNull() {
            addCriterion("reg_address is null");
            return (Criteria) this;
        }

        public Criteria andRegAddressIsNotNull() {
            addCriterion("reg_address is not null");
            return (Criteria) this;
        }

        public Criteria andRegAddressEqualTo(String value) {
            addCriterion("reg_address =", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressNotEqualTo(String value) {
            addCriterion("reg_address <>", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressGreaterThan(String value) {
            addCriterion("reg_address >", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressGreaterThanOrEqualTo(String value) {
            addCriterion("reg_address >=", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressLessThan(String value) {
            addCriterion("reg_address <", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressLessThanOrEqualTo(String value) {
            addCriterion("reg_address <=", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressLike(String value) {
            addCriterion("reg_address like", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressNotLike(String value) {
            addCriterion("reg_address not like", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressIn(List<String> values) {
            addCriterion("reg_address in", values, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressNotIn(List<String> values) {
            addCriterion("reg_address not in", values, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressBetween(String value1, String value2) {
            addCriterion("reg_address between", value1, value2, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressNotBetween(String value1, String value2) {
            addCriterion("reg_address not between", value1, value2, "regAddress");
            return (Criteria) this;
        }

        public Criteria andBusniessAddressIsNull() {
            addCriterion("busniess_address is null");
            return (Criteria) this;
        }

        public Criteria andBusniessAddressIsNotNull() {
            addCriterion("busniess_address is not null");
            return (Criteria) this;
        }

        public Criteria andBusniessAddressEqualTo(String value) {
            addCriterion("busniess_address =", value, "busniessAddress");
            return (Criteria) this;
        }

        public Criteria andBusniessAddressNotEqualTo(String value) {
            addCriterion("busniess_address <>", value, "busniessAddress");
            return (Criteria) this;
        }

        public Criteria andBusniessAddressGreaterThan(String value) {
            addCriterion("busniess_address >", value, "busniessAddress");
            return (Criteria) this;
        }

        public Criteria andBusniessAddressGreaterThanOrEqualTo(String value) {
            addCriterion("busniess_address >=", value, "busniessAddress");
            return (Criteria) this;
        }

        public Criteria andBusniessAddressLessThan(String value) {
            addCriterion("busniess_address <", value, "busniessAddress");
            return (Criteria) this;
        }

        public Criteria andBusniessAddressLessThanOrEqualTo(String value) {
            addCriterion("busniess_address <=", value, "busniessAddress");
            return (Criteria) this;
        }

        public Criteria andBusniessAddressLike(String value) {
            addCriterion("busniess_address like", value, "busniessAddress");
            return (Criteria) this;
        }

        public Criteria andBusniessAddressNotLike(String value) {
            addCriterion("busniess_address not like", value, "busniessAddress");
            return (Criteria) this;
        }

        public Criteria andBusniessAddressIn(List<String> values) {
            addCriterion("busniess_address in", values, "busniessAddress");
            return (Criteria) this;
        }

        public Criteria andBusniessAddressNotIn(List<String> values) {
            addCriterion("busniess_address not in", values, "busniessAddress");
            return (Criteria) this;
        }

        public Criteria andBusniessAddressBetween(String value1, String value2) {
            addCriterion("busniess_address between", value1, value2, "busniessAddress");
            return (Criteria) this;
        }

        public Criteria andBusniessAddressNotBetween(String value1, String value2) {
            addCriterion("busniess_address not between", value1, value2, "busniessAddress");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("legal_person is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("legal_person is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("legal_person =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("legal_person <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("legal_person >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("legal_person <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("legal_person <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("legal_person like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("legal_person not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("legal_person in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("legal_person not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("legal_person between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("legal_person not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andServicesContentIsNull() {
            addCriterion("services_content is null");
            return (Criteria) this;
        }

        public Criteria andServicesContentIsNotNull() {
            addCriterion("services_content is not null");
            return (Criteria) this;
        }

        public Criteria andServicesContentEqualTo(String value) {
            addCriterion("services_content =", value, "servicesContent");
            return (Criteria) this;
        }

        public Criteria andServicesContentNotEqualTo(String value) {
            addCriterion("services_content <>", value, "servicesContent");
            return (Criteria) this;
        }

        public Criteria andServicesContentGreaterThan(String value) {
            addCriterion("services_content >", value, "servicesContent");
            return (Criteria) this;
        }

        public Criteria andServicesContentGreaterThanOrEqualTo(String value) {
            addCriterion("services_content >=", value, "servicesContent");
            return (Criteria) this;
        }

        public Criteria andServicesContentLessThan(String value) {
            addCriterion("services_content <", value, "servicesContent");
            return (Criteria) this;
        }

        public Criteria andServicesContentLessThanOrEqualTo(String value) {
            addCriterion("services_content <=", value, "servicesContent");
            return (Criteria) this;
        }

        public Criteria andServicesContentLike(String value) {
            addCriterion("services_content like", value, "servicesContent");
            return (Criteria) this;
        }

        public Criteria andServicesContentNotLike(String value) {
            addCriterion("services_content not like", value, "servicesContent");
            return (Criteria) this;
        }

        public Criteria andServicesContentIn(List<String> values) {
            addCriterion("services_content in", values, "servicesContent");
            return (Criteria) this;
        }

        public Criteria andServicesContentNotIn(List<String> values) {
            addCriterion("services_content not in", values, "servicesContent");
            return (Criteria) this;
        }

        public Criteria andServicesContentBetween(String value1, String value2) {
            addCriterion("services_content between", value1, value2, "servicesContent");
            return (Criteria) this;
        }

        public Criteria andServicesContentNotBetween(String value1, String value2) {
            addCriterion("services_content not between", value1, value2, "servicesContent");
            return (Criteria) this;
        }

        public Criteria andNatureIdIsNull() {
            addCriterion("nature_id is null");
            return (Criteria) this;
        }

        public Criteria andNatureIdIsNotNull() {
            addCriterion("nature_id is not null");
            return (Criteria) this;
        }

        public Criteria andNatureIdEqualTo(String value) {
            addCriterion("nature_id =", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdNotEqualTo(String value) {
            addCriterion("nature_id <>", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdGreaterThan(String value) {
            addCriterion("nature_id >", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdGreaterThanOrEqualTo(String value) {
            addCriterion("nature_id >=", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdLessThan(String value) {
            addCriterion("nature_id <", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdLessThanOrEqualTo(String value) {
            addCriterion("nature_id <=", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdLike(String value) {
            addCriterion("nature_id like", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdNotLike(String value) {
            addCriterion("nature_id not like", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdIn(List<String> values) {
            addCriterion("nature_id in", values, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdNotIn(List<String> values) {
            addCriterion("nature_id not in", values, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdBetween(String value1, String value2) {
            addCriterion("nature_id between", value1, value2, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdNotBetween(String value1, String value2) {
            addCriterion("nature_id not between", value1, value2, "natureId");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundsIsNull() {
            addCriterion("registered_funds is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundsIsNotNull() {
            addCriterion("registered_funds is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundsEqualTo(String value) {
            addCriterion("registered_funds =", value, "registeredFunds");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundsNotEqualTo(String value) {
            addCriterion("registered_funds <>", value, "registeredFunds");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundsGreaterThan(String value) {
            addCriterion("registered_funds >", value, "registeredFunds");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundsGreaterThanOrEqualTo(String value) {
            addCriterion("registered_funds >=", value, "registeredFunds");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundsLessThan(String value) {
            addCriterion("registered_funds <", value, "registeredFunds");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundsLessThanOrEqualTo(String value) {
            addCriterion("registered_funds <=", value, "registeredFunds");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundsLike(String value) {
            addCriterion("registered_funds like", value, "registeredFunds");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundsNotLike(String value) {
            addCriterion("registered_funds not like", value, "registeredFunds");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundsIn(List<String> values) {
            addCriterion("registered_funds in", values, "registeredFunds");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundsNotIn(List<String> values) {
            addCriterion("registered_funds not in", values, "registeredFunds");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundsBetween(String value1, String value2) {
            addCriterion("registered_funds between", value1, value2, "registeredFunds");
            return (Criteria) this;
        }

        public Criteria andRegisteredFundsNotBetween(String value1, String value2) {
            addCriterion("registered_funds not between", value1, value2, "registeredFunds");
            return (Criteria) this;
        }

        public Criteria andFoundDateIsNull() {
            addCriterion("found_date is null");
            return (Criteria) this;
        }

        public Criteria andFoundDateIsNotNull() {
            addCriterion("found_date is not null");
            return (Criteria) this;
        }

        public Criteria andFoundDateEqualTo(Date value) {
            addCriterion("found_date =", value, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateNotEqualTo(Date value) {
            addCriterion("found_date <>", value, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateGreaterThan(Date value) {
            addCriterion("found_date >", value, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateGreaterThanOrEqualTo(Date value) {
            addCriterion("found_date >=", value, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateLessThan(Date value) {
            addCriterion("found_date <", value, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateLessThanOrEqualTo(Date value) {
            addCriterion("found_date <=", value, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateIn(List<Date> values) {
            addCriterion("found_date in", values, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateNotIn(List<Date> values) {
            addCriterion("found_date not in", values, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateBetween(Date value1, Date value2) {
            addCriterion("found_date between", value1, value2, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateNotBetween(Date value1, Date value2) {
            addCriterion("found_date not between", value1, value2, "foundDate");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleIsNull() {
            addCriterion("settlement_cycle is null");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleIsNotNull() {
            addCriterion("settlement_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleEqualTo(String value) {
            addCriterion("settlement_cycle =", value, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleNotEqualTo(String value) {
            addCriterion("settlement_cycle <>", value, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleGreaterThan(String value) {
            addCriterion("settlement_cycle >", value, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_cycle >=", value, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleLessThan(String value) {
            addCriterion("settlement_cycle <", value, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleLessThanOrEqualTo(String value) {
            addCriterion("settlement_cycle <=", value, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleLike(String value) {
            addCriterion("settlement_cycle like", value, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleNotLike(String value) {
            addCriterion("settlement_cycle not like", value, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleIn(List<String> values) {
            addCriterion("settlement_cycle in", values, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleNotIn(List<String> values) {
            addCriterion("settlement_cycle not in", values, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleBetween(String value1, String value2) {
            addCriterion("settlement_cycle between", value1, value2, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleNotBetween(String value1, String value2) {
            addCriterion("settlement_cycle not between", value1, value2, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andVendorCodeIsNull() {
            addCriterion("vendor_code is null");
            return (Criteria) this;
        }

        public Criteria andVendorCodeIsNotNull() {
            addCriterion("vendor_code is not null");
            return (Criteria) this;
        }

        public Criteria andVendorCodeEqualTo(String value) {
            addCriterion("vendor_code =", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeNotEqualTo(String value) {
            addCriterion("vendor_code <>", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeGreaterThan(String value) {
            addCriterion("vendor_code >", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("vendor_code >=", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeLessThan(String value) {
            addCriterion("vendor_code <", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeLessThanOrEqualTo(String value) {
            addCriterion("vendor_code <=", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeLike(String value) {
            addCriterion("vendor_code like", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeNotLike(String value) {
            addCriterion("vendor_code not like", value, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeIn(List<String> values) {
            addCriterion("vendor_code in", values, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeNotIn(List<String> values) {
            addCriterion("vendor_code not in", values, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeBetween(String value1, String value2) {
            addCriterion("vendor_code between", value1, value2, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andVendorCodeNotBetween(String value1, String value2) {
            addCriterion("vendor_code not between", value1, value2, "vendorCode");
            return (Criteria) this;
        }

        public Criteria andSapIdIsNull() {
            addCriterion("sap_id is null");
            return (Criteria) this;
        }

        public Criteria andSapIdIsNotNull() {
            addCriterion("sap_id is not null");
            return (Criteria) this;
        }

        public Criteria andSapIdEqualTo(String value) {
            addCriterion("sap_id =", value, "sapId");
            return (Criteria) this;
        }

        public Criteria andSapIdNotEqualTo(String value) {
            addCriterion("sap_id <>", value, "sapId");
            return (Criteria) this;
        }

        public Criteria andSapIdGreaterThan(String value) {
            addCriterion("sap_id >", value, "sapId");
            return (Criteria) this;
        }

        public Criteria andSapIdGreaterThanOrEqualTo(String value) {
            addCriterion("sap_id >=", value, "sapId");
            return (Criteria) this;
        }

        public Criteria andSapIdLessThan(String value) {
            addCriterion("sap_id <", value, "sapId");
            return (Criteria) this;
        }

        public Criteria andSapIdLessThanOrEqualTo(String value) {
            addCriterion("sap_id <=", value, "sapId");
            return (Criteria) this;
        }

        public Criteria andSapIdLike(String value) {
            addCriterion("sap_id like", value, "sapId");
            return (Criteria) this;
        }

        public Criteria andSapIdNotLike(String value) {
            addCriterion("sap_id not like", value, "sapId");
            return (Criteria) this;
        }

        public Criteria andSapIdIn(List<String> values) {
            addCriterion("sap_id in", values, "sapId");
            return (Criteria) this;
        }

        public Criteria andSapIdNotIn(List<String> values) {
            addCriterion("sap_id not in", values, "sapId");
            return (Criteria) this;
        }

        public Criteria andSapIdBetween(String value1, String value2) {
            addCriterion("sap_id between", value1, value2, "sapId");
            return (Criteria) this;
        }

        public Criteria andSapIdNotBetween(String value1, String value2) {
            addCriterion("sap_id not between", value1, value2, "sapId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNull() {
            addCriterion("process_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("process_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(String value) {
            addCriterion("process_id =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(String value) {
            addCriterion("process_id <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(String value) {
            addCriterion("process_id >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(String value) {
            addCriterion("process_id >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(String value) {
            addCriterion("process_id <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(String value) {
            addCriterion("process_id <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLike(String value) {
            addCriterion("process_id like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotLike(String value) {
            addCriterion("process_id not like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<String> values) {
            addCriterion("process_id in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<String> values) {
            addCriterion("process_id not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(String value1, String value2) {
            addCriterion("process_id between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(String value1, String value2) {
            addCriterion("process_id not between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andPeriodSupplierIsNull() {
            addCriterion("period_supplier is null");
            return (Criteria) this;
        }

        public Criteria andPeriodSupplierIsNotNull() {
            addCriterion("period_supplier is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodSupplierEqualTo(String value) {
            addCriterion("period_supplier =", value, "periodSupplier");
            return (Criteria) this;
        }

        public Criteria andPeriodSupplierNotEqualTo(String value) {
            addCriterion("period_supplier <>", value, "periodSupplier");
            return (Criteria) this;
        }

        public Criteria andPeriodSupplierGreaterThan(String value) {
            addCriterion("period_supplier >", value, "periodSupplier");
            return (Criteria) this;
        }

        public Criteria andPeriodSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("period_supplier >=", value, "periodSupplier");
            return (Criteria) this;
        }

        public Criteria andPeriodSupplierLessThan(String value) {
            addCriterion("period_supplier <", value, "periodSupplier");
            return (Criteria) this;
        }

        public Criteria andPeriodSupplierLessThanOrEqualTo(String value) {
            addCriterion("period_supplier <=", value, "periodSupplier");
            return (Criteria) this;
        }

        public Criteria andPeriodSupplierLike(String value) {
            addCriterion("period_supplier like", value, "periodSupplier");
            return (Criteria) this;
        }

        public Criteria andPeriodSupplierNotLike(String value) {
            addCriterion("period_supplier not like", value, "periodSupplier");
            return (Criteria) this;
        }

        public Criteria andPeriodSupplierIn(List<String> values) {
            addCriterion("period_supplier in", values, "periodSupplier");
            return (Criteria) this;
        }

        public Criteria andPeriodSupplierNotIn(List<String> values) {
            addCriterion("period_supplier not in", values, "periodSupplier");
            return (Criteria) this;
        }

        public Criteria andPeriodSupplierBetween(String value1, String value2) {
            addCriterion("period_supplier between", value1, value2, "periodSupplier");
            return (Criteria) this;
        }

        public Criteria andPeriodSupplierNotBetween(String value1, String value2) {
            addCriterion("period_supplier not between", value1, value2, "periodSupplier");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIsNull() {
            addCriterion("settlement_type is null");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIsNotNull() {
            addCriterion("settlement_type is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeEqualTo(String value) {
            addCriterion("settlement_type =", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotEqualTo(String value) {
            addCriterion("settlement_type <>", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeGreaterThan(String value) {
            addCriterion("settlement_type >", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_type >=", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLessThan(String value) {
            addCriterion("settlement_type <", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLessThanOrEqualTo(String value) {
            addCriterion("settlement_type <=", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLike(String value) {
            addCriterion("settlement_type like", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotLike(String value) {
            addCriterion("settlement_type not like", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIn(List<String> values) {
            addCriterion("settlement_type in", values, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotIn(List<String> values) {
            addCriterion("settlement_type not in", values, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeBetween(String value1, String value2) {
            addCriterion("settlement_type between", value1, value2, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotBetween(String value1, String value2) {
            addCriterion("settlement_type not between", value1, value2, "settlementType");
            return (Criteria) this;
        }

        public Criteria andIsBlackIsNull() {
            addCriterion("is_black is null");
            return (Criteria) this;
        }

        public Criteria andIsBlackIsNotNull() {
            addCriterion("is_black is not null");
            return (Criteria) this;
        }

        public Criteria andIsBlackEqualTo(String value) {
            addCriterion("is_black =", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackNotEqualTo(String value) {
            addCriterion("is_black <>", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackGreaterThan(String value) {
            addCriterion("is_black >", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackGreaterThanOrEqualTo(String value) {
            addCriterion("is_black >=", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackLessThan(String value) {
            addCriterion("is_black <", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackLessThanOrEqualTo(String value) {
            addCriterion("is_black <=", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackLike(String value) {
            addCriterion("is_black like", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackNotLike(String value) {
            addCriterion("is_black not like", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackIn(List<String> values) {
            addCriterion("is_black in", values, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackNotIn(List<String> values) {
            addCriterion("is_black not in", values, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackBetween(String value1, String value2) {
            addCriterion("is_black between", value1, value2, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackNotBetween(String value1, String value2) {
            addCriterion("is_black not between", value1, value2, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIsNull() {
            addCriterion("is_special is null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIsNotNull() {
            addCriterion("is_special is not null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialEqualTo(String value) {
            addCriterion("is_special =", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotEqualTo(String value) {
            addCriterion("is_special <>", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGreaterThan(String value) {
            addCriterion("is_special >", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGreaterThanOrEqualTo(String value) {
            addCriterion("is_special >=", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialLessThan(String value) {
            addCriterion("is_special <", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialLessThanOrEqualTo(String value) {
            addCriterion("is_special <=", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialLike(String value) {
            addCriterion("is_special like", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotLike(String value) {
            addCriterion("is_special not like", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIn(List<String> values) {
            addCriterion("is_special in", values, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotIn(List<String> values) {
            addCriterion("is_special not in", values, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialBetween(String value1, String value2) {
            addCriterion("is_special between", value1, value2, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotBetween(String value1, String value2) {
            addCriterion("is_special not between", value1, value2, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andProcureTypeIsNull() {
            addCriterion("procure_type is null");
            return (Criteria) this;
        }

        public Criteria andProcureTypeIsNotNull() {
            addCriterion("procure_type is not null");
            return (Criteria) this;
        }

        public Criteria andProcureTypeEqualTo(String value) {
            addCriterion("procure_type =", value, "procureType");
            return (Criteria) this;
        }

        public Criteria andProcureTypeNotEqualTo(String value) {
            addCriterion("procure_type <>", value, "procureType");
            return (Criteria) this;
        }

        public Criteria andProcureTypeGreaterThan(String value) {
            addCriterion("procure_type >", value, "procureType");
            return (Criteria) this;
        }

        public Criteria andProcureTypeGreaterThanOrEqualTo(String value) {
            addCriterion("procure_type >=", value, "procureType");
            return (Criteria) this;
        }

        public Criteria andProcureTypeLessThan(String value) {
            addCriterion("procure_type <", value, "procureType");
            return (Criteria) this;
        }

        public Criteria andProcureTypeLessThanOrEqualTo(String value) {
            addCriterion("procure_type <=", value, "procureType");
            return (Criteria) this;
        }

        public Criteria andProcureTypeLike(String value) {
            addCriterion("procure_type like", value, "procureType");
            return (Criteria) this;
        }

        public Criteria andProcureTypeNotLike(String value) {
            addCriterion("procure_type not like", value, "procureType");
            return (Criteria) this;
        }

        public Criteria andProcureTypeIn(List<String> values) {
            addCriterion("procure_type in", values, "procureType");
            return (Criteria) this;
        }

        public Criteria andProcureTypeNotIn(List<String> values) {
            addCriterion("procure_type not in", values, "procureType");
            return (Criteria) this;
        }

        public Criteria andProcureTypeBetween(String value1, String value2) {
            addCriterion("procure_type between", value1, value2, "procureType");
            return (Criteria) this;
        }

        public Criteria andProcureTypeNotBetween(String value1, String value2) {
            addCriterion("procure_type not between", value1, value2, "procureType");
            return (Criteria) this;
        }

        public Criteria andRegistrationMethodIsNull() {
            addCriterion("registration_method is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationMethodIsNotNull() {
            addCriterion("registration_method is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationMethodEqualTo(String value) {
            addCriterion("registration_method =", value, "registrationMethod");
            return (Criteria) this;
        }

        public Criteria andRegistrationMethodNotEqualTo(String value) {
            addCriterion("registration_method <>", value, "registrationMethod");
            return (Criteria) this;
        }

        public Criteria andRegistrationMethodGreaterThan(String value) {
            addCriterion("registration_method >", value, "registrationMethod");
            return (Criteria) this;
        }

        public Criteria andRegistrationMethodGreaterThanOrEqualTo(String value) {
            addCriterion("registration_method >=", value, "registrationMethod");
            return (Criteria) this;
        }

        public Criteria andRegistrationMethodLessThan(String value) {
            addCriterion("registration_method <", value, "registrationMethod");
            return (Criteria) this;
        }

        public Criteria andRegistrationMethodLessThanOrEqualTo(String value) {
            addCriterion("registration_method <=", value, "registrationMethod");
            return (Criteria) this;
        }

        public Criteria andRegistrationMethodLike(String value) {
            addCriterion("registration_method like", value, "registrationMethod");
            return (Criteria) this;
        }

        public Criteria andRegistrationMethodNotLike(String value) {
            addCriterion("registration_method not like", value, "registrationMethod");
            return (Criteria) this;
        }

        public Criteria andRegistrationMethodIn(List<String> values) {
            addCriterion("registration_method in", values, "registrationMethod");
            return (Criteria) this;
        }

        public Criteria andRegistrationMethodNotIn(List<String> values) {
            addCriterion("registration_method not in", values, "registrationMethod");
            return (Criteria) this;
        }

        public Criteria andRegistrationMethodBetween(String value1, String value2) {
            addCriterion("registration_method between", value1, value2, "registrationMethod");
            return (Criteria) this;
        }

        public Criteria andRegistrationMethodNotBetween(String value1, String value2) {
            addCriterion("registration_method not between", value1, value2, "registrationMethod");
            return (Criteria) this;
        }

        public Criteria andStorehouseTypeIsNull() {
            addCriterion("storehouse_type is null");
            return (Criteria) this;
        }

        public Criteria andStorehouseTypeIsNotNull() {
            addCriterion("storehouse_type is not null");
            return (Criteria) this;
        }

        public Criteria andStorehouseTypeEqualTo(String value) {
            addCriterion("storehouse_type =", value, "storehouseType");
            return (Criteria) this;
        }

        public Criteria andStorehouseTypeNotEqualTo(String value) {
            addCriterion("storehouse_type <>", value, "storehouseType");
            return (Criteria) this;
        }

        public Criteria andStorehouseTypeGreaterThan(String value) {
            addCriterion("storehouse_type >", value, "storehouseType");
            return (Criteria) this;
        }

        public Criteria andStorehouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("storehouse_type >=", value, "storehouseType");
            return (Criteria) this;
        }

        public Criteria andStorehouseTypeLessThan(String value) {
            addCriterion("storehouse_type <", value, "storehouseType");
            return (Criteria) this;
        }

        public Criteria andStorehouseTypeLessThanOrEqualTo(String value) {
            addCriterion("storehouse_type <=", value, "storehouseType");
            return (Criteria) this;
        }

        public Criteria andStorehouseTypeLike(String value) {
            addCriterion("storehouse_type like", value, "storehouseType");
            return (Criteria) this;
        }

        public Criteria andStorehouseTypeNotLike(String value) {
            addCriterion("storehouse_type not like", value, "storehouseType");
            return (Criteria) this;
        }

        public Criteria andStorehouseTypeIn(List<String> values) {
            addCriterion("storehouse_type in", values, "storehouseType");
            return (Criteria) this;
        }

        public Criteria andStorehouseTypeNotIn(List<String> values) {
            addCriterion("storehouse_type not in", values, "storehouseType");
            return (Criteria) this;
        }

        public Criteria andStorehouseTypeBetween(String value1, String value2) {
            addCriterion("storehouse_type between", value1, value2, "storehouseType");
            return (Criteria) this;
        }

        public Criteria andStorehouseTypeNotBetween(String value1, String value2) {
            addCriterion("storehouse_type not between", value1, value2, "storehouseType");
            return (Criteria) this;
        }

        public Criteria andIsSingleSupplierIsNull() {
            addCriterion("is_single_supplier is null");
            return (Criteria) this;
        }

        public Criteria andIsSingleSupplierIsNotNull() {
            addCriterion("is_single_supplier is not null");
            return (Criteria) this;
        }

        public Criteria andIsSingleSupplierEqualTo(String value) {
            addCriterion("is_single_supplier =", value, "isSingleSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSingleSupplierNotEqualTo(String value) {
            addCriterion("is_single_supplier <>", value, "isSingleSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSingleSupplierGreaterThan(String value) {
            addCriterion("is_single_supplier >", value, "isSingleSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSingleSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("is_single_supplier >=", value, "isSingleSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSingleSupplierLessThan(String value) {
            addCriterion("is_single_supplier <", value, "isSingleSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSingleSupplierLessThanOrEqualTo(String value) {
            addCriterion("is_single_supplier <=", value, "isSingleSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSingleSupplierLike(String value) {
            addCriterion("is_single_supplier like", value, "isSingleSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSingleSupplierNotLike(String value) {
            addCriterion("is_single_supplier not like", value, "isSingleSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSingleSupplierIn(List<String> values) {
            addCriterion("is_single_supplier in", values, "isSingleSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSingleSupplierNotIn(List<String> values) {
            addCriterion("is_single_supplier not in", values, "isSingleSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSingleSupplierBetween(String value1, String value2) {
            addCriterion("is_single_supplier between", value1, value2, "isSingleSupplier");
            return (Criteria) this;
        }

        public Criteria andIsSingleSupplierNotBetween(String value1, String value2) {
            addCriterion("is_single_supplier not between", value1, value2, "isSingleSupplier");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
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

        public Criteria andIsEliminateIsNull() {
            addCriterion("is_eliminate is null");
            return (Criteria) this;
        }

        public Criteria andIsEliminateIsNotNull() {
            addCriterion("is_eliminate is not null");
            return (Criteria) this;
        }

        public Criteria andIsEliminateEqualTo(String value) {
            addCriterion("is_eliminate =", value, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateNotEqualTo(String value) {
            addCriterion("is_eliminate <>", value, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateGreaterThan(String value) {
            addCriterion("is_eliminate >", value, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateGreaterThanOrEqualTo(String value) {
            addCriterion("is_eliminate >=", value, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateLessThan(String value) {
            addCriterion("is_eliminate <", value, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateLessThanOrEqualTo(String value) {
            addCriterion("is_eliminate <=", value, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateLike(String value) {
            addCriterion("is_eliminate like", value, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateNotLike(String value) {
            addCriterion("is_eliminate not like", value, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateIn(List<String> values) {
            addCriterion("is_eliminate in", values, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateNotIn(List<String> values) {
            addCriterion("is_eliminate not in", values, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateBetween(String value1, String value2) {
            addCriterion("is_eliminate between", value1, value2, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateNotBetween(String value1, String value2) {
            addCriterion("is_eliminate not between", value1, value2, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andIsMaterialsIsNull() {
            addCriterion("is_materials is null");
            return (Criteria) this;
        }

        public Criteria andIsMaterialsIsNotNull() {
            addCriterion("is_materials is not null");
            return (Criteria) this;
        }

        public Criteria andIsMaterialsEqualTo(String value) {
            addCriterion("is_materials =", value, "isMaterials");
            return (Criteria) this;
        }

        public Criteria andIsMaterialsNotEqualTo(String value) {
            addCriterion("is_materials <>", value, "isMaterials");
            return (Criteria) this;
        }

        public Criteria andIsMaterialsGreaterThan(String value) {
            addCriterion("is_materials >", value, "isMaterials");
            return (Criteria) this;
        }

        public Criteria andIsMaterialsGreaterThanOrEqualTo(String value) {
            addCriterion("is_materials >=", value, "isMaterials");
            return (Criteria) this;
        }

        public Criteria andIsMaterialsLessThan(String value) {
            addCriterion("is_materials <", value, "isMaterials");
            return (Criteria) this;
        }

        public Criteria andIsMaterialsLessThanOrEqualTo(String value) {
            addCriterion("is_materials <=", value, "isMaterials");
            return (Criteria) this;
        }

        public Criteria andIsMaterialsLike(String value) {
            addCriterion("is_materials like", value, "isMaterials");
            return (Criteria) this;
        }

        public Criteria andIsMaterialsNotLike(String value) {
            addCriterion("is_materials not like", value, "isMaterials");
            return (Criteria) this;
        }

        public Criteria andIsMaterialsIn(List<String> values) {
            addCriterion("is_materials in", values, "isMaterials");
            return (Criteria) this;
        }

        public Criteria andIsMaterialsNotIn(List<String> values) {
            addCriterion("is_materials not in", values, "isMaterials");
            return (Criteria) this;
        }

        public Criteria andIsMaterialsBetween(String value1, String value2) {
            addCriterion("is_materials between", value1, value2, "isMaterials");
            return (Criteria) this;
        }

        public Criteria andIsMaterialsNotBetween(String value1, String value2) {
            addCriterion("is_materials not between", value1, value2, "isMaterials");
            return (Criteria) this;
        }

        public Criteria andKeyIsNull() {
            addCriterion("`key` is null");
            return (Criteria) this;
        }

        public Criteria andKeyIsNotNull() {
            addCriterion("`key` is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(String value) {
            addCriterion("`key` =", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotEqualTo(String value) {
            addCriterion("`key` <>", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThan(String value) {
            addCriterion("`key` >", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(String value) {
            addCriterion("`key` >=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThan(String value) {
            addCriterion("`key` <", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThanOrEqualTo(String value) {
            addCriterion("`key` <=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLike(String value) {
            addCriterion("`key` like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotLike(String value) {
            addCriterion("`key` not like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyIn(List<String> values) {
            addCriterion("`key` in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotIn(List<String> values) {
            addCriterion("`key` not in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyBetween(String value1, String value2) {
            addCriterion("`key` between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotBetween(String value1, String value2) {
            addCriterion("`key` not between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("comments like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("comments not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("comments not between", value1, value2, "comments");
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

        public Criteria andCurrentStatusIsNull() {
            addCriterion("current_status is null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIsNotNull() {
            addCriterion("current_status is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusEqualTo(String value) {
            addCriterion("current_status =", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotEqualTo(String value) {
            addCriterion("current_status <>", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThan(String value) {
            addCriterion("current_status >", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("current_status >=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThan(String value) {
            addCriterion("current_status <", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThanOrEqualTo(String value) {
            addCriterion("current_status <=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLike(String value) {
            addCriterion("current_status like", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotLike(String value) {
            addCriterion("current_status not like", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIn(List<String> values) {
            addCriterion("current_status in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotIn(List<String> values) {
            addCriterion("current_status not in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusBetween(String value1, String value2) {
            addCriterion("current_status between", value1, value2, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotBetween(String value1, String value2) {
            addCriterion("current_status not between", value1, value2, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andPreGradeIsNull() {
            addCriterion("pre_grade is null");
            return (Criteria) this;
        }

        public Criteria andPreGradeIsNotNull() {
            addCriterion("pre_grade is not null");
            return (Criteria) this;
        }

        public Criteria andPreGradeEqualTo(String value) {
            addCriterion("pre_grade =", value, "preGrade");
            return (Criteria) this;
        }

        public Criteria andPreGradeNotEqualTo(String value) {
            addCriterion("pre_grade <>", value, "preGrade");
            return (Criteria) this;
        }

        public Criteria andPreGradeGreaterThan(String value) {
            addCriterion("pre_grade >", value, "preGrade");
            return (Criteria) this;
        }

        public Criteria andPreGradeGreaterThanOrEqualTo(String value) {
            addCriterion("pre_grade >=", value, "preGrade");
            return (Criteria) this;
        }

        public Criteria andPreGradeLessThan(String value) {
            addCriterion("pre_grade <", value, "preGrade");
            return (Criteria) this;
        }

        public Criteria andPreGradeLessThanOrEqualTo(String value) {
            addCriterion("pre_grade <=", value, "preGrade");
            return (Criteria) this;
        }

        public Criteria andPreGradeLike(String value) {
            addCriterion("pre_grade like", value, "preGrade");
            return (Criteria) this;
        }

        public Criteria andPreGradeNotLike(String value) {
            addCriterion("pre_grade not like", value, "preGrade");
            return (Criteria) this;
        }

        public Criteria andPreGradeIn(List<String> values) {
            addCriterion("pre_grade in", values, "preGrade");
            return (Criteria) this;
        }

        public Criteria andPreGradeNotIn(List<String> values) {
            addCriterion("pre_grade not in", values, "preGrade");
            return (Criteria) this;
        }

        public Criteria andPreGradeBetween(String value1, String value2) {
            addCriterion("pre_grade between", value1, value2, "preGrade");
            return (Criteria) this;
        }

        public Criteria andPreGradeNotBetween(String value1, String value2) {
            addCriterion("pre_grade not between", value1, value2, "preGrade");
            return (Criteria) this;
        }

        public Criteria andIsOneTimeIsNull() {
            addCriterion("is_one_time is null");
            return (Criteria) this;
        }

        public Criteria andIsOneTimeIsNotNull() {
            addCriterion("is_one_time is not null");
            return (Criteria) this;
        }

        public Criteria andIsOneTimeEqualTo(String value) {
            addCriterion("is_one_time =", value, "isOneTime");
            return (Criteria) this;
        }

        public Criteria andIsOneTimeNotEqualTo(String value) {
            addCriterion("is_one_time <>", value, "isOneTime");
            return (Criteria) this;
        }

        public Criteria andIsOneTimeGreaterThan(String value) {
            addCriterion("is_one_time >", value, "isOneTime");
            return (Criteria) this;
        }

        public Criteria andIsOneTimeGreaterThanOrEqualTo(String value) {
            addCriterion("is_one_time >=", value, "isOneTime");
            return (Criteria) this;
        }

        public Criteria andIsOneTimeLessThan(String value) {
            addCriterion("is_one_time <", value, "isOneTime");
            return (Criteria) this;
        }

        public Criteria andIsOneTimeLessThanOrEqualTo(String value) {
            addCriterion("is_one_time <=", value, "isOneTime");
            return (Criteria) this;
        }

        public Criteria andIsOneTimeLike(String value) {
            addCriterion("is_one_time like", value, "isOneTime");
            return (Criteria) this;
        }

        public Criteria andIsOneTimeNotLike(String value) {
            addCriterion("is_one_time not like", value, "isOneTime");
            return (Criteria) this;
        }

        public Criteria andIsOneTimeIn(List<String> values) {
            addCriterion("is_one_time in", values, "isOneTime");
            return (Criteria) this;
        }

        public Criteria andIsOneTimeNotIn(List<String> values) {
            addCriterion("is_one_time not in", values, "isOneTime");
            return (Criteria) this;
        }

        public Criteria andIsOneTimeBetween(String value1, String value2) {
            addCriterion("is_one_time between", value1, value2, "isOneTime");
            return (Criteria) this;
        }

        public Criteria andIsOneTimeNotBetween(String value1, String value2) {
            addCriterion("is_one_time not between", value1, value2, "isOneTime");
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