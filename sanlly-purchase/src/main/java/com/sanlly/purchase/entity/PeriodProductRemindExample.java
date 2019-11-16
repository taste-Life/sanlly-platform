package com.sanlly.purchase.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PeriodProductRemindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PeriodProductRemindExample() {
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

        public Criteria andPurcPeriodProductRemindIdIsNull() {
            addCriterion("purc_period_product_remind_id is null");
            return (Criteria) this;
        }

        public Criteria andPurcPeriodProductRemindIdIsNotNull() {
            addCriterion("purc_period_product_remind_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurcPeriodProductRemindIdEqualTo(Integer value) {
            addCriterion("purc_period_product_remind_id =", value, "purcPeriodProductRemindId");
            return (Criteria) this;
        }

        public Criteria andPurcPeriodProductRemindIdNotEqualTo(Integer value) {
            addCriterion("purc_period_product_remind_id <>", value, "purcPeriodProductRemindId");
            return (Criteria) this;
        }

        public Criteria andPurcPeriodProductRemindIdGreaterThan(Integer value) {
            addCriterion("purc_period_product_remind_id >", value, "purcPeriodProductRemindId");
            return (Criteria) this;
        }

        public Criteria andPurcPeriodProductRemindIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purc_period_product_remind_id >=", value, "purcPeriodProductRemindId");
            return (Criteria) this;
        }

        public Criteria andPurcPeriodProductRemindIdLessThan(Integer value) {
            addCriterion("purc_period_product_remind_id <", value, "purcPeriodProductRemindId");
            return (Criteria) this;
        }

        public Criteria andPurcPeriodProductRemindIdLessThanOrEqualTo(Integer value) {
            addCriterion("purc_period_product_remind_id <=", value, "purcPeriodProductRemindId");
            return (Criteria) this;
        }

        public Criteria andPurcPeriodProductRemindIdIn(List<Integer> values) {
            addCriterion("purc_period_product_remind_id in", values, "purcPeriodProductRemindId");
            return (Criteria) this;
        }

        public Criteria andPurcPeriodProductRemindIdNotIn(List<Integer> values) {
            addCriterion("purc_period_product_remind_id not in", values, "purcPeriodProductRemindId");
            return (Criteria) this;
        }

        public Criteria andPurcPeriodProductRemindIdBetween(Integer value1, Integer value2) {
            addCriterion("purc_period_product_remind_id between", value1, value2, "purcPeriodProductRemindId");
            return (Criteria) this;
        }

        public Criteria andPurcPeriodProductRemindIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purc_period_product_remind_id not between", value1, value2, "purcPeriodProductRemindId");
            return (Criteria) this;
        }

        public Criteria andTenderPurchaseIdIsNull() {
            addCriterion("tender_purchase_id is null");
            return (Criteria) this;
        }

        public Criteria andTenderPurchaseIdIsNotNull() {
            addCriterion("tender_purchase_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenderPurchaseIdEqualTo(Integer value) {
            addCriterion("tender_purchase_id =", value, "tenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andTenderPurchaseIdNotEqualTo(Integer value) {
            addCriterion("tender_purchase_id <>", value, "tenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andTenderPurchaseIdGreaterThan(Integer value) {
            addCriterion("tender_purchase_id >", value, "tenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andTenderPurchaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tender_purchase_id >=", value, "tenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andTenderPurchaseIdLessThan(Integer value) {
            addCriterion("tender_purchase_id <", value, "tenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andTenderPurchaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("tender_purchase_id <=", value, "tenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andTenderPurchaseIdIn(List<Integer> values) {
            addCriterion("tender_purchase_id in", values, "tenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andTenderPurchaseIdNotIn(List<Integer> values) {
            addCriterion("tender_purchase_id not in", values, "tenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andTenderPurchaseIdBetween(Integer value1, Integer value2) {
            addCriterion("tender_purchase_id between", value1, value2, "tenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andTenderPurchaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tender_purchase_id not between", value1, value2, "tenderPurchaseId");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNull() {
            addCriterion("product_num is null");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNotNull() {
            addCriterion("product_num is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumEqualTo(String value) {
            addCriterion("product_num =", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotEqualTo(String value) {
            addCriterion("product_num <>", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThan(String value) {
            addCriterion("product_num >", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThanOrEqualTo(String value) {
            addCriterion("product_num >=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThan(String value) {
            addCriterion("product_num <", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThanOrEqualTo(String value) {
            addCriterion("product_num <=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLike(String value) {
            addCriterion("product_num like", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotLike(String value) {
            addCriterion("product_num not like", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumIn(List<String> values) {
            addCriterion("product_num in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotIn(List<String> values) {
            addCriterion("product_num not in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumBetween(String value1, String value2) {
            addCriterion("product_num between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotBetween(String value1, String value2) {
            addCriterion("product_num not between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductIsNull() {
            addCriterion("product is null");
            return (Criteria) this;
        }

        public Criteria andProductIsNotNull() {
            addCriterion("product is not null");
            return (Criteria) this;
        }

        public Criteria andProductEqualTo(String value) {
            addCriterion("product =", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotEqualTo(String value) {
            addCriterion("product <>", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThan(String value) {
            addCriterion("product >", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThanOrEqualTo(String value) {
            addCriterion("product >=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThan(String value) {
            addCriterion("product <", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThanOrEqualTo(String value) {
            addCriterion("product <=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLike(String value) {
            addCriterion("product like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotLike(String value) {
            addCriterion("product not like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductIn(List<String> values) {
            addCriterion("product in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotIn(List<String> values) {
            addCriterion("product not in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductBetween(String value1, String value2) {
            addCriterion("product between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotBetween(String value1, String value2) {
            addCriterion("product not between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductBrandIsNull() {
            addCriterion("product_brand is null");
            return (Criteria) this;
        }

        public Criteria andProductBrandIsNotNull() {
            addCriterion("product_brand is not null");
            return (Criteria) this;
        }

        public Criteria andProductBrandEqualTo(String value) {
            addCriterion("product_brand =", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandNotEqualTo(String value) {
            addCriterion("product_brand <>", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandGreaterThan(String value) {
            addCriterion("product_brand >", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandGreaterThanOrEqualTo(String value) {
            addCriterion("product_brand >=", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandLessThan(String value) {
            addCriterion("product_brand <", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandLessThanOrEqualTo(String value) {
            addCriterion("product_brand <=", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandLike(String value) {
            addCriterion("product_brand like", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandNotLike(String value) {
            addCriterion("product_brand not like", value, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandIn(List<String> values) {
            addCriterion("product_brand in", values, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandNotIn(List<String> values) {
            addCriterion("product_brand not in", values, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandBetween(String value1, String value2) {
            addCriterion("product_brand between", value1, value2, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductBrandNotBetween(String value1, String value2) {
            addCriterion("product_brand not between", value1, value2, "productBrand");
            return (Criteria) this;
        }

        public Criteria andProductStandardsIsNull() {
            addCriterion("product_standards is null");
            return (Criteria) this;
        }

        public Criteria andProductStandardsIsNotNull() {
            addCriterion("product_standards is not null");
            return (Criteria) this;
        }

        public Criteria andProductStandardsEqualTo(String value) {
            addCriterion("product_standards =", value, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsNotEqualTo(String value) {
            addCriterion("product_standards <>", value, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsGreaterThan(String value) {
            addCriterion("product_standards >", value, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsGreaterThanOrEqualTo(String value) {
            addCriterion("product_standards >=", value, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsLessThan(String value) {
            addCriterion("product_standards <", value, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsLessThanOrEqualTo(String value) {
            addCriterion("product_standards <=", value, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsLike(String value) {
            addCriterion("product_standards like", value, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsNotLike(String value) {
            addCriterion("product_standards not like", value, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsIn(List<String> values) {
            addCriterion("product_standards in", values, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsNotIn(List<String> values) {
            addCriterion("product_standards not in", values, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsBetween(String value1, String value2) {
            addCriterion("product_standards between", value1, value2, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductStandardsNotBetween(String value1, String value2) {
            addCriterion("product_standards not between", value1, value2, "productStandards");
            return (Criteria) this;
        }

        public Criteria andProductModelIsNull() {
            addCriterion("product_model is null");
            return (Criteria) this;
        }

        public Criteria andProductModelIsNotNull() {
            addCriterion("product_model is not null");
            return (Criteria) this;
        }

        public Criteria andProductModelEqualTo(String value) {
            addCriterion("product_model =", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotEqualTo(String value) {
            addCriterion("product_model <>", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelGreaterThan(String value) {
            addCriterion("product_model >", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelGreaterThanOrEqualTo(String value) {
            addCriterion("product_model >=", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelLessThan(String value) {
            addCriterion("product_model <", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelLessThanOrEqualTo(String value) {
            addCriterion("product_model <=", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelLike(String value) {
            addCriterion("product_model like", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotLike(String value) {
            addCriterion("product_model not like", value, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelIn(List<String> values) {
            addCriterion("product_model in", values, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotIn(List<String> values) {
            addCriterion("product_model not in", values, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelBetween(String value1, String value2) {
            addCriterion("product_model between", value1, value2, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductModelNotBetween(String value1, String value2) {
            addCriterion("product_model not between", value1, value2, "productModel");
            return (Criteria) this;
        }

        public Criteria andProductUnitIsNull() {
            addCriterion("product_unit is null");
            return (Criteria) this;
        }

        public Criteria andProductUnitIsNotNull() {
            addCriterion("product_unit is not null");
            return (Criteria) this;
        }

        public Criteria andProductUnitEqualTo(String value) {
            addCriterion("product_unit =", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotEqualTo(String value) {
            addCriterion("product_unit <>", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitGreaterThan(String value) {
            addCriterion("product_unit >", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitGreaterThanOrEqualTo(String value) {
            addCriterion("product_unit >=", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLessThan(String value) {
            addCriterion("product_unit <", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLessThanOrEqualTo(String value) {
            addCriterion("product_unit <=", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLike(String value) {
            addCriterion("product_unit like", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotLike(String value) {
            addCriterion("product_unit not like", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitIn(List<String> values) {
            addCriterion("product_unit in", values, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotIn(List<String> values) {
            addCriterion("product_unit not in", values, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitBetween(String value1, String value2) {
            addCriterion("product_unit between", value1, value2, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotBetween(String value1, String value2) {
            addCriterion("product_unit not between", value1, value2, "productUnit");
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

        public Criteria andReciverAddressIsNull() {
            addCriterion("reciver_address is null");
            return (Criteria) this;
        }

        public Criteria andReciverAddressIsNotNull() {
            addCriterion("reciver_address is not null");
            return (Criteria) this;
        }

        public Criteria andReciverAddressEqualTo(String value) {
            addCriterion("reciver_address =", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressNotEqualTo(String value) {
            addCriterion("reciver_address <>", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressGreaterThan(String value) {
            addCriterion("reciver_address >", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("reciver_address >=", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressLessThan(String value) {
            addCriterion("reciver_address <", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressLessThanOrEqualTo(String value) {
            addCriterion("reciver_address <=", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressLike(String value) {
            addCriterion("reciver_address like", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressNotLike(String value) {
            addCriterion("reciver_address not like", value, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressIn(List<String> values) {
            addCriterion("reciver_address in", values, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressNotIn(List<String> values) {
            addCriterion("reciver_address not in", values, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressBetween(String value1, String value2) {
            addCriterion("reciver_address between", value1, value2, "reciverAddress");
            return (Criteria) this;
        }

        public Criteria andReciverAddressNotBetween(String value1, String value2) {
            addCriterion("reciver_address not between", value1, value2, "reciverAddress");
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

        public Criteria andPurchaseDeadlineIsNull() {
            addCriterion("purchase_deadline is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeadlineIsNotNull() {
            addCriterion("purchase_deadline is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeadlineEqualTo(Date value) {
            addCriterion("purchase_deadline =", value, "purchaseDeadline");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeadlineNotEqualTo(Date value) {
            addCriterion("purchase_deadline <>", value, "purchaseDeadline");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeadlineGreaterThan(Date value) {
            addCriterion("purchase_deadline >", value, "purchaseDeadline");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("purchase_deadline >=", value, "purchaseDeadline");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeadlineLessThan(Date value) {
            addCriterion("purchase_deadline <", value, "purchaseDeadline");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("purchase_deadline <=", value, "purchaseDeadline");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeadlineIn(List<Date> values) {
            addCriterion("purchase_deadline in", values, "purchaseDeadline");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeadlineNotIn(List<Date> values) {
            addCriterion("purchase_deadline not in", values, "purchaseDeadline");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeadlineBetween(Date value1, Date value2) {
            addCriterion("purchase_deadline between", value1, value2, "purchaseDeadline");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("purchase_deadline not between", value1, value2, "purchaseDeadline");
            return (Criteria) this;
        }

        public Criteria andLastPriceIsNull() {
            addCriterion("last_price is null");
            return (Criteria) this;
        }

        public Criteria andLastPriceIsNotNull() {
            addCriterion("last_price is not null");
            return (Criteria) this;
        }

        public Criteria andLastPriceEqualTo(BigDecimal value) {
            addCriterion("last_price =", value, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceNotEqualTo(BigDecimal value) {
            addCriterion("last_price <>", value, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceGreaterThan(BigDecimal value) {
            addCriterion("last_price >", value, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("last_price >=", value, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceLessThan(BigDecimal value) {
            addCriterion("last_price <", value, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("last_price <=", value, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceIn(List<BigDecimal> values) {
            addCriterion("last_price in", values, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceNotIn(List<BigDecimal> values) {
            addCriterion("last_price not in", values, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_price between", value1, value2, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_price not between", value1, value2, "lastPrice");
            return (Criteria) this;
        }

        public Criteria andLastTotalAmountIsNull() {
            addCriterion("last_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andLastTotalAmountIsNotNull() {
            addCriterion("last_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLastTotalAmountEqualTo(BigDecimal value) {
            addCriterion("last_total_amount =", value, "lastTotalAmount");
            return (Criteria) this;
        }

        public Criteria andLastTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("last_total_amount <>", value, "lastTotalAmount");
            return (Criteria) this;
        }

        public Criteria andLastTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("last_total_amount >", value, "lastTotalAmount");
            return (Criteria) this;
        }

        public Criteria andLastTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("last_total_amount >=", value, "lastTotalAmount");
            return (Criteria) this;
        }

        public Criteria andLastTotalAmountLessThan(BigDecimal value) {
            addCriterion("last_total_amount <", value, "lastTotalAmount");
            return (Criteria) this;
        }

        public Criteria andLastTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("last_total_amount <=", value, "lastTotalAmount");
            return (Criteria) this;
        }

        public Criteria andLastTotalAmountIn(List<BigDecimal> values) {
            addCriterion("last_total_amount in", values, "lastTotalAmount");
            return (Criteria) this;
        }

        public Criteria andLastTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("last_total_amount not in", values, "lastTotalAmount");
            return (Criteria) this;
        }

        public Criteria andLastTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_total_amount between", value1, value2, "lastTotalAmount");
            return (Criteria) this;
        }

        public Criteria andLastTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_total_amount not between", value1, value2, "lastTotalAmount");
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