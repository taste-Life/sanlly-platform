package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public YardExample() {
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

        public Criteria andProdYardIdIsNull() {
            addCriterion("prod_yard_id is null");
            return (Criteria) this;
        }

        public Criteria andProdYardIdIsNotNull() {
            addCriterion("prod_yard_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdYardIdEqualTo(Integer value) {
            addCriterion("prod_yard_id =", value, "prodYardId");
            return (Criteria) this;
        }

        public Criteria andProdYardIdNotEqualTo(Integer value) {
            addCriterion("prod_yard_id <>", value, "prodYardId");
            return (Criteria) this;
        }

        public Criteria andProdYardIdGreaterThan(Integer value) {
            addCriterion("prod_yard_id >", value, "prodYardId");
            return (Criteria) this;
        }

        public Criteria andProdYardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_yard_id >=", value, "prodYardId");
            return (Criteria) this;
        }

        public Criteria andProdYardIdLessThan(Integer value) {
            addCriterion("prod_yard_id <", value, "prodYardId");
            return (Criteria) this;
        }

        public Criteria andProdYardIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_yard_id <=", value, "prodYardId");
            return (Criteria) this;
        }

        public Criteria andProdYardIdIn(List<Integer> values) {
            addCriterion("prod_yard_id in", values, "prodYardId");
            return (Criteria) this;
        }

        public Criteria andProdYardIdNotIn(List<Integer> values) {
            addCriterion("prod_yard_id not in", values, "prodYardId");
            return (Criteria) this;
        }

        public Criteria andProdYardIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_yard_id between", value1, value2, "prodYardId");
            return (Criteria) this;
        }

        public Criteria andProdYardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_yard_id not between", value1, value2, "prodYardId");
            return (Criteria) this;
        }

        public Criteria andKeyIsNull() {
            addCriterion("`key` is null");
            return (Criteria) this;
        }

        public Criteria andKeyIsNotNull() {
            addCriterion("`key` is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(String value) {
            addCriterion("`key` =", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotEqualTo(String value) {
            addCriterion("`key` <>", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThan(String value) {
            addCriterion("`key` >", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(String value) {
            addCriterion("`key` >=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThan(String value) {
            addCriterion("`key` <", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThanOrEqualTo(String value) {
            addCriterion("`key` <=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLike(String value) {
            addCriterion("`key` like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotLike(String value) {
            addCriterion("`key` not like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyIn(List<String> values) {
            addCriterion("`key` in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotIn(List<String> values) {
            addCriterion("`key` not in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyBetween(String value1, String value2) {
            addCriterion("`key` between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotBetween(String value1, String value2) {
            addCriterion("`key` not between", value1, value2, "key");
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

        public Criteria andYardCodeIsNull() {
            addCriterion("yard_code is null");
            return (Criteria) this;
        }

        public Criteria andYardCodeIsNotNull() {
            addCriterion("yard_code is not null");
            return (Criteria) this;
        }

        public Criteria andYardCodeEqualTo(String value) {
            addCriterion("yard_code =", value, "yardCode");
            return (Criteria) this;
        }

        public Criteria andYardCodeNotEqualTo(String value) {
            addCriterion("yard_code <>", value, "yardCode");
            return (Criteria) this;
        }

        public Criteria andYardCodeGreaterThan(String value) {
            addCriterion("yard_code >", value, "yardCode");
            return (Criteria) this;
        }

        public Criteria andYardCodeGreaterThanOrEqualTo(String value) {
            addCriterion("yard_code >=", value, "yardCode");
            return (Criteria) this;
        }

        public Criteria andYardCodeLessThan(String value) {
            addCriterion("yard_code <", value, "yardCode");
            return (Criteria) this;
        }

        public Criteria andYardCodeLessThanOrEqualTo(String value) {
            addCriterion("yard_code <=", value, "yardCode");
            return (Criteria) this;
        }

        public Criteria andYardCodeLike(String value) {
            addCriterion("yard_code like", value, "yardCode");
            return (Criteria) this;
        }

        public Criteria andYardCodeNotLike(String value) {
            addCriterion("yard_code not like", value, "yardCode");
            return (Criteria) this;
        }

        public Criteria andYardCodeIn(List<String> values) {
            addCriterion("yard_code in", values, "yardCode");
            return (Criteria) this;
        }

        public Criteria andYardCodeNotIn(List<String> values) {
            addCriterion("yard_code not in", values, "yardCode");
            return (Criteria) this;
        }

        public Criteria andYardCodeBetween(String value1, String value2) {
            addCriterion("yard_code between", value1, value2, "yardCode");
            return (Criteria) this;
        }

        public Criteria andYardCodeNotBetween(String value1, String value2) {
            addCriterion("yard_code not between", value1, value2, "yardCode");
            return (Criteria) this;
        }

        public Criteria andYardNameIsNull() {
            addCriterion("yard_name is null");
            return (Criteria) this;
        }

        public Criteria andYardNameIsNotNull() {
            addCriterion("yard_name is not null");
            return (Criteria) this;
        }

        public Criteria andYardNameEqualTo(String value) {
            addCriterion("yard_name =", value, "yardName");
            return (Criteria) this;
        }

        public Criteria andYardNameNotEqualTo(String value) {
            addCriterion("yard_name <>", value, "yardName");
            return (Criteria) this;
        }

        public Criteria andYardNameGreaterThan(String value) {
            addCriterion("yard_name >", value, "yardName");
            return (Criteria) this;
        }

        public Criteria andYardNameGreaterThanOrEqualTo(String value) {
            addCriterion("yard_name >=", value, "yardName");
            return (Criteria) this;
        }

        public Criteria andYardNameLessThan(String value) {
            addCriterion("yard_name <", value, "yardName");
            return (Criteria) this;
        }

        public Criteria andYardNameLessThanOrEqualTo(String value) {
            addCriterion("yard_name <=", value, "yardName");
            return (Criteria) this;
        }

        public Criteria andYardNameLike(String value) {
            addCriterion("yard_name like", value, "yardName");
            return (Criteria) this;
        }

        public Criteria andYardNameNotLike(String value) {
            addCriterion("yard_name not like", value, "yardName");
            return (Criteria) this;
        }

        public Criteria andYardNameIn(List<String> values) {
            addCriterion("yard_name in", values, "yardName");
            return (Criteria) this;
        }

        public Criteria andYardNameNotIn(List<String> values) {
            addCriterion("yard_name not in", values, "yardName");
            return (Criteria) this;
        }

        public Criteria andYardNameBetween(String value1, String value2) {
            addCriterion("yard_name between", value1, value2, "yardName");
            return (Criteria) this;
        }

        public Criteria andYardNameNotBetween(String value1, String value2) {
            addCriterion("yard_name not between", value1, value2, "yardName");
            return (Criteria) this;
        }

        public Criteria andYardNameEnIsNull() {
            addCriterion("yard_name_en is null");
            return (Criteria) this;
        }

        public Criteria andYardNameEnIsNotNull() {
            addCriterion("yard_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andYardNameEnEqualTo(String value) {
            addCriterion("yard_name_en =", value, "yardNameEn");
            return (Criteria) this;
        }

        public Criteria andYardNameEnNotEqualTo(String value) {
            addCriterion("yard_name_en <>", value, "yardNameEn");
            return (Criteria) this;
        }

        public Criteria andYardNameEnGreaterThan(String value) {
            addCriterion("yard_name_en >", value, "yardNameEn");
            return (Criteria) this;
        }

        public Criteria andYardNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("yard_name_en >=", value, "yardNameEn");
            return (Criteria) this;
        }

        public Criteria andYardNameEnLessThan(String value) {
            addCriterion("yard_name_en <", value, "yardNameEn");
            return (Criteria) this;
        }

        public Criteria andYardNameEnLessThanOrEqualTo(String value) {
            addCriterion("yard_name_en <=", value, "yardNameEn");
            return (Criteria) this;
        }

        public Criteria andYardNameEnLike(String value) {
            addCriterion("yard_name_en like", value, "yardNameEn");
            return (Criteria) this;
        }

        public Criteria andYardNameEnNotLike(String value) {
            addCriterion("yard_name_en not like", value, "yardNameEn");
            return (Criteria) this;
        }

        public Criteria andYardNameEnIn(List<String> values) {
            addCriterion("yard_name_en in", values, "yardNameEn");
            return (Criteria) this;
        }

        public Criteria andYardNameEnNotIn(List<String> values) {
            addCriterion("yard_name_en not in", values, "yardNameEn");
            return (Criteria) this;
        }

        public Criteria andYardNameEnBetween(String value1, String value2) {
            addCriterion("yard_name_en between", value1, value2, "yardNameEn");
            return (Criteria) this;
        }

        public Criteria andYardNameEnNotBetween(String value1, String value2) {
            addCriterion("yard_name_en not between", value1, value2, "yardNameEn");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseIsNull() {
            addCriterion("default_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseIsNotNull() {
            addCriterion("default_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseEqualTo(String value) {
            addCriterion("default_warehouse =", value, "defaultWarehouse");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseNotEqualTo(String value) {
            addCriterion("default_warehouse <>", value, "defaultWarehouse");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseGreaterThan(String value) {
            addCriterion("default_warehouse >", value, "defaultWarehouse");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("default_warehouse >=", value, "defaultWarehouse");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseLessThan(String value) {
            addCriterion("default_warehouse <", value, "defaultWarehouse");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseLessThanOrEqualTo(String value) {
            addCriterion("default_warehouse <=", value, "defaultWarehouse");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseLike(String value) {
            addCriterion("default_warehouse like", value, "defaultWarehouse");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseNotLike(String value) {
            addCriterion("default_warehouse not like", value, "defaultWarehouse");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseIn(List<String> values) {
            addCriterion("default_warehouse in", values, "defaultWarehouse");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseNotIn(List<String> values) {
            addCriterion("default_warehouse not in", values, "defaultWarehouse");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseBetween(String value1, String value2) {
            addCriterion("default_warehouse between", value1, value2, "defaultWarehouse");
            return (Criteria) this;
        }

        public Criteria andDefaultWarehouseNotBetween(String value1, String value2) {
            addCriterion("default_warehouse not between", value1, value2, "defaultWarehouse");
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

        public Criteria andQrcodeNoIsNull() {
            addCriterion("qrcode_no is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeNoIsNotNull() {
            addCriterion("qrcode_no is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeNoEqualTo(String value) {
            addCriterion("qrcode_no =", value, "qrcodeNo");
            return (Criteria) this;
        }

        public Criteria andQrcodeNoNotEqualTo(String value) {
            addCriterion("qrcode_no <>", value, "qrcodeNo");
            return (Criteria) this;
        }

        public Criteria andQrcodeNoGreaterThan(String value) {
            addCriterion("qrcode_no >", value, "qrcodeNo");
            return (Criteria) this;
        }

        public Criteria andQrcodeNoGreaterThanOrEqualTo(String value) {
            addCriterion("qrcode_no >=", value, "qrcodeNo");
            return (Criteria) this;
        }

        public Criteria andQrcodeNoLessThan(String value) {
            addCriterion("qrcode_no <", value, "qrcodeNo");
            return (Criteria) this;
        }

        public Criteria andQrcodeNoLessThanOrEqualTo(String value) {
            addCriterion("qrcode_no <=", value, "qrcodeNo");
            return (Criteria) this;
        }

        public Criteria andQrcodeNoLike(String value) {
            addCriterion("qrcode_no like", value, "qrcodeNo");
            return (Criteria) this;
        }

        public Criteria andQrcodeNoNotLike(String value) {
            addCriterion("qrcode_no not like", value, "qrcodeNo");
            return (Criteria) this;
        }

        public Criteria andQrcodeNoIn(List<String> values) {
            addCriterion("qrcode_no in", values, "qrcodeNo");
            return (Criteria) this;
        }

        public Criteria andQrcodeNoNotIn(List<String> values) {
            addCriterion("qrcode_no not in", values, "qrcodeNo");
            return (Criteria) this;
        }

        public Criteria andQrcodeNoBetween(String value1, String value2) {
            addCriterion("qrcode_no between", value1, value2, "qrcodeNo");
            return (Criteria) this;
        }

        public Criteria andQrcodeNoNotBetween(String value1, String value2) {
            addCriterion("qrcode_no not between", value1, value2, "qrcodeNo");
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