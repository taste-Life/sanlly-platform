package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.List;

public class LxRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public LxRateExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCntrnoIsNull() {
            addCriterion("CntrNo is null");
            return (Criteria) this;
        }

        public Criteria andCntrnoIsNotNull() {
            addCriterion("CntrNo is not null");
            return (Criteria) this;
        }

        public Criteria andCntrnoEqualTo(String value) {
            addCriterion("CntrNo =", value, "cntrno");
            return (Criteria) this;
        }

        public Criteria andCntrnoNotEqualTo(String value) {
            addCriterion("CntrNo <>", value, "cntrno");
            return (Criteria) this;
        }

        public Criteria andCntrnoGreaterThan(String value) {
            addCriterion("CntrNo >", value, "cntrno");
            return (Criteria) this;
        }

        public Criteria andCntrnoGreaterThanOrEqualTo(String value) {
            addCriterion("CntrNo >=", value, "cntrno");
            return (Criteria) this;
        }

        public Criteria andCntrnoLessThan(String value) {
            addCriterion("CntrNo <", value, "cntrno");
            return (Criteria) this;
        }

        public Criteria andCntrnoLessThanOrEqualTo(String value) {
            addCriterion("CntrNo <=", value, "cntrno");
            return (Criteria) this;
        }

        public Criteria andCntrnoLike(String value) {
            addCriterion("CntrNo like", value, "cntrno");
            return (Criteria) this;
        }

        public Criteria andCntrnoNotLike(String value) {
            addCriterion("CntrNo not like", value, "cntrno");
            return (Criteria) this;
        }

        public Criteria andCntrnoIn(List<String> values) {
            addCriterion("CntrNo in", values, "cntrno");
            return (Criteria) this;
        }

        public Criteria andCntrnoNotIn(List<String> values) {
            addCriterion("CntrNo not in", values, "cntrno");
            return (Criteria) this;
        }

        public Criteria andCntrnoBetween(String value1, String value2) {
            addCriterion("CntrNo between", value1, value2, "cntrno");
            return (Criteria) this;
        }

        public Criteria andCntrnoNotBetween(String value1, String value2) {
            addCriterion("CntrNo not between", value1, value2, "cntrno");
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

        public Criteria andContainercategoryIsNull() {
            addCriterion("containerCategory is null");
            return (Criteria) this;
        }

        public Criteria andContainercategoryIsNotNull() {
            addCriterion("containerCategory is not null");
            return (Criteria) this;
        }

        public Criteria andContainercategoryEqualTo(String value) {
            addCriterion("containerCategory =", value, "containercategory");
            return (Criteria) this;
        }

        public Criteria andContainercategoryNotEqualTo(String value) {
            addCriterion("containerCategory <>", value, "containercategory");
            return (Criteria) this;
        }

        public Criteria andContainercategoryGreaterThan(String value) {
            addCriterion("containerCategory >", value, "containercategory");
            return (Criteria) this;
        }

        public Criteria andContainercategoryGreaterThanOrEqualTo(String value) {
            addCriterion("containerCategory >=", value, "containercategory");
            return (Criteria) this;
        }

        public Criteria andContainercategoryLessThan(String value) {
            addCriterion("containerCategory <", value, "containercategory");
            return (Criteria) this;
        }

        public Criteria andContainercategoryLessThanOrEqualTo(String value) {
            addCriterion("containerCategory <=", value, "containercategory");
            return (Criteria) this;
        }

        public Criteria andContainercategoryLike(String value) {
            addCriterion("containerCategory like", value, "containercategory");
            return (Criteria) this;
        }

        public Criteria andContainercategoryNotLike(String value) {
            addCriterion("containerCategory not like", value, "containercategory");
            return (Criteria) this;
        }

        public Criteria andContainercategoryIn(List<String> values) {
            addCriterion("containerCategory in", values, "containercategory");
            return (Criteria) this;
        }

        public Criteria andContainercategoryNotIn(List<String> values) {
            addCriterion("containerCategory not in", values, "containercategory");
            return (Criteria) this;
        }

        public Criteria andContainercategoryBetween(String value1, String value2) {
            addCriterion("containerCategory between", value1, value2, "containercategory");
            return (Criteria) this;
        }

        public Criteria andContainercategoryNotBetween(String value1, String value2) {
            addCriterion("containerCategory not between", value1, value2, "containercategory");
            return (Criteria) this;
        }

        public Criteria andContaineruserIsNull() {
            addCriterion("containerUser is null");
            return (Criteria) this;
        }

        public Criteria andContaineruserIsNotNull() {
            addCriterion("containerUser is not null");
            return (Criteria) this;
        }

        public Criteria andContaineruserEqualTo(String value) {
            addCriterion("containerUser =", value, "containeruser");
            return (Criteria) this;
        }

        public Criteria andContaineruserNotEqualTo(String value) {
            addCriterion("containerUser <>", value, "containeruser");
            return (Criteria) this;
        }

        public Criteria andContaineruserGreaterThan(String value) {
            addCriterion("containerUser >", value, "containeruser");
            return (Criteria) this;
        }

        public Criteria andContaineruserGreaterThanOrEqualTo(String value) {
            addCriterion("containerUser >=", value, "containeruser");
            return (Criteria) this;
        }

        public Criteria andContaineruserLessThan(String value) {
            addCriterion("containerUser <", value, "containeruser");
            return (Criteria) this;
        }

        public Criteria andContaineruserLessThanOrEqualTo(String value) {
            addCriterion("containerUser <=", value, "containeruser");
            return (Criteria) this;
        }

        public Criteria andContaineruserLike(String value) {
            addCriterion("containerUser like", value, "containeruser");
            return (Criteria) this;
        }

        public Criteria andContaineruserNotLike(String value) {
            addCriterion("containerUser not like", value, "containeruser");
            return (Criteria) this;
        }

        public Criteria andContaineruserIn(List<String> values) {
            addCriterion("containerUser in", values, "containeruser");
            return (Criteria) this;
        }

        public Criteria andContaineruserNotIn(List<String> values) {
            addCriterion("containerUser not in", values, "containeruser");
            return (Criteria) this;
        }

        public Criteria andContaineruserBetween(String value1, String value2) {
            addCriterion("containerUser between", value1, value2, "containeruser");
            return (Criteria) this;
        }

        public Criteria andContaineruserNotBetween(String value1, String value2) {
            addCriterion("containerUser not between", value1, value2, "containeruser");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("`size` is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("`size` is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("`size` =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("`size` <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("`size` >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("`size` >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("`size` <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("`size` <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("`size` like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("`size` not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("`size` in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("`size` not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("`size` between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("`size` not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andContainertypeIsNull() {
            addCriterion("containerType is null");
            return (Criteria) this;
        }

        public Criteria andContainertypeIsNotNull() {
            addCriterion("containerType is not null");
            return (Criteria) this;
        }

        public Criteria andContainertypeEqualTo(String value) {
            addCriterion("containerType =", value, "containertype");
            return (Criteria) this;
        }

        public Criteria andContainertypeNotEqualTo(String value) {
            addCriterion("containerType <>", value, "containertype");
            return (Criteria) this;
        }

        public Criteria andContainertypeGreaterThan(String value) {
            addCriterion("containerType >", value, "containertype");
            return (Criteria) this;
        }

        public Criteria andContainertypeGreaterThanOrEqualTo(String value) {
            addCriterion("containerType >=", value, "containertype");
            return (Criteria) this;
        }

        public Criteria andContainertypeLessThan(String value) {
            addCriterion("containerType <", value, "containertype");
            return (Criteria) this;
        }

        public Criteria andContainertypeLessThanOrEqualTo(String value) {
            addCriterion("containerType <=", value, "containertype");
            return (Criteria) this;
        }

        public Criteria andContainertypeLike(String value) {
            addCriterion("containerType like", value, "containertype");
            return (Criteria) this;
        }

        public Criteria andContainertypeNotLike(String value) {
            addCriterion("containerType not like", value, "containertype");
            return (Criteria) this;
        }

        public Criteria andContainertypeIn(List<String> values) {
            addCriterion("containerType in", values, "containertype");
            return (Criteria) this;
        }

        public Criteria andContainertypeNotIn(List<String> values) {
            addCriterion("containerType not in", values, "containertype");
            return (Criteria) this;
        }

        public Criteria andContainertypeBetween(String value1, String value2) {
            addCriterion("containerType between", value1, value2, "containertype");
            return (Criteria) this;
        }

        public Criteria andContainertypeNotBetween(String value1, String value2) {
            addCriterion("containerType not between", value1, value2, "containertype");
            return (Criteria) this;
        }

        public Criteria andPositioncodeIsNull() {
            addCriterion("positionCode is null");
            return (Criteria) this;
        }

        public Criteria andPositioncodeIsNotNull() {
            addCriterion("positionCode is not null");
            return (Criteria) this;
        }

        public Criteria andPositioncodeEqualTo(String value) {
            addCriterion("positionCode =", value, "positioncode");
            return (Criteria) this;
        }

        public Criteria andPositioncodeNotEqualTo(String value) {
            addCriterion("positionCode <>", value, "positioncode");
            return (Criteria) this;
        }

        public Criteria andPositioncodeGreaterThan(String value) {
            addCriterion("positionCode >", value, "positioncode");
            return (Criteria) this;
        }

        public Criteria andPositioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("positionCode >=", value, "positioncode");
            return (Criteria) this;
        }

        public Criteria andPositioncodeLessThan(String value) {
            addCriterion("positionCode <", value, "positioncode");
            return (Criteria) this;
        }

        public Criteria andPositioncodeLessThanOrEqualTo(String value) {
            addCriterion("positionCode <=", value, "positioncode");
            return (Criteria) this;
        }

        public Criteria andPositioncodeLike(String value) {
            addCriterion("positionCode like", value, "positioncode");
            return (Criteria) this;
        }

        public Criteria andPositioncodeNotLike(String value) {
            addCriterion("positionCode not like", value, "positioncode");
            return (Criteria) this;
        }

        public Criteria andPositioncodeIn(List<String> values) {
            addCriterion("positionCode in", values, "positioncode");
            return (Criteria) this;
        }

        public Criteria andPositioncodeNotIn(List<String> values) {
            addCriterion("positionCode not in", values, "positioncode");
            return (Criteria) this;
        }

        public Criteria andPositioncodeBetween(String value1, String value2) {
            addCriterion("positionCode between", value1, value2, "positioncode");
            return (Criteria) this;
        }

        public Criteria andPositioncodeNotBetween(String value1, String value2) {
            addCriterion("positionCode not between", value1, value2, "positioncode");
            return (Criteria) this;
        }

        public Criteria andPartstypecodeIsNull() {
            addCriterion("partsTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andPartstypecodeIsNotNull() {
            addCriterion("partsTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andPartstypecodeEqualTo(String value) {
            addCriterion("partsTypeCode =", value, "partstypecode");
            return (Criteria) this;
        }

        public Criteria andPartstypecodeNotEqualTo(String value) {
            addCriterion("partsTypeCode <>", value, "partstypecode");
            return (Criteria) this;
        }

        public Criteria andPartstypecodeGreaterThan(String value) {
            addCriterion("partsTypeCode >", value, "partstypecode");
            return (Criteria) this;
        }

        public Criteria andPartstypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("partsTypeCode >=", value, "partstypecode");
            return (Criteria) this;
        }

        public Criteria andPartstypecodeLessThan(String value) {
            addCriterion("partsTypeCode <", value, "partstypecode");
            return (Criteria) this;
        }

        public Criteria andPartstypecodeLessThanOrEqualTo(String value) {
            addCriterion("partsTypeCode <=", value, "partstypecode");
            return (Criteria) this;
        }

        public Criteria andPartstypecodeLike(String value) {
            addCriterion("partsTypeCode like", value, "partstypecode");
            return (Criteria) this;
        }

        public Criteria andPartstypecodeNotLike(String value) {
            addCriterion("partsTypeCode not like", value, "partstypecode");
            return (Criteria) this;
        }

        public Criteria andPartstypecodeIn(List<String> values) {
            addCriterion("partsTypeCode in", values, "partstypecode");
            return (Criteria) this;
        }

        public Criteria andPartstypecodeNotIn(List<String> values) {
            addCriterion("partsTypeCode not in", values, "partstypecode");
            return (Criteria) this;
        }

        public Criteria andPartstypecodeBetween(String value1, String value2) {
            addCriterion("partsTypeCode between", value1, value2, "partstypecode");
            return (Criteria) this;
        }

        public Criteria andPartstypecodeNotBetween(String value1, String value2) {
            addCriterion("partsTypeCode not between", value1, value2, "partstypecode");
            return (Criteria) this;
        }

        public Criteria andPartsdetailscodeIsNull() {
            addCriterion("partsDetailsCode is null");
            return (Criteria) this;
        }

        public Criteria andPartsdetailscodeIsNotNull() {
            addCriterion("partsDetailsCode is not null");
            return (Criteria) this;
        }

        public Criteria andPartsdetailscodeEqualTo(String value) {
            addCriterion("partsDetailsCode =", value, "partsdetailscode");
            return (Criteria) this;
        }

        public Criteria andPartsdetailscodeNotEqualTo(String value) {
            addCriterion("partsDetailsCode <>", value, "partsdetailscode");
            return (Criteria) this;
        }

        public Criteria andPartsdetailscodeGreaterThan(String value) {
            addCriterion("partsDetailsCode >", value, "partsdetailscode");
            return (Criteria) this;
        }

        public Criteria andPartsdetailscodeGreaterThanOrEqualTo(String value) {
            addCriterion("partsDetailsCode >=", value, "partsdetailscode");
            return (Criteria) this;
        }

        public Criteria andPartsdetailscodeLessThan(String value) {
            addCriterion("partsDetailsCode <", value, "partsdetailscode");
            return (Criteria) this;
        }

        public Criteria andPartsdetailscodeLessThanOrEqualTo(String value) {
            addCriterion("partsDetailsCode <=", value, "partsdetailscode");
            return (Criteria) this;
        }

        public Criteria andPartsdetailscodeLike(String value) {
            addCriterion("partsDetailsCode like", value, "partsdetailscode");
            return (Criteria) this;
        }

        public Criteria andPartsdetailscodeNotLike(String value) {
            addCriterion("partsDetailsCode not like", value, "partsdetailscode");
            return (Criteria) this;
        }

        public Criteria andPartsdetailscodeIn(List<String> values) {
            addCriterion("partsDetailsCode in", values, "partsdetailscode");
            return (Criteria) this;
        }

        public Criteria andPartsdetailscodeNotIn(List<String> values) {
            addCriterion("partsDetailsCode not in", values, "partsdetailscode");
            return (Criteria) this;
        }

        public Criteria andPartsdetailscodeBetween(String value1, String value2) {
            addCriterion("partsDetailsCode between", value1, value2, "partsdetailscode");
            return (Criteria) this;
        }

        public Criteria andPartsdetailscodeNotBetween(String value1, String value2) {
            addCriterion("partsDetailsCode not between", value1, value2, "partsdetailscode");
            return (Criteria) this;
        }

        public Criteria andRepaircodeIsNull() {
            addCriterion("repairCode is null");
            return (Criteria) this;
        }

        public Criteria andRepaircodeIsNotNull() {
            addCriterion("repairCode is not null");
            return (Criteria) this;
        }

        public Criteria andRepaircodeEqualTo(String value) {
            addCriterion("repairCode =", value, "repaircode");
            return (Criteria) this;
        }

        public Criteria andRepaircodeNotEqualTo(String value) {
            addCriterion("repairCode <>", value, "repaircode");
            return (Criteria) this;
        }

        public Criteria andRepaircodeGreaterThan(String value) {
            addCriterion("repairCode >", value, "repaircode");
            return (Criteria) this;
        }

        public Criteria andRepaircodeGreaterThanOrEqualTo(String value) {
            addCriterion("repairCode >=", value, "repaircode");
            return (Criteria) this;
        }

        public Criteria andRepaircodeLessThan(String value) {
            addCriterion("repairCode <", value, "repaircode");
            return (Criteria) this;
        }

        public Criteria andRepaircodeLessThanOrEqualTo(String value) {
            addCriterion("repairCode <=", value, "repaircode");
            return (Criteria) this;
        }

        public Criteria andRepaircodeLike(String value) {
            addCriterion("repairCode like", value, "repaircode");
            return (Criteria) this;
        }

        public Criteria andRepaircodeNotLike(String value) {
            addCriterion("repairCode not like", value, "repaircode");
            return (Criteria) this;
        }

        public Criteria andRepaircodeIn(List<String> values) {
            addCriterion("repairCode in", values, "repaircode");
            return (Criteria) this;
        }

        public Criteria andRepaircodeNotIn(List<String> values) {
            addCriterion("repairCode not in", values, "repaircode");
            return (Criteria) this;
        }

        public Criteria andRepaircodeBetween(String value1, String value2) {
            addCriterion("repairCode between", value1, value2, "repaircode");
            return (Criteria) this;
        }

        public Criteria andRepaircodeNotBetween(String value1, String value2) {
            addCriterion("repairCode not between", value1, value2, "repaircode");
            return (Criteria) this;
        }

        public Criteria andMaterialcodeIsNull() {
            addCriterion("materialCode is null");
            return (Criteria) this;
        }

        public Criteria andMaterialcodeIsNotNull() {
            addCriterion("materialCode is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialcodeEqualTo(String value) {
            addCriterion("materialCode =", value, "materialcode");
            return (Criteria) this;
        }

        public Criteria andMaterialcodeNotEqualTo(String value) {
            addCriterion("materialCode <>", value, "materialcode");
            return (Criteria) this;
        }

        public Criteria andMaterialcodeGreaterThan(String value) {
            addCriterion("materialCode >", value, "materialcode");
            return (Criteria) this;
        }

        public Criteria andMaterialcodeGreaterThanOrEqualTo(String value) {
            addCriterion("materialCode >=", value, "materialcode");
            return (Criteria) this;
        }

        public Criteria andMaterialcodeLessThan(String value) {
            addCriterion("materialCode <", value, "materialcode");
            return (Criteria) this;
        }

        public Criteria andMaterialcodeLessThanOrEqualTo(String value) {
            addCriterion("materialCode <=", value, "materialcode");
            return (Criteria) this;
        }

        public Criteria andMaterialcodeLike(String value) {
            addCriterion("materialCode like", value, "materialcode");
            return (Criteria) this;
        }

        public Criteria andMaterialcodeNotLike(String value) {
            addCriterion("materialCode not like", value, "materialcode");
            return (Criteria) this;
        }

        public Criteria andMaterialcodeIn(List<String> values) {
            addCriterion("materialCode in", values, "materialcode");
            return (Criteria) this;
        }

        public Criteria andMaterialcodeNotIn(List<String> values) {
            addCriterion("materialCode not in", values, "materialcode");
            return (Criteria) this;
        }

        public Criteria andMaterialcodeBetween(String value1, String value2) {
            addCriterion("materialCode between", value1, value2, "materialcode");
            return (Criteria) this;
        }

        public Criteria andMaterialcodeNotBetween(String value1, String value2) {
            addCriterion("materialCode not between", value1, value2, "materialcode");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("`length` is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("`length` is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(String value) {
            addCriterion("`length` =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(String value) {
            addCriterion("`length` <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(String value) {
            addCriterion("`length` >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(String value) {
            addCriterion("`length` >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(String value) {
            addCriterion("`length` <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(String value) {
            addCriterion("`length` <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLike(String value) {
            addCriterion("`length` like", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotLike(String value) {
            addCriterion("`length` not like", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<String> values) {
            addCriterion("`length` in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<String> values) {
            addCriterion("`length` not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(String value1, String value2) {
            addCriterion("`length` between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(String value1, String value2) {
            addCriterion("`length` not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(String value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(String value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(String value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(String value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(String value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(String value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLike(String value) {
            addCriterion("width like", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotLike(String value) {
            addCriterion("width not like", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<String> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<String> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(String value1, String value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(String value1, String value2) {
            addCriterion("width not between", value1, value2, "width");
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

        public Criteria andQuantityEqualTo(String value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(String value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(String value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(String value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(String value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLike(String value) {
            addCriterion("quantity like", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotLike(String value) {
            addCriterion("quantity not like", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<String> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<String> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(String value1, String value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(String value1, String value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andCustomerratecodeIsNull() {
            addCriterion("Customerratecode is null");
            return (Criteria) this;
        }

        public Criteria andCustomerratecodeIsNotNull() {
            addCriterion("Customerratecode is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerratecodeEqualTo(String value) {
            addCriterion("Customerratecode =", value, "customerratecode");
            return (Criteria) this;
        }

        public Criteria andCustomerratecodeNotEqualTo(String value) {
            addCriterion("Customerratecode <>", value, "customerratecode");
            return (Criteria) this;
        }

        public Criteria andCustomerratecodeGreaterThan(String value) {
            addCriterion("Customerratecode >", value, "customerratecode");
            return (Criteria) this;
        }

        public Criteria andCustomerratecodeGreaterThanOrEqualTo(String value) {
            addCriterion("Customerratecode >=", value, "customerratecode");
            return (Criteria) this;
        }

        public Criteria andCustomerratecodeLessThan(String value) {
            addCriterion("Customerratecode <", value, "customerratecode");
            return (Criteria) this;
        }

        public Criteria andCustomerratecodeLessThanOrEqualTo(String value) {
            addCriterion("Customerratecode <=", value, "customerratecode");
            return (Criteria) this;
        }

        public Criteria andCustomerratecodeLike(String value) {
            addCriterion("Customerratecode like", value, "customerratecode");
            return (Criteria) this;
        }

        public Criteria andCustomerratecodeNotLike(String value) {
            addCriterion("Customerratecode not like", value, "customerratecode");
            return (Criteria) this;
        }

        public Criteria andCustomerratecodeIn(List<String> values) {
            addCriterion("Customerratecode in", values, "customerratecode");
            return (Criteria) this;
        }

        public Criteria andCustomerratecodeNotIn(List<String> values) {
            addCriterion("Customerratecode not in", values, "customerratecode");
            return (Criteria) this;
        }

        public Criteria andCustomerratecodeBetween(String value1, String value2) {
            addCriterion("Customerratecode between", value1, value2, "customerratecode");
            return (Criteria) this;
        }

        public Criteria andCustomerratecodeNotBetween(String value1, String value2) {
            addCriterion("Customerratecode not between", value1, value2, "customerratecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeIsNull() {
            addCriterion("fiveCode is null");
            return (Criteria) this;
        }

        public Criteria andFivecodeIsNotNull() {
            addCriterion("fiveCode is not null");
            return (Criteria) this;
        }

        public Criteria andFivecodeEqualTo(String value) {
            addCriterion("fiveCode =", value, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeNotEqualTo(String value) {
            addCriterion("fiveCode <>", value, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeGreaterThan(String value) {
            addCriterion("fiveCode >", value, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeGreaterThanOrEqualTo(String value) {
            addCriterion("fiveCode >=", value, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeLessThan(String value) {
            addCriterion("fiveCode <", value, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeLessThanOrEqualTo(String value) {
            addCriterion("fiveCode <=", value, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeLike(String value) {
            addCriterion("fiveCode like", value, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeNotLike(String value) {
            addCriterion("fiveCode not like", value, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeIn(List<String> values) {
            addCriterion("fiveCode in", values, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeNotIn(List<String> values) {
            addCriterion("fiveCode not in", values, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeBetween(String value1, String value2) {
            addCriterion("fiveCode between", value1, value2, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeNotBetween(String value1, String value2) {
            addCriterion("fiveCode not between", value1, value2, "fivecode");
            return (Criteria) this;
        }

        public Criteria andManhourIsNull() {
            addCriterion("manHour is null");
            return (Criteria) this;
        }

        public Criteria andManhourIsNotNull() {
            addCriterion("manHour is not null");
            return (Criteria) this;
        }

        public Criteria andManhourEqualTo(String value) {
            addCriterion("manHour =", value, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourNotEqualTo(String value) {
            addCriterion("manHour <>", value, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourGreaterThan(String value) {
            addCriterion("manHour >", value, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourGreaterThanOrEqualTo(String value) {
            addCriterion("manHour >=", value, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourLessThan(String value) {
            addCriterion("manHour <", value, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourLessThanOrEqualTo(String value) {
            addCriterion("manHour <=", value, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourLike(String value) {
            addCriterion("manHour like", value, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourNotLike(String value) {
            addCriterion("manHour not like", value, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourIn(List<String> values) {
            addCriterion("manHour in", values, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourNotIn(List<String> values) {
            addCriterion("manHour not in", values, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourBetween(String value1, String value2) {
            addCriterion("manHour between", value1, value2, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourNotBetween(String value1, String value2) {
            addCriterion("manHour not between", value1, value2, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourcostIsNull() {
            addCriterion("manHourCost is null");
            return (Criteria) this;
        }

        public Criteria andManhourcostIsNotNull() {
            addCriterion("manHourCost is not null");
            return (Criteria) this;
        }

        public Criteria andManhourcostEqualTo(String value) {
            addCriterion("manHourCost =", value, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostNotEqualTo(String value) {
            addCriterion("manHourCost <>", value, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostGreaterThan(String value) {
            addCriterion("manHourCost >", value, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostGreaterThanOrEqualTo(String value) {
            addCriterion("manHourCost >=", value, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostLessThan(String value) {
            addCriterion("manHourCost <", value, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostLessThanOrEqualTo(String value) {
            addCriterion("manHourCost <=", value, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostLike(String value) {
            addCriterion("manHourCost like", value, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostNotLike(String value) {
            addCriterion("manHourCost not like", value, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostIn(List<String> values) {
            addCriterion("manHourCost in", values, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostNotIn(List<String> values) {
            addCriterion("manHourCost not in", values, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostBetween(String value1, String value2) {
            addCriterion("manHourCost between", value1, value2, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andManhourcostNotBetween(String value1, String value2) {
            addCriterion("manHourCost not between", value1, value2, "manhourcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostIsNull() {
            addCriterion("materialCost is null");
            return (Criteria) this;
        }

        public Criteria andMaterialcostIsNotNull() {
            addCriterion("materialCost is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialcostEqualTo(String value) {
            addCriterion("materialCost =", value, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNotEqualTo(String value) {
            addCriterion("materialCost <>", value, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostGreaterThan(String value) {
            addCriterion("materialCost >", value, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostGreaterThanOrEqualTo(String value) {
            addCriterion("materialCost >=", value, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostLessThan(String value) {
            addCriterion("materialCost <", value, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostLessThanOrEqualTo(String value) {
            addCriterion("materialCost <=", value, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostLike(String value) {
            addCriterion("materialCost like", value, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNotLike(String value) {
            addCriterion("materialCost not like", value, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostIn(List<String> values) {
            addCriterion("materialCost in", values, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNotIn(List<String> values) {
            addCriterion("materialCost not in", values, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostBetween(String value1, String value2) {
            addCriterion("materialCost between", value1, value2, "materialcost");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNotBetween(String value1, String value2) {
            addCriterion("materialCost not between", value1, value2, "materialcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostIsNull() {
            addCriterion("totalCost is null");
            return (Criteria) this;
        }

        public Criteria andTotalcostIsNotNull() {
            addCriterion("totalCost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcostEqualTo(String value) {
            addCriterion("totalCost =", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotEqualTo(String value) {
            addCriterion("totalCost <>", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostGreaterThan(String value) {
            addCriterion("totalCost >", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostGreaterThanOrEqualTo(String value) {
            addCriterion("totalCost >=", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostLessThan(String value) {
            addCriterion("totalCost <", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostLessThanOrEqualTo(String value) {
            addCriterion("totalCost <=", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostLike(String value) {
            addCriterion("totalCost like", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotLike(String value) {
            addCriterion("totalCost not like", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostIn(List<String> values) {
            addCriterion("totalCost in", values, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotIn(List<String> values) {
            addCriterion("totalCost not in", values, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostBetween(String value1, String value2) {
            addCriterion("totalCost between", value1, value2, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotBetween(String value1, String value2) {
            addCriterion("totalCost not between", value1, value2, "totalcost");
            return (Criteria) this;
        }

        public Criteria andSparesnumberIsNull() {
            addCriterion("sparesNumber is null");
            return (Criteria) this;
        }

        public Criteria andSparesnumberIsNotNull() {
            addCriterion("sparesNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSparesnumberEqualTo(String value) {
            addCriterion("sparesNumber =", value, "sparesnumber");
            return (Criteria) this;
        }

        public Criteria andSparesnumberNotEqualTo(String value) {
            addCriterion("sparesNumber <>", value, "sparesnumber");
            return (Criteria) this;
        }

        public Criteria andSparesnumberGreaterThan(String value) {
            addCriterion("sparesNumber >", value, "sparesnumber");
            return (Criteria) this;
        }

        public Criteria andSparesnumberGreaterThanOrEqualTo(String value) {
            addCriterion("sparesNumber >=", value, "sparesnumber");
            return (Criteria) this;
        }

        public Criteria andSparesnumberLessThan(String value) {
            addCriterion("sparesNumber <", value, "sparesnumber");
            return (Criteria) this;
        }

        public Criteria andSparesnumberLessThanOrEqualTo(String value) {
            addCriterion("sparesNumber <=", value, "sparesnumber");
            return (Criteria) this;
        }

        public Criteria andSparesnumberLike(String value) {
            addCriterion("sparesNumber like", value, "sparesnumber");
            return (Criteria) this;
        }

        public Criteria andSparesnumberNotLike(String value) {
            addCriterion("sparesNumber not like", value, "sparesnumber");
            return (Criteria) this;
        }

        public Criteria andSparesnumberIn(List<String> values) {
            addCriterion("sparesNumber in", values, "sparesnumber");
            return (Criteria) this;
        }

        public Criteria andSparesnumberNotIn(List<String> values) {
            addCriterion("sparesNumber not in", values, "sparesnumber");
            return (Criteria) this;
        }

        public Criteria andSparesnumberBetween(String value1, String value2) {
            addCriterion("sparesNumber between", value1, value2, "sparesnumber");
            return (Criteria) this;
        }

        public Criteria andSparesnumberNotBetween(String value1, String value2) {
            addCriterion("sparesNumber not between", value1, value2, "sparesnumber");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourIsNull() {
            addCriterion("dispatchingWorkHour is null");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourIsNotNull() {
            addCriterion("dispatchingWorkHour is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourEqualTo(String value) {
            addCriterion("dispatchingWorkHour =", value, "dispatchingworkhour");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourNotEqualTo(String value) {
            addCriterion("dispatchingWorkHour <>", value, "dispatchingworkhour");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourGreaterThan(String value) {
            addCriterion("dispatchingWorkHour >", value, "dispatchingworkhour");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourGreaterThanOrEqualTo(String value) {
            addCriterion("dispatchingWorkHour >=", value, "dispatchingworkhour");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourLessThan(String value) {
            addCriterion("dispatchingWorkHour <", value, "dispatchingworkhour");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourLessThanOrEqualTo(String value) {
            addCriterion("dispatchingWorkHour <=", value, "dispatchingworkhour");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourLike(String value) {
            addCriterion("dispatchingWorkHour like", value, "dispatchingworkhour");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourNotLike(String value) {
            addCriterion("dispatchingWorkHour not like", value, "dispatchingworkhour");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourIn(List<String> values) {
            addCriterion("dispatchingWorkHour in", values, "dispatchingworkhour");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourNotIn(List<String> values) {
            addCriterion("dispatchingWorkHour not in", values, "dispatchingworkhour");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourBetween(String value1, String value2) {
            addCriterion("dispatchingWorkHour between", value1, value2, "dispatchingworkhour");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourNotBetween(String value1, String value2) {
            addCriterion("dispatchingWorkHour not between", value1, value2, "dispatchingworkhour");
            return (Criteria) this;
        }

        public Criteria andFivecodeNewIsNull() {
            addCriterion("fiveCode_new is null");
            return (Criteria) this;
        }

        public Criteria andFivecodeNewIsNotNull() {
            addCriterion("fiveCode_new is not null");
            return (Criteria) this;
        }

        public Criteria andFivecodeNewEqualTo(String value) {
            addCriterion("fiveCode_new =", value, "fivecodeNew");
            return (Criteria) this;
        }

        public Criteria andFivecodeNewNotEqualTo(String value) {
            addCriterion("fiveCode_new <>", value, "fivecodeNew");
            return (Criteria) this;
        }

        public Criteria andFivecodeNewGreaterThan(String value) {
            addCriterion("fiveCode_new >", value, "fivecodeNew");
            return (Criteria) this;
        }

        public Criteria andFivecodeNewGreaterThanOrEqualTo(String value) {
            addCriterion("fiveCode_new >=", value, "fivecodeNew");
            return (Criteria) this;
        }

        public Criteria andFivecodeNewLessThan(String value) {
            addCriterion("fiveCode_new <", value, "fivecodeNew");
            return (Criteria) this;
        }

        public Criteria andFivecodeNewLessThanOrEqualTo(String value) {
            addCriterion("fiveCode_new <=", value, "fivecodeNew");
            return (Criteria) this;
        }

        public Criteria andFivecodeNewLike(String value) {
            addCriterion("fiveCode_new like", value, "fivecodeNew");
            return (Criteria) this;
        }

        public Criteria andFivecodeNewNotLike(String value) {
            addCriterion("fiveCode_new not like", value, "fivecodeNew");
            return (Criteria) this;
        }

        public Criteria andFivecodeNewIn(List<String> values) {
            addCriterion("fiveCode_new in", values, "fivecodeNew");
            return (Criteria) this;
        }

        public Criteria andFivecodeNewNotIn(List<String> values) {
            addCriterion("fiveCode_new not in", values, "fivecodeNew");
            return (Criteria) this;
        }

        public Criteria andFivecodeNewBetween(String value1, String value2) {
            addCriterion("fiveCode_new between", value1, value2, "fivecodeNew");
            return (Criteria) this;
        }

        public Criteria andFivecodeNewNotBetween(String value1, String value2) {
            addCriterion("fiveCode_new not between", value1, value2, "fivecodeNew");
            return (Criteria) this;
        }

        public Criteria andManhourNewIsNull() {
            addCriterion("manHour_new is null");
            return (Criteria) this;
        }

        public Criteria andManhourNewIsNotNull() {
            addCriterion("manHour_new is not null");
            return (Criteria) this;
        }

        public Criteria andManhourNewEqualTo(String value) {
            addCriterion("manHour_new =", value, "manhourNew");
            return (Criteria) this;
        }

        public Criteria andManhourNewNotEqualTo(String value) {
            addCriterion("manHour_new <>", value, "manhourNew");
            return (Criteria) this;
        }

        public Criteria andManhourNewGreaterThan(String value) {
            addCriterion("manHour_new >", value, "manhourNew");
            return (Criteria) this;
        }

        public Criteria andManhourNewGreaterThanOrEqualTo(String value) {
            addCriterion("manHour_new >=", value, "manhourNew");
            return (Criteria) this;
        }

        public Criteria andManhourNewLessThan(String value) {
            addCriterion("manHour_new <", value, "manhourNew");
            return (Criteria) this;
        }

        public Criteria andManhourNewLessThanOrEqualTo(String value) {
            addCriterion("manHour_new <=", value, "manhourNew");
            return (Criteria) this;
        }

        public Criteria andManhourNewLike(String value) {
            addCriterion("manHour_new like", value, "manhourNew");
            return (Criteria) this;
        }

        public Criteria andManhourNewNotLike(String value) {
            addCriterion("manHour_new not like", value, "manhourNew");
            return (Criteria) this;
        }

        public Criteria andManhourNewIn(List<String> values) {
            addCriterion("manHour_new in", values, "manhourNew");
            return (Criteria) this;
        }

        public Criteria andManhourNewNotIn(List<String> values) {
            addCriterion("manHour_new not in", values, "manhourNew");
            return (Criteria) this;
        }

        public Criteria andManhourNewBetween(String value1, String value2) {
            addCriterion("manHour_new between", value1, value2, "manhourNew");
            return (Criteria) this;
        }

        public Criteria andManhourNewNotBetween(String value1, String value2) {
            addCriterion("manHour_new not between", value1, value2, "manhourNew");
            return (Criteria) this;
        }

        public Criteria andManhourcostNewIsNull() {
            addCriterion("manHourCost_new is null");
            return (Criteria) this;
        }

        public Criteria andManhourcostNewIsNotNull() {
            addCriterion("manHourCost_new is not null");
            return (Criteria) this;
        }

        public Criteria andManhourcostNewEqualTo(String value) {
            addCriterion("manHourCost_new =", value, "manhourcostNew");
            return (Criteria) this;
        }

        public Criteria andManhourcostNewNotEqualTo(String value) {
            addCriterion("manHourCost_new <>", value, "manhourcostNew");
            return (Criteria) this;
        }

        public Criteria andManhourcostNewGreaterThan(String value) {
            addCriterion("manHourCost_new >", value, "manhourcostNew");
            return (Criteria) this;
        }

        public Criteria andManhourcostNewGreaterThanOrEqualTo(String value) {
            addCriterion("manHourCost_new >=", value, "manhourcostNew");
            return (Criteria) this;
        }

        public Criteria andManhourcostNewLessThan(String value) {
            addCriterion("manHourCost_new <", value, "manhourcostNew");
            return (Criteria) this;
        }

        public Criteria andManhourcostNewLessThanOrEqualTo(String value) {
            addCriterion("manHourCost_new <=", value, "manhourcostNew");
            return (Criteria) this;
        }

        public Criteria andManhourcostNewLike(String value) {
            addCriterion("manHourCost_new like", value, "manhourcostNew");
            return (Criteria) this;
        }

        public Criteria andManhourcostNewNotLike(String value) {
            addCriterion("manHourCost_new not like", value, "manhourcostNew");
            return (Criteria) this;
        }

        public Criteria andManhourcostNewIn(List<String> values) {
            addCriterion("manHourCost_new in", values, "manhourcostNew");
            return (Criteria) this;
        }

        public Criteria andManhourcostNewNotIn(List<String> values) {
            addCriterion("manHourCost_new not in", values, "manhourcostNew");
            return (Criteria) this;
        }

        public Criteria andManhourcostNewBetween(String value1, String value2) {
            addCriterion("manHourCost_new between", value1, value2, "manhourcostNew");
            return (Criteria) this;
        }

        public Criteria andManhourcostNewNotBetween(String value1, String value2) {
            addCriterion("manHourCost_new not between", value1, value2, "manhourcostNew");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNewIsNull() {
            addCriterion("materialCost_new is null");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNewIsNotNull() {
            addCriterion("materialCost_new is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNewEqualTo(String value) {
            addCriterion("materialCost_new =", value, "materialcostNew");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNewNotEqualTo(String value) {
            addCriterion("materialCost_new <>", value, "materialcostNew");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNewGreaterThan(String value) {
            addCriterion("materialCost_new >", value, "materialcostNew");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNewGreaterThanOrEqualTo(String value) {
            addCriterion("materialCost_new >=", value, "materialcostNew");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNewLessThan(String value) {
            addCriterion("materialCost_new <", value, "materialcostNew");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNewLessThanOrEqualTo(String value) {
            addCriterion("materialCost_new <=", value, "materialcostNew");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNewLike(String value) {
            addCriterion("materialCost_new like", value, "materialcostNew");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNewNotLike(String value) {
            addCriterion("materialCost_new not like", value, "materialcostNew");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNewIn(List<String> values) {
            addCriterion("materialCost_new in", values, "materialcostNew");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNewNotIn(List<String> values) {
            addCriterion("materialCost_new not in", values, "materialcostNew");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNewBetween(String value1, String value2) {
            addCriterion("materialCost_new between", value1, value2, "materialcostNew");
            return (Criteria) this;
        }

        public Criteria andMaterialcostNewNotBetween(String value1, String value2) {
            addCriterion("materialCost_new not between", value1, value2, "materialcostNew");
            return (Criteria) this;
        }

        public Criteria andTotalcostNewIsNull() {
            addCriterion("totalCost_new is null");
            return (Criteria) this;
        }

        public Criteria andTotalcostNewIsNotNull() {
            addCriterion("totalCost_new is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcostNewEqualTo(String value) {
            addCriterion("totalCost_new =", value, "totalcostNew");
            return (Criteria) this;
        }

        public Criteria andTotalcostNewNotEqualTo(String value) {
            addCriterion("totalCost_new <>", value, "totalcostNew");
            return (Criteria) this;
        }

        public Criteria andTotalcostNewGreaterThan(String value) {
            addCriterion("totalCost_new >", value, "totalcostNew");
            return (Criteria) this;
        }

        public Criteria andTotalcostNewGreaterThanOrEqualTo(String value) {
            addCriterion("totalCost_new >=", value, "totalcostNew");
            return (Criteria) this;
        }

        public Criteria andTotalcostNewLessThan(String value) {
            addCriterion("totalCost_new <", value, "totalcostNew");
            return (Criteria) this;
        }

        public Criteria andTotalcostNewLessThanOrEqualTo(String value) {
            addCriterion("totalCost_new <=", value, "totalcostNew");
            return (Criteria) this;
        }

        public Criteria andTotalcostNewLike(String value) {
            addCriterion("totalCost_new like", value, "totalcostNew");
            return (Criteria) this;
        }

        public Criteria andTotalcostNewNotLike(String value) {
            addCriterion("totalCost_new not like", value, "totalcostNew");
            return (Criteria) this;
        }

        public Criteria andTotalcostNewIn(List<String> values) {
            addCriterion("totalCost_new in", values, "totalcostNew");
            return (Criteria) this;
        }

        public Criteria andTotalcostNewNotIn(List<String> values) {
            addCriterion("totalCost_new not in", values, "totalcostNew");
            return (Criteria) this;
        }

        public Criteria andTotalcostNewBetween(String value1, String value2) {
            addCriterion("totalCost_new between", value1, value2, "totalcostNew");
            return (Criteria) this;
        }

        public Criteria andTotalcostNewNotBetween(String value1, String value2) {
            addCriterion("totalCost_new not between", value1, value2, "totalcostNew");
            return (Criteria) this;
        }

        public Criteria andSparesnumberNewIsNull() {
            addCriterion("sparesNumber_new is null");
            return (Criteria) this;
        }

        public Criteria andSparesnumberNewIsNotNull() {
            addCriterion("sparesNumber_new is not null");
            return (Criteria) this;
        }

        public Criteria andSparesnumberNewEqualTo(String value) {
            addCriterion("sparesNumber_new =", value, "sparesnumberNew");
            return (Criteria) this;
        }

        public Criteria andSparesnumberNewNotEqualTo(String value) {
            addCriterion("sparesNumber_new <>", value, "sparesnumberNew");
            return (Criteria) this;
        }

        public Criteria andSparesnumberNewGreaterThan(String value) {
            addCriterion("sparesNumber_new >", value, "sparesnumberNew");
            return (Criteria) this;
        }

        public Criteria andSparesnumberNewGreaterThanOrEqualTo(String value) {
            addCriterion("sparesNumber_new >=", value, "sparesnumberNew");
            return (Criteria) this;
        }

        public Criteria andSparesnumberNewLessThan(String value) {
            addCriterion("sparesNumber_new <", value, "sparesnumberNew");
            return (Criteria) this;
        }

        public Criteria andSparesnumberNewLessThanOrEqualTo(String value) {
            addCriterion("sparesNumber_new <=", value, "sparesnumberNew");
            return (Criteria) this;
        }

        public Criteria andSparesnumberNewLike(String value) {
            addCriterion("sparesNumber_new like", value, "sparesnumberNew");
            return (Criteria) this;
        }

        public Criteria andSparesnumberNewNotLike(String value) {
            addCriterion("sparesNumber_new not like", value, "sparesnumberNew");
            return (Criteria) this;
        }

        public Criteria andSparesnumberNewIn(List<String> values) {
            addCriterion("sparesNumber_new in", values, "sparesnumberNew");
            return (Criteria) this;
        }

        public Criteria andSparesnumberNewNotIn(List<String> values) {
            addCriterion("sparesNumber_new not in", values, "sparesnumberNew");
            return (Criteria) this;
        }

        public Criteria andSparesnumberNewBetween(String value1, String value2) {
            addCriterion("sparesNumber_new between", value1, value2, "sparesnumberNew");
            return (Criteria) this;
        }

        public Criteria andSparesnumberNewNotBetween(String value1, String value2) {
            addCriterion("sparesNumber_new not between", value1, value2, "sparesnumberNew");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourNewIsNull() {
            addCriterion("dispatchingWorkHour_new is null");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourNewIsNotNull() {
            addCriterion("dispatchingWorkHour_new is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourNewEqualTo(String value) {
            addCriterion("dispatchingWorkHour_new =", value, "dispatchingworkhourNew");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourNewNotEqualTo(String value) {
            addCriterion("dispatchingWorkHour_new <>", value, "dispatchingworkhourNew");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourNewGreaterThan(String value) {
            addCriterion("dispatchingWorkHour_new >", value, "dispatchingworkhourNew");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourNewGreaterThanOrEqualTo(String value) {
            addCriterion("dispatchingWorkHour_new >=", value, "dispatchingworkhourNew");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourNewLessThan(String value) {
            addCriterion("dispatchingWorkHour_new <", value, "dispatchingworkhourNew");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourNewLessThanOrEqualTo(String value) {
            addCriterion("dispatchingWorkHour_new <=", value, "dispatchingworkhourNew");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourNewLike(String value) {
            addCriterion("dispatchingWorkHour_new like", value, "dispatchingworkhourNew");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourNewNotLike(String value) {
            addCriterion("dispatchingWorkHour_new not like", value, "dispatchingworkhourNew");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourNewIn(List<String> values) {
            addCriterion("dispatchingWorkHour_new in", values, "dispatchingworkhourNew");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourNewNotIn(List<String> values) {
            addCriterion("dispatchingWorkHour_new not in", values, "dispatchingworkhourNew");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourNewBetween(String value1, String value2) {
            addCriterion("dispatchingWorkHour_new between", value1, value2, "dispatchingworkhourNew");
            return (Criteria) this;
        }

        public Criteria andDispatchingworkhourNewNotBetween(String value1, String value2) {
            addCriterion("dispatchingWorkHour_new not between", value1, value2, "dispatchingworkhourNew");
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