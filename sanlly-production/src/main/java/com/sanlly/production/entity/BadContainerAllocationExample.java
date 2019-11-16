package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BadContainerAllocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public BadContainerAllocationExample() {
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

        public Criteria andProdBadContainerAllocationIdIsNull() {
            addCriterion("prod_bad_container_allocation_id is null");
            return (Criteria) this;
        }

        public Criteria andProdBadContainerAllocationIdIsNotNull() {
            addCriterion("prod_bad_container_allocation_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdBadContainerAllocationIdEqualTo(Integer value) {
            addCriterion("prod_bad_container_allocation_id =", value, "prodBadContainerAllocationId");
            return (Criteria) this;
        }

        public Criteria andProdBadContainerAllocationIdNotEqualTo(Integer value) {
            addCriterion("prod_bad_container_allocation_id <>", value, "prodBadContainerAllocationId");
            return (Criteria) this;
        }

        public Criteria andProdBadContainerAllocationIdGreaterThan(Integer value) {
            addCriterion("prod_bad_container_allocation_id >", value, "prodBadContainerAllocationId");
            return (Criteria) this;
        }

        public Criteria andProdBadContainerAllocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_bad_container_allocation_id >=", value, "prodBadContainerAllocationId");
            return (Criteria) this;
        }

        public Criteria andProdBadContainerAllocationIdLessThan(Integer value) {
            addCriterion("prod_bad_container_allocation_id <", value, "prodBadContainerAllocationId");
            return (Criteria) this;
        }

        public Criteria andProdBadContainerAllocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_bad_container_allocation_id <=", value, "prodBadContainerAllocationId");
            return (Criteria) this;
        }

        public Criteria andProdBadContainerAllocationIdIn(List<Integer> values) {
            addCriterion("prod_bad_container_allocation_id in", values, "prodBadContainerAllocationId");
            return (Criteria) this;
        }

        public Criteria andProdBadContainerAllocationIdNotIn(List<Integer> values) {
            addCriterion("prod_bad_container_allocation_id not in", values, "prodBadContainerAllocationId");
            return (Criteria) this;
        }

        public Criteria andProdBadContainerAllocationIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_bad_container_allocation_id between", value1, value2, "prodBadContainerAllocationId");
            return (Criteria) this;
        }

        public Criteria andProdBadContainerAllocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_bad_container_allocation_id not between", value1, value2, "prodBadContainerAllocationId");
            return (Criteria) this;
        }

        public Criteria andOutCourseIsNull() {
            addCriterion("out_course is null");
            return (Criteria) this;
        }

        public Criteria andOutCourseIsNotNull() {
            addCriterion("out_course is not null");
            return (Criteria) this;
        }

        public Criteria andOutCourseEqualTo(String value) {
            addCriterion("out_course =", value, "outCourse");
            return (Criteria) this;
        }

        public Criteria andOutCourseNotEqualTo(String value) {
            addCriterion("out_course <>", value, "outCourse");
            return (Criteria) this;
        }

        public Criteria andOutCourseGreaterThan(String value) {
            addCriterion("out_course >", value, "outCourse");
            return (Criteria) this;
        }

        public Criteria andOutCourseGreaterThanOrEqualTo(String value) {
            addCriterion("out_course >=", value, "outCourse");
            return (Criteria) this;
        }

        public Criteria andOutCourseLessThan(String value) {
            addCriterion("out_course <", value, "outCourse");
            return (Criteria) this;
        }

        public Criteria andOutCourseLessThanOrEqualTo(String value) {
            addCriterion("out_course <=", value, "outCourse");
            return (Criteria) this;
        }

        public Criteria andOutCourseLike(String value) {
            addCriterion("out_course like", value, "outCourse");
            return (Criteria) this;
        }

        public Criteria andOutCourseNotLike(String value) {
            addCriterion("out_course not like", value, "outCourse");
            return (Criteria) this;
        }

        public Criteria andOutCourseIn(List<String> values) {
            addCriterion("out_course in", values, "outCourse");
            return (Criteria) this;
        }

        public Criteria andOutCourseNotIn(List<String> values) {
            addCriterion("out_course not in", values, "outCourse");
            return (Criteria) this;
        }

        public Criteria andOutCourseBetween(String value1, String value2) {
            addCriterion("out_course between", value1, value2, "outCourse");
            return (Criteria) this;
        }

        public Criteria andOutCourseNotBetween(String value1, String value2) {
            addCriterion("out_course not between", value1, value2, "outCourse");
            return (Criteria) this;
        }

        public Criteria andInCourseIsNull() {
            addCriterion("in_course is null");
            return (Criteria) this;
        }

        public Criteria andInCourseIsNotNull() {
            addCriterion("in_course is not null");
            return (Criteria) this;
        }

        public Criteria andInCourseEqualTo(String value) {
            addCriterion("in_course =", value, "inCourse");
            return (Criteria) this;
        }

        public Criteria andInCourseNotEqualTo(String value) {
            addCriterion("in_course <>", value, "inCourse");
            return (Criteria) this;
        }

        public Criteria andInCourseGreaterThan(String value) {
            addCriterion("in_course >", value, "inCourse");
            return (Criteria) this;
        }

        public Criteria andInCourseGreaterThanOrEqualTo(String value) {
            addCriterion("in_course >=", value, "inCourse");
            return (Criteria) this;
        }

        public Criteria andInCourseLessThan(String value) {
            addCriterion("in_course <", value, "inCourse");
            return (Criteria) this;
        }

        public Criteria andInCourseLessThanOrEqualTo(String value) {
            addCriterion("in_course <=", value, "inCourse");
            return (Criteria) this;
        }

        public Criteria andInCourseLike(String value) {
            addCriterion("in_course like", value, "inCourse");
            return (Criteria) this;
        }

        public Criteria andInCourseNotLike(String value) {
            addCriterion("in_course not like", value, "inCourse");
            return (Criteria) this;
        }

        public Criteria andInCourseIn(List<String> values) {
            addCriterion("in_course in", values, "inCourse");
            return (Criteria) this;
        }

        public Criteria andInCourseNotIn(List<String> values) {
            addCriterion("in_course not in", values, "inCourse");
            return (Criteria) this;
        }

        public Criteria andInCourseBetween(String value1, String value2) {
            addCriterion("in_course between", value1, value2, "inCourse");
            return (Criteria) this;
        }

        public Criteria andInCourseNotBetween(String value1, String value2) {
            addCriterion("in_course not between", value1, value2, "inCourse");
            return (Criteria) this;
        }

        public Criteria andAllocationNoIsNull() {
            addCriterion("allocation_no is null");
            return (Criteria) this;
        }

        public Criteria andAllocationNoIsNotNull() {
            addCriterion("allocation_no is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationNoEqualTo(String value) {
            addCriterion("allocation_no =", value, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoNotEqualTo(String value) {
            addCriterion("allocation_no <>", value, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoGreaterThan(String value) {
            addCriterion("allocation_no >", value, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoGreaterThanOrEqualTo(String value) {
            addCriterion("allocation_no >=", value, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoLessThan(String value) {
            addCriterion("allocation_no <", value, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoLessThanOrEqualTo(String value) {
            addCriterion("allocation_no <=", value, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoLike(String value) {
            addCriterion("allocation_no like", value, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoNotLike(String value) {
            addCriterion("allocation_no not like", value, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoIn(List<String> values) {
            addCriterion("allocation_no in", values, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoNotIn(List<String> values) {
            addCriterion("allocation_no not in", values, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoBetween(String value1, String value2) {
            addCriterion("allocation_no between", value1, value2, "allocationNo");
            return (Criteria) this;
        }

        public Criteria andAllocationNoNotBetween(String value1, String value2) {
            addCriterion("allocation_no not between", value1, value2, "allocationNo");
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

        public Criteria andExitYardIsNull() {
            addCriterion("exit_yard is null");
            return (Criteria) this;
        }

        public Criteria andExitYardIsNotNull() {
            addCriterion("exit_yard is not null");
            return (Criteria) this;
        }

        public Criteria andExitYardEqualTo(String value) {
            addCriterion("exit_yard =", value, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardNotEqualTo(String value) {
            addCriterion("exit_yard <>", value, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardGreaterThan(String value) {
            addCriterion("exit_yard >", value, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardGreaterThanOrEqualTo(String value) {
            addCriterion("exit_yard >=", value, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardLessThan(String value) {
            addCriterion("exit_yard <", value, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardLessThanOrEqualTo(String value) {
            addCriterion("exit_yard <=", value, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardLike(String value) {
            addCriterion("exit_yard like", value, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardNotLike(String value) {
            addCriterion("exit_yard not like", value, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardIn(List<String> values) {
            addCriterion("exit_yard in", values, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardNotIn(List<String> values) {
            addCriterion("exit_yard not in", values, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardBetween(String value1, String value2) {
            addCriterion("exit_yard between", value1, value2, "exitYard");
            return (Criteria) this;
        }

        public Criteria andExitYardNotBetween(String value1, String value2) {
            addCriterion("exit_yard not between", value1, value2, "exitYard");
            return (Criteria) this;
        }

        public Criteria andEntryYardIsNull() {
            addCriterion("entry_yard is null");
            return (Criteria) this;
        }

        public Criteria andEntryYardIsNotNull() {
            addCriterion("entry_yard is not null");
            return (Criteria) this;
        }

        public Criteria andEntryYardEqualTo(String value) {
            addCriterion("entry_yard =", value, "entryYard");
            return (Criteria) this;
        }

        public Criteria andEntryYardNotEqualTo(String value) {
            addCriterion("entry_yard <>", value, "entryYard");
            return (Criteria) this;
        }

        public Criteria andEntryYardGreaterThan(String value) {
            addCriterion("entry_yard >", value, "entryYard");
            return (Criteria) this;
        }

        public Criteria andEntryYardGreaterThanOrEqualTo(String value) {
            addCriterion("entry_yard >=", value, "entryYard");
            return (Criteria) this;
        }

        public Criteria andEntryYardLessThan(String value) {
            addCriterion("entry_yard <", value, "entryYard");
            return (Criteria) this;
        }

        public Criteria andEntryYardLessThanOrEqualTo(String value) {
            addCriterion("entry_yard <=", value, "entryYard");
            return (Criteria) this;
        }

        public Criteria andEntryYardLike(String value) {
            addCriterion("entry_yard like", value, "entryYard");
            return (Criteria) this;
        }

        public Criteria andEntryYardNotLike(String value) {
            addCriterion("entry_yard not like", value, "entryYard");
            return (Criteria) this;
        }

        public Criteria andEntryYardIn(List<String> values) {
            addCriterion("entry_yard in", values, "entryYard");
            return (Criteria) this;
        }

        public Criteria andEntryYardNotIn(List<String> values) {
            addCriterion("entry_yard not in", values, "entryYard");
            return (Criteria) this;
        }

        public Criteria andEntryYardBetween(String value1, String value2) {
            addCriterion("entry_yard between", value1, value2, "entryYard");
            return (Criteria) this;
        }

        public Criteria andEntryYardNotBetween(String value1, String value2) {
            addCriterion("entry_yard not between", value1, value2, "entryYard");
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

        public Criteria andFleetIsNull() {
            addCriterion("fleet is null");
            return (Criteria) this;
        }

        public Criteria andFleetIsNotNull() {
            addCriterion("fleet is not null");
            return (Criteria) this;
        }

        public Criteria andFleetEqualTo(String value) {
            addCriterion("fleet =", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetNotEqualTo(String value) {
            addCriterion("fleet <>", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetGreaterThan(String value) {
            addCriterion("fleet >", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetGreaterThanOrEqualTo(String value) {
            addCriterion("fleet >=", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetLessThan(String value) {
            addCriterion("fleet <", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetLessThanOrEqualTo(String value) {
            addCriterion("fleet <=", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetLike(String value) {
            addCriterion("fleet like", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetNotLike(String value) {
            addCriterion("fleet not like", value, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetIn(List<String> values) {
            addCriterion("fleet in", values, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetNotIn(List<String> values) {
            addCriterion("fleet not in", values, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetBetween(String value1, String value2) {
            addCriterion("fleet between", value1, value2, "fleet");
            return (Criteria) this;
        }

        public Criteria andFleetNotBetween(String value1, String value2) {
            addCriterion("fleet not between", value1, value2, "fleet");
            return (Criteria) this;
        }

        public Criteria andPlateNoIsNull() {
            addCriterion("plate_no is null");
            return (Criteria) this;
        }

        public Criteria andPlateNoIsNotNull() {
            addCriterion("plate_no is not null");
            return (Criteria) this;
        }

        public Criteria andPlateNoEqualTo(String value) {
            addCriterion("plate_no =", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotEqualTo(String value) {
            addCriterion("plate_no <>", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoGreaterThan(String value) {
            addCriterion("plate_no >", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoGreaterThanOrEqualTo(String value) {
            addCriterion("plate_no >=", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoLessThan(String value) {
            addCriterion("plate_no <", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoLessThanOrEqualTo(String value) {
            addCriterion("plate_no <=", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoLike(String value) {
            addCriterion("plate_no like", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotLike(String value) {
            addCriterion("plate_no not like", value, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoIn(List<String> values) {
            addCriterion("plate_no in", values, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotIn(List<String> values) {
            addCriterion("plate_no not in", values, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoBetween(String value1, String value2) {
            addCriterion("plate_no between", value1, value2, "plateNo");
            return (Criteria) this;
        }

        public Criteria andPlateNoNotBetween(String value1, String value2) {
            addCriterion("plate_no not between", value1, value2, "plateNo");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Long value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Long value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Long value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Long value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Long value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Long value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Long> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Long> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Long value1, Long value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Long value1, Long value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeIsNull() {
            addCriterion("allocation_time is null");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeIsNotNull() {
            addCriterion("allocation_time is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeEqualTo(Date value) {
            addCriterion("allocation_time =", value, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeNotEqualTo(Date value) {
            addCriterion("allocation_time <>", value, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeGreaterThan(Date value) {
            addCriterion("allocation_time >", value, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("allocation_time >=", value, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeLessThan(Date value) {
            addCriterion("allocation_time <", value, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeLessThanOrEqualTo(Date value) {
            addCriterion("allocation_time <=", value, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeIn(List<Date> values) {
            addCriterion("allocation_time in", values, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeNotIn(List<Date> values) {
            addCriterion("allocation_time not in", values, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeBetween(Date value1, Date value2) {
            addCriterion("allocation_time between", value1, value2, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andAllocationTimeNotBetween(Date value1, Date value2) {
            addCriterion("allocation_time not between", value1, value2, "allocationTime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("`state` like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("`state` not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
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

        public Criteria andCostCenterIsNull() {
            addCriterion("cost_center is null");
            return (Criteria) this;
        }

        public Criteria andCostCenterIsNotNull() {
            addCriterion("cost_center is not null");
            return (Criteria) this;
        }

        public Criteria andCostCenterEqualTo(Long value) {
            addCriterion("cost_center =", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterNotEqualTo(Long value) {
            addCriterion("cost_center <>", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterGreaterThan(Long value) {
            addCriterion("cost_center >", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterGreaterThanOrEqualTo(Long value) {
            addCriterion("cost_center >=", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterLessThan(Long value) {
            addCriterion("cost_center <", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterLessThanOrEqualTo(Long value) {
            addCriterion("cost_center <=", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterIn(List<Long> values) {
            addCriterion("cost_center in", values, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterNotIn(List<Long> values) {
            addCriterion("cost_center not in", values, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterBetween(Long value1, Long value2) {
            addCriterion("cost_center between", value1, value2, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterNotBetween(Long value1, Long value2) {
            addCriterion("cost_center not between", value1, value2, "costCenter");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeIsNull() {
            addCriterion("allocation_type is null");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeIsNotNull() {
            addCriterion("allocation_type is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeEqualTo(String value) {
            addCriterion("allocation_type =", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeNotEqualTo(String value) {
            addCriterion("allocation_type <>", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeGreaterThan(String value) {
            addCriterion("allocation_type >", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("allocation_type >=", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeLessThan(String value) {
            addCriterion("allocation_type <", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeLessThanOrEqualTo(String value) {
            addCriterion("allocation_type <=", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeLike(String value) {
            addCriterion("allocation_type like", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeNotLike(String value) {
            addCriterion("allocation_type not like", value, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeIn(List<String> values) {
            addCriterion("allocation_type in", values, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeNotIn(List<String> values) {
            addCriterion("allocation_type not in", values, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeBetween(String value1, String value2) {
            addCriterion("allocation_type between", value1, value2, "allocationType");
            return (Criteria) this;
        }

        public Criteria andAllocationTypeNotBetween(String value1, String value2) {
            addCriterion("allocation_type not between", value1, value2, "allocationType");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerIsNull() {
            addCriterion("directive_issuer is null");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerIsNotNull() {
            addCriterion("directive_issuer is not null");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerEqualTo(String value) {
            addCriterion("directive_issuer =", value, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerNotEqualTo(String value) {
            addCriterion("directive_issuer <>", value, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerGreaterThan(String value) {
            addCriterion("directive_issuer >", value, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerGreaterThanOrEqualTo(String value) {
            addCriterion("directive_issuer >=", value, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerLessThan(String value) {
            addCriterion("directive_issuer <", value, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerLessThanOrEqualTo(String value) {
            addCriterion("directive_issuer <=", value, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerLike(String value) {
            addCriterion("directive_issuer like", value, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerNotLike(String value) {
            addCriterion("directive_issuer not like", value, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerIn(List<String> values) {
            addCriterion("directive_issuer in", values, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerNotIn(List<String> values) {
            addCriterion("directive_issuer not in", values, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerBetween(String value1, String value2) {
            addCriterion("directive_issuer between", value1, value2, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveIssuerNotBetween(String value1, String value2) {
            addCriterion("directive_issuer not between", value1, value2, "directiveIssuer");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeIsNull() {
            addCriterion("directive_time is null");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeIsNotNull() {
            addCriterion("directive_time is not null");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeEqualTo(Date value) {
            addCriterion("directive_time =", value, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeNotEqualTo(Date value) {
            addCriterion("directive_time <>", value, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeGreaterThan(Date value) {
            addCriterion("directive_time >", value, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("directive_time >=", value, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeLessThan(Date value) {
            addCriterion("directive_time <", value, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("directive_time <=", value, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeIn(List<Date> values) {
            addCriterion("directive_time in", values, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeNotIn(List<Date> values) {
            addCriterion("directive_time not in", values, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeBetween(Date value1, Date value2) {
            addCriterion("directive_time between", value1, value2, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andDirectiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("directive_time not between", value1, value2, "directiveTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleIsNull() {
            addCriterion("identify_people is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleIsNotNull() {
            addCriterion("identify_people is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleEqualTo(String value) {
            addCriterion("identify_people =", value, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleNotEqualTo(String value) {
            addCriterion("identify_people <>", value, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleGreaterThan(String value) {
            addCriterion("identify_people >", value, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("identify_people >=", value, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleLessThan(String value) {
            addCriterion("identify_people <", value, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleLessThanOrEqualTo(String value) {
            addCriterion("identify_people <=", value, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleLike(String value) {
            addCriterion("identify_people like", value, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleNotLike(String value) {
            addCriterion("identify_people not like", value, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleIn(List<String> values) {
            addCriterion("identify_people in", values, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleNotIn(List<String> values) {
            addCriterion("identify_people not in", values, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleBetween(String value1, String value2) {
            addCriterion("identify_people between", value1, value2, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyPeopleNotBetween(String value1, String value2) {
            addCriterion("identify_people not between", value1, value2, "identifyPeople");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeIsNull() {
            addCriterion("identify_time is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeIsNotNull() {
            addCriterion("identify_time is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeEqualTo(Date value) {
            addCriterion("identify_time =", value, "identifyTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeNotEqualTo(Date value) {
            addCriterion("identify_time <>", value, "identifyTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeGreaterThan(Date value) {
            addCriterion("identify_time >", value, "identifyTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("identify_time >=", value, "identifyTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeLessThan(Date value) {
            addCriterion("identify_time <", value, "identifyTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("identify_time <=", value, "identifyTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeIn(List<Date> values) {
            addCriterion("identify_time in", values, "identifyTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeNotIn(List<Date> values) {
            addCriterion("identify_time not in", values, "identifyTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeBetween(Date value1, Date value2) {
            addCriterion("identify_time between", value1, value2, "identifyTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("identify_time not between", value1, value2, "identifyTime");
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