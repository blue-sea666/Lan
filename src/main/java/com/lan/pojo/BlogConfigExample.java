package com.lan.pojo;

import java.util.ArrayList;
import java.util.List;

public class BlogConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogConfigExample() {
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

        public Criteria andConfigIdIsNull() {
            addCriterion("config_id is null");
            return (Criteria) this;
        }

        public Criteria andConfigIdIsNotNull() {
            addCriterion("config_id is not null");
            return (Criteria) this;
        }

        public Criteria andConfigIdEqualTo(Integer value) {
            addCriterion("config_id =", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotEqualTo(Integer value) {
            addCriterion("config_id <>", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThan(Integer value) {
            addCriterion("config_id >", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("config_id >=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThan(Integer value) {
            addCriterion("config_id <", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThanOrEqualTo(Integer value) {
            addCriterion("config_id <=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdIn(List<Integer> values) {
            addCriterion("config_id in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotIn(List<Integer> values) {
            addCriterion("config_id not in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdBetween(Integer value1, Integer value2) {
            addCriterion("config_id between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotBetween(Integer value1, Integer value2) {
            addCriterion("config_id not between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigNameIsNull() {
            addCriterion("config_name is null");
            return (Criteria) this;
        }

        public Criteria andConfigNameIsNotNull() {
            addCriterion("config_name is not null");
            return (Criteria) this;
        }

        public Criteria andConfigNameEqualTo(String value) {
            addCriterion("config_name =", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotEqualTo(String value) {
            addCriterion("config_name <>", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameGreaterThan(String value) {
            addCriterion("config_name >", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameGreaterThanOrEqualTo(String value) {
            addCriterion("config_name >=", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLessThan(String value) {
            addCriterion("config_name <", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLessThanOrEqualTo(String value) {
            addCriterion("config_name <=", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLike(String value) {
            addCriterion("config_name like", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotLike(String value) {
            addCriterion("config_name not like", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameIn(List<String> values) {
            addCriterion("config_name in", values, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotIn(List<String> values) {
            addCriterion("config_name not in", values, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameBetween(String value1, String value2) {
            addCriterion("config_name between", value1, value2, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotBetween(String value1, String value2) {
            addCriterion("config_name not between", value1, value2, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigCopyrightIsNull() {
            addCriterion("config_copyright is null");
            return (Criteria) this;
        }

        public Criteria andConfigCopyrightIsNotNull() {
            addCriterion("config_copyright is not null");
            return (Criteria) this;
        }

        public Criteria andConfigCopyrightEqualTo(String value) {
            addCriterion("config_copyright =", value, "configCopyright");
            return (Criteria) this;
        }

        public Criteria andConfigCopyrightNotEqualTo(String value) {
            addCriterion("config_copyright <>", value, "configCopyright");
            return (Criteria) this;
        }

        public Criteria andConfigCopyrightGreaterThan(String value) {
            addCriterion("config_copyright >", value, "configCopyright");
            return (Criteria) this;
        }

        public Criteria andConfigCopyrightGreaterThanOrEqualTo(String value) {
            addCriterion("config_copyright >=", value, "configCopyright");
            return (Criteria) this;
        }

        public Criteria andConfigCopyrightLessThan(String value) {
            addCriterion("config_copyright <", value, "configCopyright");
            return (Criteria) this;
        }

        public Criteria andConfigCopyrightLessThanOrEqualTo(String value) {
            addCriterion("config_copyright <=", value, "configCopyright");
            return (Criteria) this;
        }

        public Criteria andConfigCopyrightLike(String value) {
            addCriterion("config_copyright like", value, "configCopyright");
            return (Criteria) this;
        }

        public Criteria andConfigCopyrightNotLike(String value) {
            addCriterion("config_copyright not like", value, "configCopyright");
            return (Criteria) this;
        }

        public Criteria andConfigCopyrightIn(List<String> values) {
            addCriterion("config_copyright in", values, "configCopyright");
            return (Criteria) this;
        }

        public Criteria andConfigCopyrightNotIn(List<String> values) {
            addCriterion("config_copyright not in", values, "configCopyright");
            return (Criteria) this;
        }

        public Criteria andConfigCopyrightBetween(String value1, String value2) {
            addCriterion("config_copyright between", value1, value2, "configCopyright");
            return (Criteria) this;
        }

        public Criteria andConfigCopyrightNotBetween(String value1, String value2) {
            addCriterion("config_copyright not between", value1, value2, "configCopyright");
            return (Criteria) this;
        }

        public Criteria andConfigIpcIsNull() {
            addCriterion("config_ipc is null");
            return (Criteria) this;
        }

        public Criteria andConfigIpcIsNotNull() {
            addCriterion("config_ipc is not null");
            return (Criteria) this;
        }

        public Criteria andConfigIpcEqualTo(String value) {
            addCriterion("config_ipc =", value, "configIpc");
            return (Criteria) this;
        }

        public Criteria andConfigIpcNotEqualTo(String value) {
            addCriterion("config_ipc <>", value, "configIpc");
            return (Criteria) this;
        }

        public Criteria andConfigIpcGreaterThan(String value) {
            addCriterion("config_ipc >", value, "configIpc");
            return (Criteria) this;
        }

        public Criteria andConfigIpcGreaterThanOrEqualTo(String value) {
            addCriterion("config_ipc >=", value, "configIpc");
            return (Criteria) this;
        }

        public Criteria andConfigIpcLessThan(String value) {
            addCriterion("config_ipc <", value, "configIpc");
            return (Criteria) this;
        }

        public Criteria andConfigIpcLessThanOrEqualTo(String value) {
            addCriterion("config_ipc <=", value, "configIpc");
            return (Criteria) this;
        }

        public Criteria andConfigIpcLike(String value) {
            addCriterion("config_ipc like", value, "configIpc");
            return (Criteria) this;
        }

        public Criteria andConfigIpcNotLike(String value) {
            addCriterion("config_ipc not like", value, "configIpc");
            return (Criteria) this;
        }

        public Criteria andConfigIpcIn(List<String> values) {
            addCriterion("config_ipc in", values, "configIpc");
            return (Criteria) this;
        }

        public Criteria andConfigIpcNotIn(List<String> values) {
            addCriterion("config_ipc not in", values, "configIpc");
            return (Criteria) this;
        }

        public Criteria andConfigIpcBetween(String value1, String value2) {
            addCriterion("config_ipc between", value1, value2, "configIpc");
            return (Criteria) this;
        }

        public Criteria andConfigIpcNotBetween(String value1, String value2) {
            addCriterion("config_ipc not between", value1, value2, "configIpc");
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