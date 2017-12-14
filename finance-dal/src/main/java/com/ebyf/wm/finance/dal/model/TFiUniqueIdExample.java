package com.ebyf.wm.finance.dal.model;

import java.util.ArrayList;
import java.util.List;

public class TFiUniqueIdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TFiUniqueIdExample() {
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

        public Criteria andUidNameIsNull() {
            addCriterion("uid_name is null");
            return (Criteria) this;
        }

        public Criteria andUidNameIsNotNull() {
            addCriterion("uid_name is not null");
            return (Criteria) this;
        }

        public Criteria andUidNameEqualTo(String value) {
            addCriterion("uid_name =", value, "uidName");
            return (Criteria) this;
        }

        public Criteria andUidNameNotEqualTo(String value) {
            addCriterion("uid_name <>", value, "uidName");
            return (Criteria) this;
        }

        public Criteria andUidNameGreaterThan(String value) {
            addCriterion("uid_name >", value, "uidName");
            return (Criteria) this;
        }

        public Criteria andUidNameGreaterThanOrEqualTo(String value) {
            addCriterion("uid_name >=", value, "uidName");
            return (Criteria) this;
        }

        public Criteria andUidNameLessThan(String value) {
            addCriterion("uid_name <", value, "uidName");
            return (Criteria) this;
        }

        public Criteria andUidNameLessThanOrEqualTo(String value) {
            addCriterion("uid_name <=", value, "uidName");
            return (Criteria) this;
        }

        public Criteria andUidNameLike(String value) {
            addCriterion("uid_name like", value, "uidName");
            return (Criteria) this;
        }

        public Criteria andUidNameNotLike(String value) {
            addCriterion("uid_name not like", value, "uidName");
            return (Criteria) this;
        }

        public Criteria andUidNameIn(List<String> values) {
            addCriterion("uid_name in", values, "uidName");
            return (Criteria) this;
        }

        public Criteria andUidNameNotIn(List<String> values) {
            addCriterion("uid_name not in", values, "uidName");
            return (Criteria) this;
        }

        public Criteria andUidNameBetween(String value1, String value2) {
            addCriterion("uid_name between", value1, value2, "uidName");
            return (Criteria) this;
        }

        public Criteria andUidNameNotBetween(String value1, String value2) {
            addCriterion("uid_name not between", value1, value2, "uidName");
            return (Criteria) this;
        }

        public Criteria andUidLengthIsNull() {
            addCriterion("uid_length is null");
            return (Criteria) this;
        }

        public Criteria andUidLengthIsNotNull() {
            addCriterion("uid_length is not null");
            return (Criteria) this;
        }

        public Criteria andUidLengthEqualTo(Integer value) {
            addCriterion("uid_length =", value, "uidLength");
            return (Criteria) this;
        }

        public Criteria andUidLengthNotEqualTo(Integer value) {
            addCriterion("uid_length <>", value, "uidLength");
            return (Criteria) this;
        }

        public Criteria andUidLengthGreaterThan(Integer value) {
            addCriterion("uid_length >", value, "uidLength");
            return (Criteria) this;
        }

        public Criteria andUidLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid_length >=", value, "uidLength");
            return (Criteria) this;
        }

        public Criteria andUidLengthLessThan(Integer value) {
            addCriterion("uid_length <", value, "uidLength");
            return (Criteria) this;
        }

        public Criteria andUidLengthLessThanOrEqualTo(Integer value) {
            addCriterion("uid_length <=", value, "uidLength");
            return (Criteria) this;
        }

        public Criteria andUidLengthIn(List<Integer> values) {
            addCriterion("uid_length in", values, "uidLength");
            return (Criteria) this;
        }

        public Criteria andUidLengthNotIn(List<Integer> values) {
            addCriterion("uid_length not in", values, "uidLength");
            return (Criteria) this;
        }

        public Criteria andUidLengthBetween(Integer value1, Integer value2) {
            addCriterion("uid_length between", value1, value2, "uidLength");
            return (Criteria) this;
        }

        public Criteria andUidLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("uid_length not between", value1, value2, "uidLength");
            return (Criteria) this;
        }

        public Criteria andNextUidIsNull() {
            addCriterion("next_uid is null");
            return (Criteria) this;
        }

        public Criteria andNextUidIsNotNull() {
            addCriterion("next_uid is not null");
            return (Criteria) this;
        }

        public Criteria andNextUidEqualTo(Long value) {
            addCriterion("next_uid =", value, "nextUid");
            return (Criteria) this;
        }

        public Criteria andNextUidNotEqualTo(Long value) {
            addCriterion("next_uid <>", value, "nextUid");
            return (Criteria) this;
        }

        public Criteria andNextUidGreaterThan(Long value) {
            addCriterion("next_uid >", value, "nextUid");
            return (Criteria) this;
        }

        public Criteria andNextUidGreaterThanOrEqualTo(Long value) {
            addCriterion("next_uid >=", value, "nextUid");
            return (Criteria) this;
        }

        public Criteria andNextUidLessThan(Long value) {
            addCriterion("next_uid <", value, "nextUid");
            return (Criteria) this;
        }

        public Criteria andNextUidLessThanOrEqualTo(Long value) {
            addCriterion("next_uid <=", value, "nextUid");
            return (Criteria) this;
        }

        public Criteria andNextUidIn(List<Long> values) {
            addCriterion("next_uid in", values, "nextUid");
            return (Criteria) this;
        }

        public Criteria andNextUidNotIn(List<Long> values) {
            addCriterion("next_uid not in", values, "nextUid");
            return (Criteria) this;
        }

        public Criteria andNextUidBetween(Long value1, Long value2) {
            addCriterion("next_uid between", value1, value2, "nextUid");
            return (Criteria) this;
        }

        public Criteria andNextUidNotBetween(Long value1, Long value2) {
            addCriterion("next_uid not between", value1, value2, "nextUid");
            return (Criteria) this;
        }

        public Criteria andFversionIsNull() {
            addCriterion("fversion is null");
            return (Criteria) this;
        }

        public Criteria andFversionIsNotNull() {
            addCriterion("fversion is not null");
            return (Criteria) this;
        }

        public Criteria andFversionEqualTo(Long value) {
            addCriterion("fversion =", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionNotEqualTo(Long value) {
            addCriterion("fversion <>", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionGreaterThan(Long value) {
            addCriterion("fversion >", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionGreaterThanOrEqualTo(Long value) {
            addCriterion("fversion >=", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionLessThan(Long value) {
            addCriterion("fversion <", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionLessThanOrEqualTo(Long value) {
            addCriterion("fversion <=", value, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionIn(List<Long> values) {
            addCriterion("fversion in", values, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionNotIn(List<Long> values) {
            addCriterion("fversion not in", values, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionBetween(Long value1, Long value2) {
            addCriterion("fversion between", value1, value2, "fversion");
            return (Criteria) this;
        }

        public Criteria andFversionNotBetween(Long value1, Long value2) {
            addCriterion("fversion not between", value1, value2, "fversion");
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