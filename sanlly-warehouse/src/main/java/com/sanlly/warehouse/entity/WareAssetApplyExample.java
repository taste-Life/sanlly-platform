package com.sanlly.warehouse.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareAssetApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareAssetApplyExample() {
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

        public Criteria andWareAssetApplyIdIsNull() {
            addCriterion("ware_asset_apply_id is null");
            return (Criteria) this;
        }

        public Criteria andWareAssetApplyIdIsNotNull() {
            addCriterion("ware_asset_apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareAssetApplyIdEqualTo(Integer value) {
            addCriterion("ware_asset_apply_id =", value, "wareAssetApplyId");
            return (Criteria) this;
        }

        public Criteria andWareAssetApplyIdNotEqualTo(Integer value) {
            addCriterion("ware_asset_apply_id <>", value, "wareAssetApplyId");
            return (Criteria) this;
        }

        public Criteria andWareAssetApplyIdGreaterThan(Integer value) {
            addCriterion("ware_asset_apply_id >", value, "wareAssetApplyId");
            return (Criteria) this;
        }

        public Criteria andWareAssetApplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_asset_apply_id >=", value, "wareAssetApplyId");
            return (Criteria) this;
        }

        public Criteria andWareAssetApplyIdLessThan(Integer value) {
            addCriterion("ware_asset_apply_id <", value, "wareAssetApplyId");
            return (Criteria) this;
        }

        public Criteria andWareAssetApplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_asset_apply_id <=", value, "wareAssetApplyId");
            return (Criteria) this;
        }

        public Criteria andWareAssetApplyIdIn(List<Integer> values) {
            addCriterion("ware_asset_apply_id in", values, "wareAssetApplyId");
            return (Criteria) this;
        }

        public Criteria andWareAssetApplyIdNotIn(List<Integer> values) {
            addCriterion("ware_asset_apply_id not in", values, "wareAssetApplyId");
            return (Criteria) this;
        }

        public Criteria andWareAssetApplyIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_asset_apply_id between", value1, value2, "wareAssetApplyId");
            return (Criteria) this;
        }

        public Criteria andWareAssetApplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_asset_apply_id not between", value1, value2, "wareAssetApplyId");
            return (Criteria) this;
        }

        public Criteria andAssetApplyNoIsNull() {
            addCriterion("asset_apply_no is null");
            return (Criteria) this;
        }

        public Criteria andAssetApplyNoIsNotNull() {
            addCriterion("asset_apply_no is not null");
            return (Criteria) this;
        }

        public Criteria andAssetApplyNoEqualTo(String value) {
            addCriterion("asset_apply_no =", value, "assetApplyNo");
            return (Criteria) this;
        }

        public Criteria andAssetApplyNoNotEqualTo(String value) {
            addCriterion("asset_apply_no <>", value, "assetApplyNo");
            return (Criteria) this;
        }

        public Criteria andAssetApplyNoGreaterThan(String value) {
            addCriterion("asset_apply_no >", value, "assetApplyNo");
            return (Criteria) this;
        }

        public Criteria andAssetApplyNoGreaterThanOrEqualTo(String value) {
            addCriterion("asset_apply_no >=", value, "assetApplyNo");
            return (Criteria) this;
        }

        public Criteria andAssetApplyNoLessThan(String value) {
            addCriterion("asset_apply_no <", value, "assetApplyNo");
            return (Criteria) this;
        }

        public Criteria andAssetApplyNoLessThanOrEqualTo(String value) {
            addCriterion("asset_apply_no <=", value, "assetApplyNo");
            return (Criteria) this;
        }

        public Criteria andAssetApplyNoLike(String value) {
            addCriterion("asset_apply_no like", value, "assetApplyNo");
            return (Criteria) this;
        }

        public Criteria andAssetApplyNoNotLike(String value) {
            addCriterion("asset_apply_no not like", value, "assetApplyNo");
            return (Criteria) this;
        }

        public Criteria andAssetApplyNoIn(List<String> values) {
            addCriterion("asset_apply_no in", values, "assetApplyNo");
            return (Criteria) this;
        }

        public Criteria andAssetApplyNoNotIn(List<String> values) {
            addCriterion("asset_apply_no not in", values, "assetApplyNo");
            return (Criteria) this;
        }

        public Criteria andAssetApplyNoBetween(String value1, String value2) {
            addCriterion("asset_apply_no between", value1, value2, "assetApplyNo");
            return (Criteria) this;
        }

        public Criteria andAssetApplyNoNotBetween(String value1, String value2) {
            addCriterion("asset_apply_no not between", value1, value2, "assetApplyNo");
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

        public Criteria andApplyTypeIsNull() {
            addCriterion("apply_type is null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNotNull() {
            addCriterion("apply_type is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeEqualTo(String value) {
            addCriterion("apply_type =", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotEqualTo(String value) {
            addCriterion("apply_type <>", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThan(String value) {
            addCriterion("apply_type >", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_type >=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThan(String value) {
            addCriterion("apply_type <", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThanOrEqualTo(String value) {
            addCriterion("apply_type <=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLike(String value) {
            addCriterion("apply_type like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotLike(String value) {
            addCriterion("apply_type not like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIn(List<String> values) {
            addCriterion("apply_type in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotIn(List<String> values) {
            addCriterion("apply_type not in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeBetween(String value1, String value2) {
            addCriterion("apply_type between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotBetween(String value1, String value2) {
            addCriterion("apply_type not between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentIsNull() {
            addCriterion("apply_department is null");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentIsNotNull() {
            addCriterion("apply_department is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentEqualTo(String value) {
            addCriterion("apply_department =", value, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentNotEqualTo(String value) {
            addCriterion("apply_department <>", value, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentGreaterThan(String value) {
            addCriterion("apply_department >", value, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("apply_department >=", value, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentLessThan(String value) {
            addCriterion("apply_department <", value, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentLessThanOrEqualTo(String value) {
            addCriterion("apply_department <=", value, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentLike(String value) {
            addCriterion("apply_department like", value, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentNotLike(String value) {
            addCriterion("apply_department not like", value, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentIn(List<String> values) {
            addCriterion("apply_department in", values, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentNotIn(List<String> values) {
            addCriterion("apply_department not in", values, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentBetween(String value1, String value2) {
            addCriterion("apply_department between", value1, value2, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyDepartmentNotBetween(String value1, String value2) {
            addCriterion("apply_department not between", value1, value2, "applyDepartment");
            return (Criteria) this;
        }

        public Criteria andApplyUserIsNull() {
            addCriterion("apply_user is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIsNotNull() {
            addCriterion("apply_user is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserEqualTo(Integer value) {
            addCriterion("apply_user =", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotEqualTo(Integer value) {
            addCriterion("apply_user <>", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserGreaterThan(Integer value) {
            addCriterion("apply_user >", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_user >=", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserLessThan(Integer value) {
            addCriterion("apply_user <", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserLessThanOrEqualTo(Integer value) {
            addCriterion("apply_user <=", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserIn(List<Integer> values) {
            addCriterion("apply_user in", values, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotIn(List<Integer> values) {
            addCriterion("apply_user not in", values, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserBetween(Integer value1, Integer value2) {
            addCriterion("apply_user between", value1, value2, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_user not between", value1, value2, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("apply_date is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("apply_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(Date value) {
            addCriterion("apply_date =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(Date value) {
            addCriterion("apply_date <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(Date value) {
            addCriterion("apply_date >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_date >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(Date value) {
            addCriterion("apply_date <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(Date value) {
            addCriterion("apply_date <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<Date> values) {
            addCriterion("apply_date in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<Date> values) {
            addCriterion("apply_date not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(Date value1, Date value2) {
            addCriterion("apply_date between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(Date value1, Date value2) {
            addCriterion("apply_date not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andOldUserIsNull() {
            addCriterion("old_user is null");
            return (Criteria) this;
        }

        public Criteria andOldUserIsNotNull() {
            addCriterion("old_user is not null");
            return (Criteria) this;
        }

        public Criteria andOldUserEqualTo(Integer value) {
            addCriterion("old_user =", value, "oldUser");
            return (Criteria) this;
        }

        public Criteria andOldUserNotEqualTo(Integer value) {
            addCriterion("old_user <>", value, "oldUser");
            return (Criteria) this;
        }

        public Criteria andOldUserGreaterThan(Integer value) {
            addCriterion("old_user >", value, "oldUser");
            return (Criteria) this;
        }

        public Criteria andOldUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("old_user >=", value, "oldUser");
            return (Criteria) this;
        }

        public Criteria andOldUserLessThan(Integer value) {
            addCriterion("old_user <", value, "oldUser");
            return (Criteria) this;
        }

        public Criteria andOldUserLessThanOrEqualTo(Integer value) {
            addCriterion("old_user <=", value, "oldUser");
            return (Criteria) this;
        }

        public Criteria andOldUserIn(List<Integer> values) {
            addCriterion("old_user in", values, "oldUser");
            return (Criteria) this;
        }

        public Criteria andOldUserNotIn(List<Integer> values) {
            addCriterion("old_user not in", values, "oldUser");
            return (Criteria) this;
        }

        public Criteria andOldUserBetween(Integer value1, Integer value2) {
            addCriterion("old_user between", value1, value2, "oldUser");
            return (Criteria) this;
        }

        public Criteria andOldUserNotBetween(Integer value1, Integer value2) {
            addCriterion("old_user not between", value1, value2, "oldUser");
            return (Criteria) this;
        }

        public Criteria andNewUserIsNull() {
            addCriterion("new_user is null");
            return (Criteria) this;
        }

        public Criteria andNewUserIsNotNull() {
            addCriterion("new_user is not null");
            return (Criteria) this;
        }

        public Criteria andNewUserEqualTo(Integer value) {
            addCriterion("new_user =", value, "newUser");
            return (Criteria) this;
        }

        public Criteria andNewUserNotEqualTo(Integer value) {
            addCriterion("new_user <>", value, "newUser");
            return (Criteria) this;
        }

        public Criteria andNewUserGreaterThan(Integer value) {
            addCriterion("new_user >", value, "newUser");
            return (Criteria) this;
        }

        public Criteria andNewUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_user >=", value, "newUser");
            return (Criteria) this;
        }

        public Criteria andNewUserLessThan(Integer value) {
            addCriterion("new_user <", value, "newUser");
            return (Criteria) this;
        }

        public Criteria andNewUserLessThanOrEqualTo(Integer value) {
            addCriterion("new_user <=", value, "newUser");
            return (Criteria) this;
        }

        public Criteria andNewUserIn(List<Integer> values) {
            addCriterion("new_user in", values, "newUser");
            return (Criteria) this;
        }

        public Criteria andNewUserNotIn(List<Integer> values) {
            addCriterion("new_user not in", values, "newUser");
            return (Criteria) this;
        }

        public Criteria andNewUserBetween(Integer value1, Integer value2) {
            addCriterion("new_user between", value1, value2, "newUser");
            return (Criteria) this;
        }

        public Criteria andNewUserNotBetween(Integer value1, Integer value2) {
            addCriterion("new_user not between", value1, value2, "newUser");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentIsNull() {
            addCriterion("new_department is null");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentIsNotNull() {
            addCriterion("new_department is not null");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentEqualTo(String value) {
            addCriterion("new_department =", value, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentNotEqualTo(String value) {
            addCriterion("new_department <>", value, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentGreaterThan(String value) {
            addCriterion("new_department >", value, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("new_department >=", value, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentLessThan(String value) {
            addCriterion("new_department <", value, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentLessThanOrEqualTo(String value) {
            addCriterion("new_department <=", value, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentLike(String value) {
            addCriterion("new_department like", value, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentNotLike(String value) {
            addCriterion("new_department not like", value, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentIn(List<String> values) {
            addCriterion("new_department in", values, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentNotIn(List<String> values) {
            addCriterion("new_department not in", values, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentBetween(String value1, String value2) {
            addCriterion("new_department between", value1, value2, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentNotBetween(String value1, String value2) {
            addCriterion("new_department not between", value1, value2, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentIsNull() {
            addCriterion("old_department is null");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentIsNotNull() {
            addCriterion("old_department is not null");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentEqualTo(String value) {
            addCriterion("old_department =", value, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentNotEqualTo(String value) {
            addCriterion("old_department <>", value, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentGreaterThan(String value) {
            addCriterion("old_department >", value, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("old_department >=", value, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentLessThan(String value) {
            addCriterion("old_department <", value, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentLessThanOrEqualTo(String value) {
            addCriterion("old_department <=", value, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentLike(String value) {
            addCriterion("old_department like", value, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentNotLike(String value) {
            addCriterion("old_department not like", value, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentIn(List<String> values) {
            addCriterion("old_department in", values, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentNotIn(List<String> values) {
            addCriterion("old_department not in", values, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentBetween(String value1, String value2) {
            addCriterion("old_department between", value1, value2, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andOldDepartmentNotBetween(String value1, String value2) {
            addCriterion("old_department not between", value1, value2, "oldDepartment");
            return (Criteria) this;
        }

        public Criteria andScrapResonIsNull() {
            addCriterion("scrap_reson is null");
            return (Criteria) this;
        }

        public Criteria andScrapResonIsNotNull() {
            addCriterion("scrap_reson is not null");
            return (Criteria) this;
        }

        public Criteria andScrapResonEqualTo(String value) {
            addCriterion("scrap_reson =", value, "scrapReson");
            return (Criteria) this;
        }

        public Criteria andScrapResonNotEqualTo(String value) {
            addCriterion("scrap_reson <>", value, "scrapReson");
            return (Criteria) this;
        }

        public Criteria andScrapResonGreaterThan(String value) {
            addCriterion("scrap_reson >", value, "scrapReson");
            return (Criteria) this;
        }

        public Criteria andScrapResonGreaterThanOrEqualTo(String value) {
            addCriterion("scrap_reson >=", value, "scrapReson");
            return (Criteria) this;
        }

        public Criteria andScrapResonLessThan(String value) {
            addCriterion("scrap_reson <", value, "scrapReson");
            return (Criteria) this;
        }

        public Criteria andScrapResonLessThanOrEqualTo(String value) {
            addCriterion("scrap_reson <=", value, "scrapReson");
            return (Criteria) this;
        }

        public Criteria andScrapResonLike(String value) {
            addCriterion("scrap_reson like", value, "scrapReson");
            return (Criteria) this;
        }

        public Criteria andScrapResonNotLike(String value) {
            addCriterion("scrap_reson not like", value, "scrapReson");
            return (Criteria) this;
        }

        public Criteria andScrapResonIn(List<String> values) {
            addCriterion("scrap_reson in", values, "scrapReson");
            return (Criteria) this;
        }

        public Criteria andScrapResonNotIn(List<String> values) {
            addCriterion("scrap_reson not in", values, "scrapReson");
            return (Criteria) this;
        }

        public Criteria andScrapResonBetween(String value1, String value2) {
            addCriterion("scrap_reson between", value1, value2, "scrapReson");
            return (Criteria) this;
        }

        public Criteria andScrapResonNotBetween(String value1, String value2) {
            addCriterion("scrap_reson not between", value1, value2, "scrapReson");
            return (Criteria) this;
        }

        public Criteria andAssetManageIdIsNull() {
            addCriterion("asset_manage_id is null");
            return (Criteria) this;
        }

        public Criteria andAssetManageIdIsNotNull() {
            addCriterion("asset_manage_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssetManageIdEqualTo(Integer value) {
            addCriterion("asset_manage_id =", value, "assetManageId");
            return (Criteria) this;
        }

        public Criteria andAssetManageIdNotEqualTo(Integer value) {
            addCriterion("asset_manage_id <>", value, "assetManageId");
            return (Criteria) this;
        }

        public Criteria andAssetManageIdGreaterThan(Integer value) {
            addCriterion("asset_manage_id >", value, "assetManageId");
            return (Criteria) this;
        }

        public Criteria andAssetManageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("asset_manage_id >=", value, "assetManageId");
            return (Criteria) this;
        }

        public Criteria andAssetManageIdLessThan(Integer value) {
            addCriterion("asset_manage_id <", value, "assetManageId");
            return (Criteria) this;
        }

        public Criteria andAssetManageIdLessThanOrEqualTo(Integer value) {
            addCriterion("asset_manage_id <=", value, "assetManageId");
            return (Criteria) this;
        }

        public Criteria andAssetManageIdIn(List<Integer> values) {
            addCriterion("asset_manage_id in", values, "assetManageId");
            return (Criteria) this;
        }

        public Criteria andAssetManageIdNotIn(List<Integer> values) {
            addCriterion("asset_manage_id not in", values, "assetManageId");
            return (Criteria) this;
        }

        public Criteria andAssetManageIdBetween(Integer value1, Integer value2) {
            addCriterion("asset_manage_id between", value1, value2, "assetManageId");
            return (Criteria) this;
        }

        public Criteria andAssetManageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("asset_manage_id not between", value1, value2, "assetManageId");
            return (Criteria) this;
        }

        public Criteria andApplyNumIsNull() {
            addCriterion("apply_num is null");
            return (Criteria) this;
        }

        public Criteria andApplyNumIsNotNull() {
            addCriterion("apply_num is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNumEqualTo(Double value) {
            addCriterion("apply_num =", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotEqualTo(Double value) {
            addCriterion("apply_num <>", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumGreaterThan(Double value) {
            addCriterion("apply_num >", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumGreaterThanOrEqualTo(Double value) {
            addCriterion("apply_num >=", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumLessThan(Double value) {
            addCriterion("apply_num <", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumLessThanOrEqualTo(Double value) {
            addCriterion("apply_num <=", value, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumIn(List<Double> values) {
            addCriterion("apply_num in", values, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotIn(List<Double> values) {
            addCriterion("apply_num not in", values, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumBetween(Double value1, Double value2) {
            addCriterion("apply_num between", value1, value2, "applyNum");
            return (Criteria) this;
        }

        public Criteria andApplyNumNotBetween(Double value1, Double value2) {
            addCriterion("apply_num not between", value1, value2, "applyNum");
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