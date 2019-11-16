package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuditPayingChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public AuditPayingChangeExample() {
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

        public Criteria andProdAuditPayingChangeIdIsNull() {
            addCriterion("prod_audit_paying_change_id is null");
            return (Criteria) this;
        }

        public Criteria andProdAuditPayingChangeIdIsNotNull() {
            addCriterion("prod_audit_paying_change_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdAuditPayingChangeIdEqualTo(Integer value) {
            addCriterion("prod_audit_paying_change_id =", value, "prodAuditPayingChangeId");
            return (Criteria) this;
        }

        public Criteria andProdAuditPayingChangeIdNotEqualTo(Integer value) {
            addCriterion("prod_audit_paying_change_id <>", value, "prodAuditPayingChangeId");
            return (Criteria) this;
        }

        public Criteria andProdAuditPayingChangeIdGreaterThan(Integer value) {
            addCriterion("prod_audit_paying_change_id >", value, "prodAuditPayingChangeId");
            return (Criteria) this;
        }

        public Criteria andProdAuditPayingChangeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_audit_paying_change_id >=", value, "prodAuditPayingChangeId");
            return (Criteria) this;
        }

        public Criteria andProdAuditPayingChangeIdLessThan(Integer value) {
            addCriterion("prod_audit_paying_change_id <", value, "prodAuditPayingChangeId");
            return (Criteria) this;
        }

        public Criteria andProdAuditPayingChangeIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_audit_paying_change_id <=", value, "prodAuditPayingChangeId");
            return (Criteria) this;
        }

        public Criteria andProdAuditPayingChangeIdIn(List<Integer> values) {
            addCriterion("prod_audit_paying_change_id in", values, "prodAuditPayingChangeId");
            return (Criteria) this;
        }

        public Criteria andProdAuditPayingChangeIdNotIn(List<Integer> values) {
            addCriterion("prod_audit_paying_change_id not in", values, "prodAuditPayingChangeId");
            return (Criteria) this;
        }

        public Criteria andProdAuditPayingChangeIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_audit_paying_change_id between", value1, value2, "prodAuditPayingChangeId");
            return (Criteria) this;
        }

        public Criteria andProdAuditPayingChangeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_audit_paying_change_id not between", value1, value2, "prodAuditPayingChangeId");
            return (Criteria) this;
        }

        public Criteria andPayingPartyChangeIsNull() {
            addCriterion("paying_party_change is null");
            return (Criteria) this;
        }

        public Criteria andPayingPartyChangeIsNotNull() {
            addCriterion("paying_party_change is not null");
            return (Criteria) this;
        }

        public Criteria andPayingPartyChangeEqualTo(Integer value) {
            addCriterion("paying_party_change =", value, "payingPartyChange");
            return (Criteria) this;
        }

        public Criteria andPayingPartyChangeNotEqualTo(Integer value) {
            addCriterion("paying_party_change <>", value, "payingPartyChange");
            return (Criteria) this;
        }

        public Criteria andPayingPartyChangeGreaterThan(Integer value) {
            addCriterion("paying_party_change >", value, "payingPartyChange");
            return (Criteria) this;
        }

        public Criteria andPayingPartyChangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("paying_party_change >=", value, "payingPartyChange");
            return (Criteria) this;
        }

        public Criteria andPayingPartyChangeLessThan(Integer value) {
            addCriterion("paying_party_change <", value, "payingPartyChange");
            return (Criteria) this;
        }

        public Criteria andPayingPartyChangeLessThanOrEqualTo(Integer value) {
            addCriterion("paying_party_change <=", value, "payingPartyChange");
            return (Criteria) this;
        }

        public Criteria andPayingPartyChangeIn(List<Integer> values) {
            addCriterion("paying_party_change in", values, "payingPartyChange");
            return (Criteria) this;
        }

        public Criteria andPayingPartyChangeNotIn(List<Integer> values) {
            addCriterion("paying_party_change not in", values, "payingPartyChange");
            return (Criteria) this;
        }

        public Criteria andPayingPartyChangeBetween(Integer value1, Integer value2) {
            addCriterion("paying_party_change between", value1, value2, "payingPartyChange");
            return (Criteria) this;
        }

        public Criteria andPayingPartyChangeNotBetween(Integer value1, Integer value2) {
            addCriterion("paying_party_change not between", value1, value2, "payingPartyChange");
            return (Criteria) this;
        }

        public Criteria andInitialPayingIsNull() {
            addCriterion("initial_paying is null");
            return (Criteria) this;
        }

        public Criteria andInitialPayingIsNotNull() {
            addCriterion("initial_paying is not null");
            return (Criteria) this;
        }

        public Criteria andInitialPayingEqualTo(String value) {
            addCriterion("initial_paying =", value, "initialPaying");
            return (Criteria) this;
        }

        public Criteria andInitialPayingNotEqualTo(String value) {
            addCriterion("initial_paying <>", value, "initialPaying");
            return (Criteria) this;
        }

        public Criteria andInitialPayingGreaterThan(String value) {
            addCriterion("initial_paying >", value, "initialPaying");
            return (Criteria) this;
        }

        public Criteria andInitialPayingGreaterThanOrEqualTo(String value) {
            addCriterion("initial_paying >=", value, "initialPaying");
            return (Criteria) this;
        }

        public Criteria andInitialPayingLessThan(String value) {
            addCriterion("initial_paying <", value, "initialPaying");
            return (Criteria) this;
        }

        public Criteria andInitialPayingLessThanOrEqualTo(String value) {
            addCriterion("initial_paying <=", value, "initialPaying");
            return (Criteria) this;
        }

        public Criteria andInitialPayingLike(String value) {
            addCriterion("initial_paying like", value, "initialPaying");
            return (Criteria) this;
        }

        public Criteria andInitialPayingNotLike(String value) {
            addCriterion("initial_paying not like", value, "initialPaying");
            return (Criteria) this;
        }

        public Criteria andInitialPayingIn(List<String> values) {
            addCriterion("initial_paying in", values, "initialPaying");
            return (Criteria) this;
        }

        public Criteria andInitialPayingNotIn(List<String> values) {
            addCriterion("initial_paying not in", values, "initialPaying");
            return (Criteria) this;
        }

        public Criteria andInitialPayingBetween(String value1, String value2) {
            addCriterion("initial_paying between", value1, value2, "initialPaying");
            return (Criteria) this;
        }

        public Criteria andInitialPayingNotBetween(String value1, String value2) {
            addCriterion("initial_paying not between", value1, value2, "initialPaying");
            return (Criteria) this;
        }

        public Criteria andManHourCoefficientIsNull() {
            addCriterion("man_hour_coefficient is null");
            return (Criteria) this;
        }

        public Criteria andManHourCoefficientIsNotNull() {
            addCriterion("man_hour_coefficient is not null");
            return (Criteria) this;
        }

        public Criteria andManHourCoefficientEqualTo(Double value) {
            addCriterion("man_hour_coefficient =", value, "manHourCoefficient");
            return (Criteria) this;
        }

        public Criteria andManHourCoefficientNotEqualTo(Double value) {
            addCriterion("man_hour_coefficient <>", value, "manHourCoefficient");
            return (Criteria) this;
        }

        public Criteria andManHourCoefficientGreaterThan(Double value) {
            addCriterion("man_hour_coefficient >", value, "manHourCoefficient");
            return (Criteria) this;
        }

        public Criteria andManHourCoefficientGreaterThanOrEqualTo(Double value) {
            addCriterion("man_hour_coefficient >=", value, "manHourCoefficient");
            return (Criteria) this;
        }

        public Criteria andManHourCoefficientLessThan(Double value) {
            addCriterion("man_hour_coefficient <", value, "manHourCoefficient");
            return (Criteria) this;
        }

        public Criteria andManHourCoefficientLessThanOrEqualTo(Double value) {
            addCriterion("man_hour_coefficient <=", value, "manHourCoefficient");
            return (Criteria) this;
        }

        public Criteria andManHourCoefficientIn(List<Double> values) {
            addCriterion("man_hour_coefficient in", values, "manHourCoefficient");
            return (Criteria) this;
        }

        public Criteria andManHourCoefficientNotIn(List<Double> values) {
            addCriterion("man_hour_coefficient not in", values, "manHourCoefficient");
            return (Criteria) this;
        }

        public Criteria andManHourCoefficientBetween(Double value1, Double value2) {
            addCriterion("man_hour_coefficient between", value1, value2, "manHourCoefficient");
            return (Criteria) this;
        }

        public Criteria andManHourCoefficientNotBetween(Double value1, Double value2) {
            addCriterion("man_hour_coefficient not between", value1, value2, "manHourCoefficient");
            return (Criteria) this;
        }

        public Criteria andMaterialCoefficientIsNull() {
            addCriterion("material_coefficient is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCoefficientIsNotNull() {
            addCriterion("material_coefficient is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCoefficientEqualTo(Double value) {
            addCriterion("material_coefficient =", value, "materialCoefficient");
            return (Criteria) this;
        }

        public Criteria andMaterialCoefficientNotEqualTo(Double value) {
            addCriterion("material_coefficient <>", value, "materialCoefficient");
            return (Criteria) this;
        }

        public Criteria andMaterialCoefficientGreaterThan(Double value) {
            addCriterion("material_coefficient >", value, "materialCoefficient");
            return (Criteria) this;
        }

        public Criteria andMaterialCoefficientGreaterThanOrEqualTo(Double value) {
            addCriterion("material_coefficient >=", value, "materialCoefficient");
            return (Criteria) this;
        }

        public Criteria andMaterialCoefficientLessThan(Double value) {
            addCriterion("material_coefficient <", value, "materialCoefficient");
            return (Criteria) this;
        }

        public Criteria andMaterialCoefficientLessThanOrEqualTo(Double value) {
            addCriterion("material_coefficient <=", value, "materialCoefficient");
            return (Criteria) this;
        }

        public Criteria andMaterialCoefficientIn(List<Double> values) {
            addCriterion("material_coefficient in", values, "materialCoefficient");
            return (Criteria) this;
        }

        public Criteria andMaterialCoefficientNotIn(List<Double> values) {
            addCriterion("material_coefficient not in", values, "materialCoefficient");
            return (Criteria) this;
        }

        public Criteria andMaterialCoefficientBetween(Double value1, Double value2) {
            addCriterion("material_coefficient between", value1, value2, "materialCoefficient");
            return (Criteria) this;
        }

        public Criteria andMaterialCoefficientNotBetween(Double value1, Double value2) {
            addCriterion("material_coefficient not between", value1, value2, "materialCoefficient");
            return (Criteria) this;
        }

        public Criteria andSumCostCoefficientIsNull() {
            addCriterion("sum_cost_coefficient is null");
            return (Criteria) this;
        }

        public Criteria andSumCostCoefficientIsNotNull() {
            addCriterion("sum_cost_coefficient is not null");
            return (Criteria) this;
        }

        public Criteria andSumCostCoefficientEqualTo(Double value) {
            addCriterion("sum_cost_coefficient =", value, "sumCostCoefficient");
            return (Criteria) this;
        }

        public Criteria andSumCostCoefficientNotEqualTo(Double value) {
            addCriterion("sum_cost_coefficient <>", value, "sumCostCoefficient");
            return (Criteria) this;
        }

        public Criteria andSumCostCoefficientGreaterThan(Double value) {
            addCriterion("sum_cost_coefficient >", value, "sumCostCoefficient");
            return (Criteria) this;
        }

        public Criteria andSumCostCoefficientGreaterThanOrEqualTo(Double value) {
            addCriterion("sum_cost_coefficient >=", value, "sumCostCoefficient");
            return (Criteria) this;
        }

        public Criteria andSumCostCoefficientLessThan(Double value) {
            addCriterion("sum_cost_coefficient <", value, "sumCostCoefficient");
            return (Criteria) this;
        }

        public Criteria andSumCostCoefficientLessThanOrEqualTo(Double value) {
            addCriterion("sum_cost_coefficient <=", value, "sumCostCoefficient");
            return (Criteria) this;
        }

        public Criteria andSumCostCoefficientIn(List<Double> values) {
            addCriterion("sum_cost_coefficient in", values, "sumCostCoefficient");
            return (Criteria) this;
        }

        public Criteria andSumCostCoefficientNotIn(List<Double> values) {
            addCriterion("sum_cost_coefficient not in", values, "sumCostCoefficient");
            return (Criteria) this;
        }

        public Criteria andSumCostCoefficientBetween(Double value1, Double value2) {
            addCriterion("sum_cost_coefficient between", value1, value2, "sumCostCoefficient");
            return (Criteria) this;
        }

        public Criteria andSumCostCoefficientNotBetween(Double value1, Double value2) {
            addCriterion("sum_cost_coefficient not between", value1, value2, "sumCostCoefficient");
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

        public Criteria andDisposeTypeIsNull() {
            addCriterion("dispose_type is null");
            return (Criteria) this;
        }

        public Criteria andDisposeTypeIsNotNull() {
            addCriterion("dispose_type is not null");
            return (Criteria) this;
        }

        public Criteria andDisposeTypeEqualTo(String value) {
            addCriterion("dispose_type =", value, "disposeType");
            return (Criteria) this;
        }

        public Criteria andDisposeTypeNotEqualTo(String value) {
            addCriterion("dispose_type <>", value, "disposeType");
            return (Criteria) this;
        }

        public Criteria andDisposeTypeGreaterThan(String value) {
            addCriterion("dispose_type >", value, "disposeType");
            return (Criteria) this;
        }

        public Criteria andDisposeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dispose_type >=", value, "disposeType");
            return (Criteria) this;
        }

        public Criteria andDisposeTypeLessThan(String value) {
            addCriterion("dispose_type <", value, "disposeType");
            return (Criteria) this;
        }

        public Criteria andDisposeTypeLessThanOrEqualTo(String value) {
            addCriterion("dispose_type <=", value, "disposeType");
            return (Criteria) this;
        }

        public Criteria andDisposeTypeLike(String value) {
            addCriterion("dispose_type like", value, "disposeType");
            return (Criteria) this;
        }

        public Criteria andDisposeTypeNotLike(String value) {
            addCriterion("dispose_type not like", value, "disposeType");
            return (Criteria) this;
        }

        public Criteria andDisposeTypeIn(List<String> values) {
            addCriterion("dispose_type in", values, "disposeType");
            return (Criteria) this;
        }

        public Criteria andDisposeTypeNotIn(List<String> values) {
            addCriterion("dispose_type not in", values, "disposeType");
            return (Criteria) this;
        }

        public Criteria andDisposeTypeBetween(String value1, String value2) {
            addCriterion("dispose_type between", value1, value2, "disposeType");
            return (Criteria) this;
        }

        public Criteria andDisposeTypeNotBetween(String value1, String value2) {
            addCriterion("dispose_type not between", value1, value2, "disposeType");
            return (Criteria) this;
        }

        public Criteria andSumCostConditionIsNull() {
            addCriterion("sum_cost_condition is null");
            return (Criteria) this;
        }

        public Criteria andSumCostConditionIsNotNull() {
            addCriterion("sum_cost_condition is not null");
            return (Criteria) this;
        }

        public Criteria andSumCostConditionEqualTo(String value) {
            addCriterion("sum_cost_condition =", value, "sumCostCondition");
            return (Criteria) this;
        }

        public Criteria andSumCostConditionNotEqualTo(String value) {
            addCriterion("sum_cost_condition <>", value, "sumCostCondition");
            return (Criteria) this;
        }

        public Criteria andSumCostConditionGreaterThan(String value) {
            addCriterion("sum_cost_condition >", value, "sumCostCondition");
            return (Criteria) this;
        }

        public Criteria andSumCostConditionGreaterThanOrEqualTo(String value) {
            addCriterion("sum_cost_condition >=", value, "sumCostCondition");
            return (Criteria) this;
        }

        public Criteria andSumCostConditionLessThan(String value) {
            addCriterion("sum_cost_condition <", value, "sumCostCondition");
            return (Criteria) this;
        }

        public Criteria andSumCostConditionLessThanOrEqualTo(String value) {
            addCriterion("sum_cost_condition <=", value, "sumCostCondition");
            return (Criteria) this;
        }

        public Criteria andSumCostConditionLike(String value) {
            addCriterion("sum_cost_condition like", value, "sumCostCondition");
            return (Criteria) this;
        }

        public Criteria andSumCostConditionNotLike(String value) {
            addCriterion("sum_cost_condition not like", value, "sumCostCondition");
            return (Criteria) this;
        }

        public Criteria andSumCostConditionIn(List<String> values) {
            addCriterion("sum_cost_condition in", values, "sumCostCondition");
            return (Criteria) this;
        }

        public Criteria andSumCostConditionNotIn(List<String> values) {
            addCriterion("sum_cost_condition not in", values, "sumCostCondition");
            return (Criteria) this;
        }

        public Criteria andSumCostConditionBetween(String value1, String value2) {
            addCriterion("sum_cost_condition between", value1, value2, "sumCostCondition");
            return (Criteria) this;
        }

        public Criteria andSumCostConditionNotBetween(String value1, String value2) {
            addCriterion("sum_cost_condition not between", value1, value2, "sumCostCondition");
            return (Criteria) this;
        }

        public Criteria andSumCostBaseIsNull() {
            addCriterion("sum_cost_base is null");
            return (Criteria) this;
        }

        public Criteria andSumCostBaseIsNotNull() {
            addCriterion("sum_cost_base is not null");
            return (Criteria) this;
        }

        public Criteria andSumCostBaseEqualTo(BigDecimal value) {
            addCriterion("sum_cost_base =", value, "sumCostBase");
            return (Criteria) this;
        }

        public Criteria andSumCostBaseNotEqualTo(BigDecimal value) {
            addCriterion("sum_cost_base <>", value, "sumCostBase");
            return (Criteria) this;
        }

        public Criteria andSumCostBaseGreaterThan(BigDecimal value) {
            addCriterion("sum_cost_base >", value, "sumCostBase");
            return (Criteria) this;
        }

        public Criteria andSumCostBaseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_cost_base >=", value, "sumCostBase");
            return (Criteria) this;
        }

        public Criteria andSumCostBaseLessThan(BigDecimal value) {
            addCriterion("sum_cost_base <", value, "sumCostBase");
            return (Criteria) this;
        }

        public Criteria andSumCostBaseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_cost_base <=", value, "sumCostBase");
            return (Criteria) this;
        }

        public Criteria andSumCostBaseIn(List<BigDecimal> values) {
            addCriterion("sum_cost_base in", values, "sumCostBase");
            return (Criteria) this;
        }

        public Criteria andSumCostBaseNotIn(List<BigDecimal> values) {
            addCriterion("sum_cost_base not in", values, "sumCostBase");
            return (Criteria) this;
        }

        public Criteria andSumCostBaseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_cost_base between", value1, value2, "sumCostBase");
            return (Criteria) this;
        }

        public Criteria andSumCostBaseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_cost_base not between", value1, value2, "sumCostBase");
            return (Criteria) this;
        }

        public Criteria andFinalPayingIsNull() {
            addCriterion("final_paying is null");
            return (Criteria) this;
        }

        public Criteria andFinalPayingIsNotNull() {
            addCriterion("final_paying is not null");
            return (Criteria) this;
        }

        public Criteria andFinalPayingEqualTo(String value) {
            addCriterion("final_paying =", value, "finalPaying");
            return (Criteria) this;
        }

        public Criteria andFinalPayingNotEqualTo(String value) {
            addCriterion("final_paying <>", value, "finalPaying");
            return (Criteria) this;
        }

        public Criteria andFinalPayingGreaterThan(String value) {
            addCriterion("final_paying >", value, "finalPaying");
            return (Criteria) this;
        }

        public Criteria andFinalPayingGreaterThanOrEqualTo(String value) {
            addCriterion("final_paying >=", value, "finalPaying");
            return (Criteria) this;
        }

        public Criteria andFinalPayingLessThan(String value) {
            addCriterion("final_paying <", value, "finalPaying");
            return (Criteria) this;
        }

        public Criteria andFinalPayingLessThanOrEqualTo(String value) {
            addCriterion("final_paying <=", value, "finalPaying");
            return (Criteria) this;
        }

        public Criteria andFinalPayingLike(String value) {
            addCriterion("final_paying like", value, "finalPaying");
            return (Criteria) this;
        }

        public Criteria andFinalPayingNotLike(String value) {
            addCriterion("final_paying not like", value, "finalPaying");
            return (Criteria) this;
        }

        public Criteria andFinalPayingIn(List<String> values) {
            addCriterion("final_paying in", values, "finalPaying");
            return (Criteria) this;
        }

        public Criteria andFinalPayingNotIn(List<String> values) {
            addCriterion("final_paying not in", values, "finalPaying");
            return (Criteria) this;
        }

        public Criteria andFinalPayingBetween(String value1, String value2) {
            addCriterion("final_paying between", value1, value2, "finalPaying");
            return (Criteria) this;
        }

        public Criteria andFinalPayingNotBetween(String value1, String value2) {
            addCriterion("final_paying not between", value1, value2, "finalPaying");
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

        public Criteria andIsValidEqualTo(Integer value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(Integer value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(Integer value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(Integer value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(Integer value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<Integer> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<Integer> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(Integer value1, Integer value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(Integer value1, Integer value2) {
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