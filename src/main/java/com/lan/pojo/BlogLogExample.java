package com.lan.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogLogExample() {
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

        public Criteria andBlogLogIdIsNull() {
            addCriterion("blog_log_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogLogIdIsNotNull() {
            addCriterion("blog_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogLogIdEqualTo(Integer value) {
            addCriterion("blog_log_id =", value, "blogLogId");
            return (Criteria) this;
        }

        public Criteria andBlogLogIdNotEqualTo(Integer value) {
            addCriterion("blog_log_id <>", value, "blogLogId");
            return (Criteria) this;
        }

        public Criteria andBlogLogIdGreaterThan(Integer value) {
            addCriterion("blog_log_id >", value, "blogLogId");
            return (Criteria) this;
        }

        public Criteria andBlogLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_log_id >=", value, "blogLogId");
            return (Criteria) this;
        }

        public Criteria andBlogLogIdLessThan(Integer value) {
            addCriterion("blog_log_id <", value, "blogLogId");
            return (Criteria) this;
        }

        public Criteria andBlogLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_log_id <=", value, "blogLogId");
            return (Criteria) this;
        }

        public Criteria andBlogLogIdIn(List<Integer> values) {
            addCriterion("blog_log_id in", values, "blogLogId");
            return (Criteria) this;
        }

        public Criteria andBlogLogIdNotIn(List<Integer> values) {
            addCriterion("blog_log_id not in", values, "blogLogId");
            return (Criteria) this;
        }

        public Criteria andBlogLogIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_log_id between", value1, value2, "blogLogId");
            return (Criteria) this;
        }

        public Criteria andBlogLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_log_id not between", value1, value2, "blogLogId");
            return (Criteria) this;
        }

        public Criteria andBlogLogTimeIsNull() {
            addCriterion("blog_log_time is null");
            return (Criteria) this;
        }

        public Criteria andBlogLogTimeIsNotNull() {
            addCriterion("blog_log_time is not null");
            return (Criteria) this;
        }

        public Criteria andBlogLogTimeEqualTo(Date value) {
            addCriterion("blog_log_time =", value, "blogLogTime");
            return (Criteria) this;
        }

        public Criteria andBlogLogTimeNotEqualTo(Date value) {
            addCriterion("blog_log_time <>", value, "blogLogTime");
            return (Criteria) this;
        }

        public Criteria andBlogLogTimeGreaterThan(Date value) {
            addCriterion("blog_log_time >", value, "blogLogTime");
            return (Criteria) this;
        }

        public Criteria andBlogLogTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("blog_log_time >=", value, "blogLogTime");
            return (Criteria) this;
        }

        public Criteria andBlogLogTimeLessThan(Date value) {
            addCriterion("blog_log_time <", value, "blogLogTime");
            return (Criteria) this;
        }

        public Criteria andBlogLogTimeLessThanOrEqualTo(Date value) {
            addCriterion("blog_log_time <=", value, "blogLogTime");
            return (Criteria) this;
        }

        public Criteria andBlogLogTimeIn(List<Date> values) {
            addCriterion("blog_log_time in", values, "blogLogTime");
            return (Criteria) this;
        }

        public Criteria andBlogLogTimeNotIn(List<Date> values) {
            addCriterion("blog_log_time not in", values, "blogLogTime");
            return (Criteria) this;
        }

        public Criteria andBlogLogTimeBetween(Date value1, Date value2) {
            addCriterion("blog_log_time between", value1, value2, "blogLogTime");
            return (Criteria) this;
        }

        public Criteria andBlogLogTimeNotBetween(Date value1, Date value2) {
            addCriterion("blog_log_time not between", value1, value2, "blogLogTime");
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