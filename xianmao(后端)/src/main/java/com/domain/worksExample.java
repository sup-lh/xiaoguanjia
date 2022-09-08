package com.domain;

import java.util.ArrayList;
import java.util.List;

public class worksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public worksExample() {
        oredCriteria = new ArrayList<>();
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

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPushIdIsNull() {
            addCriterion("push_id is null");
            return (Criteria) this;
        }

        public Criteria andPushIdIsNotNull() {
            addCriterion("push_id is not null");
            return (Criteria) this;
        }

        public Criteria andPushIdEqualTo(Long value) {
            addCriterion("push_id =", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdNotEqualTo(Long value) {
            addCriterion("push_id <>", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdGreaterThan(Long value) {
            addCriterion("push_id >", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdGreaterThanOrEqualTo(Long value) {
            addCriterion("push_id >=", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdLessThan(Long value) {
            addCriterion("push_id <", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdLessThanOrEqualTo(Long value) {
            addCriterion("push_id <=", value, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdIn(List<Long> values) {
            addCriterion("push_id in", values, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdNotIn(List<Long> values) {
            addCriterion("push_id not in", values, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdBetween(Long value1, Long value2) {
            addCriterion("push_id between", value1, value2, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushIdNotBetween(Long value1, Long value2) {
            addCriterion("push_id not between", value1, value2, "pushId");
            return (Criteria) this;
        }

        public Criteria andPushOpenidIsNull() {
            addCriterion("push_openid is null");
            return (Criteria) this;
        }

        public Criteria andPushOpenidIsNotNull() {
            addCriterion("push_openid is not null");
            return (Criteria) this;
        }

        public Criteria andPushOpenidEqualTo(String value) {
            addCriterion("push_openid =", value, "pushOpenid");
            return (Criteria) this;
        }

        public Criteria andPushOpenidNotEqualTo(String value) {
            addCriterion("push_openid <>", value, "pushOpenid");
            return (Criteria) this;
        }

        public Criteria andPushOpenidGreaterThan(String value) {
            addCriterion("push_openid >", value, "pushOpenid");
            return (Criteria) this;
        }

        public Criteria andPushOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("push_openid >=", value, "pushOpenid");
            return (Criteria) this;
        }

        public Criteria andPushOpenidLessThan(String value) {
            addCriterion("push_openid <", value, "pushOpenid");
            return (Criteria) this;
        }

        public Criteria andPushOpenidLessThanOrEqualTo(String value) {
            addCriterion("push_openid <=", value, "pushOpenid");
            return (Criteria) this;
        }

        public Criteria andPushOpenidLike(String value) {
            addCriterion("push_openid like", value, "pushOpenid");
            return (Criteria) this;
        }

        public Criteria andPushOpenidNotLike(String value) {
            addCriterion("push_openid not like", value, "pushOpenid");
            return (Criteria) this;
        }

        public Criteria andPushOpenidIn(List<String> values) {
            addCriterion("push_openid in", values, "pushOpenid");
            return (Criteria) this;
        }

        public Criteria andPushOpenidNotIn(List<String> values) {
            addCriterion("push_openid not in", values, "pushOpenid");
            return (Criteria) this;
        }

        public Criteria andPushOpenidBetween(String value1, String value2) {
            addCriterion("push_openid between", value1, value2, "pushOpenid");
            return (Criteria) this;
        }

        public Criteria andPushOpenidNotBetween(String value1, String value2) {
            addCriterion("push_openid not between", value1, value2, "pushOpenid");
            return (Criteria) this;
        }

        public Criteria andGainOpenidIsNull() {
            addCriterion("gain_openid is null");
            return (Criteria) this;
        }

        public Criteria andGainOpenidIsNotNull() {
            addCriterion("gain_openid is not null");
            return (Criteria) this;
        }

        public Criteria andGainOpenidEqualTo(String value) {
            addCriterion("gain_openid =", value, "gainOpenid");
            return (Criteria) this;
        }

        public Criteria andGainOpenidNotEqualTo(String value) {
            addCriterion("gain_openid <>", value, "gainOpenid");
            return (Criteria) this;
        }

        public Criteria andGainOpenidGreaterThan(String value) {
            addCriterion("gain_openid >", value, "gainOpenid");
            return (Criteria) this;
        }

        public Criteria andGainOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("gain_openid >=", value, "gainOpenid");
            return (Criteria) this;
        }

        public Criteria andGainOpenidLessThan(String value) {
            addCriterion("gain_openid <", value, "gainOpenid");
            return (Criteria) this;
        }

        public Criteria andGainOpenidLessThanOrEqualTo(String value) {
            addCriterion("gain_openid <=", value, "gainOpenid");
            return (Criteria) this;
        }

        public Criteria andGainOpenidLike(String value) {
            addCriterion("gain_openid like", value, "gainOpenid");
            return (Criteria) this;
        }

        public Criteria andGainOpenidNotLike(String value) {
            addCriterion("gain_openid not like", value, "gainOpenid");
            return (Criteria) this;
        }

        public Criteria andGainOpenidIn(List<String> values) {
            addCriterion("gain_openid in", values, "gainOpenid");
            return (Criteria) this;
        }

        public Criteria andGainOpenidNotIn(List<String> values) {
            addCriterion("gain_openid not in", values, "gainOpenid");
            return (Criteria) this;
        }

        public Criteria andGainOpenidBetween(String value1, String value2) {
            addCriterion("gain_openid between", value1, value2, "gainOpenid");
            return (Criteria) this;
        }

        public Criteria andGainOpenidNotBetween(String value1, String value2) {
            addCriterion("gain_openid not between", value1, value2, "gainOpenid");
            return (Criteria) this;
        }

        public Criteria andCommitFlagIsNull() {
            addCriterion("commit_flag is null");
            return (Criteria) this;
        }

        public Criteria andCommitFlagIsNotNull() {
            addCriterion("commit_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCommitFlagEqualTo(String value) {
            addCriterion("commit_flag =", value, "commitFlag");
            return (Criteria) this;
        }

        public Criteria andCommitFlagNotEqualTo(String value) {
            addCriterion("commit_flag <>", value, "commitFlag");
            return (Criteria) this;
        }

        public Criteria andCommitFlagGreaterThan(String value) {
            addCriterion("commit_flag >", value, "commitFlag");
            return (Criteria) this;
        }

        public Criteria andCommitFlagGreaterThanOrEqualTo(String value) {
            addCriterion("commit_flag >=", value, "commitFlag");
            return (Criteria) this;
        }

        public Criteria andCommitFlagLessThan(String value) {
            addCriterion("commit_flag <", value, "commitFlag");
            return (Criteria) this;
        }

        public Criteria andCommitFlagLessThanOrEqualTo(String value) {
            addCriterion("commit_flag <=", value, "commitFlag");
            return (Criteria) this;
        }

        public Criteria andCommitFlagLike(String value) {
            addCriterion("commit_flag like", value, "commitFlag");
            return (Criteria) this;
        }

        public Criteria andCommitFlagNotLike(String value) {
            addCriterion("commit_flag not like", value, "commitFlag");
            return (Criteria) this;
        }

        public Criteria andCommitFlagIn(List<String> values) {
            addCriterion("commit_flag in", values, "commitFlag");
            return (Criteria) this;
        }

        public Criteria andCommitFlagNotIn(List<String> values) {
            addCriterion("commit_flag not in", values, "commitFlag");
            return (Criteria) this;
        }

        public Criteria andCommitFlagBetween(String value1, String value2) {
            addCriterion("commit_flag between", value1, value2, "commitFlag");
            return (Criteria) this;
        }

        public Criteria andCommitFlagNotBetween(String value1, String value2) {
            addCriterion("commit_flag not between", value1, value2, "commitFlag");
            return (Criteria) this;
        }

        public Criteria andZhifubaoIsNull() {
            addCriterion("zhifubao is null");
            return (Criteria) this;
        }

        public Criteria andZhifubaoIsNotNull() {
            addCriterion("zhifubao is not null");
            return (Criteria) this;
        }

        public Criteria andZhifubaoEqualTo(String value) {
            addCriterion("zhifubao =", value, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoNotEqualTo(String value) {
            addCriterion("zhifubao <>", value, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoGreaterThan(String value) {
            addCriterion("zhifubao >", value, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoGreaterThanOrEqualTo(String value) {
            addCriterion("zhifubao >=", value, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoLessThan(String value) {
            addCriterion("zhifubao <", value, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoLessThanOrEqualTo(String value) {
            addCriterion("zhifubao <=", value, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoLike(String value) {
            addCriterion("zhifubao like", value, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoNotLike(String value) {
            addCriterion("zhifubao not like", value, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoIn(List<String> values) {
            addCriterion("zhifubao in", values, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoNotIn(List<String> values) {
            addCriterion("zhifubao not in", values, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoBetween(String value1, String value2) {
            addCriterion("zhifubao between", value1, value2, "zhifubao");
            return (Criteria) this;
        }

        public Criteria andZhifubaoNotBetween(String value1, String value2) {
            addCriterion("zhifubao not between", value1, value2, "zhifubao");
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