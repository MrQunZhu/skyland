package com.clesun.web.skyland.entity;

import java.util.ArrayList;
import java.util.List;

public class FarmresourceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FARMRESOURCE
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FARMRESOURCE
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FARMRESOURCE
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FARMRESOURCE
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    protected int offset = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FARMRESOURCE
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    protected int limit = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FARMRESOURCE
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public FarmresourceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FARMRESOURCE
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FARMRESOURCE
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FARMRESOURCE
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FARMRESOURCE
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FARMRESOURCE
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FARMRESOURCE
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FARMRESOURCE
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
     * This method corresponds to the database table FARMRESOURCE
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
     * This method corresponds to the database table FARMRESOURCE
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FARMRESOURCE
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
     * This method corresponds to the database table FARMRESOURCE
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public void setOffset(int offset) {
        this.offset=offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FARMRESOURCE
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public int getOffset() {
        return offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FARMRESOURCE
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public void setLimit(int limit) {
        this.limit=limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FARMRESOURCE
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    public int getLimit() {
        return limit;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FARMRESOURCE
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMcIsNull() {
            addCriterion("mc is null");
            return (Criteria) this;
        }

        public Criteria andMcIsNotNull() {
            addCriterion("mc is not null");
            return (Criteria) this;
        }

        public Criteria andMcEqualTo(String value) {
            addCriterion("mc =", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotEqualTo(String value) {
            addCriterion("mc <>", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThan(String value) {
            addCriterion("mc >", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThanOrEqualTo(String value) {
            addCriterion("mc >=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThan(String value) {
            addCriterion("mc <", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThanOrEqualTo(String value) {
            addCriterion("mc <=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLike(String value) {
            addCriterion("mc like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotLike(String value) {
            addCriterion("mc not like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcIn(List<String> values) {
            addCriterion("mc in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotIn(List<String> values) {
            addCriterion("mc not in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcBetween(String value1, String value2) {
            addCriterion("mc between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotBetween(String value1, String value2) {
            addCriterion("mc not between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andSccsIsNull() {
            addCriterion("sccs is null");
            return (Criteria) this;
        }

        public Criteria andSccsIsNotNull() {
            addCriterion("sccs is not null");
            return (Criteria) this;
        }

        public Criteria andSccsEqualTo(String value) {
            addCriterion("sccs =", value, "sccs");
            return (Criteria) this;
        }

        public Criteria andSccsNotEqualTo(String value) {
            addCriterion("sccs <>", value, "sccs");
            return (Criteria) this;
        }

        public Criteria andSccsGreaterThan(String value) {
            addCriterion("sccs >", value, "sccs");
            return (Criteria) this;
        }

        public Criteria andSccsGreaterThanOrEqualTo(String value) {
            addCriterion("sccs >=", value, "sccs");
            return (Criteria) this;
        }

        public Criteria andSccsLessThan(String value) {
            addCriterion("sccs <", value, "sccs");
            return (Criteria) this;
        }

        public Criteria andSccsLessThanOrEqualTo(String value) {
            addCriterion("sccs <=", value, "sccs");
            return (Criteria) this;
        }

        public Criteria andSccsLike(String value) {
            addCriterion("sccs like", value, "sccs");
            return (Criteria) this;
        }

        public Criteria andSccsNotLike(String value) {
            addCriterion("sccs not like", value, "sccs");
            return (Criteria) this;
        }

        public Criteria andSccsIn(List<String> values) {
            addCriterion("sccs in", values, "sccs");
            return (Criteria) this;
        }

        public Criteria andSccsNotIn(List<String> values) {
            addCriterion("sccs not in", values, "sccs");
            return (Criteria) this;
        }

        public Criteria andSccsBetween(String value1, String value2) {
            addCriterion("sccs between", value1, value2, "sccs");
            return (Criteria) this;
        }

        public Criteria andSccsNotBetween(String value1, String value2) {
            addCriterion("sccs not between", value1, value2, "sccs");
            return (Criteria) this;
        }

        public Criteria andGgIsNull() {
            addCriterion("gg is null");
            return (Criteria) this;
        }

        public Criteria andGgIsNotNull() {
            addCriterion("gg is not null");
            return (Criteria) this;
        }

        public Criteria andGgEqualTo(String value) {
            addCriterion("gg =", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgNotEqualTo(String value) {
            addCriterion("gg <>", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgGreaterThan(String value) {
            addCriterion("gg >", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgGreaterThanOrEqualTo(String value) {
            addCriterion("gg >=", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgLessThan(String value) {
            addCriterion("gg <", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgLessThanOrEqualTo(String value) {
            addCriterion("gg <=", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgLike(String value) {
            addCriterion("gg like", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgNotLike(String value) {
            addCriterion("gg not like", value, "gg");
            return (Criteria) this;
        }

        public Criteria andGgIn(List<String> values) {
            addCriterion("gg in", values, "gg");
            return (Criteria) this;
        }

        public Criteria andGgNotIn(List<String> values) {
            addCriterion("gg not in", values, "gg");
            return (Criteria) this;
        }

        public Criteria andGgBetween(String value1, String value2) {
            addCriterion("gg between", value1, value2, "gg");
            return (Criteria) this;
        }

        public Criteria andGgNotBetween(String value1, String value2) {
            addCriterion("gg not between", value1, value2, "gg");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andSybzIsNull() {
            addCriterion("sybz is null");
            return (Criteria) this;
        }

        public Criteria andSybzIsNotNull() {
            addCriterion("sybz is not null");
            return (Criteria) this;
        }

        public Criteria andSybzEqualTo(String value) {
            addCriterion("sybz =", value, "sybz");
            return (Criteria) this;
        }

        public Criteria andSybzNotEqualTo(String value) {
            addCriterion("sybz <>", value, "sybz");
            return (Criteria) this;
        }

        public Criteria andSybzGreaterThan(String value) {
            addCriterion("sybz >", value, "sybz");
            return (Criteria) this;
        }

        public Criteria andSybzGreaterThanOrEqualTo(String value) {
            addCriterion("sybz >=", value, "sybz");
            return (Criteria) this;
        }

        public Criteria andSybzLessThan(String value) {
            addCriterion("sybz <", value, "sybz");
            return (Criteria) this;
        }

        public Criteria andSybzLessThanOrEqualTo(String value) {
            addCriterion("sybz <=", value, "sybz");
            return (Criteria) this;
        }

        public Criteria andSybzLike(String value) {
            addCriterion("sybz like", value, "sybz");
            return (Criteria) this;
        }

        public Criteria andSybzNotLike(String value) {
            addCriterion("sybz not like", value, "sybz");
            return (Criteria) this;
        }

        public Criteria andSybzIn(List<String> values) {
            addCriterion("sybz in", values, "sybz");
            return (Criteria) this;
        }

        public Criteria andSybzNotIn(List<String> values) {
            addCriterion("sybz not in", values, "sybz");
            return (Criteria) this;
        }

        public Criteria andSybzBetween(String value1, String value2) {
            addCriterion("sybz between", value1, value2, "sybz");
            return (Criteria) this;
        }

        public Criteria andSybzNotBetween(String value1, String value2) {
            addCriterion("sybz not between", value1, value2, "sybz");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FARMRESOURCE
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
     * This class corresponds to the database table FARMRESOURCE
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