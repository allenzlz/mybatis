package org.allen.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuidIsNull() {
            addCriterion("STUID is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("STUID is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(Short value) {
            addCriterion("STUID =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(Short value) {
            addCriterion("STUID <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(Short value) {
            addCriterion("STUID >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(Short value) {
            addCriterion("STUID >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(Short value) {
            addCriterion("STUID <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(Short value) {
            addCriterion("STUID <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<Short> values) {
            addCriterion("STUID in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<Short> values) {
            addCriterion("STUID not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(Short value1, Short value2) {
            addCriterion("STUID between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(Short value1, Short value2) {
            addCriterion("STUID not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStunameIsNull() {
            addCriterion("STUNAME is null");
            return (Criteria) this;
        }

        public Criteria andStunameIsNotNull() {
            addCriterion("STUNAME is not null");
            return (Criteria) this;
        }

        public Criteria andStunameEqualTo(String value) {
            addCriterion("STUNAME =", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotEqualTo(String value) {
            addCriterion("STUNAME <>", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThan(String value) {
            addCriterion("STUNAME >", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThanOrEqualTo(String value) {
            addCriterion("STUNAME >=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThan(String value) {
            addCriterion("STUNAME <", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThanOrEqualTo(String value) {
            addCriterion("STUNAME <=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLike(String value) {
            addCriterion("STUNAME like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotLike(String value) {
            addCriterion("STUNAME not like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameIn(List<String> values) {
            addCriterion("STUNAME in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotIn(List<String> values) {
            addCriterion("STUNAME not in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameBetween(String value1, String value2) {
            addCriterion("STUNAME between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotBetween(String value1, String value2) {
            addCriterion("STUNAME not between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStuageIsNull() {
            addCriterion("STUAGE is null");
            return (Criteria) this;
        }

        public Criteria andStuageIsNotNull() {
            addCriterion("STUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andStuageEqualTo(Short value) {
            addCriterion("STUAGE =", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageNotEqualTo(Short value) {
            addCriterion("STUAGE <>", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageGreaterThan(Short value) {
            addCriterion("STUAGE >", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageGreaterThanOrEqualTo(Short value) {
            addCriterion("STUAGE >=", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageLessThan(Short value) {
            addCriterion("STUAGE <", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageLessThanOrEqualTo(Short value) {
            addCriterion("STUAGE <=", value, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageIn(List<Short> values) {
            addCriterion("STUAGE in", values, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageNotIn(List<Short> values) {
            addCriterion("STUAGE not in", values, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageBetween(Short value1, Short value2) {
            addCriterion("STUAGE between", value1, value2, "stuage");
            return (Criteria) this;
        }

        public Criteria andStuageNotBetween(Short value1, Short value2) {
            addCriterion("STUAGE not between", value1, value2, "stuage");
            return (Criteria) this;
        }

        public Criteria andGranameIsNull() {
            addCriterion("GRANAME is null");
            return (Criteria) this;
        }

        public Criteria andGranameIsNotNull() {
            addCriterion("GRANAME is not null");
            return (Criteria) this;
        }

        public Criteria andGranameEqualTo(String value) {
            addCriterion("GRANAME =", value, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameNotEqualTo(String value) {
            addCriterion("GRANAME <>", value, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameGreaterThan(String value) {
            addCriterion("GRANAME >", value, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameGreaterThanOrEqualTo(String value) {
            addCriterion("GRANAME >=", value, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameLessThan(String value) {
            addCriterion("GRANAME <", value, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameLessThanOrEqualTo(String value) {
            addCriterion("GRANAME <=", value, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameLike(String value) {
            addCriterion("GRANAME like", value, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameNotLike(String value) {
            addCriterion("GRANAME not like", value, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameIn(List<String> values) {
            addCriterion("GRANAME in", values, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameNotIn(List<String> values) {
            addCriterion("GRANAME not in", values, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameBetween(String value1, String value2) {
            addCriterion("GRANAME between", value1, value2, "graname");
            return (Criteria) this;
        }

        public Criteria andGranameNotBetween(String value1, String value2) {
            addCriterion("GRANAME not between", value1, value2, "graname");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNull() {
            addCriterion("HOMEADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNotNull() {
            addCriterion("HOMEADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressEqualTo(String value) {
            addCriterion("HOMEADDRESS =", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotEqualTo(String value) {
            addCriterion("HOMEADDRESS <>", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThan(String value) {
            addCriterion("HOMEADDRESS >", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThanOrEqualTo(String value) {
            addCriterion("HOMEADDRESS >=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThan(String value) {
            addCriterion("HOMEADDRESS <", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThanOrEqualTo(String value) {
            addCriterion("HOMEADDRESS <=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLike(String value) {
            addCriterion("HOMEADDRESS like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotLike(String value) {
            addCriterion("HOMEADDRESS not like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIn(List<String> values) {
            addCriterion("HOMEADDRESS in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotIn(List<String> values) {
            addCriterion("HOMEADDRESS not in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressBetween(String value1, String value2) {
            addCriterion("HOMEADDRESS between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotBetween(String value1, String value2) {
            addCriterion("HOMEADDRESS not between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressIsNull() {
            addCriterion("SCHOOLADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andSchooladdressIsNotNull() {
            addCriterion("SCHOOLADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andSchooladdressEqualTo(String value) {
            addCriterion("SCHOOLADDRESS =", value, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressNotEqualTo(String value) {
            addCriterion("SCHOOLADDRESS <>", value, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressGreaterThan(String value) {
            addCriterion("SCHOOLADDRESS >", value, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOLADDRESS >=", value, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressLessThan(String value) {
            addCriterion("SCHOOLADDRESS <", value, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressLessThanOrEqualTo(String value) {
            addCriterion("SCHOOLADDRESS <=", value, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressLike(String value) {
            addCriterion("SCHOOLADDRESS like", value, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressNotLike(String value) {
            addCriterion("SCHOOLADDRESS not like", value, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressIn(List<String> values) {
            addCriterion("SCHOOLADDRESS in", values, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressNotIn(List<String> values) {
            addCriterion("SCHOOLADDRESS not in", values, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressBetween(String value1, String value2) {
            addCriterion("SCHOOLADDRESS between", value1, value2, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andSchooladdressNotBetween(String value1, String value2) {
            addCriterion("SCHOOLADDRESS not between", value1, value2, "schooladdress");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("CLASSID is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("CLASSID is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(BigDecimal value) {
            addCriterion("CLASSID =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(BigDecimal value) {
            addCriterion("CLASSID <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(BigDecimal value) {
            addCriterion("CLASSID >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLASSID >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(BigDecimal value) {
            addCriterion("CLASSID <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLASSID <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<BigDecimal> values) {
            addCriterion("CLASSID in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<BigDecimal> values) {
            addCriterion("CLASSID not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLASSID between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLASSID not between", value1, value2, "classid");
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