package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayingPartyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PayingPartyExample() {
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

        public Criteria andProdPayingPartyIdIsNull() {
            addCriterion("prod_paying_party_id is null");
            return (Criteria) this;
        }

        public Criteria andProdPayingPartyIdIsNotNull() {
            addCriterion("prod_paying_party_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdPayingPartyIdEqualTo(Integer value) {
            addCriterion("prod_paying_party_id =", value, "prodPayingPartyId");
            return (Criteria) this;
        }

        public Criteria andProdPayingPartyIdNotEqualTo(Integer value) {
            addCriterion("prod_paying_party_id <>", value, "prodPayingPartyId");
            return (Criteria) this;
        }

        public Criteria andProdPayingPartyIdGreaterThan(Integer value) {
            addCriterion("prod_paying_party_id >", value, "prodPayingPartyId");
            return (Criteria) this;
        }

        public Criteria andProdPayingPartyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_paying_party_id >=", value, "prodPayingPartyId");
            return (Criteria) this;
        }

        public Criteria andProdPayingPartyIdLessThan(Integer value) {
            addCriterion("prod_paying_party_id <", value, "prodPayingPartyId");
            return (Criteria) this;
        }

        public Criteria andProdPayingPartyIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_paying_party_id <=", value, "prodPayingPartyId");
            return (Criteria) this;
        }

        public Criteria andProdPayingPartyIdIn(List<Integer> values) {
            addCriterion("prod_paying_party_id in", values, "prodPayingPartyId");
            return (Criteria) this;
        }

        public Criteria andProdPayingPartyIdNotIn(List<Integer> values) {
            addCriterion("prod_paying_party_id not in", values, "prodPayingPartyId");
            return (Criteria) this;
        }

        public Criteria andProdPayingPartyIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_paying_party_id between", value1, value2, "prodPayingPartyId");
            return (Criteria) this;
        }

        public Criteria andProdPayingPartyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_paying_party_id not between", value1, value2, "prodPayingPartyId");
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

        public Criteria andPayingPartyCodeIsNull() {
            addCriterion("paying_party_code is null");
            return (Criteria) this;
        }

        public Criteria andPayingPartyCodeIsNotNull() {
            addCriterion("paying_party_code is not null");
            return (Criteria) this;
        }

        public Criteria andPayingPartyCodeEqualTo(String value) {
            addCriterion("paying_party_code =", value, "payingPartyCode");
            return (Criteria) this;
        }

        public Criteria andPayingPartyCodeNotEqualTo(String value) {
            addCriterion("paying_party_code <>", value, "payingPartyCode");
            return (Criteria) this;
        }

        public Criteria andPayingPartyCodeGreaterThan(String value) {
            addCriterion("paying_party_code >", value, "payingPartyCode");
            return (Criteria) this;
        }

        public Criteria andPayingPartyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("paying_party_code >=", value, "payingPartyCode");
            return (Criteria) this;
        }

        public Criteria andPayingPartyCodeLessThan(String value) {
            addCriterion("paying_party_code <", value, "payingPartyCode");
            return (Criteria) this;
        }

        public Criteria andPayingPartyCodeLessThanOrEqualTo(String value) {
            addCriterion("paying_party_code <=", value, "payingPartyCode");
            return (Criteria) this;
        }

        public Criteria andPayingPartyCodeLike(String value) {
            addCriterion("paying_party_code like", value, "payingPartyCode");
            return (Criteria) this;
        }

        public Criteria andPayingPartyCodeNotLike(String value) {
            addCriterion("paying_party_code not like", value, "payingPartyCode");
            return (Criteria) this;
        }

        public Criteria andPayingPartyCodeIn(List<String> values) {
            addCriterion("paying_party_code in", values, "payingPartyCode");
            return (Criteria) this;
        }

        public Criteria andPayingPartyCodeNotIn(List<String> values) {
            addCriterion("paying_party_code not in", values, "payingPartyCode");
            return (Criteria) this;
        }

        public Criteria andPayingPartyCodeBetween(String value1, String value2) {
            addCriterion("paying_party_code between", value1, value2, "payingPartyCode");
            return (Criteria) this;
        }

        public Criteria andPayingPartyCodeNotBetween(String value1, String value2) {
            addCriterion("paying_party_code not between", value1, value2, "payingPartyCode");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameIsNull() {
            addCriterion("paying_party_name is null");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameIsNotNull() {
            addCriterion("paying_party_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameEqualTo(String value) {
            addCriterion("paying_party_name =", value, "payingPartyName");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameNotEqualTo(String value) {
            addCriterion("paying_party_name <>", value, "payingPartyName");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameGreaterThan(String value) {
            addCriterion("paying_party_name >", value, "payingPartyName");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameGreaterThanOrEqualTo(String value) {
            addCriterion("paying_party_name >=", value, "payingPartyName");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameLessThan(String value) {
            addCriterion("paying_party_name <", value, "payingPartyName");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameLessThanOrEqualTo(String value) {
            addCriterion("paying_party_name <=", value, "payingPartyName");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameLike(String value) {
            addCriterion("paying_party_name like", value, "payingPartyName");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameNotLike(String value) {
            addCriterion("paying_party_name not like", value, "payingPartyName");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameIn(List<String> values) {
            addCriterion("paying_party_name in", values, "payingPartyName");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameNotIn(List<String> values) {
            addCriterion("paying_party_name not in", values, "payingPartyName");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameBetween(String value1, String value2) {
            addCriterion("paying_party_name between", value1, value2, "payingPartyName");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameNotBetween(String value1, String value2) {
            addCriterion("paying_party_name not between", value1, value2, "payingPartyName");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameEnIsNull() {
            addCriterion("paying_party_name_en is null");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameEnIsNotNull() {
            addCriterion("paying_party_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameEnEqualTo(String value) {
            addCriterion("paying_party_name_en =", value, "payingPartyNameEn");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameEnNotEqualTo(String value) {
            addCriterion("paying_party_name_en <>", value, "payingPartyNameEn");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameEnGreaterThan(String value) {
            addCriterion("paying_party_name_en >", value, "payingPartyNameEn");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("paying_party_name_en >=", value, "payingPartyNameEn");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameEnLessThan(String value) {
            addCriterion("paying_party_name_en <", value, "payingPartyNameEn");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameEnLessThanOrEqualTo(String value) {
            addCriterion("paying_party_name_en <=", value, "payingPartyNameEn");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameEnLike(String value) {
            addCriterion("paying_party_name_en like", value, "payingPartyNameEn");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameEnNotLike(String value) {
            addCriterion("paying_party_name_en not like", value, "payingPartyNameEn");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameEnIn(List<String> values) {
            addCriterion("paying_party_name_en in", values, "payingPartyNameEn");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameEnNotIn(List<String> values) {
            addCriterion("paying_party_name_en not in", values, "payingPartyNameEn");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameEnBetween(String value1, String value2) {
            addCriterion("paying_party_name_en between", value1, value2, "payingPartyNameEn");
            return (Criteria) this;
        }

        public Criteria andPayingPartyNameEnNotBetween(String value1, String value2) {
            addCriterion("paying_party_name_en not between", value1, value2, "payingPartyNameEn");
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