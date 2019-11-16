package com.sanlly.warehouse.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowLendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BorrowLendExample() {
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

        public Criteria andWareBorrowLendSlipIdIsNull() {
            addCriterion("ware_borrow_lend_slip_id is null");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipIdIsNotNull() {
            addCriterion("ware_borrow_lend_slip_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipIdEqualTo(Integer value) {
            addCriterion("ware_borrow_lend_slip_id =", value, "wareBorrowLendSlipId");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipIdNotEqualTo(Integer value) {
            addCriterion("ware_borrow_lend_slip_id <>", value, "wareBorrowLendSlipId");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipIdGreaterThan(Integer value) {
            addCriterion("ware_borrow_lend_slip_id >", value, "wareBorrowLendSlipId");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_borrow_lend_slip_id >=", value, "wareBorrowLendSlipId");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipIdLessThan(Integer value) {
            addCriterion("ware_borrow_lend_slip_id <", value, "wareBorrowLendSlipId");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_borrow_lend_slip_id <=", value, "wareBorrowLendSlipId");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipIdIn(List<Integer> values) {
            addCriterion("ware_borrow_lend_slip_id in", values, "wareBorrowLendSlipId");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipIdNotIn(List<Integer> values) {
            addCriterion("ware_borrow_lend_slip_id not in", values, "wareBorrowLendSlipId");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_borrow_lend_slip_id between", value1, value2, "wareBorrowLendSlipId");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_borrow_lend_slip_id not between", value1, value2, "wareBorrowLendSlipId");
            return (Criteria) this;
        }

        public Criteria andBorrowLendNoIsNull() {
            addCriterion("borrow_lend_no is null");
            return (Criteria) this;
        }

        public Criteria andBorrowLendNoIsNotNull() {
            addCriterion("borrow_lend_no is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowLendNoEqualTo(String value) {
            addCriterion("borrow_lend_no =", value, "borrowLendNo");
            return (Criteria) this;
        }

        public Criteria andBorrowLendNoNotEqualTo(String value) {
            addCriterion("borrow_lend_no <>", value, "borrowLendNo");
            return (Criteria) this;
        }

        public Criteria andBorrowLendNoGreaterThan(String value) {
            addCriterion("borrow_lend_no >", value, "borrowLendNo");
            return (Criteria) this;
        }

        public Criteria andBorrowLendNoGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_lend_no >=", value, "borrowLendNo");
            return (Criteria) this;
        }

        public Criteria andBorrowLendNoLessThan(String value) {
            addCriterion("borrow_lend_no <", value, "borrowLendNo");
            return (Criteria) this;
        }

        public Criteria andBorrowLendNoLessThanOrEqualTo(String value) {
            addCriterion("borrow_lend_no <=", value, "borrowLendNo");
            return (Criteria) this;
        }

        public Criteria andBorrowLendNoLike(String value) {
            addCriterion("borrow_lend_no like", value, "borrowLendNo");
            return (Criteria) this;
        }

        public Criteria andBorrowLendNoNotLike(String value) {
            addCriterion("borrow_lend_no not like", value, "borrowLendNo");
            return (Criteria) this;
        }

        public Criteria andBorrowLendNoIn(List<String> values) {
            addCriterion("borrow_lend_no in", values, "borrowLendNo");
            return (Criteria) this;
        }

        public Criteria andBorrowLendNoNotIn(List<String> values) {
            addCriterion("borrow_lend_no not in", values, "borrowLendNo");
            return (Criteria) this;
        }

        public Criteria andBorrowLendNoBetween(String value1, String value2) {
            addCriterion("borrow_lend_no between", value1, value2, "borrowLendNo");
            return (Criteria) this;
        }

        public Criteria andBorrowLendNoNotBetween(String value1, String value2) {
            addCriterion("borrow_lend_no not between", value1, value2, "borrowLendNo");
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

        public Criteria andBorrowUnitIsNull() {
            addCriterion("borrow_unit is null");
            return (Criteria) this;
        }

        public Criteria andBorrowUnitIsNotNull() {
            addCriterion("borrow_unit is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowUnitEqualTo(String value) {
            addCriterion("borrow_unit =", value, "borrowUnit");
            return (Criteria) this;
        }

        public Criteria andBorrowUnitNotEqualTo(String value) {
            addCriterion("borrow_unit <>", value, "borrowUnit");
            return (Criteria) this;
        }

        public Criteria andBorrowUnitGreaterThan(String value) {
            addCriterion("borrow_unit >", value, "borrowUnit");
            return (Criteria) this;
        }

        public Criteria andBorrowUnitGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_unit >=", value, "borrowUnit");
            return (Criteria) this;
        }

        public Criteria andBorrowUnitLessThan(String value) {
            addCriterion("borrow_unit <", value, "borrowUnit");
            return (Criteria) this;
        }

        public Criteria andBorrowUnitLessThanOrEqualTo(String value) {
            addCriterion("borrow_unit <=", value, "borrowUnit");
            return (Criteria) this;
        }

        public Criteria andBorrowUnitLike(String value) {
            addCriterion("borrow_unit like", value, "borrowUnit");
            return (Criteria) this;
        }

        public Criteria andBorrowUnitNotLike(String value) {
            addCriterion("borrow_unit not like", value, "borrowUnit");
            return (Criteria) this;
        }

        public Criteria andBorrowUnitIn(List<String> values) {
            addCriterion("borrow_unit in", values, "borrowUnit");
            return (Criteria) this;
        }

        public Criteria andBorrowUnitNotIn(List<String> values) {
            addCriterion("borrow_unit not in", values, "borrowUnit");
            return (Criteria) this;
        }

        public Criteria andBorrowUnitBetween(String value1, String value2) {
            addCriterion("borrow_unit between", value1, value2, "borrowUnit");
            return (Criteria) this;
        }

        public Criteria andBorrowUnitNotBetween(String value1, String value2) {
            addCriterion("borrow_unit not between", value1, value2, "borrowUnit");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIsNull() {
            addCriterion("borrow_user is null");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIsNotNull() {
            addCriterion("borrow_user is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowUserEqualTo(Integer value) {
            addCriterion("borrow_user =", value, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserNotEqualTo(Integer value) {
            addCriterion("borrow_user <>", value, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserGreaterThan(Integer value) {
            addCriterion("borrow_user >", value, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_user >=", value, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserLessThan(Integer value) {
            addCriterion("borrow_user <", value, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_user <=", value, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserIn(List<Integer> values) {
            addCriterion("borrow_user in", values, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserNotIn(List<Integer> values) {
            addCriterion("borrow_user not in", values, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserBetween(Integer value1, Integer value2) {
            addCriterion("borrow_user between", value1, value2, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowUserNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_user not between", value1, value2, "borrowUser");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIsNull() {
            addCriterion("borrow_type is null");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIsNotNull() {
            addCriterion("borrow_type is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeEqualTo(String value) {
            addCriterion("borrow_type =", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotEqualTo(String value) {
            addCriterion("borrow_type <>", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeGreaterThan(String value) {
            addCriterion("borrow_type >", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_type >=", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeLessThan(String value) {
            addCriterion("borrow_type <", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeLessThanOrEqualTo(String value) {
            addCriterion("borrow_type <=", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeLike(String value) {
            addCriterion("borrow_type like", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotLike(String value) {
            addCriterion("borrow_type not like", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIn(List<String> values) {
            addCriterion("borrow_type in", values, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotIn(List<String> values) {
            addCriterion("borrow_type not in", values, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeBetween(String value1, String value2) {
            addCriterion("borrow_type between", value1, value2, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotBetween(String value1, String value2) {
            addCriterion("borrow_type not between", value1, value2, "borrowType");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseIsNull() {
            addCriterion("out_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseIsNotNull() {
            addCriterion("out_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseEqualTo(String value) {
            addCriterion("out_warehouse =", value, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNotEqualTo(String value) {
            addCriterion("out_warehouse <>", value, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseGreaterThan(String value) {
            addCriterion("out_warehouse >", value, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("out_warehouse >=", value, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseLessThan(String value) {
            addCriterion("out_warehouse <", value, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseLessThanOrEqualTo(String value) {
            addCriterion("out_warehouse <=", value, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseLike(String value) {
            addCriterion("out_warehouse like", value, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNotLike(String value) {
            addCriterion("out_warehouse not like", value, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseIn(List<String> values) {
            addCriterion("out_warehouse in", values, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNotIn(List<String> values) {
            addCriterion("out_warehouse not in", values, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseBetween(String value1, String value2) {
            addCriterion("out_warehouse between", value1, value2, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNotBetween(String value1, String value2) {
            addCriterion("out_warehouse not between", value1, value2, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIsNull() {
            addCriterion("in_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIsNotNull() {
            addCriterion("in_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andInWarehouseEqualTo(String value) {
            addCriterion("in_warehouse =", value, "inWarehouse");
            return (Criteria) this;
        }

        public Criteria andInWarehouseNotEqualTo(String value) {
            addCriterion("in_warehouse <>", value, "inWarehouse");
            return (Criteria) this;
        }

        public Criteria andInWarehouseGreaterThan(String value) {
            addCriterion("in_warehouse >", value, "inWarehouse");
            return (Criteria) this;
        }

        public Criteria andInWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("in_warehouse >=", value, "inWarehouse");
            return (Criteria) this;
        }

        public Criteria andInWarehouseLessThan(String value) {
            addCriterion("in_warehouse <", value, "inWarehouse");
            return (Criteria) this;
        }

        public Criteria andInWarehouseLessThanOrEqualTo(String value) {
            addCriterion("in_warehouse <=", value, "inWarehouse");
            return (Criteria) this;
        }

        public Criteria andInWarehouseLike(String value) {
            addCriterion("in_warehouse like", value, "inWarehouse");
            return (Criteria) this;
        }

        public Criteria andInWarehouseNotLike(String value) {
            addCriterion("in_warehouse not like", value, "inWarehouse");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIn(List<String> values) {
            addCriterion("in_warehouse in", values, "inWarehouse");
            return (Criteria) this;
        }

        public Criteria andInWarehouseNotIn(List<String> values) {
            addCriterion("in_warehouse not in", values, "inWarehouse");
            return (Criteria) this;
        }

        public Criteria andInWarehouseBetween(String value1, String value2) {
            addCriterion("in_warehouse between", value1, value2, "inWarehouse");
            return (Criteria) this;
        }

        public Criteria andInWarehouseNotBetween(String value1, String value2) {
            addCriterion("in_warehouse not between", value1, value2, "inWarehouse");
            return (Criteria) this;
        }

        public Criteria andEscrowWarehouseIsNull() {
            addCriterion("escrow_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andEscrowWarehouseIsNotNull() {
            addCriterion("escrow_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andEscrowWarehouseEqualTo(String value) {
            addCriterion("escrow_warehouse =", value, "escrowWarehouse");
            return (Criteria) this;
        }

        public Criteria andEscrowWarehouseNotEqualTo(String value) {
            addCriterion("escrow_warehouse <>", value, "escrowWarehouse");
            return (Criteria) this;
        }

        public Criteria andEscrowWarehouseGreaterThan(String value) {
            addCriterion("escrow_warehouse >", value, "escrowWarehouse");
            return (Criteria) this;
        }

        public Criteria andEscrowWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("escrow_warehouse >=", value, "escrowWarehouse");
            return (Criteria) this;
        }

        public Criteria andEscrowWarehouseLessThan(String value) {
            addCriterion("escrow_warehouse <", value, "escrowWarehouse");
            return (Criteria) this;
        }

        public Criteria andEscrowWarehouseLessThanOrEqualTo(String value) {
            addCriterion("escrow_warehouse <=", value, "escrowWarehouse");
            return (Criteria) this;
        }

        public Criteria andEscrowWarehouseLike(String value) {
            addCriterion("escrow_warehouse like", value, "escrowWarehouse");
            return (Criteria) this;
        }

        public Criteria andEscrowWarehouseNotLike(String value) {
            addCriterion("escrow_warehouse not like", value, "escrowWarehouse");
            return (Criteria) this;
        }

        public Criteria andEscrowWarehouseIn(List<String> values) {
            addCriterion("escrow_warehouse in", values, "escrowWarehouse");
            return (Criteria) this;
        }

        public Criteria andEscrowWarehouseNotIn(List<String> values) {
            addCriterion("escrow_warehouse not in", values, "escrowWarehouse");
            return (Criteria) this;
        }

        public Criteria andEscrowWarehouseBetween(String value1, String value2) {
            addCriterion("escrow_warehouse between", value1, value2, "escrowWarehouse");
            return (Criteria) this;
        }

        public Criteria andEscrowWarehouseNotBetween(String value1, String value2) {
            addCriterion("escrow_warehouse not between", value1, value2, "escrowWarehouse");
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

        public Criteria andBillStatusIsNull() {
            addCriterion("bill_status is null");
            return (Criteria) this;
        }

        public Criteria andBillStatusIsNotNull() {
            addCriterion("bill_status is not null");
            return (Criteria) this;
        }

        public Criteria andBillStatusEqualTo(String value) {
            addCriterion("bill_status =", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotEqualTo(String value) {
            addCriterion("bill_status <>", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThan(String value) {
            addCriterion("bill_status >", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusGreaterThanOrEqualTo(String value) {
            addCriterion("bill_status >=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThan(String value) {
            addCriterion("bill_status <", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLessThanOrEqualTo(String value) {
            addCriterion("bill_status <=", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusLike(String value) {
            addCriterion("bill_status like", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotLike(String value) {
            addCriterion("bill_status not like", value, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusIn(List<String> values) {
            addCriterion("bill_status in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotIn(List<String> values) {
            addCriterion("bill_status not in", values, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusBetween(String value1, String value2) {
            addCriterion("bill_status between", value1, value2, "billStatus");
            return (Criteria) this;
        }

        public Criteria andBillStatusNotBetween(String value1, String value2) {
            addCriterion("bill_status not between", value1, value2, "billStatus");
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

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(Integer value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Integer value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Integer value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Integer value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Integer> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Integer> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Integer value1, Integer value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("category not between", value1, value2, "category");
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