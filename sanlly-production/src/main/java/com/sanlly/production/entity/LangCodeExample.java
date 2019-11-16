package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LangCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public LangCodeExample() {
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

        public Criteria andKeyPrefixIsNull() {
            addCriterion("key_prefix is null");
            return (Criteria) this;
        }

        public Criteria andKeyPrefixIsNotNull() {
            addCriterion("key_prefix is not null");
            return (Criteria) this;
        }

        public Criteria andKeyPrefixEqualTo(String value) {
            addCriterion("key_prefix =", value, "keyPrefix");
            return (Criteria) this;
        }

        public Criteria andKeyPrefixNotEqualTo(String value) {
            addCriterion("key_prefix <>", value, "keyPrefix");
            return (Criteria) this;
        }

        public Criteria andKeyPrefixGreaterThan(String value) {
            addCriterion("key_prefix >", value, "keyPrefix");
            return (Criteria) this;
        }

        public Criteria andKeyPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("key_prefix >=", value, "keyPrefix");
            return (Criteria) this;
        }

        public Criteria andKeyPrefixLessThan(String value) {
            addCriterion("key_prefix <", value, "keyPrefix");
            return (Criteria) this;
        }

        public Criteria andKeyPrefixLessThanOrEqualTo(String value) {
            addCriterion("key_prefix <=", value, "keyPrefix");
            return (Criteria) this;
        }

        public Criteria andKeyPrefixLike(String value) {
            addCriterion("key_prefix like", value, "keyPrefix");
            return (Criteria) this;
        }

        public Criteria andKeyPrefixNotLike(String value) {
            addCriterion("key_prefix not like", value, "keyPrefix");
            return (Criteria) this;
        }

        public Criteria andKeyPrefixIn(List<String> values) {
            addCriterion("key_prefix in", values, "keyPrefix");
            return (Criteria) this;
        }

        public Criteria andKeyPrefixNotIn(List<String> values) {
            addCriterion("key_prefix not in", values, "keyPrefix");
            return (Criteria) this;
        }

        public Criteria andKeyPrefixBetween(String value1, String value2) {
            addCriterion("key_prefix between", value1, value2, "keyPrefix");
            return (Criteria) this;
        }

        public Criteria andKeyPrefixNotBetween(String value1, String value2) {
            addCriterion("key_prefix not between", value1, value2, "keyPrefix");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("`table_name` is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("`table_name` is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("`table_name` =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("`table_name` <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("`table_name` >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("`table_name` >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("`table_name` <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("`table_name` <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("`table_name` like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("`table_name` not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("`table_name` in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("`table_name` not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("`table_name` between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("`table_name` not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andCodeColumnIsNull() {
            addCriterion("code_column is null");
            return (Criteria) this;
        }

        public Criteria andCodeColumnIsNotNull() {
            addCriterion("code_column is not null");
            return (Criteria) this;
        }

        public Criteria andCodeColumnEqualTo(String value) {
            addCriterion("code_column =", value, "codeColumn");
            return (Criteria) this;
        }

        public Criteria andCodeColumnNotEqualTo(String value) {
            addCriterion("code_column <>", value, "codeColumn");
            return (Criteria) this;
        }

        public Criteria andCodeColumnGreaterThan(String value) {
            addCriterion("code_column >", value, "codeColumn");
            return (Criteria) this;
        }

        public Criteria andCodeColumnGreaterThanOrEqualTo(String value) {
            addCriterion("code_column >=", value, "codeColumn");
            return (Criteria) this;
        }

        public Criteria andCodeColumnLessThan(String value) {
            addCriterion("code_column <", value, "codeColumn");
            return (Criteria) this;
        }

        public Criteria andCodeColumnLessThanOrEqualTo(String value) {
            addCriterion("code_column <=", value, "codeColumn");
            return (Criteria) this;
        }

        public Criteria andCodeColumnLike(String value) {
            addCriterion("code_column like", value, "codeColumn");
            return (Criteria) this;
        }

        public Criteria andCodeColumnNotLike(String value) {
            addCriterion("code_column not like", value, "codeColumn");
            return (Criteria) this;
        }

        public Criteria andCodeColumnIn(List<String> values) {
            addCriterion("code_column in", values, "codeColumn");
            return (Criteria) this;
        }

        public Criteria andCodeColumnNotIn(List<String> values) {
            addCriterion("code_column not in", values, "codeColumn");
            return (Criteria) this;
        }

        public Criteria andCodeColumnBetween(String value1, String value2) {
            addCriterion("code_column between", value1, value2, "codeColumn");
            return (Criteria) this;
        }

        public Criteria andCodeColumnNotBetween(String value1, String value2) {
            addCriterion("code_column not between", value1, value2, "codeColumn");
            return (Criteria) this;
        }

        public Criteria andZhColumnIsNull() {
            addCriterion("zh_column is null");
            return (Criteria) this;
        }

        public Criteria andZhColumnIsNotNull() {
            addCriterion("zh_column is not null");
            return (Criteria) this;
        }

        public Criteria andZhColumnEqualTo(String value) {
            addCriterion("zh_column =", value, "zhColumn");
            return (Criteria) this;
        }

        public Criteria andZhColumnNotEqualTo(String value) {
            addCriterion("zh_column <>", value, "zhColumn");
            return (Criteria) this;
        }

        public Criteria andZhColumnGreaterThan(String value) {
            addCriterion("zh_column >", value, "zhColumn");
            return (Criteria) this;
        }

        public Criteria andZhColumnGreaterThanOrEqualTo(String value) {
            addCriterion("zh_column >=", value, "zhColumn");
            return (Criteria) this;
        }

        public Criteria andZhColumnLessThan(String value) {
            addCriterion("zh_column <", value, "zhColumn");
            return (Criteria) this;
        }

        public Criteria andZhColumnLessThanOrEqualTo(String value) {
            addCriterion("zh_column <=", value, "zhColumn");
            return (Criteria) this;
        }

        public Criteria andZhColumnLike(String value) {
            addCriterion("zh_column like", value, "zhColumn");
            return (Criteria) this;
        }

        public Criteria andZhColumnNotLike(String value) {
            addCriterion("zh_column not like", value, "zhColumn");
            return (Criteria) this;
        }

        public Criteria andZhColumnIn(List<String> values) {
            addCriterion("zh_column in", values, "zhColumn");
            return (Criteria) this;
        }

        public Criteria andZhColumnNotIn(List<String> values) {
            addCriterion("zh_column not in", values, "zhColumn");
            return (Criteria) this;
        }

        public Criteria andZhColumnBetween(String value1, String value2) {
            addCriterion("zh_column between", value1, value2, "zhColumn");
            return (Criteria) this;
        }

        public Criteria andZhColumnNotBetween(String value1, String value2) {
            addCriterion("zh_column not between", value1, value2, "zhColumn");
            return (Criteria) this;
        }

        public Criteria andEnColumnIsNull() {
            addCriterion("en_column is null");
            return (Criteria) this;
        }

        public Criteria andEnColumnIsNotNull() {
            addCriterion("en_column is not null");
            return (Criteria) this;
        }

        public Criteria andEnColumnEqualTo(String value) {
            addCriterion("en_column =", value, "enColumn");
            return (Criteria) this;
        }

        public Criteria andEnColumnNotEqualTo(String value) {
            addCriterion("en_column <>", value, "enColumn");
            return (Criteria) this;
        }

        public Criteria andEnColumnGreaterThan(String value) {
            addCriterion("en_column >", value, "enColumn");
            return (Criteria) this;
        }

        public Criteria andEnColumnGreaterThanOrEqualTo(String value) {
            addCriterion("en_column >=", value, "enColumn");
            return (Criteria) this;
        }

        public Criteria andEnColumnLessThan(String value) {
            addCriterion("en_column <", value, "enColumn");
            return (Criteria) this;
        }

        public Criteria andEnColumnLessThanOrEqualTo(String value) {
            addCriterion("en_column <=", value, "enColumn");
            return (Criteria) this;
        }

        public Criteria andEnColumnLike(String value) {
            addCriterion("en_column like", value, "enColumn");
            return (Criteria) this;
        }

        public Criteria andEnColumnNotLike(String value) {
            addCriterion("en_column not like", value, "enColumn");
            return (Criteria) this;
        }

        public Criteria andEnColumnIn(List<String> values) {
            addCriterion("en_column in", values, "enColumn");
            return (Criteria) this;
        }

        public Criteria andEnColumnNotIn(List<String> values) {
            addCriterion("en_column not in", values, "enColumn");
            return (Criteria) this;
        }

        public Criteria andEnColumnBetween(String value1, String value2) {
            addCriterion("en_column between", value1, value2, "enColumn");
            return (Criteria) this;
        }

        public Criteria andEnColumnNotBetween(String value1, String value2) {
            addCriterion("en_column not between", value1, value2, "enColumn");
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