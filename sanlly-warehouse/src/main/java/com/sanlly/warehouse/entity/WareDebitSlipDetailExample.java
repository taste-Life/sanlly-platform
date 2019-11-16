package com.sanlly.warehouse.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareDebitSlipDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareDebitSlipDetailExample() {
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

        public Criteria andWareDebitSlipDetailIdIsNull() {
            addCriterion("ware_debit_slip_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipDetailIdIsNotNull() {
            addCriterion("ware_debit_slip_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipDetailIdEqualTo(Integer value) {
            addCriterion("ware_debit_slip_detail_id =", value, "wareDebitSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipDetailIdNotEqualTo(Integer value) {
            addCriterion("ware_debit_slip_detail_id <>", value, "wareDebitSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipDetailIdGreaterThan(Integer value) {
            addCriterion("ware_debit_slip_detail_id >", value, "wareDebitSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_debit_slip_detail_id >=", value, "wareDebitSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipDetailIdLessThan(Integer value) {
            addCriterion("ware_debit_slip_detail_id <", value, "wareDebitSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_debit_slip_detail_id <=", value, "wareDebitSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipDetailIdIn(List<Integer> values) {
            addCriterion("ware_debit_slip_detail_id in", values, "wareDebitSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipDetailIdNotIn(List<Integer> values) {
            addCriterion("ware_debit_slip_detail_id not in", values, "wareDebitSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_debit_slip_detail_id between", value1, value2, "wareDebitSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_debit_slip_detail_id not between", value1, value2, "wareDebitSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipIsNull() {
            addCriterion("ware_debit_slip is null");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipIsNotNull() {
            addCriterion("ware_debit_slip is not null");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipEqualTo(Integer value) {
            addCriterion("ware_debit_slip =", value, "wareDebitSlip");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipNotEqualTo(Integer value) {
            addCriterion("ware_debit_slip <>", value, "wareDebitSlip");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipGreaterThan(Integer value) {
            addCriterion("ware_debit_slip >", value, "wareDebitSlip");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_debit_slip >=", value, "wareDebitSlip");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipLessThan(Integer value) {
            addCriterion("ware_debit_slip <", value, "wareDebitSlip");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipLessThanOrEqualTo(Integer value) {
            addCriterion("ware_debit_slip <=", value, "wareDebitSlip");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipIn(List<Integer> values) {
            addCriterion("ware_debit_slip in", values, "wareDebitSlip");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipNotIn(List<Integer> values) {
            addCriterion("ware_debit_slip not in", values, "wareDebitSlip");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipBetween(Integer value1, Integer value2) {
            addCriterion("ware_debit_slip between", value1, value2, "wareDebitSlip");
            return (Criteria) this;
        }

        public Criteria andWareDebitSlipNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_debit_slip not between", value1, value2, "wareDebitSlip");
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

        public Criteria andWarehouseTypeIsNull() {
            addCriterion("warehouse_type is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIsNotNull() {
            addCriterion("warehouse_type is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeEqualTo(String value) {
            addCriterion("warehouse_type =", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeNotEqualTo(String value) {
            addCriterion("warehouse_type <>", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeGreaterThan(String value) {
            addCriterion("warehouse_type >", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_type >=", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeLessThan(String value) {
            addCriterion("warehouse_type <", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeLessThanOrEqualTo(String value) {
            addCriterion("warehouse_type <=", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeLike(String value) {
            addCriterion("warehouse_type like", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeNotLike(String value) {
            addCriterion("warehouse_type not like", value, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIn(List<String> values) {
            addCriterion("warehouse_type in", values, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeNotIn(List<String> values) {
            addCriterion("warehouse_type not in", values, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeBetween(String value1, String value2) {
            addCriterion("warehouse_type between", value1, value2, "warehouseType");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeNotBetween(String value1, String value2) {
            addCriterion("warehouse_type not between", value1, value2, "warehouseType");
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

        public Criteria andReturnNumIsNull() {
            addCriterion("return_num is null");
            return (Criteria) this;
        }

        public Criteria andReturnNumIsNotNull() {
            addCriterion("return_num is not null");
            return (Criteria) this;
        }

        public Criteria andReturnNumEqualTo(Double value) {
            addCriterion("return_num =", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumNotEqualTo(Double value) {
            addCriterion("return_num <>", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumGreaterThan(Double value) {
            addCriterion("return_num >", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumGreaterThanOrEqualTo(Double value) {
            addCriterion("return_num >=", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumLessThan(Double value) {
            addCriterion("return_num <", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumLessThanOrEqualTo(Double value) {
            addCriterion("return_num <=", value, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumIn(List<Double> values) {
            addCriterion("return_num in", values, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumNotIn(List<Double> values) {
            addCriterion("return_num not in", values, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumBetween(Double value1, Double value2) {
            addCriterion("return_num between", value1, value2, "returnNum");
            return (Criteria) this;
        }

        public Criteria andReturnNumNotBetween(Double value1, Double value2) {
            addCriterion("return_num not between", value1, value2, "returnNum");
            return (Criteria) this;
        }

        public Criteria andUpperContainerNumIsNull() {
            addCriterion("upper_container_num is null");
            return (Criteria) this;
        }

        public Criteria andUpperContainerNumIsNotNull() {
            addCriterion("upper_container_num is not null");
            return (Criteria) this;
        }

        public Criteria andUpperContainerNumEqualTo(Double value) {
            addCriterion("upper_container_num =", value, "upperContainerNum");
            return (Criteria) this;
        }

        public Criteria andUpperContainerNumNotEqualTo(Double value) {
            addCriterion("upper_container_num <>", value, "upperContainerNum");
            return (Criteria) this;
        }

        public Criteria andUpperContainerNumGreaterThan(Double value) {
            addCriterion("upper_container_num >", value, "upperContainerNum");
            return (Criteria) this;
        }

        public Criteria andUpperContainerNumGreaterThanOrEqualTo(Double value) {
            addCriterion("upper_container_num >=", value, "upperContainerNum");
            return (Criteria) this;
        }

        public Criteria andUpperContainerNumLessThan(Double value) {
            addCriterion("upper_container_num <", value, "upperContainerNum");
            return (Criteria) this;
        }

        public Criteria andUpperContainerNumLessThanOrEqualTo(Double value) {
            addCriterion("upper_container_num <=", value, "upperContainerNum");
            return (Criteria) this;
        }

        public Criteria andUpperContainerNumIn(List<Double> values) {
            addCriterion("upper_container_num in", values, "upperContainerNum");
            return (Criteria) this;
        }

        public Criteria andUpperContainerNumNotIn(List<Double> values) {
            addCriterion("upper_container_num not in", values, "upperContainerNum");
            return (Criteria) this;
        }

        public Criteria andUpperContainerNumBetween(Double value1, Double value2) {
            addCriterion("upper_container_num between", value1, value2, "upperContainerNum");
            return (Criteria) this;
        }

        public Criteria andUpperContainerNumNotBetween(Double value1, Double value2) {
            addCriterion("upper_container_num not between", value1, value2, "upperContainerNum");
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