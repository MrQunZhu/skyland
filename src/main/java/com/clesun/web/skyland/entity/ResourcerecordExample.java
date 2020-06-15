package com.clesun.web.skyland.entity;

import java.util.ArrayList;
import java.util.List;

public class ResourcerecordExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    protected int offset = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    protected int limit = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public ResourcerecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public void setOffset(int offset) {
        this.offset=offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public int getOffset() {
        return offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public void setLimit(int limit) {
        this.limit=limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public int getLimit() {
        return limit;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
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

        public void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        public void addCriterion(String condition, Object value, String property) {
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

        public Criteria andBhIsNull() {
            addCriterion("bh is null");
            return (Criteria) this;
        }

        public Criteria andBhIsNotNull() {
            addCriterion("bh is not null");
            return (Criteria) this;
        }

        public Criteria andBhEqualTo(String value) {
            addCriterion("bh =", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotEqualTo(String value) {
            addCriterion("bh <>", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThan(String value) {
            addCriterion("bh >", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThanOrEqualTo(String value) {
            addCriterion("bh >=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThan(String value) {
            addCriterion("bh <", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThanOrEqualTo(String value) {
            addCriterion("bh <=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLike(String value) {
            addCriterion("bh like", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotLike(String value) {
            addCriterion("bh not like", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhIn(List<String> values) {
            addCriterion("bh in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotIn(List<String> values) {
            addCriterion("bh not in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhBetween(String value1, String value2) {
            addCriterion("bh between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotBetween(String value1, String value2) {
            addCriterion("bh not between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andWorkbhIsNull() {
            addCriterion("workbh is null");
            return (Criteria) this;
        }

        public Criteria andWorkbhIsNotNull() {
            addCriterion("workbh is not null");
            return (Criteria) this;
        }

        public Criteria andWorkbhEqualTo(String value) {
            addCriterion("workbh =", value, "workbh");
            return (Criteria) this;
        }

        public Criteria andWorkbhNotEqualTo(String value) {
            addCriterion("workbh <>", value, "workbh");
            return (Criteria) this;
        }

        public Criteria andWorkbhGreaterThan(String value) {
            addCriterion("workbh >", value, "workbh");
            return (Criteria) this;
        }

        public Criteria andWorkbhGreaterThanOrEqualTo(String value) {
            addCriterion("workbh >=", value, "workbh");
            return (Criteria) this;
        }

        public Criteria andWorkbhLessThan(String value) {
            addCriterion("workbh <", value, "workbh");
            return (Criteria) this;
        }

        public Criteria andWorkbhLessThanOrEqualTo(String value) {
            addCriterion("workbh <=", value, "workbh");
            return (Criteria) this;
        }

        public Criteria andWorkbhLike(String value) {
            addCriterion("workbh like", value, "workbh");
            return (Criteria) this;
        }

        public Criteria andWorkbhNotLike(String value) {
            addCriterion("workbh not like", value, "workbh");
            return (Criteria) this;
        }

        public Criteria andWorkbhIn(List<String> values) {
            addCriterion("workbh in", values, "workbh");
            return (Criteria) this;
        }

        public Criteria andWorkbhNotIn(List<String> values) {
            addCriterion("workbh not in", values, "workbh");
            return (Criteria) this;
        }

        public Criteria andWorkbhBetween(String value1, String value2) {
            addCriterion("workbh between", value1, value2, "workbh");
            return (Criteria) this;
        }

        public Criteria andWorkbhNotBetween(String value1, String value2) {
            addCriterion("workbh not between", value1, value2, "workbh");
            return (Criteria) this;
        }

        public Criteria andResourcebhIsNull() {
            addCriterion("resourcebh is null");
            return (Criteria) this;
        }

        public Criteria andResourcebhIsNotNull() {
            addCriterion("resourcebh is not null");
            return (Criteria) this;
        }

        public Criteria andResourcebhEqualTo(String value) {
            addCriterion("resourcebh =", value, "resourcebh");
            return (Criteria) this;
        }

        public Criteria andResourcebhNotEqualTo(String value) {
            addCriterion("resourcebh <>", value, "resourcebh");
            return (Criteria) this;
        }

        public Criteria andResourcebhGreaterThan(String value) {
            addCriterion("resourcebh >", value, "resourcebh");
            return (Criteria) this;
        }

        public Criteria andResourcebhGreaterThanOrEqualTo(String value) {
            addCriterion("resourcebh >=", value, "resourcebh");
            return (Criteria) this;
        }

        public Criteria andResourcebhLessThan(String value) {
            addCriterion("resourcebh <", value, "resourcebh");
            return (Criteria) this;
        }

        public Criteria andResourcebhLessThanOrEqualTo(String value) {
            addCriterion("resourcebh <=", value, "resourcebh");
            return (Criteria) this;
        }

        public Criteria andResourcebhLike(String value) {
            addCriterion("resourcebh like", value, "resourcebh");
            return (Criteria) this;
        }

        public Criteria andResourcebhNotLike(String value) {
            addCriterion("resourcebh not like", value, "resourcebh");
            return (Criteria) this;
        }

        public Criteria andResourcebhIn(List<String> values) {
            addCriterion("resourcebh in", values, "resourcebh");
            return (Criteria) this;
        }

        public Criteria andResourcebhNotIn(List<String> values) {
            addCriterion("resourcebh not in", values, "resourcebh");
            return (Criteria) this;
        }

        public Criteria andResourcebhBetween(String value1, String value2) {
            addCriterion("resourcebh between", value1, value2, "resourcebh");
            return (Criteria) this;
        }

        public Criteria andResourcebhNotBetween(String value1, String value2) {
            addCriterion("resourcebh not between", value1, value2, "resourcebh");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("amount like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("amount not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated do_not_delete_during_merge Fri Jan 18 14:46:02 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
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