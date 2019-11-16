package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareStockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareStockExample() {
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

        public Criteria andWareStockIdIsNull() {
            addCriterion("ware_stock_id is null");
            return (Criteria) this;
        }

        public Criteria andWareStockIdIsNotNull() {
            addCriterion("ware_stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareStockIdEqualTo(Integer value) {
            addCriterion("ware_stock_id =", value, "wareStockId");
            return (Criteria) this;
        }

        public Criteria andWareStockIdNotEqualTo(Integer value) {
            addCriterion("ware_stock_id <>", value, "wareStockId");
            return (Criteria) this;
        }

        public Criteria andWareStockIdGreaterThan(Integer value) {
            addCriterion("ware_stock_id >", value, "wareStockId");
            return (Criteria) this;
        }

        public Criteria andWareStockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_stock_id >=", value, "wareStockId");
            return (Criteria) this;
        }

        public Criteria andWareStockIdLessThan(Integer value) {
            addCriterion("ware_stock_id <", value, "wareStockId");
            return (Criteria) this;
        }

        public Criteria andWareStockIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_stock_id <=", value, "wareStockId");
            return (Criteria) this;
        }

        public Criteria andWareStockIdIn(List<Integer> values) {
            addCriterion("ware_stock_id in", values, "wareStockId");
            return (Criteria) this;
        }

        public Criteria andWareStockIdNotIn(List<Integer> values) {
            addCriterion("ware_stock_id not in", values, "wareStockId");
            return (Criteria) this;
        }

        public Criteria andWareStockIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_stock_id between", value1, value2, "wareStockId");
            return (Criteria) this;
        }

        public Criteria andWareStockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_stock_id not between", value1, value2, "wareStockId");
            return (Criteria) this;
        }

        public Criteria andStockinNoIsNull() {
            addCriterion("stockin_no is null");
            return (Criteria) this;
        }

        public Criteria andStockinNoIsNotNull() {
            addCriterion("stockin_no is not null");
            return (Criteria) this;
        }

        public Criteria andStockinNoEqualTo(String value) {
            addCriterion("stockin_no =", value, "stockinNo");
            return (Criteria) this;
        }

        public Criteria andStockinNoNotEqualTo(String value) {
            addCriterion("stockin_no <>", value, "stockinNo");
            return (Criteria) this;
        }

        public Criteria andStockinNoGreaterThan(String value) {
            addCriterion("stockin_no >", value, "stockinNo");
            return (Criteria) this;
        }

        public Criteria andStockinNoGreaterThanOrEqualTo(String value) {
            addCriterion("stockin_no >=", value, "stockinNo");
            return (Criteria) this;
        }

        public Criteria andStockinNoLessThan(String value) {
            addCriterion("stockin_no <", value, "stockinNo");
            return (Criteria) this;
        }

        public Criteria andStockinNoLessThanOrEqualTo(String value) {
            addCriterion("stockin_no <=", value, "stockinNo");
            return (Criteria) this;
        }

        public Criteria andStockinNoLike(String value) {
            addCriterion("stockin_no like", value, "stockinNo");
            return (Criteria) this;
        }

        public Criteria andStockinNoNotLike(String value) {
            addCriterion("stockin_no not like", value, "stockinNo");
            return (Criteria) this;
        }

        public Criteria andStockinNoIn(List<String> values) {
            addCriterion("stockin_no in", values, "stockinNo");
            return (Criteria) this;
        }

        public Criteria andStockinNoNotIn(List<String> values) {
            addCriterion("stockin_no not in", values, "stockinNo");
            return (Criteria) this;
        }

        public Criteria andStockinNoBetween(String value1, String value2) {
            addCriterion("stockin_no between", value1, value2, "stockinNo");
            return (Criteria) this;
        }

        public Criteria andStockinNoNotBetween(String value1, String value2) {
            addCriterion("stockin_no not between", value1, value2, "stockinNo");
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

        public Criteria andSparePartsNoIsNull() {
            addCriterion("spare_parts_no is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoIsNotNull() {
            addCriterion("spare_parts_no is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoEqualTo(String value) {
            addCriterion("spare_parts_no =", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoNotEqualTo(String value) {
            addCriterion("spare_parts_no <>", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoGreaterThan(String value) {
            addCriterion("spare_parts_no >", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_no >=", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoLessThan(String value) {
            addCriterion("spare_parts_no <", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_no <=", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoLike(String value) {
            addCriterion("spare_parts_no like", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoNotLike(String value) {
            addCriterion("spare_parts_no not like", value, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoIn(List<String> values) {
            addCriterion("spare_parts_no in", values, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoNotIn(List<String> values) {
            addCriterion("spare_parts_no not in", values, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoBetween(String value1, String value2) {
            addCriterion("spare_parts_no between", value1, value2, "sparePartsNo");
            return (Criteria) this;
        }

        public Criteria andSparePartsNoNotBetween(String value1, String value2) {
            addCriterion("spare_parts_no not between", value1, value2, "sparePartsNo");
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

        public Criteria andSparePartsUnitIsNull() {
            addCriterion("spare_parts_unit is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitIsNotNull() {
            addCriterion("spare_parts_unit is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitEqualTo(String value) {
            addCriterion("spare_parts_unit =", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitNotEqualTo(String value) {
            addCriterion("spare_parts_unit <>", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitGreaterThan(String value) {
            addCriterion("spare_parts_unit >", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_unit >=", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitLessThan(String value) {
            addCriterion("spare_parts_unit <", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_unit <=", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitLike(String value) {
            addCriterion("spare_parts_unit like", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitNotLike(String value) {
            addCriterion("spare_parts_unit not like", value, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitIn(List<String> values) {
            addCriterion("spare_parts_unit in", values, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitNotIn(List<String> values) {
            addCriterion("spare_parts_unit not in", values, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitBetween(String value1, String value2) {
            addCriterion("spare_parts_unit between", value1, value2, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andSparePartsUnitNotBetween(String value1, String value2) {
            addCriterion("spare_parts_unit not between", value1, value2, "sparePartsUnit");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("`length` is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("`length` is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Double value) {
            addCriterion("`length` =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Double value) {
            addCriterion("`length` <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Double value) {
            addCriterion("`length` >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Double value) {
            addCriterion("`length` >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Double value) {
            addCriterion("`length` <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Double value) {
            addCriterion("`length` <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Double> values) {
            addCriterion("`length` in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Double> values) {
            addCriterion("`length` not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Double value1, Double value2) {
            addCriterion("`length` between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Double value1, Double value2) {
            addCriterion("`length` not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Double value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Double value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Double value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Double value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Double value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Double value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Double> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Double> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Double value1, Double value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Double value1, Double value2) {
            addCriterion("width not between", value1, value2, "width");
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

        public Criteria andSparePartsOriginalBatchIsNull() {
            addCriterion("spare_parts_original_batch is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchIsNotNull() {
            addCriterion("spare_parts_original_batch is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchEqualTo(String value) {
            addCriterion("spare_parts_original_batch =", value, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchNotEqualTo(String value) {
            addCriterion("spare_parts_original_batch <>", value, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchGreaterThan(String value) {
            addCriterion("spare_parts_original_batch >", value, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_original_batch >=", value, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchLessThan(String value) {
            addCriterion("spare_parts_original_batch <", value, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_original_batch <=", value, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchLike(String value) {
            addCriterion("spare_parts_original_batch like", value, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchNotLike(String value) {
            addCriterion("spare_parts_original_batch not like", value, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchIn(List<String> values) {
            addCriterion("spare_parts_original_batch in", values, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchNotIn(List<String> values) {
            addCriterion("spare_parts_original_batch not in", values, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchBetween(String value1, String value2) {
            addCriterion("spare_parts_original_batch between", value1, value2, "sparePartsOriginalBatch");
            return (Criteria) this;
        }

        public Criteria andSparePartsOriginalBatchNotBetween(String value1, String value2) {
            addCriterion("spare_parts_original_batch not between", value1, value2, "sparePartsOriginalBatch");
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

        public Criteria andOriginalAreaIsNull() {
            addCriterion("original_area is null");
            return (Criteria) this;
        }

        public Criteria andOriginalAreaIsNotNull() {
            addCriterion("original_area is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalAreaEqualTo(Double value) {
            addCriterion("original_area =", value, "originalArea");
            return (Criteria) this;
        }

        public Criteria andOriginalAreaNotEqualTo(Double value) {
            addCriterion("original_area <>", value, "originalArea");
            return (Criteria) this;
        }

        public Criteria andOriginalAreaGreaterThan(Double value) {
            addCriterion("original_area >", value, "originalArea");
            return (Criteria) this;
        }

        public Criteria andOriginalAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("original_area >=", value, "originalArea");
            return (Criteria) this;
        }

        public Criteria andOriginalAreaLessThan(Double value) {
            addCriterion("original_area <", value, "originalArea");
            return (Criteria) this;
        }

        public Criteria andOriginalAreaLessThanOrEqualTo(Double value) {
            addCriterion("original_area <=", value, "originalArea");
            return (Criteria) this;
        }

        public Criteria andOriginalAreaIn(List<Double> values) {
            addCriterion("original_area in", values, "originalArea");
            return (Criteria) this;
        }

        public Criteria andOriginalAreaNotIn(List<Double> values) {
            addCriterion("original_area not in", values, "originalArea");
            return (Criteria) this;
        }

        public Criteria andOriginalAreaBetween(Double value1, Double value2) {
            addCriterion("original_area between", value1, value2, "originalArea");
            return (Criteria) this;
        }

        public Criteria andOriginalAreaNotBetween(Double value1, Double value2) {
            addCriterion("original_area not between", value1, value2, "originalArea");
            return (Criteria) this;
        }

        public Criteria andSurplusAreaIsNull() {
            addCriterion("surplus_area is null");
            return (Criteria) this;
        }

        public Criteria andSurplusAreaIsNotNull() {
            addCriterion("surplus_area is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusAreaEqualTo(Double value) {
            addCriterion("surplus_area =", value, "surplusArea");
            return (Criteria) this;
        }

        public Criteria andSurplusAreaNotEqualTo(Double value) {
            addCriterion("surplus_area <>", value, "surplusArea");
            return (Criteria) this;
        }

        public Criteria andSurplusAreaGreaterThan(Double value) {
            addCriterion("surplus_area >", value, "surplusArea");
            return (Criteria) this;
        }

        public Criteria andSurplusAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("surplus_area >=", value, "surplusArea");
            return (Criteria) this;
        }

        public Criteria andSurplusAreaLessThan(Double value) {
            addCriterion("surplus_area <", value, "surplusArea");
            return (Criteria) this;
        }

        public Criteria andSurplusAreaLessThanOrEqualTo(Double value) {
            addCriterion("surplus_area <=", value, "surplusArea");
            return (Criteria) this;
        }

        public Criteria andSurplusAreaIn(List<Double> values) {
            addCriterion("surplus_area in", values, "surplusArea");
            return (Criteria) this;
        }

        public Criteria andSurplusAreaNotIn(List<Double> values) {
            addCriterion("surplus_area not in", values, "surplusArea");
            return (Criteria) this;
        }

        public Criteria andSurplusAreaBetween(Double value1, Double value2) {
            addCriterion("surplus_area between", value1, value2, "surplusArea");
            return (Criteria) this;
        }

        public Criteria andSurplusAreaNotBetween(Double value1, Double value2) {
            addCriterion("surplus_area not between", value1, value2, "surplusArea");
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

        public Criteria andSparePartsNameIsNull() {
            addCriterion("spare_parts_name is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameIsNotNull() {
            addCriterion("spare_parts_name is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameEqualTo(String value) {
            addCriterion("spare_parts_name =", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameNotEqualTo(String value) {
            addCriterion("spare_parts_name <>", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameGreaterThan(String value) {
            addCriterion("spare_parts_name >", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_name >=", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameLessThan(String value) {
            addCriterion("spare_parts_name <", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_name <=", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameLike(String value) {
            addCriterion("spare_parts_name like", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameNotLike(String value) {
            addCriterion("spare_parts_name not like", value, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameIn(List<String> values) {
            addCriterion("spare_parts_name in", values, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameNotIn(List<String> values) {
            addCriterion("spare_parts_name not in", values, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameBetween(String value1, String value2) {
            addCriterion("spare_parts_name between", value1, value2, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsNameNotBetween(String value1, String value2) {
            addCriterion("spare_parts_name not between", value1, value2, "sparePartsName");
            return (Criteria) this;
        }

        public Criteria andSparePartsTypeIsNull() {
            addCriterion("spare_parts_type is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsTypeIsNotNull() {
            addCriterion("spare_parts_type is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsTypeEqualTo(String value) {
            addCriterion("spare_parts_type =", value, "sparePartsType");
            return (Criteria) this;
        }

        public Criteria andSparePartsTypeNotEqualTo(String value) {
            addCriterion("spare_parts_type <>", value, "sparePartsType");
            return (Criteria) this;
        }

        public Criteria andSparePartsTypeGreaterThan(String value) {
            addCriterion("spare_parts_type >", value, "sparePartsType");
            return (Criteria) this;
        }

        public Criteria andSparePartsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_type >=", value, "sparePartsType");
            return (Criteria) this;
        }

        public Criteria andSparePartsTypeLessThan(String value) {
            addCriterion("spare_parts_type <", value, "sparePartsType");
            return (Criteria) this;
        }

        public Criteria andSparePartsTypeLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_type <=", value, "sparePartsType");
            return (Criteria) this;
        }

        public Criteria andSparePartsTypeLike(String value) {
            addCriterion("spare_parts_type like", value, "sparePartsType");
            return (Criteria) this;
        }

        public Criteria andSparePartsTypeNotLike(String value) {
            addCriterion("spare_parts_type not like", value, "sparePartsType");
            return (Criteria) this;
        }

        public Criteria andSparePartsTypeIn(List<String> values) {
            addCriterion("spare_parts_type in", values, "sparePartsType");
            return (Criteria) this;
        }

        public Criteria andSparePartsTypeNotIn(List<String> values) {
            addCriterion("spare_parts_type not in", values, "sparePartsType");
            return (Criteria) this;
        }

        public Criteria andSparePartsTypeBetween(String value1, String value2) {
            addCriterion("spare_parts_type between", value1, value2, "sparePartsType");
            return (Criteria) this;
        }

        public Criteria andSparePartsTypeNotBetween(String value1, String value2) {
            addCriterion("spare_parts_type not between", value1, value2, "sparePartsType");
            return (Criteria) this;
        }

        public Criteria andSuffixIsNull() {
            addCriterion("suffix is null");
            return (Criteria) this;
        }

        public Criteria andSuffixIsNotNull() {
            addCriterion("suffix is not null");
            return (Criteria) this;
        }

        public Criteria andSuffixEqualTo(String value) {
            addCriterion("suffix =", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotEqualTo(String value) {
            addCriterion("suffix <>", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixGreaterThan(String value) {
            addCriterion("suffix >", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("suffix >=", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixLessThan(String value) {
            addCriterion("suffix <", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixLessThanOrEqualTo(String value) {
            addCriterion("suffix <=", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixLike(String value) {
            addCriterion("suffix like", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotLike(String value) {
            addCriterion("suffix not like", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixIn(List<String> values) {
            addCriterion("suffix in", values, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotIn(List<String> values) {
            addCriterion("suffix not in", values, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixBetween(String value1, String value2) {
            addCriterion("suffix between", value1, value2, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotBetween(String value1, String value2) {
            addCriterion("suffix not between", value1, value2, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNoIsNull() {
            addCriterion("suffix_no is null");
            return (Criteria) this;
        }

        public Criteria andSuffixNoIsNotNull() {
            addCriterion("suffix_no is not null");
            return (Criteria) this;
        }

        public Criteria andSuffixNoEqualTo(String value) {
            addCriterion("suffix_no =", value, "suffixNo");
            return (Criteria) this;
        }

        public Criteria andSuffixNoNotEqualTo(String value) {
            addCriterion("suffix_no <>", value, "suffixNo");
            return (Criteria) this;
        }

        public Criteria andSuffixNoGreaterThan(String value) {
            addCriterion("suffix_no >", value, "suffixNo");
            return (Criteria) this;
        }

        public Criteria andSuffixNoGreaterThanOrEqualTo(String value) {
            addCriterion("suffix_no >=", value, "suffixNo");
            return (Criteria) this;
        }

        public Criteria andSuffixNoLessThan(String value) {
            addCriterion("suffix_no <", value, "suffixNo");
            return (Criteria) this;
        }

        public Criteria andSuffixNoLessThanOrEqualTo(String value) {
            addCriterion("suffix_no <=", value, "suffixNo");
            return (Criteria) this;
        }

        public Criteria andSuffixNoLike(String value) {
            addCriterion("suffix_no like", value, "suffixNo");
            return (Criteria) this;
        }

        public Criteria andSuffixNoNotLike(String value) {
            addCriterion("suffix_no not like", value, "suffixNo");
            return (Criteria) this;
        }

        public Criteria andSuffixNoIn(List<String> values) {
            addCriterion("suffix_no in", values, "suffixNo");
            return (Criteria) this;
        }

        public Criteria andSuffixNoNotIn(List<String> values) {
            addCriterion("suffix_no not in", values, "suffixNo");
            return (Criteria) this;
        }

        public Criteria andSuffixNoBetween(String value1, String value2) {
            addCriterion("suffix_no between", value1, value2, "suffixNo");
            return (Criteria) this;
        }

        public Criteria andSuffixNoNotBetween(String value1, String value2) {
            addCriterion("suffix_no not between", value1, value2, "suffixNo");
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