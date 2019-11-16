package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UnitRepairEntryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public UnitRepairEntryExample() {
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

        public Criteria andProdUnitRepairEntryIdIsNull() {
            addCriterion("prod_unit_repair_entry_id is null");
            return (Criteria) this;
        }

        public Criteria andProdUnitRepairEntryIdIsNotNull() {
            addCriterion("prod_unit_repair_entry_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdUnitRepairEntryIdEqualTo(Integer value) {
            addCriterion("prod_unit_repair_entry_id =", value, "prodUnitRepairEntryId");
            return (Criteria) this;
        }

        public Criteria andProdUnitRepairEntryIdNotEqualTo(Integer value) {
            addCriterion("prod_unit_repair_entry_id <>", value, "prodUnitRepairEntryId");
            return (Criteria) this;
        }

        public Criteria andProdUnitRepairEntryIdGreaterThan(Integer value) {
            addCriterion("prod_unit_repair_entry_id >", value, "prodUnitRepairEntryId");
            return (Criteria) this;
        }

        public Criteria andProdUnitRepairEntryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_unit_repair_entry_id >=", value, "prodUnitRepairEntryId");
            return (Criteria) this;
        }

        public Criteria andProdUnitRepairEntryIdLessThan(Integer value) {
            addCriterion("prod_unit_repair_entry_id <", value, "prodUnitRepairEntryId");
            return (Criteria) this;
        }

        public Criteria andProdUnitRepairEntryIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_unit_repair_entry_id <=", value, "prodUnitRepairEntryId");
            return (Criteria) this;
        }

        public Criteria andProdUnitRepairEntryIdIn(List<Integer> values) {
            addCriterion("prod_unit_repair_entry_id in", values, "prodUnitRepairEntryId");
            return (Criteria) this;
        }

        public Criteria andProdUnitRepairEntryIdNotIn(List<Integer> values) {
            addCriterion("prod_unit_repair_entry_id not in", values, "prodUnitRepairEntryId");
            return (Criteria) this;
        }

        public Criteria andProdUnitRepairEntryIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_unit_repair_entry_id between", value1, value2, "prodUnitRepairEntryId");
            return (Criteria) this;
        }

        public Criteria andProdUnitRepairEntryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_unit_repair_entry_id not between", value1, value2, "prodUnitRepairEntryId");
            return (Criteria) this;
        }

        public Criteria andUnitRepairIsNull() {
            addCriterion("unit_repair is null");
            return (Criteria) this;
        }

        public Criteria andUnitRepairIsNotNull() {
            addCriterion("unit_repair is not null");
            return (Criteria) this;
        }

        public Criteria andUnitRepairEqualTo(Integer value) {
            addCriterion("unit_repair =", value, "unitRepair");
            return (Criteria) this;
        }

        public Criteria andUnitRepairNotEqualTo(Integer value) {
            addCriterion("unit_repair <>", value, "unitRepair");
            return (Criteria) this;
        }

        public Criteria andUnitRepairGreaterThan(Integer value) {
            addCriterion("unit_repair >", value, "unitRepair");
            return (Criteria) this;
        }

        public Criteria andUnitRepairGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit_repair >=", value, "unitRepair");
            return (Criteria) this;
        }

        public Criteria andUnitRepairLessThan(Integer value) {
            addCriterion("unit_repair <", value, "unitRepair");
            return (Criteria) this;
        }

        public Criteria andUnitRepairLessThanOrEqualTo(Integer value) {
            addCriterion("unit_repair <=", value, "unitRepair");
            return (Criteria) this;
        }

        public Criteria andUnitRepairIn(List<Integer> values) {
            addCriterion("unit_repair in", values, "unitRepair");
            return (Criteria) this;
        }

        public Criteria andUnitRepairNotIn(List<Integer> values) {
            addCriterion("unit_repair not in", values, "unitRepair");
            return (Criteria) this;
        }

        public Criteria andUnitRepairBetween(Integer value1, Integer value2) {
            addCriterion("unit_repair between", value1, value2, "unitRepair");
            return (Criteria) this;
        }

        public Criteria andUnitRepairNotBetween(Integer value1, Integer value2) {
            addCriterion("unit_repair not between", value1, value2, "unitRepair");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeIsNull() {
            addCriterion("parts_type_code is null");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeIsNotNull() {
            addCriterion("parts_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeEqualTo(String value) {
            addCriterion("parts_type_code =", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeNotEqualTo(String value) {
            addCriterion("parts_type_code <>", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeGreaterThan(String value) {
            addCriterion("parts_type_code >", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parts_type_code >=", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeLessThan(String value) {
            addCriterion("parts_type_code <", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("parts_type_code <=", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeLike(String value) {
            addCriterion("parts_type_code like", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeNotLike(String value) {
            addCriterion("parts_type_code not like", value, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeIn(List<String> values) {
            addCriterion("parts_type_code in", values, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeNotIn(List<String> values) {
            addCriterion("parts_type_code not in", values, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeBetween(String value1, String value2) {
            addCriterion("parts_type_code between", value1, value2, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsTypeCodeNotBetween(String value1, String value2) {
            addCriterion("parts_type_code not between", value1, value2, "partsTypeCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeIsNull() {
            addCriterion("parts_details_code is null");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeIsNotNull() {
            addCriterion("parts_details_code is not null");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeEqualTo(String value) {
            addCriterion("parts_details_code =", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeNotEqualTo(String value) {
            addCriterion("parts_details_code <>", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeGreaterThan(String value) {
            addCriterion("parts_details_code >", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parts_details_code >=", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeLessThan(String value) {
            addCriterion("parts_details_code <", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeLessThanOrEqualTo(String value) {
            addCriterion("parts_details_code <=", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeLike(String value) {
            addCriterion("parts_details_code like", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeNotLike(String value) {
            addCriterion("parts_details_code not like", value, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeIn(List<String> values) {
            addCriterion("parts_details_code in", values, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeNotIn(List<String> values) {
            addCriterion("parts_details_code not in", values, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeBetween(String value1, String value2) {
            addCriterion("parts_details_code between", value1, value2, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andPartsDetailsCodeNotBetween(String value1, String value2) {
            addCriterion("parts_details_code not between", value1, value2, "partsDetailsCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeIsNull() {
            addCriterion("damage_code is null");
            return (Criteria) this;
        }

        public Criteria andDamageCodeIsNotNull() {
            addCriterion("damage_code is not null");
            return (Criteria) this;
        }

        public Criteria andDamageCodeEqualTo(String value) {
            addCriterion("damage_code =", value, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeNotEqualTo(String value) {
            addCriterion("damage_code <>", value, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeGreaterThan(String value) {
            addCriterion("damage_code >", value, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("damage_code >=", value, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeLessThan(String value) {
            addCriterion("damage_code <", value, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeLessThanOrEqualTo(String value) {
            addCriterion("damage_code <=", value, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeLike(String value) {
            addCriterion("damage_code like", value, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeNotLike(String value) {
            addCriterion("damage_code not like", value, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeIn(List<String> values) {
            addCriterion("damage_code in", values, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeNotIn(List<String> values) {
            addCriterion("damage_code not in", values, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeBetween(String value1, String value2) {
            addCriterion("damage_code between", value1, value2, "damageCode");
            return (Criteria) this;
        }

        public Criteria andDamageCodeNotBetween(String value1, String value2) {
            addCriterion("damage_code not between", value1, value2, "damageCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeIsNull() {
            addCriterion("repair_code is null");
            return (Criteria) this;
        }

        public Criteria andRepairCodeIsNotNull() {
            addCriterion("repair_code is not null");
            return (Criteria) this;
        }

        public Criteria andRepairCodeEqualTo(String value) {
            addCriterion("repair_code =", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeNotEqualTo(String value) {
            addCriterion("repair_code <>", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeGreaterThan(String value) {
            addCriterion("repair_code >", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeGreaterThanOrEqualTo(String value) {
            addCriterion("repair_code >=", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeLessThan(String value) {
            addCriterion("repair_code <", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeLessThanOrEqualTo(String value) {
            addCriterion("repair_code <=", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeLike(String value) {
            addCriterion("repair_code like", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeNotLike(String value) {
            addCriterion("repair_code not like", value, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeIn(List<String> values) {
            addCriterion("repair_code in", values, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeNotIn(List<String> values) {
            addCriterion("repair_code not in", values, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeBetween(String value1, String value2) {
            addCriterion("repair_code between", value1, value2, "repairCode");
            return (Criteria) this;
        }

        public Criteria andRepairCodeNotBetween(String value1, String value2) {
            addCriterion("repair_code not between", value1, value2, "repairCode");
            return (Criteria) this;
        }

        public Criteria andSparesNumberIsNull() {
            addCriterion("spares_number is null");
            return (Criteria) this;
        }

        public Criteria andSparesNumberIsNotNull() {
            addCriterion("spares_number is not null");
            return (Criteria) this;
        }

        public Criteria andSparesNumberEqualTo(String value) {
            addCriterion("spares_number =", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberNotEqualTo(String value) {
            addCriterion("spares_number <>", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberGreaterThan(String value) {
            addCriterion("spares_number >", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberGreaterThanOrEqualTo(String value) {
            addCriterion("spares_number >=", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberLessThan(String value) {
            addCriterion("spares_number <", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberLessThanOrEqualTo(String value) {
            addCriterion("spares_number <=", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberLike(String value) {
            addCriterion("spares_number like", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberNotLike(String value) {
            addCriterion("spares_number not like", value, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberIn(List<String> values) {
            addCriterion("spares_number in", values, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberNotIn(List<String> values) {
            addCriterion("spares_number not in", values, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberBetween(String value1, String value2) {
            addCriterion("spares_number between", value1, value2, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andSparesNumberNotBetween(String value1, String value2) {
            addCriterion("spares_number not between", value1, value2, "sparesNumber");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Double value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Double value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Double value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Double value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Double value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Double value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Double> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Double> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Double value1, Double value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Double value1, Double value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksIsNull() {
            addCriterion("repair_remarks is null");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksIsNotNull() {
            addCriterion("repair_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksEqualTo(String value) {
            addCriterion("repair_remarks =", value, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksNotEqualTo(String value) {
            addCriterion("repair_remarks <>", value, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksGreaterThan(String value) {
            addCriterion("repair_remarks >", value, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("repair_remarks >=", value, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksLessThan(String value) {
            addCriterion("repair_remarks <", value, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksLessThanOrEqualTo(String value) {
            addCriterion("repair_remarks <=", value, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksLike(String value) {
            addCriterion("repair_remarks like", value, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksNotLike(String value) {
            addCriterion("repair_remarks not like", value, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksIn(List<String> values) {
            addCriterion("repair_remarks in", values, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksNotIn(List<String> values) {
            addCriterion("repair_remarks not in", values, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksBetween(String value1, String value2) {
            addCriterion("repair_remarks between", value1, value2, "repairRemarks");
            return (Criteria) this;
        }

        public Criteria andRepairRemarksNotBetween(String value1, String value2) {
            addCriterion("repair_remarks not between", value1, value2, "repairRemarks");
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

        public Criteria andIsValidIsNull() {
            addCriterion("is_valid is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("is_valid is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(Integer value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(Integer value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(Integer value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(Integer value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(Integer value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<Integer> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<Integer> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(Integer value1, Integer value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(Integer value1, Integer value2) {
            addCriterion("is_valid not between", value1, value2, "isValid");
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