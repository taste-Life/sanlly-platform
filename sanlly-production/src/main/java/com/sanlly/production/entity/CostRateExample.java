package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CostRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CostRateExample() {
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

        public Criteria andProdCostRateIdIsNull() {
            addCriterion("prod_cost_rate_id is null");
            return (Criteria) this;
        }

        public Criteria andProdCostRateIdIsNotNull() {
            addCriterion("prod_cost_rate_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdCostRateIdEqualTo(String value) {
            addCriterion("prod_cost_rate_id =", value, "prodCostRateId");
            return (Criteria) this;
        }

        public Criteria andProdCostRateIdNotEqualTo(String value) {
            addCriterion("prod_cost_rate_id <>", value, "prodCostRateId");
            return (Criteria) this;
        }

        public Criteria andProdCostRateIdGreaterThan(String value) {
            addCriterion("prod_cost_rate_id >", value, "prodCostRateId");
            return (Criteria) this;
        }

        public Criteria andProdCostRateIdGreaterThanOrEqualTo(String value) {
            addCriterion("prod_cost_rate_id >=", value, "prodCostRateId");
            return (Criteria) this;
        }

        public Criteria andProdCostRateIdLessThan(String value) {
            addCriterion("prod_cost_rate_id <", value, "prodCostRateId");
            return (Criteria) this;
        }

        public Criteria andProdCostRateIdLessThanOrEqualTo(String value) {
            addCriterion("prod_cost_rate_id <=", value, "prodCostRateId");
            return (Criteria) this;
        }

        public Criteria andProdCostRateIdLike(String value) {
            addCriterion("prod_cost_rate_id like", value, "prodCostRateId");
            return (Criteria) this;
        }

        public Criteria andProdCostRateIdNotLike(String value) {
            addCriterion("prod_cost_rate_id not like", value, "prodCostRateId");
            return (Criteria) this;
        }

        public Criteria andProdCostRateIdIn(List<String> values) {
            addCriterion("prod_cost_rate_id in", values, "prodCostRateId");
            return (Criteria) this;
        }

        public Criteria andProdCostRateIdNotIn(List<String> values) {
            addCriterion("prod_cost_rate_id not in", values, "prodCostRateId");
            return (Criteria) this;
        }

        public Criteria andProdCostRateIdBetween(String value1, String value2) {
            addCriterion("prod_cost_rate_id between", value1, value2, "prodCostRateId");
            return (Criteria) this;
        }

        public Criteria andProdCostRateIdNotBetween(String value1, String value2) {
            addCriterion("prod_cost_rate_id not between", value1, value2, "prodCostRateId");
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

        public Criteria andSparesTypeIsNull() {
            addCriterion("spares_type is null");
            return (Criteria) this;
        }

        public Criteria andSparesTypeIsNotNull() {
            addCriterion("spares_type is not null");
            return (Criteria) this;
        }

        public Criteria andSparesTypeEqualTo(String value) {
            addCriterion("spares_type =", value, "sparesType");
            return (Criteria) this;
        }

        public Criteria andSparesTypeNotEqualTo(String value) {
            addCriterion("spares_type <>", value, "sparesType");
            return (Criteria) this;
        }

        public Criteria andSparesTypeGreaterThan(String value) {
            addCriterion("spares_type >", value, "sparesType");
            return (Criteria) this;
        }

        public Criteria andSparesTypeGreaterThanOrEqualTo(String value) {
            addCriterion("spares_type >=", value, "sparesType");
            return (Criteria) this;
        }

        public Criteria andSparesTypeLessThan(String value) {
            addCriterion("spares_type <", value, "sparesType");
            return (Criteria) this;
        }

        public Criteria andSparesTypeLessThanOrEqualTo(String value) {
            addCriterion("spares_type <=", value, "sparesType");
            return (Criteria) this;
        }

        public Criteria andSparesTypeLike(String value) {
            addCriterion("spares_type like", value, "sparesType");
            return (Criteria) this;
        }

        public Criteria andSparesTypeNotLike(String value) {
            addCriterion("spares_type not like", value, "sparesType");
            return (Criteria) this;
        }

        public Criteria andSparesTypeIn(List<String> values) {
            addCriterion("spares_type in", values, "sparesType");
            return (Criteria) this;
        }

        public Criteria andSparesTypeNotIn(List<String> values) {
            addCriterion("spares_type not in", values, "sparesType");
            return (Criteria) this;
        }

        public Criteria andSparesTypeBetween(String value1, String value2) {
            addCriterion("spares_type between", value1, value2, "sparesType");
            return (Criteria) this;
        }

        public Criteria andSparesTypeNotBetween(String value1, String value2) {
            addCriterion("spares_type not between", value1, value2, "sparesType");
            return (Criteria) this;
        }

        public Criteria andSparesIsNull() {
            addCriterion("spares is null");
            return (Criteria) this;
        }

        public Criteria andSparesIsNotNull() {
            addCriterion("spares is not null");
            return (Criteria) this;
        }

        public Criteria andSparesEqualTo(String value) {
            addCriterion("spares =", value, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesNotEqualTo(String value) {
            addCriterion("spares <>", value, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesGreaterThan(String value) {
            addCriterion("spares >", value, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesGreaterThanOrEqualTo(String value) {
            addCriterion("spares >=", value, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesLessThan(String value) {
            addCriterion("spares <", value, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesLessThanOrEqualTo(String value) {
            addCriterion("spares <=", value, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesLike(String value) {
            addCriterion("spares like", value, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesNotLike(String value) {
            addCriterion("spares not like", value, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesIn(List<String> values) {
            addCriterion("spares in", values, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesNotIn(List<String> values) {
            addCriterion("spares not in", values, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesBetween(String value1, String value2) {
            addCriterion("spares between", value1, value2, "spares");
            return (Criteria) this;
        }

        public Criteria andSparesNotBetween(String value1, String value2) {
            addCriterion("spares not between", value1, value2, "spares");
            return (Criteria) this;
        }

        public Criteria andUseAlgorithmIsNull() {
            addCriterion("use_algorithm is null");
            return (Criteria) this;
        }

        public Criteria andUseAlgorithmIsNotNull() {
            addCriterion("use_algorithm is not null");
            return (Criteria) this;
        }

        public Criteria andUseAlgorithmEqualTo(String value) {
            addCriterion("use_algorithm =", value, "useAlgorithm");
            return (Criteria) this;
        }

        public Criteria andUseAlgorithmNotEqualTo(String value) {
            addCriterion("use_algorithm <>", value, "useAlgorithm");
            return (Criteria) this;
        }

        public Criteria andUseAlgorithmGreaterThan(String value) {
            addCriterion("use_algorithm >", value, "useAlgorithm");
            return (Criteria) this;
        }

        public Criteria andUseAlgorithmGreaterThanOrEqualTo(String value) {
            addCriterion("use_algorithm >=", value, "useAlgorithm");
            return (Criteria) this;
        }

        public Criteria andUseAlgorithmLessThan(String value) {
            addCriterion("use_algorithm <", value, "useAlgorithm");
            return (Criteria) this;
        }

        public Criteria andUseAlgorithmLessThanOrEqualTo(String value) {
            addCriterion("use_algorithm <=", value, "useAlgorithm");
            return (Criteria) this;
        }

        public Criteria andUseAlgorithmLike(String value) {
            addCriterion("use_algorithm like", value, "useAlgorithm");
            return (Criteria) this;
        }

        public Criteria andUseAlgorithmNotLike(String value) {
            addCriterion("use_algorithm not like", value, "useAlgorithm");
            return (Criteria) this;
        }

        public Criteria andUseAlgorithmIn(List<String> values) {
            addCriterion("use_algorithm in", values, "useAlgorithm");
            return (Criteria) this;
        }

        public Criteria andUseAlgorithmNotIn(List<String> values) {
            addCriterion("use_algorithm not in", values, "useAlgorithm");
            return (Criteria) this;
        }

        public Criteria andUseAlgorithmBetween(String value1, String value2) {
            addCriterion("use_algorithm between", value1, value2, "useAlgorithm");
            return (Criteria) this;
        }

        public Criteria andUseAlgorithmNotBetween(String value1, String value2) {
            addCriterion("use_algorithm not between", value1, value2, "useAlgorithm");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientOneIsNull() {
            addCriterion("use_coefficient_one is null");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientOneIsNotNull() {
            addCriterion("use_coefficient_one is not null");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientOneEqualTo(String value) {
            addCriterion("use_coefficient_one =", value, "useCoefficientOne");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientOneNotEqualTo(String value) {
            addCriterion("use_coefficient_one <>", value, "useCoefficientOne");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientOneGreaterThan(String value) {
            addCriterion("use_coefficient_one >", value, "useCoefficientOne");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientOneGreaterThanOrEqualTo(String value) {
            addCriterion("use_coefficient_one >=", value, "useCoefficientOne");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientOneLessThan(String value) {
            addCriterion("use_coefficient_one <", value, "useCoefficientOne");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientOneLessThanOrEqualTo(String value) {
            addCriterion("use_coefficient_one <=", value, "useCoefficientOne");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientOneLike(String value) {
            addCriterion("use_coefficient_one like", value, "useCoefficientOne");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientOneNotLike(String value) {
            addCriterion("use_coefficient_one not like", value, "useCoefficientOne");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientOneIn(List<String> values) {
            addCriterion("use_coefficient_one in", values, "useCoefficientOne");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientOneNotIn(List<String> values) {
            addCriterion("use_coefficient_one not in", values, "useCoefficientOne");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientOneBetween(String value1, String value2) {
            addCriterion("use_coefficient_one between", value1, value2, "useCoefficientOne");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientOneNotBetween(String value1, String value2) {
            addCriterion("use_coefficient_one not between", value1, value2, "useCoefficientOne");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientTwoIsNull() {
            addCriterion("use_coefficient_two is null");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientTwoIsNotNull() {
            addCriterion("use_coefficient_two is not null");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientTwoEqualTo(String value) {
            addCriterion("use_coefficient_two =", value, "useCoefficientTwo");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientTwoNotEqualTo(String value) {
            addCriterion("use_coefficient_two <>", value, "useCoefficientTwo");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientTwoGreaterThan(String value) {
            addCriterion("use_coefficient_two >", value, "useCoefficientTwo");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientTwoGreaterThanOrEqualTo(String value) {
            addCriterion("use_coefficient_two >=", value, "useCoefficientTwo");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientTwoLessThan(String value) {
            addCriterion("use_coefficient_two <", value, "useCoefficientTwo");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientTwoLessThanOrEqualTo(String value) {
            addCriterion("use_coefficient_two <=", value, "useCoefficientTwo");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientTwoLike(String value) {
            addCriterion("use_coefficient_two like", value, "useCoefficientTwo");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientTwoNotLike(String value) {
            addCriterion("use_coefficient_two not like", value, "useCoefficientTwo");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientTwoIn(List<String> values) {
            addCriterion("use_coefficient_two in", values, "useCoefficientTwo");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientTwoNotIn(List<String> values) {
            addCriterion("use_coefficient_two not in", values, "useCoefficientTwo");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientTwoBetween(String value1, String value2) {
            addCriterion("use_coefficient_two between", value1, value2, "useCoefficientTwo");
            return (Criteria) this;
        }

        public Criteria andUseCoefficientTwoNotBetween(String value1, String value2) {
            addCriterion("use_coefficient_two not between", value1, value2, "useCoefficientTwo");
            return (Criteria) this;
        }

        public Criteria andUseConstantIsNull() {
            addCriterion("use_constant is null");
            return (Criteria) this;
        }

        public Criteria andUseConstantIsNotNull() {
            addCriterion("use_constant is not null");
            return (Criteria) this;
        }

        public Criteria andUseConstantEqualTo(Double value) {
            addCriterion("use_constant =", value, "useConstant");
            return (Criteria) this;
        }

        public Criteria andUseConstantNotEqualTo(Double value) {
            addCriterion("use_constant <>", value, "useConstant");
            return (Criteria) this;
        }

        public Criteria andUseConstantGreaterThan(Double value) {
            addCriterion("use_constant >", value, "useConstant");
            return (Criteria) this;
        }

        public Criteria andUseConstantGreaterThanOrEqualTo(Double value) {
            addCriterion("use_constant >=", value, "useConstant");
            return (Criteria) this;
        }

        public Criteria andUseConstantLessThan(Double value) {
            addCriterion("use_constant <", value, "useConstant");
            return (Criteria) this;
        }

        public Criteria andUseConstantLessThanOrEqualTo(Double value) {
            addCriterion("use_constant <=", value, "useConstant");
            return (Criteria) this;
        }

        public Criteria andUseConstantIn(List<Double> values) {
            addCriterion("use_constant in", values, "useConstant");
            return (Criteria) this;
        }

        public Criteria andUseConstantNotIn(List<Double> values) {
            addCriterion("use_constant not in", values, "useConstant");
            return (Criteria) this;
        }

        public Criteria andUseConstantBetween(Double value1, Double value2) {
            addCriterion("use_constant between", value1, value2, "useConstant");
            return (Criteria) this;
        }

        public Criteria andUseConstantNotBetween(Double value1, Double value2) {
            addCriterion("use_constant not between", value1, value2, "useConstant");
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