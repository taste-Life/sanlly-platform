package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareMaintainPresentationDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareMaintainPresentationDetailExample() {
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

        public Criteria andWareMaintainPresentationDetailIdIsNull() {
            addCriterion("ware_maintain_presentation_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationDetailIdIsNotNull() {
            addCriterion("ware_maintain_presentation_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationDetailIdEqualTo(Integer value) {
            addCriterion("ware_maintain_presentation_detail_id =", value, "wareMaintainPresentationDetailId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationDetailIdNotEqualTo(Integer value) {
            addCriterion("ware_maintain_presentation_detail_id <>", value, "wareMaintainPresentationDetailId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationDetailIdGreaterThan(Integer value) {
            addCriterion("ware_maintain_presentation_detail_id >", value, "wareMaintainPresentationDetailId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_maintain_presentation_detail_id >=", value, "wareMaintainPresentationDetailId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationDetailIdLessThan(Integer value) {
            addCriterion("ware_maintain_presentation_detail_id <", value, "wareMaintainPresentationDetailId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_maintain_presentation_detail_id <=", value, "wareMaintainPresentationDetailId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationDetailIdIn(List<Integer> values) {
            addCriterion("ware_maintain_presentation_detail_id in", values, "wareMaintainPresentationDetailId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationDetailIdNotIn(List<Integer> values) {
            addCriterion("ware_maintain_presentation_detail_id not in", values, "wareMaintainPresentationDetailId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_maintain_presentation_detail_id between", value1, value2, "wareMaintainPresentationDetailId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_maintain_presentation_detail_id not between", value1, value2, "wareMaintainPresentationDetailId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationIsNull() {
            addCriterion("ware_maintain_presentation is null");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationIsNotNull() {
            addCriterion("ware_maintain_presentation is not null");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationEqualTo(Integer value) {
            addCriterion("ware_maintain_presentation =", value, "wareMaintainPresentation");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationNotEqualTo(Integer value) {
            addCriterion("ware_maintain_presentation <>", value, "wareMaintainPresentation");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationGreaterThan(Integer value) {
            addCriterion("ware_maintain_presentation >", value, "wareMaintainPresentation");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_maintain_presentation >=", value, "wareMaintainPresentation");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationLessThan(Integer value) {
            addCriterion("ware_maintain_presentation <", value, "wareMaintainPresentation");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationLessThanOrEqualTo(Integer value) {
            addCriterion("ware_maintain_presentation <=", value, "wareMaintainPresentation");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationIn(List<Integer> values) {
            addCriterion("ware_maintain_presentation in", values, "wareMaintainPresentation");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationNotIn(List<Integer> values) {
            addCriterion("ware_maintain_presentation not in", values, "wareMaintainPresentation");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationBetween(Integer value1, Integer value2) {
            addCriterion("ware_maintain_presentation between", value1, value2, "wareMaintainPresentation");
            return (Criteria) this;
        }

        public Criteria andWareMaintainPresentationNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_maintain_presentation not between", value1, value2, "wareMaintainPresentation");
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

        public Criteria andSparePartsNumIsNull() {
            addCriterion("spare_parts_num is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumIsNotNull() {
            addCriterion("spare_parts_num is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumEqualTo(Double value) {
            addCriterion("spare_parts_num =", value, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumNotEqualTo(Double value) {
            addCriterion("spare_parts_num <>", value, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumGreaterThan(Double value) {
            addCriterion("spare_parts_num >", value, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumGreaterThanOrEqualTo(Double value) {
            addCriterion("spare_parts_num >=", value, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumLessThan(Double value) {
            addCriterion("spare_parts_num <", value, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumLessThanOrEqualTo(Double value) {
            addCriterion("spare_parts_num <=", value, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumIn(List<Double> values) {
            addCriterion("spare_parts_num in", values, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumNotIn(List<Double> values) {
            addCriterion("spare_parts_num not in", values, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumBetween(Double value1, Double value2) {
            addCriterion("spare_parts_num between", value1, value2, "sparePartsNum");
            return (Criteria) this;
        }

        public Criteria andSparePartsNumNotBetween(Double value1, Double value2) {
            addCriterion("spare_parts_num not between", value1, value2, "sparePartsNum");
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