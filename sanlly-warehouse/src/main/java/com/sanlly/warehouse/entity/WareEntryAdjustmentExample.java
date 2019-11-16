package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareEntryAdjustmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareEntryAdjustmentExample() {
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

        public Criteria andWareEntryAdjustmentIdIsNull() {
            addCriterion("ware_entry_adjustment_id is null");
            return (Criteria) this;
        }

        public Criteria andWareEntryAdjustmentIdIsNotNull() {
            addCriterion("ware_entry_adjustment_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareEntryAdjustmentIdEqualTo(Integer value) {
            addCriterion("ware_entry_adjustment_id =", value, "wareEntryAdjustmentId");
            return (Criteria) this;
        }

        public Criteria andWareEntryAdjustmentIdNotEqualTo(Integer value) {
            addCriterion("ware_entry_adjustment_id <>", value, "wareEntryAdjustmentId");
            return (Criteria) this;
        }

        public Criteria andWareEntryAdjustmentIdGreaterThan(Integer value) {
            addCriterion("ware_entry_adjustment_id >", value, "wareEntryAdjustmentId");
            return (Criteria) this;
        }

        public Criteria andWareEntryAdjustmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_entry_adjustment_id >=", value, "wareEntryAdjustmentId");
            return (Criteria) this;
        }

        public Criteria andWareEntryAdjustmentIdLessThan(Integer value) {
            addCriterion("ware_entry_adjustment_id <", value, "wareEntryAdjustmentId");
            return (Criteria) this;
        }

        public Criteria andWareEntryAdjustmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_entry_adjustment_id <=", value, "wareEntryAdjustmentId");
            return (Criteria) this;
        }

        public Criteria andWareEntryAdjustmentIdIn(List<Integer> values) {
            addCriterion("ware_entry_adjustment_id in", values, "wareEntryAdjustmentId");
            return (Criteria) this;
        }

        public Criteria andWareEntryAdjustmentIdNotIn(List<Integer> values) {
            addCriterion("ware_entry_adjustment_id not in", values, "wareEntryAdjustmentId");
            return (Criteria) this;
        }

        public Criteria andWareEntryAdjustmentIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_entry_adjustment_id between", value1, value2, "wareEntryAdjustmentId");
            return (Criteria) this;
        }

        public Criteria andWareEntryAdjustmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_entry_adjustment_id not between", value1, value2, "wareEntryAdjustmentId");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentNoIsNull() {
            addCriterion("entry_adjustment_no is null");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentNoIsNotNull() {
            addCriterion("entry_adjustment_no is not null");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentNoEqualTo(String value) {
            addCriterion("entry_adjustment_no =", value, "entryAdjustmentNo");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentNoNotEqualTo(String value) {
            addCriterion("entry_adjustment_no <>", value, "entryAdjustmentNo");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentNoGreaterThan(String value) {
            addCriterion("entry_adjustment_no >", value, "entryAdjustmentNo");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentNoGreaterThanOrEqualTo(String value) {
            addCriterion("entry_adjustment_no >=", value, "entryAdjustmentNo");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentNoLessThan(String value) {
            addCriterion("entry_adjustment_no <", value, "entryAdjustmentNo");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentNoLessThanOrEqualTo(String value) {
            addCriterion("entry_adjustment_no <=", value, "entryAdjustmentNo");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentNoLike(String value) {
            addCriterion("entry_adjustment_no like", value, "entryAdjustmentNo");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentNoNotLike(String value) {
            addCriterion("entry_adjustment_no not like", value, "entryAdjustmentNo");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentNoIn(List<String> values) {
            addCriterion("entry_adjustment_no in", values, "entryAdjustmentNo");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentNoNotIn(List<String> values) {
            addCriterion("entry_adjustment_no not in", values, "entryAdjustmentNo");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentNoBetween(String value1, String value2) {
            addCriterion("entry_adjustment_no between", value1, value2, "entryAdjustmentNo");
            return (Criteria) this;
        }

        public Criteria andEntryAdjustmentNoNotBetween(String value1, String value2) {
            addCriterion("entry_adjustment_no not between", value1, value2, "entryAdjustmentNo");
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

        public Criteria andAdjustmentStatusIsNull() {
            addCriterion("adjustment_status is null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentStatusIsNotNull() {
            addCriterion("adjustment_status is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentStatusEqualTo(String value) {
            addCriterion("adjustment_status =", value, "adjustmentStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustmentStatusNotEqualTo(String value) {
            addCriterion("adjustment_status <>", value, "adjustmentStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustmentStatusGreaterThan(String value) {
            addCriterion("adjustment_status >", value, "adjustmentStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustmentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("adjustment_status >=", value, "adjustmentStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustmentStatusLessThan(String value) {
            addCriterion("adjustment_status <", value, "adjustmentStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustmentStatusLessThanOrEqualTo(String value) {
            addCriterion("adjustment_status <=", value, "adjustmentStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustmentStatusLike(String value) {
            addCriterion("adjustment_status like", value, "adjustmentStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustmentStatusNotLike(String value) {
            addCriterion("adjustment_status not like", value, "adjustmentStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustmentStatusIn(List<String> values) {
            addCriterion("adjustment_status in", values, "adjustmentStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustmentStatusNotIn(List<String> values) {
            addCriterion("adjustment_status not in", values, "adjustmentStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustmentStatusBetween(String value1, String value2) {
            addCriterion("adjustment_status between", value1, value2, "adjustmentStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustmentStatusNotBetween(String value1, String value2) {
            addCriterion("adjustment_status not between", value1, value2, "adjustmentStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustmentPersonIsNull() {
            addCriterion("adjustment_person is null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentPersonIsNotNull() {
            addCriterion("adjustment_person is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentPersonEqualTo(Integer value) {
            addCriterion("adjustment_person =", value, "adjustmentPerson");
            return (Criteria) this;
        }

        public Criteria andAdjustmentPersonNotEqualTo(Integer value) {
            addCriterion("adjustment_person <>", value, "adjustmentPerson");
            return (Criteria) this;
        }

        public Criteria andAdjustmentPersonGreaterThan(Integer value) {
            addCriterion("adjustment_person >", value, "adjustmentPerson");
            return (Criteria) this;
        }

        public Criteria andAdjustmentPersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("adjustment_person >=", value, "adjustmentPerson");
            return (Criteria) this;
        }

        public Criteria andAdjustmentPersonLessThan(Integer value) {
            addCriterion("adjustment_person <", value, "adjustmentPerson");
            return (Criteria) this;
        }

        public Criteria andAdjustmentPersonLessThanOrEqualTo(Integer value) {
            addCriterion("adjustment_person <=", value, "adjustmentPerson");
            return (Criteria) this;
        }

        public Criteria andAdjustmentPersonIn(List<Integer> values) {
            addCriterion("adjustment_person in", values, "adjustmentPerson");
            return (Criteria) this;
        }

        public Criteria andAdjustmentPersonNotIn(List<Integer> values) {
            addCriterion("adjustment_person not in", values, "adjustmentPerson");
            return (Criteria) this;
        }

        public Criteria andAdjustmentPersonBetween(Integer value1, Integer value2) {
            addCriterion("adjustment_person between", value1, value2, "adjustmentPerson");
            return (Criteria) this;
        }

        public Criteria andAdjustmentPersonNotBetween(Integer value1, Integer value2) {
            addCriterion("adjustment_person not between", value1, value2, "adjustmentPerson");
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

        public Criteria andOldInvoiceIsNull() {
            addCriterion("old_invoice is null");
            return (Criteria) this;
        }

        public Criteria andOldInvoiceIsNotNull() {
            addCriterion("old_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andOldInvoiceEqualTo(String value) {
            addCriterion("old_invoice =", value, "oldInvoice");
            return (Criteria) this;
        }

        public Criteria andOldInvoiceNotEqualTo(String value) {
            addCriterion("old_invoice <>", value, "oldInvoice");
            return (Criteria) this;
        }

        public Criteria andOldInvoiceGreaterThan(String value) {
            addCriterion("old_invoice >", value, "oldInvoice");
            return (Criteria) this;
        }

        public Criteria andOldInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("old_invoice >=", value, "oldInvoice");
            return (Criteria) this;
        }

        public Criteria andOldInvoiceLessThan(String value) {
            addCriterion("old_invoice <", value, "oldInvoice");
            return (Criteria) this;
        }

        public Criteria andOldInvoiceLessThanOrEqualTo(String value) {
            addCriterion("old_invoice <=", value, "oldInvoice");
            return (Criteria) this;
        }

        public Criteria andOldInvoiceLike(String value) {
            addCriterion("old_invoice like", value, "oldInvoice");
            return (Criteria) this;
        }

        public Criteria andOldInvoiceNotLike(String value) {
            addCriterion("old_invoice not like", value, "oldInvoice");
            return (Criteria) this;
        }

        public Criteria andOldInvoiceIn(List<String> values) {
            addCriterion("old_invoice in", values, "oldInvoice");
            return (Criteria) this;
        }

        public Criteria andOldInvoiceNotIn(List<String> values) {
            addCriterion("old_invoice not in", values, "oldInvoice");
            return (Criteria) this;
        }

        public Criteria andOldInvoiceBetween(String value1, String value2) {
            addCriterion("old_invoice between", value1, value2, "oldInvoice");
            return (Criteria) this;
        }

        public Criteria andOldInvoiceNotBetween(String value1, String value2) {
            addCriterion("old_invoice not between", value1, value2, "oldInvoice");
            return (Criteria) this;
        }

        public Criteria andAdjustmentInvoiceIsNull() {
            addCriterion("adjustment_invoice is null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentInvoiceIsNotNull() {
            addCriterion("adjustment_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentInvoiceEqualTo(String value) {
            addCriterion("adjustment_invoice =", value, "adjustmentInvoice");
            return (Criteria) this;
        }

        public Criteria andAdjustmentInvoiceNotEqualTo(String value) {
            addCriterion("adjustment_invoice <>", value, "adjustmentInvoice");
            return (Criteria) this;
        }

        public Criteria andAdjustmentInvoiceGreaterThan(String value) {
            addCriterion("adjustment_invoice >", value, "adjustmentInvoice");
            return (Criteria) this;
        }

        public Criteria andAdjustmentInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("adjustment_invoice >=", value, "adjustmentInvoice");
            return (Criteria) this;
        }

        public Criteria andAdjustmentInvoiceLessThan(String value) {
            addCriterion("adjustment_invoice <", value, "adjustmentInvoice");
            return (Criteria) this;
        }

        public Criteria andAdjustmentInvoiceLessThanOrEqualTo(String value) {
            addCriterion("adjustment_invoice <=", value, "adjustmentInvoice");
            return (Criteria) this;
        }

        public Criteria andAdjustmentInvoiceLike(String value) {
            addCriterion("adjustment_invoice like", value, "adjustmentInvoice");
            return (Criteria) this;
        }

        public Criteria andAdjustmentInvoiceNotLike(String value) {
            addCriterion("adjustment_invoice not like", value, "adjustmentInvoice");
            return (Criteria) this;
        }

        public Criteria andAdjustmentInvoiceIn(List<String> values) {
            addCriterion("adjustment_invoice in", values, "adjustmentInvoice");
            return (Criteria) this;
        }

        public Criteria andAdjustmentInvoiceNotIn(List<String> values) {
            addCriterion("adjustment_invoice not in", values, "adjustmentInvoice");
            return (Criteria) this;
        }

        public Criteria andAdjustmentInvoiceBetween(String value1, String value2) {
            addCriterion("adjustment_invoice between", value1, value2, "adjustmentInvoice");
            return (Criteria) this;
        }

        public Criteria andAdjustmentInvoiceNotBetween(String value1, String value2) {
            addCriterion("adjustment_invoice not between", value1, value2, "adjustmentInvoice");
            return (Criteria) this;
        }

        public Criteria andOldFreightIsNull() {
            addCriterion("old_freight is null");
            return (Criteria) this;
        }

        public Criteria andOldFreightIsNotNull() {
            addCriterion("old_freight is not null");
            return (Criteria) this;
        }

        public Criteria andOldFreightEqualTo(BigDecimal value) {
            addCriterion("old_freight =", value, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightNotEqualTo(BigDecimal value) {
            addCriterion("old_freight <>", value, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightGreaterThan(BigDecimal value) {
            addCriterion("old_freight >", value, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("old_freight >=", value, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightLessThan(BigDecimal value) {
            addCriterion("old_freight <", value, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("old_freight <=", value, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightIn(List<BigDecimal> values) {
            addCriterion("old_freight in", values, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightNotIn(List<BigDecimal> values) {
            addCriterion("old_freight not in", values, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_freight between", value1, value2, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andOldFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_freight not between", value1, value2, "oldFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightIsNull() {
            addCriterion("adjustment_freight is null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightIsNotNull() {
            addCriterion("adjustment_freight is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightEqualTo(BigDecimal value) {
            addCriterion("adjustment_freight =", value, "adjustmentFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightNotEqualTo(BigDecimal value) {
            addCriterion("adjustment_freight <>", value, "adjustmentFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightGreaterThan(BigDecimal value) {
            addCriterion("adjustment_freight >", value, "adjustmentFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("adjustment_freight >=", value, "adjustmentFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightLessThan(BigDecimal value) {
            addCriterion("adjustment_freight <", value, "adjustmentFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("adjustment_freight <=", value, "adjustmentFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightIn(List<BigDecimal> values) {
            addCriterion("adjustment_freight in", values, "adjustmentFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightNotIn(List<BigDecimal> values) {
            addCriterion("adjustment_freight not in", values, "adjustmentFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("adjustment_freight between", value1, value2, "adjustmentFreight");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("adjustment_freight not between", value1, value2, "adjustmentFreight");
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