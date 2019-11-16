package com.sanlly.warehouse.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WareRefrigeratorCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public WareRefrigeratorCompanyExample() {
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

        public Criteria andWareRefrigeratorCompanyIdIsNull() {
            addCriterion("ware_refrigerator_company_id is null");
            return (Criteria) this;
        }

        public Criteria andWareRefrigeratorCompanyIdIsNotNull() {
            addCriterion("ware_refrigerator_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andWareRefrigeratorCompanyIdEqualTo(Integer value) {
            addCriterion("ware_refrigerator_company_id =", value, "wareRefrigeratorCompanyId");
            return (Criteria) this;
        }

        public Criteria andWareRefrigeratorCompanyIdNotEqualTo(Integer value) {
            addCriterion("ware_refrigerator_company_id <>", value, "wareRefrigeratorCompanyId");
            return (Criteria) this;
        }

        public Criteria andWareRefrigeratorCompanyIdGreaterThan(Integer value) {
            addCriterion("ware_refrigerator_company_id >", value, "wareRefrigeratorCompanyId");
            return (Criteria) this;
        }

        public Criteria andWareRefrigeratorCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ware_refrigerator_company_id >=", value, "wareRefrigeratorCompanyId");
            return (Criteria) this;
        }

        public Criteria andWareRefrigeratorCompanyIdLessThan(Integer value) {
            addCriterion("ware_refrigerator_company_id <", value, "wareRefrigeratorCompanyId");
            return (Criteria) this;
        }

        public Criteria andWareRefrigeratorCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("ware_refrigerator_company_id <=", value, "wareRefrigeratorCompanyId");
            return (Criteria) this;
        }

        public Criteria andWareRefrigeratorCompanyIdIn(List<Integer> values) {
            addCriterion("ware_refrigerator_company_id in", values, "wareRefrigeratorCompanyId");
            return (Criteria) this;
        }

        public Criteria andWareRefrigeratorCompanyIdNotIn(List<Integer> values) {
            addCriterion("ware_refrigerator_company_id not in", values, "wareRefrigeratorCompanyId");
            return (Criteria) this;
        }

        public Criteria andWareRefrigeratorCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("ware_refrigerator_company_id between", value1, value2, "wareRefrigeratorCompanyId");
            return (Criteria) this;
        }

        public Criteria andWareRefrigeratorCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ware_refrigerator_company_id not between", value1, value2, "wareRefrigeratorCompanyId");
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

        public Criteria andRefrigeratorCompanyNameIsNull() {
            addCriterion("refrigerator_company_name is null");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameIsNotNull() {
            addCriterion("refrigerator_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameEqualTo(String value) {
            addCriterion("refrigerator_company_name =", value, "refrigeratorCompanyName");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameNotEqualTo(String value) {
            addCriterion("refrigerator_company_name <>", value, "refrigeratorCompanyName");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameGreaterThan(String value) {
            addCriterion("refrigerator_company_name >", value, "refrigeratorCompanyName");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("refrigerator_company_name >=", value, "refrigeratorCompanyName");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameLessThan(String value) {
            addCriterion("refrigerator_company_name <", value, "refrigeratorCompanyName");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("refrigerator_company_name <=", value, "refrigeratorCompanyName");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameLike(String value) {
            addCriterion("refrigerator_company_name like", value, "refrigeratorCompanyName");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameNotLike(String value) {
            addCriterion("refrigerator_company_name not like", value, "refrigeratorCompanyName");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameIn(List<String> values) {
            addCriterion("refrigerator_company_name in", values, "refrigeratorCompanyName");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameNotIn(List<String> values) {
            addCriterion("refrigerator_company_name not in", values, "refrigeratorCompanyName");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameBetween(String value1, String value2) {
            addCriterion("refrigerator_company_name between", value1, value2, "refrigeratorCompanyName");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameNotBetween(String value1, String value2) {
            addCriterion("refrigerator_company_name not between", value1, value2, "refrigeratorCompanyName");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyAddrIsNull() {
            addCriterion("refrigerator_company_addr is null");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyAddrIsNotNull() {
            addCriterion("refrigerator_company_addr is not null");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyAddrEqualTo(String value) {
            addCriterion("refrigerator_company_addr =", value, "refrigeratorCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyAddrNotEqualTo(String value) {
            addCriterion("refrigerator_company_addr <>", value, "refrigeratorCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyAddrGreaterThan(String value) {
            addCriterion("refrigerator_company_addr >", value, "refrigeratorCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyAddrGreaterThanOrEqualTo(String value) {
            addCriterion("refrigerator_company_addr >=", value, "refrigeratorCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyAddrLessThan(String value) {
            addCriterion("refrigerator_company_addr <", value, "refrigeratorCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyAddrLessThanOrEqualTo(String value) {
            addCriterion("refrigerator_company_addr <=", value, "refrigeratorCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyAddrLike(String value) {
            addCriterion("refrigerator_company_addr like", value, "refrigeratorCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyAddrNotLike(String value) {
            addCriterion("refrigerator_company_addr not like", value, "refrigeratorCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyAddrIn(List<String> values) {
            addCriterion("refrigerator_company_addr in", values, "refrigeratorCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyAddrNotIn(List<String> values) {
            addCriterion("refrigerator_company_addr not in", values, "refrigeratorCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyAddrBetween(String value1, String value2) {
            addCriterion("refrigerator_company_addr between", value1, value2, "refrigeratorCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyAddrNotBetween(String value1, String value2) {
            addCriterion("refrigerator_company_addr not between", value1, value2, "refrigeratorCompanyAddr");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsIsNull() {
            addCriterion("applicable_models is null");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsIsNotNull() {
            addCriterion("applicable_models is not null");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsEqualTo(String value) {
            addCriterion("applicable_models =", value, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsNotEqualTo(String value) {
            addCriterion("applicable_models <>", value, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsGreaterThan(String value) {
            addCriterion("applicable_models >", value, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsGreaterThanOrEqualTo(String value) {
            addCriterion("applicable_models >=", value, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsLessThan(String value) {
            addCriterion("applicable_models <", value, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsLessThanOrEqualTo(String value) {
            addCriterion("applicable_models <=", value, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsLike(String value) {
            addCriterion("applicable_models like", value, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsNotLike(String value) {
            addCriterion("applicable_models not like", value, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsIn(List<String> values) {
            addCriterion("applicable_models in", values, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsNotIn(List<String> values) {
            addCriterion("applicable_models not in", values, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsBetween(String value1, String value2) {
            addCriterion("applicable_models between", value1, value2, "applicableModels");
            return (Criteria) this;
        }

        public Criteria andApplicableModelsNotBetween(String value1, String value2) {
            addCriterion("applicable_models not between", value1, value2, "applicableModels");
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

        public Criteria andRefrigeratorCompanyNameEnIsNull() {
            addCriterion("refrigerator_company_name_en is null");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameEnIsNotNull() {
            addCriterion("refrigerator_company_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameEnEqualTo(String value) {
            addCriterion("refrigerator_company_name_en =", value, "refrigeratorCompanyNameEn");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameEnNotEqualTo(String value) {
            addCriterion("refrigerator_company_name_en <>", value, "refrigeratorCompanyNameEn");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameEnGreaterThan(String value) {
            addCriterion("refrigerator_company_name_en >", value, "refrigeratorCompanyNameEn");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("refrigerator_company_name_en >=", value, "refrigeratorCompanyNameEn");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameEnLessThan(String value) {
            addCriterion("refrigerator_company_name_en <", value, "refrigeratorCompanyNameEn");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameEnLessThanOrEqualTo(String value) {
            addCriterion("refrigerator_company_name_en <=", value, "refrigeratorCompanyNameEn");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameEnLike(String value) {
            addCriterion("refrigerator_company_name_en like", value, "refrigeratorCompanyNameEn");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameEnNotLike(String value) {
            addCriterion("refrigerator_company_name_en not like", value, "refrigeratorCompanyNameEn");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameEnIn(List<String> values) {
            addCriterion("refrigerator_company_name_en in", values, "refrigeratorCompanyNameEn");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameEnNotIn(List<String> values) {
            addCriterion("refrigerator_company_name_en not in", values, "refrigeratorCompanyNameEn");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameEnBetween(String value1, String value2) {
            addCriterion("refrigerator_company_name_en between", value1, value2, "refrigeratorCompanyNameEn");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyNameEnNotBetween(String value1, String value2) {
            addCriterion("refrigerator_company_name_en not between", value1, value2, "refrigeratorCompanyNameEn");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyCodeIsNull() {
            addCriterion("refrigerator_company_code is null");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyCodeIsNotNull() {
            addCriterion("refrigerator_company_code is not null");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyCodeEqualTo(String value) {
            addCriterion("refrigerator_company_code =", value, "refrigeratorCompanyCode");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyCodeNotEqualTo(String value) {
            addCriterion("refrigerator_company_code <>", value, "refrigeratorCompanyCode");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyCodeGreaterThan(String value) {
            addCriterion("refrigerator_company_code >", value, "refrigeratorCompanyCode");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("refrigerator_company_code >=", value, "refrigeratorCompanyCode");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyCodeLessThan(String value) {
            addCriterion("refrigerator_company_code <", value, "refrigeratorCompanyCode");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("refrigerator_company_code <=", value, "refrigeratorCompanyCode");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyCodeLike(String value) {
            addCriterion("refrigerator_company_code like", value, "refrigeratorCompanyCode");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyCodeNotLike(String value) {
            addCriterion("refrigerator_company_code not like", value, "refrigeratorCompanyCode");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyCodeIn(List<String> values) {
            addCriterion("refrigerator_company_code in", values, "refrigeratorCompanyCode");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyCodeNotIn(List<String> values) {
            addCriterion("refrigerator_company_code not in", values, "refrigeratorCompanyCode");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyCodeBetween(String value1, String value2) {
            addCriterion("refrigerator_company_code between", value1, value2, "refrigeratorCompanyCode");
            return (Criteria) this;
        }

        public Criteria andRefrigeratorCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("refrigerator_company_code not between", value1, value2, "refrigeratorCompanyCode");
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