package com.sanlly.warehouse.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareSparePartsCategoriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareSparePartsCategoriesExample() {
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

        public Criteria andWareSparePartsCategoriesIdIsNull() {
            addCriterion("ware_spare_parts_categories_id is null");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsCategoriesIdIsNotNull() {
            addCriterion("ware_spare_parts_categories_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsCategoriesIdEqualTo(Integer value) {
            addCriterion("ware_spare_parts_categories_id =", value, "wareSparePartsCategoriesId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsCategoriesIdNotEqualTo(Integer value) {
            addCriterion("ware_spare_parts_categories_id <>", value, "wareSparePartsCategoriesId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsCategoriesIdGreaterThan(Integer value) {
            addCriterion("ware_spare_parts_categories_id >", value, "wareSparePartsCategoriesId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsCategoriesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_spare_parts_categories_id >=", value, "wareSparePartsCategoriesId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsCategoriesIdLessThan(Integer value) {
            addCriterion("ware_spare_parts_categories_id <", value, "wareSparePartsCategoriesId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsCategoriesIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_spare_parts_categories_id <=", value, "wareSparePartsCategoriesId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsCategoriesIdIn(List<Integer> values) {
            addCriterion("ware_spare_parts_categories_id in", values, "wareSparePartsCategoriesId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsCategoriesIdNotIn(List<Integer> values) {
            addCriterion("ware_spare_parts_categories_id not in", values, "wareSparePartsCategoriesId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsCategoriesIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_spare_parts_categories_id between", value1, value2, "wareSparePartsCategoriesId");
            return (Criteria) this;
        }

        public Criteria andWareSparePartsCategoriesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_spare_parts_categories_id not between", value1, value2, "wareSparePartsCategoriesId");
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

        public Criteria andSparePartsCategoriesNameEnIsNull() {
            addCriterion("spare_parts_categories_name_en is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameEnIsNotNull() {
            addCriterion("spare_parts_categories_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameEnEqualTo(String value) {
            addCriterion("spare_parts_categories_name_en =", value, "sparePartsCategoriesNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameEnNotEqualTo(String value) {
            addCriterion("spare_parts_categories_name_en <>", value, "sparePartsCategoriesNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameEnGreaterThan(String value) {
            addCriterion("spare_parts_categories_name_en >", value, "sparePartsCategoriesNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_categories_name_en >=", value, "sparePartsCategoriesNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameEnLessThan(String value) {
            addCriterion("spare_parts_categories_name_en <", value, "sparePartsCategoriesNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameEnLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_categories_name_en <=", value, "sparePartsCategoriesNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameEnLike(String value) {
            addCriterion("spare_parts_categories_name_en like", value, "sparePartsCategoriesNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameEnNotLike(String value) {
            addCriterion("spare_parts_categories_name_en not like", value, "sparePartsCategoriesNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameEnIn(List<String> values) {
            addCriterion("spare_parts_categories_name_en in", values, "sparePartsCategoriesNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameEnNotIn(List<String> values) {
            addCriterion("spare_parts_categories_name_en not in", values, "sparePartsCategoriesNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameEnBetween(String value1, String value2) {
            addCriterion("spare_parts_categories_name_en between", value1, value2, "sparePartsCategoriesNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameEnNotBetween(String value1, String value2) {
            addCriterion("spare_parts_categories_name_en not between", value1, value2, "sparePartsCategoriesNameEn");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameIsNull() {
            addCriterion("spare_parts_categories_name is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameIsNotNull() {
            addCriterion("spare_parts_categories_name is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameEqualTo(String value) {
            addCriterion("spare_parts_categories_name =", value, "sparePartsCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameNotEqualTo(String value) {
            addCriterion("spare_parts_categories_name <>", value, "sparePartsCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameGreaterThan(String value) {
            addCriterion("spare_parts_categories_name >", value, "sparePartsCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameGreaterThanOrEqualTo(String value) {
            addCriterion("spare_parts_categories_name >=", value, "sparePartsCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameLessThan(String value) {
            addCriterion("spare_parts_categories_name <", value, "sparePartsCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameLessThanOrEqualTo(String value) {
            addCriterion("spare_parts_categories_name <=", value, "sparePartsCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameLike(String value) {
            addCriterion("spare_parts_categories_name like", value, "sparePartsCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameNotLike(String value) {
            addCriterion("spare_parts_categories_name not like", value, "sparePartsCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameIn(List<String> values) {
            addCriterion("spare_parts_categories_name in", values, "sparePartsCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameNotIn(List<String> values) {
            addCriterion("spare_parts_categories_name not in", values, "sparePartsCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameBetween(String value1, String value2) {
            addCriterion("spare_parts_categories_name between", value1, value2, "sparePartsCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSparePartsCategoriesNameNotBetween(String value1, String value2) {
            addCriterion("spare_parts_categories_name not between", value1, value2, "sparePartsCategoriesName");
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