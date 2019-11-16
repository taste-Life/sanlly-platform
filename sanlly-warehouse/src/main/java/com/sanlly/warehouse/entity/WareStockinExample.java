package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareStockinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareStockinExample() {
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

        public Criteria andWareStockinIdIsNull() {
            addCriterion("ware_stockin_id is null");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdIsNotNull() {
            addCriterion("ware_stockin_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdEqualTo(Integer value) {
            addCriterion("ware_stockin_id =", value, "wareStockinId");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdNotEqualTo(Integer value) {
            addCriterion("ware_stockin_id <>", value, "wareStockinId");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdGreaterThan(Integer value) {
            addCriterion("ware_stockin_id >", value, "wareStockinId");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_stockin_id >=", value, "wareStockinId");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdLessThan(Integer value) {
            addCriterion("ware_stockin_id <", value, "wareStockinId");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_stockin_id <=", value, "wareStockinId");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdIn(List<Integer> values) {
            addCriterion("ware_stockin_id in", values, "wareStockinId");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdNotIn(List<Integer> values) {
            addCriterion("ware_stockin_id not in", values, "wareStockinId");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_stockin_id between", value1, value2, "wareStockinId");
            return (Criteria) this;
        }

        public Criteria andWareStockinIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_stockin_id not between", value1, value2, "wareStockinId");
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

        public Criteria andPurchaseUserIdIsNull() {
            addCriterion("purchase_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdIsNotNull() {
            addCriterion("purchase_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdEqualTo(Integer value) {
            addCriterion("purchase_user_id =", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdNotEqualTo(Integer value) {
            addCriterion("purchase_user_id <>", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdGreaterThan(Integer value) {
            addCriterion("purchase_user_id >", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_user_id >=", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdLessThan(Integer value) {
            addCriterion("purchase_user_id <", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_user_id <=", value, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdIn(List<Integer> values) {
            addCriterion("purchase_user_id in", values, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdNotIn(List<Integer> values) {
            addCriterion("purchase_user_id not in", values, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdBetween(Integer value1, Integer value2) {
            addCriterion("purchase_user_id between", value1, value2, "purchaseUserId");
            return (Criteria) this;
        }

        public Criteria andPurchaseUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_user_id not between", value1, value2, "purchaseUserId");
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

        public Criteria andEntryWarehouseIsNull() {
            addCriterion("entry_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andEntryWarehouseIsNotNull() {
            addCriterion("entry_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andEntryWarehouseEqualTo(String value) {
            addCriterion("entry_warehouse =", value, "entryWarehouse");
            return (Criteria) this;
        }

        public Criteria andEntryWarehouseNotEqualTo(String value) {
            addCriterion("entry_warehouse <>", value, "entryWarehouse");
            return (Criteria) this;
        }

        public Criteria andEntryWarehouseGreaterThan(String value) {
            addCriterion("entry_warehouse >", value, "entryWarehouse");
            return (Criteria) this;
        }

        public Criteria andEntryWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("entry_warehouse >=", value, "entryWarehouse");
            return (Criteria) this;
        }

        public Criteria andEntryWarehouseLessThan(String value) {
            addCriterion("entry_warehouse <", value, "entryWarehouse");
            return (Criteria) this;
        }

        public Criteria andEntryWarehouseLessThanOrEqualTo(String value) {
            addCriterion("entry_warehouse <=", value, "entryWarehouse");
            return (Criteria) this;
        }

        public Criteria andEntryWarehouseLike(String value) {
            addCriterion("entry_warehouse like", value, "entryWarehouse");
            return (Criteria) this;
        }

        public Criteria andEntryWarehouseNotLike(String value) {
            addCriterion("entry_warehouse not like", value, "entryWarehouse");
            return (Criteria) this;
        }

        public Criteria andEntryWarehouseIn(List<String> values) {
            addCriterion("entry_warehouse in", values, "entryWarehouse");
            return (Criteria) this;
        }

        public Criteria andEntryWarehouseNotIn(List<String> values) {
            addCriterion("entry_warehouse not in", values, "entryWarehouse");
            return (Criteria) this;
        }

        public Criteria andEntryWarehouseBetween(String value1, String value2) {
            addCriterion("entry_warehouse between", value1, value2, "entryWarehouse");
            return (Criteria) this;
        }

        public Criteria andEntryWarehouseNotBetween(String value1, String value2) {
            addCriterion("entry_warehouse not between", value1, value2, "entryWarehouse");
            return (Criteria) this;
        }

        public Criteria andEntryStatusIsNull() {
            addCriterion("entry_status is null");
            return (Criteria) this;
        }

        public Criteria andEntryStatusIsNotNull() {
            addCriterion("entry_status is not null");
            return (Criteria) this;
        }

        public Criteria andEntryStatusEqualTo(String value) {
            addCriterion("entry_status =", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusNotEqualTo(String value) {
            addCriterion("entry_status <>", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusGreaterThan(String value) {
            addCriterion("entry_status >", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusGreaterThanOrEqualTo(String value) {
            addCriterion("entry_status >=", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusLessThan(String value) {
            addCriterion("entry_status <", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusLessThanOrEqualTo(String value) {
            addCriterion("entry_status <=", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusLike(String value) {
            addCriterion("entry_status like", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusNotLike(String value) {
            addCriterion("entry_status not like", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusIn(List<String> values) {
            addCriterion("entry_status in", values, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusNotIn(List<String> values) {
            addCriterion("entry_status not in", values, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusBetween(String value1, String value2) {
            addCriterion("entry_status between", value1, value2, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusNotBetween(String value1, String value2) {
            addCriterion("entry_status not between", value1, value2, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(String value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(String value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(String value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(String value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLike(String value) {
            addCriterion("supplier_id like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotLike(String value) {
            addCriterion("supplier_id not like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<String> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<String> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(String value1, String value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(String value1, String value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andBillTotalAmountIsNull() {
            addCriterion("bill_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andBillTotalAmountIsNotNull() {
            addCriterion("bill_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBillTotalAmountEqualTo(BigDecimal value) {
            addCriterion("bill_total_amount =", value, "billTotalAmount");
            return (Criteria) this;
        }

        public Criteria andBillTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("bill_total_amount <>", value, "billTotalAmount");
            return (Criteria) this;
        }

        public Criteria andBillTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("bill_total_amount >", value, "billTotalAmount");
            return (Criteria) this;
        }

        public Criteria andBillTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bill_total_amount >=", value, "billTotalAmount");
            return (Criteria) this;
        }

        public Criteria andBillTotalAmountLessThan(BigDecimal value) {
            addCriterion("bill_total_amount <", value, "billTotalAmount");
            return (Criteria) this;
        }

        public Criteria andBillTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bill_total_amount <=", value, "billTotalAmount");
            return (Criteria) this;
        }

        public Criteria andBillTotalAmountIn(List<BigDecimal> values) {
            addCriterion("bill_total_amount in", values, "billTotalAmount");
            return (Criteria) this;
        }

        public Criteria andBillTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("bill_total_amount not in", values, "billTotalAmount");
            return (Criteria) this;
        }

        public Criteria andBillTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bill_total_amount between", value1, value2, "billTotalAmount");
            return (Criteria) this;
        }

        public Criteria andBillTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bill_total_amount not between", value1, value2, "billTotalAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(String value) {
            addCriterion("invoice_type =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(String value) {
            addCriterion("invoice_type <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(String value) {
            addCriterion("invoice_type >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_type >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(String value) {
            addCriterion("invoice_type <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("invoice_type <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLike(String value) {
            addCriterion("invoice_type like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotLike(String value) {
            addCriterion("invoice_type not like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<String> values) {
            addCriterion("invoice_type in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<String> values) {
            addCriterion("invoice_type not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(String value1, String value2) {
            addCriterion("invoice_type between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("invoice_type not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNull() {
            addCriterion("logistics_company is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNotNull() {
            addCriterion("logistics_company is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyEqualTo(String value) {
            addCriterion("logistics_company =", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotEqualTo(String value) {
            addCriterion("logistics_company <>", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThan(String value) {
            addCriterion("logistics_company >", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_company >=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThan(String value) {
            addCriterion("logistics_company <", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThanOrEqualTo(String value) {
            addCriterion("logistics_company <=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLike(String value) {
            addCriterion("logistics_company like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotLike(String value) {
            addCriterion("logistics_company not like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIn(List<String> values) {
            addCriterion("logistics_company in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotIn(List<String> values) {
            addCriterion("logistics_company not in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyBetween(String value1, String value2) {
            addCriterion("logistics_company between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotBetween(String value1, String value2) {
            addCriterion("logistics_company not between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
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

        public Criteria andEntryedNumIsNull() {
            addCriterion("entryed_num is null");
            return (Criteria) this;
        }

        public Criteria andEntryedNumIsNotNull() {
            addCriterion("entryed_num is not null");
            return (Criteria) this;
        }

        public Criteria andEntryedNumEqualTo(Double value) {
            addCriterion("entryed_num =", value, "entryedNum");
            return (Criteria) this;
        }

        public Criteria andEntryedNumNotEqualTo(Double value) {
            addCriterion("entryed_num <>", value, "entryedNum");
            return (Criteria) this;
        }

        public Criteria andEntryedNumGreaterThan(Double value) {
            addCriterion("entryed_num >", value, "entryedNum");
            return (Criteria) this;
        }

        public Criteria andEntryedNumGreaterThanOrEqualTo(Double value) {
            addCriterion("entryed_num >=", value, "entryedNum");
            return (Criteria) this;
        }

        public Criteria andEntryedNumLessThan(Double value) {
            addCriterion("entryed_num <", value, "entryedNum");
            return (Criteria) this;
        }

        public Criteria andEntryedNumLessThanOrEqualTo(Double value) {
            addCriterion("entryed_num <=", value, "entryedNum");
            return (Criteria) this;
        }

        public Criteria andEntryedNumIn(List<Double> values) {
            addCriterion("entryed_num in", values, "entryedNum");
            return (Criteria) this;
        }

        public Criteria andEntryedNumNotIn(List<Double> values) {
            addCriterion("entryed_num not in", values, "entryedNum");
            return (Criteria) this;
        }

        public Criteria andEntryedNumBetween(Double value1, Double value2) {
            addCriterion("entryed_num between", value1, value2, "entryedNum");
            return (Criteria) this;
        }

        public Criteria andEntryedNumNotBetween(Double value1, Double value2) {
            addCriterion("entryed_num not between", value1, value2, "entryedNum");
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

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andEvaluateStatusIsNull() {
            addCriterion("evaluate_status is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateStatusIsNotNull() {
            addCriterion("evaluate_status is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateStatusEqualTo(String value) {
            addCriterion("evaluate_status =", value, "evaluateStatus");
            return (Criteria) this;
        }

        public Criteria andEvaluateStatusNotEqualTo(String value) {
            addCriterion("evaluate_status <>", value, "evaluateStatus");
            return (Criteria) this;
        }

        public Criteria andEvaluateStatusGreaterThan(String value) {
            addCriterion("evaluate_status >", value, "evaluateStatus");
            return (Criteria) this;
        }

        public Criteria andEvaluateStatusGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_status >=", value, "evaluateStatus");
            return (Criteria) this;
        }

        public Criteria andEvaluateStatusLessThan(String value) {
            addCriterion("evaluate_status <", value, "evaluateStatus");
            return (Criteria) this;
        }

        public Criteria andEvaluateStatusLessThanOrEqualTo(String value) {
            addCriterion("evaluate_status <=", value, "evaluateStatus");
            return (Criteria) this;
        }

        public Criteria andEvaluateStatusLike(String value) {
            addCriterion("evaluate_status like", value, "evaluateStatus");
            return (Criteria) this;
        }

        public Criteria andEvaluateStatusNotLike(String value) {
            addCriterion("evaluate_status not like", value, "evaluateStatus");
            return (Criteria) this;
        }

        public Criteria andEvaluateStatusIn(List<String> values) {
            addCriterion("evaluate_status in", values, "evaluateStatus");
            return (Criteria) this;
        }

        public Criteria andEvaluateStatusNotIn(List<String> values) {
            addCriterion("evaluate_status not in", values, "evaluateStatus");
            return (Criteria) this;
        }

        public Criteria andEvaluateStatusBetween(String value1, String value2) {
            addCriterion("evaluate_status between", value1, value2, "evaluateStatus");
            return (Criteria) this;
        }

        public Criteria andEvaluateStatusNotBetween(String value1, String value2) {
            addCriterion("evaluate_status not between", value1, value2, "evaluateStatus");
            return (Criteria) this;
        }

        public Criteria andFreightInvoiceTypeIsNull() {
            addCriterion("freight_invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andFreightInvoiceTypeIsNotNull() {
            addCriterion("freight_invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andFreightInvoiceTypeEqualTo(String value) {
            addCriterion("freight_invoice_type =", value, "freightInvoiceType");
            return (Criteria) this;
        }

        public Criteria andFreightInvoiceTypeNotEqualTo(String value) {
            addCriterion("freight_invoice_type <>", value, "freightInvoiceType");
            return (Criteria) this;
        }

        public Criteria andFreightInvoiceTypeGreaterThan(String value) {
            addCriterion("freight_invoice_type >", value, "freightInvoiceType");
            return (Criteria) this;
        }

        public Criteria andFreightInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("freight_invoice_type >=", value, "freightInvoiceType");
            return (Criteria) this;
        }

        public Criteria andFreightInvoiceTypeLessThan(String value) {
            addCriterion("freight_invoice_type <", value, "freightInvoiceType");
            return (Criteria) this;
        }

        public Criteria andFreightInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("freight_invoice_type <=", value, "freightInvoiceType");
            return (Criteria) this;
        }

        public Criteria andFreightInvoiceTypeLike(String value) {
            addCriterion("freight_invoice_type like", value, "freightInvoiceType");
            return (Criteria) this;
        }

        public Criteria andFreightInvoiceTypeNotLike(String value) {
            addCriterion("freight_invoice_type not like", value, "freightInvoiceType");
            return (Criteria) this;
        }

        public Criteria andFreightInvoiceTypeIn(List<String> values) {
            addCriterion("freight_invoice_type in", values, "freightInvoiceType");
            return (Criteria) this;
        }

        public Criteria andFreightInvoiceTypeNotIn(List<String> values) {
            addCriterion("freight_invoice_type not in", values, "freightInvoiceType");
            return (Criteria) this;
        }

        public Criteria andFreightInvoiceTypeBetween(String value1, String value2) {
            addCriterion("freight_invoice_type between", value1, value2, "freightInvoiceType");
            return (Criteria) this;
        }

        public Criteria andFreightInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("freight_invoice_type not between", value1, value2, "freightInvoiceType");
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