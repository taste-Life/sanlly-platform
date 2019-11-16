package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RateFormulaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public RateFormulaExample() {
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

        public Criteria andProdRateFormulaIdIsNull() {
            addCriterion("prod_rate_formula_id is null");
            return (Criteria) this;
        }

        public Criteria andProdRateFormulaIdIsNotNull() {
            addCriterion("prod_rate_formula_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdRateFormulaIdEqualTo(String value) {
            addCriterion("prod_rate_formula_id =", value, "prodRateFormulaId");
            return (Criteria) this;
        }

        public Criteria andProdRateFormulaIdNotEqualTo(String value) {
            addCriterion("prod_rate_formula_id <>", value, "prodRateFormulaId");
            return (Criteria) this;
        }

        public Criteria andProdRateFormulaIdGreaterThan(String value) {
            addCriterion("prod_rate_formula_id >", value, "prodRateFormulaId");
            return (Criteria) this;
        }

        public Criteria andProdRateFormulaIdGreaterThanOrEqualTo(String value) {
            addCriterion("prod_rate_formula_id >=", value, "prodRateFormulaId");
            return (Criteria) this;
        }

        public Criteria andProdRateFormulaIdLessThan(String value) {
            addCriterion("prod_rate_formula_id <", value, "prodRateFormulaId");
            return (Criteria) this;
        }

        public Criteria andProdRateFormulaIdLessThanOrEqualTo(String value) {
            addCriterion("prod_rate_formula_id <=", value, "prodRateFormulaId");
            return (Criteria) this;
        }

        public Criteria andProdRateFormulaIdLike(String value) {
            addCriterion("prod_rate_formula_id like", value, "prodRateFormulaId");
            return (Criteria) this;
        }

        public Criteria andProdRateFormulaIdNotLike(String value) {
            addCriterion("prod_rate_formula_id not like", value, "prodRateFormulaId");
            return (Criteria) this;
        }

        public Criteria andProdRateFormulaIdIn(List<String> values) {
            addCriterion("prod_rate_formula_id in", values, "prodRateFormulaId");
            return (Criteria) this;
        }

        public Criteria andProdRateFormulaIdNotIn(List<String> values) {
            addCriterion("prod_rate_formula_id not in", values, "prodRateFormulaId");
            return (Criteria) this;
        }

        public Criteria andProdRateFormulaIdBetween(String value1, String value2) {
            addCriterion("prod_rate_formula_id between", value1, value2, "prodRateFormulaId");
            return (Criteria) this;
        }

        public Criteria andProdRateFormulaIdNotBetween(String value1, String value2) {
            addCriterion("prod_rate_formula_id not between", value1, value2, "prodRateFormulaId");
            return (Criteria) this;
        }

        public Criteria andRateIdIsNull() {
            addCriterion("rate_id is null");
            return (Criteria) this;
        }

        public Criteria andRateIdIsNotNull() {
            addCriterion("rate_id is not null");
            return (Criteria) this;
        }

        public Criteria andRateIdEqualTo(String value) {
            addCriterion("rate_id =", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdNotEqualTo(String value) {
            addCriterion("rate_id <>", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdGreaterThan(String value) {
            addCriterion("rate_id >", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdGreaterThanOrEqualTo(String value) {
            addCriterion("rate_id >=", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdLessThan(String value) {
            addCriterion("rate_id <", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdLessThanOrEqualTo(String value) {
            addCriterion("rate_id <=", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdLike(String value) {
            addCriterion("rate_id like", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdNotLike(String value) {
            addCriterion("rate_id not like", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdIn(List<String> values) {
            addCriterion("rate_id in", values, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdNotIn(List<String> values) {
            addCriterion("rate_id not in", values, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdBetween(String value1, String value2) {
            addCriterion("rate_id between", value1, value2, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdNotBetween(String value1, String value2) {
            addCriterion("rate_id not between", value1, value2, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateCodeIsNull() {
            addCriterion("rate_code is null");
            return (Criteria) this;
        }

        public Criteria andRateCodeIsNotNull() {
            addCriterion("rate_code is not null");
            return (Criteria) this;
        }

        public Criteria andRateCodeEqualTo(String value) {
            addCriterion("rate_code =", value, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeNotEqualTo(String value) {
            addCriterion("rate_code <>", value, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeGreaterThan(String value) {
            addCriterion("rate_code >", value, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("rate_code >=", value, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeLessThan(String value) {
            addCriterion("rate_code <", value, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeLessThanOrEqualTo(String value) {
            addCriterion("rate_code <=", value, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeLike(String value) {
            addCriterion("rate_code like", value, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeNotLike(String value) {
            addCriterion("rate_code not like", value, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeIn(List<String> values) {
            addCriterion("rate_code in", values, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeNotIn(List<String> values) {
            addCriterion("rate_code not in", values, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeBetween(String value1, String value2) {
            addCriterion("rate_code between", value1, value2, "rateCode");
            return (Criteria) this;
        }

        public Criteria andRateCodeNotBetween(String value1, String value2) {
            addCriterion("rate_code not between", value1, value2, "rateCode");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`type` not between", value1, value2, "type");
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

        public Criteria andAlgorithmTypeIsNull() {
            addCriterion("algorithm_type is null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmTypeIsNotNull() {
            addCriterion("algorithm_type is not null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmTypeEqualTo(String value) {
            addCriterion("algorithm_type =", value, "algorithmType");
            return (Criteria) this;
        }

        public Criteria andAlgorithmTypeNotEqualTo(String value) {
            addCriterion("algorithm_type <>", value, "algorithmType");
            return (Criteria) this;
        }

        public Criteria andAlgorithmTypeGreaterThan(String value) {
            addCriterion("algorithm_type >", value, "algorithmType");
            return (Criteria) this;
        }

        public Criteria andAlgorithmTypeGreaterThanOrEqualTo(String value) {
            addCriterion("algorithm_type >=", value, "algorithmType");
            return (Criteria) this;
        }

        public Criteria andAlgorithmTypeLessThan(String value) {
            addCriterion("algorithm_type <", value, "algorithmType");
            return (Criteria) this;
        }

        public Criteria andAlgorithmTypeLessThanOrEqualTo(String value) {
            addCriterion("algorithm_type <=", value, "algorithmType");
            return (Criteria) this;
        }

        public Criteria andAlgorithmTypeLike(String value) {
            addCriterion("algorithm_type like", value, "algorithmType");
            return (Criteria) this;
        }

        public Criteria andAlgorithmTypeNotLike(String value) {
            addCriterion("algorithm_type not like", value, "algorithmType");
            return (Criteria) this;
        }

        public Criteria andAlgorithmTypeIn(List<String> values) {
            addCriterion("algorithm_type in", values, "algorithmType");
            return (Criteria) this;
        }

        public Criteria andAlgorithmTypeNotIn(List<String> values) {
            addCriterion("algorithm_type not in", values, "algorithmType");
            return (Criteria) this;
        }

        public Criteria andAlgorithmTypeBetween(String value1, String value2) {
            addCriterion("algorithm_type between", value1, value2, "algorithmType");
            return (Criteria) this;
        }

        public Criteria andAlgorithmTypeNotBetween(String value1, String value2) {
            addCriterion("algorithm_type not between", value1, value2, "algorithmType");
            return (Criteria) this;
        }

        public Criteria andAlgorithmBasisIsNull() {
            addCriterion("algorithm_basis is null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmBasisIsNotNull() {
            addCriterion("algorithm_basis is not null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmBasisEqualTo(String value) {
            addCriterion("algorithm_basis =", value, "algorithmBasis");
            return (Criteria) this;
        }

        public Criteria andAlgorithmBasisNotEqualTo(String value) {
            addCriterion("algorithm_basis <>", value, "algorithmBasis");
            return (Criteria) this;
        }

        public Criteria andAlgorithmBasisGreaterThan(String value) {
            addCriterion("algorithm_basis >", value, "algorithmBasis");
            return (Criteria) this;
        }

        public Criteria andAlgorithmBasisGreaterThanOrEqualTo(String value) {
            addCriterion("algorithm_basis >=", value, "algorithmBasis");
            return (Criteria) this;
        }

        public Criteria andAlgorithmBasisLessThan(String value) {
            addCriterion("algorithm_basis <", value, "algorithmBasis");
            return (Criteria) this;
        }

        public Criteria andAlgorithmBasisLessThanOrEqualTo(String value) {
            addCriterion("algorithm_basis <=", value, "algorithmBasis");
            return (Criteria) this;
        }

        public Criteria andAlgorithmBasisLike(String value) {
            addCriterion("algorithm_basis like", value, "algorithmBasis");
            return (Criteria) this;
        }

        public Criteria andAlgorithmBasisNotLike(String value) {
            addCriterion("algorithm_basis not like", value, "algorithmBasis");
            return (Criteria) this;
        }

        public Criteria andAlgorithmBasisIn(List<String> values) {
            addCriterion("algorithm_basis in", values, "algorithmBasis");
            return (Criteria) this;
        }

        public Criteria andAlgorithmBasisNotIn(List<String> values) {
            addCriterion("algorithm_basis not in", values, "algorithmBasis");
            return (Criteria) this;
        }

        public Criteria andAlgorithmBasisBetween(String value1, String value2) {
            addCriterion("algorithm_basis between", value1, value2, "algorithmBasis");
            return (Criteria) this;
        }

        public Criteria andAlgorithmBasisNotBetween(String value1, String value2) {
            addCriterion("algorithm_basis not between", value1, value2, "algorithmBasis");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberIsNull() {
            addCriterion("cardinal_number is null");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberIsNotNull() {
            addCriterion("cardinal_number is not null");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberEqualTo(Double value) {
            addCriterion("cardinal_number =", value, "cardinalNumber");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberNotEqualTo(Double value) {
            addCriterion("cardinal_number <>", value, "cardinalNumber");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberGreaterThan(Double value) {
            addCriterion("cardinal_number >", value, "cardinalNumber");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberGreaterThanOrEqualTo(Double value) {
            addCriterion("cardinal_number >=", value, "cardinalNumber");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberLessThan(Double value) {
            addCriterion("cardinal_number <", value, "cardinalNumber");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberLessThanOrEqualTo(Double value) {
            addCriterion("cardinal_number <=", value, "cardinalNumber");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberIn(List<Double> values) {
            addCriterion("cardinal_number in", values, "cardinalNumber");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberNotIn(List<Double> values) {
            addCriterion("cardinal_number not in", values, "cardinalNumber");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberBetween(Double value1, Double value2) {
            addCriterion("cardinal_number between", value1, value2, "cardinalNumber");
            return (Criteria) this;
        }

        public Criteria andCardinalNumberNotBetween(Double value1, Double value2) {
            addCriterion("cardinal_number not between", value1, value2, "cardinalNumber");
            return (Criteria) this;
        }

        public Criteria andStartValueIsNull() {
            addCriterion("start_value is null");
            return (Criteria) this;
        }

        public Criteria andStartValueIsNotNull() {
            addCriterion("start_value is not null");
            return (Criteria) this;
        }

        public Criteria andStartValueEqualTo(Double value) {
            addCriterion("start_value =", value, "startValue");
            return (Criteria) this;
        }

        public Criteria andStartValueNotEqualTo(Double value) {
            addCriterion("start_value <>", value, "startValue");
            return (Criteria) this;
        }

        public Criteria andStartValueGreaterThan(Double value) {
            addCriterion("start_value >", value, "startValue");
            return (Criteria) this;
        }

        public Criteria andStartValueGreaterThanOrEqualTo(Double value) {
            addCriterion("start_value >=", value, "startValue");
            return (Criteria) this;
        }

        public Criteria andStartValueLessThan(Double value) {
            addCriterion("start_value <", value, "startValue");
            return (Criteria) this;
        }

        public Criteria andStartValueLessThanOrEqualTo(Double value) {
            addCriterion("start_value <=", value, "startValue");
            return (Criteria) this;
        }

        public Criteria andStartValueIn(List<Double> values) {
            addCriterion("start_value in", values, "startValue");
            return (Criteria) this;
        }

        public Criteria andStartValueNotIn(List<Double> values) {
            addCriterion("start_value not in", values, "startValue");
            return (Criteria) this;
        }

        public Criteria andStartValueBetween(Double value1, Double value2) {
            addCriterion("start_value between", value1, value2, "startValue");
            return (Criteria) this;
        }

        public Criteria andStartValueNotBetween(Double value1, Double value2) {
            addCriterion("start_value not between", value1, value2, "startValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueIsNull() {
            addCriterion("max_value is null");
            return (Criteria) this;
        }

        public Criteria andMaxValueIsNotNull() {
            addCriterion("max_value is not null");
            return (Criteria) this;
        }

        public Criteria andMaxValueEqualTo(Double value) {
            addCriterion("max_value =", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotEqualTo(Double value) {
            addCriterion("max_value <>", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueGreaterThan(Double value) {
            addCriterion("max_value >", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueGreaterThanOrEqualTo(Double value) {
            addCriterion("max_value >=", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLessThan(Double value) {
            addCriterion("max_value <", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLessThanOrEqualTo(Double value) {
            addCriterion("max_value <=", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueIn(List<Double> values) {
            addCriterion("max_value in", values, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotIn(List<Double> values) {
            addCriterion("max_value not in", values, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueBetween(Double value1, Double value2) {
            addCriterion("max_value between", value1, value2, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotBetween(Double value1, Double value2) {
            addCriterion("max_value not between", value1, value2, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxCardinalNumberIsNull() {
            addCriterion("max_cardinal_number is null");
            return (Criteria) this;
        }

        public Criteria andMaxCardinalNumberIsNotNull() {
            addCriterion("max_cardinal_number is not null");
            return (Criteria) this;
        }

        public Criteria andMaxCardinalNumberEqualTo(Double value) {
            addCriterion("max_cardinal_number =", value, "maxCardinalNumber");
            return (Criteria) this;
        }

        public Criteria andMaxCardinalNumberNotEqualTo(Double value) {
            addCriterion("max_cardinal_number <>", value, "maxCardinalNumber");
            return (Criteria) this;
        }

        public Criteria andMaxCardinalNumberGreaterThan(Double value) {
            addCriterion("max_cardinal_number >", value, "maxCardinalNumber");
            return (Criteria) this;
        }

        public Criteria andMaxCardinalNumberGreaterThanOrEqualTo(Double value) {
            addCriterion("max_cardinal_number >=", value, "maxCardinalNumber");
            return (Criteria) this;
        }

        public Criteria andMaxCardinalNumberLessThan(Double value) {
            addCriterion("max_cardinal_number <", value, "maxCardinalNumber");
            return (Criteria) this;
        }

        public Criteria andMaxCardinalNumberLessThanOrEqualTo(Double value) {
            addCriterion("max_cardinal_number <=", value, "maxCardinalNumber");
            return (Criteria) this;
        }

        public Criteria andMaxCardinalNumberIn(List<Double> values) {
            addCriterion("max_cardinal_number in", values, "maxCardinalNumber");
            return (Criteria) this;
        }

        public Criteria andMaxCardinalNumberNotIn(List<Double> values) {
            addCriterion("max_cardinal_number not in", values, "maxCardinalNumber");
            return (Criteria) this;
        }

        public Criteria andMaxCardinalNumberBetween(Double value1, Double value2) {
            addCriterion("max_cardinal_number between", value1, value2, "maxCardinalNumber");
            return (Criteria) this;
        }

        public Criteria andMaxCardinalNumberNotBetween(Double value1, Double value2) {
            addCriterion("max_cardinal_number not between", value1, value2, "maxCardinalNumber");
            return (Criteria) this;
        }

        public Criteria andAddValueIsNull() {
            addCriterion("add_value is null");
            return (Criteria) this;
        }

        public Criteria andAddValueIsNotNull() {
            addCriterion("add_value is not null");
            return (Criteria) this;
        }

        public Criteria andAddValueEqualTo(Double value) {
            addCriterion("add_value =", value, "addValue");
            return (Criteria) this;
        }

        public Criteria andAddValueNotEqualTo(Double value) {
            addCriterion("add_value <>", value, "addValue");
            return (Criteria) this;
        }

        public Criteria andAddValueGreaterThan(Double value) {
            addCriterion("add_value >", value, "addValue");
            return (Criteria) this;
        }

        public Criteria andAddValueGreaterThanOrEqualTo(Double value) {
            addCriterion("add_value >=", value, "addValue");
            return (Criteria) this;
        }

        public Criteria andAddValueLessThan(Double value) {
            addCriterion("add_value <", value, "addValue");
            return (Criteria) this;
        }

        public Criteria andAddValueLessThanOrEqualTo(Double value) {
            addCriterion("add_value <=", value, "addValue");
            return (Criteria) this;
        }

        public Criteria andAddValueIn(List<Double> values) {
            addCriterion("add_value in", values, "addValue");
            return (Criteria) this;
        }

        public Criteria andAddValueNotIn(List<Double> values) {
            addCriterion("add_value not in", values, "addValue");
            return (Criteria) this;
        }

        public Criteria andAddValueBetween(Double value1, Double value2) {
            addCriterion("add_value between", value1, value2, "addValue");
            return (Criteria) this;
        }

        public Criteria andAddValueNotBetween(Double value1, Double value2) {
            addCriterion("add_value not between", value1, value2, "addValue");
            return (Criteria) this;
        }

        public Criteria andAddCardinalNumberIsNull() {
            addCriterion("add_cardinal_number is null");
            return (Criteria) this;
        }

        public Criteria andAddCardinalNumberIsNotNull() {
            addCriterion("add_cardinal_number is not null");
            return (Criteria) this;
        }

        public Criteria andAddCardinalNumberEqualTo(Double value) {
            addCriterion("add_cardinal_number =", value, "addCardinalNumber");
            return (Criteria) this;
        }

        public Criteria andAddCardinalNumberNotEqualTo(Double value) {
            addCriterion("add_cardinal_number <>", value, "addCardinalNumber");
            return (Criteria) this;
        }

        public Criteria andAddCardinalNumberGreaterThan(Double value) {
            addCriterion("add_cardinal_number >", value, "addCardinalNumber");
            return (Criteria) this;
        }

        public Criteria andAddCardinalNumberGreaterThanOrEqualTo(Double value) {
            addCriterion("add_cardinal_number >=", value, "addCardinalNumber");
            return (Criteria) this;
        }

        public Criteria andAddCardinalNumberLessThan(Double value) {
            addCriterion("add_cardinal_number <", value, "addCardinalNumber");
            return (Criteria) this;
        }

        public Criteria andAddCardinalNumberLessThanOrEqualTo(Double value) {
            addCriterion("add_cardinal_number <=", value, "addCardinalNumber");
            return (Criteria) this;
        }

        public Criteria andAddCardinalNumberIn(List<Double> values) {
            addCriterion("add_cardinal_number in", values, "addCardinalNumber");
            return (Criteria) this;
        }

        public Criteria andAddCardinalNumberNotIn(List<Double> values) {
            addCriterion("add_cardinal_number not in", values, "addCardinalNumber");
            return (Criteria) this;
        }

        public Criteria andAddCardinalNumberBetween(Double value1, Double value2) {
            addCriterion("add_cardinal_number between", value1, value2, "addCardinalNumber");
            return (Criteria) this;
        }

        public Criteria andAddCardinalNumberNotBetween(Double value1, Double value2) {
            addCriterion("add_cardinal_number not between", value1, value2, "addCardinalNumber");
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