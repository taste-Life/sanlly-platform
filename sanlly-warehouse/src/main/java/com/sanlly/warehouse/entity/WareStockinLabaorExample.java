package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareStockinLabaorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareStockinLabaorExample() {
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

        public Criteria andWareStockinLabaorIdIsNull() {
            addCriterion("ware_stockin_labaor_id is null");
            return (Criteria) this;
        }

        public Criteria andWareStockinLabaorIdIsNotNull() {
            addCriterion("ware_stockin_labaor_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareStockinLabaorIdEqualTo(Integer value) {
            addCriterion("ware_stockin_labaor_id =", value, "wareStockinLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockinLabaorIdNotEqualTo(Integer value) {
            addCriterion("ware_stockin_labaor_id <>", value, "wareStockinLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockinLabaorIdGreaterThan(Integer value) {
            addCriterion("ware_stockin_labaor_id >", value, "wareStockinLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockinLabaorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_stockin_labaor_id >=", value, "wareStockinLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockinLabaorIdLessThan(Integer value) {
            addCriterion("ware_stockin_labaor_id <", value, "wareStockinLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockinLabaorIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_stockin_labaor_id <=", value, "wareStockinLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockinLabaorIdIn(List<Integer> values) {
            addCriterion("ware_stockin_labaor_id in", values, "wareStockinLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockinLabaorIdNotIn(List<Integer> values) {
            addCriterion("ware_stockin_labaor_id not in", values, "wareStockinLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockinLabaorIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_stockin_labaor_id between", value1, value2, "wareStockinLabaorId");
            return (Criteria) this;
        }

        public Criteria andWareStockinLabaorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_stockin_labaor_id not between", value1, value2, "wareStockinLabaorId");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinNoIsNull() {
            addCriterion("labaor_stockin_no is null");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinNoIsNotNull() {
            addCriterion("labaor_stockin_no is not null");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinNoEqualTo(String value) {
            addCriterion("labaor_stockin_no =", value, "labaorStockinNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinNoNotEqualTo(String value) {
            addCriterion("labaor_stockin_no <>", value, "labaorStockinNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinNoGreaterThan(String value) {
            addCriterion("labaor_stockin_no >", value, "labaorStockinNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinNoGreaterThanOrEqualTo(String value) {
            addCriterion("labaor_stockin_no >=", value, "labaorStockinNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinNoLessThan(String value) {
            addCriterion("labaor_stockin_no <", value, "labaorStockinNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinNoLessThanOrEqualTo(String value) {
            addCriterion("labaor_stockin_no <=", value, "labaorStockinNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinNoLike(String value) {
            addCriterion("labaor_stockin_no like", value, "labaorStockinNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinNoNotLike(String value) {
            addCriterion("labaor_stockin_no not like", value, "labaorStockinNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinNoIn(List<String> values) {
            addCriterion("labaor_stockin_no in", values, "labaorStockinNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinNoNotIn(List<String> values) {
            addCriterion("labaor_stockin_no not in", values, "labaorStockinNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinNoBetween(String value1, String value2) {
            addCriterion("labaor_stockin_no between", value1, value2, "labaorStockinNo");
            return (Criteria) this;
        }

        public Criteria andLabaorStockinNoNotBetween(String value1, String value2) {
            addCriterion("labaor_stockin_no not between", value1, value2, "labaorStockinNo");
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

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
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