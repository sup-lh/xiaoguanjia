package com.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class helpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public helpExample() {
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

        public Criteria andThingIsNull() {
            addCriterion("thing is null");
            return (Criteria) this;
        }

        public Criteria andThingIsNotNull() {
            addCriterion("thing is not null");
            return (Criteria) this;
        }

        public Criteria andThingEqualTo(String value) {
            addCriterion("thing =", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingNotEqualTo(String value) {
            addCriterion("thing <>", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingGreaterThan(String value) {
            addCriterion("thing >", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingGreaterThanOrEqualTo(String value) {
            addCriterion("thing >=", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingLessThan(String value) {
            addCriterion("thing <", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingLessThanOrEqualTo(String value) {
            addCriterion("thing <=", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingLike(String value) {
            addCriterion("thing like", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingNotLike(String value) {
            addCriterion("thing not like", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingIn(List<String> values) {
            addCriterion("thing in", values, "thing");
            return (Criteria) this;
        }

        public Criteria andThingNotIn(List<String> values) {
            addCriterion("thing not in", values, "thing");
            return (Criteria) this;
        }

        public Criteria andThingBetween(String value1, String value2) {
            addCriterion("thing between", value1, value2, "thing");
            return (Criteria) this;
        }

        public Criteria andThingNotBetween(String value1, String value2) {
            addCriterion("thing not between", value1, value2, "thing");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("`time` is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("`time` is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("`time` =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("`time` <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("`time` >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`time` >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("`time` <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("`time` <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("`time` in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("`time` not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("`time` between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("`time` not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andStartIsNull() {
            addCriterion("`start` is null");
            return (Criteria) this;
        }

        public Criteria andStartIsNotNull() {
            addCriterion("`start` is not null");
            return (Criteria) this;
        }

        public Criteria andStartEqualTo(String value) {
            addCriterion("`start` =", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotEqualTo(String value) {
            addCriterion("`start` <>", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThan(String value) {
            addCriterion("`start` >", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThanOrEqualTo(String value) {
            addCriterion("`start` >=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThan(String value) {
            addCriterion("`start` <", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThanOrEqualTo(String value) {
            addCriterion("`start` <=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLike(String value) {
            addCriterion("`start` like", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotLike(String value) {
            addCriterion("`start` not like", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartIn(List<String> values) {
            addCriterion("`start` in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotIn(List<String> values) {
            addCriterion("`start` not in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartBetween(String value1, String value2) {
            addCriterion("`start` between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotBetween(String value1, String value2) {
            addCriterion("`start` not between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andEndIsNull() {
            addCriterion("`end` is null");
            return (Criteria) this;
        }

        public Criteria andEndIsNotNull() {
            addCriterion("`end` is not null");
            return (Criteria) this;
        }

        public Criteria andEndEqualTo(String value) {
            addCriterion("`end` =", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotEqualTo(String value) {
            addCriterion("`end` <>", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndGreaterThan(String value) {
            addCriterion("`end` >", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndGreaterThanOrEqualTo(String value) {
            addCriterion("`end` >=", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLessThan(String value) {
            addCriterion("`end` <", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLessThanOrEqualTo(String value) {
            addCriterion("`end` <=", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLike(String value) {
            addCriterion("`end` like", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotLike(String value) {
            addCriterion("`end` not like", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndIn(List<String> values) {
            addCriterion("`end` in", values, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotIn(List<String> values) {
            addCriterion("`end` not in", values, "end");
            return (Criteria) this;
        }

        public Criteria andEndBetween(String value1, String value2) {
            addCriterion("`end` between", value1, value2, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotBetween(String value1, String value2) {
            addCriterion("`end` not between", value1, value2, "end");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andTouxiangIsNull() {
            addCriterion("touxiang is null");
            return (Criteria) this;
        }

        public Criteria andTouxiangIsNotNull() {
            addCriterion("touxiang is not null");
            return (Criteria) this;
        }

        public Criteria andTouxiangEqualTo(String value) {
            addCriterion("touxiang =", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotEqualTo(String value) {
            addCriterion("touxiang <>", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangGreaterThan(String value) {
            addCriterion("touxiang >", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangGreaterThanOrEqualTo(String value) {
            addCriterion("touxiang >=", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangLessThan(String value) {
            addCriterion("touxiang <", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangLessThanOrEqualTo(String value) {
            addCriterion("touxiang <=", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangLike(String value) {
            addCriterion("touxiang like", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotLike(String value) {
            addCriterion("touxiang not like", value, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangIn(List<String> values) {
            addCriterion("touxiang in", values, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotIn(List<String> values) {
            addCriterion("touxiang not in", values, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangBetween(String value1, String value2) {
            addCriterion("touxiang between", value1, value2, "touxiang");
            return (Criteria) this;
        }

        public Criteria andTouxiangNotBetween(String value1, String value2) {
            addCriterion("touxiang not between", value1, value2, "touxiang");
            return (Criteria) this;
        }

        public Criteria andThingflagIsNull() {
            addCriterion("thingflag is null");
            return (Criteria) this;
        }

        public Criteria andThingflagIsNotNull() {
            addCriterion("thingflag is not null");
            return (Criteria) this;
        }

        public Criteria andThingflagEqualTo(Boolean value) {
            addCriterion("thingflag =", value, "thingflag");
            return (Criteria) this;
        }

        public Criteria andThingflagNotEqualTo(Boolean value) {
            addCriterion("thingflag <>", value, "thingflag");
            return (Criteria) this;
        }

        public Criteria andThingflagGreaterThan(Boolean value) {
            addCriterion("thingflag >", value, "thingflag");
            return (Criteria) this;
        }

        public Criteria andThingflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("thingflag >=", value, "thingflag");
            return (Criteria) this;
        }

        public Criteria andThingflagLessThan(Boolean value) {
            addCriterion("thingflag <", value, "thingflag");
            return (Criteria) this;
        }

        public Criteria andThingflagLessThanOrEqualTo(Boolean value) {
            addCriterion("thingflag <=", value, "thingflag");
            return (Criteria) this;
        }

        public Criteria andThingflagIn(List<Boolean> values) {
            addCriterion("thingflag in", values, "thingflag");
            return (Criteria) this;
        }

        public Criteria andThingflagNotIn(List<Boolean> values) {
            addCriterion("thingflag not in", values, "thingflag");
            return (Criteria) this;
        }

        public Criteria andThingflagBetween(Boolean value1, Boolean value2) {
            addCriterion("thingflag between", value1, value2, "thingflag");
            return (Criteria) this;
        }

        public Criteria andThingflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("thingflag not between", value1, value2, "thingflag");
            return (Criteria) this;
        }

        public Criteria andPushopenidIsNull() {
            addCriterion("pushopenid is null");
            return (Criteria) this;
        }

        public Criteria andPushopenidIsNotNull() {
            addCriterion("pushopenid is not null");
            return (Criteria) this;
        }

        public Criteria andPushopenidEqualTo(String value) {
            addCriterion("pushopenid =", value, "pushopenid");
            return (Criteria) this;
        }

        public Criteria andPushopenidNotEqualTo(String value) {
            addCriterion("pushopenid <>", value, "pushopenid");
            return (Criteria) this;
        }

        public Criteria andPushopenidGreaterThan(String value) {
            addCriterion("pushopenid >", value, "pushopenid");
            return (Criteria) this;
        }

        public Criteria andPushopenidGreaterThanOrEqualTo(String value) {
            addCriterion("pushopenid >=", value, "pushopenid");
            return (Criteria) this;
        }

        public Criteria andPushopenidLessThan(String value) {
            addCriterion("pushopenid <", value, "pushopenid");
            return (Criteria) this;
        }

        public Criteria andPushopenidLessThanOrEqualTo(String value) {
            addCriterion("pushopenid <=", value, "pushopenid");
            return (Criteria) this;
        }

        public Criteria andPushopenidLike(String value) {
            addCriterion("pushopenid like", value, "pushopenid");
            return (Criteria) this;
        }

        public Criteria andPushopenidNotLike(String value) {
            addCriterion("pushopenid not like", value, "pushopenid");
            return (Criteria) this;
        }

        public Criteria andPushopenidIn(List<String> values) {
            addCriterion("pushopenid in", values, "pushopenid");
            return (Criteria) this;
        }

        public Criteria andPushopenidNotIn(List<String> values) {
            addCriterion("pushopenid not in", values, "pushopenid");
            return (Criteria) this;
        }

        public Criteria andPushopenidBetween(String value1, String value2) {
            addCriterion("pushopenid between", value1, value2, "pushopenid");
            return (Criteria) this;
        }

        public Criteria andPushopenidNotBetween(String value1, String value2) {
            addCriterion("pushopenid not between", value1, value2, "pushopenid");
            return (Criteria) this;
        }

        public Criteria andGainopenidIsNull() {
            addCriterion("gainopenid is null");
            return (Criteria) this;
        }

        public Criteria andGainopenidIsNotNull() {
            addCriterion("gainopenid is not null");
            return (Criteria) this;
        }

        public Criteria andGainopenidEqualTo(String value) {
            addCriterion("gainopenid =", value, "gainopenid");
            return (Criteria) this;
        }

        public Criteria andGainopenidNotEqualTo(String value) {
            addCriterion("gainopenid <>", value, "gainopenid");
            return (Criteria) this;
        }

        public Criteria andGainopenidGreaterThan(String value) {
            addCriterion("gainopenid >", value, "gainopenid");
            return (Criteria) this;
        }

        public Criteria andGainopenidGreaterThanOrEqualTo(String value) {
            addCriterion("gainopenid >=", value, "gainopenid");
            return (Criteria) this;
        }

        public Criteria andGainopenidLessThan(String value) {
            addCriterion("gainopenid <", value, "gainopenid");
            return (Criteria) this;
        }

        public Criteria andGainopenidLessThanOrEqualTo(String value) {
            addCriterion("gainopenid <=", value, "gainopenid");
            return (Criteria) this;
        }

        public Criteria andGainopenidLike(String value) {
            addCriterion("gainopenid like", value, "gainopenid");
            return (Criteria) this;
        }

        public Criteria andGainopenidNotLike(String value) {
            addCriterion("gainopenid not like", value, "gainopenid");
            return (Criteria) this;
        }

        public Criteria andGainopenidIn(List<String> values) {
            addCriterion("gainopenid in", values, "gainopenid");
            return (Criteria) this;
        }

        public Criteria andGainopenidNotIn(List<String> values) {
            addCriterion("gainopenid not in", values, "gainopenid");
            return (Criteria) this;
        }

        public Criteria andGainopenidBetween(String value1, String value2) {
            addCriterion("gainopenid between", value1, value2, "gainopenid");
            return (Criteria) this;
        }

        public Criteria andGainopenidNotBetween(String value1, String value2) {
            addCriterion("gainopenid not between", value1, value2, "gainopenid");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andGainphoneIsNull() {
            addCriterion("gainphone is null");
            return (Criteria) this;
        }

        public Criteria andGainphoneIsNotNull() {
            addCriterion("gainphone is not null");
            return (Criteria) this;
        }

        public Criteria andGainphoneEqualTo(String value) {
            addCriterion("gainphone =", value, "gainphone");
            return (Criteria) this;
        }

        public Criteria andGainphoneNotEqualTo(String value) {
            addCriterion("gainphone <>", value, "gainphone");
            return (Criteria) this;
        }

        public Criteria andGainphoneGreaterThan(String value) {
            addCriterion("gainphone >", value, "gainphone");
            return (Criteria) this;
        }

        public Criteria andGainphoneGreaterThanOrEqualTo(String value) {
            addCriterion("gainphone >=", value, "gainphone");
            return (Criteria) this;
        }

        public Criteria andGainphoneLessThan(String value) {
            addCriterion("gainphone <", value, "gainphone");
            return (Criteria) this;
        }

        public Criteria andGainphoneLessThanOrEqualTo(String value) {
            addCriterion("gainphone <=", value, "gainphone");
            return (Criteria) this;
        }

        public Criteria andGainphoneLike(String value) {
            addCriterion("gainphone like", value, "gainphone");
            return (Criteria) this;
        }

        public Criteria andGainphoneNotLike(String value) {
            addCriterion("gainphone not like", value, "gainphone");
            return (Criteria) this;
        }

        public Criteria andGainphoneIn(List<String> values) {
            addCriterion("gainphone in", values, "gainphone");
            return (Criteria) this;
        }

        public Criteria andGainphoneNotIn(List<String> values) {
            addCriterion("gainphone not in", values, "gainphone");
            return (Criteria) this;
        }

        public Criteria andGainphoneBetween(String value1, String value2) {
            addCriterion("gainphone between", value1, value2, "gainphone");
            return (Criteria) this;
        }

        public Criteria andGainphoneNotBetween(String value1, String value2) {
            addCriterion("gainphone not between", value1, value2, "gainphone");
            return (Criteria) this;
        }

        public Criteria andOverIsNull() {
            addCriterion("`over` is null");
            return (Criteria) this;
        }

        public Criteria andOverIsNotNull() {
            addCriterion("`over` is not null");
            return (Criteria) this;
        }

        public Criteria andOverEqualTo(Boolean value) {
            addCriterion("`over` =", value, "over");
            return (Criteria) this;
        }

        public Criteria andOverNotEqualTo(Boolean value) {
            addCriterion("`over` <>", value, "over");
            return (Criteria) this;
        }

        public Criteria andOverGreaterThan(Boolean value) {
            addCriterion("`over` >", value, "over");
            return (Criteria) this;
        }

        public Criteria andOverGreaterThanOrEqualTo(Boolean value) {
            addCriterion("`over` >=", value, "over");
            return (Criteria) this;
        }

        public Criteria andOverLessThan(Boolean value) {
            addCriterion("`over` <", value, "over");
            return (Criteria) this;
        }

        public Criteria andOverLessThanOrEqualTo(Boolean value) {
            addCriterion("`over` <=", value, "over");
            return (Criteria) this;
        }

        public Criteria andOverIn(List<Boolean> values) {
            addCriterion("`over` in", values, "over");
            return (Criteria) this;
        }

        public Criteria andOverNotIn(List<Boolean> values) {
            addCriterion("`over` not in", values, "over");
            return (Criteria) this;
        }

        public Criteria andOverBetween(Boolean value1, Boolean value2) {
            addCriterion("`over` between", value1, value2, "over");
            return (Criteria) this;
        }

        public Criteria andOverNotBetween(Boolean value1, Boolean value2) {
            addCriterion("`over` not between", value1, value2, "over");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIsNull() {
            addCriterion("deleteflag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIsNotNull() {
            addCriterion("deleteflag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagEqualTo(Boolean value) {
            addCriterion("deleteflag =", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotEqualTo(Boolean value) {
            addCriterion("deleteflag <>", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThan(Boolean value) {
            addCriterion("deleteflag >", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleteflag >=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThan(Boolean value) {
            addCriterion("deleteflag <", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThanOrEqualTo(Boolean value) {
            addCriterion("deleteflag <=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIn(List<Boolean> values) {
            addCriterion("deleteflag in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotIn(List<Boolean> values) {
            addCriterion("deleteflag not in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteflag between", value1, value2, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteflag not between", value1, value2, "deleteflag");
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