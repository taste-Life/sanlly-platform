package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowLendDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BorrowLendDetailExample() {
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

        public Criteria andWareBorrowSlipDetailIdIsNull() {
            addCriterion("ware_borrow_slip_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andWareBorrowSlipDetailIdIsNotNull() {
            addCriterion("ware_borrow_slip_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareBorrowSlipDetailIdEqualTo(Integer value) {
            addCriterion("ware_borrow_slip_detail_id =", value, "wareBorrowSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareBorrowSlipDetailIdNotEqualTo(Integer value) {
            addCriterion("ware_borrow_slip_detail_id <>", value, "wareBorrowSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareBorrowSlipDetailIdGreaterThan(Integer value) {
            addCriterion("ware_borrow_slip_detail_id >", value, "wareBorrowSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareBorrowSlipDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_borrow_slip_detail_id >=", value, "wareBorrowSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareBorrowSlipDetailIdLessThan(Integer value) {
            addCriterion("ware_borrow_slip_detail_id <", value, "wareBorrowSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareBorrowSlipDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_borrow_slip_detail_id <=", value, "wareBorrowSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareBorrowSlipDetailIdIn(List<Integer> values) {
            addCriterion("ware_borrow_slip_detail_id in", values, "wareBorrowSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareBorrowSlipDetailIdNotIn(List<Integer> values) {
            addCriterion("ware_borrow_slip_detail_id not in", values, "wareBorrowSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareBorrowSlipDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_borrow_slip_detail_id between", value1, value2, "wareBorrowSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareBorrowSlipDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_borrow_slip_detail_id not between", value1, value2, "wareBorrowSlipDetailId");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipIsNull() {
            addCriterion("ware_borrow_lend_slip is null");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipIsNotNull() {
            addCriterion("ware_borrow_lend_slip is not null");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipEqualTo(Integer value) {
            addCriterion("ware_borrow_lend_slip =", value, "wareBorrowLendSlip");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipNotEqualTo(Integer value) {
            addCriterion("ware_borrow_lend_slip <>", value, "wareBorrowLendSlip");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipGreaterThan(Integer value) {
            addCriterion("ware_borrow_lend_slip >", value, "wareBorrowLendSlip");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_borrow_lend_slip >=", value, "wareBorrowLendSlip");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipLessThan(Integer value) {
            addCriterion("ware_borrow_lend_slip <", value, "wareBorrowLendSlip");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipLessThanOrEqualTo(Integer value) {
            addCriterion("ware_borrow_lend_slip <=", value, "wareBorrowLendSlip");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipIn(List<Integer> values) {
            addCriterion("ware_borrow_lend_slip in", values, "wareBorrowLendSlip");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipNotIn(List<Integer> values) {
            addCriterion("ware_borrow_lend_slip not in", values, "wareBorrowLendSlip");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipBetween(Integer value1, Integer value2) {
            addCriterion("ware_borrow_lend_slip between", value1, value2, "wareBorrowLendSlip");
            return (Criteria) this;
        }

        public Criteria andWareBorrowLendSlipNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_borrow_lend_slip not between", value1, value2, "wareBorrowLendSlip");
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

        public Criteria andSparePartsBatchIsNull() {
            addCriterion("spare_parts_batch is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchIsNotNull() {
            addCriterion("spare_parts_batch is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchEqualTo(String value) {
            addCriterion("spare_parts_batch =", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchNotEqualTo(String value) {
            addCriterion("spare_parts_batch <>", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchGreaterThan(String value) {
            addCriterion("spare_parts_batch >", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_batch >=", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchLessThan(String value) {
            addCriterion("spare_parts_batch <", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_batch <=", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchLike(String value) {
            addCriterion("spare_parts_batch like", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchNotLike(String value) {
            addCriterion("spare_parts_batch not like", value, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchIn(List<String> values) {
            addCriterion("spare_parts_batch in", values, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchNotIn(List<String> values) {
            addCriterion("spare_parts_batch not in", values, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchBetween(String value1, String value2) {
            addCriterion("spare_parts_batch between", value1, value2, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsBatchNotBetween(String value1, String value2) {
            addCriterion("spare_parts_batch not between", value1, value2, "sparePartsBatch");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsIsNull() {
            addCriterion("stockin_spare_parts is null");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsIsNotNull() {
            addCriterion("stockin_spare_parts is not null");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsEqualTo(String value) {
            addCriterion("stockin_spare_parts =", value, "stockinSpareParts");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsNotEqualTo(String value) {
            addCriterion("stockin_spare_parts <>", value, "stockinSpareParts");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsGreaterThan(String value) {
            addCriterion("stockin_spare_parts >", value, "stockinSpareParts");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsGreaterThanOrEqualTo(String value) {
            addCriterion("stockin_spare_parts >=", value, "stockinSpareParts");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsLessThan(String value) {
            addCriterion("stockin_spare_parts <", value, "stockinSpareParts");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsLessThanOrEqualTo(String value) {
            addCriterion("stockin_spare_parts <=", value, "stockinSpareParts");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsLike(String value) {
            addCriterion("stockin_spare_parts like", value, "stockinSpareParts");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsNotLike(String value) {
            addCriterion("stockin_spare_parts not like", value, "stockinSpareParts");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsIn(List<String> values) {
            addCriterion("stockin_spare_parts in", values, "stockinSpareParts");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsNotIn(List<String> values) {
            addCriterion("stockin_spare_parts not in", values, "stockinSpareParts");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsBetween(String value1, String value2) {
            addCriterion("stockin_spare_parts between", value1, value2, "stockinSpareParts");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsNotBetween(String value1, String value2) {
            addCriterion("stockin_spare_parts not between", value1, value2, "stockinSpareParts");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsNameIsNull() {
            addCriterion("stockin_spare_parts_name is null");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsNameIsNotNull() {
            addCriterion("stockin_spare_parts_name is not null");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsNameEqualTo(String value) {
            addCriterion("stockin_spare_parts_name =", value, "stockinSparePartsName");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsNameNotEqualTo(String value) {
            addCriterion("stockin_spare_parts_name <>", value, "stockinSparePartsName");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsNameGreaterThan(String value) {
            addCriterion("stockin_spare_parts_name >", value, "stockinSparePartsName");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsNameGreaterThanOrEqualTo(String value) {
            addCriterion("stockin_spare_parts_name >=", value, "stockinSparePartsName");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsNameLessThan(String value) {
            addCriterion("stockin_spare_parts_name <", value, "stockinSparePartsName");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsNameLessThanOrEqualTo(String value) {
            addCriterion("stockin_spare_parts_name <=", value, "stockinSparePartsName");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsNameLike(String value) {
            addCriterion("stockin_spare_parts_name like", value, "stockinSparePartsName");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsNameNotLike(String value) {
            addCriterion("stockin_spare_parts_name not like", value, "stockinSparePartsName");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsNameIn(List<String> values) {
            addCriterion("stockin_spare_parts_name in", values, "stockinSparePartsName");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsNameNotIn(List<String> values) {
            addCriterion("stockin_spare_parts_name not in", values, "stockinSparePartsName");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsNameBetween(String value1, String value2) {
            addCriterion("stockin_spare_parts_name between", value1, value2, "stockinSparePartsName");
            return (Criteria) this;
        }

        public Criteria andStockinSparePartsNameNotBetween(String value1, String value2) {
            addCriterion("stockin_spare_parts_name not between", value1, value2, "stockinSparePartsName");
            return (Criteria) this;
        }

        public Criteria andEscrowCompanyIsNull() {
            addCriterion("escrow_company is null");
            return (Criteria) this;
        }

        public Criteria andEscrowCompanyIsNotNull() {
            addCriterion("escrow_company is not null");
            return (Criteria) this;
        }

        public Criteria andEscrowCompanyEqualTo(String value) {
            addCriterion("escrow_company =", value, "escrowCompany");
            return (Criteria) this;
        }

        public Criteria andEscrowCompanyNotEqualTo(String value) {
            addCriterion("escrow_company <>", value, "escrowCompany");
            return (Criteria) this;
        }

        public Criteria andEscrowCompanyGreaterThan(String value) {
            addCriterion("escrow_company >", value, "escrowCompany");
            return (Criteria) this;
        }

        public Criteria andEscrowCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("escrow_company >=", value, "escrowCompany");
            return (Criteria) this;
        }

        public Criteria andEscrowCompanyLessThan(String value) {
            addCriterion("escrow_company <", value, "escrowCompany");
            return (Criteria) this;
        }

        public Criteria andEscrowCompanyLessThanOrEqualTo(String value) {
            addCriterion("escrow_company <=", value, "escrowCompany");
            return (Criteria) this;
        }

        public Criteria andEscrowCompanyLike(String value) {
            addCriterion("escrow_company like", value, "escrowCompany");
            return (Criteria) this;
        }

        public Criteria andEscrowCompanyNotLike(String value) {
            addCriterion("escrow_company not like", value, "escrowCompany");
            return (Criteria) this;
        }

        public Criteria andEscrowCompanyIn(List<String> values) {
            addCriterion("escrow_company in", values, "escrowCompany");
            return (Criteria) this;
        }

        public Criteria andEscrowCompanyNotIn(List<String> values) {
            addCriterion("escrow_company not in", values, "escrowCompany");
            return (Criteria) this;
        }

        public Criteria andEscrowCompanyBetween(String value1, String value2) {
            addCriterion("escrow_company between", value1, value2, "escrowCompany");
            return (Criteria) this;
        }

        public Criteria andEscrowCompanyNotBetween(String value1, String value2) {
            addCriterion("escrow_company not between", value1, value2, "escrowCompany");
            return (Criteria) this;
        }

        public Criteria andInWarehouseTypeIsNull() {
            addCriterion("in_warehouse_type is null");
            return (Criteria) this;
        }

        public Criteria andInWarehouseTypeIsNotNull() {
            addCriterion("in_warehouse_type is not null");
            return (Criteria) this;
        }

        public Criteria andInWarehouseTypeEqualTo(String value) {
            addCriterion("in_warehouse_type =", value, "inWarehouseType");
            return (Criteria) this;
        }

        public Criteria andInWarehouseTypeNotEqualTo(String value) {
            addCriterion("in_warehouse_type <>", value, "inWarehouseType");
            return (Criteria) this;
        }

        public Criteria andInWarehouseTypeGreaterThan(String value) {
            addCriterion("in_warehouse_type >", value, "inWarehouseType");
            return (Criteria) this;
        }

        public Criteria andInWarehouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("in_warehouse_type >=", value, "inWarehouseType");
            return (Criteria) this;
        }

        public Criteria andInWarehouseTypeLessThan(String value) {
            addCriterion("in_warehouse_type <", value, "inWarehouseType");
            return (Criteria) this;
        }

        public Criteria andInWarehouseTypeLessThanOrEqualTo(String value) {
            addCriterion("in_warehouse_type <=", value, "inWarehouseType");
            return (Criteria) this;
        }

        public Criteria andInWarehouseTypeLike(String value) {
            addCriterion("in_warehouse_type like", value, "inWarehouseType");
            return (Criteria) this;
        }

        public Criteria andInWarehouseTypeNotLike(String value) {
            addCriterion("in_warehouse_type not like", value, "inWarehouseType");
            return (Criteria) this;
        }

        public Criteria andInWarehouseTypeIn(List<String> values) {
            addCriterion("in_warehouse_type in", values, "inWarehouseType");
            return (Criteria) this;
        }

        public Criteria andInWarehouseTypeNotIn(List<String> values) {
            addCriterion("in_warehouse_type not in", values, "inWarehouseType");
            return (Criteria) this;
        }

        public Criteria andInWarehouseTypeBetween(String value1, String value2) {
            addCriterion("in_warehouse_type between", value1, value2, "inWarehouseType");
            return (Criteria) this;
        }

        public Criteria andInWarehouseTypeNotBetween(String value1, String value2) {
            addCriterion("in_warehouse_type not between", value1, value2, "inWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseTypeIsNull() {
            addCriterion("out_warehouse_type is null");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseTypeIsNotNull() {
            addCriterion("out_warehouse_type is not null");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseTypeEqualTo(String value) {
            addCriterion("out_warehouse_type =", value, "outWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseTypeNotEqualTo(String value) {
            addCriterion("out_warehouse_type <>", value, "outWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseTypeGreaterThan(String value) {
            addCriterion("out_warehouse_type >", value, "outWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("out_warehouse_type >=", value, "outWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseTypeLessThan(String value) {
            addCriterion("out_warehouse_type <", value, "outWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseTypeLessThanOrEqualTo(String value) {
            addCriterion("out_warehouse_type <=", value, "outWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseTypeLike(String value) {
            addCriterion("out_warehouse_type like", value, "outWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseTypeNotLike(String value) {
            addCriterion("out_warehouse_type not like", value, "outWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseTypeIn(List<String> values) {
            addCriterion("out_warehouse_type in", values, "outWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseTypeNotIn(List<String> values) {
            addCriterion("out_warehouse_type not in", values, "outWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseTypeBetween(String value1, String value2) {
            addCriterion("out_warehouse_type between", value1, value2, "outWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseTypeNotBetween(String value1, String value2) {
            addCriterion("out_warehouse_type not between", value1, value2, "outWarehouseType");
            return (Criteria) this;
        }

        public Criteria andOutStorageLocationIsNull() {
            addCriterion("out_storage_location is null");
            return (Criteria) this;
        }

        public Criteria andOutStorageLocationIsNotNull() {
            addCriterion("out_storage_location is not null");
            return (Criteria) this;
        }

        public Criteria andOutStorageLocationEqualTo(String value) {
            addCriterion("out_storage_location =", value, "outStorageLocation");
            return (Criteria) this;
        }

        public Criteria andOutStorageLocationNotEqualTo(String value) {
            addCriterion("out_storage_location <>", value, "outStorageLocation");
            return (Criteria) this;
        }

        public Criteria andOutStorageLocationGreaterThan(String value) {
            addCriterion("out_storage_location >", value, "outStorageLocation");
            return (Criteria) this;
        }

        public Criteria andOutStorageLocationGreaterThanOrEqualTo(String value) {
            addCriterion("out_storage_location >=", value, "outStorageLocation");
            return (Criteria) this;
        }

        public Criteria andOutStorageLocationLessThan(String value) {
            addCriterion("out_storage_location <", value, "outStorageLocation");
            return (Criteria) this;
        }

        public Criteria andOutStorageLocationLessThanOrEqualTo(String value) {
            addCriterion("out_storage_location <=", value, "outStorageLocation");
            return (Criteria) this;
        }

        public Criteria andOutStorageLocationLike(String value) {
            addCriterion("out_storage_location like", value, "outStorageLocation");
            return (Criteria) this;
        }

        public Criteria andOutStorageLocationNotLike(String value) {
            addCriterion("out_storage_location not like", value, "outStorageLocation");
            return (Criteria) this;
        }

        public Criteria andOutStorageLocationIn(List<String> values) {
            addCriterion("out_storage_location in", values, "outStorageLocation");
            return (Criteria) this;
        }

        public Criteria andOutStorageLocationNotIn(List<String> values) {
            addCriterion("out_storage_location not in", values, "outStorageLocation");
            return (Criteria) this;
        }

        public Criteria andOutStorageLocationBetween(String value1, String value2) {
            addCriterion("out_storage_location between", value1, value2, "outStorageLocation");
            return (Criteria) this;
        }

        public Criteria andOutStorageLocationNotBetween(String value1, String value2) {
            addCriterion("out_storage_location not between", value1, value2, "outStorageLocation");
            return (Criteria) this;
        }

        public Criteria andInStorageLocationIsNull() {
            addCriterion("in_storage_location is null");
            return (Criteria) this;
        }

        public Criteria andInStorageLocationIsNotNull() {
            addCriterion("in_storage_location is not null");
            return (Criteria) this;
        }

        public Criteria andInStorageLocationEqualTo(String value) {
            addCriterion("in_storage_location =", value, "inStorageLocation");
            return (Criteria) this;
        }

        public Criteria andInStorageLocationNotEqualTo(String value) {
            addCriterion("in_storage_location <>", value, "inStorageLocation");
            return (Criteria) this;
        }

        public Criteria andInStorageLocationGreaterThan(String value) {
            addCriterion("in_storage_location >", value, "inStorageLocation");
            return (Criteria) this;
        }

        public Criteria andInStorageLocationGreaterThanOrEqualTo(String value) {
            addCriterion("in_storage_location >=", value, "inStorageLocation");
            return (Criteria) this;
        }

        public Criteria andInStorageLocationLessThan(String value) {
            addCriterion("in_storage_location <", value, "inStorageLocation");
            return (Criteria) this;
        }

        public Criteria andInStorageLocationLessThanOrEqualTo(String value) {
            addCriterion("in_storage_location <=", value, "inStorageLocation");
            return (Criteria) this;
        }

        public Criteria andInStorageLocationLike(String value) {
            addCriterion("in_storage_location like", value, "inStorageLocation");
            return (Criteria) this;
        }

        public Criteria andInStorageLocationNotLike(String value) {
            addCriterion("in_storage_location not like", value, "inStorageLocation");
            return (Criteria) this;
        }

        public Criteria andInStorageLocationIn(List<String> values) {
            addCriterion("in_storage_location in", values, "inStorageLocation");
            return (Criteria) this;
        }

        public Criteria andInStorageLocationNotIn(List<String> values) {
            addCriterion("in_storage_location not in", values, "inStorageLocation");
            return (Criteria) this;
        }

        public Criteria andInStorageLocationBetween(String value1, String value2) {
            addCriterion("in_storage_location between", value1, value2, "inStorageLocation");
            return (Criteria) this;
        }

        public Criteria andInStorageLocationNotBetween(String value1, String value2) {
            addCriterion("in_storage_location not between", value1, value2, "inStorageLocation");
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

        public Criteria andRepayNumIsNull() {
            addCriterion("repay_num is null");
            return (Criteria) this;
        }

        public Criteria andRepayNumIsNotNull() {
            addCriterion("repay_num is not null");
            return (Criteria) this;
        }

        public Criteria andRepayNumEqualTo(Double value) {
            addCriterion("repay_num =", value, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumNotEqualTo(Double value) {
            addCriterion("repay_num <>", value, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumGreaterThan(Double value) {
            addCriterion("repay_num >", value, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumGreaterThanOrEqualTo(Double value) {
            addCriterion("repay_num >=", value, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumLessThan(Double value) {
            addCriterion("repay_num <", value, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumLessThanOrEqualTo(Double value) {
            addCriterion("repay_num <=", value, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumIn(List<Double> values) {
            addCriterion("repay_num in", values, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumNotIn(List<Double> values) {
            addCriterion("repay_num not in", values, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumBetween(Double value1, Double value2) {
            addCriterion("repay_num between", value1, value2, "repayNum");
            return (Criteria) this;
        }

        public Criteria andRepayNumNotBetween(Double value1, Double value2) {
            addCriterion("repay_num not between", value1, value2, "repayNum");
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

        public Criteria andBorrowPriceIsNull() {
            addCriterion("borrow_price is null");
            return (Criteria) this;
        }

        public Criteria andBorrowPriceIsNotNull() {
            addCriterion("borrow_price is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowPriceEqualTo(BigDecimal value) {
            addCriterion("borrow_price =", value, "borrowPrice");
            return (Criteria) this;
        }

        public Criteria andBorrowPriceNotEqualTo(BigDecimal value) {
            addCriterion("borrow_price <>", value, "borrowPrice");
            return (Criteria) this;
        }

        public Criteria andBorrowPriceGreaterThan(BigDecimal value) {
            addCriterion("borrow_price >", value, "borrowPrice");
            return (Criteria) this;
        }

        public Criteria andBorrowPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_price >=", value, "borrowPrice");
            return (Criteria) this;
        }

        public Criteria andBorrowPriceLessThan(BigDecimal value) {
            addCriterion("borrow_price <", value, "borrowPrice");
            return (Criteria) this;
        }

        public Criteria andBorrowPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_price <=", value, "borrowPrice");
            return (Criteria) this;
        }

        public Criteria andBorrowPriceIn(List<BigDecimal> values) {
            addCriterion("borrow_price in", values, "borrowPrice");
            return (Criteria) this;
        }

        public Criteria andBorrowPriceNotIn(List<BigDecimal> values) {
            addCriterion("borrow_price not in", values, "borrowPrice");
            return (Criteria) this;
        }

        public Criteria andBorrowPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_price between", value1, value2, "borrowPrice");
            return (Criteria) this;
        }

        public Criteria andBorrowPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_price not between", value1, value2, "borrowPrice");
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