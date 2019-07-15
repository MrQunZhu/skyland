package com.clesun.web.skyland.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZhnyNsglExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    protected int offset = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    protected int limit = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public ZhnyNsglExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
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
     * This method corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public void setOffset(int offset) {
        this.offset=offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public int getOffset() {
        return offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public void setLimit(int limit) {
        this.limit=limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    public int getLimit() {
        return limit;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDkidIsNull() {
            addCriterion("DKID is null");
            return (Criteria) this;
        }

        public Criteria andDkidIsNotNull() {
            addCriterion("DKID is not null");
            return (Criteria) this;
        }

        public Criteria andDkidEqualTo(String value) {
            addCriterion("DKID =", value, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidNotEqualTo(String value) {
            addCriterion("DKID <>", value, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidGreaterThan(String value) {
            addCriterion("DKID >", value, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidGreaterThanOrEqualTo(String value) {
            addCriterion("DKID >=", value, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidLessThan(String value) {
            addCriterion("DKID <", value, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidLessThanOrEqualTo(String value) {
            addCriterion("DKID <=", value, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidLike(String value) {
            addCriterion("DKID like", value, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidNotLike(String value) {
            addCriterion("DKID not like", value, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidIn(List<String> values) {
            addCriterion("DKID in", values, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidNotIn(List<String> values) {
            addCriterion("DKID not in", values, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidBetween(String value1, String value2) {
            addCriterion("DKID between", value1, value2, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidNotBetween(String value1, String value2) {
            addCriterion("DKID not between", value1, value2, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkbhIsNull() {
            addCriterion("DKBH is null");
            return (Criteria) this;
        }

        public Criteria andDkbhIsNotNull() {
            addCriterion("DKBH is not null");
            return (Criteria) this;
        }

        public Criteria andDkbhEqualTo(String value) {
            addCriterion("DKBH =", value, "dkbh");
            return (Criteria) this;
        }

        public Criteria andDkbhNotEqualTo(String value) {
            addCriterion("DKBH <>", value, "dkbh");
            return (Criteria) this;
        }

        public Criteria andDkbhGreaterThan(String value) {
            addCriterion("DKBH >", value, "dkbh");
            return (Criteria) this;
        }

        public Criteria andDkbhGreaterThanOrEqualTo(String value) {
            addCriterion("DKBH >=", value, "dkbh");
            return (Criteria) this;
        }

        public Criteria andDkbhLessThan(String value) {
            addCriterion("DKBH <", value, "dkbh");
            return (Criteria) this;
        }

        public Criteria andDkbhLessThanOrEqualTo(String value) {
            addCriterion("DKBH <=", value, "dkbh");
            return (Criteria) this;
        }

        public Criteria andDkbhLike(String value) {
            addCriterion("DKBH like", value, "dkbh");
            return (Criteria) this;
        }

        public Criteria andDkbhNotLike(String value) {
            addCriterion("DKBH not like", value, "dkbh");
            return (Criteria) this;
        }

        public Criteria andDkbhIn(List<String> values) {
            addCriterion("DKBH in", values, "dkbh");
            return (Criteria) this;
        }

        public Criteria andDkbhNotIn(List<String> values) {
            addCriterion("DKBH not in", values, "dkbh");
            return (Criteria) this;
        }

        public Criteria andDkbhBetween(String value1, String value2) {
            addCriterion("DKBH between", value1, value2, "dkbh");
            return (Criteria) this;
        }

        public Criteria andDkbhNotBetween(String value1, String value2) {
            addCriterion("DKBH not between", value1, value2, "dkbh");
            return (Criteria) this;
        }

        public Criteria andNsmcIsNull() {
            addCriterion("NSMC is null");
            return (Criteria) this;
        }

        public Criteria andNsmcIsNotNull() {
            addCriterion("NSMC is not null");
            return (Criteria) this;
        }

        public Criteria andNsmcEqualTo(String value) {
            addCriterion("NSMC =", value, "nsmc");
            return (Criteria) this;
        }

        public Criteria andNsmcNotEqualTo(String value) {
            addCriterion("NSMC <>", value, "nsmc");
            return (Criteria) this;
        }

        public Criteria andNsmcGreaterThan(String value) {
            addCriterion("NSMC >", value, "nsmc");
            return (Criteria) this;
        }

        public Criteria andNsmcGreaterThanOrEqualTo(String value) {
            addCriterion("NSMC >=", value, "nsmc");
            return (Criteria) this;
        }

        public Criteria andNsmcLessThan(String value) {
            addCriterion("NSMC <", value, "nsmc");
            return (Criteria) this;
        }

        public Criteria andNsmcLessThanOrEqualTo(String value) {
            addCriterion("NSMC <=", value, "nsmc");
            return (Criteria) this;
        }

        public Criteria andNsmcLike(String value) {
            addCriterion("NSMC like", value, "nsmc");
            return (Criteria) this;
        }

        public Criteria andNsmcNotLike(String value) {
            addCriterion("NSMC not like", value, "nsmc");
            return (Criteria) this;
        }

        public Criteria andNsmcIn(List<String> values) {
            addCriterion("NSMC in", values, "nsmc");
            return (Criteria) this;
        }

        public Criteria andNsmcNotIn(List<String> values) {
            addCriterion("NSMC not in", values, "nsmc");
            return (Criteria) this;
        }

        public Criteria andNsmcBetween(String value1, String value2) {
            addCriterion("NSMC between", value1, value2, "nsmc");
            return (Criteria) this;
        }

        public Criteria andNsmcNotBetween(String value1, String value2) {
            addCriterion("NSMC not between", value1, value2, "nsmc");
            return (Criteria) this;
        }

        public Criteria andZzmjIsNull() {
            addCriterion("ZZMJ is null");
            return (Criteria) this;
        }

        public Criteria andZzmjIsNotNull() {
            addCriterion("ZZMJ is not null");
            return (Criteria) this;
        }

        public Criteria andZzmjEqualTo(Double value) {
            addCriterion("ZZMJ =", value, "zzmj");
            return (Criteria) this;
        }

        public Criteria andZzmjNotEqualTo(Double value) {
            addCriterion("ZZMJ <>", value, "zzmj");
            return (Criteria) this;
        }

        public Criteria andZzmjGreaterThan(Double value) {
            addCriterion("ZZMJ >", value, "zzmj");
            return (Criteria) this;
        }

        public Criteria andZzmjGreaterThanOrEqualTo(Double value) {
            addCriterion("ZZMJ >=", value, "zzmj");
            return (Criteria) this;
        }

        public Criteria andZzmjLessThan(Double value) {
            addCriterion("ZZMJ <", value, "zzmj");
            return (Criteria) this;
        }

        public Criteria andZzmjLessThanOrEqualTo(Double value) {
            addCriterion("ZZMJ <=", value, "zzmj");
            return (Criteria) this;
        }

        public Criteria andZzmjIn(List<Double> values) {
            addCriterion("ZZMJ in", values, "zzmj");
            return (Criteria) this;
        }

        public Criteria andZzmjNotIn(List<Double> values) {
            addCriterion("ZZMJ not in", values, "zzmj");
            return (Criteria) this;
        }

        public Criteria andZzmjBetween(Double value1, Double value2) {
            addCriterion("ZZMJ between", value1, value2, "zzmj");
            return (Criteria) this;
        }

        public Criteria andZzmjNotBetween(Double value1, Double value2) {
            addCriterion("ZZMJ not between", value1, value2, "zzmj");
            return (Criteria) this;
        }

        public Criteria andCzgfIsNull() {
            addCriterion("CZGF is null");
            return (Criteria) this;
        }

        public Criteria andCzgfIsNotNull() {
            addCriterion("CZGF is not null");
            return (Criteria) this;
        }

        public Criteria andCzgfEqualTo(String value) {
            addCriterion("CZGF =", value, "czgf");
            return (Criteria) this;
        }

        public Criteria andCzgfNotEqualTo(String value) {
            addCriterion("CZGF <>", value, "czgf");
            return (Criteria) this;
        }

        public Criteria andCzgfGreaterThan(String value) {
            addCriterion("CZGF >", value, "czgf");
            return (Criteria) this;
        }

        public Criteria andCzgfGreaterThanOrEqualTo(String value) {
            addCriterion("CZGF >=", value, "czgf");
            return (Criteria) this;
        }

        public Criteria andCzgfLessThan(String value) {
            addCriterion("CZGF <", value, "czgf");
            return (Criteria) this;
        }

        public Criteria andCzgfLessThanOrEqualTo(String value) {
            addCriterion("CZGF <=", value, "czgf");
            return (Criteria) this;
        }

        public Criteria andCzgfLike(String value) {
            addCriterion("CZGF like", value, "czgf");
            return (Criteria) this;
        }

        public Criteria andCzgfNotLike(String value) {
            addCriterion("CZGF not like", value, "czgf");
            return (Criteria) this;
        }

        public Criteria andCzgfIn(List<String> values) {
            addCriterion("CZGF in", values, "czgf");
            return (Criteria) this;
        }

        public Criteria andCzgfNotIn(List<String> values) {
            addCriterion("CZGF not in", values, "czgf");
            return (Criteria) this;
        }

        public Criteria andCzgfBetween(String value1, String value2) {
            addCriterion("CZGF between", value1, value2, "czgf");
            return (Criteria) this;
        }

        public Criteria andCzgfNotBetween(String value1, String value2) {
            addCriterion("CZGF not between", value1, value2, "czgf");
            return (Criteria) this;
        }

        public Criteria andTpdzIsNull() {
            addCriterion("TPDZ is null");
            return (Criteria) this;
        }

        public Criteria andTpdzIsNotNull() {
            addCriterion("TPDZ is not null");
            return (Criteria) this;
        }

        public Criteria andTpdzEqualTo(String value) {
            addCriterion("TPDZ =", value, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzNotEqualTo(String value) {
            addCriterion("TPDZ <>", value, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzGreaterThan(String value) {
            addCriterion("TPDZ >", value, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzGreaterThanOrEqualTo(String value) {
            addCriterion("TPDZ >=", value, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzLessThan(String value) {
            addCriterion("TPDZ <", value, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzLessThanOrEqualTo(String value) {
            addCriterion("TPDZ <=", value, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzLike(String value) {
            addCriterion("TPDZ like", value, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzNotLike(String value) {
            addCriterion("TPDZ not like", value, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzIn(List<String> values) {
            addCriterion("TPDZ in", values, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzNotIn(List<String> values) {
            addCriterion("TPDZ not in", values, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzBetween(String value1, String value2) {
            addCriterion("TPDZ between", value1, value2, "tpdz");
            return (Criteria) this;
        }

        public Criteria andTpdzNotBetween(String value1, String value2) {
            addCriterion("TPDZ not between", value1, value2, "tpdz");
            return (Criteria) this;
        }

        public Criteria andKssjIsNull() {
            addCriterion("KSSJ is null");
            return (Criteria) this;
        }

        public Criteria andKssjIsNotNull() {
            addCriterion("KSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andKssjEqualTo(Date value) {
            addCriterion("KSSJ =", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjNotEqualTo(Date value) {
            addCriterion("KSSJ <>", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjGreaterThan(Date value) {
            addCriterion("KSSJ >", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjGreaterThanOrEqualTo(Date value) {
            addCriterion("KSSJ >=", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjLessThan(Date value) {
            addCriterion("KSSJ <", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjLessThanOrEqualTo(Date value) {
            addCriterion("KSSJ <=", value, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjIn(List<Date> values) {
            addCriterion("KSSJ in", values, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjNotIn(List<Date> values) {
            addCriterion("KSSJ not in", values, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjBetween(Date value1, Date value2) {
            addCriterion("KSSJ between", value1, value2, "kssj");
            return (Criteria) this;
        }

        public Criteria andKssjNotBetween(Date value1, Date value2) {
            addCriterion("KSSJ not between", value1, value2, "kssj");
            return (Criteria) this;
        }

        public Criteria andJssjIsNull() {
            addCriterion("JSSJ is null");
            return (Criteria) this;
        }

        public Criteria andJssjIsNotNull() {
            addCriterion("JSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJssjEqualTo(Date value) {
            addCriterion("JSSJ =", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotEqualTo(Date value) {
            addCriterion("JSSJ <>", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjGreaterThan(Date value) {
            addCriterion("JSSJ >", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjGreaterThanOrEqualTo(Date value) {
            addCriterion("JSSJ >=", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjLessThan(Date value) {
            addCriterion("JSSJ <", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjLessThanOrEqualTo(Date value) {
            addCriterion("JSSJ <=", value, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjIn(List<Date> values) {
            addCriterion("JSSJ in", values, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotIn(List<Date> values) {
            addCriterion("JSSJ not in", values, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjBetween(Date value1, Date value2) {
            addCriterion("JSSJ between", value1, value2, "jssj");
            return (Criteria) this;
        }

        public Criteria andJssjNotBetween(Date value1, Date value2) {
            addCriterion("JSSJ not between", value1, value2, "jssj");
            return (Criteria) this;
        }

        public Criteria andBy1IsNull() {
            addCriterion("BY1 is null");
            return (Criteria) this;
        }

        public Criteria andBy1IsNotNull() {
            addCriterion("BY1 is not null");
            return (Criteria) this;
        }

        public Criteria andBy1EqualTo(String value) {
            addCriterion("BY1 =", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1NotEqualTo(String value) {
            addCriterion("BY1 <>", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1GreaterThan(String value) {
            addCriterion("BY1 >", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1GreaterThanOrEqualTo(String value) {
            addCriterion("BY1 >=", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1LessThan(String value) {
            addCriterion("BY1 <", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1LessThanOrEqualTo(String value) {
            addCriterion("BY1 <=", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1Like(String value) {
            addCriterion("BY1 like", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1NotLike(String value) {
            addCriterion("BY1 not like", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1In(List<String> values) {
            addCriterion("BY1 in", values, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1NotIn(List<String> values) {
            addCriterion("BY1 not in", values, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1Between(String value1, String value2) {
            addCriterion("BY1 between", value1, value2, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1NotBetween(String value1, String value2) {
            addCriterion("BY1 not between", value1, value2, "by1");
            return (Criteria) this;
        }

        public Criteria andBy2IsNull() {
            addCriterion("BY2 is null");
            return (Criteria) this;
        }

        public Criteria andBy2IsNotNull() {
            addCriterion("BY2 is not null");
            return (Criteria) this;
        }

        public Criteria andBy2EqualTo(String value) {
            addCriterion("BY2 =", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotEqualTo(String value) {
            addCriterion("BY2 <>", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2GreaterThan(String value) {
            addCriterion("BY2 >", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2GreaterThanOrEqualTo(String value) {
            addCriterion("BY2 >=", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2LessThan(String value) {
            addCriterion("BY2 <", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2LessThanOrEqualTo(String value) {
            addCriterion("BY2 <=", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2Like(String value) {
            addCriterion("BY2 like", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotLike(String value) {
            addCriterion("BY2 not like", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2In(List<String> values) {
            addCriterion("BY2 in", values, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotIn(List<String> values) {
            addCriterion("BY2 not in", values, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2Between(String value1, String value2) {
            addCriterion("BY2 between", value1, value2, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotBetween(String value1, String value2) {
            addCriterion("BY2 not between", value1, value2, "by2");
            return (Criteria) this;
        }

        public Criteria andBy3IsNull() {
            addCriterion("BY3 is null");
            return (Criteria) this;
        }

        public Criteria andBy3IsNotNull() {
            addCriterion("BY3 is not null");
            return (Criteria) this;
        }

        public Criteria andBy3EqualTo(String value) {
            addCriterion("BY3 =", value, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3NotEqualTo(String value) {
            addCriterion("BY3 <>", value, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3GreaterThan(String value) {
            addCriterion("BY3 >", value, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3GreaterThanOrEqualTo(String value) {
            addCriterion("BY3 >=", value, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3LessThan(String value) {
            addCriterion("BY3 <", value, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3LessThanOrEqualTo(String value) {
            addCriterion("BY3 <=", value, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3Like(String value) {
            addCriterion("BY3 like", value, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3NotLike(String value) {
            addCriterion("BY3 not like", value, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3In(List<String> values) {
            addCriterion("BY3 in", values, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3NotIn(List<String> values) {
            addCriterion("BY3 not in", values, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3Between(String value1, String value2) {
            addCriterion("BY3 between", value1, value2, "by3");
            return (Criteria) this;
        }

        public Criteria andBy3NotBetween(String value1, String value2) {
            addCriterion("BY3 not between", value1, value2, "by3");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNull() {
            addCriterion("CJSJ is null");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNotNull() {
            addCriterion("CJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andCjsjEqualTo(Date value) {
            addCriterion("CJSJ =", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotEqualTo(Date value) {
            addCriterion("CJSJ <>", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThan(Date value) {
            addCriterion("CJSJ >", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("CJSJ >=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThan(Date value) {
            addCriterion("CJSJ <", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThanOrEqualTo(Date value) {
            addCriterion("CJSJ <=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjIn(List<Date> values) {
            addCriterion("CJSJ in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotIn(List<Date> values) {
            addCriterion("CJSJ not in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjBetween(Date value1, Date value2) {
            addCriterion("CJSJ between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotBetween(Date value1, Date value2) {
            addCriterion("CJSJ not between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andZzwdIsNull() {
            addCriterion("ZZWD is null");
            return (Criteria) this;
        }

        public Criteria andZzwdIsNotNull() {
            addCriterion("ZZWD is not null");
            return (Criteria) this;
        }

        public Criteria andZzwdEqualTo(String value) {
            addCriterion("ZZWD =", value, "zzwd");
            return (Criteria) this;
        }

        public Criteria andZzwdNotEqualTo(String value) {
            addCriterion("ZZWD <>", value, "zzwd");
            return (Criteria) this;
        }

        public Criteria andZzwdGreaterThan(String value) {
            addCriterion("ZZWD >", value, "zzwd");
            return (Criteria) this;
        }

        public Criteria andZzwdGreaterThanOrEqualTo(String value) {
            addCriterion("ZZWD >=", value, "zzwd");
            return (Criteria) this;
        }

        public Criteria andZzwdLessThan(String value) {
            addCriterion("ZZWD <", value, "zzwd");
            return (Criteria) this;
        }

        public Criteria andZzwdLessThanOrEqualTo(String value) {
            addCriterion("ZZWD <=", value, "zzwd");
            return (Criteria) this;
        }

        public Criteria andZzwdLike(String value) {
            addCriterion("ZZWD like", value, "zzwd");
            return (Criteria) this;
        }

        public Criteria andZzwdNotLike(String value) {
            addCriterion("ZZWD not like", value, "zzwd");
            return (Criteria) this;
        }

        public Criteria andZzwdIn(List<String> values) {
            addCriterion("ZZWD in", values, "zzwd");
            return (Criteria) this;
        }

        public Criteria andZzwdNotIn(List<String> values) {
            addCriterion("ZZWD not in", values, "zzwd");
            return (Criteria) this;
        }

        public Criteria andZzwdBetween(String value1, String value2) {
            addCriterion("ZZWD between", value1, value2, "zzwd");
            return (Criteria) this;
        }

        public Criteria andZzwdNotBetween(String value1, String value2) {
            addCriterion("ZZWD not between", value1, value2, "zzwd");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated do_not_delete_during_merge Mon Jan 21 10:33:42 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ZHNY_NSGL
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
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