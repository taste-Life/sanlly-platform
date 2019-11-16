package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareLaborStockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareLaborStockExample() {
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

        public Criteria andWareLaborStockIdIsNull() {
            addCriterion("ware_labor_stock_id is null");
            return (Criteria) this;
        }

        public Criteria andWareLaborStockIdIsNotNull() {
            addCriterion("ware_labor_stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareLaborStockIdEqualTo(Integer value) {
            addCriterion("ware_labor_stock_id =", value, "wareLaborStockId");
            return (Criteria) this;
        }

        public Criteria andWareLaborStockIdNotEqualTo(Integer value) {
            addCriterion("ware_labor_stock_id <>", value, "wareLaborStockId");
            return (Criteria) this;
        }

        public Criteria andWareLaborStockIdGreaterThan(Integer value) {
            addCriterion("ware_labor_stock_id >", value, "wareLaborStockId");
            return (Criteria) this;
        }

        public Criteria andWareLaborStockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_labor_stock_id >=", value, "wareLaborStockId");
            return (Criteria) this;
        }

        public Criteria andWareLaborStockIdLessThan(Integer value) {
            addCriterion("ware_labor_stock_id <", value, "wareLaborStockId");
            return (Criteria) this;
        }

        public Criteria andWareLaborStockIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_labor_stock_id <=", value, "wareLaborStockId");
            return (Criteria) this;
        }

        public Criteria andWareLaborStockIdIn(List<Integer> values) {
            addCriterion("ware_labor_stock_id in", values, "wareLaborStockId");
            return (Criteria) this;
        }

        public Criteria andWareLaborStockIdNotIn(List<Integer> values) {
            addCriterion("ware_labor_stock_id not in", values, "wareLaborStockId");
            return (Criteria) this;
        }

        public Criteria andWareLaborStockIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_labor_stock_id between", value1, value2, "wareLaborStockId");
            return (Criteria) this;
        }

        public Criteria andWareLaborStockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_labor_stock_id not between", value1, value2, "wareLaborStockId");
            return (Criteria) this;
        }

        public Criteria andLaborStockNoIsNull() {
            addCriterion("labor_stock_no is null");
            return (Criteria) this;
        }

        public Criteria andLaborStockNoIsNotNull() {
            addCriterion("labor_stock_no is not null");
            return (Criteria) this;
        }

        public Criteria andLaborStockNoEqualTo(String value) {
            addCriterion("labor_stock_no =", value, "laborStockNo");
            return (Criteria) this;
        }

        public Criteria andLaborStockNoNotEqualTo(String value) {
            addCriterion("labor_stock_no <>", value, "laborStockNo");
            return (Criteria) this;
        }

        public Criteria andLaborStockNoGreaterThan(String value) {
            addCriterion("labor_stock_no >", value, "laborStockNo");
            return (Criteria) this;
        }

        public Criteria andLaborStockNoGreaterThanOrEqualTo(String value) {
            addCriterion("labor_stock_no >=", value, "laborStockNo");
            return (Criteria) this;
        }

        public Criteria andLaborStockNoLessThan(String value) {
            addCriterion("labor_stock_no <", value, "laborStockNo");
            return (Criteria) this;
        }

        public Criteria andLaborStockNoLessThanOrEqualTo(String value) {
            addCriterion("labor_stock_no <=", value, "laborStockNo");
            return (Criteria) this;
        }

        public Criteria andLaborStockNoLike(String value) {
            addCriterion("labor_stock_no like", value, "laborStockNo");
            return (Criteria) this;
        }

        public Criteria andLaborStockNoNotLike(String value) {
            addCriterion("labor_stock_no not like", value, "laborStockNo");
            return (Criteria) this;
        }

        public Criteria andLaborStockNoIn(List<String> values) {
            addCriterion("labor_stock_no in", values, "laborStockNo");
            return (Criteria) this;
        }

        public Criteria andLaborStockNoNotIn(List<String> values) {
            addCriterion("labor_stock_no not in", values, "laborStockNo");
            return (Criteria) this;
        }

        public Criteria andLaborStockNoBetween(String value1, String value2) {
            addCriterion("labor_stock_no between", value1, value2, "laborStockNo");
            return (Criteria) this;
        }

        public Criteria andLaborStockNoNotBetween(String value1, String value2) {
            addCriterion("labor_stock_no not between", value1, value2, "laborStockNo");
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

        public Criteria andStorageLocationIsNull() {
            addCriterion("storage_location is null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationIsNotNull() {
            addCriterion("storage_location is not null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationEqualTo(String value) {
            addCriterion("storage_location =", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotEqualTo(String value) {
            addCriterion("storage_location <>", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationGreaterThan(String value) {
            addCriterion("storage_location >", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationGreaterThanOrEqualTo(String value) {
            addCriterion("storage_location >=", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLessThan(String value) {
            addCriterion("storage_location <", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLessThanOrEqualTo(String value) {
            addCriterion("storage_location <=", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLike(String value) {
            addCriterion("storage_location like", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotLike(String value) {
            addCriterion("storage_location not like", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationIn(List<String> values) {
            addCriterion("storage_location in", values, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotIn(List<String> values) {
            addCriterion("storage_location not in", values, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationBetween(String value1, String value2) {
            addCriterion("storage_location between", value1, value2, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotBetween(String value1, String value2) {
            addCriterion("storage_location not between", value1, value2, "storageLocation");
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

        public Criteria andSparePartsCodeIsNull() {
            addCriterion("spare_parts_code is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsCodeIsNotNull() {
            addCriterion("spare_parts_code is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsCodeEqualTo(String value) {
            addCriterion("spare_parts_code =", value, "sparePartsCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsCodeNotEqualTo(String value) {
            addCriterion("spare_parts_code <>", value, "sparePartsCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsCodeGreaterThan(String value) {
            addCriterion("spare_parts_code >", value, "sparePartsCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_code >=", value, "sparePartsCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsCodeLessThan(String value) {
            addCriterion("spare_parts_code <", value, "sparePartsCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsCodeLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_code <=", value, "sparePartsCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsCodeLike(String value) {
            addCriterion("spare_parts_code like", value, "sparePartsCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsCodeNotLike(String value) {
            addCriterion("spare_parts_code not like", value, "sparePartsCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsCodeIn(List<String> values) {
            addCriterion("spare_parts_code in", values, "sparePartsCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsCodeNotIn(List<String> values) {
            addCriterion("spare_parts_code not in", values, "sparePartsCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsCodeBetween(String value1, String value2) {
            addCriterion("spare_parts_code between", value1, value2, "sparePartsCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsCodeNotBetween(String value1, String value2) {
            addCriterion("spare_parts_code not between", value1, value2, "sparePartsCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalCodeIsNull() {
            addCriterion("spare_parts_original_code is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalCodeIsNotNull() {
            addCriterion("spare_parts_original_code is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalCodeEqualTo(String value) {
            addCriterion("spare_parts_original_code =", value, "sparePartsOriginalCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalCodeNotEqualTo(String value) {
            addCriterion("spare_parts_original_code <>", value, "sparePartsOriginalCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalCodeGreaterThan(String value) {
            addCriterion("spare_parts_original_code >", value, "sparePartsOriginalCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_original_code >=", value, "sparePartsOriginalCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalCodeLessThan(String value) {
            addCriterion("spare_parts_original_code <", value, "sparePartsOriginalCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalCodeLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_original_code <=", value, "sparePartsOriginalCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalCodeLike(String value) {
            addCriterion("spare_parts_original_code like", value, "sparePartsOriginalCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalCodeNotLike(String value) {
            addCriterion("spare_parts_original_code not like", value, "sparePartsOriginalCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalCodeIn(List<String> values) {
            addCriterion("spare_parts_original_code in", values, "sparePartsOriginalCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalCodeNotIn(List<String> values) {
            addCriterion("spare_parts_original_code not in", values, "sparePartsOriginalCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalCodeBetween(String value1, String value2) {
            addCriterion("spare_parts_original_code between", value1, value2, "sparePartsOriginalCode");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalCodeNotBetween(String value1, String value2) {
            addCriterion("spare_parts_original_code not between", value1, value2, "sparePartsOriginalCode");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthIsNull() {
            addCriterion("stockout_restrict_month is null");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthIsNotNull() {
            addCriterion("stockout_restrict_month is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthEqualTo(String value) {
            addCriterion("stockout_restrict_month =", value, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthNotEqualTo(String value) {
            addCriterion("stockout_restrict_month <>", value, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthGreaterThan(String value) {
            addCriterion("stockout_restrict_month >", value, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthGreaterThanOrEqualTo(String value) {
            addCriterion("stockout_restrict_month >=", value, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthLessThan(String value) {
            addCriterion("stockout_restrict_month <", value, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthLessThanOrEqualTo(String value) {
            addCriterion("stockout_restrict_month <=", value, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthLike(String value) {
            addCriterion("stockout_restrict_month like", value, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthNotLike(String value) {
            addCriterion("stockout_restrict_month not like", value, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthIn(List<String> values) {
            addCriterion("stockout_restrict_month in", values, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthNotIn(List<String> values) {
            addCriterion("stockout_restrict_month not in", values, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthBetween(String value1, String value2) {
            addCriterion("stockout_restrict_month between", value1, value2, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andStockoutRestrictMonthNotBetween(String value1, String value2) {
            addCriterion("stockout_restrict_month not between", value1, value2, "stockoutRestrictMonth");
            return (Criteria) this;
        }

        public Criteria andDurableYearsIsNull() {
            addCriterion("durable_years is null");
            return (Criteria) this;
        }

        public Criteria andDurableYearsIsNotNull() {
            addCriterion("durable_years is not null");
            return (Criteria) this;
        }

        public Criteria andDurableYearsEqualTo(Integer value) {
            addCriterion("durable_years =", value, "durableYears");
            return (Criteria) this;
        }

        public Criteria andDurableYearsNotEqualTo(Integer value) {
            addCriterion("durable_years <>", value, "durableYears");
            return (Criteria) this;
        }

        public Criteria andDurableYearsGreaterThan(Integer value) {
            addCriterion("durable_years >", value, "durableYears");
            return (Criteria) this;
        }

        public Criteria andDurableYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("durable_years >=", value, "durableYears");
            return (Criteria) this;
        }

        public Criteria andDurableYearsLessThan(Integer value) {
            addCriterion("durable_years <", value, "durableYears");
            return (Criteria) this;
        }

        public Criteria andDurableYearsLessThanOrEqualTo(Integer value) {
            addCriterion("durable_years <=", value, "durableYears");
            return (Criteria) this;
        }

        public Criteria andDurableYearsIn(List<Integer> values) {
            addCriterion("durable_years in", values, "durableYears");
            return (Criteria) this;
        }

        public Criteria andDurableYearsNotIn(List<Integer> values) {
            addCriterion("durable_years not in", values, "durableYears");
            return (Criteria) this;
        }

        public Criteria andDurableYearsBetween(Integer value1, Integer value2) {
            addCriterion("durable_years between", value1, value2, "durableYears");
            return (Criteria) this;
        }

        public Criteria andDurableYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("durable_years not between", value1, value2, "durableYears");
            return (Criteria) this;
        }

        public Criteria andIsConsumableIsNull() {
            addCriterion("is_consumable is null");
            return (Criteria) this;
        }

        public Criteria andIsConsumableIsNotNull() {
            addCriterion("is_consumable is not null");
            return (Criteria) this;
        }

        public Criteria andIsConsumableEqualTo(String value) {
            addCriterion("is_consumable =", value, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableNotEqualTo(String value) {
            addCriterion("is_consumable <>", value, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableGreaterThan(String value) {
            addCriterion("is_consumable >", value, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableGreaterThanOrEqualTo(String value) {
            addCriterion("is_consumable >=", value, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableLessThan(String value) {
            addCriterion("is_consumable <", value, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableLessThanOrEqualTo(String value) {
            addCriterion("is_consumable <=", value, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableLike(String value) {
            addCriterion("is_consumable like", value, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableNotLike(String value) {
            addCriterion("is_consumable not like", value, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableIn(List<String> values) {
            addCriterion("is_consumable in", values, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableNotIn(List<String> values) {
            addCriterion("is_consumable not in", values, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableBetween(String value1, String value2) {
            addCriterion("is_consumable between", value1, value2, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andIsConsumableNotBetween(String value1, String value2) {
            addCriterion("is_consumable not between", value1, value2, "isConsumable");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andEntryNumIsNull() {
            addCriterion("entry_num is null");
            return (Criteria) this;
        }

        public Criteria andEntryNumIsNotNull() {
            addCriterion("entry_num is not null");
            return (Criteria) this;
        }

        public Criteria andEntryNumEqualTo(Double value) {
            addCriterion("entry_num =", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumNotEqualTo(Double value) {
            addCriterion("entry_num <>", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumGreaterThan(Double value) {
            addCriterion("entry_num >", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumGreaterThanOrEqualTo(Double value) {
            addCriterion("entry_num >=", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumLessThan(Double value) {
            addCriterion("entry_num <", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumLessThanOrEqualTo(Double value) {
            addCriterion("entry_num <=", value, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumIn(List<Double> values) {
            addCriterion("entry_num in", values, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumNotIn(List<Double> values) {
            addCriterion("entry_num not in", values, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumBetween(Double value1, Double value2) {
            addCriterion("entry_num between", value1, value2, "entryNum");
            return (Criteria) this;
        }

        public Criteria andEntryNumNotBetween(Double value1, Double value2) {
            addCriterion("entry_num not between", value1, value2, "entryNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumIsNull() {
            addCriterion("surplus_num is null");
            return (Criteria) this;
        }

        public Criteria andSurplusNumIsNotNull() {
            addCriterion("surplus_num is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusNumEqualTo(Double value) {
            addCriterion("surplus_num =", value, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumNotEqualTo(Double value) {
            addCriterion("surplus_num <>", value, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumGreaterThan(Double value) {
            addCriterion("surplus_num >", value, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumGreaterThanOrEqualTo(Double value) {
            addCriterion("surplus_num >=", value, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumLessThan(Double value) {
            addCriterion("surplus_num <", value, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumLessThanOrEqualTo(Double value) {
            addCriterion("surplus_num <=", value, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumIn(List<Double> values) {
            addCriterion("surplus_num in", values, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumNotIn(List<Double> values) {
            addCriterion("surplus_num not in", values, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumBetween(Double value1, Double value2) {
            addCriterion("surplus_num between", value1, value2, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumNotBetween(Double value1, Double value2) {
            addCriterion("surplus_num not between", value1, value2, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andActualSurplusNumIsNull() {
            addCriterion("actual_surplus_num is null");
            return (Criteria) this;
        }

        public Criteria andActualSurplusNumIsNotNull() {
            addCriterion("actual_surplus_num is not null");
            return (Criteria) this;
        }

        public Criteria andActualSurplusNumEqualTo(Double value) {
            addCriterion("actual_surplus_num =", value, "actualSurplusNum");
            return (Criteria) this;
        }

        public Criteria andActualSurplusNumNotEqualTo(Double value) {
            addCriterion("actual_surplus_num <>", value, "actualSurplusNum");
            return (Criteria) this;
        }

        public Criteria andActualSurplusNumGreaterThan(Double value) {
            addCriterion("actual_surplus_num >", value, "actualSurplusNum");
            return (Criteria) this;
        }

        public Criteria andActualSurplusNumGreaterThanOrEqualTo(Double value) {
            addCriterion("actual_surplus_num >=", value, "actualSurplusNum");
            return (Criteria) this;
        }

        public Criteria andActualSurplusNumLessThan(Double value) {
            addCriterion("actual_surplus_num <", value, "actualSurplusNum");
            return (Criteria) this;
        }

        public Criteria andActualSurplusNumLessThanOrEqualTo(Double value) {
            addCriterion("actual_surplus_num <=", value, "actualSurplusNum");
            return (Criteria) this;
        }

        public Criteria andActualSurplusNumIn(List<Double> values) {
            addCriterion("actual_surplus_num in", values, "actualSurplusNum");
            return (Criteria) this;
        }

        public Criteria andActualSurplusNumNotIn(List<Double> values) {
            addCriterion("actual_surplus_num not in", values, "actualSurplusNum");
            return (Criteria) this;
        }

        public Criteria andActualSurplusNumBetween(Double value1, Double value2) {
            addCriterion("actual_surplus_num between", value1, value2, "actualSurplusNum");
            return (Criteria) this;
        }

        public Criteria andActualSurplusNumNotBetween(Double value1, Double value2) {
            addCriterion("actual_surplus_num not between", value1, value2, "actualSurplusNum");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceIsNull() {
            addCriterion("invoice_price is null");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceIsNotNull() {
            addCriterion("invoice_price is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceEqualTo(BigDecimal value) {
            addCriterion("invoice_price =", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceNotEqualTo(BigDecimal value) {
            addCriterion("invoice_price <>", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceGreaterThan(BigDecimal value) {
            addCriterion("invoice_price >", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("invoice_price >=", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceLessThan(BigDecimal value) {
            addCriterion("invoice_price <", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("invoice_price <=", value, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceIn(List<BigDecimal> values) {
            addCriterion("invoice_price in", values, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceNotIn(List<BigDecimal> values) {
            addCriterion("invoice_price not in", values, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoice_price between", value1, value2, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andInvoicePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoice_price not between", value1, value2, "invoicePrice");
            return (Criteria) this;
        }

        public Criteria andCoreIsNull() {
            addCriterion("core is null");
            return (Criteria) this;
        }

        public Criteria andCoreIsNotNull() {
            addCriterion("core is not null");
            return (Criteria) this;
        }

        public Criteria andCoreEqualTo(BigDecimal value) {
            addCriterion("core =", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreNotEqualTo(BigDecimal value) {
            addCriterion("core <>", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreGreaterThan(BigDecimal value) {
            addCriterion("core >", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("core >=", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreLessThan(BigDecimal value) {
            addCriterion("core <", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("core <=", value, "core");
            return (Criteria) this;
        }

        public Criteria andCoreIn(List<BigDecimal> values) {
            addCriterion("core in", values, "core");
            return (Criteria) this;
        }

        public Criteria andCoreNotIn(List<BigDecimal> values) {
            addCriterion("core not in", values, "core");
            return (Criteria) this;
        }

        public Criteria andCoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("core between", value1, value2, "core");
            return (Criteria) this;
        }

        public Criteria andCoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("core not between", value1, value2, "core");
            return (Criteria) this;
        }

        public Criteria andVatIsNull() {
            addCriterion("vat is null");
            return (Criteria) this;
        }

        public Criteria andVatIsNotNull() {
            addCriterion("vat is not null");
            return (Criteria) this;
        }

        public Criteria andVatEqualTo(BigDecimal value) {
            addCriterion("vat =", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatNotEqualTo(BigDecimal value) {
            addCriterion("vat <>", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatGreaterThan(BigDecimal value) {
            addCriterion("vat >", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vat >=", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatLessThan(BigDecimal value) {
            addCriterion("vat <", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vat <=", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatIn(List<BigDecimal> values) {
            addCriterion("vat in", values, "vat");
            return (Criteria) this;
        }

        public Criteria andVatNotIn(List<BigDecimal> values) {
            addCriterion("vat not in", values, "vat");
            return (Criteria) this;
        }

        public Criteria andVatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vat between", value1, value2, "vat");
            return (Criteria) this;
        }

        public Criteria andVatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vat not between", value1, value2, "vat");
            return (Criteria) this;
        }

        public Criteria andTariffStatusIsNull() {
            addCriterion("tariff_status is null");
            return (Criteria) this;
        }

        public Criteria andTariffStatusIsNotNull() {
            addCriterion("tariff_status is not null");
            return (Criteria) this;
        }

        public Criteria andTariffStatusEqualTo(String value) {
            addCriterion("tariff_status =", value, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusNotEqualTo(String value) {
            addCriterion("tariff_status <>", value, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusGreaterThan(String value) {
            addCriterion("tariff_status >", value, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusGreaterThanOrEqualTo(String value) {
            addCriterion("tariff_status >=", value, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusLessThan(String value) {
            addCriterion("tariff_status <", value, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusLessThanOrEqualTo(String value) {
            addCriterion("tariff_status <=", value, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusLike(String value) {
            addCriterion("tariff_status like", value, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusNotLike(String value) {
            addCriterion("tariff_status not like", value, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusIn(List<String> values) {
            addCriterion("tariff_status in", values, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusNotIn(List<String> values) {
            addCriterion("tariff_status not in", values, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusBetween(String value1, String value2) {
            addCriterion("tariff_status between", value1, value2, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffStatusNotBetween(String value1, String value2) {
            addCriterion("tariff_status not between", value1, value2, "tariffStatus");
            return (Criteria) this;
        }

        public Criteria andTariffIsNull() {
            addCriterion("tariff is null");
            return (Criteria) this;
        }

        public Criteria andTariffIsNotNull() {
            addCriterion("tariff is not null");
            return (Criteria) this;
        }

        public Criteria andTariffEqualTo(BigDecimal value) {
            addCriterion("tariff =", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffNotEqualTo(BigDecimal value) {
            addCriterion("tariff <>", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffGreaterThan(BigDecimal value) {
            addCriterion("tariff >", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tariff >=", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffLessThan(BigDecimal value) {
            addCriterion("tariff <", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tariff <=", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffIn(List<BigDecimal> values) {
            addCriterion("tariff in", values, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffNotIn(List<BigDecimal> values) {
            addCriterion("tariff not in", values, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tariff between", value1, value2, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tariff not between", value1, value2, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffNoIsNull() {
            addCriterion("tariff_no is null");
            return (Criteria) this;
        }

        public Criteria andTariffNoIsNotNull() {
            addCriterion("tariff_no is not null");
            return (Criteria) this;
        }

        public Criteria andTariffNoEqualTo(String value) {
            addCriterion("tariff_no =", value, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoNotEqualTo(String value) {
            addCriterion("tariff_no <>", value, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoGreaterThan(String value) {
            addCriterion("tariff_no >", value, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoGreaterThanOrEqualTo(String value) {
            addCriterion("tariff_no >=", value, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoLessThan(String value) {
            addCriterion("tariff_no <", value, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoLessThanOrEqualTo(String value) {
            addCriterion("tariff_no <=", value, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoLike(String value) {
            addCriterion("tariff_no like", value, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoNotLike(String value) {
            addCriterion("tariff_no not like", value, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoIn(List<String> values) {
            addCriterion("tariff_no in", values, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoNotIn(List<String> values) {
            addCriterion("tariff_no not in", values, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoBetween(String value1, String value2) {
            addCriterion("tariff_no between", value1, value2, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffNoNotBetween(String value1, String value2) {
            addCriterion("tariff_no not between", value1, value2, "tariffNo");
            return (Criteria) this;
        }

        public Criteria andTariffDateIsNull() {
            addCriterion("tariff_date is null");
            return (Criteria) this;
        }

        public Criteria andTariffDateIsNotNull() {
            addCriterion("tariff_date is not null");
            return (Criteria) this;
        }

        public Criteria andTariffDateEqualTo(Date value) {
            addCriterion("tariff_date =", value, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andTariffDateNotEqualTo(Date value) {
            addCriterion("tariff_date <>", value, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andTariffDateGreaterThan(Date value) {
            addCriterion("tariff_date >", value, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andTariffDateGreaterThanOrEqualTo(Date value) {
            addCriterion("tariff_date >=", value, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andTariffDateLessThan(Date value) {
            addCriterion("tariff_date <", value, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andTariffDateLessThanOrEqualTo(Date value) {
            addCriterion("tariff_date <=", value, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andTariffDateIn(List<Date> values) {
            addCriterion("tariff_date in", values, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andTariffDateNotIn(List<Date> values) {
            addCriterion("tariff_date not in", values, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andTariffDateBetween(Date value1, Date value2) {
            addCriterion("tariff_date between", value1, value2, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andTariffDateNotBetween(Date value1, Date value2) {
            addCriterion("tariff_date not between", value1, value2, "tariffDate");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(BigDecimal value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(BigDecimal value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(BigDecimal value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(BigDecimal value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<BigDecimal> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<BigDecimal> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(BigDecimal value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(BigDecimal value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<BigDecimal> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateIsNull() {
            addCriterion("old_stockin_date is null");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateIsNotNull() {
            addCriterion("old_stockin_date is not null");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateEqualTo(Date value) {
            addCriterion("old_stockin_date =", value, "oldStockinDate");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateNotEqualTo(Date value) {
            addCriterion("old_stockin_date <>", value, "oldStockinDate");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateGreaterThan(Date value) {
            addCriterion("old_stockin_date >", value, "oldStockinDate");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateGreaterThanOrEqualTo(Date value) {
            addCriterion("old_stockin_date >=", value, "oldStockinDate");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateLessThan(Date value) {
            addCriterion("old_stockin_date <", value, "oldStockinDate");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateLessThanOrEqualTo(Date value) {
            addCriterion("old_stockin_date <=", value, "oldStockinDate");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateIn(List<Date> values) {
            addCriterion("old_stockin_date in", values, "oldStockinDate");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateNotIn(List<Date> values) {
            addCriterion("old_stockin_date not in", values, "oldStockinDate");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateBetween(Date value1, Date value2) {
            addCriterion("old_stockin_date between", value1, value2, "oldStockinDate");
            return (Criteria) this;
        }

        public Criteria andOldStockinDateNotBetween(Date value1, Date value2) {
            addCriterion("old_stockin_date not between", value1, value2, "oldStockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateIsNull() {
            addCriterion("stockin_date is null");
            return (Criteria) this;
        }

        public Criteria andStockinDateIsNotNull() {
            addCriterion("stockin_date is not null");
            return (Criteria) this;
        }

        public Criteria andStockinDateEqualTo(Date value) {
            addCriterion("stockin_date =", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateNotEqualTo(Date value) {
            addCriterion("stockin_date <>", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateGreaterThan(Date value) {
            addCriterion("stockin_date >", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateGreaterThanOrEqualTo(Date value) {
            addCriterion("stockin_date >=", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateLessThan(Date value) {
            addCriterion("stockin_date <", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateLessThanOrEqualTo(Date value) {
            addCriterion("stockin_date <=", value, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateIn(List<Date> values) {
            addCriterion("stockin_date in", values, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateNotIn(List<Date> values) {
            addCriterion("stockin_date not in", values, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateBetween(Date value1, Date value2) {
            addCriterion("stockin_date between", value1, value2, "stockinDate");
            return (Criteria) this;
        }

        public Criteria andStockinDateNotBetween(Date value1, Date value2) {
            addCriterion("stockin_date not between", value1, value2, "stockinDate");
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