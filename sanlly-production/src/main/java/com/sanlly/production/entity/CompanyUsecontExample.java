package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyUsecontExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CompanyUsecontExample() {
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

        public Criteria andProdCompanyUsecontIdIsNull() {
            addCriterion("prod_company_usecont_id is null");
            return (Criteria) this;
        }

        public Criteria andProdCompanyUsecontIdIsNotNull() {
            addCriterion("prod_company_usecont_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdCompanyUsecontIdEqualTo(Integer value) {
            addCriterion("prod_company_usecont_id =", value, "prodCompanyUsecontId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyUsecontIdNotEqualTo(Integer value) {
            addCriterion("prod_company_usecont_id <>", value, "prodCompanyUsecontId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyUsecontIdGreaterThan(Integer value) {
            addCriterion("prod_company_usecont_id >", value, "prodCompanyUsecontId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyUsecontIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_company_usecont_id >=", value, "prodCompanyUsecontId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyUsecontIdLessThan(Integer value) {
            addCriterion("prod_company_usecont_id <", value, "prodCompanyUsecontId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyUsecontIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_company_usecont_id <=", value, "prodCompanyUsecontId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyUsecontIdIn(List<Integer> values) {
            addCriterion("prod_company_usecont_id in", values, "prodCompanyUsecontId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyUsecontIdNotIn(List<Integer> values) {
            addCriterion("prod_company_usecont_id not in", values, "prodCompanyUsecontId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyUsecontIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_company_usecont_id between", value1, value2, "prodCompanyUsecontId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyUsecontIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_company_usecont_id not between", value1, value2, "prodCompanyUsecontId");
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

        public Criteria andContainerUserIsNull() {
            addCriterion("container_user is null");
            return (Criteria) this;
        }

        public Criteria andContainerUserIsNotNull() {
            addCriterion("container_user is not null");
            return (Criteria) this;
        }

        public Criteria andContainerUserEqualTo(String value) {
            addCriterion("container_user =", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserNotEqualTo(String value) {
            addCriterion("container_user <>", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserGreaterThan(String value) {
            addCriterion("container_user >", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserGreaterThanOrEqualTo(String value) {
            addCriterion("container_user >=", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserLessThan(String value) {
            addCriterion("container_user <", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserLessThanOrEqualTo(String value) {
            addCriterion("container_user <=", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserLike(String value) {
            addCriterion("container_user like", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserNotLike(String value) {
            addCriterion("container_user not like", value, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserIn(List<String> values) {
            addCriterion("container_user in", values, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserNotIn(List<String> values) {
            addCriterion("container_user not in", values, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserBetween(String value1, String value2) {
            addCriterion("container_user between", value1, value2, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerUserNotBetween(String value1, String value2) {
            addCriterion("container_user not between", value1, value2, "containerUser");
            return (Criteria) this;
        }

        public Criteria andContainerPriorityIsNull() {
            addCriterion("container_priority is null");
            return (Criteria) this;
        }

        public Criteria andContainerPriorityIsNotNull() {
            addCriterion("container_priority is not null");
            return (Criteria) this;
        }

        public Criteria andContainerPriorityEqualTo(Integer value) {
            addCriterion("container_priority =", value, "containerPriority");
            return (Criteria) this;
        }

        public Criteria andContainerPriorityNotEqualTo(Integer value) {
            addCriterion("container_priority <>", value, "containerPriority");
            return (Criteria) this;
        }

        public Criteria andContainerPriorityGreaterThan(Integer value) {
            addCriterion("container_priority >", value, "containerPriority");
            return (Criteria) this;
        }

        public Criteria andContainerPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("container_priority >=", value, "containerPriority");
            return (Criteria) this;
        }

        public Criteria andContainerPriorityLessThan(Integer value) {
            addCriterion("container_priority <", value, "containerPriority");
            return (Criteria) this;
        }

        public Criteria andContainerPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("container_priority <=", value, "containerPriority");
            return (Criteria) this;
        }

        public Criteria andContainerPriorityIn(List<Integer> values) {
            addCriterion("container_priority in", values, "containerPriority");
            return (Criteria) this;
        }

        public Criteria andContainerPriorityNotIn(List<Integer> values) {
            addCriterion("container_priority not in", values, "containerPriority");
            return (Criteria) this;
        }

        public Criteria andContainerPriorityBetween(Integer value1, Integer value2) {
            addCriterion("container_priority between", value1, value2, "containerPriority");
            return (Criteria) this;
        }

        public Criteria andContainerPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("container_priority not between", value1, value2, "containerPriority");
            return (Criteria) this;
        }

        public Criteria andRepairPeriodIsNull() {
            addCriterion("repair_period is null");
            return (Criteria) this;
        }

        public Criteria andRepairPeriodIsNotNull() {
            addCriterion("repair_period is not null");
            return (Criteria) this;
        }

        public Criteria andRepairPeriodEqualTo(Double value) {
            addCriterion("repair_period =", value, "repairPeriod");
            return (Criteria) this;
        }

        public Criteria andRepairPeriodNotEqualTo(Double value) {
            addCriterion("repair_period <>", value, "repairPeriod");
            return (Criteria) this;
        }

        public Criteria andRepairPeriodGreaterThan(Double value) {
            addCriterion("repair_period >", value, "repairPeriod");
            return (Criteria) this;
        }

        public Criteria andRepairPeriodGreaterThanOrEqualTo(Double value) {
            addCriterion("repair_period >=", value, "repairPeriod");
            return (Criteria) this;
        }

        public Criteria andRepairPeriodLessThan(Double value) {
            addCriterion("repair_period <", value, "repairPeriod");
            return (Criteria) this;
        }

        public Criteria andRepairPeriodLessThanOrEqualTo(Double value) {
            addCriterion("repair_period <=", value, "repairPeriod");
            return (Criteria) this;
        }

        public Criteria andRepairPeriodIn(List<Double> values) {
            addCriterion("repair_period in", values, "repairPeriod");
            return (Criteria) this;
        }

        public Criteria andRepairPeriodNotIn(List<Double> values) {
            addCriterion("repair_period not in", values, "repairPeriod");
            return (Criteria) this;
        }

        public Criteria andRepairPeriodBetween(Double value1, Double value2) {
            addCriterion("repair_period between", value1, value2, "repairPeriod");
            return (Criteria) this;
        }

        public Criteria andRepairPeriodNotBetween(Double value1, Double value2) {
            addCriterion("repair_period not between", value1, value2, "repairPeriod");
            return (Criteria) this;
        }

        public Criteria andDifferenceMoneyIsNull() {
            addCriterion("difference_money is null");
            return (Criteria) this;
        }

        public Criteria andDifferenceMoneyIsNotNull() {
            addCriterion("difference_money is not null");
            return (Criteria) this;
        }

        public Criteria andDifferenceMoneyEqualTo(BigDecimal value) {
            addCriterion("difference_money =", value, "differenceMoney");
            return (Criteria) this;
        }

        public Criteria andDifferenceMoneyNotEqualTo(BigDecimal value) {
            addCriterion("difference_money <>", value, "differenceMoney");
            return (Criteria) this;
        }

        public Criteria andDifferenceMoneyGreaterThan(BigDecimal value) {
            addCriterion("difference_money >", value, "differenceMoney");
            return (Criteria) this;
        }

        public Criteria andDifferenceMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("difference_money >=", value, "differenceMoney");
            return (Criteria) this;
        }

        public Criteria andDifferenceMoneyLessThan(BigDecimal value) {
            addCriterion("difference_money <", value, "differenceMoney");
            return (Criteria) this;
        }

        public Criteria andDifferenceMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("difference_money <=", value, "differenceMoney");
            return (Criteria) this;
        }

        public Criteria andDifferenceMoneyIn(List<BigDecimal> values) {
            addCriterion("difference_money in", values, "differenceMoney");
            return (Criteria) this;
        }

        public Criteria andDifferenceMoneyNotIn(List<BigDecimal> values) {
            addCriterion("difference_money not in", values, "differenceMoney");
            return (Criteria) this;
        }

        public Criteria andDifferenceMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("difference_money between", value1, value2, "differenceMoney");
            return (Criteria) this;
        }

        public Criteria andDifferenceMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("difference_money not between", value1, value2, "differenceMoney");
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