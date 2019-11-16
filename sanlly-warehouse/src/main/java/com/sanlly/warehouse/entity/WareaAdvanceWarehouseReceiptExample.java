package com.sanlly.warehouse.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareaAdvanceWarehouseReceiptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareaAdvanceWarehouseReceiptExample() {
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

        public Criteria andWareAdvanceWarehouseReceiptIdIsNull() {
            addCriterion("ware_advance_warehouse_receipt_id is null");
            return (Criteria) this;
        }

        public Criteria andWareAdvanceWarehouseReceiptIdIsNotNull() {
            addCriterion("ware_advance_warehouse_receipt_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareAdvanceWarehouseReceiptIdEqualTo(Integer value) {
            addCriterion("ware_advance_warehouse_receipt_id =", value, "wareAdvanceWarehouseReceiptId");
            return (Criteria) this;
        }

        public Criteria andWareAdvanceWarehouseReceiptIdNotEqualTo(Integer value) {
            addCriterion("ware_advance_warehouse_receipt_id <>", value, "wareAdvanceWarehouseReceiptId");
            return (Criteria) this;
        }

        public Criteria andWareAdvanceWarehouseReceiptIdGreaterThan(Integer value) {
            addCriterion("ware_advance_warehouse_receipt_id >", value, "wareAdvanceWarehouseReceiptId");
            return (Criteria) this;
        }

        public Criteria andWareAdvanceWarehouseReceiptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_advance_warehouse_receipt_id >=", value, "wareAdvanceWarehouseReceiptId");
            return (Criteria) this;
        }

        public Criteria andWareAdvanceWarehouseReceiptIdLessThan(Integer value) {
            addCriterion("ware_advance_warehouse_receipt_id <", value, "wareAdvanceWarehouseReceiptId");
            return (Criteria) this;
        }

        public Criteria andWareAdvanceWarehouseReceiptIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_advance_warehouse_receipt_id <=", value, "wareAdvanceWarehouseReceiptId");
            return (Criteria) this;
        }

        public Criteria andWareAdvanceWarehouseReceiptIdIn(List<Integer> values) {
            addCriterion("ware_advance_warehouse_receipt_id in", values, "wareAdvanceWarehouseReceiptId");
            return (Criteria) this;
        }

        public Criteria andWareAdvanceWarehouseReceiptIdNotIn(List<Integer> values) {
            addCriterion("ware_advance_warehouse_receipt_id not in", values, "wareAdvanceWarehouseReceiptId");
            return (Criteria) this;
        }

        public Criteria andWareAdvanceWarehouseReceiptIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_advance_warehouse_receipt_id between", value1, value2, "wareAdvanceWarehouseReceiptId");
            return (Criteria) this;
        }

        public Criteria andWareAdvanceWarehouseReceiptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_advance_warehouse_receipt_id not between", value1, value2, "wareAdvanceWarehouseReceiptId");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoIsNull() {
            addCriterion("advance_warehouse_receipt_no is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoIsNotNull() {
            addCriterion("advance_warehouse_receipt_no is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoEqualTo(String value) {
            addCriterion("advance_warehouse_receipt_no =", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoNotEqualTo(String value) {
            addCriterion("advance_warehouse_receipt_no <>", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoGreaterThan(String value) {
            addCriterion("advance_warehouse_receipt_no >", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoGreaterThanOrEqualTo(String value) {
            addCriterion("advance_warehouse_receipt_no >=", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoLessThan(String value) {
            addCriterion("advance_warehouse_receipt_no <", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoLessThanOrEqualTo(String value) {
            addCriterion("advance_warehouse_receipt_no <=", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoLike(String value) {
            addCriterion("advance_warehouse_receipt_no like", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoNotLike(String value) {
            addCriterion("advance_warehouse_receipt_no not like", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoIn(List<String> values) {
            addCriterion("advance_warehouse_receipt_no in", values, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoNotIn(List<String> values) {
            addCriterion("advance_warehouse_receipt_no not in", values, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoBetween(String value1, String value2) {
            addCriterion("advance_warehouse_receipt_no between", value1, value2, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoNotBetween(String value1, String value2) {
            addCriterion("advance_warehouse_receipt_no not between", value1, value2, "advanceWarehouseReceiptNo");
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

        public Criteria andSparePartsNumIsNull() {
            addCriterion("spare_parts_num is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumIsNotNull() {
            addCriterion("spare_parts_num is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumEqualTo(Double value) {
            addCriterion("spare_parts_num =", value, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumNotEqualTo(Double value) {
            addCriterion("spare_parts_num <>", value, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumGreaterThan(Double value) {
            addCriterion("spare_parts_num >", value, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumGreaterThanOrEqualTo(Double value) {
            addCriterion("spare_parts_num >=", value, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumLessThan(Double value) {
            addCriterion("spare_parts_num <", value, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumLessThanOrEqualTo(Double value) {
            addCriterion("spare_parts_num <=", value, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumIn(List<Double> values) {
            addCriterion("spare_parts_num in", values, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumNotIn(List<Double> values) {
            addCriterion("spare_parts_num not in", values, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumBetween(Double value1, Double value2) {
            addCriterion("spare_parts_num between", value1, value2, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumNotBetween(Double value1, Double value2) {
            addCriterion("spare_parts_num not between", value1, value2, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andReceiveNumIsNull() {
            addCriterion("receive_num is null");
            return (Criteria) this;
        }

        public Criteria andReceiveNumIsNotNull() {
            addCriterion("receive_num is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveNumEqualTo(Double value) {
            addCriterion("receive_num =", value, "receiveNum");
            return (Criteria) this;
        }

        public Criteria andReceiveNumNotEqualTo(Double value) {
            addCriterion("receive_num <>", value, "receiveNum");
            return (Criteria) this;
        }

        public Criteria andReceiveNumGreaterThan(Double value) {
            addCriterion("receive_num >", value, "receiveNum");
            return (Criteria) this;
        }

        public Criteria andReceiveNumGreaterThanOrEqualTo(Double value) {
            addCriterion("receive_num >=", value, "receiveNum");
            return (Criteria) this;
        }

        public Criteria andReceiveNumLessThan(Double value) {
            addCriterion("receive_num <", value, "receiveNum");
            return (Criteria) this;
        }

        public Criteria andReceiveNumLessThanOrEqualTo(Double value) {
            addCriterion("receive_num <=", value, "receiveNum");
            return (Criteria) this;
        }

        public Criteria andReceiveNumIn(List<Double> values) {
            addCriterion("receive_num in", values, "receiveNum");
            return (Criteria) this;
        }

        public Criteria andReceiveNumNotIn(List<Double> values) {
            addCriterion("receive_num not in", values, "receiveNum");
            return (Criteria) this;
        }

        public Criteria andReceiveNumBetween(Double value1, Double value2) {
            addCriterion("receive_num between", value1, value2, "receiveNum");
            return (Criteria) this;
        }

        public Criteria andReceiveNumNotBetween(Double value1, Double value2) {
            addCriterion("receive_num not between", value1, value2, "receiveNum");
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

        public Criteria andBorrowNumIsNull() {
            addCriterion("borrow_num is null");
            return (Criteria) this;
        }

        public Criteria andBorrowNumIsNotNull() {
            addCriterion("borrow_num is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowNumEqualTo(Double value) {
            addCriterion("borrow_num =", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumNotEqualTo(Double value) {
            addCriterion("borrow_num <>", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumGreaterThan(Double value) {
            addCriterion("borrow_num >", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumGreaterThanOrEqualTo(Double value) {
            addCriterion("borrow_num >=", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumLessThan(Double value) {
            addCriterion("borrow_num <", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumLessThanOrEqualTo(Double value) {
            addCriterion("borrow_num <=", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumIn(List<Double> values) {
            addCriterion("borrow_num in", values, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumNotIn(List<Double> values) {
            addCriterion("borrow_num not in", values, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumBetween(Double value1, Double value2) {
            addCriterion("borrow_num between", value1, value2, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumNotBetween(Double value1, Double value2) {
            addCriterion("borrow_num not between", value1, value2, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andReceiveMaterialNumIsNull() {
            addCriterion("receive_material_num is null");
            return (Criteria) this;
        }

        public Criteria andReceiveMaterialNumIsNotNull() {
            addCriterion("receive_material_num is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveMaterialNumEqualTo(Double value) {
            addCriterion("receive_material_num =", value, "receiveMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReceiveMaterialNumNotEqualTo(Double value) {
            addCriterion("receive_material_num <>", value, "receiveMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReceiveMaterialNumGreaterThan(Double value) {
            addCriterion("receive_material_num >", value, "receiveMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReceiveMaterialNumGreaterThanOrEqualTo(Double value) {
            addCriterion("receive_material_num >=", value, "receiveMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReceiveMaterialNumLessThan(Double value) {
            addCriterion("receive_material_num <", value, "receiveMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReceiveMaterialNumLessThanOrEqualTo(Double value) {
            addCriterion("receive_material_num <=", value, "receiveMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReceiveMaterialNumIn(List<Double> values) {
            addCriterion("receive_material_num in", values, "receiveMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReceiveMaterialNumNotIn(List<Double> values) {
            addCriterion("receive_material_num not in", values, "receiveMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReceiveMaterialNumBetween(Double value1, Double value2) {
            addCriterion("receive_material_num between", value1, value2, "receiveMaterialNum");
            return (Criteria) this;
        }

        public Criteria andReceiveMaterialNumNotBetween(Double value1, Double value2) {
            addCriterion("receive_material_num not between", value1, value2, "receiveMaterialNum");
            return (Criteria) this;
        }

        public Criteria andIsDelayIsNull() {
            addCriterion("is_delay is null");
            return (Criteria) this;
        }

        public Criteria andIsDelayIsNotNull() {
            addCriterion("is_delay is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelayEqualTo(String value) {
            addCriterion("is_delay =", value, "isDelay");
            return (Criteria) this;
        }

        public Criteria andIsDelayNotEqualTo(String value) {
            addCriterion("is_delay <>", value, "isDelay");
            return (Criteria) this;
        }

        public Criteria andIsDelayGreaterThan(String value) {
            addCriterion("is_delay >", value, "isDelay");
            return (Criteria) this;
        }

        public Criteria andIsDelayGreaterThanOrEqualTo(String value) {
            addCriterion("is_delay >=", value, "isDelay");
            return (Criteria) this;
        }

        public Criteria andIsDelayLessThan(String value) {
            addCriterion("is_delay <", value, "isDelay");
            return (Criteria) this;
        }

        public Criteria andIsDelayLessThanOrEqualTo(String value) {
            addCriterion("is_delay <=", value, "isDelay");
            return (Criteria) this;
        }

        public Criteria andIsDelayLike(String value) {
            addCriterion("is_delay like", value, "isDelay");
            return (Criteria) this;
        }

        public Criteria andIsDelayNotLike(String value) {
            addCriterion("is_delay not like", value, "isDelay");
            return (Criteria) this;
        }

        public Criteria andIsDelayIn(List<String> values) {
            addCriterion("is_delay in", values, "isDelay");
            return (Criteria) this;
        }

        public Criteria andIsDelayNotIn(List<String> values) {
            addCriterion("is_delay not in", values, "isDelay");
            return (Criteria) this;
        }

        public Criteria andIsDelayBetween(String value1, String value2) {
            addCriterion("is_delay between", value1, value2, "isDelay");
            return (Criteria) this;
        }

        public Criteria andIsDelayNotBetween(String value1, String value2) {
            addCriterion("is_delay not between", value1, value2, "isDelay");
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

        public Criteria andReceivePieceNumIsNull() {
            addCriterion("receive_piece_num is null");
            return (Criteria) this;
        }

        public Criteria andReceivePieceNumIsNotNull() {
            addCriterion("receive_piece_num is not null");
            return (Criteria) this;
        }

        public Criteria andReceivePieceNumEqualTo(Double value) {
            addCriterion("receive_piece_num =", value, "receivePieceNum");
            return (Criteria) this;
        }

        public Criteria andReceivePieceNumNotEqualTo(Double value) {
            addCriterion("receive_piece_num <>", value, "receivePieceNum");
            return (Criteria) this;
        }

        public Criteria andReceivePieceNumGreaterThan(Double value) {
            addCriterion("receive_piece_num >", value, "receivePieceNum");
            return (Criteria) this;
        }

        public Criteria andReceivePieceNumGreaterThanOrEqualTo(Double value) {
            addCriterion("receive_piece_num >=", value, "receivePieceNum");
            return (Criteria) this;
        }

        public Criteria andReceivePieceNumLessThan(Double value) {
            addCriterion("receive_piece_num <", value, "receivePieceNum");
            return (Criteria) this;
        }

        public Criteria andReceivePieceNumLessThanOrEqualTo(Double value) {
            addCriterion("receive_piece_num <=", value, "receivePieceNum");
            return (Criteria) this;
        }

        public Criteria andReceivePieceNumIn(List<Double> values) {
            addCriterion("receive_piece_num in", values, "receivePieceNum");
            return (Criteria) this;
        }

        public Criteria andReceivePieceNumNotIn(List<Double> values) {
            addCriterion("receive_piece_num not in", values, "receivePieceNum");
            return (Criteria) this;
        }

        public Criteria andReceivePieceNumBetween(Double value1, Double value2) {
            addCriterion("receive_piece_num between", value1, value2, "receivePieceNum");
            return (Criteria) this;
        }

        public Criteria andReceivePieceNumNotBetween(Double value1, Double value2) {
            addCriterion("receive_piece_num not between", value1, value2, "receivePieceNum");
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