package com.sanlly.purchase.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseDeliveryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PurchaseDeliveryExample() {
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

        public Criteria andPurcPurchaseDeliveryIdIsNull() {
            addCriterion("purc_purchase_delivery_id is null");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryIdIsNotNull() {
            addCriterion("purc_purchase_delivery_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryIdEqualTo(Integer value) {
            addCriterion("purc_purchase_delivery_id =", value, "purcPurchaseDeliveryId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryIdNotEqualTo(Integer value) {
            addCriterion("purc_purchase_delivery_id <>", value, "purcPurchaseDeliveryId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryIdGreaterThan(Integer value) {
            addCriterion("purc_purchase_delivery_id >", value, "purcPurchaseDeliveryId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purc_purchase_delivery_id >=", value, "purcPurchaseDeliveryId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryIdLessThan(Integer value) {
            addCriterion("purc_purchase_delivery_id <", value, "purcPurchaseDeliveryId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryIdLessThanOrEqualTo(Integer value) {
            addCriterion("purc_purchase_delivery_id <=", value, "purcPurchaseDeliveryId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryIdIn(List<Integer> values) {
            addCriterion("purc_purchase_delivery_id in", values, "purcPurchaseDeliveryId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryIdNotIn(List<Integer> values) {
            addCriterion("purc_purchase_delivery_id not in", values, "purcPurchaseDeliveryId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryIdBetween(Integer value1, Integer value2) {
            addCriterion("purc_purchase_delivery_id between", value1, value2, "purcPurchaseDeliveryId");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseDeliveryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purc_purchase_delivery_id not between", value1, value2, "purcPurchaseDeliveryId");
            return (Criteria) this;
        }

        public Criteria andTenderIdIsNull() {
            addCriterion("tender_id is null");
            return (Criteria) this;
        }

        public Criteria andTenderIdIsNotNull() {
            addCriterion("tender_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenderIdEqualTo(String value) {
            addCriterion("tender_id =", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdNotEqualTo(String value) {
            addCriterion("tender_id <>", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdGreaterThan(String value) {
            addCriterion("tender_id >", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdGreaterThanOrEqualTo(String value) {
            addCriterion("tender_id >=", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdLessThan(String value) {
            addCriterion("tender_id <", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdLessThanOrEqualTo(String value) {
            addCriterion("tender_id <=", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdLike(String value) {
            addCriterion("tender_id like", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdNotLike(String value) {
            addCriterion("tender_id not like", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdIn(List<String> values) {
            addCriterion("tender_id in", values, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdNotIn(List<String> values) {
            addCriterion("tender_id not in", values, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdBetween(String value1, String value2) {
            addCriterion("tender_id between", value1, value2, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdNotBetween(String value1, String value2) {
            addCriterion("tender_id not between", value1, value2, "tenderId");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseIsNull() {
            addCriterion("is_day_pruchase is null");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseIsNotNull() {
            addCriterion("is_day_pruchase is not null");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseEqualTo(String value) {
            addCriterion("is_day_pruchase =", value, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseNotEqualTo(String value) {
            addCriterion("is_day_pruchase <>", value, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseGreaterThan(String value) {
            addCriterion("is_day_pruchase >", value, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseGreaterThanOrEqualTo(String value) {
            addCriterion("is_day_pruchase >=", value, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseLessThan(String value) {
            addCriterion("is_day_pruchase <", value, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseLessThanOrEqualTo(String value) {
            addCriterion("is_day_pruchase <=", value, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseLike(String value) {
            addCriterion("is_day_pruchase like", value, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseNotLike(String value) {
            addCriterion("is_day_pruchase not like", value, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseIn(List<String> values) {
            addCriterion("is_day_pruchase in", values, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseNotIn(List<String> values) {
            addCriterion("is_day_pruchase not in", values, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseBetween(String value1, String value2) {
            addCriterion("is_day_pruchase between", value1, value2, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andIsDayPruchaseNotBetween(String value1, String value2) {
            addCriterion("is_day_pruchase not between", value1, value2, "isDayPruchase");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumIsNull() {
            addCriterion("delivery_num is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumIsNotNull() {
            addCriterion("delivery_num is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumEqualTo(String value) {
            addCriterion("delivery_num =", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumNotEqualTo(String value) {
            addCriterion("delivery_num <>", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumGreaterThan(String value) {
            addCriterion("delivery_num >", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_num >=", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumLessThan(String value) {
            addCriterion("delivery_num <", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumLessThanOrEqualTo(String value) {
            addCriterion("delivery_num <=", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumLike(String value) {
            addCriterion("delivery_num like", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumNotLike(String value) {
            addCriterion("delivery_num not like", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumIn(List<String> values) {
            addCriterion("delivery_num in", values, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumNotIn(List<String> values) {
            addCriterion("delivery_num not in", values, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumBetween(String value1, String value2) {
            addCriterion("delivery_num between", value1, value2, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumNotBetween(String value1, String value2) {
            addCriterion("delivery_num not between", value1, value2, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyIsNull() {
            addCriterion("purchase_company is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyIsNotNull() {
            addCriterion("purchase_company is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyEqualTo(String value) {
            addCriterion("purchase_company =", value, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyNotEqualTo(String value) {
            addCriterion("purchase_company <>", value, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyGreaterThan(String value) {
            addCriterion("purchase_company >", value, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_company >=", value, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyLessThan(String value) {
            addCriterion("purchase_company <", value, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyLessThanOrEqualTo(String value) {
            addCriterion("purchase_company <=", value, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyLike(String value) {
            addCriterion("purchase_company like", value, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyNotLike(String value) {
            addCriterion("purchase_company not like", value, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyIn(List<String> values) {
            addCriterion("purchase_company in", values, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyNotIn(List<String> values) {
            addCriterion("purchase_company not in", values, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyBetween(String value1, String value2) {
            addCriterion("purchase_company between", value1, value2, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseCompanyNotBetween(String value1, String value2) {
            addCriterion("purchase_company not between", value1, value2, "purchaseCompany");
            return (Criteria) this;
        }

        public Criteria andPurchaseWareIsNull() {
            addCriterion("purchase_ware is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseWareIsNotNull() {
            addCriterion("purchase_ware is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseWareEqualTo(String value) {
            addCriterion("purchase_ware =", value, "purchaseWare");
            return (Criteria) this;
        }

        public Criteria andPurchaseWareNotEqualTo(String value) {
            addCriterion("purchase_ware <>", value, "purchaseWare");
            return (Criteria) this;
        }

        public Criteria andPurchaseWareGreaterThan(String value) {
            addCriterion("purchase_ware >", value, "purchaseWare");
            return (Criteria) this;
        }

        public Criteria andPurchaseWareGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_ware >=", value, "purchaseWare");
            return (Criteria) this;
        }

        public Criteria andPurchaseWareLessThan(String value) {
            addCriterion("purchase_ware <", value, "purchaseWare");
            return (Criteria) this;
        }

        public Criteria andPurchaseWareLessThanOrEqualTo(String value) {
            addCriterion("purchase_ware <=", value, "purchaseWare");
            return (Criteria) this;
        }

        public Criteria andPurchaseWareLike(String value) {
            addCriterion("purchase_ware like", value, "purchaseWare");
            return (Criteria) this;
        }

        public Criteria andPurchaseWareNotLike(String value) {
            addCriterion("purchase_ware not like", value, "purchaseWare");
            return (Criteria) this;
        }

        public Criteria andPurchaseWareIn(List<String> values) {
            addCriterion("purchase_ware in", values, "purchaseWare");
            return (Criteria) this;
        }

        public Criteria andPurchaseWareNotIn(List<String> values) {
            addCriterion("purchase_ware not in", values, "purchaseWare");
            return (Criteria) this;
        }

        public Criteria andPurchaseWareBetween(String value1, String value2) {
            addCriterion("purchase_ware between", value1, value2, "purchaseWare");
            return (Criteria) this;
        }

        public Criteria andPurchaseWareNotBetween(String value1, String value2) {
            addCriterion("purchase_ware not between", value1, value2, "purchaseWare");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIsNull() {
            addCriterion("purchase_type is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIsNotNull() {
            addCriterion("purchase_type is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEqualTo(String value) {
            addCriterion("purchase_type =", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotEqualTo(String value) {
            addCriterion("purchase_type <>", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeGreaterThan(String value) {
            addCriterion("purchase_type >", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_type >=", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLessThan(String value) {
            addCriterion("purchase_type <", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLessThanOrEqualTo(String value) {
            addCriterion("purchase_type <=", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLike(String value) {
            addCriterion("purchase_type like", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotLike(String value) {
            addCriterion("purchase_type not like", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIn(List<String> values) {
            addCriterion("purchase_type in", values, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotIn(List<String> values) {
            addCriterion("purchase_type not in", values, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeBetween(String value1, String value2) {
            addCriterion("purchase_type between", value1, value2, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotBetween(String value1, String value2) {
            addCriterion("purchase_type not between", value1, value2, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(String value) {
            addCriterion("invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(String value) {
            addCriterion("invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(String value) {
            addCriterion("invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(String value) {
            addCriterion("invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(String value) {
            addCriterion("invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLike(String value) {
            addCriterion("invoice like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotLike(String value) {
            addCriterion("invoice not like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<String> values) {
            addCriterion("invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<String> values) {
            addCriterion("invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(String value1, String value2) {
            addCriterion("invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(String value1, String value2) {
            addCriterion("invoice not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdIsNull() {
            addCriterion("purchase_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdIsNotNull() {
            addCriterion("purchase_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdEqualTo(Integer value) {
            addCriterion("purchase_user_id =", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdNotEqualTo(Integer value) {
            addCriterion("purchase_user_id <>", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdGreaterThan(Integer value) {
            addCriterion("purchase_user_id >", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_user_id >=", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdLessThan(Integer value) {
            addCriterion("purchase_user_id <", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_user_id <=", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdIn(List<Integer> values) {
            addCriterion("purchase_user_id in", values, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdNotIn(List<Integer> values) {
            addCriterion("purchase_user_id not in", values, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdBetween(Integer value1, Integer value2) {
            addCriterion("purchase_user_id between", value1, value2, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_user_id not between", value1, value2, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderIsNull() {
            addCriterion("purc_purchase_order is null");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderIsNotNull() {
            addCriterion("purc_purchase_order is not null");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderEqualTo(Integer value) {
            addCriterion("purc_purchase_order =", value, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderNotEqualTo(Integer value) {
            addCriterion("purc_purchase_order <>", value, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderGreaterThan(Integer value) {
            addCriterion("purc_purchase_order >", value, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("purc_purchase_order >=", value, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderLessThan(Integer value) {
            addCriterion("purc_purchase_order <", value, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderLessThanOrEqualTo(Integer value) {
            addCriterion("purc_purchase_order <=", value, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderIn(List<Integer> values) {
            addCriterion("purc_purchase_order in", values, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderNotIn(List<Integer> values) {
            addCriterion("purc_purchase_order not in", values, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderBetween(Integer value1, Integer value2) {
            addCriterion("purc_purchase_order between", value1, value2, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andPurcPurchaseOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("purc_purchase_order not between", value1, value2, "purcPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplyTypeIsNull() {
            addCriterion("supply_type is null");
            return (Criteria) this;
        }

        public Criteria andSupplyTypeIsNotNull() {
            addCriterion("supply_type is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyTypeEqualTo(String value) {
            addCriterion("supply_type =", value, "supplyType");
            return (Criteria) this;
        }

        public Criteria andSupplyTypeNotEqualTo(String value) {
            addCriterion("supply_type <>", value, "supplyType");
            return (Criteria) this;
        }

        public Criteria andSupplyTypeGreaterThan(String value) {
            addCriterion("supply_type >", value, "supplyType");
            return (Criteria) this;
        }

        public Criteria andSupplyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("supply_type >=", value, "supplyType");
            return (Criteria) this;
        }

        public Criteria andSupplyTypeLessThan(String value) {
            addCriterion("supply_type <", value, "supplyType");
            return (Criteria) this;
        }

        public Criteria andSupplyTypeLessThanOrEqualTo(String value) {
            addCriterion("supply_type <=", value, "supplyType");
            return (Criteria) this;
        }

        public Criteria andSupplyTypeLike(String value) {
            addCriterion("supply_type like", value, "supplyType");
            return (Criteria) this;
        }

        public Criteria andSupplyTypeNotLike(String value) {
            addCriterion("supply_type not like", value, "supplyType");
            return (Criteria) this;
        }

        public Criteria andSupplyTypeIn(List<String> values) {
            addCriterion("supply_type in", values, "supplyType");
            return (Criteria) this;
        }

        public Criteria andSupplyTypeNotIn(List<String> values) {
            addCriterion("supply_type not in", values, "supplyType");
            return (Criteria) this;
        }

        public Criteria andSupplyTypeBetween(String value1, String value2) {
            addCriterion("supply_type between", value1, value2, "supplyType");
            return (Criteria) this;
        }

        public Criteria andSupplyTypeNotBetween(String value1, String value2) {
            addCriterion("supply_type not between", value1, value2, "supplyType");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNull() {
            addCriterion("logistics_company is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNotNull() {
            addCriterion("logistics_company is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyEqualTo(String value) {
            addCriterion("logistics_company =", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotEqualTo(String value) {
            addCriterion("logistics_company <>", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThan(String value) {
            addCriterion("logistics_company >", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_company >=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThan(String value) {
            addCriterion("logistics_company <", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThanOrEqualTo(String value) {
            addCriterion("logistics_company <=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLike(String value) {
            addCriterion("logistics_company like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotLike(String value) {
            addCriterion("logistics_company not like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIn(List<String> values) {
            addCriterion("logistics_company in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotIn(List<String> values) {
            addCriterion("logistics_company not in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyBetween(String value1, String value2) {
            addCriterion("logistics_company between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotBetween(String value1, String value2) {
            addCriterion("logistics_company not between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumIsNull() {
            addCriterion("logistics_num is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumIsNotNull() {
            addCriterion("logistics_num is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumEqualTo(String value) {
            addCriterion("logistics_num =", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumNotEqualTo(String value) {
            addCriterion("logistics_num <>", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumGreaterThan(String value) {
            addCriterion("logistics_num >", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_num >=", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumLessThan(String value) {
            addCriterion("logistics_num <", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumLessThanOrEqualTo(String value) {
            addCriterion("logistics_num <=", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumLike(String value) {
            addCriterion("logistics_num like", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumNotLike(String value) {
            addCriterion("logistics_num not like", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumIn(List<String> values) {
            addCriterion("logistics_num in", values, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumNotIn(List<String> values) {
            addCriterion("logistics_num not in", values, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumBetween(String value1, String value2) {
            addCriterion("logistics_num between", value1, value2, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumNotBetween(String value1, String value2) {
            addCriterion("logistics_num not between", value1, value2, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andReciveStatusIsNull() {
            addCriterion("recive_status is null");
            return (Criteria) this;
        }

        public Criteria andReciveStatusIsNotNull() {
            addCriterion("recive_status is not null");
            return (Criteria) this;
        }

        public Criteria andReciveStatusEqualTo(String value) {
            addCriterion("recive_status =", value, "reciveStatus");
            return (Criteria) this;
        }

        public Criteria andReciveStatusNotEqualTo(String value) {
            addCriterion("recive_status <>", value, "reciveStatus");
            return (Criteria) this;
        }

        public Criteria andReciveStatusGreaterThan(String value) {
            addCriterion("recive_status >", value, "reciveStatus");
            return (Criteria) this;
        }

        public Criteria andReciveStatusGreaterThanOrEqualTo(String value) {
            addCriterion("recive_status >=", value, "reciveStatus");
            return (Criteria) this;
        }

        public Criteria andReciveStatusLessThan(String value) {
            addCriterion("recive_status <", value, "reciveStatus");
            return (Criteria) this;
        }

        public Criteria andReciveStatusLessThanOrEqualTo(String value) {
            addCriterion("recive_status <=", value, "reciveStatus");
            return (Criteria) this;
        }

        public Criteria andReciveStatusLike(String value) {
            addCriterion("recive_status like", value, "reciveStatus");
            return (Criteria) this;
        }

        public Criteria andReciveStatusNotLike(String value) {
            addCriterion("recive_status not like", value, "reciveStatus");
            return (Criteria) this;
        }

        public Criteria andReciveStatusIn(List<String> values) {
            addCriterion("recive_status in", values, "reciveStatus");
            return (Criteria) this;
        }

        public Criteria andReciveStatusNotIn(List<String> values) {
            addCriterion("recive_status not in", values, "reciveStatus");
            return (Criteria) this;
        }

        public Criteria andReciveStatusBetween(String value1, String value2) {
            addCriterion("recive_status between", value1, value2, "reciveStatus");
            return (Criteria) this;
        }

        public Criteria andReciveStatusNotBetween(String value1, String value2) {
            addCriterion("recive_status not between", value1, value2, "reciveStatus");
            return (Criteria) this;
        }

        public Criteria andBilltotalamountIsNull() {
            addCriterion("billTotalAmount is null");
            return (Criteria) this;
        }

        public Criteria andBilltotalamountIsNotNull() {
            addCriterion("billTotalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andBilltotalamountEqualTo(BigDecimal value) {
            addCriterion("billTotalAmount =", value, "billtotalamount");
            return (Criteria) this;
        }

        public Criteria andBilltotalamountNotEqualTo(BigDecimal value) {
            addCriterion("billTotalAmount <>", value, "billtotalamount");
            return (Criteria) this;
        }

        public Criteria andBilltotalamountGreaterThan(BigDecimal value) {
            addCriterion("billTotalAmount >", value, "billtotalamount");
            return (Criteria) this;
        }

        public Criteria andBilltotalamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("billTotalAmount >=", value, "billtotalamount");
            return (Criteria) this;
        }

        public Criteria andBilltotalamountLessThan(BigDecimal value) {
            addCriterion("billTotalAmount <", value, "billtotalamount");
            return (Criteria) this;
        }

        public Criteria andBilltotalamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("billTotalAmount <=", value, "billtotalamount");
            return (Criteria) this;
        }

        public Criteria andBilltotalamountIn(List<BigDecimal> values) {
            addCriterion("billTotalAmount in", values, "billtotalamount");
            return (Criteria) this;
        }

        public Criteria andBilltotalamountNotIn(List<BigDecimal> values) {
            addCriterion("billTotalAmount not in", values, "billtotalamount");
            return (Criteria) this;
        }

        public Criteria andBilltotalamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("billTotalAmount between", value1, value2, "billtotalamount");
            return (Criteria) this;
        }

        public Criteria andBilltotalamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("billTotalAmount not between", value1, value2, "billtotalamount");
            return (Criteria) this;
        }

        public Criteria andVatIsNull() {
            addCriterion("vat is null");
            return (Criteria) this;
        }

        public Criteria andVatIsNotNull() {
            addCriterion("vat is not null");
            return (Criteria) this;
        }

        public Criteria andVatEqualTo(BigDecimal value) {
            addCriterion("vat =", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatNotEqualTo(BigDecimal value) {
            addCriterion("vat <>", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatGreaterThan(BigDecimal value) {
            addCriterion("vat >", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vat >=", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatLessThan(BigDecimal value) {
            addCriterion("vat <", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vat <=", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatIn(List<BigDecimal> values) {
            addCriterion("vat in", values, "vat");
            return (Criteria) this;
        }

        public Criteria andVatNotIn(List<BigDecimal> values) {
            addCriterion("vat not in", values, "vat");
            return (Criteria) this;
        }

        public Criteria andVatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vat between", value1, value2, "vat");
            return (Criteria) this;
        }

        public Criteria andVatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vat not between", value1, value2, "vat");
            return (Criteria) this;
        }

        public Criteria andTariffIsNull() {
            addCriterion("tariff is null");
            return (Criteria) this;
        }

        public Criteria andTariffIsNotNull() {
            addCriterion("tariff is not null");
            return (Criteria) this;
        }

        public Criteria andTariffEqualTo(BigDecimal value) {
            addCriterion("tariff =", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffNotEqualTo(BigDecimal value) {
            addCriterion("tariff <>", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffGreaterThan(BigDecimal value) {
            addCriterion("tariff >", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tariff >=", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffLessThan(BigDecimal value) {
            addCriterion("tariff <", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tariff <=", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffIn(List<BigDecimal> values) {
            addCriterion("tariff in", values, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffNotIn(List<BigDecimal> values) {
            addCriterion("tariff not in", values, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tariff between", value1, value2, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tariff not between", value1, value2, "tariff");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(BigDecimal value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(BigDecimal value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(BigDecimal value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(BigDecimal value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<BigDecimal> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<BigDecimal> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andIsVerifyAccountIsNull() {
            addCriterion("is_verify_account is null");
            return (Criteria) this;
        }

        public Criteria andIsVerifyAccountIsNotNull() {
            addCriterion("is_verify_account is not null");
            return (Criteria) this;
        }

        public Criteria andIsVerifyAccountEqualTo(String value) {
            addCriterion("is_verify_account =", value, "isVerifyAccount");
            return (Criteria) this;
        }

        public Criteria andIsVerifyAccountNotEqualTo(String value) {
            addCriterion("is_verify_account <>", value, "isVerifyAccount");
            return (Criteria) this;
        }

        public Criteria andIsVerifyAccountGreaterThan(String value) {
            addCriterion("is_verify_account >", value, "isVerifyAccount");
            return (Criteria) this;
        }

        public Criteria andIsVerifyAccountGreaterThanOrEqualTo(String value) {
            addCriterion("is_verify_account >=", value, "isVerifyAccount");
            return (Criteria) this;
        }

        public Criteria andIsVerifyAccountLessThan(String value) {
            addCriterion("is_verify_account <", value, "isVerifyAccount");
            return (Criteria) this;
        }

        public Criteria andIsVerifyAccountLessThanOrEqualTo(String value) {
            addCriterion("is_verify_account <=", value, "isVerifyAccount");
            return (Criteria) this;
        }

        public Criteria andIsVerifyAccountLike(String value) {
            addCriterion("is_verify_account like", value, "isVerifyAccount");
            return (Criteria) this;
        }

        public Criteria andIsVerifyAccountNotLike(String value) {
            addCriterion("is_verify_account not like", value, "isVerifyAccount");
            return (Criteria) this;
        }

        public Criteria andIsVerifyAccountIn(List<String> values) {
            addCriterion("is_verify_account in", values, "isVerifyAccount");
            return (Criteria) this;
        }

        public Criteria andIsVerifyAccountNotIn(List<String> values) {
            addCriterion("is_verify_account not in", values, "isVerifyAccount");
            return (Criteria) this;
        }

        public Criteria andIsVerifyAccountBetween(String value1, String value2) {
            addCriterion("is_verify_account between", value1, value2, "isVerifyAccount");
            return (Criteria) this;
        }

        public Criteria andIsVerifyAccountNotBetween(String value1, String value2) {
            addCriterion("is_verify_account not between", value1, value2, "isVerifyAccount");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeIsNull() {
            addCriterion("purchase_time is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeIsNotNull() {
            addCriterion("purchase_time is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeEqualTo(Date value) {
            addCriterion("purchase_time =", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeNotEqualTo(Date value) {
            addCriterion("purchase_time <>", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeGreaterThan(Date value) {
            addCriterion("purchase_time >", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("purchase_time >=", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeLessThan(Date value) {
            addCriterion("purchase_time <", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("purchase_time <=", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeIn(List<Date> values) {
            addCriterion("purchase_time in", values, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeNotIn(List<Date> values) {
            addCriterion("purchase_time not in", values, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeBetween(Date value1, Date value2) {
            addCriterion("purchase_time between", value1, value2, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("purchase_time not between", value1, value2, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andReciveAddressIsNull() {
            addCriterion("recive_address is null");
            return (Criteria) this;
        }

        public Criteria andReciveAddressIsNotNull() {
            addCriterion("recive_address is not null");
            return (Criteria) this;
        }

        public Criteria andReciveAddressEqualTo(String value) {
            addCriterion("recive_address =", value, "reciveAddress");
            return (Criteria) this;
        }

        public Criteria andReciveAddressNotEqualTo(String value) {
            addCriterion("recive_address <>", value, "reciveAddress");
            return (Criteria) this;
        }

        public Criteria andReciveAddressGreaterThan(String value) {
            addCriterion("recive_address >", value, "reciveAddress");
            return (Criteria) this;
        }

        public Criteria andReciveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("recive_address >=", value, "reciveAddress");
            return (Criteria) this;
        }

        public Criteria andReciveAddressLessThan(String value) {
            addCriterion("recive_address <", value, "reciveAddress");
            return (Criteria) this;
        }

        public Criteria andReciveAddressLessThanOrEqualTo(String value) {
            addCriterion("recive_address <=", value, "reciveAddress");
            return (Criteria) this;
        }

        public Criteria andReciveAddressLike(String value) {
            addCriterion("recive_address like", value, "reciveAddress");
            return (Criteria) this;
        }

        public Criteria andReciveAddressNotLike(String value) {
            addCriterion("recive_address not like", value, "reciveAddress");
            return (Criteria) this;
        }

        public Criteria andReciveAddressIn(List<String> values) {
            addCriterion("recive_address in", values, "reciveAddress");
            return (Criteria) this;
        }

        public Criteria andReciveAddressNotIn(List<String> values) {
            addCriterion("recive_address not in", values, "reciveAddress");
            return (Criteria) this;
        }

        public Criteria andReciveAddressBetween(String value1, String value2) {
            addCriterion("recive_address between", value1, value2, "reciveAddress");
            return (Criteria) this;
        }

        public Criteria andReciveAddressNotBetween(String value1, String value2) {
            addCriterion("recive_address not between", value1, value2, "reciveAddress");
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

        public Criteria andInvoiceNoIsNull() {
            addCriterion("invoice_no is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNotNull() {
            addCriterion("invoice_no is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoEqualTo(String value) {
            addCriterion("invoice_no =", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotEqualTo(String value) {
            addCriterion("invoice_no <>", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThan(String value) {
            addCriterion("invoice_no >", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_no >=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThan(String value) {
            addCriterion("invoice_no <", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThanOrEqualTo(String value) {
            addCriterion("invoice_no <=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLike(String value) {
            addCriterion("invoice_no like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotLike(String value) {
            addCriterion("invoice_no not like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIn(List<String> values) {
            addCriterion("invoice_no in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotIn(List<String> values) {
            addCriterion("invoice_no not in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoBetween(String value1, String value2) {
            addCriterion("invoice_no between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotBetween(String value1, String value2) {
            addCriterion("invoice_no not between", value1, value2, "invoiceNo");
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

        public Criteria andIsDelEqualTo(String value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(String value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(String value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(String value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(String value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(String value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLike(String value) {
            addCriterion("is_del like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotLike(String value) {
            addCriterion("is_del not like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<String> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<String> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(String value1, String value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(String value1, String value2) {
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