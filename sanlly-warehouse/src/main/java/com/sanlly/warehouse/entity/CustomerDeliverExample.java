package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerDeliverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CustomerDeliverExample() {
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

        public Criteria andWareCustomerDeliverIdIsNull() {
            addCriterion("ware_customer_deliver_id is null");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdIsNotNull() {
            addCriterion("ware_customer_deliver_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdEqualTo(Integer value) {
            addCriterion("ware_customer_deliver_id =", value, "wareCustomerDeliverId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdNotEqualTo(Integer value) {
            addCriterion("ware_customer_deliver_id <>", value, "wareCustomerDeliverId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdGreaterThan(Integer value) {
            addCriterion("ware_customer_deliver_id >", value, "wareCustomerDeliverId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_customer_deliver_id >=", value, "wareCustomerDeliverId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdLessThan(Integer value) {
            addCriterion("ware_customer_deliver_id <", value, "wareCustomerDeliverId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_customer_deliver_id <=", value, "wareCustomerDeliverId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdIn(List<Integer> values) {
            addCriterion("ware_customer_deliver_id in", values, "wareCustomerDeliverId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdNotIn(List<Integer> values) {
            addCriterion("ware_customer_deliver_id not in", values, "wareCustomerDeliverId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_customer_deliver_id between", value1, value2, "wareCustomerDeliverId");
            return (Criteria) this;
        }

        public Criteria andWareCustomerDeliverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_customer_deliver_id not between", value1, value2, "wareCustomerDeliverId");
            return (Criteria) this;
        }

        public Criteria andStockoutNoIsNull() {
            addCriterion("stockout_no is null");
            return (Criteria) this;
        }

        public Criteria andStockoutNoIsNotNull() {
            addCriterion("stockout_no is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutNoEqualTo(String value) {
            addCriterion("stockout_no =", value, "stockoutNo");
            return (Criteria) this;
        }

        public Criteria andStockoutNoNotEqualTo(String value) {
            addCriterion("stockout_no <>", value, "stockoutNo");
            return (Criteria) this;
        }

        public Criteria andStockoutNoGreaterThan(String value) {
            addCriterion("stockout_no >", value, "stockoutNo");
            return (Criteria) this;
        }

        public Criteria andStockoutNoGreaterThanOrEqualTo(String value) {
            addCriterion("stockout_no >=", value, "stockoutNo");
            return (Criteria) this;
        }

        public Criteria andStockoutNoLessThan(String value) {
            addCriterion("stockout_no <", value, "stockoutNo");
            return (Criteria) this;
        }

        public Criteria andStockoutNoLessThanOrEqualTo(String value) {
            addCriterion("stockout_no <=", value, "stockoutNo");
            return (Criteria) this;
        }

        public Criteria andStockoutNoLike(String value) {
            addCriterion("stockout_no like", value, "stockoutNo");
            return (Criteria) this;
        }

        public Criteria andStockoutNoNotLike(String value) {
            addCriterion("stockout_no not like", value, "stockoutNo");
            return (Criteria) this;
        }

        public Criteria andStockoutNoIn(List<String> values) {
            addCriterion("stockout_no in", values, "stockoutNo");
            return (Criteria) this;
        }

        public Criteria andStockoutNoNotIn(List<String> values) {
            addCriterion("stockout_no not in", values, "stockoutNo");
            return (Criteria) this;
        }

        public Criteria andStockoutNoBetween(String value1, String value2) {
            addCriterion("stockout_no between", value1, value2, "stockoutNo");
            return (Criteria) this;
        }

        public Criteria andStockoutNoNotBetween(String value1, String value2) {
            addCriterion("stockout_no not between", value1, value2, "stockoutNo");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNull() {
            addCriterion("customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("customer like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("customer not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("customer not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andRepairNoIsNull() {
            addCriterion("repair_no is null");
            return (Criteria) this;
        }

        public Criteria andRepairNoIsNotNull() {
            addCriterion("repair_no is not null");
            return (Criteria) this;
        }

        public Criteria andRepairNoEqualTo(String value) {
            addCriterion("repair_no =", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoNotEqualTo(String value) {
            addCriterion("repair_no <>", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoGreaterThan(String value) {
            addCriterion("repair_no >", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoGreaterThanOrEqualTo(String value) {
            addCriterion("repair_no >=", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoLessThan(String value) {
            addCriterion("repair_no <", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoLessThanOrEqualTo(String value) {
            addCriterion("repair_no <=", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoLike(String value) {
            addCriterion("repair_no like", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoNotLike(String value) {
            addCriterion("repair_no not like", value, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoIn(List<String> values) {
            addCriterion("repair_no in", values, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoNotIn(List<String> values) {
            addCriterion("repair_no not in", values, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoBetween(String value1, String value2) {
            addCriterion("repair_no between", value1, value2, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairNoNotBetween(String value1, String value2) {
            addCriterion("repair_no not between", value1, value2, "repairNo");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeIsNull() {
            addCriterion("repair_income is null");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeIsNotNull() {
            addCriterion("repair_income is not null");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeEqualTo(BigDecimal value) {
            addCriterion("repair_income =", value, "repairIncome");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeNotEqualTo(BigDecimal value) {
            addCriterion("repair_income <>", value, "repairIncome");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeGreaterThan(BigDecimal value) {
            addCriterion("repair_income >", value, "repairIncome");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_income >=", value, "repairIncome");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeLessThan(BigDecimal value) {
            addCriterion("repair_income <", value, "repairIncome");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_income <=", value, "repairIncome");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeIn(List<BigDecimal> values) {
            addCriterion("repair_income in", values, "repairIncome");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeNotIn(List<BigDecimal> values) {
            addCriterion("repair_income not in", values, "repairIncome");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_income between", value1, value2, "repairIncome");
            return (Criteria) this;
        }

        public Criteria andRepairIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_income not between", value1, value2, "repairIncome");
            return (Criteria) this;
        }

        public Criteria andRepairCostIsNull() {
            addCriterion("repair_cost is null");
            return (Criteria) this;
        }

        public Criteria andRepairCostIsNotNull() {
            addCriterion("repair_cost is not null");
            return (Criteria) this;
        }

        public Criteria andRepairCostEqualTo(BigDecimal value) {
            addCriterion("repair_cost =", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostNotEqualTo(BigDecimal value) {
            addCriterion("repair_cost <>", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostGreaterThan(BigDecimal value) {
            addCriterion("repair_cost >", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_cost >=", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostLessThan(BigDecimal value) {
            addCriterion("repair_cost <", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_cost <=", value, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostIn(List<BigDecimal> values) {
            addCriterion("repair_cost in", values, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostNotIn(List<BigDecimal> values) {
            addCriterion("repair_cost not in", values, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_cost between", value1, value2, "repairCost");
            return (Criteria) this;
        }

        public Criteria andRepairCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_cost not between", value1, value2, "repairCost");
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

        public Criteria andRepairProfitIsNull() {
            addCriterion("repair_profit is null");
            return (Criteria) this;
        }

        public Criteria andRepairProfitIsNotNull() {
            addCriterion("repair_profit is not null");
            return (Criteria) this;
        }

        public Criteria andRepairProfitEqualTo(BigDecimal value) {
            addCriterion("repair_profit =", value, "repairProfit");
            return (Criteria) this;
        }

        public Criteria andRepairProfitNotEqualTo(BigDecimal value) {
            addCriterion("repair_profit <>", value, "repairProfit");
            return (Criteria) this;
        }

        public Criteria andRepairProfitGreaterThan(BigDecimal value) {
            addCriterion("repair_profit >", value, "repairProfit");
            return (Criteria) this;
        }

        public Criteria andRepairProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_profit >=", value, "repairProfit");
            return (Criteria) this;
        }

        public Criteria andRepairProfitLessThan(BigDecimal value) {
            addCriterion("repair_profit <", value, "repairProfit");
            return (Criteria) this;
        }

        public Criteria andRepairProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_profit <=", value, "repairProfit");
            return (Criteria) this;
        }

        public Criteria andRepairProfitIn(List<BigDecimal> values) {
            addCriterion("repair_profit in", values, "repairProfit");
            return (Criteria) this;
        }

        public Criteria andRepairProfitNotIn(List<BigDecimal> values) {
            addCriterion("repair_profit not in", values, "repairProfit");
            return (Criteria) this;
        }

        public Criteria andRepairProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_profit between", value1, value2, "repairProfit");
            return (Criteria) this;
        }

        public Criteria andRepairProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_profit not between", value1, value2, "repairProfit");
            return (Criteria) this;
        }

        public Criteria andOutStatusIsNull() {
            addCriterion("out_status is null");
            return (Criteria) this;
        }

        public Criteria andOutStatusIsNotNull() {
            addCriterion("out_status is not null");
            return (Criteria) this;
        }

        public Criteria andOutStatusEqualTo(String value) {
            addCriterion("out_status =", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusNotEqualTo(String value) {
            addCriterion("out_status <>", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusGreaterThan(String value) {
            addCriterion("out_status >", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusGreaterThanOrEqualTo(String value) {
            addCriterion("out_status >=", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusLessThan(String value) {
            addCriterion("out_status <", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusLessThanOrEqualTo(String value) {
            addCriterion("out_status <=", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusLike(String value) {
            addCriterion("out_status like", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusNotLike(String value) {
            addCriterion("out_status not like", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusIn(List<String> values) {
            addCriterion("out_status in", values, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusNotIn(List<String> values) {
            addCriterion("out_status not in", values, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusBetween(String value1, String value2) {
            addCriterion("out_status between", value1, value2, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusNotBetween(String value1, String value2) {
            addCriterion("out_status not between", value1, value2, "outStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusIsNull() {
            addCriterion("charge_status is null");
            return (Criteria) this;
        }

        public Criteria andChargeStatusIsNotNull() {
            addCriterion("charge_status is not null");
            return (Criteria) this;
        }

        public Criteria andChargeStatusEqualTo(String value) {
            addCriterion("charge_status =", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusNotEqualTo(String value) {
            addCriterion("charge_status <>", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusGreaterThan(String value) {
            addCriterion("charge_status >", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("charge_status >=", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusLessThan(String value) {
            addCriterion("charge_status <", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusLessThanOrEqualTo(String value) {
            addCriterion("charge_status <=", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusLike(String value) {
            addCriterion("charge_status like", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusNotLike(String value) {
            addCriterion("charge_status not like", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusIn(List<String> values) {
            addCriterion("charge_status in", values, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusNotIn(List<String> values) {
            addCriterion("charge_status not in", values, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusBetween(String value1, String value2) {
            addCriterion("charge_status between", value1, value2, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusNotBetween(String value1, String value2) {
            addCriterion("charge_status not between", value1, value2, "chargeStatus");
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