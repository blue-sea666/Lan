package com.lan.pojo;

import java.util.ArrayList;
import java.util.List;

public class PostLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostLogExample() {
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

        public Criteria andPostLogIdIsNull() {
            addCriterion("post_log_id is null");
            return (Criteria) this;
        }

        public Criteria andPostLogIdIsNotNull() {
            addCriterion("post_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostLogIdEqualTo(Integer value) {
            addCriterion("post_log_id =", value, "postLogId");
            return (Criteria) this;
        }

        public Criteria andPostLogIdNotEqualTo(Integer value) {
            addCriterion("post_log_id <>", value, "postLogId");
            return (Criteria) this;
        }

        public Criteria andPostLogIdGreaterThan(Integer value) {
            addCriterion("post_log_id >", value, "postLogId");
            return (Criteria) this;
        }

        public Criteria andPostLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_log_id >=", value, "postLogId");
            return (Criteria) this;
        }

        public Criteria andPostLogIdLessThan(Integer value) {
            addCriterion("post_log_id <", value, "postLogId");
            return (Criteria) this;
        }

        public Criteria andPostLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_log_id <=", value, "postLogId");
            return (Criteria) this;
        }

        public Criteria andPostLogIdIn(List<Integer> values) {
            addCriterion("post_log_id in", values, "postLogId");
            return (Criteria) this;
        }

        public Criteria andPostLogIdNotIn(List<Integer> values) {
            addCriterion("post_log_id not in", values, "postLogId");
            return (Criteria) this;
        }

        public Criteria andPostLogIdBetween(Integer value1, Integer value2) {
            addCriterion("post_log_id between", value1, value2, "postLogId");
            return (Criteria) this;
        }

        public Criteria andPostLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_log_id not between", value1, value2, "postLogId");
            return (Criteria) this;
        }

        public Criteria andPostLogPostIdIsNull() {
            addCriterion("post_log_post_id is null");
            return (Criteria) this;
        }

        public Criteria andPostLogPostIdIsNotNull() {
            addCriterion("post_log_post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostLogPostIdEqualTo(Integer value) {
            addCriterion("post_log_post_id =", value, "postLogPostId");
            return (Criteria) this;
        }

        public Criteria andPostLogPostIdNotEqualTo(Integer value) {
            addCriterion("post_log_post_id <>", value, "postLogPostId");
            return (Criteria) this;
        }

        public Criteria andPostLogPostIdGreaterThan(Integer value) {
            addCriterion("post_log_post_id >", value, "postLogPostId");
            return (Criteria) this;
        }

        public Criteria andPostLogPostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_log_post_id >=", value, "postLogPostId");
            return (Criteria) this;
        }

        public Criteria andPostLogPostIdLessThan(Integer value) {
            addCriterion("post_log_post_id <", value, "postLogPostId");
            return (Criteria) this;
        }

        public Criteria andPostLogPostIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_log_post_id <=", value, "postLogPostId");
            return (Criteria) this;
        }

        public Criteria andPostLogPostIdIn(List<Integer> values) {
            addCriterion("post_log_post_id in", values, "postLogPostId");
            return (Criteria) this;
        }

        public Criteria andPostLogPostIdNotIn(List<Integer> values) {
            addCriterion("post_log_post_id not in", values, "postLogPostId");
            return (Criteria) this;
        }

        public Criteria andPostLogPostIdBetween(Integer value1, Integer value2) {
            addCriterion("post_log_post_id between", value1, value2, "postLogPostId");
            return (Criteria) this;
        }

        public Criteria andPostLogPostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_log_post_id not between", value1, value2, "postLogPostId");
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