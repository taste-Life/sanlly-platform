package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareInternalProcurementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareInternalProcurementExample() {
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

        public Criteria andWareInternalProcurementIdIsNull() {
            addCriterion("ware_internal_procurement_id is null");
            return (Criteria) this;
        }

        public Criteria andWareInternalProcurementIdIsNotNull() {
            addCriterion("ware_internal_procurement_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareInternalProcurementIdEqualTo(Integer value) {
            addCriterion("ware_internal_procurement_id =", value, "wareInternalProcurementId");
            return (Criteria) this;
        }

        public Criteria andWareInternalProcurementIdNotEqualTo(Integer value) {
            addCriterion("ware_internal_procurement_id <>", value, "wareInternalProcurementId");
            return (Criteria) this;
        }

        public Criteria andWareInternalProcurementIdGreaterThan(Integer value) {
            addCriterion("ware_internal_procurement_id >", value, "wareInternalProcurementId");
            return (Criteria) this;
        }

        public Criteria andWareInternalProcurementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_internal_procurement_id >=", value, "wareInternalProcurementId");
            return (Criteria) this;
        }

        public Criteria andWareInternalProcurementIdLessThan(Integer value) {
            addCriterion("ware_internal_procurement_id <", value, "wareInternalProcurementId");
            return (Criteria) this;
        }

        public Criteria andWareInternalProcurementIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_internal_procurement_id <=", value, "wareInternalProcurementId");
            return (Criteria) this;
        }

        public Criteria andWareInternalProcurementIdIn(List<Integer> values) {
            addCriterion("ware_internal_procurement_id in", values, "wareInternalProcurementId");
            return (Criteria) this;
        }

        public Criteria andWareInternalProcurementIdNotIn(List<Integer> values) {
            addCriterion("ware_internal_procurement_id not in", values, "wareInternalProcurementId");
            return (Criteria) this;
        }

        public Criteria andWareInternalProcurementIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_internal_procurement_id between", value1, value2, "wareInternalProcurementId");
            return (Criteria) this;
        }

        public Criteria andWareInternalProcurementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_internal_procurement_id not between", value1, value2, "wareInternalProcurementId");
            return (Criteria) this;
        }

        public Criteria andPurchasingOrderNoIsNull() {
            addCriterion("purchasing_order_no is null");
            return (Criteria) this;
        }

        public Criteria andPurchasingOrderNoIsNotNull() {
            addCriterion("purchasing_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasingOrderNoEqualTo(String value) {
            addCriterion("purchasing_order_no =", value, "purchasingOrderNo");
            return (Criteria) this;
        }

        public Criteria andPurchasingOrderNoNotEqualTo(String value) {
            addCriterion("purchasing_order_no <>", value, "purchasingOrderNo");
            return (Criteria) this;
        }

        public Criteria andPurchasingOrderNoGreaterThan(String value) {
            addCriterion("purchasing_order_no >", value, "purchasingOrderNo");
            return (Criteria) this;
        }

        public Criteria andPurchasingOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("purchasing_order_no >=", value, "purchasingOrderNo");
            return (Criteria) this;
        }

        public Criteria andPurchasingOrderNoLessThan(String value) {
            addCriterion("purchasing_order_no <", value, "purchasingOrderNo");
            return (Criteria) this;
        }

        public Criteria andPurchasingOrderNoLessThanOrEqualTo(String value) {
            addCriterion("purchasing_order_no <=", value, "purchasingOrderNo");
            return (Criteria) this;
        }

        public Criteria andPurchasingOrderNoLike(String value) {
            addCriterion("purchasing_order_no like", value, "purchasingOrderNo");
            return (Criteria) this;
        }

        public Criteria andPurchasingOrderNoNotLike(String value) {
            addCriterion("purchasing_order_no not like", value, "purchasingOrderNo");
            return (Criteria) this;
        }

        public Criteria andPurchasingOrderNoIn(List<String> values) {
            addCriterion("purchasing_order_no in", values, "purchasingOrderNo");
            return (Criteria) this;
        }

        public Criteria andPurchasingOrderNoNotIn(List<String> values) {
            addCriterion("purchasing_order_no not in", values, "purchasingOrderNo");
            return (Criteria) this;
        }

        public Criteria andPurchasingOrderNoBetween(String value1, String value2) {
            addCriterion("purchasing_order_no between", value1, value2, "purchasingOrderNo");
            return (Criteria) this;
        }

        public Criteria andPurchasingOrderNoNotBetween(String value1, String value2) {
            addCriterion("purchasing_order_no not between", value1, value2, "purchasingOrderNo");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIsNull() {
            addCriterion("applicant_user is null");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIsNotNull() {
            addCriterion("applicant_user is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantUserEqualTo(Integer value) {
            addCriterion("applicant_user =", value, "applicantUser");
            return (Criteria) this;
        }

        public Criteria andApplicantUserNotEqualTo(Integer value) {
            addCriterion("applicant_user <>", value, "applicantUser");
            return (Criteria) this;
        }

        public Criteria andApplicantUserGreaterThan(Integer value) {
            addCriterion("applicant_user >", value, "applicantUser");
            return (Criteria) this;
        }

        public Criteria andApplicantUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("applicant_user >=", value, "applicantUser");
            return (Criteria) this;
        }

        public Criteria andApplicantUserLessThan(Integer value) {
            addCriterion("applicant_user <", value, "applicantUser");
            return (Criteria) this;
        }

        public Criteria andApplicantUserLessThanOrEqualTo(Integer value) {
            addCriterion("applicant_user <=", value, "applicantUser");
            return (Criteria) this;
        }

        public Criteria andApplicantUserIn(List<Integer> values) {
            addCriterion("applicant_user in", values, "applicantUser");
            return (Criteria) this;
        }

        public Criteria andApplicantUserNotIn(List<Integer> values) {
            addCriterion("applicant_user not in", values, "applicantUser");
            return (Criteria) this;
        }

        public Criteria andApplicantUserBetween(Integer value1, Integer value2) {
            addCriterion("applicant_user between", value1, value2, "applicantUser");
            return (Criteria) this;
        }

        public Criteria andApplicantUserNotBetween(Integer value1, Integer value2) {
            addCriterion("applicant_user not between", value1, value2, "applicantUser");
            return (Criteria) this;
        }

        public Criteria andApplicantDateIsNull() {
            addCriterion("applicant_date is null");
            return (Criteria) this;
        }

        public Criteria andApplicantDateIsNotNull() {
            addCriterion("applicant_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantDateEqualTo(Date value) {
            addCriterion("applicant_date =", value, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andApplicantDateNotEqualTo(Date value) {
            addCriterion("applicant_date <>", value, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andApplicantDateGreaterThan(Date value) {
            addCriterion("applicant_date >", value, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andApplicantDateGreaterThanOrEqualTo(Date value) {
            addCriterion("applicant_date >=", value, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andApplicantDateLessThan(Date value) {
            addCriterion("applicant_date <", value, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andApplicantDateLessThanOrEqualTo(Date value) {
            addCriterion("applicant_date <=", value, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andApplicantDateIn(List<Date> values) {
            addCriterion("applicant_date in", values, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andApplicantDateNotIn(List<Date> values) {
            addCriterion("applicant_date not in", values, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andApplicantDateBetween(Date value1, Date value2) {
            addCriterion("applicant_date between", value1, value2, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andApplicantDateNotBetween(Date value1, Date value2) {
            addCriterion("applicant_date not between", value1, value2, "applicantDate");
            return (Criteria) this;
        }

        public Criteria andChargeStatusIsNull() {
            addCriterion("charge_status is null");
            return (Criteria) this;
        }

        public Criteria andChargeStatusIsNotNull() {
            addCriterion("charge_status is not null");
            return (Criteria) this;
        }

        public Criteria andChargeStatusEqualTo(String value) {
            addCriterion("charge_status =", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusNotEqualTo(String value) {
            addCriterion("charge_status <>", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusGreaterThan(String value) {
            addCriterion("charge_status >", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("charge_status >=", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusLessThan(String value) {
            addCriterion("charge_status <", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusLessThanOrEqualTo(String value) {
            addCriterion("charge_status <=", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusLike(String value) {
            addCriterion("charge_status like", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusNotLike(String value) {
            addCriterion("charge_status not like", value, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusIn(List<String> values) {
            addCriterion("charge_status in", values, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusNotIn(List<String> values) {
            addCriterion("charge_status not in", values, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusBetween(String value1, String value2) {
            addCriterion("charge_status between", value1, value2, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andChargeStatusNotBetween(String value1, String value2) {
            addCriterion("charge_status not between", value1, value2, "chargeStatus");
            return (Criteria) this;
        }

        public Criteria andReceivingAddressIsNull() {
            addCriterion("receiving_address is null");
            return (Criteria) this;
        }

        public Criteria andReceivingAddressIsNotNull() {
            addCriterion("receiving_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingAddressEqualTo(String value) {
            addCriterion("receiving_address =", value, "receivingAddress");
            return (Criteria) this;
        }

        public Criteria andReceivingAddressNotEqualTo(String value) {
            addCriterion("receiving_address <>", value, "receivingAddress");
            return (Criteria) this;
        }

        public Criteria andReceivingAddressGreaterThan(String value) {
            addCriterion("receiving_address >", value, "receivingAddress");
            return (Criteria) this;
        }

        public Criteria andReceivingAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receiving_address >=", value, "receivingAddress");
            return (Criteria) this;
        }

        public Criteria andReceivingAddressLessThan(String value) {
            addCriterion("receiving_address <", value, "receivingAddress");
            return (Criteria) this;
        }

        public Criteria andReceivingAddressLessThanOrEqualTo(String value) {
            addCriterion("receiving_address <=", value, "receivingAddress");
            return (Criteria) this;
        }

        public Criteria andReceivingAddressLike(String value) {
            addCriterion("receiving_address like", value, "receivingAddress");
            return (Criteria) this;
        }

        public Criteria andReceivingAddressNotLike(String value) {
            addCriterion("receiving_address not like", value, "receivingAddress");
            return (Criteria) this;
        }

        public Criteria andReceivingAddressIn(List<String> values) {
            addCriterion("receiving_address in", values, "receivingAddress");
            return (Criteria) this;
        }

        public Criteria andReceivingAddressNotIn(List<String> values) {
            addCriterion("receiving_address not in", values, "receivingAddress");
            return (Criteria) this;
        }

        public Criteria andReceivingAddressBetween(String value1, String value2) {
            addCriterion("receiving_address between", value1, value2, "receivingAddress");
            return (Criteria) this;
        }

        public Criteria andReceivingAddressNotBetween(String value1, String value2) {
            addCriterion("receiving_address not between", value1, value2, "receivingAddress");
            return (Criteria) this;
        }

        public Criteria andIntWarehouseIsNull() {
            addCriterion("int_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andIntWarehouseIsNotNull() {
            addCriterion("int_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andIntWarehouseEqualTo(String value) {
            addCriterion("int_warehouse =", value, "intWarehouse");
            return (Criteria) this;
        }

        public Criteria andIntWarehouseNotEqualTo(String value) {
            addCriterion("int_warehouse <>", value, "intWarehouse");
            return (Criteria) this;
        }

        public Criteria andIntWarehouseGreaterThan(String value) {
            addCriterion("int_warehouse >", value, "intWarehouse");
            return (Criteria) this;
        }

        public Criteria andIntWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("int_warehouse >=", value, "intWarehouse");
            return (Criteria) this;
        }

        public Criteria andIntWarehouseLessThan(String value) {
            addCriterion("int_warehouse <", value, "intWarehouse");
            return (Criteria) this;
        }

        public Criteria andIntWarehouseLessThanOrEqualTo(String value) {
            addCriterion("int_warehouse <=", value, "intWarehouse");
            return (Criteria) this;
        }

        public Criteria andIntWarehouseLike(String value) {
            addCriterion("int_warehouse like", value, "intWarehouse");
            return (Criteria) this;
        }

        public Criteria andIntWarehouseNotLike(String value) {
            addCriterion("int_warehouse not like", value, "intWarehouse");
            return (Criteria) this;
        }

        public Criteria andIntWarehouseIn(List<String> values) {
            addCriterion("int_warehouse in", values, "intWarehouse");
            return (Criteria) this;
        }

        public Criteria andIntWarehouseNotIn(List<String> values) {
            addCriterion("int_warehouse not in", values, "intWarehouse");
            return (Criteria) this;
        }

        public Criteria andIntWarehouseBetween(String value1, String value2) {
            addCriterion("int_warehouse between", value1, value2, "intWarehouse");
            return (Criteria) this;
        }

        public Criteria andIntWarehouseNotBetween(String value1, String value2) {
            addCriterion("int_warehouse not between", value1, value2, "intWarehouse");
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

        public Criteria andOutWarehouseIsNull() {
            addCriterion("out_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseIsNotNull() {
            addCriterion("out_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseEqualTo(String value) {
            addCriterion("out_warehouse =", value, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNotEqualTo(String value) {
            addCriterion("out_warehouse <>", value, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseGreaterThan(String value) {
            addCriterion("out_warehouse >", value, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("out_warehouse >=", value, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseLessThan(String value) {
            addCriterion("out_warehouse <", value, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseLessThanOrEqualTo(String value) {
            addCriterion("out_warehouse <=", value, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseLike(String value) {
            addCriterion("out_warehouse like", value, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNotLike(String value) {
            addCriterion("out_warehouse not like", value, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseIn(List<String> values) {
            addCriterion("out_warehouse in", values, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNotIn(List<String> values) {
            addCriterion("out_warehouse not in", values, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseBetween(String value1, String value2) {
            addCriterion("out_warehouse between", value1, value2, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseNotBetween(String value1, String value2) {
            addCriterion("out_warehouse not between", value1, value2, "outWarehouse");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
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

        public Criteria andReceivingUserIsNull() {
            addCriterion("receiving_user is null");
            return (Criteria) this;
        }

        public Criteria andReceivingUserIsNotNull() {
            addCriterion("receiving_user is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingUserEqualTo(String value) {
            addCriterion("receiving_user =", value, "receivingUser");
            return (Criteria) this;
        }

        public Criteria andReceivingUserNotEqualTo(String value) {
            addCriterion("receiving_user <>", value, "receivingUser");
            return (Criteria) this;
        }

        public Criteria andReceivingUserGreaterThan(String value) {
            addCriterion("receiving_user >", value, "receivingUser");
            return (Criteria) this;
        }

        public Criteria andReceivingUserGreaterThanOrEqualTo(String value) {
            addCriterion("receiving_user >=", value, "receivingUser");
            return (Criteria) this;
        }

        public Criteria andReceivingUserLessThan(String value) {
            addCriterion("receiving_user <", value, "receivingUser");
            return (Criteria) this;
        }

        public Criteria andReceivingUserLessThanOrEqualTo(String value) {
            addCriterion("receiving_user <=", value, "receivingUser");
            return (Criteria) this;
        }

        public Criteria andReceivingUserLike(String value) {
            addCriterion("receiving_user like", value, "receivingUser");
            return (Criteria) this;
        }

        public Criteria andReceivingUserNotLike(String value) {
            addCriterion("receiving_user not like", value, "receivingUser");
            return (Criteria) this;
        }

        public Criteria andReceivingUserIn(List<String> values) {
            addCriterion("receiving_user in", values, "receivingUser");
            return (Criteria) this;
        }

        public Criteria andReceivingUserNotIn(List<String> values) {
            addCriterion("receiving_user not in", values, "receivingUser");
            return (Criteria) this;
        }

        public Criteria andReceivingUserBetween(String value1, String value2) {
            addCriterion("receiving_user between", value1, value2, "receivingUser");
            return (Criteria) this;
        }

        public Criteria andReceivingUserNotBetween(String value1, String value2) {
            addCriterion("receiving_user not between", value1, value2, "receivingUser");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIsNull() {
            addCriterion("exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIsNotNull() {
            addCriterion("exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateEqualTo(BigDecimal value) {
            addCriterion("exchange_rate =", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotEqualTo(BigDecimal value) {
            addCriterion("exchange_rate <>", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThan(BigDecimal value) {
            addCriterion("exchange_rate >", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_rate >=", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThan(BigDecimal value) {
            addCriterion("exchange_rate <", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_rate <=", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIn(List<BigDecimal> values) {
            addCriterion("exchange_rate in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotIn(List<BigDecimal> values) {
            addCriterion("exchange_rate not in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_rate between", value1, value2, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_rate not between", value1, value2, "exchangeRate");
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