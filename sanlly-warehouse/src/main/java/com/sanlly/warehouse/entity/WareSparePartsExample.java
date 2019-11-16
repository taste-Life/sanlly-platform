package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareSparePartsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareSparePartsExample() {
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

        public Criteria andWareSparePartsIdIsNull() {
            addCriterion("ware_spare_parts_id is null");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsIdIsNotNull() {
            addCriterion("ware_spare_parts_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsIdEqualTo(Integer value) {
            addCriterion("ware_spare_parts_id =", value, "wareSparePartsId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsIdNotEqualTo(Integer value) {
            addCriterion("ware_spare_parts_id <>", value, "wareSparePartsId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsIdGreaterThan(Integer value) {
            addCriterion("ware_spare_parts_id >", value, "wareSparePartsId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_spare_parts_id >=", value, "wareSparePartsId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsIdLessThan(Integer value) {
            addCriterion("ware_spare_parts_id <", value, "wareSparePartsId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_spare_parts_id <=", value, "wareSparePartsId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsIdIn(List<Integer> values) {
            addCriterion("ware_spare_parts_id in", values, "wareSparePartsId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsIdNotIn(List<Integer> values) {
            addCriterion("ware_spare_parts_id not in", values, "wareSparePartsId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_spare_parts_id between", value1, value2, "wareSparePartsId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_spare_parts_id not between", value1, value2, "wareSparePartsId");
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

        public Criteria andSparePartsCategoriesIsNull() {
            addCriterion("spare_parts_categories is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesIsNotNull() {
            addCriterion("spare_parts_categories is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesEqualTo(String value) {
            addCriterion("spare_parts_categories =", value, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNotEqualTo(String value) {
            addCriterion("spare_parts_categories <>", value, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesGreaterThan(String value) {
            addCriterion("spare_parts_categories >", value, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_categories >=", value, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesLessThan(String value) {
            addCriterion("spare_parts_categories <", value, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_categories <=", value, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesLike(String value) {
            addCriterion("spare_parts_categories like", value, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNotLike(String value) {
            addCriterion("spare_parts_categories not like", value, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesIn(List<String> values) {
            addCriterion("spare_parts_categories in", values, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNotIn(List<String> values) {
            addCriterion("spare_parts_categories not in", values, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesBetween(String value1, String value2) {
            addCriterion("spare_parts_categories between", value1, value2, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNotBetween(String value1, String value2) {
            addCriterion("spare_parts_categories not between", value1, value2, "sparePartsCategories");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesDetailsIsNull() {
            addCriterion("spare_parts_categories_details is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesDetailsIsNotNull() {
            addCriterion("spare_parts_categories_details is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesDetailsEqualTo(String value) {
            addCriterion("spare_parts_categories_details =", value, "sparePartsCategoriesDetails");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesDetailsNotEqualTo(String value) {
            addCriterion("spare_parts_categories_details <>", value, "sparePartsCategoriesDetails");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesDetailsGreaterThan(String value) {
            addCriterion("spare_parts_categories_details >", value, "sparePartsCategoriesDetails");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_categories_details >=", value, "sparePartsCategoriesDetails");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesDetailsLessThan(String value) {
            addCriterion("spare_parts_categories_details <", value, "sparePartsCategoriesDetails");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesDetailsLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_categories_details <=", value, "sparePartsCategoriesDetails");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesDetailsLike(String value) {
            addCriterion("spare_parts_categories_details like", value, "sparePartsCategoriesDetails");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesDetailsNotLike(String value) {
            addCriterion("spare_parts_categories_details not like", value, "sparePartsCategoriesDetails");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesDetailsIn(List<String> values) {
            addCriterion("spare_parts_categories_details in", values, "sparePartsCategoriesDetails");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesDetailsNotIn(List<String> values) {
            addCriterion("spare_parts_categories_details not in", values, "sparePartsCategoriesDetails");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesDetailsBetween(String value1, String value2) {
            addCriterion("spare_parts_categories_details between", value1, value2, "sparePartsCategoriesDetails");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesDetailsNotBetween(String value1, String value2) {
            addCriterion("spare_parts_categories_details not between", value1, value2, "sparePartsCategoriesDetails");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoIsNull() {
            addCriterion("spare_parts_no is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoIsNotNull() {
            addCriterion("spare_parts_no is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoEqualTo(String value) {
            addCriterion("spare_parts_no =", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoNotEqualTo(String value) {
            addCriterion("spare_parts_no <>", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoGreaterThan(String value) {
            addCriterion("spare_parts_no >", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_no >=", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoLessThan(String value) {
            addCriterion("spare_parts_no <", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_no <=", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoLike(String value) {
            addCriterion("spare_parts_no like", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoNotLike(String value) {
            addCriterion("spare_parts_no not like", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoIn(List<String> values) {
            addCriterion("spare_parts_no in", values, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoNotIn(List<String> values) {
            addCriterion("spare_parts_no not in", values, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoBetween(String value1, String value2) {
            addCriterion("spare_parts_no between", value1, value2, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoNotBetween(String value1, String value2) {
            addCriterion("spare_parts_no not between", value1, value2, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameIsNull() {
            addCriterion("spare_parts_name is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameIsNotNull() {
            addCriterion("spare_parts_name is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameEqualTo(String value) {
            addCriterion("spare_parts_name =", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameNotEqualTo(String value) {
            addCriterion("spare_parts_name <>", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameGreaterThan(String value) {
            addCriterion("spare_parts_name >", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_name >=", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameLessThan(String value) {
            addCriterion("spare_parts_name <", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_name <=", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameLike(String value) {
            addCriterion("spare_parts_name like", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameNotLike(String value) {
            addCriterion("spare_parts_name not like", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameIn(List<String> values) {
            addCriterion("spare_parts_name in", values, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameNotIn(List<String> values) {
            addCriterion("spare_parts_name not in", values, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameBetween(String value1, String value2) {
            addCriterion("spare_parts_name between", value1, value2, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameNotBetween(String value1, String value2) {
            addCriterion("spare_parts_name not between", value1, value2, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameEnIsNull() {
            addCriterion("spare_parts_name_en is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameEnIsNotNull() {
            addCriterion("spare_parts_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameEnEqualTo(String value) {
            addCriterion("spare_parts_name_en =", value, "sparePartsNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameEnNotEqualTo(String value) {
            addCriterion("spare_parts_name_en <>", value, "sparePartsNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameEnGreaterThan(String value) {
            addCriterion("spare_parts_name_en >", value, "sparePartsNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_name_en >=", value, "sparePartsNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameEnLessThan(String value) {
            addCriterion("spare_parts_name_en <", value, "sparePartsNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameEnLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_name_en <=", value, "sparePartsNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameEnLike(String value) {
            addCriterion("spare_parts_name_en like", value, "sparePartsNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameEnNotLike(String value) {
            addCriterion("spare_parts_name_en not like", value, "sparePartsNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameEnIn(List<String> values) {
            addCriterion("spare_parts_name_en in", values, "sparePartsNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameEnNotIn(List<String> values) {
            addCriterion("spare_parts_name_en not in", values, "sparePartsNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameEnBetween(String value1, String value2) {
            addCriterion("spare_parts_name_en between", value1, value2, "sparePartsNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameEnNotBetween(String value1, String value2) {
            addCriterion("spare_parts_name_en not between", value1, value2, "sparePartsNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsGeneralIdIsNull() {
            addCriterion("spare_parts_general_id is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsGeneralIdIsNotNull() {
            addCriterion("spare_parts_general_id is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsGeneralIdEqualTo(String value) {
            addCriterion("spare_parts_general_id =", value, "sparePartsGeneralId");
            return (Criteria) this;
        }

        public Criteria andSparePartsGeneralIdNotEqualTo(String value) {
            addCriterion("spare_parts_general_id <>", value, "sparePartsGeneralId");
            return (Criteria) this;
        }

        public Criteria andSparePartsGeneralIdGreaterThan(String value) {
            addCriterion("spare_parts_general_id >", value, "sparePartsGeneralId");
            return (Criteria) this;
        }

        public Criteria andSparePartsGeneralIdGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_general_id >=", value, "sparePartsGeneralId");
            return (Criteria) this;
        }

        public Criteria andSparePartsGeneralIdLessThan(String value) {
            addCriterion("spare_parts_general_id <", value, "sparePartsGeneralId");
            return (Criteria) this;
        }

        public Criteria andSparePartsGeneralIdLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_general_id <=", value, "sparePartsGeneralId");
            return (Criteria) this;
        }

        public Criteria andSparePartsGeneralIdLike(String value) {
            addCriterion("spare_parts_general_id like", value, "sparePartsGeneralId");
            return (Criteria) this;
        }

        public Criteria andSparePartsGeneralIdNotLike(String value) {
            addCriterion("spare_parts_general_id not like", value, "sparePartsGeneralId");
            return (Criteria) this;
        }

        public Criteria andSparePartsGeneralIdIn(List<String> values) {
            addCriterion("spare_parts_general_id in", values, "sparePartsGeneralId");
            return (Criteria) this;
        }

        public Criteria andSparePartsGeneralIdNotIn(List<String> values) {
            addCriterion("spare_parts_general_id not in", values, "sparePartsGeneralId");
            return (Criteria) this;
        }

        public Criteria andSparePartsGeneralIdBetween(String value1, String value2) {
            addCriterion("spare_parts_general_id between", value1, value2, "sparePartsGeneralId");
            return (Criteria) this;
        }

        public Criteria andSparePartsGeneralIdNotBetween(String value1, String value2) {
            addCriterion("spare_parts_general_id not between", value1, value2, "sparePartsGeneralId");
            return (Criteria) this;
        }

        public Criteria andSparePartsSpecIsNull() {
            addCriterion("spare_parts_spec is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsSpecIsNotNull() {
            addCriterion("spare_parts_spec is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsSpecEqualTo(String value) {
            addCriterion("spare_parts_spec =", value, "sparePartsSpec");
            return (Criteria) this;
        }

        public Criteria andSparePartsSpecNotEqualTo(String value) {
            addCriterion("spare_parts_spec <>", value, "sparePartsSpec");
            return (Criteria) this;
        }

        public Criteria andSparePartsSpecGreaterThan(String value) {
            addCriterion("spare_parts_spec >", value, "sparePartsSpec");
            return (Criteria) this;
        }

        public Criteria andSparePartsSpecGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_spec >=", value, "sparePartsSpec");
            return (Criteria) this;
        }

        public Criteria andSparePartsSpecLessThan(String value) {
            addCriterion("spare_parts_spec <", value, "sparePartsSpec");
            return (Criteria) this;
        }

        public Criteria andSparePartsSpecLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_spec <=", value, "sparePartsSpec");
            return (Criteria) this;
        }

        public Criteria andSparePartsSpecLike(String value) {
            addCriterion("spare_parts_spec like", value, "sparePartsSpec");
            return (Criteria) this;
        }

        public Criteria andSparePartsSpecNotLike(String value) {
            addCriterion("spare_parts_spec not like", value, "sparePartsSpec");
            return (Criteria) this;
        }

        public Criteria andSparePartsSpecIn(List<String> values) {
            addCriterion("spare_parts_spec in", values, "sparePartsSpec");
            return (Criteria) this;
        }

        public Criteria andSparePartsSpecNotIn(List<String> values) {
            addCriterion("spare_parts_spec not in", values, "sparePartsSpec");
            return (Criteria) this;
        }

        public Criteria andSparePartsSpecBetween(String value1, String value2) {
            addCriterion("spare_parts_spec between", value1, value2, "sparePartsSpec");
            return (Criteria) this;
        }

        public Criteria andSparePartsSpecNotBetween(String value1, String value2) {
            addCriterion("spare_parts_spec not between", value1, value2, "sparePartsSpec");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andIsInciseIsNull() {
            addCriterion("is_incise is null");
            return (Criteria) this;
        }

        public Criteria andIsInciseIsNotNull() {
            addCriterion("is_incise is not null");
            return (Criteria) this;
        }

        public Criteria andIsInciseEqualTo(String value) {
            addCriterion("is_incise =", value, "isIncise");
            return (Criteria) this;
        }

        public Criteria andIsInciseNotEqualTo(String value) {
            addCriterion("is_incise <>", value, "isIncise");
            return (Criteria) this;
        }

        public Criteria andIsInciseGreaterThan(String value) {
            addCriterion("is_incise >", value, "isIncise");
            return (Criteria) this;
        }

        public Criteria andIsInciseGreaterThanOrEqualTo(String value) {
            addCriterion("is_incise >=", value, "isIncise");
            return (Criteria) this;
        }

        public Criteria andIsInciseLessThan(String value) {
            addCriterion("is_incise <", value, "isIncise");
            return (Criteria) this;
        }

        public Criteria andIsInciseLessThanOrEqualTo(String value) {
            addCriterion("is_incise <=", value, "isIncise");
            return (Criteria) this;
        }

        public Criteria andIsInciseLike(String value) {
            addCriterion("is_incise like", value, "isIncise");
            return (Criteria) this;
        }

        public Criteria andIsInciseNotLike(String value) {
            addCriterion("is_incise not like", value, "isIncise");
            return (Criteria) this;
        }

        public Criteria andIsInciseIn(List<String> values) {
            addCriterion("is_incise in", values, "isIncise");
            return (Criteria) this;
        }

        public Criteria andIsInciseNotIn(List<String> values) {
            addCriterion("is_incise not in", values, "isIncise");
            return (Criteria) this;
        }

        public Criteria andIsInciseBetween(String value1, String value2) {
            addCriterion("is_incise between", value1, value2, "isIncise");
            return (Criteria) this;
        }

        public Criteria andIsInciseNotBetween(String value1, String value2) {
            addCriterion("is_incise not between", value1, value2, "isIncise");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("`length` is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("`length` is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Double value) {
            addCriterion("`length` =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Double value) {
            addCriterion("`length` <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Double value) {
            addCriterion("`length` >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Double value) {
            addCriterion("`length` >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Double value) {
            addCriterion("`length` <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Double value) {
            addCriterion("`length` <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Double> values) {
            addCriterion("`length` in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Double> values) {
            addCriterion("`length` not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Double value1, Double value2) {
            addCriterion("`length` between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Double value1, Double value2) {
            addCriterion("`length` not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Double value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Double value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Double value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Double value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Double value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Double value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Double> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Double> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Double value1, Double value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Double value1, Double value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andTextureIsNull() {
            addCriterion("texture is null");
            return (Criteria) this;
        }

        public Criteria andTextureIsNotNull() {
            addCriterion("texture is not null");
            return (Criteria) this;
        }

        public Criteria andTextureEqualTo(String value) {
            addCriterion("texture =", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureNotEqualTo(String value) {
            addCriterion("texture <>", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureGreaterThan(String value) {
            addCriterion("texture >", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureGreaterThanOrEqualTo(String value) {
            addCriterion("texture >=", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureLessThan(String value) {
            addCriterion("texture <", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureLessThanOrEqualTo(String value) {
            addCriterion("texture <=", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureLike(String value) {
            addCriterion("texture like", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureNotLike(String value) {
            addCriterion("texture not like", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureIn(List<String> values) {
            addCriterion("texture in", values, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureNotIn(List<String> values) {
            addCriterion("texture not in", values, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureBetween(String value1, String value2) {
            addCriterion("texture between", value1, value2, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureNotBetween(String value1, String value2) {
            addCriterion("texture not between", value1, value2, "texture");
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

        public Criteria andManufactureIsNull() {
            addCriterion("manufacture is null");
            return (Criteria) this;
        }

        public Criteria andManufactureIsNotNull() {
            addCriterion("manufacture is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureEqualTo(String value) {
            addCriterion("manufacture =", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotEqualTo(String value) {
            addCriterion("manufacture <>", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureGreaterThan(String value) {
            addCriterion("manufacture >", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureGreaterThanOrEqualTo(String value) {
            addCriterion("manufacture >=", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureLessThan(String value) {
            addCriterion("manufacture <", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureLessThanOrEqualTo(String value) {
            addCriterion("manufacture <=", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureLike(String value) {
            addCriterion("manufacture like", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotLike(String value) {
            addCriterion("manufacture not like", value, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureIn(List<String> values) {
            addCriterion("manufacture in", values, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotIn(List<String> values) {
            addCriterion("manufacture not in", values, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureBetween(String value1, String value2) {
            addCriterion("manufacture between", value1, value2, "manufacture");
            return (Criteria) this;
        }

        public Criteria andManufactureNotBetween(String value1, String value2) {
            addCriterion("manufacture not between", value1, value2, "manufacture");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsIsNull() {
            addCriterion("applicable_models is null");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsIsNotNull() {
            addCriterion("applicable_models is not null");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsEqualTo(String value) {
            addCriterion("applicable_models =", value, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsNotEqualTo(String value) {
            addCriterion("applicable_models <>", value, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsGreaterThan(String value) {
            addCriterion("applicable_models >", value, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsGreaterThanOrEqualTo(String value) {
            addCriterion("applicable_models >=", value, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsLessThan(String value) {
            addCriterion("applicable_models <", value, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsLessThanOrEqualTo(String value) {
            addCriterion("applicable_models <=", value, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsLike(String value) {
            addCriterion("applicable_models like", value, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsNotLike(String value) {
            addCriterion("applicable_models not like", value, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsIn(List<String> values) {
            addCriterion("applicable_models in", values, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsNotIn(List<String> values) {
            addCriterion("applicable_models not in", values, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsBetween(String value1, String value2) {
            addCriterion("applicable_models between", value1, value2, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsNotBetween(String value1, String value2) {
            addCriterion("applicable_models not between", value1, value2, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andAbcIsNull() {
            addCriterion("abc is null");
            return (Criteria) this;
        }

        public Criteria andAbcIsNotNull() {
            addCriterion("abc is not null");
            return (Criteria) this;
        }

        public Criteria andAbcEqualTo(String value) {
            addCriterion("abc =", value, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcNotEqualTo(String value) {
            addCriterion("abc <>", value, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcGreaterThan(String value) {
            addCriterion("abc >", value, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcGreaterThanOrEqualTo(String value) {
            addCriterion("abc >=", value, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcLessThan(String value) {
            addCriterion("abc <", value, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcLessThanOrEqualTo(String value) {
            addCriterion("abc <=", value, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcLike(String value) {
            addCriterion("abc like", value, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcNotLike(String value) {
            addCriterion("abc not like", value, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcIn(List<String> values) {
            addCriterion("abc in", values, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcNotIn(List<String> values) {
            addCriterion("abc not in", values, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcBetween(String value1, String value2) {
            addCriterion("abc between", value1, value2, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcNotBetween(String value1, String value2) {
            addCriterion("abc not between", value1, value2, "abc");
            return (Criteria) this;
        }

        public Criteria andIsMergerAcquisitionIsNull() {
            addCriterion("is_merger_acquisition is null");
            return (Criteria) this;
        }

        public Criteria andIsMergerAcquisitionIsNotNull() {
            addCriterion("is_merger_acquisition is not null");
            return (Criteria) this;
        }

        public Criteria andIsMergerAcquisitionEqualTo(String value) {
            addCriterion("is_merger_acquisition =", value, "isMergerAcquisition");
            return (Criteria) this;
        }

        public Criteria andIsMergerAcquisitionNotEqualTo(String value) {
            addCriterion("is_merger_acquisition <>", value, "isMergerAcquisition");
            return (Criteria) this;
        }

        public Criteria andIsMergerAcquisitionGreaterThan(String value) {
            addCriterion("is_merger_acquisition >", value, "isMergerAcquisition");
            return (Criteria) this;
        }

        public Criteria andIsMergerAcquisitionGreaterThanOrEqualTo(String value) {
            addCriterion("is_merger_acquisition >=", value, "isMergerAcquisition");
            return (Criteria) this;
        }

        public Criteria andIsMergerAcquisitionLessThan(String value) {
            addCriterion("is_merger_acquisition <", value, "isMergerAcquisition");
            return (Criteria) this;
        }

        public Criteria andIsMergerAcquisitionLessThanOrEqualTo(String value) {
            addCriterion("is_merger_acquisition <=", value, "isMergerAcquisition");
            return (Criteria) this;
        }

        public Criteria andIsMergerAcquisitionLike(String value) {
            addCriterion("is_merger_acquisition like", value, "isMergerAcquisition");
            return (Criteria) this;
        }

        public Criteria andIsMergerAcquisitionNotLike(String value) {
            addCriterion("is_merger_acquisition not like", value, "isMergerAcquisition");
            return (Criteria) this;
        }

        public Criteria andIsMergerAcquisitionIn(List<String> values) {
            addCriterion("is_merger_acquisition in", values, "isMergerAcquisition");
            return (Criteria) this;
        }

        public Criteria andIsMergerAcquisitionNotIn(List<String> values) {
            addCriterion("is_merger_acquisition not in", values, "isMergerAcquisition");
            return (Criteria) this;
        }

        public Criteria andIsMergerAcquisitionBetween(String value1, String value2) {
            addCriterion("is_merger_acquisition between", value1, value2, "isMergerAcquisition");
            return (Criteria) this;
        }

        public Criteria andIsMergerAcquisitionNotBetween(String value1, String value2) {
            addCriterion("is_merger_acquisition not between", value1, value2, "isMergerAcquisition");
            return (Criteria) this;
        }

        public Criteria andComponentDetailsIsNull() {
            addCriterion("component_details is null");
            return (Criteria) this;
        }

        public Criteria andComponentDetailsIsNotNull() {
            addCriterion("component_details is not null");
            return (Criteria) this;
        }

        public Criteria andComponentDetailsEqualTo(String value) {
            addCriterion("component_details =", value, "componentDetails");
            return (Criteria) this;
        }

        public Criteria andComponentDetailsNotEqualTo(String value) {
            addCriterion("component_details <>", value, "componentDetails");
            return (Criteria) this;
        }

        public Criteria andComponentDetailsGreaterThan(String value) {
            addCriterion("component_details >", value, "componentDetails");
            return (Criteria) this;
        }

        public Criteria andComponentDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("component_details >=", value, "componentDetails");
            return (Criteria) this;
        }

        public Criteria andComponentDetailsLessThan(String value) {
            addCriterion("component_details <", value, "componentDetails");
            return (Criteria) this;
        }

        public Criteria andComponentDetailsLessThanOrEqualTo(String value) {
            addCriterion("component_details <=", value, "componentDetails");
            return (Criteria) this;
        }

        public Criteria andComponentDetailsLike(String value) {
            addCriterion("component_details like", value, "componentDetails");
            return (Criteria) this;
        }

        public Criteria andComponentDetailsNotLike(String value) {
            addCriterion("component_details not like", value, "componentDetails");
            return (Criteria) this;
        }

        public Criteria andComponentDetailsIn(List<String> values) {
            addCriterion("component_details in", values, "componentDetails");
            return (Criteria) this;
        }

        public Criteria andComponentDetailsNotIn(List<String> values) {
            addCriterion("component_details not in", values, "componentDetails");
            return (Criteria) this;
        }

        public Criteria andComponentDetailsBetween(String value1, String value2) {
            addCriterion("component_details between", value1, value2, "componentDetails");
            return (Criteria) this;
        }

        public Criteria andComponentDetailsNotBetween(String value1, String value2) {
            addCriterion("component_details not between", value1, value2, "componentDetails");
            return (Criteria) this;
        }

        public Criteria andQuotePriceIsNull() {
            addCriterion("quote_price is null");
            return (Criteria) this;
        }

        public Criteria andQuotePriceIsNotNull() {
            addCriterion("quote_price is not null");
            return (Criteria) this;
        }

        public Criteria andQuotePriceEqualTo(BigDecimal value) {
            addCriterion("quote_price =", value, "quotePrice");
            return (Criteria) this;
        }

        public Criteria andQuotePriceNotEqualTo(BigDecimal value) {
            addCriterion("quote_price <>", value, "quotePrice");
            return (Criteria) this;
        }

        public Criteria andQuotePriceGreaterThan(BigDecimal value) {
            addCriterion("quote_price >", value, "quotePrice");
            return (Criteria) this;
        }

        public Criteria andQuotePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("quote_price >=", value, "quotePrice");
            return (Criteria) this;
        }

        public Criteria andQuotePriceLessThan(BigDecimal value) {
            addCriterion("quote_price <", value, "quotePrice");
            return (Criteria) this;
        }

        public Criteria andQuotePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("quote_price <=", value, "quotePrice");
            return (Criteria) this;
        }

        public Criteria andQuotePriceIn(List<BigDecimal> values) {
            addCriterion("quote_price in", values, "quotePrice");
            return (Criteria) this;
        }

        public Criteria andQuotePriceNotIn(List<BigDecimal> values) {
            addCriterion("quote_price not in", values, "quotePrice");
            return (Criteria) this;
        }

        public Criteria andQuotePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quote_price between", value1, value2, "quotePrice");
            return (Criteria) this;
        }

        public Criteria andQuotePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quote_price not between", value1, value2, "quotePrice");
            return (Criteria) this;
        }

        public Criteria andQuoteCurrencyIsNull() {
            addCriterion("quote_currency is null");
            return (Criteria) this;
        }

        public Criteria andQuoteCurrencyIsNotNull() {
            addCriterion("quote_currency is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteCurrencyEqualTo(String value) {
            addCriterion("quote_currency =", value, "quoteCurrency");
            return (Criteria) this;
        }

        public Criteria andQuoteCurrencyNotEqualTo(String value) {
            addCriterion("quote_currency <>", value, "quoteCurrency");
            return (Criteria) this;
        }

        public Criteria andQuoteCurrencyGreaterThan(String value) {
            addCriterion("quote_currency >", value, "quoteCurrency");
            return (Criteria) this;
        }

        public Criteria andQuoteCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("quote_currency >=", value, "quoteCurrency");
            return (Criteria) this;
        }

        public Criteria andQuoteCurrencyLessThan(String value) {
            addCriterion("quote_currency <", value, "quoteCurrency");
            return (Criteria) this;
        }

        public Criteria andQuoteCurrencyLessThanOrEqualTo(String value) {
            addCriterion("quote_currency <=", value, "quoteCurrency");
            return (Criteria) this;
        }

        public Criteria andQuoteCurrencyLike(String value) {
            addCriterion("quote_currency like", value, "quoteCurrency");
            return (Criteria) this;
        }

        public Criteria andQuoteCurrencyNotLike(String value) {
            addCriterion("quote_currency not like", value, "quoteCurrency");
            return (Criteria) this;
        }

        public Criteria andQuoteCurrencyIn(List<String> values) {
            addCriterion("quote_currency in", values, "quoteCurrency");
            return (Criteria) this;
        }

        public Criteria andQuoteCurrencyNotIn(List<String> values) {
            addCriterion("quote_currency not in", values, "quoteCurrency");
            return (Criteria) this;
        }

        public Criteria andQuoteCurrencyBetween(String value1, String value2) {
            addCriterion("quote_currency between", value1, value2, "quoteCurrency");
            return (Criteria) this;
        }

        public Criteria andQuoteCurrencyNotBetween(String value1, String value2) {
            addCriterion("quote_currency not between", value1, value2, "quoteCurrency");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(BigDecimal value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(BigDecimal value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(BigDecimal value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<BigDecimal> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceIsNull() {
            addCriterion("reference_price is null");
            return (Criteria) this;
        }

        public Criteria andReferencePriceIsNotNull() {
            addCriterion("reference_price is not null");
            return (Criteria) this;
        }

        public Criteria andReferencePriceEqualTo(BigDecimal value) {
            addCriterion("reference_price =", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceNotEqualTo(BigDecimal value) {
            addCriterion("reference_price <>", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceGreaterThan(BigDecimal value) {
            addCriterion("reference_price >", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reference_price >=", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceLessThan(BigDecimal value) {
            addCriterion("reference_price <", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reference_price <=", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceIn(List<BigDecimal> values) {
            addCriterion("reference_price in", values, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceNotIn(List<BigDecimal> values) {
            addCriterion("reference_price not in", values, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reference_price between", value1, value2, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reference_price not between", value1, value2, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andIsSendBackIsNull() {
            addCriterion("is_send_back is null");
            return (Criteria) this;
        }

        public Criteria andIsSendBackIsNotNull() {
            addCriterion("is_send_back is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendBackEqualTo(String value) {
            addCriterion("is_send_back =", value, "isSendBack");
            return (Criteria) this;
        }

        public Criteria andIsSendBackNotEqualTo(String value) {
            addCriterion("is_send_back <>", value, "isSendBack");
            return (Criteria) this;
        }

        public Criteria andIsSendBackGreaterThan(String value) {
            addCriterion("is_send_back >", value, "isSendBack");
            return (Criteria) this;
        }

        public Criteria andIsSendBackGreaterThanOrEqualTo(String value) {
            addCriterion("is_send_back >=", value, "isSendBack");
            return (Criteria) this;
        }

        public Criteria andIsSendBackLessThan(String value) {
            addCriterion("is_send_back <", value, "isSendBack");
            return (Criteria) this;
        }

        public Criteria andIsSendBackLessThanOrEqualTo(String value) {
            addCriterion("is_send_back <=", value, "isSendBack");
            return (Criteria) this;
        }

        public Criteria andIsSendBackLike(String value) {
            addCriterion("is_send_back like", value, "isSendBack");
            return (Criteria) this;
        }

        public Criteria andIsSendBackNotLike(String value) {
            addCriterion("is_send_back not like", value, "isSendBack");
            return (Criteria) this;
        }

        public Criteria andIsSendBackIn(List<String> values) {
            addCriterion("is_send_back in", values, "isSendBack");
            return (Criteria) this;
        }

        public Criteria andIsSendBackNotIn(List<String> values) {
            addCriterion("is_send_back not in", values, "isSendBack");
            return (Criteria) this;
        }

        public Criteria andIsSendBackBetween(String value1, String value2) {
            addCriterion("is_send_back between", value1, value2, "isSendBack");
            return (Criteria) this;
        }

        public Criteria andIsSendBackNotBetween(String value1, String value2) {
            addCriterion("is_send_back not between", value1, value2, "isSendBack");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeIsNull() {
            addCriterion("default_warehouse_type is null");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeIsNotNull() {
            addCriterion("default_warehouse_type is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeEqualTo(String value) {
            addCriterion("default_warehouse_type =", value, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeNotEqualTo(String value) {
            addCriterion("default_warehouse_type <>", value, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeGreaterThan(String value) {
            addCriterion("default_warehouse_type >", value, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("default_warehouse_type >=", value, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeLessThan(String value) {
            addCriterion("default_warehouse_type <", value, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeLessThanOrEqualTo(String value) {
            addCriterion("default_warehouse_type <=", value, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeLike(String value) {
            addCriterion("default_warehouse_type like", value, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeNotLike(String value) {
            addCriterion("default_warehouse_type not like", value, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeIn(List<String> values) {
            addCriterion("default_warehouse_type in", values, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeNotIn(List<String> values) {
            addCriterion("default_warehouse_type not in", values, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeBetween(String value1, String value2) {
            addCriterion("default_warehouse_type between", value1, value2, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseTypeNotBetween(String value1, String value2) {
            addCriterion("default_warehouse_type not between", value1, value2, "defaultWarehouseType");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("purpose is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("purpose is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("purpose =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("purpose <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("purpose >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("purpose >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("purpose <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("purpose <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("purpose like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("purpose not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("purpose in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("purpose not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("purpose between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("purpose not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andDurableYearsIsNull() {
            addCriterion("durable_years is null");
            return (Criteria) this;
        }

        public Criteria andDurableYearsIsNotNull() {
            addCriterion("durable_years is not null");
            return (Criteria) this;
        }

        public Criteria andDurableYearsEqualTo(Integer value) {
            addCriterion("durable_years =", value, "durableYears");
            return (Criteria) this;
        }

        public Criteria andDurableYearsNotEqualTo(Integer value) {
            addCriterion("durable_years <>", value, "durableYears");
            return (Criteria) this;
        }

        public Criteria andDurableYearsGreaterThan(Integer value) {
            addCriterion("durable_years >", value, "durableYears");
            return (Criteria) this;
        }

        public Criteria andDurableYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("durable_years >=", value, "durableYears");
            return (Criteria) this;
        }

        public Criteria andDurableYearsLessThan(Integer value) {
            addCriterion("durable_years <", value, "durableYears");
            return (Criteria) this;
        }

        public Criteria andDurableYearsLessThanOrEqualTo(Integer value) {
            addCriterion("durable_years <=", value, "durableYears");
            return (Criteria) this;
        }

        public Criteria andDurableYearsIn(List<Integer> values) {
            addCriterion("durable_years in", values, "durableYears");
            return (Criteria) this;
        }

        public Criteria andDurableYearsNotIn(List<Integer> values) {
            addCriterion("durable_years not in", values, "durableYears");
            return (Criteria) this;
        }

        public Criteria andDurableYearsBetween(Integer value1, Integer value2) {
            addCriterion("durable_years between", value1, value2, "durableYears");
            return (Criteria) this;
        }

        public Criteria andDurableYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("durable_years not between", value1, value2, "durableYears");
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

        public Criteria andInquiryCycleIsNull() {
            addCriterion("inquiry_cycle is null");
            return (Criteria) this;
        }

        public Criteria andInquiryCycleIsNotNull() {
            addCriterion("inquiry_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andInquiryCycleEqualTo(String value) {
            addCriterion("inquiry_cycle =", value, "inquiryCycle");
            return (Criteria) this;
        }

        public Criteria andInquiryCycleNotEqualTo(String value) {
            addCriterion("inquiry_cycle <>", value, "inquiryCycle");
            return (Criteria) this;
        }

        public Criteria andInquiryCycleGreaterThan(String value) {
            addCriterion("inquiry_cycle >", value, "inquiryCycle");
            return (Criteria) this;
        }

        public Criteria andInquiryCycleGreaterThanOrEqualTo(String value) {
            addCriterion("inquiry_cycle >=", value, "inquiryCycle");
            return (Criteria) this;
        }

        public Criteria andInquiryCycleLessThan(String value) {
            addCriterion("inquiry_cycle <", value, "inquiryCycle");
            return (Criteria) this;
        }

        public Criteria andInquiryCycleLessThanOrEqualTo(String value) {
            addCriterion("inquiry_cycle <=", value, "inquiryCycle");
            return (Criteria) this;
        }

        public Criteria andInquiryCycleLike(String value) {
            addCriterion("inquiry_cycle like", value, "inquiryCycle");
            return (Criteria) this;
        }

        public Criteria andInquiryCycleNotLike(String value) {
            addCriterion("inquiry_cycle not like", value, "inquiryCycle");
            return (Criteria) this;
        }

        public Criteria andInquiryCycleIn(List<String> values) {
            addCriterion("inquiry_cycle in", values, "inquiryCycle");
            return (Criteria) this;
        }

        public Criteria andInquiryCycleNotIn(List<String> values) {
            addCriterion("inquiry_cycle not in", values, "inquiryCycle");
            return (Criteria) this;
        }

        public Criteria andInquiryCycleBetween(String value1, String value2) {
            addCriterion("inquiry_cycle between", value1, value2, "inquiryCycle");
            return (Criteria) this;
        }

        public Criteria andInquiryCycleNotBetween(String value1, String value2) {
            addCriterion("inquiry_cycle not between", value1, value2, "inquiryCycle");
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

        public Criteria andLastEntryPriceIsNull() {
            addCriterion("last_entry_price is null");
            return (Criteria) this;
        }

        public Criteria andLastEntryPriceIsNotNull() {
            addCriterion("last_entry_price is not null");
            return (Criteria) this;
        }

        public Criteria andLastEntryPriceEqualTo(BigDecimal value) {
            addCriterion("last_entry_price =", value, "lastEntryPrice");
            return (Criteria) this;
        }

        public Criteria andLastEntryPriceNotEqualTo(BigDecimal value) {
            addCriterion("last_entry_price <>", value, "lastEntryPrice");
            return (Criteria) this;
        }

        public Criteria andLastEntryPriceGreaterThan(BigDecimal value) {
            addCriterion("last_entry_price >", value, "lastEntryPrice");
            return (Criteria) this;
        }

        public Criteria andLastEntryPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("last_entry_price >=", value, "lastEntryPrice");
            return (Criteria) this;
        }

        public Criteria andLastEntryPriceLessThan(BigDecimal value) {
            addCriterion("last_entry_price <", value, "lastEntryPrice");
            return (Criteria) this;
        }

        public Criteria andLastEntryPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("last_entry_price <=", value, "lastEntryPrice");
            return (Criteria) this;
        }

        public Criteria andLastEntryPriceIn(List<BigDecimal> values) {
            addCriterion("last_entry_price in", values, "lastEntryPrice");
            return (Criteria) this;
        }

        public Criteria andLastEntryPriceNotIn(List<BigDecimal> values) {
            addCriterion("last_entry_price not in", values, "lastEntryPrice");
            return (Criteria) this;
        }

        public Criteria andLastEntryPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_entry_price between", value1, value2, "lastEntryPrice");
            return (Criteria) this;
        }

        public Criteria andLastEntryPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last_entry_price not between", value1, value2, "lastEntryPrice");
            return (Criteria) this;
        }

        public Criteria andIsMaintainIsNull() {
            addCriterion("is_maintain is null");
            return (Criteria) this;
        }

        public Criteria andIsMaintainIsNotNull() {
            addCriterion("is_maintain is not null");
            return (Criteria) this;
        }

        public Criteria andIsMaintainEqualTo(String value) {
            addCriterion("is_maintain =", value, "isMaintain");
            return (Criteria) this;
        }

        public Criteria andIsMaintainNotEqualTo(String value) {
            addCriterion("is_maintain <>", value, "isMaintain");
            return (Criteria) this;
        }

        public Criteria andIsMaintainGreaterThan(String value) {
            addCriterion("is_maintain >", value, "isMaintain");
            return (Criteria) this;
        }

        public Criteria andIsMaintainGreaterThanOrEqualTo(String value) {
            addCriterion("is_maintain >=", value, "isMaintain");
            return (Criteria) this;
        }

        public Criteria andIsMaintainLessThan(String value) {
            addCriterion("is_maintain <", value, "isMaintain");
            return (Criteria) this;
        }

        public Criteria andIsMaintainLessThanOrEqualTo(String value) {
            addCriterion("is_maintain <=", value, "isMaintain");
            return (Criteria) this;
        }

        public Criteria andIsMaintainLike(String value) {
            addCriterion("is_maintain like", value, "isMaintain");
            return (Criteria) this;
        }

        public Criteria andIsMaintainNotLike(String value) {
            addCriterion("is_maintain not like", value, "isMaintain");
            return (Criteria) this;
        }

        public Criteria andIsMaintainIn(List<String> values) {
            addCriterion("is_maintain in", values, "isMaintain");
            return (Criteria) this;
        }

        public Criteria andIsMaintainNotIn(List<String> values) {
            addCriterion("is_maintain not in", values, "isMaintain");
            return (Criteria) this;
        }

        public Criteria andIsMaintainBetween(String value1, String value2) {
            addCriterion("is_maintain between", value1, value2, "isMaintain");
            return (Criteria) this;
        }

        public Criteria andIsMaintainNotBetween(String value1, String value2) {
            addCriterion("is_maintain not between", value1, value2, "isMaintain");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("is_valid is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("is_valid is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(String value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(String value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(String value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(String value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(String value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(String value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLike(String value) {
            addCriterion("is_valid like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotLike(String value) {
            addCriterion("is_valid not like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<String> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<String> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(String value1, String value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(String value1, String value2) {
            addCriterion("is_valid not between", value1, value2, "isValid");
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

        public Criteria andStockoutRestrictMonthIsNull() {
            addCriterion("stockout_restrict_month is null");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthIsNotNull() {
            addCriterion("stockout_restrict_month is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthEqualTo(String value) {
            addCriterion("stockout_restrict_month =", value, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthNotEqualTo(String value) {
            addCriterion("stockout_restrict_month <>", value, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthGreaterThan(String value) {
            addCriterion("stockout_restrict_month >", value, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthGreaterThanOrEqualTo(String value) {
            addCriterion("stockout_restrict_month >=", value, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthLessThan(String value) {
            addCriterion("stockout_restrict_month <", value, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthLessThanOrEqualTo(String value) {
            addCriterion("stockout_restrict_month <=", value, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthLike(String value) {
            addCriterion("stockout_restrict_month like", value, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthNotLike(String value) {
            addCriterion("stockout_restrict_month not like", value, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthIn(List<String> values) {
            addCriterion("stockout_restrict_month in", values, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthNotIn(List<String> values) {
            addCriterion("stockout_restrict_month not in", values, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthBetween(String value1, String value2) {
            addCriterion("stockout_restrict_month between", value1, value2, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthNotBetween(String value1, String value2) {
            addCriterion("stockout_restrict_month not between", value1, value2, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andIsConsumableIsNull() {
            addCriterion("is_consumable is null");
            return (Criteria) this;
        }

        public Criteria andIsConsumableIsNotNull() {
            addCriterion("is_consumable is not null");
            return (Criteria) this;
        }

        public Criteria andIsConsumableEqualTo(String value) {
            addCriterion("is_consumable =", value, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableNotEqualTo(String value) {
            addCriterion("is_consumable <>", value, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableGreaterThan(String value) {
            addCriterion("is_consumable >", value, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableGreaterThanOrEqualTo(String value) {
            addCriterion("is_consumable >=", value, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableLessThan(String value) {
            addCriterion("is_consumable <", value, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableLessThanOrEqualTo(String value) {
            addCriterion("is_consumable <=", value, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableLike(String value) {
            addCriterion("is_consumable like", value, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableNotLike(String value) {
            addCriterion("is_consumable not like", value, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableIn(List<String> values) {
            addCriterion("is_consumable in", values, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableNotIn(List<String> values) {
            addCriterion("is_consumable not in", values, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableBetween(String value1, String value2) {
            addCriterion("is_consumable between", value1, value2, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableNotBetween(String value1, String value2) {
            addCriterion("is_consumable not between", value1, value2, "isConsumable");
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