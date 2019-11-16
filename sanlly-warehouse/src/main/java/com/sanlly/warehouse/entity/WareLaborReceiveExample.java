package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareLaborReceiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareLaborReceiveExample() {
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

        public Criteria andWareLaborReceiveIdIsNull() {
            addCriterion("ware_labor_receive_id is null");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveIdIsNotNull() {
            addCriterion("ware_labor_receive_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveIdEqualTo(Integer value) {
            addCriterion("ware_labor_receive_id =", value, "wareLaborReceiveId");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveIdNotEqualTo(Integer value) {
            addCriterion("ware_labor_receive_id <>", value, "wareLaborReceiveId");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveIdGreaterThan(Integer value) {
            addCriterion("ware_labor_receive_id >", value, "wareLaborReceiveId");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_labor_receive_id >=", value, "wareLaborReceiveId");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveIdLessThan(Integer value) {
            addCriterion("ware_labor_receive_id <", value, "wareLaborReceiveId");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_labor_receive_id <=", value, "wareLaborReceiveId");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveIdIn(List<Integer> values) {
            addCriterion("ware_labor_receive_id in", values, "wareLaborReceiveId");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveIdNotIn(List<Integer> values) {
            addCriterion("ware_labor_receive_id not in", values, "wareLaborReceiveId");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_labor_receive_id between", value1, value2, "wareLaborReceiveId");
            return (Criteria) this;
        }

        public Criteria andWareLaborReceiveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_labor_receive_id not between", value1, value2, "wareLaborReceiveId");
            return (Criteria) this;
        }

        public Criteria andLaborReceiveIsNull() {
            addCriterion("labor_receive is null");
            return (Criteria) this;
        }

        public Criteria andLaborReceiveIsNotNull() {
            addCriterion("labor_receive is not null");
            return (Criteria) this;
        }

        public Criteria andLaborReceiveEqualTo(Integer value) {
            addCriterion("labor_receive =", value, "laborReceive");
            return (Criteria) this;
        }

        public Criteria andLaborReceiveNotEqualTo(Integer value) {
            addCriterion("labor_receive <>", value, "laborReceive");
            return (Criteria) this;
        }

        public Criteria andLaborReceiveGreaterThan(Integer value) {
            addCriterion("labor_receive >", value, "laborReceive");
            return (Criteria) this;
        }

        public Criteria andLaborReceiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("labor_receive >=", value, "laborReceive");
            return (Criteria) this;
        }

        public Criteria andLaborReceiveLessThan(Integer value) {
            addCriterion("labor_receive <", value, "laborReceive");
            return (Criteria) this;
        }

        public Criteria andLaborReceiveLessThanOrEqualTo(Integer value) {
            addCriterion("labor_receive <=", value, "laborReceive");
            return (Criteria) this;
        }

        public Criteria andLaborReceiveIn(List<Integer> values) {
            addCriterion("labor_receive in", values, "laborReceive");
            return (Criteria) this;
        }

        public Criteria andLaborReceiveNotIn(List<Integer> values) {
            addCriterion("labor_receive not in", values, "laborReceive");
            return (Criteria) this;
        }

        public Criteria andLaborReceiveBetween(Integer value1, Integer value2) {
            addCriterion("labor_receive between", value1, value2, "laborReceive");
            return (Criteria) this;
        }

        public Criteria andLaborReceiveNotBetween(Integer value1, Integer value2) {
            addCriterion("labor_receive not between", value1, value2, "laborReceive");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoIsNull() {
            addCriterion("advance_warehouse_receipt_no is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoIsNotNull() {
            addCriterion("advance_warehouse_receipt_no is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoEqualTo(String value) {
            addCriterion("advance_warehouse_receipt_no =", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoNotEqualTo(String value) {
            addCriterion("advance_warehouse_receipt_no <>", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoGreaterThan(String value) {
            addCriterion("advance_warehouse_receipt_no >", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoGreaterThanOrEqualTo(String value) {
            addCriterion("advance_warehouse_receipt_no >=", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoLessThan(String value) {
            addCriterion("advance_warehouse_receipt_no <", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoLessThanOrEqualTo(String value) {
            addCriterion("advance_warehouse_receipt_no <=", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoLike(String value) {
            addCriterion("advance_warehouse_receipt_no like", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoNotLike(String value) {
            addCriterion("advance_warehouse_receipt_no not like", value, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoIn(List<String> values) {
            addCriterion("advance_warehouse_receipt_no in", values, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoNotIn(List<String> values) {
            addCriterion("advance_warehouse_receipt_no not in", values, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoBetween(String value1, String value2) {
            addCriterion("advance_warehouse_receipt_no between", value1, value2, "advanceWarehouseReceiptNo");
            return (Criteria) this;
        }

        public Criteria andAdvanceWarehouseReceiptNoNotBetween(String value1, String value2) {
            addCriterion("advance_warehouse_receipt_no not between", value1, value2, "advanceWarehouseReceiptNo");
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

        public Criteria andApplicantDepartmentIsNull() {
            addCriterion("applicant_department is null");
            return (Criteria) this;
        }

        public Criteria andApplicantDepartmentIsNotNull() {
            addCriterion("applicant_department is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantDepartmentEqualTo(String value) {
            addCriterion("applicant_department =", value, "applicantDepartment");
            return (Criteria) this;
        }

        public Criteria andApplicantDepartmentNotEqualTo(String value) {
            addCriterion("applicant_department <>", value, "applicantDepartment");
            return (Criteria) this;
        }

        public Criteria andApplicantDepartmentGreaterThan(String value) {
            addCriterion("applicant_department >", value, "applicantDepartment");
            return (Criteria) this;
        }

        public Criteria andApplicantDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("applicant_department >=", value, "applicantDepartment");
            return (Criteria) this;
        }

        public Criteria andApplicantDepartmentLessThan(String value) {
            addCriterion("applicant_department <", value, "applicantDepartment");
            return (Criteria) this;
        }

        public Criteria andApplicantDepartmentLessThanOrEqualTo(String value) {
            addCriterion("applicant_department <=", value, "applicantDepartment");
            return (Criteria) this;
        }

        public Criteria andApplicantDepartmentLike(String value) {
            addCriterion("applicant_department like", value, "applicantDepartment");
            return (Criteria) this;
        }

        public Criteria andApplicantDepartmentNotLike(String value) {
            addCriterion("applicant_department not like", value, "applicantDepartment");
            return (Criteria) this;
        }

        public Criteria andApplicantDepartmentIn(List<String> values) {
            addCriterion("applicant_department in", values, "applicantDepartment");
            return (Criteria) this;
        }

        public Criteria andApplicantDepartmentNotIn(List<String> values) {
            addCriterion("applicant_department not in", values, "applicantDepartment");
            return (Criteria) this;
        }

        public Criteria andApplicantDepartmentBetween(String value1, String value2) {
            addCriterion("applicant_department between", value1, value2, "applicantDepartment");
            return (Criteria) this;
        }

        public Criteria andApplicantDepartmentNotBetween(String value1, String value2) {
            addCriterion("applicant_department not between", value1, value2, "applicantDepartment");
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

        public Criteria andApplicantTypeIsNull() {
            addCriterion("applicant_type is null");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeIsNotNull() {
            addCriterion("applicant_type is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeEqualTo(String value) {
            addCriterion("applicant_type =", value, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeNotEqualTo(String value) {
            addCriterion("applicant_type <>", value, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeGreaterThan(String value) {
            addCriterion("applicant_type >", value, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeGreaterThanOrEqualTo(String value) {
            addCriterion("applicant_type >=", value, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeLessThan(String value) {
            addCriterion("applicant_type <", value, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeLessThanOrEqualTo(String value) {
            addCriterion("applicant_type <=", value, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeLike(String value) {
            addCriterion("applicant_type like", value, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeNotLike(String value) {
            addCriterion("applicant_type not like", value, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeIn(List<String> values) {
            addCriterion("applicant_type in", values, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeNotIn(List<String> values) {
            addCriterion("applicant_type not in", values, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeBetween(String value1, String value2) {
            addCriterion("applicant_type between", value1, value2, "applicantType");
            return (Criteria) this;
        }

        public Criteria andApplicantTypeNotBetween(String value1, String value2) {
            addCriterion("applicant_type not between", value1, value2, "applicantType");
            return (Criteria) this;
        }

        public Criteria andBillAmountIsNull() {
            addCriterion("bill_amount is null");
            return (Criteria) this;
        }

        public Criteria andBillAmountIsNotNull() {
            addCriterion("bill_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBillAmountEqualTo(BigDecimal value) {
            addCriterion("bill_amount =", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountNotEqualTo(BigDecimal value) {
            addCriterion("bill_amount <>", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountGreaterThan(BigDecimal value) {
            addCriterion("bill_amount >", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bill_amount >=", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountLessThan(BigDecimal value) {
            addCriterion("bill_amount <", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bill_amount <=", value, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountIn(List<BigDecimal> values) {
            addCriterion("bill_amount in", values, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountNotIn(List<BigDecimal> values) {
            addCriterion("bill_amount not in", values, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bill_amount between", value1, value2, "billAmount");
            return (Criteria) this;
        }

        public Criteria andBillAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bill_amount not between", value1, value2, "billAmount");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusIsNull() {
            addCriterion("stockout_status is null");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusIsNotNull() {
            addCriterion("stockout_status is not null");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusEqualTo(String value) {
            addCriterion("stockout_status =", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusNotEqualTo(String value) {
            addCriterion("stockout_status <>", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusGreaterThan(String value) {
            addCriterion("stockout_status >", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusGreaterThanOrEqualTo(String value) {
            addCriterion("stockout_status >=", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusLessThan(String value) {
            addCriterion("stockout_status <", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusLessThanOrEqualTo(String value) {
            addCriterion("stockout_status <=", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusLike(String value) {
            addCriterion("stockout_status like", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusNotLike(String value) {
            addCriterion("stockout_status not like", value, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusIn(List<String> values) {
            addCriterion("stockout_status in", values, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusNotIn(List<String> values) {
            addCriterion("stockout_status not in", values, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusBetween(String value1, String value2) {
            addCriterion("stockout_status between", value1, value2, "stockoutStatus");
            return (Criteria) this;
        }

        public Criteria andStockoutStatusNotBetween(String value1, String value2) {
            addCriterion("stockout_status not between", value1, value2, "stockoutStatus");
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

        public Criteria andApplicantDetailsIsNull() {
            addCriterion("applicant_details is null");
            return (Criteria) this;
        }

        public Criteria andApplicantDetailsIsNotNull() {
            addCriterion("applicant_details is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantDetailsEqualTo(String value) {
            addCriterion("applicant_details =", value, "applicantDetails");
            return (Criteria) this;
        }

        public Criteria andApplicantDetailsNotEqualTo(String value) {
            addCriterion("applicant_details <>", value, "applicantDetails");
            return (Criteria) this;
        }

        public Criteria andApplicantDetailsGreaterThan(String value) {
            addCriterion("applicant_details >", value, "applicantDetails");
            return (Criteria) this;
        }

        public Criteria andApplicantDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("applicant_details >=", value, "applicantDetails");
            return (Criteria) this;
        }

        public Criteria andApplicantDetailsLessThan(String value) {
            addCriterion("applicant_details <", value, "applicantDetails");
            return (Criteria) this;
        }

        public Criteria andApplicantDetailsLessThanOrEqualTo(String value) {
            addCriterion("applicant_details <=", value, "applicantDetails");
            return (Criteria) this;
        }

        public Criteria andApplicantDetailsLike(String value) {
            addCriterion("applicant_details like", value, "applicantDetails");
            return (Criteria) this;
        }

        public Criteria andApplicantDetailsNotLike(String value) {
            addCriterion("applicant_details not like", value, "applicantDetails");
            return (Criteria) this;
        }

        public Criteria andApplicantDetailsIn(List<String> values) {
            addCriterion("applicant_details in", values, "applicantDetails");
            return (Criteria) this;
        }

        public Criteria andApplicantDetailsNotIn(List<String> values) {
            addCriterion("applicant_details not in", values, "applicantDetails");
            return (Criteria) this;
        }

        public Criteria andApplicantDetailsBetween(String value1, String value2) {
            addCriterion("applicant_details between", value1, value2, "applicantDetails");
            return (Criteria) this;
        }

        public Criteria andApplicantDetailsNotBetween(String value1, String value2) {
            addCriterion("applicant_details not between", value1, value2, "applicantDetails");
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