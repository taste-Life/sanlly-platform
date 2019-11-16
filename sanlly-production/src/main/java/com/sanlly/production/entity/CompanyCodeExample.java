package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public CompanyCodeExample() {
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

        public Criteria andProdCompanyCodeIdIsNull() {
            addCriterion("prod_company_code_id is null");
            return (Criteria) this;
        }

        public Criteria andProdCompanyCodeIdIsNotNull() {
            addCriterion("prod_company_code_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdCompanyCodeIdEqualTo(Integer value) {
            addCriterion("prod_company_code_id =", value, "prodCompanyCodeId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyCodeIdNotEqualTo(Integer value) {
            addCriterion("prod_company_code_id <>", value, "prodCompanyCodeId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyCodeIdGreaterThan(Integer value) {
            addCriterion("prod_company_code_id >", value, "prodCompanyCodeId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyCodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_company_code_id >=", value, "prodCompanyCodeId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyCodeIdLessThan(Integer value) {
            addCriterion("prod_company_code_id <", value, "prodCompanyCodeId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyCodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_company_code_id <=", value, "prodCompanyCodeId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyCodeIdIn(List<Integer> values) {
            addCriterion("prod_company_code_id in", values, "prodCompanyCodeId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyCodeIdNotIn(List<Integer> values) {
            addCriterion("prod_company_code_id not in", values, "prodCompanyCodeId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyCodeIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_company_code_id between", value1, value2, "prodCompanyCodeId");
            return (Criteria) this;
        }

        public Criteria andProdCompanyCodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_company_code_id not between", value1, value2, "prodCompanyCodeId");
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

        public Criteria andYardIsNull() {
            addCriterion("yard is null");
            return (Criteria) this;
        }

        public Criteria andYardIsNotNull() {
            addCriterion("yard is not null");
            return (Criteria) this;
        }

        public Criteria andYardEqualTo(String value) {
            addCriterion("yard =", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotEqualTo(String value) {
            addCriterion("yard <>", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardGreaterThan(String value) {
            addCriterion("yard >", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardGreaterThanOrEqualTo(String value) {
            addCriterion("yard >=", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardLessThan(String value) {
            addCriterion("yard <", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardLessThanOrEqualTo(String value) {
            addCriterion("yard <=", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardLike(String value) {
            addCriterion("yard like", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotLike(String value) {
            addCriterion("yard not like", value, "yard");
            return (Criteria) this;
        }

        public Criteria andYardIn(List<String> values) {
            addCriterion("yard in", values, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotIn(List<String> values) {
            addCriterion("yard not in", values, "yard");
            return (Criteria) this;
        }

        public Criteria andYardBetween(String value1, String value2) {
            addCriterion("yard between", value1, value2, "yard");
            return (Criteria) this;
        }

        public Criteria andYardNotBetween(String value1, String value2) {
            addCriterion("yard not between", value1, value2, "yard");
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

        public Criteria andSendCodeIsNull() {
            addCriterion("send_code is null");
            return (Criteria) this;
        }

        public Criteria andSendCodeIsNotNull() {
            addCriterion("send_code is not null");
            return (Criteria) this;
        }

        public Criteria andSendCodeEqualTo(String value) {
            addCriterion("send_code =", value, "sendCode");
            return (Criteria) this;
        }

        public Criteria andSendCodeNotEqualTo(String value) {
            addCriterion("send_code <>", value, "sendCode");
            return (Criteria) this;
        }

        public Criteria andSendCodeGreaterThan(String value) {
            addCriterion("send_code >", value, "sendCode");
            return (Criteria) this;
        }

        public Criteria andSendCodeGreaterThanOrEqualTo(String value) {
            addCriterion("send_code >=", value, "sendCode");
            return (Criteria) this;
        }

        public Criteria andSendCodeLessThan(String value) {
            addCriterion("send_code <", value, "sendCode");
            return (Criteria) this;
        }

        public Criteria andSendCodeLessThanOrEqualTo(String value) {
            addCriterion("send_code <=", value, "sendCode");
            return (Criteria) this;
        }

        public Criteria andSendCodeLike(String value) {
            addCriterion("send_code like", value, "sendCode");
            return (Criteria) this;
        }

        public Criteria andSendCodeNotLike(String value) {
            addCriterion("send_code not like", value, "sendCode");
            return (Criteria) this;
        }

        public Criteria andSendCodeIn(List<String> values) {
            addCriterion("send_code in", values, "sendCode");
            return (Criteria) this;
        }

        public Criteria andSendCodeNotIn(List<String> values) {
            addCriterion("send_code not in", values, "sendCode");
            return (Criteria) this;
        }

        public Criteria andSendCodeBetween(String value1, String value2) {
            addCriterion("send_code between", value1, value2, "sendCode");
            return (Criteria) this;
        }

        public Criteria andSendCodeNotBetween(String value1, String value2) {
            addCriterion("send_code not between", value1, value2, "sendCode");
            return (Criteria) this;
        }

        public Criteria andReceptionCodeIsNull() {
            addCriterion("reception_code is null");
            return (Criteria) this;
        }

        public Criteria andReceptionCodeIsNotNull() {
            addCriterion("reception_code is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionCodeEqualTo(String value) {
            addCriterion("reception_code =", value, "receptionCode");
            return (Criteria) this;
        }

        public Criteria andReceptionCodeNotEqualTo(String value) {
            addCriterion("reception_code <>", value, "receptionCode");
            return (Criteria) this;
        }

        public Criteria andReceptionCodeGreaterThan(String value) {
            addCriterion("reception_code >", value, "receptionCode");
            return (Criteria) this;
        }

        public Criteria andReceptionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("reception_code >=", value, "receptionCode");
            return (Criteria) this;
        }

        public Criteria andReceptionCodeLessThan(String value) {
            addCriterion("reception_code <", value, "receptionCode");
            return (Criteria) this;
        }

        public Criteria andReceptionCodeLessThanOrEqualTo(String value) {
            addCriterion("reception_code <=", value, "receptionCode");
            return (Criteria) this;
        }

        public Criteria andReceptionCodeLike(String value) {
            addCriterion("reception_code like", value, "receptionCode");
            return (Criteria) this;
        }

        public Criteria andReceptionCodeNotLike(String value) {
            addCriterion("reception_code not like", value, "receptionCode");
            return (Criteria) this;
        }

        public Criteria andReceptionCodeIn(List<String> values) {
            addCriterion("reception_code in", values, "receptionCode");
            return (Criteria) this;
        }

        public Criteria andReceptionCodeNotIn(List<String> values) {
            addCriterion("reception_code not in", values, "receptionCode");
            return (Criteria) this;
        }

        public Criteria andReceptionCodeBetween(String value1, String value2) {
            addCriterion("reception_code between", value1, value2, "receptionCode");
            return (Criteria) this;
        }

        public Criteria andReceptionCodeNotBetween(String value1, String value2) {
            addCriterion("reception_code not between", value1, value2, "receptionCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeIsNull() {
            addCriterion("facility_code is null");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeIsNotNull() {
            addCriterion("facility_code is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeEqualTo(String value) {
            addCriterion("facility_code =", value, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeNotEqualTo(String value) {
            addCriterion("facility_code <>", value, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeGreaterThan(String value) {
            addCriterion("facility_code >", value, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("facility_code >=", value, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeLessThan(String value) {
            addCriterion("facility_code <", value, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeLessThanOrEqualTo(String value) {
            addCriterion("facility_code <=", value, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeLike(String value) {
            addCriterion("facility_code like", value, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeNotLike(String value) {
            addCriterion("facility_code not like", value, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeIn(List<String> values) {
            addCriterion("facility_code in", values, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeNotIn(List<String> values) {
            addCriterion("facility_code not in", values, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeBetween(String value1, String value2) {
            addCriterion("facility_code between", value1, value2, "facilityCode");
            return (Criteria) this;
        }

        public Criteria andFacilityCodeNotBetween(String value1, String value2) {
            addCriterion("facility_code not between", value1, value2, "facilityCode");
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