package com.domain;

import java.util.ArrayList;
import java.util.List;

public class pay_orderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public pay_orderExample() {
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

        public Criteria andAoidIsNull() {
            addCriterion("aoid is null");
            return (Criteria) this;
        }

        public Criteria andAoidIsNotNull() {
            addCriterion("aoid is not null");
            return (Criteria) this;
        }

        public Criteria andAoidEqualTo(String value) {
            addCriterion("aoid =", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotEqualTo(String value) {
            addCriterion("aoid <>", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidGreaterThan(String value) {
            addCriterion("aoid >", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidGreaterThanOrEqualTo(String value) {
            addCriterion("aoid >=", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidLessThan(String value) {
            addCriterion("aoid <", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidLessThanOrEqualTo(String value) {
            addCriterion("aoid <=", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidLike(String value) {
            addCriterion("aoid like", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotLike(String value) {
            addCriterion("aoid not like", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidIn(List<String> values) {
            addCriterion("aoid in", values, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotIn(List<String> values) {
            addCriterion("aoid not in", values, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidBetween(String value1, String value2) {
            addCriterion("aoid between", value1, value2, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotBetween(String value1, String value2) {
            addCriterion("aoid not between", value1, value2, "aoid");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_idEqualTo(String value) {
            addCriterion("order_id =", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotEqualTo(String value) {
            addCriterion("order_id <>", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThan(String value) {
            addCriterion("order_id >", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThan(String value) {
            addCriterion("order_id <", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLike(String value) {
            addCriterion("order_id like", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotLike(String value) {
            addCriterion("order_id not like", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idIn(List<String> values) {
            addCriterion("order_id in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotIn(List<String> values) {
            addCriterion("order_id not in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andPay_priceIsNull() {
            addCriterion("pay_price is null");
            return (Criteria) this;
        }

        public Criteria andPay_priceIsNotNull() {
            addCriterion("pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andPay_priceEqualTo(Float value) {
            addCriterion("pay_price =", value, "pay_price");
            return (Criteria) this;
        }

        public Criteria andPay_priceNotEqualTo(Float value) {
            addCriterion("pay_price <>", value, "pay_price");
            return (Criteria) this;
        }

        public Criteria andPay_priceGreaterThan(Float value) {
            addCriterion("pay_price >", value, "pay_price");
            return (Criteria) this;
        }

        public Criteria andPay_priceGreaterThanOrEqualTo(Float value) {
            addCriterion("pay_price >=", value, "pay_price");
            return (Criteria) this;
        }

        public Criteria andPay_priceLessThan(Float value) {
            addCriterion("pay_price <", value, "pay_price");
            return (Criteria) this;
        }

        public Criteria andPay_priceLessThanOrEqualTo(Float value) {
            addCriterion("pay_price <=", value, "pay_price");
            return (Criteria) this;
        }

        public Criteria andPay_priceIn(List<Float> values) {
            addCriterion("pay_price in", values, "pay_price");
            return (Criteria) this;
        }

        public Criteria andPay_priceNotIn(List<Float> values) {
            addCriterion("pay_price not in", values, "pay_price");
            return (Criteria) this;
        }

        public Criteria andPay_priceBetween(Float value1, Float value2) {
            addCriterion("pay_price between", value1, value2, "pay_price");
            return (Criteria) this;
        }

        public Criteria andPay_priceNotBetween(Float value1, Float value2) {
            addCriterion("pay_price not between", value1, value2, "pay_price");
            return (Criteria) this;
        }

        public Criteria andPay_timeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPay_timeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPay_timeEqualTo(String value) {
            addCriterion("pay_time =", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeNotEqualTo(String value) {
            addCriterion("pay_time <>", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeGreaterThan(String value) {
            addCriterion("pay_time >", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_time >=", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeLessThan(String value) {
            addCriterion("pay_time <", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeLessThanOrEqualTo(String value) {
            addCriterion("pay_time <=", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeLike(String value) {
            addCriterion("pay_time like", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeNotLike(String value) {
            addCriterion("pay_time not like", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeIn(List<String> values) {
            addCriterion("pay_time in", values, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeNotIn(List<String> values) {
            addCriterion("pay_time not in", values, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeBetween(String value1, String value2) {
            addCriterion("pay_time between", value1, value2, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeNotBetween(String value1, String value2) {
            addCriterion("pay_time not between", value1, value2, "pay_time");
            return (Criteria) this;
        }

        public Criteria andMoreIsNull() {
            addCriterion("`more` is null");
            return (Criteria) this;
        }

        public Criteria andMoreIsNotNull() {
            addCriterion("`more` is not null");
            return (Criteria) this;
        }

        public Criteria andMoreEqualTo(String value) {
            addCriterion("`more` =", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreNotEqualTo(String value) {
            addCriterion("`more` <>", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreGreaterThan(String value) {
            addCriterion("`more` >", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreGreaterThanOrEqualTo(String value) {
            addCriterion("`more` >=", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreLessThan(String value) {
            addCriterion("`more` <", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreLessThanOrEqualTo(String value) {
            addCriterion("`more` <=", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreLike(String value) {
            addCriterion("`more` like", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreNotLike(String value) {
            addCriterion("`more` not like", value, "more");
            return (Criteria) this;
        }

        public Criteria andMoreIn(List<String> values) {
            addCriterion("`more` in", values, "more");
            return (Criteria) this;
        }

        public Criteria andMoreNotIn(List<String> values) {
            addCriterion("`more` not in", values, "more");
            return (Criteria) this;
        }

        public Criteria andMoreBetween(String value1, String value2) {
            addCriterion("`more` between", value1, value2, "more");
            return (Criteria) this;
        }

        public Criteria andMoreNotBetween(String value1, String value2) {
            addCriterion("`more` not between", value1, value2, "more");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("sign is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("sign is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(String value) {
            addCriterion("sign =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(String value) {
            addCriterion("sign <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(String value) {
            addCriterion("sign >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(String value) {
            addCriterion("sign >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(String value) {
            addCriterion("sign <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(String value) {
            addCriterion("sign <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLike(String value) {
            addCriterion("sign like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotLike(String value) {
            addCriterion("sign not like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<String> values) {
            addCriterion("sign in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<String> values) {
            addCriterion("sign not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(String value1, String value2) {
            addCriterion("sign between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(String value1, String value2) {
            addCriterion("sign not between", value1, value2, "sign");
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