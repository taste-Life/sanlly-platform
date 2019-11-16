package com.sanlly.purchase.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplierSpecialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public SupplierSpecialExample() {
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

        public Criteria andSupplierSpecialIdIsNull() {
            addCriterion("supplier_special_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierSpecialIdIsNotNull() {
            addCriterion("supplier_special_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierSpecialIdEqualTo(Integer value) {
            addCriterion("supplier_special_id =", value, "supplierSpecialId");
            return (Criteria) this;
        }

        public Criteria andSupplierSpecialIdNotEqualTo(Integer value) {
            addCriterion("supplier_special_id <>", value, "supplierSpecialId");
            return (Criteria) this;
        }

        public Criteria andSupplierSpecialIdGreaterThan(Integer value) {
            addCriterion("supplier_special_id >", value, "supplierSpecialId");
            return (Criteria) this;
        }

        public Criteria andSupplierSpecialIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_special_id >=", value, "supplierSpecialId");
            return (Criteria) this;
        }

        public Criteria andSupplierSpecialIdLessThan(Integer value) {
            addCriterion("supplier_special_id <", value, "supplierSpecialId");
            return (Criteria) this;
        }

        public Criteria andSupplierSpecialIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_special_id <=", value, "supplierSpecialId");
            return (Criteria) this;
        }

        public Criteria andSupplierSpecialIdIn(List<Integer> values) {
            addCriterion("supplier_special_id in", values, "supplierSpecialId");
            return (Criteria) this;
        }

        public Criteria andSupplierSpecialIdNotIn(List<Integer> values) {
            addCriterion("supplier_special_id not in", values, "supplierSpecialId");
            return (Criteria) this;
        }

        public Criteria andSupplierSpecialIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_special_id between", value1, value2, "supplierSpecialId");
            return (Criteria) this;
        }

        public Criteria andSupplierSpecialIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_special_id not between", value1, value2, "supplierSpecialId");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andFirstSpecialIsNull() {
            addCriterion("first_special is null");
            return (Criteria) this;
        }

        public Criteria andFirstSpecialIsNotNull() {
            addCriterion("first_special is not null");
            return (Criteria) this;
        }

        public Criteria andFirstSpecialEqualTo(String value) {
            addCriterion("first_special =", value, "firstSpecial");
            return (Criteria) this;
        }

        public Criteria andFirstSpecialNotEqualTo(String value) {
            addCriterion("first_special <>", value, "firstSpecial");
            return (Criteria) this;
        }

        public Criteria andFirstSpecialGreaterThan(String value) {
            addCriterion("first_special >", value, "firstSpecial");
            return (Criteria) this;
        }

        public Criteria andFirstSpecialGreaterThanOrEqualTo(String value) {
            addCriterion("first_special >=", value, "firstSpecial");
            return (Criteria) this;
        }

        public Criteria andFirstSpecialLessThan(String value) {
            addCriterion("first_special <", value, "firstSpecial");
            return (Criteria) this;
        }

        public Criteria andFirstSpecialLessThanOrEqualTo(String value) {
            addCriterion("first_special <=", value, "firstSpecial");
            return (Criteria) this;
        }

        public Criteria andFirstSpecialLike(String value) {
            addCriterion("first_special like", value, "firstSpecial");
            return (Criteria) this;
        }

        public Criteria andFirstSpecialNotLike(String value) {
            addCriterion("first_special not like", value, "firstSpecial");
            return (Criteria) this;
        }

        public Criteria andFirstSpecialIn(List<String> values) {
            addCriterion("first_special in", values, "firstSpecial");
            return (Criteria) this;
        }

        public Criteria andFirstSpecialNotIn(List<String> values) {
            addCriterion("first_special not in", values, "firstSpecial");
            return (Criteria) this;
        }

        public Criteria andFirstSpecialBetween(String value1, String value2) {
            addCriterion("first_special between", value1, value2, "firstSpecial");
            return (Criteria) this;
        }

        public Criteria andFirstSpecialNotBetween(String value1, String value2) {
            addCriterion("first_special not between", value1, value2, "firstSpecial");
            return (Criteria) this;
        }

        public Criteria andSecondSpecialIsNull() {
            addCriterion("second_special is null");
            return (Criteria) this;
        }

        public Criteria andSecondSpecialIsNotNull() {
            addCriterion("second_special is not null");
            return (Criteria) this;
        }

        public Criteria andSecondSpecialEqualTo(String value) {
            addCriterion("second_special =", value, "secondSpecial");
            return (Criteria) this;
        }

        public Criteria andSecondSpecialNotEqualTo(String value) {
            addCriterion("second_special <>", value, "secondSpecial");
            return (Criteria) this;
        }

        public Criteria andSecondSpecialGreaterThan(String value) {
            addCriterion("second_special >", value, "secondSpecial");
            return (Criteria) this;
        }

        public Criteria andSecondSpecialGreaterThanOrEqualTo(String value) {
            addCriterion("second_special >=", value, "secondSpecial");
            return (Criteria) this;
        }

        public Criteria andSecondSpecialLessThan(String value) {
            addCriterion("second_special <", value, "secondSpecial");
            return (Criteria) this;
        }

        public Criteria andSecondSpecialLessThanOrEqualTo(String value) {
            addCriterion("second_special <=", value, "secondSpecial");
            return (Criteria) this;
        }

        public Criteria andSecondSpecialLike(String value) {
            addCriterion("second_special like", value, "secondSpecial");
            return (Criteria) this;
        }

        public Criteria andSecondSpecialNotLike(String value) {
            addCriterion("second_special not like", value, "secondSpecial");
            return (Criteria) this;
        }

        public Criteria andSecondSpecialIn(List<String> values) {
            addCriterion("second_special in", values, "secondSpecial");
            return (Criteria) this;
        }

        public Criteria andSecondSpecialNotIn(List<String> values) {
            addCriterion("second_special not in", values, "secondSpecial");
            return (Criteria) this;
        }

        public Criteria andSecondSpecialBetween(String value1, String value2) {
            addCriterion("second_special between", value1, value2, "secondSpecial");
            return (Criteria) this;
        }

        public Criteria andSecondSpecialNotBetween(String value1, String value2) {
            addCriterion("second_special not between", value1, value2, "secondSpecial");
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