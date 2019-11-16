package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XxContainerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public XxContainerExample() {
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

        public Criteria andProdXxContainerIdIsNull() {
            addCriterion("prod_xx_container_id is null");
            return (Criteria) this;
        }

        public Criteria andProdXxContainerIdIsNotNull() {
            addCriterion("prod_xx_container_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdXxContainerIdEqualTo(Integer value) {
            addCriterion("prod_xx_container_id =", value, "prodXxContainerId");
            return (Criteria) this;
        }

        public Criteria andProdXxContainerIdNotEqualTo(Integer value) {
            addCriterion("prod_xx_container_id <>", value, "prodXxContainerId");
            return (Criteria) this;
        }

        public Criteria andProdXxContainerIdGreaterThan(Integer value) {
            addCriterion("prod_xx_container_id >", value, "prodXxContainerId");
            return (Criteria) this;
        }

        public Criteria andProdXxContainerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_xx_container_id >=", value, "prodXxContainerId");
            return (Criteria) this;
        }

        public Criteria andProdXxContainerIdLessThan(Integer value) {
            addCriterion("prod_xx_container_id <", value, "prodXxContainerId");
            return (Criteria) this;
        }

        public Criteria andProdXxContainerIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_xx_container_id <=", value, "prodXxContainerId");
            return (Criteria) this;
        }

        public Criteria andProdXxContainerIdIn(List<Integer> values) {
            addCriterion("prod_xx_container_id in", values, "prodXxContainerId");
            return (Criteria) this;
        }

        public Criteria andProdXxContainerIdNotIn(List<Integer> values) {
            addCriterion("prod_xx_container_id not in", values, "prodXxContainerId");
            return (Criteria) this;
        }

        public Criteria andProdXxContainerIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_xx_container_id between", value1, value2, "prodXxContainerId");
            return (Criteria) this;
        }

        public Criteria andProdXxContainerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_xx_container_id not between", value1, value2, "prodXxContainerId");
            return (Criteria) this;
        }

        public Criteria andCourseIsNull() {
            addCriterion("course is null");
            return (Criteria) this;
        }

        public Criteria andCourseIsNotNull() {
            addCriterion("course is not null");
            return (Criteria) this;
        }

        public Criteria andCourseEqualTo(String value) {
            addCriterion("course =", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotEqualTo(String value) {
            addCriterion("course <>", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThan(String value) {
            addCriterion("course >", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThanOrEqualTo(String value) {
            addCriterion("course >=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThan(String value) {
            addCriterion("course <", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThanOrEqualTo(String value) {
            addCriterion("course <=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLike(String value) {
            addCriterion("course like", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotLike(String value) {
            addCriterion("course not like", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseIn(List<String> values) {
            addCriterion("course in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotIn(List<String> values) {
            addCriterion("course not in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseBetween(String value1, String value2) {
            addCriterion("course between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotBetween(String value1, String value2) {
            addCriterion("course not between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andContainerIsNull() {
            addCriterion("container is null");
            return (Criteria) this;
        }

        public Criteria andContainerIsNotNull() {
            addCriterion("container is not null");
            return (Criteria) this;
        }

        public Criteria andContainerEqualTo(String value) {
            addCriterion("container =", value, "container");
            return (Criteria) this;
        }

        public Criteria andContainerNotEqualTo(String value) {
            addCriterion("container <>", value, "container");
            return (Criteria) this;
        }

        public Criteria andContainerGreaterThan(String value) {
            addCriterion("container >", value, "container");
            return (Criteria) this;
        }

        public Criteria andContainerGreaterThanOrEqualTo(String value) {
            addCriterion("container >=", value, "container");
            return (Criteria) this;
        }

        public Criteria andContainerLessThan(String value) {
            addCriterion("container <", value, "container");
            return (Criteria) this;
        }

        public Criteria andContainerLessThanOrEqualTo(String value) {
            addCriterion("container <=", value, "container");
            return (Criteria) this;
        }

        public Criteria andContainerLike(String value) {
            addCriterion("container like", value, "container");
            return (Criteria) this;
        }

        public Criteria andContainerNotLike(String value) {
            addCriterion("container not like", value, "container");
            return (Criteria) this;
        }

        public Criteria andContainerIn(List<String> values) {
            addCriterion("container in", values, "container");
            return (Criteria) this;
        }

        public Criteria andContainerNotIn(List<String> values) {
            addCriterion("container not in", values, "container");
            return (Criteria) this;
        }

        public Criteria andContainerBetween(String value1, String value2) {
            addCriterion("container between", value1, value2, "container");
            return (Criteria) this;
        }

        public Criteria andContainerNotBetween(String value1, String value2) {
            addCriterion("container not between", value1, value2, "container");
            return (Criteria) this;
        }

        public Criteria andContainerNoIsNull() {
            addCriterion("container_no is null");
            return (Criteria) this;
        }

        public Criteria andContainerNoIsNotNull() {
            addCriterion("container_no is not null");
            return (Criteria) this;
        }

        public Criteria andContainerNoEqualTo(String value) {
            addCriterion("container_no =", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotEqualTo(String value) {
            addCriterion("container_no <>", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoGreaterThan(String value) {
            addCriterion("container_no >", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoGreaterThanOrEqualTo(String value) {
            addCriterion("container_no >=", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoLessThan(String value) {
            addCriterion("container_no <", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoLessThanOrEqualTo(String value) {
            addCriterion("container_no <=", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoLike(String value) {
            addCriterion("container_no like", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotLike(String value) {
            addCriterion("container_no not like", value, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoIn(List<String> values) {
            addCriterion("container_no in", values, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotIn(List<String> values) {
            addCriterion("container_no not in", values, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoBetween(String value1, String value2) {
            addCriterion("container_no between", value1, value2, "containerNo");
            return (Criteria) this;
        }

        public Criteria andContainerNoNotBetween(String value1, String value2) {
            addCriterion("container_no not between", value1, value2, "containerNo");
            return (Criteria) this;
        }

        public Criteria andIsXxIsNull() {
            addCriterion("is_xx is null");
            return (Criteria) this;
        }

        public Criteria andIsXxIsNotNull() {
            addCriterion("is_xx is not null");
            return (Criteria) this;
        }

        public Criteria andIsXxEqualTo(String value) {
            addCriterion("is_xx =", value, "isXx");
            return (Criteria) this;
        }

        public Criteria andIsXxNotEqualTo(String value) {
            addCriterion("is_xx <>", value, "isXx");
            return (Criteria) this;
        }

        public Criteria andIsXxGreaterThan(String value) {
            addCriterion("is_xx >", value, "isXx");
            return (Criteria) this;
        }

        public Criteria andIsXxGreaterThanOrEqualTo(String value) {
            addCriterion("is_xx >=", value, "isXx");
            return (Criteria) this;
        }

        public Criteria andIsXxLessThan(String value) {
            addCriterion("is_xx <", value, "isXx");
            return (Criteria) this;
        }

        public Criteria andIsXxLessThanOrEqualTo(String value) {
            addCriterion("is_xx <=", value, "isXx");
            return (Criteria) this;
        }

        public Criteria andIsXxLike(String value) {
            addCriterion("is_xx like", value, "isXx");
            return (Criteria) this;
        }

        public Criteria andIsXxNotLike(String value) {
            addCriterion("is_xx not like", value, "isXx");
            return (Criteria) this;
        }

        public Criteria andIsXxIn(List<String> values) {
            addCriterion("is_xx in", values, "isXx");
            return (Criteria) this;
        }

        public Criteria andIsXxNotIn(List<String> values) {
            addCriterion("is_xx not in", values, "isXx");
            return (Criteria) this;
        }

        public Criteria andIsXxBetween(String value1, String value2) {
            addCriterion("is_xx between", value1, value2, "isXx");
            return (Criteria) this;
        }

        public Criteria andIsXxNotBetween(String value1, String value2) {
            addCriterion("is_xx not between", value1, value2, "isXx");
            return (Criteria) this;
        }

        public Criteria andXxStateIsNull() {
            addCriterion("xx_state is null");
            return (Criteria) this;
        }

        public Criteria andXxStateIsNotNull() {
            addCriterion("xx_state is not null");
            return (Criteria) this;
        }

        public Criteria andXxStateEqualTo(String value) {
            addCriterion("xx_state =", value, "xxState");
            return (Criteria) this;
        }

        public Criteria andXxStateNotEqualTo(String value) {
            addCriterion("xx_state <>", value, "xxState");
            return (Criteria) this;
        }

        public Criteria andXxStateGreaterThan(String value) {
            addCriterion("xx_state >", value, "xxState");
            return (Criteria) this;
        }

        public Criteria andXxStateGreaterThanOrEqualTo(String value) {
            addCriterion("xx_state >=", value, "xxState");
            return (Criteria) this;
        }

        public Criteria andXxStateLessThan(String value) {
            addCriterion("xx_state <", value, "xxState");
            return (Criteria) this;
        }

        public Criteria andXxStateLessThanOrEqualTo(String value) {
            addCriterion("xx_state <=", value, "xxState");
            return (Criteria) this;
        }

        public Criteria andXxStateLike(String value) {
            addCriterion("xx_state like", value, "xxState");
            return (Criteria) this;
        }

        public Criteria andXxStateNotLike(String value) {
            addCriterion("xx_state not like", value, "xxState");
            return (Criteria) this;
        }

        public Criteria andXxStateIn(List<String> values) {
            addCriterion("xx_state in", values, "xxState");
            return (Criteria) this;
        }

        public Criteria andXxStateNotIn(List<String> values) {
            addCriterion("xx_state not in", values, "xxState");
            return (Criteria) this;
        }

        public Criteria andXxStateBetween(String value1, String value2) {
            addCriterion("xx_state between", value1, value2, "xxState");
            return (Criteria) this;
        }

        public Criteria andXxStateNotBetween(String value1, String value2) {
            addCriterion("xx_state not between", value1, value2, "xxState");
            return (Criteria) this;
        }

        public Criteria andPtiResultIsNull() {
            addCriterion("pti_result is null");
            return (Criteria) this;
        }

        public Criteria andPtiResultIsNotNull() {
            addCriterion("pti_result is not null");
            return (Criteria) this;
        }

        public Criteria andPtiResultEqualTo(String value) {
            addCriterion("pti_result =", value, "ptiResult");
            return (Criteria) this;
        }

        public Criteria andPtiResultNotEqualTo(String value) {
            addCriterion("pti_result <>", value, "ptiResult");
            return (Criteria) this;
        }

        public Criteria andPtiResultGreaterThan(String value) {
            addCriterion("pti_result >", value, "ptiResult");
            return (Criteria) this;
        }

        public Criteria andPtiResultGreaterThanOrEqualTo(String value) {
            addCriterion("pti_result >=", value, "ptiResult");
            return (Criteria) this;
        }

        public Criteria andPtiResultLessThan(String value) {
            addCriterion("pti_result <", value, "ptiResult");
            return (Criteria) this;
        }

        public Criteria andPtiResultLessThanOrEqualTo(String value) {
            addCriterion("pti_result <=", value, "ptiResult");
            return (Criteria) this;
        }

        public Criteria andPtiResultLike(String value) {
            addCriterion("pti_result like", value, "ptiResult");
            return (Criteria) this;
        }

        public Criteria andPtiResultNotLike(String value) {
            addCriterion("pti_result not like", value, "ptiResult");
            return (Criteria) this;
        }

        public Criteria andPtiResultIn(List<String> values) {
            addCriterion("pti_result in", values, "ptiResult");
            return (Criteria) this;
        }

        public Criteria andPtiResultNotIn(List<String> values) {
            addCriterion("pti_result not in", values, "ptiResult");
            return (Criteria) this;
        }

        public Criteria andPtiResultBetween(String value1, String value2) {
            addCriterion("pti_result between", value1, value2, "ptiResult");
            return (Criteria) this;
        }

        public Criteria andPtiResultNotBetween(String value1, String value2) {
            addCriterion("pti_result not between", value1, value2, "ptiResult");
            return (Criteria) this;
        }

        public Criteria andPtiLastResultIsNull() {
            addCriterion("pti_last_result is null");
            return (Criteria) this;
        }

        public Criteria andPtiLastResultIsNotNull() {
            addCriterion("pti_last_result is not null");
            return (Criteria) this;
        }

        public Criteria andPtiLastResultEqualTo(String value) {
            addCriterion("pti_last_result =", value, "ptiLastResult");
            return (Criteria) this;
        }

        public Criteria andPtiLastResultNotEqualTo(String value) {
            addCriterion("pti_last_result <>", value, "ptiLastResult");
            return (Criteria) this;
        }

        public Criteria andPtiLastResultGreaterThan(String value) {
            addCriterion("pti_last_result >", value, "ptiLastResult");
            return (Criteria) this;
        }

        public Criteria andPtiLastResultGreaterThanOrEqualTo(String value) {
            addCriterion("pti_last_result >=", value, "ptiLastResult");
            return (Criteria) this;
        }

        public Criteria andPtiLastResultLessThan(String value) {
            addCriterion("pti_last_result <", value, "ptiLastResult");
            return (Criteria) this;
        }

        public Criteria andPtiLastResultLessThanOrEqualTo(String value) {
            addCriterion("pti_last_result <=", value, "ptiLastResult");
            return (Criteria) this;
        }

        public Criteria andPtiLastResultLike(String value) {
            addCriterion("pti_last_result like", value, "ptiLastResult");
            return (Criteria) this;
        }

        public Criteria andPtiLastResultNotLike(String value) {
            addCriterion("pti_last_result not like", value, "ptiLastResult");
            return (Criteria) this;
        }

        public Criteria andPtiLastResultIn(List<String> values) {
            addCriterion("pti_last_result in", values, "ptiLastResult");
            return (Criteria) this;
        }

        public Criteria andPtiLastResultNotIn(List<String> values) {
            addCriterion("pti_last_result not in", values, "ptiLastResult");
            return (Criteria) this;
        }

        public Criteria andPtiLastResultBetween(String value1, String value2) {
            addCriterion("pti_last_result between", value1, value2, "ptiLastResult");
            return (Criteria) this;
        }

        public Criteria andPtiLastResultNotBetween(String value1, String value2) {
            addCriterion("pti_last_result not between", value1, value2, "ptiLastResult");
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