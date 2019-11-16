package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepairReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public RepairReportExample() {
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

        public Criteria andWareRepairReportIdIsNull() {
            addCriterion("ware_repair_report_id is null");
            return (Criteria) this;
        }

        public Criteria andWareRepairReportIdIsNotNull() {
            addCriterion("ware_repair_report_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareRepairReportIdEqualTo(Integer value) {
            addCriterion("ware_repair_report_id =", value, "wareRepairReportId");
            return (Criteria) this;
        }

        public Criteria andWareRepairReportIdNotEqualTo(Integer value) {
            addCriterion("ware_repair_report_id <>", value, "wareRepairReportId");
            return (Criteria) this;
        }

        public Criteria andWareRepairReportIdGreaterThan(Integer value) {
            addCriterion("ware_repair_report_id >", value, "wareRepairReportId");
            return (Criteria) this;
        }

        public Criteria andWareRepairReportIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_repair_report_id >=", value, "wareRepairReportId");
            return (Criteria) this;
        }

        public Criteria andWareRepairReportIdLessThan(Integer value) {
            addCriterion("ware_repair_report_id <", value, "wareRepairReportId");
            return (Criteria) this;
        }

        public Criteria andWareRepairReportIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_repair_report_id <=", value, "wareRepairReportId");
            return (Criteria) this;
        }

        public Criteria andWareRepairReportIdIn(List<Integer> values) {
            addCriterion("ware_repair_report_id in", values, "wareRepairReportId");
            return (Criteria) this;
        }

        public Criteria andWareRepairReportIdNotIn(List<Integer> values) {
            addCriterion("ware_repair_report_id not in", values, "wareRepairReportId");
            return (Criteria) this;
        }

        public Criteria andWareRepairReportIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_repair_report_id between", value1, value2, "wareRepairReportId");
            return (Criteria) this;
        }

        public Criteria andWareRepairReportIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_repair_report_id not between", value1, value2, "wareRepairReportId");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdIsNull() {
            addCriterion("ware_repair_store_id is null");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdIsNotNull() {
            addCriterion("ware_repair_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdEqualTo(Integer value) {
            addCriterion("ware_repair_store_id =", value, "wareRepairStoreId");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdNotEqualTo(Integer value) {
            addCriterion("ware_repair_store_id <>", value, "wareRepairStoreId");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdGreaterThan(Integer value) {
            addCriterion("ware_repair_store_id >", value, "wareRepairStoreId");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_repair_store_id >=", value, "wareRepairStoreId");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdLessThan(Integer value) {
            addCriterion("ware_repair_store_id <", value, "wareRepairStoreId");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_repair_store_id <=", value, "wareRepairStoreId");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdIn(List<Integer> values) {
            addCriterion("ware_repair_store_id in", values, "wareRepairStoreId");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdNotIn(List<Integer> values) {
            addCriterion("ware_repair_store_id not in", values, "wareRepairStoreId");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_repair_store_id between", value1, value2, "wareRepairStoreId");
            return (Criteria) this;
        }

        public Criteria andWareRepairStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_repair_store_id not between", value1, value2, "wareRepairStoreId");
            return (Criteria) this;
        }

        public Criteria andReportNoIsNull() {
            addCriterion("report_no is null");
            return (Criteria) this;
        }

        public Criteria andReportNoIsNotNull() {
            addCriterion("report_no is not null");
            return (Criteria) this;
        }

        public Criteria andReportNoEqualTo(String value) {
            addCriterion("report_no =", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotEqualTo(String value) {
            addCriterion("report_no <>", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoGreaterThan(String value) {
            addCriterion("report_no >", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoGreaterThanOrEqualTo(String value) {
            addCriterion("report_no >=", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoLessThan(String value) {
            addCriterion("report_no <", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoLessThanOrEqualTo(String value) {
            addCriterion("report_no <=", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoLike(String value) {
            addCriterion("report_no like", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotLike(String value) {
            addCriterion("report_no not like", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoIn(List<String> values) {
            addCriterion("report_no in", values, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotIn(List<String> values) {
            addCriterion("report_no not in", values, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoBetween(String value1, String value2) {
            addCriterion("report_no between", value1, value2, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotBetween(String value1, String value2) {
            addCriterion("report_no not between", value1, value2, "reportNo");
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

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
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

        public Criteria andRepairDepartmentIsNull() {
            addCriterion("repair_department is null");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentIsNotNull() {
            addCriterion("repair_department is not null");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentEqualTo(String value) {
            addCriterion("repair_department =", value, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentNotEqualTo(String value) {
            addCriterion("repair_department <>", value, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentGreaterThan(String value) {
            addCriterion("repair_department >", value, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("repair_department >=", value, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentLessThan(String value) {
            addCriterion("repair_department <", value, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentLessThanOrEqualTo(String value) {
            addCriterion("repair_department <=", value, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentLike(String value) {
            addCriterion("repair_department like", value, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentNotLike(String value) {
            addCriterion("repair_department not like", value, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentIn(List<String> values) {
            addCriterion("repair_department in", values, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentNotIn(List<String> values) {
            addCriterion("repair_department not in", values, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentBetween(String value1, String value2) {
            addCriterion("repair_department between", value1, value2, "repairDepartment");
            return (Criteria) this;
        }

        public Criteria andRepairDepartmentNotBetween(String value1, String value2) {
            addCriterion("repair_department not between", value1, value2, "repairDepartment");
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

        public Criteria andTestUserIsNull() {
            addCriterion("test_user is null");
            return (Criteria) this;
        }

        public Criteria andTestUserIsNotNull() {
            addCriterion("test_user is not null");
            return (Criteria) this;
        }

        public Criteria andTestUserEqualTo(Integer value) {
            addCriterion("test_user =", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserNotEqualTo(Integer value) {
            addCriterion("test_user <>", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserGreaterThan(Integer value) {
            addCriterion("test_user >", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_user >=", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserLessThan(Integer value) {
            addCriterion("test_user <", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserLessThanOrEqualTo(Integer value) {
            addCriterion("test_user <=", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserIn(List<Integer> values) {
            addCriterion("test_user in", values, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserNotIn(List<Integer> values) {
            addCriterion("test_user not in", values, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserBetween(Integer value1, Integer value2) {
            addCriterion("test_user between", value1, value2, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserNotBetween(Integer value1, Integer value2) {
            addCriterion("test_user not between", value1, value2, "testUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserIsNull() {
            addCriterion("record_user is null");
            return (Criteria) this;
        }

        public Criteria andRecordUserIsNotNull() {
            addCriterion("record_user is not null");
            return (Criteria) this;
        }

        public Criteria andRecordUserEqualTo(Integer value) {
            addCriterion("record_user =", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserNotEqualTo(Integer value) {
            addCriterion("record_user <>", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserGreaterThan(Integer value) {
            addCriterion("record_user >", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_user >=", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserLessThan(Integer value) {
            addCriterion("record_user <", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserLessThanOrEqualTo(Integer value) {
            addCriterion("record_user <=", value, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserIn(List<Integer> values) {
            addCriterion("record_user in", values, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserNotIn(List<Integer> values) {
            addCriterion("record_user not in", values, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserBetween(Integer value1, Integer value2) {
            addCriterion("record_user between", value1, value2, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRecordUserNotBetween(Integer value1, Integer value2) {
            addCriterion("record_user not between", value1, value2, "recordUser");
            return (Criteria) this;
        }

        public Criteria andRepairUserIsNull() {
            addCriterion("repair_user is null");
            return (Criteria) this;
        }

        public Criteria andRepairUserIsNotNull() {
            addCriterion("repair_user is not null");
            return (Criteria) this;
        }

        public Criteria andRepairUserEqualTo(Integer value) {
            addCriterion("repair_user =", value, "repairUser");
            return (Criteria) this;
        }

        public Criteria andRepairUserNotEqualTo(Integer value) {
            addCriterion("repair_user <>", value, "repairUser");
            return (Criteria) this;
        }

        public Criteria andRepairUserGreaterThan(Integer value) {
            addCriterion("repair_user >", value, "repairUser");
            return (Criteria) this;
        }

        public Criteria andRepairUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("repair_user >=", value, "repairUser");
            return (Criteria) this;
        }

        public Criteria andRepairUserLessThan(Integer value) {
            addCriterion("repair_user <", value, "repairUser");
            return (Criteria) this;
        }

        public Criteria andRepairUserLessThanOrEqualTo(Integer value) {
            addCriterion("repair_user <=", value, "repairUser");
            return (Criteria) this;
        }

        public Criteria andRepairUserIn(List<Integer> values) {
            addCriterion("repair_user in", values, "repairUser");
            return (Criteria) this;
        }

        public Criteria andRepairUserNotIn(List<Integer> values) {
            addCriterion("repair_user not in", values, "repairUser");
            return (Criteria) this;
        }

        public Criteria andRepairUserBetween(Integer value1, Integer value2) {
            addCriterion("repair_user between", value1, value2, "repairUser");
            return (Criteria) this;
        }

        public Criteria andRepairUserNotBetween(Integer value1, Integer value2) {
            addCriterion("repair_user not between", value1, value2, "repairUser");
            return (Criteria) this;
        }

        public Criteria andRepairNumIsNull() {
            addCriterion("repair_num is null");
            return (Criteria) this;
        }

        public Criteria andRepairNumIsNotNull() {
            addCriterion("repair_num is not null");
            return (Criteria) this;
        }

        public Criteria andRepairNumEqualTo(Double value) {
            addCriterion("repair_num =", value, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumNotEqualTo(Double value) {
            addCriterion("repair_num <>", value, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumGreaterThan(Double value) {
            addCriterion("repair_num >", value, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumGreaterThanOrEqualTo(Double value) {
            addCriterion("repair_num >=", value, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumLessThan(Double value) {
            addCriterion("repair_num <", value, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumLessThanOrEqualTo(Double value) {
            addCriterion("repair_num <=", value, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumIn(List<Double> values) {
            addCriterion("repair_num in", values, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumNotIn(List<Double> values) {
            addCriterion("repair_num not in", values, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumBetween(Double value1, Double value2) {
            addCriterion("repair_num between", value1, value2, "repairNum");
            return (Criteria) this;
        }

        public Criteria andRepairNumNotBetween(Double value1, Double value2) {
            addCriterion("repair_num not between", value1, value2, "repairNum");
            return (Criteria) this;
        }

        public Criteria andNewSerialIsNull() {
            addCriterion("new_serial is null");
            return (Criteria) this;
        }

        public Criteria andNewSerialIsNotNull() {
            addCriterion("new_serial is not null");
            return (Criteria) this;
        }

        public Criteria andNewSerialEqualTo(String value) {
            addCriterion("new_serial =", value, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialNotEqualTo(String value) {
            addCriterion("new_serial <>", value, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialGreaterThan(String value) {
            addCriterion("new_serial >", value, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialGreaterThanOrEqualTo(String value) {
            addCriterion("new_serial >=", value, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialLessThan(String value) {
            addCriterion("new_serial <", value, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialLessThanOrEqualTo(String value) {
            addCriterion("new_serial <=", value, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialLike(String value) {
            addCriterion("new_serial like", value, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialNotLike(String value) {
            addCriterion("new_serial not like", value, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialIn(List<String> values) {
            addCriterion("new_serial in", values, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialNotIn(List<String> values) {
            addCriterion("new_serial not in", values, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialBetween(String value1, String value2) {
            addCriterion("new_serial between", value1, value2, "newSerial");
            return (Criteria) this;
        }

        public Criteria andNewSerialNotBetween(String value1, String value2) {
            addCriterion("new_serial not between", value1, value2, "newSerial");
            return (Criteria) this;
        }

        public Criteria andFaultStorageIsNull() {
            addCriterion("fault_storage is null");
            return (Criteria) this;
        }

        public Criteria andFaultStorageIsNotNull() {
            addCriterion("fault_storage is not null");
            return (Criteria) this;
        }

        public Criteria andFaultStorageEqualTo(String value) {
            addCriterion("fault_storage =", value, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageNotEqualTo(String value) {
            addCriterion("fault_storage <>", value, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageGreaterThan(String value) {
            addCriterion("fault_storage >", value, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageGreaterThanOrEqualTo(String value) {
            addCriterion("fault_storage >=", value, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageLessThan(String value) {
            addCriterion("fault_storage <", value, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageLessThanOrEqualTo(String value) {
            addCriterion("fault_storage <=", value, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageLike(String value) {
            addCriterion("fault_storage like", value, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageNotLike(String value) {
            addCriterion("fault_storage not like", value, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageIn(List<String> values) {
            addCriterion("fault_storage in", values, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageNotIn(List<String> values) {
            addCriterion("fault_storage not in", values, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageBetween(String value1, String value2) {
            addCriterion("fault_storage between", value1, value2, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andFaultStorageNotBetween(String value1, String value2) {
            addCriterion("fault_storage not between", value1, value2, "faultStorage");
            return (Criteria) this;
        }

        public Criteria andWasteNumIsNull() {
            addCriterion("waste_num is null");
            return (Criteria) this;
        }

        public Criteria andWasteNumIsNotNull() {
            addCriterion("waste_num is not null");
            return (Criteria) this;
        }

        public Criteria andWasteNumEqualTo(Double value) {
            addCriterion("waste_num =", value, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumNotEqualTo(Double value) {
            addCriterion("waste_num <>", value, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumGreaterThan(Double value) {
            addCriterion("waste_num >", value, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumGreaterThanOrEqualTo(Double value) {
            addCriterion("waste_num >=", value, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumLessThan(Double value) {
            addCriterion("waste_num <", value, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumLessThanOrEqualTo(Double value) {
            addCriterion("waste_num <=", value, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumIn(List<Double> values) {
            addCriterion("waste_num in", values, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumNotIn(List<Double> values) {
            addCriterion("waste_num not in", values, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumBetween(Double value1, Double value2) {
            addCriterion("waste_num between", value1, value2, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andWasteNumNotBetween(Double value1, Double value2) {
            addCriterion("waste_num not between", value1, value2, "wasteNum");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalIsNull() {
            addCriterion("change_original is null");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalIsNotNull() {
            addCriterion("change_original is not null");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalEqualTo(String value) {
            addCriterion("change_original =", value, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalNotEqualTo(String value) {
            addCriterion("change_original <>", value, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalGreaterThan(String value) {
            addCriterion("change_original >", value, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("change_original >=", value, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalLessThan(String value) {
            addCriterion("change_original <", value, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalLessThanOrEqualTo(String value) {
            addCriterion("change_original <=", value, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalLike(String value) {
            addCriterion("change_original like", value, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalNotLike(String value) {
            addCriterion("change_original not like", value, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalIn(List<String> values) {
            addCriterion("change_original in", values, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalNotIn(List<String> values) {
            addCriterion("change_original not in", values, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalBetween(String value1, String value2) {
            addCriterion("change_original between", value1, value2, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andChangeOriginalNotBetween(String value1, String value2) {
            addCriterion("change_original not between", value1, value2, "changeOriginal");
            return (Criteria) this;
        }

        public Criteria andFaultRecordIsNull() {
            addCriterion("fault_record is null");
            return (Criteria) this;
        }

        public Criteria andFaultRecordIsNotNull() {
            addCriterion("fault_record is not null");
            return (Criteria) this;
        }

        public Criteria andFaultRecordEqualTo(String value) {
            addCriterion("fault_record =", value, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordNotEqualTo(String value) {
            addCriterion("fault_record <>", value, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordGreaterThan(String value) {
            addCriterion("fault_record >", value, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordGreaterThanOrEqualTo(String value) {
            addCriterion("fault_record >=", value, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordLessThan(String value) {
            addCriterion("fault_record <", value, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordLessThanOrEqualTo(String value) {
            addCriterion("fault_record <=", value, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordLike(String value) {
            addCriterion("fault_record like", value, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordNotLike(String value) {
            addCriterion("fault_record not like", value, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordIn(List<String> values) {
            addCriterion("fault_record in", values, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordNotIn(List<String> values) {
            addCriterion("fault_record not in", values, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordBetween(String value1, String value2) {
            addCriterion("fault_record between", value1, value2, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andFaultRecordNotBetween(String value1, String value2) {
            addCriterion("fault_record not between", value1, value2, "faultRecord");
            return (Criteria) this;
        }

        public Criteria andRepairRecordIsNull() {
            addCriterion("repair_record is null");
            return (Criteria) this;
        }

        public Criteria andRepairRecordIsNotNull() {
            addCriterion("repair_record is not null");
            return (Criteria) this;
        }

        public Criteria andRepairRecordEqualTo(String value) {
            addCriterion("repair_record =", value, "repairRecord");
            return (Criteria) this;
        }

        public Criteria andRepairRecordNotEqualTo(String value) {
            addCriterion("repair_record <>", value, "repairRecord");
            return (Criteria) this;
        }

        public Criteria andRepairRecordGreaterThan(String value) {
            addCriterion("repair_record >", value, "repairRecord");
            return (Criteria) this;
        }

        public Criteria andRepairRecordGreaterThanOrEqualTo(String value) {
            addCriterion("repair_record >=", value, "repairRecord");
            return (Criteria) this;
        }

        public Criteria andRepairRecordLessThan(String value) {
            addCriterion("repair_record <", value, "repairRecord");
            return (Criteria) this;
        }

        public Criteria andRepairRecordLessThanOrEqualTo(String value) {
            addCriterion("repair_record <=", value, "repairRecord");
            return (Criteria) this;
        }

        public Criteria andRepairRecordLike(String value) {
            addCriterion("repair_record like", value, "repairRecord");
            return (Criteria) this;
        }

        public Criteria andRepairRecordNotLike(String value) {
            addCriterion("repair_record not like", value, "repairRecord");
            return (Criteria) this;
        }

        public Criteria andRepairRecordIn(List<String> values) {
            addCriterion("repair_record in", values, "repairRecord");
            return (Criteria) this;
        }

        public Criteria andRepairRecordNotIn(List<String> values) {
            addCriterion("repair_record not in", values, "repairRecord");
            return (Criteria) this;
        }

        public Criteria andRepairRecordBetween(String value1, String value2) {
            addCriterion("repair_record between", value1, value2, "repairRecord");
            return (Criteria) this;
        }

        public Criteria andRepairRecordNotBetween(String value1, String value2) {
            addCriterion("repair_record not between", value1, value2, "repairRecord");
            return (Criteria) this;
        }

        public Criteria andRepairAmountIsNull() {
            addCriterion("repair_amount is null");
            return (Criteria) this;
        }

        public Criteria andRepairAmountIsNotNull() {
            addCriterion("repair_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRepairAmountEqualTo(BigDecimal value) {
            addCriterion("repair_amount =", value, "repairAmount");
            return (Criteria) this;
        }

        public Criteria andRepairAmountNotEqualTo(BigDecimal value) {
            addCriterion("repair_amount <>", value, "repairAmount");
            return (Criteria) this;
        }

        public Criteria andRepairAmountGreaterThan(BigDecimal value) {
            addCriterion("repair_amount >", value, "repairAmount");
            return (Criteria) this;
        }

        public Criteria andRepairAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_amount >=", value, "repairAmount");
            return (Criteria) this;
        }

        public Criteria andRepairAmountLessThan(BigDecimal value) {
            addCriterion("repair_amount <", value, "repairAmount");
            return (Criteria) this;
        }

        public Criteria andRepairAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repair_amount <=", value, "repairAmount");
            return (Criteria) this;
        }

        public Criteria andRepairAmountIn(List<BigDecimal> values) {
            addCriterion("repair_amount in", values, "repairAmount");
            return (Criteria) this;
        }

        public Criteria andRepairAmountNotIn(List<BigDecimal> values) {
            addCriterion("repair_amount not in", values, "repairAmount");
            return (Criteria) this;
        }

        public Criteria andRepairAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_amount between", value1, value2, "repairAmount");
            return (Criteria) this;
        }

        public Criteria andRepairAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair_amount not between", value1, value2, "repairAmount");
            return (Criteria) this;
        }

        public Criteria andRepairReasonIsNull() {
            addCriterion("repair_reason is null");
            return (Criteria) this;
        }

        public Criteria andRepairReasonIsNotNull() {
            addCriterion("repair_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRepairReasonEqualTo(String value) {
            addCriterion("repair_reason =", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonNotEqualTo(String value) {
            addCriterion("repair_reason <>", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonGreaterThan(String value) {
            addCriterion("repair_reason >", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonGreaterThanOrEqualTo(String value) {
            addCriterion("repair_reason >=", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonLessThan(String value) {
            addCriterion("repair_reason <", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonLessThanOrEqualTo(String value) {
            addCriterion("repair_reason <=", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonLike(String value) {
            addCriterion("repair_reason like", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonNotLike(String value) {
            addCriterion("repair_reason not like", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonIn(List<String> values) {
            addCriterion("repair_reason in", values, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonNotIn(List<String> values) {
            addCriterion("repair_reason not in", values, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonBetween(String value1, String value2) {
            addCriterion("repair_reason between", value1, value2, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonNotBetween(String value1, String value2) {
            addCriterion("repair_reason not between", value1, value2, "repairReason");
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