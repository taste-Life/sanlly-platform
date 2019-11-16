package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillSourceRepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BillSourceRepairExample() {
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

        public Criteria andBillIdIsNull() {
            addCriterion("bill_id is null");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andBillIdEqualTo(Integer value) {
            addCriterion("bill_id =", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotEqualTo(Integer value) {
            addCriterion("bill_id <>", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThan(Integer value) {
            addCriterion("bill_id >", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_id >=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThan(Integer value) {
            addCriterion("bill_id <", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThanOrEqualTo(Integer value) {
            addCriterion("bill_id <=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdIn(List<Integer> values) {
            addCriterion("bill_id in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotIn(List<Integer> values) {
            addCriterion("bill_id not in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdBetween(Integer value1, Integer value2) {
            addCriterion("bill_id between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_id not between", value1, value2, "billId");
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

        public Criteria andBillTypeEqualTo(Integer value) {
            addCriterion("bill_type =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(Integer value) {
            addCriterion("bill_type <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(Integer value) {
            addCriterion("bill_type >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_type >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(Integer value) {
            addCriterion("bill_type <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(Integer value) {
            addCriterion("bill_type <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<Integer> values) {
            addCriterion("bill_type in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<Integer> values) {
            addCriterion("bill_type not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(Integer value1, Integer value2) {
            addCriterion("bill_type between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_type not between", value1, value2, "billType");
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

        public Criteria andChargeObjectIsNull() {
            addCriterion("charge_object is null");
            return (Criteria) this;
        }

        public Criteria andChargeObjectIsNotNull() {
            addCriterion("charge_object is not null");
            return (Criteria) this;
        }

        public Criteria andChargeObjectEqualTo(String value) {
            addCriterion("charge_object =", value, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectNotEqualTo(String value) {
            addCriterion("charge_object <>", value, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectGreaterThan(String value) {
            addCriterion("charge_object >", value, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectGreaterThanOrEqualTo(String value) {
            addCriterion("charge_object >=", value, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectLessThan(String value) {
            addCriterion("charge_object <", value, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectLessThanOrEqualTo(String value) {
            addCriterion("charge_object <=", value, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectLike(String value) {
            addCriterion("charge_object like", value, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectNotLike(String value) {
            addCriterion("charge_object not like", value, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectIn(List<String> values) {
            addCriterion("charge_object in", values, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectNotIn(List<String> values) {
            addCriterion("charge_object not in", values, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectBetween(String value1, String value2) {
            addCriterion("charge_object between", value1, value2, "chargeObject");
            return (Criteria) this;
        }

        public Criteria andChargeObjectNotBetween(String value1, String value2) {
            addCriterion("charge_object not between", value1, value2, "chargeObject");
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

        public Criteria andChargecodeIsNull() {
            addCriterion("chargecode is null");
            return (Criteria) this;
        }

        public Criteria andChargecodeIsNotNull() {
            addCriterion("chargecode is not null");
            return (Criteria) this;
        }

        public Criteria andChargecodeEqualTo(String value) {
            addCriterion("chargecode =", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeNotEqualTo(String value) {
            addCriterion("chargecode <>", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeGreaterThan(String value) {
            addCriterion("chargecode >", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeGreaterThanOrEqualTo(String value) {
            addCriterion("chargecode >=", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeLessThan(String value) {
            addCriterion("chargecode <", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeLessThanOrEqualTo(String value) {
            addCriterion("chargecode <=", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeLike(String value) {
            addCriterion("chargecode like", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeNotLike(String value) {
            addCriterion("chargecode not like", value, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeIn(List<String> values) {
            addCriterion("chargecode in", values, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeNotIn(List<String> values) {
            addCriterion("chargecode not in", values, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeBetween(String value1, String value2) {
            addCriterion("chargecode between", value1, value2, "chargecode");
            return (Criteria) this;
        }

        public Criteria andChargecodeNotBetween(String value1, String value2) {
            addCriterion("chargecode not between", value1, value2, "chargecode");
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

        public Criteria andRealCurrencyTypeIsNull() {
            addCriterion("real_currency_type is null");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeIsNotNull() {
            addCriterion("real_currency_type is not null");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeEqualTo(String value) {
            addCriterion("real_currency_type =", value, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeNotEqualTo(String value) {
            addCriterion("real_currency_type <>", value, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeGreaterThan(String value) {
            addCriterion("real_currency_type >", value, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("real_currency_type >=", value, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeLessThan(String value) {
            addCriterion("real_currency_type <", value, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeLessThanOrEqualTo(String value) {
            addCriterion("real_currency_type <=", value, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeLike(String value) {
            addCriterion("real_currency_type like", value, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeNotLike(String value) {
            addCriterion("real_currency_type not like", value, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeIn(List<String> values) {
            addCriterion("real_currency_type in", values, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeNotIn(List<String> values) {
            addCriterion("real_currency_type not in", values, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeBetween(String value1, String value2) {
            addCriterion("real_currency_type between", value1, value2, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealCurrencyTypeNotBetween(String value1, String value2) {
            addCriterion("real_currency_type not between", value1, value2, "realCurrencyType");
            return (Criteria) this;
        }

        public Criteria andRealRateIsNull() {
            addCriterion("real_rate is null");
            return (Criteria) this;
        }

        public Criteria andRealRateIsNotNull() {
            addCriterion("real_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRealRateEqualTo(BigDecimal value) {
            addCriterion("real_rate =", value, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateNotEqualTo(BigDecimal value) {
            addCriterion("real_rate <>", value, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateGreaterThan(BigDecimal value) {
            addCriterion("real_rate >", value, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_rate >=", value, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateLessThan(BigDecimal value) {
            addCriterion("real_rate <", value, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_rate <=", value, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateIn(List<BigDecimal> values) {
            addCriterion("real_rate in", values, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateNotIn(List<BigDecimal> values) {
            addCriterion("real_rate not in", values, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_rate between", value1, value2, "realRate");
            return (Criteria) this;
        }

        public Criteria andRealRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_rate not between", value1, value2, "realRate");
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

        public Criteria andTaxAmountUsaIsNull() {
            addCriterion("tax_amount_usa is null");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsaIsNotNull() {
            addCriterion("tax_amount_usa is not null");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsaEqualTo(BigDecimal value) {
            addCriterion("tax_amount_usa =", value, "taxAmountUsa");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsaNotEqualTo(BigDecimal value) {
            addCriterion("tax_amount_usa <>", value, "taxAmountUsa");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsaGreaterThan(BigDecimal value) {
            addCriterion("tax_amount_usa >", value, "taxAmountUsa");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_amount_usa >=", value, "taxAmountUsa");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsaLessThan(BigDecimal value) {
            addCriterion("tax_amount_usa <", value, "taxAmountUsa");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_amount_usa <=", value, "taxAmountUsa");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsaIn(List<BigDecimal> values) {
            addCriterion("tax_amount_usa in", values, "taxAmountUsa");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsaNotIn(List<BigDecimal> values) {
            addCriterion("tax_amount_usa not in", values, "taxAmountUsa");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_amount_usa between", value1, value2, "taxAmountUsa");
            return (Criteria) this;
        }

        public Criteria andTaxAmountUsaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_amount_usa not between", value1, value2, "taxAmountUsa");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRbmIsNull() {
            addCriterion("tax_amount_rbm is null");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRbmIsNotNull() {
            addCriterion("tax_amount_rbm is not null");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRbmEqualTo(BigDecimal value) {
            addCriterion("tax_amount_rbm =", value, "taxAmountRbm");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRbmNotEqualTo(BigDecimal value) {
            addCriterion("tax_amount_rbm <>", value, "taxAmountRbm");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRbmGreaterThan(BigDecimal value) {
            addCriterion("tax_amount_rbm >", value, "taxAmountRbm");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRbmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_amount_rbm >=", value, "taxAmountRbm");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRbmLessThan(BigDecimal value) {
            addCriterion("tax_amount_rbm <", value, "taxAmountRbm");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRbmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_amount_rbm <=", value, "taxAmountRbm");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRbmIn(List<BigDecimal> values) {
            addCriterion("tax_amount_rbm in", values, "taxAmountRbm");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRbmNotIn(List<BigDecimal> values) {
            addCriterion("tax_amount_rbm not in", values, "taxAmountRbm");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRbmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_amount_rbm between", value1, value2, "taxAmountRbm");
            return (Criteria) this;
        }

        public Criteria andTaxAmountRbmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_amount_rbm not between", value1, value2, "taxAmountRbm");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaIsNull() {
            addCriterion("real_tax_total_cost_usa is null");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaIsNotNull() {
            addCriterion("real_tax_total_cost_usa is not null");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_usa =", value, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaNotEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_usa <>", value, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaGreaterThan(BigDecimal value) {
            addCriterion("real_tax_total_cost_usa >", value, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_usa >=", value, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaLessThan(BigDecimal value) {
            addCriterion("real_tax_total_cost_usa <", value, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_usa <=", value, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaIn(List<BigDecimal> values) {
            addCriterion("real_tax_total_cost_usa in", values, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaNotIn(List<BigDecimal> values) {
            addCriterion("real_tax_total_cost_usa not in", values, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_tax_total_cost_usa between", value1, value2, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostUsaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_tax_total_cost_usa not between", value1, value2, "realTaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaIsNull() {
            addCriterion("real_notax_total_cost_usa is null");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaIsNotNull() {
            addCriterion("real_notax_total_cost_usa is not null");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_usa =", value, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaNotEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_usa <>", value, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaGreaterThan(BigDecimal value) {
            addCriterion("real_notax_total_cost_usa >", value, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_usa >=", value, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaLessThan(BigDecimal value) {
            addCriterion("real_notax_total_cost_usa <", value, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_usa <=", value, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaIn(List<BigDecimal> values) {
            addCriterion("real_notax_total_cost_usa in", values, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaNotIn(List<BigDecimal> values) {
            addCriterion("real_notax_total_cost_usa not in", values, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_notax_total_cost_usa between", value1, value2, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostUsaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_notax_total_cost_usa not between", value1, value2, "realNotaxTotalCostUsa");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbIsNull() {
            addCriterion("real_tax_total_cost_rmb is null");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbIsNotNull() {
            addCriterion("real_tax_total_cost_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_rmb =", value, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbNotEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_rmb <>", value, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbGreaterThan(BigDecimal value) {
            addCriterion("real_tax_total_cost_rmb >", value, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_rmb >=", value, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbLessThan(BigDecimal value) {
            addCriterion("real_tax_total_cost_rmb <", value, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_tax_total_cost_rmb <=", value, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbIn(List<BigDecimal> values) {
            addCriterion("real_tax_total_cost_rmb in", values, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbNotIn(List<BigDecimal> values) {
            addCriterion("real_tax_total_cost_rmb not in", values, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_tax_total_cost_rmb between", value1, value2, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealTaxTotalCostRmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_tax_total_cost_rmb not between", value1, value2, "realTaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbIsNull() {
            addCriterion("real_notax_total_cost_rmb is null");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbIsNotNull() {
            addCriterion("real_notax_total_cost_rmb is not null");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_rmb =", value, "realNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbNotEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_rmb <>", value, "realNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbGreaterThan(BigDecimal value) {
            addCriterion("real_notax_total_cost_rmb >", value, "realNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_rmb >=", value, "realNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbLessThan(BigDecimal value) {
            addCriterion("real_notax_total_cost_rmb <", value, "realNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_notax_total_cost_rmb <=", value, "realNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbIn(List<BigDecimal> values) {
            addCriterion("real_notax_total_cost_rmb in", values, "realNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbNotIn(List<BigDecimal> values) {
            addCriterion("real_notax_total_cost_rmb not in", values, "realNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_notax_total_cost_rmb between", value1, value2, "realNotaxTotalCostRmb");
            return (Criteria) this;
        }

        public Criteria andRealNotaxTotalCostRmbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_notax_total_cost_rmb not between", value1, value2, "realNotaxTotalCostRmb");
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

        public Criteria andBillReturnIsNull() {
            addCriterion("bill_return is null");
            return (Criteria) this;
        }

        public Criteria andBillReturnIsNotNull() {
            addCriterion("bill_return is not null");
            return (Criteria) this;
        }

        public Criteria andBillReturnEqualTo(Integer value) {
            addCriterion("bill_return =", value, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnNotEqualTo(Integer value) {
            addCriterion("bill_return <>", value, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnGreaterThan(Integer value) {
            addCriterion("bill_return >", value, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_return >=", value, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnLessThan(Integer value) {
            addCriterion("bill_return <", value, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnLessThanOrEqualTo(Integer value) {
            addCriterion("bill_return <=", value, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnIn(List<Integer> values) {
            addCriterion("bill_return in", values, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnNotIn(List<Integer> values) {
            addCriterion("bill_return not in", values, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnBetween(Integer value1, Integer value2) {
            addCriterion("bill_return between", value1, value2, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_return not between", value1, value2, "billReturn");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeIsNull() {
            addCriterion("bill_return_time is null");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeIsNotNull() {
            addCriterion("bill_return_time is not null");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeEqualTo(Date value) {
            addCriterion("bill_return_time =", value, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeNotEqualTo(Date value) {
            addCriterion("bill_return_time <>", value, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeGreaterThan(Date value) {
            addCriterion("bill_return_time >", value, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bill_return_time >=", value, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeLessThan(Date value) {
            addCriterion("bill_return_time <", value, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("bill_return_time <=", value, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeIn(List<Date> values) {
            addCriterion("bill_return_time in", values, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeNotIn(List<Date> values) {
            addCriterion("bill_return_time not in", values, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeBetween(Date value1, Date value2) {
            addCriterion("bill_return_time between", value1, value2, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("bill_return_time not between", value1, value2, "billReturnTime");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonIsNull() {
            addCriterion("bill_return_reason is null");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonIsNotNull() {
            addCriterion("bill_return_reason is not null");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonEqualTo(String value) {
            addCriterion("bill_return_reason =", value, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonNotEqualTo(String value) {
            addCriterion("bill_return_reason <>", value, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonGreaterThan(String value) {
            addCriterion("bill_return_reason >", value, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonGreaterThanOrEqualTo(String value) {
            addCriterion("bill_return_reason >=", value, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonLessThan(String value) {
            addCriterion("bill_return_reason <", value, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonLessThanOrEqualTo(String value) {
            addCriterion("bill_return_reason <=", value, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonLike(String value) {
            addCriterion("bill_return_reason like", value, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonNotLike(String value) {
            addCriterion("bill_return_reason not like", value, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonIn(List<String> values) {
            addCriterion("bill_return_reason in", values, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonNotIn(List<String> values) {
            addCriterion("bill_return_reason not in", values, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonBetween(String value1, String value2) {
            addCriterion("bill_return_reason between", value1, value2, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillReturnReasonNotBetween(String value1, String value2) {
            addCriterion("bill_return_reason not between", value1, value2, "billReturnReason");
            return (Criteria) this;
        }

        public Criteria andBillRemarkIsNull() {
            addCriterion("bill_remark is null");
            return (Criteria) this;
        }

        public Criteria andBillRemarkIsNotNull() {
            addCriterion("bill_remark is not null");
            return (Criteria) this;
        }

        public Criteria andBillRemarkEqualTo(String value) {
            addCriterion("bill_remark =", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkNotEqualTo(String value) {
            addCriterion("bill_remark <>", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkGreaterThan(String value) {
            addCriterion("bill_remark >", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("bill_remark >=", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkLessThan(String value) {
            addCriterion("bill_remark <", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkLessThanOrEqualTo(String value) {
            addCriterion("bill_remark <=", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkLike(String value) {
            addCriterion("bill_remark like", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkNotLike(String value) {
            addCriterion("bill_remark not like", value, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkIn(List<String> values) {
            addCriterion("bill_remark in", values, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkNotIn(List<String> values) {
            addCriterion("bill_remark not in", values, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkBetween(String value1, String value2) {
            addCriterion("bill_remark between", value1, value2, "billRemark");
            return (Criteria) this;
        }

        public Criteria andBillRemarkNotBetween(String value1, String value2) {
            addCriterion("bill_remark not between", value1, value2, "billRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnIsNull() {
            addCriterion("finance_return is null");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnIsNotNull() {
            addCriterion("finance_return is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnEqualTo(Integer value) {
            addCriterion("finance_return =", value, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnNotEqualTo(Integer value) {
            addCriterion("finance_return <>", value, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnGreaterThan(Integer value) {
            addCriterion("finance_return >", value, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnGreaterThanOrEqualTo(Integer value) {
            addCriterion("finance_return >=", value, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnLessThan(Integer value) {
            addCriterion("finance_return <", value, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnLessThanOrEqualTo(Integer value) {
            addCriterion("finance_return <=", value, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnIn(List<Integer> values) {
            addCriterion("finance_return in", values, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnNotIn(List<Integer> values) {
            addCriterion("finance_return not in", values, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnBetween(Integer value1, Integer value2) {
            addCriterion("finance_return between", value1, value2, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnNotBetween(Integer value1, Integer value2) {
            addCriterion("finance_return not between", value1, value2, "financeReturn");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeIsNull() {
            addCriterion("finance_return_time is null");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeIsNotNull() {
            addCriterion("finance_return_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeEqualTo(Date value) {
            addCriterion("finance_return_time =", value, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeNotEqualTo(Date value) {
            addCriterion("finance_return_time <>", value, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeGreaterThan(Date value) {
            addCriterion("finance_return_time >", value, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finance_return_time >=", value, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeLessThan(Date value) {
            addCriterion("finance_return_time <", value, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("finance_return_time <=", value, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeIn(List<Date> values) {
            addCriterion("finance_return_time in", values, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeNotIn(List<Date> values) {
            addCriterion("finance_return_time not in", values, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeBetween(Date value1, Date value2) {
            addCriterion("finance_return_time between", value1, value2, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("finance_return_time not between", value1, value2, "financeReturnTime");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonIsNull() {
            addCriterion("finance_return_reason is null");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonIsNotNull() {
            addCriterion("finance_return_reason is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonEqualTo(String value) {
            addCriterion("finance_return_reason =", value, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonNotEqualTo(String value) {
            addCriterion("finance_return_reason <>", value, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonGreaterThan(String value) {
            addCriterion("finance_return_reason >", value, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonGreaterThanOrEqualTo(String value) {
            addCriterion("finance_return_reason >=", value, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonLessThan(String value) {
            addCriterion("finance_return_reason <", value, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonLessThanOrEqualTo(String value) {
            addCriterion("finance_return_reason <=", value, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonLike(String value) {
            addCriterion("finance_return_reason like", value, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonNotLike(String value) {
            addCriterion("finance_return_reason not like", value, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonIn(List<String> values) {
            addCriterion("finance_return_reason in", values, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonNotIn(List<String> values) {
            addCriterion("finance_return_reason not in", values, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonBetween(String value1, String value2) {
            addCriterion("finance_return_reason between", value1, value2, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceReturnReasonNotBetween(String value1, String value2) {
            addCriterion("finance_return_reason not between", value1, value2, "financeReturnReason");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkIsNull() {
            addCriterion("finance_remark is null");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkIsNotNull() {
            addCriterion("finance_remark is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkEqualTo(String value) {
            addCriterion("finance_remark =", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkNotEqualTo(String value) {
            addCriterion("finance_remark <>", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkGreaterThan(String value) {
            addCriterion("finance_remark >", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("finance_remark >=", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkLessThan(String value) {
            addCriterion("finance_remark <", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkLessThanOrEqualTo(String value) {
            addCriterion("finance_remark <=", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkLike(String value) {
            addCriterion("finance_remark like", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkNotLike(String value) {
            addCriterion("finance_remark not like", value, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkIn(List<String> values) {
            addCriterion("finance_remark in", values, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkNotIn(List<String> values) {
            addCriterion("finance_remark not in", values, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkBetween(String value1, String value2) {
            addCriterion("finance_remark between", value1, value2, "financeRemark");
            return (Criteria) this;
        }

        public Criteria andFinanceRemarkNotBetween(String value1, String value2) {
            addCriterion("finance_remark not between", value1, value2, "financeRemark");
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

        public Criteria andCreateNodeIsNull() {
            addCriterion("create_node is null");
            return (Criteria) this;
        }

        public Criteria andCreateNodeIsNotNull() {
            addCriterion("create_node is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNodeEqualTo(String value) {
            addCriterion("create_node =", value, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeNotEqualTo(String value) {
            addCriterion("create_node <>", value, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeGreaterThan(String value) {
            addCriterion("create_node >", value, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeGreaterThanOrEqualTo(String value) {
            addCriterion("create_node >=", value, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeLessThan(String value) {
            addCriterion("create_node <", value, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeLessThanOrEqualTo(String value) {
            addCriterion("create_node <=", value, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeLike(String value) {
            addCriterion("create_node like", value, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeNotLike(String value) {
            addCriterion("create_node not like", value, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeIn(List<String> values) {
            addCriterion("create_node in", values, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeNotIn(List<String> values) {
            addCriterion("create_node not in", values, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeBetween(String value1, String value2) {
            addCriterion("create_node between", value1, value2, "createNode");
            return (Criteria) this;
        }

        public Criteria andCreateNodeNotBetween(String value1, String value2) {
            addCriterion("create_node not between", value1, value2, "createNode");
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

        public Criteria andModifyBillStatusIsNull() {
            addCriterion("modify_bill_status is null");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusIsNotNull() {
            addCriterion("modify_bill_status is not null");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusEqualTo(String value) {
            addCriterion("modify_bill_status =", value, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusNotEqualTo(String value) {
            addCriterion("modify_bill_status <>", value, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusGreaterThan(String value) {
            addCriterion("modify_bill_status >", value, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusGreaterThanOrEqualTo(String value) {
            addCriterion("modify_bill_status >=", value, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusLessThan(String value) {
            addCriterion("modify_bill_status <", value, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusLessThanOrEqualTo(String value) {
            addCriterion("modify_bill_status <=", value, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusLike(String value) {
            addCriterion("modify_bill_status like", value, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusNotLike(String value) {
            addCriterion("modify_bill_status not like", value, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusIn(List<String> values) {
            addCriterion("modify_bill_status in", values, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusNotIn(List<String> values) {
            addCriterion("modify_bill_status not in", values, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusBetween(String value1, String value2) {
            addCriterion("modify_bill_status between", value1, value2, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillStatusNotBetween(String value1, String value2) {
            addCriterion("modify_bill_status not between", value1, value2, "modifyBillStatus");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeIsNull() {
            addCriterion("modify_bill_type is null");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeIsNotNull() {
            addCriterion("modify_bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeEqualTo(String value) {
            addCriterion("modify_bill_type =", value, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeNotEqualTo(String value) {
            addCriterion("modify_bill_type <>", value, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeGreaterThan(String value) {
            addCriterion("modify_bill_type >", value, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeGreaterThanOrEqualTo(String value) {
            addCriterion("modify_bill_type >=", value, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeLessThan(String value) {
            addCriterion("modify_bill_type <", value, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeLessThanOrEqualTo(String value) {
            addCriterion("modify_bill_type <=", value, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeLike(String value) {
            addCriterion("modify_bill_type like", value, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeNotLike(String value) {
            addCriterion("modify_bill_type not like", value, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeIn(List<String> values) {
            addCriterion("modify_bill_type in", values, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeNotIn(List<String> values) {
            addCriterion("modify_bill_type not in", values, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeBetween(String value1, String value2) {
            addCriterion("modify_bill_type between", value1, value2, "modifyBillType");
            return (Criteria) this;
        }

        public Criteria andModifyBillTypeNotBetween(String value1, String value2) {
            addCriterion("modify_bill_type not between", value1, value2, "modifyBillType");
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