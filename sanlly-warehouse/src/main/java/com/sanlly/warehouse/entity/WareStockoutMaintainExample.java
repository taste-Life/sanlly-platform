package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareStockoutMaintainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareStockoutMaintainExample() {
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

        public Criteria andWareStockoutMaintainIdIsNull() {
            addCriterion("ware_stockout_maintain_id is null");
            return (Criteria) this;
        }

        public Criteria andWareStockoutMaintainIdIsNotNull() {
            addCriterion("ware_stockout_maintain_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareStockoutMaintainIdEqualTo(Integer value) {
            addCriterion("ware_stockout_maintain_id =", value, "wareStockoutMaintainId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutMaintainIdNotEqualTo(Integer value) {
            addCriterion("ware_stockout_maintain_id <>", value, "wareStockoutMaintainId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutMaintainIdGreaterThan(Integer value) {
            addCriterion("ware_stockout_maintain_id >", value, "wareStockoutMaintainId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutMaintainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_stockout_maintain_id >=", value, "wareStockoutMaintainId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutMaintainIdLessThan(Integer value) {
            addCriterion("ware_stockout_maintain_id <", value, "wareStockoutMaintainId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutMaintainIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_stockout_maintain_id <=", value, "wareStockoutMaintainId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutMaintainIdIn(List<Integer> values) {
            addCriterion("ware_stockout_maintain_id in", values, "wareStockoutMaintainId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutMaintainIdNotIn(List<Integer> values) {
            addCriterion("ware_stockout_maintain_id not in", values, "wareStockoutMaintainId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutMaintainIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_stockout_maintain_id between", value1, value2, "wareStockoutMaintainId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutMaintainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_stockout_maintain_id not between", value1, value2, "wareStockoutMaintainId");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNoIsNull() {
            addCriterion("stockout_maintain_no is null");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNoIsNotNull() {
            addCriterion("stockout_maintain_no is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNoEqualTo(String value) {
            addCriterion("stockout_maintain_no =", value, "stockoutMaintainNo");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNoNotEqualTo(String value) {
            addCriterion("stockout_maintain_no <>", value, "stockoutMaintainNo");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNoGreaterThan(String value) {
            addCriterion("stockout_maintain_no >", value, "stockoutMaintainNo");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNoGreaterThanOrEqualTo(String value) {
            addCriterion("stockout_maintain_no >=", value, "stockoutMaintainNo");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNoLessThan(String value) {
            addCriterion("stockout_maintain_no <", value, "stockoutMaintainNo");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNoLessThanOrEqualTo(String value) {
            addCriterion("stockout_maintain_no <=", value, "stockoutMaintainNo");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNoLike(String value) {
            addCriterion("stockout_maintain_no like", value, "stockoutMaintainNo");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNoNotLike(String value) {
            addCriterion("stockout_maintain_no not like", value, "stockoutMaintainNo");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNoIn(List<String> values) {
            addCriterion("stockout_maintain_no in", values, "stockoutMaintainNo");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNoNotIn(List<String> values) {
            addCriterion("stockout_maintain_no not in", values, "stockoutMaintainNo");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNoBetween(String value1, String value2) {
            addCriterion("stockout_maintain_no between", value1, value2, "stockoutMaintainNo");
            return (Criteria) this;
        }

        public Criteria andStockoutMaintainNoNotBetween(String value1, String value2) {
            addCriterion("stockout_maintain_no not between", value1, value2, "stockoutMaintainNo");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentIsNull() {
            addCriterion("maintain_department is null");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentIsNotNull() {
            addCriterion("maintain_department is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentEqualTo(String value) {
            addCriterion("maintain_department =", value, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentNotEqualTo(String value) {
            addCriterion("maintain_department <>", value, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentGreaterThan(String value) {
            addCriterion("maintain_department >", value, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_department >=", value, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentLessThan(String value) {
            addCriterion("maintain_department <", value, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentLessThanOrEqualTo(String value) {
            addCriterion("maintain_department <=", value, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentLike(String value) {
            addCriterion("maintain_department like", value, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentNotLike(String value) {
            addCriterion("maintain_department not like", value, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentIn(List<String> values) {
            addCriterion("maintain_department in", values, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentNotIn(List<String> values) {
            addCriterion("maintain_department not in", values, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentBetween(String value1, String value2) {
            addCriterion("maintain_department between", value1, value2, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentNotBetween(String value1, String value2) {
            addCriterion("maintain_department not between", value1, value2, "maintainDepartment");
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

        public Criteria andProcessingChargesIsNull() {
            addCriterion("processing_charges is null");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesIsNotNull() {
            addCriterion("processing_charges is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesEqualTo(BigDecimal value) {
            addCriterion("processing_charges =", value, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesNotEqualTo(BigDecimal value) {
            addCriterion("processing_charges <>", value, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesGreaterThan(BigDecimal value) {
            addCriterion("processing_charges >", value, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("processing_charges >=", value, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesLessThan(BigDecimal value) {
            addCriterion("processing_charges <", value, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("processing_charges <=", value, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesIn(List<BigDecimal> values) {
            addCriterion("processing_charges in", values, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesNotIn(List<BigDecimal> values) {
            addCriterion("processing_charges not in", values, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("processing_charges between", value1, value2, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("processing_charges not between", value1, value2, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andMaintainMaterialsCostIsNull() {
            addCriterion("maintain_materials_cost is null");
            return (Criteria) this;
        }

        public Criteria andMaintainMaterialsCostIsNotNull() {
            addCriterion("maintain_materials_cost is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainMaterialsCostEqualTo(BigDecimal value) {
            addCriterion("maintain_materials_cost =", value, "maintainMaterialsCost");
            return (Criteria) this;
        }

        public Criteria andMaintainMaterialsCostNotEqualTo(BigDecimal value) {
            addCriterion("maintain_materials_cost <>", value, "maintainMaterialsCost");
            return (Criteria) this;
        }

        public Criteria andMaintainMaterialsCostGreaterThan(BigDecimal value) {
            addCriterion("maintain_materials_cost >", value, "maintainMaterialsCost");
            return (Criteria) this;
        }

        public Criteria andMaintainMaterialsCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("maintain_materials_cost >=", value, "maintainMaterialsCost");
            return (Criteria) this;
        }

        public Criteria andMaintainMaterialsCostLessThan(BigDecimal value) {
            addCriterion("maintain_materials_cost <", value, "maintainMaterialsCost");
            return (Criteria) this;
        }

        public Criteria andMaintainMaterialsCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("maintain_materials_cost <=", value, "maintainMaterialsCost");
            return (Criteria) this;
        }

        public Criteria andMaintainMaterialsCostIn(List<BigDecimal> values) {
            addCriterion("maintain_materials_cost in", values, "maintainMaterialsCost");
            return (Criteria) this;
        }

        public Criteria andMaintainMaterialsCostNotIn(List<BigDecimal> values) {
            addCriterion("maintain_materials_cost not in", values, "maintainMaterialsCost");
            return (Criteria) this;
        }

        public Criteria andMaintainMaterialsCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maintain_materials_cost between", value1, value2, "maintainMaterialsCost");
            return (Criteria) this;
        }

        public Criteria andMaintainMaterialsCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maintain_materials_cost not between", value1, value2, "maintainMaterialsCost");
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

        public Criteria andMaintainIncomeIsNull() {
            addCriterion("maintain_income is null");
            return (Criteria) this;
        }

        public Criteria andMaintainIncomeIsNotNull() {
            addCriterion("maintain_income is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainIncomeEqualTo(BigDecimal value) {
            addCriterion("maintain_income =", value, "maintainIncome");
            return (Criteria) this;
        }

        public Criteria andMaintainIncomeNotEqualTo(BigDecimal value) {
            addCriterion("maintain_income <>", value, "maintainIncome");
            return (Criteria) this;
        }

        public Criteria andMaintainIncomeGreaterThan(BigDecimal value) {
            addCriterion("maintain_income >", value, "maintainIncome");
            return (Criteria) this;
        }

        public Criteria andMaintainIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("maintain_income >=", value, "maintainIncome");
            return (Criteria) this;
        }

        public Criteria andMaintainIncomeLessThan(BigDecimal value) {
            addCriterion("maintain_income <", value, "maintainIncome");
            return (Criteria) this;
        }

        public Criteria andMaintainIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("maintain_income <=", value, "maintainIncome");
            return (Criteria) this;
        }

        public Criteria andMaintainIncomeIn(List<BigDecimal> values) {
            addCriterion("maintain_income in", values, "maintainIncome");
            return (Criteria) this;
        }

        public Criteria andMaintainIncomeNotIn(List<BigDecimal> values) {
            addCriterion("maintain_income not in", values, "maintainIncome");
            return (Criteria) this;
        }

        public Criteria andMaintainIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maintain_income between", value1, value2, "maintainIncome");
            return (Criteria) this;
        }

        public Criteria andMaintainIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maintain_income not between", value1, value2, "maintainIncome");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
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