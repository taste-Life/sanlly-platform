package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EntrustProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public EntrustProcessExample() {
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

        public Criteria andWareEntrustedProcessingIdIsNull() {
            addCriterion("ware_entrusted_processing_id is null");
            return (Criteria) this;
        }

        public Criteria andWareEntrustedProcessingIdIsNotNull() {
            addCriterion("ware_entrusted_processing_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareEntrustedProcessingIdEqualTo(Integer value) {
            addCriterion("ware_entrusted_processing_id =", value, "wareEntrustedProcessingId");
            return (Criteria) this;
        }

        public Criteria andWareEntrustedProcessingIdNotEqualTo(Integer value) {
            addCriterion("ware_entrusted_processing_id <>", value, "wareEntrustedProcessingId");
            return (Criteria) this;
        }

        public Criteria andWareEntrustedProcessingIdGreaterThan(Integer value) {
            addCriterion("ware_entrusted_processing_id >", value, "wareEntrustedProcessingId");
            return (Criteria) this;
        }

        public Criteria andWareEntrustedProcessingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_entrusted_processing_id >=", value, "wareEntrustedProcessingId");
            return (Criteria) this;
        }

        public Criteria andWareEntrustedProcessingIdLessThan(Integer value) {
            addCriterion("ware_entrusted_processing_id <", value, "wareEntrustedProcessingId");
            return (Criteria) this;
        }

        public Criteria andWareEntrustedProcessingIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_entrusted_processing_id <=", value, "wareEntrustedProcessingId");
            return (Criteria) this;
        }

        public Criteria andWareEntrustedProcessingIdIn(List<Integer> values) {
            addCriterion("ware_entrusted_processing_id in", values, "wareEntrustedProcessingId");
            return (Criteria) this;
        }

        public Criteria andWareEntrustedProcessingIdNotIn(List<Integer> values) {
            addCriterion("ware_entrusted_processing_id not in", values, "wareEntrustedProcessingId");
            return (Criteria) this;
        }

        public Criteria andWareEntrustedProcessingIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_entrusted_processing_id between", value1, value2, "wareEntrustedProcessingId");
            return (Criteria) this;
        }

        public Criteria andWareEntrustedProcessingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_entrusted_processing_id not between", value1, value2, "wareEntrustedProcessingId");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingNoIsNull() {
            addCriterion("entrusted_processing_no is null");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingNoIsNotNull() {
            addCriterion("entrusted_processing_no is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingNoEqualTo(String value) {
            addCriterion("entrusted_processing_no =", value, "entrustedProcessingNo");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingNoNotEqualTo(String value) {
            addCriterion("entrusted_processing_no <>", value, "entrustedProcessingNo");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingNoGreaterThan(String value) {
            addCriterion("entrusted_processing_no >", value, "entrustedProcessingNo");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingNoGreaterThanOrEqualTo(String value) {
            addCriterion("entrusted_processing_no >=", value, "entrustedProcessingNo");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingNoLessThan(String value) {
            addCriterion("entrusted_processing_no <", value, "entrustedProcessingNo");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingNoLessThanOrEqualTo(String value) {
            addCriterion("entrusted_processing_no <=", value, "entrustedProcessingNo");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingNoLike(String value) {
            addCriterion("entrusted_processing_no like", value, "entrustedProcessingNo");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingNoNotLike(String value) {
            addCriterion("entrusted_processing_no not like", value, "entrustedProcessingNo");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingNoIn(List<String> values) {
            addCriterion("entrusted_processing_no in", values, "entrustedProcessingNo");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingNoNotIn(List<String> values) {
            addCriterion("entrusted_processing_no not in", values, "entrustedProcessingNo");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingNoBetween(String value1, String value2) {
            addCriterion("entrusted_processing_no between", value1, value2, "entrustedProcessingNo");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingNoNotBetween(String value1, String value2) {
            addCriterion("entrusted_processing_no not between", value1, value2, "entrustedProcessingNo");
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

        public Criteria andProcessingUnitIsNull() {
            addCriterion("processing_unit is null");
            return (Criteria) this;
        }

        public Criteria andProcessingUnitIsNotNull() {
            addCriterion("processing_unit is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingUnitEqualTo(String value) {
            addCriterion("processing_unit =", value, "processingUnit");
            return (Criteria) this;
        }

        public Criteria andProcessingUnitNotEqualTo(String value) {
            addCriterion("processing_unit <>", value, "processingUnit");
            return (Criteria) this;
        }

        public Criteria andProcessingUnitGreaterThan(String value) {
            addCriterion("processing_unit >", value, "processingUnit");
            return (Criteria) this;
        }

        public Criteria andProcessingUnitGreaterThanOrEqualTo(String value) {
            addCriterion("processing_unit >=", value, "processingUnit");
            return (Criteria) this;
        }

        public Criteria andProcessingUnitLessThan(String value) {
            addCriterion("processing_unit <", value, "processingUnit");
            return (Criteria) this;
        }

        public Criteria andProcessingUnitLessThanOrEqualTo(String value) {
            addCriterion("processing_unit <=", value, "processingUnit");
            return (Criteria) this;
        }

        public Criteria andProcessingUnitLike(String value) {
            addCriterion("processing_unit like", value, "processingUnit");
            return (Criteria) this;
        }

        public Criteria andProcessingUnitNotLike(String value) {
            addCriterion("processing_unit not like", value, "processingUnit");
            return (Criteria) this;
        }

        public Criteria andProcessingUnitIn(List<String> values) {
            addCriterion("processing_unit in", values, "processingUnit");
            return (Criteria) this;
        }

        public Criteria andProcessingUnitNotIn(List<String> values) {
            addCriterion("processing_unit not in", values, "processingUnit");
            return (Criteria) this;
        }

        public Criteria andProcessingUnitBetween(String value1, String value2) {
            addCriterion("processing_unit between", value1, value2, "processingUnit");
            return (Criteria) this;
        }

        public Criteria andProcessingUnitNotBetween(String value1, String value2) {
            addCriterion("processing_unit not between", value1, value2, "processingUnit");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingTypeIsNull() {
            addCriterion("entrusted_processing_type is null");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingTypeIsNotNull() {
            addCriterion("entrusted_processing_type is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingTypeEqualTo(String value) {
            addCriterion("entrusted_processing_type =", value, "entrustedProcessingType");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingTypeNotEqualTo(String value) {
            addCriterion("entrusted_processing_type <>", value, "entrustedProcessingType");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingTypeGreaterThan(String value) {
            addCriterion("entrusted_processing_type >", value, "entrustedProcessingType");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("entrusted_processing_type >=", value, "entrustedProcessingType");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingTypeLessThan(String value) {
            addCriterion("entrusted_processing_type <", value, "entrustedProcessingType");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingTypeLessThanOrEqualTo(String value) {
            addCriterion("entrusted_processing_type <=", value, "entrustedProcessingType");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingTypeLike(String value) {
            addCriterion("entrusted_processing_type like", value, "entrustedProcessingType");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingTypeNotLike(String value) {
            addCriterion("entrusted_processing_type not like", value, "entrustedProcessingType");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingTypeIn(List<String> values) {
            addCriterion("entrusted_processing_type in", values, "entrustedProcessingType");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingTypeNotIn(List<String> values) {
            addCriterion("entrusted_processing_type not in", values, "entrustedProcessingType");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingTypeBetween(String value1, String value2) {
            addCriterion("entrusted_processing_type between", value1, value2, "entrustedProcessingType");
            return (Criteria) this;
        }

        public Criteria andEntrustedProcessingTypeNotBetween(String value1, String value2) {
            addCriterion("entrusted_processing_type not between", value1, value2, "entrustedProcessingType");
            return (Criteria) this;
        }

        public Criteria andProcessingInvoiceTypeIsNull() {
            addCriterion("processing_invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andProcessingInvoiceTypeIsNotNull() {
            addCriterion("processing_invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingInvoiceTypeEqualTo(String value) {
            addCriterion("processing_invoice_type =", value, "processingInvoiceType");
            return (Criteria) this;
        }

        public Criteria andProcessingInvoiceTypeNotEqualTo(String value) {
            addCriterion("processing_invoice_type <>", value, "processingInvoiceType");
            return (Criteria) this;
        }

        public Criteria andProcessingInvoiceTypeGreaterThan(String value) {
            addCriterion("processing_invoice_type >", value, "processingInvoiceType");
            return (Criteria) this;
        }

        public Criteria andProcessingInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("processing_invoice_type >=", value, "processingInvoiceType");
            return (Criteria) this;
        }

        public Criteria andProcessingInvoiceTypeLessThan(String value) {
            addCriterion("processing_invoice_type <", value, "processingInvoiceType");
            return (Criteria) this;
        }

        public Criteria andProcessingInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("processing_invoice_type <=", value, "processingInvoiceType");
            return (Criteria) this;
        }

        public Criteria andProcessingInvoiceTypeLike(String value) {
            addCriterion("processing_invoice_type like", value, "processingInvoiceType");
            return (Criteria) this;
        }

        public Criteria andProcessingInvoiceTypeNotLike(String value) {
            addCriterion("processing_invoice_type not like", value, "processingInvoiceType");
            return (Criteria) this;
        }

        public Criteria andProcessingInvoiceTypeIn(List<String> values) {
            addCriterion("processing_invoice_type in", values, "processingInvoiceType");
            return (Criteria) this;
        }

        public Criteria andProcessingInvoiceTypeNotIn(List<String> values) {
            addCriterion("processing_invoice_type not in", values, "processingInvoiceType");
            return (Criteria) this;
        }

        public Criteria andProcessingInvoiceTypeBetween(String value1, String value2) {
            addCriterion("processing_invoice_type between", value1, value2, "processingInvoiceType");
            return (Criteria) this;
        }

        public Criteria andProcessingInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("processing_invoice_type not between", value1, value2, "processingInvoiceType");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesTaxIsNull() {
            addCriterion("processing_charges_tax is null");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesTaxIsNotNull() {
            addCriterion("processing_charges_tax is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesTaxEqualTo(BigDecimal value) {
            addCriterion("processing_charges_tax =", value, "processingChargesTax");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesTaxNotEqualTo(BigDecimal value) {
            addCriterion("processing_charges_tax <>", value, "processingChargesTax");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesTaxGreaterThan(BigDecimal value) {
            addCriterion("processing_charges_tax >", value, "processingChargesTax");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("processing_charges_tax >=", value, "processingChargesTax");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesTaxLessThan(BigDecimal value) {
            addCriterion("processing_charges_tax <", value, "processingChargesTax");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("processing_charges_tax <=", value, "processingChargesTax");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesTaxIn(List<BigDecimal> values) {
            addCriterion("processing_charges_tax in", values, "processingChargesTax");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesTaxNotIn(List<BigDecimal> values) {
            addCriterion("processing_charges_tax not in", values, "processingChargesTax");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("processing_charges_tax between", value1, value2, "processingChargesTax");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("processing_charges_tax not between", value1, value2, "processingChargesTax");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesVatIsNull() {
            addCriterion("processing_charges_vat is null");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesVatIsNotNull() {
            addCriterion("processing_charges_vat is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesVatEqualTo(BigDecimal value) {
            addCriterion("processing_charges_vat =", value, "processingChargesVat");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesVatNotEqualTo(BigDecimal value) {
            addCriterion("processing_charges_vat <>", value, "processingChargesVat");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesVatGreaterThan(BigDecimal value) {
            addCriterion("processing_charges_vat >", value, "processingChargesVat");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesVatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("processing_charges_vat >=", value, "processingChargesVat");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesVatLessThan(BigDecimal value) {
            addCriterion("processing_charges_vat <", value, "processingChargesVat");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesVatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("processing_charges_vat <=", value, "processingChargesVat");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesVatIn(List<BigDecimal> values) {
            addCriterion("processing_charges_vat in", values, "processingChargesVat");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesVatNotIn(List<BigDecimal> values) {
            addCriterion("processing_charges_vat not in", values, "processingChargesVat");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesVatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("processing_charges_vat between", value1, value2, "processingChargesVat");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesVatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("processing_charges_vat not between", value1, value2, "processingChargesVat");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesIsNull() {
            addCriterion("processing_charges is null");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesIsNotNull() {
            addCriterion("processing_charges is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesEqualTo(BigDecimal value) {
            addCriterion("processing_charges =", value, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesNotEqualTo(BigDecimal value) {
            addCriterion("processing_charges <>", value, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesGreaterThan(BigDecimal value) {
            addCriterion("processing_charges >", value, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("processing_charges >=", value, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesLessThan(BigDecimal value) {
            addCriterion("processing_charges <", value, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("processing_charges <=", value, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesIn(List<BigDecimal> values) {
            addCriterion("processing_charges in", values, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesNotIn(List<BigDecimal> values) {
            addCriterion("processing_charges not in", values, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("processing_charges between", value1, value2, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andProcessingChargesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("processing_charges not between", value1, value2, "processingCharges");
            return (Criteria) this;
        }

        public Criteria andStockoutAmountIsNull() {
            addCriterion("stockout_amount is null");
            return (Criteria) this;
        }

        public Criteria andStockoutAmountIsNotNull() {
            addCriterion("stockout_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutAmountEqualTo(BigDecimal value) {
            addCriterion("stockout_amount =", value, "stockoutAmount");
            return (Criteria) this;
        }

        public Criteria andStockoutAmountNotEqualTo(BigDecimal value) {
            addCriterion("stockout_amount <>", value, "stockoutAmount");
            return (Criteria) this;
        }

        public Criteria andStockoutAmountGreaterThan(BigDecimal value) {
            addCriterion("stockout_amount >", value, "stockoutAmount");
            return (Criteria) this;
        }

        public Criteria andStockoutAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stockout_amount >=", value, "stockoutAmount");
            return (Criteria) this;
        }

        public Criteria andStockoutAmountLessThan(BigDecimal value) {
            addCriterion("stockout_amount <", value, "stockoutAmount");
            return (Criteria) this;
        }

        public Criteria andStockoutAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stockout_amount <=", value, "stockoutAmount");
            return (Criteria) this;
        }

        public Criteria andStockoutAmountIn(List<BigDecimal> values) {
            addCriterion("stockout_amount in", values, "stockoutAmount");
            return (Criteria) this;
        }

        public Criteria andStockoutAmountNotIn(List<BigDecimal> values) {
            addCriterion("stockout_amount not in", values, "stockoutAmount");
            return (Criteria) this;
        }

        public Criteria andStockoutAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stockout_amount between", value1, value2, "stockoutAmount");
            return (Criteria) this;
        }

        public Criteria andStockoutAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stockout_amount not between", value1, value2, "stockoutAmount");
            return (Criteria) this;
        }

        public Criteria andEntryAmountIsNull() {
            addCriterion("entry_amount is null");
            return (Criteria) this;
        }

        public Criteria andEntryAmountIsNotNull() {
            addCriterion("entry_amount is not null");
            return (Criteria) this;
        }

        public Criteria andEntryAmountEqualTo(BigDecimal value) {
            addCriterion("entry_amount =", value, "entryAmount");
            return (Criteria) this;
        }

        public Criteria andEntryAmountNotEqualTo(BigDecimal value) {
            addCriterion("entry_amount <>", value, "entryAmount");
            return (Criteria) this;
        }

        public Criteria andEntryAmountGreaterThan(BigDecimal value) {
            addCriterion("entry_amount >", value, "entryAmount");
            return (Criteria) this;
        }

        public Criteria andEntryAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("entry_amount >=", value, "entryAmount");
            return (Criteria) this;
        }

        public Criteria andEntryAmountLessThan(BigDecimal value) {
            addCriterion("entry_amount <", value, "entryAmount");
            return (Criteria) this;
        }

        public Criteria andEntryAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("entry_amount <=", value, "entryAmount");
            return (Criteria) this;
        }

        public Criteria andEntryAmountIn(List<BigDecimal> values) {
            addCriterion("entry_amount in", values, "entryAmount");
            return (Criteria) this;
        }

        public Criteria andEntryAmountNotIn(List<BigDecimal> values) {
            addCriterion("entry_amount not in", values, "entryAmount");
            return (Criteria) this;
        }

        public Criteria andEntryAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("entry_amount between", value1, value2, "entryAmount");
            return (Criteria) this;
        }

        public Criteria andEntryAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("entry_amount not between", value1, value2, "entryAmount");
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