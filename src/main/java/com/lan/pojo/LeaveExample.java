package com.lan.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaveExample() {
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

        public Criteria andLeaveIdIsNull() {
            addCriterion("leave_id is null");
            return (Criteria) this;
        }

        public Criteria andLeaveIdIsNotNull() {
            addCriterion("leave_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveIdEqualTo(Integer value) {
            addCriterion("leave_id =", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotEqualTo(Integer value) {
            addCriterion("leave_id <>", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdGreaterThan(Integer value) {
            addCriterion("leave_id >", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_id >=", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdLessThan(Integer value) {
            addCriterion("leave_id <", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdLessThanOrEqualTo(Integer value) {
            addCriterion("leave_id <=", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdIn(List<Integer> values) {
            addCriterion("leave_id in", values, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotIn(List<Integer> values) {
            addCriterion("leave_id not in", values, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdBetween(Integer value1, Integer value2) {
            addCriterion("leave_id between", value1, value2, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("leave_id not between", value1, value2, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeavePidIsNull() {
            addCriterion("leave_pid is null");
            return (Criteria) this;
        }

        public Criteria andLeavePidIsNotNull() {
            addCriterion("leave_pid is not null");
            return (Criteria) this;
        }

        public Criteria andLeavePidEqualTo(Integer value) {
            addCriterion("leave_pid =", value, "leavePid");
            return (Criteria) this;
        }

        public Criteria andLeavePidNotEqualTo(Integer value) {
            addCriterion("leave_pid <>", value, "leavePid");
            return (Criteria) this;
        }

        public Criteria andLeavePidGreaterThan(Integer value) {
            addCriterion("leave_pid >", value, "leavePid");
            return (Criteria) this;
        }

        public Criteria andLeavePidGreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_pid >=", value, "leavePid");
            return (Criteria) this;
        }

        public Criteria andLeavePidLessThan(Integer value) {
            addCriterion("leave_pid <", value, "leavePid");
            return (Criteria) this;
        }

        public Criteria andLeavePidLessThanOrEqualTo(Integer value) {
            addCriterion("leave_pid <=", value, "leavePid");
            return (Criteria) this;
        }

        public Criteria andLeavePidIn(List<Integer> values) {
            addCriterion("leave_pid in", values, "leavePid");
            return (Criteria) this;
        }

        public Criteria andLeavePidNotIn(List<Integer> values) {
            addCriterion("leave_pid not in", values, "leavePid");
            return (Criteria) this;
        }

        public Criteria andLeavePidBetween(Integer value1, Integer value2) {
            addCriterion("leave_pid between", value1, value2, "leavePid");
            return (Criteria) this;
        }

        public Criteria andLeavePidNotBetween(Integer value1, Integer value2) {
            addCriterion("leave_pid not between", value1, value2, "leavePid");
            return (Criteria) this;
        }

        public Criteria andLeaveUsernameIsNull() {
            addCriterion("leave_username is null");
            return (Criteria) this;
        }

        public Criteria andLeaveUsernameIsNotNull() {
            addCriterion("leave_username is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveUsernameEqualTo(String value) {
            addCriterion("leave_username =", value, "leaveUsername");
            return (Criteria) this;
        }

        public Criteria andLeaveUsernameNotEqualTo(String value) {
            addCriterion("leave_username <>", value, "leaveUsername");
            return (Criteria) this;
        }

        public Criteria andLeaveUsernameGreaterThan(String value) {
            addCriterion("leave_username >", value, "leaveUsername");
            return (Criteria) this;
        }

        public Criteria andLeaveUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("leave_username >=", value, "leaveUsername");
            return (Criteria) this;
        }

        public Criteria andLeaveUsernameLessThan(String value) {
            addCriterion("leave_username <", value, "leaveUsername");
            return (Criteria) this;
        }

        public Criteria andLeaveUsernameLessThanOrEqualTo(String value) {
            addCriterion("leave_username <=", value, "leaveUsername");
            return (Criteria) this;
        }

        public Criteria andLeaveUsernameLike(String value) {
            addCriterion("leave_username like", value, "leaveUsername");
            return (Criteria) this;
        }

        public Criteria andLeaveUsernameNotLike(String value) {
            addCriterion("leave_username not like", value, "leaveUsername");
            return (Criteria) this;
        }

        public Criteria andLeaveUsernameIn(List<String> values) {
            addCriterion("leave_username in", values, "leaveUsername");
            return (Criteria) this;
        }

        public Criteria andLeaveUsernameNotIn(List<String> values) {
            addCriterion("leave_username not in", values, "leaveUsername");
            return (Criteria) this;
        }

        public Criteria andLeaveUsernameBetween(String value1, String value2) {
            addCriterion("leave_username between", value1, value2, "leaveUsername");
            return (Criteria) this;
        }

        public Criteria andLeaveUsernameNotBetween(String value1, String value2) {
            addCriterion("leave_username not between", value1, value2, "leaveUsername");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("leave_time is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("leave_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(Date value) {
            addCriterion("leave_time =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(Date value) {
            addCriterion("leave_time <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(Date value) {
            addCriterion("leave_time >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("leave_time >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(Date value) {
            addCriterion("leave_time <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(Date value) {
            addCriterion("leave_time <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<Date> values) {
            addCriterion("leave_time in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<Date> values) {
            addCriterion("leave_time not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(Date value1, Date value2) {
            addCriterion("leave_time between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(Date value1, Date value2) {
            addCriterion("leave_time not between", value1, value2, "leaveTime");
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