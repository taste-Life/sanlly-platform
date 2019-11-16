package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CodeCorrespondingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CodeCorrespondingExample() {
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

        public Criteria andProdCodeCorrespondingIdIsNull() {
            addCriterion("prod_code_corresponding_id is null");
            return (Criteria) this;
        }

        public Criteria andProdCodeCorrespondingIdIsNotNull() {
            addCriterion("prod_code_corresponding_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdCodeCorrespondingIdEqualTo(Integer value) {
            addCriterion("prod_code_corresponding_id =", value, "prodCodeCorrespondingId");
            return (Criteria) this;
        }

        public Criteria andProdCodeCorrespondingIdNotEqualTo(Integer value) {
            addCriterion("prod_code_corresponding_id <>", value, "prodCodeCorrespondingId");
            return (Criteria) this;
        }

        public Criteria andProdCodeCorrespondingIdGreaterThan(Integer value) {
            addCriterion("prod_code_corresponding_id >", value, "prodCodeCorrespondingId");
            return (Criteria) this;
        }

        public Criteria andProdCodeCorrespondingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_code_corresponding_id >=", value, "prodCodeCorrespondingId");
            return (Criteria) this;
        }

        public Criteria andProdCodeCorrespondingIdLessThan(Integer value) {
            addCriterion("prod_code_corresponding_id <", value, "prodCodeCorrespondingId");
            return (Criteria) this;
        }

        public Criteria andProdCodeCorrespondingIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_code_corresponding_id <=", value, "prodCodeCorrespondingId");
            return (Criteria) this;
        }

        public Criteria andProdCodeCorrespondingIdIn(List<Integer> values) {
            addCriterion("prod_code_corresponding_id in", values, "prodCodeCorrespondingId");
            return (Criteria) this;
        }

        public Criteria andProdCodeCorrespondingIdNotIn(List<Integer> values) {
            addCriterion("prod_code_corresponding_id not in", values, "prodCodeCorrespondingId");
            return (Criteria) this;
        }

        public Criteria andProdCodeCorrespondingIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_code_corresponding_id between", value1, value2, "prodCodeCorrespondingId");
            return (Criteria) this;
        }

        public Criteria andProdCodeCorrespondingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_code_corresponding_id not between", value1, value2, "prodCodeCorrespondingId");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryIsNull() {
            addCriterion("container_category is null");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryIsNotNull() {
            addCriterion("container_category is not null");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryEqualTo(String value) {
            addCriterion("container_category =", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryNotEqualTo(String value) {
            addCriterion("container_category <>", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryGreaterThan(String value) {
            addCriterion("container_category >", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("container_category >=", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryLessThan(String value) {
            addCriterion("container_category <", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryLessThanOrEqualTo(String value) {
            addCriterion("container_category <=", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryLike(String value) {
            addCriterion("container_category like", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryNotLike(String value) {
            addCriterion("container_category not like", value, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryIn(List<String> values) {
            addCriterion("container_category in", values, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryNotIn(List<String> values) {
            addCriterion("container_category not in", values, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryBetween(String value1, String value2) {
            addCriterion("container_category between", value1, value2, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andContainerCategoryNotBetween(String value1, String value2) {
            addCriterion("container_category not between", value1, value2, "containerCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCodeIsNull() {
            addCriterion("position_code is null");
            return (Criteria) this;
        }

        public Criteria andPositionCodeIsNotNull() {
            addCriterion("position_code is not null");
            return (Criteria) this;
        }

        public Criteria andPositionCodeEqualTo(String value) {
            addCriterion("position_code =", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotEqualTo(String value) {
            addCriterion("position_code <>", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeGreaterThan(String value) {
            addCriterion("position_code >", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("position_code >=", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeLessThan(String value) {
            addCriterion("position_code <", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeLessThanOrEqualTo(String value) {
            addCriterion("position_code <=", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeLike(String value) {
            addCriterion("position_code like", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotLike(String value) {
            addCriterion("position_code not like", value, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeIn(List<String> values) {
            addCriterion("position_code in", values, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotIn(List<String> values) {
            addCriterion("position_code not in", values, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeBetween(String value1, String value2) {
            addCriterion("position_code between", value1, value2, "positionCode");
            return (Criteria) this;
        }

        public Criteria andPositionCodeNotBetween(String value1, String value2) {
            addCriterion("position_code not between", value1, value2, "positionCode");
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

        public Criteria andPartsRepairTypeIsNull() {
            addCriterion("parts_repair_type is null");
            return (Criteria) this;
        }

        public Criteria andPartsRepairTypeIsNotNull() {
            addCriterion("parts_repair_type is not null");
            return (Criteria) this;
        }

        public Criteria andPartsRepairTypeEqualTo(String value) {
            addCriterion("parts_repair_type =", value, "partsRepairType");
            return (Criteria) this;
        }

        public Criteria andPartsRepairTypeNotEqualTo(String value) {
            addCriterion("parts_repair_type <>", value, "partsRepairType");
            return (Criteria) this;
        }

        public Criteria andPartsRepairTypeGreaterThan(String value) {
            addCriterion("parts_repair_type >", value, "partsRepairType");
            return (Criteria) this;
        }

        public Criteria andPartsRepairTypeGreaterThanOrEqualTo(String value) {
            addCriterion("parts_repair_type >=", value, "partsRepairType");
            return (Criteria) this;
        }

        public Criteria andPartsRepairTypeLessThan(String value) {
            addCriterion("parts_repair_type <", value, "partsRepairType");
            return (Criteria) this;
        }

        public Criteria andPartsRepairTypeLessThanOrEqualTo(String value) {
            addCriterion("parts_repair_type <=", value, "partsRepairType");
            return (Criteria) this;
        }

        public Criteria andPartsRepairTypeLike(String value) {
            addCriterion("parts_repair_type like", value, "partsRepairType");
            return (Criteria) this;
        }

        public Criteria andPartsRepairTypeNotLike(String value) {
            addCriterion("parts_repair_type not like", value, "partsRepairType");
            return (Criteria) this;
        }

        public Criteria andPartsRepairTypeIn(List<String> values) {
            addCriterion("parts_repair_type in", values, "partsRepairType");
            return (Criteria) this;
        }

        public Criteria andPartsRepairTypeNotIn(List<String> values) {
            addCriterion("parts_repair_type not in", values, "partsRepairType");
            return (Criteria) this;
        }

        public Criteria andPartsRepairTypeBetween(String value1, String value2) {
            addCriterion("parts_repair_type between", value1, value2, "partsRepairType");
            return (Criteria) this;
        }

        public Criteria andPartsRepairTypeNotBetween(String value1, String value2) {
            addCriterion("parts_repair_type not between", value1, value2, "partsRepairType");
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

        public Criteria andPartsRepairCodeIsNull() {
            addCriterion("parts_repair_code is null");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeIsNotNull() {
            addCriterion("parts_repair_code is not null");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeEqualTo(String value) {
            addCriterion("parts_repair_code =", value, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeNotEqualTo(String value) {
            addCriterion("parts_repair_code <>", value, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeGreaterThan(String value) {
            addCriterion("parts_repair_code >", value, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parts_repair_code >=", value, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeLessThan(String value) {
            addCriterion("parts_repair_code <", value, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeLessThanOrEqualTo(String value) {
            addCriterion("parts_repair_code <=", value, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeLike(String value) {
            addCriterion("parts_repair_code like", value, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeNotLike(String value) {
            addCriterion("parts_repair_code not like", value, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeIn(List<String> values) {
            addCriterion("parts_repair_code in", values, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeNotIn(List<String> values) {
            addCriterion("parts_repair_code not in", values, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeBetween(String value1, String value2) {
            addCriterion("parts_repair_code between", value1, value2, "partsRepairCode");
            return (Criteria) this;
        }

        public Criteria andPartsRepairCodeNotBetween(String value1, String value2) {
            addCriterion("parts_repair_code not between", value1, value2, "partsRepairCode");
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

        public Criteria andMaterialCodeIsNull() {
            addCriterion("material_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIsNotNull() {
            addCriterion("material_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeEqualTo(String value) {
            addCriterion("material_code =", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotEqualTo(String value) {
            addCriterion("material_code <>", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThan(String value) {
            addCriterion("material_code >", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("material_code >=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThan(String value) {
            addCriterion("material_code <", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLessThanOrEqualTo(String value) {
            addCriterion("material_code <=", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeLike(String value) {
            addCriterion("material_code like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotLike(String value) {
            addCriterion("material_code not like", value, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeIn(List<String> values) {
            addCriterion("material_code in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotIn(List<String> values) {
            addCriterion("material_code not in", values, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeBetween(String value1, String value2) {
            addCriterion("material_code between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andMaterialCodeNotBetween(String value1, String value2) {
            addCriterion("material_code not between", value1, value2, "materialCode");
            return (Criteria) this;
        }

        public Criteria andSelectMaterialCodeIsNull() {
            addCriterion("select_material_code is null");
            return (Criteria) this;
        }

        public Criteria andSelectMaterialCodeIsNotNull() {
            addCriterion("select_material_code is not null");
            return (Criteria) this;
        }

        public Criteria andSelectMaterialCodeEqualTo(String value) {
            addCriterion("select_material_code =", value, "selectMaterialCode");
            return (Criteria) this;
        }

        public Criteria andSelectMaterialCodeNotEqualTo(String value) {
            addCriterion("select_material_code <>", value, "selectMaterialCode");
            return (Criteria) this;
        }

        public Criteria andSelectMaterialCodeGreaterThan(String value) {
            addCriterion("select_material_code >", value, "selectMaterialCode");
            return (Criteria) this;
        }

        public Criteria andSelectMaterialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("select_material_code >=", value, "selectMaterialCode");
            return (Criteria) this;
        }

        public Criteria andSelectMaterialCodeLessThan(String value) {
            addCriterion("select_material_code <", value, "selectMaterialCode");
            return (Criteria) this;
        }

        public Criteria andSelectMaterialCodeLessThanOrEqualTo(String value) {
            addCriterion("select_material_code <=", value, "selectMaterialCode");
            return (Criteria) this;
        }

        public Criteria andSelectMaterialCodeLike(String value) {
            addCriterion("select_material_code like", value, "selectMaterialCode");
            return (Criteria) this;
        }

        public Criteria andSelectMaterialCodeNotLike(String value) {
            addCriterion("select_material_code not like", value, "selectMaterialCode");
            return (Criteria) this;
        }

        public Criteria andSelectMaterialCodeIn(List<String> values) {
            addCriterion("select_material_code in", values, "selectMaterialCode");
            return (Criteria) this;
        }

        public Criteria andSelectMaterialCodeNotIn(List<String> values) {
            addCriterion("select_material_code not in", values, "selectMaterialCode");
            return (Criteria) this;
        }

        public Criteria andSelectMaterialCodeBetween(String value1, String value2) {
            addCriterion("select_material_code between", value1, value2, "selectMaterialCode");
            return (Criteria) this;
        }

        public Criteria andSelectMaterialCodeNotBetween(String value1, String value2) {
            addCriterion("select_material_code not between", value1, value2, "selectMaterialCode");
            return (Criteria) this;
        }

        public Criteria andIsGzIsNull() {
            addCriterion("is_gz is null");
            return (Criteria) this;
        }

        public Criteria andIsGzIsNotNull() {
            addCriterion("is_gz is not null");
            return (Criteria) this;
        }

        public Criteria andIsGzEqualTo(String value) {
            addCriterion("is_gz =", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzNotEqualTo(String value) {
            addCriterion("is_gz <>", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzGreaterThan(String value) {
            addCriterion("is_gz >", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzGreaterThanOrEqualTo(String value) {
            addCriterion("is_gz >=", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzLessThan(String value) {
            addCriterion("is_gz <", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzLessThanOrEqualTo(String value) {
            addCriterion("is_gz <=", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzLike(String value) {
            addCriterion("is_gz like", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzNotLike(String value) {
            addCriterion("is_gz not like", value, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzIn(List<String> values) {
            addCriterion("is_gz in", values, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzNotIn(List<String> values) {
            addCriterion("is_gz not in", values, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzBetween(String value1, String value2) {
            addCriterion("is_gz between", value1, value2, "isGz");
            return (Criteria) this;
        }

        public Criteria andIsGzNotBetween(String value1, String value2) {
            addCriterion("is_gz not between", value1, value2, "isGz");
            return (Criteria) this;
        }

        public Criteria andUseNumberIsNull() {
            addCriterion("use_number is null");
            return (Criteria) this;
        }

        public Criteria andUseNumberIsNotNull() {
            addCriterion("use_number is not null");
            return (Criteria) this;
        }

        public Criteria andUseNumberEqualTo(Integer value) {
            addCriterion("use_number =", value, "useNumber");
            return (Criteria) this;
        }

        public Criteria andUseNumberNotEqualTo(Integer value) {
            addCriterion("use_number <>", value, "useNumber");
            return (Criteria) this;
        }

        public Criteria andUseNumberGreaterThan(Integer value) {
            addCriterion("use_number >", value, "useNumber");
            return (Criteria) this;
        }

        public Criteria andUseNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_number >=", value, "useNumber");
            return (Criteria) this;
        }

        public Criteria andUseNumberLessThan(Integer value) {
            addCriterion("use_number <", value, "useNumber");
            return (Criteria) this;
        }

        public Criteria andUseNumberLessThanOrEqualTo(Integer value) {
            addCriterion("use_number <=", value, "useNumber");
            return (Criteria) this;
        }

        public Criteria andUseNumberIn(List<Integer> values) {
            addCriterion("use_number in", values, "useNumber");
            return (Criteria) this;
        }

        public Criteria andUseNumberNotIn(List<Integer> values) {
            addCriterion("use_number not in", values, "useNumber");
            return (Criteria) this;
        }

        public Criteria andUseNumberBetween(Integer value1, Integer value2) {
            addCriterion("use_number between", value1, value2, "useNumber");
            return (Criteria) this;
        }

        public Criteria andUseNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("use_number not between", value1, value2, "useNumber");
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