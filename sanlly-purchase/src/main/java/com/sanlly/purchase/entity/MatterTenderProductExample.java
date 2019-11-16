package com.sanlly.purchase.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatterTenderProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MatterTenderProductExample() {
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

        public Criteria andPurcMatterTenderProductIdIsNull() {
            addCriterion("purc_matter_tender_product_id is null");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderProductIdIsNotNull() {
            addCriterion("purc_matter_tender_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderProductIdEqualTo(Integer value) {
            addCriterion("purc_matter_tender_product_id =", value, "purcMatterTenderProductId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderProductIdNotEqualTo(Integer value) {
            addCriterion("purc_matter_tender_product_id <>", value, "purcMatterTenderProductId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderProductIdGreaterThan(Integer value) {
            addCriterion("purc_matter_tender_product_id >", value, "purcMatterTenderProductId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purc_matter_tender_product_id >=", value, "purcMatterTenderProductId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderProductIdLessThan(Integer value) {
            addCriterion("purc_matter_tender_product_id <", value, "purcMatterTenderProductId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("purc_matter_tender_product_id <=", value, "purcMatterTenderProductId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderProductIdIn(List<Integer> values) {
            addCriterion("purc_matter_tender_product_id in", values, "purcMatterTenderProductId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderProductIdNotIn(List<Integer> values) {
            addCriterion("purc_matter_tender_product_id not in", values, "purcMatterTenderProductId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderProductIdBetween(Integer value1, Integer value2) {
            addCriterion("purc_matter_tender_product_id between", value1, value2, "purcMatterTenderProductId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterTenderProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purc_matter_tender_product_id not between", value1, value2, "purcMatterTenderProductId");
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

        public Criteria andDemandNoIsNull() {
            addCriterion("demand_no is null");
            return (Criteria) this;
        }

        public Criteria andDemandNoIsNotNull() {
            addCriterion("demand_no is not null");
            return (Criteria) this;
        }

        public Criteria andDemandNoEqualTo(String value) {
            addCriterion("demand_no =", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoNotEqualTo(String value) {
            addCriterion("demand_no <>", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoGreaterThan(String value) {
            addCriterion("demand_no >", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoGreaterThanOrEqualTo(String value) {
            addCriterion("demand_no >=", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoLessThan(String value) {
            addCriterion("demand_no <", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoLessThanOrEqualTo(String value) {
            addCriterion("demand_no <=", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoLike(String value) {
            addCriterion("demand_no like", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoNotLike(String value) {
            addCriterion("demand_no not like", value, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoIn(List<String> values) {
            addCriterion("demand_no in", values, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoNotIn(List<String> values) {
            addCriterion("demand_no not in", values, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoBetween(String value1, String value2) {
            addCriterion("demand_no between", value1, value2, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandNoNotBetween(String value1, String value2) {
            addCriterion("demand_no not between", value1, value2, "demandNo");
            return (Criteria) this;
        }

        public Criteria andDemandUserIdIsNull() {
            addCriterion("demand_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDemandUserIdIsNotNull() {
            addCriterion("demand_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDemandUserIdEqualTo(Integer value) {
            addCriterion("demand_user_id =", value, "demandUserId");
            return (Criteria) this;
        }

        public Criteria andDemandUserIdNotEqualTo(Integer value) {
            addCriterion("demand_user_id <>", value, "demandUserId");
            return (Criteria) this;
        }

        public Criteria andDemandUserIdGreaterThan(Integer value) {
            addCriterion("demand_user_id >", value, "demandUserId");
            return (Criteria) this;
        }

        public Criteria andDemandUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_user_id >=", value, "demandUserId");
            return (Criteria) this;
        }

        public Criteria andDemandUserIdLessThan(Integer value) {
            addCriterion("demand_user_id <", value, "demandUserId");
            return (Criteria) this;
        }

        public Criteria andDemandUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("demand_user_id <=", value, "demandUserId");
            return (Criteria) this;
        }

        public Criteria andDemandUserIdIn(List<Integer> values) {
            addCriterion("demand_user_id in", values, "demandUserId");
            return (Criteria) this;
        }

        public Criteria andDemandUserIdNotIn(List<Integer> values) {
            addCriterion("demand_user_id not in", values, "demandUserId");
            return (Criteria) this;
        }

        public Criteria andDemandUserIdBetween(Integer value1, Integer value2) {
            addCriterion("demand_user_id between", value1, value2, "demandUserId");
            return (Criteria) this;
        }

        public Criteria andDemandUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_user_id not between", value1, value2, "demandUserId");
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

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
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

        public Criteria andProductSpecialIsNull() {
            addCriterion("product_special is null");
            return (Criteria) this;
        }

        public Criteria andProductSpecialIsNotNull() {
            addCriterion("product_special is not null");
            return (Criteria) this;
        }

        public Criteria andProductSpecialEqualTo(String value) {
            addCriterion("product_special =", value, "productSpecial");
            return (Criteria) this;
        }

        public Criteria andProductSpecialNotEqualTo(String value) {
            addCriterion("product_special <>", value, "productSpecial");
            return (Criteria) this;
        }

        public Criteria andProductSpecialGreaterThan(String value) {
            addCriterion("product_special >", value, "productSpecial");
            return (Criteria) this;
        }

        public Criteria andProductSpecialGreaterThanOrEqualTo(String value) {
            addCriterion("product_special >=", value, "productSpecial");
            return (Criteria) this;
        }

        public Criteria andProductSpecialLessThan(String value) {
            addCriterion("product_special <", value, "productSpecial");
            return (Criteria) this;
        }

        public Criteria andProductSpecialLessThanOrEqualTo(String value) {
            addCriterion("product_special <=", value, "productSpecial");
            return (Criteria) this;
        }

        public Criteria andProductSpecialLike(String value) {
            addCriterion("product_special like", value, "productSpecial");
            return (Criteria) this;
        }

        public Criteria andProductSpecialNotLike(String value) {
            addCriterion("product_special not like", value, "productSpecial");
            return (Criteria) this;
        }

        public Criteria andProductSpecialIn(List<String> values) {
            addCriterion("product_special in", values, "productSpecial");
            return (Criteria) this;
        }

        public Criteria andProductSpecialNotIn(List<String> values) {
            addCriterion("product_special not in", values, "productSpecial");
            return (Criteria) this;
        }

        public Criteria andProductSpecialBetween(String value1, String value2) {
            addCriterion("product_special between", value1, value2, "productSpecial");
            return (Criteria) this;
        }

        public Criteria andProductSpecialNotBetween(String value1, String value2) {
            addCriterion("product_special not between", value1, value2, "productSpecial");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
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

        public Criteria andProductCountIsNull() {
            addCriterion("product_count is null");
            return (Criteria) this;
        }

        public Criteria andProductCountIsNotNull() {
            addCriterion("product_count is not null");
            return (Criteria) this;
        }

        public Criteria andProductCountEqualTo(Double value) {
            addCriterion("product_count =", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotEqualTo(Double value) {
            addCriterion("product_count <>", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThan(Double value) {
            addCriterion("product_count >", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThanOrEqualTo(Double value) {
            addCriterion("product_count >=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThan(Double value) {
            addCriterion("product_count <", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThanOrEqualTo(Double value) {
            addCriterion("product_count <=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountIn(List<Double> values) {
            addCriterion("product_count in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotIn(List<Double> values) {
            addCriterion("product_count not in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountBetween(Double value1, Double value2) {
            addCriterion("product_count between", value1, value2, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotBetween(Double value1, Double value2) {
            addCriterion("product_count not between", value1, value2, "productCount");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(Date value) {
            addCriterion("delivery_time =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(Date value) {
            addCriterion("delivery_time <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(Date value) {
            addCriterion("delivery_time >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delivery_time >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(Date value) {
            addCriterion("delivery_time <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("delivery_time <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<Date> values) {
            addCriterion("delivery_time in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<Date> values) {
            addCriterion("delivery_time not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(Date value1, Date value2) {
            addCriterion("delivery_time between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("delivery_time not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andSupplierDeliveryTimeIsNull() {
            addCriterion("supplier_delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andSupplierDeliveryTimeIsNotNull() {
            addCriterion("supplier_delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierDeliveryTimeEqualTo(Date value) {
            addCriterion("supplier_delivery_time =", value, "supplierDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andSupplierDeliveryTimeNotEqualTo(Date value) {
            addCriterion("supplier_delivery_time <>", value, "supplierDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andSupplierDeliveryTimeGreaterThan(Date value) {
            addCriterion("supplier_delivery_time >", value, "supplierDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andSupplierDeliveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("supplier_delivery_time >=", value, "supplierDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andSupplierDeliveryTimeLessThan(Date value) {
            addCriterion("supplier_delivery_time <", value, "supplierDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andSupplierDeliveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("supplier_delivery_time <=", value, "supplierDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andSupplierDeliveryTimeIn(List<Date> values) {
            addCriterion("supplier_delivery_time in", values, "supplierDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andSupplierDeliveryTimeNotIn(List<Date> values) {
            addCriterion("supplier_delivery_time not in", values, "supplierDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andSupplierDeliveryTimeBetween(Date value1, Date value2) {
            addCriterion("supplier_delivery_time between", value1, value2, "supplierDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andSupplierDeliveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("supplier_delivery_time not between", value1, value2, "supplierDeliveryTime");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNull() {
            addCriterion("warehouse is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNotNull() {
            addCriterion("warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseEqualTo(String value) {
            addCriterion("warehouse =", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotEqualTo(String value) {
            addCriterion("warehouse <>", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThan(String value) {
            addCriterion("warehouse >", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse >=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThan(String value) {
            addCriterion("warehouse <", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThanOrEqualTo(String value) {
            addCriterion("warehouse <=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLike(String value) {
            addCriterion("warehouse like", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotLike(String value) {
            addCriterion("warehouse not like", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseIn(List<String> values) {
            addCriterion("warehouse in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotIn(List<String> values) {
            addCriterion("warehouse not in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseBetween(String value1, String value2) {
            addCriterion("warehouse between", value1, value2, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotBetween(String value1, String value2) {
            addCriterion("warehouse not between", value1, value2, "warehouse");
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

        public Criteria andPurchasingReferencePriceIsNull() {
            addCriterion("purchasing_reference_price is null");
            return (Criteria) this;
        }

        public Criteria andPurchasingReferencePriceIsNotNull() {
            addCriterion("purchasing_reference_price is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasingReferencePriceEqualTo(BigDecimal value) {
            addCriterion("purchasing_reference_price =", value, "purchasingReferencePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasingReferencePriceNotEqualTo(BigDecimal value) {
            addCriterion("purchasing_reference_price <>", value, "purchasingReferencePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasingReferencePriceGreaterThan(BigDecimal value) {
            addCriterion("purchasing_reference_price >", value, "purchasingReferencePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasingReferencePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchasing_reference_price >=", value, "purchasingReferencePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasingReferencePriceLessThan(BigDecimal value) {
            addCriterion("purchasing_reference_price <", value, "purchasingReferencePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasingReferencePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchasing_reference_price <=", value, "purchasingReferencePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasingReferencePriceIn(List<BigDecimal> values) {
            addCriterion("purchasing_reference_price in", values, "purchasingReferencePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasingReferencePriceNotIn(List<BigDecimal> values) {
            addCriterion("purchasing_reference_price not in", values, "purchasingReferencePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasingReferencePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchasing_reference_price between", value1, value2, "purchasingReferencePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasingReferencePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchasing_reference_price not between", value1, value2, "purchasingReferencePrice");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
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

        public Criteria andWarehouseAddressIsNull() {
            addCriterion("warehouse_address is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressIsNotNull() {
            addCriterion("warehouse_address is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressEqualTo(String value) {
            addCriterion("warehouse_address =", value, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressNotEqualTo(String value) {
            addCriterion("warehouse_address <>", value, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressGreaterThan(String value) {
            addCriterion("warehouse_address >", value, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_address >=", value, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressLessThan(String value) {
            addCriterion("warehouse_address <", value, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressLessThanOrEqualTo(String value) {
            addCriterion("warehouse_address <=", value, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressLike(String value) {
            addCriterion("warehouse_address like", value, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressNotLike(String value) {
            addCriterion("warehouse_address not like", value, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressIn(List<String> values) {
            addCriterion("warehouse_address in", values, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressNotIn(List<String> values) {
            addCriterion("warehouse_address not in", values, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressBetween(String value1, String value2) {
            addCriterion("warehouse_address between", value1, value2, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseAddressNotBetween(String value1, String value2) {
            addCriterion("warehouse_address not between", value1, value2, "warehouseAddress");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitIsNull() {
            addCriterion("spare_parts_unit is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitIsNotNull() {
            addCriterion("spare_parts_unit is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitEqualTo(String value) {
            addCriterion("spare_parts_unit =", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitNotEqualTo(String value) {
            addCriterion("spare_parts_unit <>", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitGreaterThan(String value) {
            addCriterion("spare_parts_unit >", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_unit >=", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitLessThan(String value) {
            addCriterion("spare_parts_unit <", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_unit <=", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitLike(String value) {
            addCriterion("spare_parts_unit like", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitNotLike(String value) {
            addCriterion("spare_parts_unit not like", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitIn(List<String> values) {
            addCriterion("spare_parts_unit in", values, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitNotIn(List<String> values) {
            addCriterion("spare_parts_unit not in", values, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitBetween(String value1, String value2) {
            addCriterion("spare_parts_unit between", value1, value2, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitNotBetween(String value1, String value2) {
            addCriterion("spare_parts_unit not between", value1, value2, "sparePartsUnit");
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

        public Criteria andSelectSupplierIsNull() {
            addCriterion("select_supplier is null");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierIsNotNull() {
            addCriterion("select_supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierEqualTo(String value) {
            addCriterion("select_supplier =", value, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierNotEqualTo(String value) {
            addCriterion("select_supplier <>", value, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierGreaterThan(String value) {
            addCriterion("select_supplier >", value, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("select_supplier >=", value, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierLessThan(String value) {
            addCriterion("select_supplier <", value, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierLessThanOrEqualTo(String value) {
            addCriterion("select_supplier <=", value, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierLike(String value) {
            addCriterion("select_supplier like", value, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierNotLike(String value) {
            addCriterion("select_supplier not like", value, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierIn(List<String> values) {
            addCriterion("select_supplier in", values, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierNotIn(List<String> values) {
            addCriterion("select_supplier not in", values, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierBetween(String value1, String value2) {
            addCriterion("select_supplier between", value1, value2, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andSelectSupplierNotBetween(String value1, String value2) {
            addCriterion("select_supplier not between", value1, value2, "selectSupplier");
            return (Criteria) this;
        }

        public Criteria andNoTaxPriceIsNull() {
            addCriterion("no_tax_price is null");
            return (Criteria) this;
        }

        public Criteria andNoTaxPriceIsNotNull() {
            addCriterion("no_tax_price is not null");
            return (Criteria) this;
        }

        public Criteria andNoTaxPriceEqualTo(BigDecimal value) {
            addCriterion("no_tax_price =", value, "noTaxPrice");
            return (Criteria) this;
        }

        public Criteria andNoTaxPriceNotEqualTo(BigDecimal value) {
            addCriterion("no_tax_price <>", value, "noTaxPrice");
            return (Criteria) this;
        }

        public Criteria andNoTaxPriceGreaterThan(BigDecimal value) {
            addCriterion("no_tax_price >", value, "noTaxPrice");
            return (Criteria) this;
        }

        public Criteria andNoTaxPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("no_tax_price >=", value, "noTaxPrice");
            return (Criteria) this;
        }

        public Criteria andNoTaxPriceLessThan(BigDecimal value) {
            addCriterion("no_tax_price <", value, "noTaxPrice");
            return (Criteria) this;
        }

        public Criteria andNoTaxPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("no_tax_price <=", value, "noTaxPrice");
            return (Criteria) this;
        }

        public Criteria andNoTaxPriceIn(List<BigDecimal> values) {
            addCriterion("no_tax_price in", values, "noTaxPrice");
            return (Criteria) this;
        }

        public Criteria andNoTaxPriceNotIn(List<BigDecimal> values) {
            addCriterion("no_tax_price not in", values, "noTaxPrice");
            return (Criteria) this;
        }

        public Criteria andNoTaxPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("no_tax_price between", value1, value2, "noTaxPrice");
            return (Criteria) this;
        }

        public Criteria andNoTaxPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("no_tax_price not between", value1, value2, "noTaxPrice");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
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