package com.lan.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostCommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostCommentsExample() {
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

        public Criteria andPostCommentsIdIsNull() {
            addCriterion("post_comments_id is null");
            return (Criteria) this;
        }

        public Criteria andPostCommentsIdIsNotNull() {
            addCriterion("post_comments_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostCommentsIdEqualTo(Integer value) {
            addCriterion("post_comments_id =", value, "postCommentsId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsIdNotEqualTo(Integer value) {
            addCriterion("post_comments_id <>", value, "postCommentsId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsIdGreaterThan(Integer value) {
            addCriterion("post_comments_id >", value, "postCommentsId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_comments_id >=", value, "postCommentsId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsIdLessThan(Integer value) {
            addCriterion("post_comments_id <", value, "postCommentsId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_comments_id <=", value, "postCommentsId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsIdIn(List<Integer> values) {
            addCriterion("post_comments_id in", values, "postCommentsId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsIdNotIn(List<Integer> values) {
            addCriterion("post_comments_id not in", values, "postCommentsId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsIdBetween(Integer value1, Integer value2) {
            addCriterion("post_comments_id between", value1, value2, "postCommentsId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_comments_id not between", value1, value2, "postCommentsId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAuthorIsNull() {
            addCriterion("post_comments_author is null");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAuthorIsNotNull() {
            addCriterion("post_comments_author is not null");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAuthorEqualTo(String value) {
            addCriterion("post_comments_author =", value, "postCommentsAuthor");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAuthorNotEqualTo(String value) {
            addCriterion("post_comments_author <>", value, "postCommentsAuthor");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAuthorGreaterThan(String value) {
            addCriterion("post_comments_author >", value, "postCommentsAuthor");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("post_comments_author >=", value, "postCommentsAuthor");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAuthorLessThan(String value) {
            addCriterion("post_comments_author <", value, "postCommentsAuthor");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAuthorLessThanOrEqualTo(String value) {
            addCriterion("post_comments_author <=", value, "postCommentsAuthor");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAuthorLike(String value) {
            addCriterion("post_comments_author like", value, "postCommentsAuthor");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAuthorNotLike(String value) {
            addCriterion("post_comments_author not like", value, "postCommentsAuthor");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAuthorIn(List<String> values) {
            addCriterion("post_comments_author in", values, "postCommentsAuthor");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAuthorNotIn(List<String> values) {
            addCriterion("post_comments_author not in", values, "postCommentsAuthor");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAuthorBetween(String value1, String value2) {
            addCriterion("post_comments_author between", value1, value2, "postCommentsAuthor");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAuthorNotBetween(String value1, String value2) {
            addCriterion("post_comments_author not between", value1, value2, "postCommentsAuthor");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPostIdIsNull() {
            addCriterion("post_comments_post_id is null");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPostIdIsNotNull() {
            addCriterion("post_comments_post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPostIdEqualTo(Integer value) {
            addCriterion("post_comments_post_id =", value, "postCommentsPostId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPostIdNotEqualTo(Integer value) {
            addCriterion("post_comments_post_id <>", value, "postCommentsPostId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPostIdGreaterThan(Integer value) {
            addCriterion("post_comments_post_id >", value, "postCommentsPostId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_comments_post_id >=", value, "postCommentsPostId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPostIdLessThan(Integer value) {
            addCriterion("post_comments_post_id <", value, "postCommentsPostId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPostIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_comments_post_id <=", value, "postCommentsPostId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPostIdIn(List<Integer> values) {
            addCriterion("post_comments_post_id in", values, "postCommentsPostId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPostIdNotIn(List<Integer> values) {
            addCriterion("post_comments_post_id not in", values, "postCommentsPostId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPostIdBetween(Integer value1, Integer value2) {
            addCriterion("post_comments_post_id between", value1, value2, "postCommentsPostId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_comments_post_id not between", value1, value2, "postCommentsPostId");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAddtimeIsNull() {
            addCriterion("post_comments_addtime is null");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAddtimeIsNotNull() {
            addCriterion("post_comments_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAddtimeEqualTo(Date value) {
            addCriterion("post_comments_addtime =", value, "postCommentsAddtime");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAddtimeNotEqualTo(Date value) {
            addCriterion("post_comments_addtime <>", value, "postCommentsAddtime");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAddtimeGreaterThan(Date value) {
            addCriterion("post_comments_addtime >", value, "postCommentsAddtime");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("post_comments_addtime >=", value, "postCommentsAddtime");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAddtimeLessThan(Date value) {
            addCriterion("post_comments_addtime <", value, "postCommentsAddtime");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("post_comments_addtime <=", value, "postCommentsAddtime");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAddtimeIn(List<Date> values) {
            addCriterion("post_comments_addtime in", values, "postCommentsAddtime");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAddtimeNotIn(List<Date> values) {
            addCriterion("post_comments_addtime not in", values, "postCommentsAddtime");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAddtimeBetween(Date value1, Date value2) {
            addCriterion("post_comments_addtime between", value1, value2, "postCommentsAddtime");
            return (Criteria) this;
        }

        public Criteria andPostCommentsAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("post_comments_addtime not between", value1, value2, "postCommentsAddtime");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPidIsNull() {
            addCriterion("post_comments_pid is null");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPidIsNotNull() {
            addCriterion("post_comments_pid is not null");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPidEqualTo(Integer value) {
            addCriterion("post_comments_pid =", value, "postCommentsPid");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPidNotEqualTo(Integer value) {
            addCriterion("post_comments_pid <>", value, "postCommentsPid");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPidGreaterThan(Integer value) {
            addCriterion("post_comments_pid >", value, "postCommentsPid");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_comments_pid >=", value, "postCommentsPid");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPidLessThan(Integer value) {
            addCriterion("post_comments_pid <", value, "postCommentsPid");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPidLessThanOrEqualTo(Integer value) {
            addCriterion("post_comments_pid <=", value, "postCommentsPid");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPidIn(List<Integer> values) {
            addCriterion("post_comments_pid in", values, "postCommentsPid");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPidNotIn(List<Integer> values) {
            addCriterion("post_comments_pid not in", values, "postCommentsPid");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPidBetween(Integer value1, Integer value2) {
            addCriterion("post_comments_pid between", value1, value2, "postCommentsPid");
            return (Criteria) this;
        }

        public Criteria andPostCommentsPidNotBetween(Integer value1, Integer value2) {
            addCriterion("post_comments_pid not between", value1, value2, "postCommentsPid");
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