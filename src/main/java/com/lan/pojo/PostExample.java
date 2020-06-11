package com.lan.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostExample() {
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

        public Criteria andPostIdIsNull() {
            addCriterion("post_id is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(Integer value) {
            addCriterion("post_id =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(Integer value) {
            addCriterion("post_id <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(Integer value) {
            addCriterion("post_id >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_id >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(Integer value) {
            addCriterion("post_id <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_id <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<Integer> values) {
            addCriterion("post_id in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<Integer> values) {
            addCriterion("post_id not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(Integer value1, Integer value2) {
            addCriterion("post_id between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_id not between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostTitleIsNull() {
            addCriterion("post_title is null");
            return (Criteria) this;
        }

        public Criteria andPostTitleIsNotNull() {
            addCriterion("post_title is not null");
            return (Criteria) this;
        }

        public Criteria andPostTitleEqualTo(String value) {
            addCriterion("post_title =", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotEqualTo(String value) {
            addCriterion("post_title <>", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleGreaterThan(String value) {
            addCriterion("post_title >", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleGreaterThanOrEqualTo(String value) {
            addCriterion("post_title >=", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLessThan(String value) {
            addCriterion("post_title <", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLessThanOrEqualTo(String value) {
            addCriterion("post_title <=", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLike(String value) {
            addCriterion("post_title like", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotLike(String value) {
            addCriterion("post_title not like", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleIn(List<String> values) {
            addCriterion("post_title in", values, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotIn(List<String> values) {
            addCriterion("post_title not in", values, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleBetween(String value1, String value2) {
            addCriterion("post_title between", value1, value2, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotBetween(String value1, String value2) {
            addCriterion("post_title not between", value1, value2, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostAddtimeIsNull() {
            addCriterion("post_addtime is null");
            return (Criteria) this;
        }

        public Criteria andPostAddtimeIsNotNull() {
            addCriterion("post_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andPostAddtimeEqualTo(Date value) {
            addCriterion("post_addtime =", value, "postAddtime");
            return (Criteria) this;
        }

        public Criteria andPostAddtimeNotEqualTo(Date value) {
            addCriterion("post_addtime <>", value, "postAddtime");
            return (Criteria) this;
        }

        public Criteria andPostAddtimeGreaterThan(Date value) {
            addCriterion("post_addtime >", value, "postAddtime");
            return (Criteria) this;
        }

        public Criteria andPostAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("post_addtime >=", value, "postAddtime");
            return (Criteria) this;
        }

        public Criteria andPostAddtimeLessThan(Date value) {
            addCriterion("post_addtime <", value, "postAddtime");
            return (Criteria) this;
        }

        public Criteria andPostAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("post_addtime <=", value, "postAddtime");
            return (Criteria) this;
        }

        public Criteria andPostAddtimeIn(List<Date> values) {
            addCriterion("post_addtime in", values, "postAddtime");
            return (Criteria) this;
        }

        public Criteria andPostAddtimeNotIn(List<Date> values) {
            addCriterion("post_addtime not in", values, "postAddtime");
            return (Criteria) this;
        }

        public Criteria andPostAddtimeBetween(Date value1, Date value2) {
            addCriterion("post_addtime between", value1, value2, "postAddtime");
            return (Criteria) this;
        }

        public Criteria andPostAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("post_addtime not between", value1, value2, "postAddtime");
            return (Criteria) this;
        }

        public Criteria andPostUpdatetimeIsNull() {
            addCriterion("post_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andPostUpdatetimeIsNotNull() {
            addCriterion("post_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andPostUpdatetimeEqualTo(Date value) {
            addCriterion("post_updatetime =", value, "postUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPostUpdatetimeNotEqualTo(Date value) {
            addCriterion("post_updatetime <>", value, "postUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPostUpdatetimeGreaterThan(Date value) {
            addCriterion("post_updatetime >", value, "postUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPostUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("post_updatetime >=", value, "postUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPostUpdatetimeLessThan(Date value) {
            addCriterion("post_updatetime <", value, "postUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPostUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("post_updatetime <=", value, "postUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPostUpdatetimeIn(List<Date> values) {
            addCriterion("post_updatetime in", values, "postUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPostUpdatetimeNotIn(List<Date> values) {
            addCriterion("post_updatetime not in", values, "postUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPostUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("post_updatetime between", value1, value2, "postUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPostUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("post_updatetime not between", value1, value2, "postUpdatetime");
            return (Criteria) this;
        }

        public Criteria andPostClassifyIdIsNull() {
            addCriterion("post_classify_id is null");
            return (Criteria) this;
        }

        public Criteria andPostClassifyIdIsNotNull() {
            addCriterion("post_classify_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostClassifyIdEqualTo(Integer value) {
            addCriterion("post_classify_id =", value, "postClassifyId");
            return (Criteria) this;
        }

        public Criteria andPostClassifyIdNotEqualTo(Integer value) {
            addCriterion("post_classify_id <>", value, "postClassifyId");
            return (Criteria) this;
        }

        public Criteria andPostClassifyIdGreaterThan(Integer value) {
            addCriterion("post_classify_id >", value, "postClassifyId");
            return (Criteria) this;
        }

        public Criteria andPostClassifyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_classify_id >=", value, "postClassifyId");
            return (Criteria) this;
        }

        public Criteria andPostClassifyIdLessThan(Integer value) {
            addCriterion("post_classify_id <", value, "postClassifyId");
            return (Criteria) this;
        }

        public Criteria andPostClassifyIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_classify_id <=", value, "postClassifyId");
            return (Criteria) this;
        }

        public Criteria andPostClassifyIdIn(List<Integer> values) {
            addCriterion("post_classify_id in", values, "postClassifyId");
            return (Criteria) this;
        }

        public Criteria andPostClassifyIdNotIn(List<Integer> values) {
            addCriterion("post_classify_id not in", values, "postClassifyId");
            return (Criteria) this;
        }

        public Criteria andPostClassifyIdBetween(Integer value1, Integer value2) {
            addCriterion("post_classify_id between", value1, value2, "postClassifyId");
            return (Criteria) this;
        }

        public Criteria andPostClassifyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_classify_id not between", value1, value2, "postClassifyId");
            return (Criteria) this;
        }

        public Criteria andPostBrowseIsNull() {
            addCriterion("post_browse is null");
            return (Criteria) this;
        }

        public Criteria andPostBrowseIsNotNull() {
            addCriterion("post_browse is not null");
            return (Criteria) this;
        }

        public Criteria andPostBrowseEqualTo(Integer value) {
            addCriterion("post_browse =", value, "postBrowse");
            return (Criteria) this;
        }

        public Criteria andPostBrowseNotEqualTo(Integer value) {
            addCriterion("post_browse <>", value, "postBrowse");
            return (Criteria) this;
        }

        public Criteria andPostBrowseGreaterThan(Integer value) {
            addCriterion("post_browse >", value, "postBrowse");
            return (Criteria) this;
        }

        public Criteria andPostBrowseGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_browse >=", value, "postBrowse");
            return (Criteria) this;
        }

        public Criteria andPostBrowseLessThan(Integer value) {
            addCriterion("post_browse <", value, "postBrowse");
            return (Criteria) this;
        }

        public Criteria andPostBrowseLessThanOrEqualTo(Integer value) {
            addCriterion("post_browse <=", value, "postBrowse");
            return (Criteria) this;
        }

        public Criteria andPostBrowseIn(List<Integer> values) {
            addCriterion("post_browse in", values, "postBrowse");
            return (Criteria) this;
        }

        public Criteria andPostBrowseNotIn(List<Integer> values) {
            addCriterion("post_browse not in", values, "postBrowse");
            return (Criteria) this;
        }

        public Criteria andPostBrowseBetween(Integer value1, Integer value2) {
            addCriterion("post_browse between", value1, value2, "postBrowse");
            return (Criteria) this;
        }

        public Criteria andPostBrowseNotBetween(Integer value1, Integer value2) {
            addCriterion("post_browse not between", value1, value2, "postBrowse");
            return (Criteria) this;
        }

        public Criteria andPostUsersIdIsNull() {
            addCriterion("post_users_id is null");
            return (Criteria) this;
        }

        public Criteria andPostUsersIdIsNotNull() {
            addCriterion("post_users_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostUsersIdEqualTo(Integer value) {
            addCriterion("post_users_id =", value, "postUsersId");
            return (Criteria) this;
        }

        public Criteria andPostUsersIdNotEqualTo(Integer value) {
            addCriterion("post_users_id <>", value, "postUsersId");
            return (Criteria) this;
        }

        public Criteria andPostUsersIdGreaterThan(Integer value) {
            addCriterion("post_users_id >", value, "postUsersId");
            return (Criteria) this;
        }

        public Criteria andPostUsersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_users_id >=", value, "postUsersId");
            return (Criteria) this;
        }

        public Criteria andPostUsersIdLessThan(Integer value) {
            addCriterion("post_users_id <", value, "postUsersId");
            return (Criteria) this;
        }

        public Criteria andPostUsersIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_users_id <=", value, "postUsersId");
            return (Criteria) this;
        }

        public Criteria andPostUsersIdIn(List<Integer> values) {
            addCriterion("post_users_id in", values, "postUsersId");
            return (Criteria) this;
        }

        public Criteria andPostUsersIdNotIn(List<Integer> values) {
            addCriterion("post_users_id not in", values, "postUsersId");
            return (Criteria) this;
        }

        public Criteria andPostUsersIdBetween(Integer value1, Integer value2) {
            addCriterion("post_users_id between", value1, value2, "postUsersId");
            return (Criteria) this;
        }

        public Criteria andPostUsersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_users_id not between", value1, value2, "postUsersId");
            return (Criteria) this;
        }

        public Criteria andPostLinkIsNull() {
            addCriterion("post_link is null");
            return (Criteria) this;
        }

        public Criteria andPostLinkIsNotNull() {
            addCriterion("post_link is not null");
            return (Criteria) this;
        }

        public Criteria andPostLinkEqualTo(String value) {
            addCriterion("post_link =", value, "postLink");
            return (Criteria) this;
        }

        public Criteria andPostLinkNotEqualTo(String value) {
            addCriterion("post_link <>", value, "postLink");
            return (Criteria) this;
        }

        public Criteria andPostLinkGreaterThan(String value) {
            addCriterion("post_link >", value, "postLink");
            return (Criteria) this;
        }

        public Criteria andPostLinkGreaterThanOrEqualTo(String value) {
            addCriterion("post_link >=", value, "postLink");
            return (Criteria) this;
        }

        public Criteria andPostLinkLessThan(String value) {
            addCriterion("post_link <", value, "postLink");
            return (Criteria) this;
        }

        public Criteria andPostLinkLessThanOrEqualTo(String value) {
            addCriterion("post_link <=", value, "postLink");
            return (Criteria) this;
        }

        public Criteria andPostLinkLike(String value) {
            addCriterion("post_link like", value, "postLink");
            return (Criteria) this;
        }

        public Criteria andPostLinkNotLike(String value) {
            addCriterion("post_link not like", value, "postLink");
            return (Criteria) this;
        }

        public Criteria andPostLinkIn(List<String> values) {
            addCriterion("post_link in", values, "postLink");
            return (Criteria) this;
        }

        public Criteria andPostLinkNotIn(List<String> values) {
            addCriterion("post_link not in", values, "postLink");
            return (Criteria) this;
        }

        public Criteria andPostLinkBetween(String value1, String value2) {
            addCriterion("post_link between", value1, value2, "postLink");
            return (Criteria) this;
        }

        public Criteria andPostLinkNotBetween(String value1, String value2) {
            addCriterion("post_link not between", value1, value2, "postLink");
            return (Criteria) this;
        }

        public Criteria andPostCopyrightIsNull() {
            addCriterion("post_copyright is null");
            return (Criteria) this;
        }

        public Criteria andPostCopyrightIsNotNull() {
            addCriterion("post_copyright is not null");
            return (Criteria) this;
        }

        public Criteria andPostCopyrightEqualTo(String value) {
            addCriterion("post_copyright =", value, "postCopyright");
            return (Criteria) this;
        }

        public Criteria andPostCopyrightNotEqualTo(String value) {
            addCriterion("post_copyright <>", value, "postCopyright");
            return (Criteria) this;
        }

        public Criteria andPostCopyrightGreaterThan(String value) {
            addCriterion("post_copyright >", value, "postCopyright");
            return (Criteria) this;
        }

        public Criteria andPostCopyrightGreaterThanOrEqualTo(String value) {
            addCriterion("post_copyright >=", value, "postCopyright");
            return (Criteria) this;
        }

        public Criteria andPostCopyrightLessThan(String value) {
            addCriterion("post_copyright <", value, "postCopyright");
            return (Criteria) this;
        }

        public Criteria andPostCopyrightLessThanOrEqualTo(String value) {
            addCriterion("post_copyright <=", value, "postCopyright");
            return (Criteria) this;
        }

        public Criteria andPostCopyrightLike(String value) {
            addCriterion("post_copyright like", value, "postCopyright");
            return (Criteria) this;
        }

        public Criteria andPostCopyrightNotLike(String value) {
            addCriterion("post_copyright not like", value, "postCopyright");
            return (Criteria) this;
        }

        public Criteria andPostCopyrightIn(List<String> values) {
            addCriterion("post_copyright in", values, "postCopyright");
            return (Criteria) this;
        }

        public Criteria andPostCopyrightNotIn(List<String> values) {
            addCriterion("post_copyright not in", values, "postCopyright");
            return (Criteria) this;
        }

        public Criteria andPostCopyrightBetween(String value1, String value2) {
            addCriterion("post_copyright between", value1, value2, "postCopyright");
            return (Criteria) this;
        }

        public Criteria andPostCopyrightNotBetween(String value1, String value2) {
            addCriterion("post_copyright not between", value1, value2, "postCopyright");
            return (Criteria) this;
        }

        public Criteria andPostLabel1IdIsNull() {
            addCriterion("post_label1_id is null");
            return (Criteria) this;
        }

        public Criteria andPostLabel1IdIsNotNull() {
            addCriterion("post_label1_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostLabel1IdEqualTo(Integer value) {
            addCriterion("post_label1_id =", value, "postLabel1Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel1IdNotEqualTo(Integer value) {
            addCriterion("post_label1_id <>", value, "postLabel1Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel1IdGreaterThan(Integer value) {
            addCriterion("post_label1_id >", value, "postLabel1Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel1IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_label1_id >=", value, "postLabel1Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel1IdLessThan(Integer value) {
            addCriterion("post_label1_id <", value, "postLabel1Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel1IdLessThanOrEqualTo(Integer value) {
            addCriterion("post_label1_id <=", value, "postLabel1Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel1IdIn(List<Integer> values) {
            addCriterion("post_label1_id in", values, "postLabel1Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel1IdNotIn(List<Integer> values) {
            addCriterion("post_label1_id not in", values, "postLabel1Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel1IdBetween(Integer value1, Integer value2) {
            addCriterion("post_label1_id between", value1, value2, "postLabel1Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel1IdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_label1_id not between", value1, value2, "postLabel1Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel2IdIsNull() {
            addCriterion("post_label2_id is null");
            return (Criteria) this;
        }

        public Criteria andPostLabel2IdIsNotNull() {
            addCriterion("post_label2_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostLabel2IdEqualTo(Integer value) {
            addCriterion("post_label2_id =", value, "postLabel2Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel2IdNotEqualTo(Integer value) {
            addCriterion("post_label2_id <>", value, "postLabel2Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel2IdGreaterThan(Integer value) {
            addCriterion("post_label2_id >", value, "postLabel2Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel2IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_label2_id >=", value, "postLabel2Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel2IdLessThan(Integer value) {
            addCriterion("post_label2_id <", value, "postLabel2Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel2IdLessThanOrEqualTo(Integer value) {
            addCriterion("post_label2_id <=", value, "postLabel2Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel2IdIn(List<Integer> values) {
            addCriterion("post_label2_id in", values, "postLabel2Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel2IdNotIn(List<Integer> values) {
            addCriterion("post_label2_id not in", values, "postLabel2Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel2IdBetween(Integer value1, Integer value2) {
            addCriterion("post_label2_id between", value1, value2, "postLabel2Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel2IdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_label2_id not between", value1, value2, "postLabel2Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel3IdIsNull() {
            addCriterion("post_label3_id is null");
            return (Criteria) this;
        }

        public Criteria andPostLabel3IdIsNotNull() {
            addCriterion("post_label3_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostLabel3IdEqualTo(Integer value) {
            addCriterion("post_label3_id =", value, "postLabel3Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel3IdNotEqualTo(Integer value) {
            addCriterion("post_label3_id <>", value, "postLabel3Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel3IdGreaterThan(Integer value) {
            addCriterion("post_label3_id >", value, "postLabel3Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel3IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_label3_id >=", value, "postLabel3Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel3IdLessThan(Integer value) {
            addCriterion("post_label3_id <", value, "postLabel3Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel3IdLessThanOrEqualTo(Integer value) {
            addCriterion("post_label3_id <=", value, "postLabel3Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel3IdIn(List<Integer> values) {
            addCriterion("post_label3_id in", values, "postLabel3Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel3IdNotIn(List<Integer> values) {
            addCriterion("post_label3_id not in", values, "postLabel3Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel3IdBetween(Integer value1, Integer value2) {
            addCriterion("post_label3_id between", value1, value2, "postLabel3Id");
            return (Criteria) this;
        }

        public Criteria andPostLabel3IdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_label3_id not between", value1, value2, "postLabel3Id");
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