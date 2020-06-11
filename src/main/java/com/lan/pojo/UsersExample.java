package com.lan.pojo;

import java.util.ArrayList;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUsersNameIsNull() {
            addCriterion("users_name is null");
            return (Criteria) this;
        }

        public Criteria andUsersNameIsNotNull() {
            addCriterion("users_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsersNameEqualTo(String value) {
            addCriterion("users_name =", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotEqualTo(String value) {
            addCriterion("users_name <>", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameGreaterThan(String value) {
            addCriterion("users_name >", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameGreaterThanOrEqualTo(String value) {
            addCriterion("users_name >=", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameLessThan(String value) {
            addCriterion("users_name <", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameLessThanOrEqualTo(String value) {
            addCriterion("users_name <=", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameLike(String value) {
            addCriterion("users_name like", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotLike(String value) {
            addCriterion("users_name not like", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameIn(List<String> values) {
            addCriterion("users_name in", values, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotIn(List<String> values) {
            addCriterion("users_name not in", values, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameBetween(String value1, String value2) {
            addCriterion("users_name between", value1, value2, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotBetween(String value1, String value2) {
            addCriterion("users_name not between", value1, value2, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordIsNull() {
            addCriterion("users_password is null");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordIsNotNull() {
            addCriterion("users_password is not null");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordEqualTo(String value) {
            addCriterion("users_password =", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordNotEqualTo(String value) {
            addCriterion("users_password <>", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordGreaterThan(String value) {
            addCriterion("users_password >", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("users_password >=", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordLessThan(String value) {
            addCriterion("users_password <", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordLessThanOrEqualTo(String value) {
            addCriterion("users_password <=", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordLike(String value) {
            addCriterion("users_password like", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordNotLike(String value) {
            addCriterion("users_password not like", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordIn(List<String> values) {
            addCriterion("users_password in", values, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordNotIn(List<String> values) {
            addCriterion("users_password not in", values, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordBetween(String value1, String value2) {
            addCriterion("users_password between", value1, value2, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordNotBetween(String value1, String value2) {
            addCriterion("users_password not between", value1, value2, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersHeadimgIsNull() {
            addCriterion("users_headimg is null");
            return (Criteria) this;
        }

        public Criteria andUsersHeadimgIsNotNull() {
            addCriterion("users_headimg is not null");
            return (Criteria) this;
        }

        public Criteria andUsersHeadimgEqualTo(String value) {
            addCriterion("users_headimg =", value, "usersHeadimg");
            return (Criteria) this;
        }

        public Criteria andUsersHeadimgNotEqualTo(String value) {
            addCriterion("users_headimg <>", value, "usersHeadimg");
            return (Criteria) this;
        }

        public Criteria andUsersHeadimgGreaterThan(String value) {
            addCriterion("users_headimg >", value, "usersHeadimg");
            return (Criteria) this;
        }

        public Criteria andUsersHeadimgGreaterThanOrEqualTo(String value) {
            addCriterion("users_headimg >=", value, "usersHeadimg");
            return (Criteria) this;
        }

        public Criteria andUsersHeadimgLessThan(String value) {
            addCriterion("users_headimg <", value, "usersHeadimg");
            return (Criteria) this;
        }

        public Criteria andUsersHeadimgLessThanOrEqualTo(String value) {
            addCriterion("users_headimg <=", value, "usersHeadimg");
            return (Criteria) this;
        }

        public Criteria andUsersHeadimgLike(String value) {
            addCriterion("users_headimg like", value, "usersHeadimg");
            return (Criteria) this;
        }

        public Criteria andUsersHeadimgNotLike(String value) {
            addCriterion("users_headimg not like", value, "usersHeadimg");
            return (Criteria) this;
        }

        public Criteria andUsersHeadimgIn(List<String> values) {
            addCriterion("users_headimg in", values, "usersHeadimg");
            return (Criteria) this;
        }

        public Criteria andUsersHeadimgNotIn(List<String> values) {
            addCriterion("users_headimg not in", values, "usersHeadimg");
            return (Criteria) this;
        }

        public Criteria andUsersHeadimgBetween(String value1, String value2) {
            addCriterion("users_headimg between", value1, value2, "usersHeadimg");
            return (Criteria) this;
        }

        public Criteria andUsersHeadimgNotBetween(String value1, String value2) {
            addCriterion("users_headimg not between", value1, value2, "usersHeadimg");
            return (Criteria) this;
        }

        public Criteria andUsersSignatureIsNull() {
            addCriterion("users_signature is null");
            return (Criteria) this;
        }

        public Criteria andUsersSignatureIsNotNull() {
            addCriterion("users_signature is not null");
            return (Criteria) this;
        }

        public Criteria andUsersSignatureEqualTo(String value) {
            addCriterion("users_signature =", value, "usersSignature");
            return (Criteria) this;
        }

        public Criteria andUsersSignatureNotEqualTo(String value) {
            addCriterion("users_signature <>", value, "usersSignature");
            return (Criteria) this;
        }

        public Criteria andUsersSignatureGreaterThan(String value) {
            addCriterion("users_signature >", value, "usersSignature");
            return (Criteria) this;
        }

        public Criteria andUsersSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("users_signature >=", value, "usersSignature");
            return (Criteria) this;
        }

        public Criteria andUsersSignatureLessThan(String value) {
            addCriterion("users_signature <", value, "usersSignature");
            return (Criteria) this;
        }

        public Criteria andUsersSignatureLessThanOrEqualTo(String value) {
            addCriterion("users_signature <=", value, "usersSignature");
            return (Criteria) this;
        }

        public Criteria andUsersSignatureLike(String value) {
            addCriterion("users_signature like", value, "usersSignature");
            return (Criteria) this;
        }

        public Criteria andUsersSignatureNotLike(String value) {
            addCriterion("users_signature not like", value, "usersSignature");
            return (Criteria) this;
        }

        public Criteria andUsersSignatureIn(List<String> values) {
            addCriterion("users_signature in", values, "usersSignature");
            return (Criteria) this;
        }

        public Criteria andUsersSignatureNotIn(List<String> values) {
            addCriterion("users_signature not in", values, "usersSignature");
            return (Criteria) this;
        }

        public Criteria andUsersSignatureBetween(String value1, String value2) {
            addCriterion("users_signature between", value1, value2, "usersSignature");
            return (Criteria) this;
        }

        public Criteria andUsersSignatureNotBetween(String value1, String value2) {
            addCriterion("users_signature not between", value1, value2, "usersSignature");
            return (Criteria) this;
        }

        public Criteria andUsersSexIsNull() {
            addCriterion("users_sex is null");
            return (Criteria) this;
        }

        public Criteria andUsersSexIsNotNull() {
            addCriterion("users_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUsersSexEqualTo(String value) {
            addCriterion("users_sex =", value, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexNotEqualTo(String value) {
            addCriterion("users_sex <>", value, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexGreaterThan(String value) {
            addCriterion("users_sex >", value, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexGreaterThanOrEqualTo(String value) {
            addCriterion("users_sex >=", value, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexLessThan(String value) {
            addCriterion("users_sex <", value, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexLessThanOrEqualTo(String value) {
            addCriterion("users_sex <=", value, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexLike(String value) {
            addCriterion("users_sex like", value, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexNotLike(String value) {
            addCriterion("users_sex not like", value, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexIn(List<String> values) {
            addCriterion("users_sex in", values, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexNotIn(List<String> values) {
            addCriterion("users_sex not in", values, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexBetween(String value1, String value2) {
            addCriterion("users_sex between", value1, value2, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersSexNotBetween(String value1, String value2) {
            addCriterion("users_sex not between", value1, value2, "usersSex");
            return (Criteria) this;
        }

        public Criteria andUsersGithubLinkIsNull() {
            addCriterion("users_github_link is null");
            return (Criteria) this;
        }

        public Criteria andUsersGithubLinkIsNotNull() {
            addCriterion("users_github_link is not null");
            return (Criteria) this;
        }

        public Criteria andUsersGithubLinkEqualTo(String value) {
            addCriterion("users_github_link =", value, "usersGithubLink");
            return (Criteria) this;
        }

        public Criteria andUsersGithubLinkNotEqualTo(String value) {
            addCriterion("users_github_link <>", value, "usersGithubLink");
            return (Criteria) this;
        }

        public Criteria andUsersGithubLinkGreaterThan(String value) {
            addCriterion("users_github_link >", value, "usersGithubLink");
            return (Criteria) this;
        }

        public Criteria andUsersGithubLinkGreaterThanOrEqualTo(String value) {
            addCriterion("users_github_link >=", value, "usersGithubLink");
            return (Criteria) this;
        }

        public Criteria andUsersGithubLinkLessThan(String value) {
            addCriterion("users_github_link <", value, "usersGithubLink");
            return (Criteria) this;
        }

        public Criteria andUsersGithubLinkLessThanOrEqualTo(String value) {
            addCriterion("users_github_link <=", value, "usersGithubLink");
            return (Criteria) this;
        }

        public Criteria andUsersGithubLinkLike(String value) {
            addCriterion("users_github_link like", value, "usersGithubLink");
            return (Criteria) this;
        }

        public Criteria andUsersGithubLinkNotLike(String value) {
            addCriterion("users_github_link not like", value, "usersGithubLink");
            return (Criteria) this;
        }

        public Criteria andUsersGithubLinkIn(List<String> values) {
            addCriterion("users_github_link in", values, "usersGithubLink");
            return (Criteria) this;
        }

        public Criteria andUsersGithubLinkNotIn(List<String> values) {
            addCriterion("users_github_link not in", values, "usersGithubLink");
            return (Criteria) this;
        }

        public Criteria andUsersGithubLinkBetween(String value1, String value2) {
            addCriterion("users_github_link between", value1, value2, "usersGithubLink");
            return (Criteria) this;
        }

        public Criteria andUsersGithubLinkNotBetween(String value1, String value2) {
            addCriterion("users_github_link not between", value1, value2, "usersGithubLink");
            return (Criteria) this;
        }

        public Criteria andUsersQqIsNull() {
            addCriterion("users_qq is null");
            return (Criteria) this;
        }

        public Criteria andUsersQqIsNotNull() {
            addCriterion("users_qq is not null");
            return (Criteria) this;
        }

        public Criteria andUsersQqEqualTo(String value) {
            addCriterion("users_qq =", value, "usersQq");
            return (Criteria) this;
        }

        public Criteria andUsersQqNotEqualTo(String value) {
            addCriterion("users_qq <>", value, "usersQq");
            return (Criteria) this;
        }

        public Criteria andUsersQqGreaterThan(String value) {
            addCriterion("users_qq >", value, "usersQq");
            return (Criteria) this;
        }

        public Criteria andUsersQqGreaterThanOrEqualTo(String value) {
            addCriterion("users_qq >=", value, "usersQq");
            return (Criteria) this;
        }

        public Criteria andUsersQqLessThan(String value) {
            addCriterion("users_qq <", value, "usersQq");
            return (Criteria) this;
        }

        public Criteria andUsersQqLessThanOrEqualTo(String value) {
            addCriterion("users_qq <=", value, "usersQq");
            return (Criteria) this;
        }

        public Criteria andUsersQqLike(String value) {
            addCriterion("users_qq like", value, "usersQq");
            return (Criteria) this;
        }

        public Criteria andUsersQqNotLike(String value) {
            addCriterion("users_qq not like", value, "usersQq");
            return (Criteria) this;
        }

        public Criteria andUsersQqIn(List<String> values) {
            addCriterion("users_qq in", values, "usersQq");
            return (Criteria) this;
        }

        public Criteria andUsersQqNotIn(List<String> values) {
            addCriterion("users_qq not in", values, "usersQq");
            return (Criteria) this;
        }

        public Criteria andUsersQqBetween(String value1, String value2) {
            addCriterion("users_qq between", value1, value2, "usersQq");
            return (Criteria) this;
        }

        public Criteria andUsersQqNotBetween(String value1, String value2) {
            addCriterion("users_qq not between", value1, value2, "usersQq");
            return (Criteria) this;
        }

        public Criteria andSuersEmailIsNull() {
            addCriterion("suers_email is null");
            return (Criteria) this;
        }

        public Criteria andSuersEmailIsNotNull() {
            addCriterion("suers_email is not null");
            return (Criteria) this;
        }

        public Criteria andSuersEmailEqualTo(String value) {
            addCriterion("suers_email =", value, "suersEmail");
            return (Criteria) this;
        }

        public Criteria andSuersEmailNotEqualTo(String value) {
            addCriterion("suers_email <>", value, "suersEmail");
            return (Criteria) this;
        }

        public Criteria andSuersEmailGreaterThan(String value) {
            addCriterion("suers_email >", value, "suersEmail");
            return (Criteria) this;
        }

        public Criteria andSuersEmailGreaterThanOrEqualTo(String value) {
            addCriterion("suers_email >=", value, "suersEmail");
            return (Criteria) this;
        }

        public Criteria andSuersEmailLessThan(String value) {
            addCriterion("suers_email <", value, "suersEmail");
            return (Criteria) this;
        }

        public Criteria andSuersEmailLessThanOrEqualTo(String value) {
            addCriterion("suers_email <=", value, "suersEmail");
            return (Criteria) this;
        }

        public Criteria andSuersEmailLike(String value) {
            addCriterion("suers_email like", value, "suersEmail");
            return (Criteria) this;
        }

        public Criteria andSuersEmailNotLike(String value) {
            addCriterion("suers_email not like", value, "suersEmail");
            return (Criteria) this;
        }

        public Criteria andSuersEmailIn(List<String> values) {
            addCriterion("suers_email in", values, "suersEmail");
            return (Criteria) this;
        }

        public Criteria andSuersEmailNotIn(List<String> values) {
            addCriterion("suers_email not in", values, "suersEmail");
            return (Criteria) this;
        }

        public Criteria andSuersEmailBetween(String value1, String value2) {
            addCriterion("suers_email between", value1, value2, "suersEmail");
            return (Criteria) this;
        }

        public Criteria andSuersEmailNotBetween(String value1, String value2) {
            addCriterion("suers_email not between", value1, value2, "suersEmail");
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