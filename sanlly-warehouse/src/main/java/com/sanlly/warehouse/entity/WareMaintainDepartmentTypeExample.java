package com.sanlly.warehouse.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareMaintainDepartmentTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareMaintainDepartmentTypeExample() {
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

        public Criteria andWareMaintainDepartmentTypeIdIsNull() {
            addCriterion("ware_maintain_department_type_id is null");
            return (Criteria) this;
        }

        public Criteria andWareMaintainDepartmentTypeIdIsNotNull() {
            addCriterion("ware_maintain_department_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareMaintainDepartmentTypeIdEqualTo(Integer value) {
            addCriterion("ware_maintain_department_type_id =", value, "wareMaintainDepartmentTypeId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainDepartmentTypeIdNotEqualTo(Integer value) {
            addCriterion("ware_maintain_department_type_id <>", value, "wareMaintainDepartmentTypeId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainDepartmentTypeIdGreaterThan(Integer value) {
            addCriterion("ware_maintain_department_type_id >", value, "wareMaintainDepartmentTypeId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainDepartmentTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_maintain_department_type_id >=", value, "wareMaintainDepartmentTypeId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainDepartmentTypeIdLessThan(Integer value) {
            addCriterion("ware_maintain_department_type_id <", value, "wareMaintainDepartmentTypeId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainDepartmentTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_maintain_department_type_id <=", value, "wareMaintainDepartmentTypeId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainDepartmentTypeIdIn(List<Integer> values) {
            addCriterion("ware_maintain_department_type_id in", values, "wareMaintainDepartmentTypeId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainDepartmentTypeIdNotIn(List<Integer> values) {
            addCriterion("ware_maintain_department_type_id not in", values, "wareMaintainDepartmentTypeId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainDepartmentTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_maintain_department_type_id between", value1, value2, "wareMaintainDepartmentTypeId");
            return (Criteria) this;
        }

        public Criteria andWareMaintainDepartmentTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_maintain_department_type_id not between", value1, value2, "wareMaintainDepartmentTypeId");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentIsNull() {
            addCriterion("maintain_department is null");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentIsNotNull() {
            addCriterion("maintain_department is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentEqualTo(String value) {
            addCriterion("maintain_department =", value, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentNotEqualTo(String value) {
            addCriterion("maintain_department <>", value, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentGreaterThan(String value) {
            addCriterion("maintain_department >", value, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_department >=", value, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentLessThan(String value) {
            addCriterion("maintain_department <", value, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentLessThanOrEqualTo(String value) {
            addCriterion("maintain_department <=", value, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentLike(String value) {
            addCriterion("maintain_department like", value, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentNotLike(String value) {
            addCriterion("maintain_department not like", value, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentIn(List<String> values) {
            addCriterion("maintain_department in", values, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentNotIn(List<String> values) {
            addCriterion("maintain_department not in", values, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentBetween(String value1, String value2) {
            addCriterion("maintain_department between", value1, value2, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainDepartmentNotBetween(String value1, String value2) {
            addCriterion("maintain_department not between", value1, value2, "maintainDepartment");
            return (Criteria) this;
        }

        public Criteria andMaintainTypeIsNull() {
            addCriterion("maintain_type is null");
            return (Criteria) this;
        }

        public Criteria andMaintainTypeIsNotNull() {
            addCriterion("maintain_type is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainTypeEqualTo(String value) {
            addCriterion("maintain_type =", value, "maintainType");
            return (Criteria) this;
        }

        public Criteria andMaintainTypeNotEqualTo(String value) {
            addCriterion("maintain_type <>", value, "maintainType");
            return (Criteria) this;
        }

        public Criteria andMaintainTypeGreaterThan(String value) {
            addCriterion("maintain_type >", value, "maintainType");
            return (Criteria) this;
        }

        public Criteria andMaintainTypeGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_type >=", value, "maintainType");
            return (Criteria) this;
        }

        public Criteria andMaintainTypeLessThan(String value) {
            addCriterion("maintain_type <", value, "maintainType");
            return (Criteria) this;
        }

        public Criteria andMaintainTypeLessThanOrEqualTo(String value) {
            addCriterion("maintain_type <=", value, "maintainType");
            return (Criteria) this;
        }

        public Criteria andMaintainTypeLike(String value) {
            addCriterion("maintain_type like", value, "maintainType");
            return (Criteria) this;
        }

        public Criteria andMaintainTypeNotLike(String value) {
            addCriterion("maintain_type not like", value, "maintainType");
            return (Criteria) this;
        }

        public Criteria andMaintainTypeIn(List<String> values) {
            addCriterion("maintain_type in", values, "maintainType");
            return (Criteria) this;
        }

        public Criteria andMaintainTypeNotIn(List<String> values) {
            addCriterion("maintain_type not in", values, "maintainType");
            return (Criteria) this;
        }

        public Criteria andMaintainTypeBetween(String value1, String value2) {
            addCriterion("maintain_type between", value1, value2, "maintainType");
            return (Criteria) this;
        }

        public Criteria andMaintainTypeNotBetween(String value1, String value2) {
            addCriterion("maintain_type not between", value1, value2, "maintainType");
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