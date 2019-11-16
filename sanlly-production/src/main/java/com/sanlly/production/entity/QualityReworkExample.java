package com.sanlly.production.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QualityReworkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public QualityReworkExample() {
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

        public Criteria andProdQualityReworkIdIsNull() {
            addCriterion("prod_quality_rework_id is null");
            return (Criteria) this;
        }

        public Criteria andProdQualityReworkIdIsNotNull() {
            addCriterion("prod_quality_rework_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdQualityReworkIdEqualTo(Integer value) {
            addCriterion("prod_quality_rework_id =", value, "prodQualityReworkId");
            return (Criteria) this;
        }

        public Criteria andProdQualityReworkIdNotEqualTo(Integer value) {
            addCriterion("prod_quality_rework_id <>", value, "prodQualityReworkId");
            return (Criteria) this;
        }

        public Criteria andProdQualityReworkIdGreaterThan(Integer value) {
            addCriterion("prod_quality_rework_id >", value, "prodQualityReworkId");
            return (Criteria) this;
        }

        public Criteria andProdQualityReworkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_quality_rework_id >=", value, "prodQualityReworkId");
            return (Criteria) this;
        }

        public Criteria andProdQualityReworkIdLessThan(Integer value) {
            addCriterion("prod_quality_rework_id <", value, "prodQualityReworkId");
            return (Criteria) this;
        }

        public Criteria andProdQualityReworkIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_quality_rework_id <=", value, "prodQualityReworkId");
            return (Criteria) this;
        }

        public Criteria andProdQualityReworkIdIn(List<Integer> values) {
            addCriterion("prod_quality_rework_id in", values, "prodQualityReworkId");
            return (Criteria) this;
        }

        public Criteria andProdQualityReworkIdNotIn(List<Integer> values) {
            addCriterion("prod_quality_rework_id not in", values, "prodQualityReworkId");
            return (Criteria) this;
        }

        public Criteria andProdQualityReworkIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_quality_rework_id between", value1, value2, "prodQualityReworkId");
            return (Criteria) this;
        }

        public Criteria andProdQualityReworkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_quality_rework_id not between", value1, value2, "prodQualityReworkId");
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

        public Criteria andReferralEntryIdIsNull() {
            addCriterion("referral_entry_id is null");
            return (Criteria) this;
        }

        public Criteria andReferralEntryIdIsNotNull() {
            addCriterion("referral_entry_id is not null");
            return (Criteria) this;
        }

        public Criteria andReferralEntryIdEqualTo(String value) {
            addCriterion("referral_entry_id =", value, "referralEntryId");
            return (Criteria) this;
        }

        public Criteria andReferralEntryIdNotEqualTo(String value) {
            addCriterion("referral_entry_id <>", value, "referralEntryId");
            return (Criteria) this;
        }

        public Criteria andReferralEntryIdGreaterThan(String value) {
            addCriterion("referral_entry_id >", value, "referralEntryId");
            return (Criteria) this;
        }

        public Criteria andReferralEntryIdGreaterThanOrEqualTo(String value) {
            addCriterion("referral_entry_id >=", value, "referralEntryId");
            return (Criteria) this;
        }

        public Criteria andReferralEntryIdLessThan(String value) {
            addCriterion("referral_entry_id <", value, "referralEntryId");
            return (Criteria) this;
        }

        public Criteria andReferralEntryIdLessThanOrEqualTo(String value) {
            addCriterion("referral_entry_id <=", value, "referralEntryId");
            return (Criteria) this;
        }

        public Criteria andReferralEntryIdLike(String value) {
            addCriterion("referral_entry_id like", value, "referralEntryId");
            return (Criteria) this;
        }

        public Criteria andReferralEntryIdNotLike(String value) {
            addCriterion("referral_entry_id not like", value, "referralEntryId");
            return (Criteria) this;
        }

        public Criteria andReferralEntryIdIn(List<String> values) {
            addCriterion("referral_entry_id in", values, "referralEntryId");
            return (Criteria) this;
        }

        public Criteria andReferralEntryIdNotIn(List<String> values) {
            addCriterion("referral_entry_id not in", values, "referralEntryId");
            return (Criteria) this;
        }

        public Criteria andReferralEntryIdBetween(String value1, String value2) {
            addCriterion("referral_entry_id between", value1, value2, "referralEntryId");
            return (Criteria) this;
        }

        public Criteria andReferralEntryIdNotBetween(String value1, String value2) {
            addCriterion("referral_entry_id not between", value1, value2, "referralEntryId");
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

        public Criteria andIsTechnologyIsNull() {
            addCriterion("is_technology is null");
            return (Criteria) this;
        }

        public Criteria andIsTechnologyIsNotNull() {
            addCriterion("is_technology is not null");
            return (Criteria) this;
        }

        public Criteria andIsTechnologyEqualTo(String value) {
            addCriterion("is_technology =", value, "isTechnology");
            return (Criteria) this;
        }

        public Criteria andIsTechnologyNotEqualTo(String value) {
            addCriterion("is_technology <>", value, "isTechnology");
            return (Criteria) this;
        }

        public Criteria andIsTechnologyGreaterThan(String value) {
            addCriterion("is_technology >", value, "isTechnology");
            return (Criteria) this;
        }

        public Criteria andIsTechnologyGreaterThanOrEqualTo(String value) {
            addCriterion("is_technology >=", value, "isTechnology");
            return (Criteria) this;
        }

        public Criteria andIsTechnologyLessThan(String value) {
            addCriterion("is_technology <", value, "isTechnology");
            return (Criteria) this;
        }

        public Criteria andIsTechnologyLessThanOrEqualTo(String value) {
            addCriterion("is_technology <=", value, "isTechnology");
            return (Criteria) this;
        }

        public Criteria andIsTechnologyLike(String value) {
            addCriterion("is_technology like", value, "isTechnology");
            return (Criteria) this;
        }

        public Criteria andIsTechnologyNotLike(String value) {
            addCriterion("is_technology not like", value, "isTechnology");
            return (Criteria) this;
        }

        public Criteria andIsTechnologyIn(List<String> values) {
            addCriterion("is_technology in", values, "isTechnology");
            return (Criteria) this;
        }

        public Criteria andIsTechnologyNotIn(List<String> values) {
            addCriterion("is_technology not in", values, "isTechnology");
            return (Criteria) this;
        }

        public Criteria andIsTechnologyBetween(String value1, String value2) {
            addCriterion("is_technology between", value1, value2, "isTechnology");
            return (Criteria) this;
        }

        public Criteria andIsTechnologyNotBetween(String value1, String value2) {
            addCriterion("is_technology not between", value1, value2, "isTechnology");
            return (Criteria) this;
        }

        public Criteria andReworkQuestionIsNull() {
            addCriterion("rework_question is null");
            return (Criteria) this;
        }

        public Criteria andReworkQuestionIsNotNull() {
            addCriterion("rework_question is not null");
            return (Criteria) this;
        }

        public Criteria andReworkQuestionEqualTo(String value) {
            addCriterion("rework_question =", value, "reworkQuestion");
            return (Criteria) this;
        }

        public Criteria andReworkQuestionNotEqualTo(String value) {
            addCriterion("rework_question <>", value, "reworkQuestion");
            return (Criteria) this;
        }

        public Criteria andReworkQuestionGreaterThan(String value) {
            addCriterion("rework_question >", value, "reworkQuestion");
            return (Criteria) this;
        }

        public Criteria andReworkQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("rework_question >=", value, "reworkQuestion");
            return (Criteria) this;
        }

        public Criteria andReworkQuestionLessThan(String value) {
            addCriterion("rework_question <", value, "reworkQuestion");
            return (Criteria) this;
        }

        public Criteria andReworkQuestionLessThanOrEqualTo(String value) {
            addCriterion("rework_question <=", value, "reworkQuestion");
            return (Criteria) this;
        }

        public Criteria andReworkQuestionLike(String value) {
            addCriterion("rework_question like", value, "reworkQuestion");
            return (Criteria) this;
        }

        public Criteria andReworkQuestionNotLike(String value) {
            addCriterion("rework_question not like", value, "reworkQuestion");
            return (Criteria) this;
        }

        public Criteria andReworkQuestionIn(List<String> values) {
            addCriterion("rework_question in", values, "reworkQuestion");
            return (Criteria) this;
        }

        public Criteria andReworkQuestionNotIn(List<String> values) {
            addCriterion("rework_question not in", values, "reworkQuestion");
            return (Criteria) this;
        }

        public Criteria andReworkQuestionBetween(String value1, String value2) {
            addCriterion("rework_question between", value1, value2, "reworkQuestion");
            return (Criteria) this;
        }

        public Criteria andReworkQuestionNotBetween(String value1, String value2) {
            addCriterion("rework_question not between", value1, value2, "reworkQuestion");
            return (Criteria) this;
        }

        public Criteria andQuestionDescribeIsNull() {
            addCriterion("question_describe is null");
            return (Criteria) this;
        }

        public Criteria andQuestionDescribeIsNotNull() {
            addCriterion("question_describe is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionDescribeEqualTo(String value) {
            addCriterion("question_describe =", value, "questionDescribe");
            return (Criteria) this;
        }

        public Criteria andQuestionDescribeNotEqualTo(String value) {
            addCriterion("question_describe <>", value, "questionDescribe");
            return (Criteria) this;
        }

        public Criteria andQuestionDescribeGreaterThan(String value) {
            addCriterion("question_describe >", value, "questionDescribe");
            return (Criteria) this;
        }

        public Criteria andQuestionDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("question_describe >=", value, "questionDescribe");
            return (Criteria) this;
        }

        public Criteria andQuestionDescribeLessThan(String value) {
            addCriterion("question_describe <", value, "questionDescribe");
            return (Criteria) this;
        }

        public Criteria andQuestionDescribeLessThanOrEqualTo(String value) {
            addCriterion("question_describe <=", value, "questionDescribe");
            return (Criteria) this;
        }

        public Criteria andQuestionDescribeLike(String value) {
            addCriterion("question_describe like", value, "questionDescribe");
            return (Criteria) this;
        }

        public Criteria andQuestionDescribeNotLike(String value) {
            addCriterion("question_describe not like", value, "questionDescribe");
            return (Criteria) this;
        }

        public Criteria andQuestionDescribeIn(List<String> values) {
            addCriterion("question_describe in", values, "questionDescribe");
            return (Criteria) this;
        }

        public Criteria andQuestionDescribeNotIn(List<String> values) {
            addCriterion("question_describe not in", values, "questionDescribe");
            return (Criteria) this;
        }

        public Criteria andQuestionDescribeBetween(String value1, String value2) {
            addCriterion("question_describe between", value1, value2, "questionDescribe");
            return (Criteria) this;
        }

        public Criteria andQuestionDescribeNotBetween(String value1, String value2) {
            addCriterion("question_describe not between", value1, value2, "questionDescribe");
            return (Criteria) this;
        }

        public Criteria andRectificationStandardIsNull() {
            addCriterion("rectification_standard is null");
            return (Criteria) this;
        }

        public Criteria andRectificationStandardIsNotNull() {
            addCriterion("rectification_standard is not null");
            return (Criteria) this;
        }

        public Criteria andRectificationStandardEqualTo(String value) {
            addCriterion("rectification_standard =", value, "rectificationStandard");
            return (Criteria) this;
        }

        public Criteria andRectificationStandardNotEqualTo(String value) {
            addCriterion("rectification_standard <>", value, "rectificationStandard");
            return (Criteria) this;
        }

        public Criteria andRectificationStandardGreaterThan(String value) {
            addCriterion("rectification_standard >", value, "rectificationStandard");
            return (Criteria) this;
        }

        public Criteria andRectificationStandardGreaterThanOrEqualTo(String value) {
            addCriterion("rectification_standard >=", value, "rectificationStandard");
            return (Criteria) this;
        }

        public Criteria andRectificationStandardLessThan(String value) {
            addCriterion("rectification_standard <", value, "rectificationStandard");
            return (Criteria) this;
        }

        public Criteria andRectificationStandardLessThanOrEqualTo(String value) {
            addCriterion("rectification_standard <=", value, "rectificationStandard");
            return (Criteria) this;
        }

        public Criteria andRectificationStandardLike(String value) {
            addCriterion("rectification_standard like", value, "rectificationStandard");
            return (Criteria) this;
        }

        public Criteria andRectificationStandardNotLike(String value) {
            addCriterion("rectification_standard not like", value, "rectificationStandard");
            return (Criteria) this;
        }

        public Criteria andRectificationStandardIn(List<String> values) {
            addCriterion("rectification_standard in", values, "rectificationStandard");
            return (Criteria) this;
        }

        public Criteria andRectificationStandardNotIn(List<String> values) {
            addCriterion("rectification_standard not in", values, "rectificationStandard");
            return (Criteria) this;
        }

        public Criteria andRectificationStandardBetween(String value1, String value2) {
            addCriterion("rectification_standard between", value1, value2, "rectificationStandard");
            return (Criteria) this;
        }

        public Criteria andRectificationStandardNotBetween(String value1, String value2) {
            addCriterion("rectification_standard not between", value1, value2, "rectificationStandard");
            return (Criteria) this;
        }

        public Criteria andBackCauseIsNull() {
            addCriterion("back_cause is null");
            return (Criteria) this;
        }

        public Criteria andBackCauseIsNotNull() {
            addCriterion("back_cause is not null");
            return (Criteria) this;
        }

        public Criteria andBackCauseEqualTo(String value) {
            addCriterion("back_cause =", value, "backCause");
            return (Criteria) this;
        }

        public Criteria andBackCauseNotEqualTo(String value) {
            addCriterion("back_cause <>", value, "backCause");
            return (Criteria) this;
        }

        public Criteria andBackCauseGreaterThan(String value) {
            addCriterion("back_cause >", value, "backCause");
            return (Criteria) this;
        }

        public Criteria andBackCauseGreaterThanOrEqualTo(String value) {
            addCriterion("back_cause >=", value, "backCause");
            return (Criteria) this;
        }

        public Criteria andBackCauseLessThan(String value) {
            addCriterion("back_cause <", value, "backCause");
            return (Criteria) this;
        }

        public Criteria andBackCauseLessThanOrEqualTo(String value) {
            addCriterion("back_cause <=", value, "backCause");
            return (Criteria) this;
        }

        public Criteria andBackCauseLike(String value) {
            addCriterion("back_cause like", value, "backCause");
            return (Criteria) this;
        }

        public Criteria andBackCauseNotLike(String value) {
            addCriterion("back_cause not like", value, "backCause");
            return (Criteria) this;
        }

        public Criteria andBackCauseIn(List<String> values) {
            addCriterion("back_cause in", values, "backCause");
            return (Criteria) this;
        }

        public Criteria andBackCauseNotIn(List<String> values) {
            addCriterion("back_cause not in", values, "backCause");
            return (Criteria) this;
        }

        public Criteria andBackCauseBetween(String value1, String value2) {
            addCriterion("back_cause between", value1, value2, "backCause");
            return (Criteria) this;
        }

        public Criteria andBackCauseNotBetween(String value1, String value2) {
            addCriterion("back_cause not between", value1, value2, "backCause");
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