package com.sanlly.purchase.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatterDemandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MatterDemandExample() {
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

        public Criteria andPurcMatterDemandIdIsNull() {
            addCriterion("purc_matter_demand_id is null");
            return (Criteria) this;
        }

        public Criteria andPurcMatterDemandIdIsNotNull() {
            addCriterion("purc_matter_demand_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurcMatterDemandIdEqualTo(Integer value) {
            addCriterion("purc_matter_demand_id =", value, "purcMatterDemandId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterDemandIdNotEqualTo(Integer value) {
            addCriterion("purc_matter_demand_id <>", value, "purcMatterDemandId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterDemandIdGreaterThan(Integer value) {
            addCriterion("purc_matter_demand_id >", value, "purcMatterDemandId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterDemandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purc_matter_demand_id >=", value, "purcMatterDemandId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterDemandIdLessThan(Integer value) {
            addCriterion("purc_matter_demand_id <", value, "purcMatterDemandId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterDemandIdLessThanOrEqualTo(Integer value) {
            addCriterion("purc_matter_demand_id <=", value, "purcMatterDemandId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterDemandIdIn(List<Integer> values) {
            addCriterion("purc_matter_demand_id in", values, "purcMatterDemandId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterDemandIdNotIn(List<Integer> values) {
            addCriterion("purc_matter_demand_id not in", values, "purcMatterDemandId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterDemandIdBetween(Integer value1, Integer value2) {
            addCriterion("purc_matter_demand_id between", value1, value2, "purcMatterDemandId");
            return (Criteria) this;
        }

        public Criteria andPurcMatterDemandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purc_matter_demand_id not between", value1, value2, "purcMatterDemandId");
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

        public Criteria andGenaralTypeIsNull() {
            addCriterion("genaral_type is null");
            return (Criteria) this;
        }

        public Criteria andGenaralTypeIsNotNull() {
            addCriterion("genaral_type is not null");
            return (Criteria) this;
        }

        public Criteria andGenaralTypeEqualTo(String value) {
            addCriterion("genaral_type =", value, "genaralType");
            return (Criteria) this;
        }

        public Criteria andGenaralTypeNotEqualTo(String value) {
            addCriterion("genaral_type <>", value, "genaralType");
            return (Criteria) this;
        }

        public Criteria andGenaralTypeGreaterThan(String value) {
            addCriterion("genaral_type >", value, "genaralType");
            return (Criteria) this;
        }

        public Criteria andGenaralTypeGreaterThanOrEqualTo(String value) {
            addCriterion("genaral_type >=", value, "genaralType");
            return (Criteria) this;
        }

        public Criteria andGenaralTypeLessThan(String value) {
            addCriterion("genaral_type <", value, "genaralType");
            return (Criteria) this;
        }

        public Criteria andGenaralTypeLessThanOrEqualTo(String value) {
            addCriterion("genaral_type <=", value, "genaralType");
            return (Criteria) this;
        }

        public Criteria andGenaralTypeLike(String value) {
            addCriterion("genaral_type like", value, "genaralType");
            return (Criteria) this;
        }

        public Criteria andGenaralTypeNotLike(String value) {
            addCriterion("genaral_type not like", value, "genaralType");
            return (Criteria) this;
        }

        public Criteria andGenaralTypeIn(List<String> values) {
            addCriterion("genaral_type in", values, "genaralType");
            return (Criteria) this;
        }

        public Criteria andGenaralTypeNotIn(List<String> values) {
            addCriterion("genaral_type not in", values, "genaralType");
            return (Criteria) this;
        }

        public Criteria andGenaralTypeBetween(String value1, String value2) {
            addCriterion("genaral_type between", value1, value2, "genaralType");
            return (Criteria) this;
        }

        public Criteria andGenaralTypeNotBetween(String value1, String value2) {
            addCriterion("genaral_type not between", value1, value2, "genaralType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeIsNull() {
            addCriterion("second_type is null");
            return (Criteria) this;
        }

        public Criteria andSecondTypeIsNotNull() {
            addCriterion("second_type is not null");
            return (Criteria) this;
        }

        public Criteria andSecondTypeEqualTo(String value) {
            addCriterion("second_type =", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNotEqualTo(String value) {
            addCriterion("second_type <>", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeGreaterThan(String value) {
            addCriterion("second_type >", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeGreaterThanOrEqualTo(String value) {
            addCriterion("second_type >=", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeLessThan(String value) {
            addCriterion("second_type <", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeLessThanOrEqualTo(String value) {
            addCriterion("second_type <=", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeLike(String value) {
            addCriterion("second_type like", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNotLike(String value) {
            addCriterion("second_type not like", value, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeIn(List<String> values) {
            addCriterion("second_type in", values, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNotIn(List<String> values) {
            addCriterion("second_type not in", values, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeBetween(String value1, String value2) {
            addCriterion("second_type between", value1, value2, "secondType");
            return (Criteria) this;
        }

        public Criteria andSecondTypeNotBetween(String value1, String value2) {
            addCriterion("second_type not between", value1, value2, "secondType");
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

        public Criteria andRequireArriveTimeIsNull() {
            addCriterion("require_arrive_time is null");
            return (Criteria) this;
        }

        public Criteria andRequireArriveTimeIsNotNull() {
            addCriterion("require_arrive_time is not null");
            return (Criteria) this;
        }

        public Criteria andRequireArriveTimeEqualTo(Date value) {
            addCriterion("require_arrive_time =", value, "requireArriveTime");
            return (Criteria) this;
        }

        public Criteria andRequireArriveTimeNotEqualTo(Date value) {
            addCriterion("require_arrive_time <>", value, "requireArriveTime");
            return (Criteria) this;
        }

        public Criteria andRequireArriveTimeGreaterThan(Date value) {
            addCriterion("require_arrive_time >", value, "requireArriveTime");
            return (Criteria) this;
        }

        public Criteria andRequireArriveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("require_arrive_time >=", value, "requireArriveTime");
            return (Criteria) this;
        }

        public Criteria andRequireArriveTimeLessThan(Date value) {
            addCriterion("require_arrive_time <", value, "requireArriveTime");
            return (Criteria) this;
        }

        public Criteria andRequireArriveTimeLessThanOrEqualTo(Date value) {
            addCriterion("require_arrive_time <=", value, "requireArriveTime");
            return (Criteria) this;
        }

        public Criteria andRequireArriveTimeIn(List<Date> values) {
            addCriterion("require_arrive_time in", values, "requireArriveTime");
            return (Criteria) this;
        }

        public Criteria andRequireArriveTimeNotIn(List<Date> values) {
            addCriterion("require_arrive_time not in", values, "requireArriveTime");
            return (Criteria) this;
        }

        public Criteria andRequireArriveTimeBetween(Date value1, Date value2) {
            addCriterion("require_arrive_time between", value1, value2, "requireArriveTime");
            return (Criteria) this;
        }

        public Criteria andRequireArriveTimeNotBetween(Date value1, Date value2) {
            addCriterion("require_arrive_time not between", value1, value2, "requireArriveTime");
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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

        public Criteria andTenderTypeIsNull() {
            addCriterion("tender_type is null");
            return (Criteria) this;
        }

        public Criteria andTenderTypeIsNotNull() {
            addCriterion("tender_type is not null");
            return (Criteria) this;
        }

        public Criteria andTenderTypeEqualTo(String value) {
            addCriterion("tender_type =", value, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeNotEqualTo(String value) {
            addCriterion("tender_type <>", value, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeGreaterThan(String value) {
            addCriterion("tender_type >", value, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tender_type >=", value, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeLessThan(String value) {
            addCriterion("tender_type <", value, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeLessThanOrEqualTo(String value) {
            addCriterion("tender_type <=", value, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeLike(String value) {
            addCriterion("tender_type like", value, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeNotLike(String value) {
            addCriterion("tender_type not like", value, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeIn(List<String> values) {
            addCriterion("tender_type in", values, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeNotIn(List<String> values) {
            addCriterion("tender_type not in", values, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeBetween(String value1, String value2) {
            addCriterion("tender_type between", value1, value2, "tenderType");
            return (Criteria) this;
        }

        public Criteria andTenderTypeNotBetween(String value1, String value2) {
            addCriterion("tender_type not between", value1, value2, "tenderType");
            return (Criteria) this;
        }

        public Criteria andPurchasingPatternIsNull() {
            addCriterion("purchasing_pattern is null");
            return (Criteria) this;
        }

        public Criteria andPurchasingPatternIsNotNull() {
            addCriterion("purchasing_pattern is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasingPatternEqualTo(String value) {
            addCriterion("purchasing_pattern =", value, "purchasingPattern");
            return (Criteria) this;
        }

        public Criteria andPurchasingPatternNotEqualTo(String value) {
            addCriterion("purchasing_pattern <>", value, "purchasingPattern");
            return (Criteria) this;
        }

        public Criteria andPurchasingPatternGreaterThan(String value) {
            addCriterion("purchasing_pattern >", value, "purchasingPattern");
            return (Criteria) this;
        }

        public Criteria andPurchasingPatternGreaterThanOrEqualTo(String value) {
            addCriterion("purchasing_pattern >=", value, "purchasingPattern");
            return (Criteria) this;
        }

        public Criteria andPurchasingPatternLessThan(String value) {
            addCriterion("purchasing_pattern <", value, "purchasingPattern");
            return (Criteria) this;
        }

        public Criteria andPurchasingPatternLessThanOrEqualTo(String value) {
            addCriterion("purchasing_pattern <=", value, "purchasingPattern");
            return (Criteria) this;
        }

        public Criteria andPurchasingPatternLike(String value) {
            addCriterion("purchasing_pattern like", value, "purchasingPattern");
            return (Criteria) this;
        }

        public Criteria andPurchasingPatternNotLike(String value) {
            addCriterion("purchasing_pattern not like", value, "purchasingPattern");
            return (Criteria) this;
        }

        public Criteria andPurchasingPatternIn(List<String> values) {
            addCriterion("purchasing_pattern in", values, "purchasingPattern");
            return (Criteria) this;
        }

        public Criteria andPurchasingPatternNotIn(List<String> values) {
            addCriterion("purchasing_pattern not in", values, "purchasingPattern");
            return (Criteria) this;
        }

        public Criteria andPurchasingPatternBetween(String value1, String value2) {
            addCriterion("purchasing_pattern between", value1, value2, "purchasingPattern");
            return (Criteria) this;
        }

        public Criteria andPurchasingPatternNotBetween(String value1, String value2) {
            addCriterion("purchasing_pattern not between", value1, value2, "purchasingPattern");
            return (Criteria) this;
        }

        public Criteria andIsPeriodProductIsNull() {
            addCriterion("is_period_product is null");
            return (Criteria) this;
        }

        public Criteria andIsPeriodProductIsNotNull() {
            addCriterion("is_period_product is not null");
            return (Criteria) this;
        }

        public Criteria andIsPeriodProductEqualTo(String value) {
            addCriterion("is_period_product =", value, "isPeriodProduct");
            return (Criteria) this;
        }

        public Criteria andIsPeriodProductNotEqualTo(String value) {
            addCriterion("is_period_product <>", value, "isPeriodProduct");
            return (Criteria) this;
        }

        public Criteria andIsPeriodProductGreaterThan(String value) {
            addCriterion("is_period_product >", value, "isPeriodProduct");
            return (Criteria) this;
        }

        public Criteria andIsPeriodProductGreaterThanOrEqualTo(String value) {
            addCriterion("is_period_product >=", value, "isPeriodProduct");
            return (Criteria) this;
        }

        public Criteria andIsPeriodProductLessThan(String value) {
            addCriterion("is_period_product <", value, "isPeriodProduct");
            return (Criteria) this;
        }

        public Criteria andIsPeriodProductLessThanOrEqualTo(String value) {
            addCriterion("is_period_product <=", value, "isPeriodProduct");
            return (Criteria) this;
        }

        public Criteria andIsPeriodProductLike(String value) {
            addCriterion("is_period_product like", value, "isPeriodProduct");
            return (Criteria) this;
        }

        public Criteria andIsPeriodProductNotLike(String value) {
            addCriterion("is_period_product not like", value, "isPeriodProduct");
            return (Criteria) this;
        }

        public Criteria andIsPeriodProductIn(List<String> values) {
            addCriterion("is_period_product in", values, "isPeriodProduct");
            return (Criteria) this;
        }

        public Criteria andIsPeriodProductNotIn(List<String> values) {
            addCriterion("is_period_product not in", values, "isPeriodProduct");
            return (Criteria) this;
        }

        public Criteria andIsPeriodProductBetween(String value1, String value2) {
            addCriterion("is_period_product between", value1, value2, "isPeriodProduct");
            return (Criteria) this;
        }

        public Criteria andIsPeriodProductNotBetween(String value1, String value2) {
            addCriterion("is_period_product not between", value1, value2, "isPeriodProduct");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdIsNull() {
            addCriterion("applicant_user_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdIsNotNull() {
            addCriterion("applicant_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdEqualTo(Integer value) {
            addCriterion("applicant_user_id =", value, "applicantUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdNotEqualTo(Integer value) {
            addCriterion("applicant_user_id <>", value, "applicantUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdGreaterThan(Integer value) {
            addCriterion("applicant_user_id >", value, "applicantUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("applicant_user_id >=", value, "applicantUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdLessThan(Integer value) {
            addCriterion("applicant_user_id <", value, "applicantUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("applicant_user_id <=", value, "applicantUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdIn(List<Integer> values) {
            addCriterion("applicant_user_id in", values, "applicantUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdNotIn(List<Integer> values) {
            addCriterion("applicant_user_id not in", values, "applicantUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdBetween(Integer value1, Integer value2) {
            addCriterion("applicant_user_id between", value1, value2, "applicantUserId");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("applicant_user_id not between", value1, value2, "applicantUserId");
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

        public Criteria andDemandTimeIsNull() {
            addCriterion("demand_time is null");
            return (Criteria) this;
        }

        public Criteria andDemandTimeIsNotNull() {
            addCriterion("demand_time is not null");
            return (Criteria) this;
        }

        public Criteria andDemandTimeEqualTo(Date value) {
            addCriterion("demand_time =", value, "demandTime");
            return (Criteria) this;
        }

        public Criteria andDemandTimeNotEqualTo(Date value) {
            addCriterion("demand_time <>", value, "demandTime");
            return (Criteria) this;
        }

        public Criteria andDemandTimeGreaterThan(Date value) {
            addCriterion("demand_time >", value, "demandTime");
            return (Criteria) this;
        }

        public Criteria andDemandTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("demand_time >=", value, "demandTime");
            return (Criteria) this;
        }

        public Criteria andDemandTimeLessThan(Date value) {
            addCriterion("demand_time <", value, "demandTime");
            return (Criteria) this;
        }

        public Criteria andDemandTimeLessThanOrEqualTo(Date value) {
            addCriterion("demand_time <=", value, "demandTime");
            return (Criteria) this;
        }

        public Criteria andDemandTimeIn(List<Date> values) {
            addCriterion("demand_time in", values, "demandTime");
            return (Criteria) this;
        }

        public Criteria andDemandTimeNotIn(List<Date> values) {
            addCriterion("demand_time not in", values, "demandTime");
            return (Criteria) this;
        }

        public Criteria andDemandTimeBetween(Date value1, Date value2) {
            addCriterion("demand_time between", value1, value2, "demandTime");
            return (Criteria) this;
        }

        public Criteria andDemandTimeNotBetween(Date value1, Date value2) {
            addCriterion("demand_time not between", value1, value2, "demandTime");
            return (Criteria) this;
        }

        public Criteria andIsCreateOrderIsNull() {
            addCriterion("is_create_order is null");
            return (Criteria) this;
        }

        public Criteria andIsCreateOrderIsNotNull() {
            addCriterion("is_create_order is not null");
            return (Criteria) this;
        }

        public Criteria andIsCreateOrderEqualTo(String value) {
            addCriterion("is_create_order =", value, "isCreateOrder");
            return (Criteria) this;
        }

        public Criteria andIsCreateOrderNotEqualTo(String value) {
            addCriterion("is_create_order <>", value, "isCreateOrder");
            return (Criteria) this;
        }

        public Criteria andIsCreateOrderGreaterThan(String value) {
            addCriterion("is_create_order >", value, "isCreateOrder");
            return (Criteria) this;
        }

        public Criteria andIsCreateOrderGreaterThanOrEqualTo(String value) {
            addCriterion("is_create_order >=", value, "isCreateOrder");
            return (Criteria) this;
        }

        public Criteria andIsCreateOrderLessThan(String value) {
            addCriterion("is_create_order <", value, "isCreateOrder");
            return (Criteria) this;
        }

        public Criteria andIsCreateOrderLessThanOrEqualTo(String value) {
            addCriterion("is_create_order <=", value, "isCreateOrder");
            return (Criteria) this;
        }

        public Criteria andIsCreateOrderLike(String value) {
            addCriterion("is_create_order like", value, "isCreateOrder");
            return (Criteria) this;
        }

        public Criteria andIsCreateOrderNotLike(String value) {
            addCriterion("is_create_order not like", value, "isCreateOrder");
            return (Criteria) this;
        }

        public Criteria andIsCreateOrderIn(List<String> values) {
            addCriterion("is_create_order in", values, "isCreateOrder");
            return (Criteria) this;
        }

        public Criteria andIsCreateOrderNotIn(List<String> values) {
            addCriterion("is_create_order not in", values, "isCreateOrder");
            return (Criteria) this;
        }

        public Criteria andIsCreateOrderBetween(String value1, String value2) {
            addCriterion("is_create_order between", value1, value2, "isCreateOrder");
            return (Criteria) this;
        }

        public Criteria andIsCreateOrderNotBetween(String value1, String value2) {
            addCriterion("is_create_order not between", value1, value2, "isCreateOrder");
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

        public Criteria andIsPeriodIsNull() {
            addCriterion("is_period is null");
            return (Criteria) this;
        }

        public Criteria andIsPeriodIsNotNull() {
            addCriterion("is_period is not null");
            return (Criteria) this;
        }

        public Criteria andIsPeriodEqualTo(String value) {
            addCriterion("is_period =", value, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodNotEqualTo(String value) {
            addCriterion("is_period <>", value, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodGreaterThan(String value) {
            addCriterion("is_period >", value, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("is_period >=", value, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodLessThan(String value) {
            addCriterion("is_period <", value, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodLessThanOrEqualTo(String value) {
            addCriterion("is_period <=", value, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodLike(String value) {
            addCriterion("is_period like", value, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodNotLike(String value) {
            addCriterion("is_period not like", value, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodIn(List<String> values) {
            addCriterion("is_period in", values, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodNotIn(List<String> values) {
            addCriterion("is_period not in", values, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodBetween(String value1, String value2) {
            addCriterion("is_period between", value1, value2, "isPeriod");
            return (Criteria) this;
        }

        public Criteria andIsPeriodNotBetween(String value1, String value2) {
            addCriterion("is_period not between", value1, value2, "isPeriod");
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