package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareMaintainSparePartsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareMaintainSparePartsExample() {
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

        public Criteria andWareMaintainSparePartsIdIsNull() {
            addCriterion("ware_maintain_spare_parts_id is null");
            return (Criteria) this;
        }

        public Criteria andWareMaintainSparePartsIdIsNotNull() {
            addCriterion("ware_maintain_spare_parts_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareMaintainSparePartsIdEqualTo(Integer value) {
            addCriterion("ware_maintain_spare_parts_id =", value, "wareMaintainSparePartsId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainSparePartsIdNotEqualTo(Integer value) {
            addCriterion("ware_maintain_spare_parts_id <>", value, "wareMaintainSparePartsId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainSparePartsIdGreaterThan(Integer value) {
            addCriterion("ware_maintain_spare_parts_id >", value, "wareMaintainSparePartsId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainSparePartsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_maintain_spare_parts_id >=", value, "wareMaintainSparePartsId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainSparePartsIdLessThan(Integer value) {
            addCriterion("ware_maintain_spare_parts_id <", value, "wareMaintainSparePartsId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainSparePartsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_maintain_spare_parts_id <=", value, "wareMaintainSparePartsId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainSparePartsIdIn(List<Integer> values) {
            addCriterion("ware_maintain_spare_parts_id in", values, "wareMaintainSparePartsId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainSparePartsIdNotIn(List<Integer> values) {
            addCriterion("ware_maintain_spare_parts_id not in", values, "wareMaintainSparePartsId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainSparePartsIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_maintain_spare_parts_id between", value1, value2, "wareMaintainSparePartsId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainSparePartsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_maintain_spare_parts_id not between", value1, value2, "wareMaintainSparePartsId");
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

        public Criteria andContainerNoIsNull() {
            addCriterion("container_no is null");
            return (Criteria) this;
        }

        public Criteria andContainerNoIsNotNull() {
            addCriterion("container_no is not null");
            return (Criteria) this;
        }

        public Criteria andContainerNoEqualTo(String value) {
            addCriterion("container_no =", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotEqualTo(String value) {
            addCriterion("container_no <>", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoGreaterThan(String value) {
            addCriterion("container_no >", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoGreaterThanOrEqualTo(String value) {
            addCriterion("container_no >=", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoLessThan(String value) {
            addCriterion("container_no <", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoLessThanOrEqualTo(String value) {
            addCriterion("container_no <=", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoLike(String value) {
            addCriterion("container_no like", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotLike(String value) {
            addCriterion("container_no not like", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoIn(List<String> values) {
            addCriterion("container_no in", values, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotIn(List<String> values) {
            addCriterion("container_no not in", values, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoBetween(String value1, String value2) {
            addCriterion("container_no between", value1, value2, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotBetween(String value1, String value2) {
            addCriterion("container_no not between", value1, value2, "containerNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoIsNull() {
            addCriterion("maintain_no is null");
            return (Criteria) this;
        }

        public Criteria andMaintainNoIsNotNull() {
            addCriterion("maintain_no is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainNoEqualTo(String value) {
            addCriterion("maintain_no =", value, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoNotEqualTo(String value) {
            addCriterion("maintain_no <>", value, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoGreaterThan(String value) {
            addCriterion("maintain_no >", value, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_no >=", value, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoLessThan(String value) {
            addCriterion("maintain_no <", value, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoLessThanOrEqualTo(String value) {
            addCriterion("maintain_no <=", value, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoLike(String value) {
            addCriterion("maintain_no like", value, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoNotLike(String value) {
            addCriterion("maintain_no not like", value, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoIn(List<String> values) {
            addCriterion("maintain_no in", values, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoNotIn(List<String> values) {
            addCriterion("maintain_no not in", values, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoBetween(String value1, String value2) {
            addCriterion("maintain_no between", value1, value2, "maintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainNoNotBetween(String value1, String value2) {
            addCriterion("maintain_no not between", value1, value2, "maintainNo");
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

        public Criteria andStockinTypeIsNull() {
            addCriterion("stockin_type is null");
            return (Criteria) this;
        }

        public Criteria andStockinTypeIsNotNull() {
            addCriterion("stockin_type is not null");
            return (Criteria) this;
        }

        public Criteria andStockinTypeEqualTo(String value) {
            addCriterion("stockin_type =", value, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeNotEqualTo(String value) {
            addCriterion("stockin_type <>", value, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeGreaterThan(String value) {
            addCriterion("stockin_type >", value, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeGreaterThanOrEqualTo(String value) {
            addCriterion("stockin_type >=", value, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeLessThan(String value) {
            addCriterion("stockin_type <", value, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeLessThanOrEqualTo(String value) {
            addCriterion("stockin_type <=", value, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeLike(String value) {
            addCriterion("stockin_type like", value, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeNotLike(String value) {
            addCriterion("stockin_type not like", value, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeIn(List<String> values) {
            addCriterion("stockin_type in", values, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeNotIn(List<String> values) {
            addCriterion("stockin_type not in", values, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeBetween(String value1, String value2) {
            addCriterion("stockin_type between", value1, value2, "stockinType");
            return (Criteria) this;
        }

        public Criteria andStockinTypeNotBetween(String value1, String value2) {
            addCriterion("stockin_type not between", value1, value2, "stockinType");
            return (Criteria) this;
        }

        public Criteria andClientIsNull() {
            addCriterion("client is null");
            return (Criteria) this;
        }

        public Criteria andClientIsNotNull() {
            addCriterion("client is not null");
            return (Criteria) this;
        }

        public Criteria andClientEqualTo(Integer value) {
            addCriterion("client =", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotEqualTo(Integer value) {
            addCriterion("client <>", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThan(Integer value) {
            addCriterion("client >", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThanOrEqualTo(Integer value) {
            addCriterion("client >=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThan(Integer value) {
            addCriterion("client <", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThanOrEqualTo(Integer value) {
            addCriterion("client <=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientIn(List<Integer> values) {
            addCriterion("client in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotIn(List<Integer> values) {
            addCriterion("client not in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientBetween(Integer value1, Integer value2) {
            addCriterion("client between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotBetween(Integer value1, Integer value2) {
            addCriterion("client not between", value1, value2, "client");
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

        public Criteria andRefrigeratorCompanyIsNull() {
            addCriterion("refrigerator_company is null");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyIsNotNull() {
            addCriterion("refrigerator_company is not null");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyEqualTo(String value) {
            addCriterion("refrigerator_company =", value, "refrigeratorCompany");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNotEqualTo(String value) {
            addCriterion("refrigerator_company <>", value, "refrigeratorCompany");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyGreaterThan(String value) {
            addCriterion("refrigerator_company >", value, "refrigeratorCompany");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("refrigerator_company >=", value, "refrigeratorCompany");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyLessThan(String value) {
            addCriterion("refrigerator_company <", value, "refrigeratorCompany");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyLessThanOrEqualTo(String value) {
            addCriterion("refrigerator_company <=", value, "refrigeratorCompany");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyLike(String value) {
            addCriterion("refrigerator_company like", value, "refrigeratorCompany");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNotLike(String value) {
            addCriterion("refrigerator_company not like", value, "refrigeratorCompany");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyIn(List<String> values) {
            addCriterion("refrigerator_company in", values, "refrigeratorCompany");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNotIn(List<String> values) {
            addCriterion("refrigerator_company not in", values, "refrigeratorCompany");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyBetween(String value1, String value2) {
            addCriterion("refrigerator_company between", value1, value2, "refrigeratorCompany");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNotBetween(String value1, String value2) {
            addCriterion("refrigerator_company not between", value1, value2, "refrigeratorCompany");
            return (Criteria) this;
        }

        public Criteria andSparePartsGoIsNull() {
            addCriterion("spare_parts_go is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsGoIsNotNull() {
            addCriterion("spare_parts_go is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsGoEqualTo(String value) {
            addCriterion("spare_parts_go =", value, "sparePartsGo");
            return (Criteria) this;
        }

        public Criteria andSparePartsGoNotEqualTo(String value) {
            addCriterion("spare_parts_go <>", value, "sparePartsGo");
            return (Criteria) this;
        }

        public Criteria andSparePartsGoGreaterThan(String value) {
            addCriterion("spare_parts_go >", value, "sparePartsGo");
            return (Criteria) this;
        }

        public Criteria andSparePartsGoGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_go >=", value, "sparePartsGo");
            return (Criteria) this;
        }

        public Criteria andSparePartsGoLessThan(String value) {
            addCriterion("spare_parts_go <", value, "sparePartsGo");
            return (Criteria) this;
        }

        public Criteria andSparePartsGoLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_go <=", value, "sparePartsGo");
            return (Criteria) this;
        }

        public Criteria andSparePartsGoLike(String value) {
            addCriterion("spare_parts_go like", value, "sparePartsGo");
            return (Criteria) this;
        }

        public Criteria andSparePartsGoNotLike(String value) {
            addCriterion("spare_parts_go not like", value, "sparePartsGo");
            return (Criteria) this;
        }

        public Criteria andSparePartsGoIn(List<String> values) {
            addCriterion("spare_parts_go in", values, "sparePartsGo");
            return (Criteria) this;
        }

        public Criteria andSparePartsGoNotIn(List<String> values) {
            addCriterion("spare_parts_go not in", values, "sparePartsGo");
            return (Criteria) this;
        }

        public Criteria andSparePartsGoBetween(String value1, String value2) {
            addCriterion("spare_parts_go between", value1, value2, "sparePartsGo");
            return (Criteria) this;
        }

        public Criteria andSparePartsGoNotBetween(String value1, String value2) {
            addCriterion("spare_parts_go not between", value1, value2, "sparePartsGo");
            return (Criteria) this;
        }

        public Criteria andSparePartsMaintainTypeIsNull() {
            addCriterion("spare_parts_maintain_type is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsMaintainTypeIsNotNull() {
            addCriterion("spare_parts_maintain_type is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsMaintainTypeEqualTo(String value) {
            addCriterion("spare_parts_maintain_type =", value, "sparePartsMaintainType");
            return (Criteria) this;
        }

        public Criteria andSparePartsMaintainTypeNotEqualTo(String value) {
            addCriterion("spare_parts_maintain_type <>", value, "sparePartsMaintainType");
            return (Criteria) this;
        }

        public Criteria andSparePartsMaintainTypeGreaterThan(String value) {
            addCriterion("spare_parts_maintain_type >", value, "sparePartsMaintainType");
            return (Criteria) this;
        }

        public Criteria andSparePartsMaintainTypeGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_maintain_type >=", value, "sparePartsMaintainType");
            return (Criteria) this;
        }

        public Criteria andSparePartsMaintainTypeLessThan(String value) {
            addCriterion("spare_parts_maintain_type <", value, "sparePartsMaintainType");
            return (Criteria) this;
        }

        public Criteria andSparePartsMaintainTypeLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_maintain_type <=", value, "sparePartsMaintainType");
            return (Criteria) this;
        }

        public Criteria andSparePartsMaintainTypeLike(String value) {
            addCriterion("spare_parts_maintain_type like", value, "sparePartsMaintainType");
            return (Criteria) this;
        }

        public Criteria andSparePartsMaintainTypeNotLike(String value) {
            addCriterion("spare_parts_maintain_type not like", value, "sparePartsMaintainType");
            return (Criteria) this;
        }

        public Criteria andSparePartsMaintainTypeIn(List<String> values) {
            addCriterion("spare_parts_maintain_type in", values, "sparePartsMaintainType");
            return (Criteria) this;
        }

        public Criteria andSparePartsMaintainTypeNotIn(List<String> values) {
            addCriterion("spare_parts_maintain_type not in", values, "sparePartsMaintainType");
            return (Criteria) this;
        }

        public Criteria andSparePartsMaintainTypeBetween(String value1, String value2) {
            addCriterion("spare_parts_maintain_type between", value1, value2, "sparePartsMaintainType");
            return (Criteria) this;
        }

        public Criteria andSparePartsMaintainTypeNotBetween(String value1, String value2) {
            addCriterion("spare_parts_maintain_type not between", value1, value2, "sparePartsMaintainType");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockoutinStatusIsNull() {
            addCriterion("spare_parts_stockoutin_status is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockoutinStatusIsNotNull() {
            addCriterion("spare_parts_stockoutin_status is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockoutinStatusEqualTo(String value) {
            addCriterion("spare_parts_stockoutin_status =", value, "sparePartsStockoutinStatus");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockoutinStatusNotEqualTo(String value) {
            addCriterion("spare_parts_stockoutin_status <>", value, "sparePartsStockoutinStatus");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockoutinStatusGreaterThan(String value) {
            addCriterion("spare_parts_stockoutin_status >", value, "sparePartsStockoutinStatus");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockoutinStatusGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_stockoutin_status >=", value, "sparePartsStockoutinStatus");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockoutinStatusLessThan(String value) {
            addCriterion("spare_parts_stockoutin_status <", value, "sparePartsStockoutinStatus");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockoutinStatusLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_stockoutin_status <=", value, "sparePartsStockoutinStatus");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockoutinStatusLike(String value) {
            addCriterion("spare_parts_stockoutin_status like", value, "sparePartsStockoutinStatus");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockoutinStatusNotLike(String value) {
            addCriterion("spare_parts_stockoutin_status not like", value, "sparePartsStockoutinStatus");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockoutinStatusIn(List<String> values) {
            addCriterion("spare_parts_stockoutin_status in", values, "sparePartsStockoutinStatus");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockoutinStatusNotIn(List<String> values) {
            addCriterion("spare_parts_stockoutin_status not in", values, "sparePartsStockoutinStatus");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockoutinStatusBetween(String value1, String value2) {
            addCriterion("spare_parts_stockoutin_status between", value1, value2, "sparePartsStockoutinStatus");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockoutinStatusNotBetween(String value1, String value2) {
            addCriterion("spare_parts_stockoutin_status not between", value1, value2, "sparePartsStockoutinStatus");
            return (Criteria) this;
        }

        public Criteria andExigenceLevelIsNull() {
            addCriterion("exigence_level is null");
            return (Criteria) this;
        }

        public Criteria andExigenceLevelIsNotNull() {
            addCriterion("exigence_level is not null");
            return (Criteria) this;
        }

        public Criteria andExigenceLevelEqualTo(String value) {
            addCriterion("exigence_level =", value, "exigenceLevel");
            return (Criteria) this;
        }

        public Criteria andExigenceLevelNotEqualTo(String value) {
            addCriterion("exigence_level <>", value, "exigenceLevel");
            return (Criteria) this;
        }

        public Criteria andExigenceLevelGreaterThan(String value) {
            addCriterion("exigence_level >", value, "exigenceLevel");
            return (Criteria) this;
        }

        public Criteria andExigenceLevelGreaterThanOrEqualTo(String value) {
            addCriterion("exigence_level >=", value, "exigenceLevel");
            return (Criteria) this;
        }

        public Criteria andExigenceLevelLessThan(String value) {
            addCriterion("exigence_level <", value, "exigenceLevel");
            return (Criteria) this;
        }

        public Criteria andExigenceLevelLessThanOrEqualTo(String value) {
            addCriterion("exigence_level <=", value, "exigenceLevel");
            return (Criteria) this;
        }

        public Criteria andExigenceLevelLike(String value) {
            addCriterion("exigence_level like", value, "exigenceLevel");
            return (Criteria) this;
        }

        public Criteria andExigenceLevelNotLike(String value) {
            addCriterion("exigence_level not like", value, "exigenceLevel");
            return (Criteria) this;
        }

        public Criteria andExigenceLevelIn(List<String> values) {
            addCriterion("exigence_level in", values, "exigenceLevel");
            return (Criteria) this;
        }

        public Criteria andExigenceLevelNotIn(List<String> values) {
            addCriterion("exigence_level not in", values, "exigenceLevel");
            return (Criteria) this;
        }

        public Criteria andExigenceLevelBetween(String value1, String value2) {
            addCriterion("exigence_level between", value1, value2, "exigenceLevel");
            return (Criteria) this;
        }

        public Criteria andExigenceLevelNotBetween(String value1, String value2) {
            addCriterion("exigence_level not between", value1, value2, "exigenceLevel");
            return (Criteria) this;
        }

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLike(String value) {
            addCriterion("site like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("site not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("site not between", value1, value2, "site");
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

        public Criteria andSparePartsIsNull() {
            addCriterion("spare_parts is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsIsNotNull() {
            addCriterion("spare_parts is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsEqualTo(String value) {
            addCriterion("spare_parts =", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsNotEqualTo(String value) {
            addCriterion("spare_parts <>", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsGreaterThan(String value) {
            addCriterion("spare_parts >", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts >=", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsLessThan(String value) {
            addCriterion("spare_parts <", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsLessThanOrEqualTo(String value) {
            addCriterion("spare_parts <=", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsLike(String value) {
            addCriterion("spare_parts like", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsNotLike(String value) {
            addCriterion("spare_parts not like", value, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsIn(List<String> values) {
            addCriterion("spare_parts in", values, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsNotIn(List<String> values) {
            addCriterion("spare_parts not in", values, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsBetween(String value1, String value2) {
            addCriterion("spare_parts between", value1, value2, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsNotBetween(String value1, String value2) {
            addCriterion("spare_parts not between", value1, value2, "spareParts");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchIsNull() {
            addCriterion("spare_parts_batch is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchIsNotNull() {
            addCriterion("spare_parts_batch is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchEqualTo(String value) {
            addCriterion("spare_parts_batch =", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchNotEqualTo(String value) {
            addCriterion("spare_parts_batch <>", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchGreaterThan(String value) {
            addCriterion("spare_parts_batch >", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_batch >=", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchLessThan(String value) {
            addCriterion("spare_parts_batch <", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_batch <=", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchLike(String value) {
            addCriterion("spare_parts_batch like", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchNotLike(String value) {
            addCriterion("spare_parts_batch not like", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchIn(List<String> values) {
            addCriterion("spare_parts_batch in", values, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchNotIn(List<String> values) {
            addCriterion("spare_parts_batch not in", values, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchBetween(String value1, String value2) {
            addCriterion("spare_parts_batch between", value1, value2, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchNotBetween(String value1, String value2) {
            addCriterion("spare_parts_batch not between", value1, value2, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andStockinNumIsNull() {
            addCriterion("stockin_num is null");
            return (Criteria) this;
        }

        public Criteria andStockinNumIsNotNull() {
            addCriterion("stockin_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockinNumEqualTo(Double value) {
            addCriterion("stockin_num =", value, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumNotEqualTo(Double value) {
            addCriterion("stockin_num <>", value, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumGreaterThan(Double value) {
            addCriterion("stockin_num >", value, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumGreaterThanOrEqualTo(Double value) {
            addCriterion("stockin_num >=", value, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumLessThan(Double value) {
            addCriterion("stockin_num <", value, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumLessThanOrEqualTo(Double value) {
            addCriterion("stockin_num <=", value, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumIn(List<Double> values) {
            addCriterion("stockin_num in", values, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumNotIn(List<Double> values) {
            addCriterion("stockin_num not in", values, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumBetween(Double value1, Double value2) {
            addCriterion("stockin_num between", value1, value2, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinNumNotBetween(Double value1, Double value2) {
            addCriterion("stockin_num not between", value1, value2, "stockinNum");
            return (Criteria) this;
        }

        public Criteria andStockinUserIsNull() {
            addCriterion("stockin_user is null");
            return (Criteria) this;
        }

        public Criteria andStockinUserIsNotNull() {
            addCriterion("stockin_user is not null");
            return (Criteria) this;
        }

        public Criteria andStockinUserEqualTo(Integer value) {
            addCriterion("stockin_user =", value, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinUserNotEqualTo(Integer value) {
            addCriterion("stockin_user <>", value, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinUserGreaterThan(Integer value) {
            addCriterion("stockin_user >", value, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockin_user >=", value, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinUserLessThan(Integer value) {
            addCriterion("stockin_user <", value, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinUserLessThanOrEqualTo(Integer value) {
            addCriterion("stockin_user <=", value, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinUserIn(List<Integer> values) {
            addCriterion("stockin_user in", values, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinUserNotIn(List<Integer> values) {
            addCriterion("stockin_user not in", values, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinUserBetween(Integer value1, Integer value2) {
            addCriterion("stockin_user between", value1, value2, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinUserNotBetween(Integer value1, Integer value2) {
            addCriterion("stockin_user not between", value1, value2, "stockinUser");
            return (Criteria) this;
        }

        public Criteria andStockinDateIsNull() {
            addCriterion("stockin_date is null");
            return (Criteria) this;
        }

        public Criteria andStockinDateIsNotNull() {
            addCriterion("stockin_date is not null");
            return (Criteria) this;
        }

        public Criteria andStockinDateEqualTo(Date value) {
            addCriterion("stockin_date =", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateNotEqualTo(Date value) {
            addCriterion("stockin_date <>", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateGreaterThan(Date value) {
            addCriterion("stockin_date >", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateGreaterThanOrEqualTo(Date value) {
            addCriterion("stockin_date >=", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateLessThan(Date value) {
            addCriterion("stockin_date <", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateLessThanOrEqualTo(Date value) {
            addCriterion("stockin_date <=", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateIn(List<Date> values) {
            addCriterion("stockin_date in", values, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateNotIn(List<Date> values) {
            addCriterion("stockin_date not in", values, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateBetween(Date value1, Date value2) {
            addCriterion("stockin_date between", value1, value2, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateNotBetween(Date value1, Date value2) {
            addCriterion("stockin_date not between", value1, value2, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andMaintainNumIsNull() {
            addCriterion("maintain_num is null");
            return (Criteria) this;
        }

        public Criteria andMaintainNumIsNotNull() {
            addCriterion("maintain_num is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainNumEqualTo(Double value) {
            addCriterion("maintain_num =", value, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumNotEqualTo(Double value) {
            addCriterion("maintain_num <>", value, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumGreaterThan(Double value) {
            addCriterion("maintain_num >", value, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumGreaterThanOrEqualTo(Double value) {
            addCriterion("maintain_num >=", value, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumLessThan(Double value) {
            addCriterion("maintain_num <", value, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumLessThanOrEqualTo(Double value) {
            addCriterion("maintain_num <=", value, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumIn(List<Double> values) {
            addCriterion("maintain_num in", values, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumNotIn(List<Double> values) {
            addCriterion("maintain_num not in", values, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumBetween(Double value1, Double value2) {
            addCriterion("maintain_num between", value1, value2, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumNotBetween(Double value1, Double value2) {
            addCriterion("maintain_num not between", value1, value2, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumIsNull() {
            addCriterion("waste_num is null");
            return (Criteria) this;
        }

        public Criteria andWasteNumIsNotNull() {
            addCriterion("waste_num is not null");
            return (Criteria) this;
        }

        public Criteria andWasteNumEqualTo(Double value) {
            addCriterion("waste_num =", value, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumNotEqualTo(Double value) {
            addCriterion("waste_num <>", value, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumGreaterThan(Double value) {
            addCriterion("waste_num >", value, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumGreaterThanOrEqualTo(Double value) {
            addCriterion("waste_num >=", value, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumLessThan(Double value) {
            addCriterion("waste_num <", value, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumLessThanOrEqualTo(Double value) {
            addCriterion("waste_num <=", value, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumIn(List<Double> values) {
            addCriterion("waste_num in", values, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumNotIn(List<Double> values) {
            addCriterion("waste_num not in", values, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumBetween(Double value1, Double value2) {
            addCriterion("waste_num between", value1, value2, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumNotBetween(Double value1, Double value2) {
            addCriterion("waste_num not between", value1, value2, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumIsNull() {
            addCriterion("surplus_maintain_num is null");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumIsNotNull() {
            addCriterion("surplus_maintain_num is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumEqualTo(Double value) {
            addCriterion("surplus_maintain_num =", value, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumNotEqualTo(Double value) {
            addCriterion("surplus_maintain_num <>", value, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumGreaterThan(Double value) {
            addCriterion("surplus_maintain_num >", value, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumGreaterThanOrEqualTo(Double value) {
            addCriterion("surplus_maintain_num >=", value, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumLessThan(Double value) {
            addCriterion("surplus_maintain_num <", value, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumLessThanOrEqualTo(Double value) {
            addCriterion("surplus_maintain_num <=", value, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumIn(List<Double> values) {
            addCriterion("surplus_maintain_num in", values, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumNotIn(List<Double> values) {
            addCriterion("surplus_maintain_num not in", values, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumBetween(Double value1, Double value2) {
            addCriterion("surplus_maintain_num between", value1, value2, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusMaintainNumNotBetween(Double value1, Double value2) {
            addCriterion("surplus_maintain_num not between", value1, value2, "surplusMaintainNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumIsNull() {
            addCriterion("surplus_waste_num is null");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumIsNotNull() {
            addCriterion("surplus_waste_num is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumEqualTo(Double value) {
            addCriterion("surplus_waste_num =", value, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumNotEqualTo(Double value) {
            addCriterion("surplus_waste_num <>", value, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumGreaterThan(Double value) {
            addCriterion("surplus_waste_num >", value, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumGreaterThanOrEqualTo(Double value) {
            addCriterion("surplus_waste_num >=", value, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumLessThan(Double value) {
            addCriterion("surplus_waste_num <", value, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumLessThanOrEqualTo(Double value) {
            addCriterion("surplus_waste_num <=", value, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumIn(List<Double> values) {
            addCriterion("surplus_waste_num in", values, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumNotIn(List<Double> values) {
            addCriterion("surplus_waste_num not in", values, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumBetween(Double value1, Double value2) {
            addCriterion("surplus_waste_num between", value1, value2, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andSurplusWasteNumNotBetween(Double value1, Double value2) {
            addCriterion("surplus_waste_num not between", value1, value2, "surplusWasteNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumIsNull() {
            addCriterion("stockout_maintain_num is null");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumIsNotNull() {
            addCriterion("stockout_maintain_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumEqualTo(Double value) {
            addCriterion("stockout_maintain_num =", value, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumNotEqualTo(Double value) {
            addCriterion("stockout_maintain_num <>", value, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumGreaterThan(Double value) {
            addCriterion("stockout_maintain_num >", value, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumGreaterThanOrEqualTo(Double value) {
            addCriterion("stockout_maintain_num >=", value, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumLessThan(Double value) {
            addCriterion("stockout_maintain_num <", value, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumLessThanOrEqualTo(Double value) {
            addCriterion("stockout_maintain_num <=", value, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumIn(List<Double> values) {
            addCriterion("stockout_maintain_num in", values, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumNotIn(List<Double> values) {
            addCriterion("stockout_maintain_num not in", values, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumBetween(Double value1, Double value2) {
            addCriterion("stockout_maintain_num between", value1, value2, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNumNotBetween(Double value1, Double value2) {
            addCriterion("stockout_maintain_num not between", value1, value2, "stockoutMaintainNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumIsNull() {
            addCriterion("waste_stockout_num is null");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumIsNotNull() {
            addCriterion("waste_stockout_num is not null");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumEqualTo(Double value) {
            addCriterion("waste_stockout_num =", value, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumNotEqualTo(Double value) {
            addCriterion("waste_stockout_num <>", value, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumGreaterThan(Double value) {
            addCriterion("waste_stockout_num >", value, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumGreaterThanOrEqualTo(Double value) {
            addCriterion("waste_stockout_num >=", value, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumLessThan(Double value) {
            addCriterion("waste_stockout_num <", value, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumLessThanOrEqualTo(Double value) {
            addCriterion("waste_stockout_num <=", value, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumIn(List<Double> values) {
            addCriterion("waste_stockout_num in", values, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumNotIn(List<Double> values) {
            addCriterion("waste_stockout_num not in", values, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumBetween(Double value1, Double value2) {
            addCriterion("waste_stockout_num between", value1, value2, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andWasteStockoutNumNotBetween(Double value1, Double value2) {
            addCriterion("waste_stockout_num not between", value1, value2, "wasteStockoutNum");
            return (Criteria) this;
        }

        public Criteria andStockinPriceIsNull() {
            addCriterion("stockin_price is null");
            return (Criteria) this;
        }

        public Criteria andStockinPriceIsNotNull() {
            addCriterion("stockin_price is not null");
            return (Criteria) this;
        }

        public Criteria andStockinPriceEqualTo(BigDecimal value) {
            addCriterion("stockin_price =", value, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andStockinPriceNotEqualTo(BigDecimal value) {
            addCriterion("stockin_price <>", value, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andStockinPriceGreaterThan(BigDecimal value) {
            addCriterion("stockin_price >", value, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andStockinPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stockin_price >=", value, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andStockinPriceLessThan(BigDecimal value) {
            addCriterion("stockin_price <", value, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andStockinPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stockin_price <=", value, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andStockinPriceIn(List<BigDecimal> values) {
            addCriterion("stockin_price in", values, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andStockinPriceNotIn(List<BigDecimal> values) {
            addCriterion("stockin_price not in", values, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andStockinPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stockin_price between", value1, value2, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andStockinPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stockin_price not between", value1, value2, "stockinPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceIsNull() {
            addCriterion("use_spare_parts_price is null");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceIsNotNull() {
            addCriterion("use_spare_parts_price is not null");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceEqualTo(BigDecimal value) {
            addCriterion("use_spare_parts_price =", value, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceNotEqualTo(BigDecimal value) {
            addCriterion("use_spare_parts_price <>", value, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceGreaterThan(BigDecimal value) {
            addCriterion("use_spare_parts_price >", value, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("use_spare_parts_price >=", value, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceLessThan(BigDecimal value) {
            addCriterion("use_spare_parts_price <", value, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("use_spare_parts_price <=", value, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceIn(List<BigDecimal> values) {
            addCriterion("use_spare_parts_price in", values, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceNotIn(List<BigDecimal> values) {
            addCriterion("use_spare_parts_price not in", values, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_spare_parts_price between", value1, value2, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andUseSparePartsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_spare_parts_price not between", value1, value2, "useSparePartsPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceIsNull() {
            addCriterion("stockout_price is null");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceIsNotNull() {
            addCriterion("stockout_price is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceEqualTo(BigDecimal value) {
            addCriterion("stockout_price =", value, "stockoutPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceNotEqualTo(BigDecimal value) {
            addCriterion("stockout_price <>", value, "stockoutPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceGreaterThan(BigDecimal value) {
            addCriterion("stockout_price >", value, "stockoutPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stockout_price >=", value, "stockoutPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceLessThan(BigDecimal value) {
            addCriterion("stockout_price <", value, "stockoutPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stockout_price <=", value, "stockoutPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceIn(List<BigDecimal> values) {
            addCriterion("stockout_price in", values, "stockoutPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceNotIn(List<BigDecimal> values) {
            addCriterion("stockout_price not in", values, "stockoutPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stockout_price between", value1, value2, "stockoutPrice");
            return (Criteria) this;
        }

        public Criteria andStockoutPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stockout_price not between", value1, value2, "stockoutPrice");
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