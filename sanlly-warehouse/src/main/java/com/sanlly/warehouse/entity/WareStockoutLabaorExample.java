package com.sanlly.warehouse.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareStockoutLabaorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareStockoutLabaorExample() {
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

        public Criteria andWareStockoutLabaorIdIsNull() {
            addCriterion("ware_stockout_labaor_id is null");
            return (Criteria) this;
        }

        public Criteria andWareStockoutLabaorIdIsNotNull() {
            addCriterion("ware_stockout_labaor_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareStockoutLabaorIdEqualTo(Integer value) {
            addCriterion("ware_stockout_labaor_id =", value, "wareStockoutLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutLabaorIdNotEqualTo(Integer value) {
            addCriterion("ware_stockout_labaor_id <>", value, "wareStockoutLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutLabaorIdGreaterThan(Integer value) {
            addCriterion("ware_stockout_labaor_id >", value, "wareStockoutLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutLabaorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_stockout_labaor_id >=", value, "wareStockoutLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutLabaorIdLessThan(Integer value) {
            addCriterion("ware_stockout_labaor_id <", value, "wareStockoutLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutLabaorIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_stockout_labaor_id <=", value, "wareStockoutLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutLabaorIdIn(List<Integer> values) {
            addCriterion("ware_stockout_labaor_id in", values, "wareStockoutLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutLabaorIdNotIn(List<Integer> values) {
            addCriterion("ware_stockout_labaor_id not in", values, "wareStockoutLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutLabaorIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_stockout_labaor_id between", value1, value2, "wareStockoutLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockoutLabaorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_stockout_labaor_id not between", value1, value2, "wareStockoutLabaorId");
            return (Criteria) this;
        }

        public Criteria andLabaorStockoutNoIsNull() {
            addCriterion("labaor_stockout_no is null");
            return (Criteria) this;
        }

        public Criteria andLabaorStockoutNoIsNotNull() {
            addCriterion("labaor_stockout_no is not null");
            return (Criteria) this;
        }

        public Criteria andLabaorStockoutNoEqualTo(String value) {
            addCriterion("labaor_stockout_no =", value, "labaorStockoutNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockoutNoNotEqualTo(String value) {
            addCriterion("labaor_stockout_no <>", value, "labaorStockoutNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockoutNoGreaterThan(String value) {
            addCriterion("labaor_stockout_no >", value, "labaorStockoutNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockoutNoGreaterThanOrEqualTo(String value) {
            addCriterion("labaor_stockout_no >=", value, "labaorStockoutNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockoutNoLessThan(String value) {
            addCriterion("labaor_stockout_no <", value, "labaorStockoutNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockoutNoLessThanOrEqualTo(String value) {
            addCriterion("labaor_stockout_no <=", value, "labaorStockoutNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockoutNoLike(String value) {
            addCriterion("labaor_stockout_no like", value, "labaorStockoutNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockoutNoNotLike(String value) {
            addCriterion("labaor_stockout_no not like", value, "labaorStockoutNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockoutNoIn(List<String> values) {
            addCriterion("labaor_stockout_no in", values, "labaorStockoutNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockoutNoNotIn(List<String> values) {
            addCriterion("labaor_stockout_no not in", values, "labaorStockoutNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockoutNoBetween(String value1, String value2) {
            addCriterion("labaor_stockout_no between", value1, value2, "labaorStockoutNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockoutNoNotBetween(String value1, String value2) {
            addCriterion("labaor_stockout_no not between", value1, value2, "labaorStockoutNo");
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

        public Criteria andBillTypeIsNull() {
            addCriterion("bill_type is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(String value) {
            addCriterion("bill_type =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(String value) {
            addCriterion("bill_type <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(String value) {
            addCriterion("bill_type >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bill_type >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(String value) {
            addCriterion("bill_type <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(String value) {
            addCriterion("bill_type <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLike(String value) {
            addCriterion("bill_type like", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotLike(String value) {
            addCriterion("bill_type not like", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<String> values) {
            addCriterion("bill_type in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<String> values) {
            addCriterion("bill_type not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(String value1, String value2) {
            addCriterion("bill_type between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(String value1, String value2) {
            addCriterion("bill_type not between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusIsNull() {
            addCriterion("stockout_status is null");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusIsNotNull() {
            addCriterion("stockout_status is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusEqualTo(String value) {
            addCriterion("stockout_status =", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusNotEqualTo(String value) {
            addCriterion("stockout_status <>", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusGreaterThan(String value) {
            addCriterion("stockout_status >", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusGreaterThanOrEqualTo(String value) {
            addCriterion("stockout_status >=", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusLessThan(String value) {
            addCriterion("stockout_status <", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusLessThanOrEqualTo(String value) {
            addCriterion("stockout_status <=", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusLike(String value) {
            addCriterion("stockout_status like", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusNotLike(String value) {
            addCriterion("stockout_status not like", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusIn(List<String> values) {
            addCriterion("stockout_status in", values, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusNotIn(List<String> values) {
            addCriterion("stockout_status not in", values, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusBetween(String value1, String value2) {
            addCriterion("stockout_status between", value1, value2, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusNotBetween(String value1, String value2) {
            addCriterion("stockout_status not between", value1, value2, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentIsNull() {
            addCriterion("receive_department is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentIsNotNull() {
            addCriterion("receive_department is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentEqualTo(String value) {
            addCriterion("receive_department =", value, "receiveDepartment");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentNotEqualTo(String value) {
            addCriterion("receive_department <>", value, "receiveDepartment");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentGreaterThan(String value) {
            addCriterion("receive_department >", value, "receiveDepartment");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("receive_department >=", value, "receiveDepartment");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentLessThan(String value) {
            addCriterion("receive_department <", value, "receiveDepartment");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentLessThanOrEqualTo(String value) {
            addCriterion("receive_department <=", value, "receiveDepartment");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentLike(String value) {
            addCriterion("receive_department like", value, "receiveDepartment");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentNotLike(String value) {
            addCriterion("receive_department not like", value, "receiveDepartment");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentIn(List<String> values) {
            addCriterion("receive_department in", values, "receiveDepartment");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentNotIn(List<String> values) {
            addCriterion("receive_department not in", values, "receiveDepartment");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentBetween(String value1, String value2) {
            addCriterion("receive_department between", value1, value2, "receiveDepartment");
            return (Criteria) this;
        }

        public Criteria andReceiveDepartmentNotBetween(String value1, String value2) {
            addCriterion("receive_department not between", value1, value2, "receiveDepartment");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIsNull() {
            addCriterion("receive_user is null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIsNotNull() {
            addCriterion("receive_user is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserEqualTo(Integer value) {
            addCriterion("receive_user =", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotEqualTo(Integer value) {
            addCriterion("receive_user <>", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserGreaterThan(Integer value) {
            addCriterion("receive_user >", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_user >=", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLessThan(Integer value) {
            addCriterion("receive_user <", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLessThanOrEqualTo(Integer value) {
            addCriterion("receive_user <=", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIn(List<Integer> values) {
            addCriterion("receive_user in", values, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotIn(List<Integer> values) {
            addCriterion("receive_user not in", values, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserBetween(Integer value1, Integer value2) {
            addCriterion("receive_user between", value1, value2, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_user not between", value1, value2, "receiveUser");
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

        public Criteria andIsStockSbsIsNull() {
            addCriterion("is_stock_sbs is null");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsIsNotNull() {
            addCriterion("is_stock_sbs is not null");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsEqualTo(String value) {
            addCriterion("is_stock_sbs =", value, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsNotEqualTo(String value) {
            addCriterion("is_stock_sbs <>", value, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsGreaterThan(String value) {
            addCriterion("is_stock_sbs >", value, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsGreaterThanOrEqualTo(String value) {
            addCriterion("is_stock_sbs >=", value, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsLessThan(String value) {
            addCriterion("is_stock_sbs <", value, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsLessThanOrEqualTo(String value) {
            addCriterion("is_stock_sbs <=", value, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsLike(String value) {
            addCriterion("is_stock_sbs like", value, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsNotLike(String value) {
            addCriterion("is_stock_sbs not like", value, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsIn(List<String> values) {
            addCriterion("is_stock_sbs in", values, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsNotIn(List<String> values) {
            addCriterion("is_stock_sbs not in", values, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsBetween(String value1, String value2) {
            addCriterion("is_stock_sbs between", value1, value2, "isStockSbs");
            return (Criteria) this;
        }

        public Criteria andIsStockSbsNotBetween(String value1, String value2) {
            addCriterion("is_stock_sbs not between", value1, value2, "isStockSbs");
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