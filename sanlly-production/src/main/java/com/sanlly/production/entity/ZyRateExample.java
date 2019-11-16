package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZyRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ZyRateExample() {
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

        public Criteria andProdZyRateIdIsNull() {
            addCriterion("prod_zy_rate_id is null");
            return (Criteria) this;
        }

        public Criteria andProdZyRateIdIsNotNull() {
            addCriterion("prod_zy_rate_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdZyRateIdEqualTo(String value) {
            addCriterion("prod_zy_rate_id =", value, "prodZyRateId");
            return (Criteria) this;
        }

        public Criteria andProdZyRateIdNotEqualTo(String value) {
            addCriterion("prod_zy_rate_id <>", value, "prodZyRateId");
            return (Criteria) this;
        }

        public Criteria andProdZyRateIdGreaterThan(String value) {
            addCriterion("prod_zy_rate_id >", value, "prodZyRateId");
            return (Criteria) this;
        }

        public Criteria andProdZyRateIdGreaterThanOrEqualTo(String value) {
            addCriterion("prod_zy_rate_id >=", value, "prodZyRateId");
            return (Criteria) this;
        }

        public Criteria andProdZyRateIdLessThan(String value) {
            addCriterion("prod_zy_rate_id <", value, "prodZyRateId");
            return (Criteria) this;
        }

        public Criteria andProdZyRateIdLessThanOrEqualTo(String value) {
            addCriterion("prod_zy_rate_id <=", value, "prodZyRateId");
            return (Criteria) this;
        }

        public Criteria andProdZyRateIdLike(String value) {
            addCriterion("prod_zy_rate_id like", value, "prodZyRateId");
            return (Criteria) this;
        }

        public Criteria andProdZyRateIdNotLike(String value) {
            addCriterion("prod_zy_rate_id not like", value, "prodZyRateId");
            return (Criteria) this;
        }

        public Criteria andProdZyRateIdIn(List<String> values) {
            addCriterion("prod_zy_rate_id in", values, "prodZyRateId");
            return (Criteria) this;
        }

        public Criteria andProdZyRateIdNotIn(List<String> values) {
            addCriterion("prod_zy_rate_id not in", values, "prodZyRateId");
            return (Criteria) this;
        }

        public Criteria andProdZyRateIdBetween(String value1, String value2) {
            addCriterion("prod_zy_rate_id between", value1, value2, "prodZyRateId");
            return (Criteria) this;
        }

        public Criteria andProdZyRateIdNotBetween(String value1, String value2) {
            addCriterion("prod_zy_rate_id not between", value1, value2, "prodZyRateId");
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

        public Criteria andCosRateCodeIsNull() {
            addCriterion("cos_rate_code is null");
            return (Criteria) this;
        }

        public Criteria andCosRateCodeIsNotNull() {
            addCriterion("cos_rate_code is not null");
            return (Criteria) this;
        }

        public Criteria andCosRateCodeEqualTo(String value) {
            addCriterion("cos_rate_code =", value, "cosRateCode");
            return (Criteria) this;
        }

        public Criteria andCosRateCodeNotEqualTo(String value) {
            addCriterion("cos_rate_code <>", value, "cosRateCode");
            return (Criteria) this;
        }

        public Criteria andCosRateCodeGreaterThan(String value) {
            addCriterion("cos_rate_code >", value, "cosRateCode");
            return (Criteria) this;
        }

        public Criteria andCosRateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cos_rate_code >=", value, "cosRateCode");
            return (Criteria) this;
        }

        public Criteria andCosRateCodeLessThan(String value) {
            addCriterion("cos_rate_code <", value, "cosRateCode");
            return (Criteria) this;
        }

        public Criteria andCosRateCodeLessThanOrEqualTo(String value) {
            addCriterion("cos_rate_code <=", value, "cosRateCode");
            return (Criteria) this;
        }

        public Criteria andCosRateCodeLike(String value) {
            addCriterion("cos_rate_code like", value, "cosRateCode");
            return (Criteria) this;
        }

        public Criteria andCosRateCodeNotLike(String value) {
            addCriterion("cos_rate_code not like", value, "cosRateCode");
            return (Criteria) this;
        }

        public Criteria andCosRateCodeIn(List<String> values) {
            addCriterion("cos_rate_code in", values, "cosRateCode");
            return (Criteria) this;
        }

        public Criteria andCosRateCodeNotIn(List<String> values) {
            addCriterion("cos_rate_code not in", values, "cosRateCode");
            return (Criteria) this;
        }

        public Criteria andCosRateCodeBetween(String value1, String value2) {
            addCriterion("cos_rate_code between", value1, value2, "cosRateCode");
            return (Criteria) this;
        }

        public Criteria andCosRateCodeNotBetween(String value1, String value2) {
            addCriterion("cos_rate_code not between", value1, value2, "cosRateCode");
            return (Criteria) this;
        }

        public Criteria andCosPartsCodeIsNull() {
            addCriterion("cos_parts_code is null");
            return (Criteria) this;
        }

        public Criteria andCosPartsCodeIsNotNull() {
            addCriterion("cos_parts_code is not null");
            return (Criteria) this;
        }

        public Criteria andCosPartsCodeEqualTo(String value) {
            addCriterion("cos_parts_code =", value, "cosPartsCode");
            return (Criteria) this;
        }

        public Criteria andCosPartsCodeNotEqualTo(String value) {
            addCriterion("cos_parts_code <>", value, "cosPartsCode");
            return (Criteria) this;
        }

        public Criteria andCosPartsCodeGreaterThan(String value) {
            addCriterion("cos_parts_code >", value, "cosPartsCode");
            return (Criteria) this;
        }

        public Criteria andCosPartsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cos_parts_code >=", value, "cosPartsCode");
            return (Criteria) this;
        }

        public Criteria andCosPartsCodeLessThan(String value) {
            addCriterion("cos_parts_code <", value, "cosPartsCode");
            return (Criteria) this;
        }

        public Criteria andCosPartsCodeLessThanOrEqualTo(String value) {
            addCriterion("cos_parts_code <=", value, "cosPartsCode");
            return (Criteria) this;
        }

        public Criteria andCosPartsCodeLike(String value) {
            addCriterion("cos_parts_code like", value, "cosPartsCode");
            return (Criteria) this;
        }

        public Criteria andCosPartsCodeNotLike(String value) {
            addCriterion("cos_parts_code not like", value, "cosPartsCode");
            return (Criteria) this;
        }

        public Criteria andCosPartsCodeIn(List<String> values) {
            addCriterion("cos_parts_code in", values, "cosPartsCode");
            return (Criteria) this;
        }

        public Criteria andCosPartsCodeNotIn(List<String> values) {
            addCriterion("cos_parts_code not in", values, "cosPartsCode");
            return (Criteria) this;
        }

        public Criteria andCosPartsCodeBetween(String value1, String value2) {
            addCriterion("cos_parts_code between", value1, value2, "cosPartsCode");
            return (Criteria) this;
        }

        public Criteria andCosPartsCodeNotBetween(String value1, String value2) {
            addCriterion("cos_parts_code not between", value1, value2, "cosPartsCode");
            return (Criteria) this;
        }

        public Criteria andCosRepairCodeIsNull() {
            addCriterion("cos_repair_code is null");
            return (Criteria) this;
        }

        public Criteria andCosRepairCodeIsNotNull() {
            addCriterion("cos_repair_code is not null");
            return (Criteria) this;
        }

        public Criteria andCosRepairCodeEqualTo(String value) {
            addCriterion("cos_repair_code =", value, "cosRepairCode");
            return (Criteria) this;
        }

        public Criteria andCosRepairCodeNotEqualTo(String value) {
            addCriterion("cos_repair_code <>", value, "cosRepairCode");
            return (Criteria) this;
        }

        public Criteria andCosRepairCodeGreaterThan(String value) {
            addCriterion("cos_repair_code >", value, "cosRepairCode");
            return (Criteria) this;
        }

        public Criteria andCosRepairCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cos_repair_code >=", value, "cosRepairCode");
            return (Criteria) this;
        }

        public Criteria andCosRepairCodeLessThan(String value) {
            addCriterion("cos_repair_code <", value, "cosRepairCode");
            return (Criteria) this;
        }

        public Criteria andCosRepairCodeLessThanOrEqualTo(String value) {
            addCriterion("cos_repair_code <=", value, "cosRepairCode");
            return (Criteria) this;
        }

        public Criteria andCosRepairCodeLike(String value) {
            addCriterion("cos_repair_code like", value, "cosRepairCode");
            return (Criteria) this;
        }

        public Criteria andCosRepairCodeNotLike(String value) {
            addCriterion("cos_repair_code not like", value, "cosRepairCode");
            return (Criteria) this;
        }

        public Criteria andCosRepairCodeIn(List<String> values) {
            addCriterion("cos_repair_code in", values, "cosRepairCode");
            return (Criteria) this;
        }

        public Criteria andCosRepairCodeNotIn(List<String> values) {
            addCriterion("cos_repair_code not in", values, "cosRepairCode");
            return (Criteria) this;
        }

        public Criteria andCosRepairCodeBetween(String value1, String value2) {
            addCriterion("cos_repair_code between", value1, value2, "cosRepairCode");
            return (Criteria) this;
        }

        public Criteria andCosRepairCodeNotBetween(String value1, String value2) {
            addCriterion("cos_repair_code not between", value1, value2, "cosRepairCode");
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

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIsNull() {
            addCriterion("calculation_type is null");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIsNotNull() {
            addCriterion("calculation_type is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeEqualTo(String value) {
            addCriterion("calculation_type =", value, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNotEqualTo(String value) {
            addCriterion("calculation_type <>", value, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeGreaterThan(String value) {
            addCriterion("calculation_type >", value, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("calculation_type >=", value, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeLessThan(String value) {
            addCriterion("calculation_type <", value, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeLessThanOrEqualTo(String value) {
            addCriterion("calculation_type <=", value, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeLike(String value) {
            addCriterion("calculation_type like", value, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNotLike(String value) {
            addCriterion("calculation_type not like", value, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeIn(List<String> values) {
            addCriterion("calculation_type in", values, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNotIn(List<String> values) {
            addCriterion("calculation_type not in", values, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeBetween(String value1, String value2) {
            addCriterion("calculation_type between", value1, value2, "calculationType");
            return (Criteria) this;
        }

        public Criteria andCalculationTypeNotBetween(String value1, String value2) {
            addCriterion("calculation_type not between", value1, value2, "calculationType");
            return (Criteria) this;
        }

        public Criteria andManHourIsNull() {
            addCriterion("man_hour is null");
            return (Criteria) this;
        }

        public Criteria andManHourIsNotNull() {
            addCriterion("man_hour is not null");
            return (Criteria) this;
        }

        public Criteria andManHourEqualTo(Double value) {
            addCriterion("man_hour =", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourNotEqualTo(Double value) {
            addCriterion("man_hour <>", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourGreaterThan(Double value) {
            addCriterion("man_hour >", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourGreaterThanOrEqualTo(Double value) {
            addCriterion("man_hour >=", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourLessThan(Double value) {
            addCriterion("man_hour <", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourLessThanOrEqualTo(Double value) {
            addCriterion("man_hour <=", value, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourIn(List<Double> values) {
            addCriterion("man_hour in", values, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourNotIn(List<Double> values) {
            addCriterion("man_hour not in", values, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourBetween(Double value1, Double value2) {
            addCriterion("man_hour between", value1, value2, "manHour");
            return (Criteria) this;
        }

        public Criteria andManHourNotBetween(Double value1, Double value2) {
            addCriterion("man_hour not between", value1, value2, "manHour");
            return (Criteria) this;
        }

        public Criteria andMaterialCostIsNull() {
            addCriterion("material_cost is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCostIsNotNull() {
            addCriterion("material_cost is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCostEqualTo(BigDecimal value) {
            addCriterion("material_cost =", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostNotEqualTo(BigDecimal value) {
            addCriterion("material_cost <>", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostGreaterThan(BigDecimal value) {
            addCriterion("material_cost >", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("material_cost >=", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostLessThan(BigDecimal value) {
            addCriterion("material_cost <", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("material_cost <=", value, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostIn(List<BigDecimal> values) {
            addCriterion("material_cost in", values, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostNotIn(List<BigDecimal> values) {
            addCriterion("material_cost not in", values, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("material_cost between", value1, value2, "materialCost");
            return (Criteria) this;
        }

        public Criteria andMaterialCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("material_cost not between", value1, value2, "materialCost");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeIsNull() {
            addCriterion("parts_type_code is null");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeIsNotNull() {
            addCriterion("parts_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeEqualTo(String value) {
            addCriterion("parts_type_code =", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeNotEqualTo(String value) {
            addCriterion("parts_type_code <>", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeGreaterThan(String value) {
            addCriterion("parts_type_code >", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parts_type_code >=", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeLessThan(String value) {
            addCriterion("parts_type_code <", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("parts_type_code <=", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeLike(String value) {
            addCriterion("parts_type_code like", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeNotLike(String value) {
            addCriterion("parts_type_code not like", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeIn(List<String> values) {
            addCriterion("parts_type_code in", values, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeNotIn(List<String> values) {
            addCriterion("parts_type_code not in", values, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeBetween(String value1, String value2) {
            addCriterion("parts_type_code between", value1, value2, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeNotBetween(String value1, String value2) {
            addCriterion("parts_type_code not between", value1, value2, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeIsNull() {
            addCriterion("parts_details_code is null");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeIsNotNull() {
            addCriterion("parts_details_code is not null");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeEqualTo(String value) {
            addCriterion("parts_details_code =", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeNotEqualTo(String value) {
            addCriterion("parts_details_code <>", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeGreaterThan(String value) {
            addCriterion("parts_details_code >", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parts_details_code >=", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeLessThan(String value) {
            addCriterion("parts_details_code <", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeLessThanOrEqualTo(String value) {
            addCriterion("parts_details_code <=", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeLike(String value) {
            addCriterion("parts_details_code like", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeNotLike(String value) {
            addCriterion("parts_details_code not like", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeIn(List<String> values) {
            addCriterion("parts_details_code in", values, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeNotIn(List<String> values) {
            addCriterion("parts_details_code not in", values, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeBetween(String value1, String value2) {
            addCriterion("parts_details_code between", value1, value2, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeNotBetween(String value1, String value2) {
            addCriterion("parts_details_code not between", value1, value2, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeIsNull() {
            addCriterion("repair_code is null");
            return (Criteria) this;
        }

        public Criteria andRepairCodeIsNotNull() {
            addCriterion("repair_code is not null");
            return (Criteria) this;
        }

        public Criteria andRepairCodeEqualTo(String value) {
            addCriterion("repair_code =", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeNotEqualTo(String value) {
            addCriterion("repair_code <>", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeGreaterThan(String value) {
            addCriterion("repair_code >", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeGreaterThanOrEqualTo(String value) {
            addCriterion("repair_code >=", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeLessThan(String value) {
            addCriterion("repair_code <", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeLessThanOrEqualTo(String value) {
            addCriterion("repair_code <=", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeLike(String value) {
            addCriterion("repair_code like", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeNotLike(String value) {
            addCriterion("repair_code not like", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeIn(List<String> values) {
            addCriterion("repair_code in", values, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeNotIn(List<String> values) {
            addCriterion("repair_code not in", values, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeBetween(String value1, String value2) {
            addCriterion("repair_code between", value1, value2, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeNotBetween(String value1, String value2) {
            addCriterion("repair_code not between", value1, value2, "repairCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNull() {
            addCriterion("material_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNotNull() {
            addCriterion("material_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeEqualTo(String value) {
            addCriterion("material_code =", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotEqualTo(String value) {
            addCriterion("material_code <>", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThan(String value) {
            addCriterion("material_code >", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("material_code >=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThan(String value) {
            addCriterion("material_code <", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThanOrEqualTo(String value) {
            addCriterion("material_code <=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLike(String value) {
            addCriterion("material_code like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotLike(String value) {
            addCriterion("material_code not like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIn(List<String> values) {
            addCriterion("material_code in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotIn(List<String> values) {
            addCriterion("material_code not in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeBetween(String value1, String value2) {
            addCriterion("material_code between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotBetween(String value1, String value2) {
            addCriterion("material_code not between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("`size` is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("`size` is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("`size` =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("`size` <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("`size` >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("`size` >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("`size` <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("`size` <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("`size` like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("`size` not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("`size` in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("`size` not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("`size` between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("`size` not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIsNull() {
            addCriterion("container_type is null");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIsNotNull() {
            addCriterion("container_type is not null");
            return (Criteria) this;
        }

        public Criteria andContainerTypeEqualTo(String value) {
            addCriterion("container_type =", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotEqualTo(String value) {
            addCriterion("container_type <>", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeGreaterThan(String value) {
            addCriterion("container_type >", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("container_type >=", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLessThan(String value) {
            addCriterion("container_type <", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLessThanOrEqualTo(String value) {
            addCriterion("container_type <=", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLike(String value) {
            addCriterion("container_type like", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotLike(String value) {
            addCriterion("container_type not like", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIn(List<String> values) {
            addCriterion("container_type in", values, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotIn(List<String> values) {
            addCriterion("container_type not in", values, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeBetween(String value1, String value2) {
            addCriterion("container_type between", value1, value2, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotBetween(String value1, String value2) {
            addCriterion("container_type not between", value1, value2, "containerType");
            return (Criteria) this;
        }

        public Criteria andPositionCodeIsNull() {
            addCriterion("position_code is null");
            return (Criteria) this;
        }

        public Criteria andPositionCodeIsNotNull() {
            addCriterion("position_code is not null");
            return (Criteria) this;
        }

        public Criteria andPositionCodeEqualTo(String value) {
            addCriterion("position_code =", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotEqualTo(String value) {
            addCriterion("position_code <>", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeGreaterThan(String value) {
            addCriterion("position_code >", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("position_code >=", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeLessThan(String value) {
            addCriterion("position_code <", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeLessThanOrEqualTo(String value) {
            addCriterion("position_code <=", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeLike(String value) {
            addCriterion("position_code like", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotLike(String value) {
            addCriterion("position_code not like", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeIn(List<String> values) {
            addCriterion("position_code in", values, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotIn(List<String> values) {
            addCriterion("position_code not in", values, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeBetween(String value1, String value2) {
            addCriterion("position_code between", value1, value2, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotBetween(String value1, String value2) {
            addCriterion("position_code not between", value1, value2, "positionCode");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsIsNull() {
            addCriterion("is_repeat_prompts is null");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsIsNotNull() {
            addCriterion("is_repeat_prompts is not null");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsEqualTo(String value) {
            addCriterion("is_repeat_prompts =", value, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsNotEqualTo(String value) {
            addCriterion("is_repeat_prompts <>", value, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsGreaterThan(String value) {
            addCriterion("is_repeat_prompts >", value, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsGreaterThanOrEqualTo(String value) {
            addCriterion("is_repeat_prompts >=", value, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsLessThan(String value) {
            addCriterion("is_repeat_prompts <", value, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsLessThanOrEqualTo(String value) {
            addCriterion("is_repeat_prompts <=", value, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsLike(String value) {
            addCriterion("is_repeat_prompts like", value, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsNotLike(String value) {
            addCriterion("is_repeat_prompts not like", value, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsIn(List<String> values) {
            addCriterion("is_repeat_prompts in", values, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsNotIn(List<String> values) {
            addCriterion("is_repeat_prompts not in", values, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsBetween(String value1, String value2) {
            addCriterion("is_repeat_prompts between", value1, value2, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsRepeatPromptsNotBetween(String value1, String value2) {
            addCriterion("is_repeat_prompts not between", value1, value2, "isRepeatPrompts");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoIsNull() {
            addCriterion("is_must_photo is null");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoIsNotNull() {
            addCriterion("is_must_photo is not null");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoEqualTo(String value) {
            addCriterion("is_must_photo =", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoNotEqualTo(String value) {
            addCriterion("is_must_photo <>", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoGreaterThan(String value) {
            addCriterion("is_must_photo >", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("is_must_photo >=", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoLessThan(String value) {
            addCriterion("is_must_photo <", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoLessThanOrEqualTo(String value) {
            addCriterion("is_must_photo <=", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoLike(String value) {
            addCriterion("is_must_photo like", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoNotLike(String value) {
            addCriterion("is_must_photo not like", value, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoIn(List<String> values) {
            addCriterion("is_must_photo in", values, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoNotIn(List<String> values) {
            addCriterion("is_must_photo not in", values, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoBetween(String value1, String value2) {
            addCriterion("is_must_photo between", value1, value2, "isMustPhoto");
            return (Criteria) this;
        }

        public Criteria andIsMustPhotoNotBetween(String value1, String value2) {
            addCriterion("is_must_photo not between", value1, value2, "isMustPhoto");
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