package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeamEntryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public TeamEntryExample() {
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

        public Criteria andProdTeamEntryIdIsNull() {
            addCriterion("prod_team_entry_id is null");
            return (Criteria) this;
        }

        public Criteria andProdTeamEntryIdIsNotNull() {
            addCriterion("prod_team_entry_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdTeamEntryIdEqualTo(Integer value) {
            addCriterion("prod_team_entry_id =", value, "prodTeamEntryId");
            return (Criteria) this;
        }

        public Criteria andProdTeamEntryIdNotEqualTo(Integer value) {
            addCriterion("prod_team_entry_id <>", value, "prodTeamEntryId");
            return (Criteria) this;
        }

        public Criteria andProdTeamEntryIdGreaterThan(Integer value) {
            addCriterion("prod_team_entry_id >", value, "prodTeamEntryId");
            return (Criteria) this;
        }

        public Criteria andProdTeamEntryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_team_entry_id >=", value, "prodTeamEntryId");
            return (Criteria) this;
        }

        public Criteria andProdTeamEntryIdLessThan(Integer value) {
            addCriterion("prod_team_entry_id <", value, "prodTeamEntryId");
            return (Criteria) this;
        }

        public Criteria andProdTeamEntryIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_team_entry_id <=", value, "prodTeamEntryId");
            return (Criteria) this;
        }

        public Criteria andProdTeamEntryIdIn(List<Integer> values) {
            addCriterion("prod_team_entry_id in", values, "prodTeamEntryId");
            return (Criteria) this;
        }

        public Criteria andProdTeamEntryIdNotIn(List<Integer> values) {
            addCriterion("prod_team_entry_id not in", values, "prodTeamEntryId");
            return (Criteria) this;
        }

        public Criteria andProdTeamEntryIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_team_entry_id between", value1, value2, "prodTeamEntryId");
            return (Criteria) this;
        }

        public Criteria andProdTeamEntryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_team_entry_id not between", value1, value2, "prodTeamEntryId");
            return (Criteria) this;
        }

        public Criteria andTeamIsNull() {
            addCriterion("team is null");
            return (Criteria) this;
        }

        public Criteria andTeamIsNotNull() {
            addCriterion("team is not null");
            return (Criteria) this;
        }

        public Criteria andTeamEqualTo(Integer value) {
            addCriterion("team =", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotEqualTo(Integer value) {
            addCriterion("team <>", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThan(Integer value) {
            addCriterion("team >", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThanOrEqualTo(Integer value) {
            addCriterion("team >=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThan(Integer value) {
            addCriterion("team <", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThanOrEqualTo(Integer value) {
            addCriterion("team <=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamIn(List<Integer> values) {
            addCriterion("team in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotIn(List<Integer> values) {
            addCriterion("team not in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamBetween(Integer value1, Integer value2) {
            addCriterion("team between", value1, value2, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotBetween(Integer value1, Integer value2) {
            addCriterion("team not between", value1, value2, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNull() {
            addCriterion("team_name is null");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNotNull() {
            addCriterion("team_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNameEqualTo(String value) {
            addCriterion("team_name =", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotEqualTo(String value) {
            addCriterion("team_name <>", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThan(String value) {
            addCriterion("team_name >", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("team_name >=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThan(String value) {
            addCriterion("team_name <", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThanOrEqualTo(String value) {
            addCriterion("team_name <=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLike(String value) {
            addCriterion("team_name like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotLike(String value) {
            addCriterion("team_name not like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameIn(List<String> values) {
            addCriterion("team_name in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotIn(List<String> values) {
            addCriterion("team_name not in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameBetween(String value1, String value2) {
            addCriterion("team_name between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotBetween(String value1, String value2) {
            addCriterion("team_name not between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andIsOutsourcingIsNull() {
            addCriterion("is_outsourcing is null");
            return (Criteria) this;
        }

        public Criteria andIsOutsourcingIsNotNull() {
            addCriterion("is_outsourcing is not null");
            return (Criteria) this;
        }

        public Criteria andIsOutsourcingEqualTo(Integer value) {
            addCriterion("is_outsourcing =", value, "isOutsourcing");
            return (Criteria) this;
        }

        public Criteria andIsOutsourcingNotEqualTo(Integer value) {
            addCriterion("is_outsourcing <>", value, "isOutsourcing");
            return (Criteria) this;
        }

        public Criteria andIsOutsourcingGreaterThan(Integer value) {
            addCriterion("is_outsourcing >", value, "isOutsourcing");
            return (Criteria) this;
        }

        public Criteria andIsOutsourcingGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_outsourcing >=", value, "isOutsourcing");
            return (Criteria) this;
        }

        public Criteria andIsOutsourcingLessThan(Integer value) {
            addCriterion("is_outsourcing <", value, "isOutsourcing");
            return (Criteria) this;
        }

        public Criteria andIsOutsourcingLessThanOrEqualTo(Integer value) {
            addCriterion("is_outsourcing <=", value, "isOutsourcing");
            return (Criteria) this;
        }

        public Criteria andIsOutsourcingIn(List<Integer> values) {
            addCriterion("is_outsourcing in", values, "isOutsourcing");
            return (Criteria) this;
        }

        public Criteria andIsOutsourcingNotIn(List<Integer> values) {
            addCriterion("is_outsourcing not in", values, "isOutsourcing");
            return (Criteria) this;
        }

        public Criteria andIsOutsourcingBetween(Integer value1, Integer value2) {
            addCriterion("is_outsourcing between", value1, value2, "isOutsourcing");
            return (Criteria) this;
        }

        public Criteria andIsOutsourcingNotBetween(Integer value1, Integer value2) {
            addCriterion("is_outsourcing not between", value1, value2, "isOutsourcing");
            return (Criteria) this;
        }

        public Criteria andOutsourcingNameIsNull() {
            addCriterion("outsourcing_name is null");
            return (Criteria) this;
        }

        public Criteria andOutsourcingNameIsNotNull() {
            addCriterion("outsourcing_name is not null");
            return (Criteria) this;
        }

        public Criteria andOutsourcingNameEqualTo(String value) {
            addCriterion("outsourcing_name =", value, "outsourcingName");
            return (Criteria) this;
        }

        public Criteria andOutsourcingNameNotEqualTo(String value) {
            addCriterion("outsourcing_name <>", value, "outsourcingName");
            return (Criteria) this;
        }

        public Criteria andOutsourcingNameGreaterThan(String value) {
            addCriterion("outsourcing_name >", value, "outsourcingName");
            return (Criteria) this;
        }

        public Criteria andOutsourcingNameGreaterThanOrEqualTo(String value) {
            addCriterion("outsourcing_name >=", value, "outsourcingName");
            return (Criteria) this;
        }

        public Criteria andOutsourcingNameLessThan(String value) {
            addCriterion("outsourcing_name <", value, "outsourcingName");
            return (Criteria) this;
        }

        public Criteria andOutsourcingNameLessThanOrEqualTo(String value) {
            addCriterion("outsourcing_name <=", value, "outsourcingName");
            return (Criteria) this;
        }

        public Criteria andOutsourcingNameLike(String value) {
            addCriterion("outsourcing_name like", value, "outsourcingName");
            return (Criteria) this;
        }

        public Criteria andOutsourcingNameNotLike(String value) {
            addCriterion("outsourcing_name not like", value, "outsourcingName");
            return (Criteria) this;
        }

        public Criteria andOutsourcingNameIn(List<String> values) {
            addCriterion("outsourcing_name in", values, "outsourcingName");
            return (Criteria) this;
        }

        public Criteria andOutsourcingNameNotIn(List<String> values) {
            addCriterion("outsourcing_name not in", values, "outsourcingName");
            return (Criteria) this;
        }

        public Criteria andOutsourcingNameBetween(String value1, String value2) {
            addCriterion("outsourcing_name between", value1, value2, "outsourcingName");
            return (Criteria) this;
        }

        public Criteria andOutsourcingNameNotBetween(String value1, String value2) {
            addCriterion("outsourcing_name not between", value1, value2, "outsourcingName");
            return (Criteria) this;
        }

        public Criteria andTimeRestrictIsNull() {
            addCriterion("time_restrict is null");
            return (Criteria) this;
        }

        public Criteria andTimeRestrictIsNotNull() {
            addCriterion("time_restrict is not null");
            return (Criteria) this;
        }

        public Criteria andTimeRestrictEqualTo(Integer value) {
            addCriterion("time_restrict =", value, "timeRestrict");
            return (Criteria) this;
        }

        public Criteria andTimeRestrictNotEqualTo(Integer value) {
            addCriterion("time_restrict <>", value, "timeRestrict");
            return (Criteria) this;
        }

        public Criteria andTimeRestrictGreaterThan(Integer value) {
            addCriterion("time_restrict >", value, "timeRestrict");
            return (Criteria) this;
        }

        public Criteria andTimeRestrictGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_restrict >=", value, "timeRestrict");
            return (Criteria) this;
        }

        public Criteria andTimeRestrictLessThan(Integer value) {
            addCriterion("time_restrict <", value, "timeRestrict");
            return (Criteria) this;
        }

        public Criteria andTimeRestrictLessThanOrEqualTo(Integer value) {
            addCriterion("time_restrict <=", value, "timeRestrict");
            return (Criteria) this;
        }

        public Criteria andTimeRestrictIn(List<Integer> values) {
            addCriterion("time_restrict in", values, "timeRestrict");
            return (Criteria) this;
        }

        public Criteria andTimeRestrictNotIn(List<Integer> values) {
            addCriterion("time_restrict not in", values, "timeRestrict");
            return (Criteria) this;
        }

        public Criteria andTimeRestrictBetween(Integer value1, Integer value2) {
            addCriterion("time_restrict between", value1, value2, "timeRestrict");
            return (Criteria) this;
        }

        public Criteria andTimeRestrictNotBetween(Integer value1, Integer value2) {
            addCriterion("time_restrict not between", value1, value2, "timeRestrict");
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